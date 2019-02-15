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
import com.google.cloud.compute.v1.stub.SslCertificateStub;
import com.google.cloud.compute.v1.stub.SslCertificateStubSettings;
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
 * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
 *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
 *   SslCertificate response = sslCertificateClient.getSslCertificate(sslCertificate);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the sslCertificateClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of SslCertificateSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * SslCertificateSettings sslCertificateSettings =
 *     SslCertificateSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SslCertificateClient sslCertificateClient =
 *     SslCertificateClient.create(sslCertificateSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SslCertificateSettings sslCertificateSettings =
 *     SslCertificateSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SslCertificateClient sslCertificateClient =
 *     SslCertificateClient.create(sslCertificateSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SslCertificateClient implements BackgroundResource {
  private final SslCertificateSettings settings;
  private final SslCertificateStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of SslCertificateClient with default settings. */
  public static final SslCertificateClient create() throws IOException {
    return create(SslCertificateSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SslCertificateClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SslCertificateClient create(SslCertificateSettings settings)
      throws IOException {
    return new SslCertificateClient(settings);
  }

  /**
   * Constructs an instance of SslCertificateClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use SslCertificateSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SslCertificateClient create(SslCertificateStub stub) {
    return new SslCertificateClient(stub);
  }

  /**
   * Constructs an instance of SslCertificateClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SslCertificateClient(SslCertificateSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SslCertificateStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SslCertificateClient(SslCertificateStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final SslCertificateSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SslCertificateStub getStub() {
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
   * Deletes the specified SslCertificate resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   sslCertificateClient.deleteSslCertificateAsync(sslCertificate).get();
   * }
   * </code></pre>
   *
   * @param sslCertificate Name of the SslCertificate resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSslCertificateAsync(
      ProjectGlobalSslCertificateName sslCertificate) {

    DeleteSslCertificateHttpRequest request =
        DeleteSslCertificateHttpRequest.newBuilder()
            .setSslCertificate(sslCertificate == null ? null : sslCertificate.toString())
            .build();
    return deleteSslCertificateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   sslCertificateClient.deleteSslCertificateAsync(sslCertificate.toString()).get();
   * }
   * </code></pre>
   *
   * @param sslCertificate Name of the SslCertificate resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSslCertificateAsync(
      String sslCertificate) {

    DeleteSslCertificateHttpRequest request =
        DeleteSslCertificateHttpRequest.newBuilder().setSslCertificate(sslCertificate).build();
    return deleteSslCertificateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   DeleteSslCertificateHttpRequest request = DeleteSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificate(sslCertificate.toString())
   *     .build();
   *   sslCertificateClient.deleteSslCertificateAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSslCertificateAsync(
      DeleteSslCertificateHttpRequest request) {
    return deleteSslCertificateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   DeleteSslCertificateHttpRequest request = DeleteSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificate(sslCertificate.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = sslCertificateClient.deleteSslCertificateOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteSslCertificateHttpRequest, EmptyMessage, EmptyMessage>
      deleteSslCertificateOperationCallable() {
    return stub.deleteSslCertificateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   DeleteSslCertificateHttpRequest request = DeleteSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificate(sslCertificate.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = sslCertificateClient.deleteSslCertificateCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSslCertificateHttpRequest, Operation>
      deleteSslCertificateCallable() {
    return stub.deleteSslCertificateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified SslCertificate resource. Gets a list of available SSL certificates by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   SslCertificate response = sslCertificateClient.getSslCertificate(sslCertificate);
   * }
   * </code></pre>
   *
   * @param sslCertificate Name of the SslCertificate resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SslCertificate getSslCertificate(ProjectGlobalSslCertificateName sslCertificate) {

    GetSslCertificateHttpRequest request =
        GetSslCertificateHttpRequest.newBuilder()
            .setSslCertificate(sslCertificate == null ? null : sslCertificate.toString())
            .build();
    return getSslCertificate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified SslCertificate resource. Gets a list of available SSL certificates by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   SslCertificate response = sslCertificateClient.getSslCertificate(sslCertificate.toString());
   * }
   * </code></pre>
   *
   * @param sslCertificate Name of the SslCertificate resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SslCertificate getSslCertificate(String sslCertificate) {

    GetSslCertificateHttpRequest request =
        GetSslCertificateHttpRequest.newBuilder().setSslCertificate(sslCertificate).build();
    return getSslCertificate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified SslCertificate resource. Gets a list of available SSL certificates by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   GetSslCertificateHttpRequest request = GetSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificate(sslCertificate.toString())
   *     .build();
   *   SslCertificate response = sslCertificateClient.getSslCertificate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SslCertificate getSslCertificate(GetSslCertificateHttpRequest request) {
    return getSslCertificateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified SslCertificate resource. Gets a list of available SSL certificates by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectGlobalSslCertificateName sslCertificate = ProjectGlobalSslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   GetSslCertificateHttpRequest request = GetSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificate(sslCertificate.toString())
   *     .build();
   *   ApiFuture&lt;SslCertificate&gt; future = sslCertificateClient.getSslCertificateCallable().futureCall(request);
   *   // Do something
   *   SslCertificate response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSslCertificateHttpRequest, SslCertificate>
      getSslCertificateCallable() {
    return stub.getSslCertificateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
   *   sslCertificateClient.insertSslCertificateAsync(project, sslCertificateResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param sslCertificateResource An SslCertificate resource. This resource provides a mechanism to
   *     upload an SSL key and certificate to the load balancer to serve secure connections from the
   *     user. (== resource_for beta.sslCertificates ==) (== resource_for v1.sslCertificates ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertSslCertificateAsync(
      ProjectName project, SslCertificate sslCertificateResource) {

    InsertSslCertificateHttpRequest request =
        InsertSslCertificateHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setSslCertificateResource(sslCertificateResource)
            .build();
    return insertSslCertificateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
   *   sslCertificateClient.insertSslCertificateAsync(project.toString(), sslCertificateResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param sslCertificateResource An SslCertificate resource. This resource provides a mechanism to
   *     upload an SSL key and certificate to the load balancer to serve secure connections from the
   *     user. (== resource_for beta.sslCertificates ==) (== resource_for v1.sslCertificates ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertSslCertificateAsync(
      String project, SslCertificate sslCertificateResource) {

    InsertSslCertificateHttpRequest request =
        InsertSslCertificateHttpRequest.newBuilder()
            .setProject(project)
            .setSslCertificateResource(sslCertificateResource)
            .build();
    return insertSslCertificateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
   *   InsertSslCertificateHttpRequest request = InsertSslCertificateHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setSslCertificateResource(sslCertificateResource)
   *     .build();
   *   sslCertificateClient.insertSslCertificateAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertSslCertificateAsync(
      InsertSslCertificateHttpRequest request) {
    return insertSslCertificateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
   *   InsertSslCertificateHttpRequest request = InsertSslCertificateHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setSslCertificateResource(sslCertificateResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = sslCertificateClient.insertSslCertificateOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertSslCertificateHttpRequest, EmptyMessage, EmptyMessage>
      insertSslCertificateOperationCallable() {
    return stub.insertSslCertificateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
   *   InsertSslCertificateHttpRequest request = InsertSslCertificateHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setSslCertificateResource(sslCertificateResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = sslCertificateClient.insertSslCertificateCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertSslCertificateHttpRequest, Operation>
      insertSslCertificateCallable() {
    return stub.insertSslCertificateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (SslCertificate element : sslCertificateClient.listSslCertificates(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSslCertificatesPagedResponse listSslCertificates(ProjectName project) {
    ListSslCertificatesHttpRequest request =
        ListSslCertificatesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listSslCertificates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (SslCertificate element : sslCertificateClient.listSslCertificates(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSslCertificatesPagedResponse listSslCertificates(String project) {
    ListSslCertificatesHttpRequest request =
        ListSslCertificatesHttpRequest.newBuilder().setProject(project).build();
    return listSslCertificates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (SslCertificate element : sslCertificateClient.listSslCertificates(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSslCertificatesPagedResponse listSslCertificates(
      ListSslCertificatesHttpRequest request) {
    return listSslCertificatesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListSslCertificatesPagedResponse&gt; future = sslCertificateClient.listSslCertificatesPagedCallable().futureCall(request);
   *   // Do something
   *   for (SslCertificate element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSslCertificatesHttpRequest, ListSslCertificatesPagedResponse>
      listSslCertificatesPagedCallable() {
    return stub.listSslCertificatesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     SslCertificateList response = sslCertificateClient.listSslCertificatesCallable().call(request);
   *     for (SslCertificate element : response.getItemsList()) {
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
  public final UnaryCallable<ListSslCertificatesHttpRequest, SslCertificateList>
      listSslCertificatesCallable() {
    return stub.listSslCertificatesCallable();
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

  public static class ListSslCertificatesPagedResponse
      extends AbstractPagedListResponse<
          ListSslCertificatesHttpRequest,
          SslCertificateList,
          SslCertificate,
          ListSslCertificatesPage,
          ListSslCertificatesFixedSizeCollection> {

    public static ApiFuture<ListSslCertificatesPagedResponse> createAsync(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        ApiFuture<SslCertificateList> futureResponse) {
      ApiFuture<ListSslCertificatesPage> futurePage =
          ListSslCertificatesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSslCertificatesPage, ListSslCertificatesPagedResponse>() {
            @Override
            public ListSslCertificatesPagedResponse apply(ListSslCertificatesPage input) {
              return new ListSslCertificatesPagedResponse(input);
            }
          });
    }

    private ListSslCertificatesPagedResponse(ListSslCertificatesPage page) {
      super(page, ListSslCertificatesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSslCertificatesPage
      extends AbstractPage<
          ListSslCertificatesHttpRequest,
          SslCertificateList,
          SslCertificate,
          ListSslCertificatesPage> {

    private ListSslCertificatesPage(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        SslCertificateList response) {
      super(context, response);
    }

    private static ListSslCertificatesPage createEmptyPage() {
      return new ListSslCertificatesPage(null, null);
    }

    @Override
    protected ListSslCertificatesPage createPage(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        SslCertificateList response) {
      return new ListSslCertificatesPage(context, response);
    }

    @Override
    public ApiFuture<ListSslCertificatesPage> createPageAsync(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        ApiFuture<SslCertificateList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSslCertificatesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSslCertificatesHttpRequest,
          SslCertificateList,
          SslCertificate,
          ListSslCertificatesPage,
          ListSslCertificatesFixedSizeCollection> {

    private ListSslCertificatesFixedSizeCollection(
        List<ListSslCertificatesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSslCertificatesFixedSizeCollection createEmptyCollection() {
      return new ListSslCertificatesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSslCertificatesFixedSizeCollection createCollection(
        List<ListSslCertificatesPage> pages, int collectionSize) {
      return new ListSslCertificatesFixedSizeCollection(pages, collectionSize);
    }
  }
}
