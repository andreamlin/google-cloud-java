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

import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.abandonInstancesRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.deleteInstancesRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.deleteRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.getRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.insertRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.listManagedInstancesRegionInstanceGroupManagersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.listRegionInstanceGroupManagersMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.patchRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.recreateInstancesRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.resizeRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub.setTargetPoolsRegionInstanceGroupManagerMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class RegionInstanceGroupManagerClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              abandonInstancesRegionInstanceGroupManagerMethodDescriptor,
              deleteRegionInstanceGroupManagerMethodDescriptor,
              deleteInstancesRegionInstanceGroupManagerMethodDescriptor,
              getRegionInstanceGroupManagerMethodDescriptor,
              insertRegionInstanceGroupManagerMethodDescriptor,
              listRegionInstanceGroupManagersMethodDescriptor,
              listManagedInstancesRegionInstanceGroupManagersMethodDescriptor,
              patchRegionInstanceGroupManagerMethodDescriptor,
              recreateInstancesRegionInstanceGroupManagerMethodDescriptor,
              resizeRegionInstanceGroupManagerMethodDescriptor,
              setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor,
              setTargetPoolsRegionInstanceGroupManagerMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(
          METHOD_DESCRIPTORS, RegionInstanceGroupManagerStubSettings.getDefaultEndpoint());

  private static RegionInstanceGroupManagerClient client;
  private static RegionInstanceGroupManagerSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionInstanceGroupManagerSettings.newBuilder()
            .setTransportChannelProvider(
                RegionInstanceGroupManagerSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RegionInstanceGroupManagerClient.create(clientSettings);
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
  public void abandonInstancesRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("abandonInstancesRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersAbandonInstancesRequest
        regionInstanceGroupManagersAbandonInstancesRequestResource =
            RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .abandonInstancesRegionInstanceGroupManagerAsync(
                instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequestResource)
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
  public void abandonInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersAbandonInstancesRequest
          regionInstanceGroupManagersAbandonInstancesRequestResource =
              RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();

      client
          .abandonInstancesRegionInstanceGroupManagerAsync(
              instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    EmptyMessage actualResponse =
        client.deleteRegionInstanceGroupManagerAsync(instanceGroupManager).get();
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
  public void deleteRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.deleteRegionInstanceGroupManagerAsync(instanceGroupManager).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstancesRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInstancesRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersDeleteInstancesRequest
        regionInstanceGroupManagersDeleteInstancesRequestResource =
            RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .deleteInstancesRegionInstanceGroupManagerAsync(
                instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequestResource)
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
  public void deleteInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersDeleteInstancesRequest
          regionInstanceGroupManagersDeleteInstancesRequestResource =
              RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();

      client
          .deleteInstancesRegionInstanceGroupManagerAsync(
              instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupManagerTest() {
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

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    InstanceGroupManager actualResponse =
        client.getRegionInstanceGroupManager(instanceGroupManager);
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
  public void getRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.getRegionInstanceGroupManager(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertRegionInstanceGroupManagerAsync(region, instanceGroupManagerResource).get();
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
  public void insertRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
      InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();

      client.insertRegionInstanceGroupManagerAsync(region, instanceGroupManagerResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupManagersTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    InstanceGroupManager itemsElement = InstanceGroupManager.newBuilder().build();
    List<InstanceGroupManager> items = Arrays.asList(itemsElement);
    RegionInstanceGroupManagerList expectedResponse =
        RegionInstanceGroupManagerList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListRegionInstanceGroupManagersPagedResponse pagedListResponse =
        client.listRegionInstanceGroupManagers(region);

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
  public void listRegionInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listRegionInstanceGroupManagers(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedInstancesRegionInstanceGroupManagersTest() {
    RegionInstanceGroupManagersListInstancesResponse expectedResponse =
        RegionInstanceGroupManagersListInstancesResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    RegionInstanceGroupManagersListInstancesResponse actualResponse =
        client.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
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
  public void listManagedInstancesRegionInstanceGroupManagersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("patchRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client
            .patchRegionInstanceGroupManagerAsync(
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
  public void patchRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client
          .patchRegionInstanceGroupManagerAsync(
              instanceGroupManager, instanceGroupManagerResource, fieldMask)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void recreateInstancesRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("recreateInstancesRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequestResource =
        RegionInstanceGroupManagersRecreateRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .recreateInstancesRegionInstanceGroupManagerAsync(
                instanceGroupManager, regionInstanceGroupManagersRecreateRequestResource)
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
  public void recreateInstancesRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersRecreateRequest
          regionInstanceGroupManagersRecreateRequestResource =
              RegionInstanceGroupManagersRecreateRequest.newBuilder().build();

      client
          .recreateInstancesRegionInstanceGroupManagerAsync(
              instanceGroupManager, regionInstanceGroupManagersRecreateRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resizeRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("resizeRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    Integer size = 3530753;
    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

    EmptyMessage actualResponse =
        client.resizeRegionInstanceGroupManagerAsync(size, instanceGroupManager).get();
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
  public void resizeRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Integer size = 3530753;
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");

      client.resizeRegionInstanceGroupManagerAsync(size, instanceGroupManager).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setInstanceTemplateRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setInstanceTemplateRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersSetTemplateRequest
        regionInstanceGroupManagersSetTemplateRequestResource =
            RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setInstanceTemplateRegionInstanceGroupManagerAsync(
                instanceGroupManager, regionInstanceGroupManagersSetTemplateRequestResource)
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
  public void setInstanceTemplateRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersSetTemplateRequest
          regionInstanceGroupManagersSetTemplateRequestResource =
              RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();

      client
          .setInstanceTemplateRegionInstanceGroupManagerAsync(
              instanceGroupManager, regionInstanceGroupManagersSetTemplateRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetPoolsRegionInstanceGroupManagerTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setTargetPoolsRegionInstanceGroupManagerTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectRegionInstanceGroupManagerName instanceGroupManager =
        ProjectRegionInstanceGroupManagerName.of(
            "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
    RegionInstanceGroupManagersSetTargetPoolsRequest
        regionInstanceGroupManagersSetTargetPoolsRequestResource =
            RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setTargetPoolsRegionInstanceGroupManagerAsync(
                instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequestResource)
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
  public void setTargetPoolsRegionInstanceGroupManagerExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupManagerName instanceGroupManager =
          ProjectRegionInstanceGroupManagerName.of(
              "[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
      RegionInstanceGroupManagersSetTargetPoolsRequest
          regionInstanceGroupManagersSetTargetPoolsRequestResource =
              RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();

      client
          .setTargetPoolsRegionInstanceGroupManagerAsync(
              instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
