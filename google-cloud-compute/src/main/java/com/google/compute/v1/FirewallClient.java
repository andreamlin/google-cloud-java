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
import static com.google.compute.v1.PagedResponseWrappers.ListFirewallsPagedResponse;
import com.google.compute.v1.stub.FirewallStub;
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
 * try (FirewallClient firewallClient = FirewallClient.create()) {
 *   FirewallName firewall = FirewallName.create("[PROJECT]", "[FIREWALL]");
 *   Operation response = firewallClient.deleteFirewall(firewall);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the firewallClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of FirewallSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * FirewallSettings firewallSettings =
 *     FirewallSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FirewallClient firewallClient =
 *     FirewallClient.create(firewallSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FirewallSettings firewallSettings =
 *     FirewallSettings.newBuilder()
 *         .setTransportProvider(FirewallSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(FirewallSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * FirewallClient firewallClient =
 *     FirewallClient.create(firewallSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class FirewallClient implements BackgroundResource {
  private final FirewallSettings settings;
  private final FirewallStub stub;



  /**
   * Constructs an instance of FirewallClient with default settings.
   */
  public static final FirewallClient create() throws IOException {
    return create(FirewallSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FirewallClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final FirewallClient create(FirewallSettings settings) throws IOException {
    return new FirewallClient(settings);
  }

  /**
   * Constructs an instance of FirewallClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use FirewallSettings}.
   */
  public static final FirewallClient create(FirewallStub stub) {
    return new FirewallClient(stub);
  }

  /**
   * Constructs an instance of FirewallClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected FirewallClient(FirewallSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected FirewallClient(FirewallStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FirewallSettings getSettings() {
    return settings;
  }

  @BetaApi
  public FirewallStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified firewall.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   FirewallName firewall = FirewallName.create("[PROJECT]", "[FIREWALL]");
   *   Operation response = firewallClient.deleteFirewall(firewall);
   * }
   * </code></pre>
   *
   * @param firewall Name of the firewall rule to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteFirewall(FirewallName firewall) {

    DeleteFirewallHttpRequest request =
        DeleteFirewallHttpRequest.newBuilder()
        .setFirewallWithFirewallName(firewall)
        .build();
    return deleteFirewall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified firewall.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   DeleteFirewallHttpRequest request = DeleteFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   Operation response = firewallClient.deleteFirewall(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteFirewall(DeleteFirewallHttpRequest request) {
    return deleteFirewallCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified firewall.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   DeleteFirewallHttpRequest request = DeleteFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = firewallClient.deleteFirewallCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteFirewallHttpRequest, Operation> deleteFirewallCallable() {
    return stub.deleteFirewallCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified firewall.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   FirewallName firewall = FirewallName.create("[PROJECT]", "[FIREWALL]");
   *   Firewall response = firewallClient.getFirewall(firewall);
   * }
   * </code></pre>
   *
   * @param firewall Name of the firewall rule to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Firewall getFirewall(FirewallName firewall) {

    GetFirewallHttpRequest request =
        GetFirewallHttpRequest.newBuilder()
        .setFirewallWithFirewallName(firewall)
        .build();
    return getFirewall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified firewall.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   GetFirewallHttpRequest request = GetFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   Firewall response = firewallClient.getFirewall(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Firewall getFirewall(GetFirewallHttpRequest request) {
    return getFirewallCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified firewall.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   GetFirewallHttpRequest request = GetFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   ApiFuture&lt;Firewall&gt; future = firewallClient.getFirewallCallable().futureCall(request);
   *   // Do something
   *   Firewall response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetFirewallHttpRequest, Firewall> getFirewallCallable() {
    return stub.getFirewallCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a firewall rule in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   Firewall firewall = Firewall.newBuilder().build();
   *   Operation response = firewallClient.insertFirewall(project, firewall);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param firewallResource Represents a Firewall resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertFirewall(ProjectName project, Firewall firewallResource) {

    InsertFirewallHttpRequest request =
        InsertFirewallHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setFirewallResource(firewallResource)
        .build();
    return insertFirewall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a firewall rule in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedProject = FirewallClient.formatProjectName("[PROJECT]");
   *   Firewall firewall = Firewall.newBuilder().build();
   *   InsertFirewallHttpRequest request = InsertFirewallHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setFirewall(firewall)
   *     .build();
   *   Operation response = firewallClient.insertFirewall(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertFirewall(InsertFirewallHttpRequest request) {
    return insertFirewallCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a firewall rule in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedProject = FirewallClient.formatProjectName("[PROJECT]");
   *   Firewall firewall = Firewall.newBuilder().build();
   *   InsertFirewallHttpRequest request = InsertFirewallHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setFirewall(firewall)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = firewallClient.insertFirewallCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertFirewallHttpRequest, Operation> insertFirewallCallable() {
    return stub.insertFirewallCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of firewall rules available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (Firewall element : firewallClient.listFirewalls(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListFirewallsPagedResponse listFirewalls(ProjectName project) {
    ListFirewallsHttpRequest request =
        ListFirewallsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listFirewalls(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of firewall rules available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedProject = FirewallClient.formatProjectName("[PROJECT]");
   *   ListFirewallsHttpRequest request = ListFirewallsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (Firewall element : firewallClient.listFirewalls(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListFirewallsPagedResponse listFirewalls(ListFirewallsHttpRequest request) {
    return listFirewallsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of firewall rules available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedProject = FirewallClient.formatProjectName("[PROJECT]");
   *   ListFirewallsHttpRequest request = ListFirewallsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListFirewallsPagedResponse&gt; future = firewallClient.listFirewallsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Firewall element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListFirewallsHttpRequest, ListFirewallsPagedResponse> listFirewallsPagedCallable() {
    return stub.listFirewallsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of firewall rules available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedProject = FirewallClient.formatProjectName("[PROJECT]");
   *   ListFirewallsHttpRequest request = ListFirewallsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     FirewallList response = firewallClient.listFirewallsCallable().call(request);
   *     for (Firewall element : response.getItems()) {
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
  public final UnaryCallable<ListFirewallsHttpRequest, FirewallList> listFirewallsCallable() {
    return stub.listFirewallsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified firewall rule with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   FirewallName firewall = FirewallName.create("[PROJECT]", "[FIREWALL]");
   *   Operation response = firewallClient.patchFirewall(firewall);
   * }
   * </code></pre>
   *
   * @param firewall Name of the firewall rule to update.
   * @param firewallResource Represents a Firewall resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchFirewall(FirewallName firewall, Firewall firewallResource) {

    PatchFirewallHttpRequest request =
        PatchFirewallHttpRequest.newBuilder()
        .setFirewallWithFirewallName(firewall)
        .setFirewallResource(firewallResource)
        .build();
    return patchFirewall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified firewall rule with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   PatchFirewallHttpRequest request = PatchFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   Operation response = firewallClient.patchFirewall(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchFirewall(PatchFirewallHttpRequest request) {
    return patchFirewallCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified firewall rule with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   PatchFirewallHttpRequest request = PatchFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = firewallClient.patchFirewallCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchFirewallHttpRequest, Operation> patchFirewallCallable() {
    return stub.patchFirewallCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified firewall rule with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   FirewallName firewall = FirewallName.create("[PROJECT]", "[FIREWALL]");
   *   Operation response = firewallClient.updateFirewall(firewall);
   * }
   * </code></pre>
   *
   * @param firewall Name of the firewall rule to update.
   * @param firewallResource Represents a Firewall resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateFirewall(FirewallName firewall, Firewall firewallResource) {

    UpdateFirewallHttpRequest request =
        UpdateFirewallHttpRequest.newBuilder()
        .setFirewallWithFirewallName(firewall)
        .setFirewallResource(firewallResource)
        .build();
    return updateFirewall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified firewall rule with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   UpdateFirewallHttpRequest request = UpdateFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   Operation response = firewallClient.updateFirewall(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateFirewall(UpdateFirewallHttpRequest request) {
    return updateFirewallCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified firewall rule with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (FirewallClient firewallClient = FirewallClient.create()) {
   *   String formattedFirewall = FirewallClient.formatFirewallName("[PROJECT]", "[FIREWALL]");
   *   UpdateFirewallHttpRequest request = UpdateFirewallHttpRequest.newBuilder()
   *     .setFirewall(formattedFirewall)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = firewallClient.updateFirewallCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateFirewallHttpRequest, Operation> updateFirewallCallable() {
    return stub.updateFirewallCallable();
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