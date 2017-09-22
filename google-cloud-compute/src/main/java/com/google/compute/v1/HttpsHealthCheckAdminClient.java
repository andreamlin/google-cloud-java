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
import static com.google.compute.v1.PagedResponseWrappers.ListHttpsHealthChecksPagedResponse;
import com.google.compute.v1.stub.HttpsHealthCheckAdminStub;
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
 * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
 *
 *   Operation response = httpsHealthCheckAdminClient.deleteHttpsHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the httpsHealthCheckAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of HttpsHealthCheckAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * HttpsHealthCheckAdminSettings httpsHealthCheckAdminSettings =
 *     HttpsHealthCheckAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * HttpsHealthCheckAdminClient httpsHealthCheckAdminClient =
 *     HttpsHealthCheckAdminClient.create(httpsHealthCheckAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * HttpsHealthCheckAdminSettings httpsHealthCheckAdminSettings =
 *     HttpsHealthCheckAdminSettings.defaultBuilder()
 *         .setTransportProvider(HttpsHealthCheckAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(HttpsHealthCheckAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * HttpsHealthCheckAdminClient httpsHealthCheckAdminClient =
 *     HttpsHealthCheckAdminClient.create(httpsHealthCheckAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HttpsHealthCheckAdminClient implements BackgroundResource {
  private final HttpsHealthCheckAdminSettings settings;
  private final HttpsHealthCheckAdminStub stub;



  /**
   * Constructs an instance of HttpsHealthCheckAdminClient with default settings.
   */
  public static final HttpsHealthCheckAdminClient create() throws IOException {
    return create(HttpsHealthCheckAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of HttpsHealthCheckAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final HttpsHealthCheckAdminClient create(HttpsHealthCheckAdminSettings settings) throws IOException {
    return new HttpsHealthCheckAdminClient(settings);
  }

  /**
   * Constructs an instance of HttpsHealthCheckAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use HttpsHealthCheckAdminSettings}.
   */
  public static final HttpsHealthCheckAdminClient create(HttpsHealthCheckAdminStub stub) {
    return new HttpsHealthCheckAdminClient(stub);
  }

  /**
   * Constructs an instance of HttpsHealthCheckAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpsHealthCheckAdminClient(HttpsHealthCheckAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected HttpsHealthCheckAdminClient(HttpsHealthCheckAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final HttpsHealthCheckAdminSettings getSettings() {
    return settings;
  }

  public HttpsHealthCheckAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HttpsHealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.deleteHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param httpsHealthCheck Name of the HttpsHealthCheck resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHttpsHealthCheck(HttpsHealthCheckName httpsHealthCheck) {

    DeleteHttpsHealthCheckHttpRequest request =
        DeleteHttpsHealthCheckHttpRequest.newBuilder()
        .setHttpsHealthCheckWithHttpsHealthCheckName(httpsHealthCheck)
        .build();
    return deleteHttpsHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HttpsHealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.deleteHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHttpsHealthCheck(DeleteHttpsHealthCheckHttpRequest request) {
    return deleteHttpsHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HttpsHealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = httpsHealthCheckAdminClient.deleteHttpsHealthCheckCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckCallable() {
    return stub.deleteHttpsHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   HttpsHealthCheck response = httpsHealthCheckAdminClient.getHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param httpsHealthCheck Name of the HttpsHealthCheck resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HttpsHealthCheck getHttpsHealthCheck(HttpsHealthCheckName httpsHealthCheck) {

    GetHttpsHealthCheckHttpRequest request =
        GetHttpsHealthCheckHttpRequest.newBuilder()
        .setHttpsHealthCheckWithHttpsHealthCheckName(httpsHealthCheck)
        .build();
    return getHttpsHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   HttpsHealthCheck response = httpsHealthCheckAdminClient.getHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HttpsHealthCheck getHttpsHealthCheck(GetHttpsHealthCheckHttpRequest request) {
    return getHttpsHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   ApiFuture&lt;HttpsHealthCheck&gt; future = httpsHealthCheckAdminClient.getHttpsHealthCheckCallable().futureCall();
   *   // Do something
   *   HttpsHealthCheck response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckCallable() {
    return stub.getHttpsHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HttpsHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.insertHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param httpsHealthCheck An HttpsHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTPS.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHttpsHealthCheck(HttpsHealthChecksProjectName project, HttpsHealthCheck httpsHealthCheck) {

    InsertHttpsHealthCheckHttpRequest request =
        InsertHttpsHealthCheckHttpRequest.newBuilder()
        .setProjectWithHttpsHealthChecksProjectName(project)
        .setHttpsHealthCheck(httpsHealthCheck)
        .build();
    return insertHttpsHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HttpsHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.insertHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHttpsHealthCheck(InsertHttpsHealthCheckHttpRequest request) {
    return insertHttpsHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HttpsHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = httpsHealthCheckAdminClient.insertHttpsHealthCheckCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckCallable() {
    return stub.insertHttpsHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpsHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   for (HttpsHealthCheck element : httpsHealthCheckAdminClient.listHttpsHealthChecks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHttpsHealthChecksPagedResponse listHttpsHealthChecks(HttpsHealthChecksProjectName project) {
    ListHttpsHealthChecksHttpRequest request =
        ListHttpsHealthChecksHttpRequest.newBuilder()
        .setProjectWithHttpsHealthChecksProjectName(project)
        .build();
    return listHttpsHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpsHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   for (HttpsHealthCheck element : httpsHealthCheckAdminClient.listHttpsHealthChecks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHttpsHealthChecksPagedResponse listHttpsHealthChecks(ListHttpsHealthChecksHttpRequest request) {
    return listHttpsHealthChecksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpsHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   ApiFuture&lt;ListHttpsHealthChecksPagedResponse&gt; future = httpsHealthCheckAdminClient.listHttpsHealthChecksPagedCallable().futureCall();
   *   // Do something
   *   for (HttpsHealthCheck element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListHttpsHealthChecksHttpRequest, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksPagedCallable() {
    return stub.listHttpsHealthChecksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpsHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   while (true) {
   *     HttpsHealthCheckList response = httpsHealthCheckAdminClient.listHttpsHealthChecksCallable().call();
   *     for (HttpsHealthCheck element : response.getItems()) {
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
  public final UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> listHttpsHealthChecksCallable() {
    return stub.listHttpsHealthChecksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.patchHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param httpsHealthCheck Name of the HttpsHealthCheck resource to update.
   * @param httpsHealthCheck An HttpsHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTPS.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHttpsHealthCheck(HttpsHealthCheckName httpsHealthCheck, HttpsHealthCheck httpsHealthCheck) {

    PatchHttpsHealthCheckHttpRequest request =
        PatchHttpsHealthCheckHttpRequest.newBuilder()
        .setHttpsHealthCheckWithHttpsHealthCheckName(httpsHealthCheck)
        .setHttpsHealthCheck(httpsHealthCheck)
        .build();
    return patchHttpsHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.patchHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHttpsHealthCheck(PatchHttpsHealthCheckHttpRequest request) {
    return patchHttpsHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = httpsHealthCheckAdminClient.patchHttpsHealthCheckCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckCallable() {
    return stub.patchHttpsHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpsHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.updateHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param httpsHealthCheck Name of the HttpsHealthCheck resource to update.
   * @param httpsHealthCheck An HttpsHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTPS.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHttpsHealthCheck(HttpsHealthCheckName httpsHealthCheck, HttpsHealthCheck httpsHealthCheck) {

    UpdateHttpsHealthCheckHttpRequest request =
        UpdateHttpsHealthCheckHttpRequest.newBuilder()
        .setHttpsHealthCheckWithHttpsHealthCheckName(httpsHealthCheck)
        .setHttpsHealthCheck(httpsHealthCheck)
        .build();
    return updateHttpsHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpsHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   Operation response = httpsHealthCheckAdminClient.updateHttpsHealthCheck();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHttpsHealthCheck(UpdateHttpsHealthCheckHttpRequest request) {
    return updateHttpsHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpsHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = httpsHealthCheckAdminClient.updateHttpsHealthCheckCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckCallable() {
    return stub.updateHttpsHealthCheckCallable();
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