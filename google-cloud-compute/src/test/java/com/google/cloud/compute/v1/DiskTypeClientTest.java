/*
 * Copyright 2018 Google LLC
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

import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import static com.google.cloud.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import static com.google.cloud.compute.v1.DiskTypeClient.ListDiskTypesPagedResponse;
import com.google.cloud.compute.v1.stub.DiskTypeStubSettings;
import static com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub.aggregatedListDiskTypesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub.getDiskTypeMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub.listDiskTypesMethodDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class DiskTypeClientTest {

   private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS = ImmutableList.copyOf(
        Lists.<ApiMethodDescriptor>newArrayList(
          aggregatedListDiskTypesMethodDescriptor,
          getDiskTypeMethodDescriptor,
          listDiskTypesMethodDescriptor
        ));
  private static final MockHttpService mockService
      = new MockHttpService(METHOD_DESCRIPTORS, DiskTypeStubSettings.getDefaultEndpoint());

  private static DiskTypeClient client;
  private static DiskTypeSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        DiskTypeSettings.newBuilder()
           .setTransportChannelProvider(
               DiskTypeSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build()).build();
    client =
       DiskTypeClient.create(clientSettings);
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
  public void aggregatedListDiskTypesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    DiskType diskTypesElement = DiskType.newBuilder().setDefaultDiskSizeGb("350").build();
    List<DiskType> diskTypes = Arrays.asList(diskTypesElement);
    DiskTypesScopedList items = DiskTypesScopedList.newBuilder()
      .addAllDiskTypes(diskTypes)
      .build();
    DiskTypeAggregatedList expectedResponse = DiskTypeAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(ImmutableMap.of("diskRegion", items))
      .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListDiskTypesPagedResponse pagedListResponse = client.aggregatedListDiskTypes(project);

    List<DiskType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().values().iterator().next().getDiskTypesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =  mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListDiskTypesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListDiskTypes(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskTypeTest() {
    String defaultDiskSizeGb = "defaultDiskSizeGb807490165";
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String validDiskSize = "validDiskSize-1653521184";
    String selfLink = "selfLink-1691268851";
    DiskType expectedResponse = DiskType.newBuilder()
      .setDefaultDiskSizeGb(defaultDiskSizeGb)
      .setZone(zone.toString())
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setId(id)
      .setValidDiskSize(validDiskSize)
      .setSelfLink(selfLink)
      .build();
    mockService.addResponse(expectedResponse);

    DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");

    DiskType actualResponse =
        client.getDiskType(diskType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =  mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskTypeExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");

      client.getDiskType(diskType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listDiskTypesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    DiskType itemsElement = DiskType.newBuilder().build();
    List<DiskType> items = Arrays.asList(itemsElement);
    DiskTypeList expectedResponse = DiskTypeList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListDiskTypesPagedResponse pagedListResponse = client.listDiskTypes(zone);

    List<DiskType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =  mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listDiskTypesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listDiskTypes(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}