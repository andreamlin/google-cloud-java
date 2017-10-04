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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAutoscalersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAutoscalersPagedResponse;
import com.google.compute.v1.stub.AutoscalerAdminStub;
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
 * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
 *
 *   Operation response = autoscalerAdminClient.deleteAutoscaler();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the autoscalerAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of AutoscalerAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * AutoscalerAdminSettings autoscalerAdminSettings =
 *     AutoscalerAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AutoscalerAdminClient autoscalerAdminClient =
 *     AutoscalerAdminClient.create(autoscalerAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AutoscalerAdminSettings autoscalerAdminSettings =
 *     AutoscalerAdminSettings.defaultBuilder()
 *         .setTransportProvider(AutoscalerAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(AutoscalerAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * AutoscalerAdminClient autoscalerAdminClient =
 *     AutoscalerAdminClient.create(autoscalerAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class AutoscalerAdminClient implements BackgroundResource {
  private final AutoscalerAdminSettings settings;
  private final AutoscalerAdminStub stub;



  /**
   * Constructs an instance of AutoscalerAdminClient with default settings.
   */
  public static final AutoscalerAdminClient create() throws IOException {
    return create(AutoscalerAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of AutoscalerAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final AutoscalerAdminClient create(AutoscalerAdminSettings settings) throws IOException {
    return new AutoscalerAdminClient(settings);
  }

  /**
   * Constructs an instance of AutoscalerAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use AutoscalerAdminSettings}.
   */
  public static final AutoscalerAdminClient create(AutoscalerAdminStub stub) {
    return new AutoscalerAdminClient(stub);
  }

  /**
   * Constructs an instance of AutoscalerAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected AutoscalerAdminClient(AutoscalerAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected AutoscalerAdminClient(AutoscalerAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AutoscalerAdminSettings getSettings() {
    return settings;
  }

  public AutoscalerAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of autoscalers.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   for (Autoscaler element : autoscalerAdminClient.aggregatedListAutoscalers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAutoscalersPagedResponse aggregatedListAutoscalers(AutoscalersProjectName project) {
    AggregatedListAutoscalersHttpRequest request =
        AggregatedListAutoscalersHttpRequest.newBuilder()
        .setProjectWithAutoscalersProjectName(project)
        .build();
    return aggregatedListAutoscalers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of autoscalers.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   for (Autoscaler element : autoscalerAdminClient.aggregatedListAutoscalers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAutoscalersPagedResponse aggregatedListAutoscalers(AggregatedListAutoscalersHttpRequest request) {
    return aggregatedListAutoscalersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of autoscalers.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListAutoscalersPagedResponse&gt; future = autoscalerAdminClient.aggregatedListAutoscalersPagedCallable().futureCall();
   *   // Do something
   *   for (Autoscaler element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListAutoscalersHttpRequest, AggregatedListAutoscalersPagedResponse> aggregatedListAutoscalersPagedCallable() {
    return stub.aggregatedListAutoscalersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of autoscalers.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   while (true) {
   *     AutoscalerAggregatedList response = autoscalerAdminClient.aggregatedListAutoscalersCallable().call();
   *     for (Autoscaler element : response.getAutoscalers()) {
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
  public final UnaryCallable<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList> aggregatedListAutoscalersCallable() {
    return stub.aggregatedListAutoscalersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.deleteAutoscaler();
   * }
   * </code></pre>
   *
   * @param autoscaler Name of the autoscaler to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAutoscaler(AutoscalerName autoscaler) {

    DeleteAutoscalerHttpRequest request =
        DeleteAutoscalerHttpRequest.newBuilder()
        .setAutoscalerWithAutoscalerName(autoscaler)
        .build();
    return deleteAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.deleteAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAutoscaler(DeleteAutoscalerHttpRequest request) {
    return deleteAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = autoscalerAdminClient.deleteAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteAutoscalerHttpRequest, Operation> deleteAutoscalerCallable() {
    return stub.deleteAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Autoscaler response = autoscalerAdminClient.getAutoscaler();
   * }
   * </code></pre>
   *
   * @param autoscaler Name of the autoscaler to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Autoscaler getAutoscaler(AutoscalerName autoscaler) {

    GetAutoscalerHttpRequest request =
        GetAutoscalerHttpRequest.newBuilder()
        .setAutoscalerWithAutoscalerName(autoscaler)
        .build();
    return getAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Autoscaler response = autoscalerAdminClient.getAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Autoscaler getAutoscaler(GetAutoscalerHttpRequest request) {
    return getAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Autoscaler&gt; future = autoscalerAdminClient.getAutoscalerCallable().futureCall();
   *   // Do something
   *   Autoscaler response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetAutoscalerHttpRequest, Autoscaler> getAutoscalerCallable() {
    return stub.getAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.insertAutoscaler();
   * }
   * </code></pre>
   *
   * @param zone Name of the zone for this request.
   * @param autoscalerResource Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAutoscaler(AutoscalersZoneName zone, Autoscaler autoscalerResource) {

    InsertAutoscalerHttpRequest request =
        InsertAutoscalerHttpRequest.newBuilder()
        .setZoneWithAutoscalersZoneName(zone)
        .setAutoscalerResource(autoscalerResource)
        .build();
    return insertAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.insertAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAutoscaler(InsertAutoscalerHttpRequest request) {
    return insertAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = autoscalerAdminClient.insertAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertAutoscalerHttpRequest, Operation> insertAutoscalerCallable() {
    return stub.insertAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   for (Autoscaler element : autoscalerAdminClient.listAutoscalers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone Name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAutoscalersPagedResponse listAutoscalers(AutoscalersZoneName zone) {
    ListAutoscalersHttpRequest request =
        ListAutoscalersHttpRequest.newBuilder()
        .setZoneWithAutoscalersZoneName(zone)
        .build();
    return listAutoscalers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   for (Autoscaler element : autoscalerAdminClient.listAutoscalers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAutoscalersPagedResponse listAutoscalers(ListAutoscalersHttpRequest request) {
    return listAutoscalersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;ListAutoscalersPagedResponse&gt; future = autoscalerAdminClient.listAutoscalersPagedCallable().futureCall();
   *   // Do something
   *   for (Autoscaler element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListAutoscalersHttpRequest, ListAutoscalersPagedResponse> listAutoscalersPagedCallable() {
    return stub.listAutoscalersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   while (true) {
   *     AutoscalerList response = autoscalerAdminClient.listAutoscalersCallable().call();
   *     for (Autoscaler element : response.getItems()) {
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
  public final UnaryCallable<ListAutoscalersHttpRequest, AutoscalerList> listAutoscalersCallable() {
    return stub.listAutoscalersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.patchAutoscaler();
   * }
   * </code></pre>
   *
   * @param autoscaler Name of the autoscaler to update.
   * @param zone Name of the zone for this request.
   * @param autoscalerResource Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchAutoscaler(String autoscaler, AutoscalersZoneName zone, Autoscaler autoscalerResource) {

    PatchAutoscalerHttpRequest request =
        PatchAutoscalerHttpRequest.newBuilder()
        .setAutoscaler(autoscaler)
        .setZoneWithAutoscalersZoneName(zone)
        .setAutoscalerResource(autoscalerResource)
        .build();
    return patchAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.patchAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchAutoscaler(PatchAutoscalerHttpRequest request) {
    return patchAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = autoscalerAdminClient.patchAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchAutoscalerHttpRequest, Operation> patchAutoscalerCallable() {
    return stub.patchAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.updateAutoscaler();
   * }
   * </code></pre>
   *
   * @param autoscaler Name of the autoscaler to update.
   * @param zone Name of the zone for this request.
   * @param autoscalerResource Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateAutoscaler(String autoscaler, AutoscalersZoneName zone, Autoscaler autoscalerResource) {

    UpdateAutoscalerHttpRequest request =
        UpdateAutoscalerHttpRequest.newBuilder()
        .setAutoscaler(autoscaler)
        .setZoneWithAutoscalersZoneName(zone)
        .setAutoscalerResource(autoscalerResource)
        .build();
    return updateAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   Operation response = autoscalerAdminClient.updateAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateAutoscaler(UpdateAutoscalerHttpRequest request) {
    return updateAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = autoscalerAdminClient.updateAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateAutoscalerHttpRequest, Operation> updateAutoscalerCallable() {
    return stub.updateAutoscalerCallable();
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