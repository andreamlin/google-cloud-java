/*
 * Copyright 2019 Google LLC
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

import static com.google.cloud.compute.v1.GlobalAddressClient.ListGlobalAddressesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub.deleteGlobalAddressMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub.getGlobalAddressMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub.insertGlobalAddressMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonGlobalAddressStub.listGlobalAddressesMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.GlobalAddressStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class GlobalAddressClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteGlobalAddressMethodDescriptor,
              getGlobalAddressMethodDescriptor,
              insertGlobalAddressMethodDescriptor,
              listGlobalAddressesMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, GlobalAddressStubSettings.getDefaultEndpoint());

  private static GlobalAddressClient client;
  private static GlobalAddressSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        GlobalAddressSettings.newBuilder()
            .setTransportChannelProvider(
                GlobalAddressSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GlobalAddressClient.create(clientSettings);
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
  public void deleteGlobalAddressTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteGlobalAddressTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockGlobalAddresses.addResponse(resultOperation);

    ProjectGlobalAddressName address = ProjectGlobalAddressName.of("[PROJECT]", "[ADDRESS]");

    Void actualResponse = client.deleteGlobalAddressAsync(address).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteGlobalAddressExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalAddressName address = ProjectGlobalAddressName.of("[PROJECT]", "[ADDRESS]");

      client.deleteGlobalAddressAsync(address).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getGlobalAddressTest() {
    ProjectGlobalAddressName address2 = ProjectGlobalAddressName.of("[PROJECT]", "[ADDRESS]");
    String addressType = "addressType264307877";
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String ipVersion = "ipVersion-1315653184";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of("[PROJECT]", "[NETWORK]");
    String networkTier = "networkTier-19473069";
    Integer prefixLength = 1157046989;
    String purpose = "purpose-220463842";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    String status = "status-892481550";
    ProjectRegionSubnetworkName subnetwork =
        ProjectRegionSubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
    Address expectedResponse =
        Address.newBuilder()
            .setAddress(address2.toString())
            .setAddressType(addressType)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setIpVersion(ipVersion)
            .setKind(kind)
            .setName(name)
            .setNetwork(network.toString())
            .setNetworkTier(networkTier)
            .setPrefixLength(prefixLength)
            .setPurpose(purpose)
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setStatus(status)
            .setSubnetwork(subnetwork.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalAddressName address = ProjectGlobalAddressName.of("[PROJECT]", "[ADDRESS]");

    Address actualResponse = client.getGlobalAddress(address);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void getGlobalAddressExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalAddressName address = ProjectGlobalAddressName.of("[PROJECT]", "[ADDRESS]");

      client.getGlobalAddress(address);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertGlobalAddressTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertGlobalAddressTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockGlobalAddresses.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    Address addressResource = Address.newBuilder().build();

    Void actualResponse = client.insertGlobalAddressAsync(project, addressResource).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void insertGlobalAddressExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      Address addressResource = Address.newBuilder().build();

      client.insertGlobalAddressAsync(project, addressResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listGlobalAddressesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Address itemsElement = Address.newBuilder().build();
    List<Address> items = Arrays.asList(itemsElement);
    AddressList expectedResponse =
        AddressList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListGlobalAddressesPagedResponse pagedListResponse = client.listGlobalAddresses(project);

    List<Address> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listGlobalAddressesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listGlobalAddresses(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
