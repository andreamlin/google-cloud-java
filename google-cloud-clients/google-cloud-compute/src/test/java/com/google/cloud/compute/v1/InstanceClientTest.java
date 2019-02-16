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

import static com.google.cloud.compute.v1.InstanceClient.AggregatedListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListReferrersInstancesPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.addAccessConfigInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.aggregatedListInstancesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.attachDiskInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.deleteAccessConfigInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.deleteInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.detachDiskInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.getIamPolicyInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.getInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.getSerialPortOutputInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.insertInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.listInstancesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.listReferrersInstancesMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.resetInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setDeletionProtectionInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setDiskAutoDeleteInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setIamPolicyInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setLabelsInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setMachineResourcesInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setMachineTypeInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setMetadataInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setMinCpuPlatformInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setSchedulingInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setServiceAccountInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.setTagsInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.simulateMaintenanceEventInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.startInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.startWithEncryptionKeyInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.stopInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.testIamPermissionsInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.updateAccessConfigInstanceMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonInstanceStub.updateNetworkInterfaceInstanceMethodDescriptor;

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
import com.google.cloud.compute.v1.stub.InstanceStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
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
public class InstanceClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              addAccessConfigInstanceMethodDescriptor,
              aggregatedListInstancesMethodDescriptor,
              attachDiskInstanceMethodDescriptor,
              deleteInstanceMethodDescriptor,
              deleteAccessConfigInstanceMethodDescriptor,
              detachDiskInstanceMethodDescriptor,
              getInstanceMethodDescriptor,
              getIamPolicyInstanceMethodDescriptor,
              getSerialPortOutputInstanceMethodDescriptor,
              insertInstanceMethodDescriptor,
              listInstancesMethodDescriptor,
              listReferrersInstancesMethodDescriptor,
              resetInstanceMethodDescriptor,
              setDeletionProtectionInstanceMethodDescriptor,
              setDiskAutoDeleteInstanceMethodDescriptor,
              setIamPolicyInstanceMethodDescriptor,
              setLabelsInstanceMethodDescriptor,
              setMachineResourcesInstanceMethodDescriptor,
              setMachineTypeInstanceMethodDescriptor,
              setMetadataInstanceMethodDescriptor,
              setMinCpuPlatformInstanceMethodDescriptor,
              setSchedulingInstanceMethodDescriptor,
              setServiceAccountInstanceMethodDescriptor,
              setTagsInstanceMethodDescriptor,
              simulateMaintenanceEventInstanceMethodDescriptor,
              startInstanceMethodDescriptor,
              startWithEncryptionKeyInstanceMethodDescriptor,
              stopInstanceMethodDescriptor,
              testIamPermissionsInstanceMethodDescriptor,
              updateAccessConfigInstanceMethodDescriptor,
              updateNetworkInterfaceInstanceMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, InstanceStubSettings.getDefaultEndpoint());

  private static InstanceClient client;
  private static InstanceSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        InstanceSettings.newBuilder()
            .setTransportChannelProvider(
                InstanceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = InstanceClient.create(clientSettings);
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
  public void addAccessConfigInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("addAccessConfigInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String networkInterface = "networkInterface902258792";
    AccessConfig accessConfigResource = AccessConfig.newBuilder().build();

    EmptyMessage actualResponse =
        client.addAccessConfigInstanceAsync(instance, networkInterface, accessConfigResource).get();
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
  public void addAccessConfigInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String networkInterface = "networkInterface902258792";
      AccessConfig accessConfigResource = AccessConfig.newBuilder().build();

      client.addAccessConfigInstanceAsync(instance, networkInterface, accessConfigResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void aggregatedListInstancesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    InstancesScopedList itemsItem = InstancesScopedList.newBuilder().build();
    Map<String, InstancesScopedList> items = new HashMap<>();
    items.put("items", itemsItem);
    InstanceAggregatedList expectedResponse =
        InstanceAggregatedList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .putAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    AggregatedListInstancesPagedResponse pagedListResponse =
        client.aggregatedListInstances(project);

    List<InstancesScopedList> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void aggregatedListInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.aggregatedListInstances(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void attachDiskInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("attachDiskInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Boolean forceAttach = false;
    AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();

    EmptyMessage actualResponse =
        client.attachDiskInstanceAsync(instance, forceAttach, attachedDiskResource).get();
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
  public void attachDiskInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Boolean forceAttach = false;
      AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();

      client.attachDiskInstanceAsync(instance, forceAttach, attachedDiskResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    EmptyMessage actualResponse = client.deleteInstanceAsync(instance).get();
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
  public void deleteInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.deleteInstanceAsync(instance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAccessConfigInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("deleteAccessConfigInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String networkInterface = "networkInterface902258792";
    String accessConfig = "accessConfig-464014723";

    EmptyMessage actualResponse =
        client.deleteAccessConfigInstanceAsync(instance, networkInterface, accessConfig).get();
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
  public void deleteAccessConfigInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String networkInterface = "networkInterface902258792";
      String accessConfig = "accessConfig-464014723";

      client.deleteAccessConfigInstanceAsync(instance, networkInterface, accessConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void detachDiskInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("detachDiskInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String deviceName = "deviceName-1543071020";

    EmptyMessage actualResponse = client.detachDiskInstanceAsync(instance, deviceName).get();
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
  public void detachDiskInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String deviceName = "deviceName-1543071020";

      client.detachDiskInstanceAsync(instance, deviceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceTest() {
    Boolean canIpForward = true;
    String cpuPlatform = "cpuPlatform947156266";
    String creationTimestamp = "creationTimestamp567396278";
    Boolean deletionProtection = true;
    String description = "description-1724546052";
    String hostname = "hostname-299803597";
    String id = "id3355";
    String kind = "kind3292052";
    String labelFingerprint = "labelFingerprint714995737";
    ProjectZoneMachineTypeName machineType =
        ProjectZoneMachineTypeName.of("[PROJECT]", "[ZONE]", "[MACHINE_TYPE]");
    String minCpuPlatform = "minCpuPlatform-1367699977";
    String name = "name3373707";
    String selfLink = "selfLink-1691268851";
    Boolean startRestricted = true;
    String status = "status-892481550";
    String statusMessage = "statusMessage-239442758";
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Instance expectedResponse =
        Instance.newBuilder()
            .setCanIpForward(canIpForward)
            .setCpuPlatform(cpuPlatform)
            .setCreationTimestamp(creationTimestamp)
            .setDeletionProtection(deletionProtection)
            .setDescription(description)
            .setHostname(hostname)
            .setId(id)
            .setKind(kind)
            .setLabelFingerprint(labelFingerprint)
            .setMachineType(machineType.toString())
            .setMinCpuPlatform(minCpuPlatform)
            .setName(name)
            .setSelfLink(selfLink)
            .setStartRestricted(startRestricted)
            .setStatus(status)
            .setStatusMessage(statusMessage)
            .setZone(zone.toString())
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    Instance actualResponse = client.getInstance(instance);
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
  public void getInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.getInstance(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getIamPolicyInstanceTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceResourceName resource =
        ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");

    Policy actualResponse = client.getIamPolicyInstance(resource);
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
  public void getIamPolicyInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceResourceName resource =
          ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");

      client.getIamPolicyInstance(resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSerialPortOutputInstanceTest() {
    String contents = "contents-567321830";
    String kind = "kind3292052";
    String next = "next3377907";
    String selfLink = "selfLink-1691268851";
    String start2 = "start2-1897185387";
    SerialPortOutput expectedResponse =
        SerialPortOutput.newBuilder()
            .setContents(contents)
            .setKind(kind)
            .setNext(next)
            .setSelfLink(selfLink)
            .setStart(start2)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Integer port = 3446913;
    String start = "start109757538";

    SerialPortOutput actualResponse = client.getSerialPortOutputInstance(instance, port, start);
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
  public void getSerialPortOutputInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Integer port = 3446913;
      String start = "start109757538";

      client.getSerialPortOutputInstance(instance, port, start);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("insertInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    Instance instanceResource = Instance.newBuilder().build();

    Operation actualResponse = client.insertInstanceAsync(zone, instanceResource).get();
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
  public void insertInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
      Instance instanceResource = Instance.newBuilder().build();

      client.insertInstanceAsync(zone, instanceResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Instance itemsElement = Instance.newBuilder().build();
    List<Instance> items = Arrays.asList(itemsElement);
    InstanceList expectedResponse =
        InstanceList.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

    ListInstancesPagedResponse pagedListResponse = client.listInstances(zone);

    List<Instance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");

      client.listInstances(zone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listReferrersInstancesTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String nextPageToken = "";
    String selfLink = "selfLink-1691268851";
    Reference itemsElement = Reference.newBuilder().build();
    List<Reference> items = Arrays.asList(itemsElement);
    InstanceListReferrers expectedResponse =
        InstanceListReferrers.newBuilder()
            .setId(id)
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .setSelfLink(selfLink)
            .addAllItems(items)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    ListReferrersInstancesPagedResponse pagedListResponse = client.listReferrersInstances(instance);

    List<Reference> resources = Lists.newArrayList(pagedListResponse.iterateAll());
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
  public void listReferrersInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.listReferrersInstances(instance);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void resetInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("resetInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    EmptyMessage actualResponse = client.resetInstanceAsync(instance).get();
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
  public void resetInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.resetInstanceAsync(instance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setDeletionProtectionInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("setDeletionProtectionInstanceTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceResourceName resource =
        ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
    Boolean deletionProtection = true;

    EmptyMessage actualResponse =
        client.setDeletionProtectionInstanceAsync(resource, deletionProtection).get();
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
  public void setDeletionProtectionInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceResourceName resource =
          ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
      Boolean deletionProtection = true;

      client.setDeletionProtectionInstanceAsync(resource, deletionProtection).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setDiskAutoDeleteInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setDiskAutoDeleteInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Boolean autoDelete = false;
    String deviceName = "deviceName-1543071020";

    EmptyMessage actualResponse =
        client.setDiskAutoDeleteInstanceAsync(instance, autoDelete, deviceName).get();
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
  public void setDiskAutoDeleteInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Boolean autoDelete = false;
      String deviceName = "deviceName-1543071020";

      client.setDiskAutoDeleteInstanceAsync(instance, autoDelete, deviceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setIamPolicyInstanceTest() {
    String etag = "etag3123477";
    Boolean iamOwned = false;
    Integer version = 351608024;
    Policy expectedResponse =
        Policy.newBuilder().setEtag(etag).setIamOwned(iamOwned).setVersion(version).build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceResourceName resource =
        ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
    ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();

    Policy actualResponse = client.setIamPolicyInstance(resource, zoneSetPolicyRequestResource);
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
  public void setIamPolicyInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceResourceName resource =
          ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
      ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();

      client.setIamPolicyInstance(resource, zoneSetPolicyRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setLabelsInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetLabelsRequest instancesSetLabelsRequestResource =
        InstancesSetLabelsRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client.setLabelsInstanceAsync(instance, instancesSetLabelsRequestResource).get();
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
  public void setLabelsInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetLabelsRequest instancesSetLabelsRequestResource =
          InstancesSetLabelsRequest.newBuilder().build();

      client.setLabelsInstanceAsync(instance, instancesSetLabelsRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMachineResourcesInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setMachineResourcesInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource =
        InstancesSetMachineResourcesRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setMachineResourcesInstanceAsync(instance, instancesSetMachineResourcesRequestResource)
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
  public void setMachineResourcesInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource =
          InstancesSetMachineResourcesRequest.newBuilder().build();

      client
          .setMachineResourcesInstanceAsync(instance, instancesSetMachineResourcesRequestResource)
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
  public void setMachineTypeInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setMachineTypeInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource =
        InstancesSetMachineTypeRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client.setMachineTypeInstanceAsync(instance, instancesSetMachineTypeRequestResource).get();
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
  public void setMachineTypeInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource =
          InstancesSetMachineTypeRequest.newBuilder().build();

      client.setMachineTypeInstanceAsync(instance, instancesSetMachineTypeRequestResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMetadataInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setMetadataInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Metadata metadataResource = Metadata.newBuilder().build();

    EmptyMessage actualResponse = client.setMetadataInstanceAsync(instance, metadataResource).get();
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
  public void setMetadataInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Metadata metadataResource = Metadata.newBuilder().build();

      client.setMetadataInstanceAsync(instance, metadataResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setMinCpuPlatformInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setMinCpuPlatformInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource =
        InstancesSetMinCpuPlatformRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setMinCpuPlatformInstanceAsync(instance, instancesSetMinCpuPlatformRequestResource)
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
  public void setMinCpuPlatformInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource =
          InstancesSetMinCpuPlatformRequest.newBuilder().build();

      client
          .setMinCpuPlatformInstanceAsync(instance, instancesSetMinCpuPlatformRequestResource)
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
  public void setSchedulingInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setSchedulingInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Scheduling schedulingResource = Scheduling.newBuilder().build();

    EmptyMessage actualResponse =
        client.setSchedulingInstanceAsync(instance, schedulingResource).get();
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
  public void setSchedulingInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Scheduling schedulingResource = Scheduling.newBuilder().build();

      client.setSchedulingInstanceAsync(instance, schedulingResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setServiceAccountInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setServiceAccountInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource =
        InstancesSetServiceAccountRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .setServiceAccountInstanceAsync(instance, instancesSetServiceAccountRequestResource)
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
  public void setServiceAccountInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource =
          InstancesSetServiceAccountRequest.newBuilder().build();

      client
          .setServiceAccountInstanceAsync(instance, instancesSetServiceAccountRequestResource)
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
  public void setTagsInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("setTagsInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    Tags tagsResource = Tags.newBuilder().build();

    EmptyMessage actualResponse = client.setTagsInstanceAsync(instance, tagsResource).get();
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
  public void setTagsInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      Tags tagsResource = Tags.newBuilder().build();

      client.setTagsInstanceAsync(instance, tagsResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void simulateMaintenanceEventInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("simulateMaintenanceEventInstanceTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    EmptyMessage actualResponse = client.simulateMaintenanceEventInstanceAsync(instance).get();
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
  public void simulateMaintenanceEventInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.simulateMaintenanceEventInstanceAsync(instance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("startInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    EmptyMessage actualResponse = client.startInstanceAsync(instance).get();
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
  public void startInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.startInstanceAsync(instance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startWithEncryptionKeyInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("startWithEncryptionKeyInstanceTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource =
        InstancesStartWithEncryptionKeyRequest.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .startWithEncryptionKeyInstanceAsync(
                instance, instancesStartWithEncryptionKeyRequestResource)
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
  public void startWithEncryptionKeyInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource =
          InstancesStartWithEncryptionKeyRequest.newBuilder().build();

      client
          .startWithEncryptionKeyInstanceAsync(
              instance, instancesStartWithEncryptionKeyRequestResource)
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
  public void stopInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("stopInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

    EmptyMessage actualResponse = client.stopInstanceAsync(instance).get();
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
  public void stopInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");

      client.stopInstanceAsync(instance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsInstanceTest() {
    TestPermissionsResponse expectedResponse = TestPermissionsResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectZoneInstanceResourceName resource =
        ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
    TestPermissionsRequest testPermissionsRequestResource =
        TestPermissionsRequest.newBuilder().build();

    TestPermissionsResponse actualResponse =
        client.testIamPermissionsInstance(resource, testPermissionsRequestResource);
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
  public void testIamPermissionsInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceResourceName resource =
          ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
      TestPermissionsRequest testPermissionsRequestResource =
          TestPermissionsRequest.newBuilder().build();

      client.testIamPermissionsInstance(resource, testPermissionsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateAccessConfigInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder().setName("updateAccessConfigInstanceTest").setStatus("DONE").build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String networkInterface = "networkInterface902258792";
    AccessConfig accessConfigResource = AccessConfig.newBuilder().build();

    EmptyMessage actualResponse =
        client
            .updateAccessConfigInstanceAsync(instance, networkInterface, accessConfigResource)
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
  public void updateAccessConfigInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String networkInterface = "networkInterface902258792";
      AccessConfig accessConfigResource = AccessConfig.newBuilder().build();

      client
          .updateAccessConfigInstanceAsync(instance, networkInterface, accessConfigResource)
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
  public void updateNetworkInterfaceInstanceTest() throws Exception {
    EmptyMessage expectedResponse = null;
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateNetworkInterfaceInstanceTest")
            .setStatus("DONE")
            .build();
    mockService.addResponse(resultOperation);

    ProjectZoneInstanceName instance =
        ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
    String networkInterface = "networkInterface902258792";
    NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    EmptyMessage actualResponse =
        client
            .updateNetworkInterfaceInstanceAsync(
                instance, networkInterface, networkInterfaceResource, fieldMask)
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
  public void updateNetworkInterfaceInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectZoneInstanceName instance =
          ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
      String networkInterface = "networkInterface902258792";
      NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client
          .updateNetworkInterfaceInstanceAsync(
              instance, networkInterface, networkInterfaceResource, fieldMask)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
