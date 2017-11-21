/*
 * Copyright 2017, Google LLC All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.compute.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.core.PagedListResponse;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDisksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDisksPagedResponse;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class DiskClientTest {
  private static MockAddresses mockAddresses;
  private static MockAutoscalers mockAutoscalers;
  private static MockBackendServices mockBackendServices;
  private static MockDiskTypes mockDiskTypes;
  private static MockDisks mockDisks;
  private static MockFirewalls mockFirewalls;
  private static MockForwardingRules mockForwardingRules;
  private static MockGlobalAddresses mockGlobalAddresses;
  private static MockGlobalForwardingRules mockGlobalForwardingRules;
  private static MockGlobalOperations mockGlobalOperations;
  private static MockHealthChecks mockHealthChecks;
  private static MockHttpHealthChecks mockHttpHealthChecks;
  private static MockHttpsHealthChecks mockHttpsHealthChecks;
  private static MockImages mockImages;
  private static MockInstanceGroupManagers mockInstanceGroupManagers;
  private static MockInstanceGroups mockInstanceGroups;
  private static MockInstanceTemplates mockInstanceTemplates;
  private static MockInstances mockInstances;
  private static MockLicenses mockLicenses;
  private static MockMachineTypes mockMachineTypes;
  private static MockNetworks mockNetworks;
  private static MockProjects mockProjects;
  private static MockRegionAutoscalers mockRegionAutoscalers;
  private static MockRegionBackendServices mockRegionBackendServices;
  private static MockRegionInstanceGroupManagers mockRegionInstanceGroupManagers;
  private static MockRegionInstanceGroups mockRegionInstanceGroups;
  private static MockRegionOperations mockRegionOperations;
  private static MockRegions mockRegions;
  private static MockRouters mockRouters;
  private static MockRoutes mockRoutes;
  private static MockSnapshots mockSnapshots;
  private static MockSslCertificates mockSslCertificates;
  private static MockSubnetworks mockSubnetworks;
  private static MockTargetHttpProxies mockTargetHttpProxies;
  private static MockTargetHttpsProxies mockTargetHttpsProxies;
  private static MockTargetInstances mockTargetInstances;
  private static MockTargetPools mockTargetPools;
  private static MockTargetSslProxies mockTargetSslProxies;
  private static MockTargetVpnGateways mockTargetVpnGateways;
  private static MockUrlMaps mockUrlMaps;
  private static MockVpnTunnels mockVpnTunnels;
  private static MockZoneOperations mockZoneOperations;
  private static MockZones mockZones;
  private static MockServiceHelper serviceHelper;
  private DiskClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAddresses = new MockAddresses();
    mockAutoscalers = new MockAutoscalers();
    mockBackendServices = new MockBackendServices();
    mockDiskTypes = new MockDiskTypes();
    mockDisks = new MockDisks();
    mockFirewalls = new MockFirewalls();
    mockForwardingRules = new MockForwardingRules();
    mockGlobalAddresses = new MockGlobalAddresses();
    mockGlobalForwardingRules = new MockGlobalForwardingRules();
    mockGlobalOperations = new MockGlobalOperations();
    mockHealthChecks = new MockHealthChecks();
    mockHttpHealthChecks = new MockHttpHealthChecks();
    mockHttpsHealthChecks = new MockHttpsHealthChecks();
    mockImages = new MockImages();
    mockInstanceGroupManagers = new MockInstanceGroupManagers();
    mockInstanceGroups = new MockInstanceGroups();
    mockInstanceTemplates = new MockInstanceTemplates();
    mockInstances = new MockInstances();
    mockLicenses = new MockLicenses();
    mockMachineTypes = new MockMachineTypes();
    mockNetworks = new MockNetworks();
    mockProjects = new MockProjects();
    mockRegionAutoscalers = new MockRegionAutoscalers();
    mockRegionBackendServices = new MockRegionBackendServices();
    mockRegionInstanceGroupManagers = new MockRegionInstanceGroupManagers();
    mockRegionInstanceGroups = new MockRegionInstanceGroups();
    mockRegionOperations = new MockRegionOperations();
    mockRegions = new MockRegions();
    mockRouters = new MockRouters();
    mockRoutes = new MockRoutes();
    mockSnapshots = new MockSnapshots();
    mockSslCertificates = new MockSslCertificates();
    mockSubnetworks = new MockSubnetworks();
    mockTargetHttpProxies = new MockTargetHttpProxies();
    mockTargetHttpsProxies = new MockTargetHttpsProxies();
    mockTargetInstances = new MockTargetInstances();
    mockTargetPools = new MockTargetPools();
    mockTargetSslProxies = new MockTargetSslProxies();
    mockTargetVpnGateways = new MockTargetVpnGateways();
    mockUrlMaps = new MockUrlMaps();
    mockVpnTunnels = new MockVpnTunnels();
    mockZoneOperations = new MockZoneOperations();
    mockZones = new MockZones();
    serviceHelper = new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList(mockAddresses, mockAutoscalers, mockBackendServices, mockDiskTypes, mockDisks, mockFirewalls, mockForwardingRules, mockGlobalAddresses, mockGlobalForwardingRules, mockGlobalOperations, mockHealthChecks, mockHttpHealthChecks, mockHttpsHealthChecks, mockImages, mockInstanceGroupManagers, mockInstanceGroups, mockInstanceTemplates, mockInstances, mockLicenses, mockMachineTypes, mockNetworks, mockProjects, mockRegionAutoscalers, mockRegionBackendServices, mockRegionInstanceGroupManagers, mockRegionInstanceGroups, mockRegionOperations, mockRegions, mockRouters, mockRoutes, mockSnapshots, mockSslCertificates, mockSubnetworks, mockTargetHttpProxies, mockTargetHttpsProxies, mockTargetInstances, mockTargetPools, mockTargetSslProxies, mockTargetVpnGateways, mockUrlMaps, mockVpnTunnels, mockZoneOperations, mockZones));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    DiskSettings settings = DiskSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = DiskClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListDisksTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListDisksPagedResponse pagedListResponse = client.aggregatedListDisks(project);

    List<Disk> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDisks().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListDisksHttpRequest actualRequest = (AggregatedListDisksHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListDisksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListDisks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createSnapshotDiskTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
    Snapshot snapshot = Snapshot.newBuilder().build();

    Operation actualResponse =
        client.createSnapshotDisk(disk, snapshot);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSnapshotDiskHttpRequest actualRequest = (CreateSnapshotDiskHttpRequest)actualRequests.get(0);

    Assert.assertEquals(disk, actualRequest.getDiskAsDiskName());
    Assert.assertEquals(snapshot, actualRequest.getSnapshot());
  }

  @Test
  @SuppressWarnings("all")
  public void createSnapshotDiskExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
      Snapshot snapshot = Snapshot.newBuilder().build();

      client.createSnapshotDisk(disk, snapshot);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDiskTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

    Operation actualResponse =
        client.deleteDisk(disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDiskHttpRequest actualRequest = (DeleteDiskHttpRequest)actualRequests.get(0);

    Assert.assertEquals(disk, actualRequest.getDiskAsDiskName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDiskExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

      client.deleteDisk(disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

    Disk actualResponse =
        client.getDisk(disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDiskHttpRequest actualRequest = (GetDiskHttpRequest)actualRequests.get(0);

    Assert.assertEquals(disk, actualRequest.getDiskAsDiskName());
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

      client.getDisk(disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertDiskTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String sourceImage = "sourceImage1661056055";
    Disk disk = Disk.newBuilder().build();

    Operation actualResponse =
        client.insertDisk(zone, sourceImage, disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertDiskHttpRequest actualRequest = (InsertDiskHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
    Assert.assertEquals(sourceImage, actualRequest.getSourceImage());
    Assert.assertEquals(disk, actualRequest.getDisk());
  }

  @Test
  @SuppressWarnings("all")
  public void insertDiskExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      String sourceImage = "sourceImage1661056055";
      Disk disk = Disk.newBuilder().build();

      client.insertDisk(zone, sourceImage, disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listDisksTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListDisksPagedResponse pagedListResponse = client.listDisks(zone);

    List<Disk> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDisksHttpRequest actualRequest = (ListDisksHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void listDisksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listDisks(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeDiskTest() {
    this would be init code
    mockDisks.addResponse(expectedResponse);

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
    DisksResizeRequest disksResizeRequest = DisksResizeRequest.newBuilder().build();

    Operation actualResponse =
        client.resizeDisk(disk, disksResizeRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockDisks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ResizeDiskHttpRequest actualRequest = (ResizeDiskHttpRequest)actualRequests.get(0);

    Assert.assertEquals(disk, actualRequest.getDiskAsDiskName());
    Assert.assertEquals(disksResizeRequest, actualRequest.getDisksResizeRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void resizeDiskExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDisks.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
      DisksResizeRequest disksResizeRequest = DisksResizeRequest.newBuilder().build();

      client.resizeDisk(disk, disksResizeRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}