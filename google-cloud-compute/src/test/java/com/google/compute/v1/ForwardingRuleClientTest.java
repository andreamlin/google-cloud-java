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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListForwardingRulesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListForwardingRulesPagedResponse;
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
public class ForwardingRuleClientTest {
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
  private ForwardingRuleClient client;

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
    ForwardingRuleSettings settings = ForwardingRuleSettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = ForwardingRuleClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListForwardingRulesTest() {
    this would be init code
    mockForwardingRules.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListForwardingRulesPagedResponse pagedListResponse = client.aggregatedListForwardingRules(project);

    List<ForwardingRule> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getForwardingRules().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockForwardingRules.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AggregatedListForwardingRulesHttpRequest actualRequest = (AggregatedListForwardingRulesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListForwardingRulesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockForwardingRules.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListForwardingRules(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteForwardingRuleTest() {
    this would be init code
    mockForwardingRules.addResponse(expectedResponse);

    ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

    Operation actualResponse =
        client.deleteForwardingRule(forwardingRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockForwardingRules.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteForwardingRuleHttpRequest actualRequest = (DeleteForwardingRuleHttpRequest)actualRequests.get(0);

    Assert.assertEquals(forwardingRule, actualRequest.getForwardingRuleAsForwardingRuleName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteForwardingRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockForwardingRules.addException(exception);

    try {
      ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

      client.deleteForwardingRule(forwardingRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getForwardingRuleTest() {
    this would be init code
    mockForwardingRules.addResponse(expectedResponse);

    ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

    ForwardingRule actualResponse =
        client.getForwardingRule(forwardingRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockForwardingRules.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetForwardingRuleHttpRequest actualRequest = (GetForwardingRuleHttpRequest)actualRequests.get(0);

    Assert.assertEquals(forwardingRule, actualRequest.getForwardingRuleAsForwardingRuleName());
  }

  @Test
  @SuppressWarnings("all")
  public void getForwardingRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockForwardingRules.addException(exception);

    try {
      ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

      client.getForwardingRule(forwardingRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertForwardingRuleTest() {
    this would be init code
    mockForwardingRules.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    ForwardingRule forwardingRule = ForwardingRule.newBuilder().build();

    Operation actualResponse =
        client.insertForwardingRule(region, forwardingRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockForwardingRules.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertForwardingRuleHttpRequest actualRequest = (InsertForwardingRuleHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
    Assert.assertEquals(forwardingRule, actualRequest.getForwardingRule());
  }

  @Test
  @SuppressWarnings("all")
  public void insertForwardingRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockForwardingRules.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      ForwardingRule forwardingRule = ForwardingRule.newBuilder().build();

      client.insertForwardingRule(region, forwardingRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listForwardingRulesTest() {
    this would be init code
    mockForwardingRules.addResponse(expectedResponse);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListForwardingRulesPagedResponse pagedListResponse = client.listForwardingRules(region);

    List<ForwardingRule> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockForwardingRules.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListForwardingRulesHttpRequest actualRequest = (ListForwardingRulesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(region, actualRequest.getRegionAsRegionName());
  }

  @Test
  @SuppressWarnings("all")
  public void listForwardingRulesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockForwardingRules.addException(exception);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listForwardingRules(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetForwardingRuleTest() {
    this would be init code
    mockForwardingRules.addResponse(expectedResponse);

    ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");
    TargetReference targetReference = TargetReference.newBuilder().build();

    Operation actualResponse =
        client.setTargetForwardingRule(forwardingRule, targetReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockForwardingRules.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetTargetForwardingRuleHttpRequest actualRequest = (SetTargetForwardingRuleHttpRequest)actualRequests.get(0);

    Assert.assertEquals(forwardingRule, actualRequest.getForwardingRuleAsForwardingRuleName());
    Assert.assertEquals(targetReference, actualRequest.getTargetReference());
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetForwardingRuleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockForwardingRules.addException(exception);

    try {
      ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");
      TargetReference targetReference = TargetReference.newBuilder().build();

      client.setTargetForwardingRule(forwardingRule, targetReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}