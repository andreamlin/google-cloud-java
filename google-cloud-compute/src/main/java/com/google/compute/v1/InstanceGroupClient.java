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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesInstanceGroupsPagedResponse;
import com.google.compute.v1.stub.InstanceGroupStub;
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
 * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
 *
 *   Operation response = instanceGroupClient.addInstancesInstanceGroup();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceGroupClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of InstanceGroupSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * InstanceGroupSettings instanceGroupSettings =
 *     InstanceGroupSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstanceGroupClient instanceGroupClient =
 *     InstanceGroupClient.create(instanceGroupSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * InstanceGroupSettings instanceGroupSettings =
 *     InstanceGroupSettings.newBuilder()
 *         .setTransportProvider(InstanceGroupSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(InstanceGroupSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * InstanceGroupClient instanceGroupClient =
 *     InstanceGroupClient.create(instanceGroupSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceGroupClient implements BackgroundResource {
  private final InstanceGroupSettings settings;
  private final InstanceGroupStub stub;



  /**
   * Constructs an instance of InstanceGroupClient with default settings.
   */
  public static final InstanceGroupClient create() throws IOException {
    return create(InstanceGroupSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InstanceGroupClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final InstanceGroupClient create(InstanceGroupSettings settings) throws IOException {
    return new InstanceGroupClient(settings);
  }

  /**
   * Constructs an instance of InstanceGroupClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use InstanceGroupSettings}.
   */
  public static final InstanceGroupClient create(InstanceGroupStub stub) {
    return new InstanceGroupClient(stub);
  }

  /**
   * Constructs an instance of InstanceGroupClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected InstanceGroupClient(InstanceGroupSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected InstanceGroupClient(InstanceGroupStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InstanceGroupSettings getSettings() {
    return settings;
  }

  @BetaApi
  public InstanceGroupStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read  Adding instances for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.addInstancesInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the instance group where you are adding instances.
   * @param instanceGroupsAddInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addInstancesInstanceGroup(InstanceGroupName instanceGroup, InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequestResource) {

    AddInstancesInstanceGroupHttpRequest request =
        AddInstancesInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithInstanceGroupName(instanceGroup)
        .setInstanceGroupsAddInstancesRequestResource(instanceGroupsAddInstancesRequestResource)
        .build();
    return addInstancesInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read  Adding instances for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.addInstancesInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addInstancesInstanceGroup(AddInstancesInstanceGroupHttpRequest request) {
    return addInstancesInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read  Adding instances for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupClient.addInstancesInstanceGroupCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddInstancesInstanceGroupHttpRequest, Operation> addInstancesInstanceGroupCallable() {
    return stub.addInstancesInstanceGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups and sorts them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   for (InstanceGroup element : instanceGroupClient.aggregatedListInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstanceGroupsPagedResponse aggregatedListInstanceGroups(ProjectName project) {
    AggregatedListInstanceGroupsHttpRequest request =
        AggregatedListInstanceGroupsHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListInstanceGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups and sorts them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   for (InstanceGroup element : instanceGroupClient.aggregatedListInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstanceGroupsPagedResponse aggregatedListInstanceGroups(AggregatedListInstanceGroupsHttpRequest request) {
    return aggregatedListInstanceGroupsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups and sorts them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListInstanceGroupsPagedResponse&gt; future = instanceGroupClient.aggregatedListInstanceGroupsPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceGroup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListInstanceGroupsHttpRequest, AggregatedListInstanceGroupsPagedResponse> aggregatedListInstanceGroupsPagedCallable() {
    return stub.aggregatedListInstanceGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups and sorts them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   while (true) {
   *     InstanceGroupAggregatedList response = instanceGroupClient.aggregatedListInstanceGroupsCallable().call();
   *     for (InstanceGroup element : response.getInstanceGroups()) {
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
  public final UnaryCallable<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList> aggregatedListInstanceGroupsCallable() {
    return stub.aggregatedListInstanceGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read  Deleting an instance group for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.deleteInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the instance group to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstanceGroup(InstanceGroupName instanceGroup) {

    DeleteInstanceGroupHttpRequest request =
        DeleteInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithInstanceGroupName(instanceGroup)
        .build();
    return deleteInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read  Deleting an instance group for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.deleteInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstanceGroup(DeleteInstanceGroupHttpRequest request) {
    return deleteInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read  Deleting an instance group for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupClient.deleteInstanceGroupCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteInstanceGroupHttpRequest, Operation> deleteInstanceGroupCallable() {
    return stub.deleteInstanceGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance group. Get a list of available instance groups by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   InstanceGroup response = instanceGroupClient.getInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the instance group.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroup getInstanceGroup(InstanceGroupName instanceGroup) {

    GetInstanceGroupHttpRequest request =
        GetInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithInstanceGroupName(instanceGroup)
        .build();
    return getInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance group. Get a list of available instance groups by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   InstanceGroup response = instanceGroupClient.getInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroup getInstanceGroup(GetInstanceGroupHttpRequest request) {
    return getInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance group. Get a list of available instance groups by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;InstanceGroup&gt; future = instanceGroupClient.getInstanceGroupCallable().futureCall();
   *   // Do something
   *   InstanceGroup response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetInstanceGroupHttpRequest, InstanceGroup> getInstanceGroupCallable() {
    return stub.getInstanceGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance group in the specified project using the parameters that are included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.insertInstanceGroup();
   * }
   * </code></pre>
   *
   * @param zone The name of the zone where you want to create the instance group.
   * @param instanceGroupResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstanceGroup(ZoneName zone, InstanceGroup instanceGroupResource) {

    InsertInstanceGroupHttpRequest request =
        InsertInstanceGroupHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .setInstanceGroupResource(instanceGroupResource)
        .build();
    return insertInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance group in the specified project using the parameters that are included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.insertInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstanceGroup(InsertInstanceGroupHttpRequest request) {
    return insertInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance group in the specified project using the parameters that are included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupClient.insertInstanceGroupCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertInstanceGroupHttpRequest, Operation> insertInstanceGroupCallable() {
    return stub.insertInstanceGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups that are located in the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   for (InstanceGroup element : instanceGroupClient.listInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone where the instance group is located.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstanceGroupsPagedResponse listInstanceGroups(ZoneName zone) {
    ListInstanceGroupsHttpRequest request =
        ListInstanceGroupsHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listInstanceGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups that are located in the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   for (InstanceGroup element : instanceGroupClient.listInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstanceGroupsPagedResponse listInstanceGroups(ListInstanceGroupsHttpRequest request) {
    return listInstanceGroupsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups that are located in the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;ListInstanceGroupsPagedResponse&gt; future = instanceGroupClient.listInstanceGroupsPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceGroup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListInstanceGroupsHttpRequest, ListInstanceGroupsPagedResponse> listInstanceGroupsPagedCallable() {
    return stub.listInstanceGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instance groups that are located in the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   while (true) {
   *     InstanceGroupList response = instanceGroupClient.listInstanceGroupsCallable().call();
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
  public final UnaryCallable<ListInstanceGroupsHttpRequest, InstanceGroupList> listInstanceGroupsCallable() {
    return stub.listInstanceGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   for (InstanceWithNamedPorts element : instanceGroupClient.listInstancesInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the instance group from which you want to generate a list of included instances.
   * @param instanceGroupsListInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesInstanceGroupsPagedResponse listInstancesInstanceGroups(InstanceGroupName instanceGroup, InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequestResource) {
    ListInstancesInstanceGroupsHttpRequest request =
        ListInstancesInstanceGroupsHttpRequest.newBuilder()
        .setInstanceGroupWithInstanceGroupName(instanceGroup)
        .setInstanceGroupsListInstancesRequestResource(instanceGroupsListInstancesRequestResource)
        .build();
    return listInstancesInstanceGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   for (InstanceWithNamedPorts element : instanceGroupClient.listInstancesInstanceGroups().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesInstanceGroupsPagedResponse listInstancesInstanceGroups(ListInstancesInstanceGroupsHttpRequest request) {
    return listInstancesInstanceGroupsPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;ListInstancesInstanceGroupsPagedResponse&gt; future = instanceGroupClient.listInstancesInstanceGroupsPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceWithNamedPorts element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListInstancesInstanceGroupsHttpRequest, ListInstancesInstanceGroupsPagedResponse> listInstancesInstanceGroupsPagedCallable() {
    return stub.listInstancesInstanceGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the instances in the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   while (true) {
   *     InstanceGroupsListInstances response = instanceGroupClient.listInstancesInstanceGroupsCallable().call();
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
  public final UnaryCallable<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances> listInstancesInstanceGroupsCallable() {
    return stub.listInstancesInstanceGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes one or more instances from the specified instance group, but does not delete those instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.removeInstancesInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the instance group where the specified instances will be removed.
   * @param instanceGroupsRemoveInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation removeInstancesInstanceGroup(InstanceGroupName instanceGroup, InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequestResource) {

    RemoveInstancesInstanceGroupHttpRequest request =
        RemoveInstancesInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithInstanceGroupName(instanceGroup)
        .setInstanceGroupsRemoveInstancesRequestResource(instanceGroupsRemoveInstancesRequestResource)
        .build();
    return removeInstancesInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes one or more instances from the specified instance group, but does not delete those instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.removeInstancesInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation removeInstancesInstanceGroup(RemoveInstancesInstanceGroupHttpRequest request) {
    return removeInstancesInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Removes one or more instances from the specified instance group, but does not delete those instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupClient.removeInstancesInstanceGroupCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<RemoveInstancesInstanceGroupHttpRequest, Operation> removeInstancesInstanceGroupCallable() {
    return stub.removeInstancesInstanceGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the named ports for the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.setNamedPortsInstanceGroup();
   * }
   * </code></pre>
   *
   * @param instanceGroup The name of the instance group where the named ports are updated.
   * @param instanceGroupsSetNamedPortsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setNamedPortsInstanceGroup(InstanceGroupName instanceGroup, InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequestResource) {

    SetNamedPortsInstanceGroupHttpRequest request =
        SetNamedPortsInstanceGroupHttpRequest.newBuilder()
        .setInstanceGroupWithInstanceGroupName(instanceGroup)
        .setInstanceGroupsSetNamedPortsRequestResource(instanceGroupsSetNamedPortsRequestResource)
        .build();
    return setNamedPortsInstanceGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the named ports for the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   Operation response = instanceGroupClient.setNamedPortsInstanceGroup();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setNamedPortsInstanceGroup(SetNamedPortsInstanceGroupHttpRequest request) {
    return setNamedPortsInstanceGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the named ports for the specified instance group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupClient.setNamedPortsInstanceGroupCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetNamedPortsInstanceGroupHttpRequest, Operation> setNamedPortsInstanceGroupCallable() {
    return stub.setNamedPortsInstanceGroupCallable();
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