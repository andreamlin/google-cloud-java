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

import static com.google.cloud.compute.v1.InterconnectClient.ListInterconnectsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub.deleteInterconnectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub.getDiagnosticsInterconnectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub.getInterconnectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub.insertInterconnectMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub.listInterconnectsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub.patchInterconnectMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.InterconnectStubSettings;
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
public class InterconnectClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              deleteInterconnectMethodDescriptor,
              getInterconnectMethodDescriptor,
              getDiagnosticsInterconnectMethodDescriptor,
              insertInterconnectMethodDescriptor,
              listInterconnectsMethodDescriptor,
              patchInterconnectMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, InterconnectStubSettings.getDefaultEndpoint());

  private static InterconnectClient client;
  private static InterconnectSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        InterconnectSettings.newBuilder()
            .setTransportChannelProvider(
                InterconnectSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = InterconnectClient.create(clientSettings);
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
  public void deleteInterconnectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteInterconnectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalInterconnectName interconnect =
        ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");

    EmptyMessage actualResponse = client.deleteInterconnectAsync(interconnect).get();
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
  public void deleteInterconnectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalInterconnectName interconnect =
          ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");

      client.deleteInterconnectAsync(interconnect).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInterconnectTest() {
    Boolean adminEnabled = false;
    String creationTimestamp = "creationTimestamp567396278";
    String customerName = "customerName-2143818164";
    String description = "description-1724546052";
    String googleIpAddress = "googleIpAddress1516847778";
    String googleReferenceId = "googleReferenceId534944469";
    String id = "id3355";
    String interconnectType = "interconnectType2125777995";
    String kind = "kind3292052";
    String linkType = "linkType-1624275873";
    String location = "location1901043637";
    String name = "name3373707";
    String nocContactEmail = "nocContactEmail1087814656";
    String operationalStatus = "operationalStatus1274812671";
    String peerIpAddress = "peerIpAddress-1939747879";
    Integer provisionedLinkCount = 1199724171;
    Integer requestedLinkCount = 1118793211;
    String selfLink = "selfLink-1691268851";
    String state = "state109757585";
    Interconnect expectedResponse =
        Interconnect.newBuilder()
            .setAdminEnabled(adminEnabled)
            .setCreationTimestamp(creationTimestamp)
            .setCustomerName(customerName)
            .setDescription(description)
            .setGoogleIpAddress(googleIpAddress)
            .setGoogleReferenceId(googleReferenceId)
            .setId(id)
            .setInterconnectType(interconnectType)
            .setKind(kind)
            .setLinkType(linkType)
            .setLocation(location)
            .setName(name)
            .setNocContactEmail(nocContactEmail)
            .setOperationalStatus(operationalStatus)
            .setPeerIpAddress(peerIpAddress)
            .setProvisionedLinkCount(provisionedLinkCount)
            .setRequestedLinkCount(requestedLinkCount)
            .setSelfLink(selfLink)
            .setState(state)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalInterconnectName interconnect =
        ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");

    Interconnect actualResponse = client.getInterconnect(interconnect);
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
  public void getInterconnectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalInterconnectName interconnect =
          ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");

      client.getInterconnect(interconnect);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getDiagnosticsInterconnectTest() {
    InterconnectsGetDiagnosticsResponse expectedResponse =
        InterconnectsGetDiagnosticsResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectGlobalInterconnectName interconnect =
        ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");

    InterconnectsGetDiagnosticsResponse actualResponse =
        client.getDiagnosticsInterconnect(interconnect);
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
  public void getDiagnosticsInterconnectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalInterconnectName interconnect =
          ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");

      client.getDiagnosticsInterconnect(interconnect);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInterconnectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertInterconnectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectName project = ProjectName.of("[PROJECT]");
    Interconnect interconnectResource = Interconnect.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertInterconnectAsync(project, interconnectResource).get();
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
  public void insertInterconnectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      Interconnect interconnectResource = Interconnect.newBuilder().build();

      client.insertInterconnectAsync(project, interconnectResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInterconnectsTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Interconnect itemsElement = Interconnect.newBuilder().build();
    List<Interconnect> items = Arrays.asList(itemsElement);
    InterconnectList expectedResponse =
        InterconnectList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListInterconnectsPagedResponse pagedListResponse = client.listInterconnects(project);

    List<Interconnect> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listInterconnectsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listInterconnects(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchInterconnectTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("patchInterconnectTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectGlobalInterconnectName interconnect =
        ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");
    Interconnect interconnectResource = Interconnect.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client.patchInterconnectAsync(interconnect, interconnectResource, fieldMask).get();
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
  public void patchInterconnectExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectGlobalInterconnectName interconnect =
          ProjectGlobalInterconnectName.of("[PROJECT]", "[INTERCONNECT]");
      Interconnect interconnectResource = Interconnect.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchInterconnectAsync(interconnect, interconnectResource, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
