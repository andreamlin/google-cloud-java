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
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalForwardingRulesPagedResponse;
import com.google.compute.v1.stub.GlobalForwardingRuleAdminStub;
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
 * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
 *
 *   Operation response = globalForwardingRuleAdminClient.deleteGlobalForwardingRule();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the globalForwardingRuleAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of GlobalForwardingRuleAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * GlobalForwardingRuleAdminSettings globalForwardingRuleAdminSettings =
 *     GlobalForwardingRuleAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient =
 *     GlobalForwardingRuleAdminClient.create(globalForwardingRuleAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * GlobalForwardingRuleAdminSettings globalForwardingRuleAdminSettings =
 *     GlobalForwardingRuleAdminSettings.defaultBuilder()
 *         .setTransportProvider(GlobalForwardingRuleAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(GlobalForwardingRuleAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient =
 *     GlobalForwardingRuleAdminClient.create(globalForwardingRuleAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GlobalForwardingRuleAdminClient implements BackgroundResource {
  private final GlobalForwardingRuleAdminSettings settings;
  private final GlobalForwardingRuleAdminStub stub;



  /**
   * Constructs an instance of GlobalForwardingRuleAdminClient with default settings.
   */
  public static final GlobalForwardingRuleAdminClient create() throws IOException {
    return create(GlobalForwardingRuleAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of GlobalForwardingRuleAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final GlobalForwardingRuleAdminClient create(GlobalForwardingRuleAdminSettings settings) throws IOException {
    return new GlobalForwardingRuleAdminClient(settings);
  }

  /**
   * Constructs an instance of GlobalForwardingRuleAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use GlobalForwardingRuleAdminSettings}.
   */
  public static final GlobalForwardingRuleAdminClient create(GlobalForwardingRuleAdminStub stub) {
    return new GlobalForwardingRuleAdminClient(stub);
  }

  /**
   * Constructs an instance of GlobalForwardingRuleAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GlobalForwardingRuleAdminClient(GlobalForwardingRuleAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected GlobalForwardingRuleAdminClient(GlobalForwardingRuleAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GlobalForwardingRuleAdminSettings getSettings() {
    return settings;
  }

  public GlobalForwardingRuleAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   Operation response = globalForwardingRuleAdminClient.deleteGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param forwardingRule Name of the ForwardingRule resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteGlobalForwardingRule(GlobalForwardingRulesForwardingRuleName forwardingRule) {

    DeleteGlobalForwardingRuleHttpRequest request =
        DeleteGlobalForwardingRuleHttpRequest.newBuilder()
        .setForwardingRuleWithGlobalForwardingRulesForwardingRuleName(forwardingRule)
        .build();
    return deleteGlobalForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   Operation response = globalForwardingRuleAdminClient.deleteGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteGlobalForwardingRule(DeleteGlobalForwardingRuleHttpRequest request) {
    return deleteGlobalForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified ForwardingRule resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = globalForwardingRuleAdminClient.deleteGlobalForwardingRuleCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteGlobalForwardingRuleHttpRequest, Operation> deleteGlobalForwardingRuleCallable() {
    return stub.deleteGlobalForwardingRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified ForwardingRule resource. Get a list of available forwarding rules by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ForwardingRule response = globalForwardingRuleAdminClient.getGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param forwardingRule Name of the ForwardingRule resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ForwardingRule getGlobalForwardingRule(GlobalForwardingRulesForwardingRuleName forwardingRule) {

    GetGlobalForwardingRuleHttpRequest request =
        GetGlobalForwardingRuleHttpRequest.newBuilder()
        .setForwardingRuleWithGlobalForwardingRulesForwardingRuleName(forwardingRule)
        .build();
    return getGlobalForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified ForwardingRule resource. Get a list of available forwarding rules by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ForwardingRule response = globalForwardingRuleAdminClient.getGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ForwardingRule getGlobalForwardingRule(GetGlobalForwardingRuleHttpRequest request) {
    return getGlobalForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified ForwardingRule resource. Get a list of available forwarding rules by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ApiFuture&lt;ForwardingRule&gt; future = globalForwardingRuleAdminClient.getGlobalForwardingRuleCallable().futureCall();
   *   // Do something
   *   ForwardingRule response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetGlobalForwardingRuleHttpRequest, ForwardingRule> getGlobalForwardingRuleCallable() {
    return stub.getGlobalForwardingRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a ForwardingRule resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   Operation response = globalForwardingRuleAdminClient.insertGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param forwardingRuleResource A ForwardingRule resource. A ForwardingRule resource specifies which pool of target virtual machines to forward a packet to if it matches the given [IPAddress, IPProtocol, portRange] tuple.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertGlobalForwardingRule(ProjectName project, ForwardingRule forwardingRuleResource) {

    InsertGlobalForwardingRuleHttpRequest request =
        InsertGlobalForwardingRuleHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setForwardingRuleResource(forwardingRuleResource)
        .build();
    return insertGlobalForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a ForwardingRule resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   Operation response = globalForwardingRuleAdminClient.insertGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertGlobalForwardingRule(InsertGlobalForwardingRuleHttpRequest request) {
    return insertGlobalForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a ForwardingRule resource in the specified project and region using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = globalForwardingRuleAdminClient.insertGlobalForwardingRuleCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertGlobalForwardingRuleHttpRequest, Operation> insertGlobalForwardingRuleCallable() {
    return stub.insertGlobalForwardingRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   for (ForwardingRule element : globalForwardingRuleAdminClient.listGlobalForwardingRules().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalForwardingRulesPagedResponse listGlobalForwardingRules(ProjectName project) {
    ListGlobalForwardingRulesHttpRequest request =
        ListGlobalForwardingRulesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listGlobalForwardingRules(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   for (ForwardingRule element : globalForwardingRuleAdminClient.listGlobalForwardingRules().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalForwardingRulesPagedResponse listGlobalForwardingRules(ListGlobalForwardingRulesHttpRequest request) {
    return listGlobalForwardingRulesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ApiFuture&lt;ListGlobalForwardingRulesPagedResponse&gt; future = globalForwardingRuleAdminClient.listGlobalForwardingRulesPagedCallable().futureCall();
   *   // Do something
   *   for (ForwardingRule element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListGlobalForwardingRulesHttpRequest, ListGlobalForwardingRulesPagedResponse> listGlobalForwardingRulesPagedCallable() {
    return stub.listGlobalForwardingRulesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of ForwardingRule resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   while (true) {
   *     ForwardingRuleList response = globalForwardingRuleAdminClient.listGlobalForwardingRulesCallable().call();
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
  public final UnaryCallable<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList> listGlobalForwardingRulesCallable() {
    return stub.listGlobalForwardingRulesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes target URL for forwarding rule. The new target should be of the same type as the old target.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   Operation response = globalForwardingRuleAdminClient.setTargetGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param forwardingRule Name of the ForwardingRule resource in which target is to be set.
   * @param targetReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTargetGlobalForwardingRule(GlobalForwardingRulesForwardingRuleName forwardingRule, TargetReference targetReferenceResource) {

    SetTargetGlobalForwardingRuleHttpRequest request =
        SetTargetGlobalForwardingRuleHttpRequest.newBuilder()
        .setForwardingRuleWithGlobalForwardingRulesForwardingRuleName(forwardingRule)
        .setTargetReferenceResource(targetReferenceResource)
        .build();
    return setTargetGlobalForwardingRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes target URL for forwarding rule. The new target should be of the same type as the old target.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   Operation response = globalForwardingRuleAdminClient.setTargetGlobalForwardingRule();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTargetGlobalForwardingRule(SetTargetGlobalForwardingRuleHttpRequest request) {
    return setTargetGlobalForwardingRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes target URL for forwarding rule. The new target should be of the same type as the old target.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = globalForwardingRuleAdminClient.setTargetGlobalForwardingRuleCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetTargetGlobalForwardingRuleHttpRequest, Operation> setTargetGlobalForwardingRuleCallable() {
    return stub.setTargetGlobalForwardingRuleCallable();
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