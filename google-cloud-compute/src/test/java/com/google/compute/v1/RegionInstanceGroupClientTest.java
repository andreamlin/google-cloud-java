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
import static com.google.compute.v1.RegionInstanceGroupClient.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.compute.v1.RegionInstanceGroupClient.ListRegionInstanceGroupsPagedResponse;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupStub.getRegionInstanceGroupMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupStub.listInstancesRegionInstanceGroupsMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupStub.listRegionInstanceGroupsMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupStub.setNamedPortsRegionInstanceGroupMethodDescriptor;
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
public class RegionInstanceGroupClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static RegionInstanceGroupClient client;
  private static RegionInstanceGroupSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionInstanceGroupSettings.newBuilder()
           .setTransportChannelProvider(
               RegionInstanceGroupSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       RegionInstanceGroupClient.create(clientSettings);
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
  public void getRegionInstanceGroupTest() {
    String kind = "kind3292052";
    String description = "description-1724546052";
    NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");
    String selfLink = "selfLink-1691268851";
    Integer size = 3530753;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
    String creationTimestamp = "creationTimestamp567396278";
    String fingerprint = "fingerprint-1375934236";
    String name = "name3373707";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    InstanceGroup expectedResponse = InstanceGroup.newBuilder()
      .setKind(kind)
      .setDescription(description)
      .setNetwork(network.toString())
      .setSelfLink(selfLink)
      .setSize(size)
      .setZone(zone.toString())
      .setSubnetwork(subnetwork.toString())
      .setCreationTimestamp(creationTimestamp)
      .setFingerprint(fingerprint)
      .setName(name)
      .setId(id)
      .setRegion(region.toString())
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(getRegionInstanceGroupMethodDescriptor);

    RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");

    InstanceGroup actualResponse =
        client.getRegionInstanceGroup(instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getRegionInstanceGroupMethodDescriptor);

    try {
      RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");

      client.getRegionInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceGroup itemsElement = InstanceGroup.newBuilder().build();
    List<InstanceGroup> items = Arrays.asList(itemsElement);
    RegionInstanceGroupList expectedResponse = RegionInstanceGroupList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(listRegionInstanceGroupsMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListRegionInstanceGroupsPagedResponse pagedListResponse = client.listRegionInstanceGroups(region);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listRegionInstanceGroupsMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listRegionInstanceGroups(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesRegionInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceWithNamedPorts itemsElement = InstanceWithNamedPorts.newBuilder().build();
    List<InstanceWithNamedPorts> items = Arrays.asList(itemsElement);
    RegionInstanceGroupsListInstances expectedResponse = RegionInstanceGroupsListInstances.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(listInstancesRegionInstanceGroupsMethodDescriptor);

    RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
    RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequest = RegionInstanceGroupsListInstancesRequest.newBuilder().build();

    ListInstancesRegionInstanceGroupsPagedResponse pagedListResponse = client.listInstancesRegionInstanceGroups(instanceGroup, regionInstanceGroupsListInstancesRequest);

    List<InstanceWithNamedPorts> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesRegionInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listInstancesRegionInstanceGroupsMethodDescriptor);

    try {
      RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
      RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequest = RegionInstanceGroupsListInstancesRequest.newBuilder().build();

      client.listInstancesRegionInstanceGroups(instanceGroup, regionInstanceGroupsListInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsRegionInstanceGroupTest() {
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
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(setNamedPortsRegionInstanceGroupMethodDescriptor);

    RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
    RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequest = RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();

    Operation actualResponse =
        client.setNamedPortsRegionInstanceGroup(instanceGroup, regionInstanceGroupsSetNamedPortsRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsRegionInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(setNamedPortsRegionInstanceGroupMethodDescriptor);

    try {
      RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
      RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequest = RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();

      client.setNamedPortsRegionInstanceGroup(instanceGroup, regionInstanceGroupsSetNamedPortsRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}