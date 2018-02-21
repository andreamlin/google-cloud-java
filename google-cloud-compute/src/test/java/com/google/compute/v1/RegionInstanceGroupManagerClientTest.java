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
import static com.google.compute.v1.RegionInstanceGroupManagerClient.ListRegionInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.abandonInstancesRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.deleteInstancesRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.deleteRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.getRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.insertRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.listManagedInstancesRegionInstanceGroupManagersMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.listRegionInstanceGroupManagersMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.recreateInstancesRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.resizeRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.setTargetPoolsRegionInstanceGroupManagerMethodDescriptor;
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
public class RegionInstanceGroupManagerClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static RegionInstanceGroupManagerClient client;
  private static RegionInstanceGroupManagerSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionInstanceGroupManagerSettings.newBuilder()
           .setTransportChannelProvider(
               RegionInstanceGroupManagerSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       RegionInstanceGroupManagerClient.create(clientSettings);
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
  public void abandonInstancesRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(abandonInstancesRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequest = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void abandonInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(abandonInstancesRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequest = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

      client.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(deleteRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    Operation actualResponse =
        client.deleteRegionInstanceGroupManager(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.deleteRegionInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(deleteInstancesRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersDeleteInstancesRequest regionInstanceGroupManagersDeleteInstancesRequest = RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

    Operation actualResponse =
        client.deleteInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteInstancesRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersDeleteInstancesRequest regionInstanceGroupManagersDeleteInstancesRequest = RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

      client.deleteInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupManagerTest() {
    InstanceTemplateName instanceTemplate = InstanceTemplateName.of("[PROJECT]", "[INSTANCE_TEMPLATE]");
    String kind = "kind3292052";
    String description = "description-1724546052";
    String baseInstanceName = "baseInstanceName389106439";
    InstanceGroupName instanceGroup = InstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    String selfLink = "selfLink-1691268851";
    Integer targetSize = 2084603409;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String creationTimestamp = "creationTimestamp567396278";
    String fingerprint = "fingerprint-1375934236";
    String name = "name3373707";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    InstanceGroupManager expectedResponse = InstanceGroupManager.newBuilder()
      .setInstanceTemplate(instanceTemplate.toString())
      .setKind(kind)
      .setDescription(description)
      .setBaseInstanceName(baseInstanceName)
      .setInstanceGroup(instanceGroup.toString())
      .setSelfLink(selfLink)
      .setTargetSize(targetSize)
      .setZone(zone.toString())
      .setCreationTimestamp(creationTimestamp)
      .setFingerprint(fingerprint)
      .setName(name)
      .setId(id)
      .setRegion(region.toString())
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManager actualResponse =
        client.getRegionInstanceGroupManager(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.getRegionInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(insertRegionInstanceGroupManagerMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    InstanceGroupManager instanceGroupManager = InstanceGroupManager.newBuilder().build();

    Operation actualResponse =
        client.insertRegionInstanceGroupManager(region, instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(insertRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      InstanceGroupManager instanceGroupManager = InstanceGroupManager.newBuilder().build();

      client.insertRegionInstanceGroupManager(region, instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupManagersTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceGroupManager itemsElement = InstanceGroupManager.newBuilder().build();
    List<InstanceGroupManager> items = Arrays.asList(itemsElement);
    RegionInstanceGroupManagerList expectedResponse = RegionInstanceGroupManagerList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listRegionInstanceGroupManagersMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListRegionInstanceGroupManagersPagedResponse pagedListResponse = client.listRegionInstanceGroupManagers(region);

    List<InstanceGroupManager> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listRegionInstanceGroupManagersMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listRegionInstanceGroupManagers(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesRegionInstanceGroupManagersTest() {
    RegionInstanceGroupManagersListInstancesResponse expectedResponse = RegionInstanceGroupManagersListInstancesResponse.newBuilder().build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listManagedInstancesRegionInstanceGroupManagersMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    RegionInstanceGroupManagersListInstancesResponse actualResponse =
        client.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesRegionInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listManagedInstancesRegionInstanceGroupManagersMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(recreateInstancesRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequest = RegionInstanceGroupManagersRecreateRequest.newBuilder().build();

    Operation actualResponse =
        client.recreateInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersRecreateRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(recreateInstancesRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequest = RegionInstanceGroupManagersRecreateRequest.newBuilder().build();

      client.recreateInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersRecreateRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(resizeRegionInstanceGroupManagerMethodDescriptor);

    Integer size = 3530753;
    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    Operation actualResponse =
        client.resizeRegionInstanceGroupManager(size, instanceGroupManager);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void resizeRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(resizeRegionInstanceGroupManagerMethodDescriptor);

    try {
      Integer size = 3530753;
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.resizeRegionInstanceGroupManager(size, instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersSetTemplateRequest regionInstanceGroupManagersSetTemplateRequest = RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();

    Operation actualResponse =
        client.setInstanceTemplateRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTemplateRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersSetTemplateRequest regionInstanceGroupManagersSetTemplateRequest = RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();

      client.setInstanceTemplateRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTemplateRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsRegionInstanceGroupManagerTest() {
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
    MOCK_SERVICE.setSerializer(setTargetPoolsRegionInstanceGroupManagerMethodDescriptor);

    RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequest = RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

    Operation actualResponse =
        client.setTargetPoolsRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequest);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(setTargetPoolsRegionInstanceGroupManagerMethodDescriptor);

    try {
      RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequest = RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

      client.setTargetPoolsRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequest);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}