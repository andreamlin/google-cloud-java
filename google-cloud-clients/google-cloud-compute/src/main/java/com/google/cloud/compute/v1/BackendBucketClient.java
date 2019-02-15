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
import com.google.cloud.compute.v1.stub.BackendBucketStub;
import com.google.cloud.compute.v1.stub.BackendBucketStubSettings;
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
 * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
 *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
 *   BackendBucket response = backendBucketClient.getBackendBucket(backendBucket);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the backendBucketClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of BackendBucketSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * BackendBucketSettings backendBucketSettings =
 *     BackendBucketSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BackendBucketClient backendBucketClient =
 *     BackendBucketClient.create(backendBucketSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * BackendBucketSettings backendBucketSettings =
 *     BackendBucketSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BackendBucketClient backendBucketClient =
 *     BackendBucketClient.create(backendBucketSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class BackendBucketClient implements BackgroundResource {
  private final BackendBucketSettings settings;
  private final BackendBucketStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of BackendBucketClient with default settings. */
  public static final BackendBucketClient create() throws IOException {
    return create(BackendBucketSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BackendBucketClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BackendBucketClient create(BackendBucketSettings settings)
      throws IOException {
    return new BackendBucketClient(settings);
  }

  /**
   * Constructs an instance of BackendBucketClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use BackendBucketSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BackendBucketClient create(BackendBucketStub stub) {
    return new BackendBucketClient(stub);
  }

  /**
   * Constructs an instance of BackendBucketClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected BackendBucketClient(BackendBucketSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BackendBucketStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BackendBucketClient(BackendBucketStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final BackendBucketSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BackendBucketStub getStub() {
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
   * Adds a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
   *   backendBucketClient.addSignedUrlKeyBackendBucketAsync(backendBucket, signedUrlKeyResource).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to which the Signed URL Key should be
   *     added. The name should conform to RFC1035.
   * @param signedUrlKeyResource Represents a customer-supplied Signing Key used by Cloud CDN Signed
   *     URLs
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addSignedUrlKeyBackendBucketAsync(
      ProjectGlobalBackendBucketName backendBucket, SignedUrlKey signedUrlKeyResource) {

    AddSignedUrlKeyBackendBucketHttpRequest request =
        AddSignedUrlKeyBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket == null ? null : backendBucket.toString())
            .setSignedUrlKeyResource(signedUrlKeyResource)
            .build();
    return addSignedUrlKeyBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
   *   backendBucketClient.addSignedUrlKeyBackendBucketAsync(backendBucket.toString(), signedUrlKeyResource).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to which the Signed URL Key should be
   *     added. The name should conform to RFC1035.
   * @param signedUrlKeyResource Represents a customer-supplied Signing Key used by Cloud CDN Signed
   *     URLs
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addSignedUrlKeyBackendBucketAsync(
      String backendBucket, SignedUrlKey signedUrlKeyResource) {

    AddSignedUrlKeyBackendBucketHttpRequest request =
        AddSignedUrlKeyBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket)
            .setSignedUrlKeyResource(signedUrlKeyResource)
            .build();
    return addSignedUrlKeyBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
   *   AddSignedUrlKeyBackendBucketHttpRequest request = AddSignedUrlKeyBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setSignedUrlKeyResource(signedUrlKeyResource)
   *     .build();
   *   backendBucketClient.addSignedUrlKeyBackendBucketAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addSignedUrlKeyBackendBucketAsync(
      AddSignedUrlKeyBackendBucketHttpRequest request) {
    return addSignedUrlKeyBackendBucketOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
   *   AddSignedUrlKeyBackendBucketHttpRequest request = AddSignedUrlKeyBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setSignedUrlKeyResource(signedUrlKeyResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = backendBucketClient.addSignedUrlKeyBackendBucketOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          AddSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      addSignedUrlKeyBackendBucketOperationCallable() {
    return stub.addSignedUrlKeyBackendBucketOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
   *   AddSignedUrlKeyBackendBucketHttpRequest request = AddSignedUrlKeyBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setSignedUrlKeyResource(signedUrlKeyResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendBucketClient.addSignedUrlKeyBackendBucketCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddSignedUrlKeyBackendBucketHttpRequest, Operation>
      addSignedUrlKeyBackendBucketCallable() {
    return stub.addSignedUrlKeyBackendBucketCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendBucket resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   backendBucketClient.deleteBackendBucketAsync(backendBucket).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteBackendBucketAsync(
      ProjectGlobalBackendBucketName backendBucket) {

    DeleteBackendBucketHttpRequest request =
        DeleteBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket == null ? null : backendBucket.toString())
            .build();
    return deleteBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendBucket resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   backendBucketClient.deleteBackendBucketAsync(backendBucket.toString()).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteBackendBucketAsync(
      String backendBucket) {

    DeleteBackendBucketHttpRequest request =
        DeleteBackendBucketHttpRequest.newBuilder().setBackendBucket(backendBucket).build();
    return deleteBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendBucket resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   DeleteBackendBucketHttpRequest request = DeleteBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .build();
   *   backendBucketClient.deleteBackendBucketAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteBackendBucketAsync(
      DeleteBackendBucketHttpRequest request) {
    return deleteBackendBucketOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendBucket resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   DeleteBackendBucketHttpRequest request = DeleteBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = backendBucketClient.deleteBackendBucketOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      deleteBackendBucketOperationCallable() {
    return stub.deleteBackendBucketOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified BackendBucket resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   DeleteBackendBucketHttpRequest request = DeleteBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendBucketClient.deleteBackendBucketCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteBackendBucketHttpRequest, Operation>
      deleteBackendBucketCallable() {
    return stub.deleteBackendBucketCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   String keyName = "";
   *   backendBucketClient.deleteSignedUrlKeyBackendBucketAsync(backendBucket, keyName).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to which the Signed URL Key should be
   *     added. The name should conform to RFC1035.
   * @param keyName The name of the Signed URL Key to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSignedUrlKeyBackendBucketAsync(
      ProjectGlobalBackendBucketName backendBucket, String keyName) {

    DeleteSignedUrlKeyBackendBucketHttpRequest request =
        DeleteSignedUrlKeyBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket == null ? null : backendBucket.toString())
            .setKeyName(keyName)
            .build();
    return deleteSignedUrlKeyBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   String keyName = "";
   *   backendBucketClient.deleteSignedUrlKeyBackendBucketAsync(backendBucket.toString(), keyName).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to which the Signed URL Key should be
   *     added. The name should conform to RFC1035.
   * @param keyName The name of the Signed URL Key to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSignedUrlKeyBackendBucketAsync(
      String backendBucket, String keyName) {

    DeleteSignedUrlKeyBackendBucketHttpRequest request =
        DeleteSignedUrlKeyBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket)
            .setKeyName(keyName)
            .build();
    return deleteSignedUrlKeyBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   String keyName = "";
   *   DeleteSignedUrlKeyBackendBucketHttpRequest request = DeleteSignedUrlKeyBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setKeyName(keyName)
   *     .build();
   *   backendBucketClient.deleteSignedUrlKeyBackendBucketAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSignedUrlKeyBackendBucketAsync(
      DeleteSignedUrlKeyBackendBucketHttpRequest request) {
    return deleteSignedUrlKeyBackendBucketOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   String keyName = "";
   *   DeleteSignedUrlKeyBackendBucketHttpRequest request = DeleteSignedUrlKeyBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setKeyName(keyName)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = backendBucketClient.deleteSignedUrlKeyBackendBucketOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          DeleteSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      deleteSignedUrlKeyBackendBucketOperationCallable() {
    return stub.deleteSignedUrlKeyBackendBucketOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a key for validating requests with signed URLs for this backend bucket.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   String keyName = "";
   *   DeleteSignedUrlKeyBackendBucketHttpRequest request = DeleteSignedUrlKeyBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setKeyName(keyName)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendBucketClient.deleteSignedUrlKeyBackendBucketCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSignedUrlKeyBackendBucketHttpRequest, Operation>
      deleteSignedUrlKeyBackendBucketCallable() {
    return stub.deleteSignedUrlKeyBackendBucketCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendBucket resource. Gets a list of available backend buckets by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket response = backendBucketClient.getBackendBucket(backendBucket);
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendBucket getBackendBucket(ProjectGlobalBackendBucketName backendBucket) {

    GetBackendBucketHttpRequest request =
        GetBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket == null ? null : backendBucket.toString())
            .build();
    return getBackendBucket(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendBucket resource. Gets a list of available backend buckets by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket response = backendBucketClient.getBackendBucket(backendBucket.toString());
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendBucket getBackendBucket(String backendBucket) {

    GetBackendBucketHttpRequest request =
        GetBackendBucketHttpRequest.newBuilder().setBackendBucket(backendBucket).build();
    return getBackendBucket(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendBucket resource. Gets a list of available backend buckets by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   GetBackendBucketHttpRequest request = GetBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .build();
   *   BackendBucket response = backendBucketClient.getBackendBucket(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final BackendBucket getBackendBucket(GetBackendBucketHttpRequest request) {
    return getBackendBucketCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified BackendBucket resource. Gets a list of available backend buckets by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   GetBackendBucketHttpRequest request = GetBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .build();
   *   ApiFuture&lt;BackendBucket&gt; future = backendBucketClient.getBackendBucketCallable().futureCall(request);
   *   // Do something
   *   BackendBucket response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetBackendBucketHttpRequest, BackendBucket>
      getBackendBucketCallable() {
    return stub.getBackendBucketCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendBucket resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   backendBucketClient.insertBackendBucketAsync(project, backendBucketResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param backendBucketResource A BackendBucket resource. This resource defines a Cloud Storage
   *     bucket.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertBackendBucketAsync(
      ProjectName project, BackendBucket backendBucketResource) {

    InsertBackendBucketHttpRequest request =
        InsertBackendBucketHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setBackendBucketResource(backendBucketResource)
            .build();
    return insertBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendBucket resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   backendBucketClient.insertBackendBucketAsync(project.toString(), backendBucketResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param backendBucketResource A BackendBucket resource. This resource defines a Cloud Storage
   *     bucket.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertBackendBucketAsync(
      String project, BackendBucket backendBucketResource) {

    InsertBackendBucketHttpRequest request =
        InsertBackendBucketHttpRequest.newBuilder()
            .setProject(project)
            .setBackendBucketResource(backendBucketResource)
            .build();
    return insertBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendBucket resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   InsertBackendBucketHttpRequest request = InsertBackendBucketHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .build();
   *   backendBucketClient.insertBackendBucketAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertBackendBucketAsync(
      InsertBackendBucketHttpRequest request) {
    return insertBackendBucketOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendBucket resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   InsertBackendBucketHttpRequest request = InsertBackendBucketHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = backendBucketClient.insertBackendBucketOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      insertBackendBucketOperationCallable() {
    return stub.insertBackendBucketOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a BackendBucket resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   InsertBackendBucketHttpRequest request = InsertBackendBucketHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendBucketClient.insertBackendBucketCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertBackendBucketHttpRequest, Operation>
      insertBackendBucketCallable() {
    return stub.insertBackendBucketCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendBucket resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (BackendBucket element : backendBucketClient.listBackendBuckets(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListBackendBucketsPagedResponse listBackendBuckets(ProjectName project) {
    ListBackendBucketsHttpRequest request =
        ListBackendBucketsHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listBackendBuckets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendBucket resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (BackendBucket element : backendBucketClient.listBackendBuckets(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListBackendBucketsPagedResponse listBackendBuckets(String project) {
    ListBackendBucketsHttpRequest request =
        ListBackendBucketsHttpRequest.newBuilder().setProject(project).build();
    return listBackendBuckets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendBucket resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListBackendBucketsHttpRequest request = ListBackendBucketsHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (BackendBucket element : backendBucketClient.listBackendBuckets(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListBackendBucketsPagedResponse listBackendBuckets(
      ListBackendBucketsHttpRequest request) {
    return listBackendBucketsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendBucket resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListBackendBucketsHttpRequest request = ListBackendBucketsHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListBackendBucketsPagedResponse&gt; future = backendBucketClient.listBackendBucketsPagedCallable().futureCall(request);
   *   // Do something
   *   for (BackendBucket element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListBackendBucketsHttpRequest, ListBackendBucketsPagedResponse>
      listBackendBucketsPagedCallable() {
    return stub.listBackendBucketsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of BackendBucket resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListBackendBucketsHttpRequest request = ListBackendBucketsHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     BackendBucketList response = backendBucketClient.listBackendBucketsCallable().call(request);
   *     for (BackendBucket element : response.getItemsList()) {
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
  public final UnaryCallable<ListBackendBucketsHttpRequest, BackendBucketList>
      listBackendBucketsCallable() {
    return stub.listBackendBucketsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request. This method
   * supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   backendBucketClient.patchBackendBucketAsync(backendBucket, backendBucketResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to patch.
   * @param backendBucketResource A BackendBucket resource. This resource defines a Cloud Storage
   *     bucket.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchBackendBucketAsync(
      ProjectGlobalBackendBucketName backendBucket,
      BackendBucket backendBucketResource,
      List<String> fieldMask) {

    PatchBackendBucketHttpRequest request =
        PatchBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket == null ? null : backendBucket.toString())
            .setBackendBucketResource(backendBucketResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request. This method
   * supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   backendBucketClient.patchBackendBucketAsync(backendBucket.toString(), backendBucketResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to patch.
   * @param backendBucketResource A BackendBucket resource. This resource defines a Cloud Storage
   *     bucket.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchBackendBucketAsync(
      String backendBucket, BackendBucket backendBucketResource, List<String> fieldMask) {

    PatchBackendBucketHttpRequest request =
        PatchBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket)
            .setBackendBucketResource(backendBucketResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request. This method
   * supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchBackendBucketHttpRequest request = PatchBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   backendBucketClient.patchBackendBucketAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchBackendBucketAsync(
      PatchBackendBucketHttpRequest request) {
    return patchBackendBucketOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request. This method
   * supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchBackendBucketHttpRequest request = PatchBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = backendBucketClient.patchBackendBucketOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<PatchBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      patchBackendBucketOperationCallable() {
    return stub.patchBackendBucketOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request. This method
   * supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchBackendBucketHttpRequest request = PatchBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendBucketClient.patchBackendBucketCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchBackendBucketHttpRequest, Operation>
      patchBackendBucketCallable() {
    return stub.patchBackendBucketCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   backendBucketClient.updateBackendBucketAsync(backendBucket, backendBucketResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to update.
   * @param backendBucketResource A BackendBucket resource. This resource defines a Cloud Storage
   *     bucket.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateBackendBucketAsync(
      ProjectGlobalBackendBucketName backendBucket,
      BackendBucket backendBucketResource,
      List<String> fieldMask) {

    UpdateBackendBucketHttpRequest request =
        UpdateBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket == null ? null : backendBucket.toString())
            .setBackendBucketResource(backendBucketResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   backendBucketClient.updateBackendBucketAsync(backendBucket.toString(), backendBucketResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param backendBucket Name of the BackendBucket resource to update.
   * @param backendBucketResource A BackendBucket resource. This resource defines a Cloud Storage
   *     bucket.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateBackendBucketAsync(
      String backendBucket, BackendBucket backendBucketResource, List<String> fieldMask) {

    UpdateBackendBucketHttpRequest request =
        UpdateBackendBucketHttpRequest.newBuilder()
            .setBackendBucket(backendBucket)
            .setBackendBucketResource(backendBucketResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateBackendBucketAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateBackendBucketHttpRequest request = UpdateBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   backendBucketClient.updateBackendBucketAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateBackendBucketAsync(
      UpdateBackendBucketHttpRequest request) {
    return updateBackendBucketOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateBackendBucketHttpRequest request = UpdateBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = backendBucketClient.updateBackendBucketOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<UpdateBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      updateBackendBucketOperationCallable() {
    return stub.updateBackendBucketOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified BackendBucket resource with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BackendBucketClient backendBucketClient = BackendBucketClient.create()) {
   *   ProjectGlobalBackendBucketName backendBucket = ProjectGlobalBackendBucketName.of("[PROJECT]", "[BACKEND_BUCKET]");
   *   BackendBucket backendBucketResource = BackendBucket.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateBackendBucketHttpRequest request = UpdateBackendBucketHttpRequest.newBuilder()
   *     .setBackendBucket(backendBucket.toString())
   *     .setBackendBucketResource(backendBucketResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = backendBucketClient.updateBackendBucketCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateBackendBucketHttpRequest, Operation>
      updateBackendBucketCallable() {
    return stub.updateBackendBucketCallable();
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

  public static class ListBackendBucketsPagedResponse
      extends AbstractPagedListResponse<
          ListBackendBucketsHttpRequest,
          BackendBucketList,
          BackendBucket,
          ListBackendBucketsPage,
          ListBackendBucketsFixedSizeCollection> {

    public static ApiFuture<ListBackendBucketsPagedResponse> createAsync(
        PageContext<ListBackendBucketsHttpRequest, BackendBucketList, BackendBucket> context,
        ApiFuture<BackendBucketList> futureResponse) {
      ApiFuture<ListBackendBucketsPage> futurePage =
          ListBackendBucketsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListBackendBucketsPage, ListBackendBucketsPagedResponse>() {
            @Override
            public ListBackendBucketsPagedResponse apply(ListBackendBucketsPage input) {
              return new ListBackendBucketsPagedResponse(input);
            }
          });
    }

    private ListBackendBucketsPagedResponse(ListBackendBucketsPage page) {
      super(page, ListBackendBucketsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListBackendBucketsPage
      extends AbstractPage<
          ListBackendBucketsHttpRequest, BackendBucketList, BackendBucket, ListBackendBucketsPage> {

    private ListBackendBucketsPage(
        PageContext<ListBackendBucketsHttpRequest, BackendBucketList, BackendBucket> context,
        BackendBucketList response) {
      super(context, response);
    }

    private static ListBackendBucketsPage createEmptyPage() {
      return new ListBackendBucketsPage(null, null);
    }

    @Override
    protected ListBackendBucketsPage createPage(
        PageContext<ListBackendBucketsHttpRequest, BackendBucketList, BackendBucket> context,
        BackendBucketList response) {
      return new ListBackendBucketsPage(context, response);
    }

    @Override
    public ApiFuture<ListBackendBucketsPage> createPageAsync(
        PageContext<ListBackendBucketsHttpRequest, BackendBucketList, BackendBucket> context,
        ApiFuture<BackendBucketList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListBackendBucketsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListBackendBucketsHttpRequest,
          BackendBucketList,
          BackendBucket,
          ListBackendBucketsPage,
          ListBackendBucketsFixedSizeCollection> {

    private ListBackendBucketsFixedSizeCollection(
        List<ListBackendBucketsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListBackendBucketsFixedSizeCollection createEmptyCollection() {
      return new ListBackendBucketsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListBackendBucketsFixedSizeCollection createCollection(
        List<ListBackendBucketsPage> pages, int collectionSize) {
      return new ListBackendBucketsFixedSizeCollection(pages, collectionSize);
    }
  }
}
