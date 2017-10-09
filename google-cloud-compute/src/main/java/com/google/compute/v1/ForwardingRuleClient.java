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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListForwardingRulesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListForwardingRulesPagedResponse;
import com.google.compute.v1.stub.ForwardingRuleStub;
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
 * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
 *
 *   Operation response = forwardingRuleClient.deleteForwardingRule();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the forwardingRuleClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of ForwardingRuleSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * ForwardingRuleSettings forwardingRuleSettings =
 *     ForwardingRuleSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ForwardingRuleClient forwardingRuleClient =
 *     ForwardingRuleClient.create(forwardingRuleSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ForwardingRuleSettings forwardingRuleSettings =
 *     ForwardingRuleSettings.newBuilder()
 *         .setTransportProvider(ForwardingRuleSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(ForwardingRuleSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * ForwardingRuleClient forwardingRuleClient =
 *     ForwardingRuleClient.create(forwardingRuleSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ForwardingRuleClient implements BackgroundResource {
  private final ForwardingRuleSettings settings;
  private final ForwardingRuleStub stub;



  /**
   * Constructs an instance of ForwardingRuleClient with default settings.
   */
  public static final ForwardingRuleClient create() throws IOException {
    return create(ForwardingRuleSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ForwardingRuleClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final ForwardingRuleClient create(ForwardingRuleSettings settings) throws IOException {
    return new ForwardingRuleClient(settings);
  }

  /**
   * Constructs an instance of ForwardingRuleClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ForwardingRuleSettings}.
   */
  public static final ForwardingRuleClient create(ForwardingRuleStub stub) {
    return new ForwardingRuleClient(stub);
  }

  /**
   * Constructs an instance of ForwardingRuleClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected ForwardingRuleClient(ForwardingRuleSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected ForwardingRuleClient(ForwardingRuleStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ForwardingRuleSettings getSettings() {
    return settings;
  }

  @BetaApi
  public ForwardingRuleStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of forwarding rules.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   for (ForwardingRule element : forwardingRuleClient.aggregatedListForwardingRules().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListForwardingRulesPagedResponse aggregatedListForwardingRules(ProjectName project) {
    AggregatedListForwardingRulesHttpRequest request =
        AggregatedListForwardingRulesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListForwardingRules(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of forwarding rules.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   for (ForwardingRule element : forwardingRuleClient.aggregatedListForwardingRules().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListForwardingRulesPagedResponse aggregatedListForwardingRules(AggregatedListForwardingRulesHttpRequest request) {
    return aggregatedListForwardingRulesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of forwarding rules.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListForwardingRulesPagedResponse&gt; future = forwardingRuleClient.aggregatedListForwardingRulesPagedCallable().futureCall();
   *   // Do something
   *   for (ForwardingRule element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListForwardingRulesHttpRequest, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesPagedCallable() {
    return stub.aggregatedListForwardingRulesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of forwarding rules.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   while (true) {
   *     ForwardingRuleAggregatedList response = forwardingRuleClient.aggregatedListForwardingRulesCallable().call();
   *     for (ForwardingRule element : response.getForwardingRules()) {
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
  public final UnaryCallable<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList> aggregatedListForwardingRulesCallable() {
    return stub.aggregatedListForwardingRulesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   Operation response = forwardingRuleClient.deleteForwardingRule();
   * }
   * </code></pre>
   *
   * @param forwardingRule Name of the ForwardingRule resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteForwardingRule(ForwardingRuleName forwardingRule) {

    DeleteForwardingRuleHttpRequest request =
        DeleteForwardingRuleHttpRequest.newBuilder()
        .setForwardingRuleWithForwardingRuleName(forwardingRule)
        .build();
    return deleteForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   Operation response = forwardingRuleClient.deleteForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteForwardingRule(DeleteForwardingRuleHttpRequest request) {
    return deleteForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = forwardingRuleClient.deleteForwardingRuleCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleCallable() {
    return stub.deleteForwardingRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ForwardingRule response = forwardingRuleClient.getForwardingRule();
   * }
   * </code></pre>
   *
   * @param forwardingRule Name of the ForwardingRule resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ForwardingRule getForwardingRule(ForwardingRuleName forwardingRule) {

    GetForwardingRuleHttpRequest request =
        GetForwardingRuleHttpRequest.newBuilder()
        .setForwardingRuleWithForwardingRuleName(forwardingRule)
        .build();
    return getForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ForwardingRule response = forwardingRuleClient.getForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ForwardingRule getForwardingRule(GetForwardingRuleHttpRequest request) {
    return getForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ApiFuture&lt;ForwardingRule&gt; future = forwardingRuleClient.getForwardingRuleCallable().futureCall();
   *   // Do something
   *   ForwardingRule response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleCallable() {
    return stub.getForwardingRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a ForwardingRule resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   Operation response = forwardingRuleClient.insertForwardingRule();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param forwardingRuleResource A ForwardingRule resource. A ForwardingRule resource specifies which pool of target virtual machines to forward a packet to if it matches the given [IPAddress, IPProtocol, portRange] tuple.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertForwardingRule(RegionName region, ForwardingRule forwardingRuleResource) {

    InsertForwardingRuleHttpRequest request =
        InsertForwardingRuleHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .setForwardingRuleResource(forwardingRuleResource)
        .build();
    return insertForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a ForwardingRule resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   Operation response = forwardingRuleClient.insertForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertForwardingRule(InsertForwardingRuleHttpRequest request) {
    return insertForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a ForwardingRule resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = forwardingRuleClient.insertForwardingRuleCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleCallable() {
    return stub.insertForwardingRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   for (ForwardingRule element : forwardingRuleClient.listForwardingRules().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListForwardingRulesPagedResponse listForwardingRules(RegionName region) {
    ListForwardingRulesHttpRequest request =
        ListForwardingRulesHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listForwardingRules(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   for (ForwardingRule element : forwardingRuleClient.listForwardingRules().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListForwardingRulesPagedResponse listForwardingRules(ListForwardingRulesHttpRequest request) {
    return listForwardingRulesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ApiFuture&lt;ListForwardingRulesPagedResponse&gt; future = forwardingRuleClient.listForwardingRulesPagedCallable().futureCall();
   *   // Do something
   *   for (ForwardingRule element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListForwardingRulesHttpRequest, ListForwardingRulesPagedResponse> listForwardingRulesPagedCallable() {
    return stub.listForwardingRulesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project and region.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   while (true) {
   *     ForwardingRuleList response = forwardingRuleClient.listForwardingRulesCallable().call();
   *     for (ForwardingRule element : response.getItems()) {
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
  public final UnaryCallable<ListForwardingRulesHttpRequest, ForwardingRuleList> listForwardingRulesCallable() {
    return stub.listForwardingRulesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes target URL for forwarding rule. The new target should be of the same type as the old target.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   Operation response = forwardingRuleClient.setTargetForwardingRule();
   * }
   * </code></pre>
   *
   * @param forwardingRule Name of the ForwardingRule resource in which target is to be set.
   * @param targetReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTargetForwardingRule(ForwardingRuleName forwardingRule, TargetReference targetReferenceResource) {

    SetTargetForwardingRuleHttpRequest request =
        SetTargetForwardingRuleHttpRequest.newBuilder()
        .setForwardingRuleWithForwardingRuleName(forwardingRule)
        .setTargetReferenceResource(targetReferenceResource)
        .build();
    return setTargetForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes target URL for forwarding rule. The new target should be of the same type as the old target.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   Operation response = forwardingRuleClient.setTargetForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTargetForwardingRule(SetTargetForwardingRuleHttpRequest request) {
    return setTargetForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes target URL for forwarding rule. The new target should be of the same type as the old target.
   *
   * Sample code:
   * <pre><code>
   * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = forwardingRuleClient.setTargetForwardingRuleCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleCallable() {
    return stub.setTargetForwardingRuleCallable();
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