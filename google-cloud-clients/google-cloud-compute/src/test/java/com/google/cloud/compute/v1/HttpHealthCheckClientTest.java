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

import static com.google.cloud.compute.v1.HttpHealthCheckClient.ListHttpHealthChecksPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub.deleteHttpHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub.getHttpHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub.insertHttpHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub.listHttpHealthChecksMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub.patchHttpHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub.updateHttpHealthCheckMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class HttpHealthCheckClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteHttpHealthCheckMethodDescriptor,
              getHttpHealthCheckMethodDescriptor,
              insertHttpHealthCheckMethodDescriptor,
              listHttpHealthChecksMethodDescriptor,
              patchHttpHealthCheckMethodDescriptor,
              updateHttpHealthCheckMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, HttpHealthCheckStubSettings.getDefaultEndpoint());

  private static HttpHealthCheckClient client;
  private static HttpHealthCheckSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        HttpHealthCheckSettings.newBuilder()
            .setTransportChannelProvider(
                HttpHealthCheckSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = HttpHealthCheckClient.create(clientSettings);
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
  public void deleteHttpHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteHttpHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpHealthChecks.addResponse(resultOperation);

    ProjectGlobalHttpHealthCheckName httpHealthCheck =
        ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");

    Void actualResponse = client.deleteHttpHealthCheckAsync(httpHealthCheck).get();
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
  public void deleteHttpHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpHealthCheckName httpHealthCheck =
          ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");

      client.deleteHttpHealthCheckAsync(httpHealthCheck).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHttpHealthCheckTest() {
    Integer checkIntervalSec = 345561006;
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    Integer healthyThreshold = 133658551;
    String host = "host3208616";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    Integer port = 3446913;
    String requestPath = "requestPath1303145429";
    String selfLink = "selfLink-1691268851";
    Integer timeoutSec = 2067488653;
    Integer unhealthyThreshold = 1838571216;
    HttpHealthCheck2 expectedResponse =
        HttpHealthCheck2.newBuilder()
            .setCheckIntervalSec(checkIntervalSec)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setHealthyThreshold(healthyThreshold)
            .setHost(host)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setPort(port)
            .setRequestPath(requestPath)
            .setSelfLink(selfLink)
            .setTimeoutSec(timeoutSec)
            .setUnhealthyThreshold(unhealthyThreshold)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalHttpHealthCheckName httpHealthCheck =
        ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");

    HttpHealthCheck2 actualResponse = client.getHttpHealthCheck(httpHealthCheck);
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
  public void getHttpHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpHealthCheckName httpHealthCheck =
          ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");

      client.getHttpHealthCheck(httpHealthCheck);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertHttpHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertHttpHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpHealthChecks.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();

    Void actualResponse = client.insertHttpHealthCheckAsync(project, httpHealthCheckResource).get();
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
  public void insertHttpHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();

      client.insertHttpHealthCheckAsync(project, httpHealthCheckResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listHttpHealthChecksTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    HttpHealthCheck2 itemsElement = HttpHealthCheck2.newBuilder().build();
    List<HttpHealthCheck2> items = Arrays.asList(itemsElement);
    HttpHealthCheckList expectedResponse =
        HttpHealthCheckList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListHttpHealthChecksPagedResponse pagedListResponse = client.listHttpHealthChecks(project);

    List<HttpHealthCheck2> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listHttpHealthChecksExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listHttpHealthChecks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchHttpHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("patchHttpHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpHealthChecks.addResponse(resultOperation);

    ProjectGlobalHttpHealthCheckName httpHealthCheck =
        ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
    HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client.patchHttpHealthCheckAsync(httpHealthCheck, httpHealthCheckResource, fieldMask).get();
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
  public void patchHttpHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpHealthCheckName httpHealthCheck =
          ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
      HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchHttpHealthCheckAsync(httpHealthCheck, httpHealthCheckResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateHttpHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateHttpHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpHealthChecks.addResponse(resultOperation);

    ProjectGlobalHttpHealthCheckName httpHealthCheck =
        ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
    HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client
            .updateHttpHealthCheckAsync(httpHealthCheck, httpHealthCheckResource, fieldMask)
            .get();
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
  public void updateHttpHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpHealthCheckName httpHealthCheck =
          ProjectGlobalHttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
      HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateHttpHealthCheckAsync(httpHealthCheck, httpHealthCheckResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
