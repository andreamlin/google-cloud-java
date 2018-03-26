/*
 * Copyright 2018 Google LLC
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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteSnapshotHttpRequest;
import com.google.cloud.compute.v1.GetSnapshotHttpRequest;
import com.google.cloud.compute.v1.ListSnapshotsHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.Snapshot;
import static com.google.cloud.compute.v1.SnapshotClient.ListSnapshotsPagedResponse;
import com.google.cloud.compute.v1.SnapshotList;
import com.google.cloud.compute.v1.SnapshotName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class SnapshotStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteSnapshotHttpRequest, Operation> deleteSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSnapshotCallable()");
  }

  @BetaApi
  public UnaryCallable<GetSnapshotHttpRequest, Snapshot> getSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: getSnapshotCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSnapshotsHttpRequest, ListSnapshotsPagedResponse> listSnapshotsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSnapshotsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSnapshotsHttpRequest, SnapshotList> listSnapshotsCallable() {
    throw new UnsupportedOperationException("Not implemented: listSnapshotsCallable()");
  }

}