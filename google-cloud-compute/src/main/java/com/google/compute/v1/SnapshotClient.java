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
package com.google.compute.v1;

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
import com.google.api.gax.paging.PagedListResponse;
import com.google.api.gax.rpc.ApiExceptions;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.compute.v1.stub.SnapshotStub;
import com.google.compute.v1.stub.SnapshotStubSettings;
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
 * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
 *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
 *   Operation response = snapshotClient.deleteSnapshot(snapshot);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the snapshotClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of SnapshotSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * SnapshotSettings snapshotSettings =
 *     SnapshotSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SnapshotClient snapshotClient =
 *     SnapshotClient.create(snapshotSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SnapshotSettings snapshotSettings =
 *     SnapshotSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SnapshotClient snapshotClient =
 *     SnapshotClient.create(snapshotSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SnapshotClient implements BackgroundResource {
  private final SnapshotSettings settings;
  private final SnapshotStub stub;



  /**
   * Constructs an instance of SnapshotClient with default settings.
   */
  public static final SnapshotClient create() throws IOException {
    return create(SnapshotSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SnapshotClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final SnapshotClient create(SnapshotSettings settings) throws IOException {
    return new SnapshotClient(settings);
  }

  /**
   * Constructs an instance of SnapshotClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use SnapshotSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SnapshotClient create(SnapshotStub stub) {
    return new SnapshotClient(stub);
  }

  /**
   * Constructs an instance of SnapshotClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected SnapshotClient(SnapshotSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SnapshotStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SnapshotClient(SnapshotStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SnapshotSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SnapshotStub getStub() {
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
   *   Operation response = snapshotClient.deleteSnapshot(snapshot);
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
        .setSnapshot(snapshot.toString())
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
   *   DeleteSnapshotHttpRequest request = DeleteSnapshotHttpRequest.newBuilder()
   *     .setSnapshot(snapshot.toString())
   *     .build();
   *   Operation response = snapshotClient.deleteSnapshot(request);
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
   *   DeleteSnapshotHttpRequest request = DeleteSnapshotHttpRequest.newBuilder()
   *     .setSnapshot(snapshot.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = snapshotClient.deleteSnapshotCallable().futureCall(request);
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
   *   Snapshot response = snapshotClient.getSnapshot(snapshot);
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
        .setSnapshot(snapshot.toString())
        .build();
    return getSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
   *   GetSnapshotHttpRequest request = GetSnapshotHttpRequest.newBuilder()
   *     .setSnapshot(snapshot.toString())
   *     .build();
   *   Snapshot response = snapshotClient.getSnapshot(request);
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   SnapshotName snapshot = SnapshotName.of("[PROJECT]", "[SNAPSHOT]");
   *   GetSnapshotHttpRequest request = GetSnapshotHttpRequest.newBuilder()
   *     .setSnapshot(snapshot.toString())
   *     .build();
   *   ApiFuture&lt;Snapshot&gt; future = snapshotClient.getSnapshotCallable().futureCall(request);
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Snapshot element : snapshotClient.listSnapshots(project).iterateAll()) {
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
        .setProject(project.toString())
        .build();
    return listSnapshots(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of Snapshot resources contained within the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSnapshotsHttpRequest request = ListSnapshotsHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (Snapshot element : snapshotClient.listSnapshots(request).iterateAll()) {
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSnapshotsHttpRequest request = ListSnapshotsHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListSnapshotsPagedResponse&gt; future = snapshotClient.listSnapshotsPagedCallable().futureCall(request);
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
   * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSnapshotsHttpRequest request = ListSnapshotsHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     SnapshotList response = snapshotClient.listSnapshotsCallable().call(request);
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

  public static class ListSnapshotsPagedResponse extends AbstractPagedListResponse<
      ListSnapshotsHttpRequest,
      SnapshotList,
      Snapshot,
      ListSnapshotsPage,
      ListSnapshotsFixedSizeCollection> {

    public static ApiFuture<ListSnapshotsPagedResponse> createAsync(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        ApiFuture<SnapshotList> futureResponse) {
      ApiFuture<ListSnapshotsPage> futurePage =
          ListSnapshotsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSnapshotsPage, ListSnapshotsPagedResponse>() {
            @Override
            public ListSnapshotsPagedResponse apply(ListSnapshotsPage input) {
              return new ListSnapshotsPagedResponse(input);
            }
          });
    }

    private ListSnapshotsPagedResponse(ListSnapshotsPage page) {
      super(page, ListSnapshotsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListSnapshotsPage extends AbstractPage<
      ListSnapshotsHttpRequest,
      SnapshotList,
      Snapshot,
      ListSnapshotsPage> {

    private ListSnapshotsPage(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        SnapshotList response) {
      super(context, response);
    }

    private static ListSnapshotsPage createEmptyPage() {
      return new ListSnapshotsPage(null, null);
    }

    @Override
    protected ListSnapshotsPage createPage(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        SnapshotList response) {
      return new ListSnapshotsPage(context, response);
    }

    @Override
    public ApiFuture<ListSnapshotsPage> createPageAsync(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        ApiFuture<SnapshotList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListSnapshotsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListSnapshotsHttpRequest,
      SnapshotList,
      Snapshot,
      ListSnapshotsPage,
      ListSnapshotsFixedSizeCollection> {

    private ListSnapshotsFixedSizeCollection(List<ListSnapshotsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSnapshotsFixedSizeCollection createEmptyCollection() {
      return new ListSnapshotsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSnapshotsFixedSizeCollection createCollection(
        List<ListSnapshotsPage> pages, int collectionSize) {
      return new ListSnapshotsFixedSizeCollection(pages, collectionSize);
    }


  }
}