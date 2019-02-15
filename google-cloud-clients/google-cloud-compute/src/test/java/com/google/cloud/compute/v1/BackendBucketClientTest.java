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

import static com.google.cloud.compute.v1.BackendBucketClient.ListBackendBucketsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.addSignedUrlKeyBackendBucketMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.deleteBackendBucketMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.deleteSignedUrlKeyBackendBucketMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.getBackendBucketMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.insertBackendBucketMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.listBackendBucketsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.patchBackendBucketMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub.updateBackendBucketMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.BackendBucketStubSettings;
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
public class BackendBucketClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              addSignedUrlKeyBackendBucketMethodDescriptor,
              deleteBackendBucketMethodDescriptor,
              deleteSignedUrlKeyBackendBucketMethodDescriptor,
              getBackendBucketMethodDescriptor,
              insertBackendBucketMethodDescriptor,
              listBackendBucketsMethodDescriptor,
              patchBackendBucketMethodDescriptor,
              updateBackendBucketMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, BackendBucketStubSettings.getDefaultEndpoint());

  private static BackendBucketClient client;
  private static BackendBucketSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        BackendBucketSettings.newBuilder()
            .setTransportChannelProvider(
                BackendBucketSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BackendBucketClient.create(clientSettings);
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
  public void addSignedUrlKeyBackendBucketTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("addSignedUrlKeyBackendBucketTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectGlobalBackendBucketName backendBucket =
        ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
    SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();

    EmptyMessage actualResponse =
        client.addSignedUrlKeyBackendBucketAsync(backendBucket, signedUrlKeyResource).get();
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
  public void addSignedUrlKeyBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendBucketName backendBucket =
          ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
      SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();

      client.addSignedUrlKeyBackendBucketAsync(backendBucket, signedUrlKeyResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteBackendBucketTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteBackendBucketTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalBackendBucketName backendBucket =
        ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");

    EmptyMessage actualResponse = client.deleteBackendBucketAsync(backendBucket).get();
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
  public void deleteBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendBucketName backendBucket =
          ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");

      client.deleteBackendBucketAsync(backendBucket).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSignedUrlKeyBackendBucketTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteSignedUrlKeyBackendBucketTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectGlobalBackendBucketName backendBucket =
        ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
    String keyName = "keyName500938859";

    EmptyMessage actualResponse =
        client.deleteSignedUrlKeyBackendBucketAsync(backendBucket, keyName).get();
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
  public void deleteSignedUrlKeyBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendBucketName backendBucket =
          ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
      String keyName = "keyName500938859";

      client.deleteSignedUrlKeyBackendBucketAsync(backendBucket, keyName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getBackendBucketTest() {
    String bucketName = "bucketName283610048";
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    Boolean enableCdn = false;
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    BackendBucket expectedResponse =
        BackendBucket.newBuilder()
            .setBucketName(bucketName)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setEnableCdn(enableCdn)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalBackendBucketName backendBucket =
        ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");

    BackendBucket actualResponse = client.getBackendBucket(backendBucket);
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
  public void getBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendBucketName backendBucket =
          ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");

      client.getBackendBucket(backendBucket);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertBackendBucketTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertBackendBucketTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    BackendBucket backendBucketResource = BackendBucket.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertBackendBucketAsync(project, backendBucketResource).get();
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
  public void insertBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      BackendBucket backendBucketResource = BackendBucket.newBuilder().build();

      client.insertBackendBucketAsync(project, backendBucketResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listBackendBucketsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    BackendBucket itemsElement = BackendBucket.newBuilder().build();
    List<BackendBucket> items = Arrays.asList(itemsElement);
    BackendBucketList expectedResponse =
        BackendBucketList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListBackendBucketsPagedResponse pagedListResponse = client.listBackendBuckets(project);

    List<BackendBucket> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listBackendBucketsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listBackendBuckets(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchBackendBucketTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchBackendBucketTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalBackendBucketName backendBucket =
        ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
    BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.patchBackendBucketAsync(backendBucket, backendBucketResource, fieldMask).get();
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
  public void patchBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendBucketName backendBucket =
          ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
      BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchBackendBucketAsync(backendBucket, backendBucketResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateBackendBucketTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("updateBackendBucketTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalBackendBucketName backendBucket =
        ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
    BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.updateBackendBucketAsync(backendBucket, backendBucketResource, fieldMask).get();
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
  public void updateBackendBucketExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendBucketName backendBucket =
          ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
      BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateBackendBucketAsync(backendBucket, backendBucketResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
