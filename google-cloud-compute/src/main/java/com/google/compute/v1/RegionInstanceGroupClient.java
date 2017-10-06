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
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionInstanceGroupsPagedResponse;
import com.google.compute.v1.stub.RegionInstanceGroupStub;
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
 * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
 *
 *   InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionInstanceGroupClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of RegionInstanceGroupSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * RegionInstanceGroupSettings regionInstanceGroupSettings =
 *     RegionInstanceGroupSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionInstanceGroupClient regionInstanceGroupClient =
 *     RegionInstanceGroupClient.create(regionInstanceGroupSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionInstanceGroupSettings regionInstanceGroupSettings =
 *     RegionInstanceGroupSettings.defaultBuilder()
 *         .setTransportProvider(RegionInstanceGroupSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(RegionInstanceGroupSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * RegionInstanceGroupClient regionInstanceGroupClient =
 *     RegionInstanceGroupClient.create(regionInstanceGroupSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionInstanceGroupClient implements BackgroundResource {
  private final RegionInstanceGroupSettings settings;
  private final RegionInstanceGroupStub stub;



  /**
   * Constructs an instance of RegionInstanceGroupClient with default settings.
   */
  public static final RegionInstanceGroupClient create() throws IOException {
    return create(RegionInstanceGroupSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of RegionInstanceGroupClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final RegionInstanceGroupClient create(RegionInstanceGroupSettings settings) throws IOException {
    return new RegionInstanceGroupClient(settings);
  }

  /**
   * Constructs an instance of RegionInstanceGroupClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionInstanceGroupSettings}.
   */
  public static final RegionInstanceGroupClient create(RegionInstanceGroupStub stub) {
    return new RegionInstanceGroupClient(stub);
  }

  /**
   * Constructs an instance of RegionInstanceGroupClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected RegionInstanceGroupClient(RegionInstanceGroupSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected RegionInstanceGroupClient(RegionInstanceGroupStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionInstanceGroupSettings getSettings() {
    return settings;
  }

  public RegionInstanceGroupStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance group resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup Name of the instance group resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroup getRegionInstanceGroup(RegionInstanceGroupsInstanceGroupName instanceGroup) {

    GetRegionInstanceGroupHttpRequest request =
        GetRegionInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithRegionInstanceGroupsInstanceGroupName(instanceGroup)
        .build();
    return getRegionInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance group resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroup getRegionInstanceGroup(GetRegionInstanceGroupHttpRequest request) {
    return getRegionInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance group resource.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;InstanceGroup&gt; future = regionInstanceGroupClient.getRegionInstanceGroupCallable().futureCall();
   *   // Do something
   *   InstanceGroup response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRegionInstanceGroupHttpRequest, InstanceGroup> getRegionInstanceGroupCallable() {
    return stub.getRegionInstanceGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance group resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   for (InstanceGroup element : regionInstanceGroupClient.listRegionInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionInstanceGroupsPagedResponse listRegionInstanceGroups(RegionName region) {
    ListRegionInstanceGroupsHttpRequest request =
        ListRegionInstanceGroupsHttpRequest.newBuilder()
        .setRegionWithRegionName(region)
        .build();
    return listRegionInstanceGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance group resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   for (InstanceGroup element : regionInstanceGroupClient.listRegionInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListRegionInstanceGroupsPagedResponse listRegionInstanceGroups(ListRegionInstanceGroupsHttpRequest request) {
    return listRegionInstanceGroupsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance group resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;ListRegionInstanceGroupsPagedResponse&gt; future = regionInstanceGroupClient.listRegionInstanceGroupsPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceGroup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListRegionInstanceGroupsHttpRequest, ListRegionInstanceGroupsPagedResponse> listRegionInstanceGroupsPagedCallable() {
    return stub.listRegionInstanceGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance group resources contained within the specified region.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   while (true) {
   *     RegionInstanceGroupList response = regionInstanceGroupClient.listRegionInstanceGroupsCallable().call();
   *     for (InstanceGroup element : response.getItems()) {
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
  public final UnaryCallable<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> listRegionInstanceGroupsCallable() {
    return stub.listRegionInstanceGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can list all instances or only the instances that are running.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   for (InstanceWithNamedPorts element : regionInstanceGroupClient.listInstancesRegionInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param instanceGroup Name of the regional instance group for which we want to list the instances.
   * @param regionInstanceGroupsListInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesRegionInstanceGroupsPagedResponse listInstancesRegionInstanceGroups(RegionInstanceGroupsInstanceGroupName instanceGroup, RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource) {
    ListInstancesRegionInstanceGroupsHttpRequest request =
        ListInstancesRegionInstanceGroupsHttpRequest.newBuilder()
        .setInstanceGroupWithRegionInstanceGroupsInstanceGroupName(instanceGroup)
        .setRegionInstanceGroupsListInstancesRequestResource(regionInstanceGroupsListInstancesRequestResource)
        .build();
    return listInstancesRegionInstanceGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can list all instances or only the instances that are running.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   for (InstanceWithNamedPorts element : regionInstanceGroupClient.listInstancesRegionInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesRegionInstanceGroupsPagedResponse listInstancesRegionInstanceGroups(ListInstancesRegionInstanceGroupsHttpRequest request) {
    return listInstancesRegionInstanceGroupsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can list all instances or only the instances that are running.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;ListInstancesRegionInstanceGroupsPagedResponse&gt; future = regionInstanceGroupClient.listInstancesRegionInstanceGroupsPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceWithNamedPorts element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, ListInstancesRegionInstanceGroupsPagedResponse> listInstancesRegionInstanceGroupsPagedCallable() {
    return stub.listInstancesRegionInstanceGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can list all instances or only the instances that are running.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   while (true) {
   *     RegionInstanceGroupsListInstances response = regionInstanceGroupClient.listInstancesRegionInstanceGroupsCallable().call();
   *     for (InstanceWithNamedPorts element : response.getItems()) {
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
  public final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> listInstancesRegionInstanceGroupsCallable() {
    return stub.listInstancesRegionInstanceGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the named ports for the specified regional instance group.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   Operation response = regionInstanceGroupClient.setNamedPortsRegionInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the regional instance group where the named ports are updated.
   * @param regionInstanceGroupsSetNamedPortsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setNamedPortsRegionInstanceGroup(RegionInstanceGroupsInstanceGroupName instanceGroup, RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource) {

    SetNamedPortsRegionInstanceGroupHttpRequest request =
        SetNamedPortsRegionInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithRegionInstanceGroupsInstanceGroupName(instanceGroup)
        .setRegionInstanceGroupsSetNamedPortsRequestResource(regionInstanceGroupsSetNamedPortsRequestResource)
        .build();
    return setNamedPortsRegionInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the named ports for the specified regional instance group.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   Operation response = regionInstanceGroupClient.setNamedPortsRegionInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setNamedPortsRegionInstanceGroup(SetNamedPortsRegionInstanceGroupHttpRequest request) {
    return setNamedPortsRegionInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the named ports for the specified regional instance group.
   *
   * Sample code:
   * <pre><code>
   * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = regionInstanceGroupClient.setNamedPortsRegionInstanceGroupCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> setNamedPortsRegionInstanceGroupCallable() {
    return stub.setNamedPortsRegionInstanceGroupCallable();
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