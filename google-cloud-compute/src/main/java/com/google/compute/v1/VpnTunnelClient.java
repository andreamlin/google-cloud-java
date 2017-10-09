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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListVpnTunnelsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListVpnTunnelsPagedResponse;
import com.google.compute.v1.stub.VpnTunnelStub;
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
 * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
 *
 *   Operation response = vpnTunnelClient.deleteVpnTunnel();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the vpnTunnelClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of VpnTunnelSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * VpnTunnelSettings vpnTunnelSettings =
 *     VpnTunnelSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * VpnTunnelClient vpnTunnelClient =
 *     VpnTunnelClient.create(vpnTunnelSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * VpnTunnelSettings vpnTunnelSettings =
 *     VpnTunnelSettings.newBuilder()
 *         .setTransportProvider(VpnTunnelSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(VpnTunnelSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * VpnTunnelClient vpnTunnelClient =
 *     VpnTunnelClient.create(vpnTunnelSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class VpnTunnelClient implements BackgroundResource {
  private final VpnTunnelSettings settings;
  private final VpnTunnelStub stub;



  /**
   * Constructs an instance of VpnTunnelClient with default settings.
   */
  public static final VpnTunnelClient create() throws IOException {
    return create(VpnTunnelSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of VpnTunnelClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final VpnTunnelClient create(VpnTunnelSettings settings) throws IOException {
    return new VpnTunnelClient(settings);
  }

  /**
   * Constructs an instance of VpnTunnelClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use VpnTunnelSettings}.
   */
  public static final VpnTunnelClient create(VpnTunnelStub stub) {
    return new VpnTunnelClient(stub);
  }

  /**
   * Constructs an instance of VpnTunnelClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected VpnTunnelClient(VpnTunnelSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected VpnTunnelClient(VpnTunnelStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final VpnTunnelSettings getSettings() {
    return settings;
  }

  @BetaApi
  public VpnTunnelStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of VPN tunnels.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   for (VpnTunnel element : vpnTunnelClient.aggregatedListVpnTunnels().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListVpnTunnelsPagedResponse aggregatedListVpnTunnels(ProjectName project) {
    AggregatedListVpnTunnelsHttpRequest request =
        AggregatedListVpnTunnelsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListVpnTunnels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of VPN tunnels.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   for (VpnTunnel element : vpnTunnelClient.aggregatedListVpnTunnels().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListVpnTunnelsPagedResponse aggregatedListVpnTunnels(AggregatedListVpnTunnelsHttpRequest request) {
    return aggregatedListVpnTunnelsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of VPN tunnels.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListVpnTunnelsPagedResponse&gt; future = vpnTunnelClient.aggregatedListVpnTunnelsPagedCallable().futureCall();
   *   // Do something
   *   for (VpnTunnel element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsPagedCallable() {
    return stub.aggregatedListVpnTunnelsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of VPN tunnels.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   while (true) {
   *     VpnTunnelAggregatedList response = vpnTunnelClient.aggregatedListVpnTunnelsCallable().call();
   *     for (VpnTunnel element : response.getVpnTunnels()) {
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
  public final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> aggregatedListVpnTunnelsCallable() {
    return stub.aggregatedListVpnTunnelsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified VpnTunnel resource.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   Operation response = vpnTunnelClient.deleteVpnTunnel();
   * }
   * </code></pre>
   *
   * @param vpnTunnel Name of the VpnTunnel resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteVpnTunnel(VpnTunnelName vpnTunnel) {

    DeleteVpnTunnelHttpRequest request =
        DeleteVpnTunnelHttpRequest.newBuilder()
        .setVpnTunnelWithVpnTunnelName(vpnTunnel)
        .build();
    return deleteVpnTunnel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified VpnTunnel resource.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   Operation response = vpnTunnelClient.deleteVpnTunnel();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteVpnTunnel(DeleteVpnTunnelHttpRequest request) {
    return deleteVpnTunnelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified VpnTunnel resource.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = vpnTunnelClient.deleteVpnTunnelCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelCallable() {
    return stub.deleteVpnTunnelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   VpnTunnel response = vpnTunnelClient.getVpnTunnel();
   * }
   * </code></pre>
   *
   * @param vpnTunnel Name of the VpnTunnel resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final VpnTunnel getVpnTunnel(VpnTunnelName vpnTunnel) {

    GetVpnTunnelHttpRequest request =
        GetVpnTunnelHttpRequest.newBuilder()
        .setVpnTunnelWithVpnTunnelName(vpnTunnel)
        .build();
    return getVpnTunnel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   VpnTunnel response = vpnTunnelClient.getVpnTunnel();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final VpnTunnel getVpnTunnel(GetVpnTunnelHttpRequest request) {
    return getVpnTunnelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   ApiFuture&lt;VpnTunnel&gt; future = vpnTunnelClient.getVpnTunnelCallable().futureCall();
   *   // Do something
   *   VpnTunnel response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelCallable() {
    return stub.getVpnTunnelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a VpnTunnel resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   Operation response = vpnTunnelClient.insertVpnTunnel();
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param vpnTunnelResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertVpnTunnel(RegionName region, VpnTunnel vpnTunnelResource) {

    InsertVpnTunnelHttpRequest request =
        InsertVpnTunnelHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .setVpnTunnelResource(vpnTunnelResource)
        .build();
    return insertVpnTunnel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a VpnTunnel resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   Operation response = vpnTunnelClient.insertVpnTunnel();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertVpnTunnel(InsertVpnTunnelHttpRequest request) {
    return insertVpnTunnelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a VpnTunnel resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = vpnTunnelClient.insertVpnTunnelCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelCallable() {
    return stub.insertVpnTunnelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of VpnTunnel resources contained in the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   for (VpnTunnel element : vpnTunnelClient.listVpnTunnels().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListVpnTunnelsPagedResponse listVpnTunnels(RegionName region) {
    ListVpnTunnelsHttpRequest request =
        ListVpnTunnelsHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listVpnTunnels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of VpnTunnel resources contained in the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   for (VpnTunnel element : vpnTunnelClient.listVpnTunnels().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListVpnTunnelsPagedResponse listVpnTunnels(ListVpnTunnelsHttpRequest request) {
    return listVpnTunnelsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of VpnTunnel resources contained in the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   ApiFuture&lt;ListVpnTunnelsPagedResponse&gt; future = vpnTunnelClient.listVpnTunnelsPagedCallable().futureCall();
   *   // Do something
   *   for (VpnTunnel element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListVpnTunnelsHttpRequest, ListVpnTunnelsPagedResponse> listVpnTunnelsPagedCallable() {
    return stub.listVpnTunnelsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of VpnTunnel resources contained in the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
   *
   *   while (true) {
   *     VpnTunnelList response = vpnTunnelClient.listVpnTunnelsCallable().call();
   *     for (VpnTunnel element : response.getItems()) {
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
  public final UnaryCallable<ListVpnTunnelsHttpRequest, VpnTunnelList> listVpnTunnelsCallable() {
    return stub.listVpnTunnelsCallable();
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