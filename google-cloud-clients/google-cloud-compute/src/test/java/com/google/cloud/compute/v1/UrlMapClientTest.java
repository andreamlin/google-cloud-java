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

import static com.google.cloud.compute.v1.UrlMapClient.ListUrlMapsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.deleteUrlMapMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.getUrlMapMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.insertUrlMapMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.invalidateCacheUrlMapMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.listUrlMapsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.patchUrlMapMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.updateUrlMapMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub.validateUrlMapMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.UrlMapStubSettings;
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
public class UrlMapClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteUrlMapMethodDescriptor,
              getUrlMapMethodDescriptor,
              insertUrlMapMethodDescriptor,
              invalidateCacheUrlMapMethodDescriptor,
              listUrlMapsMethodDescriptor,
              patchUrlMapMethodDescriptor,
              updateUrlMapMethodDescriptor,
              validateUrlMapMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, UrlMapStubSettings.getDefaultEndpoint());

  private static UrlMapClient client;
  private static UrlMapSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        UrlMapSettings.newBuilder()
            .setTransportChannelProvider(
                UrlMapSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = UrlMapClient.create(clientSettings);
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
  public void deleteUrlMapTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteUrlMapTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");

    EmptyMessage actualResponse = client.deleteUrlMapAsync(urlMap).get();
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
  public void deleteUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");

      client.deleteUrlMapAsync(urlMap).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getUrlMapTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String defaultService = "defaultService1980854967";
    String description = "description-1724546052";
    String fingerprint = "fingerprint-1375934236";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    UrlMap expectedResponse =
        UrlMap.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDefaultService(defaultService)
            .setDescription(description)
            .setFingerprint(fingerprint)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");

    UrlMap actualResponse = client.getUrlMap(urlMap);
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
  public void getUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");

      client.getUrlMap(urlMap);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertUrlMapTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertUrlMapTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    UrlMap urlMapResource = UrlMap.newBuilder().build();

    EmptyMessage actualResponse = client.insertUrlMapAsync(project, urlMapResource).get();
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
  public void insertUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      UrlMap urlMapResource = UrlMap.newBuilder().build();

      client.insertUrlMapAsync(project, urlMapResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void invalidateCacheUrlMapTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("invalidateCacheUrlMapTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
    CacheInvalidationRule cacheInvalidationRuleResource =
        CacheInvalidationRule.newBuilder().build();

    EmptyMessage actualResponse =
        client.invalidateCacheUrlMapAsync(urlMap, cacheInvalidationRuleResource).get();
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
  public void invalidateCacheUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
      CacheInvalidationRule cacheInvalidationRuleResource =
          CacheInvalidationRule.newBuilder().build();

      client.invalidateCacheUrlMapAsync(urlMap, cacheInvalidationRuleResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listUrlMapsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    UrlMap itemsElement = UrlMap.newBuilder().build();
    List<UrlMap> items = Arrays.asList(itemsElement);
    UrlMapList expectedResponse =
        UrlMapList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListUrlMapsPagedResponse pagedListResponse = client.listUrlMaps(project);

    List<UrlMap> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listUrlMapsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listUrlMaps(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchUrlMapTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchUrlMapTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
    UrlMap urlMapResource = UrlMap.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse = client.patchUrlMapAsync(urlMap, urlMapResource, fieldMask).get();
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
  public void patchUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
      UrlMap urlMapResource = UrlMap.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchUrlMapAsync(urlMap, urlMapResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateUrlMapTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("updateUrlMapTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
    UrlMap urlMapResource = UrlMap.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse = client.updateUrlMapAsync(urlMap, urlMapResource, fieldMask).get();
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
  public void updateUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
      UrlMap urlMapResource = UrlMap.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateUrlMapAsync(urlMap, urlMapResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void validateUrlMapTest() {
    UrlMapsValidateResponse expectedResponse = UrlMapsValidateResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
    UrlMapsValidateRequest urlMapsValidateRequestResource =
        UrlMapsValidateRequest.newBuilder().build();

    UrlMapsValidateResponse actualResponse =
        client.validateUrlMap(urlMap, urlMapsValidateRequestResource);
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
  public void validateUrlMapExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of("[PROJECT]", "[URL_MAP]");
      UrlMapsValidateRequest urlMapsValidateRequestResource =
          UrlMapsValidateRequest.newBuilder().build();

      client.validateUrlMap(urlMap, urlMapsValidateRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
