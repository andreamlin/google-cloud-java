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

import static com.google.cloud.compute.v1.TargetTcpProxyClient.ListTargetTcpProxiesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub.deleteTargetTcpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub.getTargetTcpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub.insertTargetTcpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub.listTargetTcpProxiesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub.setBackendServiceTargetTcpProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub.setProxyHeaderTargetTcpProxyMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings;
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
public class TargetTcpProxyClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteTargetTcpProxyMethodDescriptor,
              getTargetTcpProxyMethodDescriptor,
              insertTargetTcpProxyMethodDescriptor,
              listTargetTcpProxiesMethodDescriptor,
              setBackendServiceTargetTcpProxyMethodDescriptor,
              setProxyHeaderTargetTcpProxyMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, TargetTcpProxyStubSettings.getDefaultEndpoint());

  private static TargetTcpProxyClient client;
  private static TargetTcpProxySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetTcpProxySettings.newBuilder()
            .setTransportChannelProvider(
                TargetTcpProxySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TargetTcpProxyClient.create(clientSettings);
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
  public void deleteTargetTcpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteTargetTcpProxyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalTargetTcpProxyName targetTcpProxy =
        ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");

    EmptyMessage actualResponse = client.deleteTargetTcpProxyAsync(targetTcpProxy).get();
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
  public void deleteTargetTcpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetTcpProxyName targetTcpProxy =
          ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");

      client.deleteTargetTcpProxyAsync(targetTcpProxy).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetTcpProxyTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String proxyHeader = "proxyHeader-1987109506";
    String selfLink = "selfLink-1691268851";
    String service = "service1984153269";
    TargetTcpProxy expectedResponse =
        TargetTcpProxy.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setProxyHeader(proxyHeader)
            .setSelfLink(selfLink)
            .setService(service)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalTargetTcpProxyName targetTcpProxy =
        ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");

    TargetTcpProxy actualResponse = client.getTargetTcpProxy(targetTcpProxy);
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
  public void getTargetTcpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetTcpProxyName targetTcpProxy =
          ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");

      client.getTargetTcpProxy(targetTcpProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetTcpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertTargetTcpProxyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertTargetTcpProxyAsync(project, targetTcpProxyResource).get();
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
  public void insertTargetTcpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();

      client.insertTargetTcpProxyAsync(project, targetTcpProxyResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetTcpProxiesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetTcpProxy itemsElement = TargetTcpProxy.newBuilder().build();
    List<TargetTcpProxy> items = Arrays.asList(itemsElement);
    TargetTcpProxyList expectedResponse =
        TargetTcpProxyList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListTargetTcpProxiesPagedResponse pagedListResponse = client.listTargetTcpProxies(project);

    List<TargetTcpProxy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listTargetTcpProxiesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listTargetTcpProxies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setBackendServiceTargetTcpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setBackendServiceTargetTcpProxyTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectGlobalTargetTcpProxyName targetTcpProxy =
        ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
    TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource =
        TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setBackendServiceTargetTcpProxyAsync(
                targetTcpProxy, targetTcpProxiesSetBackendServiceRequestResource)
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
  public void setBackendServiceTargetTcpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetTcpProxyName targetTcpProxy =
          ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
      TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource =
          TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();

      client
          .setBackendServiceTargetTcpProxyAsync(
              targetTcpProxy, targetTcpProxiesSetBackendServiceRequestResource)
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
  public void setProxyHeaderTargetTcpProxyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setProxyHeaderTargetTcpProxyTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectGlobalTargetTcpProxyName targetTcpProxy =
        ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
    TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource =
        TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setProxyHeaderTargetTcpProxyAsync(
                targetTcpProxy, targetTcpProxiesSetProxyHeaderRequestResource)
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
  public void setProxyHeaderTargetTcpProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetTcpProxyName targetTcpProxy =
          ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
      TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource =
          TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();

      client
          .setProxyHeaderTargetTcpProxyAsync(
              targetTcpProxy, targetTcpProxiesSetProxyHeaderRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
