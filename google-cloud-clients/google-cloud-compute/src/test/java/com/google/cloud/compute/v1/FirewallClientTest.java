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

import static com.google.cloud.compute.v1.FirewallClient.ListFirewallsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonFirewallStub.deleteFirewallMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonFirewallStub.getFirewallMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonFirewallStub.insertFirewallMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonFirewallStub.listFirewallsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonFirewallStub.patchFirewallMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonFirewallStub.updateFirewallMethodDescriptor;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.compute.longrunning.ComputeOperationSnapshot;
import com.google.cloud.compute.longrunning.ComputeOperationSnapshot.Status;
import com.google.cloud.compute.v1.stub.FirewallStubSettings;
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
public class FirewallClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteFirewallMethodDescriptor,
              getFirewallMethodDescriptor,
              insertFirewallMethodDescriptor,
              listFirewallsMethodDescriptor,
              patchFirewallMethodDescriptor,
              updateFirewallMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, FirewallStubSettings.getDefaultEndpoint());

  private static FirewallClient client;
  private static FirewallSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        FirewallSettings.newBuilder()
            .setTransportChannelProvider(
                FirewallSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FirewallClient.create(clientSettings);
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
  public void deleteFirewallTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation = Operation.newBuilder()
        .setName("deleteFirewallTest")
        .setStatus(Status.DONE.toString())
        .build();
    // mockService.addNullResponse();
    mockService.addResponse(resultOperation);

    ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");

    EmptyMessage actualResponse = client.deleteFirewallAsync(firewall).get();
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
  public void deleteFirewallExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");

      client.deleteFirewallAsync(firewall).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getFirewallTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String direction = "direction-962590849";
    Boolean disabled = true;
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of("[PROJECT]", "[NETWORK]");
    Integer priority = 1165461084;
    String selfLink = "selfLink-1691268851";
    Firewall expectedResponse =
        Firewall.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setDirection(direction)
            .setDisabled(disabled)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setNetwork(network.toString())
            .setPriority(priority)
            .setSelfLink(selfLink)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");

    Firewall actualResponse = client.getFirewall(firewall);
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
  public void getFirewallExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");

      client.getFirewall(firewall);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertFirewallTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation = Operation.newBuilder().setName("insertFirewallTest").build();
    mockService.addNullResponse();

    ProjectName project = ProjectName.of("[PROJECT]");
    Firewall firewallResource = Firewall.newBuilder().build();

    EmptyMessage actualResponse = client.insertFirewallAsync(project, firewallResource).get();
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
  public void insertFirewallExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      Firewall firewallResource = Firewall.newBuilder().build();

      client.insertFirewallAsync(project, firewallResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listFirewallsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Firewall itemsElement = Firewall.newBuilder().build();
    List<Firewall> items = Arrays.asList(itemsElement);
    FirewallList expectedResponse =
        FirewallList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListFirewallsPagedResponse pagedListResponse = client.listFirewalls(project);

    List<Firewall> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listFirewallsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listFirewalls(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchFirewallTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation = Operation.newBuilder().setName("patchFirewallTest").build();
    mockService.addNullResponse();

    ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");
    Firewall firewallResource = Firewall.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.patchFirewallAsync(firewall, firewallResource, fieldMask).get();
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
  public void patchFirewallExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");
      Firewall firewallResource = Firewall.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchFirewallAsync(firewall, firewallResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateFirewallTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation = Operation.newBuilder().setName("updateFirewallTest").build();
    mockService.addNullResponse();

    ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");
    Firewall firewallResource = Firewall.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.updateFirewallAsync(firewall, firewallResource, fieldMask).get();
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
  public void updateFirewallExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of("[PROJECT]", "[FIREWALL]");
      Firewall firewallResource = Firewall.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateFirewallAsync(firewall, firewallResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
