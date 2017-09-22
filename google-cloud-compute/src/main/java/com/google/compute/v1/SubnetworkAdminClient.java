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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListSubnetworksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListSubnetworksPagedResponse;
import com.google.compute.v1.stub.SubnetworkAdminStub;
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
 * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
 *
 *   Operation response = subnetworkAdminClient.deleteSubnetwork();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the subnetworkAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of SubnetworkAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * SubnetworkAdminSettings subnetworkAdminSettings =
 *     SubnetworkAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SubnetworkAdminClient subnetworkAdminClient =
 *     SubnetworkAdminClient.create(subnetworkAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SubnetworkAdminSettings subnetworkAdminSettings =
 *     SubnetworkAdminSettings.defaultBuilder()
 *         .setTransportProvider(SubnetworkAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(SubnetworkAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * SubnetworkAdminClient subnetworkAdminClient =
 *     SubnetworkAdminClient.create(subnetworkAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SubnetworkAdminClient implements BackgroundResource {
  private final SubnetworkAdminSettings settings;
  private final SubnetworkAdminStub stub;



  /**
   * Constructs an instance of SubnetworkAdminClient with default settings.
   */
  public static final SubnetworkAdminClient create() throws IOException {
    return create(SubnetworkAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of SubnetworkAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final SubnetworkAdminClient create(SubnetworkAdminSettings settings) throws IOException {
    return new SubnetworkAdminClient(settings);
  }

  /**
   * Constructs an instance of SubnetworkAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use SubnetworkAdminSettings}.
   */
  public static final SubnetworkAdminClient create(SubnetworkAdminStub stub) {
    return new SubnetworkAdminClient(stub);
  }

  /**
   * Constructs an instance of SubnetworkAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected SubnetworkAdminClient(SubnetworkAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected SubnetworkAdminClient(SubnetworkAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SubnetworkAdminSettings getSettings() {
    return settings;
  }

  public SubnetworkAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   for (Subnetwork element : subnetworkAdminClient.aggregatedListSubnetworks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListSubnetworksPagedResponse aggregatedListSubnetworks(SubnetworksProjectName project) {
    AggregatedListSubnetworksHttpRequest request =
        AggregatedListSubnetworksHttpRequest.newBuilder()
        .setProjectWithSubnetworksProjectName(project)
        .build();
    return aggregatedListSubnetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   for (Subnetwork element : subnetworkAdminClient.aggregatedListSubnetworks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListSubnetworksPagedResponse aggregatedListSubnetworks(AggregatedListSubnetworksHttpRequest request) {
    return aggregatedListSubnetworksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListSubnetworksPagedResponse&gt; future = subnetworkAdminClient.aggregatedListSubnetworksPagedCallable().futureCall();
   *   // Do something
   *   for (Subnetwork element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListSubnetworksHttpRequest, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksPagedCallable() {
    return stub.aggregatedListSubnetworksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   while (true) {
   *     SubnetworkAggregatedList response = subnetworkAdminClient.aggregatedListSubnetworksCallable().call();
   *     for (Subnetwork element : response.getSubnetworks()) {
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
  public final UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksCallable() {
    return stub.aggregatedListSubnetworksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Operation response = subnetworkAdminClient.deleteSubnetwork();
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSubnetwork(SubnetworkName subnetwork) {

    DeleteSubnetworkHttpRequest request =
        DeleteSubnetworkHttpRequest.newBuilder()
        .setSubnetworkWithSubnetworkName(subnetwork)
        .build();
    return deleteSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Operation response = subnetworkAdminClient.deleteSubnetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSubnetwork(DeleteSubnetworkHttpRequest request) {
    return deleteSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = subnetworkAdminClient.deleteSubnetworkCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkCallable() {
    return stub.deleteSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Operation response = subnetworkAdminClient.expandIpCidrRangeSubnetwork();
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to update.
   * @param subnetworksExpandIpCidrRangeRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation expandIpCidrRangeSubnetwork(SubnetworkName subnetwork, SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequest) {

    ExpandIpCidrRangeSubnetworkHttpRequest request =
        ExpandIpCidrRangeSubnetworkHttpRequest.newBuilder()
        .setSubnetworkWithSubnetworkName(subnetwork)
        .setSubnetworksExpandIpCidrRangeRequest(subnetworksExpandIpCidrRangeRequest)
        .build();
    return expandIpCidrRangeSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Operation response = subnetworkAdminClient.expandIpCidrRangeSubnetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation expandIpCidrRangeSubnetwork(ExpandIpCidrRangeSubnetworkHttpRequest request) {
    return expandIpCidrRangeSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = subnetworkAdminClient.expandIpCidrRangeSubnetworkCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkCallable() {
    return stub.expandIpCidrRangeSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Subnetwork response = subnetworkAdminClient.getSubnetwork();
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Subnetwork getSubnetwork(SubnetworkName subnetwork) {

    GetSubnetworkHttpRequest request =
        GetSubnetworkHttpRequest.newBuilder()
        .setSubnetworkWithSubnetworkName(subnetwork)
        .build();
    return getSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Subnetwork response = subnetworkAdminClient.getSubnetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Subnetwork getSubnetwork(GetSubnetworkHttpRequest request) {
    return getSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Subnetwork&gt; future = subnetworkAdminClient.getSubnetworkCallable().futureCall();
   *   // Do something
   *   Subnetwork response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkCallable() {
    return stub.getSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Operation response = subnetworkAdminClient.insertSubnetwork();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param subnetwork A Subnetwork resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSubnetwork(SubnetworksRegionName region, Subnetwork subnetwork) {

    InsertSubnetworkHttpRequest request =
        InsertSubnetworkHttpRequest.newBuilder()
        .setRegionWithSubnetworksRegionName(region)
        .setSubnetwork(subnetwork)
        .build();
    return insertSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   Operation response = subnetworkAdminClient.insertSubnetwork();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSubnetwork(InsertSubnetworkHttpRequest request) {
    return insertSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = subnetworkAdminClient.insertSubnetworkCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertSubnetworkHttpRequest, Operation> insertSubnetworkCallable() {
    return stub.insertSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   for (Subnetwork element : subnetworkAdminClient.listSubnetworks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSubnetworksPagedResponse listSubnetworks(SubnetworksRegionName region) {
    ListSubnetworksHttpRequest request =
        ListSubnetworksHttpRequest.newBuilder()
        .setRegionWithSubnetworksRegionName(region)
        .build();
    return listSubnetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   for (Subnetwork element : subnetworkAdminClient.listSubnetworks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSubnetworksPagedResponse listSubnetworks(ListSubnetworksHttpRequest request) {
    return listSubnetworksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   ApiFuture&lt;ListSubnetworksPagedResponse&gt; future = subnetworkAdminClient.listSubnetworksPagedCallable().futureCall();
   *   // Do something
   *   for (Subnetwork element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSubnetworksHttpRequest, ListSubnetworksPagedResponse> listSubnetworksPagedCallable() {
    return stub.listSubnetworksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
   *
   *   while (true) {
   *     SubnetworkList response = subnetworkAdminClient.listSubnetworksCallable().call();
   *     for (Subnetwork element : response.getItems()) {
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
  public final UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksCallable() {
    return stub.listSubnetworksCallable();
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