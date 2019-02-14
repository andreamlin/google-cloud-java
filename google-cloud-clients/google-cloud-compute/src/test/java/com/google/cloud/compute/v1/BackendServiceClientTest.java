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

import static com.google.cloud.compute.v1.BackendServiceClient.AggregatedListBackendServicesPagedResponse;
import static com.google.cloud.compute.v1.BackendServiceClient.ListBackendServicesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.addSignedUrlKeyBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.aggregatedListBackendServicesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.deleteBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.deleteSignedUrlKeyBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.getBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.getHealthBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.insertBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.listBackendServicesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.patchBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.setSecurityPolicyBackendServiceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonBackendServiceStub.updateBackendServiceMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.BackendServiceStubSettings;
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
public class BackendServiceClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              addSignedUrlKeyBackendServiceMethodDescriptor,
              aggregatedListBackendServicesMethodDescriptor,
              deleteBackendServiceMethodDescriptor,
              deleteSignedUrlKeyBackendServiceMethodDescriptor,
              getBackendServiceMethodDescriptor,
              getHealthBackendServiceMethodDescriptor,
              insertBackendServiceMethodDescriptor,
              listBackendServicesMethodDescriptor,
              patchBackendServiceMethodDescriptor,
              setSecurityPolicyBackendServiceMethodDescriptor,
              updateBackendServiceMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, BackendServiceStubSettings.getDefaultEndpoint());

  private static BackendServiceClient client;
  private static BackendServiceSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        BackendServiceSettings.newBuilder()
            .setTransportChannelProvider(
                BackendServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BackendServiceClient.create(clientSettings);
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
  public void addSignedUrlKeyBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("addSignedUrlKeyBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
    SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();

    Void actualResponse =
        client.addSignedUrlKeyBackendServiceAsync(backendService, signedUrlKeyResource).get();
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
  public void addSignedUrlKeyBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
      SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();

      client.addSignedUrlKeyBackendServiceAsync(backendService, signedUrlKeyResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListBackendServicesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    BackendServicesScopedList itemsItem = BackendServicesScopedList.newBuilder().build();
    Map<String, BackendServicesScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    BackendServiceAggregatedList expectedResponse =
        BackendServiceAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListBackendServicesPagedResponse pagedListResponse =
        client.aggregatedListBackendServices(project);

    List<BackendServicesScopedList> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void aggregatedListBackendServicesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListBackendServices(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");

    Void actualResponse = client.deleteBackendServiceAsync(backendService).get();
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
  public void deleteBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");

      client.deleteBackendServiceAsync(backendService).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSignedUrlKeyBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteSignedUrlKeyBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
    String keyName = "keyName500938859";

    Void actualResponse =
        client.deleteSignedUrlKeyBackendServiceAsync(backendService, keyName).get();
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
  public void deleteSignedUrlKeyBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
      String keyName = "keyName500938859";

      client.deleteSignedUrlKeyBackendServiceAsync(backendService, keyName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getBackendServiceTest() {
    Integer affinityCookieTtlSec = 1777486694;
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    Boolean enableCDN = false;
    String fingerprint = "fingerprint-1375934236";
    String id = "id3355";
    String kind = "kind3292052";
    String loadBalancingScheme = "loadBalancingScheme1974502980";
    String name = "name3373707";
    Integer port = 3446913;
    String portName = "portName1115276169";
    String protocol = "protocol-989163880";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
    String selfLink = "selfLink-1691268851";
    String sessionAffinity = "sessionAffinity1000759473";
    Integer timeoutSec = 2067488653;
    BackendService expectedResponse =
        BackendService.newBuilder()
            .setAffinityCookieTtlSec(affinityCookieTtlSec)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setEnableCDN(enableCDN)
            .setFingerprint(fingerprint)
            .setId(id)
            .setKind(kind)
            .setLoadBalancingScheme(loadBalancingScheme)
            .setName(name)
            .setPort(port)
            .setPortName(portName)
            .setProtocol(protocol)
            .setRegion(region.toString())
            .setSecurityPolicy(securityPolicy.toString())
            .setSelfLink(selfLink)
            .setSessionAffinity(sessionAffinity)
            .setTimeoutSec(timeoutSec)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");

    BackendService actualResponse = client.getBackendService(backendService);
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
  public void getBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");

      client.getBackendService(backendService);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getHealthBackendServiceTest() {
    String kind = "kind3292052";
    BackendServiceGroupHealth expectedResponse =
        BackendServiceGroupHealth.newBuilder().setKind(kind).build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
    ResourceGroupReference resourceGroupReferenceResource =
        ResourceGroupReference.newBuilder().build();

    BackendServiceGroupHealth actualResponse =
        client.getHealthBackendService(backendService, resourceGroupReferenceResource);
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
  public void getHealthBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
      ResourceGroupReference resourceGroupReferenceResource =
          ResourceGroupReference.newBuilder().build();

      client.getHealthBackendService(backendService, resourceGroupReferenceResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("insertBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    BackendService backendServiceResource = BackendService.newBuilder().build();

    Void actualResponse = client.insertBackendServiceAsync(project, backendServiceResource).get();
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
  public void insertBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      BackendService backendServiceResource = BackendService.newBuilder().build();

      client.insertBackendServiceAsync(project, backendServiceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listBackendServicesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    BackendService itemsElement = BackendService.newBuilder().build();
    List<BackendService> items = Arrays.asList(itemsElement);
    BackendServiceList expectedResponse =
        BackendServiceList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListBackendServicesPagedResponse pagedListResponse = client.listBackendServices(project);

    List<BackendService> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listBackendServicesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listBackendServices(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("patchBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
    BackendService backendServiceResource = BackendService.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client.patchBackendServiceAsync(backendService, backendServiceResource, fieldMask).get();
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
  public void patchBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
      BackendService backendServiceResource = BackendService.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchBackendServiceAsync(backendService, backendServiceResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setSecurityPolicyBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setSecurityPolicyBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
    SecurityPolicyReference securityPolicyReferenceResource =
        SecurityPolicyReference.newBuilder().build();

    Void actualResponse =
        client
            .setSecurityPolicyBackendServiceAsync(backendService, securityPolicyReferenceResource)
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
  public void setSecurityPolicyBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
      SecurityPolicyReference securityPolicyReferenceResource =
          SecurityPolicyReference.newBuilder().build();

      client
          .setSecurityPolicyBackendServiceAsync(backendService, securityPolicyReferenceResource)
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
  public void updateBackendServiceTest() throws Exception {
    Void expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateBackendServiceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBackendServices.addResponse(resultOperation);

    ProjectGlobalBackendServiceName backendService =
        ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
    BackendService backendServiceResource = BackendService.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Void actualResponse =
        client.updateBackendServiceAsync(backendService, backendServiceResource, fieldMask).get();
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
  public void updateBackendServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalBackendServiceName backendService =
          ProjectGlobalBackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
      BackendService backendServiceResource = BackendService.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateBackendServiceAsync(backendService, backendServiceResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
