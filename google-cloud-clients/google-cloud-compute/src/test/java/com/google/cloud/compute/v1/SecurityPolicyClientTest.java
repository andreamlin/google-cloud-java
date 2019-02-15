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

import static com.google.cloud.compute.v1.SecurityPolicyClient.ListSecurityPoliciesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.addRuleSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.deleteSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.getRuleSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.getSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.insertSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.listSecurityPoliciesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.patchRuleSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.patchSecurityPolicyMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub.removeRuleSecurityPolicyMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings;
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
public class SecurityPolicyClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              addRuleSecurityPolicyMethodDescriptor,
              deleteSecurityPolicyMethodDescriptor,
              getSecurityPolicyMethodDescriptor,
              getRuleSecurityPolicyMethodDescriptor,
              insertSecurityPolicyMethodDescriptor,
              listSecurityPoliciesMethodDescriptor,
              patchSecurityPolicyMethodDescriptor,
              patchRuleSecurityPolicyMethodDescriptor,
              removeRuleSecurityPolicyMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, SecurityPolicyStubSettings.getDefaultEndpoint());

  private static SecurityPolicyClient client;
  private static SecurityPolicySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        SecurityPolicySettings.newBuilder()
            .setTransportChannelProvider(
                SecurityPolicySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SecurityPolicyClient.create(clientSettings);
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
  public void addRuleSecurityPolicyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("addRuleSecurityPolicyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
    SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();

    EmptyMessage actualResponse =
        client.addRuleSecurityPolicyAsync(securityPolicy, securityPolicyRuleResource).get();
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
  public void addRuleSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
      SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();

      client.addRuleSecurityPolicyAsync(securityPolicy, securityPolicyRuleResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSecurityPolicyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteSecurityPolicyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

    EmptyMessage actualResponse = client.deleteSecurityPolicyAsync(securityPolicy).get();
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
  public void deleteSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

      client.deleteSecurityPolicyAsync(securityPolicy).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSecurityPolicyTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String fingerprint = "fingerprint-1375934236";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    SecurityPolicy expectedResponse =
        SecurityPolicy.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setFingerprint(fingerprint)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setSelfLink(selfLink)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

    SecurityPolicy actualResponse = client.getSecurityPolicy(securityPolicy);
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
  public void getSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

      client.getSecurityPolicy(securityPolicy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getRuleSecurityPolicyTest() {
    String action = "action-1422950858";
    String description = "description-1724546052";
    String kind = "kind3292052";
    Boolean preview = true;
    Integer priority2 = 978365527;
    SecurityPolicyRule expectedResponse =
        SecurityPolicyRule.newBuilder()
            .setAction(action)
            .setDescription(description)
            .setKind(kind)
            .setPreview(preview)
            .setPriority(priority2)
            .build();
    mockService.addResponse(expectedResponse);

    Integer priority = 1165461084;
    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

    SecurityPolicyRule actualResponse = client.getRuleSecurityPolicy(priority, securityPolicy);
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
  public void getRuleSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Integer priority = 1165461084;
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

      client.getRuleSecurityPolicy(priority, securityPolicy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertSecurityPolicyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertSecurityPolicyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertSecurityPolicyAsync(project, securityPolicyResource).get();
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
  public void insertSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();

      client.insertSecurityPolicyAsync(project, securityPolicyResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listSecurityPoliciesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    SecurityPolicy itemsElement = SecurityPolicy.newBuilder().build();
    List<SecurityPolicy> items = Arrays.asList(itemsElement);
    SecurityPolicyList expectedResponse =
        SecurityPolicyList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListSecurityPoliciesPagedResponse pagedListResponse = client.listSecurityPolicies(project);

    List<SecurityPolicy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listSecurityPoliciesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listSecurityPolicies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchSecurityPolicyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchSecurityPolicyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
    SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.patchSecurityPolicyAsync(securityPolicy, securityPolicyResource, fieldMask).get();
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
  public void patchSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
      SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchSecurityPolicyAsync(securityPolicy, securityPolicyResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchRuleSecurityPolicyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchRuleSecurityPolicyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    Integer priority = 1165461084;
    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
    SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .patchRuleSecurityPolicyAsync(priority, securityPolicy, securityPolicyRuleResource)
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
  public void patchRuleSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Integer priority = 1165461084;
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
      SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();

      client
          .patchRuleSecurityPolicyAsync(priority, securityPolicy, securityPolicyRuleResource)
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
  public void removeRuleSecurityPolicyTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("removeRuleSecurityPolicyTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    Integer priority = 1165461084;
    ProjectGlobalSecurityPolicyName securityPolicy =
        ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

    EmptyMessage actualResponse =
        client.removeRuleSecurityPolicyAsync(priority, securityPolicy).get();
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
  public void removeRuleSecurityPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Integer priority = 1165461084;
      ProjectGlobalSecurityPolicyName securityPolicy =
          ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");

      client.removeRuleSecurityPolicyAsync(priority, securityPolicy).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
