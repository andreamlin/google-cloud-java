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

import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListRegionInstanceGroupManagersPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.RegionInstanceGroupManagerList;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse;
import com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class RegionInstanceGroupManagerStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public RegionOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          AbandonInstancesRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      abandonInstancesRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: abandonInstancesRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: abandonInstancesRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      deleteRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
      deleteRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          DeleteInstancesRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      deleteInstancesRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteInstancesRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteInstancesRegionInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      insertRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertRegionInstanceGroupManagerHttpRequest, Operation>
      insertRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertRegionInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListRegionInstanceGroupManagersHttpRequest, ListRegionInstanceGroupManagersPagedResponse>
      listRegionInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listRegionInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
      listRegionInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listRegionInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse>
      listManagedInstancesRegionInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listManagedInstancesRegionInstanceGroupManagersCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      patchRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchRegionInstanceGroupManagerHttpRequest, Operation>
      patchRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          RecreateInstancesRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      recreateInstancesRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: recreateInstancesRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: recreateInstancesRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ResizeRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      resizeRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: resizeRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
      resizeRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: resizeRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      setInstanceTemplateRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setInstanceTemplateRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setInstanceTemplateRegionInstanceGroupManagerCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          SetTargetPoolsRegionInstanceGroupManagerHttpRequest, EmptyMessage, EmptyMessage>
      setTargetPoolsRegionInstanceGroupManagerOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setTargetPoolsRegionInstanceGroupManagerOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsRegionInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setTargetPoolsRegionInstanceGroupManagerCallable()");
  }

  @Override
  public abstract void close();
}
