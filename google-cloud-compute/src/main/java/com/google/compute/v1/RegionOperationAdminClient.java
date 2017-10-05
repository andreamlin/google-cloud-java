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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionOperationsPagedResponse;
import com.google.compute.v1.stub.RegionOperationAdminStub;
import com.google.protobuf.Empty;
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
 * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
 *
 *   regionOperationAdminClient.deleteRegionOperation();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionOperationAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RegionOperationAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RegionOperationAdminSettings regionOperationAdminSettings =
 *     RegionOperationAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionOperationAdminClient regionOperationAdminClient =
 *     RegionOperationAdminClient.create(regionOperationAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionOperationAdminSettings regionOperationAdminSettings =
 *     RegionOperationAdminSettings.defaultBuilder()
 *         .setTransportProvider(RegionOperationAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(RegionOperationAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * RegionOperationAdminClient regionOperationAdminClient =
 *     RegionOperationAdminClient.create(regionOperationAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionOperationAdminClient implements BackgroundResource {
  private final RegionOperationAdminSettings settings;
  private final RegionOperationAdminStub stub;



  /**
   * Constructs an instance of RegionOperationAdminClient with default settings.
   */
  public static final RegionOperationAdminClient create() throws IOException {
    return create(RegionOperationAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of RegionOperationAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RegionOperationAdminClient create(RegionOperationAdminSettings settings) throws IOException {
    return new RegionOperationAdminClient(settings);
  }

  /**
   * Constructs an instance of RegionOperationAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionOperationAdminSettings}.
   */
  public static final RegionOperationAdminClient create(RegionOperationAdminStub stub) {
    return new RegionOperationAdminClient(stub);
  }

  /**
   * Constructs an instance of RegionOperationAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RegionOperationAdminClient(RegionOperationAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RegionOperationAdminClient(RegionOperationAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionOperationAdminSettings getSettings() {
    return settings;
  }

  public RegionOperationAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified region-specific Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   regionOperationAdminClient.deleteRegionOperation();
   * }
   * </code></pre>
   *
   * @param operation Name of the Operations resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteRegionOperation(RegionOperationsOperationName operation) {

    DeleteRegionOperationHttpRequest request =
        DeleteRegionOperationHttpRequest.newBuilder()
        .setOperationWithRegionOperationsOperationName(operation)
        .build();
    deleteRegionOperation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified region-specific Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   regionOperationAdminClient.deleteRegionOperation();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteRegionOperation(DeleteRegionOperationHttpRequest request) {
    deleteRegionOperationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified region-specific Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   ApiFuture&lt;Void&gt; future = regionOperationAdminClient.deleteRegionOperationCallable().futureCall();
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteRegionOperationHttpRequest, Empty> deleteRegionOperationCallable() {
    return stub.deleteRegionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified region-specific Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   Operation response = regionOperationAdminClient.getRegionOperation();
   * }
   * </code></pre>
   *
   * @param operation Name of the Operations resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getRegionOperation(RegionOperationsOperationName operation) {

    GetRegionOperationHttpRequest request =
        GetRegionOperationHttpRequest.newBuilder()
        .setOperationWithRegionOperationsOperationName(operation)
        .build();
    return getRegionOperation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified region-specific Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   Operation response = regionOperationAdminClient.getRegionOperation();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getRegionOperation(GetRegionOperationHttpRequest request) {
    return getRegionOperationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified region-specific Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionOperationAdminClient.getRegionOperationCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRegionOperationHttpRequest, Operation> getRegionOperationCallable() {
    return stub.getRegionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   for (Operation element : regionOperationAdminClient.listRegionOperations().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionOperationsPagedResponse listRegionOperations(RegionName region) {
    ListRegionOperationsHttpRequest request =
        ListRegionOperationsHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listRegionOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   for (Operation element : regionOperationAdminClient.listRegionOperations().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionOperationsPagedResponse listRegionOperations(ListRegionOperationsHttpRequest request) {
    return listRegionOperationsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   ApiFuture&lt;ListRegionOperationsPagedResponse&gt; future = regionOperationAdminClient.listRegionOperationsPagedCallable().futureCall();
   *   // Do something
   *   for (Operation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRegionOperationsHttpRequest, ListRegionOperationsPagedResponse> listRegionOperationsPagedCallable() {
    return stub.listRegionOperationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
   *
   *   while (true) {
   *     OperationList response = regionOperationAdminClient.listRegionOperationsCallable().call();
   *     for (Operation element : response.getItems()) {
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
  public final UnaryCallable<ListRegionOperationsHttpRequest, OperationList> listRegionOperationsCallable() {
    return stub.listRegionOperationsCallable();
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