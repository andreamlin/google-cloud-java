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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupManagersPagedResponse;
import com.google.compute.v1.stub.InstanceGroupManagerAdminStub;
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
 * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
 *
 *   Operation response = instanceGroupManagerAdminClient.abandonInstancesInstanceGroupManager();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceGroupManagerAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of InstanceGroupManagerAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * InstanceGroupManagerAdminSettings instanceGroupManagerAdminSettings =
 *     InstanceGroupManagerAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstanceGroupManagerAdminClient instanceGroupManagerAdminClient =
 *     InstanceGroupManagerAdminClient.create(instanceGroupManagerAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * InstanceGroupManagerAdminSettings instanceGroupManagerAdminSettings =
 *     InstanceGroupManagerAdminSettings.defaultBuilder()
 *         .setTransportProvider(InstanceGroupManagerAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(InstanceGroupManagerAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * InstanceGroupManagerAdminClient instanceGroupManagerAdminClient =
 *     InstanceGroupManagerAdminClient.create(instanceGroupManagerAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceGroupManagerAdminClient implements BackgroundResource {
  private final InstanceGroupManagerAdminSettings settings;
  private final InstanceGroupManagerAdminStub stub;



  /**
   * Constructs an instance of InstanceGroupManagerAdminClient with default settings.
   */
  public static final InstanceGroupManagerAdminClient create() throws IOException {
    return create(InstanceGroupManagerAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of InstanceGroupManagerAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final InstanceGroupManagerAdminClient create(InstanceGroupManagerAdminSettings settings) throws IOException {
    return new InstanceGroupManagerAdminClient(settings);
  }

  /**
   * Constructs an instance of InstanceGroupManagerAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use InstanceGroupManagerAdminSettings}.
   */
  public static final InstanceGroupManagerAdminClient create(InstanceGroupManagerAdminStub stub) {
    return new InstanceGroupManagerAdminClient(stub);
  }

  /**
   * Constructs an instance of InstanceGroupManagerAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected InstanceGroupManagerAdminClient(InstanceGroupManagerAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected InstanceGroupManagerAdminClient(InstanceGroupManagerAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InstanceGroupManagerAdminSettings getSettings() {
    return settings;
  }

  public InstanceGroupManagerAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to remove the specified instances from the managed instance group. Abandoning an instance does not delete the instance, but it does remove the instance from any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed instance group by the number of instances that you abandon. This operation is marked as DONE when the action is scheduled even if the instances have not yet been removed from the group. You must separately verify the status of the abandoning action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.abandonInstancesInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @param instanceGroupManagersAbandonInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation abandonInstancesInstanceGroupManager(InstanceGroupManagerName instanceGroupManager, InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequestResource) {

    AbandonInstancesInstanceGroupManagerHttpRequest request =
        AbandonInstancesInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .setInstanceGroupManagersAbandonInstancesRequestResource(instanceGroupManagersAbandonInstancesRequestResource)
        .build();
    return abandonInstancesInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to remove the specified instances from the managed instance group. Abandoning an instance does not delete the instance, but it does remove the instance from any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed instance group by the number of instances that you abandon. This operation is marked as DONE when the action is scheduled even if the instances have not yet been removed from the group. You must separately verify the status of the abandoning action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.abandonInstancesInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation abandonInstancesInstanceGroupManager(AbandonInstancesInstanceGroupManagerHttpRequest request) {
    return abandonInstancesInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to remove the specified instances from the managed instance group. Abandoning an instance does not delete the instance, but it does remove the instance from any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed instance group by the number of instances that you abandon. This operation is marked as DONE when the action is scheduled even if the instances have not yet been removed from the group. You must separately verify the status of the abandoning action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.abandonInstancesInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerCallable() {
    return stub.abandonInstancesInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of managed instance groups and groups them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   for (InstanceGroupManager element : instanceGroupManagerAdminClient.aggregatedListInstanceGroupManagers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstanceGroupManagersPagedResponse aggregatedListInstanceGroupManagers(ProjectName project) {
    AggregatedListInstanceGroupManagersHttpRequest request =
        AggregatedListInstanceGroupManagersHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListInstanceGroupManagers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of managed instance groups and groups them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   for (InstanceGroupManager element : instanceGroupManagerAdminClient.aggregatedListInstanceGroupManagers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstanceGroupManagersPagedResponse aggregatedListInstanceGroupManagers(AggregatedListInstanceGroupManagersHttpRequest request) {
    return aggregatedListInstanceGroupManagersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of managed instance groups and groups them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListInstanceGroupManagersPagedResponse&gt; future = instanceGroupManagerAdminClient.aggregatedListInstanceGroupManagersPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceGroupManager element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersPagedCallable() {
    return stub.aggregatedListInstanceGroupManagersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of managed instance groups and groups them by zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   while (true) {
   *     InstanceGroupManagerAggregatedList response = instanceGroupManagerAdminClient.aggregatedListInstanceGroupManagersCallable().call();
   *     for (InstanceGroupManager element : response.getInstanceGroupManagers()) {
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
  public final UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> aggregatedListInstanceGroupManagersCallable() {
    return stub.aggregatedListInstanceGroupManagersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service. Read  Deleting an instance group for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.deleteInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstanceGroupManager(InstanceGroupManagerName instanceGroupManager) {

    DeleteInstanceGroupManagerHttpRequest request =
        DeleteInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .build();
    return deleteInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service. Read  Deleting an instance group for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.deleteInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstanceGroupManager(DeleteInstanceGroupManagerHttpRequest request) {
    return deleteInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service. Read  Deleting an instance group for more information.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.deleteInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerCallable() {
    return stub.deleteInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to delete the specified instances in the managed instance group. The instances are also removed from any target pools of which they were a member. This method reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is marked as DONE when the action is scheduled even if the instances are still being deleted. You must separately verify the status of the deleting action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.deleteInstancesInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @param instanceGroupManagersDeleteInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstancesInstanceGroupManager(InstanceGroupManagerName instanceGroupManager, InstanceGroupManagersDeleteInstancesRequest instanceGroupManagersDeleteInstancesRequestResource) {

    DeleteInstancesInstanceGroupManagerHttpRequest request =
        DeleteInstancesInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .setInstanceGroupManagersDeleteInstancesRequestResource(instanceGroupManagersDeleteInstancesRequestResource)
        .build();
    return deleteInstancesInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to delete the specified instances in the managed instance group. The instances are also removed from any target pools of which they were a member. This method reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is marked as DONE when the action is scheduled even if the instances are still being deleted. You must separately verify the status of the deleting action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.deleteInstancesInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstancesInstanceGroupManager(DeleteInstancesInstanceGroupManagerHttpRequest request) {
    return deleteInstancesInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to delete the specified instances in the managed instance group. The instances are also removed from any target pools of which they were a member. This method reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is marked as DONE when the action is scheduled even if the instances are still being deleted. You must separately verify the status of the deleting action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.deleteInstancesInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerCallable() {
    return stub.deleteInstancesInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all of the details about the specified managed instance group. Get a list of available managed instance groups by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   InstanceGroupManager response = instanceGroupManagerAdminClient.getInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroupManager getInstanceGroupManager(InstanceGroupManagerName instanceGroupManager) {

    GetInstanceGroupManagerHttpRequest request =
        GetInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .build();
    return getInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all of the details about the specified managed instance group. Get a list of available managed instance groups by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   InstanceGroupManager response = instanceGroupManagerAdminClient.getInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroupManager getInstanceGroupManager(GetInstanceGroupManagerHttpRequest request) {
    return getInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all of the details about the specified managed instance group. Get a list of available managed instance groups by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;InstanceGroupManager&gt; future = instanceGroupManagerAdminClient.getInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   InstanceGroupManager response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerCallable() {
    return stub.getInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.insertInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param zone The name of the zone where you want to create the managed instance group.
   * @param instanceGroupManagerResource An Instance Group Manager resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstanceGroupManager(ZoneName zone, InstanceGroupManager instanceGroupManagerResource) {

    InsertInstanceGroupManagerHttpRequest request =
        InsertInstanceGroupManagerHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .setInstanceGroupManagerResource(instanceGroupManagerResource)
        .build();
    return insertInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.insertInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstanceGroupManager(InsertInstanceGroupManagerHttpRequest request) {
    return insertInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.insertInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerCallable() {
    return stub.insertInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of managed instance groups that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   for (InstanceGroupManager element : instanceGroupManagerAdminClient.listInstanceGroupManagers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone where the managed instance group is located.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstanceGroupManagersPagedResponse listInstanceGroupManagers(ZoneName zone) {
    ListInstanceGroupManagersHttpRequest request =
        ListInstanceGroupManagersHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listInstanceGroupManagers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of managed instance groups that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   for (InstanceGroupManager element : instanceGroupManagerAdminClient.listInstanceGroupManagers().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstanceGroupManagersPagedResponse listInstanceGroupManagers(ListInstanceGroupManagersHttpRequest request) {
    return listInstanceGroupManagersPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of managed instance groups that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;ListInstanceGroupManagersPagedResponse&gt; future = instanceGroupManagerAdminClient.listInstanceGroupManagersPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceGroupManager element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListInstanceGroupManagersHttpRequest, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersPagedCallable() {
    return stub.listInstanceGroupManagersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of managed instance groups that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   while (true) {
   *     InstanceGroupManagerList response = instanceGroupManagerAdminClient.listInstanceGroupManagersCallable().call();
   *     for (InstanceGroupManager element : response.getItems()) {
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
  public final UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> listInstanceGroupManagersCallable() {
    return stub.listInstanceGroupManagersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed instance group is performing on the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous action failed, the list displays the errors for that failed action.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   InstanceGroupManagersListManagedInstancesResponse response = instanceGroupManagerAdminClient.listManagedInstancesInstanceGroupManagers();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroupManagersListManagedInstancesResponse listManagedInstancesInstanceGroupManagers(InstanceGroupManagerName instanceGroupManager) {

    ListManagedInstancesInstanceGroupManagersHttpRequest request =
        ListManagedInstancesInstanceGroupManagersHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .build();
    return listManagedInstancesInstanceGroupManagers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed instance group is performing on the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous action failed, the list displays the errors for that failed action.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   InstanceGroupManagersListManagedInstancesResponse response = instanceGroupManagerAdminClient.listManagedInstancesInstanceGroupManagers();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceGroupManagersListManagedInstancesResponse listManagedInstancesInstanceGroupManagers(ListManagedInstancesInstanceGroupManagersHttpRequest request) {
    return listManagedInstancesInstanceGroupManagersCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed instance group is performing on the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous action failed, the list displays the errors for that failed action.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;InstanceGroupManagersListManagedInstancesResponse&gt; future = instanceGroupManagerAdminClient.listManagedInstancesInstanceGroupManagersCallable().futureCall();
   *   // Do something
   *   InstanceGroupManagersListManagedInstancesResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersCallable() {
    return stub.listManagedInstancesInstanceGroupManagersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to recreate the specified instances in the managed instance group. The instances are deleted and recreated using the current instance template for the managed instance group. This operation is marked as DONE when the action is scheduled even if the instances have not yet been recreated. You must separately verify the status of the recreating action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.recreateInstancesInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @param instanceGroupManagersRecreateInstancesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation recreateInstancesInstanceGroupManager(InstanceGroupManagerName instanceGroupManager, InstanceGroupManagersRecreateInstancesRequest instanceGroupManagersRecreateInstancesRequestResource) {

    RecreateInstancesInstanceGroupManagerHttpRequest request =
        RecreateInstancesInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .setInstanceGroupManagersRecreateInstancesRequestResource(instanceGroupManagersRecreateInstancesRequestResource)
        .build();
    return recreateInstancesInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to recreate the specified instances in the managed instance group. The instances are deleted and recreated using the current instance template for the managed instance group. This operation is marked as DONE when the action is scheduled even if the instances have not yet been recreated. You must separately verify the status of the recreating action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.recreateInstancesInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation recreateInstancesInstanceGroupManager(RecreateInstancesInstanceGroupManagerHttpRequest request) {
    return recreateInstancesInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Schedules a group action to recreate the specified instances in the managed instance group. The instances are deleted and recreated using the current instance template for the managed instance group. This operation is marked as DONE when the action is scheduled even if the instances have not yet been recreated. You must separately verify the status of the recreating action with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.recreateInstancesInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerCallable() {
    return stub.recreateInstancesInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the size, the group deletes instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or deleted any instances. You must separately verify the status of the creating or deleting actions with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.resizeInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @param size The number of running instances that the managed instance group should maintain at any given time. The group automatically adds or removes instances to maintain the number of instances specified by this parameter.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation resizeInstanceGroupManager(InstanceGroupManagerName instanceGroupManager, Integer size) {

    ResizeInstanceGroupManagerHttpRequest request =
        ResizeInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .setSize(size)
        .build();
    return resizeInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the size, the group deletes instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or deleted any instances. You must separately verify the status of the creating or deleting actions with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.resizeInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation resizeInstanceGroupManager(ResizeInstanceGroupManagerHttpRequest request) {
    return resizeInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the size, the group deletes instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or deleted any instances. You must separately verify the status of the creating or deleting actions with the listmanagedinstances method.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.resizeInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerCallable() {
    return stub.resizeInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change unless you recreate them.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.setInstanceTemplateInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @param instanceGroupManagersSetInstanceTemplateRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setInstanceTemplateInstanceGroupManager(InstanceGroupManagerName instanceGroupManager, InstanceGroupManagersSetInstanceTemplateRequest instanceGroupManagersSetInstanceTemplateRequestResource) {

    SetInstanceTemplateInstanceGroupManagerHttpRequest request =
        SetInstanceTemplateInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .setInstanceGroupManagersSetInstanceTemplateRequestResource(instanceGroupManagersSetInstanceTemplateRequestResource)
        .build();
    return setInstanceTemplateInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change unless you recreate them.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.setInstanceTemplateInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setInstanceTemplateInstanceGroupManager(SetInstanceTemplateInstanceGroupManagerHttpRequest request) {
    return setInstanceTemplateInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change unless you recreate them.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.setInstanceTemplateInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerCallable() {
    return stub.setInstanceTemplateInstanceGroupManagerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the instances in the managed instance group. This operation is marked DONE when you make the request even if the instances have not yet been added to their target pools. The change might take some time to apply to all of the instances in the group depending on the size of the group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.setTargetPoolsInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param instanceGroupManager The name of the managed instance group.
   * @param instanceGroupManagersSetTargetPoolsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTargetPoolsInstanceGroupManager(InstanceGroupManagerName instanceGroupManager, InstanceGroupManagersSetTargetPoolsRequest instanceGroupManagersSetTargetPoolsRequestResource) {

    SetTargetPoolsInstanceGroupManagerHttpRequest request =
        SetTargetPoolsInstanceGroupManagerHttpRequest.newBuilder()
        .setInstanceGroupManagerWithInstanceGroupManagerName(instanceGroupManager)
        .setInstanceGroupManagersSetTargetPoolsRequestResource(instanceGroupManagersSetTargetPoolsRequestResource)
        .build();
    return setTargetPoolsInstanceGroupManager(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the instances in the managed instance group. This operation is marked DONE when you make the request even if the instances have not yet been added to their target pools. The change might take some time to apply to all of the instances in the group depending on the size of the group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   Operation response = instanceGroupManagerAdminClient.setTargetPoolsInstanceGroupManager();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTargetPoolsInstanceGroupManager(SetTargetPoolsInstanceGroupManagerHttpRequest request) {
    return setTargetPoolsInstanceGroupManagerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the instances in the managed instance group. This operation is marked DONE when you make the request even if the instances have not yet been added to their target pools. The change might take some time to apply to all of the instances in the group depending on the size of the group.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceGroupManagerAdminClient.setTargetPoolsInstanceGroupManagerCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerCallable() {
    return stub.setTargetPoolsInstanceGroupManagerCallable();
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