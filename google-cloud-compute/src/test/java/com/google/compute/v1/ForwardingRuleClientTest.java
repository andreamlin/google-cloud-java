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
import static com.google.compute.v1.ForwardingRuleClient.AggregatedListForwardingRulesPagedResponse;
import static com.google.compute.v1.ForwardingRuleClient.ListForwardingRulesPagedResponse;
import static com.google.compute.v1.stub.HttpJsonForwardingRuleStub.aggregatedListForwardingRulesMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonForwardingRuleStub.deleteForwardingRuleMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonForwardingRuleStub.getForwardingRuleMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonForwardingRuleStub.insertForwardingRuleMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonForwardingRuleStub.listForwardingRulesMethodDescriptor;
import static com.google.compute.v1.stub.HttpJsonForwardingRuleStub.setTargetForwardingRuleMethodDescriptor;
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
public class ForwardingRuleClientTest {
  private static final MockHttpService MOCK_SERVICE = new MockHttpService();
  private static ForwardingRuleClient client;
  private static ForwardingRuleSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ForwardingRuleSettings.newBuilder()
           .setTransportChannelProvider(
               ForwardingRuleSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(MOCK_SERVICE).build()).build();
    client =
       ForwardingRuleClient.create(clientSettings);
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
  public void aggregatedListForwardingRulesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    ForwardingRule forwardingRules = ForwardingRule.newBuilder().build();
    ForwardingRulesScopedList items = ForwardingRulesScopedList.newBuilder()
      .addAllForwardingRules(forwardingRules)
      .build();
    ForwardingRuleAggregatedList expectedResponse = ForwardingRuleAggregatedList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .setItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(aggregatedListForwardingRulesMethodDescriptor);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListForwardingRulesPagedResponse pagedListResponse = client.aggregatedListForwardingRules(project);

    List<ForwardingRule> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getForwardingRules().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListForwardingRulesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(aggregatedListForwardingRulesMethodDescriptor);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListForwardingRules(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteForwardingRuleTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(deleteForwardingRuleMethodDescriptor);

    ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

    Operation actualResponse =
        client.deleteForwardingRule(forwardingRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteForwardingRuleExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(deleteForwardingRuleMethodDescriptor);

    try {
      ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

      client.deleteForwardingRule(forwardingRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getForwardingRuleTest() {
    String portRange = "portRange217518079";
    String kind = "kind3292052";
    String iPProtocol = "iPProtocol323774237";
    RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
    String description = "description-1724546052";
    String loadBalancingScheme = "loadBalancingScheme1974502980";
    NetworkName network = NetworkName.of("[PROJECT]", "[NETWORK]");
    String selfLink = "selfLink-1691268851";
    String target = "target-880905839";
    SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String id = "id3355";
    String iPAddress = "iPAddress-551149873";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    ForwardingRule expectedResponse = ForwardingRule.newBuilder()
      .setPortRange(portRange)
      .setKind(kind)
      .setIPProtocol(iPProtocol)
      .setBackendService(backendService.toString())
      .setDescription(description)
      .setLoadBalancingScheme(loadBalancingScheme)
      .setNetwork(network.toString())
      .setSelfLink(selfLink)
      .setTarget(target)
      .setSubnetwork(subnetwork.toString())
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setId(id)
      .setIPAddress(iPAddress)
      .setRegion(region.toString())
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(getForwardingRuleMethodDescriptor);

    ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

    ForwardingRule actualResponse =
        client.getForwardingRule(forwardingRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void getForwardingRuleExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(getForwardingRuleMethodDescriptor);

    try {
      ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");

      client.getForwardingRule(forwardingRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertForwardingRuleTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region2 = RegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region2.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(insertForwardingRuleMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    ForwardingRule forwardingRule = ForwardingRule.newBuilder().build();

    Operation actualResponse =
        client.insertForwardingRule(region, forwardingRule);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void insertForwardingRuleExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(insertForwardingRuleMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");
      ForwardingRule forwardingRule = ForwardingRule.newBuilder().build();

      client.insertForwardingRule(region, forwardingRule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listForwardingRulesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    ForwardingRule itemsElement = ForwardingRule.newBuilder().build();
    List<ForwardingRule> items = Arrays.asList(itemsElement);
    ForwardingRuleList expectedResponse = ForwardingRuleList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(listForwardingRulesMethodDescriptor);

    RegionName region = RegionName.of("[PROJECT]", "[REGION]");

    ListForwardingRulesPagedResponse pagedListResponse = client.listForwardingRules(region);

    List<ForwardingRule> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItems().get(0), resources.get(0));

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void listForwardingRulesExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(listForwardingRulesMethodDescriptor);

    try {
      RegionName region = RegionName.of("[PROJECT]", "[REGION]");

      client.listForwardingRules(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetForwardingRuleTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    RegionName region = RegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    MOCK_SERVICE.addResponse(expectedResponse);
    MOCK_SERVICE.setSerializer(setTargetForwardingRuleMethodDescriptor);

    ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");
    TargetReference targetReference = TargetReference.newBuilder().build();

    Operation actualResponse =
        client.setTargetForwardingRule(forwardingRule, targetReference);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = MOCK_SERVICE.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());
  }

  @Test
  @SuppressWarnings("all")
  public void setTargetForwardingRuleExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    MOCK_SERVICE.addException(exception);
    MOCK_SERVICE.setSerializer(setTargetForwardingRuleMethodDescriptor);

    try {
      ForwardingRuleName forwardingRule = ForwardingRuleName.of("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");
      TargetReference targetReference = TargetReference.newBuilder().build();

      client.setTargetForwardingRule(forwardingRule, targetReference);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}