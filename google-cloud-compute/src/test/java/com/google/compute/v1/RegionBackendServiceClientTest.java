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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionBackendServicesPagedResponse;
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
public class RegionBackendServiceClientTest {
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
  private RegionBackendServiceClient client;

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
    RegionBackendServiceSettings settings = RegionBackendServiceSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = RegionBackendServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionBackendServiceTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

    Operation actualResponse =
        client.deleteRegionBackendService(backendService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteRegionBackendServiceHttpRequest actualRequest = (DeleteRegionBackendServiceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(backendService, actualRequest.getBackendServiceAsRegionBackendServicesBackendServiceName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionBackendServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

      client.deleteRegionBackendService(backendService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionBackendServiceTest() {
    Integer affinityCookieTtlSec = -1777486694;
    String kind = "kind3292052";
    String sessionAffinity = "sessionAffinity1000759473";
    String description = "description-1724546052";
    String loadBalancingScheme = "loadBalancingScheme1974502980";
    String portName = "portName1115276169";
    Integer timeoutSec = -2067488653;
    String selfLink = "selfLink-1691268851";
    String protocol = "protocol-989163880";
    Boolean enableCDN = false;
    Integer port = 3446913;
    String creationTimestamp = "creationTimestamp567396278";
    String fingerprint = "fingerprint-1375934236";
    String name = "name3373707";
    String id = "id3355";
    String region = "region-934795532";
    BackendService expectedResponse = BackendService.newBuilder()
      .setAffinityCookieTtlSec(affinityCookieTtlSec)
      .setKind(kind)
      .setSessionAffinity(sessionAffinity)
      .setDescription(description)
      .setLoadBalancingScheme(loadBalancingScheme)
      .setPortName(portName)
      .setTimeoutSec(timeoutSec)
      .setSelfLink(selfLink)
      .setProtocol(protocol)
      .setEnableCDN(enableCDN)
      .setPort(port)
      .setCreationTimestamp(creationTimestamp)
      .setFingerprint(fingerprint)
      .setName(name)
      .setId(id)
      .setRegion(region)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

    BackendService actualResponse =
        client.getRegionBackendService(backendService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRegionBackendServiceHttpRequest actualRequest = (GetRegionBackendServiceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(backendService, actualRequest.getBackendServiceAsRegionBackendServicesBackendServiceName());
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionBackendServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

      client.getRegionBackendService(backendService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthRegionBackendServiceTest() {
    String kind = "kind3292052";
    BackendServiceGroupHealth expectedResponse = BackendServiceGroupHealth.newBuilder()
      .setKind(kind)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
    ResourceGroupReference resourceGroupReference = ResourceGroupReference.newBuilder().build();

    BackendServiceGroupHealth actualResponse =
        client.getHealthRegionBackendService(backendService, resourceGroupReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetHealthRegionBackendServiceHttpRequest actualRequest = (GetHealthRegionBackendServiceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(backendService, actualRequest.getBackendServiceAsRegionBackendServicesBackendServiceName());
    Assert.assertEquals(resourceGroupReference, actualRequest.getResourceGroupReference());
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthRegionBackendServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
      ResourceGroupReference resourceGroupReference = ResourceGroupReference.newBuilder().build();

      client.getHealthRegionBackendService(backendService, resourceGroupReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionBackendServiceTest() {
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
    String region2 = "region2-690338393";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region2)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    BackendService backendService = BackendService.newBuilder().build();

    Operation actualResponse =
        client.insertRegionBackendService(region, backendService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertRegionBackendServiceHttpRequest actualRequest = (InsertRegionBackendServiceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
    Assert.assertEquals(backendService, actualRequest.getBackendService());
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionBackendServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      BackendService backendService = BackendService.newBuilder().build();

      client.insertRegionBackendService(region, backendService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionBackendServicesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    BackendService itemsElement = new ArrayList<>();
    List<BackendService> items = Arrays.asList(itemsElement);
    BackendServiceList expectedResponse = BackendServiceList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListRegionBackendServicesPagedResponse pagedListResponse = client.listRegionBackendServices(region);

    List<BackendService> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListRegionBackendServicesHttpRequest actualRequest = (ListRegionBackendServicesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionBackendServicesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listRegionBackendServices(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchRegionBackendServiceTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

    Operation actualResponse =
        client.patchRegionBackendService(backendService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PatchRegionBackendServiceHttpRequest actualRequest = (PatchRegionBackendServiceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(backendService, actualRequest.getBackendServiceAsRegionBackendServicesBackendServiceName());
  }

  @Test
  @SuppressWarnings("all")
  public void patchRegionBackendServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

      client.patchRegionBackendService(backendService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateRegionBackendServiceTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockRegionBackendServices.addResponse(expectedResponse);

    RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

    Operation actualResponse =
        client.updateRegionBackendService(backendService);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionBackendServices.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateRegionBackendServiceHttpRequest actualRequest = (UpdateRegionBackendServiceHttpRequest)actualRequests.get(0);

    Assert.assertEquals(backendService, actualRequest.getBackendServiceAsRegionBackendServicesBackendServiceName());
  }

  @Test
  @SuppressWarnings("all")
  public void updateRegionBackendServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionBackendServices.addException(exception);

    try {
      RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");

      client.updateRegionBackendService(backendService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}