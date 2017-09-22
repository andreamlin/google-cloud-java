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
import static com.google.compute.v1.PagedResponseWrappers.ListNetworksPagedResponse;
import com.google.compute.v1.stub.NetworkAdminStub;
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
 * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
 *
 *   Operation response = networkAdminClient.deleteNetwork();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the networkAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of NetworkAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * NetworkAdminSettings networkAdminSettings =
 *     NetworkAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * NetworkAdminClient networkAdminClient =
 *     NetworkAdminClient.create(networkAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * NetworkAdminSettings networkAdminSettings =
 *     NetworkAdminSettings.defaultBuilder()
 *         .setTransportProvider(NetworkAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(NetworkAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * NetworkAdminClient networkAdminClient =
 *     NetworkAdminClient.create(networkAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class NetworkAdminClient implements BackgroundResource {
  private final NetworkAdminSettings settings;
  private final NetworkAdminStub stub;



  /**
   * Constructs an instance of NetworkAdminClient with default settings.
   */
  public static final NetworkAdminClient create() throws IOException {
    return create(NetworkAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of NetworkAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final NetworkAdminClient create(NetworkAdminSettings settings) throws IOException {
    return new NetworkAdminClient(settings);
  }

  /**
   * Constructs an instance of NetworkAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use NetworkAdminSettings}.
   */
  public static final NetworkAdminClient create(NetworkAdminStub stub) {
    return new NetworkAdminClient(stub);
  }

  /**
   * Constructs an instance of NetworkAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected NetworkAdminClient(NetworkAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected NetworkAdminClient(NetworkAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final NetworkAdminSettings getSettings() {
    return settings;
  }

  public NetworkAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified network.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Operation response = networkAdminClient.deleteNetwork();
   * }
   * </code></pre>
   *
   * @param network Name of the network to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteNetwork(NetworkName network) {

    DeleteNetworkHttpRequest request =
        DeleteNetworkHttpRequest.newBuilder()
        .setNetworkWithNetworkName(network)
        .build();
    return deleteNetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified network.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Operation response = networkAdminClient.deleteNetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteNetwork(DeleteNetworkHttpRequest request) {
    return deleteNetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified network.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = networkAdminClient.deleteNetworkCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteNetworkHttpRequest, Operation> deleteNetworkCallable() {
    return stub.deleteNetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified network. Get a list of available networks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Network response = networkAdminClient.getNetwork();
   * }
   * </code></pre>
   *
   * @param network Name of the network to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Network getNetwork(NetworkName network) {

    GetNetworkHttpRequest request =
        GetNetworkHttpRequest.newBuilder()
        .setNetworkWithNetworkName(network)
        .build();
    return getNetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified network. Get a list of available networks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Network response = networkAdminClient.getNetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Network getNetwork(GetNetworkHttpRequest request) {
    return getNetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified network. Get a list of available networks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Network&gt; future = networkAdminClient.getNetworkCallable().futureCall();
   *   // Do something
   *   Network response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetNetworkHttpRequest, Network> getNetworkCallable() {
    return stub.getNetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a network in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Operation response = networkAdminClient.insertNetwork();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param network Represents a Network resource. Read Networks and Firewalls for more information.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertNetwork(NetworksProjectName project, Network network) {

    InsertNetworkHttpRequest request =
        InsertNetworkHttpRequest.newBuilder()
        .setProjectWithNetworksProjectName(project)
        .setNetwork(network)
        .build();
    return insertNetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a network in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Operation response = networkAdminClient.insertNetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertNetwork(InsertNetworkHttpRequest request) {
    return insertNetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a network in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = networkAdminClient.insertNetworkCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertNetworkHttpRequest, Operation> insertNetworkCallable() {
    return stub.insertNetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of networks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   for (Network element : networkAdminClient.listNetworks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListNetworksPagedResponse listNetworks(NetworksProjectName project) {
    ListNetworksHttpRequest request =
        ListNetworksHttpRequest.newBuilder()
        .setProjectWithNetworksProjectName(project)
        .build();
    return listNetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of networks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   for (Network element : networkAdminClient.listNetworks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListNetworksPagedResponse listNetworks(ListNetworksHttpRequest request) {
    return listNetworksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of networks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;ListNetworksPagedResponse&gt; future = networkAdminClient.listNetworksPagedCallable().futureCall();
   *   // Do something
   *   for (Network element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListNetworksHttpRequest, ListNetworksPagedResponse> listNetworksPagedCallable() {
    return stub.listNetworksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of networks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   while (true) {
   *     NetworkList response = networkAdminClient.listNetworksCallable().call();
   *     for (Network element : response.getItems()) {
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
  public final UnaryCallable<ListNetworksHttpRequest, NetworkList> listNetworksCallable() {
    return stub.listNetworksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Switches the network mode from auto subnet mode to custom subnet mode.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Operation response = networkAdminClient.switchToCustomModeNetwork();
   * }
   * </code></pre>
   *
   * @param network Name of the network to be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation switchToCustomModeNetwork(NetworkName network) {

    SwitchToCustomModeNetworkHttpRequest request =
        SwitchToCustomModeNetworkHttpRequest.newBuilder()
        .setNetworkWithNetworkName(network)
        .build();
    return switchToCustomModeNetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Switches the network mode from auto subnet mode to custom subnet mode.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   Operation response = networkAdminClient.switchToCustomModeNetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation switchToCustomModeNetwork(SwitchToCustomModeNetworkHttpRequest request) {
    return switchToCustomModeNetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Switches the network mode from auto subnet mode to custom subnet mode.
   *
   * Sample code:
   * <pre><code>
   * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = networkAdminClient.switchToCustomModeNetworkCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation> switchToCustomModeNetworkCallable() {
    return stub.switchToCustomModeNetworkCallable();
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