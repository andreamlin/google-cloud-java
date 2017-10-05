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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetInstancesPagedResponse;
import com.google.compute.v1.stub.TargetInstanceAdminStub;
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
 * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
 *
 *   Operation response = targetInstanceAdminClient.deleteTargetInstance();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetInstanceAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetInstanceAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetInstanceAdminSettings targetInstanceAdminSettings =
 *     TargetInstanceAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetInstanceAdminClient targetInstanceAdminClient =
 *     TargetInstanceAdminClient.create(targetInstanceAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetInstanceAdminSettings targetInstanceAdminSettings =
 *     TargetInstanceAdminSettings.defaultBuilder()
 *         .setTransportProvider(TargetInstanceAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(TargetInstanceAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetInstanceAdminClient targetInstanceAdminClient =
 *     TargetInstanceAdminClient.create(targetInstanceAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetInstanceAdminClient implements BackgroundResource {
  private final TargetInstanceAdminSettings settings;
  private final TargetInstanceAdminStub stub;



  /**
   * Constructs an instance of TargetInstanceAdminClient with default settings.
   */
  public static final TargetInstanceAdminClient create() throws IOException {
    return create(TargetInstanceAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of TargetInstanceAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetInstanceAdminClient create(TargetInstanceAdminSettings settings) throws IOException {
    return new TargetInstanceAdminClient(settings);
  }

  /**
   * Constructs an instance of TargetInstanceAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetInstanceAdminSettings}.
   */
  public static final TargetInstanceAdminClient create(TargetInstanceAdminStub stub) {
    return new TargetInstanceAdminClient(stub);
  }

  /**
   * Constructs an instance of TargetInstanceAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetInstanceAdminClient(TargetInstanceAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetInstanceAdminClient(TargetInstanceAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetInstanceAdminSettings getSettings() {
    return settings;
  }

  public TargetInstanceAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target instances.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   for (TargetInstance element : targetInstanceAdminClient.aggregatedListTargetInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetInstancesPagedResponse aggregatedListTargetInstances(ProjectName project) {
    AggregatedListTargetInstancesHttpRequest request =
        AggregatedListTargetInstancesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListTargetInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target instances.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   for (TargetInstance element : targetInstanceAdminClient.aggregatedListTargetInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetInstancesPagedResponse aggregatedListTargetInstances(AggregatedListTargetInstancesHttpRequest request) {
    return aggregatedListTargetInstancesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target instances.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListTargetInstancesPagedResponse&gt; future = targetInstanceAdminClient.aggregatedListTargetInstancesPagedCallable().futureCall();
   *   // Do something
   *   for (TargetInstance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListTargetInstancesHttpRequest, AggregatedListTargetInstancesPagedResponse> aggregatedListTargetInstancesPagedCallable() {
    return stub.aggregatedListTargetInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target instances.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   while (true) {
   *     TargetInstanceAggregatedList response = targetInstanceAdminClient.aggregatedListTargetInstancesCallable().call();
   *     for (TargetInstance element : response.getTargetInstances()) {
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
  public final UnaryCallable<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> aggregatedListTargetInstancesCallable() {
    return stub.aggregatedListTargetInstancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetInstance resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   Operation response = targetInstanceAdminClient.deleteTargetInstance();
   * }
   * </code></pre>
   *
   * @param targetInstance Name of the TargetInstance resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetInstance(TargetInstanceName targetInstance) {

    DeleteTargetInstanceHttpRequest request =
        DeleteTargetInstanceHttpRequest.newBuilder()
        .setTargetInstanceWithTargetInstanceName(targetInstance)
        .build();
    return deleteTargetInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetInstance resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   Operation response = targetInstanceAdminClient.deleteTargetInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetInstance(DeleteTargetInstanceHttpRequest request) {
    return deleteTargetInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetInstance resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetInstanceAdminClient.deleteTargetInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetInstanceHttpRequest, Operation> deleteTargetInstanceCallable() {
    return stub.deleteTargetInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   TargetInstance response = targetInstanceAdminClient.getTargetInstance();
   * }
   * </code></pre>
   *
   * @param targetInstance Name of the TargetInstance resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetInstance getTargetInstance(TargetInstanceName targetInstance) {

    GetTargetInstanceHttpRequest request =
        GetTargetInstanceHttpRequest.newBuilder()
        .setTargetInstanceWithTargetInstanceName(targetInstance)
        .build();
    return getTargetInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   TargetInstance response = targetInstanceAdminClient.getTargetInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetInstance getTargetInstance(GetTargetInstanceHttpRequest request) {
    return getTargetInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetInstance&gt; future = targetInstanceAdminClient.getTargetInstanceCallable().futureCall();
   *   // Do something
   *   TargetInstance response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetInstanceHttpRequest, TargetInstance> getTargetInstanceCallable() {
    return stub.getTargetInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetInstance resource in the specified project and zone using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   Operation response = targetInstanceAdminClient.insertTargetInstance();
   * }
   * </code></pre>
   *
   * @param zone Name of the zone scoping this request.
   * @param targetInstanceResource A TargetInstance resource. This resource defines an endpoint instance that terminates traffic of certain protocols.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetInstance(ZoneName zone, TargetInstance targetInstanceResource) {

    InsertTargetInstanceHttpRequest request =
        InsertTargetInstanceHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .setTargetInstanceResource(targetInstanceResource)
        .build();
    return insertTargetInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetInstance resource in the specified project and zone using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   Operation response = targetInstanceAdminClient.insertTargetInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetInstance(InsertTargetInstanceHttpRequest request) {
    return insertTargetInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetInstance resource in the specified project and zone using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetInstanceAdminClient.insertTargetInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetInstanceHttpRequest, Operation> insertTargetInstanceCallable() {
    return stub.insertTargetInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of TargetInstance resources available to the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   for (TargetInstance element : targetInstanceAdminClient.listTargetInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone Name of the zone scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetInstancesPagedResponse listTargetInstances(ZoneName zone) {
    ListTargetInstancesHttpRequest request =
        ListTargetInstancesHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listTargetInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of TargetInstance resources available to the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   for (TargetInstance element : targetInstanceAdminClient.listTargetInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetInstancesPagedResponse listTargetInstances(ListTargetInstancesHttpRequest request) {
    return listTargetInstancesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of TargetInstance resources available to the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;ListTargetInstancesPagedResponse&gt; future = targetInstanceAdminClient.listTargetInstancesPagedCallable().futureCall();
   *   // Do something
   *   for (TargetInstance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetInstancesHttpRequest, ListTargetInstancesPagedResponse> listTargetInstancesPagedCallable() {
    return stub.listTargetInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of TargetInstance resources available to the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
   *
   *   while (true) {
   *     TargetInstanceList response = targetInstanceAdminClient.listTargetInstancesCallable().call();
   *     for (TargetInstance element : response.getItems()) {
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
  public final UnaryCallable<ListTargetInstancesHttpRequest, TargetInstanceList> listTargetInstancesCallable() {
    return stub.listTargetInstancesCallable();
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