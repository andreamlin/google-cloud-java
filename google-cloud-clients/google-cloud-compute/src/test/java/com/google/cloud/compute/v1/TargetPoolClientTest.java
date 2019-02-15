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

import static com.google.cloud.compute.v1.TargetPoolClient.AggregatedListTargetPoolsPagedResponse;
import static com.google.cloud.compute.v1.TargetPoolClient.ListTargetPoolsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.addHealthCheckTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.addInstanceTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.aggregatedListTargetPoolsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.deleteTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.getHealthTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.getTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.insertTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.listTargetPoolsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.removeHealthCheckTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.removeInstanceTargetPoolMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub.setBackupTargetPoolMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.TargetPoolStubSettings;
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
public class TargetPoolClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              addHealthCheckTargetPoolMethodDescriptor,
              addInstanceTargetPoolMethodDescriptor,
              aggregatedListTargetPoolsMethodDescriptor,
              deleteTargetPoolMethodDescriptor,
              getTargetPoolMethodDescriptor,
              getHealthTargetPoolMethodDescriptor,
              insertTargetPoolMethodDescriptor,
              listTargetPoolsMethodDescriptor,
              removeHealthCheckTargetPoolMethodDescriptor,
              removeInstanceTargetPoolMethodDescriptor,
              setBackupTargetPoolMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, TargetPoolStubSettings.getDefaultEndpoint());

  private static TargetPoolClient client;
  private static TargetPoolSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetPoolSettings.newBuilder()
            .setTransportChannelProvider(
                TargetPoolSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TargetPoolClient.create(clientSettings);
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
  public void addHealthCheckTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("addHealthCheckTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource =
        TargetPoolsAddHealthCheckRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .addHealthCheckTargetPoolAsync(targetPool, targetPoolsAddHealthCheckRequestResource)
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
  public void addHealthCheckTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource =
          TargetPoolsAddHealthCheckRequest.newBuilder().build();

      client
          .addHealthCheckTargetPoolAsync(targetPool, targetPoolsAddHealthCheckRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void addInstanceTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("addInstanceTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequestResource =
        TargetPoolsAddInstanceRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client.addInstanceTargetPoolAsync(targetPool, targetPoolsAddInstanceRequestResource).get();
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
  public void addInstanceTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequestResource =
          TargetPoolsAddInstanceRequest.newBuilder().build();

      client.addInstanceTargetPoolAsync(targetPool, targetPoolsAddInstanceRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListTargetPoolsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetPoolsScopedList itemsItem = TargetPoolsScopedList.newBuilder().build();
    Map<String, TargetPoolsScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    TargetPoolAggregatedList expectedResponse =
        TargetPoolAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListTargetPoolsPagedResponse pagedListResponse =
        client.aggregatedListTargetPools(project);

    List<TargetPoolsScopedList> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void aggregatedListTargetPoolsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListTargetPools(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

    EmptyMessage actualResponse = client.deleteTargetPoolAsync(targetPool).get();
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
  public void deleteTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

      client.deleteTargetPoolAsync(targetPool).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetPoolTest() {
    String backupPool = "backupPool1119626361";
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    Float failoverRatio = -8.6107481E7F;
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    String sessionAffinity = "sessionAffinity1000759473";
    TargetPool expectedResponse =
        TargetPool.newBuilder()
            .setBackupPool(backupPool)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setFailoverRatio(failoverRatio)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setSessionAffinity(sessionAffinity)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

    TargetPool actualResponse = client.getTargetPool(targetPool);
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
  public void getTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");

      client.getTargetPool(targetPool);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthTargetPoolTest() {
    String kind = "kind3292052";
    TargetPoolInstanceHealth expectedResponse =
        TargetPoolInstanceHealth.newBuilder().setKind(kind).build();
    mockService.addResponse(expectedResponse);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    InstanceReference instanceReferenceResource = InstanceReference.newBuilder().build();

    TargetPoolInstanceHealth actualResponse =
        client.getHealthTargetPool(targetPool, instanceReferenceResource);
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
  public void getHealthTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      InstanceReference instanceReferenceResource = InstanceReference.newBuilder().build();

      client.getHealthTargetPool(targetPool, instanceReferenceResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    TargetPool targetPoolResource = TargetPool.newBuilder().build();

    EmptyMessage actualResponse = client.insertTargetPoolAsync(region, targetPoolResource).get();
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
  public void insertTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      TargetPool targetPoolResource = TargetPool.newBuilder().build();

      client.insertTargetPoolAsync(region, targetPoolResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetPoolsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetPool itemsElement = TargetPool.newBuilder().build();
    List<TargetPool> items = Arrays.asList(itemsElement);
    TargetPoolList expectedResponse =
        TargetPoolList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListTargetPoolsPagedResponse pagedListResponse = client.listTargetPools(region);

    List<TargetPool> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listTargetPoolsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listTargetPools(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void removeHealthCheckTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("removeHealthCheckTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource =
        TargetPoolsRemoveHealthCheckRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .removeHealthCheckTargetPoolAsync(
                targetPool, targetPoolsRemoveHealthCheckRequestResource)
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
  public void removeHealthCheckTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource =
          TargetPoolsRemoveHealthCheckRequest.newBuilder().build();

      client
          .removeHealthCheckTargetPoolAsync(targetPool, targetPoolsRemoveHealthCheckRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstanceTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("removeInstanceTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequestResource =
        TargetPoolsRemoveInstanceRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .removeInstanceTargetPoolAsync(targetPool, targetPoolsRemoveInstanceRequestResource)
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
  public void removeInstanceTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequestResource =
          TargetPoolsRemoveInstanceRequest.newBuilder().build();

      client
          .removeInstanceTargetPoolAsync(targetPool, targetPoolsRemoveInstanceRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setBackupTargetPoolTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setBackupTargetPoolTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectRegionTargetPoolName targetPool =
        ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
    Float failoverRatio = -8.6107481E7F;
    TargetReference targetReferenceResource = TargetReference.newBuilder().build();

    EmptyMessage actualResponse =
        client.setBackupTargetPoolAsync(targetPool, failoverRatio, targetReferenceResource).get();
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
  public void setBackupTargetPoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionTargetPoolName targetPool =
          ProjectRegionTargetPoolName.of("[PROJECT]", "[REGION]", "[TARGET_POOL]");
      Float failoverRatio = -8.6107481E7F;
      TargetReference targetReferenceResource = TargetReference.newBuilder().build();

      client.setBackupTargetPoolAsync(targetPool, failoverRatio, targetReferenceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
