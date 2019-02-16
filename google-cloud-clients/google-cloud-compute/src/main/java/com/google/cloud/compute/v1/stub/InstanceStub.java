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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
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
import com.google.cloud.compute.v1.ListInstancesHttpRequest;
import com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Policy;
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
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class InstanceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public ZoneOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AddAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      addAccessConfigInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: addAccessConfigInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: addAccessConfigInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse>
      aggregatedListInstancesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: aggregatedListInstancesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList>
      aggregatedListInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInstancesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AttachDiskInstanceHttpRequest, EmptyMessage, Operation>
      attachDiskInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: attachDiskInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: attachDiskInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteInstanceHttpRequest, EmptyMessage, Operation>
      deleteInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      deleteAccessConfigInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteAccessConfigInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteAccessConfigInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DetachDiskInstanceHttpRequest, EmptyMessage, Operation>
      detachDiskInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: detachDiskInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: detachDiskInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<GetInstanceHttpRequest, Instance> getInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<GetIamPolicyInstanceHttpRequest, Policy> getIamPolicyInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getSerialPortOutputInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertInstanceHttpRequest, EmptyMessage, Operation>
      insertInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: insertInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: insertInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesCallable()");
  }

  @BetaApi
  public UnaryCallable<ListReferrersInstancesHttpRequest, ListReferrersInstancesPagedResponse>
      listReferrersInstancesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listReferrersInstancesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListReferrersInstancesHttpRequest, InstanceListReferrers>
      listReferrersInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: listReferrersInstancesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ResetInstanceHttpRequest, EmptyMessage, Operation>
      resetInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: resetInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: resetInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetDeletionProtectionInstanceHttpRequest, EmptyMessage, Operation>
      setDeletionProtectionInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setDeletionProtectionInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setDeletionProtectionInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, Operation>
      setDiskAutoDeleteInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setDiskAutoDeleteInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setDiskAutoDeleteInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetIamPolicyInstanceHttpRequest, Policy> setIamPolicyInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetLabelsInstanceHttpRequest, EmptyMessage, Operation>
      setLabelsInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setLabelsInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetLabelsInstanceHttpRequest, Operation> setLabelsInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setLabelsInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMachineResourcesInstanceHttpRequest, EmptyMessage, Operation>
      setMachineResourcesInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setMachineResourcesInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setMachineResourcesInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMachineTypeInstanceHttpRequest, EmptyMessage, Operation>
      setMachineTypeInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setMachineTypeInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setMachineTypeInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMetadataInstanceHttpRequest, EmptyMessage, Operation>
      setMetadataInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setMetadataInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setMetadataInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, Operation>
      setMinCpuPlatformInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setMinCpuPlatformInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setMinCpuPlatformInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetSchedulingInstanceHttpRequest, EmptyMessage, Operation>
      setSchedulingInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSchedulingInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setSchedulingInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetServiceAccountInstanceHttpRequest, EmptyMessage, Operation>
      setServiceAccountInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setServiceAccountInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setServiceAccountInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetTagsInstanceHttpRequest, EmptyMessage, Operation>
      setTagsInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: setTagsInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setTagsInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, Operation>
      simulateMaintenanceEventInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: simulateMaintenanceEventInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: simulateMaintenanceEventInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<StartInstanceHttpRequest, EmptyMessage, Operation>
      startInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: startInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: startInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, Operation>
      startWithEncryptionKeyInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: startWithEncryptionKeyInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: startWithEncryptionKeyInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<StopInstanceHttpRequest, EmptyMessage, Operation>
      stopInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: stopInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: stopInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: testIamPermissionsInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<UpdateAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      updateAccessConfigInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateAccessConfigInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateAccessConfigInstanceCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, Operation>
      updateNetworkInterfaceInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateNetworkInterfaceInstanceOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateNetworkInterfaceInstanceCallable()");
  }

  @Override
  public abstract void close();
}
