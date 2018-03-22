/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.paging.FixedSizeCollection;
import com.google.api.gax.paging.Page;
import com.google.api.gax.rpc.ApiExceptions;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.compute.v1.stub.BackendServiceStub;
import com.google.compute.v1.stub.BackendServiceStubSettings;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
 * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
 *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
 *   Operation response = backendServiceClient.deleteBackendService(backendService);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the backendServiceClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of BackendServiceSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * BackendServiceSettings backendServiceSettings =
 *     BackendServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BackendServiceClient backendServiceClient =
 *     BackendServiceClient.create(backendServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * BackendServiceSettings backendServiceSettings =
 *     BackendServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BackendServiceClient backendServiceClient =
 *     BackendServiceClient.create(backendServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class BackendServiceClient implements BackgroundResource {
  private final BackendServiceSettings settings;
  private final BackendServiceStub stub;



  /**
   * Constructs an instance of BackendServiceClient with default settings.
   */
  public static final BackendServiceClient create() throws IOException {
    return create(BackendServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BackendServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final BackendServiceClient create(BackendServiceSettings settings) throws IOException {
    return new BackendServiceClient(settings);
  }

  /**
   * Constructs an instance of BackendServiceClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use BackendServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BackendServiceClient create(BackendServiceStub stub) {
    return new BackendServiceClient(stub);
  }

  /**
   * Constructs an instance of BackendServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected BackendServiceClient(BackendServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BackendServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BackendServiceClient(BackendServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BackendServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BackendServiceStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (BackendService element : backendServiceClient.aggregatedListBackendServices(project).iterateAll()) {
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
        .setProject(project == null ? null : project.toString())
        .build();
    return aggregatedListBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (BackendService element : backendServiceClient.aggregatedListBackendServices(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListBackendServicesPagedResponse aggregatedListBackendServices(String project) {
    AggregatedListBackendServicesHttpRequest request =
        AggregatedListBackendServicesHttpRequest.newBuilder()
        .setProject(project)
        .build();
    return aggregatedListBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListBackendServicesHttpRequest request = AggregatedListBackendServicesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (BackendService element : backendServiceClient.aggregatedListBackendServices(request).iterateAll()) {
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListBackendServicesHttpRequest request = AggregatedListBackendServicesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;AggregatedListBackendServicesPagedResponse&gt; future = backendServiceClient.aggregatedListBackendServicesPagedCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListBackendServicesHttpRequest request = AggregatedListBackendServicesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     BackendServiceAggregatedList response = backendServiceClient.aggregatedListBackendServicesCallable().call(request);
   *     for (BackendService element : response.getBackendServicesList()) {
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   Operation response = backendServiceClient.deleteBackendService(backendService);
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
        .setBackendService(backendService == null ? null : backendService.toString())
        .build();
    return deleteBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   Operation response = backendServiceClient.deleteBackendService(backendService.toString());
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteBackendService(String backendService) {

    DeleteBackendServiceHttpRequest request =
        DeleteBackendServiceHttpRequest.newBuilder()
        .setBackendService(backendService)
        .build();
    return deleteBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendService resource.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   DeleteBackendServiceHttpRequest request = DeleteBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   Operation response = backendServiceClient.deleteBackendService(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   DeleteBackendServiceHttpRequest request = DeleteBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendServiceClient.deleteBackendServiceCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService response = backendServiceClient.getBackendService(backendService);
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
        .setBackendService(backendService == null ? null : backendService.toString())
        .build();
    return getBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendService resource. Get a list of available backend services by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService response = backendServiceClient.getBackendService(backendService.toString());
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getBackendService(String backendService) {

    GetBackendServiceHttpRequest request =
        GetBackendServiceHttpRequest.newBuilder()
        .setBackendService(backendService)
        .build();
    return getBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendService resource. Get a list of available backend services by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   GetBackendServiceHttpRequest request = GetBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   BackendService response = backendServiceClient.getBackendService(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   GetBackendServiceHttpRequest request = GetBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   ApiFuture&lt;BackendService&gt; future = backendServiceClient.getBackendServiceCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   BackendServiceGroupHealth response = backendServiceClient.getHealthBackendService(backendService, resourceGroupReferenceResource);
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
        .setBackendService(backendService == null ? null : backendService.toString())
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   BackendServiceGroupHealth response = backendServiceClient.getHealthBackendService(backendService.toString(), resourceGroupReferenceResource);
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to which the queried instance belongs.
   * @param resourceGroupReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthBackendService(String backendService, ResourceGroupReference resourceGroupReferenceResource) {

    GetHealthBackendServiceHttpRequest request =
        GetHealthBackendServiceHttpRequest.newBuilder()
        .setBackendService(backendService)
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   GetHealthBackendServiceHttpRequest request = GetHealthBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setResourceGroupReferenceResource(resourceGroupReferenceResource)
   *     .build();
   *   BackendServiceGroupHealth response = backendServiceClient.getHealthBackendService(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   GetHealthBackendServiceHttpRequest request = GetHealthBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setResourceGroupReferenceResource(resourceGroupReferenceResource)
   *     .build();
   *   ApiFuture&lt;BackendServiceGroupHealth&gt; future = backendServiceClient.getHealthBackendServiceCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   Operation response = backendServiceClient.insertBackendService(project, backendServiceResource);
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
        .setProject(project == null ? null : project.toString())
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   Operation response = backendServiceClient.insertBackendService(project.toString(), backendServiceResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertBackendService(String project, BackendService backendServiceResource) {

    InsertBackendServiceHttpRequest request =
        InsertBackendServiceHttpRequest.newBuilder()
        .setProject(project)
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   InsertBackendServiceHttpRequest request = InsertBackendServiceHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   Operation response = backendServiceClient.insertBackendService(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   InsertBackendServiceHttpRequest request = InsertBackendServiceHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendServiceClient.insertBackendServiceCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (BackendService element : backendServiceClient.listBackendServices(project).iterateAll()) {
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
        .setProject(project == null ? null : project.toString())
        .build();
    return listBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendService resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (BackendService element : backendServiceClient.listBackendServices(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListBackendServicesPagedResponse listBackendServices(String project) {
    ListBackendServicesHttpRequest request =
        ListBackendServicesHttpRequest.newBuilder()
        .setProject(project)
        .build();
    return listBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendService resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListBackendServicesHttpRequest request = ListBackendServicesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (BackendService element : backendServiceClient.listBackendServices(request).iterateAll()) {
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListBackendServicesHttpRequest request = ListBackendServicesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListBackendServicesPagedResponse&gt; future = backendServiceClient.listBackendServicesPagedCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListBackendServicesHttpRequest request = ListBackendServicesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     BackendServiceList response = backendServiceClient.listBackendServicesCallable().call(request);
   *     for (BackendService element : response.getItemsList()) {
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   Operation response = backendServiceClient.patchBackendService(backendService, backendServiceResource);
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
        .setBackendService(backendService == null ? null : backendService.toString())
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   Operation response = backendServiceClient.patchBackendService(backendService.toString(), backendServiceResource);
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchBackendService(String backendService, BackendService backendServiceResource) {

    PatchBackendServiceHttpRequest request =
        PatchBackendServiceHttpRequest.newBuilder()
        .setBackendService(backendService)
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   PatchBackendServiceHttpRequest request = PatchBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   Operation response = backendServiceClient.patchBackendService(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   PatchBackendServiceHttpRequest request = PatchBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendServiceClient.patchBackendServiceCallable().futureCall(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   Operation response = backendServiceClient.updateBackendService(backendService, backendServiceResource);
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
        .setBackendService(backendService == null ? null : backendService.toString())
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   Operation response = backendServiceClient.updateBackendService(backendService.toString(), backendServiceResource);
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateBackendService(String backendService, BackendService backendServiceResource) {

    UpdateBackendServiceHttpRequest request =
        UpdateBackendServiceHttpRequest.newBuilder()
        .setBackendService(backendService)
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   UpdateBackendServiceHttpRequest request = UpdateBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   Operation response = backendServiceClient.updateBackendService(request);
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
   * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
   *   BackendServiceName backendService = BackendServiceName.of("[PROJECT]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   UpdateBackendServiceHttpRequest request = UpdateBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendServiceClient.updateBackendServiceCallable().futureCall(request);
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

  public static class AggregatedListBackendServicesPagedResponse extends AbstractPagedListResponse<
      AggregatedListBackendServicesHttpRequest,
      BackendServiceAggregatedList,
      BackendService,
      AggregatedListBackendServicesPage,
      AggregatedListBackendServicesFixedSizeCollection> {

    public static ApiFuture<AggregatedListBackendServicesPagedResponse> createAsync(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        ApiFuture<BackendServiceAggregatedList> futureResponse) {
      ApiFuture<AggregatedListBackendServicesPage> futurePage =
          AggregatedListBackendServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListBackendServicesPage, AggregatedListBackendServicesPagedResponse>() {
            @Override
            public AggregatedListBackendServicesPagedResponse apply(AggregatedListBackendServicesPage input) {
              return new AggregatedListBackendServicesPagedResponse(input);
            }
          });
    }

    private AggregatedListBackendServicesPagedResponse(AggregatedListBackendServicesPage page) {
      super(page, AggregatedListBackendServicesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListBackendServicesPage extends AbstractPage<
      AggregatedListBackendServicesHttpRequest,
      BackendServiceAggregatedList,
      BackendService,
      AggregatedListBackendServicesPage> {

    private AggregatedListBackendServicesPage(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        BackendServiceAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListBackendServicesPage createEmptyPage() {
      return new AggregatedListBackendServicesPage(null, null);
    }

    @Override
    protected AggregatedListBackendServicesPage createPage(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        BackendServiceAggregatedList response) {
      return new AggregatedListBackendServicesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListBackendServicesPage> createPageAsync(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        ApiFuture<BackendServiceAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListBackendServicesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListBackendServicesHttpRequest,
      BackendServiceAggregatedList,
      BackendService,
      AggregatedListBackendServicesPage,
      AggregatedListBackendServicesFixedSizeCollection> {

    private AggregatedListBackendServicesFixedSizeCollection(List<AggregatedListBackendServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListBackendServicesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListBackendServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListBackendServicesFixedSizeCollection createCollection(
        List<AggregatedListBackendServicesPage> pages, int collectionSize) {
      return new AggregatedListBackendServicesFixedSizeCollection(pages, collectionSize);
    }


  }
  public static class ListBackendServicesPagedResponse extends AbstractPagedListResponse<
      ListBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListBackendServicesPage,
      ListBackendServicesFixedSizeCollection> {

    public static ApiFuture<ListBackendServicesPagedResponse> createAsync(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        ApiFuture<BackendServiceList> futureResponse) {
      ApiFuture<ListBackendServicesPage> futurePage =
          ListBackendServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListBackendServicesPage, ListBackendServicesPagedResponse>() {
            @Override
            public ListBackendServicesPagedResponse apply(ListBackendServicesPage input) {
              return new ListBackendServicesPagedResponse(input);
            }
          });
    }

    private ListBackendServicesPagedResponse(ListBackendServicesPage page) {
      super(page, ListBackendServicesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListBackendServicesPage extends AbstractPage<
      ListBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListBackendServicesPage> {

    private ListBackendServicesPage(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        BackendServiceList response) {
      super(context, response);
    }

    private static ListBackendServicesPage createEmptyPage() {
      return new ListBackendServicesPage(null, null);
    }

    @Override
    protected ListBackendServicesPage createPage(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        BackendServiceList response) {
      return new ListBackendServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListBackendServicesPage> createPageAsync(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        ApiFuture<BackendServiceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListBackendServicesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListBackendServicesPage,
      ListBackendServicesFixedSizeCollection> {

    private ListBackendServicesFixedSizeCollection(List<ListBackendServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListBackendServicesFixedSizeCollection createEmptyCollection() {
      return new ListBackendServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListBackendServicesFixedSizeCollection createCollection(
        List<ListBackendServicesPage> pages, int collectionSize) {
      return new ListBackendServicesFixedSizeCollection(pages, collectionSize);
    }


  }
}