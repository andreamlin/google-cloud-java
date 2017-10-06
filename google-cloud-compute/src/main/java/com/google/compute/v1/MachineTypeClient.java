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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListMachineTypesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListMachineTypesPagedResponse;
import com.google.compute.v1.stub.MachineTypeStub;
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
 * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
 *
 *   MachineType response = machineTypeClient.getMachineType();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the machineTypeClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of MachineTypeSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * MachineTypeSettings machineTypeSettings =
 *     MachineTypeSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MachineTypeClient machineTypeClient =
 *     MachineTypeClient.create(machineTypeSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * MachineTypeSettings machineTypeSettings =
 *     MachineTypeSettings.defaultBuilder()
 *         .setTransportProvider(MachineTypeSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(MachineTypeSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * MachineTypeClient machineTypeClient =
 *     MachineTypeClient.create(machineTypeSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class MachineTypeClient implements BackgroundResource {
  private final MachineTypeSettings settings;
  private final MachineTypeStub stub;



  /**
   * Constructs an instance of MachineTypeClient with default settings.
   */
  public static final MachineTypeClient create() throws IOException {
    return create(MachineTypeSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of MachineTypeClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final MachineTypeClient create(MachineTypeSettings settings) throws IOException {
    return new MachineTypeClient(settings);
  }

  /**
   * Constructs an instance of MachineTypeClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use MachineTypeSettings}.
   */
  public static final MachineTypeClient create(MachineTypeStub stub) {
    return new MachineTypeClient(stub);
  }

  /**
   * Constructs an instance of MachineTypeClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected MachineTypeClient(MachineTypeSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected MachineTypeClient(MachineTypeStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MachineTypeSettings getSettings() {
    return settings;
  }

  public MachineTypeStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of machine types.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   for (MachineType element : machineTypeClient.aggregatedListMachineTypes().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListMachineTypesPagedResponse aggregatedListMachineTypes(ProjectName project) {
    AggregatedListMachineTypesHttpRequest request =
        AggregatedListMachineTypesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListMachineTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of machine types.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   for (MachineType element : machineTypeClient.aggregatedListMachineTypes().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListMachineTypesPagedResponse aggregatedListMachineTypes(AggregatedListMachineTypesHttpRequest request) {
    return aggregatedListMachineTypesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of machine types.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListMachineTypesPagedResponse&gt; future = machineTypeClient.aggregatedListMachineTypesPagedCallable().futureCall();
   *   // Do something
   *   for (MachineType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListMachineTypesHttpRequest, AggregatedListMachineTypesPagedResponse> aggregatedListMachineTypesPagedCallable() {
    return stub.aggregatedListMachineTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of machine types.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   while (true) {
   *     MachineTypeAggregatedList response = machineTypeClient.aggregatedListMachineTypesCallable().call();
   *     for (MachineType element : response.getMachineTypes()) {
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
  public final UnaryCallable<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList> aggregatedListMachineTypesCallable() {
    return stub.aggregatedListMachineTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified machine type. Get a list of available machine types by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   MachineType response = machineTypeClient.getMachineType();
   * }
   * </code></pre>
   *
   * @param machineType Name of the machine type to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final MachineType getMachineType(MachineTypeName machineType) {

    GetMachineTypeHttpRequest request =
        GetMachineTypeHttpRequest.newBuilder()
        .setMachineTypeWithMachineTypeName(machineType)
        .build();
    return getMachineType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified machine type. Get a list of available machine types by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   MachineType response = machineTypeClient.getMachineType();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final MachineType getMachineType(GetMachineTypeHttpRequest request) {
    return getMachineTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified machine type. Get a list of available machine types by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   ApiFuture&lt;MachineType&gt; future = machineTypeClient.getMachineTypeCallable().futureCall();
   *   // Do something
   *   MachineType response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetMachineTypeHttpRequest, MachineType> getMachineTypeCallable() {
    return stub.getMachineTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of machine types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   for (MachineType element : machineTypeClient.listMachineTypes().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListMachineTypesPagedResponse listMachineTypes(ZoneName zone) {
    ListMachineTypesHttpRequest request =
        ListMachineTypesHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listMachineTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of machine types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   for (MachineType element : machineTypeClient.listMachineTypes().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListMachineTypesPagedResponse listMachineTypes(ListMachineTypesHttpRequest request) {
    return listMachineTypesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of machine types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   ApiFuture&lt;ListMachineTypesPagedResponse&gt; future = machineTypeClient.listMachineTypesPagedCallable().futureCall();
   *   // Do something
   *   for (MachineType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListMachineTypesHttpRequest, ListMachineTypesPagedResponse> listMachineTypesPagedCallable() {
    return stub.listMachineTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of machine types available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
   *
   *   while (true) {
   *     MachineTypeList response = machineTypeClient.listMachineTypesCallable().call();
   *     for (MachineType element : response.getItems()) {
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
  public final UnaryCallable<ListMachineTypesHttpRequest, MachineTypeList> listMachineTypesCallable() {
    return stub.listMachineTypesCallable();
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