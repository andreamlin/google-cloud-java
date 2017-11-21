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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpProxiesPagedResponse;
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
public class TargetHttpProxyClientTest {
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
  private TargetHttpProxyClient client;

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
    TargetHttpProxySettings settings = TargetHttpProxySettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = TargetHttpProxyClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetHttpProxyTest() {
    this would be init code
    mockTargetHttpProxies.addResponse(expectedResponse);

    TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

    Operation actualResponse =
        client.deleteTargetHttpProxy(targetHttpProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTargetHttpProxyHttpRequest actualRequest = (DeleteTargetHttpProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpProxy, actualRequest.getTargetHttpProxyAsTargetHttpProxyName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetHttpProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpProxies.addException(exception);

    try {
      TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

      client.deleteTargetHttpProxy(targetHttpProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetHttpProxyTest() {
    this would be init code
    mockTargetHttpProxies.addResponse(expectedResponse);

    TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

    TargetHttpProxy actualResponse =
        client.getTargetHttpProxy(targetHttpProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTargetHttpProxyHttpRequest actualRequest = (GetTargetHttpProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpProxy, actualRequest.getTargetHttpProxyAsTargetHttpProxyName());
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetHttpProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpProxies.addException(exception);

    try {
      TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

      client.getTargetHttpProxy(targetHttpProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetHttpProxyTest() {
    this would be init code
    mockTargetHttpProxies.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    TargetHttpProxy targetHttpProxy = TargetHttpProxy.newBuilder().build();

    Operation actualResponse =
        client.insertTargetHttpProxy(project, targetHttpProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertTargetHttpProxyHttpRequest actualRequest = (InsertTargetHttpProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
    Assert.assertEquals(targetHttpProxy, actualRequest.getTargetHttpProxy());
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetHttpProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpProxies.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      TargetHttpProxy targetHttpProxy = TargetHttpProxy.newBuilder().build();

      client.insertTargetHttpProxy(project, targetHttpProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetHttpProxiesTest() {
    this would be init code
    mockTargetHttpProxies.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListTargetHttpProxiesPagedResponse pagedListResponse = client.listTargetHttpProxies(project);

    List<TargetHttpProxy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockTargetHttpProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTargetHttpProxiesHttpRequest actualRequest = (ListTargetHttpProxiesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetHttpProxiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpProxies.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listTargetHttpProxies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setUrlMapTargetHttpProxyTest() {
    this would be init code
    mockTargetHttpProxies.addResponse(expectedResponse);

    TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
    UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();

    Operation actualResponse =
        client.setUrlMapTargetHttpProxy(targetHttpProxy, urlMapReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetUrlMapTargetHttpProxyHttpRequest actualRequest = (SetUrlMapTargetHttpProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpProxy, actualRequest.getTargetHttpProxyAsTargetHttpProxyName());
    Assert.assertEquals(urlMapReference, actualRequest.getUrlMapReference());
  }

  @Test
  @SuppressWarnings("all")
  public void setUrlMapTargetHttpProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpProxies.addException(exception);

    try {
      TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
      UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();

      client.setUrlMapTargetHttpProxy(targetHttpProxy, urlMapReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}