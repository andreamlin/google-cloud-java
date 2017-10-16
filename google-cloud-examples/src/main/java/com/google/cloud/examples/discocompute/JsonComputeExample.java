package com.google.cloud.examples.discocompute;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.compute.v1.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Use gax-java and generated message type to List Addresses in a test GCP Compute project.
 */
public class JsonComputeExample {
  private static String PROJECT_NAME = "gapic-test";
  private static String REGION = "us-central1";

  public static void main(String[] args) {
    try {
      AddressClient addressClient = createCredentialedClient();
      runExampleWithGapicGen(addressClient);
      System.out.println("-------------------------------------------------------");
      runExampleWithGapicGenResourceName(addressClient);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static AddressClient createCredentialedClient() throws IOException {
    Credentials myCredentials = GoogleCredentials.getApplicationDefault();
    String myEndpoint = AddressSettings.getDefaultEndpoint();

    // Begin samplegen code. This combines the "customize credentials" and "customize the endpoint" samples.
    AddressSettings addressSettings =
        AddressSettings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
            .setTransportProvider(AddressSettings.defaultHttpJsonTransportProviderBuilder()
                .setChannelProvider(AddressSettings.defaultHttpJsonChannelProviderBuilder()
                    .setEndpoint(myEndpoint)
                    .build())
                .build())
            .build();
    AddressClient addressClient =
        AddressClient.create(addressSettings);
    // End samplegen code.

    return addressClient;
  }

  // A basic List Address example.
  private static void runExampleWithGapicGen(AddressClient client) {
    System.out.println("Running with Gapic Client.");
    PagedResponseWrappers.ListAddressesPagedResponse listResponse = listAddresses(client);
    verifyListAddressWithGets(client, listResponse);
  }

  // Insert an address, and then delete the address. Use ResourceNames in the request objects.
  private static void runExampleWithGapicGenResourceName(AddressClient client) {
    System.out.println("Running with Gapic Client and Resource Name.");
    String newAddressName = "usseaparkview";
    System.out.println("Inserting address:");
    Address newAddress = Address.newBuilder().setName(newAddressName).build();
    Operation insertResponse = client.insertAddress(RegionName.create(PROJECT_NAME, REGION), newAddress);
    System.out.format("Result of insert: %s\n", insertResponse.toString());
    listAddresses(client);

    System.out.println("Deleting address:");
    Operation deleteResponse = client.deleteAddress(
        AddressName.create(newAddressName, PROJECT_NAME, REGION));
    System.out.format("Result of delete: %s\n", deleteResponse.toString());
    int sleepTimeInSeconds = 3;
    System.out.format("Waiting %d seconds for server to update...\n", sleepTimeInSeconds);
    // Wait for the delete operation to finish on the server.
    try {
      TimeUnit.SECONDS.sleep(sleepTimeInSeconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    listAddresses(client);
  }

  private static PagedResponseWrappers.ListAddressesPagedResponse listAddresses(AddressClient client) {
    System.out.println("Listing addresses:");
    ListAddressesHttpRequest listRequest = ListAddressesHttpRequest.newBuilder()
        .setRegion(REGION)
        .setProject(PROJECT_NAME)
        .build();
    PagedResponseWrappers.ListAddressesPagedResponse response = client.listAddresses(listRequest);
    for (Address address : response.iterateAll()) {
      System.out.println("\t - " + address.toString());
    }
    return response;
  }

  private static void verifyListAddressWithGets(AddressClient client, PagedResponseWrappers.ListAddressesPagedResponse listResponse) {
    for (Address address : listResponse.iterateAll()) {
      System.out.format("Making get request for address \"%s\"...\n", address.getName());
      Address fetchedAddress = client.getAddress(AddressName.create(address.getName(), PROJECT_NAME, REGION));
      System.out.format("addresses.get returns \n\t%s\n\n", fetchedAddress.toString());
    }
  }
}