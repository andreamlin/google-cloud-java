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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetSslProxiesPagedResponse;
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
public class TargetSslProxyClientTest {
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
  private TargetSslProxyClient client;

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
    TargetSslProxySettings settings = TargetSslProxySettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = TargetSslProxyClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetSslProxyTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");

    Operation actualResponse =
        client.deleteTargetSslProxy(targetSslProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTargetSslProxyHttpRequest actualRequest = (DeleteTargetSslProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetSslProxy, actualRequest.getTargetSslProxyAsTargetSslProxyName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetSslProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");

      client.deleteTargetSslProxy(targetSslProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetSslProxyTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");

    TargetSslProxy actualResponse =
        client.getTargetSslProxy(targetSslProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTargetSslProxyHttpRequest actualRequest = (GetTargetSslProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetSslProxy, actualRequest.getTargetSslProxyAsTargetSslProxyName());
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetSslProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");

      client.getTargetSslProxy(targetSslProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetSslProxyTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    TargetSslProxy targetSslProxy = TargetSslProxy.newBuilder().build();

    Operation actualResponse =
        client.insertTargetSslProxy(project, targetSslProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertTargetSslProxyHttpRequest actualRequest = (InsertTargetSslProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
    Assert.assertEquals(targetSslProxy, actualRequest.getTargetSslProxy());
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetSslProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      TargetSslProxy targetSslProxy = TargetSslProxy.newBuilder().build();

      client.insertTargetSslProxy(project, targetSslProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetSslProxiesTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListTargetSslProxiesPagedResponse pagedListResponse = client.listTargetSslProxies(project);

    List<TargetSslProxy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTargetSslProxiesHttpRequest actualRequest = (ListTargetSslProxiesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetSslProxiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listTargetSslProxies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setBackendServiceTargetSslProxyTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
    TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequest = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();

    Operation actualResponse =
        client.setBackendServiceTargetSslProxy(targetSslProxy, targetSslProxiesSetBackendServiceRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetBackendServiceTargetSslProxyHttpRequest actualRequest = (SetBackendServiceTargetSslProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetSslProxy, actualRequest.getTargetSslProxyAsTargetSslProxyName());
    Assert.assertEquals(targetSslProxiesSetBackendServiceRequest, actualRequest.getTargetSslProxiesSetBackendServiceRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setBackendServiceTargetSslProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
      TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequest = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();

      client.setBackendServiceTargetSslProxy(targetSslProxy, targetSslProxiesSetBackendServiceRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setProxyHeaderTargetSslProxyTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
    TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequest = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();

    Operation actualResponse =
        client.setProxyHeaderTargetSslProxy(targetSslProxy, targetSslProxiesSetProxyHeaderRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetProxyHeaderTargetSslProxyHttpRequest actualRequest = (SetProxyHeaderTargetSslProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetSslProxy, actualRequest.getTargetSslProxyAsTargetSslProxyName());
    Assert.assertEquals(targetSslProxiesSetProxyHeaderRequest, actualRequest.getTargetSslProxiesSetProxyHeaderRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setProxyHeaderTargetSslProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
      TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequest = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();

      client.setProxyHeaderTargetSslProxy(targetSslProxy, targetSslProxiesSetProxyHeaderRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setSslCertificatesTargetSslProxyTest() {
    this would be init code
    mockTargetSslProxies.addResponse(expectedResponse);

    TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
    TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequest = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();

    Operation actualResponse =
        client.setSslCertificatesTargetSslProxy(targetSslProxy, targetSslProxiesSetSslCertificatesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetSslProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetSslCertificatesTargetSslProxyHttpRequest actualRequest = (SetSslCertificatesTargetSslProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetSslProxy, actualRequest.getTargetSslProxyAsTargetSslProxyName());
    Assert.assertEquals(targetSslProxiesSetSslCertificatesRequest, actualRequest.getTargetSslProxiesSetSslCertificatesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setSslCertificatesTargetSslProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetSslProxies.addException(exception);

    try {
      TargetSslProxyName targetSslProxy = TargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
      TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequest = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();

      client.setSslCertificatesTargetSslProxy(targetSslProxy, targetSslProxiesSetSslCertificatesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}