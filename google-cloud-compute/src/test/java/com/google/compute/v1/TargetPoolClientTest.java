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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetPoolsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetPoolsPagedResponse;
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
public class TargetPoolClientTest {
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
  private TargetPoolClient client;

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
    TargetPoolSettings settings = TargetPoolSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = TargetPoolClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void addHealthCheckTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();

    Operation actualResponse =
        client.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddHealthCheckTargetPoolHttpRequest actualRequest = (AddHealthCheckTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
    Assert.assertEquals(targetPoolsAddHealthCheckRequest, actualRequest.getTargetPoolsAddHealthCheckRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void addHealthCheckTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();

      client.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void addInstanceTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequest = TargetPoolsAddInstanceRequest.newBuilder().build();

    Operation actualResponse =
        client.addInstanceTargetPool(targetPool, targetPoolsAddInstanceRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddInstanceTargetPoolHttpRequest actualRequest = (AddInstanceTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
    Assert.assertEquals(targetPoolsAddInstanceRequest, actualRequest.getTargetPoolsAddInstanceRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void addInstanceTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequest = TargetPoolsAddInstanceRequest.newBuilder().build();

      client.addInstanceTargetPool(targetPool, targetPoolsAddInstanceRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListTargetPoolsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    TargetPoolsScopedList targetPools = TargetPoolsScopedList.newBuilder().build();
    TargetPoolsScopedList items = TargetPoolsScopedList.newBuilder()
      .setTargetPools(targetPools)
      .build();
    TargetPoolAggregatedList expectedResponse = TargetPoolAggregatedList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .setItems(items)
      .build();
    mockTargetPools.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListTargetPoolsPagedResponse pagedListResponse = client.aggregatedListTargetPools(project);

    List<TargetPool> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTargetPools().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListTargetPoolsHttpRequest actualRequest = (AggregatedListTargetPoolsHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListTargetPoolsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListTargetPools(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

    Operation actualResponse =
        client.deleteTargetPool(targetPool);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTargetPoolHttpRequest actualRequest = (DeleteTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

      client.deleteTargetPool(targetPool);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetPoolTest() {
    String kind = "kind3292052";
    String sessionAffinity = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    Float failoverRatio = -8.6107481E7;
    String id = "id3355";
    String region = "region-934795532";
    String backupPool = "backupPool1119626361";
    String selfLink = "selfLink-1691268851";
    TargetPool expectedResponse = TargetPool.newBuilder()
      .setKindResource(kind)
      .setSessionAffinityResource(sessionAffinity)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setDescriptionResource(description)
      .setFailoverRatioResource(failoverRatio)
      .setIdResource(id)
      .setRegionResource(region)
      .setBackupPoolResource(backupPool)
      .setSelfLinkResource(selfLink)
      .build();
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

    TargetPool actualResponse =
        client.getTargetPool(targetPool);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTargetPoolHttpRequest actualRequest = (GetTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

      client.getTargetPool(targetPool);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthTargetPoolTest() {
    String kind = "kind3292052";
    TargetPoolInstanceHealth expectedResponse = TargetPoolInstanceHealth.newBuilder()
      .setKindResource(kind)
      .build();
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    InstanceReference instanceReference = InstanceReference.newBuilder().build();

    TargetPoolInstanceHealth actualResponse =
        client.getHealthTargetPool(targetPool, instanceReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetHealthTargetPoolHttpRequest actualRequest = (GetHealthTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
    Assert.assertEquals(instanceReference, actualRequest.getInstanceReference());
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      InstanceReference instanceReference = InstanceReference.newBuilder().build();

      client.getHealthTargetPool(targetPool, instanceReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    TargetPool targetPool = TargetPool.newBuilder().build();

    Operation actualResponse =
        client.insertTargetPool(region, targetPool);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertTargetPoolHttpRequest actualRequest = (InsertTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
    Assert.assertEquals(targetPool, actualRequest.getTargetPool());
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      TargetPool targetPool = TargetPool.newBuilder().build();

      client.insertTargetPool(region, targetPool);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetPoolsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    TargetPool itemsElement = new ArrayList<>();
    List<TargetPool> items = Arrays.asList(itemsElement);
    TargetPoolList expectedResponse = TargetPoolList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .addAllItems(items)
      .build();
    mockTargetPools.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListTargetPoolsPagedResponse pagedListResponse = client.listTargetPools(region);

    List<TargetPool> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTargetPoolsHttpRequest actualRequest = (ListTargetPoolsHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetPoolsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listTargetPools(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void removeHealthCheckTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequest = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();

    Operation actualResponse =
        client.removeHealthCheckTargetPool(targetPool, targetPoolsRemoveHealthCheckRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveHealthCheckTargetPoolHttpRequest actualRequest = (RemoveHealthCheckTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
    Assert.assertEquals(targetPoolsRemoveHealthCheckRequest, actualRequest.getTargetPoolsRemoveHealthCheckRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void removeHealthCheckTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequest = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();

      client.removeHealthCheckTargetPool(targetPool, targetPoolsRemoveHealthCheckRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstanceTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequest = TargetPoolsRemoveInstanceRequest.newBuilder().build();

    Operation actualResponse =
        client.removeInstanceTargetPool(targetPool, targetPoolsRemoveInstanceRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveInstanceTargetPoolHttpRequest actualRequest = (RemoveInstanceTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
    Assert.assertEquals(targetPoolsRemoveInstanceRequest, actualRequest.getTargetPoolsRemoveInstanceRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstanceTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequest = TargetPoolsRemoveInstanceRequest.newBuilder().build();

      client.removeInstanceTargetPool(targetPool, targetPoolsRemoveInstanceRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setBackupTargetPoolTest() {
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
    String status = $ NOT IMPLEMENTED: SchemaTypeTable.getFullNameFor(TypeModel type, String value) $;
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
    mockTargetPools.addResponse(expectedResponse);

    TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    Float failoverRatio = -8.6107481E7;
    TargetReference targetReference = TargetReference.newBuilder().build();

    Operation actualResponse =
        client.setBackupTargetPool(targetPool, failoverRatio, targetReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetPools.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetBackupTargetPoolHttpRequest actualRequest = (SetBackupTargetPoolHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetPool, actualRequest.getTargetPoolAsTargetPoolName());
    Assert.assertEquals(failoverRatio, actualRequest.getFailoverRatio());
    Assert.assertEquals(targetReference, actualRequest.getTargetReference());
  }

  @Test
  @SuppressWarnings("all")
  public void setBackupTargetPoolExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetPools.addException(exception);

    try {
      TargetPoolName targetPool = TargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      Float failoverRatio = -8.6107481E7;
      TargetReference targetReference = TargetReference.newBuilder().build();

      client.setBackupTargetPool(targetPool, failoverRatio, targetReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}