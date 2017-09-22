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
import com.google.compute.v1.stub.LicensAdminStub;
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
 * try (LicensAdminClient licensAdminClient = LicensAdminClient.create()) {
 *
 *   License response = licensAdminClient.getLicens();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the licensAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of LicensAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * LicensAdminSettings licensAdminSettings =
 *     LicensAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LicensAdminClient licensAdminClient =
 *     LicensAdminClient.create(licensAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * LicensAdminSettings licensAdminSettings =
 *     LicensAdminSettings.defaultBuilder()
 *         .setTransportProvider(LicensAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(LicensAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * LicensAdminClient licensAdminClient =
 *     LicensAdminClient.create(licensAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class LicensAdminClient implements BackgroundResource {
  private final LicensAdminSettings settings;
  private final LicensAdminStub stub;



  /**
   * Constructs an instance of LicensAdminClient with default settings.
   */
  public static final LicensAdminClient create() throws IOException {
    return create(LicensAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of LicensAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final LicensAdminClient create(LicensAdminSettings settings) throws IOException {
    return new LicensAdminClient(settings);
  }

  /**
   * Constructs an instance of LicensAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use LicensAdminSettings}.
   */
  public static final LicensAdminClient create(LicensAdminStub stub) {
    return new LicensAdminClient(stub);
  }

  /**
   * Constructs an instance of LicensAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected LicensAdminClient(LicensAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected LicensAdminClient(LicensAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LicensAdminSettings getSettings() {
    return settings;
  }

  public LicensAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource. Get a list of available licenses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (LicensAdminClient licensAdminClient = LicensAdminClient.create()) {
   *
   *   License response = licensAdminClient.getLicens();
   * }
   * </code></pre>
   *
   * @param license Name of the License resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final License getLicens(LicensesLicenseName license) {

    GetLicensHttpRequest request =
        GetLicensHttpRequest.newBuilder()
        .setLicenseWithLicensesLicenseName(license)
        .build();
    return getLicens(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource. Get a list of available licenses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (LicensAdminClient licensAdminClient = LicensAdminClient.create()) {
   *
   *   License response = licensAdminClient.getLicens();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final License getLicens(GetLicensHttpRequest request) {
    return getLicensCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource. Get a list of available licenses by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (LicensAdminClient licensAdminClient = LicensAdminClient.create()) {
   *
   *   ApiFuture&lt;License&gt; future = licensAdminClient.getLicensCallable().futureCall();
   *   // Do something
   *   License response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetLicensHttpRequest, License> getLicensCallable() {
    return stub.getLicensCallable();
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