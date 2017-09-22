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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
import com.google.compute.v1.stub.InstanceAdminStub;
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
 * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
 *
 *   Operation response = instanceAdminClient.addAccessConfigInstance();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of InstanceAdminSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * InstanceAdminSettings instanceAdminSettings =
 *     InstanceAdminSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstanceAdminClient instanceAdminClient =
 *     InstanceAdminClient.create(instanceAdminSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * InstanceAdminSettings instanceAdminSettings =
 *     InstanceAdminSettings.defaultBuilder()
 *         .setTransportProvider(InstanceAdminSettings.defaultGrpcTransportProviderBuilder()
 *             .setChannelProvider(InstanceAdminSettings.defaultGrpcChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * InstanceAdminClient instanceAdminClient =
 *     InstanceAdminClient.create(instanceAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceAdminClient implements BackgroundResource {
  private final InstanceAdminSettings settings;
  private final InstanceAdminStub stub;



  /**
   * Constructs an instance of InstanceAdminClient with default settings.
   */
  public static final InstanceAdminClient create() throws IOException {
    return create(InstanceAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of InstanceAdminClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final InstanceAdminClient create(InstanceAdminSettings settings) throws IOException {
    return new InstanceAdminClient(settings);
  }

  /**
   * Constructs an instance of InstanceAdminClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use InstanceAdminSettings}.
   */
  public static final InstanceAdminClient create(InstanceAdminStub stub) {
    return new InstanceAdminClient(stub);
  }

  /**
   * Constructs an instance of InstanceAdminClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected InstanceAdminClient(InstanceAdminSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected InstanceAdminClient(InstanceAdminStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InstanceAdminSettings getSettings() {
    return settings;
  }

  public InstanceAdminStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.addAccessConfigInstance();
   * }
   * </code></pre>
   *
   * @param networkInterface The name of the network interface to add to this instance.
   * @param instance The instance name for this request.
   * @param accessConfig An access configuration attached to an instance's network interface. Only one access config per instance is supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addAccessConfigInstance(String networkInterface, InstanceName instance, AccessConfig accessConfig) {

    AddAccessConfigInstanceHttpRequest request =
        AddAccessConfigInstanceHttpRequest.newBuilder()
        .setNetworkInterface(networkInterface)
        .setInstanceWithInstanceName(instance)
        .setAccessConfig(accessConfig)
        .build();
    return addAccessConfigInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.addAccessConfigInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addAccessConfigInstance(AddAccessConfigInstanceHttpRequest request) {
    return addAccessConfigInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.addAccessConfigInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceCallable() {
    return stub.addAccessConfigInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   for (Instance element : instanceAdminClient.aggregatedListInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstancesPagedResponse aggregatedListInstances(InstancesProjectName project) {
    AggregatedListInstancesHttpRequest request =
        AggregatedListInstancesHttpRequest.newBuilder()
        .setProjectWithInstancesProjectName(project)
        .build();
    return aggregatedListInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   for (Instance element : instanceAdminClient.aggregatedListInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstancesPagedResponse aggregatedListInstances(AggregatedListInstancesHttpRequest request) {
    return aggregatedListInstancesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;AggregatedListInstancesPagedResponse&gt; future = instanceAdminClient.aggregatedListInstancesPagedCallable().futureCall();
   *   // Do something
   *   for (Instance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse> aggregatedListInstancesPagedCallable() {
    return stub.aggregatedListInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   while (true) {
   *     InstanceAggregatedList response = instanceAdminClient.aggregatedListInstancesCallable().call();
   *     for (Instance element : response.getInstances()) {
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
  public final UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> aggregatedListInstancesCallable() {
    return stub.aggregatedListInstancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches a Disk resource to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.attachDiskInstance();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param attachedDisk An instance-attached disk resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation attachDiskInstance(InstanceName instance, AttachedDisk attachedDisk) {

    AttachDiskInstanceHttpRequest request =
        AttachDiskInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setAttachedDisk(attachedDisk)
        .build();
    return attachDiskInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches a Disk resource to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.attachDiskInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation attachDiskInstance(AttachDiskInstanceHttpRequest request) {
    return attachDiskInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches a Disk resource to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.attachDiskInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable() {
    return stub.attachDiskInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.deleteInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstance(InstanceName instance) {

    DeleteInstanceHttpRequest request =
        DeleteInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .build();
    return deleteInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.deleteInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstance(DeleteInstanceHttpRequest request) {
    return deleteInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.deleteInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable() {
    return stub.deleteInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.deleteAccessConfigInstance();
   * }
   * </code></pre>
   *
   * @param networkInterface The name of the network interface.
   * @param accessConfig The name of the access config to delete.
   * @param instance The instance name for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAccessConfigInstance(String networkInterface, String accessConfig, InstanceName instance) {

    DeleteAccessConfigInstanceHttpRequest request =
        DeleteAccessConfigInstanceHttpRequest.newBuilder()
        .setNetworkInterface(networkInterface)
        .setAccessConfig(accessConfig)
        .setInstanceWithInstanceName(instance)
        .build();
    return deleteAccessConfigInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.deleteAccessConfigInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAccessConfigInstance(DeleteAccessConfigInstanceHttpRequest request) {
    return deleteAccessConfigInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.deleteAccessConfigInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceCallable() {
    return stub.deleteAccessConfigInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.detachDiskInstance();
   * }
   * </code></pre>
   *
   * @param deviceName Disk device name to detach.
   * @param instance Instance name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation detachDiskInstance(String deviceName, InstanceName instance) {

    DetachDiskInstanceHttpRequest request =
        DetachDiskInstanceHttpRequest.newBuilder()
        .setDeviceName(deviceName)
        .setInstanceWithInstanceName(instance)
        .build();
    return detachDiskInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.detachDiskInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation detachDiskInstance(DetachDiskInstanceHttpRequest request) {
    return detachDiskInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.detachDiskInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceCallable() {
    return stub.detachDiskInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Get a list of available instances by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Instance response = instanceAdminClient.getInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Instance getInstance(InstanceName instance) {

    GetInstanceHttpRequest request =
        GetInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Get a list of available instances by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Instance response = instanceAdminClient.getInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Instance getInstance(GetInstanceHttpRequest request) {
    return getInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Get a list of available instances by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Instance&gt; future = instanceAdminClient.getInstanceCallable().futureCall();
   *   // Do something
   *   Instance response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetInstanceHttpRequest, Instance> getInstanceCallable() {
    return stub.getInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance's serial port output.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   SerialPortOutput response = instanceAdminClient.getSerialPortOutputInstance();
   * }
   * </code></pre>
   *
   * @param port Specifies which COM or serial port to retrieve data from.
   * @param start For the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value that was returned in the previous call.
   * @param instance Name of the instance scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SerialPortOutput getSerialPortOutputInstance(Integer port, String start, InstanceName instance) {

    GetSerialPortOutputInstanceHttpRequest request =
        GetSerialPortOutputInstanceHttpRequest.newBuilder()
        .setPort(port)
        .setStart(start)
        .setInstanceWithInstanceName(instance)
        .build();
    return getSerialPortOutputInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance's serial port output.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   SerialPortOutput response = instanceAdminClient.getSerialPortOutputInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SerialPortOutput getSerialPortOutputInstance(GetSerialPortOutputInstanceHttpRequest request) {
    return getSerialPortOutputInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance's serial port output.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;SerialPortOutput&gt; future = instanceAdminClient.getSerialPortOutputInstanceCallable().futureCall();
   *   // Do something
   *   SerialPortOutput response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceCallable() {
    return stub.getSerialPortOutputInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.insertInstance();
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @param instance An Instance resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstance(InstancesZoneName zone, Instance instance) {

    InsertInstanceHttpRequest request =
        InsertInstanceHttpRequest.newBuilder()
        .setZoneWithInstancesZoneName(zone)
        .setInstance(instance)
        .build();
    return insertInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.insertInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstance(InsertInstanceHttpRequest request) {
    return insertInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.insertInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable() {
    return stub.insertInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   for (Instance element : instanceAdminClient.listInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesPagedResponse listInstances(InstancesZoneName zone) {
    ListInstancesHttpRequest request =
        ListInstancesHttpRequest.newBuilder()
        .setZoneWithInstancesZoneName(zone)
        .build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   for (Instance element : instanceAdminClient.listInstances().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesPagedResponse listInstances(ListInstancesHttpRequest request) {
    return listInstancesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;ListInstancesPagedResponse&gt; future = instanceAdminClient.listInstancesPagedCallable().futureCall();
   *   // Do something
   *   for (Instance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse> listInstancesPagedCallable() {
    return stub.listInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   while (true) {
   *     InstanceList response = instanceAdminClient.listInstancesCallable().call();
   *     for (Instance element : response.getItems()) {
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
  public final UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable() {
    return stub.listInstancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a hard reset on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.resetInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation resetInstance(InstanceName instance) {

    ResetInstanceHttpRequest request =
        ResetInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .build();
    return resetInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a hard reset on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.resetInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation resetInstance(ResetInstanceHttpRequest request) {
    return resetInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a hard reset on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.resetInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable() {
    return stub.resetInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setDiskAutoDeleteInstance();
   * }
   * </code></pre>
   *
   * @param deviceName The device name of the disk to modify.
   * @param autoDelete Whether to auto-delete the disk when the instance is deleted.
   * @param instance The instance name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setDiskAutoDeleteInstance(String deviceName, Boolean autoDelete, InstanceName instance) {

    SetDiskAutoDeleteInstanceHttpRequest request =
        SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
        .setDeviceName(deviceName)
        .setAutoDelete(autoDelete)
        .setInstanceWithInstanceName(instance)
        .build();
    return setDiskAutoDeleteInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setDiskAutoDeleteInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setDiskAutoDeleteInstance(SetDiskAutoDeleteInstanceHttpRequest request) {
    return setDiskAutoDeleteInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.setDiskAutoDeleteInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceCallable() {
    return stub.setDiskAutoDeleteInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setMachineTypeInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMachineTypeRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setMachineTypeInstance(InstanceName instance, InstancesSetMachineTypeRequest instancesSetMachineTypeRequest) {

    SetMachineTypeInstanceHttpRequest request =
        SetMachineTypeInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setInstancesSetMachineTypeRequest(instancesSetMachineTypeRequest)
        .build();
    return setMachineTypeInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setMachineTypeInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setMachineTypeInstance(SetMachineTypeInstanceHttpRequest request) {
    return setMachineTypeInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.setMachineTypeInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceCallable() {
    return stub.setMachineTypeInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setMetadataInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param metadata A metadata key/value entry.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setMetadataInstance(InstanceName instance, Metadata metadata) {

    SetMetadataInstanceHttpRequest request =
        SetMetadataInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setMetadata(metadata)
        .build();
    return setMetadataInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setMetadataInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setMetadataInstance(SetMetadataInstanceHttpRequest request) {
    return setMetadataInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.setMetadataInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceCallable() {
    return stub.setMetadataInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setSchedulingInstance();
   * }
   * </code></pre>
   *
   * @param instance Instance name.
   * @param scheduling Sets the scheduling options for an Instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSchedulingInstance(InstanceName instance, Scheduling scheduling) {

    SetSchedulingInstanceHttpRequest request =
        SetSchedulingInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setScheduling(scheduling)
        .build();
    return setSchedulingInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setSchedulingInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSchedulingInstance(SetSchedulingInstanceHttpRequest request) {
    return setSchedulingInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.setSchedulingInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceCallable() {
    return stub.setSchedulingInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setServiceAccountInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesSetServiceAccountRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setServiceAccountInstance(InstanceName instance, InstancesSetServiceAccountRequest instancesSetServiceAccountRequest) {

    SetServiceAccountInstanceHttpRequest request =
        SetServiceAccountInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setInstancesSetServiceAccountRequest(instancesSetServiceAccountRequest)
        .build();
    return setServiceAccountInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setServiceAccountInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setServiceAccountInstance(SetServiceAccountInstanceHttpRequest request) {
    return setServiceAccountInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.setServiceAccountInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceCallable() {
    return stub.setServiceAccountInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets tags for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setTagsInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param tags A set of instance tags.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTagsInstance(InstanceName instance, Tags tags) {

    SetTagsInstanceHttpRequest request =
        SetTagsInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setTags(tags)
        .build();
    return setTagsInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets tags for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.setTagsInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTagsInstance(SetTagsInstanceHttpRequest request) {
    return setTagsInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets tags for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.setTagsInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable() {
    return stub.setTagsInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.startInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation startInstance(InstanceName instance) {

    StartInstanceHttpRequest request =
        StartInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .build();
    return startInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.startInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation startInstance(StartInstanceHttpRequest request) {
    return startInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.startInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable() {
    return stub.startInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.startWithEncryptionKeyInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesStartWithEncryptionKeyRequest
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation startWithEncryptionKeyInstance(InstanceName instance, InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequest) {

    StartWithEncryptionKeyInstanceHttpRequest request =
        StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setInstancesStartWithEncryptionKeyRequest(instancesStartWithEncryptionKeyRequest)
        .build();
    return startWithEncryptionKeyInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.startWithEncryptionKeyInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation startWithEncryptionKeyInstance(StartWithEncryptionKeyInstanceHttpRequest request) {
    return startWithEncryptionKeyInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.startWithEncryptionKeyInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceCallable() {
    return stub.startWithEncryptionKeyInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute, virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.stopInstance();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to stop.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation stopInstance(InstanceName instance) {

    StopInstanceHttpRequest request =
        StopInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .build();
    return stopInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute, virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   Operation response = instanceAdminClient.stopInstance();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation stopInstance(StopInstanceHttpRequest request) {
    return stopInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute, virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.stopInstanceCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable() {
    return stub.stopInstanceCallable();
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