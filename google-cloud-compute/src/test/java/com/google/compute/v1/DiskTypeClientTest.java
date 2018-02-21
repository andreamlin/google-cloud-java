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
package com.google.compute.v1;

import com.google.api.gax.httpjson.MockHttpService;
import com.google.api.gax.paging.PagedListResponse;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.common.collect.Lists;
import static com.google.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import static com.google.compute.v1.DiskTypeClient.ListDiskTypesPagedResponse;
import static com.google.compute.v1.stub.HttpJsonDiskTypeStub.aggregatedListDiskTypesMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskTypeStub.getDiskTypeMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonDiskTypeStub.listDiskTypesMethodDescriptor;
import com.google.protobuf.GeneratedMessageV3;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class DiskTypeClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static DiskTypeClient client;
  private static DiskTypeSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        DiskTypeSettings.newBuilder()
           .setTransportChannelProvider(
               DiskTypeSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       DiskTypeClient.create(clientSettings);
  }

  @After
  public void cleanUp() {
    MOCK_SERVICE.reset();
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
    DiskType diskTypes = DiskType.newBuilder().build();
    DiskTypesScopedList items = DiskTypesScopedList.newBuilder()
      .addAllDiskTypes(diskTypes)
      .build();
    DiskTypeAggregatedList expectedResponse = DiskTypeAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(aggregatedListDiskTypesMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListDiskTypesPagedResponse pagedListResponse = client.aggregatedListDiskTypes(project);

    List<DiskType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDiskTypes().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListDiskTypesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListDiskTypesMethodDescriptor);

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
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getDiskTypeMethodDescriptor);

    DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");

    DiskType actualResponse =
        client.getDiskType(diskType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getDiskTypeExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getDiskTypeMethodDescriptor);

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
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listDiskTypesMethodDescriptor);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListDiskTypesPagedResponse pagedListResponse = client.listDiskTypes(zone);

    List<DiskType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listDiskTypesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listDiskTypesMethodDescriptor);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listDiskTypes(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}