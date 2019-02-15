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

import static com.google.cloud.compute.v1.RegionAutoscalerClient.ListRegionAutoscalersPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub.deleteRegionAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub.getRegionAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub.insertRegionAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub.listRegionAutoscalersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub.patchRegionAutoscalerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub.updateRegionAutoscalerMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class RegionAutoscalerClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteRegionAutoscalerMethodDescriptor,
              getRegionAutoscalerMethodDescriptor,
              insertRegionAutoscalerMethodDescriptor,
              listRegionAutoscalersMethodDescriptor,
              patchRegionAutoscalerMethodDescriptor,
              updateRegionAutoscalerMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, RegionAutoscalerStubSettings.getDefaultEndpoint());

  private static RegionAutoscalerClient client;
  private static RegionAutoscalerSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionAutoscalerSettings.newBuilder()
            .setTransportChannelProvider(
                RegionAutoscalerSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RegionAutoscalerClient.create(clientSettings);
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
  public void deleteRegionAutoscalerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteRegionAutoscalerTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionAutoscalerName autoscaler =
        ProjectRegionAutoscalerName.of("[PROJECT]", "[REGION]", "[AUTOSCALER]");

    EmptyMessage actualResponse = client.deleteRegionAutoscalerAsync(autoscaler).get();
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
  public void deleteRegionAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionAutoscalerName autoscaler =
          ProjectRegionAutoscalerName.of("[PROJECT]", "[REGION]", "[AUTOSCALER]");

      client.deleteRegionAutoscalerAsync(autoscaler).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionAutoscalerTest() {
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

    ProjectRegionAutoscalerName autoscaler =
        ProjectRegionAutoscalerName.of("[PROJECT]", "[REGION]", "[AUTOSCALER]");

    Autoscaler actualResponse = client.getRegionAutoscaler(autoscaler);
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
  public void getRegionAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionAutoscalerName autoscaler =
          ProjectRegionAutoscalerName.of("[PROJECT]", "[REGION]", "[AUTOSCALER]");

      client.getRegionAutoscaler(autoscaler);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionAutoscalerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertRegionAutoscalerTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    Autoscaler autoscalerResource = Autoscaler.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertRegionAutoscalerAsync(region, autoscalerResource).get();
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
  public void insertRegionAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      Autoscaler autoscalerResource = Autoscaler.newBuilder().build();

      client.insertRegionAutoscalerAsync(region, autoscalerResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionAutoscalersTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Autoscaler itemsElement = Autoscaler.newBuilder().build();
    List<Autoscaler> items = Arrays.asList(itemsElement);
    RegionAutoscalerList expectedResponse =
        RegionAutoscalerList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListRegionAutoscalersPagedResponse pagedListResponse = client.listRegionAutoscalers(region);

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
  public void listRegionAutoscalersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listRegionAutoscalers(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchRegionAutoscalerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchRegionAutoscalerTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    String autoscaler = "autoscaler517258967";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.patchRegionAutoscalerAsync(autoscaler, region, autoscalerResource, fieldMask).get();
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
  public void patchRegionAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String autoscaler = "autoscaler517258967";
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchRegionAutoscalerAsync(autoscaler, region, autoscalerResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateRegionAutoscalerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("updateRegionAutoscalerTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    String autoscaler = "autoscaler517258967";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.updateRegionAutoscalerAsync(autoscaler, region, autoscalerResource, fieldMask).get();
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
  public void updateRegionAutoscalerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String autoscaler = "autoscaler517258967";
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateRegionAutoscalerAsync(autoscaler, region, autoscalerResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
