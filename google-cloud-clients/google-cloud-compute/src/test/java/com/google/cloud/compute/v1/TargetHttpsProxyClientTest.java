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

import static com.google.cloud.compute.v1.TargetHttpsProxyClient.ListTargetHttpsProxiesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.deleteTargetHttpsProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.getTargetHttpsProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.insertTargetHttpsProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.listTargetHttpsProxiesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.setQuicOverrideTargetHttpsProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.setSslCertificatesTargetHttpsProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.setSslPolicyTargetHttpsProxyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub.setUrlMapTargetHttpsProxyMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings;
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
public class TargetHttpsProxyClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteTargetHttpsProxyMethodDescriptor,
              getTargetHttpsProxyMethodDescriptor,
              insertTargetHttpsProxyMethodDescriptor,
              listTargetHttpsProxiesMethodDescriptor,
              setQuicOverrideTargetHttpsProxyMethodDescriptor,
              setSslCertificatesTargetHttpsProxyMethodDescriptor,
              setSslPolicyTargetHttpsProxyMethodDescriptor,
              setUrlMapTargetHttpsProxyMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, TargetHttpsProxyStubSettings.getDefaultEndpoint());

  private static TargetHttpsProxyClient client;
  private static TargetHttpsProxySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetHttpsProxySettings.newBuilder()
            .setTransportChannelProvider(
                TargetHttpsProxySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TargetHttpsProxyClient.create(clientSettings);
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
  public void deleteTargetHttpsProxyTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteTargetHttpsProxyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTargetHttpsProxies.addResponse(resultOperation);

    ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
        ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

    Void actualResponse = client.deleteTargetHttpsProxyAsync(targetHttpsProxy).get();
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
  public void deleteTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
          ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

      client.deleteTargetHttpsProxyAsync(targetHttpsProxy).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetHttpsProxyTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String quicOverride = "quicOverride2067189933";
    String selfLink = "selfLink-1691268851";
    ProjectGlobalSslPolicyName sslPolicy =
        ProjectGlobalSslPolicyName.of("[PROJECT]", "[SSL_POLICY]");
    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
    TargetHttpsProxy expectedResponse =
        TargetHttpsProxy.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setQuicOverride(quicOverride)
            .setSelfLink(selfLink)
            .setSslPolicy(sslPolicy.toString())
            .setUrlMap(urlMap.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
        ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

    TargetHttpsProxy actualResponse = client.getTargetHttpsProxy(targetHttpsProxy);
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
  public void getTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
          ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");

      client.getTargetHttpsProxy(targetHttpsProxy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetHttpsProxyTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertTargetHttpsProxyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTargetHttpsProxies.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();

    Void actualResponse =
        client.insertTargetHttpsProxyAsync(project, targetHttpsProxyResource).get();
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
  public void insertTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();

      client.insertTargetHttpsProxyAsync(project, targetHttpsProxyResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetHttpsProxiesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetHttpsProxy itemsElement = TargetHttpsProxy.newBuilder().build();
    List<TargetHttpsProxy> items = Arrays.asList(itemsElement);
    TargetHttpsProxyList expectedResponse =
        TargetHttpsProxyList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListTargetHttpsProxiesPagedResponse pagedListResponse = client.listTargetHttpsProxies(project);

    List<TargetHttpsProxy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listTargetHttpsProxiesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listTargetHttpsProxies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setQuicOverrideTargetHttpsProxyTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setQuicOverrideTargetHttpsProxyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTargetHttpsProxies.addResponse(resultOperation);

    ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
        ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
    TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource =
        TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();

    Void actualResponse =
        client
            .setQuicOverrideTargetHttpsProxyAsync(
                targetHttpsProxy, targetHttpsProxiesSetQuicOverrideRequestResource)
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
  public void setQuicOverrideTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
          ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
      TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource =
          TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();

      client
          .setQuicOverrideTargetHttpsProxyAsync(
              targetHttpsProxy, targetHttpsProxiesSetQuicOverrideRequestResource)
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
  public void setSslCertificatesTargetHttpsProxyTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setSslCertificatesTargetHttpsProxyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTargetHttpsProxies.addResponse(resultOperation);

    ProjectTargetHttpsProxyName targetHttpsProxy =
        ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
    TargetHttpsProxiesSetSslCertificatesRequest
        targetHttpsProxiesSetSslCertificatesRequestResource =
            TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();

    Void actualResponse =
        client
            .setSslCertificatesTargetHttpsProxyAsync(
                targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequestResource)
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
  public void setSslCertificatesTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectTargetHttpsProxyName targetHttpsProxy =
          ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
      TargetHttpsProxiesSetSslCertificatesRequest
          targetHttpsProxiesSetSslCertificatesRequestResource =
              TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();

      client
          .setSslCertificatesTargetHttpsProxyAsync(
              targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequestResource)
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
  public void setSslPolicyTargetHttpsProxyTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setSslPolicyTargetHttpsProxyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTargetHttpsProxies.addResponse(resultOperation);

    ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
        ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
    SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();

    Void actualResponse =
        client
            .setSslPolicyTargetHttpsProxyAsync(targetHttpsProxy, sslPolicyReferenceResource)
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
  public void setSslPolicyTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy =
          ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
      SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();

      client.setSslPolicyTargetHttpsProxyAsync(targetHttpsProxy, sslPolicyReferenceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setUrlMapTargetHttpsProxyTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setUrlMapTargetHttpsProxyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTargetHttpsProxies.addResponse(resultOperation);

    ProjectTargetHttpsProxyName targetHttpsProxy =
        ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
    UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();

    Void actualResponse =
        client.setUrlMapTargetHttpsProxyAsync(targetHttpsProxy, urlMapReferenceResource).get();
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
  public void setUrlMapTargetHttpsProxyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectTargetHttpsProxyName targetHttpsProxy =
          ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
      UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();

      client.setUrlMapTargetHttpsProxyAsync(targetHttpsProxy, urlMapReferenceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
