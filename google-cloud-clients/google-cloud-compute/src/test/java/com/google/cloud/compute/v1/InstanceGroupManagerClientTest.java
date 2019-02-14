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

import static com.google.cloud.compute.v1.InstanceGroupManagerClient.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.abandonInstancesInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.aggregatedListInstanceGroupManagersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.deleteInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.deleteInstancesInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.getInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.insertInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.listInstanceGroupManagersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.listManagedInstancesInstanceGroupManagersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.patchInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.recreateInstancesInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.resizeInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.setInstanceTemplateInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub.setTargetPoolsInstanceGroupManagerMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import java.io.IOException;
import java.util.ArrayList;
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
public class InstanceGroupManagerClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              abandonInstancesInstanceGroupManagerMethodDescriptor,
              aggregatedListInstanceGroupManagersMethodDescriptor,
              deleteInstanceGroupManagerMethodDescriptor,
              deleteInstancesInstanceGroupManagerMethodDescriptor,
              getInstanceGroupManagerMethodDescriptor,
              insertInstanceGroupManagerMethodDescriptor,
              listInstanceGroupManagersMethodDescriptor,
              listManagedInstancesInstanceGroupManagersMethodDescriptor,
              patchInstanceGroupManagerMethodDescriptor,
              recreateInstancesInstanceGroupManagerMethodDescriptor,
              resizeInstanceGroupManagerMethodDescriptor,
              setInstanceTemplateInstanceGroupManagerMethodDescriptor,
              setTargetPoolsInstanceGroupManagerMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(
          METHOD_DESCRIPTORS, InstanceGroupManagerStubSettings.getDefaultEndpoint());

  private static InstanceGroupManagerClient client;
  private static InstanceGroupManagerSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        InstanceGroupManagerSettings.newBuilder()
            .setTransportChannelProvider(
                InstanceGroupManagerSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = InstanceGroupManagerClient.create(clientSettings);
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
  public void abandonInstancesInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("abandonInstancesInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersAbandonInstancesRequest
        instanceGroupManagersAbandonInstancesRequestResource =
            InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

    Void actualResponse =
        client
            .abandonInstancesInstanceGroupManagerAsync(
                instanceGroupManager, instanceGroupManagersAbandonInstancesRequestResource)
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
  public void abandonInstancesInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersAbandonInstancesRequest
          instanceGroupManagersAbandonInstancesRequestResource =
              InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

      client
          .abandonInstancesInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagersAbandonInstancesRequestResource)
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
  public void aggregatedListInstanceGroupManagersTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    InstanceGroupManagersScopedList itemsItem =
        InstanceGroupManagersScopedList.newBuilder().build();
    Map<String, InstanceGroupManagersScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    InstanceGroupManagerAggregatedList expectedResponse =
        InstanceGroupManagerAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListInstanceGroupManagersPagedResponse pagedListResponse =
        client.aggregatedListInstanceGroupManagers(project);

    List<InstanceGroupManagersScopedList> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void aggregatedListInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListInstanceGroupManagers(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    Void actualResponse = client.deleteInstanceGroupManagerAsync(instanceGroupManager).get();
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
  public void deleteInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.deleteInstanceGroupManagerAsync(instanceGroupManager).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInstancesInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersDeleteInstancesRequest
        instanceGroupManagersDeleteInstancesRequestResource =
            InstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

    Void actualResponse =
        client
            .deleteInstancesInstanceGroupManagerAsync(
                instanceGroupManager, instanceGroupManagersDeleteInstancesRequestResource)
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
  public void deleteInstancesInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersDeleteInstancesRequest
          instanceGroupManagersDeleteInstancesRequestResource =
              InstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

      client
          .deleteInstancesInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagersDeleteInstancesRequestResource)
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
  public void getInstanceGroupManagerTest() {
    String baseInstanceName = "baseInstanceName389106439";
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String fingerprint = "fingerprint-1375934236";
    String id = "id3355";
    ProjectZoneInstanceGroupName instanceGroup =
        ProjectZoneInstanceGroupName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
    ProjectGlobalInstanceTemplateName instanceTemplate =
        ProjectGlobalInstanceTemplateName.of("[PROJECT]", "[INSTANCE_TEMPLATE]");
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String selfLink = "selfLink-1691268851";
    Integer targetSize = 2084603409;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    InstanceGroupManager expectedResponse =
        InstanceGroupManager.newBuilder()
            .setBaseInstanceName(baseInstanceName)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setFingerprint(fingerprint)
            .setId(id)
            .setInstanceGroup(instanceGroup.toString())
            .setInstanceTemplate(instanceTemplate.toString())
            .setKind(kind)
            .setName(name)
            .setRegion(region.toString())
            .setSelfLink(selfLink)
            .setTargetSize(targetSize)
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManager actualResponse = client.getInstanceGroupManager(instanceGroupManager);
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
  public void getInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.getInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();

    Void actualResponse =
        client.insertInstanceGroupManagerAsync(zone, instanceGroupManagerResource).get();
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
  public void insertInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();

      client.insertInstanceGroupManagerAsync(zone, instanceGroupManagerResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceGroupManagersTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    InstanceGroupManager itemsElement = InstanceGroupManager.newBuilder().build();
    List<InstanceGroupManager> items = Arrays.asList(itemsElement);
    InstanceGroupManagerList expectedResponse =
        InstanceGroupManagerList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

    ListInstanceGroupManagersPagedResponse pagedListResponse =
        client.listInstanceGroupManagers(zone);

    List<InstanceGroupManager> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

      client.listInstanceGroupManagers(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesInstanceGroupManagersTest() {
    InstanceGroupManagersListManagedInstancesResponse expectedResponse =
        InstanceGroupManagersListManagedInstancesResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManagersListManagedInstancesResponse actualResponse =
        client.listManagedInstancesInstanceGroupManagers(instanceGroupManager);
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
  public void listManagedInstancesInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.listManagedInstancesInstanceGroupManagers(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("patchInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client
            .patchInstanceGroupManagerAsync(
                instanceGroupManager, instanceGroupManagerResource, fieldMask)
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
  public void patchInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client
          .patchInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagerResource, fieldMask)
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
  public void recreateInstancesInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("recreateInstancesInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersRecreateInstancesRequest
        instanceGroupManagersRecreateInstancesRequestResource =
            InstanceGroupManagersRecreateInstancesRequest.newBuilder().build();

    Void actualResponse =
        client
            .recreateInstancesInstanceGroupManagerAsync(
                instanceGroupManager, instanceGroupManagersRecreateInstancesRequestResource)
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
  public void recreateInstancesInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersRecreateInstancesRequest
          instanceGroupManagersRecreateInstancesRequestResource =
              InstanceGroupManagersRecreateInstancesRequest.newBuilder().build();

      client
          .recreateInstancesInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagersRecreateInstancesRequestResource)
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
  public void resizeInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("resizeInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    Integer size = 3530753;
    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

    Void actualResponse = client.resizeInstanceGroupManagerAsync(size, instanceGroupManager).get();
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
  public void resizeInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Integer size = 3530753;
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");

      client.resizeInstanceGroupManagerAsync(size, instanceGroupManager).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setInstanceTemplateInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersSetInstanceTemplateRequest
        instanceGroupManagersSetInstanceTemplateRequestResource =
            InstanceGroupManagersSetInstanceTemplateRequest.newBuilder().build();

    Void actualResponse =
        client
            .setInstanceTemplateInstanceGroupManagerAsync(
                instanceGroupManager, instanceGroupManagersSetInstanceTemplateRequestResource)
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
  public void setInstanceTemplateInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersSetInstanceTemplateRequest
          instanceGroupManagersSetInstanceTemplateRequestResource =
              InstanceGroupManagersSetInstanceTemplateRequest.newBuilder().build();

      client
          .setInstanceTemplateInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagersSetInstanceTemplateRequestResource)
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
  public void setTargetPoolsInstanceGroupManagerTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setTargetPoolsInstanceGroupManagerTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceGroupManagers.addResponse(resultOperation);

    ProjectZoneInstanceGroupManagerName instanceGroupManager =
        ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManagersSetTargetPoolsRequest instanceGroupManagersSetTargetPoolsRequestResource =
        InstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

    Void actualResponse =
        client
            .setTargetPoolsInstanceGroupManagerAsync(
                instanceGroupManager, instanceGroupManagersSetTargetPoolsRequestResource)
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
  public void setTargetPoolsInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceGroupManagerName instanceGroupManager =
          ProjectZoneInstanceGroupManagerName.of("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManagersSetTargetPoolsRequest
          instanceGroupManagersSetTargetPoolsRequestResource =
              InstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

      client
          .setTargetPoolsInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagersSetTargetPoolsRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
