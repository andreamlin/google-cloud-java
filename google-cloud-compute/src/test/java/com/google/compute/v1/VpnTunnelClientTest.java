/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.compute.v1;

import com.google.api.gax.httpjson.MockHttpService;
import com.google.api.gax.paging.PagedListResponse;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.common.collect.Lists;
import static com.google.compute.v1.VpnTunnelClient.AggregatedListVpnTunnelsPagedResponse;
import static com.google.compute.v1.VpnTunnelClient.ListVpnTunnelsPagedResponse;
import static com.google.compute.v1.stub.HttpJsonVpnTunnelStub.aggregatedListVpnTunnelsMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonVpnTunnelStub.deleteVpnTunnelMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonVpnTunnelStub.getVpnTunnelMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonVpnTunnelStub.insertVpnTunnelMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonVpnTunnelStub.listVpnTunnelsMethodDescriptor;
import com.google.protobuf.GeneratedMessageV3;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class VpnTunnelClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static VpnTunnelClient client;
  private static VpnTunnelSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        VpnTunnelSettings.newBuilder()
           .setTransportChannelProvider(
               VpnTunnelSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       VpnTunnelClient.create(clientSettings);
  }

  @After
  public void cleanUp() {
    MOCK_SERVICE.reset();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListVpnTunnelsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    VpnTunnel vpnTunnelsElement = VpnTunnel.newBuilder().build();
    List<VpnTunnel> vpnTunnels = Arrays.asList(vpnTunnelsElement);
    VpnTunnelsScopedList items = VpnTunnelsScopedList.newBuilder()
      .addAllVpnTunnels(vpnTunnels)
      .build();
    VpnTunnelAggregatedList expectedResponse = VpnTunnelAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(aggregatedListVpnTunnelsMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListVpnTunnelsPagedResponse pagedListResponse = client.aggregatedListVpnTunnels(project);

    List<VpnTunnel> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().getVpnTunnels().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListVpnTunnelsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListVpnTunnelsMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListVpnTunnels(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteVpnTunnelTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
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
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(deleteVpnTunnelMethodDescriptor);

    VpnTunnelName vpnTunnel = VpnTunnelName.of("[PROJECT]", "[REGION]", "[VPN_TUNNEL]");

    Operation actualResponse =
        client.deleteVpnTunnel(vpnTunnel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteVpnTunnelExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteVpnTunnelMethodDescriptor);

    try {
      VpnTunnelName vpnTunnel = VpnTunnelName.of("[PROJECT]", "[REGION]", "[VPN_TUNNEL]");

      client.deleteVpnTunnel(vpnTunnel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getVpnTunnelTest() {
    String sharedSecretHash = "sharedSecretHash935752803";
    String kind = "kind3292052";
    String description = "description-1724546052";
    Integer ikeVersion = 1292118044;
    String selfLink = "selfLink-1691268851";
    RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
    String detailedStatus = "detailedStatus-740240799";
    String peerIp = "peerIp-690492124";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    String sharedSecret = "sharedSecret-154938422";
    TargetVpnGatewayName targetVpnGateway = TargetVpnGatewayName.of("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
    String status = "status-892481550";
    VpnTunnel expectedResponse = VpnTunnel.newBuilder()
      .setSharedSecretHash(sharedSecretHash)
      .setKind(kind)
      .setDescription(description)
      .setIkeVersion(ikeVersion)
      .setSelfLink(selfLink)
      .setRouter(router.toString())
      .setDetailedStatus(detailedStatus)
      .setPeerIp(peerIp)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setId(id)
      .setRegion(region.toString())
      .setSharedSecret(sharedSecret)
      .setTargetVpnGateway(targetVpnGateway.toString())
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getVpnTunnelMethodDescriptor);

    VpnTunnelName vpnTunnel = VpnTunnelName.of("[PROJECT]", "[REGION]", "[VPN_TUNNEL]");

    VpnTunnel actualResponse =
        client.getVpnTunnel(vpnTunnel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getVpnTunnelExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getVpnTunnelMethodDescriptor);

    try {
      VpnTunnelName vpnTunnel = VpnTunnelName.of("[PROJECT]", "[REGION]", "[VPN_TUNNEL]");

      client.getVpnTunnel(vpnTunnel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertVpnTunnelTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region2 = RegionName.of("[PROJECT]", "[REGION]");
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
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region2.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(insertVpnTunnelMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    VpnTunnel vpnTunnel = VpnTunnel.newBuilder().build();

    Operation actualResponse =
        client.insertVpnTunnel(region, vpnTunnel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertVpnTunnelExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(insertVpnTunnelMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      VpnTunnel vpnTunnel = VpnTunnel.newBuilder().build();

      client.insertVpnTunnel(region, vpnTunnel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listVpnTunnelsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    VpnTunnel itemsElement = VpnTunnel.newBuilder().build();
    List<VpnTunnel> items = Arrays.asList(itemsElement);
    VpnTunnelList expectedResponse = VpnTunnelList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listVpnTunnelsMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListVpnTunnelsPagedResponse pagedListResponse = client.listVpnTunnels(region);

    List<VpnTunnel> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listVpnTunnelsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listVpnTunnelsMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listVpnTunnels(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}