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

import static com.google.cloud.compute.v1.NodeGroupClient.AggregatedListNodeGroupsPagedResponse;
import static com.google.cloud.compute.v1.NodeGroupClient.ListNodeGroupsPagedResponse;
import static com.google.cloud.compute.v1.NodeGroupClient.ListNodesNodeGroupsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.addNodesNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.aggregatedListNodeGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.deleteNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.deleteNodesNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.getIamPolicyNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.getNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.insertNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.listNodeGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.listNodesNodeGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.setIamPolicyNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.setNodeTemplateNodeGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub.testIamPermissionsNodeGroupMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.NodeGroupStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class NodeGroupClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              addNodesNodeGroupMethodDescriptor,
              aggregatedListNodeGroupsMethodDescriptor,
              deleteNodeGroupMethodDescriptor,
              deleteNodesNodeGroupMethodDescriptor,
              getNodeGroupMethodDescriptor,
              getIamPolicyNodeGroupMethodDescriptor,
              insertNodeGroupMethodDescriptor,
              listNodeGroupsMethodDescriptor,
              listNodesNodeGroupsMethodDescriptor,
              setIamPolicyNodeGroupMethodDescriptor,
              setNodeTemplateNodeGroupMethodDescriptor,
              testIamPermissionsNodeGroupMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, NodeGroupStubSettings.getDefaultEndpoint());

  private static NodeGroupClient client;
  private static NodeGroupSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        NodeGroupSettings.newBuilder()
            .setTransportChannelProvider(
                NodeGroupSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = NodeGroupClient.create(clientSettings);
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
  public void addNodesNodeGroupTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("addNodesNodeGroupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockNodeGroups.addResponse(resultOperation);

    ProjectZoneNodeGroupName nodeGroup =
        ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");
    NodeGroupsAddNodesRequest nodeGroupsAddNodesRequestResource =
        NodeGroupsAddNodesRequest.newBuilder().build();

    Void actualResponse =
        client.addNodesNodeGroupAsync(nodeGroup, nodeGroupsAddNodesRequestResource).get();
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
  public void addNodesNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupName nodeGroup =
          ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");
      NodeGroupsAddNodesRequest nodeGroupsAddNodesRequestResource =
          NodeGroupsAddNodesRequest.newBuilder().build();

      client.addNodesNodeGroupAsync(nodeGroup, nodeGroupsAddNodesRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListNodeGroupsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    NodeGroupsScopedList itemsItem = NodeGroupsScopedList.newBuilder().build();
    Map<String, NodeGroupsScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    NodeGroupAggregatedList expectedResponse =
        NodeGroupAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListNodeGroupsPagedResponse pagedListResponse =
        client.aggregatedListNodeGroups(project);

    List<NodeGroupsScopedList> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getItemsMap().values().iterator().next(), resources.get(0));

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
  public void aggregatedListNodeGroupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListNodeGroups(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNodeGroupTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteNodeGroupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockNodeGroups.addResponse(resultOperation);

    ProjectZoneNodeGroupName nodeGroup =
        ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");

    Void actualResponse = client.deleteNodeGroupAsync(nodeGroup).get();
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
  public void deleteNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupName nodeGroup =
          ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");

      client.deleteNodeGroupAsync(nodeGroup).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteNodesNodeGroupTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteNodesNodeGroupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockNodeGroups.addResponse(resultOperation);

    ProjectZoneNodeGroupName nodeGroup =
        ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");
    NodeGroupsDeleteNodesRequest nodeGroupsDeleteNodesRequestResource =
        NodeGroupsDeleteNodesRequest.newBuilder().build();

    Void actualResponse =
        client.deleteNodesNodeGroupAsync(nodeGroup, nodeGroupsDeleteNodesRequestResource).get();
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
  public void deleteNodesNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupName nodeGroup =
          ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");
      NodeGroupsDeleteNodesRequest nodeGroupsDeleteNodesRequestResource =
          NodeGroupsDeleteNodesRequest.newBuilder().build();

      client.deleteNodesNodeGroupAsync(nodeGroup, nodeGroupsDeleteNodesRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getNodeGroupTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectRegionNodeTemplateName nodeTemplate =
        ProjectRegionNodeTemplateName.of("[PROJECT]", "[REGION]", "[NODE_TEMPLATE]");
    String selfLink = "selfLink-1691268851";
    Integer size = 3530753;
    String status = "status-892481550";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    NodeGroup expectedResponse =
        NodeGroup.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setNodeTemplate(nodeTemplate.toString())
            .setSelfLink(selfLink)
            .setSize(size)
            .setStatus(status)
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneNodeGroupName nodeGroup =
        ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");

    NodeGroup actualResponse = client.getNodeGroup(nodeGroup);
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
  public void getNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupName nodeGroup =
          ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");

      client.getNodeGroup(nodeGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getIamPolicyNodeGroupTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectZoneNodeGroupResourceName resource =
        ProjectZoneNodeGroupResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");

    Policy actualResponse = client.getIamPolicyNodeGroup(resource);
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
  public void getIamPolicyNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupResourceName resource =
          ProjectZoneNodeGroupResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");

      client.getIamPolicyNodeGroup(resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertNodeGroupTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertNodeGroupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockNodeGroups.addResponse(resultOperation);

    Integer initialNodeCount = 1682564205;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    NodeGroup nodeGroupResource = NodeGroup.newBuilder().build();

    Void actualResponse =
        client.insertNodeGroupAsync(initialNodeCount, zone, nodeGroupResource).get();
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
  public void insertNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Integer initialNodeCount = 1682564205;
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      NodeGroup nodeGroupResource = NodeGroup.newBuilder().build();

      client.insertNodeGroupAsync(initialNodeCount, zone, nodeGroupResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listNodeGroupsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    NodeGroup itemsElement = NodeGroup.newBuilder().build();
    List<NodeGroup> items = Arrays.asList(itemsElement);
    NodeGroupList expectedResponse =
        NodeGroupList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

    ListNodeGroupsPagedResponse pagedListResponse = client.listNodeGroups(zone);

    List<NodeGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listNodeGroupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

      client.listNodeGroups(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listNodesNodeGroupsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    NodeGroupNode itemsElement = NodeGroupNode.newBuilder().build();
    List<NodeGroupNode> items = Arrays.asList(itemsElement);
    NodeGroupsListNodes expectedResponse =
        NodeGroupsListNodes.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneNodeGroupName nodeGroup =
        ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");

    ListNodesNodeGroupsPagedResponse pagedListResponse = client.listNodesNodeGroups(nodeGroup);

    List<NodeGroupNode> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listNodesNodeGroupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupName nodeGroup =
          ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");

      client.listNodesNodeGroups(nodeGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setIamPolicyNodeGroupTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectZoneNodeGroupResourceName resource =
        ProjectZoneNodeGroupResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
    ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();

    Policy actualResponse = client.setIamPolicyNodeGroup(resource, zoneSetPolicyRequestResource);
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
  public void setIamPolicyNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupResourceName resource =
          ProjectZoneNodeGroupResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
      ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();

      client.setIamPolicyNodeGroup(resource, zoneSetPolicyRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNodeTemplateNodeGroupTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setNodeTemplateNodeGroupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockNodeGroups.addResponse(resultOperation);

    ProjectZoneNodeGroupName nodeGroup =
        ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");
    NodeGroupsSetNodeTemplateRequest nodeGroupsSetNodeTemplateRequestResource =
        NodeGroupsSetNodeTemplateRequest.newBuilder().build();

    Void actualResponse =
        client
            .setNodeTemplateNodeGroupAsync(nodeGroup, nodeGroupsSetNodeTemplateRequestResource)
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
  public void setNodeTemplateNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupName nodeGroup =
          ProjectZoneNodeGroupName.of("[PROJECT]", "[ZONE]", "[NODE_GROUP]");
      NodeGroupsSetNodeTemplateRequest nodeGroupsSetNodeTemplateRequestResource =
          NodeGroupsSetNodeTemplateRequest.newBuilder().build();

      client
          .setNodeTemplateNodeGroupAsync(nodeGroup, nodeGroupsSetNodeTemplateRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsNodeGroupTest() {
    TestPermissionsResponse expectedResponse = TestPermissionsResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectZoneNodeGroupResourceName resource =
        ProjectZoneNodeGroupResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
    TestPermissionsRequest testPermissionsRequestResource =
        TestPermissionsRequest.newBuilder().build();

    TestPermissionsResponse actualResponse =
        client.testIamPermissionsNodeGroup(resource, testPermissionsRequestResource);
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
  public void testIamPermissionsNodeGroupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneNodeGroupResourceName resource =
          ProjectZoneNodeGroupResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
      TestPermissionsRequest testPermissionsRequestResource =
          TestPermissionsRequest.newBuilder().build();

      client.testIamPermissionsNodeGroup(resource, testPermissionsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
