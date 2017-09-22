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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetSslProxiesPagedResponse;
import com.google.compute.v1.stub.TargetSslProxyAdminStub;
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
 * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
 *
 *   Operation response = targetSslProxyAdminClient.deleteTargetSslProxy();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetSslProxyAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetSslProxyAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetSslProxyAdminSettings targetSslProxyAdminSettings =
 *     TargetSslProxyAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetSslProxyAdminClient targetSslProxyAdminClient =
 *     TargetSslProxyAdminClient.create(targetSslProxyAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetSslProxyAdminSettings targetSslProxyAdminSettings =
 *     TargetSslProxyAdminSettings.defaultBuilder()
 *         .setTransportProvider(TargetSslProxyAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(TargetSslProxyAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetSslProxyAdminClient targetSslProxyAdminClient =
 *     TargetSslProxyAdminClient.create(targetSslProxyAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetSslProxyAdminClient implements BackgroundResource {
  private final TargetSslProxyAdminSettings settings;
  private final TargetSslProxyAdminStub stub;



  /**
   * Constructs an instance of TargetSslProxyAdminClient with default settings.
   */
  public static final TargetSslProxyAdminClient create() throws IOException {
    return create(TargetSslProxyAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of TargetSslProxyAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetSslProxyAdminClient create(TargetSslProxyAdminSettings settings) throws IOException {
    return new TargetSslProxyAdminClient(settings);
  }

  /**
   * Constructs an instance of TargetSslProxyAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetSslProxyAdminSettings}.
   */
  public static final TargetSslProxyAdminClient create(TargetSslProxyAdminStub stub) {
    return new TargetSslProxyAdminClient(stub);
  }

  /**
   * Constructs an instance of TargetSslProxyAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetSslProxyAdminClient(TargetSslProxyAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetSslProxyAdminClient(TargetSslProxyAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetSslProxyAdminSettings getSettings() {
    return settings;
  }

  public TargetSslProxyAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.deleteTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetSslProxy(TargetSslProxyName targetSslProxy) {

    DeleteTargetSslProxyHttpRequest request =
        DeleteTargetSslProxyHttpRequest.newBuilder()
        .setTargetSslProxyWithTargetSslProxyName(targetSslProxy)
        .build();
    return deleteTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.deleteTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetSslProxy(DeleteTargetSslProxyHttpRequest request) {
    return deleteTargetSslProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetSslProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyAdminClient.deleteTargetSslProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyCallable() {
    return stub.deleteTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   TargetSslProxy response = targetSslProxyAdminClient.getTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetSslProxy getTargetSslProxy(TargetSslProxyName targetSslProxy) {

    GetTargetSslProxyHttpRequest request =
        GetTargetSslProxyHttpRequest.newBuilder()
        .setTargetSslProxyWithTargetSslProxyName(targetSslProxy)
        .build();
    return getTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   TargetSslProxy response = targetSslProxyAdminClient.getTargetSslProxy();
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
   * Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetSslProxy&gt; future = targetSslProxyAdminClient.getTargetSslProxyCallable().futureCall();
   *   // Do something
   *   TargetSslProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyCallable() {
    return stub.getTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.insertTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetSslProxy A TargetSslProxy resource. This resource defines an SSL proxy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetSslProxy(TargetSslProxiesProjectName project, TargetSslProxy targetSslProxy) {

    InsertTargetSslProxyHttpRequest request =
        InsertTargetSslProxyHttpRequest.newBuilder()
        .setProjectWithTargetSslProxiesProjectName(project)
        .setTargetSslProxy(targetSslProxy)
        .build();
    return insertTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.insertTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetSslProxy(InsertTargetSslProxyHttpRequest request) {
    return insertTargetSslProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetSslProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyAdminClient.insertTargetSslProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyCallable() {
    return stub.insertTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   for (TargetSslProxy element : targetSslProxyAdminClient.listTargetSslProxies().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetSslProxiesPagedResponse listTargetSslProxies(TargetSslProxiesProjectName project) {
    ListTargetSslProxiesHttpRequest request =
        ListTargetSslProxiesHttpRequest.newBuilder()
        .setProjectWithTargetSslProxiesProjectName(project)
        .build();
    return listTargetSslProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   for (TargetSslProxy element : targetSslProxyAdminClient.listTargetSslProxies().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetSslProxiesPagedResponse listTargetSslProxies(ListTargetSslProxiesHttpRequest request) {
    return listTargetSslProxiesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;ListTargetSslProxiesPagedResponse&gt; future = targetSslProxyAdminClient.listTargetSslProxiesPagedCallable().futureCall();
   *   // Do something
   *   for (TargetSslProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse> listTargetSslProxiesPagedCallable() {
    return stub.listTargetSslProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetSslProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   while (true) {
   *     TargetSslProxyList response = targetSslProxyAdminClient.listTargetSslProxiesCallable().call();
   *     for (TargetSslProxy element : response.getItems()) {
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
  public final UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesCallable() {
    return stub.listTargetSslProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.setBackendServiceTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose BackendService resource is to be set.
   * @param targetSslProxiesSetBackendServiceRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setBackendServiceTargetSslProxy(TargetSslProxyName targetSslProxy, TargetSslProxiesSetBackendServiceRequest targetSslProxiesSetBackendServiceRequest) {

    SetBackendServiceTargetSslProxyHttpRequest request =
        SetBackendServiceTargetSslProxyHttpRequest.newBuilder()
        .setTargetSslProxyWithTargetSslProxyName(targetSslProxy)
        .setTargetSslProxiesSetBackendServiceRequest(targetSslProxiesSetBackendServiceRequest)
        .build();
    return setBackendServiceTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.setBackendServiceTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setBackendServiceTargetSslProxy(SetBackendServiceTargetSslProxyHttpRequest request) {
    return setBackendServiceTargetSslProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the BackendService for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyAdminClient.setBackendServiceTargetSslProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyCallable() {
    return stub.setBackendServiceTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.setProxyHeaderTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose ProxyHeader is to be set.
   * @param targetSslProxiesSetProxyHeaderRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setProxyHeaderTargetSslProxy(TargetSslProxyName targetSslProxy, TargetSslProxiesSetProxyHeaderRequest targetSslProxiesSetProxyHeaderRequest) {

    SetProxyHeaderTargetSslProxyHttpRequest request =
        SetProxyHeaderTargetSslProxyHttpRequest.newBuilder()
        .setTargetSslProxyWithTargetSslProxyName(targetSslProxy)
        .setTargetSslProxiesSetProxyHeaderRequest(targetSslProxiesSetProxyHeaderRequest)
        .build();
    return setProxyHeaderTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.setProxyHeaderTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setProxyHeaderTargetSslProxy(SetProxyHeaderTargetSslProxyHttpRequest request) {
    return setProxyHeaderTargetSslProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the ProxyHeaderType for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyAdminClient.setProxyHeaderTargetSslProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyCallable() {
    return stub.setProxyHeaderTargetSslProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.setSslCertificatesTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param targetSslProxy Name of the TargetSslProxy resource whose SslCertificate resource is to be set.
   * @param targetSslProxiesSetSslCertificatesRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSslCertificatesTargetSslProxy(TargetSslProxyName targetSslProxy, TargetSslProxiesSetSslCertificatesRequest targetSslProxiesSetSslCertificatesRequest) {

    SetSslCertificatesTargetSslProxyHttpRequest request =
        SetSslCertificatesTargetSslProxyHttpRequest.newBuilder()
        .setTargetSslProxyWithTargetSslProxyName(targetSslProxy)
        .setTargetSslProxiesSetSslCertificatesRequest(targetSslProxiesSetSslCertificatesRequest)
        .build();
    return setSslCertificatesTargetSslProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   Operation response = targetSslProxyAdminClient.setSslCertificatesTargetSslProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSslCertificatesTargetSslProxy(SetSslCertificatesTargetSslProxyHttpRequest request) {
    return setSslCertificatesTargetSslProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes SslCertificates for TargetSslProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetSslProxyAdminClient.setSslCertificatesTargetSslProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyCallable() {
    return stub.setSslCertificatesTargetSslProxyCallable();
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