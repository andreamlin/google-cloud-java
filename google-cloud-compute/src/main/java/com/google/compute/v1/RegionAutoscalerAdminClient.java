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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionAutoscalersPagedResponse;
import com.google.compute.v1.stub.RegionAutoscalerAdminStub;
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
 * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
 *
 *   Operation response = regionAutoscalerAdminClient.deleteRegionAutoscaler();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionAutoscalerAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RegionAutoscalerAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RegionAutoscalerAdminSettings regionAutoscalerAdminSettings =
 *     RegionAutoscalerAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionAutoscalerAdminClient regionAutoscalerAdminClient =
 *     RegionAutoscalerAdminClient.create(regionAutoscalerAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionAutoscalerAdminSettings regionAutoscalerAdminSettings =
 *     RegionAutoscalerAdminSettings.defaultBuilder()
 *         .setTransportProvider(RegionAutoscalerAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(RegionAutoscalerAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * RegionAutoscalerAdminClient regionAutoscalerAdminClient =
 *     RegionAutoscalerAdminClient.create(regionAutoscalerAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionAutoscalerAdminClient implements BackgroundResource {
  private final RegionAutoscalerAdminSettings settings;
  private final RegionAutoscalerAdminStub stub;



  /**
   * Constructs an instance of RegionAutoscalerAdminClient with default settings.
   */
  public static final RegionAutoscalerAdminClient create() throws IOException {
    return create(RegionAutoscalerAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of RegionAutoscalerAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RegionAutoscalerAdminClient create(RegionAutoscalerAdminSettings settings) throws IOException {
    return new RegionAutoscalerAdminClient(settings);
  }

  /**
   * Constructs an instance of RegionAutoscalerAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionAutoscalerAdminSettings}.
   */
  public static final RegionAutoscalerAdminClient create(RegionAutoscalerAdminStub stub) {
    return new RegionAutoscalerAdminClient(stub);
  }

  /**
   * Constructs an instance of RegionAutoscalerAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RegionAutoscalerAdminClient(RegionAutoscalerAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RegionAutoscalerAdminClient(RegionAutoscalerAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionAutoscalerAdminSettings getSettings() {
    return settings;
  }

  public RegionAutoscalerAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.deleteRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param autoscaler Name of the autoscaler to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRegionAutoscaler(RegionAutoscalersAutoscalerName autoscaler) {

    DeleteRegionAutoscalerHttpRequest request =
        DeleteRegionAutoscalerHttpRequest.newBuilder()
        .setAutoscalerWithRegionAutoscalersAutoscalerName(autoscaler)
        .build();
    return deleteRegionAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.deleteRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRegionAutoscaler(DeleteRegionAutoscalerHttpRequest request) {
    return deleteRegionAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionAutoscalerAdminClient.deleteRegionAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteRegionAutoscalerHttpRequest, Operation> deleteRegionAutoscalerCallable() {
    return stub.deleteRegionAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Autoscaler response = regionAutoscalerAdminClient.getRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param autoscaler Name of the autoscaler to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Autoscaler getRegionAutoscaler(RegionAutoscalersAutoscalerName autoscaler) {

    GetRegionAutoscalerHttpRequest request =
        GetRegionAutoscalerHttpRequest.newBuilder()
        .setAutoscalerWithRegionAutoscalersAutoscalerName(autoscaler)
        .build();
    return getRegionAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Autoscaler response = regionAutoscalerAdminClient.getRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Autoscaler getRegionAutoscaler(GetRegionAutoscalerHttpRequest request) {
    return getRegionAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified autoscaler.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Autoscaler&gt; future = regionAutoscalerAdminClient.getRegionAutoscalerCallable().futureCall();
   *   // Do something
   *   Autoscaler response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRegionAutoscalerHttpRequest, Autoscaler> getRegionAutoscalerCallable() {
    return stub.getRegionAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.insertRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param autoscalerResource Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRegionAutoscaler(RegionAutoscalersRegionName region, Autoscaler autoscalerResource) {

    InsertRegionAutoscalerHttpRequest request =
        InsertRegionAutoscalerHttpRequest.newBuilder()
        .setRegionWithRegionAutoscalersRegionName(region)
        .setAutoscalerResource(autoscalerResource)
        .build();
    return insertRegionAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.insertRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRegionAutoscaler(InsertRegionAutoscalerHttpRequest request) {
    return insertRegionAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionAutoscalerAdminClient.insertRegionAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertRegionAutoscalerHttpRequest, Operation> insertRegionAutoscalerCallable() {
    return stub.insertRegionAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   for (Autoscaler element : regionAutoscalerAdminClient.listRegionAutoscalers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionAutoscalersPagedResponse listRegionAutoscalers(RegionAutoscalersRegionName region) {
    ListRegionAutoscalersHttpRequest request =
        ListRegionAutoscalersHttpRequest.newBuilder()
        .setRegionWithRegionAutoscalersRegionName(region)
        .build();
    return listRegionAutoscalers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   for (Autoscaler element : regionAutoscalerAdminClient.listRegionAutoscalers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionAutoscalersPagedResponse listRegionAutoscalers(ListRegionAutoscalersHttpRequest request) {
    return listRegionAutoscalersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;ListRegionAutoscalersPagedResponse&gt; future = regionAutoscalerAdminClient.listRegionAutoscalersPagedCallable().futureCall();
   *   // Do something
   *   for (Autoscaler element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRegionAutoscalersHttpRequest, ListRegionAutoscalersPagedResponse> listRegionAutoscalersPagedCallable() {
    return stub.listRegionAutoscalersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of autoscalers contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   while (true) {
   *     RegionAutoscalerList response = regionAutoscalerAdminClient.listRegionAutoscalersCallable().call();
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
  public final UnaryCallable<ListRegionAutoscalersHttpRequest, RegionAutoscalerList> listRegionAutoscalersCallable() {
    return stub.listRegionAutoscalersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.patchRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param autoscaler Name of the autoscaler to update.
   * @param autoscalerResource Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchRegionAutoscaler(RegionAutoscalersRegionName region, String autoscaler, Autoscaler autoscalerResource) {

    PatchRegionAutoscalerHttpRequest request =
        PatchRegionAutoscalerHttpRequest.newBuilder()
        .setRegionWithRegionAutoscalersRegionName(region)
        .setAutoscaler(autoscaler)
        .setAutoscalerResource(autoscalerResource)
        .build();
    return patchRegionAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.patchRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchRegionAutoscaler(PatchRegionAutoscalerHttpRequest request) {
    return patchRegionAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionAutoscalerAdminClient.patchRegionAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchRegionAutoscalerHttpRequest, Operation> patchRegionAutoscalerCallable() {
    return stub.patchRegionAutoscalerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.updateRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param autoscaler Name of the autoscaler to update.
   * @param autoscalerResource Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateRegionAutoscaler(RegionAutoscalersRegionName region, String autoscaler, Autoscaler autoscalerResource) {

    UpdateRegionAutoscalerHttpRequest request =
        UpdateRegionAutoscalerHttpRequest.newBuilder()
        .setRegionWithRegionAutoscalersRegionName(region)
        .setAutoscaler(autoscaler)
        .setAutoscalerResource(autoscalerResource)
        .build();
    return updateRegionAutoscaler(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   Operation response = regionAutoscalerAdminClient.updateRegionAutoscaler();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateRegionAutoscaler(UpdateRegionAutoscalerHttpRequest request) {
    return updateRegionAutoscalerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an autoscaler in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionAutoscalerAdminClient.updateRegionAutoscalerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateRegionAutoscalerHttpRequest, Operation> updateRegionAutoscalerCallable() {
    return stub.updateRegionAutoscalerCallable();
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