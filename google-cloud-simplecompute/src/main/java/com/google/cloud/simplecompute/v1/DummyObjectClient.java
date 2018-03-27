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
package com.google.cloud.simplecompute.v1;

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
import com.google.cloud.simplecompute.v1.stub.DummyObjectStub;
import com.google.cloud.simplecompute.v1.stub.DummyObjectStubSettings;
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
 * try (DummyObjectClient dummyObjectClient = DummyObjectClient.create()) {
 *   DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");
 *   dummyObjectClient.deleteDummyObject(dummyObject);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the dummyObjectClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of DummyObjectSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * DummyObjectSettings dummyObjectSettings =
 *     DummyObjectSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DummyObjectClient dummyObjectClient =
 *     DummyObjectClient.create(dummyObjectSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DummyObjectSettings dummyObjectSettings =
 *     DummyObjectSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DummyObjectClient dummyObjectClient =
 *     DummyObjectClient.create(dummyObjectSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class DummyObjectClient implements BackgroundResource {
  private final DummyObjectSettings settings;
  private final DummyObjectStub stub;



  /**
   * Constructs an instance of DummyObjectClient with default settings.
   */
  public static final DummyObjectClient create() throws IOException {
    return create(DummyObjectSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DummyObjectClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final DummyObjectClient create(DummyObjectSettings settings) throws IOException {
    return new DummyObjectClient(settings);
  }

  /**
   * Constructs an instance of DummyObjectClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use DummyObjectSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DummyObjectClient create(DummyObjectStub stub) {
    return new DummyObjectClient(stub);
  }

  /**
   * Constructs an instance of DummyObjectClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected DummyObjectClient(DummyObjectSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DummyObjectStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DummyObjectClient(DummyObjectStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DummyObjectSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DummyObjectStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Method with no response object.
   *
   * Sample code:
   * <pre><code>
   * try (DummyObjectClient dummyObjectClient = DummyObjectClient.create()) {
   *   DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");
   *   dummyObjectClient.deleteDummyObject(dummyObject);
   * }
   * </code></pre>
   *
   * @param dummyObject Name of the dummyObject resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteDummyObject(DummyObjectName dummyObject) {

    DeleteDummyObjectHttpRequest request =
        DeleteDummyObjectHttpRequest.newBuilder()
        .setDummyObject(dummyObject == null ? null : dummyObject.toString())
        .build();
    deleteDummyObject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Method with no response object.
   *
   * Sample code:
   * <pre><code>
   * try (DummyObjectClient dummyObjectClient = DummyObjectClient.create()) {
   *   DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");
   *   dummyObjectClient.deleteDummyObject(dummyObject.toString());
   * }
   * </code></pre>
   *
   * @param dummyObject Name of the dummyObject resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteDummyObject(String dummyObject) {

    DeleteDummyObjectHttpRequest request =
        DeleteDummyObjectHttpRequest.newBuilder()
        .setDummyObject(dummyObject)
        .build();
    deleteDummyObject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Method with no response object.
   *
   * Sample code:
   * <pre><code>
   * try (DummyObjectClient dummyObjectClient = DummyObjectClient.create()) {
   *   DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");
   *   DeleteDummyObjectHttpRequest request = DeleteDummyObjectHttpRequest.newBuilder()
   *     .setDummyObject(dummyObject.toString())
   *     .build();
   *   dummyObjectClient.deleteDummyObject(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteDummyObject(DeleteDummyObjectHttpRequest request) {
    deleteDummyObjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Method with no response object.
   *
   * Sample code:
   * <pre><code>
   * try (DummyObjectClient dummyObjectClient = DummyObjectClient.create()) {
   *   DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");
   *   DeleteDummyObjectHttpRequest request = DeleteDummyObjectHttpRequest.newBuilder()
   *     .setDummyObject(dummyObject.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = dummyObjectClient.deleteDummyObjectCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteDummyObjectHttpRequest, Void> deleteDummyObjectCallable() {
    return stub.deleteDummyObjectCallable();
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