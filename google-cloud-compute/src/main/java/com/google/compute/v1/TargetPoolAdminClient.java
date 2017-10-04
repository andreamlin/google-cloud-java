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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetPoolsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetPoolsPagedResponse;
import com.google.compute.v1.stub.TargetPoolAdminStub;
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
 * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
 *
 *   Operation response = targetPoolAdminClient.addHealthCheckTargetPool();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetPoolAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetPoolAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetPoolAdminSettings targetPoolAdminSettings =
 *     TargetPoolAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetPoolAdminClient targetPoolAdminClient =
 *     TargetPoolAdminClient.create(targetPoolAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetPoolAdminSettings targetPoolAdminSettings =
 *     TargetPoolAdminSettings.defaultBuilder()
 *         .setTransportProvider(TargetPoolAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(TargetPoolAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetPoolAdminClient targetPoolAdminClient =
 *     TargetPoolAdminClient.create(targetPoolAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetPoolAdminClient implements BackgroundResource {
  private final TargetPoolAdminSettings settings;
  private final TargetPoolAdminStub stub;



  /**
   * Constructs an instance of TargetPoolAdminClient with default settings.
   */
  public static final TargetPoolAdminClient create() throws IOException {
    return create(TargetPoolAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of TargetPoolAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetPoolAdminClient create(TargetPoolAdminSettings settings) throws IOException {
    return new TargetPoolAdminClient(settings);
  }

  /**
   * Constructs an instance of TargetPoolAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetPoolAdminSettings}.
   */
  public static final TargetPoolAdminClient create(TargetPoolAdminStub stub) {
    return new TargetPoolAdminClient(stub);
  }

  /**
   * Constructs an instance of TargetPoolAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetPoolAdminClient(TargetPoolAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetPoolAdminClient(TargetPoolAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetPoolAdminSettings getSettings() {
    return settings;
  }

  public TargetPoolAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds health check URLs to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.addHealthCheckTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the target pool to add a health check to.
   * @param targetPoolsAddHealthCheckRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addHealthCheckTargetPool(TargetPoolName targetPool, TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource) {

    AddHealthCheckTargetPoolHttpRequest request =
        AddHealthCheckTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .setTargetPoolsAddHealthCheckRequestResource(targetPoolsAddHealthCheckRequestResource)
        .build();
    return addHealthCheckTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds health check URLs to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.addHealthCheckTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addHealthCheckTargetPool(AddHealthCheckTargetPoolHttpRequest request) {
    return addHealthCheckTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds health check URLs to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.addHealthCheckTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolCallable() {
    return stub.addHealthCheckTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an instance to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.addInstanceTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the TargetPool resource to add instances to.
   * @param targetPoolsAddInstanceRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addInstanceTargetPool(TargetPoolName targetPool, TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequestResource) {

    AddInstanceTargetPoolHttpRequest request =
        AddInstanceTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .setTargetPoolsAddInstanceRequestResource(targetPoolsAddInstanceRequestResource)
        .build();
    return addInstanceTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an instance to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.addInstanceTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addInstanceTargetPool(AddInstanceTargetPoolHttpRequest request) {
    return addInstanceTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an instance to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.addInstanceTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolCallable() {
    return stub.addInstanceTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target pools.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   for (TargetPool element : targetPoolAdminClient.aggregatedListTargetPools().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetPoolsPagedResponse aggregatedListTargetPools(TargetPoolsProjectName project) {
    AggregatedListTargetPoolsHttpRequest request =
        AggregatedListTargetPoolsHttpRequest.newBuilder()
        .setProjectWithTargetPoolsProjectName(project)
        .build();
    return aggregatedListTargetPools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target pools.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   for (TargetPool element : targetPoolAdminClient.aggregatedListTargetPools().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetPoolsPagedResponse aggregatedListTargetPools(AggregatedListTargetPoolsHttpRequest request) {
    return aggregatedListTargetPoolsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target pools.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListTargetPoolsPagedResponse&gt; future = targetPoolAdminClient.aggregatedListTargetPoolsPagedCallable().futureCall();
   *   // Do something
   *   for (TargetPool element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListTargetPoolsHttpRequest, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsPagedCallable() {
    return stub.aggregatedListTargetPoolsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target pools.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   while (true) {
   *     TargetPoolAggregatedList response = targetPoolAdminClient.aggregatedListTargetPoolsCallable().call();
   *     for (TargetPool element : response.getTargetPools()) {
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
  public final UnaryCallable<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> aggregatedListTargetPoolsCallable() {
    return stub.aggregatedListTargetPoolsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.deleteTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the TargetPool resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetPool(TargetPoolName targetPool) {

    DeleteTargetPoolHttpRequest request =
        DeleteTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .build();
    return deleteTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.deleteTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetPool(DeleteTargetPoolHttpRequest request) {
    return deleteTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.deleteTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolCallable() {
    return stub.deleteTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target pool. Get a list of available target pools by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   TargetPool response = targetPoolAdminClient.getTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the TargetPool resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetPool getTargetPool(TargetPoolName targetPool) {

    GetTargetPoolHttpRequest request =
        GetTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .build();
    return getTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target pool. Get a list of available target pools by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   TargetPool response = targetPoolAdminClient.getTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetPool getTargetPool(GetTargetPoolHttpRequest request) {
    return getTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target pool. Get a list of available target pools by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetPool&gt; future = targetPoolAdminClient.getTargetPoolCallable().futureCall();
   *   // Do something
   *   TargetPool response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetPoolHttpRequest, TargetPool> getTargetPoolCallable() {
    return stub.getTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for each IP for the instance that is referenced by the given target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   TargetPoolInstanceHealth response = targetPoolAdminClient.getHealthTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the TargetPool resource to which the queried instance belongs.
   * @param instanceReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetPoolInstanceHealth getHealthTargetPool(TargetPoolName targetPool, InstanceReference instanceReferenceResource) {

    GetHealthTargetPoolHttpRequest request =
        GetHealthTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .setInstanceReferenceResource(instanceReferenceResource)
        .build();
    return getHealthTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for each IP for the instance that is referenced by the given target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   TargetPoolInstanceHealth response = targetPoolAdminClient.getHealthTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetPoolInstanceHealth getHealthTargetPool(GetHealthTargetPoolHttpRequest request) {
    return getHealthTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for each IP for the instance that is referenced by the given target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetPoolInstanceHealth&gt; future = targetPoolAdminClient.getHealthTargetPoolCallable().futureCall();
   *   // Do something
   *   TargetPoolInstanceHealth response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolCallable() {
    return stub.getHealthTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target pool in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.insertTargetPool();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param targetPoolResource A TargetPool resource. This resource defines a pool of instances, associated HttpHealthCheck resources, and the fallback target pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetPool(TargetPoolsRegionName region, TargetPool targetPoolResource) {

    InsertTargetPoolHttpRequest request =
        InsertTargetPoolHttpRequest.newBuilder()
        .setRegionWithTargetPoolsRegionName(region)
        .setTargetPoolResource(targetPoolResource)
        .build();
    return insertTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target pool in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.insertTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetPool(InsertTargetPoolHttpRequest request) {
    return insertTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target pool in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.insertTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetPoolHttpRequest, Operation> insertTargetPoolCallable() {
    return stub.insertTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target pools available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   for (TargetPool element : targetPoolAdminClient.listTargetPools().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetPoolsPagedResponse listTargetPools(TargetPoolsRegionName region) {
    ListTargetPoolsHttpRequest request =
        ListTargetPoolsHttpRequest.newBuilder()
        .setRegionWithTargetPoolsRegionName(region)
        .build();
    return listTargetPools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target pools available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   for (TargetPool element : targetPoolAdminClient.listTargetPools().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetPoolsPagedResponse listTargetPools(ListTargetPoolsHttpRequest request) {
    return listTargetPoolsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target pools available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;ListTargetPoolsPagedResponse&gt; future = targetPoolAdminClient.listTargetPoolsPagedCallable().futureCall();
   *   // Do something
   *   for (TargetPool element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetPoolsHttpRequest, ListTargetPoolsPagedResponse> listTargetPoolsPagedCallable() {
    return stub.listTargetPoolsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target pools available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   while (true) {
   *     TargetPoolList response = targetPoolAdminClient.listTargetPoolsCallable().call();
   *     for (TargetPool element : response.getItems()) {
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
  public final UnaryCallable<ListTargetPoolsHttpRequest, TargetPoolList> listTargetPoolsCallable() {
    return stub.listTargetPoolsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes health check URL from a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.removeHealthCheckTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the target pool to remove health checks from.
   * @param targetPoolsRemoveHealthCheckRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation removeHealthCheckTargetPool(TargetPoolName targetPool, TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource) {

    RemoveHealthCheckTargetPoolHttpRequest request =
        RemoveHealthCheckTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .setTargetPoolsRemoveHealthCheckRequestResource(targetPoolsRemoveHealthCheckRequestResource)
        .build();
    return removeHealthCheckTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes health check URL from a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.removeHealthCheckTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation removeHealthCheckTargetPool(RemoveHealthCheckTargetPoolHttpRequest request) {
    return removeHealthCheckTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes health check URL from a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.removeHealthCheckTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolCallable() {
    return stub.removeHealthCheckTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes instance URL from a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.removeInstanceTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the TargetPool resource to remove instances from.
   * @param targetPoolsRemoveInstanceRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation removeInstanceTargetPool(TargetPoolName targetPool, TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequestResource) {

    RemoveInstanceTargetPoolHttpRequest request =
        RemoveInstanceTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .setTargetPoolsRemoveInstanceRequestResource(targetPoolsRemoveInstanceRequestResource)
        .build();
    return removeInstanceTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes instance URL from a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.removeInstanceTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation removeInstanceTargetPool(RemoveInstanceTargetPoolHttpRequest request) {
    return removeInstanceTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes instance URL from a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.removeInstanceTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolCallable() {
    return stub.removeInstanceTargetPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes a backup target pool's configurations.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.setBackupTargetPool();
   * }
   * </code></pre>
   *
   * @param targetPool Name of the TargetPool resource to set a backup pool for.
   * @param failoverRatio New failoverRatio value for the target pool.
   * @param targetReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setBackupTargetPool(TargetPoolName targetPool, Float failoverRatio, TargetReference targetReferenceResource) {

    SetBackupTargetPoolHttpRequest request =
        SetBackupTargetPoolHttpRequest.newBuilder()
        .setTargetPoolWithTargetPoolName(targetPool)
        .setFailoverRatio(failoverRatio)
        .setTargetReferenceResource(targetReferenceResource)
        .build();
    return setBackupTargetPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes a backup target pool's configurations.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   Operation response = targetPoolAdminClient.setBackupTargetPool();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setBackupTargetPool(SetBackupTargetPoolHttpRequest request) {
    return setBackupTargetPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes a backup target pool's configurations.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetPoolAdminClient.setBackupTargetPoolCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolCallable() {
    return stub.setBackupTargetPoolCallable();
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