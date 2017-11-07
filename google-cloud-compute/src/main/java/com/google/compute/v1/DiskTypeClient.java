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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDiskTypesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDiskTypesPagedResponse;
import com.google.compute.v1.stub.DiskTypeStub;
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
 * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
 *   DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");
 *   DiskType response = diskTypeClient.getDiskType(diskType);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the diskTypeClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of DiskTypeSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * DiskTypeSettings diskTypeSettings =
 *     DiskTypeSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DiskTypeClient diskTypeClient =
 *     DiskTypeClient.create(diskTypeSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DiskTypeSettings diskTypeSettings =
 *     DiskTypeSettings.newBuilder()
 *         .setTransportChannelProvider(DiskTypeSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build())
 *         .build();
 * DiskTypeClient diskTypeClient =
 *     DiskTypeClient.create(diskTypeSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class DiskTypeClient implements BackgroundResource {
  private final DiskTypeSettings settings;
  private final DiskTypeStub stub;



  /**
   * Constructs an instance of DiskTypeClient with default settings.
   */
  public static final DiskTypeClient create() throws IOException {
    return create(DiskTypeSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DiskTypeClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final DiskTypeClient create(DiskTypeSettings settings) throws IOException {
    return new DiskTypeClient(settings);
  }

  /**
   * Constructs an instance of DiskTypeClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use DiskTypeSettings}.
   */
  @BetaApi
  public static final DiskTypeClient create(DiskTypeStub stub) {
    return new DiskTypeClient(stub);
  }

  /**
   * Constructs an instance of DiskTypeClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected DiskTypeClient(DiskTypeSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected DiskTypeClient(DiskTypeStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DiskTypeSettings getSettings() {
    return settings;
  }

  @BetaApi
  public DiskTypeStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of disk types.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (DiskType element : diskTypeClient.aggregatedListDiskTypes(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListDiskTypesPagedResponse aggregatedListDiskTypes(ProjectName project) {
    AggregatedListDiskTypesHttpRequest request =
        AggregatedListDiskTypesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListDiskTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of disk types.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListDiskTypesHttpRequest request = AggregatedListDiskTypesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (DiskType element : diskTypeClient.aggregatedListDiskTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListDiskTypesPagedResponse aggregatedListDiskTypes(AggregatedListDiskTypesHttpRequest request) {
    return aggregatedListDiskTypesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of disk types.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListDiskTypesHttpRequest request = AggregatedListDiskTypesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;AggregatedListDiskTypesPagedResponse&gt; future = diskTypeClient.aggregatedListDiskTypesPagedCallable().futureCall(request);
   *   // Do something
   *   for (DiskType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListDiskTypesHttpRequest, AggregatedListDiskTypesPagedResponse> aggregatedListDiskTypesPagedCallable() {
    return stub.aggregatedListDiskTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of disk types.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListDiskTypesHttpRequest request = AggregatedListDiskTypesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     DiskTypeAggregatedList response = diskTypeClient.aggregatedListDiskTypesCallable().call(request);
   *     for (DiskType element : response.getDiskTypes()) {
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
  public final UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesCallable() {
    return stub.aggregatedListDiskTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified disk type. Get a list of available disk types by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");
   *   DiskType response = diskTypeClient.getDiskType(diskType);
   * }
   * </code></pre>
   *
   * @param diskType Name of the disk type to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final DiskType getDiskType(DiskTypeName diskType) {

    GetDiskTypeHttpRequest request =
        GetDiskTypeHttpRequest.newBuilder()
        .setDiskTypeWithDiskTypeName(diskType)
        .build();
    return getDiskType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified disk type. Get a list of available disk types by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");
   *   GetDiskTypeHttpRequest request = GetDiskTypeHttpRequest.newBuilder()
   *     .setDiskTypeWithDiskTypeName(diskType)
   *     .build();
   *   DiskType response = diskTypeClient.getDiskType(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final DiskType getDiskType(GetDiskTypeHttpRequest request) {
    return getDiskTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified disk type. Get a list of available disk types by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   DiskTypeName diskType = DiskTypeName.of("[PROJECT]", "[ZONE]", "[DISK_TYPE]");
   *   GetDiskTypeHttpRequest request = GetDiskTypeHttpRequest.newBuilder()
   *     .setDiskTypeWithDiskTypeName(diskType)
   *     .build();
   *   ApiFuture&lt;DiskType&gt; future = diskTypeClient.getDiskTypeCallable().futureCall(request);
   *   // Do something
   *   DiskType response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetDiskTypeHttpRequest, DiskType> getDiskTypeCallable() {
    return stub.getDiskTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of disk types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   for (DiskType element : diskTypeClient.listDiskTypes(zone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDiskTypesPagedResponse listDiskTypes(ZoneName zone) {
    ListDiskTypesHttpRequest request =
        ListDiskTypesHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listDiskTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of disk types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListDiskTypesHttpRequest request = ListDiskTypesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   for (DiskType element : diskTypeClient.listDiskTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDiskTypesPagedResponse listDiskTypes(ListDiskTypesHttpRequest request) {
    return listDiskTypesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of disk types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListDiskTypesHttpRequest request = ListDiskTypesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   ApiFuture&lt;ListDiskTypesPagedResponse&gt; future = diskTypeClient.listDiskTypesPagedCallable().futureCall(request);
   *   // Do something
   *   for (DiskType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListDiskTypesHttpRequest, ListDiskTypesPagedResponse> listDiskTypesPagedCallable() {
    return stub.listDiskTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of disk types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListDiskTypesHttpRequest request = ListDiskTypesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   while (true) {
   *     DiskTypeList response = diskTypeClient.listDiskTypesCallable().call(request);
   *     for (DiskType element : response.getItems()) {
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
  public final UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesCallable() {
    return stub.listDiskTypesCallable();
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