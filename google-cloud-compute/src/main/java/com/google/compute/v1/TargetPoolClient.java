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
import com.google.compute.v1.stub.TargetPoolStub;
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
 * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
 *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
 *   TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();
 *   Operation response = targetPoolClient.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequest);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetPoolClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetPoolSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetPoolSettings targetPoolSettings =
 *     TargetPoolSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetPoolClient targetPoolClient =
 *     TargetPoolClient.create(targetPoolSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetPoolSettings targetPoolSettings =
 *     TargetPoolSettings.newBuilder()
 *         .setTransportProvider(TargetPoolSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(TargetPoolSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetPoolClient targetPoolClient =
 *     TargetPoolClient.create(targetPoolSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetPoolClient implements BackgroundResource {
  private final TargetPoolSettings settings;
  private final TargetPoolStub stub;



  /**
   * Constructs an instance of TargetPoolClient with default settings.
   */
  public static final TargetPoolClient create() throws IOException {
    return create(TargetPoolSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetPoolClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetPoolClient create(TargetPoolSettings settings) throws IOException {
    return new TargetPoolClient(settings);
  }

  /**
   * Constructs an instance of TargetPoolClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetPoolSettings}.
   */
  public static final TargetPoolClient create(TargetPoolStub stub) {
    return new TargetPoolClient(stub);
  }

  /**
   * Constructs an instance of TargetPoolClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetPoolClient(TargetPoolSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetPoolClient(TargetPoolStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetPoolSettings getSettings() {
    return settings;
  }

  @BetaApi
  public TargetPoolStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds health check URLs to a target pool.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();
   *   Operation response = targetPoolClient.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequest);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();
   *   AddHealthCheckTargetPoolHttpRequest request = AddHealthCheckTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsAddHealthCheckRequest(targetPoolsAddHealthCheckRequest)
   *     .build();
   *   Operation response = targetPoolClient.addHealthCheckTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();
   *   AddHealthCheckTargetPoolHttpRequest request = AddHealthCheckTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsAddHealthCheckRequest(targetPoolsAddHealthCheckRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.addHealthCheckTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequest = TargetPoolsAddInstanceRequest.newBuilder().build();
   *   Operation response = targetPoolClient.addInstanceTargetPool(targetPool, targetPoolsAddInstanceRequest);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequest = TargetPoolsAddInstanceRequest.newBuilder().build();
   *   AddInstanceTargetPoolHttpRequest request = AddInstanceTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsAddInstanceRequest(targetPoolsAddInstanceRequest)
   *     .build();
   *   Operation response = targetPoolClient.addInstanceTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequest = TargetPoolsAddInstanceRequest.newBuilder().build();
   *   AddInstanceTargetPoolHttpRequest request = AddInstanceTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsAddInstanceRequest(targetPoolsAddInstanceRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.addInstanceTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (TargetPool element : targetPoolClient.aggregatedListTargetPools(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetPoolsPagedResponse aggregatedListTargetPools(ProjectName project) {
    AggregatedListTargetPoolsHttpRequest request =
        AggregatedListTargetPoolsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListTargetPools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target pools.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedProject = TargetPoolClient.formatProjectName("[PROJECT]");
   *   AggregatedListTargetPoolsHttpRequest request = AggregatedListTargetPoolsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (TargetPool element : targetPoolClient.aggregatedListTargetPools(request).iterateAll()) {
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedProject = TargetPoolClient.formatProjectName("[PROJECT]");
   *   AggregatedListTargetPoolsHttpRequest request = AggregatedListTargetPoolsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;AggregatedListTargetPoolsPagedResponse&gt; future = targetPoolClient.aggregatedListTargetPoolsPagedCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedProject = TargetPoolClient.formatProjectName("[PROJECT]");
   *   AggregatedListTargetPoolsHttpRequest request = AggregatedListTargetPoolsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     TargetPoolAggregatedList response = targetPoolClient.aggregatedListTargetPoolsCallable().call(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   Operation response = targetPoolClient.deleteTargetPool(targetPool);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   DeleteTargetPoolHttpRequest request = DeleteTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .build();
   *   Operation response = targetPoolClient.deleteTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   DeleteTargetPoolHttpRequest request = DeleteTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.deleteTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPool response = targetPoolClient.getTargetPool(targetPool);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   GetTargetPoolHttpRequest request = GetTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .build();
   *   TargetPool response = targetPoolClient.getTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   GetTargetPoolHttpRequest request = GetTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .build();
   *   ApiFuture&lt;TargetPool&gt; future = targetPoolClient.getTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   InstanceReference instanceReference = InstanceReference.newBuilder().build();
   *   TargetPoolInstanceHealth response = targetPoolClient.getHealthTargetPool(targetPool, instanceReference);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   InstanceReference instanceReference = InstanceReference.newBuilder().build();
   *   GetHealthTargetPoolHttpRequest request = GetHealthTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setInstanceReference(instanceReference)
   *     .build();
   *   TargetPoolInstanceHealth response = targetPoolClient.getHealthTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   InstanceReference instanceReference = InstanceReference.newBuilder().build();
   *   GetHealthTargetPoolHttpRequest request = GetHealthTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setInstanceReference(instanceReference)
   *     .build();
   *   ApiFuture&lt;TargetPoolInstanceHealth&gt; future = targetPoolClient.getHealthTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   TargetPool targetPool = TargetPool.newBuilder().build();
   *   Operation response = targetPoolClient.insertTargetPool(region, targetPool);
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param targetPoolResource A TargetPool resource. This resource defines a pool of instances, associated HttpHealthCheck resources, and the fallback target pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetPool(RegionName region, TargetPool targetPoolResource) {

    InsertTargetPoolHttpRequest request =
        InsertTargetPoolHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedRegion = TargetPoolClient.formatRegionName("[PROJECT]", "[REGION]");
   *   TargetPool targetPool = TargetPool.newBuilder().build();
   *   InsertTargetPoolHttpRequest request = InsertTargetPoolHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .setTargetPool(targetPool)
   *     .build();
   *   Operation response = targetPoolClient.insertTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedRegion = TargetPoolClient.formatRegionName("[PROJECT]", "[REGION]");
   *   TargetPool targetPool = TargetPool.newBuilder().build();
   *   InsertTargetPoolHttpRequest request = InsertTargetPoolHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .setTargetPool(targetPool)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.insertTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   for (TargetPool element : targetPoolClient.listTargetPools(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetPoolsPagedResponse listTargetPools(RegionName region) {
    ListTargetPoolsHttpRequest request =
        ListTargetPoolsHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listTargetPools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target pools available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedRegion = TargetPoolClient.formatRegionName("[PROJECT]", "[REGION]");
   *   ListTargetPoolsHttpRequest request = ListTargetPoolsHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   for (TargetPool element : targetPoolClient.listTargetPools(request).iterateAll()) {
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedRegion = TargetPoolClient.formatRegionName("[PROJECT]", "[REGION]");
   *   ListTargetPoolsHttpRequest request = ListTargetPoolsHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   ApiFuture&lt;ListTargetPoolsPagedResponse&gt; future = targetPoolClient.listTargetPoolsPagedCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedRegion = TargetPoolClient.formatRegionName("[PROJECT]", "[REGION]");
   *   ListTargetPoolsHttpRequest request = ListTargetPoolsHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   while (true) {
   *     TargetPoolList response = targetPoolClient.listTargetPoolsCallable().call(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequest = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();
   *   Operation response = targetPoolClient.removeHealthCheckTargetPool(targetPool, targetPoolsRemoveHealthCheckRequest);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequest = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();
   *   RemoveHealthCheckTargetPoolHttpRequest request = RemoveHealthCheckTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsRemoveHealthCheckRequest(targetPoolsRemoveHealthCheckRequest)
   *     .build();
   *   Operation response = targetPoolClient.removeHealthCheckTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequest = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();
   *   RemoveHealthCheckTargetPoolHttpRequest request = RemoveHealthCheckTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsRemoveHealthCheckRequest(targetPoolsRemoveHealthCheckRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.removeHealthCheckTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequest = TargetPoolsRemoveInstanceRequest.newBuilder().build();
   *   Operation response = targetPoolClient.removeInstanceTargetPool(targetPool, targetPoolsRemoveInstanceRequest);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequest = TargetPoolsRemoveInstanceRequest.newBuilder().build();
   *   RemoveInstanceTargetPoolHttpRequest request = RemoveInstanceTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsRemoveInstanceRequest(targetPoolsRemoveInstanceRequest)
   *     .build();
   *   Operation response = targetPoolClient.removeInstanceTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequest = TargetPoolsRemoveInstanceRequest.newBuilder().build();
   *   RemoveInstanceTargetPoolHttpRequest request = RemoveInstanceTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setTargetPoolsRemoveInstanceRequest(targetPoolsRemoveInstanceRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.removeInstanceTargetPoolCallable().futureCall(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   Float failoverRatio = 0;
   *   TargetReference targetReference = TargetReference.newBuilder().build();
   *   Operation response = targetPoolClient.setBackupTargetPool(targetPool, failoverRatio, targetReference);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   Float failoverRatio = 0;
   *   TargetReference targetReference = TargetReference.newBuilder().build();
   *   SetBackupTargetPoolHttpRequest request = SetBackupTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setFailoverRatio(failoverRatio)
   *     .setTargetReference(targetReference)
   *     .build();
   *   Operation response = targetPoolClient.setBackupTargetPool(request);
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
   * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
   *   String formattedTargetPool = TargetPoolClient.formatTargetPoolName("[PROJECT]", "[REGION]", "[TARGET_POOL]");
   *   Float failoverRatio = 0;
   *   TargetReference targetReference = TargetReference.newBuilder().build();
   *   SetBackupTargetPoolHttpRequest request = SetBackupTargetPoolHttpRequest.newBuilder()
   *     .setTargetPool(formattedTargetPool)
   *     .setFailoverRatio(failoverRatio)
   *     .setTargetReference(targetReference)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetPoolClient.setBackupTargetPoolCallable().futureCall(request);
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