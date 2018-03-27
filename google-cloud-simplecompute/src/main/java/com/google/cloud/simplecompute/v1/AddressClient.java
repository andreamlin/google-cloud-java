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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.paging.FixedSizeCollection;
import com.google.api.gax.paging.Page;
import com.google.api.gax.rpc.ApiExceptions;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.simplecompute.v1.stub.AddressStub;
import com.google.cloud.simplecompute.v1.stub.AddressStubSettings;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
 *     AddressSettings.newBuilder().setEndpoint(myEndpoint).build();
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
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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
    this.stub = ((AddressStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AddressClient(AddressStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AddressSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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
        .setProject(project == null ? null : project.toString())
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
   *   for (Address element : addressClient.aggregatedListAddresses(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAddressesPagedResponse aggregatedListAddresses(String project) {
    AggregatedListAddressesHttpRequest request =
        AggregatedListAddressesHttpRequest.newBuilder()
        .setProject(project)
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
   *     .setProject(project.toString())
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
   *     .setProject(project.toString())
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
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     AddressAggregatedList response = addressClient.aggregatedListAddressesCallable().call(request);
   *     for (Address element : response.getAddressesList()) {
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
        .setAddress(address == null ? null : address.toString())
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
   *   Operation response = addressClient.deleteAddress(address.toString());
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAddress(String address) {

    DeleteAddressHttpRequest request =
        DeleteAddressHttpRequest.newBuilder()
        .setAddress(address)
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
   *     .setAddress(address.toString())
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
   *     .setAddress(address.toString())
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
        .setAddress(address == null ? null : address.toString())
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
   *   Address response = addressClient.getAddress(address.toString());
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getAddress(String address) {

    GetAddressHttpRequest request =
        GetAddressHttpRequest.newBuilder()
        .setAddress(address)
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
   *     .setAddress(address.toString())
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
   *     .setAddress(address.toString())
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
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.insertAddress(region, addressResource);
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
        .setRegion(region == null ? null : region.toString())
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
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.insertAddress(region.toString(), addressResource);
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAddress(String region, Address addressResource) {

    InsertAddressHttpRequest request =
        InsertAddressHttpRequest.newBuilder()
        .setRegion(region)
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
   *   Address addressResource = Address.newBuilder().build();
   *   InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setAddressResource(addressResource)
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
   *   Address addressResource = Address.newBuilder().build();
   *   InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setAddressResource(addressResource)
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
        .setRegion(region == null ? null : region.toString())
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
   *   for (Address element : addressClient.listAddresses(region.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAddressesPagedResponse listAddresses(String region) {
    ListAddressesHttpRequest request =
        ListAddressesHttpRequest.newBuilder()
        .setRegion(region)
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
   *     .setRegion(region.toString())
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
   *     .setRegion(region.toString())
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
   *     .setRegion(region.toString())
   *     .build();
   *   while (true) {
   *     AddressList response = addressClient.listAddressesCallable().call(request);
   *     for (Address element : response.getItemsList()) {
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an address in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String address = "";
   *   String requestId = "";
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.patchAddress(address, requestId, region, addressResource);
   * }
   * </code></pre>
   *
   * @param address Name of the address to patch.
   * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.
   *
   * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @param region Name of the region for this request.
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchAddress(String address, String requestId, RegionName region, Address addressResource) {

    PatchAddressHttpRequest request =
        PatchAddressHttpRequest.newBuilder()
        .setAddress(address)
        .setRequestId(requestId)
        .setRegion(region == null ? null : region.toString())
        .setAddressResource(addressResource)
        .build();
    return patchAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an address in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String address = "";
   *   String requestId = "";
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.patchAddress(address, requestId, region.toString(), addressResource);
   * }
   * </code></pre>
   *
   * @param address Name of the address to patch.
   * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.
   *
   * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @param region Name of the region for this request.
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchAddress(String address, String requestId, String region, Address addressResource) {

    PatchAddressHttpRequest request =
        PatchAddressHttpRequest.newBuilder()
        .setAddress(address)
        .setRequestId(requestId)
        .setRegion(region)
        .setAddressResource(addressResource)
        .build();
    return patchAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an address in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String address = "";
   *   String requestId = "";
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   PatchAddressHttpRequest request = PatchAddressHttpRequest.newBuilder()
   *     .setAddress(address)
   *     .setRequestId(requestId)
   *     .setRegion(region.toString())
   *     .setAddressResource(addressResource)
   *     .build();
   *   Operation response = addressClient.patchAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchAddress(PatchAddressHttpRequest request) {
    return patchAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an address in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String address = "";
   *   String requestId = "";
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   PatchAddressHttpRequest request = PatchAddressHttpRequest.newBuilder()
   *     .setAddress(address)
   *     .setRequestId(requestId)
   *     .setRegion(region.toString())
   *     .setAddressResource(addressResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = addressClient.patchAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchAddressHttpRequest, Operation> patchAddressCallable() {
    return stub.patchAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Address resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating an address. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectAddressName address = ProjectAddressName.of("[PROJECT]", "[ADDRESS]");
   *   String requestId = "";
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.updateAddress(address, requestId, addressResource);
   * }
   * </code></pre>
   *
   * @param address Name of the Address resource to update.
   * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.
   *
   * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateAddress(ProjectAddressName address, String requestId, Address addressResource) {

    UpdateAddressHttpRequest request =
        UpdateAddressHttpRequest.newBuilder()
        .setAddress(address == null ? null : address.toString())
        .setRequestId(requestId)
        .setAddressResource(addressResource)
        .build();
    return updateAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Address resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating an address. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectAddressName address = ProjectAddressName.of("[PROJECT]", "[ADDRESS]");
   *   String requestId = "";
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.updateAddress(address.toString(), requestId, addressResource);
   * }
   * </code></pre>
   *
   * @param address Name of the Address resource to update.
   * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.
   *
   * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateAddress(String address, String requestId, Address addressResource) {

    UpdateAddressHttpRequest request =
        UpdateAddressHttpRequest.newBuilder()
        .setAddress(address)
        .setRequestId(requestId)
        .setAddressResource(addressResource)
        .build();
    return updateAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Address resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating an address. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectAddressName address = ProjectAddressName.of("[PROJECT]", "[ADDRESS]");
   *   String requestId = "";
   *   Address addressResource = Address.newBuilder().build();
   *   UpdateAddressHttpRequest request = UpdateAddressHttpRequest.newBuilder()
   *     .setAddress(address.toString())
   *     .setRequestId(requestId)
   *     .setAddressResource(addressResource)
   *     .build();
   *   Operation response = addressClient.updateAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateAddress(UpdateAddressHttpRequest request) {
    return updateAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Address resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating an address. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectAddressName address = ProjectAddressName.of("[PROJECT]", "[ADDRESS]");
   *   String requestId = "";
   *   Address addressResource = Address.newBuilder().build();
   *   UpdateAddressHttpRequest request = UpdateAddressHttpRequest.newBuilder()
   *     .setAddress(address.toString())
   *     .setRequestId(requestId)
   *     .setAddressResource(addressResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = addressClient.updateAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateAddressHttpRequest, Operation> updateAddressCallable() {
    return stub.updateAddressCallable();
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

  public static class AggregatedListAddressesPagedResponse extends AbstractPagedListResponse<
      AggregatedListAddressesHttpRequest,
      AddressAggregatedList,
      Address,
      AggregatedListAddressesPage,
      AggregatedListAddressesFixedSizeCollection> {

    public static ApiFuture<AggregatedListAddressesPagedResponse> createAsync(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        ApiFuture<AddressAggregatedList> futureResponse) {
      ApiFuture<AggregatedListAddressesPage> futurePage =
          AggregatedListAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListAddressesPage, AggregatedListAddressesPagedResponse>() {
            @Override
            public AggregatedListAddressesPagedResponse apply(AggregatedListAddressesPage input) {
              return new AggregatedListAddressesPagedResponse(input);
            }
          });
    }

    private AggregatedListAddressesPagedResponse(AggregatedListAddressesPage page) {
      super(page, AggregatedListAddressesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListAddressesPage extends AbstractPage<
      AggregatedListAddressesHttpRequest,
      AddressAggregatedList,
      Address,
      AggregatedListAddressesPage> {

    private AggregatedListAddressesPage(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        AddressAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListAddressesPage createEmptyPage() {
      return new AggregatedListAddressesPage(null, null);
    }

    @Override
    protected AggregatedListAddressesPage createPage(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        AddressAggregatedList response) {
      return new AggregatedListAddressesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListAddressesPage> createPageAsync(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        ApiFuture<AddressAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListAddressesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListAddressesHttpRequest,
      AddressAggregatedList,
      Address,
      AggregatedListAddressesPage,
      AggregatedListAddressesFixedSizeCollection> {

    private AggregatedListAddressesFixedSizeCollection(List<AggregatedListAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListAddressesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListAddressesFixedSizeCollection createCollection(
        List<AggregatedListAddressesPage> pages, int collectionSize) {
      return new AggregatedListAddressesFixedSizeCollection(pages, collectionSize);
    }


  }
  public static class ListAddressesPagedResponse extends AbstractPagedListResponse<
      ListAddressesHttpRequest,
      AddressList,
      Address,
      ListAddressesPage,
      ListAddressesFixedSizeCollection> {

    public static ApiFuture<ListAddressesPagedResponse> createAsync(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      ApiFuture<ListAddressesPage> futurePage =
          ListAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAddressesPage, ListAddressesPagedResponse>() {
            @Override
            public ListAddressesPagedResponse apply(ListAddressesPage input) {
              return new ListAddressesPagedResponse(input);
            }
          });
    }

    private ListAddressesPagedResponse(ListAddressesPage page) {
      super(page, ListAddressesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListAddressesPage extends AbstractPage<
      ListAddressesHttpRequest,
      AddressList,
      Address,
      ListAddressesPage> {

    private ListAddressesPage(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        AddressList response) {
      super(context, response);
    }

    private static ListAddressesPage createEmptyPage() {
      return new ListAddressesPage(null, null);
    }

    @Override
    protected ListAddressesPage createPage(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        AddressList response) {
      return new ListAddressesPage(context, response);
    }

    @Override
    public ApiFuture<ListAddressesPage> createPageAsync(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListAddressesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListAddressesHttpRequest,
      AddressList,
      Address,
      ListAddressesPage,
      ListAddressesFixedSizeCollection> {

    private ListAddressesFixedSizeCollection(List<ListAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAddressesFixedSizeCollection createEmptyCollection() {
      return new ListAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAddressesFixedSizeCollection createCollection(
        List<ListAddressesPage> pages, int collectionSize) {
      return new ListAddressesFixedSizeCollection(pages, collectionSize);
    }


  }
}