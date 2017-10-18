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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionsPagedResponse;
import com.google.compute.v1.stub.RegionStub;
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
 * try (RegionClient regionClient = RegionClient.create()) {
 *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
 *   Region response = regionClient.getRegion(region);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RegionSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RegionSettings regionSettings =
 *     RegionSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionClient regionClient =
 *     RegionClient.create(regionSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionSettings regionSettings =
 *     RegionSettings.newBuilder()
 *         .setTransportProvider(RegionSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(RegionSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * RegionClient regionClient =
 *     RegionClient.create(regionSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionClient implements BackgroundResource {
  private final RegionSettings settings;
  private final RegionStub stub;



  /**
   * Constructs an instance of RegionClient with default settings.
   */
  public static final RegionClient create() throws IOException {
    return create(RegionSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RegionClient create(RegionSettings settings) throws IOException {
    return new RegionClient(settings);
  }

  /**
   * Constructs an instance of RegionClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionSettings}.
   */
  public static final RegionClient create(RegionStub stub) {
    return new RegionClient(stub);
  }

  /**
   * Constructs an instance of RegionClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RegionClient(RegionSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RegionClient(RegionStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionSettings getSettings() {
    return settings;
  }

  @BetaApi
  public RegionStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Get a list of available regions by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   Region response = regionClient.getRegion(region);
   * }
   * </code></pre>
   *
   * @param region Name of the region resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Region getRegion(RegionName region) {

    GetRegionHttpRequest request =
        GetRegionHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return getRegion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Get a list of available regions by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   GetRegionHttpRequest request = GetRegionHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   Region response = regionClient.getRegion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Region getRegion(GetRegionHttpRequest request) {
    return getRegionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Get a list of available regions by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   GetRegionHttpRequest request = GetRegionHttpRequest.newBuilder()
   *     .setRegionWithRegionName(region)
   *     .build();
   *   ApiFuture&lt;Region&gt; future = regionClient.getRegionCallable().futureCall(request);
   *   // Do something
   *   Region response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRegionHttpRequest, Region> getRegionCallable() {
    return stub.getRegionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (Region element : regionClient.listRegions(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionsPagedResponse listRegions(ProjectName project) {
    ListRegionsHttpRequest request =
        ListRegionsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listRegions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListRegionsHttpRequest request = ListRegionsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Region element : regionClient.listRegions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionsPagedResponse listRegions(ListRegionsHttpRequest request) {
    return listRegionsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListRegionsHttpRequest request = ListRegionsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;ListRegionsPagedResponse&gt; future = regionClient.listRegionsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Region element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRegionsHttpRequest, ListRegionsPagedResponse> listRegionsPagedCallable() {
    return stub.listRegionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RegionClient regionClient = RegionClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListRegionsHttpRequest request = ListRegionsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     RegionList response = regionClient.listRegionsCallable().call(request);
   *     for (Region element : response.getItems()) {
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
  public final UnaryCallable<ListRegionsHttpRequest, RegionList> listRegionsCallable() {
    return stub.listRegionsCallable();
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