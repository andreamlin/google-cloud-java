// /*
//  * Copyright 2018 Google LLC
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  *     https://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */
// package com.google.cloud.simplecompute.v1;
//
// import com.google.api.gax.httpjson.MockHttpService;
// import com.google.api.gax.paging.PagedListResponse;
// import com.google.api.gax.rpc.ApiException;
// import com.google.api.gax.rpc.ApiExceptionFactory;
// import com.google.api.gax.rpc.InvalidArgumentException;
// import com.google.api.gax.rpc.StatusCode.Code;
// import com.google.api.gax.rpc.testing.FakeStatusCode;
// import static com.google.cloud.simplecompute.v1.AddressClient.ListAddressesPagedResponse;
// import com.google.common.collect.Lists;
// import com.google.protobuf.GeneratedMessageV3;
// import java.io.IOException;
// import java.io.UnsupportedEncodingException;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Objects;
// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;
//
// @javax.annotation.Generated("by GAPIC")
// public class AddressClientTest {
//   private static MockServiceHelper serviceHelper;
//   private AddressClient client;
//   private LocalChannelProvider channelProvider;
//
//   @BeforeClass
//   public static void startStaticServer() {
//     serviceHelper = new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList());
//     serviceHelper.start();
//   }
//
//   @AfterClass
//   public static void stopServer() {
//     serviceHelper.stop();
//   }
//
//   @Before
//   public void setUp() throws IOException {
//     serviceHelper.reset();
//     channelProvider = serviceHelper.createChannelProvider();
//     AddressSettings settings = AddressSettings.newBuilder()
//         .setTransportChannelProvider(channelProvider)
//         .setCredentialsProvider(NoCredentialsProvider.create())
//         .build();
//     client = AddressClient.create(settings);
//   }
//
//   @After
//   public void tearDown() throws Exception {
//     client.close();
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void deleteAddressTest() {
//     String httpErrorMessage = "httpErrorMessage1276263769";
//     String targetId = "targetId-815576439";
//     String kind = "kind3292052";
//     String description = "description-1724546052";
//     String statusMessage = "statusMessage-239442758";
//     String selfLink = "selfLink-1691268851";
//     String insertTime = "insertTime-103148397";
//     Integer httpErrorStatusCode = 1386087020;
//     String zone = "zone3744684";
//     String targetLink = "targetLink-2084812312";
//     String creationTimestamp = "creationTimestamp567396278";
//     String name = "name3373707";
//     Integer progress = 1001078227;
//     String operationType = "operationType-1432962286";
//     String startTime = "startTime-1573145462";
//     String endTime = "endTime1725551537";
//     String id = "id3355";
//     RegionName region = RegionName.of("[PROJECT]", "[REGION]");
//     String clientOperationId = "clientOperationId-239630617";
//     String user = "user3599307";
//     String status = "status-892481550";
//     Operation expectedResponse = Operation.newBuilder()
//       .setHttpErrorMessage(httpErrorMessage)
//       .setTargetId(targetId)
//       .setKind(kind)
//       .setDescription(description)
//       .setStatusMessage(statusMessage)
//       .setSelfLink(selfLink)
//       .setInsertTime(insertTime)
//       .setHttpErrorStatusCode(httpErrorStatusCode)
//       .setZone(zone)
//       .setTargetLink(targetLink)
//       .setCreationTimestamp(creationTimestamp)
//       .setName(name)
//       .setProgress(progress)
//       .setOperationType(operationType)
//       .setStartTime(startTime)
//       .setEndTime(endTime)
//       .setId(id)
//       .setRegion(region.toString())
//       .setClientOperationId(clientOperationId)
//       .setUser(user)
//       .setStatus(status)
//       .build();
//     mockAddresses.addResponse(expectedResponse);
//
//     AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
//
//     Operation actualResponse =
//         client.deleteAddress(address);
//     Assert.assertEquals(expectedResponse, actualResponse);
//
//     List<GeneratedMessageV3> actualRequests = mockAddresses.getRequests();
//     Assert.assertEquals(1, actualRequests.size());
//     DeleteAddressHttpRequest actualRequest = (DeleteAddressHttpRequest)actualRequests.get(0);
//
//     Assert.assertEquals(address, AddressName.parse(actualRequest.getAddress()));
//     Assert.assertTrue(
//         channelProvider.isHeaderSent(
//             ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
//             GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void deleteAddressExceptionTest() throws Exception {
//     StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
//     mockAddresses.addException(exception);
//
//     try {
//       AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
//
//       client.deleteAddress(address);
//       Assert.fail("No exception raised");
//     } catch (InvalidArgumentException e) {
//       // Expected exception
//     }
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void getAddressTest() {
//     AddressName address2 = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
//     String kind = "kind3292052";
//     String creationTimestamp = "creationTimestamp567396278";
//     String name = "name3373707";
//     String description = "description-1724546052";
//     String id = "id3355";
//     RegionName region = RegionName.of("[PROJECT]", "[REGION]");
//     String selfLink = "selfLink-1691268851";
//     String status = "status-892481550";
//     Address expectedResponse = Address.newBuilder()
//       .setAddress(address2.toString())
//       .setKind(kind)
//       .setCreationTimestamp(creationTimestamp)
//       .setName(name)
//       .setDescription(description)
//       .setId(id)
//       .setRegion(region.toString())
//       .setSelfLink(selfLink)
//       .setStatus(status)
//       .build();
//     mockAddresses.addResponse(expectedResponse);
//
//     AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
//
//     Address actualResponse =
//         client.getAddress(address);
//     Assert.assertEquals(expectedResponse, actualResponse);
//
//     List<GeneratedMessageV3> actualRequests = mockAddresses.getRequests();
//     Assert.assertEquals(1, actualRequests.size());
//     GetAddressHttpRequest actualRequest = (GetAddressHttpRequest)actualRequests.get(0);
//
//     Assert.assertEquals(address, AddressName.parse(actualRequest.getAddress()));
//     Assert.assertTrue(
//         channelProvider.isHeaderSent(
//             ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
//             GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void getAddressExceptionTest() throws Exception {
//     StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
//     mockAddresses.addException(exception);
//
//     try {
//       AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
//
//       client.getAddress(address);
//       Assert.fail("No exception raised");
//     } catch (InvalidArgumentException e) {
//       // Expected exception
//     }
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void insertAddressTest() {
//     String httpErrorMessage = "httpErrorMessage1276263769";
//     String targetId = "targetId-815576439";
//     String kind = "kind3292052";
//     String description = "description-1724546052";
//     String statusMessage = "statusMessage-239442758";
//     String selfLink = "selfLink-1691268851";
//     String insertTime = "insertTime-103148397";
//     Integer httpErrorStatusCode = 1386087020;
//     String zone = "zone3744684";
//     String targetLink = "targetLink-2084812312";
//     String creationTimestamp = "creationTimestamp567396278";
//     String name = "name3373707";
//     Integer progress = 1001078227;
//     String operationType = "operationType-1432962286";
//     String startTime = "startTime-1573145462";
//     String endTime = "endTime1725551537";
//     String id = "id3355";
//     RegionName region2 = RegionName.of("[PROJECT]", "[REGION]");
//     String clientOperationId = "clientOperationId-239630617";
//     String user = "user3599307";
//     String status = "status-892481550";
//     Operation expectedResponse = Operation.newBuilder()
//       .setHttpErrorMessage(httpErrorMessage)
//       .setTargetId(targetId)
//       .setKind(kind)
//       .setDescription(description)
//       .setStatusMessage(statusMessage)
//       .setSelfLink(selfLink)
//       .setInsertTime(insertTime)
//       .setHttpErrorStatusCode(httpErrorStatusCode)
//       .setZone(zone)
//       .setTargetLink(targetLink)
//       .setCreationTimestamp(creationTimestamp)
//       .setName(name)
//       .setProgress(progress)
//       .setOperationType(operationType)
//       .setStartTime(startTime)
//       .setEndTime(endTime)
//       .setId(id)
//       .setRegion(region2.toString())
//       .setClientOperationId(clientOperationId)
//       .setUser(user)
//       .setStatus(status)
//       .build();
//     mockAddresses.addResponse(expectedResponse);
//
//     RegionName region = RegionName.of("[PROJECT]", "[REGION]");
//     Address address = Address.newBuilder().build();
//
//     Operation actualResponse =
//         client.insertAddress(region, address);
//     Assert.assertEquals(expectedResponse, actualResponse);
//
//     List<GeneratedMessageV3> actualRequests = mockAddresses.getRequests();
//     Assert.assertEquals(1, actualRequests.size());
//     InsertAddressHttpRequest actualRequest = (InsertAddressHttpRequest)actualRequests.get(0);
//
//     Assert.assertEquals(region, RegionName.parse(actualRequest.getRegion()));
//     Assert.assertEquals(address, actualRequest.getAddressResource());
//     Assert.assertTrue(
//         channelProvider.isHeaderSent(
//             ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
//             GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void insertAddressExceptionTest() throws Exception {
//     StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
//     mockAddresses.addException(exception);
//
//     try {
//       RegionName region = RegionName.of("[PROJECT]", "[REGION]");
//       Address address = Address.newBuilder().build();
//
//       client.insertAddress(region, address);
//       Assert.fail("No exception raised");
//     } catch (InvalidArgumentException e) {
//       // Expected exception
//     }
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void listAddressesTest() {
//     String kind = "kind3292052";
//     String nextPageToken = "";
//     String id = "id3355";
//     String selfLink = "selfLink-1691268851";
//     Address itemsElement = Address.newBuilder().build();
//     List<Address> items = Arrays.asList(itemsElement);
//     AddressList expectedResponse = AddressList.newBuilder()
//       .setKind(kind)
//       .setNextPageToken(nextPageToken)
//       .setId(id)
//       .setSelfLink(selfLink)
//       .addAllItems(items)
//       .build();
//     mockAddresses.addResponse(expectedResponse);
//
//     RegionName region = RegionName.of("[PROJECT]", "[REGION]");
//
//     ListAddressesPagedResponse pagedListResponse = client.listAddresses(region);
//
//     List<Address> resources = Lists.newArrayList(pagedListResponse.iterateAll());
//     Assert.assertEquals(1, resources.size());
//     Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));
//
//     List<GeneratedMessageV3> actualRequests = mockAddresses.getRequests();
//     Assert.assertEquals(1, actualRequests.size());
//     ListAddressesHttpRequest actualRequest = (ListAddressesHttpRequest)actualRequests.get(0);
//
//     Assert.assertEquals(region, RegionName.parse(actualRequest.getRegion()));
//     Assert.assertTrue(
//         channelProvider.isHeaderSent(
//             ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
//             GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
//   }
//
//   @Test
//   @SuppressWarnings("all")
//   public void listAddressesExceptionTest() throws Exception {
//     StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
//     mockAddresses.addException(exception);
//
//     try {
//       RegionName region = RegionName.of("[PROJECT]", "[REGION]");
//
//       client.listAddresses(region);
//       Assert.fail("No exception raised");
//     } catch (InvalidArgumentException e) {
//       // Expected exception
//     }
//   }
//
// }