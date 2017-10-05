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
package com.google.compute.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.compute.v1.AggregatedListDisksHttpRequest;
import com.google.compute.v1.CreateSnapshotDiskHttpRequest;
import com.google.compute.v1.DeleteDiskHttpRequest;
import com.google.compute.v1.Disk;
import com.google.compute.v1.DiskAggregatedList;
import com.google.compute.v1.DiskList;
import com.google.compute.v1.DiskName;
import com.google.compute.v1.DisksResizeRequest;
import com.google.compute.v1.GetDiskHttpRequest;
import com.google.compute.v1.InsertDiskHttpRequest;
import com.google.compute.v1.ListDisksHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDisksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDisksPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.ResizeDiskHttpRequest;
import com.google.compute.v1.Snapshot;
import com.google.compute.v1.ZoneName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class DiskAdminStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListDisksHttpRequest, AggregatedListDisksPagedResponse> aggregatedListDisksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListDisksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListDisksHttpRequest, DiskAggregatedList> aggregatedListDisksCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListDisksCallable()");
  }

  @BetaApi
  public UnaryCallable<CreateSnapshotDiskHttpRequest, Operation> createSnapshotDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: createSnapshotDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteDiskHttpRequest, Operation> deleteDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<GetDiskHttpRequest, Disk> getDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: getDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertDiskHttpRequest, Operation> insertDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: insertDiskCallable()");
  }

  @BetaApi
  public UnaryCallable<ListDisksHttpRequest, ListDisksPagedResponse> listDisksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDisksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListDisksHttpRequest, DiskList> listDisksCallable() {
    throw new UnsupportedOperationException("Not implemented: listDisksCallable()");
  }

  @BetaApi
  public UnaryCallable<ResizeDiskHttpRequest, Operation> resizeDiskCallable() {
    throw new UnsupportedOperationException("Not implemented: resizeDiskCallable()");
  }

}