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
import com.google.cloud.compute.v1.stub.TargetTcpProxyStub;
import com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings;
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
 * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
 *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
 *   TargetTcpProxy response = targetTcpProxyClient.getTargetTcpProxy(targetTcpProxy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetTcpProxyClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetTcpProxySettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * TargetTcpProxySettings targetTcpProxySettings =
 *     TargetTcpProxySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetTcpProxyClient targetTcpProxyClient =
 *     TargetTcpProxyClient.create(targetTcpProxySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetTcpProxySettings targetTcpProxySettings =
 *     TargetTcpProxySettings.newBuilder().setEndpoint(myEndpoint).build();
 * TargetTcpProxyClient targetTcpProxyClient =
 *     TargetTcpProxyClient.create(targetTcpProxySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetTcpProxyClient implements BackgroundResource {
  private final TargetTcpProxySettings settings;
  private final TargetTcpProxyStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of TargetTcpProxyClient with default settings. */
  public static final TargetTcpProxyClient create() throws IOException {
    return create(TargetTcpProxySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetTcpProxyClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final TargetTcpProxyClient create(TargetTcpProxySettings settings)
      throws IOException {
    return new TargetTcpProxyClient(settings);
  }

  /**
   * Constructs an instance of TargetTcpProxyClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use TargetTcpProxySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final TargetTcpProxyClient create(TargetTcpProxyStub stub) {
    return new TargetTcpProxyClient(stub);
  }

  /**
   * Constructs an instance of TargetTcpProxyClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected TargetTcpProxyClient(TargetTcpProxySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((TargetTcpProxyStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected TargetTcpProxyClient(TargetTcpProxyStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final TargetTcpProxySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetTcpProxyStub getStub() {
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
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   targetTcpProxyClient.deleteTargetTcpProxyAsync(targetTcpProxy).get();
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteTargetTcpProxyAsync(
      ProjectGlobalTargetTcpProxyName targetTcpProxy) {

    DeleteTargetTcpProxyHttpRequest request =
        DeleteTargetTcpProxyHttpRequest.newBuilder()
            .setTargetTcpProxy(targetTcpProxy == null ? null : targetTcpProxy.toString())
            .build();
    return deleteTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   targetTcpProxyClient.deleteTargetTcpProxyAsync(targetTcpProxy.toString()).get();
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteTargetTcpProxyAsync(
      String targetTcpProxy) {

    DeleteTargetTcpProxyHttpRequest request =
        DeleteTargetTcpProxyHttpRequest.newBuilder().setTargetTcpProxy(targetTcpProxy).build();
    return deleteTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   DeleteTargetTcpProxyHttpRequest request = DeleteTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .build();
   *   targetTcpProxyClient.deleteTargetTcpProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteTargetTcpProxyAsync(
      DeleteTargetTcpProxyHttpRequest request) {
    return deleteTargetTcpProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   DeleteTargetTcpProxyHttpRequest request = DeleteTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = targetTcpProxyClient.deleteTargetTcpProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetTcpProxyOperationCallable() {
    return stub.deleteTargetTcpProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   DeleteTargetTcpProxyHttpRequest request = DeleteTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetTcpProxyClient.deleteTargetTcpProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetTcpProxyHttpRequest, Operation>
      deleteTargetTcpProxyCallable() {
    return stub.deleteTargetTcpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxy response = targetTcpProxyClient.getTargetTcpProxy(targetTcpProxy);
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetTcpProxy getTargetTcpProxy(ProjectGlobalTargetTcpProxyName targetTcpProxy) {

    GetTargetTcpProxyHttpRequest request =
        GetTargetTcpProxyHttpRequest.newBuilder()
            .setTargetTcpProxy(targetTcpProxy == null ? null : targetTcpProxy.toString())
            .build();
    return getTargetTcpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxy response = targetTcpProxyClient.getTargetTcpProxy(targetTcpProxy.toString());
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetTcpProxy getTargetTcpProxy(String targetTcpProxy) {

    GetTargetTcpProxyHttpRequest request =
        GetTargetTcpProxyHttpRequest.newBuilder().setTargetTcpProxy(targetTcpProxy).build();
    return getTargetTcpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   GetTargetTcpProxyHttpRequest request = GetTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .build();
   *   TargetTcpProxy response = targetTcpProxyClient.getTargetTcpProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetTcpProxy getTargetTcpProxy(GetTargetTcpProxyHttpRequest request) {
    return getTargetTcpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   GetTargetTcpProxyHttpRequest request = GetTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .build();
   *   ApiFuture&lt;TargetTcpProxy&gt; future = targetTcpProxyClient.getTargetTcpProxyCallable().futureCall(request);
   *   // Do something
   *   TargetTcpProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetTcpProxyHttpRequest, TargetTcpProxy>
      getTargetTcpProxyCallable() {
    return stub.getTargetTcpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
   *   targetTcpProxyClient.insertTargetTcpProxyAsync(project, targetTcpProxyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxyResource A TargetTcpProxy resource. This resource defines a TCP proxy. (==
   *     resource_for beta.targetTcpProxies ==) (== resource_for v1.targetTcpProxies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertTargetTcpProxyAsync(
      ProjectName project, TargetTcpProxy targetTcpProxyResource) {

    InsertTargetTcpProxyHttpRequest request =
        InsertTargetTcpProxyHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setTargetTcpProxyResource(targetTcpProxyResource)
            .build();
    return insertTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
   *   targetTcpProxyClient.insertTargetTcpProxyAsync(project.toString(), targetTcpProxyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxyResource A TargetTcpProxy resource. This resource defines a TCP proxy. (==
   *     resource_for beta.targetTcpProxies ==) (== resource_for v1.targetTcpProxies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertTargetTcpProxyAsync(
      String project, TargetTcpProxy targetTcpProxyResource) {

    InsertTargetTcpProxyHttpRequest request =
        InsertTargetTcpProxyHttpRequest.newBuilder()
            .setProject(project)
            .setTargetTcpProxyResource(targetTcpProxyResource)
            .build();
    return insertTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
   *   InsertTargetTcpProxyHttpRequest request = InsertTargetTcpProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetTcpProxyResource(targetTcpProxyResource)
   *     .build();
   *   targetTcpProxyClient.insertTargetTcpProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertTargetTcpProxyAsync(
      InsertTargetTcpProxyHttpRequest request) {
    return insertTargetTcpProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
   *   InsertTargetTcpProxyHttpRequest request = InsertTargetTcpProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetTcpProxyResource(targetTcpProxyResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = targetTcpProxyClient.insertTargetTcpProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetTcpProxyOperationCallable() {
    return stub.insertTargetTcpProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
   *   InsertTargetTcpProxyHttpRequest request = InsertTargetTcpProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetTcpProxyResource(targetTcpProxyResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetTcpProxyClient.insertTargetTcpProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetTcpProxyHttpRequest, Operation>
      insertTargetTcpProxyCallable() {
    return stub.insertTargetTcpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetTcpProxy element : targetTcpProxyClient.listTargetTcpProxies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetTcpProxiesPagedResponse listTargetTcpProxies(ProjectName project) {
    ListTargetTcpProxiesHttpRequest request =
        ListTargetTcpProxiesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listTargetTcpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetTcpProxy element : targetTcpProxyClient.listTargetTcpProxies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetTcpProxiesPagedResponse listTargetTcpProxies(String project) {
    ListTargetTcpProxiesHttpRequest request =
        ListTargetTcpProxiesHttpRequest.newBuilder().setProject(project).build();
    return listTargetTcpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetTcpProxiesHttpRequest request = ListTargetTcpProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (TargetTcpProxy element : targetTcpProxyClient.listTargetTcpProxies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetTcpProxiesPagedResponse listTargetTcpProxies(
      ListTargetTcpProxiesHttpRequest request) {
    return listTargetTcpProxiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetTcpProxiesHttpRequest request = ListTargetTcpProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListTargetTcpProxiesPagedResponse&gt; future = targetTcpProxyClient.listTargetTcpProxiesPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetTcpProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetTcpProxiesHttpRequest, ListTargetTcpProxiesPagedResponse>
      listTargetTcpProxiesPagedCallable() {
    return stub.listTargetTcpProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetTcpProxiesHttpRequest request = ListTargetTcpProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     TargetTcpProxyList response = targetTcpProxyClient.listTargetTcpProxiesCallable().call(request);
   *     for (TargetTcpProxy element : response.getItemsList()) {
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
  public final UnaryCallable<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList>
      listTargetTcpProxiesCallable() {
    return stub.listTargetTcpProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
   *   targetTcpProxyClient.setBackendServiceTargetTcpProxyAsync(targetTcpProxy, targetTcpProxiesSetBackendServiceRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource whose BackendService resource is to
   *     be set.
   * @param targetTcpProxiesSetBackendServiceRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setBackendServiceTargetTcpProxyAsync(
      ProjectGlobalTargetTcpProxyName targetTcpProxy,
      TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource) {

    SetBackendServiceTargetTcpProxyHttpRequest request =
        SetBackendServiceTargetTcpProxyHttpRequest.newBuilder()
            .setTargetTcpProxy(targetTcpProxy == null ? null : targetTcpProxy.toString())
            .setTargetTcpProxiesSetBackendServiceRequestResource(
                targetTcpProxiesSetBackendServiceRequestResource)
            .build();
    return setBackendServiceTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
   *   targetTcpProxyClient.setBackendServiceTargetTcpProxyAsync(targetTcpProxy.toString(), targetTcpProxiesSetBackendServiceRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource whose BackendService resource is to
   *     be set.
   * @param targetTcpProxiesSetBackendServiceRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setBackendServiceTargetTcpProxyAsync(
      String targetTcpProxy,
      TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource) {

    SetBackendServiceTargetTcpProxyHttpRequest request =
        SetBackendServiceTargetTcpProxyHttpRequest.newBuilder()
            .setTargetTcpProxy(targetTcpProxy)
            .setTargetTcpProxiesSetBackendServiceRequestResource(
                targetTcpProxiesSetBackendServiceRequestResource)
            .build();
    return setBackendServiceTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
   *   SetBackendServiceTargetTcpProxyHttpRequest request = SetBackendServiceTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .setTargetTcpProxiesSetBackendServiceRequestResource(targetTcpProxiesSetBackendServiceRequestResource)
   *     .build();
   *   targetTcpProxyClient.setBackendServiceTargetTcpProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setBackendServiceTargetTcpProxyAsync(
      SetBackendServiceTargetTcpProxyHttpRequest request) {
    return setBackendServiceTargetTcpProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
   *   SetBackendServiceTargetTcpProxyHttpRequest request = SetBackendServiceTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .setTargetTcpProxiesSetBackendServiceRequestResource(targetTcpProxiesSetBackendServiceRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = targetTcpProxyClient.setBackendServiceTargetTcpProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetBackendServiceTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      setBackendServiceTargetTcpProxyOperationCallable() {
    return stub.setBackendServiceTargetTcpProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource = TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
   *   SetBackendServiceTargetTcpProxyHttpRequest request = SetBackendServiceTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .setTargetTcpProxiesSetBackendServiceRequestResource(targetTcpProxiesSetBackendServiceRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetTcpProxyClient.setBackendServiceTargetTcpProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetBackendServiceTargetTcpProxyHttpRequest, Operation>
      setBackendServiceTargetTcpProxyCallable() {
    return stub.setBackendServiceTargetTcpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
   *   targetTcpProxyClient.setProxyHeaderTargetTcpProxyAsync(targetTcpProxy, targetTcpProxiesSetProxyHeaderRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource whose ProxyHeader is to be set.
   * @param targetTcpProxiesSetProxyHeaderRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setProxyHeaderTargetTcpProxyAsync(
      ProjectGlobalTargetTcpProxyName targetTcpProxy,
      TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource) {

    SetProxyHeaderTargetTcpProxyHttpRequest request =
        SetProxyHeaderTargetTcpProxyHttpRequest.newBuilder()
            .setTargetTcpProxy(targetTcpProxy == null ? null : targetTcpProxy.toString())
            .setTargetTcpProxiesSetProxyHeaderRequestResource(
                targetTcpProxiesSetProxyHeaderRequestResource)
            .build();
    return setProxyHeaderTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
   *   targetTcpProxyClient.setProxyHeaderTargetTcpProxyAsync(targetTcpProxy.toString(), targetTcpProxiesSetProxyHeaderRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetTcpProxy Name of the TargetTcpProxy resource whose ProxyHeader is to be set.
   * @param targetTcpProxiesSetProxyHeaderRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setProxyHeaderTargetTcpProxyAsync(
      String targetTcpProxy,
      TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource) {

    SetProxyHeaderTargetTcpProxyHttpRequest request =
        SetProxyHeaderTargetTcpProxyHttpRequest.newBuilder()
            .setTargetTcpProxy(targetTcpProxy)
            .setTargetTcpProxiesSetProxyHeaderRequestResource(
                targetTcpProxiesSetProxyHeaderRequestResource)
            .build();
    return setProxyHeaderTargetTcpProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
   *   SetProxyHeaderTargetTcpProxyHttpRequest request = SetProxyHeaderTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .setTargetTcpProxiesSetProxyHeaderRequestResource(targetTcpProxiesSetProxyHeaderRequestResource)
   *     .build();
   *   targetTcpProxyClient.setProxyHeaderTargetTcpProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setProxyHeaderTargetTcpProxyAsync(
      SetProxyHeaderTargetTcpProxyHttpRequest request) {
    return setProxyHeaderTargetTcpProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
   *   SetProxyHeaderTargetTcpProxyHttpRequest request = SetProxyHeaderTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .setTargetTcpProxiesSetProxyHeaderRequestResource(targetTcpProxiesSetProxyHeaderRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = targetTcpProxyClient.setProxyHeaderTargetTcpProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetProxyHeaderTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      setProxyHeaderTargetTcpProxyOperationCallable() {
    return stub.setProxyHeaderTargetTcpProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetTcpProxyClient targetTcpProxyClient = TargetTcpProxyClient.create()) {
   *   ProjectGlobalTargetTcpProxyName targetTcpProxy = ProjectGlobalTargetTcpProxyName.of("[PROJECT]", "[TARGET_TCP_PROXY]");
   *   TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource = TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
   *   SetProxyHeaderTargetTcpProxyHttpRequest request = SetProxyHeaderTargetTcpProxyHttpRequest.newBuilder()
   *     .setTargetTcpProxy(targetTcpProxy.toString())
   *     .setTargetTcpProxiesSetProxyHeaderRequestResource(targetTcpProxiesSetProxyHeaderRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetTcpProxyClient.setProxyHeaderTargetTcpProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetProxyHeaderTargetTcpProxyHttpRequest, Operation>
      setProxyHeaderTargetTcpProxyCallable() {
    return stub.setProxyHeaderTargetTcpProxyCallable();
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

  public static class ListTargetTcpProxiesPagedResponse
      extends AbstractPagedListResponse<
          ListTargetTcpProxiesHttpRequest,
          TargetTcpProxyList,
          TargetTcpProxy,
          ListTargetTcpProxiesPage,
          ListTargetTcpProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetTcpProxiesPagedResponse> createAsync(
        PageContext<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy> context,
        ApiFuture<TargetTcpProxyList> futureResponse) {
      ApiFuture<ListTargetTcpProxiesPage> futurePage =
          ListTargetTcpProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetTcpProxiesPage, ListTargetTcpProxiesPagedResponse>() {
            @Override
            public ListTargetTcpProxiesPagedResponse apply(ListTargetTcpProxiesPage input) {
              return new ListTargetTcpProxiesPagedResponse(input);
            }
          });
    }

    private ListTargetTcpProxiesPagedResponse(ListTargetTcpProxiesPage page) {
      super(page, ListTargetTcpProxiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTargetTcpProxiesPage
      extends AbstractPage<
          ListTargetTcpProxiesHttpRequest,
          TargetTcpProxyList,
          TargetTcpProxy,
          ListTargetTcpProxiesPage> {

    private ListTargetTcpProxiesPage(
        PageContext<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy> context,
        TargetTcpProxyList response) {
      super(context, response);
    }

    private static ListTargetTcpProxiesPage createEmptyPage() {
      return new ListTargetTcpProxiesPage(null, null);
    }

    @Override
    protected ListTargetTcpProxiesPage createPage(
        PageContext<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy> context,
        TargetTcpProxyList response) {
      return new ListTargetTcpProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetTcpProxiesPage> createPageAsync(
        PageContext<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy> context,
        ApiFuture<TargetTcpProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTargetTcpProxiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTargetTcpProxiesHttpRequest,
          TargetTcpProxyList,
          TargetTcpProxy,
          ListTargetTcpProxiesPage,
          ListTargetTcpProxiesFixedSizeCollection> {

    private ListTargetTcpProxiesFixedSizeCollection(
        List<ListTargetTcpProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetTcpProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetTcpProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetTcpProxiesFixedSizeCollection createCollection(
        List<ListTargetTcpProxiesPage> pages, int collectionSize) {
      return new ListTargetTcpProxiesFixedSizeCollection(pages, collectionSize);
    }
  }
}
