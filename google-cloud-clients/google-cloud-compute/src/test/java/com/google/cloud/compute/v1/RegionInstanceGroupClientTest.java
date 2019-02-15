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

import static com.google.cloud.compute.v1.RegionInstanceGroupClient.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupClient.ListRegionInstanceGroupsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.getRegionInstanceGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.listInstancesRegionInstanceGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.listRegionInstanceGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.setNamedPortsRegionInstanceGroupMethodDescriptor;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class RegionInstanceGroupClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              getRegionInstanceGroupMethodDescriptor,
              listRegionInstanceGroupsMethodDescriptor,
              listInstancesRegionInstanceGroupsMethodDescriptor,
              setNamedPortsRegionInstanceGroupMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, RegionInstanceGroupStubSettings.getDefaultEndpoint());

  private static RegionInstanceGroupClient client;
  private static RegionInstanceGroupSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionInstanceGroupSettings.newBuilder()
            .setTransportChannelProvider(
                RegionInstanceGroupSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RegionInstanceGroupClient.create(clientSettings);
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
  public void getRegionInstanceGroupTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String fingerprint = "fingerprint-1375934236";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of("[PROJECT]", "[NETWORK]");
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    Integer size = 3530753;
    ProjectRegionSubnetworkName subnetwork =
        ProjectRegionSubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    InstanceGroup expectedResponse =
        InstanceGroup.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setFingerprint(fingerprint)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setNetwork(network.toString())
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setSize(size)
            .setSubnetwork(subnetwork.toString())
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionInstanceGroupName instanceGroup =
        ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");

    InstanceGroup actualResponse = client.getRegionInstanceGroup(instanceGroup);
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
  public void getRegionInstanceGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupName instanceGroup =
          ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");

      client.getRegionInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    InstanceGroup itemsElement = InstanceGroup.newBuilder().build();
    List<InstanceGroup> items = Arrays.asList(itemsElement);
    RegionInstanceGroupList expectedResponse =
        RegionInstanceGroupList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListRegionInstanceGroupsPagedResponse pagedListResponse =
        client.listRegionInstanceGroups(region);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listRegionInstanceGroupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listRegionInstanceGroups(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesRegionInstanceGroupsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    InstanceWithNamedPorts itemsElement = InstanceWithNamedPorts.newBuilder().build();
    List<InstanceWithNamedPorts> items = Arrays.asList(itemsElement);
    RegionInstanceGroupsListInstances expectedResponse =
        RegionInstanceGroupsListInstances.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionInstanceGroupName instanceGroup =
        ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
    RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource =
        RegionInstanceGroupsListInstancesRequest.newBuilder().build();

    ListInstancesRegionInstanceGroupsPagedResponse pagedListResponse =
        client.listInstancesRegionInstanceGroups(
            instanceGroup, regionInstanceGroupsListInstancesRequestResource);

    List<InstanceWithNamedPorts> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listInstancesRegionInstanceGroupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupName instanceGroup =
          ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
      RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource =
          RegionInstanceGroupsListInstancesRequest.newBuilder().build();

      client.listInstancesRegionInstanceGroups(
          instanceGroup, regionInstanceGroupsListInstancesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsRegionInstanceGroupTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setNamedPortsRegionInstanceGroupTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupName instanceGroup =
        ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
    RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource =
        RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setNamedPortsRegionInstanceGroupAsync(
                instanceGroup, regionInstanceGroupsSetNamedPortsRequestResource)
            .get();
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
  public void setNamedPortsRegionInstanceGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupName instanceGroup =
          ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
      RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource =
          RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();

      client
          .setNamedPortsRegionInstanceGroupAsync(
              instanceGroup, regionInstanceGroupsSetNamedPortsRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
