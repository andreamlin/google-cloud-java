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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpsProxiesPagedResponse;
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
public class TargetHttpsProxyClientTest {
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
  private TargetHttpsProxyClient client;

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
    TargetHttpsProxySettings settings = TargetHttpsProxySettings.newBuilder()
        .setTransportChannelProvider(serviceHelper.createChannelProvider())
        .setCredentialsProvider(NoCredentialsProvider.create())
        .build();
    client = TargetHttpsProxyClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetHttpsProxyTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockTargetHttpsProxies.addResponse(expectedResponse);

    TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

    Operation actualResponse =
        client.deleteTargetHttpsProxy(targetHttpsProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpsProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTargetHttpsProxyHttpRequest actualRequest = (DeleteTargetHttpsProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpsProxy, actualRequest.getTargetHttpsProxyAsTargetHttpsProxyName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetHttpsProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpsProxies.addException(exception);

    try {
      TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

      client.deleteTargetHttpsProxy(targetHttpsProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetHttpsProxyTest() {
    String urlMap = "urlMap-169850228";
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    TargetHttpsProxy expectedResponse = TargetHttpsProxy.newBuilder()
      .setUrlMap(urlMap)
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setId(id)
      .setSelfLink(selfLink)
      .build();
    mockTargetHttpsProxies.addResponse(expectedResponse);

    TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

    TargetHttpsProxy actualResponse =
        client.getTargetHttpsProxy(targetHttpsProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpsProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTargetHttpsProxyHttpRequest actualRequest = (GetTargetHttpsProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpsProxy, actualRequest.getTargetHttpsProxyAsTargetHttpsProxyName());
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetHttpsProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpsProxies.addException(exception);

    try {
      TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

      client.getTargetHttpsProxy(targetHttpsProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetHttpsProxyTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockTargetHttpsProxies.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    TargetHttpsProxy targetHttpsProxy = TargetHttpsProxy.newBuilder().build();

    Operation actualResponse =
        client.insertTargetHttpsProxy(project, targetHttpsProxy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpsProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InsertTargetHttpsProxyHttpRequest actualRequest = (InsertTargetHttpsProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
    Assert.assertEquals(targetHttpsProxy, actualRequest.getTargetHttpsProxy());
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetHttpsProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpsProxies.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      TargetHttpsProxy targetHttpsProxy = TargetHttpsProxy.newBuilder().build();

      client.insertTargetHttpsProxy(project, targetHttpsProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetHttpsProxiesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    TargetHttpsProxy itemsElement = new ArrayList<>();
    List<TargetHttpsProxy> items = Arrays.asList(itemsElement);
    TargetHttpsProxyList expectedResponse = TargetHttpsProxyList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockTargetHttpsProxies.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListTargetHttpsProxiesPagedResponse pagedListResponse = client.listTargetHttpsProxies(project);

    List<TargetHttpsProxy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockTargetHttpsProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTargetHttpsProxiesHttpRequest actualRequest = (ListTargetHttpsProxiesHttpRequest)actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProjectAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetHttpsProxiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpsProxies.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listTargetHttpsProxies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setSslCertificatesTargetHttpsProxyTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockTargetHttpsProxies.addResponse(expectedResponse);

    TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
    TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequest = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();

    Operation actualResponse =
        client.setSslCertificatesTargetHttpsProxy(targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpsProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetSslCertificatesTargetHttpsProxyHttpRequest actualRequest = (SetSslCertificatesTargetHttpsProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpsProxy, actualRequest.getTargetHttpsProxyAsTargetHttpsProxyName());
    Assert.assertEquals(targetHttpsProxiesSetSslCertificatesRequest, actualRequest.getTargetHttpsProxiesSetSslCertificatesRequest());
  }

  @Test
  @SuppressWarnings("all")
  public void setSslCertificatesTargetHttpsProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpsProxies.addException(exception);

    try {
      TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
      TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequest = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();

      client.setSslCertificatesTargetHttpsProxy(targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setUrlMapTargetHttpsProxyTest() {
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
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockTargetHttpsProxies.addResponse(expectedResponse);

    TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
    UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();

    Operation actualResponse =
        client.setUrlMapTargetHttpsProxy(targetHttpsProxy, urlMapReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockTargetHttpsProxies.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetUrlMapTargetHttpsProxyHttpRequest actualRequest = (SetUrlMapTargetHttpsProxyHttpRequest)actualRequests.get(0);

    Assert.assertEquals(targetHttpsProxy, actualRequest.getTargetHttpsProxyAsTargetHttpsProxyName());
    Assert.assertEquals(urlMapReference, actualRequest.getUrlMapReference());
  }

  @Test
  @SuppressWarnings("all")
  public void setUrlMapTargetHttpsProxyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockTargetHttpsProxies.addException(exception);

    try {
      TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
      UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();

      client.setUrlMapTargetHttpsProxy(targetHttpsProxy, urlMapReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}