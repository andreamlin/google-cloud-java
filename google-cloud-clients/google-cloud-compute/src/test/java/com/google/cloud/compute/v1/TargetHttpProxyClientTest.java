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

import static com.google.cloud.compute.v1.TargetHttpProxyClient.ListTargetHttpProxiesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub.deleteTargetHttpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub.getTargetHttpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub.insertTargetHttpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub.listTargetHttpProxiesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub.setUrlMapTargetHttpProxyMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings;
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
public class TargetHttpProxyClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteTargetHttpProxyMethodDescriptor,
              getTargetHttpProxyMethodDescriptor,
              insertTargetHttpProxyMethodDescriptor,
              listTargetHttpProxiesMethodDescriptor,
              setUrlMapTargetHttpProxyMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, TargetHttpProxyStubSettings.getDefaultEndpoint());

  private static TargetHttpProxyClient client;
  private static TargetHttpProxySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetHttpProxySettings.newBuilder()
            .setTransportChannelProvider(
                TargetHttpProxySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TargetHttpProxyClient.create(clientSettings);
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
  public void deleteTargetHttpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteTargetHttpProxyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalTargetHttpProxyName targetHttpProxy =
        ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

    EmptyMessage actualResponse = client.deleteTargetHttpProxyAsync(targetHttpProxy).get();
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
  public void deleteTargetHttpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetHttpProxyName targetHttpProxy =
          ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

      client.deleteTargetHttpProxyAsync(targetHttpProxy).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetHttpProxyTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
    TargetHttpProxy expectedResponse =
        TargetHttpProxy.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .setUrlMap(urlMap.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalTargetHttpProxyName targetHttpProxy =
        ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

    TargetHttpProxy actualResponse = client.getTargetHttpProxy(targetHttpProxy);
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
  public void getTargetHttpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetHttpProxyName targetHttpProxy =
          ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");

      client.getTargetHttpProxy(targetHttpProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetHttpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertTargetHttpProxyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertTargetHttpProxyAsync(project, targetHttpProxyResource).get();
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
  public void insertTargetHttpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();

      client.insertTargetHttpProxyAsync(project, targetHttpProxyResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetHttpProxiesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetHttpProxy itemsElement = TargetHttpProxy.newBuilder().build();
    List<TargetHttpProxy> items = Arrays.asList(itemsElement);
    TargetHttpProxyList expectedResponse =
        TargetHttpProxyList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListTargetHttpProxiesPagedResponse pagedListResponse = client.listTargetHttpProxies(project);

    List<TargetHttpProxy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listTargetHttpProxiesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listTargetHttpProxies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setUrlMapTargetHttpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setUrlMapTargetHttpProxyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectTargetHttpProxyName targetHttpProxy =
        ProjectTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
    UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();

    EmptyMessage actualResponse =
        client.setUrlMapTargetHttpProxyAsync(targetHttpProxy, urlMapReferenceResource).get();
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
  public void setUrlMapTargetHttpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectTargetHttpProxyName targetHttpProxy =
          ProjectTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
      UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();

      client.setUrlMapTargetHttpProxyAsync(targetHttpProxy, urlMapReferenceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
