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
import com.google.compute.v1.stub.TargetHttpsProxyStub;
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
 * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
 *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
 *   Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy(targetHttpsProxy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetHttpsProxyClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of TargetHttpsProxySettings to
 * create(). For example:
 *
 * To customize credentials:
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
 *     TargetHttpsProxySettings.newBuilder()
 *         .setTransportProvider(TargetHttpsProxySettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(TargetHttpsProxySettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * TargetHttpsProxyClient targetHttpsProxyClient =
 *     TargetHttpsProxyClient.create(targetHttpsProxySettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetHttpsProxyClient implements BackgroundResource {
  private final TargetHttpsProxySettings settings;
  private final TargetHttpsProxyStub stub;



  /**
   * Constructs an instance of TargetHttpsProxyClient with default settings.
   */
  public static final TargetHttpsProxyClient create() throws IOException {
    return create(TargetHttpsProxySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetHttpsProxyClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final TargetHttpsProxyClient create(TargetHttpsProxySettings settings) throws IOException {
    return new TargetHttpsProxyClient(settings);
  }

  /**
   * Constructs an instance of TargetHttpsProxyClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use TargetHttpsProxySettings}.
   */
  public static final TargetHttpsProxyClient create(TargetHttpsProxyStub stub) {
    return new TargetHttpsProxyClient(stub);
  }

  /**
   * Constructs an instance of TargetHttpsProxyClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected TargetHttpsProxyClient(TargetHttpsProxySettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected TargetHttpsProxyClient(TargetHttpsProxyStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetHttpsProxySettings getSettings() {
    return settings;
  }

  @BetaApi
  public TargetHttpsProxyStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpsProxy resource.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy(targetHttpsProxy);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   DeleteTargetHttpsProxyHttpRequest request = DeleteTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .build();
   *   Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   DeleteTargetHttpsProxyHttpRequest request = DeleteTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.deleteTargetHttpsProxyCallable().futureCall(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxy response = targetHttpsProxyClient.getTargetHttpsProxy(targetHttpsProxy);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   GetTargetHttpsProxyHttpRequest request = GetTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
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
   * Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   GetTargetHttpsProxyHttpRequest request = GetTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .build();
   *   ApiFuture&lt;TargetHttpsProxy&gt; future = targetHttpsProxyClient.getTargetHttpsProxyCallable().futureCall(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxy = TargetHttpsProxy.newBuilder().build();
   *   Operation response = targetHttpsProxyClient.insertTargetHttpsProxy(project, targetHttpsProxy);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpsProxyResource A TargetHttpsProxy resource. This resource defines an HTTPS proxy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpsProxy(ProjectName project, TargetHttpsProxy targetHttpsProxyResource) {

    InsertTargetHttpsProxyHttpRequest request =
        InsertTargetHttpsProxyHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxy = TargetHttpsProxy.newBuilder().build();
   *   InsertTargetHttpsProxyHttpRequest request = InsertTargetHttpsProxyHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setTargetHttpsProxyResource(targetHttpsProxy)
   *     .build();
   *   Operation response = targetHttpsProxyClient.insertTargetHttpsProxy(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   TargetHttpsProxy targetHttpsProxy = TargetHttpsProxy.newBuilder().build();
   *   InsertTargetHttpsProxyHttpRequest request = InsertTargetHttpsProxyHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setTargetHttpsProxyResource(targetHttpsProxy)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.insertTargetHttpsProxyCallable().futureCall(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
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
        .setProjectWithProjectName(project)
        .build();
    return listTargetHttpsProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
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
  public final UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse> listTargetHttpsProxiesPagedCallable() {
    return stub.listTargetHttpsProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpsProxy resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListTargetHttpsProxiesHttpRequest request = ListTargetHttpsProxiesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     TargetHttpsProxyList response = targetHttpsProxyClient.listTargetHttpsProxiesCallable().call(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequest = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   Operation response = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxy(targetHttpsProxy, targetHttpsProxiesSetSslCertificatesRequest);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequest = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetHttpsProxyHttpRequest request = SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequest)
   *     .build();
   *   Operation response = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxy(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   TargetHttpsProxiesSetSslCertificatesRequest targetHttpsProxiesSetSslCertificatesRequest = TargetHttpsProxiesSetSslCertificatesRequest.newBuilder().build();
   *   SetSslCertificatesTargetHttpsProxyHttpRequest request = SetSslCertificatesTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .setTargetHttpsProxiesSetSslCertificatesRequestResource(targetHttpsProxiesSetSslCertificatesRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.setSslCertificatesTargetHttpsProxyCallable().futureCall(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();
   *   Operation response = targetHttpsProxyClient.setUrlMapTargetHttpsProxy(targetHttpsProxy, urlMapReference);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpsProxyHttpRequest request = SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .setUrlMapReferenceResource(urlMapReference)
   *     .build();
   *   Operation response = targetHttpsProxyClient.setUrlMapTargetHttpsProxy(request);
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
   * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
   *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
   *   UrlMapReference urlMapReference = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpsProxyHttpRequest request = SetUrlMapTargetHttpsProxyHttpRequest.newBuilder()
   *     .setTargetHttpsProxyWithTargetHttpsProxyName(targetHttpsProxy)
   *     .setUrlMapReferenceResource(urlMapReference)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpsProxyClient.setUrlMapTargetHttpsProxyCallable().futureCall(request);
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