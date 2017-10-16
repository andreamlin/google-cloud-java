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
import static com.google.compute.v1.PagedResponseWrappers.ListHealthChecksPagedResponse;
import com.google.compute.v1.stub.HealthCheckStub;
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
 * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
 *   HealthCheckName healthCheck = HealthCheckName.create("[PROJECT]", "[HEALTH_CHECK]");
 *   Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the healthCheckClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of HealthCheckSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * HealthCheckSettings healthCheckSettings =
 *     HealthCheckSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * HealthCheckClient healthCheckClient =
 *     HealthCheckClient.create(healthCheckSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * HealthCheckSettings healthCheckSettings =
 *     HealthCheckSettings.newBuilder()
 *         .setTransportProvider(HealthCheckSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(HealthCheckSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * HealthCheckClient healthCheckClient =
 *     HealthCheckClient.create(healthCheckSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HealthCheckClient implements BackgroundResource {
  private final HealthCheckSettings settings;
  private final HealthCheckStub stub;



  /**
   * Constructs an instance of HealthCheckClient with default settings.
   */
  public static final HealthCheckClient create() throws IOException {
    return create(HealthCheckSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of HealthCheckClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final HealthCheckClient create(HealthCheckSettings settings) throws IOException {
    return new HealthCheckClient(settings);
  }

  /**
   * Constructs an instance of HealthCheckClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use HealthCheckSettings}.
   */
  public static final HealthCheckClient create(HealthCheckStub stub) {
    return new HealthCheckClient(stub);
  }

  /**
   * Constructs an instance of HealthCheckClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HealthCheckClient(HealthCheckSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected HealthCheckClient(HealthCheckStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final HealthCheckSettings getSettings() {
    return settings;
  }

  @BetaApi
  public HealthCheckStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   HealthCheckName healthCheck = HealthCheckName.create("[PROJECT]", "[HEALTH_CHECK]");
   *   Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHealthCheck(HealthCheckName healthCheck) {

    DeleteHealthCheckHttpRequest request =
        DeleteHealthCheckHttpRequest.newBuilder()
        .setHealthCheckWithHealthCheckName(healthCheck)
        .build();
    return deleteHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   DeleteHealthCheckHttpRequest request = DeleteHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   Operation response = healthCheckClient.deleteHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHealthCheck(DeleteHealthCheckHttpRequest request) {
    return deleteHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   DeleteHealthCheckHttpRequest request = DeleteHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.deleteHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteHealthCheckHttpRequest, Operation> deleteHealthCheckCallable() {
    return stub.deleteHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   HealthCheckName healthCheck = HealthCheckName.create("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck response = healthCheckClient.getHealthCheck(healthCheck);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HealthCheck getHealthCheck(HealthCheckName healthCheck) {

    GetHealthCheckHttpRequest request =
        GetHealthCheckHttpRequest.newBuilder()
        .setHealthCheckWithHealthCheckName(healthCheck)
        .build();
    return getHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   GetHealthCheckHttpRequest request = GetHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   HealthCheck response = healthCheckClient.getHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HealthCheck getHealthCheck(GetHealthCheckHttpRequest request) {
    return getHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   GetHealthCheckHttpRequest request = GetHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   ApiFuture&lt;HealthCheck&gt; future = healthCheckClient.getHealthCheckCallable().futureCall(request);
   *   // Do something
   *   HealthCheck response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHealthCheckHttpRequest, HealthCheck> getHealthCheckCallable() {
    return stub.getHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   HealthCheck healthCheck = HealthCheck.newBuilder().build();
   *   Operation response = healthCheckClient.insertHealthCheck(project, healthCheck);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param healthCheckResource An HealthCheck resource. This resource defines a template for how individual virtual machines should be checked for health, via one of the supported protocols.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHealthCheck(ProjectName project, HealthCheck healthCheckResource) {

    InsertHealthCheckHttpRequest request =
        InsertHealthCheckHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setHealthCheckResource(healthCheckResource)
        .build();
    return insertHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = HealthCheckClient.formatProjectName("[PROJECT]");
   *   HealthCheck healthCheck = HealthCheck.newBuilder().build();
   *   InsertHealthCheckHttpRequest request = InsertHealthCheckHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setHealthCheck(healthCheck)
   *     .build();
   *   Operation response = healthCheckClient.insertHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHealthCheck(InsertHealthCheckHttpRequest request) {
    return insertHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = HealthCheckClient.formatProjectName("[PROJECT]");
   *   HealthCheck healthCheck = HealthCheck.newBuilder().build();
   *   InsertHealthCheckHttpRequest request = InsertHealthCheckHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setHealthCheck(healthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.insertHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertHealthCheckHttpRequest, Operation> insertHealthCheckCallable() {
    return stub.insertHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (HealthCheck element : healthCheckClient.listHealthChecks(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHealthChecksPagedResponse listHealthChecks(ProjectName project) {
    ListHealthChecksHttpRequest request =
        ListHealthChecksHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = HealthCheckClient.formatProjectName("[PROJECT]");
   *   ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (HealthCheck element : healthCheckClient.listHealthChecks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHealthChecksPagedResponse listHealthChecks(ListHealthChecksHttpRequest request) {
    return listHealthChecksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = HealthCheckClient.formatProjectName("[PROJECT]");
   *   ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListHealthChecksPagedResponse&gt; future = healthCheckClient.listHealthChecksPagedCallable().futureCall(request);
   *   // Do something
   *   for (HealthCheck element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListHealthChecksHttpRequest, ListHealthChecksPagedResponse> listHealthChecksPagedCallable() {
    return stub.listHealthChecksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = HealthCheckClient.formatProjectName("[PROJECT]");
   *   ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     HealthCheckList response = healthCheckClient.listHealthChecksCallable().call(request);
   *     for (HealthCheck element : response.getItems()) {
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
  public final UnaryCallable<ListHealthChecksHttpRequest, HealthCheckList> listHealthChecksCallable() {
    return stub.listHealthChecksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   HealthCheckName healthCheck = HealthCheckName.create("[PROJECT]", "[HEALTH_CHECK]");
   *   Operation response = healthCheckClient.patchHealthCheck(healthCheck);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to update.
   * @param healthCheckResource An HealthCheck resource. This resource defines a template for how individual virtual machines should be checked for health, via one of the supported protocols.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHealthCheck(HealthCheckName healthCheck, HealthCheck healthCheckResource) {

    PatchHealthCheckHttpRequest request =
        PatchHealthCheckHttpRequest.newBuilder()
        .setHealthCheckWithHealthCheckName(healthCheck)
        .setHealthCheckResource(healthCheckResource)
        .build();
    return patchHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   PatchHealthCheckHttpRequest request = PatchHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   Operation response = healthCheckClient.patchHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHealthCheck(PatchHealthCheckHttpRequest request) {
    return patchHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   PatchHealthCheckHttpRequest request = PatchHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.patchHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchHealthCheckHttpRequest, Operation> patchHealthCheckCallable() {
    return stub.patchHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   HealthCheckName healthCheck = HealthCheckName.create("[PROJECT]", "[HEALTH_CHECK]");
   *   Operation response = healthCheckClient.updateHealthCheck(healthCheck);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to update.
   * @param healthCheckResource An HealthCheck resource. This resource defines a template for how individual virtual machines should be checked for health, via one of the supported protocols.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHealthCheck(HealthCheckName healthCheck, HealthCheck healthCheckResource) {

    UpdateHealthCheckHttpRequest request =
        UpdateHealthCheckHttpRequest.newBuilder()
        .setHealthCheckWithHealthCheckName(healthCheck)
        .setHealthCheckResource(healthCheckResource)
        .build();
    return updateHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   UpdateHealthCheckHttpRequest request = UpdateHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   Operation response = healthCheckClient.updateHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHealthCheck(UpdateHealthCheckHttpRequest request) {
    return updateHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = HealthCheckClient.formatHealthCheckName("[PROJECT]", "[HEALTH_CHECK]");
   *   UpdateHealthCheckHttpRequest request = UpdateHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.updateHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateHealthCheckHttpRequest, Operation> updateHealthCheckCallable() {
    return stub.updateHealthCheckCallable();
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