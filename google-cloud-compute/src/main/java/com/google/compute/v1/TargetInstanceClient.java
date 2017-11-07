/*
 * Copyright 2017, Google LLC All rights reserved.
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
import com.google.compute.v1.stub.TargetInstanceStub;
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
 * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
 *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
 *   Operation response = targetInstanceClient.deleteTargetInstance(targetInstance);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetInstanceClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetInstanceSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetInstanceSettings targetInstanceSettings =
 *     TargetInstanceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetInstanceClient targetInstanceClient =
 *     TargetInstanceClient.create(targetInstanceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetInstanceSettings targetInstanceSettings =
 *     TargetInstanceSettings.newBuilder()
 *         .setTransportChannelProvider(TargetInstanceSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build())
 *         .build();
 * TargetInstanceClient targetInstanceClient =
 *     TargetInstanceClient.create(targetInstanceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetInstanceClient implements BackgroundResource {
  private final TargetInstanceSettings settings;
  private final TargetInstanceStub stub;



  /**
   * Constructs an instance of TargetInstanceClient with default settings.
   */
  public static final TargetInstanceClient create() throws IOException {
    return create(TargetInstanceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetInstanceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetInstanceClient create(TargetInstanceSettings settings) throws IOException {
    return new TargetInstanceClient(settings);
  }

  /**
   * Constructs an instance of TargetInstanceClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetInstanceSettings}.
   */
  @BetaApi
  public static final TargetInstanceClient create(TargetInstanceStub stub) {
    return new TargetInstanceClient(stub);
  }

  /**
   * Constructs an instance of TargetInstanceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetInstanceClient(TargetInstanceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetInstanceClient(TargetInstanceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetInstanceSettings getSettings() {
    return settings;
  }

  @BetaApi
  public TargetInstanceStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target instances.
   *
   * Sample code:
   * <pre><code>
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetInstance element : targetInstanceClient.aggregatedListTargetInstances(project).iterateAll()) {
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListTargetInstancesHttpRequest request = AggregatedListTargetInstancesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (TargetInstance element : targetInstanceClient.aggregatedListTargetInstances(request).iterateAll()) {
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListTargetInstancesHttpRequest request = AggregatedListTargetInstancesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;AggregatedListTargetInstancesPagedResponse&gt; future = targetInstanceClient.aggregatedListTargetInstancesPagedCallable().futureCall(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListTargetInstancesHttpRequest request = AggregatedListTargetInstancesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     TargetInstanceAggregatedList response = targetInstanceClient.aggregatedListTargetInstancesCallable().call(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
   *   Operation response = targetInstanceClient.deleteTargetInstance(targetInstance);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
   *   DeleteTargetInstanceHttpRequest request = DeleteTargetInstanceHttpRequest.newBuilder()
   *     .setTargetInstanceWithTargetInstanceName(targetInstance)
   *     .build();
   *   Operation response = targetInstanceClient.deleteTargetInstance(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
   *   DeleteTargetInstanceHttpRequest request = DeleteTargetInstanceHttpRequest.newBuilder()
   *     .setTargetInstanceWithTargetInstanceName(targetInstance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetInstanceClient.deleteTargetInstanceCallable().futureCall(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
   *   TargetInstance response = targetInstanceClient.getTargetInstance(targetInstance);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
   *   GetTargetInstanceHttpRequest request = GetTargetInstanceHttpRequest.newBuilder()
   *     .setTargetInstanceWithTargetInstanceName(targetInstance)
   *     .build();
   *   TargetInstance response = targetInstanceClient.getTargetInstance(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   TargetInstanceName targetInstance = TargetInstanceName.of("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
   *   GetTargetInstanceHttpRequest request = GetTargetInstanceHttpRequest.newBuilder()
   *     .setTargetInstanceWithTargetInstanceName(targetInstance)
   *     .build();
   *   ApiFuture&lt;TargetInstance&gt; future = targetInstanceClient.getTargetInstanceCallable().futureCall(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   TargetInstance targetInstance = TargetInstance.newBuilder().build();
   *   Operation response = targetInstanceClient.insertTargetInstance(zone, targetInstance);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   TargetInstance targetInstance = TargetInstance.newBuilder().build();
   *   InsertTargetInstanceHttpRequest request = InsertTargetInstanceHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .setTargetInstanceResource(targetInstance)
   *     .build();
   *   Operation response = targetInstanceClient.insertTargetInstance(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   TargetInstance targetInstance = TargetInstance.newBuilder().build();
   *   InsertTargetInstanceHttpRequest request = InsertTargetInstanceHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .setTargetInstanceResource(targetInstance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetInstanceClient.insertTargetInstanceCallable().futureCall(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   for (TargetInstance element : targetInstanceClient.listTargetInstances(zone).iterateAll()) {
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListTargetInstancesHttpRequest request = ListTargetInstancesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   for (TargetInstance element : targetInstanceClient.listTargetInstances(request).iterateAll()) {
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListTargetInstancesHttpRequest request = ListTargetInstancesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   ApiFuture&lt;ListTargetInstancesPagedResponse&gt; future = targetInstanceClient.listTargetInstancesPagedCallable().futureCall(request);
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
   * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListTargetInstancesHttpRequest request = ListTargetInstancesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   while (true) {
   *     TargetInstanceList response = targetInstanceClient.listTargetInstancesCallable().call(request);
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