/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.TargetSslProxyStub;
import com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings;
import java.io.IOException;
import java.util.List;
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
 * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
 *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
 *   TargetSslProxy response = targetSslProxyClient.getTargetSslProxy(targetSslProxy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetSslProxyClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of TargetSslProxySettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * TargetSslProxySettings targetSslProxySettings =
 *     TargetSslProxySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetSslProxyClient targetSslProxyClient =
 *     TargetSslProxyClient.create(targetSslProxySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetSslProxySettings targetSslProxySettings =
 *     TargetSslProxySettings.newBuilder().setEndpoint(myEndpoint).build();
 * TargetSslProxyClient targetSslProxyClient =
 *     TargetSslProxyClient.create(targetSslProxySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetSslProxyClient implements BackgroundResource {
  private final TargetSslProxySettings settings;
  private final TargetSslProxyStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of TargetSslProxyClient with default settings. */
  public static final TargetSslProxyClient create() throws IOException {
    return create(TargetSslProxySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetSslProxyClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final TargetSslProxyClient create(TargetSslProxySettings settings)
      throws IOException {
    return new TargetSslProxyClient(settings);
  }

  /**
   * Constructs an instance of TargetSslProxyClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use TargetSslProxySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final TargetSslProxyClient create(TargetSslProxyStub stub) {
    return new TargetSslProxyClient(stub);
  }

  /**
   * Constructs an instance of TargetSslProxyClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected TargetSslProxyClient(TargetSslProxySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((TargetSslProxyStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected TargetSslProxyClient(TargetSslProxyStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final TargetSslProxySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetSslProxyStub getStub() {
    return stub;
  }

  /**
   * Returns the GlobalOperationClient that can be used to query the status of a long-running
   * operation returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final GlobalOperationClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   targetSslProxyClient.deleteTargetSslProxyAsync(targetSslProxy).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> deleteTargetSslProxyAsync(
      ProjectGlobalTargetSslProxyName targetSslProxy) {

    DeleteTargetSslProxyHttpRequest request =
        DeleteTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy == null ? null : targetSslProxy.toString())
            .build();
    return deleteTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   targetSslProxyClient.deleteTargetSslProxyAsync(targetSslProxy.toString()).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> deleteTargetSslProxyAsync(
      String targetSslProxy) {

    DeleteTargetSslProxyHttpRequest request =
        DeleteTargetSslProxyHttpRequest.newBuilder().setTargetSslProxy(targetSslProxy).build();
    return deleteTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   DeleteTargetSslProxyHttpRequest request = DeleteTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .build();
   *   targetSslProxyClient.deleteTargetSslProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> deleteTargetSslProxyAsync(
      DeleteTargetSslProxyHttpRequest request) {
    return deleteTargetSslProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   DeleteTargetSslProxyHttpRequest request = DeleteTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetSslProxyClient.deleteTargetSslProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteTargetSslProxyHttpRequest, EmptyMessage, Operation>
      deleteTargetSslProxyOperationCallable() {
    return stub.deleteTargetSslProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   DeleteTargetSslProxyHttpRequest request = DeleteTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyClient.deleteTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation>
      deleteTargetSslProxyCallable() {
    return stub.deleteTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxy response = targetSslProxyClient.getTargetSslProxy(targetSslProxy);
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetSslProxy getTargetSslProxy(ProjectGlobalTargetSslProxyName targetSslProxy) {

    GetTargetSslProxyHttpRequest request =
        GetTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy == null ? null : targetSslProxy.toString())
            .build();
    return getTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxy response = targetSslProxyClient.getTargetSslProxy(targetSslProxy.toString());
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetSslProxy getTargetSslProxy(String targetSslProxy) {

    GetTargetSslProxyHttpRequest request =
        GetTargetSslProxyHttpRequest.newBuilder().setTargetSslProxy(targetSslProxy).build();
    return getTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   GetTargetSslProxyHttpRequest request = GetTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .build();
   *   TargetSslProxy response = targetSslProxyClient.getTargetSslProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetSslProxy getTargetSslProxy(GetTargetSslProxyHttpRequest request) {
    return getTargetSslProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   GetTargetSslProxyHttpRequest request = GetTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .build();
   *   ApiFuture&lt;TargetSslProxy&gt; future = targetSslProxyClient.getTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   TargetSslProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy>
      getTargetSslProxyCallable() {
    return stub.getTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
   *   targetSslProxyClient.insertTargetSslProxyAsync(project, targetSslProxyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetSslProxyResource A TargetSslProxy resource. This resource defines an SSL proxy.
   *     (== resource_for beta.targetSslProxies ==) (== resource_for v1.targetSslProxies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> insertTargetSslProxyAsync(
      ProjectName project, TargetSslProxy targetSslProxyResource) {

    InsertTargetSslProxyHttpRequest request =
        InsertTargetSslProxyHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setTargetSslProxyResource(targetSslProxyResource)
            .build();
    return insertTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
   *   targetSslProxyClient.insertTargetSslProxyAsync(project.toString(), targetSslProxyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetSslProxyResource A TargetSslProxy resource. This resource defines an SSL proxy.
   *     (== resource_for beta.targetSslProxies ==) (== resource_for v1.targetSslProxies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> insertTargetSslProxyAsync(
      String project, TargetSslProxy targetSslProxyResource) {

    InsertTargetSslProxyHttpRequest request =
        InsertTargetSslProxyHttpRequest.newBuilder()
            .setProject(project)
            .setTargetSslProxyResource(targetSslProxyResource)
            .build();
    return insertTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
   *   InsertTargetSslProxyHttpRequest request = InsertTargetSslProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetSslProxyResource(targetSslProxyResource)
   *     .build();
   *   targetSslProxyClient.insertTargetSslProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> insertTargetSslProxyAsync(
      InsertTargetSslProxyHttpRequest request) {
    return insertTargetSslProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
   *   InsertTargetSslProxyHttpRequest request = InsertTargetSslProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetSslProxyResource(targetSslProxyResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetSslProxyClient.insertTargetSslProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertTargetSslProxyHttpRequest, EmptyMessage, Operation>
      insertTargetSslProxyOperationCallable() {
    return stub.insertTargetSslProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetSslProxy targetSslProxyResource = TargetSslProxy.newBuilder().build();
   *   InsertTargetSslProxyHttpRequest request = InsertTargetSslProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetSslProxyResource(targetSslProxyResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyClient.insertTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetSslProxyHttpRequest, Operation>
      insertTargetSslProxyCallable() {
    return stub.insertTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetSslProxy element : targetSslProxyClient.listTargetSslProxies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetSslProxiesPagedResponse listTargetSslProxies(ProjectName project) {
    ListTargetSslProxiesHttpRequest request =
        ListTargetSslProxiesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listTargetSslProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetSslProxy element : targetSslProxyClient.listTargetSslProxies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetSslProxiesPagedResponse listTargetSslProxies(String project) {
    ListTargetSslProxiesHttpRequest request =
        ListTargetSslProxiesHttpRequest.newBuilder().setProject(project).build();
    return listTargetSslProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetSslProxiesHttpRequest request = ListTargetSslProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (TargetSslProxy element : targetSslProxyClient.listTargetSslProxies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetSslProxiesPagedResponse listTargetSslProxies(
      ListTargetSslProxiesHttpRequest request) {
    return listTargetSslProxiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetSslProxiesHttpRequest request = ListTargetSslProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListTargetSslProxiesPagedResponse&gt; future = targetSslProxyClient.listTargetSslProxiesPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetSslProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse>
      listTargetSslProxiesPagedCallable() {
    return stub.listTargetSslProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetSslProxiesHttpRequest request = ListTargetSslProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     TargetSslProxyList response = targetSslProxyClient.listTargetSslProxiesCallable().call(request);
   *     for (TargetSslProxy element : response.getItemsList()) {
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
  public final UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList>
      listTargetSslProxiesCallable() {
    return stub.listTargetSslProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
   *   targetSslProxyClient.setBackendServiceTargetSslProxyAsync(targetSslProxy, targetSslProxiesSetBackendServiceRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose BackendService resource is to
   *     be set.
   * @param targetSslProxiesSetBackendServiceRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setBackendServiceTargetSslProxyAsync(
      ProjectGlobalTargetSslProxyName targetSslProxy,
      TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource) {

    SetBackendServiceTargetSslProxyHttpRequest request =
        SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy == null ? null : targetSslProxy.toString())
            .setTargetSslProxiesSetBackendServiceRequestResource(
                targetSslProxiesSetBackendServiceRequestResource)
            .build();
    return setBackendServiceTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
   *   targetSslProxyClient.setBackendServiceTargetSslProxyAsync(targetSslProxy.toString(), targetSslProxiesSetBackendServiceRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose BackendService resource is to
   *     be set.
   * @param targetSslProxiesSetBackendServiceRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setBackendServiceTargetSslProxyAsync(
      String targetSslProxy,
      TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource) {

    SetBackendServiceTargetSslProxyHttpRequest request =
        SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy)
            .setTargetSslProxiesSetBackendServiceRequestResource(
                targetSslProxiesSetBackendServiceRequestResource)
            .build();
    return setBackendServiceTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
   *   SetBackendServiceTargetSslProxyHttpRequest request = SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetBackendServiceRequestResource(targetSslProxiesSetBackendServiceRequestResource)
   *     .build();
   *   targetSslProxyClient.setBackendServiceTargetSslProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setBackendServiceTargetSslProxyAsync(
      SetBackendServiceTargetSslProxyHttpRequest request) {
    return setBackendServiceTargetSslProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
   *   SetBackendServiceTargetSslProxyHttpRequest request = SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetBackendServiceRequestResource(targetSslProxiesSetBackendServiceRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetSslProxyClient.setBackendServiceTargetSslProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetBackendServiceTargetSslProxyHttpRequest, EmptyMessage, Operation>
      setBackendServiceTargetSslProxyOperationCallable() {
    return stub.setBackendServiceTargetSslProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequestResource = TargetSslProxiesSetBackendServiceRequest.newBuilder().build();
   *   SetBackendServiceTargetSslProxyHttpRequest request = SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetBackendServiceRequestResource(targetSslProxiesSetBackendServiceRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyClient.setBackendServiceTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation>
      setBackendServiceTargetSslProxyCallable() {
    return stub.setBackendServiceTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
   *   targetSslProxyClient.setProxyHeaderTargetSslProxyAsync(targetSslProxy, targetSslProxiesSetProxyHeaderRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose ProxyHeader is to be set.
   * @param targetSslProxiesSetProxyHeaderRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setProxyHeaderTargetSslProxyAsync(
      ProjectGlobalTargetSslProxyName targetSslProxy,
      TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource) {

    SetProxyHeaderTargetSslProxyHttpRequest request =
        SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy == null ? null : targetSslProxy.toString())
            .setTargetSslProxiesSetProxyHeaderRequestResource(
                targetSslProxiesSetProxyHeaderRequestResource)
            .build();
    return setProxyHeaderTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
   *   targetSslProxyClient.setProxyHeaderTargetSslProxyAsync(targetSslProxy.toString(), targetSslProxiesSetProxyHeaderRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose ProxyHeader is to be set.
   * @param targetSslProxiesSetProxyHeaderRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setProxyHeaderTargetSslProxyAsync(
      String targetSslProxy,
      TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource) {

    SetProxyHeaderTargetSslProxyHttpRequest request =
        SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy)
            .setTargetSslProxiesSetProxyHeaderRequestResource(
                targetSslProxiesSetProxyHeaderRequestResource)
            .build();
    return setProxyHeaderTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
   *   SetProxyHeaderTargetSslProxyHttpRequest request = SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetProxyHeaderRequestResource(targetSslProxiesSetProxyHeaderRequestResource)
   *     .build();
   *   targetSslProxyClient.setProxyHeaderTargetSslProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setProxyHeaderTargetSslProxyAsync(
      SetProxyHeaderTargetSslProxyHttpRequest request) {
    return setProxyHeaderTargetSslProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
   *   SetProxyHeaderTargetSslProxyHttpRequest request = SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetProxyHeaderRequestResource(targetSslProxiesSetProxyHeaderRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetSslProxyClient.setProxyHeaderTargetSslProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetProxyHeaderTargetSslProxyHttpRequest, EmptyMessage, Operation>
      setProxyHeaderTargetSslProxyOperationCallable() {
    return stub.setProxyHeaderTargetSslProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequestResource = TargetSslProxiesSetProxyHeaderRequest.newBuilder().build();
   *   SetProxyHeaderTargetSslProxyHttpRequest request = SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetProxyHeaderRequestResource(targetSslProxiesSetProxyHeaderRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyClient.setProxyHeaderTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation>
      setProxyHeaderTargetSslProxyCallable() {
    return stub.setProxyHeaderTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
   *   targetSslProxyClient.setSslCertificatesTargetSslProxyAsync(targetSslProxy, targetSslProxiesSetSslCertificatesRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose SslCertificate resource is to
   *     be set.
   * @param targetSslProxiesSetSslCertificatesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslCertificatesTargetSslProxyAsync(
      ProjectGlobalTargetSslProxyName targetSslProxy,
      TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource) {

    SetSslCertificatesTargetSslProxyHttpRequest request =
        SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy == null ? null : targetSslProxy.toString())
            .setTargetSslProxiesSetSslCertificatesRequestResource(
                targetSslProxiesSetSslCertificatesRequestResource)
            .build();
    return setSslCertificatesTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
   *   targetSslProxyClient.setSslCertificatesTargetSslProxyAsync(targetSslProxy.toString(), targetSslProxiesSetSslCertificatesRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose SslCertificate resource is to
   *     be set.
   * @param targetSslProxiesSetSslCertificatesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslCertificatesTargetSslProxyAsync(
      String targetSslProxy,
      TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource) {

    SetSslCertificatesTargetSslProxyHttpRequest request =
        SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy)
            .setTargetSslProxiesSetSslCertificatesRequestResource(
                targetSslProxiesSetSslCertificatesRequestResource)
            .build();
    return setSslCertificatesTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetSslProxyHttpRequest request = SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetSslCertificatesRequestResource(targetSslProxiesSetSslCertificatesRequestResource)
   *     .build();
   *   targetSslProxyClient.setSslCertificatesTargetSslProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslCertificatesTargetSslProxyAsync(
      SetSslCertificatesTargetSslProxyHttpRequest request) {
    return setSslCertificatesTargetSslProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetSslProxyHttpRequest request = SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetSslCertificatesRequestResource(targetSslProxiesSetSslCertificatesRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetSslProxyClient.setSslCertificatesTargetSslProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetSslCertificatesTargetSslProxyHttpRequest, EmptyMessage, Operation>
      setSslCertificatesTargetSslProxyOperationCallable() {
    return stub.setSslCertificatesTargetSslProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequestResource = TargetSslProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetSslProxyHttpRequest request = SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setTargetSslProxiesSetSslCertificatesRequestResource(targetSslProxiesSetSslCertificatesRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyClient.setSslCertificatesTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation>
      setSslCertificatesTargetSslProxyCallable() {
    return stub.setSslCertificatesTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   * not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   targetSslProxyClient.setSslPolicyTargetSslProxyAsync(targetSslProxy, sslPolicyReferenceResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose SSL policy is to be set. The
   *     name must be 1-63 characters long, and comply with RFC1035.
   * @param sslPolicyReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslPolicyTargetSslProxyAsync(
      ProjectGlobalTargetSslProxyName targetSslProxy,
      SslPolicyReference sslPolicyReferenceResource) {

    SetSslPolicyTargetSslProxyHttpRequest request =
        SetSslPolicyTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy == null ? null : targetSslProxy.toString())
            .setSslPolicyReferenceResource(sslPolicyReferenceResource)
            .build();
    return setSslPolicyTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   * not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   targetSslProxyClient.setSslPolicyTargetSslProxyAsync(targetSslProxy.toString(), sslPolicyReferenceResource).get();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose SSL policy is to be set. The
   *     name must be 1-63 characters long, and comply with RFC1035.
   * @param sslPolicyReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslPolicyTargetSslProxyAsync(
      String targetSslProxy, SslPolicyReference sslPolicyReferenceResource) {

    SetSslPolicyTargetSslProxyHttpRequest request =
        SetSslPolicyTargetSslProxyHttpRequest.newBuilder()
            .setTargetSslProxy(targetSslProxy)
            .setSslPolicyReferenceResource(sslPolicyReferenceResource)
            .build();
    return setSslPolicyTargetSslProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   * not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   SetSslPolicyTargetSslProxyHttpRequest request = SetSslPolicyTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setSslPolicyReferenceResource(sslPolicyReferenceResource)
   *     .build();
   *   targetSslProxyClient.setSslPolicyTargetSslProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslPolicyTargetSslProxyAsync(
      SetSslPolicyTargetSslProxyHttpRequest request) {
    return setSslPolicyTargetSslProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   * not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   SetSslPolicyTargetSslProxyHttpRequest request = SetSslPolicyTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setSslPolicyReferenceResource(sslPolicyReferenceResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetSslProxyClient.setSslPolicyTargetSslProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetSslPolicyTargetSslProxyHttpRequest, EmptyMessage, Operation>
      setSslPolicyTargetSslProxyOperationCallable() {
    return stub.setSslPolicyTargetSslProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the SSL proxy load balancer. They do
   * not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
   *   ProjectGlobalTargetSslProxyName targetSslProxy = ProjectGlobalTargetSslProxyName.of("[PROJECT]", "[TARGET_SSL_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   SetSslPolicyTargetSslProxyHttpRequest request = SetSslPolicyTargetSslProxyHttpRequest.newBuilder()
   *     .setTargetSslProxy(targetSslProxy.toString())
   *     .setSslPolicyReferenceResource(sslPolicyReferenceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyClient.setSslPolicyTargetSslProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSslPolicyTargetSslProxyHttpRequest, Operation>
      setSslPolicyTargetSslProxyCallable() {
    return stub.setSslPolicyTargetSslProxyCallable();
  }

  @Override
  public final void close() {
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

  public static class ListTargetSslProxiesPagedResponse
      extends AbstractPagedListResponse<
          ListTargetSslProxiesHttpRequest,
          TargetSslProxyList,
          TargetSslProxy,
          ListTargetSslProxiesPage,
          ListTargetSslProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetSslProxiesPagedResponse> createAsync(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        ApiFuture<TargetSslProxyList> futureResponse) {
      ApiFuture<ListTargetSslProxiesPage> futurePage =
          ListTargetSslProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetSslProxiesPage, ListTargetSslProxiesPagedResponse>() {
            @Override
            public ListTargetSslProxiesPagedResponse apply(ListTargetSslProxiesPage input) {
              return new ListTargetSslProxiesPagedResponse(input);
            }
          });
    }

    private ListTargetSslProxiesPagedResponse(ListTargetSslProxiesPage page) {
      super(page, ListTargetSslProxiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTargetSslProxiesPage
      extends AbstractPage<
          ListTargetSslProxiesHttpRequest,
          TargetSslProxyList,
          TargetSslProxy,
          ListTargetSslProxiesPage> {

    private ListTargetSslProxiesPage(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        TargetSslProxyList response) {
      super(context, response);
    }

    private static ListTargetSslProxiesPage createEmptyPage() {
      return new ListTargetSslProxiesPage(null, null);
    }

    @Override
    protected ListTargetSslProxiesPage createPage(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        TargetSslProxyList response) {
      return new ListTargetSslProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetSslProxiesPage> createPageAsync(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        ApiFuture<TargetSslProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTargetSslProxiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTargetSslProxiesHttpRequest,
          TargetSslProxyList,
          TargetSslProxy,
          ListTargetSslProxiesPage,
          ListTargetSslProxiesFixedSizeCollection> {

    private ListTargetSslProxiesFixedSizeCollection(
        List<ListTargetSslProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetSslProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetSslProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetSslProxiesFixedSizeCollection createCollection(
        List<ListTargetSslProxiesPage> pages, int collectionSize) {
      return new ListTargetSslProxiesFixedSizeCollection(pages, collectionSize);
    }
  }
}
