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
import static com.google.compute.v1.PagedResponseWrappers.ListNetworksPagedResponse;
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
public class NetworkClientTest {
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
  private NetworkClient client;

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
    NetworkSettings settings = NetworkSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = NetworkClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNetworkTest() {
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
    mockNetworks.addResponse(expectedResponse);

    NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");

    Operation actualResponse =
        client.deleteNetwork(network);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockNetworks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteNetworkHttpRequest actualRequest = (DeleteNetworkHttpRequest)actualRequests.get(0);

    Assert.assertEquals(network, actualRequest.getNetworkAsNetworkName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNetworkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockNetworks.addException(exception);

    try {
      NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");

      client.deleteNetwork(network);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getNetworkTest() {
    String iPv4Range = "iPv4Range-534892458";
    String kind = "kind3292052";
    Boolean autoCreateSubnetworks = true;
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String gatewayIPv4 = "gatewayIPv4-1431933859";
    String selfLink = "selfLink-1691268851";
    Network expectedResponse = Network.newBuilder()
      .setIPv4RangeResource(iPv4Range)
      .setKindResource(kind)
      .setAutoCreateSubnetworksResource(autoCreateSubnetworks)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setDescriptionResource(description)
      .setIdResource(id)
      .setGatewayIPv4Resource(gatewayIPv4)
      .setSelfLinkResource(selfLink)
      .build();
    mockNetworks.addResponse(expectedResponse);

    NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");

    Network actualResponse =
        client.getNetwork(network);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockNetworks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetNetworkHttpRequest actualRequest = (GetNetworkHttpRequest)actualRequests.get(0);

    Assert.assertEquals(network, actualRequest.getNetworkAsNetworkName());
  }

  @Test
  @SuppressWarnings("all")
  public void getNetworkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockNetworks.addException(exception);

    try {
      NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");

      client.getNetwork(network);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertNetworkTest() {
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
    mockNetworks.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    Network network = Network.newBuilder().build();

    Operation actualResponse =
        client.insertNetwork(project, network);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockNetworks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertNetworkHttpRequest actualRequest = (InsertNetworkHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
    Assert.assertEquals(network, actualRequest.getNetwork());
  }

  @Test
  @SuppressWarnings("all")
  public void insertNetworkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockNetworks.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      Network network = Network.newBuilder().build();

      client.insertNetwork(project, network);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listNetworksTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Network itemsElement = new ArrayList<>();
    List<Network> items = Arrays.asList(itemsElement);
    NetworkList expectedResponse = NetworkList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .addAllItems(items)
      .build();
    mockNetworks.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListNetworksPagedResponse pagedListResponse = client.listNetworks(project);

    List<Network> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockNetworks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListNetworksHttpRequest actualRequest = (ListNetworksHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void listNetworksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockNetworks.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listNetworks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void switchToCustomModeNetworkTest() {
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
    mockNetworks.addResponse(expectedResponse);

    NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");

    Operation actualResponse =
        client.switchToCustomModeNetwork(network);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockNetworks.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SwitchToCustomModeNetworkHttpRequest actualRequest = (SwitchToCustomModeNetworkHttpRequest)actualRequests.get(0);

    Assert.assertEquals(network, actualRequest.getNetworkAsNetworkName());
  }

  @Test
  @SuppressWarnings("all")
  public void switchToCustomModeNetworkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockNetworks.addException(exception);

    try {
      NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");

      client.switchToCustomModeNetwork(network);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}