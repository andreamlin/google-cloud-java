/*
 * Copyright 2017 Google LLC
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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListRoutersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutersPagedResponse;
import com.google.compute.v1.stub.RouterStub;
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
 * try (RouterClient routerClient = RouterClient.create()) {
 *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
 *   Operation response = routerClient.deleteRouter(router);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the routerClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RouterSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RouterSettings routerSettings =
 *     RouterSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RouterClient routerClient =
 *     RouterClient.create(routerSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RouterSettings routerSettings =
 *     RouterSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RouterClient routerClient =
 *     RouterClient.create(routerSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RouterClient implements BackgroundResource {
  private final RouterSettings settings;
  private final RouterStub stub;



  /**
   * Constructs an instance of RouterClient with default settings.
   */
  public static final RouterClient create() throws IOException {
    return create(RouterSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RouterClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RouterClient create(RouterSettings settings) throws IOException {
    return new RouterClient(settings);
  }

  /**
   * Constructs an instance of RouterClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RouterSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RouterClient create(RouterStub stub) {
    return new RouterClient(stub);
  }

  /**
   * Constructs an instance of RouterClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RouterClient(RouterSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RouterClient(RouterStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RouterSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RouterStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of routers.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Router element : routerClient.aggregatedListRouters(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListRoutersPagedResponse aggregatedListRouters(ProjectName project) {
    AggregatedListRoutersHttpRequest request =
        AggregatedListRoutersHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListRouters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of routers.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListRoutersHttpRequest request = AggregatedListRoutersHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Router element : routerClient.aggregatedListRouters(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListRoutersPagedResponse aggregatedListRouters(AggregatedListRoutersHttpRequest request) {
    return aggregatedListRoutersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of routers.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListRoutersHttpRequest request = AggregatedListRoutersHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;AggregatedListRoutersPagedResponse&gt; future = routerClient.aggregatedListRoutersPagedCallable().futureCall(request);
   *   // Do something
   *   for (Router element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListRoutersHttpRequest, AggregatedListRoutersPagedResponse> aggregatedListRoutersPagedCallable() {
    return stub.aggregatedListRoutersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of routers.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListRoutersHttpRequest request = AggregatedListRoutersHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     RouterAggregatedList response = routerClient.aggregatedListRoutersCallable().call(request);
   *     for (Router element : response.getItems().getRouters()) {
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
  public final UnaryCallable<AggregatedListRoutersHttpRequest, RouterAggregatedList> aggregatedListRoutersCallable() {
    return stub.aggregatedListRoutersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Router resource.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   Operation response = routerClient.deleteRouter(router);
   * }
   * </code></pre>
   *
   * @param router Name of the Router resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRouter(RouterName router) {

    DeleteRouterHttpRequest request =
        DeleteRouterHttpRequest.newBuilder()
        .setRouterWithRouterName(router)
        .build();
    return deleteRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Router resource.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   DeleteRouterHttpRequest request = DeleteRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   Operation response = routerClient.deleteRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRouter(DeleteRouterHttpRequest request) {
    return deleteRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Router resource.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   DeleteRouterHttpRequest request = DeleteRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = routerClient.deleteRouterCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteRouterHttpRequest, Operation> deleteRouterCallable() {
    return stub.deleteRouterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Router resource. Get a list of available routers by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   Router response = routerClient.getRouter(router);
   * }
   * </code></pre>
   *
   * @param router Name of the Router resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Router getRouter(RouterName router) {

    GetRouterHttpRequest request =
        GetRouterHttpRequest.newBuilder()
        .setRouterWithRouterName(router)
        .build();
    return getRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Router resource. Get a list of available routers by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   GetRouterHttpRequest request = GetRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   Router response = routerClient.getRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Router getRouter(GetRouterHttpRequest request) {
    return getRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Router resource. Get a list of available routers by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   GetRouterHttpRequest request = GetRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   ApiFuture&lt;Router&gt; future = routerClient.getRouterCallable().futureCall(request);
   *   // Do something
   *   Router response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRouterHttpRequest, Router> getRouterCallable() {
    return stub.getRouterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves runtime information of the specified router.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   RouterStatusResponse response = routerClient.getRouterStatusRouter(router);
   * }
   * </code></pre>
   *
   * @param router Name of the Router resource to query.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final RouterStatusResponse getRouterStatusRouter(RouterName router) {

    GetRouterStatusRouterHttpRequest request =
        GetRouterStatusRouterHttpRequest.newBuilder()
        .setRouterWithRouterName(router)
        .build();
    return getRouterStatusRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves runtime information of the specified router.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   GetRouterStatusRouterHttpRequest request = GetRouterStatusRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   RouterStatusResponse response = routerClient.getRouterStatusRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final RouterStatusResponse getRouterStatusRouter(GetRouterStatusRouterHttpRequest request) {
    return getRouterStatusRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves runtime information of the specified router.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   GetRouterStatusRouterHttpRequest request = GetRouterStatusRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   ApiFuture&lt;RouterStatusResponse&gt; future = routerClient.getRouterStatusRouterCallable().futureCall(request);
   *   // Do something
   *   RouterStatusResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterCallable() {
    return stub.getRouterStatusRouterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a Router resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Router router = Router.newBuilder().build();
   *   Operation response = routerClient.insertRouter(region, router);
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param routerResource Router resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRouter(RegionName region, Router routerResource) {

    InsertRouterHttpRequest request =
        InsertRouterHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .setRouterResource(routerResource)
        .build();
    return insertRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a Router resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Router router = Router.newBuilder().build();
   *   InsertRouterHttpRequest request = InsertRouterHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .setRouterResource(router)
   *     .build();
   *   Operation response = routerClient.insertRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRouter(InsertRouterHttpRequest request) {
    return insertRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a Router resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Router router = Router.newBuilder().build();
   *   InsertRouterHttpRequest request = InsertRouterHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .setRouterResource(router)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = routerClient.insertRouterCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertRouterHttpRequest, Operation> insertRouterCallable() {
    return stub.insertRouterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   for (Router element : routerClient.listRouters(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRoutersPagedResponse listRouters(RegionName region) {
    ListRoutersHttpRequest request =
        ListRoutersHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listRouters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListRoutersHttpRequest request = ListRoutersHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   for (Router element : routerClient.listRouters(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRoutersPagedResponse listRouters(ListRoutersHttpRequest request) {
    return listRoutersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListRoutersHttpRequest request = ListRoutersHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   ApiFuture&lt;ListRoutersPagedResponse&gt; future = routerClient.listRoutersPagedCallable().futureCall(request);
   *   // Do something
   *   for (Router element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRoutersHttpRequest, ListRoutersPagedResponse> listRoutersPagedCallable() {
    return stub.listRoutersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListRoutersHttpRequest request = ListRoutersHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   while (true) {
   *     RouterList response = routerClient.listRoutersCallable().call(request);
   *     for (Router element : response.getItems()) {
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
  public final UnaryCallable<ListRoutersHttpRequest, RouterList> listRoutersCallable() {
    return stub.listRoutersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Router resource with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   Operation response = routerClient.patchRouter(router);
   * }
   * </code></pre>
   *
   * @param router Name of the Router resource to update.
   * @param routerResource Router resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchRouter(RouterName router, Router routerResource) {

    PatchRouterHttpRequest request =
        PatchRouterHttpRequest.newBuilder()
        .setRouterWithRouterName(router)
        .setRouterResource(routerResource)
        .build();
    return patchRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Router resource with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   PatchRouterHttpRequest request = PatchRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   Operation response = routerClient.patchRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchRouter(PatchRouterHttpRequest request) {
    return patchRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Router resource with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   PatchRouterHttpRequest request = PatchRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = routerClient.patchRouterCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchRouterHttpRequest, Operation> patchRouterCallable() {
    return stub.patchRouterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   RoutersPreviewResponse response = routerClient.previewRouter(router);
   * }
   * </code></pre>
   *
   * @param router Name of the Router resource to query.
   * @param routerResource Router resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final RoutersPreviewResponse previewRouter(RouterName router, Router routerResource) {

    PreviewRouterHttpRequest request =
        PreviewRouterHttpRequest.newBuilder()
        .setRouterWithRouterName(router)
        .setRouterResource(routerResource)
        .build();
    return previewRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   PreviewRouterHttpRequest request = PreviewRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   RoutersPreviewResponse response = routerClient.previewRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final RoutersPreviewResponse previewRouter(PreviewRouterHttpRequest request) {
    return previewRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   PreviewRouterHttpRequest request = PreviewRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   ApiFuture&lt;RoutersPreviewResponse&gt; future = routerClient.previewRouterCallable().futureCall(request);
   *   // Do something
   *   RoutersPreviewResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterCallable() {
    return stub.previewRouterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Router resource with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   Operation response = routerClient.updateRouter(router);
   * }
   * </code></pre>
   *
   * @param router Name of the Router resource to update.
   * @param routerResource Router resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateRouter(RouterName router, Router routerResource) {

    UpdateRouterHttpRequest request =
        UpdateRouterHttpRequest.newBuilder()
        .setRouterWithRouterName(router)
        .setRouterResource(routerResource)
        .build();
    return updateRouter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Router resource with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   UpdateRouterHttpRequest request = UpdateRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   Operation response = routerClient.updateRouter(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateRouter(UpdateRouterHttpRequest request) {
    return updateRouterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified Router resource with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouterClient routerClient = RouterClient.create()) {
   *   RouterName router = RouterName.of("[PROJECT]", "[REGION]", "[ROUTER]");
   *   UpdateRouterHttpRequest request = UpdateRouterHttpRequest.newBuilder()
   *     .setRouterWithRouterName(router)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = routerClient.updateRouterCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateRouterHttpRequest, Operation> updateRouterCallable() {
    return stub.updateRouterCallable();
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