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

import static com.google.cloud.compute.v1.LicenseClient.ListLicensesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.deleteLicenseMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.getIamPolicyLicenseMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.getLicenseMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.insertLicenseMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.listLicensesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.setIamPolicyLicenseMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonLicenseStub.testIamPermissionsLicenseMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.LicenseStubSettings;
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
public class LicenseClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteLicenseMethodDescriptor,
              getLicenseMethodDescriptor,
              getIamPolicyLicenseMethodDescriptor,
              insertLicenseMethodDescriptor,
              listLicensesMethodDescriptor,
              setIamPolicyLicenseMethodDescriptor,
              testIamPermissionsLicenseMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, LicenseStubSettings.getDefaultEndpoint());

  private static LicenseClient client;
  private static LicenseSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        LicenseSettings.newBuilder()
            .setTransportChannelProvider(
                LicenseSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LicenseClient.create(clientSettings);
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
  public void deleteLicenseTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteLicenseTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of("[PROJECT]", "[LICENSE]");

    EmptyMessage actualResponse = client.deleteLicenseAsync(license).get();
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
  public void deleteLicenseExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of("[PROJECT]", "[LICENSE]");

      client.deleteLicenseAsync(license).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getLicenseTest() {
    Boolean chargesUseFee = true;
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    String kind = "kind3292052";
    ProjectGlobalLicenseCodeName licenseCode =
        ProjectGlobalLicenseCodeName.of("[PROJECT]", "[LICENSE_CODE]");
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    Boolean transferable = false;
    License expectedResponse =
        License.newBuilder()
            .setChargesUseFee(chargesUseFee)
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setKind(kind)
            .setLicenseCode(licenseCode.toString())
            .setName(name)
            .setSelfLink(selfLink)
            .setTransferable(transferable)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of("[PROJECT]", "[LICENSE]");

    License actualResponse = client.getLicense(license);
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
  public void getLicenseExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalLicenseName license = ProjectGlobalLicenseName.of("[PROJECT]", "[LICENSE]");

      client.getLicense(license);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getIamPolicyLicenseTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalLicenseResourceName resource =
        ProjectGlobalLicenseResourceName.of("[PROJECT]", "[RESOURCE]");

    Policy actualResponse = client.getIamPolicyLicense(resource);
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
  public void getIamPolicyLicenseExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalLicenseResourceName resource =
          ProjectGlobalLicenseResourceName.of("[PROJECT]", "[RESOURCE]");

      client.getIamPolicyLicense(resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertLicenseTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertLicenseTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    License licenseResource = License.newBuilder().build();

    EmptyMessage actualResponse = client.insertLicenseAsync(project, licenseResource).get();
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
  public void insertLicenseExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      License licenseResource = License.newBuilder().build();

      client.insertLicenseAsync(project, licenseResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listLicensesTest() {
    String id = "id3355";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    License itemsElement = License.newBuilder().build();
    List<License> items = Arrays.asList(itemsElement);
    LicensesListResponse expectedResponse =
        LicensesListResponse.newBuilder()
            .setId(id)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListLicensesPagedResponse pagedListResponse = client.listLicenses(project);

    List<License> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listLicensesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listLicenses(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setIamPolicyLicenseTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalLicenseResourceName resource =
        ProjectGlobalLicenseResourceName.of("[PROJECT]", "[RESOURCE]");
    GlobalSetPolicyRequest globalSetPolicyRequestResource =
        GlobalSetPolicyRequest.newBuilder().build();

    Policy actualResponse = client.setIamPolicyLicense(resource, globalSetPolicyRequestResource);
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
  public void setIamPolicyLicenseExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalLicenseResourceName resource =
          ProjectGlobalLicenseResourceName.of("[PROJECT]", "[RESOURCE]");
      GlobalSetPolicyRequest globalSetPolicyRequestResource =
          GlobalSetPolicyRequest.newBuilder().build();

      client.setIamPolicyLicense(resource, globalSetPolicyRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsLicenseTest() {
    TestPermissionsResponse expectedResponse = TestPermissionsResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalLicenseResourceName resource =
        ProjectGlobalLicenseResourceName.of("[PROJECT]", "[RESOURCE]");
    TestPermissionsRequest testPermissionsRequestResource =
        TestPermissionsRequest.newBuilder().build();

    TestPermissionsResponse actualResponse =
        client.testIamPermissionsLicense(resource, testPermissionsRequestResource);
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
  public void testIamPermissionsLicenseExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalLicenseResourceName resource =
          ProjectGlobalLicenseResourceName.of("[PROJECT]", "[RESOURCE]");
      TestPermissionsRequest testPermissionsRequestResource =
          TestPermissionsRequest.newBuilder().build();

      client.testIamPermissionsLicense(resource, testPermissionsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
