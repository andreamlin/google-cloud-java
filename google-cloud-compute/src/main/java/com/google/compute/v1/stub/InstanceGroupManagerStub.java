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
import com.google.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.AggregatedListInstanceGroupManagersHttpRequest;
import com.google.compute.v1.DeleteInstanceGroupManagerHttpRequest;
import com.google.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.GetInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InsertInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InstanceGroupManager;
import com.google.compute.v1.InstanceGroupManagerAggregatedList;
import com.google.compute.v1.InstanceGroupManagerList;
import com.google.compute.v1.InstanceGroupManagerName;
import com.google.compute.v1.InstanceGroupManagersAbandonInstancesRequest;
import com.google.compute.v1.InstanceGroupManagersDeleteInstancesRequest;
import com.google.compute.v1.InstanceGroupManagersListManagedInstancesResponse;
import com.google.compute.v1.InstanceGroupManagersRecreateInstancesRequest;
import com.google.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest;
import com.google.compute.v1.InstanceGroupManagersSetTargetPoolsRequest;
import com.google.compute.v1.ListInstanceGroupManagersHttpRequest;
import com.google.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupManagersPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.ResizeInstanceGroupManagerHttpRequest;
import com.google.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest;
import com.google.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest;
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
public abstract class InstanceGroupManagerStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: abandonInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> aggregatedListInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: insertInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupManagersHttpRequest, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> listInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException("Not implemented: listManagedInstancesInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: recreateInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: resizeInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: setInstanceTemplateInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: setTargetPoolsInstanceGroupManagerCallable()");
  }

}