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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetVpnGatewaysPagedResponse;
import com.google.compute.v1.stub.TargetVpnGatewayAdminStub;
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
 * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
 *
 *   Operation response = targetVpnGatewayAdminClient.deleteTargetVpnGateway();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetVpnGatewayAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetVpnGatewayAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetVpnGatewayAdminSettings targetVpnGatewayAdminSettings =
 *     TargetVpnGatewayAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetVpnGatewayAdminClient targetVpnGatewayAdminClient =
 *     TargetVpnGatewayAdminClient.create(targetVpnGatewayAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetVpnGatewayAdminSettings targetVpnGatewayAdminSettings =
 *     TargetVpnGatewayAdminSettings.defaultBuilder()
 *         .setTransportProvider(TargetVpnGatewayAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(TargetVpnGatewayAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetVpnGatewayAdminClient targetVpnGatewayAdminClient =
 *     TargetVpnGatewayAdminClient.create(targetVpnGatewayAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetVpnGatewayAdminClient implements BackgroundResource {
  private final TargetVpnGatewayAdminSettings settings;
  private final TargetVpnGatewayAdminStub stub;



  /**
   * Constructs an instance of TargetVpnGatewayAdminClient with default settings.
   */
  public static final TargetVpnGatewayAdminClient create() throws IOException {
    return create(TargetVpnGatewayAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of TargetVpnGatewayAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetVpnGatewayAdminClient create(TargetVpnGatewayAdminSettings settings) throws IOException {
    return new TargetVpnGatewayAdminClient(settings);
  }

  /**
   * Constructs an instance of TargetVpnGatewayAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetVpnGatewayAdminSettings}.
   */
  public static final TargetVpnGatewayAdminClient create(TargetVpnGatewayAdminStub stub) {
    return new TargetVpnGatewayAdminClient(stub);
  }

  /**
   * Constructs an instance of TargetVpnGatewayAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetVpnGatewayAdminClient(TargetVpnGatewayAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetVpnGatewayAdminClient(TargetVpnGatewayAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetVpnGatewayAdminSettings getSettings() {
    return settings;
  }

  public TargetVpnGatewayAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   for (TargetVpnGateway element : targetVpnGatewayAdminClient.aggregatedListTargetVpnGateways().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetVpnGatewaysPagedResponse aggregatedListTargetVpnGateways(TargetVpnGatewaysProjectName project) {
    AggregatedListTargetVpnGatewaysHttpRequest request =
        AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
        .setProjectWithTargetVpnGatewaysProjectName(project)
        .build();
    return aggregatedListTargetVpnGateways(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   for (TargetVpnGateway element : targetVpnGatewayAdminClient.aggregatedListTargetVpnGateways().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetVpnGatewaysPagedResponse aggregatedListTargetVpnGateways(AggregatedListTargetVpnGatewaysHttpRequest request) {
    return aggregatedListTargetVpnGatewaysPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListTargetVpnGatewaysPagedResponse&gt; future = targetVpnGatewayAdminClient.aggregatedListTargetVpnGatewaysPagedCallable().futureCall();
   *   // Do something
   *   for (TargetVpnGateway element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysPagedCallable() {
    return stub.aggregatedListTargetVpnGatewaysPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   while (true) {
   *     TargetVpnGatewayAggregatedList response = targetVpnGatewayAdminClient.aggregatedListTargetVpnGatewaysCallable().call();
   *     for (TargetVpnGateway element : response.getTargetVpnGateways()) {
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
  public final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysCallable() {
    return stub.aggregatedListTargetVpnGatewaysCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target VPN gateway.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   Operation response = targetVpnGatewayAdminClient.deleteTargetVpnGateway();
   * }
   * </code></pre>
   *
   * @param targetVpnGateway Name of the target VPN gateway to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetVpnGateway(TargetVpnGatewayName targetVpnGateway) {

    DeleteTargetVpnGatewayHttpRequest request =
        DeleteTargetVpnGatewayHttpRequest.newBuilder()
        .setTargetVpnGatewayWithTargetVpnGatewayName(targetVpnGateway)
        .build();
    return deleteTargetVpnGateway(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target VPN gateway.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   Operation response = targetVpnGatewayAdminClient.deleteTargetVpnGateway();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetVpnGateway(DeleteTargetVpnGatewayHttpRequest request) {
    return deleteTargetVpnGatewayCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target VPN gateway.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetVpnGatewayAdminClient.deleteTargetVpnGatewayCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayCallable() {
    return stub.deleteTargetVpnGatewayCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   TargetVpnGateway response = targetVpnGatewayAdminClient.getTargetVpnGateway();
   * }
   * </code></pre>
   *
   * @param targetVpnGateway Name of the target VPN gateway to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetVpnGateway getTargetVpnGateway(TargetVpnGatewayName targetVpnGateway) {

    GetTargetVpnGatewayHttpRequest request =
        GetTargetVpnGatewayHttpRequest.newBuilder()
        .setTargetVpnGatewayWithTargetVpnGatewayName(targetVpnGateway)
        .build();
    return getTargetVpnGateway(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   TargetVpnGateway response = targetVpnGatewayAdminClient.getTargetVpnGateway();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetVpnGateway getTargetVpnGateway(GetTargetVpnGatewayHttpRequest request) {
    return getTargetVpnGatewayCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetVpnGateway&gt; future = targetVpnGatewayAdminClient.getTargetVpnGatewayCallable().futureCall();
   *   // Do something
   *   TargetVpnGateway response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayCallable() {
    return stub.getTargetVpnGatewayCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target VPN gateway in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   Operation response = targetVpnGatewayAdminClient.insertTargetVpnGateway();
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param targetVpnGateway Represents a Target VPN gateway resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetVpnGateway(TargetVpnGatewaysRegionName region, TargetVpnGateway targetVpnGateway) {

    InsertTargetVpnGatewayHttpRequest request =
        InsertTargetVpnGatewayHttpRequest.newBuilder()
        .setRegionWithTargetVpnGatewaysRegionName(region)
        .setTargetVpnGateway(targetVpnGateway)
        .build();
    return insertTargetVpnGateway(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target VPN gateway in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   Operation response = targetVpnGatewayAdminClient.insertTargetVpnGateway();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetVpnGateway(InsertTargetVpnGatewayHttpRequest request) {
    return insertTargetVpnGatewayCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target VPN gateway in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetVpnGatewayAdminClient.insertTargetVpnGatewayCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayCallable() {
    return stub.insertTargetVpnGatewayCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   for (TargetVpnGateway element : targetVpnGatewayAdminClient.listTargetVpnGateways().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetVpnGatewaysPagedResponse listTargetVpnGateways(TargetVpnGatewaysRegionName region) {
    ListTargetVpnGatewaysHttpRequest request =
        ListTargetVpnGatewaysHttpRequest.newBuilder()
        .setRegionWithTargetVpnGatewaysRegionName(region)
        .build();
    return listTargetVpnGateways(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   for (TargetVpnGateway element : targetVpnGatewayAdminClient.listTargetVpnGateways().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetVpnGatewaysPagedResponse listTargetVpnGateways(ListTargetVpnGatewaysHttpRequest request) {
    return listTargetVpnGatewaysPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   ApiFuture&lt;ListTargetVpnGatewaysPagedResponse&gt; future = targetVpnGatewayAdminClient.listTargetVpnGatewaysPagedCallable().futureCall();
   *   // Do something
   *   for (TargetVpnGateway element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetVpnGatewaysHttpRequest, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysPagedCallable() {
    return stub.listTargetVpnGatewaysPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
   *
   *   while (true) {
   *     TargetVpnGatewayList response = targetVpnGatewayAdminClient.listTargetVpnGatewaysCallable().call();
   *     for (TargetVpnGateway element : response.getItems()) {
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
  public final UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysCallable() {
    return stub.listTargetVpnGatewaysCallable();
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