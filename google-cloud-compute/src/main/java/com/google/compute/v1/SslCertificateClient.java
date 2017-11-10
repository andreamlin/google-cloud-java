/*
 * Copyright 2017, Google LLC All rights reserved.
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
import static com.google.compute.v1.PagedResponseWrappers.ListSslCertificatesPagedResponse;
import com.google.compute.v1.stub.SslCertificateStub;
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
 * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
 *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
 *   Operation response = sslCertificateClient.deleteSslCertificate(sslCertificate);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the sslCertificateClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of SslCertificateSettings to
 * create(). For example:
 *
 * To customize credentials:
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
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SslCertificateClient implements BackgroundResource {
  private final SslCertificateSettings settings;
  private final SslCertificateStub stub;



  /**
   * Constructs an instance of SslCertificateClient with default settings.
   */
  public static final SslCertificateClient create() throws IOException {
    return create(SslCertificateSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SslCertificateClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final SslCertificateClient create(SslCertificateSettings settings) throws IOException {
    return new SslCertificateClient(settings);
  }

  /**
   * Constructs an instance of SslCertificateClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use SslCertificateSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SslCertificateClient create(SslCertificateStub stub) {
    return new SslCertificateClient(stub);
  }

  /**
   * Constructs an instance of SslCertificateClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected SslCertificateClient(SslCertificateSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SslCertificateClient(SslCertificateStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SslCertificateSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SslCertificateStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   Operation response = sslCertificateClient.deleteSslCertificate(sslCertificate);
   * }
   * </code></pre>
   *
   * @param sslCertificate Name of the SslCertificate resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSslCertificate(SslCertificateName sslCertificate) {

    DeleteSslCertificateHttpRequest request =
        DeleteSslCertificateHttpRequest.newBuilder()
        .setSslCertificateWithSslCertificateName(sslCertificate)
        .build();
    return deleteSslCertificate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   DeleteSslCertificateHttpRequest request = DeleteSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificateWithSslCertificateName(sslCertificate)
   *     .build();
   *   Operation response = sslCertificateClient.deleteSslCertificate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSslCertificate(DeleteSslCertificateHttpRequest request) {
    return deleteSslCertificateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified SslCertificate resource.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   DeleteSslCertificateHttpRequest request = DeleteSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificateWithSslCertificateName(sslCertificate)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = sslCertificateClient.deleteSslCertificateCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateCallable() {
    return stub.deleteSslCertificateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   SslCertificate response = sslCertificateClient.getSslCertificate(sslCertificate);
   * }
   * </code></pre>
   *
   * @param sslCertificate Name of the SslCertificate resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SslCertificate getSslCertificate(SslCertificateName sslCertificate) {

    GetSslCertificateHttpRequest request =
        GetSslCertificateHttpRequest.newBuilder()
        .setSslCertificateWithSslCertificateName(sslCertificate)
        .build();
    return getSslCertificate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   GetSslCertificateHttpRequest request = GetSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificateWithSslCertificateName(sslCertificate)
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
   * Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   SslCertificateName sslCertificate = SslCertificateName.of("[PROJECT]", "[SSL_CERTIFICATE]");
   *   GetSslCertificateHttpRequest request = GetSslCertificateHttpRequest.newBuilder()
   *     .setSslCertificateWithSslCertificateName(sslCertificate)
   *     .build();
   *   ApiFuture&lt;SslCertificate&gt; future = sslCertificateClient.getSslCertificateCallable().futureCall(request);
   *   // Do something
   *   SslCertificate response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateCallable() {
    return stub.getSslCertificateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificate = SslCertificate.newBuilder().build();
   *   Operation response = sslCertificateClient.insertSslCertificate(project, sslCertificate);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param sslCertificateResource An SslCertificate resource. This resource provides a mechanism to upload an SSL key and certificate to the load balancer to serve secure connections from the user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSslCertificate(ProjectName project, SslCertificate sslCertificateResource) {

    InsertSslCertificateHttpRequest request =
        InsertSslCertificateHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setSslCertificateResource(sslCertificateResource)
        .build();
    return insertSslCertificate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificate = SslCertificate.newBuilder().build();
   *   InsertSslCertificateHttpRequest request = InsertSslCertificateHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setSslCertificateResource(sslCertificate)
   *     .build();
   *   Operation response = sslCertificateClient.insertSslCertificate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSslCertificate(InsertSslCertificateHttpRequest request) {
    return insertSslCertificateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a SslCertificate resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SslCertificate sslCertificate = SslCertificate.newBuilder().build();
   *   InsertSslCertificateHttpRequest request = InsertSslCertificateHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .setSslCertificateResource(sslCertificate)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = sslCertificateClient.insertSslCertificateCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertSslCertificateHttpRequest, Operation> insertSslCertificateCallable() {
    return stub.insertSslCertificateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * Sample code:
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
        .setProjectWithProjectName(project)
        .build();
    return listSslCertificates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
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
  public final ListSslCertificatesPagedResponse listSslCertificates(ListSslCertificatesHttpRequest request) {
    return listSslCertificatesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
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
  public final UnaryCallable<ListSslCertificatesHttpRequest, ListSslCertificatesPagedResponse> listSslCertificatesPagedCallable() {
    return stub.listSslCertificatesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of SslCertificate resources available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSslCertificatesHttpRequest request = ListSslCertificatesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     SslCertificateList response = sslCertificateClient.listSslCertificatesCallable().call(request);
   *     for (SslCertificate element : response.getItems()) {
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
  public final UnaryCallable<ListSslCertificatesHttpRequest, SslCertificateList> listSslCertificatesCallable() {
    return stub.listSslCertificatesCallable();
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