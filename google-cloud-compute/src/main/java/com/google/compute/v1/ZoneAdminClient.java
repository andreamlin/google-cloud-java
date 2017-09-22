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
import static com.google.compute.v1.PagedResponseWrappers.ListZonesPagedResponse;
import com.google.compute.v1.stub.ZoneAdminStub;
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
 * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
 *
 *   Zone response = zoneAdminClient.getZone();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the zoneAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of ZoneAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * ZoneAdminSettings zoneAdminSettings =
 *     ZoneAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ZoneAdminClient zoneAdminClient =
 *     ZoneAdminClient.create(zoneAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ZoneAdminSettings zoneAdminSettings =
 *     ZoneAdminSettings.defaultBuilder()
 *         .setTransportProvider(ZoneAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(ZoneAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * ZoneAdminClient zoneAdminClient =
 *     ZoneAdminClient.create(zoneAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ZoneAdminClient implements BackgroundResource {
  private final ZoneAdminSettings settings;
  private final ZoneAdminStub stub;



  /**
   * Constructs an instance of ZoneAdminClient with default settings.
   */
  public static final ZoneAdminClient create() throws IOException {
    return create(ZoneAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of ZoneAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final ZoneAdminClient create(ZoneAdminSettings settings) throws IOException {
    return new ZoneAdminClient(settings);
  }

  /**
   * Constructs an instance of ZoneAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ZoneAdminSettings}.
   */
  public static final ZoneAdminClient create(ZoneAdminStub stub) {
    return new ZoneAdminClient(stub);
  }

  /**
   * Constructs an instance of ZoneAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected ZoneAdminClient(ZoneAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected ZoneAdminClient(ZoneAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ZoneAdminSettings getSettings() {
    return settings;
  }

  public ZoneAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Zone resource. Get a list of available zones by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   Zone response = zoneAdminClient.getZone();
   * }
   * </code></pre>
   *
   * @param zone Name of the zone resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Zone getZone(ZoneName zone) {

    GetZoneHttpRequest request =
        GetZoneHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return getZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Zone resource. Get a list of available zones by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   Zone response = zoneAdminClient.getZone();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Zone getZone(GetZoneHttpRequest request) {
    return getZoneCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Zone resource. Get a list of available zones by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   ApiFuture&lt;Zone&gt; future = zoneAdminClient.getZoneCallable().futureCall();
   *   // Do something
   *   Zone response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetZoneHttpRequest, Zone> getZoneCallable() {
    return stub.getZoneCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Zone resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   for (Zone element : zoneAdminClient.listZones().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListZonesPagedResponse listZones(ZonesProjectName project) {
    ListZonesHttpRequest request =
        ListZonesHttpRequest.newBuilder()
        .setProjectWithZonesProjectName(project)
        .build();
    return listZones(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Zone resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   for (Zone element : zoneAdminClient.listZones().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListZonesPagedResponse listZones(ListZonesHttpRequest request) {
    return listZonesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Zone resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   ApiFuture&lt;ListZonesPagedResponse&gt; future = zoneAdminClient.listZonesPagedCallable().futureCall();
   *   // Do something
   *   for (Zone element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListZonesHttpRequest, ListZonesPagedResponse> listZonesPagedCallable() {
    return stub.listZonesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Zone resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
   *
   *   while (true) {
   *     ZoneList response = zoneAdminClient.listZonesCallable().call();
   *     for (Zone element : response.getItems()) {
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
  public final UnaryCallable<ListZonesHttpRequest, ZoneList> listZonesCallable() {
    return stub.listZonesCallable();
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