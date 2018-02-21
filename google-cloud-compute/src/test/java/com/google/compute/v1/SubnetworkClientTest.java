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

import com.google.api.gax.httpjson.MockHttpService;
import com.google.api.gax.paging.PagedListResponse;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.common.collect.Lists;
import static com.google.compute.v1.SubnetworkClient.AggregatedListSubnetworksPagedResponse;
import static com.google.compute.v1.SubnetworkClient.ListSubnetworksPagedResponse;
import static com.google.compute.v1.stub.HttpJsonSubnetworkStub.aggregatedListSubnetworksMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonSubnetworkStub.deleteSubnetworkMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonSubnetworkStub.expandIpCidrRangeSubnetworkMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonSubnetworkStub.getSubnetworkMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonSubnetworkStub.insertSubnetworkMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonSubnetworkStub.listSubnetworksMethodDescriptor;
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
public class SubnetworkClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static SubnetworkClient client;
  private static SubnetworkSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        SubnetworkSettings.newBuilder()
           .setTransportChannelProvider(
               SubnetworkSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       SubnetworkClient.create(clientSettings);
  }

  @After
  public void cleanUp() {
    MOCK_SERVICE.reset();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListSubnetworksTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Subnetwork subnetworks = Subnetwork.newBuilder().build();
    SubnetworksScopedList items = SubnetworksScopedList.newBuilder()
      .addAllSubnetworks(subnetworks)
      .build();
    SubnetworkAggregatedList expectedResponse = SubnetworkAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(aggregatedListSubnetworksMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListSubnetworksPagedResponse pagedListResponse = client.aggregatedListSubnetworks(project);

    List<Subnetwork> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSubnetworks().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListSubnetworksExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListSubnetworksMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListSubnetworks(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSubnetworkTest() {
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
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(deleteSubnetworkMethodDescriptor);

    SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");

    Operation actualResponse =
        client.deleteSubnetwork(subnetwork);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSubnetworkExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteSubnetworkMethodDescriptor);

    try {
      SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");

      client.deleteSubnetwork(subnetwork);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void expandIpCidrRangeSubnetworkTest() {
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
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(expandIpCidrRangeSubnetworkMethodDescriptor);

    SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
    SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequest = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();

    Operation actualResponse =
        client.expandIpCidrRangeSubnetwork(subnetwork, subnetworksExpandIpCidrRangeRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void expandIpCidrRangeSubnetworkExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(expandIpCidrRangeSubnetworkMethodDescriptor);

    try {
      SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
      SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequest = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();

      client.expandIpCidrRangeSubnetwork(subnetwork, subnetworksExpandIpCidrRangeRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSubnetworkTest() {
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String gatewayAddress = "gatewayAddress-77003527";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    String ipCidrRange = "ipCidrRange-2049366326";
    NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");
    String selfLink = "selfLink-1691268851";
    Subnetwork expectedResponse = Subnetwork.newBuilder()
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setGatewayAddress(gatewayAddress)
      .setId(id)
      .setRegion(region.toString())
      .setIpCidrRange(ipCidrRange)
      .setNetwork(network.toString())
      .setSelfLink(selfLink)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getSubnetworkMethodDescriptor);

    SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");

    Subnetwork actualResponse =
        client.getSubnetwork(subnetwork);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getSubnetworkExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getSubnetworkMethodDescriptor);

    try {
      SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");

      client.getSubnetwork(subnetwork);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertSubnetworkTest() {
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
    RegionName region2 = RegionName.of("[PROJECT]", "[REGION]");
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
      .setRegion(region2.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(insertSubnetworkMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    Subnetwork subnetwork = Subnetwork.newBuilder().build();

    Operation actualResponse =
        client.insertSubnetwork(region, subnetwork);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertSubnetworkExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(insertSubnetworkMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      Subnetwork subnetwork = Subnetwork.newBuilder().build();

      client.insertSubnetwork(region, subnetwork);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listSubnetworksTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Subnetwork itemsElement = Subnetwork.newBuilder().build();
    List<Subnetwork> items = Arrays.asList(itemsElement);
    SubnetworkList expectedResponse = SubnetworkList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listSubnetworksMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListSubnetworksPagedResponse pagedListResponse = client.listSubnetworks(region);

    List<Subnetwork> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listSubnetworksExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listSubnetworksMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listSubnetworks(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}