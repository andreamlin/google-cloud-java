/*
 * Copyright 2018 Google LLC
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
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.paging.FixedSizeCollection;
import com.google.api.gax.paging.Page;
import com.google.api.gax.rpc.ApiExceptions;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.compute.v1.stub.LicenseStub;
import com.google.cloud.compute.v1.stub.LicenseStubSettings;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
 * try (LicenseClient licenseClient = LicenseClient.create()) {
 *   LicenseName license = LicenseName.of("[PROJECT]", "[LICENSE]");
 *   License response = licenseClient.getLicense(license);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the licenseClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of LicenseSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * LicenseSettings licenseSettings =
 *     LicenseSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LicenseClient licenseClient =
 *     LicenseClient.create(licenseSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * LicenseSettings licenseSettings =
 *     LicenseSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LicenseClient licenseClient =
 *     LicenseClient.create(licenseSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class LicenseClient implements BackgroundResource {
  private final LicenseSettings settings;
  private final LicenseStub stub;



  /**
   * Constructs an instance of LicenseClient with default settings.
   */
  public static final LicenseClient create() throws IOException {
    return create(LicenseSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LicenseClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final LicenseClient create(LicenseSettings settings) throws IOException {
    return new LicenseClient(settings);
  }

  /**
   * Constructs an instance of LicenseClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use LicenseSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LicenseClient create(LicenseStub stub) {
    return new LicenseClient(stub);
  }

  /**
   * Constructs an instance of LicenseClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected LicenseClient(LicenseSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((LicenseStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LicenseClient(LicenseStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LicenseSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LicenseStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource.
   *
   * Sample code:
   * <pre><code>
   * try (LicenseClient licenseClient = LicenseClient.create()) {
   *   LicenseName license = LicenseName.of("[PROJECT]", "[LICENSE]");
   *   License response = licenseClient.getLicense(license);
   * }
   * </code></pre>
   *
   * @param license Name of the License resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final License getLicense(LicenseName license) {

    GetLicenseHttpRequest request =
        GetLicenseHttpRequest.newBuilder()
        .setLicense(license == null ? null : license.toString())
        .build();
    return getLicense(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource.
   *
   * Sample code:
   * <pre><code>
   * try (LicenseClient licenseClient = LicenseClient.create()) {
   *   LicenseName license = LicenseName.of("[PROJECT]", "[LICENSE]");
   *   License response = licenseClient.getLicense(license.toString());
   * }
   * </code></pre>
   *
   * @param license Name of the License resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final License getLicense(String license) {

    GetLicenseHttpRequest request =
        GetLicenseHttpRequest.newBuilder()
        .setLicense(license)
        .build();
    return getLicense(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource.
   *
   * Sample code:
   * <pre><code>
   * try (LicenseClient licenseClient = LicenseClient.create()) {
   *   LicenseName license = LicenseName.of("[PROJECT]", "[LICENSE]");
   *   GetLicenseHttpRequest request = GetLicenseHttpRequest.newBuilder()
   *     .setLicense(license.toString())
   *     .build();
   *   License response = licenseClient.getLicense(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final License getLicense(GetLicenseHttpRequest request) {
    return getLicenseCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource.
   *
   * Sample code:
   * <pre><code>
   * try (LicenseClient licenseClient = LicenseClient.create()) {
   *   LicenseName license = LicenseName.of("[PROJECT]", "[LICENSE]");
   *   GetLicenseHttpRequest request = GetLicenseHttpRequest.newBuilder()
   *     .setLicense(license.toString())
   *     .build();
   *   ApiFuture&lt;License&gt; future = licenseClient.getLicenseCallable().futureCall(request);
   *   // Do something
   *   License response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetLicenseHttpRequest, License> getLicenseCallable() {
    return stub.getLicenseCallable();
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