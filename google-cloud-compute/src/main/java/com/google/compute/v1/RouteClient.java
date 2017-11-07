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
import static com.google.compute.v1.PagedResponseWrappers.ListRoutesPagedResponse;
import com.google.compute.v1.stub.RouteStub;
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
 * try (RouteClient routeClient = RouteClient.create()) {
 *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
 *   Operation response = routeClient.deleteRoute(route);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the routeClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RouteSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RouteSettings routeSettings =
 *     RouteSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RouteClient routeClient =
 *     RouteClient.create(routeSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RouteSettings routeSettings =
 *     RouteSettings.newBuilder()
 *         .setTransportChannelProvider(RouteSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build())
 *         .build();
 * RouteClient routeClient =
 *     RouteClient.create(routeSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RouteClient implements BackgroundResource {
  private final RouteSettings settings;
  private final RouteStub stub;



  /**
   * Constructs an instance of RouteClient with default settings.
   */
  public static final RouteClient create() throws IOException {
    return create(RouteSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RouteClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RouteClient create(RouteSettings settings) throws IOException {
    return new RouteClient(settings);
  }

  /**
   * Constructs an instance of RouteClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RouteSettings}.
   */
  @BetaApi
  public static final RouteClient create(RouteStub stub) {
    return new RouteClient(stub);
  }

  /**
   * Constructs an instance of RouteClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RouteClient(RouteSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RouteClient(RouteStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RouteSettings getSettings() {
    return settings;
  }

  @BetaApi
  public RouteStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Route resource.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
   *   Operation response = routeClient.deleteRoute(route);
   * }
   * </code></pre>
   *
   * @param route Name of the Route resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRoute(RouteName route) {

    DeleteRouteHttpRequest request =
        DeleteRouteHttpRequest.newBuilder()
        .setRouteWithRouteName(route)
        .build();
    return deleteRoute(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Route resource.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
   *   DeleteRouteHttpRequest request = DeleteRouteHttpRequest.newBuilder()
   *     .setRouteWithRouteName(route)
   *     .build();
   *   Operation response = routeClient.deleteRoute(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteRoute(DeleteRouteHttpRequest request) {
    return deleteRouteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Route resource.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
   *   DeleteRouteHttpRequest request = DeleteRouteHttpRequest.newBuilder()
   *     .setRouteWithRouteName(route)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = routeClient.deleteRouteCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteRouteHttpRequest, Operation> deleteRouteCallable() {
    return stub.deleteRouteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Route resource. Get a list of available routes by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
   *   Route response = routeClient.getRoute(route);
   * }
   * </code></pre>
   *
   * @param route Name of the Route resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Route getRoute(RouteName route) {

    GetRouteHttpRequest request =
        GetRouteHttpRequest.newBuilder()
        .setRouteWithRouteName(route)
        .build();
    return getRoute(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Route resource. Get a list of available routes by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
   *   GetRouteHttpRequest request = GetRouteHttpRequest.newBuilder()
   *     .setRouteWithRouteName(route)
   *     .build();
   *   Route response = routeClient.getRoute(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Route getRoute(GetRouteHttpRequest request) {
    return getRouteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Route resource. Get a list of available routes by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   RouteName route = RouteName.of("[PROJECT]", "[ROUTE]");
   *   GetRouteHttpRequest request = GetRouteHttpRequest.newBuilder()
   *     .setRouteWithRouteName(route)
   *     .build();
   *   ApiFuture&lt;Route&gt; future = routeClient.getRouteCallable().futureCall(request);
   *   // Do something
   *   Route response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRouteHttpRequest, Route> getRouteCallable() {
    return stub.getRouteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a Route resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Route route = Route.newBuilder().build();
   *   Operation response = routeClient.insertRoute(project, route);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param routeResource Represents a Route resource. A route specifies how certain packets should be handled by the network. Routes are associated with instances by tags and the set of routes for a particular instance is called its routing table.
   *
   * For each packet leaving a instance, the system searches that instance's routing table for a single best matching route. Routes match packets by destination IP address, preferring smaller or more specific ranges over larger ones. If there is a tie, the system selects the route with the smallest priority value. If there is still a tie, it uses the layer three and four packet headers to select just one of the remaining matching routes. The packet is then forwarded as specified by the nextHop field of the winning route - either to another instance destination, a instance gateway or a Google Compute Engine-operated gateway.
   *
   * Packets that do not match any route in the sending instance's routing table are dropped.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRoute(ProjectName project, Route routeResource) {

    InsertRouteHttpRequest request =
        InsertRouteHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setRouteResource(routeResource)
        .build();
    return insertRoute(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a Route resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Route route = Route.newBuilder().build();
   *   InsertRouteHttpRequest request = InsertRouteHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setRouteResource(route)
   *     .build();
   *   Operation response = routeClient.insertRoute(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertRoute(InsertRouteHttpRequest request) {
    return insertRouteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a Route resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Route route = Route.newBuilder().build();
   *   InsertRouteHttpRequest request = InsertRouteHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setRouteResource(route)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = routeClient.insertRouteCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertRouteHttpRequest, Operation> insertRouteCallable() {
    return stub.insertRouteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Route resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Route element : routeClient.listRoutes(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRoutesPagedResponse listRoutes(ProjectName project) {
    ListRoutesHttpRequest request =
        ListRoutesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listRoutes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Route resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListRoutesHttpRequest request = ListRoutesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Route element : routeClient.listRoutes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRoutesPagedResponse listRoutes(ListRoutesHttpRequest request) {
    return listRoutesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Route resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListRoutesHttpRequest request = ListRoutesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;ListRoutesPagedResponse&gt; future = routeClient.listRoutesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Route element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRoutesHttpRequest, ListRoutesPagedResponse> listRoutesPagedCallable() {
    return stub.listRoutesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Route resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RouteClient routeClient = RouteClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListRoutesHttpRequest request = ListRoutesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     RouteList response = routeClient.listRoutesCallable().call(request);
   *     for (Route element : response.getItems()) {
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
  public final UnaryCallable<ListRoutesHttpRequest, RouteList> listRoutesCallable() {
    return stub.listRoutesCallable();
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