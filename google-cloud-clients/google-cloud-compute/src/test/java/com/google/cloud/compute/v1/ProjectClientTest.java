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

import static com.google.cloud.compute.v1.ProjectClient.GetXpnResourcesProjectsPagedResponse;
import static com.google.cloud.compute.v1.ProjectClient.ListXpnHostsProjectsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.disableXpnHostProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.disableXpnResourceProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.enableXpnHostProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.enableXpnResourceProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.getProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.getXpnHostProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.getXpnResourcesProjectsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.listXpnHostsProjectsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.moveDiskProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.moveInstanceProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.setCommonInstanceMetadataProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.setDefaultNetworkTierProjectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonProjectStub.setUsageExportBucketProjectMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.ProjectStubSettings;
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
public class ProjectClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              disableXpnHostProjectMethodDescriptor,
              disableXpnResourceProjectMethodDescriptor,
              enableXpnHostProjectMethodDescriptor,
              enableXpnResourceProjectMethodDescriptor,
              getProjectMethodDescriptor,
              getXpnHostProjectMethodDescriptor,
              getXpnResourcesProjectsMethodDescriptor,
              listXpnHostsProjectsMethodDescriptor,
              moveDiskProjectMethodDescriptor,
              moveInstanceProjectMethodDescriptor,
              setCommonInstanceMetadataProjectMethodDescriptor,
              setDefaultNetworkTierProjectMethodDescriptor,
              setUsageExportBucketProjectMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, ProjectStubSettings.getDefaultEndpoint());

  private static ProjectClient client;
  private static ProjectSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ProjectSettings.newBuilder()
            .setTransportChannelProvider(
                ProjectSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ProjectClient.create(clientSettings);
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
  public void disableXpnHostProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("disableXpnHostProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");

    EmptyMessage actualResponse = client.disableXpnHostProjectAsync(project).get();
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
  public void disableXpnHostProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.disableXpnHostProjectAsync(project).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void disableXpnResourceProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("disableXpnResourceProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    ProjectsDisableXpnResourceRequest projectsDisableXpnResourceRequestResource =
        ProjectsDisableXpnResourceRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .disableXpnResourceProjectAsync(project, projectsDisableXpnResourceRequestResource)
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
  public void disableXpnResourceProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      ProjectsDisableXpnResourceRequest projectsDisableXpnResourceRequestResource =
          ProjectsDisableXpnResourceRequest.newBuilder().build();

      client
          .disableXpnResourceProjectAsync(project, projectsDisableXpnResourceRequestResource)
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
  public void enableXpnHostProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("enableXpnHostProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");

    EmptyMessage actualResponse = client.enableXpnHostProjectAsync(project).get();
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
  public void enableXpnHostProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.enableXpnHostProjectAsync(project).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void enableXpnResourceProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("enableXpnResourceProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    ProjectsEnableXpnResourceRequest projectsEnableXpnResourceRequestResource =
        ProjectsEnableXpnResourceRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .enableXpnResourceProjectAsync(project, projectsEnableXpnResourceRequestResource)
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
  public void enableXpnResourceProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      ProjectsEnableXpnResourceRequest projectsEnableXpnResourceRequestResource =
          ProjectsEnableXpnResourceRequest.newBuilder().build();

      client.enableXpnResourceProjectAsync(project, projectsEnableXpnResourceRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getProjectTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String defaultNetworkTier = "defaultNetworkTier1545495185";
    String defaultServiceAccount = "defaultServiceAccount-1848771419";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    String xpnProjectStatus = "xpnProjectStatus-308451647";
    Project expectedResponse =
        Project.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDefaultNetworkTier(defaultNetworkTier)
            .setDefaultServiceAccount(defaultServiceAccount)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .setXpnProjectStatus(xpnProjectStatus)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    Project actualResponse = client.getProject(project);
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
  public void getProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.getProject(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getXpnHostProjectTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String defaultNetworkTier = "defaultNetworkTier1545495185";
    String defaultServiceAccount = "defaultServiceAccount-1848771419";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    String xpnProjectStatus = "xpnProjectStatus-308451647";
    Project expectedResponse =
        Project.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDefaultNetworkTier(defaultNetworkTier)
            .setDefaultServiceAccount(defaultServiceAccount)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .setXpnProjectStatus(xpnProjectStatus)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    Project actualResponse = client.getXpnHostProject(project);
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
  public void getXpnHostProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.getXpnHostProject(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getXpnResourcesProjectsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    XpnResourceId resourcesElement = XpnResourceId.newBuilder().build();
    List<XpnResourceId> resources2 = Arrays.asList(resourcesElement);
    ProjectsGetXpnResources expectedResponse =
        ProjectsGetXpnResources.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllResources(resources2)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    GetXpnResourcesProjectsPagedResponse pagedListResponse =
        client.getXpnResourcesProjects(project);

    List<XpnResourceId> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResourcesList().get(0), resources.get(0));

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
  public void getXpnResourcesProjectsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.getXpnResourcesProjects(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listXpnHostsProjectsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Project itemsElement = Project.newBuilder().build();
    List<Project> items = Arrays.asList(itemsElement);
    XpnHostList expectedResponse =
        XpnHostList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    ProjectsListXpnHostsRequest projectsListXpnHostsRequestResource =
        ProjectsListXpnHostsRequest.newBuilder().build();

    ListXpnHostsProjectsPagedResponse pagedListResponse =
        client.listXpnHostsProjects(project, projectsListXpnHostsRequestResource);

    List<Project> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listXpnHostsProjectsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      ProjectsListXpnHostsRequest projectsListXpnHostsRequestResource =
          ProjectsListXpnHostsRequest.newBuilder().build();

      client.listXpnHostsProjects(project, projectsListXpnHostsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void moveDiskProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("moveDiskProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    DiskMoveRequest diskMoveRequestResource = DiskMoveRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client.moveDiskProjectAsync(project, diskMoveRequestResource).get();
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
  public void moveDiskProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      DiskMoveRequest diskMoveRequestResource = DiskMoveRequest.newBuilder().build();

      client.moveDiskProjectAsync(project, diskMoveRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void moveInstanceProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("moveInstanceProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    InstanceMoveRequest instanceMoveRequestResource = InstanceMoveRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client.moveInstanceProjectAsync(project, instanceMoveRequestResource).get();
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
  public void moveInstanceProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      InstanceMoveRequest instanceMoveRequestResource = InstanceMoveRequest.newBuilder().build();

      client.moveInstanceProjectAsync(project, instanceMoveRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setCommonInstanceMetadataProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setCommonInstanceMetadataProjectTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    Metadata metadataResource = Metadata.newBuilder().build();

    EmptyMessage actualResponse =
        client.setCommonInstanceMetadataProjectAsync(project, metadataResource).get();
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
  public void setCommonInstanceMetadataProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      Metadata metadataResource = Metadata.newBuilder().build();

      client.setCommonInstanceMetadataProjectAsync(project, metadataResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setDefaultNetworkTierProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setDefaultNetworkTierProjectTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    ProjectsSetDefaultNetworkTierRequest projectsSetDefaultNetworkTierRequestResource =
        ProjectsSetDefaultNetworkTierRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setDefaultNetworkTierProjectAsync(
                project, projectsSetDefaultNetworkTierRequestResource)
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
  public void setDefaultNetworkTierProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      ProjectsSetDefaultNetworkTierRequest projectsSetDefaultNetworkTierRequestResource =
          ProjectsSetDefaultNetworkTierRequest.newBuilder().build();

      client
          .setDefaultNetworkTierProjectAsync(project, projectsSetDefaultNetworkTierRequestResource)
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
  public void setUsageExportBucketProjectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setUsageExportBucketProjectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    UsageExportLocation usageExportLocationResource = UsageExportLocation.newBuilder().build();

    EmptyMessage actualResponse =
        client.setUsageExportBucketProjectAsync(project, usageExportLocationResource).get();
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
  public void setUsageExportBucketProjectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      UsageExportLocation usageExportLocationResource = UsageExportLocation.newBuilder().build();

      client.setUsageExportBucketProjectAsync(project, usageExportLocationResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
