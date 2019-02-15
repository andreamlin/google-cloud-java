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

import static com.google.cloud.compute.v1.SnapshotClient.ListSnapshotsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.deleteSnapshotMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.getIamPolicySnapshotMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.getSnapshotMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.listSnapshotsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.setIamPolicySnapshotMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.setLabelsSnapshotMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub.testIamPermissionsSnapshotMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.SnapshotStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class SnapshotClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteSnapshotMethodDescriptor,
              getSnapshotMethodDescriptor,
              getIamPolicySnapshotMethodDescriptor,
              listSnapshotsMethodDescriptor,
              setIamPolicySnapshotMethodDescriptor,
              setLabelsSnapshotMethodDescriptor,
              testIamPermissionsSnapshotMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, SnapshotStubSettings.getDefaultEndpoint());

  private static SnapshotClient client;
  private static SnapshotSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        SnapshotSettings.newBuilder()
            .setTransportChannelProvider(
                SnapshotSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SnapshotClient.create(clientSettings);
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
  public void deleteSnapshotTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteSnapshotTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of("[PROJECT]", "[SNAPSHOT]");

    EmptyMessage actualResponse = client.deleteSnapshotAsync(snapshot).get();
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
  public void deleteSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of("[PROJECT]", "[SNAPSHOT]");

      client.deleteSnapshotAsync(snapshot).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSnapshotTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String diskSizeGb = "diskSizeGb-757478089";
    String id = "id3355";
    String kind = "kind3292052";
    String labelFingerprint = "labelFingerprint714995737";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    String sourceDisk = "sourceDisk-85117119";
    String sourceDiskId = "sourceDiskId-1693292839";
    String status = "status-892481550";
    String storageBytes = "storageBytes2035244455";
    String storageBytesStatus = "storageBytesStatus1027609994";
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setDiskSizeGb(diskSizeGb)
            .setId(id)
            .setKind(kind)
            .setLabelFingerprint(labelFingerprint)
            .setName(name)
            .setSelfLink(selfLink)
            .setSourceDisk(sourceDisk)
            .setSourceDiskId(sourceDiskId)
            .setStatus(status)
            .setStorageBytes(storageBytes)
            .setStorageBytesStatus(storageBytesStatus)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of("[PROJECT]", "[SNAPSHOT]");

    Snapshot actualResponse = client.getSnapshot(snapshot);
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
  public void getSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of("[PROJECT]", "[SNAPSHOT]");

      client.getSnapshot(snapshot);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getIamPolicySnapshotTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalSnapshotResourceName resource =
        ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");

    Policy actualResponse = client.getIamPolicySnapshot(resource);
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
  public void getIamPolicySnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSnapshotResourceName resource =
          ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");

      client.getIamPolicySnapshot(resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listSnapshotsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Snapshot itemsElement = Snapshot.newBuilder().build();
    List<Snapshot> items = Arrays.asList(itemsElement);
    SnapshotList expectedResponse =
        SnapshotList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListSnapshotsPagedResponse pagedListResponse = client.listSnapshots(project);

    List<Snapshot> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listSnapshotsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listSnapshots(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setIamPolicySnapshotTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalSnapshotResourceName resource =
        ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");
    GlobalSetPolicyRequest globalSetPolicyRequestResource =
        GlobalSetPolicyRequest.newBuilder().build();

    Policy actualResponse = client.setIamPolicySnapshot(resource, globalSetPolicyRequestResource);
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
  public void setIamPolicySnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSnapshotResourceName resource =
          ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");
      GlobalSetPolicyRequest globalSetPolicyRequestResource =
          GlobalSetPolicyRequest.newBuilder().build();

      client.setIamPolicySnapshot(resource, globalSetPolicyRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsSnapshotTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setLabelsSnapshotTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalSnapshotResourceName resource =
        ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");
    GlobalSetLabelsRequest globalSetLabelsRequestResource =
        GlobalSetLabelsRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client.setLabelsSnapshotAsync(resource, globalSetLabelsRequestResource).get();
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
  public void setLabelsSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSnapshotResourceName resource =
          ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");
      GlobalSetLabelsRequest globalSetLabelsRequestResource =
          GlobalSetLabelsRequest.newBuilder().build();

      client.setLabelsSnapshotAsync(resource, globalSetLabelsRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsSnapshotTest() {
    TestPermissionsResponse expectedResponse = TestPermissionsResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalSnapshotResourceName resource =
        ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");
    TestPermissionsRequest testPermissionsRequestResource =
        TestPermissionsRequest.newBuilder().build();

    TestPermissionsResponse actualResponse =
        client.testIamPermissionsSnapshot(resource, testPermissionsRequestResource);
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
  public void testIamPermissionsSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSnapshotResourceName resource =
          ProjectGlobalSnapshotResourceName.of("[PROJECT]", "[RESOURCE]");
      TestPermissionsRequest testPermissionsRequestResource =
          TestPermissionsRequest.newBuilder().build();

      client.testIamPermissionsSnapshot(resource, testPermissionsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
