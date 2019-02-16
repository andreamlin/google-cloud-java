/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.it;

import static com.google.common.truth.Truth.assertThat;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.Page;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.NotFoundException;
import com.google.api.gax.rpc.PermissionDeniedException;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.compute.v1.AttachedDisk;
import com.google.cloud.compute.v1.AttachedDiskInitializeParams;
import com.google.cloud.compute.v1.Disk;
import com.google.cloud.compute.v1.DiskClient;
import com.google.cloud.compute.v1.DiskSettings;
import com.google.cloud.compute.v1.DiskType;
import com.google.cloud.compute.v1.DiskTypeClient;
import com.google.cloud.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import com.google.cloud.compute.v1.DiskTypeSettings;
import com.google.cloud.compute.v1.DiskTypesScopedList;
import com.google.cloud.compute.v1.ImageClient;
import com.google.cloud.compute.v1.ImageSettings;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceClient;
import com.google.cloud.compute.v1.InstanceSettings;
import com.google.cloud.compute.v1.ListDiskTypesHttpRequest;
import com.google.cloud.compute.v1.NetworkInterface;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectGlobalImageName;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.ProjectRegionDiskTypeName;
import com.google.cloud.compute.v1.ProjectRegionSubnetworkName;
import com.google.cloud.compute.v1.ProjectZoneDiskName;
import com.google.cloud.compute.v1.ProjectZoneDiskTypeName;
import com.google.cloud.compute.v1.ProjectZoneInstanceName;
import com.google.cloud.compute.v1.ProjectZoneMachineTypeName;
import com.google.cloud.compute.v1.ProjectZoneName;
import com.google.cloud.compute.v1.Subnetwork;
import com.google.cloud.compute.v1.SubnetworkClient;
import com.google.cloud.compute.v1.SubnetworkSettings;
import com.google.cloud.compute.v1.SubnetworksScopedList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ITComputeTest {

  private static final Logger log = Logger.getLogger(ITComputeTest.class.getName());

  private static final String ZONE = "us-west1-a";
  private static final String DISK_TYPE = "local-ssd";
  private static final String DEFAULT_PROJECT = ServiceOptions.getDefaultProjectId();
  private static final String UUID_INSTANCE = UUID.randomUUID().toString().replaceAll("-", "");

  private static final String INSTANCE_NAME_FORMAT =
      String.format("test-api-instance-%s", UUID_INSTANCE);
  private static final String REGION = "us-west1";

  private static final ProjectZoneName PROJECT_ZONE_NAME =
      ProjectZoneName.of(DEFAULT_PROJECT, ZONE);
  private static final ProjectZoneMachineTypeName MACHINE_TYPE_NAME =
      ProjectZoneMachineTypeName.of(
          String.format("custom-%s-%s", 4, 4 * 1024), DEFAULT_PROJECT, ZONE);

  // Google-managed image. See https://cloud.google.com/compute/docs/images.
  private static final ProjectGlobalImageName IMAGE_NAME =
      ProjectGlobalImageName.of("cos-69-10895-138-0", "cos-cloud");
  private static final ProjectZoneInstanceName INSTANCE_NAME =
      ProjectZoneInstanceName.of(
          String.format(INSTANCE_NAME_FORMAT, UUID_INSTANCE), DEFAULT_PROJECT, ZONE);

  private static final ProjectZoneDiskTypeName diskTypeName =
      ProjectZoneDiskTypeName.of("pd-standard", DEFAULT_PROJECT, ZONE);
  private static final ProjectZoneDiskName DISK_NAME =
      ProjectZoneDiskName.of(
          String.format("test-api-device-name-%s", UUID_INSTANCE), DEFAULT_PROJECT, ZONE);

  private static DiskTypeClient diskTypeClient;
  private static InstanceClient instanceClient;
  private static DiskClient diskClient;
  private static SubnetworkClient subNetworkClient;
  private static ImageClient imageClient;

  @Rule public Timeout globalTimeout = Timeout.seconds(300);

  @BeforeClass
  public static void beforeClass() throws Exception {
    Logger.getLogger("").setLevel(Level.ALL);

    Credentials credentials =
        GoogleCredentials.getApplicationDefault()
            .createScoped(DiskTypeSettings.getDefaultServiceScopes());

    DiskTypeSettings diskTypeSettings =
        DiskTypeSettings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
            .build();
    diskTypeClient = DiskTypeClient.create(diskTypeSettings);

    InstanceSettings instanceSettings =
        InstanceSettings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
            .build();
    instanceClient = InstanceClient.create(instanceSettings);

    DiskSettings diskSettings =
        DiskSettings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
            .build();
    diskClient = DiskClient.create(diskSettings);

    SubnetworkSettings subNetworkSettings =
        SubnetworkSettings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
            .build();
    subNetworkClient = SubnetworkClient.create(subNetworkSettings);

    ImageSettings imageSettings =
        ImageSettings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
            .build();
    imageClient = ImageClient.create(imageSettings);

    // Remove resources that will be created later to avoid quota problems or resource overriding
    // errors.
    removeResources(Arrays.asList(PermissionDeniedException.class, NotFoundException.class));
  }

  // Remove resources that are created in this test class to avoid overbilling and 403s.
  // This may take up to a minute.
  private static void removeResources(List<Class<? extends ApiException>> exceptionTypes)
      throws Exception {
    Operation currentOperation;
    long startAt = System.currentTimeMillis();
    log.log(
        Level.INFO,
        String.format("Attempting to remove the created Instance %sms.", INSTANCE_NAME));
    try {
      OperationFuture<EmptyMessage, Operation> future =
          instanceClient.deleteInstanceAsync(INSTANCE_NAME);
      currentOperation = future.getMetadata().get(); // Get operation status.
      future.get(50, TimeUnit.SECONDS); // Block until operation completes.
    } catch (Exception e) {
      if (isNotExceptionType(exceptionTypes, e)) throw e;
    }
    log.log(
        Level.INFO,
        String.format(
            "Removed the created Instance %s in %dms",
            INSTANCE_NAME, System.currentTimeMillis() - startAt));
    startAt = System.currentTimeMillis();
    try {
      OperationFuture<EmptyMessage, Operation> future = diskClient.deleteDiskAsync(DISK_NAME);
      future.get(20, TimeUnit.SECONDS); // Block until operation completes.
    } catch (Exception e) {
      if (isNotExceptionType(exceptionTypes, e)) throw e;
    }
    log.log(
        Level.INFO,
        String.format(
            "Removed the created Disk %s in %dms",
            INSTANCE_NAME, System.currentTimeMillis() - startAt));
    startAt = System.currentTimeMillis();
    try {
      OperationFuture<EmptyMessage, Operation> future = imageClient.deleteImageAsync(IMAGE_NAME);
      future.get(20, TimeUnit.SECONDS); // Block until operation completes.
    } catch (Exception e) {
      if (isNotExceptionType(exceptionTypes, e)) throw e;
    }
    log.log(
        Level.INFO,
        String.format(
            "Removed the created Image %s in %dms.",
            IMAGE_NAME, System.currentTimeMillis() - startAt));
  }

  private static boolean isNotExceptionType(
      List<Class<? extends ApiException>> exceptionTypes, Exception e) {
    for (Class<? extends ApiException> type : exceptionTypes) {
      if (type.isInstance(e)) {
        return false;
      }
      if (e.getCause() != null && type.isInstance(e.getCause())) {
        return false;
      }
    }
    return true;
  }

  @AfterClass
  public static void tearDown() throws Exception {
    try {
      removeResources(Arrays.asList(NotFoundException.class, PermissionDeniedException.class));
    } finally {
      diskTypeClient.close();
      instanceClient.close();
      subNetworkClient.close();
      diskClient.close();
      imageClient.close();
    }
  }

  @Test
  public void testDetachDisk() throws Exception {
    long startAt = System.currentTimeMillis();
    System.out.println("Clients created in " + (System.currentTimeMillis() - startAt) + "ms.");

    // Fetch a subnetwork, assuming there is one. Projects start with a default network.
    Iterable<SubnetworksScopedList> subnetworks =
        subNetworkClient.aggregatedListSubnetworks(DEFAULT_PROJECT).iterateAll();
    Subnetwork subnetwork = subnetworks.iterator().next().getSubnetworksList().get(0);

    NetworkInterface networkInterface =
        NetworkInterface.newBuilder()
            .setNetwork(subnetwork.getNetwork())
            .setSubnetwork(
                ProjectRegionSubnetworkName.of(DEFAULT_PROJECT, REGION, subnetwork.getName())
                    .toString())
            .build();
    AttachedDisk bootDisk =
        AttachedDisk.newBuilder()
            .setAutoDelete(true)
            .setBoot(true)
            .setInitializeParams(
                AttachedDiskInitializeParams.newBuilder()
                    .setSourceImage(IMAGE_NAME.toString())
                    .setDiskSizeGb(String.valueOf(100))
                    .build())
            .build();

    // Insert an instance using the found subnetwork and its corresponding network (may not be the
    // inserted network).
    Instance instanceResource =
        Instance.newBuilder()
            .setName(INSTANCE_NAME.getInstance())
            .addNetworkInterfaces(networkInterface)
            .setMachineType(MACHINE_TYPE_NAME.toString())
            .addDisks(bootDisk)
            .build();
    OperationFuture<EmptyMessage, Operation> op1 =
        instanceClient.insertInstanceAsync(PROJECT_ZONE_NAME, instanceResource);
    Operation operationSnapshot = op1.getMetadata().get(); // Get operation status.
    log.log(Level.INFO, (String.format("Operation %s started to create instance: %s", operationSnapshot.getName(), INSTANCE_NAME)));
    op1.get(); // Blocking until operation completes or times out
    log.log(Level.INFO, (String.format("Instance created: %s", INSTANCE_NAME)));

    // Insert a disk.
    Disk disk =
        Disk.newBuilder()
            .setName(DISK_NAME.getDisk())
            .setSizeGb(String.valueOf(7))
            .setType(diskTypeName.toString())
            .build();
    OperationFuture<EmptyMessage, Operation> op2 =
        diskClient.insertDiskAsync(PROJECT_ZONE_NAME, disk);
    operationSnapshot = op2.getMetadata().get();
    log.log(Level.INFO, (String.format("Operation %s started to create instance: %s", operationSnapshot.getName(), DISK_NAME)));
    op1.get(10, TimeUnit.SECONDS); // Blocking until operation completes or times out.
    log.log(Level.INFO, String.format("Disk created: %s", DISK_NAME));

    // Attach the disk to the instance.
    AttachedDisk attachedDisk =
        AttachedDisk.newBuilder()
            .setDeviceName(DISK_NAME.getDisk())
            .setAutoDelete(false)
            .setMode("READ_WRITE")
            .setSource(DISK_NAME.toString())
            .build();
    OperationFuture<EmptyMessage, Operation> op3 =
        instanceClient.attachDiskInstanceAsync(INSTANCE_NAME, false, attachedDisk);
    log.log(Level.INFO, String.format("Disk attached: %s", op3.toString()));
    op1.get(10, TimeUnit.SECONDS); // Blocking until operation completes or times out.

    OperationFuture<EmptyMessage, Operation> op4 =
        instanceClient.detachDiskInstanceAsync(INSTANCE_NAME, DISK_NAME.getDisk());
    log.log(Level.INFO, String.format("Disk detached: %s", DISK_NAME.toString()));
  }

  @Test
  public void testGetDiskType() {
    DiskType diskType =
        diskTypeClient.getDiskType(ProjectZoneDiskTypeName.of(DISK_TYPE, DEFAULT_PROJECT, ZONE));
    ProjectZoneDiskTypeName returnDiskName = ProjectZoneDiskTypeName.parse(diskType.getSelfLink());
    assertThat(returnDiskName.getZone()).isEqualTo(ZONE);
    assertThat(returnDiskName.getDiskType()).isEqualTo(DISK_TYPE);
    assertThat(diskType.getCreationTimestamp()).isNotNull();
    assertThat(diskType.getDescription()).isNotNull();
    assertThat(diskType.getValidDiskSize()).isNotNull();
    assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
  }

  @Test
  public void testListDiskTypes() {
    Page<DiskType> diskPage =
        diskTypeClient.listDiskTypes(ProjectZoneName.of(DEFAULT_PROJECT, ZONE)).getPage();
    Iterator<DiskType> diskTypeIterator = diskPage.iterateAll().iterator();
    assertThat(diskTypeIterator.hasNext()).isTrue();
    while (diskTypeIterator.hasNext()) {
      DiskType diskType = diskTypeIterator.next();
      assertThat(diskType.getSelfLink()).isNotNull();
      ProjectZoneDiskTypeName returnDiskName =
          ProjectZoneDiskTypeName.parse(diskType.getSelfLink());
      assertThat(returnDiskName.getZone()).isEqualTo(ZONE);
      assertThat(diskType.getCreationTimestamp()).isNotNull();
      assertThat(diskType.getDescription()).isNotNull();
      assertThat(diskType.getValidDiskSize()).isNotNull();
      assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
    }
  }

  @Test
  public void testListDiskTypesWithFilter() {
    ListDiskTypesHttpRequest request =
        ListDiskTypesHttpRequest.newBuilder()
            .setZone(ProjectZoneName.of(DEFAULT_PROJECT, ZONE).toString())
            .setFilter("(defaultDiskSizeGb = 375)")
            .build();
    Page<DiskType> diskPage = diskTypeClient.listDiskTypes(request).getPage();
    Iterator<DiskType> diskTypeIterator = diskPage.iterateAll().iterator();
    assertThat(diskTypeIterator.hasNext()).isTrue();
    while (diskTypeIterator.hasNext()) {
      DiskType diskType = diskTypeIterator.next();
      assertThat(diskType.getZone()).isNotNull();
      ProjectZoneName zoneName = ProjectZoneName.parse(diskType.getZone());
      assertThat(zoneName.getZone()).isEqualTo(ZONE);
      assertThat(diskType.getCreationTimestamp()).isNotNull();
      assertThat(diskType.getDescription()).isNotNull();
      assertThat(diskType.getValidDiskSize()).isNotNull();
      assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
    }
  }

  @Test
  public void testAggregatedListDiskTypes() {
    AggregatedListDiskTypesPagedResponse pagedListResponse =
        diskTypeClient.aggregatedListDiskTypes(ProjectName.of(DEFAULT_PROJECT));
    List<DiskTypesScopedList> diskTypeScopedListIterator =
        Lists.newArrayList(pagedListResponse.iterateAll());
    List<DiskType> diskTypeIterator = new LinkedList<>();
    for (DiskTypesScopedList scopedList : diskTypeScopedListIterator) {
      diskTypeIterator.addAll(scopedList.getDiskTypesList());
    }
    assertThat(diskTypeIterator.size()).isGreaterThan(0);
    for (DiskType diskType : diskTypeIterator) {
      assertThat(diskType.getRegion() != null || diskType.getZone() != null).isTrue();
      if (diskType.getRegion() != null) {
        ProjectRegionDiskTypeName zoneName =
            ProjectRegionDiskTypeName.parse(diskType.getSelfLink());
        assertThat(zoneName.getDiskType()).isNotNull();
        assertThat(zoneName.getRegion()).isNotNull();
      } else {
        ProjectZoneDiskTypeName zoneName = ProjectZoneDiskTypeName.parse(diskType.getSelfLink());
        assertThat(zoneName.getDiskType()).isNotNull();
        assertThat(zoneName.getZone()).isNotNull();
      }
      assertThat(diskType.getCreationTimestamp()).isNotNull();
      assertThat(diskType.getDescription()).isNotNull();
      assertThat(diskType.getValidDiskSize()).isNotNull();
      assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
    }
  }
}
