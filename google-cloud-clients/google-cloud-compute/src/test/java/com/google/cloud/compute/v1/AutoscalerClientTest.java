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

import static com.google.cloud.compute.v1.AutoscalerClient.AggregatedListAutoscalersPagedResponse;
import static com.google.cloud.compute.v1.AutoscalerClient.ListAutoscalersPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.aggregatedListAutoscalersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.deleteAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.getAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.insertAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.listAutoscalersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.patchAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub.updateAutoscalerMethodDescriptor;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.compute.v1.stub.AutoscalerStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class AutoscalerClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              aggregatedListAutoscalersMethodDescriptor,
              deleteAutoscalerMethodDescriptor,
              getAutoscalerMethodDescriptor,
              insertAutoscalerMethodDescriptor,
              listAutoscalersMethodDescriptor,
              patchAutoscalerMethodDescriptor,
              updateAutoscalerMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, AutoscalerStubSettings.getDefaultEndpoint());

  private static AutoscalerClient client;
  private static AutoscalerSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        AutoscalerSettings.newBuilder()
            .setTransportChannelProvider(
                AutoscalerSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AutoscalerClient.create(clientSettings);
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
  public void aggregatedListAutoscalersTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    AutoscalersScopedList itemsItem = AutoscalersScopedList.newBuilder().build();
    Map<String, AutoscalersScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    AutoscalerAggregatedList expectedResponse =
        AutoscalerAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListAutoscalersPagedResponse pagedListResponse =
        client.aggregatedListAutoscalers(project);

    List<AutoscalersScopedList> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void aggregatedListAutoscalersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListAutoscalers(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAutoscalerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteAutoscalerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoscalers.addResponse(resultOperation);

    ProjectZoneAutoscalerName autoscaler =
        ProjectZoneAutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

    Void actualResponse = client.deleteAutoscalerAsync(autoscaler).get();
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
  public void deleteAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneAutoscalerName autoscaler =
          ProjectZoneAutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

      client.deleteAutoscalerAsync(autoscaler).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getAutoscalerTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    String status = "status-892481550";
    String target = "target-880905839";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Autoscaler expectedResponse =
        Autoscaler.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setStatus(status)
            .setTarget(target)
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneAutoscalerName autoscaler =
        ProjectZoneAutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

    Autoscaler actualResponse = client.getAutoscaler(autoscaler);
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
  public void getAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneAutoscalerName autoscaler =
          ProjectZoneAutoscalerName.of("[PROJECT]", "[ZONE]", "[AUTOSCALER]");

      client.getAutoscaler(autoscaler);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertAutoscalerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertAutoscalerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoscalers.addResponse(resultOperation);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Autoscaler autoscalerResource = Autoscaler.newBuilder().build();

    Void actualResponse = client.insertAutoscalerAsync(zone, autoscalerResource).get();
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
  public void insertAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      Autoscaler autoscalerResource = Autoscaler.newBuilder().build();

      client.insertAutoscalerAsync(zone, autoscalerResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listAutoscalersTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Autoscaler itemsElement = Autoscaler.newBuilder().build();
    List<Autoscaler> items = Arrays.asList(itemsElement);
    AutoscalerList expectedResponse =
        AutoscalerList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

    ListAutoscalersPagedResponse pagedListResponse = client.listAutoscalers(zone);

    List<Autoscaler> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listAutoscalersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

      client.listAutoscalers(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchAutoscalerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("patchAutoscalerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoscalers.addResponse(resultOperation);

    String autoscaler = "autoscaler517258967";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client.patchAutoscalerAsync(autoscaler, zone, autoscalerResource, fieldMask).get();
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
  public void patchAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String autoscaler = "autoscaler517258967";
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchAutoscalerAsync(autoscaler, zone, autoscalerResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateAutoscalerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateAutoscalerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoscalers.addResponse(resultOperation);

    String autoscaler = "autoscaler517258967";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client.updateAutoscalerAsync(autoscaler, zone, autoscalerResource, fieldMask).get();
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
  public void updateAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String autoscaler = "autoscaler517258967";
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateAutoscalerAsync(autoscaler, zone, autoscalerResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
