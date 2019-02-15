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
import com.google.cloud.compute.v1.stub.RegionBackendServiceStub;
import com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings;
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
 * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
 *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
 *   BackendService response = regionBackendServiceClient.getRegionBackendService(backendService);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionBackendServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of RegionBackendServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * RegionBackendServiceSettings regionBackendServiceSettings =
 *     RegionBackendServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionBackendServiceClient regionBackendServiceClient =
 *     RegionBackendServiceClient.create(regionBackendServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionBackendServiceSettings regionBackendServiceSettings =
 *     RegionBackendServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegionBackendServiceClient regionBackendServiceClient =
 *     RegionBackendServiceClient.create(regionBackendServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionBackendServiceClient implements BackgroundResource {
  private final RegionBackendServiceSettings settings;
  private final RegionBackendServiceStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of RegionBackendServiceClient with default settings. */
  public static final RegionBackendServiceClient create() throws IOException {
    return create(RegionBackendServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionBackendServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegionBackendServiceClient create(RegionBackendServiceSettings settings)
      throws IOException {
    return new RegionBackendServiceClient(settings);
  }

  /**
   * Constructs an instance of RegionBackendServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use RegionBackendServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RegionBackendServiceClient create(RegionBackendServiceStub stub) {
    return new RegionBackendServiceClient(stub);
  }

  /**
   * Constructs an instance of RegionBackendServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RegionBackendServiceClient(RegionBackendServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RegionBackendServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RegionBackendServiceClient(RegionBackendServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final RegionBackendServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionBackendServiceStub getStub() {
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
   * Deletes the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   regionBackendServiceClient.deleteRegionBackendServiceAsync(backendService).get();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteRegionBackendServiceAsync(
      ProjectRegionBackendServiceName backendService) {

    DeleteRegionBackendServiceHttpRequest request =
        DeleteRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService == null ? null : backendService.toString())
            .build();
    return deleteRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   regionBackendServiceClient.deleteRegionBackendServiceAsync(backendService.toString()).get();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteRegionBackendServiceAsync(
      String backendService) {

    DeleteRegionBackendServiceHttpRequest request =
        DeleteRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService)
            .build();
    return deleteRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   DeleteRegionBackendServiceHttpRequest request = DeleteRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   regionBackendServiceClient.deleteRegionBackendServiceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteRegionBackendServiceAsync(
      DeleteRegionBackendServiceHttpRequest request) {
    return deleteRegionBackendServiceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   DeleteRegionBackendServiceHttpRequest request = DeleteRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = regionBackendServiceClient.deleteRegionBackendServiceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteRegionBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      deleteRegionBackendServiceOperationCallable() {
    return stub.deleteRegionBackendServiceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   DeleteRegionBackendServiceHttpRequest request = DeleteRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceClient.deleteRegionBackendServiceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteRegionBackendServiceHttpRequest, Operation>
      deleteRegionBackendServiceCallable() {
    return stub.deleteRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService response = regionBackendServiceClient.getRegionBackendService(backendService);
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getRegionBackendService(
      ProjectRegionBackendServiceName backendService) {

    GetRegionBackendServiceHttpRequest request =
        GetRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService == null ? null : backendService.toString())
            .build();
    return getRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService response = regionBackendServiceClient.getRegionBackendService(backendService.toString());
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getRegionBackendService(String backendService) {

    GetRegionBackendServiceHttpRequest request =
        GetRegionBackendServiceHttpRequest.newBuilder().setBackendService(backendService).build();
    return getRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   GetRegionBackendServiceHttpRequest request = GetRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   BackendService response = regionBackendServiceClient.getRegionBackendService(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendService getRegionBackendService(GetRegionBackendServiceHttpRequest request) {
    return getRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified regional BackendService resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   GetRegionBackendServiceHttpRequest request = GetRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .build();
   *   ApiFuture&lt;BackendService&gt; future = regionBackendServiceClient.getRegionBackendServiceCallable().futureCall(request);
   *   // Do something
   *   BackendService response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRegionBackendServiceHttpRequest, BackendService>
      getRegionBackendServiceCallable() {
    return stub.getRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   BackendServiceGroupHealth response = regionBackendServiceClient.getHealthRegionBackendService(backendService, resourceGroupReferenceResource);
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource for which to get health.
   * @param resourceGroupReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthRegionBackendService(
      ProjectRegionBackendServiceName backendService,
      ResourceGroupReference resourceGroupReferenceResource) {

    GetHealthRegionBackendServiceHttpRequest request =
        GetHealthRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService == null ? null : backendService.toString())
            .setResourceGroupReferenceResource(resourceGroupReferenceResource)
            .build();
    return getHealthRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   BackendServiceGroupHealth response = regionBackendServiceClient.getHealthRegionBackendService(backendService.toString(), resourceGroupReferenceResource);
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource for which to get health.
   * @param resourceGroupReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthRegionBackendService(
      String backendService, ResourceGroupReference resourceGroupReferenceResource) {

    GetHealthRegionBackendServiceHttpRequest request =
        GetHealthRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService)
            .setResourceGroupReferenceResource(resourceGroupReferenceResource)
            .build();
    return getHealthRegionBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   GetHealthRegionBackendServiceHttpRequest request = GetHealthRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setResourceGroupReferenceResource(resourceGroupReferenceResource)
   *     .build();
   *   BackendServiceGroupHealth response = regionBackendServiceClient.getHealthRegionBackendService(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendServiceGroupHealth getHealthRegionBackendService(
      GetHealthRegionBackendServiceHttpRequest request) {
    return getHealthRegionBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the most recent health check results for this regional BackendService.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
   *   GetHealthRegionBackendServiceHttpRequest request = GetHealthRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setResourceGroupReferenceResource(resourceGroupReferenceResource)
   *     .build();
   *   ApiFuture&lt;BackendServiceGroupHealth&gt; future = regionBackendServiceClient.getHealthRegionBackendServiceCallable().futureCall(request);
   *   // Do something
   *   BackendServiceGroupHealth response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth>
      getHealthRegionBackendServiceCallable() {
    return stub.getHealthRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in
   * the request. There are several restrictions and guidelines to keep in mind when creating a
   * regional backend service. Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   regionBackendServiceClient.insertRegionBackendServiceAsync(region, backendServiceResource).get();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param backendServiceResource A BackendService resource. This resource defines a group of
   *     backend virtual machines and their serving capacity. (== resource_for v1.backendService ==)
   *     (== resource_for beta.backendService ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertRegionBackendServiceAsync(
      ProjectRegionName region, BackendService backendServiceResource) {

    InsertRegionBackendServiceHttpRequest request =
        InsertRegionBackendServiceHttpRequest.newBuilder()
            .setRegion(region == null ? null : region.toString())
            .setBackendServiceResource(backendServiceResource)
            .build();
    return insertRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in
   * the request. There are several restrictions and guidelines to keep in mind when creating a
   * regional backend service. Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   regionBackendServiceClient.insertRegionBackendServiceAsync(region.toString(), backendServiceResource).get();
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param backendServiceResource A BackendService resource. This resource defines a group of
   *     backend virtual machines and their serving capacity. (== resource_for v1.backendService ==)
   *     (== resource_for beta.backendService ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertRegionBackendServiceAsync(
      String region, BackendService backendServiceResource) {

    InsertRegionBackendServiceHttpRequest request =
        InsertRegionBackendServiceHttpRequest.newBuilder()
            .setRegion(region)
            .setBackendServiceResource(backendServiceResource)
            .build();
    return insertRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in
   * the request. There are several restrictions and guidelines to keep in mind when creating a
   * regional backend service. Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   InsertRegionBackendServiceHttpRequest request = InsertRegionBackendServiceHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   regionBackendServiceClient.insertRegionBackendServiceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertRegionBackendServiceAsync(
      InsertRegionBackendServiceHttpRequest request) {
    return insertRegionBackendServiceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in
   * the request. There are several restrictions and guidelines to keep in mind when creating a
   * regional backend service. Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   InsertRegionBackendServiceHttpRequest request = InsertRegionBackendServiceHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = regionBackendServiceClient.insertRegionBackendServiceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertRegionBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      insertRegionBackendServiceOperationCallable() {
    return stub.insertRegionBackendServiceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a regional BackendService resource in the specified project using the data included in
   * the request. There are several restrictions and guidelines to keep in mind when creating a
   * regional backend service. Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   InsertRegionBackendServiceHttpRequest request = InsertRegionBackendServiceHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceClient.insertRegionBackendServiceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertRegionBackendServiceHttpRequest, Operation>
      insertRegionBackendServiceCallable() {
    return stub.insertRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in
   * the given region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   for (BackendService element : regionBackendServiceClient.listRegionBackendServices(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionBackendServicesPagedResponse listRegionBackendServices(
      ProjectRegionName region) {
    ListRegionBackendServicesHttpRequest request =
        ListRegionBackendServicesHttpRequest.newBuilder()
            .setRegion(region == null ? null : region.toString())
            .build();
    return listRegionBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in
   * the given region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   for (BackendService element : regionBackendServiceClient.listRegionBackendServices(region.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionBackendServicesPagedResponse listRegionBackendServices(String region) {
    ListRegionBackendServicesHttpRequest request =
        ListRegionBackendServicesHttpRequest.newBuilder().setRegion(region).build();
    return listRegionBackendServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in
   * the given region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   ListRegionBackendServicesHttpRequest request = ListRegionBackendServicesHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .build();
   *   for (BackendService element : regionBackendServiceClient.listRegionBackendServices(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionBackendServicesPagedResponse listRegionBackendServices(
      ListRegionBackendServicesHttpRequest request) {
    return listRegionBackendServicesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in
   * the given region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   ListRegionBackendServicesHttpRequest request = ListRegionBackendServicesHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .build();
   *   ApiFuture&lt;ListRegionBackendServicesPagedResponse&gt; future = regionBackendServiceClient.listRegionBackendServicesPagedCallable().futureCall(request);
   *   // Do something
   *   for (BackendService element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          ListRegionBackendServicesHttpRequest, ListRegionBackendServicesPagedResponse>
      listRegionBackendServicesPagedCallable() {
    return stub.listRegionBackendServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of regional BackendService resources available to the specified project in
   * the given region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   ListRegionBackendServicesHttpRequest request = ListRegionBackendServicesHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .build();
   *   while (true) {
   *     BackendServiceList response = regionBackendServiceClient.listRegionBackendServicesCallable().call(request);
   *     for (BackendService element : response.getItemsList()) {
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
  public final UnaryCallable<ListRegionBackendServicesHttpRequest, BackendServiceList>
      listRegionBackendServicesCallable() {
    return stub.listRegionBackendServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   * uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   regionBackendServiceClient.patchRegionBackendServiceAsync(backendService, backendServiceResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to patch.
   * @param backendServiceResource A BackendService resource. This resource defines a group of
   *     backend virtual machines and their serving capacity. (== resource_for v1.backendService ==)
   *     (== resource_for beta.backendService ==)
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchRegionBackendServiceAsync(
      ProjectRegionBackendServiceName backendService,
      BackendService backendServiceResource,
      List<String> fieldMask) {

    PatchRegionBackendServiceHttpRequest request =
        PatchRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService == null ? null : backendService.toString())
            .setBackendServiceResource(backendServiceResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   * uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   regionBackendServiceClient.patchRegionBackendServiceAsync(backendService.toString(), backendServiceResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to patch.
   * @param backendServiceResource A BackendService resource. This resource defines a group of
   *     backend virtual machines and their serving capacity. (== resource_for v1.backendService ==)
   *     (== resource_for beta.backendService ==)
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchRegionBackendServiceAsync(
      String backendService, BackendService backendServiceResource, List<String> fieldMask) {

    PatchRegionBackendServiceHttpRequest request =
        PatchRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService)
            .setBackendServiceResource(backendServiceResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   * uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchRegionBackendServiceHttpRequest request = PatchRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   regionBackendServiceClient.patchRegionBackendServiceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchRegionBackendServiceAsync(
      PatchRegionBackendServiceHttpRequest request) {
    return patchRegionBackendServiceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   * uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchRegionBackendServiceHttpRequest request = PatchRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = regionBackendServiceClient.patchRegionBackendServiceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<PatchRegionBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      patchRegionBackendServiceOperationCallable() {
    return stub.patchRegionBackendServiceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   * uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchRegionBackendServiceHttpRequest request = PatchRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceClient.patchRegionBackendServiceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchRegionBackendServiceHttpRequest, Operation>
      patchRegionBackendServiceCallable() {
    return stub.patchRegionBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   regionBackendServiceClient.updateRegionBackendServiceAsync(backendService, backendServiceResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of
   *     backend virtual machines and their serving capacity. (== resource_for v1.backendService ==)
   *     (== resource_for beta.backendService ==)
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateRegionBackendServiceAsync(
      ProjectRegionBackendServiceName backendService,
      BackendService backendServiceResource,
      List<String> fieldMask) {

    UpdateRegionBackendServiceHttpRequest request =
        UpdateRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService == null ? null : backendService.toString())
            .setBackendServiceResource(backendServiceResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   regionBackendServiceClient.updateRegionBackendServiceAsync(backendService.toString(), backendServiceResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendService Name of the BackendService resource to update.
   * @param backendServiceResource A BackendService resource. This resource defines a group of
   *     backend virtual machines and their serving capacity. (== resource_for v1.backendService ==)
   *     (== resource_for beta.backendService ==)
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateRegionBackendServiceAsync(
      String backendService, BackendService backendServiceResource, List<String> fieldMask) {

    UpdateRegionBackendServiceHttpRequest request =
        UpdateRegionBackendServiceHttpRequest.newBuilder()
            .setBackendService(backendService)
            .setBackendServiceResource(backendServiceResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateRegionBackendServiceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateRegionBackendServiceHttpRequest request = UpdateRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   regionBackendServiceClient.updateRegionBackendServiceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateRegionBackendServiceAsync(
      UpdateRegionBackendServiceHttpRequest request) {
    return updateRegionBackendServiceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateRegionBackendServiceHttpRequest request = UpdateRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = regionBackendServiceClient.updateRegionBackendServiceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<UpdateRegionBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      updateRegionBackendServiceOperationCallable() {
    return stub.updateRegionBackendServiceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified regional BackendService resource with the data included in the request.
   * There are several restrictions and guidelines to keep in mind when updating a backend service.
   * Read Restrictions and Guidelines for more information.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
   *   ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
   *   BackendService backendServiceResource = BackendService.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateRegionBackendServiceHttpRequest request = UpdateRegionBackendServiceHttpRequest.newBuilder()
   *     .setBackendService(backendService.toString())
   *     .setBackendServiceResource(backendServiceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = regionBackendServiceClient.updateRegionBackendServiceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateRegionBackendServiceHttpRequest, Operation>
      updateRegionBackendServiceCallable() {
    return stub.updateRegionBackendServiceCallable();
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

  public static class ListRegionBackendServicesPagedResponse
      extends AbstractPagedListResponse<
          ListRegionBackendServicesHttpRequest,
          BackendServiceList,
          BackendService,
          ListRegionBackendServicesPage,
          ListRegionBackendServicesFixedSizeCollection> {

    public static ApiFuture<ListRegionBackendServicesPagedResponse> createAsync(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService>
            context,
        ApiFuture<BackendServiceList> futureResponse) {
      ApiFuture<ListRegionBackendServicesPage> futurePage =
          ListRegionBackendServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionBackendServicesPage, ListRegionBackendServicesPagedResponse>() {
            @Override
            public ListRegionBackendServicesPagedResponse apply(
                ListRegionBackendServicesPage input) {
              return new ListRegionBackendServicesPagedResponse(input);
            }
          });
    }

    private ListRegionBackendServicesPagedResponse(ListRegionBackendServicesPage page) {
      super(page, ListRegionBackendServicesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRegionBackendServicesPage
      extends AbstractPage<
          ListRegionBackendServicesHttpRequest,
          BackendServiceList,
          BackendService,
          ListRegionBackendServicesPage> {

    private ListRegionBackendServicesPage(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService>
            context,
        BackendServiceList response) {
      super(context, response);
    }

    private static ListRegionBackendServicesPage createEmptyPage() {
      return new ListRegionBackendServicesPage(null, null);
    }

    @Override
    protected ListRegionBackendServicesPage createPage(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService>
            context,
        BackendServiceList response) {
      return new ListRegionBackendServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionBackendServicesPage> createPageAsync(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService>
            context,
        ApiFuture<BackendServiceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRegionBackendServicesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRegionBackendServicesHttpRequest,
          BackendServiceList,
          BackendService,
          ListRegionBackendServicesPage,
          ListRegionBackendServicesFixedSizeCollection> {

    private ListRegionBackendServicesFixedSizeCollection(
        List<ListRegionBackendServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionBackendServicesFixedSizeCollection createEmptyCollection() {
      return new ListRegionBackendServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionBackendServicesFixedSizeCollection createCollection(
        List<ListRegionBackendServicesPage> pages, int collectionSize) {
      return new ListRegionBackendServicesFixedSizeCollection(pages, collectionSize);
    }
  }
}
