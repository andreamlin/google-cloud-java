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
import static com.google.compute.v1.PagedResponseWrappers.ListSnapshotsPagedResponse;
import com.google.compute.v1.stub.SnapshotAdminStub;
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
 * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
 *
 *   Operation response = snapshotAdminClient.deleteSnapshot();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the snapshotAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of SnapshotAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * SnapshotAdminSettings snapshotAdminSettings =
 *     SnapshotAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SnapshotAdminClient snapshotAdminClient =
 *     SnapshotAdminClient.create(snapshotAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SnapshotAdminSettings snapshotAdminSettings =
 *     SnapshotAdminSettings.defaultBuilder()
 *         .setTransportProvider(SnapshotAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(SnapshotAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * SnapshotAdminClient snapshotAdminClient =
 *     SnapshotAdminClient.create(snapshotAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SnapshotAdminClient implements BackgroundResource {
  private final SnapshotAdminSettings settings;
  private final SnapshotAdminStub stub;



  /**
   * Constructs an instance of SnapshotAdminClient with default settings.
   */
  public static final SnapshotAdminClient create() throws IOException {
    return create(SnapshotAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of SnapshotAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final SnapshotAdminClient create(SnapshotAdminSettings settings) throws IOException {
    return new SnapshotAdminClient(settings);
  }

  /**
   * Constructs an instance of SnapshotAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use SnapshotAdminSettings}.
   */
  public static final SnapshotAdminClient create(SnapshotAdminStub stub) {
    return new SnapshotAdminClient(stub);
  }

  /**
   * Constructs an instance of SnapshotAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected SnapshotAdminClient(SnapshotAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected SnapshotAdminClient(SnapshotAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SnapshotAdminSettings getSettings() {
    return settings;
  }

  public SnapshotAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
   *
   * For more information, see Deleting snaphots.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   Operation response = snapshotAdminClient.deleteSnapshot();
   * }
   * </code></pre>
   *
   * @param snapshot Name of the Snapshot resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSnapshot(SnapshotName snapshot) {

    DeleteSnapshotHttpRequest request =
        DeleteSnapshotHttpRequest.newBuilder()
        .setSnapshotWithSnapshotName(snapshot)
        .build();
    return deleteSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
   *
   * For more information, see Deleting snaphots.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   Operation response = snapshotAdminClient.deleteSnapshot();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSnapshot(DeleteSnapshotHttpRequest request) {
    return deleteSnapshotCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
   *
   * For more information, see Deleting snaphots.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = snapshotAdminClient.deleteSnapshotCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSnapshotHttpRequest, Operation> deleteSnapshotCallable() {
    return stub.deleteSnapshotCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   Snapshot response = snapshotAdminClient.getSnapshot();
   * }
   * </code></pre>
   *
   * @param snapshot Name of the Snapshot resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Snapshot getSnapshot(SnapshotName snapshot) {

    GetSnapshotHttpRequest request =
        GetSnapshotHttpRequest.newBuilder()
        .setSnapshotWithSnapshotName(snapshot)
        .build();
    return getSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   Snapshot response = snapshotAdminClient.getSnapshot();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Snapshot getSnapshot(GetSnapshotHttpRequest request) {
    return getSnapshotCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   ApiFuture&lt;Snapshot&gt; future = snapshotAdminClient.getSnapshotCallable().futureCall();
   *   // Do something
   *   Snapshot response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSnapshotHttpRequest, Snapshot> getSnapshotCallable() {
    return stub.getSnapshotCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Snapshot resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   for (Snapshot element : snapshotAdminClient.listSnapshots().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSnapshotsPagedResponse listSnapshots(ProjectName project) {
    ListSnapshotsHttpRequest request =
        ListSnapshotsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listSnapshots(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Snapshot resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   for (Snapshot element : snapshotAdminClient.listSnapshots().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSnapshotsPagedResponse listSnapshots(ListSnapshotsHttpRequest request) {
    return listSnapshotsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Snapshot resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   ApiFuture&lt;ListSnapshotsPagedResponse&gt; future = snapshotAdminClient.listSnapshotsPagedCallable().futureCall();
   *   // Do something
   *   for (Snapshot element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSnapshotsHttpRequest, ListSnapshotsPagedResponse> listSnapshotsPagedCallable() {
    return stub.listSnapshotsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Snapshot resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
   *
   *   while (true) {
   *     SnapshotList response = snapshotAdminClient.listSnapshotsCallable().call();
   *     for (Snapshot element : response.getItems()) {
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
  public final UnaryCallable<ListSnapshotsHttpRequest, SnapshotList> listSnapshotsCallable() {
    return stub.listSnapshotsCallable();
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