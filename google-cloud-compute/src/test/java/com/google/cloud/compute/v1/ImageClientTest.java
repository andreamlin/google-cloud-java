/*
 * Copyright 2018 Google LLC
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
import static com.google.cloud.compute.v1.ImageClient.ListImagesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.deleteImageMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.deprecateImageMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.getFromFamilyImageMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.getImageMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.insertImageMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.listImagesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonImageStub.setLabelsImageMethodDescriptor;
import com.google.cloud.compute.v1.stub.ImageStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
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
public class ImageClientTest {

   private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS = ImmutableList.copyOf(
        Lists.<ApiMethodDescriptor>newArrayList(
          deleteImageMethodDescriptor,
          deprecateImageMethodDescriptor,
          getImageMethodDescriptor,
          getFromFamilyImageMethodDescriptor,
          insertImageMethodDescriptor,
          listImagesMethodDescriptor,
          setLabelsImageMethodDescriptor
        ));
  private static final MockHttpService mockService
      = new MockHttpService(METHOD_DESCRIPTORS, ImageStubSettings.getDefaultEndpoint());

  private static ImageClient client;
  private static ImageSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ImageSettings.newBuilder()
           .setTransportChannelProvider(
               ImageSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build())
           .setCredentialsProvider(NoCredentialsProvider.create())
           .build();
    client =
       ImageClient.create(clientSettings);
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
  public void deleteImageTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectImageName image = ProjectImageName.of("[PROJECT]", "[IMAGE]");
    String requestId = "requestId37109963";

    Operation actualResponse =
        client.deleteImage(image, requestId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteImageExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectImageName image = ProjectImageName.of("[PROJECT]", "[IMAGE]");
      String requestId = "requestId37109963";

      client.deleteImage(image, requestId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deprecateImageTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectImageName image = ProjectImageName.of("[PROJECT]", "[IMAGE]");
    String requestId = "requestId37109963";
    DeprecationStatus deprecationStatusResource = DeprecationStatus.newBuilder().build();

    Operation actualResponse =
        client.deprecateImage(image, requestId, deprecationStatusResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void deprecateImageExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectImageName image = ProjectImageName.of("[PROJECT]", "[IMAGE]");
      String requestId = "requestId37109963";
      DeprecationStatus deprecationStatusResource = DeprecationStatus.newBuilder().build();

      client.deprecateImage(image, requestId, deprecationStatusResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getImageTest() {
    String sourceSnapshotId = "sourceSnapshotId-1511650478";
    String description = "description-1724546052";
    String sourceSnapshot = "sourceSnapshot-947679896";
    String labelFingerprint = "labelFingerprint714995737";
    String creationTimestamp = "creationTimestamp567396278";
    String id = "id3355";
    String sourceDisk = "sourceDisk-85117119";
    String sourceDiskId = "sourceDiskId-1693292839";
    String sourceImageId = "sourceImageId-2092155357";
    String kind = "kind3292052";
    String selfLink = "selfLink-1691268851";
    String sourceType = "sourceType-84625186";
    String name = "name3373707";
    String archiveSizeBytes = "archiveSizeBytes-1766390198";
    String sourceImage = "sourceImage1661056055";
    ProjectFamilyName family = ProjectFamilyName.of("[PROJECT]", "[FAMILY]");
    String diskSizeGb = "diskSizeGb-757478089";
    String status = "status-892481550";
    Image expectedResponse = Image.newBuilder()
      .setSourceSnapshotId(sourceSnapshotId)
      .setDescription(description)
      .setSourceSnapshot(sourceSnapshot)
      .setLabelFingerprint(labelFingerprint)
      .setCreationTimestamp(creationTimestamp)
      .setId(id)
      .setSourceDisk(sourceDisk)
      .setSourceDiskId(sourceDiskId)
      .setSourceImageId(sourceImageId)
      .setKind(kind)
      .setSelfLink(selfLink)
      .setSourceType(sourceType)
      .setName(name)
      .setArchiveSizeBytes(archiveSizeBytes)
      .setSourceImage(sourceImage)
      .setFamily(family.toString())
      .setDiskSizeGb(diskSizeGb)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectImageName image = ProjectImageName.of("[PROJECT]", "[IMAGE]");

    Image actualResponse =
        client.getImage(image);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void getImageExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectImageName image = ProjectImageName.of("[PROJECT]", "[IMAGE]");

      client.getImage(image);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getFromFamilyImageTest() {
    String sourceSnapshotId = "sourceSnapshotId-1511650478";
    String description = "description-1724546052";
    String sourceSnapshot = "sourceSnapshot-947679896";
    String labelFingerprint = "labelFingerprint714995737";
    String creationTimestamp = "creationTimestamp567396278";
    String id = "id3355";
    String sourceDisk = "sourceDisk-85117119";
    String sourceDiskId = "sourceDiskId-1693292839";
    String sourceImageId = "sourceImageId-2092155357";
    String kind = "kind3292052";
    String selfLink = "selfLink-1691268851";
    String sourceType = "sourceType-84625186";
    String name = "name3373707";
    String archiveSizeBytes = "archiveSizeBytes-1766390198";
    String sourceImage = "sourceImage1661056055";
    ProjectFamilyName family2 = ProjectFamilyName.of("[PROJECT]", "[FAMILY]");
    String diskSizeGb = "diskSizeGb-757478089";
    String status = "status-892481550";
    Image expectedResponse = Image.newBuilder()
      .setSourceSnapshotId(sourceSnapshotId)
      .setDescription(description)
      .setSourceSnapshot(sourceSnapshot)
      .setLabelFingerprint(labelFingerprint)
      .setCreationTimestamp(creationTimestamp)
      .setId(id)
      .setSourceDisk(sourceDisk)
      .setSourceDiskId(sourceDiskId)
      .setSourceImageId(sourceImageId)
      .setKind(kind)
      .setSelfLink(selfLink)
      .setSourceType(sourceType)
      .setName(name)
      .setArchiveSizeBytes(archiveSizeBytes)
      .setSourceImage(sourceImage)
      .setFamily(family2.toString())
      .setDiskSizeGb(diskSizeGb)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectFamilyName family = ProjectFamilyName.of("[PROJECT]", "[FAMILY]");

    Image actualResponse =
        client.getFromFamilyImage(family);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void getFromFamilyImageExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectFamilyName family = ProjectFamilyName.of("[PROJECT]", "[FAMILY]");

      client.getFromFamilyImage(family);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertImageTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    Boolean forceCreate = true;
    String requestId = "requestId37109963";
    ProjectName project = ProjectName.of("[PROJECT]");
    Image imageResource = Image.newBuilder().build();

    Operation actualResponse =
        client.insertImage(forceCreate, requestId, project, imageResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void insertImageExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Boolean forceCreate = true;
      String requestId = "requestId37109963";
      ProjectName project = ProjectName.of("[PROJECT]");
      Image imageResource = Image.newBuilder().build();

      client.insertImage(forceCreate, requestId, project, imageResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listImagesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Image itemsElement = Image.newBuilder().build();
    List<Image> items = Arrays.asList(itemsElement);
    ImageList expectedResponse = ImageList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListImagesPagedResponse pagedListResponse = client.listImages(project);

    List<Image> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0),
        resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listImagesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listImages(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsImageTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectImageName resource = ProjectImageName.of("[PROJECT]", "[IMAGE]");
    GlobalSetLabelsRequest globalSetLabelsRequestResource = GlobalSetLabelsRequest.newBuilder().build();

    Operation actualResponse =
        client.setLabelsImage(resource, globalSetLabelsRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsImageExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectImageName resource = ProjectImageName.of("[PROJECT]", "[IMAGE]");
      GlobalSetLabelsRequest globalSetLabelsRequestResource = GlobalSetLabelsRequest.newBuilder().build();

      client.setLabelsImage(resource, globalSetLabelsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}