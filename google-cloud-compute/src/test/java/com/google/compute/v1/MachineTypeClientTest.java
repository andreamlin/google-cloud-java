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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListMachineTypesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListMachineTypesPagedResponse;
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
public class MachineTypeClientTest {
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
  private MachineTypeClient client;

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
    MachineTypeSettings settings = MachineTypeSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = MachineTypeClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListMachineTypesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    MachineTypesScopedList machineTypes = MachineTypesScopedList.newBuilder().build();
    MachineTypesScopedList items = MachineTypesScopedList.newBuilder()
      .setMachineTypes(machineTypes)
      .build();
    MachineTypeAggregatedList expectedResponse = MachineTypeAggregatedList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .setItems(items)
      .build();
    mockMachineTypes.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListMachineTypesPagedResponse pagedListResponse = client.aggregatedListMachineTypes(project);

    List<MachineType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getMachineTypes().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockMachineTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListMachineTypesHttpRequest actualRequest = (AggregatedListMachineTypesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListMachineTypesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMachineTypes.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListMachineTypes(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getMachineTypeTest() {
    Boolean isSharedCpu = false;
    Integer guestCpus = -1754126894;
    String kind = "kind3292052";
    String description = "description-1724546052";
    String selfLink = "selfLink-1691268851";
    Integer memoryMb = 1726613907;
    Integer maximumPersistentDisks = 1033091853;
    String maximumPersistentDisksSizeGb = "maximumPersistentDisksSizeGb-1993209177";
    String zone = "zone3744684";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String id = "id3355";
    Integer imageSpaceGb = -461539048;
    MachineType expectedResponse = MachineType.newBuilder()
      .setIsSharedCpuResource(isSharedCpu)
      .setGuestCpusResource(guestCpus)
      .setKindResource(kind)
      .setDescriptionResource(description)
      .setSelfLinkResource(selfLink)
      .setMemoryMbResource(memoryMb)
      .setMaximumPersistentDisksResource(maximumPersistentDisks)
      .setMaximumPersistentDisksSizeGbResource(maximumPersistentDisksSizeGb)
      .setZoneResource(zone)
      .setCreationTimestampResource(creationTimestamp)
      .setNameResource(name)
      .setIdResource(id)
      .setImageSpaceGbResource(imageSpaceGb)
      .build();
    mockMachineTypes.addResponse(expectedResponse);

    MachineTypeName machineType = MachineTypeName.of("[PROJECT]", "[ZONE]", "[MACHINE_TYPE]");

    MachineType actualResponse =
        client.getMachineType(machineType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockMachineTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMachineTypeHttpRequest actualRequest = (GetMachineTypeHttpRequest)actualRequests.get(0);

    Assert.assertEquals(machineType, actualRequest.getMachineTypeAsMachineTypeName());
  }

  @Test
  @SuppressWarnings("all")
  public void getMachineTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMachineTypes.addException(exception);

    try {
      MachineTypeName machineType = MachineTypeName.of("[PROJECT]", "[ZONE]", "[MACHINE_TYPE]");

      client.getMachineType(machineType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listMachineTypesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    MachineType itemsElement = new ArrayList<>();
    List<MachineType> items = Arrays.asList(itemsElement);
    MachineTypeList expectedResponse = MachineTypeList.newBuilder()
      .setKindResource(kind)
      .setNextPageToken(nextPageToken)
      .setIdResource(id)
      .setSelfLinkResource(selfLink)
      .addAllItems(items)
      .build();
    mockMachineTypes.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListMachineTypesPagedResponse pagedListResponse = client.listMachineTypes(zone);

    List<MachineType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockMachineTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListMachineTypesHttpRequest actualRequest = (ListMachineTypesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(zone, actualRequest.getZoneAsZoneName());
  }

  @Test
  @SuppressWarnings("all")
  public void listMachineTypesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMachineTypes.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listMachineTypes(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}