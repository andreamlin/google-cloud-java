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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetVpnGatewaysPagedResponse;
import com.google.compute.v1.stub.TargetVpnGatewayStub;
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
 * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
 *   TargetVpnGatewayName targetVpnGateway = TargetVpnGatewayName.create("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
 *   Operation response = targetVpnGatewayClient.deleteTargetVpnGateway(targetVpnGateway);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetVpnGatewayClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetVpnGatewaySettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetVpnGatewaySettings targetVpnGatewaySettings =
 *     TargetVpnGatewaySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetVpnGatewayClient targetVpnGatewayClient =
 *     TargetVpnGatewayClient.create(targetVpnGatewaySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetVpnGatewaySettings targetVpnGatewaySettings =
 *     TargetVpnGatewaySettings.newBuilder()
 *         .setTransportProvider(TargetVpnGatewaySettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(TargetVpnGatewaySettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetVpnGatewayClient targetVpnGatewayClient =
 *     TargetVpnGatewayClient.create(targetVpnGatewaySettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetVpnGatewayClient implements BackgroundResource {
  private final TargetVpnGatewaySettings settings;
  private final TargetVpnGatewayStub stub;



  /**
   * Constructs an instance of TargetVpnGatewayClient with default settings.
   */
  public static final TargetVpnGatewayClient create() throws IOException {
    return create(TargetVpnGatewaySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetVpnGatewayClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetVpnGatewayClient create(TargetVpnGatewaySettings settings) throws IOException {
    return new TargetVpnGatewayClient(settings);
  }

  /**
   * Constructs an instance of TargetVpnGatewayClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetVpnGatewaySettings}.
   */
  public static final TargetVpnGatewayClient create(TargetVpnGatewayStub stub) {
    return new TargetVpnGatewayClient(stub);
  }

  /**
   * Constructs an instance of TargetVpnGatewayClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetVpnGatewayClient(TargetVpnGatewaySettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetVpnGatewayClient(TargetVpnGatewayStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetVpnGatewaySettings getSettings() {
    return settings;
  }

  @BetaApi
  public TargetVpnGatewayStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (TargetVpnGateway element : targetVpnGatewayClient.aggregatedListTargetVpnGateways(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetVpnGatewaysPagedResponse aggregatedListTargetVpnGateways(ProjectName project) {
    AggregatedListTargetVpnGatewaysHttpRequest request =
        AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListTargetVpnGateways(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedProject = TargetVpnGatewayClient.formatProjectName("[PROJECT]");
   *   AggregatedListTargetVpnGatewaysHttpRequest request = AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (TargetVpnGateway element : targetVpnGatewayClient.aggregatedListTargetVpnGateways(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetVpnGatewaysPagedResponse aggregatedListTargetVpnGateways(AggregatedListTargetVpnGatewaysHttpRequest request) {
    return aggregatedListTargetVpnGatewaysPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedProject = TargetVpnGatewayClient.formatProjectName("[PROJECT]");
   *   AggregatedListTargetVpnGatewaysHttpRequest request = AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;AggregatedListTargetVpnGatewaysPagedResponse&gt; future = targetVpnGatewayClient.aggregatedListTargetVpnGatewaysPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetVpnGateway element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysPagedCallable() {
    return stub.aggregatedListTargetVpnGatewaysPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of target VPN gateways.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedProject = TargetVpnGatewayClient.formatProjectName("[PROJECT]");
   *   AggregatedListTargetVpnGatewaysHttpRequest request = AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     TargetVpnGatewayAggregatedList response = targetVpnGatewayClient.aggregatedListTargetVpnGatewaysCallable().call(request);
   *     for (TargetVpnGateway element : response.getTargetVpnGateways()) {
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
  public final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysCallable() {
    return stub.aggregatedListTargetVpnGatewaysCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target VPN gateway.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   TargetVpnGatewayName targetVpnGateway = TargetVpnGatewayName.create("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
   *   Operation response = targetVpnGatewayClient.deleteTargetVpnGateway(targetVpnGateway);
   * }
   * </code></pre>
   *
   * @param targetVpnGateway Name of the target VPN gateway to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetVpnGateway(TargetVpnGatewayName targetVpnGateway) {

    DeleteTargetVpnGatewayHttpRequest request =
        DeleteTargetVpnGatewayHttpRequest.newBuilder()
        .setTargetVpnGatewayWithTargetVpnGatewayName(targetVpnGateway)
        .build();
    return deleteTargetVpnGateway(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target VPN gateway.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedTargetVpnGateway = TargetVpnGatewayClient.formatTargetVpnGatewayName("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
   *   DeleteTargetVpnGatewayHttpRequest request = DeleteTargetVpnGatewayHttpRequest.newBuilder()
   *     .setTargetVpnGateway(formattedTargetVpnGateway)
   *     .build();
   *   Operation response = targetVpnGatewayClient.deleteTargetVpnGateway(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetVpnGateway(DeleteTargetVpnGatewayHttpRequest request) {
    return deleteTargetVpnGatewayCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified target VPN gateway.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedTargetVpnGateway = TargetVpnGatewayClient.formatTargetVpnGatewayName("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
   *   DeleteTargetVpnGatewayHttpRequest request = DeleteTargetVpnGatewayHttpRequest.newBuilder()
   *     .setTargetVpnGateway(formattedTargetVpnGateway)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetVpnGatewayClient.deleteTargetVpnGatewayCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayCallable() {
    return stub.deleteTargetVpnGatewayCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   TargetVpnGatewayName targetVpnGateway = TargetVpnGatewayName.create("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
   *   TargetVpnGateway response = targetVpnGatewayClient.getTargetVpnGateway(targetVpnGateway);
   * }
   * </code></pre>
   *
   * @param targetVpnGateway Name of the target VPN gateway to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetVpnGateway getTargetVpnGateway(TargetVpnGatewayName targetVpnGateway) {

    GetTargetVpnGatewayHttpRequest request =
        GetTargetVpnGatewayHttpRequest.newBuilder()
        .setTargetVpnGatewayWithTargetVpnGatewayName(targetVpnGateway)
        .build();
    return getTargetVpnGateway(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedTargetVpnGateway = TargetVpnGatewayClient.formatTargetVpnGatewayName("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
   *   GetTargetVpnGatewayHttpRequest request = GetTargetVpnGatewayHttpRequest.newBuilder()
   *     .setTargetVpnGateway(formattedTargetVpnGateway)
   *     .build();
   *   TargetVpnGateway response = targetVpnGatewayClient.getTargetVpnGateway(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetVpnGateway getTargetVpnGateway(GetTargetVpnGatewayHttpRequest request) {
    return getTargetVpnGatewayCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedTargetVpnGateway = TargetVpnGatewayClient.formatTargetVpnGatewayName("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
   *   GetTargetVpnGatewayHttpRequest request = GetTargetVpnGatewayHttpRequest.newBuilder()
   *     .setTargetVpnGateway(formattedTargetVpnGateway)
   *     .build();
   *   ApiFuture&lt;TargetVpnGateway&gt; future = targetVpnGatewayClient.getTargetVpnGatewayCallable().futureCall(request);
   *   // Do something
   *   TargetVpnGateway response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayCallable() {
    return stub.getTargetVpnGatewayCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target VPN gateway in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   TargetVpnGateway targetVpnGateway = TargetVpnGateway.newBuilder().build();
   *   Operation response = targetVpnGatewayClient.insertTargetVpnGateway(region, targetVpnGateway);
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param targetVpnGatewayResource Represents a Target VPN gateway resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetVpnGateway(RegionName region, TargetVpnGateway targetVpnGatewayResource) {

    InsertTargetVpnGatewayHttpRequest request =
        InsertTargetVpnGatewayHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .setTargetVpnGatewayResource(targetVpnGatewayResource)
        .build();
    return insertTargetVpnGateway(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target VPN gateway in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedRegion = TargetVpnGatewayClient.formatRegionName("[PROJECT]", "[REGION]");
   *   TargetVpnGateway targetVpnGateway = TargetVpnGateway.newBuilder().build();
   *   InsertTargetVpnGatewayHttpRequest request = InsertTargetVpnGatewayHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .setTargetVpnGateway(targetVpnGateway)
   *     .build();
   *   Operation response = targetVpnGatewayClient.insertTargetVpnGateway(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetVpnGateway(InsertTargetVpnGatewayHttpRequest request) {
    return insertTargetVpnGatewayCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a target VPN gateway in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedRegion = TargetVpnGatewayClient.formatRegionName("[PROJECT]", "[REGION]");
   *   TargetVpnGateway targetVpnGateway = TargetVpnGateway.newBuilder().build();
   *   InsertTargetVpnGatewayHttpRequest request = InsertTargetVpnGatewayHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .setTargetVpnGateway(targetVpnGateway)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetVpnGatewayClient.insertTargetVpnGatewayCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayCallable() {
    return stub.insertTargetVpnGatewayCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
   *   for (TargetVpnGateway element : targetVpnGatewayClient.listTargetVpnGateways(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetVpnGatewaysPagedResponse listTargetVpnGateways(RegionName region) {
    ListTargetVpnGatewaysHttpRequest request =
        ListTargetVpnGatewaysHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listTargetVpnGateways(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedRegion = TargetVpnGatewayClient.formatRegionName("[PROJECT]", "[REGION]");
   *   ListTargetVpnGatewaysHttpRequest request = ListTargetVpnGatewaysHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   for (TargetVpnGateway element : targetVpnGatewayClient.listTargetVpnGateways(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetVpnGatewaysPagedResponse listTargetVpnGateways(ListTargetVpnGatewaysHttpRequest request) {
    return listTargetVpnGatewaysPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedRegion = TargetVpnGatewayClient.formatRegionName("[PROJECT]", "[REGION]");
   *   ListTargetVpnGatewaysHttpRequest request = ListTargetVpnGatewaysHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   ApiFuture&lt;ListTargetVpnGatewaysPagedResponse&gt; future = targetVpnGatewayClient.listTargetVpnGatewaysPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetVpnGateway element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetVpnGatewaysHttpRequest, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysPagedCallable() {
    return stub.listTargetVpnGatewaysPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of target VPN gateways available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
   *   String formattedRegion = TargetVpnGatewayClient.formatRegionName("[PROJECT]", "[REGION]");
   *   ListTargetVpnGatewaysHttpRequest request = ListTargetVpnGatewaysHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   while (true) {
   *     TargetVpnGatewayList response = targetVpnGatewayClient.listTargetVpnGatewaysCallable().call(request);
   *     for (TargetVpnGateway element : response.getItems()) {
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
  public final UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysCallable() {
    return stub.listTargetVpnGatewaysCallable();
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