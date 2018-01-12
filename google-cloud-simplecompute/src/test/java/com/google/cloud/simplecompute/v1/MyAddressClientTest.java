package com.google.cloud.simplecompute.v1;

import static junit.framework.TestCase.fail;
import com.google.api.gax.httpjson.MockHttpLayer;
import com.google.cloud.simplecompute.v1.stub.HttpJsonAddressStub;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyAddressClientTest {
  private static AddressClient client;
  private static AddressSettings addressSettings;
  private static final MockHttpLayer MOCK_ADDRESSES = new MockHttpLayer();
  private static final RegionName TEST_REGION =
      RegionName.of("test-project", "test-subscription");

  @BeforeClass
  public static void setUp() throws Exception {
    addressSettings =
        AddressSettings.newBuilder()
            .setTransportChannelProvider(
                AddressSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(MOCK_ADDRESSES).build()).build();
    client =
        AddressClient.create(addressSettings);
  }

  @After
  public void cleanUp() {
    MOCK_ADDRESSES.reset();
  }

  @Test
  public void insertAddressesTest() throws Throwable {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    String zone = "zone3744684";
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    String region2 = "region2-690338393";
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    final Operation expectedResponse = Operation.newBuilder()
        .setHttpErrorMessage(httpErrorMessage)
        .setTargetId(targetId)
        .setKind(kind)
        .setDescription(description)
        .setStatusMessage(statusMessage)
        .setSelfLink(selfLink)
        .setInsertTime(insertTime)
        .setHttpErrorStatusCode(httpErrorStatusCode)
        .setZone(zone)
        .setTargetLink(targetLink)
        .setCreationTimestamp(creationTimestamp)
        .setName(name)
        .setProgress(progress)
        .setOperationType(operationType)
        .setStartTime(startTime)
        .setEndTime(endTime)
        .setId(id)
        .setRegion(region2)
        .setClientOperationId(clientOperationId)
        .setUser(user)
        .setStatus(status)
        .build();

    Address address = Address.newBuilder().build();

    MOCK_ADDRESSES.addResponse(expectedResponse);
    MOCK_ADDRESSES.setSerializer(((HttpJsonAddressStub) client.getStub()).getInsertAddressMethodDescriptor());

    Operation actualResponse =
        client.insertAddress(TEST_REGION, address);
    Assert.assertEquals(expectedResponse, actualResponse);
  }
}
