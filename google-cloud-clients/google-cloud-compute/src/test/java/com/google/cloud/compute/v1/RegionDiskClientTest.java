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

import static com.google.cloud.compute.v1.RegionDiskClient.ListRegionDisksPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.createSnapshotRegionDiskMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.deleteRegionDiskMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.getRegionDiskMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.insertRegionDiskMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.listRegionDisksMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.resizeRegionDiskMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.setLabelsRegionDiskMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub.testIamPermissionsRegionDiskMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.RegionDiskStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class RegionDiskClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              createSnapshotRegionDiskMethodDescriptor,
              deleteRegionDiskMethodDescriptor,
              getRegionDiskMethodDescriptor,
              insertRegionDiskMethodDescriptor,
              listRegionDisksMethodDescriptor,
              resizeRegionDiskMethodDescriptor,
              setLabelsRegionDiskMethodDescriptor,
              testIamPermissionsRegionDiskMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, RegionDiskStubSettings.getDefaultEndpoint());

  private static RegionDiskClient client;
  private static RegionDiskSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionDiskSettings.newBuilder()
            .setTransportChannelProvider(
                RegionDiskSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RegionDiskClient.create(clientSettings);
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
  public void createSnapshotRegionDiskTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSnapshotRegionDiskTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockRegionDisks.addResponse(resultOperation);

    ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");
    Snapshot snapshotResource = Snapshot.newBuilder().build();

    Void actualResponse = client.createSnapshotRegionDiskAsync(disk, snapshotResource).get();
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
  public void createSnapshotRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");
      Snapshot snapshotResource = Snapshot.newBuilder().build();

      client.createSnapshotRegionDiskAsync(disk, snapshotResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionDiskTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteRegionDiskTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockRegionDisks.addResponse(resultOperation);

    ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");

    Void actualResponse = client.deleteRegionDiskAsync(disk).get();
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
  public void deleteRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");

      client.deleteRegionDiskAsync(disk).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionDiskTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String labelFingerprint = "labelFingerprint714995737";
    String lastAttachTimestamp = "lastAttachTimestamp-2105323995";
    String lastDetachTimestamp = "lastDetachTimestamp-480399885";
    String name = "name3373707";
    String options = "options-1249474914";
    String physicalBlockSizeBytes = "physicalBlockSizeBytes-1190604793";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    String sizeGb = "sizeGb2105542105";
    String sourceImage = "sourceImage1661056055";
    String sourceImageId = "sourceImageId-2092155357";
    String sourceSnapshot = "sourceSnapshot-947679896";
    String sourceSnapshotId = "sourceSnapshotId-1511650478";
    String status = "status-892481550";
    String type = "type3575610";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Disk expectedResponse =
        Disk.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setLabelFingerprint(labelFingerprint)
            .setLastAttachTimestamp(lastAttachTimestamp)
            .setLastDetachTimestamp(lastDetachTimestamp)
            .setName(name)
            .setOptions(options)
            .setPhysicalBlockSizeBytes(physicalBlockSizeBytes)
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setSizeGb(sizeGb)
            .setSourceImage(sourceImage)
            .setSourceImageId(sourceImageId)
            .setSourceSnapshot(sourceSnapshot)
            .setSourceSnapshotId(sourceSnapshotId)
            .setStatus(status)
            .setType(type)
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");

    Disk actualResponse = client.getRegionDisk(disk);
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
  public void getRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");

      client.getRegionDisk(disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionDiskTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertRegionDiskTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockRegionDisks.addResponse(resultOperation);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    Disk diskResource = Disk.newBuilder().build();

    Void actualResponse = client.insertRegionDiskAsync(region, diskResource).get();
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
  public void insertRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      Disk diskResource = Disk.newBuilder().build();

      client.insertRegionDiskAsync(region, diskResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionDisksTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Disk itemsElement = Disk.newBuilder().build();
    List<Disk> items = Arrays.asList(itemsElement);
    DiskList expectedResponse =
        DiskList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListRegionDisksPagedResponse pagedListResponse = client.listRegionDisks(region);

    List<Disk> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listRegionDisksExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listRegionDisks(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeRegionDiskTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("resizeRegionDiskTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockRegionDisks.addResponse(resultOperation);

    ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");
    RegionDisksResizeRequest regionDisksResizeRequestResource =
        RegionDisksResizeRequest.newBuilder().build();

    Void actualResponse =
        client.resizeRegionDiskAsync(disk, regionDisksResizeRequestResource).get();
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
  public void resizeRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionDiskName disk = ProjectRegionDiskName.of("[PROJECT]", "[REGION]", "[DISK]");
      RegionDisksResizeRequest regionDisksResizeRequestResource =
          RegionDisksResizeRequest.newBuilder().build();

      client.resizeRegionDiskAsync(disk, regionDisksResizeRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsRegionDiskTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setLabelsRegionDiskTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockRegionDisks.addResponse(resultOperation);

    ProjectRegionDiskResourceName resource =
        ProjectRegionDiskResourceName.of("[PROJECT]", "[REGION]", "[RESOURCE]");
    RegionSetLabelsRequest regionSetLabelsRequestResource =
        RegionSetLabelsRequest.newBuilder().build();

    Void actualResponse =
        client.setLabelsRegionDiskAsync(resource, regionSetLabelsRequestResource).get();
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
  public void setLabelsRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionDiskResourceName resource =
          ProjectRegionDiskResourceName.of("[PROJECT]", "[REGION]", "[RESOURCE]");
      RegionSetLabelsRequest regionSetLabelsRequestResource =
          RegionSetLabelsRequest.newBuilder().build();

      client.setLabelsRegionDiskAsync(resource, regionSetLabelsRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsRegionDiskTest() {
    TestPermissionsResponse expectedResponse = TestPermissionsResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectRegionDiskResourceName resource =
        ProjectRegionDiskResourceName.of("[PROJECT]", "[REGION]", "[RESOURCE]");
    TestPermissionsRequest testPermissionsRequestResource =
        TestPermissionsRequest.newBuilder().build();

    TestPermissionsResponse actualResponse =
        client.testIamPermissionsRegionDisk(resource, testPermissionsRequestResource);
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
  public void testIamPermissionsRegionDiskExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionDiskResourceName resource =
          ProjectRegionDiskResourceName.of("[PROJECT]", "[REGION]", "[RESOURCE]");
      TestPermissionsRequest testPermissionsRequestResource =
          TestPermissionsRequest.newBuilder().build();

      client.testIamPermissionsRegionDisk(resource, testPermissionsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
