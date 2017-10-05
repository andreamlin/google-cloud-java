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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListBackendServicesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListBackendServicesPagedResponse;
import com.google.compute.v1.stub.BackendServiceAdminStub;
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
 * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
 *
 *   Operation response = backendServiceAdminClient.deleteBackendService();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the backendServiceAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of BackendServiceAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * BackendServiceAdminSettings backendServiceAdminSettings =
 *     BackendServiceAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BackendServiceAdminClient backendServiceAdminClient =
 *     BackendServiceAdminClient.create(backendServiceAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * BackendServiceAdminSettings backendServiceAdminSettings =
 *     BackendServiceAdminSettings.defaultBuilder()
 *         .setTransportProvider(BackendServiceAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(BackendServiceAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * BackendServiceAdminClient backendServiceAdminClient =
 *     BackendServiceAdminClient.create(backendServiceAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class BackendServiceAdminClient implements BackgroundResource {
  private final BackendServiceAdminSettings settings;
  private final BackendServiceAdminStub stub;



  /**
   * Constructs an instance of BackendServiceAdminClient with default settings.
   */
  public static final BackendServiceAdminClient create() throws IOException {
    return create(BackendServiceAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of BackendServiceAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final BackendServiceAdminClient create(BackendServiceAdminSettings settings) throws IOException {
    return new BackendServiceAdminClient(settings);
  }

  /**
   * Constructs an instance of BackendServiceAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use BackendServiceAdminSettings}.
   */
  public static final BackendServiceAdminClient create(BackendServiceAdminStub stub) {
    return new BackendServiceAdminClient(stub);
  }

  /**
   * Constructs an instance of BackendServiceAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected BackendServiceAdminClient(BackendServiceAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected BackendServiceAdminClient(BackendServiceAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BackendServiceAdminSettings getSettings() {
    return settings;
  }

  public BackendServiceAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   for (BackendService element : backendServiceAdminClient.aggregatedListBackendServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListBackendServicesPagedResponse aggregatedListBackendServices(ProjectName project) {
    AggregatedListBackendServicesHttpRequest request =
        AggregatedListBackendServicesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   for (BackendService element : backendServiceAdminClient.aggregatedListBackendServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListBackendServicesPagedResponse aggregatedListBackendServices(AggregatedListBackendServicesHttpRequest request) {
    return aggregatedListBackendServicesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListBackendServicesPagedResponse&gt; future = backendServiceAdminClient.aggregatedListBackendServicesPagedCallable().futureCall();
   *   // Do something
   *   for (BackendService element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListBackendServicesHttpRequest, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesPagedCallable() {
    return stub.aggregatedListBackendServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   while (true) {
   *     BackendServiceAggregatedList response = backendServiceAdminClient.aggregatedListBackendServicesCallable().call();
   *     for (BackendService element : response.getBackendServices()) {
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
  public final UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesCallable() {
    return stub.aggregatedListBackendServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.deleteBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteBackendService(BackendServiceName backendService) {

    DeleteBackendServiceHttpRequest request =
        DeleteBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithBackendServiceName(backendService)
        .build();
    return deleteBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.deleteBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteBackendService(DeleteBackendServiceHttpRequest request) {
    return deleteBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = backendServiceAdminClient.deleteBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceCallable() {
    return stub.deleteBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendService resource. Get a list of available backend services by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   BackendService response = backendServiceAdminClient.getBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getBackendService(BackendServiceName backendService) {

    GetBackendServiceHttpRequest request =
        GetBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithBackendServiceName(backendService)
        .build();
    return getBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendService resource. Get a list of available backend services by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   BackendService response = backendServiceAdminClient.getBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getBackendService(GetBackendServiceHttpRequest request) {
    return getBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendService resource. Get a list of available backend services by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;BackendService&gt; future = backendServiceAdminClient.getBackendServiceCallable().futureCall();
   *   // Do something
   *   BackendService response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetBackendServiceHttpRequest, BackendService> getBackendServiceCallable() {
    return stub.getBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this BackendService.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   BackendServiceGroupHealth response = backendServiceAdminClient.getHealthBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to which the queried instance belongs.
   * @param resourceGroupReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthBackendService(BackendServiceName backendService, ResourceGroupReference resourceGroupReferenceResource) {

    GetHealthBackendServiceHttpRequest request =
        GetHealthBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithBackendServiceName(backendService)
        .setResourceGroupReferenceResource(resourceGroupReferenceResource)
        .build();
    return getHealthBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this BackendService.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   BackendServiceGroupHealth response = backendServiceAdminClient.getHealthBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthBackendService(GetHealthBackendServiceHttpRequest request) {
    return getHealthBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this BackendService.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;BackendServiceGroupHealth&gt; future = backendServiceAdminClient.getHealthBackendServiceCallable().futureCall();
   *   // Do something
   *   BackendServiceGroupHealth response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceCallable() {
    return stub.getHealthBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.insertBackendService();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertBackendService(ProjectName project, BackendService backendServiceResource) {

    InsertBackendServiceHttpRequest request =
        InsertBackendServiceHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setBackendServiceResource(backendServiceResource)
        .build();
    return insertBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.insertBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertBackendService(InsertBackendServiceHttpRequest request) {
    return insertBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = backendServiceAdminClient.insertBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertBackendServiceHttpRequest, Operation> insertBackendServiceCallable() {
    return stub.insertBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendService resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   for (BackendService element : backendServiceAdminClient.listBackendServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListBackendServicesPagedResponse listBackendServices(ProjectName project) {
    ListBackendServicesHttpRequest request =
        ListBackendServicesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendService resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   for (BackendService element : backendServiceAdminClient.listBackendServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListBackendServicesPagedResponse listBackendServices(ListBackendServicesHttpRequest request) {
    return listBackendServicesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendService resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;ListBackendServicesPagedResponse&gt; future = backendServiceAdminClient.listBackendServicesPagedCallable().futureCall();
   *   // Do something
   *   for (BackendService element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListBackendServicesHttpRequest, ListBackendServicesPagedResponse> listBackendServicesPagedCallable() {
    return stub.listBackendServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendService resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   while (true) {
   *     BackendServiceList response = backendServiceAdminClient.listBackendServicesCallable().call();
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
  public final UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesCallable() {
    return stub.listBackendServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.patchBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchBackendService(BackendServiceName backendService, BackendService backendServiceResource) {

    PatchBackendServiceHttpRequest request =
        PatchBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithBackendServiceName(backendService)
        .setBackendServiceResource(backendServiceResource)
        .build();
    return patchBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.patchBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchBackendService(PatchBackendServiceHttpRequest request) {
    return patchBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = backendServiceAdminClient.patchBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchBackendServiceHttpRequest, Operation> patchBackendServiceCallable() {
    return stub.patchBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.updateBackendService();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateBackendService(BackendServiceName backendService, BackendService backendServiceResource) {

    UpdateBackendServiceHttpRequest request =
        UpdateBackendServiceHttpRequest.newBuilder()
        .setBackendServiceWithBackendServiceName(backendService)
        .setBackendServiceResource(backendServiceResource)
        .build();
    return updateBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   Operation response = backendServiceAdminClient.updateBackendService();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateBackendService(UpdateBackendServiceHttpRequest request) {
    return updateBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when updating a backend service. Read  Restrictions and Guidelines for more information.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = backendServiceAdminClient.updateBackendServiceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceCallable() {
    return stub.updateBackendServiceCallable();
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