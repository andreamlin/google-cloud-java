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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
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
public class InstanceClientTest {
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
  private InstanceClient client;

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
    InstanceSettings settings = InstanceSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = InstanceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void addAccessConfigInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String networkInterface = "networkInterface902258792";
    AccessConfig accessConfig = AccessConfig.newBuilder().build();

    Operation actualResponse =
        client.addAccessConfigInstance(instance, networkInterface, accessConfig);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddAccessConfigInstanceHttpRequest actualRequest = (AddAccessConfigInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(networkInterface, actualRequest.getNetworkInterface());
    Assert.assertEquals(accessConfig, actualRequest.getAccessConfig());
  }

  @Test
  @SuppressWarnings("all")
  public void addAccessConfigInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String networkInterface = "networkInterface902258792";
      AccessConfig accessConfig = AccessConfig.newBuilder().build();

      client.addAccessConfigInstance(instance, networkInterface, accessConfig);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstancesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstancesScopedList instances = InstancesScopedList.newBuilder().build();
    InstancesScopedList items = InstancesScopedList.newBuilder()
      .setInstances(instances)
      .build();
    InstanceAggregatedList expectedResponse = InstanceAggregatedList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .setItems(items)
      .build();
    mockInstances.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListInstancesPagedResponse pagedListResponse = client.aggregatedListInstances(project);

    List<Instance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstances().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListInstancesHttpRequest actualRequest = (AggregatedListInstancesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstancesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListInstances(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void attachDiskInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    AttachedDisk attachedDisk = AttachedDisk.newBuilder().build();

    Operation actualResponse =
        client.attachDiskInstance(instance, attachedDisk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AttachDiskInstanceHttpRequest actualRequest = (AttachDiskInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(attachedDisk, actualRequest.getAttachedDisk());
  }

  @Test
  @SuppressWarnings("all")
  public void attachDiskInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      AttachedDisk attachedDisk = AttachedDisk.newBuilder().build();

      client.attachDiskInstance(instance, attachedDisk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    Operation actualResponse =
        client.deleteInstance(instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInstanceHttpRequest actualRequest = (DeleteInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.deleteInstance(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAccessConfigInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String networkInterface = "networkInterface902258792";
    String accessConfig = "accessConfig-464014723";

    Operation actualResponse =
        client.deleteAccessConfigInstance(instance, networkInterface, accessConfig);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAccessConfigInstanceHttpRequest actualRequest = (DeleteAccessConfigInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(networkInterface, actualRequest.getNetworkInterface());
    Assert.assertEquals(accessConfig, actualRequest.getAccessConfig());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAccessConfigInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String networkInterface = "networkInterface902258792";
      String accessConfig = "accessConfig-464014723";

      client.deleteAccessConfigInstance(instance, networkInterface, accessConfig);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void detachDiskInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String deviceName = "deviceName-1543071020";

    Operation actualResponse =
        client.detachDiskInstance(instance, deviceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DetachDiskInstanceHttpRequest actualRequest = (DetachDiskInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(deviceName, actualRequest.getDeviceName());
  }

  @Test
  @SuppressWarnings("all")
  public void detachDiskInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String deviceName = "deviceName-1543071020";

      client.detachDiskInstance(instance, deviceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceTest() {
    Boolean canIpForward = true;
    String kind = "kind3292052";
    String description = "description-1724546052";
    String cpuPlatform = "cpuPlatform947156266";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String zone = "zone3744684";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String id = "id3355";
    String machineType = "machineType1838323762";
    String status = "status-892481550";
    Instance expectedResponse = Instance.newBuilder()
      .setCanIpForwardResource(canIpForward)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setCpuPlatformResource(cpuPlatform)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setZoneResource(zone)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setIdResource(id)
      .setMachineTypeResource(machineType)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    Instance actualResponse =
        client.getInstance(instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInstanceHttpRequest actualRequest = (GetInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.getInstance(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSerialPortOutputInstanceTest() {
    String next = "next3377907";
    String contents = "contents-567321830";
    String kind = "kind3292052";
    String start2 = "start2-1897185387";
    String selfLink = "selfLink-1691268851";
    SerialPortOutput expectedResponse = SerialPortOutput.newBuilder()
      .setNextResource(next)
      .setContentsResource(contents)
      .setKindResource(kind)
      .setStart(start2)
      .setSelfLinkResource(selfLink)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Integer port = 3446913;
    String start = "start109757538";

    SerialPortOutput actualResponse =
        client.getSerialPortOutputInstance(instance, port, start);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSerialPortOutputInstanceHttpRequest actualRequest = (GetSerialPortOutputInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(port, actualRequest.getPort());
    Assert.assertEquals(start, actualRequest.getStart());
  }

  @Test
  @SuppressWarnings("all")
  public void getSerialPortOutputInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Integer port = 3446913;
      String start = "start109757538";

      client.getSerialPortOutputInstance(instance, port, start);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone2 = "zone2-696322977";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZone(zone2)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    Instance instance = Instance.newBuilder().build();

    Operation actualResponse =
        client.insertInstance(zone, instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertInstanceHttpRequest actualRequest = (InsertInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
    Assert.assertEquals(instance, actualRequest.getInstance());
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      Instance instance = Instance.newBuilder().build();

      client.insertInstance(zone, instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Instance itemsElement = new ArrayList<>();
    List<Instance> items = Arrays.asList(itemsElement);
    InstanceList expectedResponse = InstanceList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .addAllItems(items)
      .build();
    mockInstances.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListInstancesPagedResponse pagedListResponse = client.listInstances(zone);

    List<Instance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInstancesHttpRequest actualRequest = (ListInstancesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listInstances(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resetInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    Operation actualResponse =
        client.resetInstance(instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ResetInstanceHttpRequest actualRequest = (ResetInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void resetInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.resetInstance(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setDiskAutoDeleteInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Boolean autoDelete = false;
    String deviceName = "deviceName-1543071020";

    Operation actualResponse =
        client.setDiskAutoDeleteInstance(instance, autoDelete, deviceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetDiskAutoDeleteInstanceHttpRequest actualRequest = (SetDiskAutoDeleteInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(autoDelete, actualRequest.getAutoDelete());
    Assert.assertEquals(deviceName, actualRequest.getDeviceName());
  }

  @Test
  @SuppressWarnings("all")
  public void setDiskAutoDeleteInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Boolean autoDelete = false;
      String deviceName = "deviceName-1543071020";

      client.setDiskAutoDeleteInstance(instance, autoDelete, deviceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMachineTypeInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetMachineTypeRequest instancesSetMachineTypeRequest = InstancesSetMachineTypeRequest.newBuilder().build();

    Operation actualResponse =
        client.setMachineTypeInstance(instance, instancesSetMachineTypeRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMachineTypeInstanceHttpRequest actualRequest = (SetMachineTypeInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(instancesSetMachineTypeRequest, actualRequest.getInstancesSetMachineTypeRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setMachineTypeInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetMachineTypeRequest instancesSetMachineTypeRequest = InstancesSetMachineTypeRequest.newBuilder().build();

      client.setMachineTypeInstance(instance, instancesSetMachineTypeRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMetadataInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Metadata metadata = Metadata.newBuilder().build();

    Operation actualResponse =
        client.setMetadataInstance(instance, metadata);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetMetadataInstanceHttpRequest actualRequest = (SetMetadataInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(metadata, actualRequest.getMetadata());
  }

  @Test
  @SuppressWarnings("all")
  public void setMetadataInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Metadata metadata = Metadata.newBuilder().build();

      client.setMetadataInstance(instance, metadata);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setSchedulingInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Scheduling scheduling = Scheduling.newBuilder().build();

    Operation actualResponse =
        client.setSchedulingInstance(instance, scheduling);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetSchedulingInstanceHttpRequest actualRequest = (SetSchedulingInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(scheduling, actualRequest.getScheduling());
  }

  @Test
  @SuppressWarnings("all")
  public void setSchedulingInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Scheduling scheduling = Scheduling.newBuilder().build();

      client.setSchedulingInstance(instance, scheduling);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setServiceAccountInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetServiceAccountRequest instancesSetServiceAccountRequest = InstancesSetServiceAccountRequest.newBuilder().build();

    Operation actualResponse =
        client.setServiceAccountInstance(instance, instancesSetServiceAccountRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetServiceAccountInstanceHttpRequest actualRequest = (SetServiceAccountInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(instancesSetServiceAccountRequest, actualRequest.getInstancesSetServiceAccountRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setServiceAccountInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetServiceAccountRequest instancesSetServiceAccountRequest = InstancesSetServiceAccountRequest.newBuilder().build();

      client.setServiceAccountInstance(instance, instancesSetServiceAccountRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTagsInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Tags tags = Tags.newBuilder().build();

    Operation actualResponse =
        client.setTagsInstance(instance, tags);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetTagsInstanceHttpRequest actualRequest = (SetTagsInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(tags, actualRequest.getTags());
  }

  @Test
  @SuppressWarnings("all")
  public void setTagsInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Tags tags = Tags.newBuilder().build();

      client.setTagsInstance(instance, tags);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    Operation actualResponse =
        client.startInstance(instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartInstanceHttpRequest actualRequest = (StartInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void startInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.startInstance(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startWithEncryptionKeyInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequest = InstancesStartWithEncryptionKeyRequest.newBuilder().build();

    Operation actualResponse =
        client.startWithEncryptionKeyInstance(instance, instancesStartWithEncryptionKeyRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartWithEncryptionKeyInstanceHttpRequest actualRequest = (StartWithEncryptionKeyInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
    Assert.assertEquals(instancesStartWithEncryptionKeyRequest, actualRequest.getInstancesStartWithEncryptionKeyRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void startWithEncryptionKeyInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequest = InstancesStartWithEncryptionKeyRequest.newBuilder().build();

      client.startWithEncryptionKeyInstance(instance, instancesStartWithEncryptionKeyRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void stopInstanceTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = -1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessageResource(httpErrorMessage)
      .setTargetIdResource(targetId)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setStatusMessageResource(statusMessage)
      .setSelfLinkResource(selfLink)
      .setInsertTimeResource(insertTime)
      .setHttpErrorStatusCodeResource(httpErrorStatusCode)
      .setZoneResource(zone)
      .setTargetLinkResource(targetLink)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setProgressResource(progress)
      .setOperationTypeResource(operationType)
      .setStartTimeResource(startTime)
      .setEndTimeResource(endTime)
      .setIdResource(id)
      .setRegionResource(region)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockInstances.addResponse(expectedResponse);

    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    Operation actualResponse =
        client.stopInstance(instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstances.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StopInstanceHttpRequest actualRequest = (StopInstanceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstanceAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void stopInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstances.addException(exception);

    try {
      InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.stopInstance(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}