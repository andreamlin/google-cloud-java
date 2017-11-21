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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionInstanceGroupManagersPagedResponse;
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
public class RegionInstanceGroupManagerClientTest {
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
  private RegionInstanceGroupManagerClient client;

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
    RegionInstanceGroupManagerSettings settings = RegionInstanceGroupManagerSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = RegionInstanceGroupManagerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void abandonInstancesRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequest = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AbandonInstancesRegionInstanceGroupManagerHttpRequest actualRequest = (AbandonInstancesRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
    Assert.assertEquals(regionInstanceGroupManagersAbandonInstancesRequest, actualRequest.getRegionInstanceGroupManagersAbandonInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void abandonInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequest = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

      client.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    Operation actualResponse =
        client.deleteRegionInstanceGroupManager(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteRegionInstanceGroupManagerHttpRequest actualRequest = (DeleteRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.deleteRegionInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersDeleteInstancesRequest regionInstanceGroupManagersDeleteInstancesRequest = RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.deleteInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInstancesRegionInstanceGroupManagerHttpRequest actualRequest = (DeleteInstancesRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
    Assert.assertEquals(regionInstanceGroupManagersDeleteInstancesRequest, actualRequest.getRegionInstanceGroupManagersDeleteInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersDeleteInstancesRequest regionInstanceGroupManagersDeleteInstancesRequest = RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

      client.deleteInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManager actualResponse =
        client.getRegionInstanceGroupManager(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetRegionInstanceGroupManagerHttpRequest actualRequest = (GetRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.getRegionInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    InstanceGroupManager instanceGroupManager = InstanceGroupManager.newBuilder().build();

    Operation actualResponse =
        client.insertRegionInstanceGroupManager(region, instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertRegionInstanceGroupManagerHttpRequest actualRequest = (InsertRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManager());
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      InstanceGroupManager instanceGroupManager = InstanceGroupManager.newBuilder().build();

      client.insertRegionInstanceGroupManager(region, instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupManagersTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListRegionInstanceGroupManagersPagedResponse pagedListResponse = client.listRegionInstanceGroupManagers(region);

    List<InstanceGroupManager> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListRegionInstanceGroupManagersHttpRequest actualRequest = (ListRegionInstanceGroupManagersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupManagersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listRegionInstanceGroupManagers(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesRegionInstanceGroupManagersTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    RegionInstanceGroupManagersListInstancesResponse actualResponse =
        client.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListManagedInstancesRegionInstanceGroupManagersHttpRequest actualRequest = (ListManagedInstancesRegionInstanceGroupManagersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesRegionInstanceGroupManagersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequest = RegionInstanceGroupManagersRecreateRequest.newBuilder().build();

    Operation actualResponse =
        client.recreateInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersRecreateRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RecreateInstancesRegionInstanceGroupManagerHttpRequest actualRequest = (RecreateInstancesRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
    Assert.assertEquals(regionInstanceGroupManagersRecreateRequest, actualRequest.getRegionInstanceGroupManagersRecreateRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequest = RegionInstanceGroupManagersRecreateRequest.newBuilder().build();

      client.recreateInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersRecreateRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    Integer size = 3530753;
    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    Operation actualResponse =
        client.resizeRegionInstanceGroupManager(size, instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ResizeRegionInstanceGroupManagerHttpRequest actualRequest = (ResizeRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(size, actualRequest.getSize());
    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void resizeRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      Integer size = 3530753;
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.resizeRegionInstanceGroupManager(size, instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersSetTemplateRequest regionInstanceGroupManagersSetTemplateRequest = RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();

    Operation actualResponse =
        client.setInstanceTemplateRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTemplateRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetInstanceTemplateRegionInstanceGroupManagerHttpRequest actualRequest = (SetInstanceTemplateRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
    Assert.assertEquals(regionInstanceGroupManagersSetTemplateRequest, actualRequest.getRegionInstanceGroupManagersSetTemplateRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersSetTemplateRequest regionInstanceGroupManagersSetTemplateRequest = RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();

      client.setInstanceTemplateRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTemplateRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsRegionInstanceGroupManagerTest() {
    this would be init code
    mockRegionInstanceGroupManagers.addResponse(expectedResponse);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequest = RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

    Operation actualResponse =
        client.setTargetPoolsRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockRegionInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetTargetPoolsRegionInstanceGroupManagerHttpRequest actualRequest = (SetTargetPoolsRegionInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName());
    Assert.assertEquals(regionInstanceGroupManagersSetTargetPoolsRequest, actualRequest.getRegionInstanceGroupManagersSetTargetPoolsRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsRegionInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockRegionInstanceGroupManagers.addException(exception);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequest = RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

      client.setTargetPoolsRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}