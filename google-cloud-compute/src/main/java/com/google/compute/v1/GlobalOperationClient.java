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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListGlobalOperationsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalOperationsPagedResponse;
import com.google.compute.v1.stub.GlobalOperationStub;
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
 * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
 *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
 *   globalOperationClient.deleteGlobalOperation(operation);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the globalOperationClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of GlobalOperationSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * GlobalOperationSettings globalOperationSettings =
 *     GlobalOperationSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GlobalOperationClient globalOperationClient =
 *     GlobalOperationClient.create(globalOperationSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * GlobalOperationSettings globalOperationSettings =
 *     GlobalOperationSettings.newBuilder()
 *         .setTransportProvider(GlobalOperationSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(GlobalOperationSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * GlobalOperationClient globalOperationClient =
 *     GlobalOperationClient.create(globalOperationSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GlobalOperationClient implements BackgroundResource {
  private final GlobalOperationSettings settings;
  private final GlobalOperationStub stub;



  /**
   * Constructs an instance of GlobalOperationClient with default settings.
   */
  public static final GlobalOperationClient create() throws IOException {
    return create(GlobalOperationSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GlobalOperationClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final GlobalOperationClient create(GlobalOperationSettings settings) throws IOException {
    return new GlobalOperationClient(settings);
  }

  /**
   * Constructs an instance of GlobalOperationClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use GlobalOperationSettings}.
   */
  public static final GlobalOperationClient create(GlobalOperationStub stub) {
    return new GlobalOperationClient(stub);
  }

  /**
   * Constructs an instance of GlobalOperationClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GlobalOperationClient(GlobalOperationSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected GlobalOperationClient(GlobalOperationStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GlobalOperationSettings getSettings() {
    return settings;
  }

  @BetaApi
  public GlobalOperationStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of all operations.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (Operation element : globalOperationClient.aggregatedListGlobalOperations(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListGlobalOperationsPagedResponse aggregatedListGlobalOperations(ProjectName project) {
    AggregatedListGlobalOperationsHttpRequest request =
        AggregatedListGlobalOperationsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListGlobalOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of all operations.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   AggregatedListGlobalOperationsHttpRequest request = AggregatedListGlobalOperationsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Operation element : globalOperationClient.aggregatedListGlobalOperations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListGlobalOperationsPagedResponse aggregatedListGlobalOperations(AggregatedListGlobalOperationsHttpRequest request) {
    return aggregatedListGlobalOperationsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of all operations.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   AggregatedListGlobalOperationsHttpRequest request = AggregatedListGlobalOperationsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;AggregatedListGlobalOperationsPagedResponse&gt; future = globalOperationClient.aggregatedListGlobalOperationsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Operation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsPagedCallable() {
    return stub.aggregatedListGlobalOperationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of all operations.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   AggregatedListGlobalOperationsHttpRequest request = AggregatedListGlobalOperationsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     OperationAggregatedList response = globalOperationClient.aggregatedListGlobalOperationsCallable().call(request);
   *     for (Operation element : response.getOperations()) {
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
  public final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> aggregatedListGlobalOperationsCallable() {
    return stub.aggregatedListGlobalOperationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
   *   globalOperationClient.deleteGlobalOperation(operation);
   * }
   * </code></pre>
   *
   * @param operation Name of the Operations resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteGlobalOperation(GlobalOperationsOperationName operation) {

    DeleteGlobalOperationHttpRequest request =
        DeleteGlobalOperationHttpRequest.newBuilder()
        .setOperationWithGlobalOperationsOperationName(operation)
        .build();
    deleteGlobalOperation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
   *   DeleteGlobalOperationHttpRequest request = DeleteGlobalOperationHttpRequest.newBuilder()
   *     .setOperationWithGlobalOperationsOperationName(operation)
   *     .build();
   *   globalOperationClient.deleteGlobalOperation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteGlobalOperation(DeleteGlobalOperationHttpRequest request) {
    deleteGlobalOperationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Operations resource.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
   *   DeleteGlobalOperationHttpRequest request = DeleteGlobalOperationHttpRequest.newBuilder()
   *     .setOperationWithGlobalOperationsOperationName(operation)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = globalOperationClient.deleteGlobalOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteGlobalOperationHttpRequest, Void> deleteGlobalOperationCallable() {
    return stub.deleteGlobalOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified Operations resource. Get a list of operations by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
   *   Operation response = globalOperationClient.getGlobalOperation(operation);
   * }
   * </code></pre>
   *
   * @param operation Name of the Operations resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getGlobalOperation(GlobalOperationsOperationName operation) {

    GetGlobalOperationHttpRequest request =
        GetGlobalOperationHttpRequest.newBuilder()
        .setOperationWithGlobalOperationsOperationName(operation)
        .build();
    return getGlobalOperation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified Operations resource. Get a list of operations by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
   *   GetGlobalOperationHttpRequest request = GetGlobalOperationHttpRequest.newBuilder()
   *     .setOperationWithGlobalOperationsOperationName(operation)
   *     .build();
   *   Operation response = globalOperationClient.getGlobalOperation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getGlobalOperation(GetGlobalOperationHttpRequest request) {
    return getGlobalOperationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified Operations resource. Get a list of operations by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
   *   GetGlobalOperationHttpRequest request = GetGlobalOperationHttpRequest.newBuilder()
   *     .setOperationWithGlobalOperationsOperationName(operation)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = globalOperationClient.getGlobalOperationCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetGlobalOperationHttpRequest, Operation> getGlobalOperationCallable() {
    return stub.getGlobalOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (Operation element : globalOperationClient.listGlobalOperations(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalOperationsPagedResponse listGlobalOperations(ProjectName project) {
    ListGlobalOperationsHttpRequest request =
        ListGlobalOperationsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listGlobalOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListGlobalOperationsHttpRequest request = ListGlobalOperationsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Operation element : globalOperationClient.listGlobalOperations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListGlobalOperationsPagedResponse listGlobalOperations(ListGlobalOperationsHttpRequest request) {
    return listGlobalOperationsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListGlobalOperationsHttpRequest request = ListGlobalOperationsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;ListGlobalOperationsPagedResponse&gt; future = globalOperationClient.listGlobalOperationsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Operation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListGlobalOperationsHttpRequest, ListGlobalOperationsPagedResponse> listGlobalOperationsPagedCallable() {
    return stub.listGlobalOperationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   ListGlobalOperationsHttpRequest request = ListGlobalOperationsHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     OperationList response = globalOperationClient.listGlobalOperationsCallable().call(request);
   *     for (Operation element : response.getItems()) {
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
  public final UnaryCallable<ListGlobalOperationsHttpRequest, OperationList> listGlobalOperationsCallable() {
    return stub.listGlobalOperationsCallable();
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