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
import com.google.compute.v1.stub.GlobalAddressAdminStub;
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
 * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
 *
 *   Operation response = globalAddressAdminClient.deleteGlobalAddress();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the globalAddressAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of GlobalAddressAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * GlobalAddressAdminSettings globalAddressAdminSettings =
 *     GlobalAddressAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GlobalAddressAdminClient globalAddressAdminClient =
 *     GlobalAddressAdminClient.create(globalAddressAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * GlobalAddressAdminSettings globalAddressAdminSettings =
 *     GlobalAddressAdminSettings.defaultBuilder()
 *         .setTransportProvider(GlobalAddressAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(GlobalAddressAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * GlobalAddressAdminClient globalAddressAdminClient =
 *     GlobalAddressAdminClient.create(globalAddressAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GlobalAddressAdminClient implements BackgroundResource {
  private final GlobalAddressAdminSettings settings;
  private final GlobalAddressAdminStub stub;



  /**
   * Constructs an instance of GlobalAddressAdminClient with default settings.
   */
  public static final GlobalAddressAdminClient create() throws IOException {
    return create(GlobalAddressAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of GlobalAddressAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final GlobalAddressAdminClient create(GlobalAddressAdminSettings settings) throws IOException {
    return new GlobalAddressAdminClient(settings);
  }

  /**
   * Constructs an instance of GlobalAddressAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use GlobalAddressAdminSettings}.
   */
  public static final GlobalAddressAdminClient create(GlobalAddressAdminStub stub) {
    return new GlobalAddressAdminClient(stub);
  }

  /**
   * Constructs an instance of GlobalAddressAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GlobalAddressAdminClient(GlobalAddressAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected GlobalAddressAdminClient(GlobalAddressAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GlobalAddressAdminSettings getSettings() {
    return settings;
  }

  public GlobalAddressAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   Operation response = globalAddressAdminClient.deleteGlobalAddress();
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
        .setAddressWithGlobalAddressesAddressName(address)
        .build();
    return deleteGlobalAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   Operation response = globalAddressAdminClient.deleteGlobalAddress();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = globalAddressAdminClient.deleteGlobalAddressCallable().futureCall();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   Address response = globalAddressAdminClient.getGlobalAddress();
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
        .setAddressWithGlobalAddressesAddressName(address)
        .build();
    return getGlobalAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource. Get a list of available addresses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   Address response = globalAddressAdminClient.getGlobalAddress();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   ApiFuture&lt;Address&gt; future = globalAddressAdminClient.getGlobalAddressCallable().futureCall();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   Operation response = globalAddressAdminClient.insertGlobalAddress();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param address A reserved address resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertGlobalAddress(GlobalAddressesProjectName project, Address address) {

    InsertGlobalAddressHttpRequest request =
        InsertGlobalAddressHttpRequest.newBuilder()
        .setProjectWithGlobalAddressesProjectName(project)
        .setAddress(address)
        .build();
    return insertGlobalAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   Operation response = globalAddressAdminClient.insertGlobalAddress();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = globalAddressAdminClient.insertGlobalAddressCallable().futureCall();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   for (Address element : globalAddressAdminClient.listGlobalAddresses().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalAddressesPagedResponse listGlobalAddresses(GlobalAddressesProjectName project) {
    ListGlobalAddressesHttpRequest request =
        ListGlobalAddressesHttpRequest.newBuilder()
        .setProjectWithGlobalAddressesProjectName(project)
        .build();
    return listGlobalAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of global addresses.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   for (Address element : globalAddressAdminClient.listGlobalAddresses().iterateAll()) {
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   ApiFuture&lt;ListGlobalAddressesPagedResponse&gt; future = globalAddressAdminClient.listGlobalAddressesPagedCallable().futureCall();
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
   * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
   *
   *   while (true) {
   *     AddressList response = globalAddressAdminClient.listGlobalAddressesCallable().call();
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