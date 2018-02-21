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
import static com.google.compute.v1.TargetInstanceClient.AggregatedListTargetInstancesPagedResponse;
import static com.google.compute.v1.TargetInstanceClient.ListTargetInstancesPagedResponse;
import static com.google.compute.v1.stub.HttpJsonTargetInstanceStub.aggregatedListTargetInstancesMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonTargetInstanceStub.deleteTargetInstanceMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonTargetInstanceStub.getTargetInstanceMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonTargetInstanceStub.insertTargetInstanceMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonTargetInstanceStub.listTargetInstancesMethodDescriptor;
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
public class TargetInstanceClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static TargetInstanceClient client;
  private static TargetInstanceSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetInstanceSettings.newBuilder()
           .setTransportChannelProvider(
               TargetInstanceSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       TargetInstanceClient.create(clientSettings);
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
  public void aggregatedListTargetInstancesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    TargetInstance targetInstances = TargetInstance.newBuilder().build();
    TargetInstancesScopedList items = TargetInstancesScopedList.newBuilder()
      .addAllTargetInstances(targetInstances)
      .build();
    TargetInstanceAggregatedList expectedResponse = TargetInstanceAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(aggregatedListTargetInstancesMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListTargetInstancesPagedResponse pagedListResponse = client.aggregatedListTargetInstances(project);

    List<TargetInstance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTargetInstances().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListTargetInstancesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListTargetInstancesMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListTargetInstances(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetInstanceTest() {
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
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(deleteTargetInstanceMethodDescriptor);

    TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

    Operation actualResponse =
        client.deleteTargetInstance(targetInstance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetInstanceExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteTargetInstanceMethodDescriptor);

    try {
      TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

      client.deleteTargetInstance(targetInstance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetInstanceTest() {
    InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String natPolicy = "natPolicy-1637703152";
    String selfLink = "selfLink-1691268851";
    TargetInstance expectedResponse = TargetInstance.newBuilder()
      .setInstance(instance.toString())
      .setZone(zone.toString())
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setId(id)
      .setNatPolicy(natPolicy)
      .setSelfLink(selfLink)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(getTargetInstanceMethodDescriptor);

    TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

    TargetInstance actualResponse =
        client.getTargetInstance(targetInstance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetInstanceExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getTargetInstanceMethodDescriptor);

    try {
      TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

      client.getTargetInstance(targetInstance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetInstanceTest() {
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
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(insertTargetInstanceMethodDescriptor);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    TargetInstance targetInstance = TargetInstance.newBuilder().build();

    Operation actualResponse =
        client.insertTargetInstance(zone, targetInstance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetInstanceExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(insertTargetInstanceMethodDescriptor);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
      TargetInstance targetInstance = TargetInstance.newBuilder().build();

      client.insertTargetInstance(zone, targetInstance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetInstancesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    TargetInstance itemsElement = TargetInstance.newBuilder().build();
    List<TargetInstance> items = Arrays.asList(itemsElement);
    TargetInstanceList expectedResponse = TargetInstanceList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);MOCK_SERVICE.setSerializer(listTargetInstancesMethodDescriptor);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListTargetInstancesPagedResponse pagedListResponse = client.listTargetInstances(zone);

    List<TargetInstance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetInstancesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listTargetInstancesMethodDescriptor);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listTargetInstances(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}