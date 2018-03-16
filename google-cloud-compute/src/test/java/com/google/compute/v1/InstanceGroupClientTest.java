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
import com.google.api.gax.httpjson.MockHttpService;
import com.google.api.gax.paging.PagedListResponse;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import static com.google.compute.v1.InstanceGroupClient.AggregatedListInstanceGroupsPagedResponse;
import static com.google.compute.v1.InstanceGroupClient.ListInstanceGroupsPagedResponse;
import static com.google.compute.v1.InstanceGroupClient.ListInstancesInstanceGroupsPagedResponse;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.addInstancesInstanceGroupMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.aggregatedListInstanceGroupsMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.deleteInstanceGroupMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.getInstanceGroupMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.insertInstanceGroupMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.listInstanceGroupsMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.listInstancesInstanceGroupsMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.removeInstancesInstanceGroupMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonInstanceGroupStub.setNamedPortsInstanceGroupMethodDescriptor;
import com.google.compute.v1.stub.InstanceGroupStubSettings;
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
public class InstanceGroupClientTest {
  private static final List<ApiMethodDescriptor<? extends ApiMessage, ? extends ApiMessage>> METHOD_DESCRIPTORS
      = ImmutableList.copyOf(Lists.<ApiMethodDescriptor<? extends ApiMessage, ? extends ApiMessage>>newArrayList(
              addInstancesInstanceGroupMethodDescriptor,
              aggregatedListInstanceGroupsMethodDescriptor,
              deleteInstanceGroupMethodDescriptor,
              getInstanceGroupMethodDescriptor,
              insertInstanceGroupMethodDescriptor,
              listInstanceGroupsMethodDescriptor,
              listInstancesInstanceGroupsMethodDescriptor,
              removeInstancesInstanceGroupMethodDescriptor,
              setNamedPortsInstanceGroupMethodDescriptor
          ));
  private static final MockHttpService mockService
      = new MockHttpService(METHOD_DESCRIPTORS, InstanceGroupStubSettings.getDefaultEndpoint());
  private static InstanceGroupClient client;
  private static InstanceGroupSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        InstanceGroupSettings.newBuilder()
           .setTransportChannelProvider(
               InstanceGroupSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build()).build();
    client =
       InstanceGroupClient.create(clientSettings);
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
  public void addInstancesInstanceGroupTest() {
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

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequestResource = InstanceGroupsAddInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void addInstancesInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequestResource = InstanceGroupsAddInstancesRequest.newBuilder().build();

      client.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceGroup instanceGroupsElement = InstanceGroup.newBuilder().build();
    List<InstanceGroup> instanceGroups = Arrays.asList(instanceGroupsElement);
    InstanceGroupsScopedList items = InstanceGroupsScopedList.newBuilder()
      .addAllInstanceGroups(instanceGroups)
      .build();
    InstanceGroupAggregatedList expectedResponse = InstanceGroupAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListInstanceGroupsPagedResponse pagedListResponse = client.aggregatedListInstanceGroups(project);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().getInstanceGroups().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListInstanceGroups(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupTest() {
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

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

    Operation actualResponse =
        client.deleteInstanceGroup(instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

      client.deleteInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceGroupTest() {
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
    mockService.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

    InstanceGroup actualResponse =
        client.getInstanceGroup(instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");

      client.getInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupTest() {
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
    InstanceGroup instanceGroupResource = InstanceGroup.newBuilder().build();

    Operation actualResponse =
        client.insertInstanceGroup(zone, instanceGroupResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      InstanceGroup instanceGroupResource = InstanceGroup.newBuilder().build();

      client.insertInstanceGroup(zone, instanceGroupResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceGroup itemsElement = InstanceGroup.newBuilder().build();
    List<InstanceGroup> items = Arrays.asList(itemsElement);
    InstanceGroupList expectedResponse = InstanceGroupList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListInstanceGroupsPagedResponse pagedListResponse = client.listInstanceGroups(zone);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listInstanceGroups(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceWithNamedPorts itemsElement = InstanceWithNamedPorts.newBuilder().build();
    List<InstanceWithNamedPorts> items = Arrays.asList(itemsElement);
    InstanceGroupsListInstances expectedResponse = InstanceGroupsListInstances.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequestResource = InstanceGroupsListInstancesRequest.newBuilder().build();

    ListInstancesInstanceGroupsPagedResponse pagedListResponse = client.listInstancesInstanceGroups(instanceGroup, instanceGroupsListInstancesRequestResource);

    List<InstanceWithNamedPorts> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequestResource = InstanceGroupsListInstancesRequest.newBuilder().build();

      client.listInstancesInstanceGroups(instanceGroup, instanceGroupsListInstancesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstancesInstanceGroupTest() {
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

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequestResource = InstanceGroupsRemoveInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.removeInstancesInstanceGroup(instanceGroup, instanceGroupsRemoveInstancesRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void removeInstancesInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequestResource = InstanceGroupsRemoveInstancesRequest.newBuilder().build();

      client.removeInstancesInstanceGroup(instanceGroup, instanceGroupsRemoveInstancesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsInstanceGroupTest() {
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

    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequestResource = InstanceGroupsSetNamedPortsRequest.newBuilder().build();

    Operation actualResponse =
        client.setNamedPortsInstanceGroup(instanceGroup, instanceGroupsSetNamedPortsRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
      InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequestResource = InstanceGroupsSetNamedPortsRequest.newBuilder().build();

      client.setNamedPortsInstanceGroup(instanceGroup, instanceGroupsSetNamedPortsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}