/*
 * Copyright 2017 Google LLC
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
package com.google.cloud.simplecompute.v1;

import com.google.api.gax.httpjson.MockHttpLayer;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import static com.google.cloud.simplecompute.v1.PagedResponseWrappers.ListAddressesPagedResponse;

import com.google.api.gax.rpc.StatusCode.Code;
import com.google.cloud.simplecompute.v1.stub.HttpJsonAddressStub;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class AddressClientTest {
  private static AddressClient client;
  private static AddressSettings addressSettings;
  private static final MockHttpLayer MOCK_ADDRESSES = new MockHttpLayer();
  private static final RegionName TEST_REGION =
      RegionName.of("test-project", "test-subscription");

  @BeforeClass
  public static void setUp() throws Exception {
    addressSettings =
        AddressSettings.newBuilder()
            .setTransportChannelProvider(
                AddressSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(MOCK_ADDRESSES).build()).build();
    client =
        AddressClient.create(addressSettings);
  }

  @After
  public void cleanUp() {
    MOCK_ADDRESSES.reset();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAddressTest() throws IOException {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region = "region-934795532";
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
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_ADDRESSES.addResponse(expectedResponse);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getDeleteAddressMethodDescriptor());

    AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");

    Operation actualResponse =
        client.deleteAddress(address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_ADDRESSES.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAddressExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_ADDRESSES.addException(exception);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getDeleteAddressMethodDescriptor());

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
  public void getAddressTest() throws UnsupportedEncodingException {
    String address2 = "address2874543783";
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String region = "region-934795532";
    String selfLink = "selfLink-1691268851";
    String status = "status-892481550";
    Address expectedResponse = Address.newBuilder()
      .setAddress(address2)
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setId(id)
      .setRegion(region)
      .setSelfLink(selfLink)
      .setStatus(status)
      .build();
    MOCK_ADDRESSES.addResponse(expectedResponse);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getGetAddressMethodDescriptor());

    AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");

    Address actualResponse =
        client.getAddress(address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_ADDRESSES.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getAddressExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_ADDRESSES.addException(exception);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getGetAddressMethodDescriptor());

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
  public void insertAddressTest() throws UnsupportedEncodingException {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region2 = "region2-690338393";
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
      .setZone(zone)
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region2)
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_ADDRESSES.addResponse(expectedResponse);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getInsertAddressMethodDescriptor());

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    Address address = Address.newBuilder().build();

    Operation actualResponse =
        client.insertAddress(region, address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_ADDRESSES.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertAddressExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_ADDRESSES.addException(exception);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getInsertAddressMethodDescriptor());

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
  public void listAddressesTest() throws UnsupportedEncodingException {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Address itemsElement = Address.getDefaultInstance();
    List<Address> items = Arrays.asList(itemsElement);
    AddressList expectedResponse = AddressList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_ADDRESSES.addResponse(expectedResponse);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getListAddressesMethodDescriptor());

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListAddressesPagedResponse pagedListResponse = client.listAddresses(region);

    List<Address> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_ADDRESSES.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listAddressesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_ADDRESSES.addException(exception);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getListAddressesMethodDescriptor());

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listAddresses(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}