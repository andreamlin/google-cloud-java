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
import static com.google.compute.v1.PagedResponseWrappers.ListHttpHealthChecksPagedResponse;
import com.google.compute.v1.stub.HttpHealthCheckStub;
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
 * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
 *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
 *   Operation response = httpHealthCheckClient.deleteHttpHealthCheck(httpHealthCheck);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the httpHealthCheckClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of HttpHealthCheckSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * HttpHealthCheckSettings httpHealthCheckSettings =
 *     HttpHealthCheckSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * HttpHealthCheckClient httpHealthCheckClient =
 *     HttpHealthCheckClient.create(httpHealthCheckSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * HttpHealthCheckSettings httpHealthCheckSettings =
 *     HttpHealthCheckSettings.newBuilder().setEndpoint(myEndpoint).build();
 * HttpHealthCheckClient httpHealthCheckClient =
 *     HttpHealthCheckClient.create(httpHealthCheckSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HttpHealthCheckClient implements BackgroundResource {
  private final HttpHealthCheckSettings settings;
  private final HttpHealthCheckStub stub;



  /**
   * Constructs an instance of HttpHealthCheckClient with default settings.
   */
  public static final HttpHealthCheckClient create() throws IOException {
    return create(HttpHealthCheckSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of HttpHealthCheckClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final HttpHealthCheckClient create(HttpHealthCheckSettings settings) throws IOException {
    return new HttpHealthCheckClient(settings);
  }

  /**
   * Constructs an instance of HttpHealthCheckClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use HttpHealthCheckSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final HttpHealthCheckClient create(HttpHealthCheckStub stub) {
    return new HttpHealthCheckClient(stub);
  }

  /**
   * Constructs an instance of HttpHealthCheckClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpHealthCheckClient(HttpHealthCheckSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected HttpHealthCheckClient(HttpHealthCheckStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final HttpHealthCheckSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public HttpHealthCheckStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HttpHealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   Operation response = httpHealthCheckClient.deleteHttpHealthCheck(httpHealthCheck);
   * }
   * </code></pre>
   *
   * @param httpHealthCheck Name of the HttpHealthCheck resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHttpHealthCheck(HttpHealthCheckName httpHealthCheck) {

    DeleteHttpHealthCheckHttpRequest request =
        DeleteHttpHealthCheckHttpRequest.newBuilder()
        .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
        .build();
    return deleteHttpHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HttpHealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   DeleteHttpHealthCheckHttpRequest request = DeleteHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   Operation response = httpHealthCheckClient.deleteHttpHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHttpHealthCheck(DeleteHttpHealthCheckHttpRequest request) {
    return deleteHttpHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HttpHealthCheck resource.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   DeleteHttpHealthCheckHttpRequest request = DeleteHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = httpHealthCheckClient.deleteHttpHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckCallable() {
    return stub.deleteHttpHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   HttpHealthCheck response = httpHealthCheckClient.getHttpHealthCheck(httpHealthCheck);
   * }
   * </code></pre>
   *
   * @param httpHealthCheck Name of the HttpHealthCheck resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HttpHealthCheck getHttpHealthCheck(HttpHealthCheckName httpHealthCheck) {

    GetHttpHealthCheckHttpRequest request =
        GetHttpHealthCheckHttpRequest.newBuilder()
        .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
        .build();
    return getHttpHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   GetHttpHealthCheckHttpRequest request = GetHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   HttpHealthCheck response = httpHealthCheckClient.getHttpHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HttpHealthCheck getHttpHealthCheck(GetHttpHealthCheckHttpRequest request) {
    return getHttpHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   GetHttpHealthCheckHttpRequest request = GetHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   ApiFuture&lt;HttpHealthCheck&gt; future = httpHealthCheckClient.getHttpHealthCheckCallable().futureCall(request);
   *   // Do something
   *   HttpHealthCheck response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckCallable() {
    return stub.getHttpHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HttpHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   HttpHealthCheck httpHealthCheck = HttpHealthCheck.newBuilder().build();
   *   Operation response = httpHealthCheckClient.insertHttpHealthCheck(project, httpHealthCheck);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param httpHealthCheckResource An HttpHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTP.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHttpHealthCheck(ProjectName project, HttpHealthCheck httpHealthCheckResource) {

    InsertHttpHealthCheckHttpRequest request =
        InsertHttpHealthCheckHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setHttpHealthCheckResource(httpHealthCheckResource)
        .build();
    return insertHttpHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HttpHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   HttpHealthCheck httpHealthCheck = HttpHealthCheck.newBuilder().build();
   *   InsertHttpHealthCheckHttpRequest request = InsertHttpHealthCheckHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setHttpHealthCheckResource(httpHealthCheck)
   *     .build();
   *   Operation response = httpHealthCheckClient.insertHttpHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHttpHealthCheck(InsertHttpHealthCheckHttpRequest request) {
    return insertHttpHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HttpHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   HttpHealthCheck httpHealthCheck = HttpHealthCheck.newBuilder().build();
   *   InsertHttpHealthCheckHttpRequest request = InsertHttpHealthCheckHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setHttpHealthCheckResource(httpHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = httpHealthCheckClient.insertHttpHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckCallable() {
    return stub.insertHttpHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (HttpHealthCheck element : httpHealthCheckClient.listHttpHealthChecks(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHttpHealthChecksPagedResponse listHttpHealthChecks(ProjectName project) {
    ListHttpHealthChecksHttpRequest request =
        ListHttpHealthChecksHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listHttpHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListHttpHealthChecksHttpRequest request = ListHttpHealthChecksHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (HttpHealthCheck element : httpHealthCheckClient.listHttpHealthChecks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHttpHealthChecksPagedResponse listHttpHealthChecks(ListHttpHealthChecksHttpRequest request) {
    return listHttpHealthChecksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListHttpHealthChecksHttpRequest request = ListHttpHealthChecksHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;ListHttpHealthChecksPagedResponse&gt; future = httpHealthCheckClient.listHttpHealthChecksPagedCallable().futureCall(request);
   *   // Do something
   *   for (HttpHealthCheck element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListHttpHealthChecksHttpRequest, ListHttpHealthChecksPagedResponse> listHttpHealthChecksPagedCallable() {
    return stub.listHttpHealthChecksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HttpHealthCheck resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListHttpHealthChecksHttpRequest request = ListHttpHealthChecksHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     HttpHealthCheckList response = httpHealthCheckClient.listHttpHealthChecksCallable().call(request);
   *     for (HttpHealthCheck element : response.getItems()) {
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
  public final UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> listHttpHealthChecksCallable() {
    return stub.listHttpHealthChecksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   Operation response = httpHealthCheckClient.patchHttpHealthCheck(httpHealthCheck);
   * }
   * </code></pre>
   *
   * @param httpHealthCheck Name of the HttpHealthCheck resource to update.
   * @param httpHealthCheckResource An HttpHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTP.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHttpHealthCheck(HttpHealthCheckName httpHealthCheck, HttpHealthCheck httpHealthCheckResource) {

    PatchHttpHealthCheckHttpRequest request =
        PatchHttpHealthCheckHttpRequest.newBuilder()
        .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
        .setHttpHealthCheckResource(httpHealthCheckResource)
        .build();
    return patchHttpHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   PatchHttpHealthCheckHttpRequest request = PatchHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   Operation response = httpHealthCheckClient.patchHttpHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHttpHealthCheck(PatchHttpHealthCheckHttpRequest request) {
    return patchHttpHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   PatchHttpHealthCheckHttpRequest request = PatchHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = httpHealthCheckClient.patchHttpHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckCallable() {
    return stub.patchHttpHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   Operation response = httpHealthCheckClient.updateHttpHealthCheck(httpHealthCheck);
   * }
   * </code></pre>
   *
   * @param httpHealthCheck Name of the HttpHealthCheck resource to update.
   * @param httpHealthCheckResource An HttpHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTP.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHttpHealthCheck(HttpHealthCheckName httpHealthCheck, HttpHealthCheck httpHealthCheckResource) {

    UpdateHttpHealthCheckHttpRequest request =
        UpdateHttpHealthCheckHttpRequest.newBuilder()
        .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
        .setHttpHealthCheckResource(httpHealthCheckResource)
        .build();
    return updateHttpHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   UpdateHttpHealthCheckHttpRequest request = UpdateHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   Operation response = httpHealthCheckClient.updateHttpHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHttpHealthCheck(UpdateHttpHealthCheckHttpRequest request) {
    return updateHttpHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HttpHealthCheck resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
   *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.of("[PROJECT]", "[HTTP_HEALTH_CHECK]");
   *   UpdateHttpHealthCheckHttpRequest request = UpdateHttpHealthCheckHttpRequest.newBuilder()
   *     .setHttpHealthCheckWithHttpHealthCheckName(httpHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = httpHealthCheckClient.updateHttpHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckCallable() {
    return stub.updateHttpHealthCheckCallable();
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