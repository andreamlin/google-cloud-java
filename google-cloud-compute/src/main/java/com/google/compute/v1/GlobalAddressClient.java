/*
 * Copyright 2017, Google Inc. All rights reserved.
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
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalAddressesPagedResponse;
import com.google.compute.v1.stub.GlobalAddressStub;
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
 * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
 *   GlobalAddressesAddressName address = GlobalAddressesAddressName.create("[PROJECT]", "[ADDRESS]");
 *   Operation response = globalAddressClient.deleteGlobalAddress(address);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the globalAddressClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of GlobalAddressSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * GlobalAddressSettings globalAddressSettings =
 *     GlobalAddressSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GlobalAddressClient globalAddressClient =
 *     GlobalAddressClient.create(globalAddressSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * GlobalAddressSettings globalAddressSettings =
 *     GlobalAddressSettings.newBuilder()
 *         .setTransportProvider(GlobalAddressSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(GlobalAddressSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * GlobalAddressClient globalAddressClient =
 *     GlobalAddressClient.create(globalAddressSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GlobalAddressClient implements BackgroundResource {
  private final GlobalAddressSettings settings;
  private final GlobalAddressStub stub;



  /**
   * Constructs an instance of GlobalAddressClient with default settings.
   */
  public static final GlobalAddressClient create() throws IOException {
    return create(GlobalAddressSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GlobalAddressClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final GlobalAddressClient create(GlobalAddressSettings settings) throws IOException {
    return new GlobalAddressClient(settings);
  }

  /**
   * Constructs an instance of GlobalAddressClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use GlobalAddressSettings}.
   */
  public static final GlobalAddressClient create(GlobalAddressStub stub) {
    return new GlobalAddressClient(stub);
  }

  /**
   * Constructs an instance of GlobalAddressClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GlobalAddressClient(GlobalAddressSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected GlobalAddressClient(GlobalAddressStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GlobalAddressSettings getSettings() {
    return settings;
  }

  @BetaApi
  public GlobalAddressStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   GlobalAddressesAddressName address = GlobalAddressesAddressName.create("[PROJECT]", "[ADDRESS]");
   *   Operation response = globalAddressClient.deleteGlobalAddress(address);
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteGlobalAddress(GlobalAddressesAddressName address) {

    DeleteGlobalAddressHttpRequest request =
        DeleteGlobalAddressHttpRequest.newBuilder()
        .setAddressWithAddressName(address == null ? null : AddressName.from(address))
        .build();
    return deleteGlobalAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedAddress = GlobalAddressClient.formatGlobalAddressesAddressName("[PROJECT]", "[ADDRESS]");
   *   DeleteGlobalAddressHttpRequest request = DeleteGlobalAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   Operation response = globalAddressClient.deleteGlobalAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteGlobalAddress(DeleteGlobalAddressHttpRequest request) {
    return deleteGlobalAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedAddress = GlobalAddressClient.formatGlobalAddressesAddressName("[PROJECT]", "[ADDRESS]");
   *   DeleteGlobalAddressHttpRequest request = DeleteGlobalAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = globalAddressClient.deleteGlobalAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteGlobalAddressHttpRequest, Operation> deleteGlobalAddressCallable() {
    return stub.deleteGlobalAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource. Get a list of available addresses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   GlobalAddressesAddressName address = GlobalAddressesAddressName.create("[PROJECT]", "[ADDRESS]");
   *   Address response = globalAddressClient.getGlobalAddress(address);
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getGlobalAddress(GlobalAddressesAddressName address) {

    GetGlobalAddressHttpRequest request =
        GetGlobalAddressHttpRequest.newBuilder()
        .setAddressWithAddressName(address == null ? null : AddressName.from(address))
        .build();
    return getGlobalAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource. Get a list of available addresses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedAddress = GlobalAddressClient.formatGlobalAddressesAddressName("[PROJECT]", "[ADDRESS]");
   *   GetGlobalAddressHttpRequest request = GetGlobalAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   Address response = globalAddressClient.getGlobalAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getGlobalAddress(GetGlobalAddressHttpRequest request) {
    return getGlobalAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource. Get a list of available addresses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedAddress = GlobalAddressClient.formatGlobalAddressesAddressName("[PROJECT]", "[ADDRESS]");
   *   GetGlobalAddressHttpRequest request = GetGlobalAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   ApiFuture&lt;Address&gt; future = globalAddressClient.getGlobalAddressCallable().futureCall(request);
   *   // Do something
   *   Address response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetGlobalAddressHttpRequest, Address> getGlobalAddressCallable() {
    return stub.getGlobalAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   Address address = Address.newBuilder().build();
   *   Operation response = globalAddressClient.insertGlobalAddress(project, address);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param addressResource A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertGlobalAddress(ProjectName project, Address addressResource) {

    InsertGlobalAddressHttpRequest request =
        InsertGlobalAddressHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setAddressResource(addressResource)
        .build();
    return insertGlobalAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedProject = GlobalAddressClient.formatProjectName("[PROJECT]");
   *   Address address = Address.newBuilder().build();
   *   InsertGlobalAddressHttpRequest request = InsertGlobalAddressHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setAddress(address)
   *     .build();
   *   Operation response = globalAddressClient.insertGlobalAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertGlobalAddress(InsertGlobalAddressHttpRequest request) {
    return insertGlobalAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedProject = GlobalAddressClient.formatProjectName("[PROJECT]");
   *   Address address = Address.newBuilder().build();
   *   InsertGlobalAddressHttpRequest request = InsertGlobalAddressHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setAddress(address)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = globalAddressClient.insertGlobalAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertGlobalAddressHttpRequest, Operation> insertGlobalAddressCallable() {
    return stub.insertGlobalAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of global addresses.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (Address element : globalAddressClient.listGlobalAddresses(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalAddressesPagedResponse listGlobalAddresses(ProjectName project) {
    ListGlobalAddressesHttpRequest request =
        ListGlobalAddressesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listGlobalAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of global addresses.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedProject = GlobalAddressClient.formatProjectName("[PROJECT]");
   *   ListGlobalAddressesHttpRequest request = ListGlobalAddressesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (Address element : globalAddressClient.listGlobalAddresses(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalAddressesPagedResponse listGlobalAddresses(ListGlobalAddressesHttpRequest request) {
    return listGlobalAddressesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of global addresses.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedProject = GlobalAddressClient.formatProjectName("[PROJECT]");
   *   ListGlobalAddressesHttpRequest request = ListGlobalAddressesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListGlobalAddressesPagedResponse&gt; future = globalAddressClient.listGlobalAddressesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Address element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListGlobalAddressesHttpRequest, ListGlobalAddressesPagedResponse> listGlobalAddressesPagedCallable() {
    return stub.listGlobalAddressesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of global addresses.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
   *   String formattedProject = GlobalAddressClient.formatProjectName("[PROJECT]");
   *   ListGlobalAddressesHttpRequest request = ListGlobalAddressesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     AddressList response = globalAddressClient.listGlobalAddressesCallable().call(request);
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
  public final UnaryCallable<ListGlobalAddressesHttpRequest, AddressList> listGlobalAddressesCallable() {
    return stub.listGlobalAddressesCallable();
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