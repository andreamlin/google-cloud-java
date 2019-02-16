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

import static com.google.cloud.compute.v1.RegionDiskClient.ListRegionDisksPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest;
import com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest;
import com.google.cloud.compute.v1.Disk;
import com.google.cloud.compute.v1.DiskList;
import com.google.cloud.compute.v1.GetRegionDiskHttpRequest;
import com.google.cloud.compute.v1.InsertRegionDiskHttpRequest;
import com.google.cloud.compute.v1.ListRegionDisksHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest;
import com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest;
import com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class RegionDiskStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public RegionOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<CreateSnapshotRegionDiskHttpRequest, EmptyMessage, Operation>
      createSnapshotRegionDiskOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createSnapshotRegionDiskOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<CreateSnapshotRegionDiskHttpRequest, Operation>
      createSnapshotRegionDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: createSnapshotRegionDiskCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteRegionDiskHttpRequest, EmptyMessage, Operation>
      deleteRegionDiskOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRegionDiskOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteRegionDiskHttpRequest, Operation> deleteRegionDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRegionDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<GetRegionDiskHttpRequest, Disk> getRegionDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: getRegionDiskCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertRegionDiskHttpRequest, EmptyMessage, Operation>
      insertRegionDiskOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: insertRegionDiskOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertRegionDiskHttpRequest, Operation> insertRegionDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: insertRegionDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRegionDisksHttpRequest, ListRegionDisksPagedResponse>
      listRegionDisksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRegionDisksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRegionDisksHttpRequest, DiskList> listRegionDisksCallable() {
    throw new UnsupportedOperationException("Not implemented: listRegionDisksCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ResizeRegionDiskHttpRequest, EmptyMessage, Operation>
      resizeRegionDiskOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: resizeRegionDiskOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<ResizeRegionDiskHttpRequest, Operation> resizeRegionDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: resizeRegionDiskCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetLabelsRegionDiskHttpRequest, EmptyMessage, Operation>
      setLabelsRegionDiskOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setLabelsRegionDiskOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetLabelsRegionDiskHttpRequest, Operation> setLabelsRegionDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: setLabelsRegionDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<TestIamPermissionsRegionDiskHttpRequest, TestPermissionsResponse>
      testIamPermissionsRegionDiskCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: testIamPermissionsRegionDiskCallable()");
  }

  @Override
  public abstract void close();
}
