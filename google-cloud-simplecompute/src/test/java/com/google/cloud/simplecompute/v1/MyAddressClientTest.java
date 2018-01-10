package com.google.cloud.simplecompute.v1;

import static junit.framework.TestCase.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.Json;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.api.gax.rpc.ClientContext;
import com.google.cloud.simplecompute.v1.stub.HttpJsonAddressStub;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class MyAddressClientTest {
  private static AddressClient client;

  private static AddressSettings addressSettings;

  private static final RegionName TEST_REGION =
      RegionName.of("test-project", "test-subscription");

  MockHttpTransport mockHttpTransport;

  @Before
  public void setUp() {
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

    final MockLowLevelHttpResponse SUCCESS_RESPONSE = new MockLowLevelHttpResponse() {
      @Override
      public InputStream getContent() {
        Writer writer = new StringWriter();
        ((HttpJsonAddressStub) client.getStub()).getInsertAddressMethodDescriptor().writeResponse(writer, expectedResponse);
        return new ByteArrayInputStream(writer.toString().getBytes());
      }
    };

    MockLowLevelHttpRequest mockHttpRequest =
        new MockLowLevelHttpRequest() {
          @Override
          public LowLevelHttpResponse execute() throws IOException {
            return SUCCESS_RESPONSE;
          }
        };

    mockHttpTransport = new MockHttpTransport.Builder().setLowLevelHttpRequest(mockHttpRequest).build();

    try {
      addressSettings =
          AddressSettings.newBuilder()
              .setTransportChannelProvider(
                  AddressSettings.defaultHttpJsonTransportProviderBuilder()
                      .setHttpTransport(mockHttpTransport).build()).build();
      client =
          AddressClient.create(addressSettings);
    } catch (IOException e) {
      fail();
    }

    Operation actualResponse =
        client.insertAddress(TEST_REGION, address);
    Assert.assertEquals(expectedResponse, actualResponse);

    client.listAddresses(TEST_REGION);
  }
}
