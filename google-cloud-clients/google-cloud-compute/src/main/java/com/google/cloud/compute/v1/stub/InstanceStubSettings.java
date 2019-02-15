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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InstanceClient.AggregatedListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListReferrersInstancesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.ApiMessageOperationTransformers;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest;
import com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest;
import com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.DeleteInstanceHttpRequest;
import com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest;
import com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest;
import com.google.cloud.compute.v1.GetInstanceHttpRequest;
import com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest;
import com.google.cloud.compute.v1.InsertInstanceHttpRequest;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceAggregatedList;
import com.google.cloud.compute.v1.InstanceList;
import com.google.cloud.compute.v1.InstanceListReferrers;
import com.google.cloud.compute.v1.InstancesScopedList;
import com.google.cloud.compute.v1.ListInstancesHttpRequest;
import com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.Reference;
import com.google.cloud.compute.v1.ResetInstanceHttpRequest;
import com.google.cloud.compute.v1.SerialPortOutput;
import com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest;
import com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest;
import com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest;
import com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest;
import com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest;
import com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest;
import com.google.cloud.compute.v1.SetTagsInstanceHttpRequest;
import com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest;
import com.google.cloud.compute.v1.StartInstanceHttpRequest;
import com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest;
import com.google.cloud.compute.v1.StopInstanceHttpRequest;
import com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
import com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://www.googleapis.com/compute/v1/projects/) and default
 *       port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getInstance to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceStubSettings.Builder instanceSettingsBuilder =
 *     InstanceStubSettings.newBuilder();
 * instanceSettingsBuilder.getInstanceSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceStubSettings instanceSettings = instanceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class InstanceStubSettings extends StubSettings<InstanceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceSettings;
  private final OperationCallSettings<
          AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      addAccessConfigInstanceOperationSettings;
  private final PagedCallSettings<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          AggregatedListInstancesPagedResponse>
      aggregatedListInstancesSettings;
  private final UnaryCallSettings<AttachDiskInstanceHttpRequest, Operation>
      attachDiskInstanceSettings;
  private final OperationCallSettings<AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      attachDiskInstanceOperationSettings;
  private final UnaryCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings;
  private final OperationCallSettings<DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteInstanceOperationSettings;
  private final UnaryCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceSettings;
  private final OperationCallSettings<
          DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteAccessConfigInstanceOperationSettings;
  private final UnaryCallSettings<DetachDiskInstanceHttpRequest, Operation>
      detachDiskInstanceSettings;
  private final OperationCallSettings<DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      detachDiskInstanceOperationSettings;
  private final UnaryCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings;
  private final UnaryCallSettings<GetIamPolicyInstanceHttpRequest, Policy>
      getIamPolicyInstanceSettings;
  private final UnaryCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceSettings;
  private final UnaryCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings;
  private final OperationCallSettings<InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
      insertInstanceOperationSettings;
  private final PagedCallSettings<
          ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
      listInstancesSettings;
  private final PagedCallSettings<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          ListReferrersInstancesPagedResponse>
      listReferrersInstancesSettings;
  private final UnaryCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings;
  private final OperationCallSettings<ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
      resetInstanceOperationSettings;
  private final UnaryCallSettings<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceSettings;
  private final OperationCallSettings<
          SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDeletionProtectionInstanceOperationSettings;
  private final UnaryCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceSettings;
  private final OperationCallSettings<
          SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDiskAutoDeleteInstanceOperationSettings;
  private final UnaryCallSettings<SetIamPolicyInstanceHttpRequest, Policy>
      setIamPolicyInstanceSettings;
  private final UnaryCallSettings<SetLabelsInstanceHttpRequest, Operation>
      setLabelsInstanceSettings;
  private final OperationCallSettings<SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setLabelsInstanceOperationSettings;
  private final UnaryCallSettings<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceSettings;
  private final OperationCallSettings<
          SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineResourcesInstanceOperationSettings;
  private final UnaryCallSettings<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceSettings;
  private final OperationCallSettings<SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineTypeInstanceOperationSettings;
  private final UnaryCallSettings<SetMetadataInstanceHttpRequest, Operation>
      setMetadataInstanceSettings;
  private final OperationCallSettings<SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMetadataInstanceOperationSettings;
  private final UnaryCallSettings<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceSettings;
  private final OperationCallSettings<
          SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMinCpuPlatformInstanceOperationSettings;
  private final UnaryCallSettings<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceSettings;
  private final OperationCallSettings<SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setSchedulingInstanceOperationSettings;
  private final UnaryCallSettings<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceSettings;
  private final OperationCallSettings<
          SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setServiceAccountInstanceOperationSettings;
  private final UnaryCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings;
  private final OperationCallSettings<SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setTagsInstanceOperationSettings;
  private final UnaryCallSettings<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceSettings;
  private final OperationCallSettings<
          SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
      simulateMaintenanceEventInstanceOperationSettings;
  private final UnaryCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings;
  private final OperationCallSettings<StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startInstanceOperationSettings;
  private final UnaryCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceSettings;
  private final OperationCallSettings<
          StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startWithEncryptionKeyInstanceOperationSettings;
  private final UnaryCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings;
  private final OperationCallSettings<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
      stopInstanceOperationSettings;
  private final UnaryCallSettings<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceSettings;
  private final UnaryCallSettings<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceSettings;
  private final OperationCallSettings<
          UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateAccessConfigInstanceOperationSettings;
  private final UnaryCallSettings<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceSettings;
  private final OperationCallSettings<
          UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateNetworkInterfaceInstanceOperationSettings;

  /** Returns the object with the settings used for calls to addAccessConfigInstance. */
  public UnaryCallSettings<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceSettings() {
    return addAccessConfigInstanceSettings;
  }

  /** Returns the object with the settings used for calls to addAccessConfigInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      addAccessConfigInstanceOperationSettings() {
    return addAccessConfigInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to aggregatedListInstances. */
  public PagedCallSettings<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          AggregatedListInstancesPagedResponse>
      aggregatedListInstancesSettings() {
    return aggregatedListInstancesSettings;
  }

  /** Returns the object with the settings used for calls to attachDiskInstance. */
  public UnaryCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings() {
    return attachDiskInstanceSettings;
  }

  /** Returns the object with the settings used for calls to attachDiskInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      attachDiskInstanceOperationSettings() {
    return attachDiskInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public UnaryCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings() {
    return deleteInstanceSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteInstanceOperationSettings() {
    return deleteInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteAccessConfigInstance. */
  public UnaryCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceSettings() {
    return deleteAccessConfigInstanceSettings;
  }

  /** Returns the object with the settings used for calls to deleteAccessConfigInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteAccessConfigInstanceOperationSettings() {
    return deleteAccessConfigInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to detachDiskInstance. */
  public UnaryCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings() {
    return detachDiskInstanceSettings;
  }

  /** Returns the object with the settings used for calls to detachDiskInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      detachDiskInstanceOperationSettings() {
    return detachDiskInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public UnaryCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings() {
    return getInstanceSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicyInstance. */
  public UnaryCallSettings<GetIamPolicyInstanceHttpRequest, Policy> getIamPolicyInstanceSettings() {
    return getIamPolicyInstanceSettings;
  }

  /** Returns the object with the settings used for calls to getSerialPortOutputInstance. */
  public UnaryCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceSettings() {
    return getSerialPortOutputInstanceSettings;
  }

  /** Returns the object with the settings used for calls to insertInstance. */
  public UnaryCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings() {
    return insertInstanceSettings;
  }

  /** Returns the object with the settings used for calls to insertInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
      insertInstanceOperationSettings() {
    return insertInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
      listInstancesSettings() {
    return listInstancesSettings;
  }

  /** Returns the object with the settings used for calls to listReferrersInstances. */
  public PagedCallSettings<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          ListReferrersInstancesPagedResponse>
      listReferrersInstancesSettings() {
    return listReferrersInstancesSettings;
  }

  /** Returns the object with the settings used for calls to resetInstance. */
  public UnaryCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
    return resetInstanceSettings;
  }

  /** Returns the object with the settings used for calls to resetInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
      resetInstanceOperationSettings() {
    return resetInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setDeletionProtectionInstance. */
  public UnaryCallSettings<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceSettings() {
    return setDeletionProtectionInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setDeletionProtectionInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDeletionProtectionInstanceOperationSettings() {
    return setDeletionProtectionInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setDiskAutoDeleteInstance. */
  public UnaryCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceSettings() {
    return setDiskAutoDeleteInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setDiskAutoDeleteInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDiskAutoDeleteInstanceOperationSettings() {
    return setDiskAutoDeleteInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicyInstance. */
  public UnaryCallSettings<SetIamPolicyInstanceHttpRequest, Policy> setIamPolicyInstanceSettings() {
    return setIamPolicyInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setLabelsInstance. */
  public UnaryCallSettings<SetLabelsInstanceHttpRequest, Operation> setLabelsInstanceSettings() {
    return setLabelsInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setLabelsInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setLabelsInstanceOperationSettings() {
    return setLabelsInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setMachineResourcesInstance. */
  public UnaryCallSettings<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceSettings() {
    return setMachineResourcesInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setMachineResourcesInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineResourcesInstanceOperationSettings() {
    return setMachineResourcesInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setMachineTypeInstance. */
  public UnaryCallSettings<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceSettings() {
    return setMachineTypeInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setMachineTypeInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineTypeInstanceOperationSettings() {
    return setMachineTypeInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setMetadataInstance. */
  public UnaryCallSettings<SetMetadataInstanceHttpRequest, Operation>
      setMetadataInstanceSettings() {
    return setMetadataInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setMetadataInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMetadataInstanceOperationSettings() {
    return setMetadataInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setMinCpuPlatformInstance. */
  public UnaryCallSettings<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceSettings() {
    return setMinCpuPlatformInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setMinCpuPlatformInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMinCpuPlatformInstanceOperationSettings() {
    return setMinCpuPlatformInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setSchedulingInstance. */
  public UnaryCallSettings<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceSettings() {
    return setSchedulingInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setSchedulingInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setSchedulingInstanceOperationSettings() {
    return setSchedulingInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setServiceAccountInstance. */
  public UnaryCallSettings<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceSettings() {
    return setServiceAccountInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setServiceAccountInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setServiceAccountInstanceOperationSettings() {
    return setServiceAccountInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to setTagsInstance. */
  public UnaryCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings() {
    return setTagsInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setTagsInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setTagsInstanceOperationSettings() {
    return setTagsInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to simulateMaintenanceEventInstance. */
  public UnaryCallSettings<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceSettings() {
    return simulateMaintenanceEventInstanceSettings;
  }

  /** Returns the object with the settings used for calls to simulateMaintenanceEventInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
      simulateMaintenanceEventInstanceOperationSettings() {
    return simulateMaintenanceEventInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to startInstance. */
  public UnaryCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings() {
    return startInstanceSettings;
  }

  /** Returns the object with the settings used for calls to startInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startInstanceOperationSettings() {
    return startInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to startWithEncryptionKeyInstance. */
  public UnaryCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceSettings() {
    return startWithEncryptionKeyInstanceSettings;
  }

  /** Returns the object with the settings used for calls to startWithEncryptionKeyInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startWithEncryptionKeyInstanceOperationSettings() {
    return startWithEncryptionKeyInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to stopInstance. */
  public UnaryCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
    return stopInstanceSettings;
  }

  /** Returns the object with the settings used for calls to stopInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
      stopInstanceOperationSettings() {
    return stopInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissionsInstance. */
  public UnaryCallSettings<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceSettings() {
    return testIamPermissionsInstanceSettings;
  }

  /** Returns the object with the settings used for calls to updateAccessConfigInstance. */
  public UnaryCallSettings<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceSettings() {
    return updateAccessConfigInstanceSettings;
  }

  /** Returns the object with the settings used for calls to updateAccessConfigInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateAccessConfigInstanceOperationSettings() {
    return updateAccessConfigInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateNetworkInterfaceInstance. */
  public UnaryCallSettings<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceSettings() {
    return updateNetworkInterfaceInstanceSettings;
  }

  /** Returns the object with the settings used for calls to updateNetworkInterfaceInstance. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateNetworkInterfaceInstanceOperationSettings() {
    return updateNetworkInterfaceInstanceOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonInstanceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://www.googleapis.com/compute/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(InstanceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected InstanceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addAccessConfigInstanceSettings = settingsBuilder.addAccessConfigInstanceSettings().build();
    addAccessConfigInstanceOperationSettings =
        settingsBuilder.addAccessConfigInstanceOperationSettings().build();
    aggregatedListInstancesSettings = settingsBuilder.aggregatedListInstancesSettings().build();
    attachDiskInstanceSettings = settingsBuilder.attachDiskInstanceSettings().build();
    attachDiskInstanceOperationSettings =
        settingsBuilder.attachDiskInstanceOperationSettings().build();
    deleteInstanceSettings = settingsBuilder.deleteInstanceSettings().build();
    deleteInstanceOperationSettings = settingsBuilder.deleteInstanceOperationSettings().build();
    deleteAccessConfigInstanceSettings =
        settingsBuilder.deleteAccessConfigInstanceSettings().build();
    deleteAccessConfigInstanceOperationSettings =
        settingsBuilder.deleteAccessConfigInstanceOperationSettings().build();
    detachDiskInstanceSettings = settingsBuilder.detachDiskInstanceSettings().build();
    detachDiskInstanceOperationSettings =
        settingsBuilder.detachDiskInstanceOperationSettings().build();
    getInstanceSettings = settingsBuilder.getInstanceSettings().build();
    getIamPolicyInstanceSettings = settingsBuilder.getIamPolicyInstanceSettings().build();
    getSerialPortOutputInstanceSettings =
        settingsBuilder.getSerialPortOutputInstanceSettings().build();
    insertInstanceSettings = settingsBuilder.insertInstanceSettings().build();
    insertInstanceOperationSettings = settingsBuilder.insertInstanceOperationSettings().build();
    listInstancesSettings = settingsBuilder.listInstancesSettings().build();
    listReferrersInstancesSettings = settingsBuilder.listReferrersInstancesSettings().build();
    resetInstanceSettings = settingsBuilder.resetInstanceSettings().build();
    resetInstanceOperationSettings = settingsBuilder.resetInstanceOperationSettings().build();
    setDeletionProtectionInstanceSettings =
        settingsBuilder.setDeletionProtectionInstanceSettings().build();
    setDeletionProtectionInstanceOperationSettings =
        settingsBuilder.setDeletionProtectionInstanceOperationSettings().build();
    setDiskAutoDeleteInstanceSettings = settingsBuilder.setDiskAutoDeleteInstanceSettings().build();
    setDiskAutoDeleteInstanceOperationSettings =
        settingsBuilder.setDiskAutoDeleteInstanceOperationSettings().build();
    setIamPolicyInstanceSettings = settingsBuilder.setIamPolicyInstanceSettings().build();
    setLabelsInstanceSettings = settingsBuilder.setLabelsInstanceSettings().build();
    setLabelsInstanceOperationSettings =
        settingsBuilder.setLabelsInstanceOperationSettings().build();
    setMachineResourcesInstanceSettings =
        settingsBuilder.setMachineResourcesInstanceSettings().build();
    setMachineResourcesInstanceOperationSettings =
        settingsBuilder.setMachineResourcesInstanceOperationSettings().build();
    setMachineTypeInstanceSettings = settingsBuilder.setMachineTypeInstanceSettings().build();
    setMachineTypeInstanceOperationSettings =
        settingsBuilder.setMachineTypeInstanceOperationSettings().build();
    setMetadataInstanceSettings = settingsBuilder.setMetadataInstanceSettings().build();
    setMetadataInstanceOperationSettings =
        settingsBuilder.setMetadataInstanceOperationSettings().build();
    setMinCpuPlatformInstanceSettings = settingsBuilder.setMinCpuPlatformInstanceSettings().build();
    setMinCpuPlatformInstanceOperationSettings =
        settingsBuilder.setMinCpuPlatformInstanceOperationSettings().build();
    setSchedulingInstanceSettings = settingsBuilder.setSchedulingInstanceSettings().build();
    setSchedulingInstanceOperationSettings =
        settingsBuilder.setSchedulingInstanceOperationSettings().build();
    setServiceAccountInstanceSettings = settingsBuilder.setServiceAccountInstanceSettings().build();
    setServiceAccountInstanceOperationSettings =
        settingsBuilder.setServiceAccountInstanceOperationSettings().build();
    setTagsInstanceSettings = settingsBuilder.setTagsInstanceSettings().build();
    setTagsInstanceOperationSettings = settingsBuilder.setTagsInstanceOperationSettings().build();
    simulateMaintenanceEventInstanceSettings =
        settingsBuilder.simulateMaintenanceEventInstanceSettings().build();
    simulateMaintenanceEventInstanceOperationSettings =
        settingsBuilder.simulateMaintenanceEventInstanceOperationSettings().build();
    startInstanceSettings = settingsBuilder.startInstanceSettings().build();
    startInstanceOperationSettings = settingsBuilder.startInstanceOperationSettings().build();
    startWithEncryptionKeyInstanceSettings =
        settingsBuilder.startWithEncryptionKeyInstanceSettings().build();
    startWithEncryptionKeyInstanceOperationSettings =
        settingsBuilder.startWithEncryptionKeyInstanceOperationSettings().build();
    stopInstanceSettings = settingsBuilder.stopInstanceSettings().build();
    stopInstanceOperationSettings = settingsBuilder.stopInstanceOperationSettings().build();
    testIamPermissionsInstanceSettings =
        settingsBuilder.testIamPermissionsInstanceSettings().build();
    updateAccessConfigInstanceSettings =
        settingsBuilder.updateAccessConfigInstanceSettings().build();
    updateAccessConfigInstanceOperationSettings =
        settingsBuilder.updateAccessConfigInstanceOperationSettings().build();
    updateNetworkInterfaceInstanceSettings =
        settingsBuilder.updateNetworkInterfaceInstanceSettings().build();
    updateNetworkInterfaceInstanceOperationSettings =
        settingsBuilder.updateNetworkInterfaceInstanceOperationSettings().build();
  }

  private static final PagedListDescriptor<
          AggregatedListInstancesHttpRequest, InstanceAggregatedList, InstancesScopedList>
      AGGREGATED_LIST_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              AggregatedListInstancesHttpRequest, InstanceAggregatedList, InstancesScopedList>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AggregatedListInstancesHttpRequest injectToken(
                AggregatedListInstancesHttpRequest payload, String token) {
              return AggregatedListInstancesHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public AggregatedListInstancesHttpRequest injectPageSize(
                AggregatedListInstancesHttpRequest payload, int pageSize) {
              return AggregatedListInstancesHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(AggregatedListInstancesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceAggregatedList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstancesScopedList> extractResources(InstanceAggregatedList payload) {
              return payload.getItemsMap() != null
                  ? payload.getItemsMap().values()
                  : ImmutableList.<InstancesScopedList>of();
            }
          };

  private static final PagedListDescriptor<ListInstancesHttpRequest, InstanceList, Instance>
      LIST_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<ListInstancesHttpRequest, InstanceList, Instance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstancesHttpRequest injectToken(
                ListInstancesHttpRequest payload, String token) {
              return ListInstancesHttpRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListInstancesHttpRequest injectPageSize(
                ListInstancesHttpRequest payload, int pageSize) {
              return ListInstancesHttpRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListInstancesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Instance> extractResources(InstanceList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<Instance>of();
            }
          };

  private static final PagedListDescriptor<
          ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference>
      LIST_REFERRERS_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListReferrersInstancesHttpRequest injectToken(
                ListReferrersInstancesHttpRequest payload, String token) {
              return ListReferrersInstancesHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListReferrersInstancesHttpRequest injectPageSize(
                ListReferrersInstancesHttpRequest payload, int pageSize) {
              return ListReferrersInstancesHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListReferrersInstancesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceListReferrers payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Reference> extractResources(InstanceListReferrers payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<Reference>of();
            }
          };

  private static final PagedListResponseFactory<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          AggregatedListInstancesPagedResponse>
      AGGREGATED_LIST_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AggregatedListInstancesHttpRequest,
              InstanceAggregatedList,
              AggregatedListInstancesPagedResponse>() {
            @Override
            public ApiFuture<AggregatedListInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> callable,
                AggregatedListInstancesHttpRequest request,
                ApiCallContext context,
                ApiFuture<InstanceAggregatedList> futureResponse) {
              PageContext<
                      AggregatedListInstancesHttpRequest,
                      InstanceAggregatedList,
                      InstancesScopedList>
                  pageContext =
                      PageContext.create(
                          callable, AGGREGATED_LIST_INSTANCES_PAGE_STR_DESC, request, context);
              return AggregatedListInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
      LIST_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>() {
            @Override
            public ApiFuture<ListInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstancesHttpRequest, InstanceList> callable,
                ListInstancesHttpRequest request,
                ApiCallContext context,
                ApiFuture<InstanceList> futureResponse) {
              PageContext<ListInstancesHttpRequest, InstanceList, Instance> pageContext =
                  PageContext.create(callable, LIST_INSTANCES_PAGE_STR_DESC, request, context);
              return ListInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          ListReferrersInstancesPagedResponse>
      LIST_REFERRERS_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListReferrersInstancesHttpRequest,
              InstanceListReferrers,
              ListReferrersInstancesPagedResponse>() {
            @Override
            public ApiFuture<ListReferrersInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListReferrersInstancesHttpRequest, InstanceListReferrers> callable,
                ListReferrersInstancesHttpRequest request,
                ApiCallContext context,
                ApiFuture<InstanceListReferrers> futureResponse) {
              PageContext<ListReferrersInstancesHttpRequest, InstanceListReferrers, Reference>
                  pageContext =
                      PageContext.create(
                          callable, LIST_REFERRERS_INSTANCES_PAGE_STR_DESC, request, context);
              return ListReferrersInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for InstanceStubSettings. */
  public static class Builder extends StubSettings.Builder<InstanceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation>
        addAccessConfigInstanceSettings;
    private final OperationCallSettings.Builder<
            AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        addAccessConfigInstanceOperationSettings;
    private final PagedCallSettings.Builder<
            AggregatedListInstancesHttpRequest,
            InstanceAggregatedList,
            AggregatedListInstancesPagedResponse>
        aggregatedListInstancesSettings;
    private final UnaryCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation>
        attachDiskInstanceSettings;
    private final OperationCallSettings.Builder<
            AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
        attachDiskInstanceOperationSettings;
    private final UnaryCallSettings.Builder<DeleteInstanceHttpRequest, Operation>
        deleteInstanceSettings;
    private final OperationCallSettings.Builder<
            DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
        deleteInstanceOperationSettings;
    private final UnaryCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation>
        deleteAccessConfigInstanceSettings;
    private final OperationCallSettings.Builder<
            DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        deleteAccessConfigInstanceOperationSettings;
    private final UnaryCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation>
        detachDiskInstanceSettings;
    private final OperationCallSettings.Builder<
            DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
        detachDiskInstanceOperationSettings;
    private final UnaryCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyInstanceHttpRequest, Policy>
        getIamPolicyInstanceSettings;
    private final UnaryCallSettings.Builder<
            GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
        getSerialPortOutputInstanceSettings;
    private final UnaryCallSettings.Builder<InsertInstanceHttpRequest, Operation>
        insertInstanceSettings;
    private final OperationCallSettings.Builder<
            InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
        insertInstanceOperationSettings;
    private final PagedCallSettings.Builder<
            ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
        listInstancesSettings;
    private final PagedCallSettings.Builder<
            ListReferrersInstancesHttpRequest,
            InstanceListReferrers,
            ListReferrersInstancesPagedResponse>
        listReferrersInstancesSettings;
    private final UnaryCallSettings.Builder<ResetInstanceHttpRequest, Operation>
        resetInstanceSettings;
    private final OperationCallSettings.Builder<
            ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
        resetInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetDeletionProtectionInstanceHttpRequest, Operation>
        setDeletionProtectionInstanceSettings;
    private final OperationCallSettings.Builder<
            SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setDeletionProtectionInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation>
        setDiskAutoDeleteInstanceSettings;
    private final OperationCallSettings.Builder<
            SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setDiskAutoDeleteInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyInstanceHttpRequest, Policy>
        setIamPolicyInstanceSettings;
    private final UnaryCallSettings.Builder<SetLabelsInstanceHttpRequest, Operation>
        setLabelsInstanceSettings;
    private final OperationCallSettings.Builder<
            SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setLabelsInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetMachineResourcesInstanceHttpRequest, Operation>
        setMachineResourcesInstanceSettings;
    private final OperationCallSettings.Builder<
            SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMachineResourcesInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation>
        setMachineTypeInstanceSettings;
    private final OperationCallSettings.Builder<
            SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMachineTypeInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation>
        setMetadataInstanceSettings;
    private final OperationCallSettings.Builder<
            SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMetadataInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetMinCpuPlatformInstanceHttpRequest, Operation>
        setMinCpuPlatformInstanceSettings;
    private final OperationCallSettings.Builder<
            SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMinCpuPlatformInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation>
        setSchedulingInstanceSettings;
    private final OperationCallSettings.Builder<
            SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setSchedulingInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation>
        setServiceAccountInstanceSettings;
    private final OperationCallSettings.Builder<
            SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setServiceAccountInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SetTagsInstanceHttpRequest, Operation>
        setTagsInstanceSettings;
    private final OperationCallSettings.Builder<
            SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setTagsInstanceOperationSettings;
    private final UnaryCallSettings.Builder<SimulateMaintenanceEventInstanceHttpRequest, Operation>
        simulateMaintenanceEventInstanceSettings;
    private final OperationCallSettings.Builder<
            SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
        simulateMaintenanceEventInstanceOperationSettings;
    private final UnaryCallSettings.Builder<StartInstanceHttpRequest, Operation>
        startInstanceSettings;
    private final OperationCallSettings.Builder<
            StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
        startInstanceOperationSettings;
    private final UnaryCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation>
        startWithEncryptionKeyInstanceSettings;
    private final OperationCallSettings.Builder<
            StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
        startWithEncryptionKeyInstanceOperationSettings;
    private final UnaryCallSettings.Builder<StopInstanceHttpRequest, Operation>
        stopInstanceSettings;
    private final OperationCallSettings.Builder<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
        stopInstanceOperationSettings;
    private final UnaryCallSettings.Builder<
            TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
        testIamPermissionsInstanceSettings;
    private final UnaryCallSettings.Builder<UpdateAccessConfigInstanceHttpRequest, Operation>
        updateAccessConfigInstanceSettings;
    private final OperationCallSettings.Builder<
            UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        updateAccessConfigInstanceOperationSettings;
    private final UnaryCallSettings.Builder<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
        updateNetworkInterfaceInstanceSettings;
    private final OperationCallSettings.Builder<
            UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
        updateNetworkInterfaceInstanceOperationSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      addAccessConfigInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      addAccessConfigInstanceOperationSettings = OperationCallSettings.newBuilder();

      aggregatedListInstancesSettings =
          PagedCallSettings.newBuilder(AGGREGATED_LIST_INSTANCES_PAGE_STR_FACT);

      attachDiskInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      attachDiskInstanceOperationSettings = OperationCallSettings.newBuilder();

      deleteInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstanceOperationSettings = OperationCallSettings.newBuilder();

      deleteAccessConfigInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteAccessConfigInstanceOperationSettings = OperationCallSettings.newBuilder();

      detachDiskInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      detachDiskInstanceOperationSettings = OperationCallSettings.newBuilder();

      getInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getIamPolicyInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSerialPortOutputInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertInstanceOperationSettings = OperationCallSettings.newBuilder();

      listInstancesSettings = PagedCallSettings.newBuilder(LIST_INSTANCES_PAGE_STR_FACT);

      listReferrersInstancesSettings =
          PagedCallSettings.newBuilder(LIST_REFERRERS_INSTANCES_PAGE_STR_FACT);

      resetInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      resetInstanceOperationSettings = OperationCallSettings.newBuilder();

      setDeletionProtectionInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setDeletionProtectionInstanceOperationSettings = OperationCallSettings.newBuilder();

      setDiskAutoDeleteInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setDiskAutoDeleteInstanceOperationSettings = OperationCallSettings.newBuilder();

      setIamPolicyInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setLabelsInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setLabelsInstanceOperationSettings = OperationCallSettings.newBuilder();

      setMachineResourcesInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setMachineResourcesInstanceOperationSettings = OperationCallSettings.newBuilder();

      setMachineTypeInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setMachineTypeInstanceOperationSettings = OperationCallSettings.newBuilder();

      setMetadataInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setMetadataInstanceOperationSettings = OperationCallSettings.newBuilder();

      setMinCpuPlatformInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setMinCpuPlatformInstanceOperationSettings = OperationCallSettings.newBuilder();

      setSchedulingInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setSchedulingInstanceOperationSettings = OperationCallSettings.newBuilder();

      setServiceAccountInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setServiceAccountInstanceOperationSettings = OperationCallSettings.newBuilder();

      setTagsInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTagsInstanceOperationSettings = OperationCallSettings.newBuilder();

      simulateMaintenanceEventInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      simulateMaintenanceEventInstanceOperationSettings = OperationCallSettings.newBuilder();

      startInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      startInstanceOperationSettings = OperationCallSettings.newBuilder();

      startWithEncryptionKeyInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      startWithEncryptionKeyInstanceOperationSettings = OperationCallSettings.newBuilder();

      stopInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      stopInstanceOperationSettings = OperationCallSettings.newBuilder();

      testIamPermissionsInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateAccessConfigInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateAccessConfigInstanceOperationSettings = OperationCallSettings.newBuilder();

      updateNetworkInterfaceInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateNetworkInterfaceInstanceOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addAccessConfigInstanceSettings,
              aggregatedListInstancesSettings,
              attachDiskInstanceSettings,
              deleteInstanceSettings,
              deleteAccessConfigInstanceSettings,
              detachDiskInstanceSettings,
              getInstanceSettings,
              getIamPolicyInstanceSettings,
              getSerialPortOutputInstanceSettings,
              insertInstanceSettings,
              listInstancesSettings,
              listReferrersInstancesSettings,
              resetInstanceSettings,
              setDeletionProtectionInstanceSettings,
              setDiskAutoDeleteInstanceSettings,
              setIamPolicyInstanceSettings,
              setLabelsInstanceSettings,
              setMachineResourcesInstanceSettings,
              setMachineTypeInstanceSettings,
              setMetadataInstanceSettings,
              setMinCpuPlatformInstanceSettings,
              setSchedulingInstanceSettings,
              setServiceAccountInstanceSettings,
              setTagsInstanceSettings,
              simulateMaintenanceEventInstanceSettings,
              startInstanceSettings,
              startWithEncryptionKeyInstanceSettings,
              stopInstanceSettings,
              testIamPermissionsInstanceSettings,
              updateAccessConfigInstanceSettings,
              updateNetworkInterfaceInstanceSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .addAccessConfigInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .aggregatedListInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .attachDiskInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteAccessConfigInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .detachDiskInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getIamPolicyInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSerialPortOutputInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listReferrersInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .resetInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setDeletionProtectionInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setDiskAutoDeleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setIamPolicyInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setLabelsInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setMachineResourcesInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setMachineTypeInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setMetadataInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setMinCpuPlatformInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setSchedulingInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setServiceAccountInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setTagsInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .simulateMaintenanceEventInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .startInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .startWithEncryptionKeyInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .stopInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .testIamPermissionsInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateAccessConfigInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateNetworkInterfaceInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .addAccessConfigInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AddAccessConfigInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .attachDiskInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AttachDiskInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .deleteInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .deleteAccessConfigInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteAccessConfigInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .detachDiskInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DetachDiskInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .insertInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .resetInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ResetInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setDeletionProtectionInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetDeletionProtectionInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setDiskAutoDeleteInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetDiskAutoDeleteInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setLabelsInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetLabelsInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setMachineResourcesInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetMachineResourcesInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setMachineTypeInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetMachineTypeInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setMetadataInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetMetadataInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setMinCpuPlatformInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetMinCpuPlatformInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setSchedulingInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetSchedulingInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setServiceAccountInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetServiceAccountInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setTagsInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetTagsInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .simulateMaintenanceEventInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SimulateMaintenanceEventInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .startInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StartInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .startWithEncryptionKeyInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StartWithEncryptionKeyInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .stopInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StopInstanceHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .updateAccessConfigInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateAccessConfigInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .updateNetworkInterfaceInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateNetworkInterfaceInstanceHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(InstanceStubSettings settings) {
      super(settings);

      addAccessConfigInstanceSettings = settings.addAccessConfigInstanceSettings.toBuilder();
      addAccessConfigInstanceOperationSettings =
          settings.addAccessConfigInstanceOperationSettings.toBuilder();
      aggregatedListInstancesSettings = settings.aggregatedListInstancesSettings.toBuilder();
      attachDiskInstanceSettings = settings.attachDiskInstanceSettings.toBuilder();
      attachDiskInstanceOperationSettings =
          settings.attachDiskInstanceOperationSettings.toBuilder();
      deleteInstanceSettings = settings.deleteInstanceSettings.toBuilder();
      deleteInstanceOperationSettings = settings.deleteInstanceOperationSettings.toBuilder();
      deleteAccessConfigInstanceSettings = settings.deleteAccessConfigInstanceSettings.toBuilder();
      deleteAccessConfigInstanceOperationSettings =
          settings.deleteAccessConfigInstanceOperationSettings.toBuilder();
      detachDiskInstanceSettings = settings.detachDiskInstanceSettings.toBuilder();
      detachDiskInstanceOperationSettings =
          settings.detachDiskInstanceOperationSettings.toBuilder();
      getInstanceSettings = settings.getInstanceSettings.toBuilder();
      getIamPolicyInstanceSettings = settings.getIamPolicyInstanceSettings.toBuilder();
      getSerialPortOutputInstanceSettings =
          settings.getSerialPortOutputInstanceSettings.toBuilder();
      insertInstanceSettings = settings.insertInstanceSettings.toBuilder();
      insertInstanceOperationSettings = settings.insertInstanceOperationSettings.toBuilder();
      listInstancesSettings = settings.listInstancesSettings.toBuilder();
      listReferrersInstancesSettings = settings.listReferrersInstancesSettings.toBuilder();
      resetInstanceSettings = settings.resetInstanceSettings.toBuilder();
      resetInstanceOperationSettings = settings.resetInstanceOperationSettings.toBuilder();
      setDeletionProtectionInstanceSettings =
          settings.setDeletionProtectionInstanceSettings.toBuilder();
      setDeletionProtectionInstanceOperationSettings =
          settings.setDeletionProtectionInstanceOperationSettings.toBuilder();
      setDiskAutoDeleteInstanceSettings = settings.setDiskAutoDeleteInstanceSettings.toBuilder();
      setDiskAutoDeleteInstanceOperationSettings =
          settings.setDiskAutoDeleteInstanceOperationSettings.toBuilder();
      setIamPolicyInstanceSettings = settings.setIamPolicyInstanceSettings.toBuilder();
      setLabelsInstanceSettings = settings.setLabelsInstanceSettings.toBuilder();
      setLabelsInstanceOperationSettings = settings.setLabelsInstanceOperationSettings.toBuilder();
      setMachineResourcesInstanceSettings =
          settings.setMachineResourcesInstanceSettings.toBuilder();
      setMachineResourcesInstanceOperationSettings =
          settings.setMachineResourcesInstanceOperationSettings.toBuilder();
      setMachineTypeInstanceSettings = settings.setMachineTypeInstanceSettings.toBuilder();
      setMachineTypeInstanceOperationSettings =
          settings.setMachineTypeInstanceOperationSettings.toBuilder();
      setMetadataInstanceSettings = settings.setMetadataInstanceSettings.toBuilder();
      setMetadataInstanceOperationSettings =
          settings.setMetadataInstanceOperationSettings.toBuilder();
      setMinCpuPlatformInstanceSettings = settings.setMinCpuPlatformInstanceSettings.toBuilder();
      setMinCpuPlatformInstanceOperationSettings =
          settings.setMinCpuPlatformInstanceOperationSettings.toBuilder();
      setSchedulingInstanceSettings = settings.setSchedulingInstanceSettings.toBuilder();
      setSchedulingInstanceOperationSettings =
          settings.setSchedulingInstanceOperationSettings.toBuilder();
      setServiceAccountInstanceSettings = settings.setServiceAccountInstanceSettings.toBuilder();
      setServiceAccountInstanceOperationSettings =
          settings.setServiceAccountInstanceOperationSettings.toBuilder();
      setTagsInstanceSettings = settings.setTagsInstanceSettings.toBuilder();
      setTagsInstanceOperationSettings = settings.setTagsInstanceOperationSettings.toBuilder();
      simulateMaintenanceEventInstanceSettings =
          settings.simulateMaintenanceEventInstanceSettings.toBuilder();
      simulateMaintenanceEventInstanceOperationSettings =
          settings.simulateMaintenanceEventInstanceOperationSettings.toBuilder();
      startInstanceSettings = settings.startInstanceSettings.toBuilder();
      startInstanceOperationSettings = settings.startInstanceOperationSettings.toBuilder();
      startWithEncryptionKeyInstanceSettings =
          settings.startWithEncryptionKeyInstanceSettings.toBuilder();
      startWithEncryptionKeyInstanceOperationSettings =
          settings.startWithEncryptionKeyInstanceOperationSettings.toBuilder();
      stopInstanceSettings = settings.stopInstanceSettings.toBuilder();
      stopInstanceOperationSettings = settings.stopInstanceOperationSettings.toBuilder();
      testIamPermissionsInstanceSettings = settings.testIamPermissionsInstanceSettings.toBuilder();
      updateAccessConfigInstanceSettings = settings.updateAccessConfigInstanceSettings.toBuilder();
      updateAccessConfigInstanceOperationSettings =
          settings.updateAccessConfigInstanceOperationSettings.toBuilder();
      updateNetworkInterfaceInstanceSettings =
          settings.updateNetworkInterfaceInstanceSettings.toBuilder();
      updateNetworkInterfaceInstanceOperationSettings =
          settings.updateNetworkInterfaceInstanceOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addAccessConfigInstanceSettings,
              aggregatedListInstancesSettings,
              attachDiskInstanceSettings,
              deleteInstanceSettings,
              deleteAccessConfigInstanceSettings,
              detachDiskInstanceSettings,
              getInstanceSettings,
              getIamPolicyInstanceSettings,
              getSerialPortOutputInstanceSettings,
              insertInstanceSettings,
              listInstancesSettings,
              listReferrersInstancesSettings,
              resetInstanceSettings,
              setDeletionProtectionInstanceSettings,
              setDiskAutoDeleteInstanceSettings,
              setIamPolicyInstanceSettings,
              setLabelsInstanceSettings,
              setMachineResourcesInstanceSettings,
              setMachineTypeInstanceSettings,
              setMetadataInstanceSettings,
              setMinCpuPlatformInstanceSettings,
              setSchedulingInstanceSettings,
              setServiceAccountInstanceSettings,
              setTagsInstanceSettings,
              simulateMaintenanceEventInstanceSettings,
              startInstanceSettings,
              startWithEncryptionKeyInstanceSettings,
              stopInstanceSettings,
              testIamPermissionsInstanceSettings,
              updateAccessConfigInstanceSettings,
              updateNetworkInterfaceInstanceSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to addAccessConfigInstance. */
    public UnaryCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation>
        addAccessConfigInstanceSettings() {
      return addAccessConfigInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to addAccessConfigInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        addAccessConfigInstanceOperationSettings() {
      return addAccessConfigInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to aggregatedListInstances. */
    public PagedCallSettings.Builder<
            AggregatedListInstancesHttpRequest,
            InstanceAggregatedList,
            AggregatedListInstancesPagedResponse>
        aggregatedListInstancesSettings() {
      return aggregatedListInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to attachDiskInstance. */
    public UnaryCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation>
        attachDiskInstanceSettings() {
      return attachDiskInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to attachDiskInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
        attachDiskInstanceOperationSettings() {
      return attachDiskInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public UnaryCallSettings.Builder<DeleteInstanceHttpRequest, Operation>
        deleteInstanceSettings() {
      return deleteInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
        deleteInstanceOperationSettings() {
      return deleteInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAccessConfigInstance. */
    public UnaryCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation>
        deleteAccessConfigInstanceSettings() {
      return deleteAccessConfigInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAccessConfigInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        deleteAccessConfigInstanceOperationSettings() {
      return deleteAccessConfigInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to detachDiskInstance. */
    public UnaryCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation>
        detachDiskInstanceSettings() {
      return detachDiskInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to detachDiskInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
        detachDiskInstanceOperationSettings() {
      return detachDiskInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public UnaryCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings() {
      return getInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicyInstance. */
    public UnaryCallSettings.Builder<GetIamPolicyInstanceHttpRequest, Policy>
        getIamPolicyInstanceSettings() {
      return getIamPolicyInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to getSerialPortOutputInstance. */
    public UnaryCallSettings.Builder<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
        getSerialPortOutputInstanceSettings() {
      return getSerialPortOutputInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to insertInstance. */
    public UnaryCallSettings.Builder<InsertInstanceHttpRequest, Operation>
        insertInstanceSettings() {
      return insertInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to insertInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
        insertInstanceOperationSettings() {
      return insertInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<
            ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
        listInstancesSettings() {
      return listInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to listReferrersInstances. */
    public PagedCallSettings.Builder<
            ListReferrersInstancesHttpRequest,
            InstanceListReferrers,
            ListReferrersInstancesPagedResponse>
        listReferrersInstancesSettings() {
      return listReferrersInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to resetInstance. */
    public UnaryCallSettings.Builder<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
      return resetInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to resetInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
        resetInstanceOperationSettings() {
      return resetInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setDeletionProtectionInstance. */
    public UnaryCallSettings.Builder<SetDeletionProtectionInstanceHttpRequest, Operation>
        setDeletionProtectionInstanceSettings() {
      return setDeletionProtectionInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setDeletionProtectionInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setDeletionProtectionInstanceOperationSettings() {
      return setDeletionProtectionInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setDiskAutoDeleteInstance. */
    public UnaryCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation>
        setDiskAutoDeleteInstanceSettings() {
      return setDiskAutoDeleteInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setDiskAutoDeleteInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setDiskAutoDeleteInstanceOperationSettings() {
      return setDiskAutoDeleteInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicyInstance. */
    public UnaryCallSettings.Builder<SetIamPolicyInstanceHttpRequest, Policy>
        setIamPolicyInstanceSettings() {
      return setIamPolicyInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setLabelsInstance. */
    public UnaryCallSettings.Builder<SetLabelsInstanceHttpRequest, Operation>
        setLabelsInstanceSettings() {
      return setLabelsInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setLabelsInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setLabelsInstanceOperationSettings() {
      return setLabelsInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setMachineResourcesInstance. */
    public UnaryCallSettings.Builder<SetMachineResourcesInstanceHttpRequest, Operation>
        setMachineResourcesInstanceSettings() {
      return setMachineResourcesInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setMachineResourcesInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMachineResourcesInstanceOperationSettings() {
      return setMachineResourcesInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setMachineTypeInstance. */
    public UnaryCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation>
        setMachineTypeInstanceSettings() {
      return setMachineTypeInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setMachineTypeInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMachineTypeInstanceOperationSettings() {
      return setMachineTypeInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setMetadataInstance. */
    public UnaryCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation>
        setMetadataInstanceSettings() {
      return setMetadataInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setMetadataInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMetadataInstanceOperationSettings() {
      return setMetadataInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setMinCpuPlatformInstance. */
    public UnaryCallSettings.Builder<SetMinCpuPlatformInstanceHttpRequest, Operation>
        setMinCpuPlatformInstanceSettings() {
      return setMinCpuPlatformInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setMinCpuPlatformInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMinCpuPlatformInstanceOperationSettings() {
      return setMinCpuPlatformInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setSchedulingInstance. */
    public UnaryCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation>
        setSchedulingInstanceSettings() {
      return setSchedulingInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setSchedulingInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setSchedulingInstanceOperationSettings() {
      return setSchedulingInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setServiceAccountInstance. */
    public UnaryCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation>
        setServiceAccountInstanceSettings() {
      return setServiceAccountInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setServiceAccountInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setServiceAccountInstanceOperationSettings() {
      return setServiceAccountInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setTagsInstance. */
    public UnaryCallSettings.Builder<SetTagsInstanceHttpRequest, Operation>
        setTagsInstanceSettings() {
      return setTagsInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setTagsInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setTagsInstanceOperationSettings() {
      return setTagsInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to simulateMaintenanceEventInstance. */
    public UnaryCallSettings.Builder<SimulateMaintenanceEventInstanceHttpRequest, Operation>
        simulateMaintenanceEventInstanceSettings() {
      return simulateMaintenanceEventInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to simulateMaintenanceEventInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
        simulateMaintenanceEventInstanceOperationSettings() {
      return simulateMaintenanceEventInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to startInstance. */
    public UnaryCallSettings.Builder<StartInstanceHttpRequest, Operation> startInstanceSettings() {
      return startInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to startInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
        startInstanceOperationSettings() {
      return startInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to startWithEncryptionKeyInstance. */
    public UnaryCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation>
        startWithEncryptionKeyInstanceSettings() {
      return startWithEncryptionKeyInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to startWithEncryptionKeyInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
        startWithEncryptionKeyInstanceOperationSettings() {
      return startWithEncryptionKeyInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to stopInstance. */
    public UnaryCallSettings.Builder<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
      return stopInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to stopInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
        stopInstanceOperationSettings() {
      return stopInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissionsInstance. */
    public UnaryCallSettings.Builder<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
        testIamPermissionsInstanceSettings() {
      return testIamPermissionsInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to updateAccessConfigInstance. */
    public UnaryCallSettings.Builder<UpdateAccessConfigInstanceHttpRequest, Operation>
        updateAccessConfigInstanceSettings() {
      return updateAccessConfigInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to updateAccessConfigInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        updateAccessConfigInstanceOperationSettings() {
      return updateAccessConfigInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateNetworkInterfaceInstance. */
    public UnaryCallSettings.Builder<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
        updateNetworkInterfaceInstanceSettings() {
      return updateNetworkInterfaceInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to updateNetworkInterfaceInstance. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
        updateNetworkInterfaceInstanceOperationSettings() {
      return updateNetworkInterfaceInstanceOperationSettings;
    }

    @Override
    public InstanceStubSettings build() throws IOException {
      return new InstanceStubSettings(this);
    }
  }
}
