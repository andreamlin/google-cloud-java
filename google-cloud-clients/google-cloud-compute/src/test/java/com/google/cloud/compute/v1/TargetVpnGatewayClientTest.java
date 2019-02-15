/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.TargetVpnGatewayClient.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.cloud.compute.v1.TargetVpnGatewayClient.ListTargetVpnGatewaysPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub.aggregatedListTargetVpnGatewaysMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub.deleteTargetVpnGatewayMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub.getTargetVpnGatewayMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub.insertTargetVpnGatewayMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub.listTargetVpnGatewaysMethodDescriptor;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class TargetVpnGatewayClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              aggregatedListTargetVpnGatewaysMethodDescriptor,
              deleteTargetVpnGatewayMethodDescriptor,
              getTargetVpnGatewayMethodDescriptor,
              insertTargetVpnGatewayMethodDescriptor,
              listTargetVpnGatewaysMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, TargetVpnGatewayStubSettings.getDefaultEndpoint());

  private static TargetVpnGatewayClient client;
  private static TargetVpnGatewaySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetVpnGatewaySettings.newBuilder()
            .setTransportChannelProvider(
                TargetVpnGatewaySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TargetVpnGatewayClient.create(clientSettings);
  }

  @After
  public void cleanUp() {
    mockService.reset();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListTargetVpnGatewaysTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetVpnGatewaysScopedList itemsItem = TargetVpnGatewaysScopedList.newBuilder().build();
    Map<String, TargetVpnGatewaysScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    TargetVpnGatewayAggregatedList expectedResponse =
        TargetVpnGatewayAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListTargetVpnGatewaysPagedResponse pagedListResponse =
        client.aggregatedListTargetVpnGateways(project);

    List<TargetVpnGatewaysScopedList> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getItemsMap().values().iterator().next(), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListTargetVpnGatewaysExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListTargetVpnGateways(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetVpnGatewayTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteTargetVpnGatewayTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetVpnGatewayName targetVpnGateway =
        ProjectRegionTargetVpnGatewayName.of("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");

    EmptyMessage actualResponse = client.deleteTargetVpnGatewayAsync(targetVpnGateway).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetVpnGatewayExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetVpnGatewayName targetVpnGateway =
          ProjectRegionTargetVpnGatewayName.of("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");

      client.deleteTargetVpnGatewayAsync(targetVpnGateway).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetVpnGatewayTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of("[PROJECT]", "[NETWORK]");
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    String status = "status-892481550";
    TargetVpnGateway expectedResponse =
        TargetVpnGateway.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setNetwork(network.toString())
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setStatus(status)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionTargetVpnGatewayName targetVpnGateway =
        ProjectRegionTargetVpnGatewayName.of("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");

    TargetVpnGateway actualResponse = client.getTargetVpnGateway(targetVpnGateway);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetVpnGatewayExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetVpnGatewayName targetVpnGateway =
          ProjectRegionTargetVpnGatewayName.of("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");

      client.getTargetVpnGateway(targetVpnGateway);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetVpnGatewayTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertTargetVpnGatewayTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    TargetVpnGateway targetVpnGatewayResource = TargetVpnGateway.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertTargetVpnGatewayAsync(region, targetVpnGatewayResource).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetVpnGatewayExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      TargetVpnGateway targetVpnGatewayResource = TargetVpnGateway.newBuilder().build();

      client.insertTargetVpnGatewayAsync(region, targetVpnGatewayResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetVpnGatewaysTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetVpnGateway itemsElement = TargetVpnGateway.newBuilder().build();
    List<TargetVpnGateway> items = Arrays.asList(itemsElement);
    TargetVpnGatewayList expectedResponse =
        TargetVpnGatewayList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListTargetVpnGatewaysPagedResponse pagedListResponse = client.listTargetVpnGateways(region);

    List<TargetVpnGateway> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetVpnGatewaysExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listTargetVpnGateways(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
