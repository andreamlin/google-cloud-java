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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupManagersPagedResponse;
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
public class InstanceGroupManagerClientTest {
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
  private InstanceGroupManagerClient client;

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
    InstanceGroupManagerSettings settings = InstanceGroupManagerSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = InstanceGroupManagerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void abandonInstancesInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequest = InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.abandonInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersAbandonInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AbandonInstancesInstanceGroupManagerHttpRequest actualRequest = (AbandonInstancesInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
    Assert.assertEquals(instanceGroupManagersAbandonInstancesRequest, actualRequest.getInstanceGroupManagersAbandonInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void abandonInstancesInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequest = InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

      client.abandonInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersAbandonInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstanceGroupManagersTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListInstanceGroupManagersPagedResponse pagedListResponse = client.aggregatedListInstanceGroupManagers(project);

    List<InstanceGroupManager> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstanceGroupManagers().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListInstanceGroupManagersHttpRequest actualRequest = (AggregatedListInstanceGroupManagersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstanceGroupManagersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListInstanceGroupManagers(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    Operation actualResponse =
        client.deleteInstanceGroupManager(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInstanceGroupManagerHttpRequest actualRequest = (DeleteInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.deleteInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersDeleteInstancesRequest instanceGroupManagersDeleteInstancesRequest = InstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.deleteInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersDeleteInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInstancesInstanceGroupManagerHttpRequest actualRequest = (DeleteInstancesInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
    Assert.assertEquals(instanceGroupManagersDeleteInstancesRequest, actualRequest.getInstanceGroupManagersDeleteInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersDeleteInstancesRequest instanceGroupManagersDeleteInstancesRequest = InstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

      client.deleteInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersDeleteInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManager actualResponse =
        client.getInstanceGroupManager(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInstanceGroupManagerHttpRequest actualRequest = (GetInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.getInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    InstanceGroupManager instanceGroupManager = InstanceGroupManager.newBuilder().build();

    Operation actualResponse =
        client.insertInstanceGroupManager(zone, instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertInstanceGroupManagerHttpRequest actualRequest = (InsertInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManager());
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      InstanceGroupManager instanceGroupManager = InstanceGroupManager.newBuilder().build();

      client.insertInstanceGroupManager(zone, instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupManagersTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListInstanceGroupManagersPagedResponse pagedListResponse = client.listInstanceGroupManagers(zone);

    List<InstanceGroupManager> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInstanceGroupManagersHttpRequest actualRequest = (ListInstanceGroupManagersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupManagersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listInstanceGroupManagers(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesInstanceGroupManagersTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManagersListManagedInstancesResponse actualResponse =
        client.listManagedInstancesInstanceGroupManagers(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListManagedInstancesInstanceGroupManagersHttpRequest actualRequest = (ListManagedInstancesInstanceGroupManagersHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesInstanceGroupManagersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.listManagedInstancesInstanceGroupManagers(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersRecreateInstancesRequest instanceGroupManagersRecreateInstancesRequest = InstanceGroupManagersRecreateInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.recreateInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersRecreateInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RecreateInstancesInstanceGroupManagerHttpRequest actualRequest = (RecreateInstancesInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
    Assert.assertEquals(instanceGroupManagersRecreateInstancesRequest, actualRequest.getInstanceGroupManagersRecreateInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersRecreateInstancesRequest instanceGroupManagersRecreateInstancesRequest = InstanceGroupManagersRecreateInstancesRequest.newBuilder().build();

      client.recreateInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersRecreateInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    Integer size = 3530753;
    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    Operation actualResponse =
        client.resizeInstanceGroupManager(size, instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ResizeInstanceGroupManagerHttpRequest actualRequest = (ResizeInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(size, actualRequest.getSize());
    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
  }

  @Test
  @SuppressWarnings("all")
  public void resizeInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      Integer size = 3530753;
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.resizeInstanceGroupManager(size, instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersSetInstanceTemplateRequest instanceGroupManagersSetInstanceTemplateRequest = InstanceGroupManagersSetInstanceTemplateRequest.newBuilder().build();

    Operation actualResponse =
        client.setInstanceTemplateInstanceGroupManager(instanceGroupManager, instanceGroupManagersSetInstanceTemplateRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetInstanceTemplateInstanceGroupManagerHttpRequest actualRequest = (SetInstanceTemplateInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
    Assert.assertEquals(instanceGroupManagersSetInstanceTemplateRequest, actualRequest.getInstanceGroupManagersSetInstanceTemplateRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersSetInstanceTemplateRequest instanceGroupManagersSetInstanceTemplateRequest = InstanceGroupManagersSetInstanceTemplateRequest.newBuilder().build();

      client.setInstanceTemplateInstanceGroupManager(instanceGroupManager, instanceGroupManagersSetInstanceTemplateRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsInstanceGroupManagerTest() {
    this would be init code
    mockInstanceGroupManagers.addResponse(expectedResponse);

    InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersSetTargetPoolsRequest instanceGroupManagersSetTargetPoolsRequest = InstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

    Operation actualResponse =
        client.setTargetPoolsInstanceGroupManager(instanceGroupManager, instanceGroupManagersSetTargetPoolsRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroupManagers.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetTargetPoolsInstanceGroupManagerHttpRequest actualRequest = (SetTargetPoolsInstanceGroupManagerHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroupManager, actualRequest.getInstanceGroupManagerAsInstanceGroupManagerName());
    Assert.assertEquals(instanceGroupManagersSetTargetPoolsRequest, actualRequest.getInstanceGroupManagersSetTargetPoolsRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsInstanceGroupManagerExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroupManagers.addException(exception);

    try {
      InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersSetTargetPoolsRequest instanceGroupManagersSetTargetPoolsRequest = InstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

      client.setTargetPoolsInstanceGroupManager(instanceGroupManager, instanceGroupManagersSetTargetPoolsRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}