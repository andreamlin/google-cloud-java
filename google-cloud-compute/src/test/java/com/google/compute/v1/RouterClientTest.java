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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListRoutersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutersPagedResponse;
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
public class RouterClientTest {
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
  private RouterClient client;

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
    RouterSettings settings = RouterSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = RouterClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListRoutersTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    RoutersScopedList routers = RoutersScopedList.newBuilder().build();
    RoutersScopedList items = RoutersScopedList.newBuilder()
      .setRouters(routers)
      .build();
    RouterAggregatedList expectedResponse = RouterAggregatedList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .setItems(items)
      .build();
    mockRouters.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListRoutersPagedResponse pagedListResponse = client.aggregatedListRouters(project);

    List<Router> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getRouters().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListRoutersHttpRequest actualRequest = (AggregatedListRoutersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListRoutersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListRouters(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRouterTest() {
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
    mockRouters.addResponse(expectedResponse);

    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

    Operation actualResponse =
        client.deleteRouter(router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteRouterHttpRequest actualRequest = (DeleteRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(router, actualRequest.getRouterAsRouterName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

      client.deleteRouter(router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRouterTest() {
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String region = "region-934795532";
    String network = "network1843485230";
    String selfLink = "selfLink-1691268851";
    Router expectedResponse = Router.newBuilder()
      .setKindResource(kind)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setDescriptionResource(description)
      .setIdResource(id)
      .setRegionResource(region)
      .setNetworkResource(network)
      .setSelfLinkResource(selfLink)
      .build();
    mockRouters.addResponse(expectedResponse);

    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

    Router actualResponse =
        client.getRouter(router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRouterHttpRequest actualRequest = (GetRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(router, actualRequest.getRouterAsRouterName());
  }

  @Test
  @SuppressWarnings("all")
  public void getRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

      client.getRouter(router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRouterStatusRouterTest() {
    String kind = "kind3292052";
    RouterStatusResponse expectedResponse = RouterStatusResponse.newBuilder()
      .setKindResource(kind)
      .build();
    mockRouters.addResponse(expectedResponse);

    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

    RouterStatusResponse actualResponse =
        client.getRouterStatusRouter(router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRouterStatusRouterHttpRequest actualRequest = (GetRouterStatusRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(router, actualRequest.getRouterAsRouterName());
  }

  @Test
  @SuppressWarnings("all")
  public void getRouterStatusRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

      client.getRouterStatusRouter(router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRouterTest() {
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
      .setRegion(region2)
      .setClientOperationIdResource(clientOperationId)
      .setUserResource(user)
      .setStatusResource(status)
      .build();
    mockRouters.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    Router router = Router.newBuilder().build();

    Operation actualResponse =
        client.insertRouter(region, router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertRouterHttpRequest actualRequest = (InsertRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
    Assert.assertEquals(router, actualRequest.getRouter());
  }

  @Test
  @SuppressWarnings("all")
  public void insertRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      Router router = Router.newBuilder().build();

      client.insertRouter(region, router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRoutersTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Router itemsElement = new ArrayList<>();
    List<Router> items = Arrays.asList(itemsElement);
    RouterList expectedResponse = RouterList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .addAllItems(items)
      .build();
    mockRouters.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListRoutersPagedResponse pagedListResponse = client.listRouters(region);

    List<Router> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListRoutersHttpRequest actualRequest = (ListRoutersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
  }

  @Test
  @SuppressWarnings("all")
  public void listRoutersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listRouters(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchRouterTest() {
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
    mockRouters.addResponse(expectedResponse);

    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

    Operation actualResponse =
        client.patchRouter(router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PatchRouterHttpRequest actualRequest = (PatchRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(router, actualRequest.getRouterAsRouterName());
  }

  @Test
  @SuppressWarnings("all")
  public void patchRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

      client.patchRouter(router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void previewRouterTest() {
    RoutersPreviewResponse expectedResponse = RoutersPreviewResponse.newBuilder().build();
    mockRouters.addResponse(expectedResponse);

    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

    RoutersPreviewResponse actualResponse =
        client.previewRouter(router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PreviewRouterHttpRequest actualRequest = (PreviewRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(router, actualRequest.getRouterAsRouterName());
  }

  @Test
  @SuppressWarnings("all")
  public void previewRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

      client.previewRouter(router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateRouterTest() {
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
    mockRouters.addResponse(expectedResponse);

    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

    Operation actualResponse =
        client.updateRouter(router);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRouters.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateRouterHttpRequest actualRequest = (UpdateRouterHttpRequest)actualRequests.get(0);

    Assert.assertEquals(router, actualRequest.getRouterAsRouterName());
  }

  @Test
  @SuppressWarnings("all")
  public void updateRouterExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRouters.addException(exception);

    try {
      RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");

      client.updateRouter(router);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}