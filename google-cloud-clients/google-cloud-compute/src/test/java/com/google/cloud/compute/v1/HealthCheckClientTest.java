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

import static com.google.cloud.compute.v1.HealthCheckClient.ListHealthChecksPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub.deleteHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub.getHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub.insertHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub.listHealthChecksMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub.patchHealthCheckMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub.updateHealthCheckMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.HealthCheckStubSettings;
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
public class HealthCheckClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteHealthCheckMethodDescriptor,
              getHealthCheckMethodDescriptor,
              insertHealthCheckMethodDescriptor,
              listHealthChecksMethodDescriptor,
              patchHealthCheckMethodDescriptor,
              updateHealthCheckMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, HealthCheckStubSettings.getDefaultEndpoint());

  private static HealthCheckClient client;
  private static HealthCheckSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        HealthCheckSettings.newBuilder()
            .setTransportChannelProvider(
                HealthCheckSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = HealthCheckClient.create(clientSettings);
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
  public void deleteHealthCheckTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteHealthCheckTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalHealthCheckName healthCheck =
        ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");

    EmptyMessage actualResponse = client.deleteHealthCheckAsync(healthCheck).get();
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
  public void deleteHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHealthCheckName healthCheck =
          ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");

      client.deleteHealthCheckAsync(healthCheck).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthCheckTest() {
    Integer checkIntervalSec = 345561006;
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    Integer healthyThreshold = 133658551;
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    Integer timeoutSec = 2067488653;
    String type = "type3575610";
    Integer unhealthyThreshold = 1838571216;
    HealthCheck expectedResponse =
        HealthCheck.newBuilder()
            .setCheckIntervalSec(checkIntervalSec)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setHealthyThreshold(healthyThreshold)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .setTimeoutSec(timeoutSec)
            .setType(type)
            .setUnhealthyThreshold(unhealthyThreshold)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalHealthCheckName healthCheck =
        ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");

    HealthCheck actualResponse = client.getHealthCheck(healthCheck);
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
  public void getHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHealthCheckName healthCheck =
          ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");

      client.getHealthCheck(healthCheck);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertHealthCheckTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertHealthCheckTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    HealthCheck healthCheckResource = HealthCheck.newBuilder().build();

    EmptyMessage actualResponse = client.insertHealthCheckAsync(project, healthCheckResource).get();
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
  public void insertHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      HealthCheck healthCheckResource = HealthCheck.newBuilder().build();

      client.insertHealthCheckAsync(project, healthCheckResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listHealthChecksTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    HealthCheck itemsElement = HealthCheck.newBuilder().build();
    List<HealthCheck> items = Arrays.asList(itemsElement);
    HealthCheckList expectedResponse =
        HealthCheckList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListHealthChecksPagedResponse pagedListResponse = client.listHealthChecks(project);

    List<HealthCheck> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listHealthChecksExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listHealthChecks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchHealthCheckTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchHealthCheckTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalHealthCheckName healthCheck =
        ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
    HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.patchHealthCheckAsync(healthCheck, healthCheckResource, fieldMask).get();
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
  public void patchHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHealthCheckName healthCheck =
          ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
      HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchHealthCheckAsync(healthCheck, healthCheckResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateHealthCheckTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("updateHealthCheckTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalHealthCheckName healthCheck =
        ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
    HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.updateHealthCheckAsync(healthCheck, healthCheckResource, fieldMask).get();
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
  public void updateHealthCheckExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalHealthCheckName healthCheck =
          ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
      HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateHealthCheckAsync(healthCheck, healthCheckResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
