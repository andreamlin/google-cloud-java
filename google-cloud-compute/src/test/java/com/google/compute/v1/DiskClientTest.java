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
package com.google.compute.v1;

import com.google.api.gax.httpjson.ApiMessage;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import static com.google.compute.v1.DiskClient.AggregatedListDisksPagedResponse;
import static com.google.compute.v1.DiskClient.ListDisksPagedResponse;
import com.google.compute.v1.stub.DiskStubSettings;
import static com.google.compute.v1.stub.HttpJsonDiskStub.aggregatedListDisksMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskStub.createSnapshotDiskMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskStub.deleteDiskMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskStub.getDiskMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskStub.insertDiskMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskStub.listDisksMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskStub.resizeDiskMethodDescriptor;
import com.google.protobuf.GeneratedMessageV3;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class DiskClientTest {
  private static final List<ApiMethodDescriptor<? extends ApiMessage, ? extends ApiMessage>> METHOD_DESCRIPTORS
      = ImmutableList.copyOf(Lists.<ApiMethodDescriptor<? extends ApiMessage, ? extends ApiMessage>>newArrayList(
              aggregatedListDisksMethodDescriptor,
              createSnapshotDiskMethodDescriptor,
              deleteDiskMethodDescriptor,
              getDiskMethodDescriptor,
              insertDiskMethodDescriptor,
              listDisksMethodDescriptor,
              resizeDiskMethodDescriptor
          ));
  private static final MockHttpService mockService
      = new MockHttpService(METHOD_DESCRIPTORS, DiskStubSettings.getDefaultEndpoint());
  private static DiskClient client;
  private static DiskSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        DiskSettings.newBuilder()
           .setTransportChannelProvider(
               DiskSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build()).build();
    client =
       DiskClient.create(clientSettings);
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
  public void aggregatedListDisksTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Disk disksElement = Disk.newBuilder().build();
    List<Disk> disks = Arrays.asList(disksElement);
    DisksScopedList items = DisksScopedList.newBuilder()
      .addAllDisks(disks)
      .build();
    DiskAggregatedList expectedResponse = DiskAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListDisksPagedResponse pagedListResponse = client.aggregatedListDisks(project);

    List<Disk> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().getDisksList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListDisksExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListDisks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createSnapshotDiskTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
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

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
    Snapshot snapshotResource = Snapshot.newBuilder().build();

    Operation actualResponse =
        client.createSnapshotDisk(disk, snapshotResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void createSnapshotDiskExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
      Snapshot snapshotResource = Snapshot.newBuilder().build();

      client.createSnapshotDisk(disk, snapshotResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDiskTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
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

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

    Operation actualResponse =
        client.deleteDisk(disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDiskExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

      client.deleteDisk(disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskTest() {
    String sizeGb = "sizeGb2105542105";
    String sourceSnapshotId = "sourceSnapshotId-1511650478";
    String sourceImageId = "sourceImageId-2092155357";
    String lastDetachTimestamp = "lastDetachTimestamp-480399885";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String sourceSnapshot = "sourceSnapshot-947679896";
    String type = "type3575610";
    String lastAttachTimestamp = "lastAttachTimestamp-2105323995";
    String selfLink = "selfLink-1691268851";
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String options = "options-1249474914";
    String id = "id3355";
    String sourceImage = "sourceImage1661056055";
    String status = "status-892481550";
    Disk expectedResponse = Disk.newBuilder()
      .setSizeGb(sizeGb)
      .setSourceSnapshotId(sourceSnapshotId)
      .setSourceImageId(sourceImageId)
      .setLastDetachTimestamp(lastDetachTimestamp)
      .setKind(kind)
      .setDescription(description)
      .setSourceSnapshot(sourceSnapshot)
      .setType(type)
      .setLastAttachTimestamp(lastAttachTimestamp)
      .setSelfLink(selfLink)
      .setZone(zone.toString())
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setOptions(options)
      .setId(id)
      .setSourceImage(sourceImage)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

    Disk actualResponse =
        client.getDisk(disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");

      client.getDisk(disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertDiskTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone2 = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
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
      .setZone(zone2.toString())
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

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String sourceImage = "sourceImage1661056055";
    Disk diskResource = Disk.newBuilder().build();

    Operation actualResponse =
        client.insertDisk(zone, sourceImage, diskResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertDiskExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      String sourceImage = "sourceImage1661056055";
      Disk diskResource = Disk.newBuilder().build();

      client.insertDisk(zone, sourceImage, diskResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listDisksTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Disk itemsElement = Disk.newBuilder().build();
    List<Disk> items = Arrays.asList(itemsElement);
    DiskList expectedResponse = DiskList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListDisksPagedResponse pagedListResponse = client.listDisks(zone);

    List<Disk> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listDisksExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listDisks(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeDiskTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
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

    DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
    DisksResizeRequest disksResizeRequestResource = DisksResizeRequest.newBuilder().build();

    Operation actualResponse =
        client.resizeDisk(disk, disksResizeRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void resizeDiskExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DiskName disk = DiskName.of("[PROJECT]", "[ZONE]", "[DISK]");
      DisksResizeRequest disksResizeRequestResource = DisksResizeRequest.newBuilder().build();

      client.resizeDisk(disk, disksResizeRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}