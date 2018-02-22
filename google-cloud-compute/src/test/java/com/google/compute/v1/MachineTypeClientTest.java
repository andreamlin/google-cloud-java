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
import static com.google.compute.v1.MachineTypeClient.AggregatedListMachineTypesPagedResponse;
import static com.google.compute.v1.MachineTypeClient.ListMachineTypesPagedResponse;
import static com.google.compute.v1.stub.HttpJsonMachineTypeStub.aggregatedListMachineTypesMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonMachineTypeStub.getMachineTypeMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonMachineTypeStub.listMachineTypesMethodDescriptor;
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
public class MachineTypeClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static MachineTypeClient client;
  private static MachineTypeSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        MachineTypeSettings.newBuilder()
           .setTransportChannelProvider(
               MachineTypeSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       MachineTypeClient.create(clientSettings);
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
  public void aggregatedListMachineTypesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    MachineType machineTypesElement = MachineType.newBuilder().build();
    List<MachineType> machineTypes = Arrays.asList(machineTypesElement);
    MachineTypesScopedList items = MachineTypesScopedList.newBuilder()
      .addAllMachineTypes(machineTypes)
      .build();
    MachineTypeAggregatedList expectedResponse = MachineTypeAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(aggregatedListMachineTypesMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListMachineTypesPagedResponse pagedListResponse = client.aggregatedListMachineTypes(project);

    List<MachineType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().getMachineTypes().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListMachineTypesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListMachineTypesMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListMachineTypes(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getMachineTypeTest() {
    Boolean isSharedCpu = false;
    Integer guestCpus = 1754126894;
    String kind = "kind3292052";
    String description = "description-1724546052";
    String selfLink = "selfLink-1691268851";
    Integer memoryMb = 1726613907;
    Integer maximumPersistentDisks = 1033091853;
    String maximumPersistentDisksSizeGb = "maximumPersistentDisksSizeGb-1993209177";
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String id = "id3355";
    Integer imageSpaceGb = 461539048;
    MachineType expectedResponse = MachineType.newBuilder()
      .setIsSharedCpu(isSharedCpu)
      .setGuestCpus(guestCpus)
      .setKind(kind)
      .setDescription(description)
      .setSelfLink(selfLink)
      .setMemoryMb(memoryMb)
      .setMaximumPersistentDisks(maximumPersistentDisks)
      .setMaximumPersistentDisksSizeGb(maximumPersistentDisksSizeGb)
      .setZone(zone.toString())
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setId(id)
      .setImageSpaceGb(imageSpaceGb)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getMachineTypeMethodDescriptor);

    MachineTypeName machineType = MachineTypeName.of("[PROJECT]", "[ZONE]", "[MACHINE_TYPE]");

    MachineType actualResponse =
        client.getMachineType(machineType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getMachineTypeExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getMachineTypeMethodDescriptor);

    try {
      MachineTypeName machineType = MachineTypeName.of("[PROJECT]", "[ZONE]", "[MACHINE_TYPE]");

      client.getMachineType(machineType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listMachineTypesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    MachineType itemsElement = MachineType.newBuilder().build();
    List<MachineType> items = Arrays.asList(itemsElement);
    MachineTypeList expectedResponse = MachineTypeList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listMachineTypesMethodDescriptor);

    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

    ListMachineTypesPagedResponse pagedListResponse = client.listMachineTypes(zone);

    List<MachineType> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listMachineTypesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listMachineTypesMethodDescriptor);

    try {
      ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");

      client.listMachineTypes(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}