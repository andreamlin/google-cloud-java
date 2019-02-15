/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.InstanceStub;
import com.google.cloud.compute.v1.stub.InstanceStubSettings;
import java.io.IOException;
import java.util.List;
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
 *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
 *   Instance response = instanceClient.getInstance(instance);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of InstanceSettings to create().
 * For example:
 *
 * <p>To customize credentials:
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
@Generated("by gapic-generator")
@BetaApi
public class InstanceClient implements BackgroundResource {
  private final InstanceSettings settings;
  private final InstanceStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of InstanceClient with default settings. */
  public static final InstanceClient create() throws IOException {
    return create(InstanceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InstanceClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
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
   * Constructs an instance of InstanceClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected InstanceClient(InstanceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((InstanceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected InstanceClient(InstanceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final InstanceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceStub getStub() {
    return stub;
  }

  /**
   * Returns the GlobalOperationClient that can be used to query the status of a long-running
   * operation returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final GlobalOperationClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   instanceClient.addAccessConfigInstanceAsync(instance, networkInterface, accessConfigResource).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface to add to this instance.
   * @param accessConfigResource An access configuration attached to an instance's network
   *     interface. Only one access config per instance is supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addAccessConfigInstanceAsync(
      ProjectZoneInstanceName instance,
      String networkInterface,
      AccessConfig accessConfigResource) {

    AddAccessConfigInstanceHttpRequest request =
        AddAccessConfigInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setNetworkInterface(networkInterface)
            .setAccessConfigResource(accessConfigResource)
            .build();
    return addAccessConfigInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   instanceClient.addAccessConfigInstanceAsync(instance.toString(), networkInterface, accessConfigResource).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface to add to this instance.
   * @param accessConfigResource An access configuration attached to an instance's network
   *     interface. Only one access config per instance is supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addAccessConfigInstanceAsync(
      String instance, String networkInterface, AccessConfig accessConfigResource) {

    AddAccessConfigInstanceHttpRequest request =
        AddAccessConfigInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setNetworkInterface(networkInterface)
            .setAccessConfigResource(accessConfigResource)
            .build();
    return addAccessConfigInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   AddAccessConfigInstanceHttpRequest request = AddAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfigResource)
   *     .build();
   *   instanceClient.addAccessConfigInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addAccessConfigInstanceAsync(
      AddAccessConfigInstanceHttpRequest request) {
    return addAccessConfigInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   AddAccessConfigInstanceHttpRequest request = AddAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfigResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.addAccessConfigInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      addAccessConfigInstanceOperationCallable() {
    return stub.addAccessConfigInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds an access config to an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   AddAccessConfigInstanceHttpRequest request = AddAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfigResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.addAccessConfigInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceCallable() {
    return stub.addAccessConfigInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of all of the instances in your project across all regions and zones.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (InstancesScopedList element : instanceClient.aggregatedListInstances(project).iterateAll()) {
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
            .setProject(project == null ? null : project.toString())
            .build();
    return aggregatedListInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of all of the instances in your project across all regions and zones.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (InstancesScopedList element : instanceClient.aggregatedListInstances(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstancesPagedResponse aggregatedListInstances(String project) {
    AggregatedListInstancesHttpRequest request =
        AggregatedListInstancesHttpRequest.newBuilder().setProject(project).build();
    return aggregatedListInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of all of the instances in your project across all regions and zones.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (InstancesScopedList element : instanceClient.aggregatedListInstances(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListInstancesPagedResponse aggregatedListInstances(
      AggregatedListInstancesHttpRequest request) {
    return aggregatedListInstancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of all of the instances in your project across all regions and zones.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;AggregatedListInstancesPagedResponse&gt; future = instanceClient.aggregatedListInstancesPagedCallable().futureCall(request);
   *   // Do something
   *   for (InstancesScopedList element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse>
      aggregatedListInstancesPagedCallable() {
    return stub.aggregatedListInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves aggregated list of all of the instances in your project across all regions and zones.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     InstanceAggregatedList response = instanceClient.aggregatedListInstancesCallable().call(request);
   *     for (InstancesScopedList element : response.getItemsMap()) {
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
  public final UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList>
      aggregatedListInstancesCallable() {
    return stub.aggregatedListInstancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches an existing Disk resource to an instance. You must first create the disk before you
   * can attach it. It is not possible to create and attach a disk at the same time. For more
   * information, read Adding a persistent disk to your instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean forceAttach = false;
   *   AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
   *   instanceClient.attachDiskInstanceAsync(instance, forceAttach, attachedDiskResource).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param forceAttach Whether to force attach the disk even if it's currently attached to another
   *     instance. This is only available for regional disks.
   * @param attachedDiskResource An instance-attached disk resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> attachDiskInstanceAsync(
      ProjectZoneInstanceName instance, Boolean forceAttach, AttachedDisk attachedDiskResource) {

    AttachDiskInstanceHttpRequest request =
        AttachDiskInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setForceAttach(forceAttach)
            .setAttachedDiskResource(attachedDiskResource)
            .build();
    return attachDiskInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches an existing Disk resource to an instance. You must first create the disk before you
   * can attach it. It is not possible to create and attach a disk at the same time. For more
   * information, read Adding a persistent disk to your instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean forceAttach = false;
   *   AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
   *   instanceClient.attachDiskInstanceAsync(instance.toString(), forceAttach, attachedDiskResource).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param forceAttach Whether to force attach the disk even if it's currently attached to another
   *     instance. This is only available for regional disks.
   * @param attachedDiskResource An instance-attached disk resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> attachDiskInstanceAsync(
      String instance, Boolean forceAttach, AttachedDisk attachedDiskResource) {

    AttachDiskInstanceHttpRequest request =
        AttachDiskInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setForceAttach(forceAttach)
            .setAttachedDiskResource(attachedDiskResource)
            .build();
    return attachDiskInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches an existing Disk resource to an instance. You must first create the disk before you
   * can attach it. It is not possible to create and attach a disk at the same time. For more
   * information, read Adding a persistent disk to your instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean forceAttach = false;
   *   AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
   *   AttachDiskInstanceHttpRequest request = AttachDiskInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setForceAttach(forceAttach)
   *     .setAttachedDiskResource(attachedDiskResource)
   *     .build();
   *   instanceClient.attachDiskInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> attachDiskInstanceAsync(
      AttachDiskInstanceHttpRequest request) {
    return attachDiskInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches an existing Disk resource to an instance. You must first create the disk before you
   * can attach it. It is not possible to create and attach a disk at the same time. For more
   * information, read Adding a persistent disk to your instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean forceAttach = false;
   *   AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
   *   AttachDiskInstanceHttpRequest request = AttachDiskInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setForceAttach(forceAttach)
   *     .setAttachedDiskResource(attachedDiskResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.attachDiskInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      attachDiskInstanceOperationCallable() {
    return stub.attachDiskInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Attaches an existing Disk resource to an instance. You must first create the disk before you
   * can attach it. It is not possible to create and attach a disk at the same time. For more
   * information, read Adding a persistent disk to your instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean forceAttach = false;
   *   AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
   *   AttachDiskInstanceHttpRequest request = AttachDiskInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setForceAttach(forceAttach)
   *     .setAttachedDiskResource(attachedDiskResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.attachDiskInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AttachDiskInstanceHttpRequest, Operation>
      attachDiskInstanceCallable() {
    return stub.attachDiskInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   * Instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.deleteInstanceAsync(instance).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteInstanceAsync(
      ProjectZoneInstanceName instance) {

    DeleteInstanceHttpRequest request =
        DeleteInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return deleteInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   * Instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.deleteInstanceAsync(instance.toString()).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteInstanceAsync(String instance) {

    DeleteInstanceHttpRequest request =
        DeleteInstanceHttpRequest.newBuilder().setInstance(instance).build();
    return deleteInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   * Instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   DeleteInstanceHttpRequest request = DeleteInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   instanceClient.deleteInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteInstanceAsync(
      DeleteInstanceHttpRequest request) {
    return deleteInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   * Instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   DeleteInstanceHttpRequest request = DeleteInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.deleteInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteInstanceOperationCallable() {
    return stub.deleteInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   * Instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   DeleteInstanceHttpRequest request = DeleteInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.deleteInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
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
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   instanceClient.deleteAccessConfigInstanceAsync(instance, networkInterface, accessConfig).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface.
   * @param accessConfig The name of the access config to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteAccessConfigInstanceAsync(
      ProjectZoneInstanceName instance, String networkInterface, String accessConfig) {

    DeleteAccessConfigInstanceHttpRequest request =
        DeleteAccessConfigInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setNetworkInterface(networkInterface)
            .setAccessConfig(accessConfig)
            .build();
    return deleteAccessConfigInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   instanceClient.deleteAccessConfigInstanceAsync(instance.toString(), networkInterface, accessConfig).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface.
   * @param accessConfig The name of the access config to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteAccessConfigInstanceAsync(
      String instance, String networkInterface, String accessConfig) {

    DeleteAccessConfigInstanceHttpRequest request =
        DeleteAccessConfigInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setNetworkInterface(networkInterface)
            .setAccessConfig(accessConfig)
            .build();
    return deleteAccessConfigInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   DeleteAccessConfigInstanceHttpRequest request = DeleteAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfig(accessConfig)
   *     .build();
   *   instanceClient.deleteAccessConfigInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteAccessConfigInstanceAsync(
      DeleteAccessConfigInstanceHttpRequest request) {
    return deleteAccessConfigInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   DeleteAccessConfigInstanceHttpRequest request = DeleteAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfig(accessConfig)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.deleteAccessConfigInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteAccessConfigInstanceOperationCallable() {
    return stub.deleteAccessConfigInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an access config from an instance's network interface.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   String accessConfig = "";
   *   DeleteAccessConfigInstanceHttpRequest request = DeleteAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfig(accessConfig)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.deleteAccessConfigInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceCallable() {
    return stub.deleteAccessConfigInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   instanceClient.detachDiskInstanceAsync(instance, deviceName).get();
   * }
   * </code></pre>
   *
   * @param instance Instance name for this request.
   * @param deviceName The device name of the disk to detach. Make a get() request on the instance
   *     to view currently attached disks and device names.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> detachDiskInstanceAsync(
      ProjectZoneInstanceName instance, String deviceName) {

    DetachDiskInstanceHttpRequest request =
        DetachDiskInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setDeviceName(deviceName)
            .build();
    return detachDiskInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   instanceClient.detachDiskInstanceAsync(instance.toString(), deviceName).get();
   * }
   * </code></pre>
   *
   * @param instance Instance name for this request.
   * @param deviceName The device name of the disk to detach. Make a get() request on the instance
   *     to view currently attached disks and device names.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> detachDiskInstanceAsync(
      String instance, String deviceName) {

    DetachDiskInstanceHttpRequest request =
        DetachDiskInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setDeviceName(deviceName)
            .build();
    return detachDiskInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   DetachDiskInstanceHttpRequest request = DetachDiskInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setDeviceName(deviceName)
   *     .build();
   *   instanceClient.detachDiskInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> detachDiskInstanceAsync(
      DetachDiskInstanceHttpRequest request) {
    return detachDiskInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   DetachDiskInstanceHttpRequest request = DetachDiskInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setDeviceName(deviceName)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.detachDiskInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      detachDiskInstanceOperationCallable() {
    return stub.detachDiskInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Detaches a disk from an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String deviceName = "";
   *   DetachDiskInstanceHttpRequest request = DetachDiskInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setDeviceName(deviceName)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.detachDiskInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DetachDiskInstanceHttpRequest, Operation>
      detachDiskInstanceCallable() {
    return stub.detachDiskInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Gets a list of available instances by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Instance response = instanceClient.getInstance(instance);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Instance getInstance(ProjectZoneInstanceName instance) {

    GetInstanceHttpRequest request =
        GetInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Gets a list of available instances by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Instance response = instanceClient.getInstance(instance.toString());
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Instance getInstance(String instance) {

    GetInstanceHttpRequest request =
        GetInstanceHttpRequest.newBuilder().setInstance(instance).build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Gets a list of available instances by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   GetInstanceHttpRequest request = GetInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
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
   * Returns the specified Instance resource. Gets a list of available instances by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   GetInstanceHttpRequest request = GetInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
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
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Policy response = instanceClient.getIamPolicyInstance(resource);
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy getIamPolicyInstance(ProjectZoneInstanceResourceName resource) {

    GetIamPolicyInstanceHttpRequest request =
        GetIamPolicyInstanceHttpRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .build();
    return getIamPolicyInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Policy response = instanceClient.getIamPolicyInstance(resource.toString());
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy getIamPolicyInstance(String resource) {

    GetIamPolicyInstanceHttpRequest request =
        GetIamPolicyInstanceHttpRequest.newBuilder().setResource(resource).build();
    return getIamPolicyInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   GetIamPolicyInstanceHttpRequest request = GetIamPolicyInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .build();
   *   Policy response = instanceClient.getIamPolicyInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy getIamPolicyInstance(GetIamPolicyInstanceHttpRequest request) {
    return getIamPolicyInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   GetIamPolicyInstanceHttpRequest request = GetIamPolicyInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = instanceClient.getIamPolicyInstanceCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetIamPolicyInstanceHttpRequest, Policy>
      getIamPolicyInstanceCallable() {
    return stub.getIamPolicyInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the last 1 MB of serial port output from the specified instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   SerialPortOutput response = instanceClient.getSerialPortOutputInstance(instance, port, start);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param port Specifies which COM or serial port to retrieve data from.
   * @param start Returns output starting from a specific byte position. Use this to page through
   *     output when the output is too large to return in a single request. For the initial request,
   *     leave this field unspecified. For subsequent calls, this field should be set to the next
   *     value returned in the previous call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SerialPortOutput getSerialPortOutputInstance(
      ProjectZoneInstanceName instance, Integer port, String start) {

    GetSerialPortOutputInstanceHttpRequest request =
        GetSerialPortOutputInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setPort(port)
            .setStart(start)
            .build();
    return getSerialPortOutputInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the last 1 MB of serial port output from the specified instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   SerialPortOutput response = instanceClient.getSerialPortOutputInstance(instance.toString(), port, start);
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param port Specifies which COM or serial port to retrieve data from.
   * @param start Returns output starting from a specific byte position. Use this to page through
   *     output when the output is too large to return in a single request. For the initial request,
   *     leave this field unspecified. For subsequent calls, this field should be set to the next
   *     value returned in the previous call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SerialPortOutput getSerialPortOutputInstance(
      String instance, Integer port, String start) {

    GetSerialPortOutputInstanceHttpRequest request =
        GetSerialPortOutputInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setPort(port)
            .setStart(start)
            .build();
    return getSerialPortOutputInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the last 1 MB of serial port output from the specified instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   GetSerialPortOutputInstanceHttpRequest request = GetSerialPortOutputInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
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
  public final SerialPortOutput getSerialPortOutputInstance(
      GetSerialPortOutputInstanceHttpRequest request) {
    return getSerialPortOutputInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the last 1 MB of serial port output from the specified instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Integer port = 0;
   *   String start = "";
   *   GetSerialPortOutputInstanceHttpRequest request = GetSerialPortOutputInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
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
  public final UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceCallable() {
    return stub.getSerialPortOutputInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instanceResource = Instance.newBuilder().build();
   *   instanceClient.insertInstanceAsync(zone, instanceResource).get();
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @param instanceResource An Instance resource. (== resource_for beta.instances ==) (==
   *     resource_for v1.instances ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertInstanceAsync(
      ProjectZoneName zone, Instance instanceResource) {

    InsertInstanceHttpRequest request =
        InsertInstanceHttpRequest.newBuilder()
            .setZone(zone == null ? null : zone.toString())
            .setInstanceResource(instanceResource)
            .build();
    return insertInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instanceResource = Instance.newBuilder().build();
   *   instanceClient.insertInstanceAsync(zone.toString(), instanceResource).get();
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @param instanceResource An Instance resource. (== resource_for beta.instances ==) (==
   *     resource_for v1.instances ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertInstanceAsync(
      String zone, Instance instanceResource) {

    InsertInstanceHttpRequest request =
        InsertInstanceHttpRequest.newBuilder()
            .setZone(zone)
            .setInstanceResource(instanceResource)
            .build();
    return insertInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instanceResource = Instance.newBuilder().build();
   *   InsertInstanceHttpRequest request = InsertInstanceHttpRequest.newBuilder()
   *     .setZone(zone.toString())
   *     .setInstanceResource(instanceResource)
   *     .build();
   *   instanceClient.insertInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertInstanceAsync(
      InsertInstanceHttpRequest request) {
    return insertInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instanceResource = Instance.newBuilder().build();
   *   InsertInstanceHttpRequest request = InsertInstanceHttpRequest.newBuilder()
   *     .setZone(zone.toString())
   *     .setInstanceResource(instanceResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.insertInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
      insertInstanceOperationCallable() {
    return stub.insertInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   Instance instanceResource = Instance.newBuilder().build();
   *   InsertInstanceHttpRequest request = InsertInstanceHttpRequest.newBuilder()
   *     .setZone(zone.toString())
   *     .setInstanceResource(instanceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.insertInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
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
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
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
  public final ListInstancesPagedResponse listInstances(ProjectZoneName zone) {
    ListInstancesHttpRequest request =
        ListInstancesHttpRequest.newBuilder()
            .setZone(zone == null ? null : zone.toString())
            .build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   for (Instance element : instanceClient.listInstances(zone.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param zone The name of the zone for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstancesPagedResponse listInstances(String zone) {
    ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder().setZone(zone).build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
   *     .setZone(zone.toString())
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
    return listInstancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
   *     .setZone(zone.toString())
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
  public final UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return stub.listInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
   *   ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
   *     .setZone(zone.toString())
   *     .build();
   *   while (true) {
   *     InstanceList response = instanceClient.listInstancesCallable().call(request);
   *     for (Instance element : response.getItemsList()) {
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
   * Retrieves the list of referrers to instances contained within the specified zone. For more
   * information, read Viewing Referrers to VM Instances.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   for (Reference element : instanceClient.listReferrersInstances(instance).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param instance Name of the target instance scoping this request, or '-' if the request should
   *     span over all instances in the container.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListReferrersInstancesPagedResponse listReferrersInstances(
      ProjectZoneInstanceName instance) {
    ListReferrersInstancesHttpRequest request =
        ListReferrersInstancesHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return listReferrersInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of referrers to instances contained within the specified zone. For more
   * information, read Viewing Referrers to VM Instances.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   for (Reference element : instanceClient.listReferrersInstances(instance.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param instance Name of the target instance scoping this request, or '-' if the request should
   *     span over all instances in the container.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListReferrersInstancesPagedResponse listReferrersInstances(String instance) {
    ListReferrersInstancesHttpRequest request =
        ListReferrersInstancesHttpRequest.newBuilder().setInstance(instance).build();
    return listReferrersInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of referrers to instances contained within the specified zone. For more
   * information, read Viewing Referrers to VM Instances.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ListReferrersInstancesHttpRequest request = ListReferrersInstancesHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   for (Reference element : instanceClient.listReferrersInstances(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListReferrersInstancesPagedResponse listReferrersInstances(
      ListReferrersInstancesHttpRequest request) {
    return listReferrersInstancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of referrers to instances contained within the specified zone. For more
   * information, read Viewing Referrers to VM Instances.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ListReferrersInstancesHttpRequest request = ListReferrersInstancesHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   ApiFuture&lt;ListReferrersInstancesPagedResponse&gt; future = instanceClient.listReferrersInstancesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Reference element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListReferrersInstancesHttpRequest, ListReferrersInstancesPagedResponse>
      listReferrersInstancesPagedCallable() {
    return stub.listReferrersInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of referrers to instances contained within the specified zone. For more
   * information, read Viewing Referrers to VM Instances.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ListReferrersInstancesHttpRequest request = ListReferrersInstancesHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   while (true) {
   *     InstanceListReferrers response = instanceClient.listReferrersInstancesCallable().call(request);
   *     for (Reference element : response.getItemsList()) {
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
  public final UnaryCallable<ListReferrersInstancesHttpRequest, InstanceListReferrers>
      listReferrersInstancesCallable() {
    return stub.listReferrersInstancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a reset on the instance. This is a hard reset; the VM does not do a graceful shutdown.
   * For more information, see Resetting an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.resetInstanceAsync(instance).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> resetInstanceAsync(
      ProjectZoneInstanceName instance) {

    ResetInstanceHttpRequest request =
        ResetInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return resetInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a reset on the instance. This is a hard reset; the VM does not do a graceful shutdown.
   * For more information, see Resetting an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.resetInstanceAsync(instance.toString()).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> resetInstanceAsync(String instance) {

    ResetInstanceHttpRequest request =
        ResetInstanceHttpRequest.newBuilder().setInstance(instance).build();
    return resetInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a reset on the instance. This is a hard reset; the VM does not do a graceful shutdown.
   * For more information, see Resetting an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ResetInstanceHttpRequest request = ResetInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   instanceClient.resetInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> resetInstanceAsync(
      ResetInstanceHttpRequest request) {
    return resetInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a reset on the instance. This is a hard reset; the VM does not do a graceful shutdown.
   * For more information, see Resetting an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ResetInstanceHttpRequest request = ResetInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.resetInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
      resetInstanceOperationCallable() {
    return stub.resetInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Performs a reset on the instance. This is a hard reset; the VM does not do a graceful shutdown.
   * For more information, see Resetting an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   ResetInstanceHttpRequest request = ResetInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.resetInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable() {
    return stub.resetInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets deletion protection on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Boolean deletionProtection = false;
   *   instanceClient.setDeletionProtectionInstanceAsync(resource, deletionProtection).get();
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @param deletionProtection Whether the resource should be protected against deletion.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setDeletionProtectionInstanceAsync(
      ProjectZoneInstanceResourceName resource, Boolean deletionProtection) {

    SetDeletionProtectionInstanceHttpRequest request =
        SetDeletionProtectionInstanceHttpRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .setDeletionProtection(deletionProtection)
            .build();
    return setDeletionProtectionInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets deletion protection on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Boolean deletionProtection = false;
   *   instanceClient.setDeletionProtectionInstanceAsync(resource.toString(), deletionProtection).get();
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @param deletionProtection Whether the resource should be protected against deletion.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setDeletionProtectionInstanceAsync(
      String resource, Boolean deletionProtection) {

    SetDeletionProtectionInstanceHttpRequest request =
        SetDeletionProtectionInstanceHttpRequest.newBuilder()
            .setResource(resource)
            .setDeletionProtection(deletionProtection)
            .build();
    return setDeletionProtectionInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets deletion protection on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Boolean deletionProtection = false;
   *   SetDeletionProtectionInstanceHttpRequest request = SetDeletionProtectionInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setDeletionProtection(deletionProtection)
   *     .build();
   *   instanceClient.setDeletionProtectionInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setDeletionProtectionInstanceAsync(
      SetDeletionProtectionInstanceHttpRequest request) {
    return setDeletionProtectionInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets deletion protection on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Boolean deletionProtection = false;
   *   SetDeletionProtectionInstanceHttpRequest request = SetDeletionProtectionInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setDeletionProtection(deletionProtection)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setDeletionProtectionInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDeletionProtectionInstanceOperationCallable() {
    return stub.setDeletionProtectionInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets deletion protection on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   Boolean deletionProtection = false;
   *   SetDeletionProtectionInstanceHttpRequest request = SetDeletionProtectionInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setDeletionProtection(deletionProtection)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setDeletionProtectionInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceCallable() {
    return stub.setDeletionProtectionInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   instanceClient.setDiskAutoDeleteInstanceAsync(instance, autoDelete, deviceName).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param autoDelete Whether to auto-delete the disk when the instance is deleted.
   * @param deviceName The device name of the disk to modify. Make a get() request on the instance
   *     to view currently attached disks and device names.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setDiskAutoDeleteInstanceAsync(
      ProjectZoneInstanceName instance, Boolean autoDelete, String deviceName) {

    SetDiskAutoDeleteInstanceHttpRequest request =
        SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setAutoDelete(autoDelete)
            .setDeviceName(deviceName)
            .build();
    return setDiskAutoDeleteInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   instanceClient.setDiskAutoDeleteInstanceAsync(instance.toString(), autoDelete, deviceName).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param autoDelete Whether to auto-delete the disk when the instance is deleted.
   * @param deviceName The device name of the disk to modify. Make a get() request on the instance
   *     to view currently attached disks and device names.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setDiskAutoDeleteInstanceAsync(
      String instance, Boolean autoDelete, String deviceName) {

    SetDiskAutoDeleteInstanceHttpRequest request =
        SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setAutoDelete(autoDelete)
            .setDeviceName(deviceName)
            .build();
    return setDiskAutoDeleteInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   SetDiskAutoDeleteInstanceHttpRequest request = SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setAutoDelete(autoDelete)
   *     .setDeviceName(deviceName)
   *     .build();
   *   instanceClient.setDiskAutoDeleteInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setDiskAutoDeleteInstanceAsync(
      SetDiskAutoDeleteInstanceHttpRequest request) {
    return setDiskAutoDeleteInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   SetDiskAutoDeleteInstanceHttpRequest request = SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setAutoDelete(autoDelete)
   *     .setDeviceName(deviceName)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setDiskAutoDeleteInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDiskAutoDeleteInstanceOperationCallable() {
    return stub.setDiskAutoDeleteInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the auto-delete flag for a disk attached to an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Boolean autoDelete = false;
   *   String deviceName = "";
   *   SetDiskAutoDeleteInstanceHttpRequest request = SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setAutoDelete(autoDelete)
   *     .setDeviceName(deviceName)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setDiskAutoDeleteInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceCallable() {
    return stub.setDiskAutoDeleteInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
   *   Policy response = instanceClient.setIamPolicyInstance(resource, zoneSetPolicyRequestResource);
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @param zoneSetPolicyRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy setIamPolicyInstance(
      ProjectZoneInstanceResourceName resource, ZoneSetPolicyRequest zoneSetPolicyRequestResource) {

    SetIamPolicyInstanceHttpRequest request =
        SetIamPolicyInstanceHttpRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
            .build();
    return setIamPolicyInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
   *   Policy response = instanceClient.setIamPolicyInstance(resource.toString(), zoneSetPolicyRequestResource);
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @param zoneSetPolicyRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy setIamPolicyInstance(
      String resource, ZoneSetPolicyRequest zoneSetPolicyRequestResource) {

    SetIamPolicyInstanceHttpRequest request =
        SetIamPolicyInstanceHttpRequest.newBuilder()
            .setResource(resource)
            .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
            .build();
    return setIamPolicyInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
   *   SetIamPolicyInstanceHttpRequest request = SetIamPolicyInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
   *     .build();
   *   Policy response = instanceClient.setIamPolicyInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy setIamPolicyInstance(SetIamPolicyInstanceHttpRequest request) {
    return setIamPolicyInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
   *   SetIamPolicyInstanceHttpRequest request = SetIamPolicyInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = instanceClient.setIamPolicyInstanceCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetIamPolicyInstanceHttpRequest, Policy>
      setIamPolicyInstanceCallable() {
    return stub.setIamPolicyInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets labels on an instance. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
   *   instanceClient.setLabelsInstanceAsync(instance, instancesSetLabelsRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetLabelsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setLabelsInstanceAsync(
      ProjectZoneInstanceName instance,
      InstancesSetLabelsRequest instancesSetLabelsRequestResource) {

    SetLabelsInstanceHttpRequest request =
        SetLabelsInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setInstancesSetLabelsRequestResource(instancesSetLabelsRequestResource)
            .build();
    return setLabelsInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets labels on an instance. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
   *   instanceClient.setLabelsInstanceAsync(instance.toString(), instancesSetLabelsRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetLabelsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setLabelsInstanceAsync(
      String instance, InstancesSetLabelsRequest instancesSetLabelsRequestResource) {

    SetLabelsInstanceHttpRequest request =
        SetLabelsInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setInstancesSetLabelsRequestResource(instancesSetLabelsRequestResource)
            .build();
    return setLabelsInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets labels on an instance. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
   *   SetLabelsInstanceHttpRequest request = SetLabelsInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetLabelsRequestResource(instancesSetLabelsRequestResource)
   *     .build();
   *   instanceClient.setLabelsInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setLabelsInstanceAsync(
      SetLabelsInstanceHttpRequest request) {
    return setLabelsInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets labels on an instance. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
   *   SetLabelsInstanceHttpRequest request = SetLabelsInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetLabelsRequestResource(instancesSetLabelsRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setLabelsInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setLabelsInstanceOperationCallable() {
    return stub.setLabelsInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets labels on an instance. To learn more about labels, read the Labeling Resources
   * documentation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
   *   SetLabelsInstanceHttpRequest request = SetLabelsInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetLabelsRequestResource(instancesSetLabelsRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setLabelsInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetLabelsInstanceHttpRequest, Operation> setLabelsInstanceCallable() {
    return stub.setLabelsInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the number and/or type of accelerator for a stopped instance to the values specified in
   * the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
   *   instanceClient.setMachineResourcesInstanceAsync(instance, instancesSetMachineResourcesRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMachineResourcesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMachineResourcesInstanceAsync(
      ProjectZoneInstanceName instance,
      InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource) {

    SetMachineResourcesInstanceHttpRequest request =
        SetMachineResourcesInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setInstancesSetMachineResourcesRequestResource(
                instancesSetMachineResourcesRequestResource)
            .build();
    return setMachineResourcesInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the number and/or type of accelerator for a stopped instance to the values specified in
   * the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
   *   instanceClient.setMachineResourcesInstanceAsync(instance.toString(), instancesSetMachineResourcesRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMachineResourcesRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMachineResourcesInstanceAsync(
      String instance,
      InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource) {

    SetMachineResourcesInstanceHttpRequest request =
        SetMachineResourcesInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setInstancesSetMachineResourcesRequestResource(
                instancesSetMachineResourcesRequestResource)
            .build();
    return setMachineResourcesInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the number and/or type of accelerator for a stopped instance to the values specified in
   * the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
   *   SetMachineResourcesInstanceHttpRequest request = SetMachineResourcesInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMachineResourcesRequestResource(instancesSetMachineResourcesRequestResource)
   *     .build();
   *   instanceClient.setMachineResourcesInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMachineResourcesInstanceAsync(
      SetMachineResourcesInstanceHttpRequest request) {
    return setMachineResourcesInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the number and/or type of accelerator for a stopped instance to the values specified in
   * the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
   *   SetMachineResourcesInstanceHttpRequest request = SetMachineResourcesInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMachineResourcesRequestResource(instancesSetMachineResourcesRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setMachineResourcesInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineResourcesInstanceOperationCallable() {
    return stub.setMachineResourcesInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the number and/or type of accelerator for a stopped instance to the values specified in
   * the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
   *   SetMachineResourcesInstanceHttpRequest request = SetMachineResourcesInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMachineResourcesRequestResource(instancesSetMachineResourcesRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setMachineResourcesInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceCallable() {
    return stub.setMachineResourcesInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
   *   instanceClient.setMachineTypeInstanceAsync(instance, instancesSetMachineTypeRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMachineTypeRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMachineTypeInstanceAsync(
      ProjectZoneInstanceName instance,
      InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource) {

    SetMachineTypeInstanceHttpRequest request =
        SetMachineTypeInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
            .build();
    return setMachineTypeInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
   *   instanceClient.setMachineTypeInstanceAsync(instance.toString(), instancesSetMachineTypeRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMachineTypeRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMachineTypeInstanceAsync(
      String instance, InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource) {

    SetMachineTypeInstanceHttpRequest request =
        SetMachineTypeInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
            .build();
    return setMachineTypeInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
   *   SetMachineTypeInstanceHttpRequest request = SetMachineTypeInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
   *     .build();
   *   instanceClient.setMachineTypeInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMachineTypeInstanceAsync(
      SetMachineTypeInstanceHttpRequest request) {
    return setMachineTypeInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
   *   SetMachineTypeInstanceHttpRequest request = SetMachineTypeInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setMachineTypeInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineTypeInstanceOperationCallable() {
    return stub.setMachineTypeInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the machine type for a stopped instance to the machine type specified in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
   *   SetMachineTypeInstanceHttpRequest request = SetMachineTypeInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setMachineTypeInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceCallable() {
    return stub.setMachineTypeInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadataResource = Metadata.newBuilder().build();
   *   instanceClient.setMetadataInstanceAsync(instance, metadataResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param metadataResource A metadata key/value entry.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMetadataInstanceAsync(
      ProjectZoneInstanceName instance, Metadata metadataResource) {

    SetMetadataInstanceHttpRequest request =
        SetMetadataInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setMetadataResource(metadataResource)
            .build();
    return setMetadataInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadataResource = Metadata.newBuilder().build();
   *   instanceClient.setMetadataInstanceAsync(instance.toString(), metadataResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param metadataResource A metadata key/value entry.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMetadataInstanceAsync(
      String instance, Metadata metadataResource) {

    SetMetadataInstanceHttpRequest request =
        SetMetadataInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setMetadataResource(metadataResource)
            .build();
    return setMetadataInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadataResource = Metadata.newBuilder().build();
   *   SetMetadataInstanceHttpRequest request = SetMetadataInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setMetadataResource(metadataResource)
   *     .build();
   *   instanceClient.setMetadataInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMetadataInstanceAsync(
      SetMetadataInstanceHttpRequest request) {
    return setMetadataInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadataResource = Metadata.newBuilder().build();
   *   SetMetadataInstanceHttpRequest request = SetMetadataInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setMetadataResource(metadataResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setMetadataInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMetadataInstanceOperationCallable() {
    return stub.setMetadataInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Metadata metadataResource = Metadata.newBuilder().build();
   *   SetMetadataInstanceHttpRequest request = SetMetadataInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setMetadataResource(metadataResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setMetadataInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetMetadataInstanceHttpRequest, Operation>
      setMetadataInstanceCallable() {
    return stub.setMetadataInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the minimum CPU platform that this instance should use. This method can only be called
   * on a stopped instance. For more information, read Specifying a Minimum CPU Platform.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
   *   instanceClient.setMinCpuPlatformInstanceAsync(instance, instancesSetMinCpuPlatformRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMinCpuPlatformRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMinCpuPlatformInstanceAsync(
      ProjectZoneInstanceName instance,
      InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource) {

    SetMinCpuPlatformInstanceHttpRequest request =
        SetMinCpuPlatformInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setInstancesSetMinCpuPlatformRequestResource(instancesSetMinCpuPlatformRequestResource)
            .build();
    return setMinCpuPlatformInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the minimum CPU platform that this instance should use. This method can only be called
   * on a stopped instance. For more information, read Specifying a Minimum CPU Platform.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
   *   instanceClient.setMinCpuPlatformInstanceAsync(instance.toString(), instancesSetMinCpuPlatformRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param instancesSetMinCpuPlatformRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMinCpuPlatformInstanceAsync(
      String instance,
      InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource) {

    SetMinCpuPlatformInstanceHttpRequest request =
        SetMinCpuPlatformInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setInstancesSetMinCpuPlatformRequestResource(instancesSetMinCpuPlatformRequestResource)
            .build();
    return setMinCpuPlatformInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the minimum CPU platform that this instance should use. This method can only be called
   * on a stopped instance. For more information, read Specifying a Minimum CPU Platform.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
   *   SetMinCpuPlatformInstanceHttpRequest request = SetMinCpuPlatformInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMinCpuPlatformRequestResource(instancesSetMinCpuPlatformRequestResource)
   *     .build();
   *   instanceClient.setMinCpuPlatformInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setMinCpuPlatformInstanceAsync(
      SetMinCpuPlatformInstanceHttpRequest request) {
    return setMinCpuPlatformInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the minimum CPU platform that this instance should use. This method can only be called
   * on a stopped instance. For more information, read Specifying a Minimum CPU Platform.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
   *   SetMinCpuPlatformInstanceHttpRequest request = SetMinCpuPlatformInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMinCpuPlatformRequestResource(instancesSetMinCpuPlatformRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setMinCpuPlatformInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMinCpuPlatformInstanceOperationCallable() {
    return stub.setMinCpuPlatformInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the minimum CPU platform that this instance should use. This method can only be called
   * on a stopped instance. For more information, read Specifying a Minimum CPU Platform.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
   *   SetMinCpuPlatformInstanceHttpRequest request = SetMinCpuPlatformInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetMinCpuPlatformRequestResource(instancesSetMinCpuPlatformRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setMinCpuPlatformInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceCallable() {
    return stub.setMinCpuPlatformInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling schedulingResource = Scheduling.newBuilder().build();
   *   instanceClient.setSchedulingInstanceAsync(instance, schedulingResource).get();
   * }
   * </code></pre>
   *
   * @param instance Instance name for this request.
   * @param schedulingResource Sets the scheduling options for an Instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setSchedulingInstanceAsync(
      ProjectZoneInstanceName instance, Scheduling schedulingResource) {

    SetSchedulingInstanceHttpRequest request =
        SetSchedulingInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setSchedulingResource(schedulingResource)
            .build();
    return setSchedulingInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling schedulingResource = Scheduling.newBuilder().build();
   *   instanceClient.setSchedulingInstanceAsync(instance.toString(), schedulingResource).get();
   * }
   * </code></pre>
   *
   * @param instance Instance name for this request.
   * @param schedulingResource Sets the scheduling options for an Instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setSchedulingInstanceAsync(
      String instance, Scheduling schedulingResource) {

    SetSchedulingInstanceHttpRequest request =
        SetSchedulingInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setSchedulingResource(schedulingResource)
            .build();
    return setSchedulingInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling schedulingResource = Scheduling.newBuilder().build();
   *   SetSchedulingInstanceHttpRequest request = SetSchedulingInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setSchedulingResource(schedulingResource)
   *     .build();
   *   instanceClient.setSchedulingInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setSchedulingInstanceAsync(
      SetSchedulingInstanceHttpRequest request) {
    return setSchedulingInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling schedulingResource = Scheduling.newBuilder().build();
   *   SetSchedulingInstanceHttpRequest request = SetSchedulingInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setSchedulingResource(schedulingResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setSchedulingInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setSchedulingInstanceOperationCallable() {
    return stub.setSchedulingInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets an instance's scheduling options.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Scheduling schedulingResource = Scheduling.newBuilder().build();
   *   SetSchedulingInstanceHttpRequest request = SetSchedulingInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setSchedulingResource(schedulingResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setSchedulingInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceCallable() {
    return stub.setSchedulingInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance. For more information, read Changing the service
   * account and access scopes for an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
   *   instanceClient.setServiceAccountInstanceAsync(instance, instancesSetServiceAccountRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesSetServiceAccountRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setServiceAccountInstanceAsync(
      ProjectZoneInstanceName instance,
      InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource) {

    SetServiceAccountInstanceHttpRequest request =
        SetServiceAccountInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
            .build();
    return setServiceAccountInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance. For more information, read Changing the service
   * account and access scopes for an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
   *   instanceClient.setServiceAccountInstanceAsync(instance.toString(), instancesSetServiceAccountRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesSetServiceAccountRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setServiceAccountInstanceAsync(
      String instance,
      InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource) {

    SetServiceAccountInstanceHttpRequest request =
        SetServiceAccountInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
            .build();
    return setServiceAccountInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance. For more information, read Changing the service
   * account and access scopes for an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
   *   SetServiceAccountInstanceHttpRequest request = SetServiceAccountInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
   *     .build();
   *   instanceClient.setServiceAccountInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setServiceAccountInstanceAsync(
      SetServiceAccountInstanceHttpRequest request) {
    return setServiceAccountInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance. For more information, read Changing the service
   * account and access scopes for an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
   *   SetServiceAccountInstanceHttpRequest request = SetServiceAccountInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setServiceAccountInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setServiceAccountInstanceOperationCallable() {
    return stub.setServiceAccountInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the service account on the instance. For more information, read Changing the service
   * account and access scopes for an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
   *   SetServiceAccountInstanceHttpRequest request = SetServiceAccountInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setServiceAccountInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceCallable() {
    return stub.setServiceAccountInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets network tags for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tagsResource = Tags.newBuilder().build();
   *   instanceClient.setTagsInstanceAsync(instance, tagsResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param tagsResource A set of instance tags.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setTagsInstanceAsync(
      ProjectZoneInstanceName instance, Tags tagsResource) {

    SetTagsInstanceHttpRequest request =
        SetTagsInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setTagsResource(tagsResource)
            .build();
    return setTagsInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets network tags for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tagsResource = Tags.newBuilder().build();
   *   instanceClient.setTagsInstanceAsync(instance.toString(), tagsResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @param tagsResource A set of instance tags.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setTagsInstanceAsync(
      String instance, Tags tagsResource) {

    SetTagsInstanceHttpRequest request =
        SetTagsInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setTagsResource(tagsResource)
            .build();
    return setTagsInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets network tags for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tagsResource = Tags.newBuilder().build();
   *   SetTagsInstanceHttpRequest request = SetTagsInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setTagsResource(tagsResource)
   *     .build();
   *   instanceClient.setTagsInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> setTagsInstanceAsync(
      SetTagsInstanceHttpRequest request) {
    return setTagsInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets network tags for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tagsResource = Tags.newBuilder().build();
   *   SetTagsInstanceHttpRequest request = SetTagsInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setTagsResource(tagsResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.setTagsInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setTagsInstanceOperationCallable() {
    return stub.setTagsInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets network tags for the specified instance to the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   Tags tagsResource = Tags.newBuilder().build();
   *   SetTagsInstanceHttpRequest request = SetTagsInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setTagsResource(tagsResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.setTagsInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable() {
    return stub.setTagsInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Simulates a maintenance event on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.simulateMaintenanceEventInstanceAsync(instance).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> simulateMaintenanceEventInstanceAsync(
      ProjectZoneInstanceName instance) {

    SimulateMaintenanceEventInstanceHttpRequest request =
        SimulateMaintenanceEventInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return simulateMaintenanceEventInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Simulates a maintenance event on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.simulateMaintenanceEventInstanceAsync(instance.toString()).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> simulateMaintenanceEventInstanceAsync(
      String instance) {

    SimulateMaintenanceEventInstanceHttpRequest request =
        SimulateMaintenanceEventInstanceHttpRequest.newBuilder().setInstance(instance).build();
    return simulateMaintenanceEventInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Simulates a maintenance event on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   SimulateMaintenanceEventInstanceHttpRequest request = SimulateMaintenanceEventInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   instanceClient.simulateMaintenanceEventInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> simulateMaintenanceEventInstanceAsync(
      SimulateMaintenanceEventInstanceHttpRequest request) {
    return simulateMaintenanceEventInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Simulates a maintenance event on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   SimulateMaintenanceEventInstanceHttpRequest request = SimulateMaintenanceEventInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.simulateMaintenanceEventInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
      simulateMaintenanceEventInstanceOperationCallable() {
    return stub.simulateMaintenanceEventInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Simulates a maintenance event on the instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   SimulateMaintenanceEventInstanceHttpRequest request = SimulateMaintenanceEventInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.simulateMaintenanceEventInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceCallable() {
    return stub.simulateMaintenanceEventInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.startInstanceAsync(instance).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> startInstanceAsync(
      ProjectZoneInstanceName instance) {

    StartInstanceHttpRequest request =
        StartInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return startInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.startInstanceAsync(instance.toString()).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> startInstanceAsync(String instance) {

    StartInstanceHttpRequest request =
        StartInstanceHttpRequest.newBuilder().setInstance(instance).build();
    return startInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StartInstanceHttpRequest request = StartInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   instanceClient.startInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> startInstanceAsync(
      StartInstanceHttpRequest request) {
    return startInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StartInstanceHttpRequest request = StartInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.startInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startInstanceOperationCallable() {
    return stub.startInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StartInstanceHttpRequest request = StartInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.startInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable() {
    return stub.startInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   instanceClient.startWithEncryptionKeyInstanceAsync(instance, instancesStartWithEncryptionKeyRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesStartWithEncryptionKeyRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> startWithEncryptionKeyInstanceAsync(
      ProjectZoneInstanceName instance,
      InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource) {

    StartWithEncryptionKeyInstanceHttpRequest request =
        StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setInstancesStartWithEncryptionKeyRequestResource(
                instancesStartWithEncryptionKeyRequestResource)
            .build();
    return startWithEncryptionKeyInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   instanceClient.startWithEncryptionKeyInstanceAsync(instance.toString(), instancesStartWithEncryptionKeyRequestResource).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to start.
   * @param instancesStartWithEncryptionKeyRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> startWithEncryptionKeyInstanceAsync(
      String instance,
      InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource) {

    StartWithEncryptionKeyInstanceHttpRequest request =
        StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setInstancesStartWithEncryptionKeyRequestResource(
                instancesStartWithEncryptionKeyRequestResource)
            .build();
    return startWithEncryptionKeyInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   StartWithEncryptionKeyInstanceHttpRequest request = StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequestResource)
   *     .build();
   *   instanceClient.startWithEncryptionKeyInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> startWithEncryptionKeyInstanceAsync(
      StartWithEncryptionKeyInstanceHttpRequest request) {
    return startWithEncryptionKeyInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   StartWithEncryptionKeyInstanceHttpRequest request = StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequestResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.startWithEncryptionKeyInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startWithEncryptionKeyInstanceOperationCallable() {
    return stub.startWithEncryptionKeyInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Starts an instance that was stopped using the instances().stop method. For more information,
   * see Restart an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
   *   StartWithEncryptionKeyInstanceHttpRequest request = StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.startWithEncryptionKeyInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceCallable() {
    return stub.startWithEncryptionKeyInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   * later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   * resources that the VM is using, such as persistent disks and static IP addresses, will continue
   * to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.stopInstanceAsync(instance).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to stop.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> stopInstanceAsync(
      ProjectZoneInstanceName instance) {

    StopInstanceHttpRequest request =
        StopInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .build();
    return stopInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   * later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   * resources that the VM is using, such as persistent disks and static IP addresses, will continue
   * to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   instanceClient.stopInstanceAsync(instance.toString()).get();
   * }
   * </code></pre>
   *
   * @param instance Name of the instance resource to stop.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> stopInstanceAsync(String instance) {

    StopInstanceHttpRequest request =
        StopInstanceHttpRequest.newBuilder().setInstance(instance).build();
    return stopInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   * later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   * resources that the VM is using, such as persistent disks and static IP addresses, will continue
   * to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StopInstanceHttpRequest request = StopInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   instanceClient.stopInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> stopInstanceAsync(
      StopInstanceHttpRequest request) {
    return stopInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   * later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   * resources that the VM is using, such as persistent disks and static IP addresses, will continue
   * to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StopInstanceHttpRequest request = StopInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.stopInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
      stopInstanceOperationCallable() {
    return stub.stopInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   * later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   * resources that the VM is using, such as persistent disks and static IP addresses, will continue
   * to be charged until they are deleted. For more information, see Stopping an instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   StopInstanceHttpRequest request = StopInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.stopInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable() {
    return stub.stopInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestPermissionsResponse response = instanceClient.testIamPermissionsInstance(resource, testPermissionsRequestResource);
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @param testPermissionsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TestPermissionsResponse testIamPermissionsInstance(
      ProjectZoneInstanceResourceName resource,
      TestPermissionsRequest testPermissionsRequestResource) {

    TestIamPermissionsInstanceHttpRequest request =
        TestIamPermissionsInstanceHttpRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .setTestPermissionsRequestResource(testPermissionsRequestResource)
            .build();
    return testIamPermissionsInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestPermissionsResponse response = instanceClient.testIamPermissionsInstance(resource.toString(), testPermissionsRequestResource);
   * }
   * </code></pre>
   *
   * @param resource Name or id of the resource for this request.
   * @param testPermissionsRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TestPermissionsResponse testIamPermissionsInstance(
      String resource, TestPermissionsRequest testPermissionsRequestResource) {

    TestIamPermissionsInstanceHttpRequest request =
        TestIamPermissionsInstanceHttpRequest.newBuilder()
            .setResource(resource)
            .setTestPermissionsRequestResource(testPermissionsRequestResource)
            .build();
    return testIamPermissionsInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestIamPermissionsInstanceHttpRequest request = TestIamPermissionsInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setTestPermissionsRequestResource(testPermissionsRequestResource)
   *     .build();
   *   TestPermissionsResponse response = instanceClient.testIamPermissionsInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TestPermissionsResponse testIamPermissionsInstance(
      TestIamPermissionsInstanceHttpRequest request) {
    return testIamPermissionsInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of("[PROJECT]", "[ZONE]", "[RESOURCE]");
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestIamPermissionsInstanceHttpRequest request = TestIamPermissionsInstanceHttpRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setTestPermissionsRequestResource(testPermissionsRequestResource)
   *     .build();
   *   ApiFuture&lt;TestPermissionsResponse&gt; future = instanceClient.testIamPermissionsInstanceCallable().futureCall(request);
   *   // Do something
   *   TestPermissionsResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceCallable() {
    return stub.testIamPermissionsInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified access config from an instance's network interface with the data included
   * in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   * processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   instanceClient.updateAccessConfigInstanceAsync(instance, networkInterface, accessConfigResource).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface where the access config is attached.
   * @param accessConfigResource An access configuration attached to an instance's network
   *     interface. Only one access config per instance is supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateAccessConfigInstanceAsync(
      ProjectZoneInstanceName instance,
      String networkInterface,
      AccessConfig accessConfigResource) {

    UpdateAccessConfigInstanceHttpRequest request =
        UpdateAccessConfigInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setNetworkInterface(networkInterface)
            .setAccessConfigResource(accessConfigResource)
            .build();
    return updateAccessConfigInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified access config from an instance's network interface with the data included
   * in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   * processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   instanceClient.updateAccessConfigInstanceAsync(instance.toString(), networkInterface, accessConfigResource).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface where the access config is attached.
   * @param accessConfigResource An access configuration attached to an instance's network
   *     interface. Only one access config per instance is supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateAccessConfigInstanceAsync(
      String instance, String networkInterface, AccessConfig accessConfigResource) {

    UpdateAccessConfigInstanceHttpRequest request =
        UpdateAccessConfigInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setNetworkInterface(networkInterface)
            .setAccessConfigResource(accessConfigResource)
            .build();
    return updateAccessConfigInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified access config from an instance's network interface with the data included
   * in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   * processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   UpdateAccessConfigInstanceHttpRequest request = UpdateAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfigResource)
   *     .build();
   *   instanceClient.updateAccessConfigInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateAccessConfigInstanceAsync(
      UpdateAccessConfigInstanceHttpRequest request) {
    return updateAccessConfigInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified access config from an instance's network interface with the data included
   * in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   * processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   UpdateAccessConfigInstanceHttpRequest request = UpdateAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfigResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.updateAccessConfigInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateAccessConfigInstanceOperationCallable() {
    return stub.updateAccessConfigInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified access config from an instance's network interface with the data included
   * in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   * processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
   *   UpdateAccessConfigInstanceHttpRequest request = UpdateAccessConfigInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setAccessConfigResource(accessConfigResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.updateAccessConfigInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceCallable() {
    return stub.updateAccessConfigInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance's network interface. This method follows PATCH semantics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   instanceClient.updateNetworkInterfaceInstanceAsync(instance, networkInterface, networkInterfaceResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface to update.
   * @param networkInterfaceResource A network interface resource attached to an instance.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateNetworkInterfaceInstanceAsync(
      ProjectZoneInstanceName instance,
      String networkInterface,
      NetworkInterface networkInterfaceResource,
      List<String> fieldMask) {

    UpdateNetworkInterfaceInstanceHttpRequest request =
        UpdateNetworkInterfaceInstanceHttpRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .setNetworkInterface(networkInterface)
            .setNetworkInterfaceResource(networkInterfaceResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateNetworkInterfaceInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance's network interface. This method follows PATCH semantics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   instanceClient.updateNetworkInterfaceInstanceAsync(instance.toString(), networkInterface, networkInterfaceResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param instance The instance name for this request.
   * @param networkInterface The name of the network interface to update.
   * @param networkInterfaceResource A network interface resource attached to an instance.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateNetworkInterfaceInstanceAsync(
      String instance,
      String networkInterface,
      NetworkInterface networkInterfaceResource,
      List<String> fieldMask) {

    UpdateNetworkInterfaceInstanceHttpRequest request =
        UpdateNetworkInterfaceInstanceHttpRequest.newBuilder()
            .setInstance(instance)
            .setNetworkInterface(networkInterface)
            .setNetworkInterfaceResource(networkInterfaceResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateNetworkInterfaceInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance's network interface. This method follows PATCH semantics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateNetworkInterfaceInstanceHttpRequest request = UpdateNetworkInterfaceInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setNetworkInterfaceResource(networkInterfaceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   instanceClient.updateNetworkInterfaceInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> updateNetworkInterfaceInstanceAsync(
      UpdateNetworkInterfaceInstanceHttpRequest request) {
    return updateNetworkInterfaceInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance's network interface. This method follows PATCH semantics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateNetworkInterfaceInstanceHttpRequest request = UpdateNetworkInterfaceInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setNetworkInterfaceResource(networkInterfaceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = instanceClient.updateNetworkInterfaceInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateNetworkInterfaceInstanceOperationCallable() {
    return stub.updateNetworkInterfaceInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance's network interface. This method follows PATCH semantics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceClient instanceClient = InstanceClient.create()) {
   *   ProjectZoneInstanceName instance = ProjectZoneInstanceName.of("[PROJECT]", "[ZONE]", "[INSTANCE]");
   *   String networkInterface = "";
   *   NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateNetworkInterfaceInstanceHttpRequest request = UpdateNetworkInterfaceInstanceHttpRequest.newBuilder()
   *     .setInstance(instance.toString())
   *     .setNetworkInterface(networkInterface)
   *     .setNetworkInterfaceResource(networkInterfaceResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceClient.updateNetworkInterfaceInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceCallable() {
    return stub.updateNetworkInterfaceInstanceCallable();
  }

  @Override
  public final void close() {
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

  public static class AggregatedListInstancesPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          InstancesScopedList,
          AggregatedListInstancesPage,
          AggregatedListInstancesFixedSizeCollection> {

    public static ApiFuture<AggregatedListInstancesPagedResponse> createAsync(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, InstancesScopedList>
            context,
        ApiFuture<InstanceAggregatedList> futureResponse) {
      ApiFuture<AggregatedListInstancesPage> futurePage =
          AggregatedListInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListInstancesPage, AggregatedListInstancesPagedResponse>() {
            @Override
            public AggregatedListInstancesPagedResponse apply(AggregatedListInstancesPage input) {
              return new AggregatedListInstancesPagedResponse(input);
            }
          });
    }

    private AggregatedListInstancesPagedResponse(AggregatedListInstancesPage page) {
      super(page, AggregatedListInstancesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListInstancesPage
      extends AbstractPage<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          InstancesScopedList,
          AggregatedListInstancesPage> {

    private AggregatedListInstancesPage(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, InstancesScopedList>
            context,
        InstanceAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListInstancesPage createEmptyPage() {
      return new AggregatedListInstancesPage(null, null);
    }

    @Override
    protected AggregatedListInstancesPage createPage(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, InstancesScopedList>
            context,
        InstanceAggregatedList response) {
      return new AggregatedListInstancesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListInstancesPage> createPageAsync(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, InstancesScopedList>
            context,
        ApiFuture<InstanceAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListInstancesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          InstancesScopedList,
          AggregatedListInstancesPage,
          AggregatedListInstancesFixedSizeCollection> {

    private AggregatedListInstancesFixedSizeCollection(
        List<AggregatedListInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListInstancesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListInstancesFixedSizeCollection createCollection(
        List<AggregatedListInstancesPage> pages, int collectionSize) {
      return new AggregatedListInstancesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListInstancesPagedResponse
      extends AbstractPagedListResponse<
          ListInstancesHttpRequest,
          InstanceList,
          Instance,
          ListInstancesPage,
          ListInstancesFixedSizeCollection> {

    public static ApiFuture<ListInstancesPagedResponse> createAsync(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        ApiFuture<InstanceList> futureResponse) {
      ApiFuture<ListInstancesPage> futurePage =
          ListInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstancesPage, ListInstancesPagedResponse>() {
            @Override
            public ListInstancesPagedResponse apply(ListInstancesPage input) {
              return new ListInstancesPagedResponse(input);
            }
          });
    }

    private ListInstancesPagedResponse(ListInstancesPage page) {
      super(page, ListInstancesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListInstancesPage
      extends AbstractPage<ListInstancesHttpRequest, InstanceList, Instance, ListInstancesPage> {

    private ListInstancesPage(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        InstanceList response) {
      super(context, response);
    }

    private static ListInstancesPage createEmptyPage() {
      return new ListInstancesPage(null, null);
    }

    @Override
    protected ListInstancesPage createPage(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        InstanceList response) {
      return new ListInstancesPage(context, response);
    }

    @Override
    public ApiFuture<ListInstancesPage> createPageAsync(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        ApiFuture<InstanceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListInstancesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInstancesHttpRequest,
          InstanceList,
          Instance,
          ListInstancesPage,
          ListInstancesFixedSizeCollection> {

    private ListInstancesFixedSizeCollection(List<ListInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstancesFixedSizeCollection createEmptyCollection() {
      return new ListInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstancesFixedSizeCollection createCollection(
        List<ListInstancesPage> pages, int collectionSize) {
      return new ListInstancesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListReferrersInstancesPagedResponse
      extends AbstractPagedListResponse<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          Reference,
          ListReferrersInstancesPage,
          ListReferrersInstancesFixedSizeCollection> {

    public static ApiFuture<ListReferrersInstancesPagedResponse> createAsync(
        PageContext<ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference> context,
        ApiFuture<InstanceListReferrers> futureResponse) {
      ApiFuture<ListReferrersInstancesPage> futurePage =
          ListReferrersInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListReferrersInstancesPage, ListReferrersInstancesPagedResponse>() {
            @Override
            public ListReferrersInstancesPagedResponse apply(ListReferrersInstancesPage input) {
              return new ListReferrersInstancesPagedResponse(input);
            }
          });
    }

    private ListReferrersInstancesPagedResponse(ListReferrersInstancesPage page) {
      super(page, ListReferrersInstancesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListReferrersInstancesPage
      extends AbstractPage<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          Reference,
          ListReferrersInstancesPage> {

    private ListReferrersInstancesPage(
        PageContext<ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference> context,
        InstanceListReferrers response) {
      super(context, response);
    }

    private static ListReferrersInstancesPage createEmptyPage() {
      return new ListReferrersInstancesPage(null, null);
    }

    @Override
    protected ListReferrersInstancesPage createPage(
        PageContext<ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference> context,
        InstanceListReferrers response) {
      return new ListReferrersInstancesPage(context, response);
    }

    @Override
    public ApiFuture<ListReferrersInstancesPage> createPageAsync(
        PageContext<ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference> context,
        ApiFuture<InstanceListReferrers> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListReferrersInstancesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          Reference,
          ListReferrersInstancesPage,
          ListReferrersInstancesFixedSizeCollection> {

    private ListReferrersInstancesFixedSizeCollection(
        List<ListReferrersInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListReferrersInstancesFixedSizeCollection createEmptyCollection() {
      return new ListReferrersInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListReferrersInstancesFixedSizeCollection createCollection(
        List<ListReferrersInstancesPage> pages, int collectionSize) {
      return new ListReferrersInstancesFixedSizeCollection(pages, collectionSize);
    }
  }
}
