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
import static com.google.compute.v1.AddressClient.AggregatedListAddressesPagedResponse;
import static com.google.compute.v1.AddressClient.ListAddressesPagedResponse;
import static com.google.compute.v1.stub.HttpJsonAddressStub.aggregatedListAddressesMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonAddressStub.deleteAddressMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonAddressStub.getAddressMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonAddressStub.insertAddressMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonAddressStub.listAddressesMethodDescriptor;
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
public class AddressClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static AddressClient client;
  private static AddressSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        AddressSettings.newBuilder()
           .setTransportChannelProvider(
               AddressSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       AddressClient.create(clientSettings);
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
  public void aggregatedListAddressesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Address addresses = Address.newBuilder().build();
    AddressesScopedList items = AddressesScopedList.newBuilder()
      .addAllAddresses(addresses)
      .build();
    AddressAggregatedList expectedResponse = AddressAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(aggregatedListAddressesMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListAddressesPagedResponse pagedListResponse = client.aggregatedListAddresses(project);

    List<Address> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAddresses().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListAddressesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListAddressesMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListAddresses(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAddressTest() {
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
    MOCK_SERVICE.setSerializer(deleteAddressMethodDescriptor);

    AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");

    Operation actualResponse =
        client.deleteAddress(address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAddressExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteAddressMethodDescriptor);

    try {
      AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");

      client.deleteAddress(address);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getAddressTest() {
    GlobalAddressesAddressName address2 = GlobalAddressesAddressName.of("[PROJECT]", "[ADDRESS]");
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    String status = "status-892481550";
    Address expectedResponse = Address.newBuilder()
      .setAddress(address2.toString())
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setId(id)
      .setRegion(region.toString())
      .setSelfLink(selfLink)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getAddressMethodDescriptor);

    AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");

    Address actualResponse =
        client.getAddress(address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getAddressExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getAddressMethodDescriptor);

    try {
      AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");

      client.getAddress(address);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertAddressTest() {
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
    MOCK_SERVICE.setSerializer(insertAddressMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    Address address = Address.newBuilder().build();

    Operation actualResponse =
        client.insertAddress(region, address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertAddressExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(insertAddressMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      Address address = Address.newBuilder().build();

      client.insertAddress(region, address);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listAddressesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Address itemsElement = Address.newBuilder().build();
    List<Address> items = Arrays.asList(itemsElement);
    AddressList expectedResponse = AddressList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listAddressesMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListAddressesPagedResponse pagedListResponse = client.listAddresses(region);

    List<Address> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listAddressesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listAddressesMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listAddresses(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}