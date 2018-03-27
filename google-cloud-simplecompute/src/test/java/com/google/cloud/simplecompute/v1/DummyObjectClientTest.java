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
package com.google.cloud.simplecompute.v1;

import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.simplecompute.v1.stub.DummyObjectStubSettings;
import static com.google.cloud.simplecompute.v1.stub.HttpJsonDummyObjectStub.deleteDummyObjectMethodDescriptor;
import com.google.common.collect.ImmutableList;
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
public class DummyObjectClientTest {

   private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS = ImmutableList.copyOf(
        Lists.<ApiMethodDescriptor>newArrayList(
          deleteDummyObjectMethodDescriptor
        ));
  private static final MockHttpService mockService
      = new MockHttpService(METHOD_DESCRIPTORS, DummyObjectStubSettings.getDefaultEndpoint());

  private static DummyObjectClient client;
  private static DummyObjectSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        DummyObjectSettings.newBuilder()
           .setTransportChannelProvider(
               DummyObjectSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build()).build();
    client =
       DummyObjectClient.create(clientSettings);
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
  public void deleteDummyObjectTest() {
    mockService.addNullResponse();

    DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");

    client.deleteDummyObject(dummyObject);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDummyObjectExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");

      client.deleteDummyObject(dummyObject);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}