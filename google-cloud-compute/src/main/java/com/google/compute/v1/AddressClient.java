/*
 * Copyright 2017, Google LLC All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAddressesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAddressesPagedResponse;
import com.google.compute.v1.stub.AddressStub;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AddressClient addressClient = AddressClient.create()) {
 *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
 *   Operation response = addressClient.deleteAddress(address);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the addressClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's methods:
 *
 * <ol>
 * <li> A "flattened" method. With this type of method, the fields of the request type have been
 * converted into function parameters. It may be the case that not all fields are available
 * as parameters, and not every API method will have a flattened method entry point.
 * <li> A "request object" method. This type of method only takes one parameter, a request
 * object, which must be constructed before the call. Not every API method will have a request
 * object method.
 * <li> A "callable" method. This type of method takes no parameters and returns an immutable
 * API callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 *
 * <p>This class can be customized by passing in a custom instance of AddressSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * AddressSettings addressSettings =
 *     AddressSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AddressClient addressClient =
 *     AddressClient.create(addressSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AddressSettings addressSettings =
 *     AddressSettings.newBuilder()
 *         .setTransportChannelProvider(AddressSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build())
 *         .build();
 * AddressClient addressClient =
 *     AddressClient.create(addressSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class AddressClient implements BackgroundResource {
  private final AddressSettings settings;
  private final AddressStub stub;



  /**
   * Constructs an instance of AddressClient with default settings.
   */
  public static final AddressClient create() throws IOException {
    return create(AddressSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AddressClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final AddressClient create(AddressSettings settings) throws IOException {
    return new AddressClient(settings);
  }

  /**
   * Constructs an instance of AddressClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use AddressSettings}.
   */
  @BetaApi
  public static final AddressClient create(AddressStub stub) {
    return new AddressClient(stub);
  }

  /**
   * Constructs an instance of AddressClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected AddressClient(AddressSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected AddressClient(AddressStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AddressSettings getSettings() {
    return settings;
  }

  @BetaApi
  public AddressStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Address element : addressClient.aggregatedListAddresses(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAddressesPagedResponse aggregatedListAddresses(ProjectName project) {
    AggregatedListAddressesHttpRequest request =
        AggregatedListAddressesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Address element : addressClient.aggregatedListAddresses(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAddressesPagedResponse aggregatedListAddresses(AggregatedListAddressesHttpRequest request) {
    return aggregatedListAddressesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;AggregatedListAddressesPagedResponse&gt; future = addressClient.aggregatedListAddressesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Address element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListAddressesHttpRequest, AggregatedListAddressesPagedResponse> aggregatedListAddressesPagedCallable() {
    return stub.aggregatedListAddressesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     AddressAggregatedList response = addressClient.aggregatedListAddressesCallable().call(request);
   *     for (Address element : response.getAddresses()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListAddressesHttpRequest, AddressAggregatedList> aggregatedListAddressesCallable() {
    return stub.aggregatedListAddressesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   Operation response = addressClient.deleteAddress(address);
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAddress(AddressName address) {

    DeleteAddressHttpRequest request =
        DeleteAddressHttpRequest.newBuilder()
        .setAddressWithAddressName(address)
        .build();
    return deleteAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   DeleteAddressHttpRequest request = DeleteAddressHttpRequest.newBuilder()
   *     .setAddressWithAddressName(address)
   *     .build();
   *   Operation response = addressClient.deleteAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAddress(DeleteAddressHttpRequest request) {
    return deleteAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   DeleteAddressHttpRequest request = DeleteAddressHttpRequest.newBuilder()
   *     .setAddressWithAddressName(address)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = addressClient.deleteAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteAddressHttpRequest, Operation> deleteAddressCallable() {
    return stub.deleteAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   Address response = addressClient.getAddress(address);
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getAddress(AddressName address) {

    GetAddressHttpRequest request =
        GetAddressHttpRequest.newBuilder()
        .setAddressWithAddressName(address)
        .build();
    return getAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   GetAddressHttpRequest request = GetAddressHttpRequest.newBuilder()
   *     .setAddressWithAddressName(address)
   *     .build();
   *   Address response = addressClient.getAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getAddress(GetAddressHttpRequest request) {
    return getAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   GetAddressHttpRequest request = GetAddressHttpRequest.newBuilder()
   *     .setAddressWithAddressName(address)
   *     .build();
   *   ApiFuture&lt;Address&gt; future = addressClient.getAddressCallable().futureCall(request);
   *   // Do something
   *   Address response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetAddressHttpRequest, Address> getAddressCallable() {
    return stub.getAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address address = Address.newBuilder().build();
   *   Operation response = addressClient.insertAddress(region, address);
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAddress(RegionName region, Address addressResource) {

    InsertAddressHttpRequest request =
        InsertAddressHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .setAddressResource(addressResource)
        .build();
    return insertAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address address = Address.newBuilder().build();
   *   InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .setAddressResource(address)
   *     .build();
   *   Operation response = addressClient.insertAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAddress(InsertAddressHttpRequest request) {
    return insertAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address address = Address.newBuilder().build();
   *   InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .setAddressResource(address)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = addressClient.insertAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertAddressHttpRequest, Operation> insertAddressCallable() {
    return stub.insertAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   for (Address element : addressClient.listAddresses(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAddressesPagedResponse listAddresses(RegionName region) {
    ListAddressesHttpRequest request =
        ListAddressesHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   for (Address element : addressClient.listAddresses(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAddressesPagedResponse listAddresses(ListAddressesHttpRequest request) {
    return listAddressesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   ApiFuture&lt;ListAddressesPagedResponse&gt; future = addressClient.listAddressesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Address element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListAddressesHttpRequest, ListAddressesPagedResponse> listAddressesPagedCallable() {
    return stub.listAddressesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   while (true) {
   *     AddressList response = addressClient.listAddressesCallable().call(request);
   *     for (Address element : response.getItems()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListAddressesHttpRequest, AddressList> listAddressesCallable() {
    return stub.listAddressesCallable();
  }

  @Override
  public final void close() throws Exception {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

}