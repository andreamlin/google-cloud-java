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
import static com.google.compute.v1.PagedResponseWrappers.ListUrlMapsPagedResponse;
import com.google.compute.v1.stub.UrlMapStub;
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
 * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
 *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
 *   Operation response = urlMapClient.deleteUrlMap(urlMap);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the urlMapClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of UrlMapSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * UrlMapSettings urlMapSettings =
 *     UrlMapSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UrlMapClient urlMapClient =
 *     UrlMapClient.create(urlMapSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * UrlMapSettings urlMapSettings =
 *     UrlMapSettings.newBuilder()
 *         .setTransportProvider(UrlMapSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(UrlMapSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * UrlMapClient urlMapClient =
 *     UrlMapClient.create(urlMapSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class UrlMapClient implements BackgroundResource {
  private final UrlMapSettings settings;
  private final UrlMapStub stub;



  /**
   * Constructs an instance of UrlMapClient with default settings.
   */
  public static final UrlMapClient create() throws IOException {
    return create(UrlMapSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of UrlMapClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final UrlMapClient create(UrlMapSettings settings) throws IOException {
    return new UrlMapClient(settings);
  }

  /**
   * Constructs an instance of UrlMapClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use UrlMapSettings}.
   */
  public static final UrlMapClient create(UrlMapStub stub) {
    return new UrlMapClient(stub);
  }

  /**
   * Constructs an instance of UrlMapClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected UrlMapClient(UrlMapSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected UrlMapClient(UrlMapStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UrlMapSettings getSettings() {
    return settings;
  }

  @BetaApi
  public UrlMapStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified UrlMap resource.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
   *   Operation response = urlMapClient.deleteUrlMap(urlMap);
   * }
   * </code></pre>
   *
   * @param urlMap Name of the UrlMap resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteUrlMap(UrlMapName urlMap) {

    DeleteUrlMapHttpRequest request =
        DeleteUrlMapHttpRequest.newBuilder()
        .setUrlMapWithUrlMapName(urlMap)
        .build();
    return deleteUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified UrlMap resource.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   DeleteUrlMapHttpRequest request = DeleteUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   Operation response = urlMapClient.deleteUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteUrlMap(DeleteUrlMapHttpRequest request) {
    return deleteUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified UrlMap resource.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   DeleteUrlMapHttpRequest request = DeleteUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = urlMapClient.deleteUrlMapCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteUrlMapHttpRequest, Operation> deleteUrlMapCallable() {
    return stub.deleteUrlMapCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
   *   UrlMap response = urlMapClient.getUrlMap(urlMap);
   * }
   * </code></pre>
   *
   * @param urlMap Name of the UrlMap resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final UrlMap getUrlMap(UrlMapName urlMap) {

    GetUrlMapHttpRequest request =
        GetUrlMapHttpRequest.newBuilder()
        .setUrlMapWithUrlMapName(urlMap)
        .build();
    return getUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   GetUrlMapHttpRequest request = GetUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   UrlMap response = urlMapClient.getUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final UrlMap getUrlMap(GetUrlMapHttpRequest request) {
    return getUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   GetUrlMapHttpRequest request = GetUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   ApiFuture&lt;UrlMap&gt; future = urlMapClient.getUrlMapCallable().futureCall(request);
   *   // Do something
   *   UrlMap response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetUrlMapHttpRequest, UrlMap> getUrlMapCallable() {
    return stub.getUrlMapCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a UrlMap resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   UrlMap urlMap = UrlMap.newBuilder().build();
   *   Operation response = urlMapClient.insertUrlMap(project, urlMap);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param urlMapResource A UrlMap resource. This resource defines the mapping from URL to the BackendService resource, based on the "longest-match" of the URL's host and path.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertUrlMap(ProjectName project, UrlMap urlMapResource) {

    InsertUrlMapHttpRequest request =
        InsertUrlMapHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setUrlMapResource(urlMapResource)
        .build();
    return insertUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a UrlMap resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedProject = UrlMapClient.formatProjectName("[PROJECT]");
   *   UrlMap urlMap = UrlMap.newBuilder().build();
   *   InsertUrlMapHttpRequest request = InsertUrlMapHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setUrlMap(urlMap)
   *     .build();
   *   Operation response = urlMapClient.insertUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertUrlMap(InsertUrlMapHttpRequest request) {
    return insertUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a UrlMap resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedProject = UrlMapClient.formatProjectName("[PROJECT]");
   *   UrlMap urlMap = UrlMap.newBuilder().build();
   *   InsertUrlMapHttpRequest request = InsertUrlMapHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setUrlMap(urlMap)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = urlMapClient.insertUrlMapCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertUrlMapHttpRequest, Operation> insertUrlMapCallable() {
    return stub.insertUrlMapCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
   *   CacheInvalidationRule cacheInvalidationRule = CacheInvalidationRule.newBuilder().build();
   *   Operation response = urlMapClient.invalidateCacheUrlMap(urlMap, cacheInvalidationRule);
   * }
   * </code></pre>
   *
   * @param urlMap Name of the UrlMap scoping this request.
   * @param cacheInvalidationRuleResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation invalidateCacheUrlMap(UrlMapName urlMap, CacheInvalidationRule cacheInvalidationRuleResource) {

    InvalidateCacheUrlMapHttpRequest request =
        InvalidateCacheUrlMapHttpRequest.newBuilder()
        .setUrlMapWithUrlMapName(urlMap)
        .setCacheInvalidationRuleResource(cacheInvalidationRuleResource)
        .build();
    return invalidateCacheUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   CacheInvalidationRule cacheInvalidationRule = CacheInvalidationRule.newBuilder().build();
   *   InvalidateCacheUrlMapHttpRequest request = InvalidateCacheUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .setCacheInvalidationRule(cacheInvalidationRule)
   *     .build();
   *   Operation response = urlMapClient.invalidateCacheUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation invalidateCacheUrlMap(InvalidateCacheUrlMapHttpRequest request) {
    return invalidateCacheUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   CacheInvalidationRule cacheInvalidationRule = CacheInvalidationRule.newBuilder().build();
   *   InvalidateCacheUrlMapHttpRequest request = InvalidateCacheUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .setCacheInvalidationRule(cacheInvalidationRule)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = urlMapClient.invalidateCacheUrlMapCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InvalidateCacheUrlMapHttpRequest, Operation> invalidateCacheUrlMapCallable() {
    return stub.invalidateCacheUrlMapCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of UrlMap resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (UrlMap element : urlMapClient.listUrlMaps(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListUrlMapsPagedResponse listUrlMaps(ProjectName project) {
    ListUrlMapsHttpRequest request =
        ListUrlMapsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listUrlMaps(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of UrlMap resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedProject = UrlMapClient.formatProjectName("[PROJECT]");
   *   ListUrlMapsHttpRequest request = ListUrlMapsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (UrlMap element : urlMapClient.listUrlMaps(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListUrlMapsPagedResponse listUrlMaps(ListUrlMapsHttpRequest request) {
    return listUrlMapsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of UrlMap resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedProject = UrlMapClient.formatProjectName("[PROJECT]");
   *   ListUrlMapsHttpRequest request = ListUrlMapsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListUrlMapsPagedResponse&gt; future = urlMapClient.listUrlMapsPagedCallable().futureCall(request);
   *   // Do something
   *   for (UrlMap element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListUrlMapsHttpRequest, ListUrlMapsPagedResponse> listUrlMapsPagedCallable() {
    return stub.listUrlMapsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of UrlMap resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedProject = UrlMapClient.formatProjectName("[PROJECT]");
   *   ListUrlMapsHttpRequest request = ListUrlMapsHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     UrlMapList response = urlMapClient.listUrlMapsCallable().call(request);
   *     for (UrlMap element : response.getItems()) {
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
  public final UnaryCallable<ListUrlMapsHttpRequest, UrlMapList> listUrlMapsCallable() {
    return stub.listUrlMapsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified UrlMap resource with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
   *   Operation response = urlMapClient.patchUrlMap(urlMap);
   * }
   * </code></pre>
   *
   * @param urlMap Name of the UrlMap resource to update.
   * @param urlMapResource A UrlMap resource. This resource defines the mapping from URL to the BackendService resource, based on the "longest-match" of the URL's host and path.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchUrlMap(UrlMapName urlMap, UrlMap urlMapResource) {

    PatchUrlMapHttpRequest request =
        PatchUrlMapHttpRequest.newBuilder()
        .setUrlMapWithUrlMapName(urlMap)
        .setUrlMapResource(urlMapResource)
        .build();
    return patchUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified UrlMap resource with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   PatchUrlMapHttpRequest request = PatchUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   Operation response = urlMapClient.patchUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchUrlMap(PatchUrlMapHttpRequest request) {
    return patchUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified UrlMap resource with the data included in the request. This method supports patch semantics.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   PatchUrlMapHttpRequest request = PatchUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = urlMapClient.patchUrlMapCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchUrlMapHttpRequest, Operation> patchUrlMapCallable() {
    return stub.patchUrlMapCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified UrlMap resource with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
   *   Operation response = urlMapClient.updateUrlMap(urlMap);
   * }
   * </code></pre>
   *
   * @param urlMap Name of the UrlMap resource to update.
   * @param urlMapResource A UrlMap resource. This resource defines the mapping from URL to the BackendService resource, based on the "longest-match" of the URL's host and path.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateUrlMap(UrlMapName urlMap, UrlMap urlMapResource) {

    UpdateUrlMapHttpRequest request =
        UpdateUrlMapHttpRequest.newBuilder()
        .setUrlMapWithUrlMapName(urlMap)
        .setUrlMapResource(urlMapResource)
        .build();
    return updateUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified UrlMap resource with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   UpdateUrlMapHttpRequest request = UpdateUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   Operation response = urlMapClient.updateUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateUrlMap(UpdateUrlMapHttpRequest request) {
    return updateUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified UrlMap resource with the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   UpdateUrlMapHttpRequest request = UpdateUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = urlMapClient.updateUrlMapCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateUrlMapHttpRequest, Operation> updateUrlMapCallable() {
    return stub.updateUrlMapCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
   *   UrlMapsValidateRequest urlMapsValidateRequest = UrlMapsValidateRequest.newBuilder().build();
   *   UrlMapsValidateResponse response = urlMapClient.validateUrlMap(urlMap, urlMapsValidateRequest);
   * }
   * </code></pre>
   *
   * @param urlMap Name of the UrlMap resource to be validated as.
   * @param urlMapsValidateRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final UrlMapsValidateResponse validateUrlMap(UrlMapName urlMap, UrlMapsValidateRequest urlMapsValidateRequestResource) {

    ValidateUrlMapHttpRequest request =
        ValidateUrlMapHttpRequest.newBuilder()
        .setUrlMapWithUrlMapName(urlMap)
        .setUrlMapsValidateRequestResource(urlMapsValidateRequestResource)
        .build();
    return validateUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   UrlMapsValidateRequest urlMapsValidateRequest = UrlMapsValidateRequest.newBuilder().build();
   *   ValidateUrlMapHttpRequest request = ValidateUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .setUrlMapsValidateRequest(urlMapsValidateRequest)
   *     .build();
   *   UrlMapsValidateResponse response = urlMapClient.validateUrlMap(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final UrlMapsValidateResponse validateUrlMap(ValidateUrlMapHttpRequest request) {
    return validateUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap.
   *
   * Sample code:
   * <pre><code>
   * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
   *   String formattedUrlMap = UrlMapClient.formatUrlMapName("[PROJECT]", "[URL_MAP]");
   *   UrlMapsValidateRequest urlMapsValidateRequest = UrlMapsValidateRequest.newBuilder().build();
   *   ValidateUrlMapHttpRequest request = ValidateUrlMapHttpRequest.newBuilder()
   *     .setUrlMap(formattedUrlMap)
   *     .setUrlMapsValidateRequest(urlMapsValidateRequest)
   *     .build();
   *   ApiFuture&lt;UrlMapsValidateResponse&gt; future = urlMapClient.validateUrlMapCallable().futureCall(request);
   *   // Do something
   *   UrlMapsValidateResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ValidateUrlMapHttpRequest, UrlMapsValidateResponse> validateUrlMapCallable() {
    return stub.validateUrlMapCallable();
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