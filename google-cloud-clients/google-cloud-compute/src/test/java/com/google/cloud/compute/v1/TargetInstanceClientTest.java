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

import static com.google.cloud.compute.v1.TargetInstanceClient.AggregatedListTargetInstancesPagedResponse;
import static com.google.cloud.compute.v1.TargetInstanceClient.ListTargetInstancesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub.aggregatedListTargetInstancesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub.deleteTargetInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub.getTargetInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub.insertTargetInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub.listTargetInstancesMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.TargetInstanceStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class TargetInstanceClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              aggregatedListTargetInstancesMethodDescriptor,
              deleteTargetInstanceMethodDescriptor,
              getTargetInstanceMethodDescriptor,
              insertTargetInstanceMethodDescriptor,
              listTargetInstancesMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, TargetInstanceStubSettings.getDefaultEndpoint());

  private static TargetInstanceClient client;
  private static TargetInstanceSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        TargetInstanceSettings.newBuilder()
            .setTransportChannelProvider(
                TargetInstanceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TargetInstanceClient.create(clientSettings);
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
  public void aggregatedListTargetInstancesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetInstancesScopedList itemsItem = TargetInstancesScopedList.newBuilder().build();
    Map<String, TargetInstancesScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    TargetInstanceAggregatedList expectedResponse =
        TargetInstanceAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListTargetInstancesPagedResponse pagedListResponse =
        client.aggregatedListTargetInstances(project);

    List<TargetInstancesScopedList> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void aggregatedListTargetInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListTargetInstances(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTargetInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteTargetInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneTargetInstanceName targetInstance =
        ProjectZoneTargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

    EmptyMessage actualResponse = client.deleteTargetInstanceAsync(targetInstance).get();
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
  public void deleteTargetInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneTargetInstanceName targetInstance =
          ProjectZoneTargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

      client.deleteTargetInstanceAsync(targetInstance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTargetInstanceTest() {
    String creationTimestamp = "creationTimestamp567396278";
    String description = "description-1724546052";
    String id = "id3355";
    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String kind = "kind3292052";
    String name = "name3373707";
    String natPolicy = "natPolicy-1637703152";
    String selfLink = "selfLink-1691268851";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    TargetInstance expectedResponse =
        TargetInstance.newBuilder()
            .setCreationTimestamp(creationTimestamp)
            .setDescription(description)
            .setId(id)
            .setInstance(instance.toString())
            .setKind(kind)
            .setName(name)
            .setNatPolicy(natPolicy)
            .setSelfLink(selfLink)
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneTargetInstanceName targetInstance =
        ProjectZoneTargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

    TargetInstance actualResponse = client.getTargetInstance(targetInstance);
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
  public void getTargetInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneTargetInstanceName targetInstance =
          ProjectZoneTargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");

      client.getTargetInstance(targetInstance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertTargetInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertTargetInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    TargetInstance targetInstanceResource = TargetInstance.newBuilder().build();

    EmptyMessage actualResponse =
        client.insertTargetInstanceAsync(zone, targetInstanceResource).get();
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
  public void insertTargetInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      TargetInstance targetInstanceResource = TargetInstance.newBuilder().build();

      client.insertTargetInstanceAsync(zone, targetInstanceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTargetInstancesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    TargetInstance itemsElement = TargetInstance.newBuilder().build();
    List<TargetInstance> items = Arrays.asList(itemsElement);
    TargetInstanceList expectedResponse =
        TargetInstanceList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

    ListTargetInstancesPagedResponse pagedListResponse = client.listTargetInstances(zone);

    List<TargetInstance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listTargetInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

      client.listTargetInstances(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
