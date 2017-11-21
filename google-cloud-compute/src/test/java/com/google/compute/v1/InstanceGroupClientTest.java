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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesInstanceGroupsPagedResponse;
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
public class InstanceGroupClientTest {
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
  private InstanceGroupClient client;

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
    InstanceGroupSettings settings = InstanceGroupSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = InstanceGroupClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void addInstancesInstanceGroupTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequest = InstanceGroupsAddInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddInstancesInstanceGroupHttpRequest actualRequest = (AddInstancesInstanceGroupHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroupAsInstanceGroupName());
    Assert.assertEquals(instanceGroupsAddInstancesRequest, actualRequest.getInstanceGroupsAddInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void addInstancesInstanceGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequest = InstanceGroupsAddInstancesRequest.newBuilder().build();

      client.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstanceGroupsTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListInstanceGroupsPagedResponse pagedListResponse = client.aggregatedListInstanceGroups(project);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstanceGroups().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListInstanceGroupsHttpRequest actualRequest = (AggregatedListInstanceGroupsHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstanceGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListInstanceGroups(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

    Operation actualResponse =
        client.deleteInstanceGroup(instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInstanceGroupHttpRequest actualRequest = (DeleteInstanceGroupHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroupAsInstanceGroupName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

      client.deleteInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceGroupTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

    InstanceGroup actualResponse =
        client.getInstanceGroup(instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInstanceGroupHttpRequest actualRequest = (GetInstanceGroupHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroupAsInstanceGroupName());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

      client.getInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    InstanceGroup instanceGroup = InstanceGroup.newBuilder().build();

    Operation actualResponse =
        client.insertInstanceGroup(zone, instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertInstanceGroupHttpRequest actualRequest = (InsertInstanceGroupHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroup());
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      InstanceGroup instanceGroup = InstanceGroup.newBuilder().build();

      client.insertInstanceGroup(zone, instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupsTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListInstanceGroupsPagedResponse pagedListResponse = client.listInstanceGroups(zone);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInstanceGroupsHttpRequest actualRequest = (ListInstanceGroupsHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listInstanceGroups(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesInstanceGroupsTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequest = InstanceGroupsListInstancesRequest.newBuilder().build();

    ListInstancesInstanceGroupsPagedResponse pagedListResponse = client.listInstancesInstanceGroups(instanceGroup, instanceGroupsListInstancesRequest);

    List<InstanceWithNamedPorts> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInstancesInstanceGroupsHttpRequest actualRequest = (ListInstancesInstanceGroupsHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroupAsInstanceGroupName());
    Assert.assertEquals(instanceGroupsListInstancesRequest, actualRequest.getInstanceGroupsListInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesInstanceGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequest = InstanceGroupsListInstancesRequest.newBuilder().build();

      client.listInstancesInstanceGroups(instanceGroup, instanceGroupsListInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstancesInstanceGroupTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequest = InstanceGroupsRemoveInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.removeInstancesInstanceGroup(instanceGroup, instanceGroupsRemoveInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveInstancesInstanceGroupHttpRequest actualRequest = (RemoveInstancesInstanceGroupHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroupAsInstanceGroupName());
    Assert.assertEquals(instanceGroupsRemoveInstancesRequest, actualRequest.getInstanceGroupsRemoveInstancesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstancesInstanceGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequest = InstanceGroupsRemoveInstancesRequest.newBuilder().build();

      client.removeInstancesInstanceGroup(instanceGroup, instanceGroupsRemoveInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsInstanceGroupTest() {
    this would be init code
    mockInstanceGroups.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequest = InstanceGroupsSetNamedPortsRequest.newBuilder().build();

    Operation actualResponse =
        client.setNamedPortsInstanceGroup(instanceGroup, instanceGroupsSetNamedPortsRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetNamedPortsInstanceGroupHttpRequest actualRequest = (SetNamedPortsInstanceGroupHttpRequest)actualRequests.get(0);

    Assert.assertEquals(instanceGroup, actualRequest.getInstanceGroupAsInstanceGroupName());
    Assert.assertEquals(instanceGroupsSetNamedPortsRequest, actualRequest.getInstanceGroupsSetNamedPortsRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsInstanceGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceGroups.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequest = InstanceGroupsSetNamedPortsRequest.newBuilder().build();

      client.setNamedPortsInstanceGroup(instanceGroup, instanceGroupsSetNamedPortsRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}