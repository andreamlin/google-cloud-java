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
package com.google.compute.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.compute.v1.AccessConfig;
import com.google.compute.v1.AddAccessConfigInstanceHttpRequest;
import com.google.compute.v1.AggregatedListInstancesHttpRequest;
import com.google.compute.v1.AttachDiskInstanceHttpRequest;
import com.google.compute.v1.AttachedDisk;
import com.google.compute.v1.DeleteAccessConfigInstanceHttpRequest;
import com.google.compute.v1.DeleteInstanceHttpRequest;
import com.google.compute.v1.DetachDiskInstanceHttpRequest;
import com.google.compute.v1.GetInstanceHttpRequest;
import com.google.compute.v1.GetSerialPortOutputInstanceHttpRequest;
import com.google.compute.v1.InsertInstanceHttpRequest;
import com.google.compute.v1.Instance;
import com.google.compute.v1.InstanceAggregatedList;
import com.google.compute.v1.InstanceList;
import com.google.compute.v1.InstanceName;
import com.google.compute.v1.InstancesSetMachineTypeRequest;
import com.google.compute.v1.InstancesSetServiceAccountRequest;
import com.google.compute.v1.InstancesStartWithEncryptionKeyRequest;
import com.google.compute.v1.ListInstancesHttpRequest;
import com.google.compute.v1.Metadata;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.ResetInstanceHttpRequest;
import com.google.compute.v1.Scheduling;
import com.google.compute.v1.SerialPortOutput;
import com.google.compute.v1.SetDiskAutoDeleteInstanceHttpRequest;
import com.google.compute.v1.SetMachineTypeInstanceHttpRequest;
import com.google.compute.v1.SetMetadataInstanceHttpRequest;
import com.google.compute.v1.SetSchedulingInstanceHttpRequest;
import com.google.compute.v1.SetServiceAccountInstanceHttpRequest;
import com.google.compute.v1.SetTagsInstanceHttpRequest;
import com.google.compute.v1.StartInstanceHttpRequest;
import com.google.compute.v1.StartWithEncryptionKeyInstanceHttpRequest;
import com.google.compute.v1.StopInstanceHttpRequest;
import com.google.compute.v1.Tags;
import com.google.compute.v1.ZoneName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class InstanceStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: addAccessConfigInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse> aggregatedListInstancesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInstancesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> aggregatedListInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInstancesCallable()");
  }

  @BetaApi
  public UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: attachDiskInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAccessConfigInstanceCallable()");
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
  public UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: getSerialPortOutputInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: insertInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse> listInstancesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesCallable()");
  }

  @BetaApi
  public UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: resetInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setDiskAutoDeleteInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setMachineTypeInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setMetadataInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setSchedulingInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setServiceAccountInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: setTagsInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: startInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: startWithEncryptionKeyInstanceCallable()");
  }

  @BetaApi
  public UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: stopInstanceCallable()");
  }

}