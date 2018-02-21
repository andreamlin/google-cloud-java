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
package com.google.compute.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.compute.v1.DiskMoveRequest;
import com.google.compute.v1.GetProjectHttpRequest;
import com.google.compute.v1.InstanceMoveRequest;
import com.google.compute.v1.Metadata;
import com.google.compute.v1.MoveDiskProjectHttpRequest;
import com.google.compute.v1.MoveInstanceProjectHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.Project;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetCommonInstanceMetadataProjectHttpRequest;
import com.google.compute.v1.SetUsageExportBucketProjectHttpRequest;
import com.google.compute.v1.UsageExportLocation;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ProjectStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: getProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<MoveDiskProjectHttpRequest, Operation> moveDiskProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: moveDiskProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: moveInstanceProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: setCommonInstanceMetadataProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: setUsageExportBucketProjectCallable()");
  }

}