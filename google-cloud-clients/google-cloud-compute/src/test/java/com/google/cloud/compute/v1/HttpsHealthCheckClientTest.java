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

import static com.google.cloud.compute.v1.HttpsHealthCheckClient.ListHttpsHealthChecksPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub.deleteHttpsHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub.getHttpsHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub.insertHttpsHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub.listHttpsHealthChecksMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub.patchHttpsHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub.updateHttpsHealthCheckMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings;
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
public class HttpsHealthCheckClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteHttpsHealthCheckMethodDescriptor,
              getHttpsHealthCheckMethodDescriptor,
              insertHttpsHealthCheckMethodDescriptor,
              listHttpsHealthChecksMethodDescriptor,
              patchHttpsHealthCheckMethodDescriptor,
              updateHttpsHealthCheckMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, HttpsHealthCheckStubSettings.getDefaultEndpoint());

  private static HttpsHealthCheckClient client;
  private static HttpsHealthCheckSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        HttpsHealthCheckSettings.newBuilder()
            .setTransportChannelProvider(
                HttpsHealthCheckSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = HttpsHealthCheckClient.create(clientSettings);
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
  public void deleteHttpsHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteHttpsHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpsHealthChecks.addResponse(resultOperation);

    ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
        ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");

    Void actualResponse = client.deleteHttpsHealthCheckAsync(httpsHealthCheck).get();
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
  public void deleteHttpsHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
          ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");

      client.deleteHttpsHealthCheckAsync(httpsHealthCheck).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHttpsHealthCheckTest() {
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
    HttpsHealthCheck2 expectedResponse =
        HttpsHealthCheck2.newBuilder()
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

    ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
        ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");

    HttpsHealthCheck2 actualResponse = client.getHttpsHealthCheck(httpsHealthCheck);
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
  public void getHttpsHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
          ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");

      client.getHttpsHealthCheck(httpsHealthCheck);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertHttpsHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertHttpsHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpsHealthChecks.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();

    Void actualResponse =
        client.insertHttpsHealthCheckAsync(project, httpsHealthCheckResource).get();
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
  public void insertHttpsHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();

      client.insertHttpsHealthCheckAsync(project, httpsHealthCheckResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listHttpsHealthChecksTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    HttpsHealthCheck2 itemsElement = HttpsHealthCheck2.newBuilder().build();
    List<HttpsHealthCheck2> items = Arrays.asList(itemsElement);
    HttpsHealthCheckList expectedResponse =
        HttpsHealthCheckList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListHttpsHealthChecksPagedResponse pagedListResponse = client.listHttpsHealthChecks(project);

    List<HttpsHealthCheck2> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listHttpsHealthChecksExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listHttpsHealthChecks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchHttpsHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("patchHttpsHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpsHealthChecks.addResponse(resultOperation);

    ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
        ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");
    HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client
            .patchHttpsHealthCheckAsync(httpsHealthCheck, httpsHealthCheckResource, fieldMask)
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
  public void patchHttpsHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
          ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");
      HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client
          .patchHttpsHealthCheckAsync(httpsHealthCheck, httpsHealthCheckResource, fieldMask)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateHttpsHealthCheckTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateHttpsHealthCheckTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockHttpsHealthChecks.addResponse(resultOperation);

    ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
        ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");
    HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client
            .updateHttpsHealthCheckAsync(httpsHealthCheck, httpsHealthCheckResource, fieldMask)
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
  public void updateHttpsHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHttpsHealthCheckName httpsHealthCheck =
          ProjectGlobalHttpsHealthCheckName.of("[PROJECT]", "[HTTPS_HEALTH_CHECK]");
      HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client
          .updateHttpsHealthCheckAsync(httpsHealthCheck, httpsHealthCheckResource, fieldMask)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
