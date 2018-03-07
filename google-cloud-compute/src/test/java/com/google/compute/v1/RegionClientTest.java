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
import static com.google.compute.v1.RegionClient.ListRegionsPagedResponse;
import static com.google.compute.v1.stub.HttpJsonRegionStub.getRegionMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonRegionStub.listRegionsMethodDescriptor;
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
public class RegionClientTest {
  private static final MockHttpService mockService = new MockHttpService();
  private static RegionClient client;
  private static RegionSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionSettings.newBuilder()
           .setTransportChannelProvider(
               RegionSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build()).build();
    client =
       RegionClient.create(clientSettings);
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
  public void getRegionTest() {
    String kind = "kind3292052";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    String status = "status-892481550";
    Region expectedResponse = Region.newBuilder()
      .setKind(kind)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setDescription(description)
      .setId(id)
      .setSelfLink(selfLink)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);
    mockService.setSerializer(getRegionMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    Region actualResponse =
        client.getRegion(region);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);
    mockService.setSerializer(getRegionMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.getRegion(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    Region itemsElement = Region.newBuilder().build();
    List<Region> items = Arrays.asList(itemsElement);
    RegionList expectedResponse = RegionList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);
    mockService.setSerializer(listRegionsMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListRegionsPagedResponse pagedListResponse = client.listRegions(project);

    List<Region> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);
    mockService.setSerializer(listRegionsMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listRegions(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}