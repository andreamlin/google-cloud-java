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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAutoscalersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAutoscalersPagedResponse;
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
public class AutoscalerClientTest {
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
  private AutoscalerClient client;

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
    AutoscalerSettings settings = AutoscalerSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = AutoscalerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListAutoscalersTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    AutoscalersScopedList autoscalers = AutoscalersScopedList.newBuilder().build();
    AutoscalersScopedList items = AutoscalersScopedList.newBuilder()
      .setAutoscalers(autoscalers)
      .build();
    AutoscalerAggregatedList expectedResponse = AutoscalerAggregatedList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .setItems(items)
      .build();
    mockAutoscalers.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListAutoscalersPagedResponse pagedListResponse = client.aggregatedListAutoscalers(project);

    List<Autoscaler> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAutoscalers().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListAutoscalersHttpRequest actualRequest = (AggregatedListAutoscalersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListAutoscalersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListAutoscalers(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAutoscalerTest() {
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
    mockAutoscalers.addResponse(expectedResponse);

    AutoscalerName autoscaler = AutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

    Operation actualResponse =
        client.deleteAutoscaler(autoscaler);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAutoscalerHttpRequest actualRequest = (DeleteAutoscalerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(autoscaler, actualRequest.getAutoscalerAsAutoscalerName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAutoscalerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      AutoscalerName autoscaler = AutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

      client.deleteAutoscaler(autoscaler);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getAutoscalerTest() {
    String zone = "zone3744684";
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String region = "region-934795532";
    String selfLink = "selfLink-1691268851";
    String target = "target-880905839";
    Autoscaler expectedResponse = Autoscaler.newBuilder()
      .setZoneResource(zone)
      .setKindResource(kind)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setDescriptionResource(description)
      .setIdResource(id)
      .setRegionResource(region)
      .setSelfLinkResource(selfLink)
      .setTargetResource(target)
      .build();
    mockAutoscalers.addResponse(expectedResponse);

    AutoscalerName autoscaler = AutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

    Autoscaler actualResponse =
        client.getAutoscaler(autoscaler);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAutoscalerHttpRequest actualRequest = (GetAutoscalerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(autoscaler, actualRequest.getAutoscalerAsAutoscalerName());
  }

  @Test
  @SuppressWarnings("all")
  public void getAutoscalerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      AutoscalerName autoscaler = AutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

      client.getAutoscaler(autoscaler);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertAutoscalerTest() {
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
    mockAutoscalers.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    Autoscaler autoscaler = Autoscaler.newBuilder().build();

    Operation actualResponse =
        client.insertAutoscaler(zone, autoscaler);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertAutoscalerHttpRequest actualRequest = (InsertAutoscalerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
    Assert.assertEquals(autoscaler, actualRequest.getAutoscaler());
  }

  @Test
  @SuppressWarnings("all")
  public void insertAutoscalerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      Autoscaler autoscaler = Autoscaler.newBuilder().build();

      client.insertAutoscaler(zone, autoscaler);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listAutoscalersTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Autoscaler itemsElement = new ArrayList<>();
    List<Autoscaler> items = Arrays.asList(itemsElement);
    AutoscalerList expectedResponse = AutoscalerList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .addAllItems(items)
      .build();
    mockAutoscalers.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListAutoscalersPagedResponse pagedListResponse = client.listAutoscalers(zone);

    List<Autoscaler> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAutoscalersHttpRequest actualRequest = (ListAutoscalersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void listAutoscalersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listAutoscalers(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchAutoscalerTest() {
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
    mockAutoscalers.addResponse(expectedResponse);

    String autoscaler = "autoscaler517258967";
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    Operation actualResponse =
        client.patchAutoscaler(autoscaler, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PatchAutoscalerHttpRequest actualRequest = (PatchAutoscalerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(autoscaler, actualRequest.getAutoscaler());
    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void patchAutoscalerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      String autoscaler = "autoscaler517258967";
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.patchAutoscaler(autoscaler, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateAutoscalerTest() {
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
    mockAutoscalers.addResponse(expectedResponse);

    String autoscaler = "autoscaler517258967";
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    Operation actualResponse =
        client.updateAutoscaler(autoscaler, zone);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockAutoscalers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAutoscalerHttpRequest actualRequest = (UpdateAutoscalerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(autoscaler, actualRequest.getAutoscaler());
    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void updateAutoscalerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalers.addException(exception);

    try {
      String autoscaler = "autoscaler517258967";
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.updateAutoscaler(autoscaler, zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}