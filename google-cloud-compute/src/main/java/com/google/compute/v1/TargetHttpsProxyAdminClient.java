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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpsProxiesPagedResponse;
import com.google.compute.v1.stub.TargetHttpsProxyAdminStub;
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
 * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
 *
 *   Operation response = targetHttpsProxyAdminClient.deleteTargetHttpsProxy();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetHttpsProxyAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetHttpsProxyAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * TargetHttpsProxyAdminSettings targetHttpsProxyAdminSettings =
 *     TargetHttpsProxyAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetHttpsProxyAdminClient targetHttpsProxyAdminClient =
 *     TargetHttpsProxyAdminClient.create(targetHttpsProxyAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetHttpsProxyAdminSettings targetHttpsProxyAdminSettings =
 *     TargetHttpsProxyAdminSettings.defaultBuilder()
 *         .setTransportProvider(TargetHttpsProxyAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(TargetHttpsProxyAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetHttpsProxyAdminClient targetHttpsProxyAdminClient =
 *     TargetHttpsProxyAdminClient.create(targetHttpsProxyAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetHttpsProxyAdminClient implements BackgroundResource {
  private final TargetHttpsProxyAdminSettings settings;
  private final TargetHttpsProxyAdminStub stub;



  /**
   * Constructs an instance of TargetHttpsProxyAdminClient with default settings.
   */
  public static final TargetHttpsProxyAdminClient create() throws IOException {
    return create(TargetHttpsProxyAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of TargetHttpsProxyAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetHttpsProxyAdminClient create(TargetHttpsProxyAdminSettings settings) throws IOException {
    return new TargetHttpsProxyAdminClient(settings);
  }

  /**
   * Constructs an instance of TargetHttpsProxyAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetHttpsProxyAdminSettings}.
   */
  public static final TargetHttpsProxyAdminClient create(TargetHttpsProxyAdminStub stub) {
    return new TargetHttpsProxyAdminClient(stub);
  }

  /**
   * Constructs an instance of TargetHttpsProxyAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetHttpsProxyAdminClient(TargetHttpsProxyAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetHttpsProxyAdminClient(TargetHttpsProxyAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetHttpsProxyAdminSettings getSettings() {
    return settings;
  }

  public TargetHttpsProxyAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.deleteTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpsProxy(TargetHttpsProxyName targetHttpsProxy) {

    DeleteTargetHttpsProxyHttpRequest request =
        DeleteTargetHttpsProxyHttpRequest.newBuilder()
        .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
        .build();
    return deleteTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.deleteTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpsProxy(DeleteTargetHttpsProxyHttpRequest request) {
    return deleteTargetHttpsProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyAdminClient.deleteTargetHttpsProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation> deleteTargetHttpsProxyCallable() {
    return stub.deleteTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   TargetHttpsProxy response = targetHttpsProxyAdminClient.getTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpsProxy getTargetHttpsProxy(TargetHttpsProxyName targetHttpsProxy) {

    GetTargetHttpsProxyHttpRequest request =
        GetTargetHttpsProxyHttpRequest.newBuilder()
        .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
        .build();
    return getTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   TargetHttpsProxy response = targetHttpsProxyAdminClient.getTargetHttpsProxy();
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
   * Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;TargetHttpsProxy&gt; future = targetHttpsProxyAdminClient.getTargetHttpsProxyCallable().futureCall();
   *   // Do something
   *   TargetHttpsProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy> getTargetHttpsProxyCallable() {
    return stub.getTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.insertTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpsProxyResource A TargetHttpsProxy resource. This resource defines an HTTPS proxy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpsProxy(TargetHttpsProxiesProjectName project, TargetHttpsProxy targetHttpsProxyResource) {

    InsertTargetHttpsProxyHttpRequest request =
        InsertTargetHttpsProxyHttpRequest.newBuilder()
        .setProjectWithTargetHttpsProxiesProjectName(project)
        .setTargetHttpsProxyResource(targetHttpsProxyResource)
        .build();
    return insertTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.insertTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpsProxy(InsertTargetHttpsProxyHttpRequest request) {
    return insertTargetHttpsProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpsProxy resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyAdminClient.insertTargetHttpsProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation> insertTargetHttpsProxyCallable() {
    return stub.insertTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   for (TargetHttpsProxy element : targetHttpsProxyAdminClient.listTargetHttpsProxies().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpsProxiesPagedResponse listTargetHttpsProxies(TargetHttpsProxiesProjectName project) {
    ListTargetHttpsProxiesHttpRequest request =
        ListTargetHttpsProxiesHttpRequest.newBuilder()
        .setProjectWithTargetHttpsProxiesProjectName(project)
        .build();
    return listTargetHttpsProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   for (TargetHttpsProxy element : targetHttpsProxyAdminClient.listTargetHttpsProxies().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpsProxiesPagedResponse listTargetHttpsProxies(ListTargetHttpsProxiesHttpRequest request) {
    return listTargetHttpsProxiesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;ListTargetHttpsProxiesPagedResponse&gt; future = targetHttpsProxyAdminClient.listTargetHttpsProxiesPagedCallable().futureCall();
   *   // Do something
   *   for (TargetHttpsProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse> listTargetHttpsProxiesPagedCallable() {
    return stub.listTargetHttpsProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   while (true) {
   *     TargetHttpsProxyList response = targetHttpsProxyAdminClient.listTargetHttpsProxiesCallable().call();
   *     for (TargetHttpsProxy element : response.getItems()) {
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
  public final UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList> listTargetHttpsProxiesCallable() {
    return stub.listTargetHttpsProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.setSslCertificatesTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates resource for.
   * @param targetHttpsProxiesSetSslCertificatesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSslCertificatesTargetHttpsProxy(TargetHttpsProxyName targetHttpsProxy, TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequestResource) {

    SetSslCertificatesTargetHttpsProxyHttpRequest request =
        SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
        .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
        .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequestResource)
        .build();
    return setSslCertificatesTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.setSslCertificatesTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSslCertificatesTargetHttpsProxy(SetSslCertificatesTargetHttpsProxyHttpRequest request) {
    return setSslCertificatesTargetHttpsProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Replaces SslCertificates for TargetHttpsProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyAdminClient.setSslCertificatesTargetHttpsProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation> setSslCertificatesTargetHttpsProxyCallable() {
    return stub.setSslCertificatesTargetHttpsProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.setUrlMapTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param targetHttpsProxy Name of the TargetHttpsProxy resource whose URL map is to be set.
   * @param urlMapReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpsProxy(TargetHttpsProxyName targetHttpsProxy, UrlMapReference urlMapReferenceResource) {

    SetUrlMapTargetHttpsProxyHttpRequest request =
        SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
        .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
        .setUrlMapReferenceResource(urlMapReferenceResource)
        .build();
    return setUrlMapTargetHttpsProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   Operation response = targetHttpsProxyAdminClient.setUrlMapTargetHttpsProxy();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpsProxy(SetUrlMapTargetHttpsProxyHttpRequest request) {
    return setUrlMapTargetHttpsProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpsProxy.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyAdminClient.setUrlMapTargetHttpsProxyCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation> setUrlMapTargetHttpsProxyCallable() {
    return stub.setUrlMapTargetHttpsProxyCallable();
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