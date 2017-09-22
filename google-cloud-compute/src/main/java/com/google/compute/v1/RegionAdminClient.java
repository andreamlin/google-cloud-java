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
import com.google.compute.v1.stub.RegionAdminStub;
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
 * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
 *
 *   Region response = regionAdminClient.getRegion();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RegionAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RegionAdminSettings regionAdminSettings =
 *     RegionAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionAdminClient regionAdminClient =
 *     RegionAdminClient.create(regionAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionAdminSettings regionAdminSettings =
 *     RegionAdminSettings.defaultBuilder()
 *         .setTransportProvider(RegionAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(RegionAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * RegionAdminClient regionAdminClient =
 *     RegionAdminClient.create(regionAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionAdminClient implements BackgroundResource {
  private final RegionAdminSettings settings;
  private final RegionAdminStub stub;



  /**
   * Constructs an instance of RegionAdminClient with default settings.
   */
  public static final RegionAdminClient create() throws IOException {
    return create(RegionAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of RegionAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RegionAdminClient create(RegionAdminSettings settings) throws IOException {
    return new RegionAdminClient(settings);
  }

  /**
   * Constructs an instance of RegionAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionAdminSettings}.
   */
  public static final RegionAdminClient create(RegionAdminStub stub) {
    return new RegionAdminClient(stub);
  }

  /**
   * Constructs an instance of RegionAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RegionAdminClient(RegionAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RegionAdminClient(RegionAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionAdminSettings getSettings() {
    return settings;
  }

  public RegionAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Get a list of available regions by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   Region response = regionAdminClient.getRegion();
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
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   Region response = regionAdminClient.getRegion();
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
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   ApiFuture&lt;Region&gt; future = regionAdminClient.getRegionCallable().futureCall();
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
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   for (Region element : regionAdminClient.listRegions().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionsPagedResponse listRegions(RegionsProjectName project) {
    ListRegionsHttpRequest request =
        ListRegionsHttpRequest.newBuilder()
        .setProjectWithRegionsProjectName(project)
        .build();
    return listRegions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   for (Region element : regionAdminClient.listRegions().iterateAll()) {
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
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   ApiFuture&lt;ListRegionsPagedResponse&gt; future = regionAdminClient.listRegionsPagedCallable().futureCall();
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
   * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
   *
   *   while (true) {
   *     RegionList response = regionAdminClient.listRegionsCallable().call();
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