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
import com.google.cloud.compute.v1.stub.TargetHttpsProxyStub;
import com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings;
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
 * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
 *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
 *   TargetHttpsProxy response = targetHttpsProxyClient.getTargetHttpsProxy(targetHttpsProxy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetHttpsProxyClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of TargetHttpsProxySettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * TargetHttpsProxySettings targetHttpsProxySettings =
 *     TargetHttpsProxySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetHttpsProxyClient targetHttpsProxyClient =
 *     TargetHttpsProxyClient.create(targetHttpsProxySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetHttpsProxySettings targetHttpsProxySettings =
 *     TargetHttpsProxySettings.newBuilder().setEndpoint(myEndpoint).build();
 * TargetHttpsProxyClient targetHttpsProxyClient =
 *     TargetHttpsProxyClient.create(targetHttpsProxySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetHttpsProxyClient implements BackgroundResource {
  private final TargetHttpsProxySettings settings;
  private final TargetHttpsProxyStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of TargetHttpsProxyClient with default settings. */
  public static final TargetHttpsProxyClient create() throws IOException {
    return create(TargetHttpsProxySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetHttpsProxyClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final TargetHttpsProxyClient create(TargetHttpsProxySettings settings)
      throws IOException {
    return new TargetHttpsProxyClient(settings);
  }

  /**
   * Constructs an instance of TargetHttpsProxyClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use TargetHttpsProxySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final TargetHttpsProxyClient create(TargetHttpsProxyStub stub) {
    return new TargetHttpsProxyClient(stub);
  }

  /**
   * Constructs an instance of TargetHttpsProxyClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected TargetHttpsProxyClient(TargetHttpsProxySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((TargetHttpsProxyStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected TargetHttpsProxyClient(TargetHttpsProxyStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final TargetHttpsProxySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetHttpsProxyStub getStub() {
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
   * Deletes the specified TargetHttpsProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   targetHttpsProxyClient.deleteTargetHttpsProxyAsync(targetHttpsProxy).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> deleteTargetHttpsProxyAsync(
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy) {

    DeleteTargetHttpsProxyHttpRequest request =
        DeleteTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy == null ? null : targetHttpsProxy.toString())
            .build();
    return deleteTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   targetHttpsProxyClient.deleteTargetHttpsProxyAsync(targetHttpsProxy.toString()).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> deleteTargetHttpsProxyAsync(
      String targetHttpsProxy) {

    DeleteTargetHttpsProxyHttpRequest request =
        DeleteTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy)
            .build();
    return deleteTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   DeleteTargetHttpsProxyHttpRequest request = DeleteTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .build();
   *   targetHttpsProxyClient.deleteTargetHttpsProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> deleteTargetHttpsProxyAsync(
      DeleteTargetHttpsProxyHttpRequest request) {
    return deleteTargetHttpsProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   DeleteTargetHttpsProxyHttpRequest request = DeleteTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetHttpsProxyClient.deleteTargetHttpsProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      deleteTargetHttpsProxyOperationCallable() {
    return stub.deleteTargetHttpsProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   DeleteTargetHttpsProxyHttpRequest request = DeleteTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.deleteTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation>
      deleteTargetHttpsProxyCallable() {
    return stub.deleteTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies
   * by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxy response = targetHttpsProxyClient.getTargetHttpsProxy(targetHttpsProxy);
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpsProxy getTargetHttpsProxy(
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy) {

    GetTargetHttpsProxyHttpRequest request =
        GetTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy == null ? null : targetHttpsProxy.toString())
            .build();
    return getTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies
   * by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxy response = targetHttpsProxyClient.getTargetHttpsProxy(targetHttpsProxy.toString());
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpsProxy getTargetHttpsProxy(String targetHttpsProxy) {

    GetTargetHttpsProxyHttpRequest request =
        GetTargetHttpsProxyHttpRequest.newBuilder().setTargetHttpsProxy(targetHttpsProxy).build();
    return getTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies
   * by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   GetTargetHttpsProxyHttpRequest request = GetTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .build();
   *   TargetHttpsProxy response = targetHttpsProxyClient.getTargetHttpsProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpsProxy getTargetHttpsProxy(GetTargetHttpsProxyHttpRequest request) {
    return getTargetHttpsProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies
   * by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   GetTargetHttpsProxyHttpRequest request = GetTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .build();
   *   ApiFuture&lt;TargetHttpsProxy&gt; future = targetHttpsProxyClient.getTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   TargetHttpsProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy>
      getTargetHttpsProxyCallable() {
    return stub.getTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
   *   targetHttpsProxyClient.insertTargetHttpsProxyAsync(project, targetHttpsProxyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpsProxyResource A TargetHttpsProxy resource. This resource defines an HTTPS
   *     proxy. (== resource_for beta.targetHttpsProxies ==) (== resource_for v1.targetHttpsProxies
   *     ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> insertTargetHttpsProxyAsync(
      ProjectName project, TargetHttpsProxy targetHttpsProxyResource) {

    InsertTargetHttpsProxyHttpRequest request =
        InsertTargetHttpsProxyHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setTargetHttpsProxyResource(targetHttpsProxyResource)
            .build();
    return insertTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
   *   targetHttpsProxyClient.insertTargetHttpsProxyAsync(project.toString(), targetHttpsProxyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpsProxyResource A TargetHttpsProxy resource. This resource defines an HTTPS
   *     proxy. (== resource_for beta.targetHttpsProxies ==) (== resource_for v1.targetHttpsProxies
   *     ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> insertTargetHttpsProxyAsync(
      String project, TargetHttpsProxy targetHttpsProxyResource) {

    InsertTargetHttpsProxyHttpRequest request =
        InsertTargetHttpsProxyHttpRequest.newBuilder()
            .setProject(project)
            .setTargetHttpsProxyResource(targetHttpsProxyResource)
            .build();
    return insertTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
   *   InsertTargetHttpsProxyHttpRequest request = InsertTargetHttpsProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetHttpsProxyResource(targetHttpsProxyResource)
   *     .build();
   *   targetHttpsProxyClient.insertTargetHttpsProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> insertTargetHttpsProxyAsync(
      InsertTargetHttpsProxyHttpRequest request) {
    return insertTargetHttpsProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
   *   InsertTargetHttpsProxyHttpRequest request = InsertTargetHttpsProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetHttpsProxyResource(targetHttpsProxyResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetHttpsProxyClient.insertTargetHttpsProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      insertTargetHttpsProxyOperationCallable() {
    return stub.insertTargetHttpsProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxyResource = TargetHttpsProxy.newBuilder().build();
   *   InsertTargetHttpsProxyHttpRequest request = InsertTargetHttpsProxyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setTargetHttpsProxyResource(targetHttpsProxyResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.insertTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation>
      insertTargetHttpsProxyCallable() {
    return stub.insertTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetHttpsProxy element : targetHttpsProxyClient.listTargetHttpsProxies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpsProxiesPagedResponse listTargetHttpsProxies(ProjectName project) {
    ListTargetHttpsProxiesHttpRequest request =
        ListTargetHttpsProxiesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listTargetHttpsProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetHttpsProxy element : targetHttpsProxyClient.listTargetHttpsProxies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpsProxiesPagedResponse listTargetHttpsProxies(String project) {
    ListTargetHttpsProxiesHttpRequest request =
        ListTargetHttpsProxiesHttpRequest.newBuilder().setProject(project).build();
    return listTargetHttpsProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (TargetHttpsProxy element : targetHttpsProxyClient.listTargetHttpsProxies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpsProxiesPagedResponse listTargetHttpsProxies(
      ListTargetHttpsProxiesHttpRequest request) {
    return listTargetHttpsProxiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListTargetHttpsProxiesPagedResponse&gt; future = targetHttpsProxyClient.listTargetHttpsProxiesPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetHttpsProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse>
      listTargetHttpsProxiesPagedCallable() {
    return stub.listTargetHttpsProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     TargetHttpsProxyList response = targetHttpsProxyClient.listTargetHttpsProxiesCallable().call(request);
   *     for (TargetHttpsProxy element : response.getItemsList()) {
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
  public final UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList>
      listTargetHttpsProxiesCallable() {
    return stub.listTargetHttpsProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the QUIC override policy for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
   *   targetHttpsProxyClient.setQuicOverrideTargetHttpsProxyAsync(targetHttpsProxy, targetHttpsProxiesSetQuicOverrideRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to set the QUIC override policy
   *     for. The name should conform to RFC1035.
   * @param targetHttpsProxiesSetQuicOverrideRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setQuicOverrideTargetHttpsProxyAsync(
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy,
      TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource) {

    SetQuicOverrideTargetHttpsProxyHttpRequest request =
        SetQuicOverrideTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy == null ? null : targetHttpsProxy.toString())
            .setTargetHttpsProxiesSetQuicOverrideRequestResource(
                targetHttpsProxiesSetQuicOverrideRequestResource)
            .build();
    return setQuicOverrideTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the QUIC override policy for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
   *   targetHttpsProxyClient.setQuicOverrideTargetHttpsProxyAsync(targetHttpsProxy.toString(), targetHttpsProxiesSetQuicOverrideRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to set the QUIC override policy
   *     for. The name should conform to RFC1035.
   * @param targetHttpsProxiesSetQuicOverrideRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setQuicOverrideTargetHttpsProxyAsync(
      String targetHttpsProxy,
      TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource) {

    SetQuicOverrideTargetHttpsProxyHttpRequest request =
        SetQuicOverrideTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy)
            .setTargetHttpsProxiesSetQuicOverrideRequestResource(
                targetHttpsProxiesSetQuicOverrideRequestResource)
            .build();
    return setQuicOverrideTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the QUIC override policy for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
   *   SetQuicOverrideTargetHttpsProxyHttpRequest request = SetQuicOverrideTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setTargetHttpsProxiesSetQuicOverrideRequestResource(targetHttpsProxiesSetQuicOverrideRequestResource)
   *     .build();
   *   targetHttpsProxyClient.setQuicOverrideTargetHttpsProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setQuicOverrideTargetHttpsProxyAsync(
      SetQuicOverrideTargetHttpsProxyHttpRequest request) {
    return setQuicOverrideTargetHttpsProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the QUIC override policy for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
   *   SetQuicOverrideTargetHttpsProxyHttpRequest request = SetQuicOverrideTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setTargetHttpsProxiesSetQuicOverrideRequestResource(targetHttpsProxiesSetQuicOverrideRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetHttpsProxyClient.setQuicOverrideTargetHttpsProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetQuicOverrideTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setQuicOverrideTargetHttpsProxyOperationCallable() {
    return stub.setQuicOverrideTargetHttpsProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the QUIC override policy for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetQuicOverrideRequest targetHttpsProxiesSetQuicOverrideRequestResource = TargetHttpsProxiesSetQuicOverrideRequest.newBuilder().build();
   *   SetQuicOverrideTargetHttpsProxyHttpRequest request = SetQuicOverrideTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setTargetHttpsProxiesSetQuicOverrideRequestResource(targetHttpsProxiesSetQuicOverrideRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.setQuicOverrideTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetQuicOverrideTargetHttpsProxyHttpRequest, Operation>
      setQuicOverrideTargetHttpsProxyCallable() {
    return stub.setQuicOverrideTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyAsync(targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates
   *     resource for.
   * @param targetHttpsProxiesSetSslCertificatesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslCertificatesTargetHttpsProxyAsync(
      ProjectTargetHttpsProxyName targetHttpsProxy,
      TargetHttpsProxiesSetSslCertificatesRequest
          targetHttpsProxiesSetSslCertificatesRequestResource) {

    SetSslCertificatesTargetHttpsProxyHttpRequest request =
        SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy == null ? null : targetHttpsProxy.toString())
            .setTargetHttpsProxiesSetSslCertificatesRequestResource(
                targetHttpsProxiesSetSslCertificatesRequestResource)
            .build();
    return setSslCertificatesTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyAsync(targetHttpsProxy.toString(), targetHttpsProxiesSetSslCertificatesRequestResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates
   *     resource for.
   * @param targetHttpsProxiesSetSslCertificatesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslCertificatesTargetHttpsProxyAsync(
      String targetHttpsProxy,
      TargetHttpsProxiesSetSslCertificatesRequest
          targetHttpsProxiesSetSslCertificatesRequestResource) {

    SetSslCertificatesTargetHttpsProxyHttpRequest request =
        SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy)
            .setTargetHttpsProxiesSetSslCertificatesRequestResource(
                targetHttpsProxiesSetSslCertificatesRequestResource)
            .build();
    return setSslCertificatesTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetHttpsProxyHttpRequest request = SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequestResource)
   *     .build();
   *   targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslCertificatesTargetHttpsProxyAsync(
      SetSslCertificatesTargetHttpsProxyHttpRequest request) {
    return setSslCertificatesTargetHttpsProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetHttpsProxyHttpRequest request = SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetSslCertificatesTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setSslCertificatesTargetHttpsProxyOperationCallable() {
    return stub.setSslCertificatesTargetHttpsProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetHttpsProxyHttpRequest request = SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation>
      setSslCertificatesTargetHttpsProxyCallable() {
    return stub.setSslCertificatesTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   * do not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   targetHttpsProxyClient.setSslPolicyTargetHttpsProxyAsync(targetHttpsProxy, sslPolicyReferenceResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource whose SSL policy is to be set.
   *     The name must be 1-63 characters long, and comply with RFC1035.
   * @param sslPolicyReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslPolicyTargetHttpsProxyAsync(
      ProjectGlobalTargetHttpsProxyName targetHttpsProxy,
      SslPolicyReference sslPolicyReferenceResource) {

    SetSslPolicyTargetHttpsProxyHttpRequest request =
        SetSslPolicyTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy == null ? null : targetHttpsProxy.toString())
            .setSslPolicyReferenceResource(sslPolicyReferenceResource)
            .build();
    return setSslPolicyTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   * do not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   targetHttpsProxyClient.setSslPolicyTargetHttpsProxyAsync(targetHttpsProxy.toString(), sslPolicyReferenceResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource whose SSL policy is to be set.
   *     The name must be 1-63 characters long, and comply with RFC1035.
   * @param sslPolicyReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslPolicyTargetHttpsProxyAsync(
      String targetHttpsProxy, SslPolicyReference sslPolicyReferenceResource) {

    SetSslPolicyTargetHttpsProxyHttpRequest request =
        SetSslPolicyTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy)
            .setSslPolicyReferenceResource(sslPolicyReferenceResource)
            .build();
    return setSslPolicyTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   * do not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   SetSslPolicyTargetHttpsProxyHttpRequest request = SetSslPolicyTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setSslPolicyReferenceResource(sslPolicyReferenceResource)
   *     .build();
   *   targetHttpsProxyClient.setSslPolicyTargetHttpsProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setSslPolicyTargetHttpsProxyAsync(
      SetSslPolicyTargetHttpsProxyHttpRequest request) {
    return setSslPolicyTargetHttpsProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   * do not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   SetSslPolicyTargetHttpsProxyHttpRequest request = SetSslPolicyTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setSslPolicyReferenceResource(sslPolicyReferenceResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetHttpsProxyClient.setSslPolicyTargetHttpsProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetSslPolicyTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setSslPolicyTargetHttpsProxyOperationCallable() {
    return stub.setSslPolicyTargetHttpsProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for
   * SSL features. This affects connections between clients and the HTTPS proxy load balancer. They
   * do not affect the connection between the load balancer and the backends.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectGlobalTargetHttpsProxyName targetHttpsProxy = ProjectGlobalTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   SslPolicyReference sslPolicyReferenceResource = SslPolicyReference.newBuilder().build();
   *   SetSslPolicyTargetHttpsProxyHttpRequest request = SetSslPolicyTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setSslPolicyReferenceResource(sslPolicyReferenceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.setSslPolicyTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSslPolicyTargetHttpsProxyHttpRequest, Operation>
      setSslPolicyTargetHttpsProxyCallable() {
    return stub.setSslPolicyTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   targetHttpsProxyClient.setUrlMapTargetHttpsProxyAsync(targetHttpsProxy, urlMapReferenceResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource whose URL map is to be set.
   * @param urlMapReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setUrlMapTargetHttpsProxyAsync(
      ProjectTargetHttpsProxyName targetHttpsProxy, UrlMapReference urlMapReferenceResource) {

    SetUrlMapTargetHttpsProxyHttpRequest request =
        SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy == null ? null : targetHttpsProxy.toString())
            .setUrlMapReferenceResource(urlMapReferenceResource)
            .build();
    return setUrlMapTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   targetHttpsProxyClient.setUrlMapTargetHttpsProxyAsync(targetHttpsProxy.toString(), urlMapReferenceResource).get();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource whose URL map is to be set.
   * @param urlMapReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setUrlMapTargetHttpsProxyAsync(
      String targetHttpsProxy, UrlMapReference urlMapReferenceResource) {

    SetUrlMapTargetHttpsProxyHttpRequest request =
        SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
            .setTargetHttpsProxy(targetHttpsProxy)
            .setUrlMapReferenceResource(urlMapReferenceResource)
            .build();
    return setUrlMapTargetHttpsProxyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpsProxyHttpRequest request = SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setUrlMapReferenceResource(urlMapReferenceResource)
   *     .build();
   *   targetHttpsProxyClient.setUrlMapTargetHttpsProxyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, Operation> setUrlMapTargetHttpsProxyAsync(
      SetUrlMapTargetHttpsProxyHttpRequest request) {
    return setUrlMapTargetHttpsProxyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpsProxyHttpRequest request = SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setUrlMapReferenceResource(urlMapReferenceResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, Operation&gt; future = targetHttpsProxyClient.setUrlMapTargetHttpsProxyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetUrlMapTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setUrlMapTargetHttpsProxyOperationCallable() {
    return stub.setUrlMapTargetHttpsProxyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectTargetHttpsProxyName targetHttpsProxy = ProjectTargetHttpsProxyName.of("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpsProxyHttpRequest request = SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxy(targetHttpsProxy.toString())
   *     .setUrlMapReferenceResource(urlMapReferenceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.setUrlMapTargetHttpsProxyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation>
      setUrlMapTargetHttpsProxyCallable() {
    return stub.setUrlMapTargetHttpsProxyCallable();
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

  public static class ListTargetHttpsProxiesPagedResponse
      extends AbstractPagedListResponse<
          ListTargetHttpsProxiesHttpRequest,
          TargetHttpsProxyList,
          TargetHttpsProxy,
          ListTargetHttpsProxiesPage,
          ListTargetHttpsProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetHttpsProxiesPagedResponse> createAsync(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy>
            context,
        ApiFuture<TargetHttpsProxyList> futureResponse) {
      ApiFuture<ListTargetHttpsProxiesPage> futurePage =
          ListTargetHttpsProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetHttpsProxiesPage, ListTargetHttpsProxiesPagedResponse>() {
            @Override
            public ListTargetHttpsProxiesPagedResponse apply(ListTargetHttpsProxiesPage input) {
              return new ListTargetHttpsProxiesPagedResponse(input);
            }
          });
    }

    private ListTargetHttpsProxiesPagedResponse(ListTargetHttpsProxiesPage page) {
      super(page, ListTargetHttpsProxiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTargetHttpsProxiesPage
      extends AbstractPage<
          ListTargetHttpsProxiesHttpRequest,
          TargetHttpsProxyList,
          TargetHttpsProxy,
          ListTargetHttpsProxiesPage> {

    private ListTargetHttpsProxiesPage(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy>
            context,
        TargetHttpsProxyList response) {
      super(context, response);
    }

    private static ListTargetHttpsProxiesPage createEmptyPage() {
      return new ListTargetHttpsProxiesPage(null, null);
    }

    @Override
    protected ListTargetHttpsProxiesPage createPage(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy>
            context,
        TargetHttpsProxyList response) {
      return new ListTargetHttpsProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetHttpsProxiesPage> createPageAsync(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy>
            context,
        ApiFuture<TargetHttpsProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTargetHttpsProxiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTargetHttpsProxiesHttpRequest,
          TargetHttpsProxyList,
          TargetHttpsProxy,
          ListTargetHttpsProxiesPage,
          ListTargetHttpsProxiesFixedSizeCollection> {

    private ListTargetHttpsProxiesFixedSizeCollection(
        List<ListTargetHttpsProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetHttpsProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetHttpsProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetHttpsProxiesFixedSizeCollection createCollection(
        List<ListTargetHttpsProxiesPage> pages, int collectionSize) {
      return new ListTargetHttpsProxiesFixedSizeCollection(pages, collectionSize);
    }
  }
}
