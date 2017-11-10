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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
import com.google.compute.v1.stub.InstanceStub;
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
 * try (InstanceClient instanceClient = InstanceClient.create()) {
 *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
 *   String networkInterface = "";
 *   AccessConfig accessConfig = AccessConfig.newBuilder().build();
 *   Operation response = instanceClient.addAccessConfigInstance(instance, networkInterface, accessConfig);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of InstanceSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * InstanceSettings instanceSettings =
 *     InstanceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstanceClient instanceClient =
 *     InstanceClient.create(instanceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * InstanceSettings instanceSettings =
 *     InstanceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * InstanceClient instanceClient =
 *     InstanceClient.create(instanceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceClient implements BackgroundResource {
  private final InstanceSettings settings;
  private final InstanceStub stub;



  /**
   * Constructs an instance of InstanceClient with default settings.
   */
  public static final InstanceClient create() throws IOException {
    return create(InstanceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InstanceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final InstanceClient create(InstanceSettings settings) throws IOException {
    return new InstanceClient(settings);
  }

  /**
   * Constructs an instance of InstanceClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use InstanceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final InstanceClient create(InstanceStub stub) {
    return new InstanceClient(stub);
  }

  /**
   * Constructs an instance of InstanceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected InstanceClient(InstanceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected InstanceClient(InstanceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InstanceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfig = AccessConfig.newBuilder().build();
   *   Operation response = instanceClient.addAccessConfigInstance(instance, networkInterface, accessConfig);
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface to add to this instance.
   * @param accessConfigResource An access configuration attached to an instance's network interface. Only one access config per instance is supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation addAccessConfigInstance(InstanceName instance, String networkInterface, AccessConfig accessConfigResource) {

    AddAccessConfigInstanceHttpRequest request =
        AddAccessConfigInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setNetworkInterface(networkInterface)
        .setAccessConfigResource(accessConfigResource)
        .build();
    return addAccessConfigInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfig = AccessConfig.newBuilder().build();
   *   AddAccessConfigInstanceHttpRequest request = AddAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfig)
   *     .build();
   *   Operation response = instanceClient.addAccessConfigInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfig = AccessConfig.newBuilder().build();
   *   AddAccessConfigInstanceHttpRequest request = AddAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfig)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.addAccessConfigInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Instance element : instanceClient.aggregatedListInstances(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstancesPagedResponse aggregatedListInstances(ProjectName project) {
    AggregatedListInstancesHttpRequest request =
        AggregatedListInstancesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return aggregatedListInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of instances.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   for (Instance element : instanceClient.aggregatedListInstances(request).iterateAll()) {
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   ApiFuture&lt;AggregatedListInstancesPagedResponse&gt; future = instanceClient.aggregatedListInstancesPagedCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
   *     .setProjectWithProjectName(project)
   *     .build();
   *   while (true) {
   *     InstanceAggregatedList response = instanceClient.aggregatedListInstancesCallable().call(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   AttachedDisk attachedDisk = AttachedDisk.newBuilder().build();
   *   Operation response = instanceClient.attachDiskInstance(instance, attachedDisk);
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param attachedDiskResource An instance-attached disk resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation attachDiskInstance(InstanceName instance, AttachedDisk attachedDiskResource) {

    AttachDiskInstanceHttpRequest request =
        AttachDiskInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setAttachedDiskResource(attachedDiskResource)
        .build();
    return attachDiskInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches a Disk resource to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   AttachedDisk attachedDisk = AttachedDisk.newBuilder().build();
   *   AttachDiskInstanceHttpRequest request = AttachDiskInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setAttachedDiskResource(attachedDisk)
   *     .build();
   *   Operation response = instanceClient.attachDiskInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   AttachedDisk attachedDisk = AttachedDisk.newBuilder().build();
   *   AttachDiskInstanceHttpRequest request = AttachDiskInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setAttachedDiskResource(attachedDisk)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.attachDiskInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Operation response = instanceClient.deleteInstance(instance);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   DeleteInstanceHttpRequest request = DeleteInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   Operation response = instanceClient.deleteInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   DeleteInstanceHttpRequest request = DeleteInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.deleteInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   Operation response = instanceClient.deleteAccessConfigInstance(instance, networkInterface, accessConfig);
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface.
   * @param accessConfig The name of the access config to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAccessConfigInstance(InstanceName instance, String networkInterface, String accessConfig) {

    DeleteAccessConfigInstanceHttpRequest request =
        DeleteAccessConfigInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setNetworkInterface(networkInterface)
        .setAccessConfig(accessConfig)
        .build();
    return deleteAccessConfigInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   DeleteAccessConfigInstanceHttpRequest request = DeleteAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfig(accessConfig)
   *     .build();
   *   Operation response = instanceClient.deleteAccessConfigInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   DeleteAccessConfigInstanceHttpRequest request = DeleteAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfig(accessConfig)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.deleteAccessConfigInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   Operation response = instanceClient.detachDiskInstance(instance, deviceName);
   * }
   * </code></pre>
   *
   * @param instance Instance name.
   * @param deviceName Disk device name to detach.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation detachDiskInstance(InstanceName instance, String deviceName) {

    DetachDiskInstanceHttpRequest request =
        DetachDiskInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setDeviceName(deviceName)
        .build();
    return detachDiskInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   DetachDiskInstanceHttpRequest request = DetachDiskInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setDeviceName(deviceName)
   *     .build();
   *   Operation response = instanceClient.detachDiskInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   DetachDiskInstanceHttpRequest request = DetachDiskInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setDeviceName(deviceName)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.detachDiskInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Instance response = instanceClient.getInstance(instance);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   GetInstanceHttpRequest request = GetInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   Instance response = instanceClient.getInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   GetInstanceHttpRequest request = GetInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   ApiFuture&lt;Instance&gt; future = instanceClient.getInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   SerialPortOutput response = instanceClient.getSerialPortOutputInstance(instance, port, start);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param port Specifies which COM or serial port to retrieve data from.
   * @param start For the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value that was returned in the previous call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SerialPortOutput getSerialPortOutputInstance(InstanceName instance, Integer port, String start) {

    GetSerialPortOutputInstanceHttpRequest request =
        GetSerialPortOutputInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setPort(port)
        .setStart(start)
        .build();
    return getSerialPortOutputInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance's serial port output.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   GetSerialPortOutputInstanceHttpRequest request = GetSerialPortOutputInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setPort(port)
   *     .setStart(start)
   *     .build();
   *   SerialPortOutput response = instanceClient.getSerialPortOutputInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   GetSerialPortOutputInstanceHttpRequest request = GetSerialPortOutputInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setPort(port)
   *     .setStart(start)
   *     .build();
   *   ApiFuture&lt;SerialPortOutput&gt; future = instanceClient.getSerialPortOutputInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instance = Instance.newBuilder().build();
   *   Operation response = instanceClient.insertInstance(zone, instance);
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @param instanceResource An Instance resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstance(ZoneName zone, Instance instanceResource) {

    InsertInstanceHttpRequest request =
        InsertInstanceHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .setInstanceResource(instanceResource)
        .build();
    return insertInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instance = Instance.newBuilder().build();
   *   InsertInstanceHttpRequest request = InsertInstanceHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .setInstanceResource(instance)
   *     .build();
   *   Operation response = instanceClient.insertInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instance = Instance.newBuilder().build();
   *   InsertInstanceHttpRequest request = InsertInstanceHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .setInstanceResource(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.insertInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   for (Instance element : instanceClient.listInstances(zone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesPagedResponse listInstances(ZoneName zone) {
    ListInstancesHttpRequest request =
        ListInstancesHttpRequest.newBuilder()
        .setZoneWithZoneName(zone)
        .build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   for (Instance element : instanceClient.listInstances(request).iterateAll()) {
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   ApiFuture&lt;ListInstancesPagedResponse&gt; future = instanceClient.listInstancesPagedCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ZoneName zone = ZoneName.of("[PROJECT]", "[ZONE]");
   *   ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
   *     .setZoneWithZoneName(zone)
   *     .build();
   *   while (true) {
   *     InstanceList response = instanceClient.listInstancesCallable().call(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Operation response = instanceClient.resetInstance(instance);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ResetInstanceHttpRequest request = ResetInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   Operation response = instanceClient.resetInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ResetInstanceHttpRequest request = ResetInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.resetInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   Operation response = instanceClient.setDiskAutoDeleteInstance(instance, autoDelete, deviceName);
   * }
   * </code></pre>
   *
   * @param instance The instance name.
   * @param autoDelete Whether to auto-delete the disk when the instance is deleted.
   * @param deviceName The device name of the disk to modify.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setDiskAutoDeleteInstance(InstanceName instance, Boolean autoDelete, String deviceName) {

    SetDiskAutoDeleteInstanceHttpRequest request =
        SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setAutoDelete(autoDelete)
        .setDeviceName(deviceName)
        .build();
    return setDiskAutoDeleteInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   SetDiskAutoDeleteInstanceHttpRequest request = SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setAutoDelete(autoDelete)
   *     .setDeviceName(deviceName)
   *     .build();
   *   Operation response = instanceClient.setDiskAutoDeleteInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   SetDiskAutoDeleteInstanceHttpRequest request = SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setAutoDelete(autoDelete)
   *     .setDeviceName(deviceName)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setDiskAutoDeleteInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequest = InstancesSetMachineTypeRequest.newBuilder().build();
   *   Operation response = instanceClient.setMachineTypeInstance(instance, instancesSetMachineTypeRequest);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMachineTypeRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setMachineTypeInstance(InstanceName instance, InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource) {

    SetMachineTypeInstanceHttpRequest request =
        SetMachineTypeInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
        .build();
    return setMachineTypeInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequest = InstancesSetMachineTypeRequest.newBuilder().build();
   *   SetMachineTypeInstanceHttpRequest request = SetMachineTypeInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequest)
   *     .build();
   *   Operation response = instanceClient.setMachineTypeInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequest = InstancesSetMachineTypeRequest.newBuilder().build();
   *   SetMachineTypeInstanceHttpRequest request = SetMachineTypeInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setMachineTypeInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadata = Metadata.newBuilder().build();
   *   Operation response = instanceClient.setMetadataInstance(instance, metadata);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param metadataResource A metadata key/value entry.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setMetadataInstance(InstanceName instance, Metadata metadataResource) {

    SetMetadataInstanceHttpRequest request =
        SetMetadataInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setMetadataResource(metadataResource)
        .build();
    return setMetadataInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadata = Metadata.newBuilder().build();
   *   SetMetadataInstanceHttpRequest request = SetMetadataInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setMetadataResource(metadata)
   *     .build();
   *   Operation response = instanceClient.setMetadataInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadata = Metadata.newBuilder().build();
   *   SetMetadataInstanceHttpRequest request = SetMetadataInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setMetadataResource(metadata)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setMetadataInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling scheduling = Scheduling.newBuilder().build();
   *   Operation response = instanceClient.setSchedulingInstance(instance, scheduling);
   * }
   * </code></pre>
   *
   * @param instance Instance name.
   * @param schedulingResource Sets the scheduling options for an Instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setSchedulingInstance(InstanceName instance, Scheduling schedulingResource) {

    SetSchedulingInstanceHttpRequest request =
        SetSchedulingInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setSchedulingResource(schedulingResource)
        .build();
    return setSchedulingInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling scheduling = Scheduling.newBuilder().build();
   *   SetSchedulingInstanceHttpRequest request = SetSchedulingInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setSchedulingResource(scheduling)
   *     .build();
   *   Operation response = instanceClient.setSchedulingInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling scheduling = Scheduling.newBuilder().build();
   *   SetSchedulingInstanceHttpRequest request = SetSchedulingInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setSchedulingResource(scheduling)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setSchedulingInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequest = InstancesSetServiceAccountRequest.newBuilder().build();
   *   Operation response = instanceClient.setServiceAccountInstance(instance, instancesSetServiceAccountRequest);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesSetServiceAccountRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setServiceAccountInstance(InstanceName instance, InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource) {

    SetServiceAccountInstanceHttpRequest request =
        SetServiceAccountInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
        .build();
    return setServiceAccountInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequest = InstancesSetServiceAccountRequest.newBuilder().build();
   *   SetServiceAccountInstanceHttpRequest request = SetServiceAccountInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequest)
   *     .build();
   *   Operation response = instanceClient.setServiceAccountInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequest = InstancesSetServiceAccountRequest.newBuilder().build();
   *   SetServiceAccountInstanceHttpRequest request = SetServiceAccountInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setServiceAccountInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tags = Tags.newBuilder().build();
   *   Operation response = instanceClient.setTagsInstance(instance, tags);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param tagsResource A set of instance tags.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setTagsInstance(InstanceName instance, Tags tagsResource) {

    SetTagsInstanceHttpRequest request =
        SetTagsInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setTagsResource(tagsResource)
        .build();
    return setTagsInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets tags for the specified instance to the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tags = Tags.newBuilder().build();
   *   SetTagsInstanceHttpRequest request = SetTagsInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setTagsResource(tags)
   *     .build();
   *   Operation response = instanceClient.setTagsInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tags = Tags.newBuilder().build();
   *   SetTagsInstanceHttpRequest request = SetTagsInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setTagsResource(tags)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setTagsInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Operation response = instanceClient.startInstance(instance);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StartInstanceHttpRequest request = StartInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   Operation response = instanceClient.startInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StartInstanceHttpRequest request = StartInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.startInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequest = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   Operation response = instanceClient.startWithEncryptionKeyInstance(instance, instancesStartWithEncryptionKeyRequest);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesStartWithEncryptionKeyRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation startWithEncryptionKeyInstance(InstanceName instance, InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource) {

    StartWithEncryptionKeyInstanceHttpRequest request =
        StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
        .setInstanceWithInstanceName(instance)
        .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequestResource)
        .build();
    return startWithEncryptionKeyInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequest = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   StartWithEncryptionKeyInstanceHttpRequest request = StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequest)
   *     .build();
   *   Operation response = instanceClient.startWithEncryptionKeyInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequest = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   StartWithEncryptionKeyInstanceHttpRequest request = StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequest)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.startWithEncryptionKeyInstanceCallable().futureCall(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Operation response = instanceClient.stopInstance(instance);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StopInstanceHttpRequest request = StopInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   Operation response = instanceClient.stopInstance(request);
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
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StopInstanceHttpRequest request = StopInstanceHttpRequest.newBuilder()
   *     .setInstanceWithInstanceName(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.stopInstanceCallable().futureCall(request);
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