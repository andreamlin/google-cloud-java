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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpProxiesPagedResponse;
import com.google.compute.v1.stub.TargetHttpProxyAdminStub;
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
 * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
 *
 *   Operation response = targetHttpProxyAdminClient.deleteTargetHttpProxy();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetHttpProxyAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetHttpProxyAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetHttpProxyAdminSettings targetHttpProxyAdminSettings =
 *     TargetHttpProxyAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetHttpProxyAdminClient targetHttpProxyAdminClient =
 *     TargetHttpProxyAdminClient.create(targetHttpProxyAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetHttpProxyAdminSettings targetHttpProxyAdminSettings =
 *     TargetHttpProxyAdminSettings.defaultBuilder()
 *         .setTransportProvider(TargetHttpProxyAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(TargetHttpProxyAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetHttpProxyAdminClient targetHttpProxyAdminClient =
 *     TargetHttpProxyAdminClient.create(targetHttpProxyAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetHttpProxyAdminClient implements BackgroundResource {
  private final TargetHttpProxyAdminSettings settings;
  private final TargetHttpProxyAdminStub stub;



  /**
   * Constructs an instance of TargetHttpProxyAdminClient with default settings.
   */
  public static final TargetHttpProxyAdminClient create() throws IOException {
    return create(TargetHttpProxyAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of TargetHttpProxyAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetHttpProxyAdminClient create(TargetHttpProxyAdminSettings settings) throws IOException {
    return new TargetHttpProxyAdminClient(settings);
  }

  /**
   * Constructs an instance of TargetHttpProxyAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetHttpProxyAdminSettings}.
   */
  public static final TargetHttpProxyAdminClient create(TargetHttpProxyAdminStub stub) {
    return new TargetHttpProxyAdminClient(stub);
  }

  /**
   * Constructs an instance of TargetHttpProxyAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetHttpProxyAdminClient(TargetHttpProxyAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetHttpProxyAdminClient(TargetHttpProxyAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetHttpProxyAdminSettings getSettings() {
    return settings;
  }

  public TargetHttpProxyAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpProxyAdminClient.deleteTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpProxy(TargetHttpProxyName targetHttpProxy) {

    DeleteTargetHttpProxyHttpRequest request =
        DeleteTargetHttpProxyHttpRequest.newBuilder()
        .setTargetHttpProxyWithTargetHttpProxyName(targetHttpProxy)
        .build();
    return deleteTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpProxyAdminClient.deleteTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpProxy(DeleteTargetHttpProxyHttpRequest request) {
    return deleteTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpProxyAdminClient.deleteTargetHttpProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyCallable() {
    return stub.deleteTargetHttpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   TargetHttpProxy response = targetHttpProxyAdminClient.getTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpProxy getTargetHttpProxy(TargetHttpProxyName targetHttpProxy) {

    GetTargetHttpProxyHttpRequest request =
        GetTargetHttpProxyHttpRequest.newBuilder()
        .setTargetHttpProxyWithTargetHttpProxyName(targetHttpProxy)
        .build();
    return getTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   TargetHttpProxy response = targetHttpProxyAdminClient.getTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpProxy getTargetHttpProxy(GetTargetHttpProxyHttpRequest request) {
    return getTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetHttpProxy&gt; future = targetHttpProxyAdminClient.getTargetHttpProxyCallable().futureCall();
   *   // Do something
   *   TargetHttpProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyCallable() {
    return stub.getTargetHttpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpProxyAdminClient.insertTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpProxyResource A TargetHttpProxy resource. This resource defines an HTTP proxy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpProxy(TargetHttpProxiesProjectName project, TargetHttpProxy targetHttpProxyResource) {

    InsertTargetHttpProxyHttpRequest request =
        InsertTargetHttpProxyHttpRequest.newBuilder()
        .setProjectWithTargetHttpProxiesProjectName(project)
        .setTargetHttpProxyResource(targetHttpProxyResource)
        .build();
    return insertTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpProxyAdminClient.insertTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpProxy(InsertTargetHttpProxyHttpRequest request) {
    return insertTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpProxyAdminClient.insertTargetHttpProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyCallable() {
    return stub.insertTargetHttpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   for (TargetHttpProxy element : targetHttpProxyAdminClient.listTargetHttpProxies().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpProxiesPagedResponse listTargetHttpProxies(TargetHttpProxiesProjectName project) {
    ListTargetHttpProxiesHttpRequest request =
        ListTargetHttpProxiesHttpRequest.newBuilder()
        .setProjectWithTargetHttpProxiesProjectName(project)
        .build();
    return listTargetHttpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   for (TargetHttpProxy element : targetHttpProxyAdminClient.listTargetHttpProxies().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpProxiesPagedResponse listTargetHttpProxies(ListTargetHttpProxiesHttpRequest request) {
    return listTargetHttpProxiesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;ListTargetHttpProxiesPagedResponse&gt; future = targetHttpProxyAdminClient.listTargetHttpProxiesPagedCallable().futureCall();
   *   // Do something
   *   for (TargetHttpProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetHttpProxiesHttpRequest, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesPagedCallable() {
    return stub.listTargetHttpProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   while (true) {
   *     TargetHttpProxyList response = targetHttpProxyAdminClient.listTargetHttpProxiesCallable().call();
   *     for (TargetHttpProxy element : response.getItems()) {
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
  public final UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesCallable() {
    return stub.listTargetHttpProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpProxyAdminClient.setUrlMapTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy to set a URL map for.
   * @param urlMapReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpProxy(TargetHttpProxyName targetHttpProxy, UrlMapReference urlMapReferenceResource) {

    SetUrlMapTargetHttpProxyHttpRequest request =
        SetUrlMapTargetHttpProxyHttpRequest.newBuilder()
        .setTargetHttpProxyWithTargetHttpProxyName(targetHttpProxy)
        .setUrlMapReferenceResource(urlMapReferenceResource)
        .build();
    return setUrlMapTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpProxyAdminClient.setUrlMapTargetHttpProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpProxy(SetUrlMapTargetHttpProxyHttpRequest request) {
    return setUrlMapTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpProxyAdminClient.setUrlMapTargetHttpProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyCallable() {
    return stub.setUrlMapTargetHttpProxyCallable();
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