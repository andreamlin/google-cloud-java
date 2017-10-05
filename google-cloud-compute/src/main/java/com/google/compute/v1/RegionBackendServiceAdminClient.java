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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionBackendServicesPagedResponse;
import com.google.compute.v1.stub.RegionBackendServiceAdminStub;
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
 * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
 *
 *   Operation response = regionBackendServiceAdminClient.deleteRegionBackendService();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionBackendServiceAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RegionBackendServiceAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RegionBackendServiceAdminSettings regionBackendServiceAdminSettings =
 *     RegionBackendServiceAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionBackendServiceAdminClient regionBackendServiceAdminClient =
 *     RegionBackendServiceAdminClient.create(regionBackendServiceAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionBackendServiceAdminSettings regionBackendServiceAdminSettings =
 *     RegionBackendServiceAdminSettings.defaultBuilder()
 *         .setTransportProvider(RegionBackendServiceAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(RegionBackendServiceAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * RegionBackendServiceAdminClient regionBackendServiceAdminClient =
 *     RegionBackendServiceAdminClient.create(regionBackendServiceAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionBackendServiceAdminClient implements BackgroundResource {
  private final RegionBackendServiceAdminSettings settings;
  private final RegionBackendServiceAdminStub stub;



  /**
   * Constructs an instance of RegionBackendServiceAdminClient with default settings.
   */
  public static final RegionBackendServiceAdminClient create() throws IOException {
    return create(RegionBackendServiceAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of RegionBackendServiceAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RegionBackendServiceAdminClient create(RegionBackendServiceAdminSettings settings) throws IOException {
    return new RegionBackendServiceAdminClient(settings);
  }

  /**
   * Constructs an instance of RegionBackendServiceAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionBackendServiceAdminSettings}.
   */
  public static final RegionBackendServiceAdminClient create(RegionBackendServiceAdminStub stub) {
    return new RegionBackendServiceAdminClient(stub);
  }

  /**
   * Constructs an instance of RegionBackendServiceAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RegionBackendServiceAdminClient(RegionBackendServiceAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RegionBackendServiceAdminClient(RegionBackendServiceAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionBackendServiceAdminSettings getSettings() {
    return settings;
  }

  public RegionBackendServiceAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.deleteRegionBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRegionBackendService(RegionBackendServicesBackendServiceName backendService) {

    DeleteRegionBackendServiceHttpRequest request =
        DeleteRegionBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithRegionBackendServicesBackendServiceName(backendService)
        .build();
    return deleteRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.deleteRegionBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRegionBackendService(DeleteRegionBackendServiceHttpRequest request) {
    return deleteRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceAdminClient.deleteRegionBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceCallable() {
    return stub.deleteRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   BackendService response = regionBackendServiceAdminClient.getRegionBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getRegionBackendService(RegionBackendServicesBackendServiceName backendService) {

    GetRegionBackendServiceHttpRequest request =
        GetRegionBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithRegionBackendServicesBackendServiceName(backendService)
        .build();
    return getRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   BackendService response = regionBackendServiceAdminClient.getRegionBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getRegionBackendService(GetRegionBackendServiceHttpRequest request) {
    return getRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;BackendService&gt; future = regionBackendServiceAdminClient.getRegionBackendServiceCallable().futureCall();
   *   // Do something
   *   BackendService response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceCallable() {
    return stub.getRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   BackendServiceGroupHealth response = regionBackendServiceAdminClient.getHealthRegionBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to which the queried instance belongs.
   * @param resourceGroupReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthRegionBackendService(RegionBackendServicesBackendServiceName backendService, ResourceGroupReference resourceGroupReferenceResource) {

    GetHealthRegionBackendServiceHttpRequest request =
        GetHealthRegionBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithRegionBackendServicesBackendServiceName(backendService)
        .setResourceGroupReferenceResource(resourceGroupReferenceResource)
        .build();
    return getHealthRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   BackendServiceGroupHealth response = regionBackendServiceAdminClient.getHealthRegionBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthRegionBackendService(GetHealthRegionBackendServiceHttpRequest request) {
    return getHealthRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;BackendServiceGroupHealth&gt; future = regionBackendServiceAdminClient.getHealthRegionBackendServiceCallable().futureCall();
   *   // Do something
   *   BackendServiceGroupHealth response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceCallable() {
    return stub.getHealthRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.insertRegionBackendService();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRegionBackendService(RegionName region, BackendService backendServiceResource) {

    InsertRegionBackendServiceHttpRequest request =
        InsertRegionBackendServiceHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .setBackendServiceResource(backendServiceResource)
        .build();
    return insertRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.insertRegionBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRegionBackendService(InsertRegionBackendServiceHttpRequest request) {
    return insertRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceAdminClient.insertRegionBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceCallable() {
    return stub.insertRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in the given region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   for (BackendService element : regionBackendServiceAdminClient.listRegionBackendServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionBackendServicesPagedResponse listRegionBackendServices(RegionName region) {
    ListRegionBackendServicesHttpRequest request =
        ListRegionBackendServicesHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listRegionBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in the given region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   for (BackendService element : regionBackendServiceAdminClient.listRegionBackendServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionBackendServicesPagedResponse listRegionBackendServices(ListRegionBackendServicesHttpRequest request) {
    return listRegionBackendServicesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in the given region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;ListRegionBackendServicesPagedResponse&gt; future = regionBackendServiceAdminClient.listRegionBackendServicesPagedCallable().futureCall();
   *   // Do something
   *   for (BackendService element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRegionBackendServicesHttpRequest, ListRegionBackendServicesPagedResponse> listRegionBackendServicesPagedCallable() {
    return stub.listRegionBackendServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in the given region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   while (true) {
   *     BackendServiceList response = regionBackendServiceAdminClient.listRegionBackendServicesCallable().call();
   *     for (BackendService element : response.getItems()) {
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
  public final UnaryCallable<ListRegionBackendServicesHttpRequest, BackendServiceList> listRegionBackendServicesCallable() {
    return stub.listRegionBackendServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.patchRegionBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchRegionBackendService(RegionBackendServicesBackendServiceName backendService, BackendService backendServiceResource) {

    PatchRegionBackendServiceHttpRequest request =
        PatchRegionBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithRegionBackendServicesBackendServiceName(backendService)
        .setBackendServiceResource(backendServiceResource)
        .build();
    return patchRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.patchRegionBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchRegionBackendService(PatchRegionBackendServiceHttpRequest request) {
    return patchRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceAdminClient.patchRegionBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceCallable() {
    return stub.patchRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.updateRegionBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateRegionBackendService(RegionBackendServicesBackendServiceName backendService, BackendService backendServiceResource) {

    UpdateRegionBackendServiceHttpRequest request =
        UpdateRegionBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithRegionBackendServicesBackendServiceName(backendService)
        .setBackendServiceResource(backendServiceResource)
        .build();
    return updateRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   Operation response = regionBackendServiceAdminClient.updateRegionBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateRegionBackendService(UpdateRegionBackendServiceHttpRequest request) {
    return updateRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceAdminClient.updateRegionBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceCallable() {
    return stub.updateRegionBackendServiceCallable();
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