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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDisksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDisksPagedResponse;
import com.google.compute.v1.stub.DiskStub;
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
 * try (DiskClient diskClient = DiskClient.create()) {
 *
 *   Operation response = diskClient.createSnapshotDisk();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the diskClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of DiskSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * DiskSettings diskSettings =
 *     DiskSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DiskClient diskClient =
 *     DiskClient.create(diskSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DiskSettings diskSettings =
 *     DiskSettings.newBuilder()
 *         .setTransportProvider(DiskSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(DiskSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * DiskClient diskClient =
 *     DiskClient.create(diskSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class DiskClient implements BackgroundResource {
  private final DiskSettings settings;
  private final DiskStub stub;



  /**
   * Constructs an instance of DiskClient with default settings.
   */
  public static final DiskClient create() throws IOException {
    return create(DiskSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DiskClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final DiskClient create(DiskSettings settings) throws IOException {
    return new DiskClient(settings);
  }

  /**
   * Constructs an instance of DiskClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use DiskSettings}.
   */
  public static final DiskClient create(DiskStub stub) {
    return new DiskClient(stub);
  }

  /**
   * Constructs an instance of DiskClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected DiskClient(DiskSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected DiskClient(DiskStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DiskSettings getSettings() {
    return settings;
  }

  @BetaApi
  public DiskStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of persistent disks.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   for (Disk element : diskClient.aggregatedListDisks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListDisksPagedResponse aggregatedListDisks(ProjectName project) {
    AggregatedListDisksHttpRequest request =
        AggregatedListDisksHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListDisks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of persistent disks.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   for (Disk element : diskClient.aggregatedListDisks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListDisksPagedResponse aggregatedListDisks(AggregatedListDisksHttpRequest request) {
    return aggregatedListDisksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of persistent disks.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListDisksPagedResponse&gt; future = diskClient.aggregatedListDisksPagedCallable().futureCall();
   *   // Do something
   *   for (Disk element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListDisksHttpRequest, AggregatedListDisksPagedResponse> aggregatedListDisksPagedCallable() {
    return stub.aggregatedListDisksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of persistent disks.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   while (true) {
   *     DiskAggregatedList response = diskClient.aggregatedListDisksCallable().call();
   *     for (Disk element : response.getDisks()) {
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
  public final UnaryCallable<AggregatedListDisksHttpRequest, DiskAggregatedList> aggregatedListDisksCallable() {
    return stub.aggregatedListDisksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a snapshot of a specified persistent disk.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.createSnapshotDisk();
   * }
   * </code></pre>
   *
   * @param disk Name of the persistent disk to snapshot.
   * @param snapshotResource A persistent disk snapshot resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation createSnapshotDisk(DiskName disk, Snapshot snapshotResource) {

    CreateSnapshotDiskHttpRequest request =
        CreateSnapshotDiskHttpRequest.newBuilder()
        .setDiskWithDiskName(disk)
        .setSnapshotResource(snapshotResource)
        .build();
    return createSnapshotDisk(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a snapshot of a specified persistent disk.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.createSnapshotDisk();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation createSnapshotDisk(CreateSnapshotDiskHttpRequest request) {
    return createSnapshotDiskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a snapshot of a specified persistent disk.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = diskClient.createSnapshotDiskCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<CreateSnapshotDiskHttpRequest, Operation> createSnapshotDiskCallable() {
    return stub.createSnapshotDiskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.deleteDisk();
   * }
   * </code></pre>
   *
   * @param disk Name of the persistent disk to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteDisk(DiskName disk) {

    DeleteDiskHttpRequest request =
        DeleteDiskHttpRequest.newBuilder()
        .setDiskWithDiskName(disk)
        .build();
    return deleteDisk(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.deleteDisk();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteDisk(DeleteDiskHttpRequest request) {
    return deleteDiskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = diskClient.deleteDiskCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteDiskHttpRequest, Operation> deleteDiskCallable() {
    return stub.deleteDiskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a specified persistent disk. Get a list of available persistent disks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Disk response = diskClient.getDisk();
   * }
   * </code></pre>
   *
   * @param disk Name of the persistent disk to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Disk getDisk(DiskName disk) {

    GetDiskHttpRequest request =
        GetDiskHttpRequest.newBuilder()
        .setDiskWithDiskName(disk)
        .build();
    return getDisk(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a specified persistent disk. Get a list of available persistent disks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Disk response = diskClient.getDisk();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Disk getDisk(GetDiskHttpRequest request) {
    return getDiskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a specified persistent disk. Get a list of available persistent disks by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;Disk&gt; future = diskClient.getDiskCallable().futureCall();
   *   // Do something
   *   Disk response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetDiskHttpRequest, Disk> getDiskCallable() {
    return stub.getDiskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb property.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.insertDisk();
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @param sourceImage Optional. Source image to restore onto a disk.
   * @param diskResource A Disk resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertDisk(ZoneName zone, String sourceImage, Disk diskResource) {

    InsertDiskHttpRequest request =
        InsertDiskHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .setSourceImage(sourceImage)
        .setDiskResource(diskResource)
        .build();
    return insertDisk(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb property.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.insertDisk();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertDisk(InsertDiskHttpRequest request) {
    return insertDiskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb property.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = diskClient.insertDiskCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertDiskHttpRequest, Operation> insertDiskCallable() {
    return stub.insertDiskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of persistent disks contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   for (Disk element : diskClient.listDisks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDisksPagedResponse listDisks(ZoneName zone) {
    ListDisksHttpRequest request =
        ListDisksHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listDisks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of persistent disks contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   for (Disk element : diskClient.listDisks().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDisksPagedResponse listDisks(ListDisksHttpRequest request) {
    return listDisksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of persistent disks contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;ListDisksPagedResponse&gt; future = diskClient.listDisksPagedCallable().futureCall();
   *   // Do something
   *   for (Disk element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListDisksHttpRequest, ListDisksPagedResponse> listDisksPagedCallable() {
    return stub.listDisksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of persistent disks contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   while (true) {
   *     DiskList response = diskClient.listDisksCallable().call();
   *     for (Disk element : response.getItems()) {
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
  public final UnaryCallable<ListDisksHttpRequest, DiskList> listDisksCallable() {
    return stub.listDisksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resizes the specified persistent disk.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.resizeDisk();
   * }
   * </code></pre>
   *
   * @param disk The name of the persistent disk.
   * @param disksResizeRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation resizeDisk(DiskName disk, DisksResizeRequest disksResizeRequestResource) {

    ResizeDiskHttpRequest request =
        ResizeDiskHttpRequest.newBuilder()
        .setDiskWithDiskName(disk)
        .setDisksResizeRequestResource(disksResizeRequestResource)
        .build();
    return resizeDisk(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resizes the specified persistent disk.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   Operation response = diskClient.resizeDisk();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation resizeDisk(ResizeDiskHttpRequest request) {
    return resizeDiskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resizes the specified persistent disk.
   *
   * Sample code:
   * <pre><code>
   * try (DiskClient diskClient = DiskClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = diskClient.resizeDiskCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ResizeDiskHttpRequest, Operation> resizeDiskCallable() {
    return stub.resizeDiskCallable();
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