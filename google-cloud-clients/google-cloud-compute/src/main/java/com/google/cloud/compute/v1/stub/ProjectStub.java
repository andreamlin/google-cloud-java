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

import static com.google.cloud.compute.v1.ProjectClient.GetXpnResourcesProjectsPagedResponse;
import static com.google.cloud.compute.v1.ProjectClient.ListXpnHostsProjectsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest;
import com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest;
import com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest;
import com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest;
import com.google.cloud.compute.v1.GetProjectHttpRequest;
import com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest;
import com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest;
import com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest;
import com.google.cloud.compute.v1.MoveDiskProjectHttpRequest;
import com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Project;
import com.google.cloud.compute.v1.ProjectsGetXpnResources;
import com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest;
import com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest;
import com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest;
import com.google.cloud.compute.v1.XpnHostList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ProjectStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DisableXpnHostProjectHttpRequest, EmptyMessage, EmptyMessage>
      disableXpnHostProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: disableXpnHostProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DisableXpnHostProjectHttpRequest, Operation>
      disableXpnHostProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: disableXpnHostProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DisableXpnResourceProjectHttpRequest, EmptyMessage, EmptyMessage>
      disableXpnResourceProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: disableXpnResourceProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DisableXpnResourceProjectHttpRequest, Operation>
      disableXpnResourceProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: disableXpnResourceProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<EnableXpnHostProjectHttpRequest, EmptyMessage, EmptyMessage>
      enableXpnHostProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: enableXpnHostProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<EnableXpnHostProjectHttpRequest, Operation> enableXpnHostProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: enableXpnHostProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<EnableXpnResourceProjectHttpRequest, EmptyMessage, EmptyMessage>
      enableXpnResourceProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: enableXpnResourceProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<EnableXpnResourceProjectHttpRequest, Operation>
      enableXpnResourceProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: enableXpnResourceProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: getProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<GetXpnHostProjectHttpRequest, Project> getXpnHostProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: getXpnHostProjectCallable()");
  }

  @BetaApi
  public UnaryCallable<GetXpnResourcesProjectsHttpRequest, GetXpnResourcesProjectsPagedResponse>
      getXpnResourcesProjectsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getXpnResourcesProjectsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<GetXpnResourcesProjectsHttpRequest, ProjectsGetXpnResources>
      getXpnResourcesProjectsCallable() {
    throw new UnsupportedOperationException("Not implemented: getXpnResourcesProjectsCallable()");
  }

  @BetaApi
  public UnaryCallable<ListXpnHostsProjectsHttpRequest, ListXpnHostsProjectsPagedResponse>
      listXpnHostsProjectsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listXpnHostsProjectsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListXpnHostsProjectsHttpRequest, XpnHostList>
      listXpnHostsProjectsCallable() {
    throw new UnsupportedOperationException("Not implemented: listXpnHostsProjectsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<MoveDiskProjectHttpRequest, EmptyMessage, EmptyMessage>
      moveDiskProjectOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: moveDiskProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<MoveDiskProjectHttpRequest, Operation> moveDiskProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: moveDiskProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<MoveInstanceProjectHttpRequest, EmptyMessage, EmptyMessage>
      moveInstanceProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: moveInstanceProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectCallable() {
    throw new UnsupportedOperationException("Not implemented: moveInstanceProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetCommonInstanceMetadataProjectHttpRequest, EmptyMessage, EmptyMessage>
      setCommonInstanceMetadataProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setCommonInstanceMetadataProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation>
      setCommonInstanceMetadataProjectCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setCommonInstanceMetadataProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetDefaultNetworkTierProjectHttpRequest, EmptyMessage, EmptyMessage>
      setDefaultNetworkTierProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setDefaultNetworkTierProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetDefaultNetworkTierProjectHttpRequest, Operation>
      setDefaultNetworkTierProjectCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setDefaultNetworkTierProjectCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetUsageExportBucketProjectHttpRequest, EmptyMessage, EmptyMessage>
      setUsageExportBucketProjectOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setUsageExportBucketProjectOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation>
      setUsageExportBucketProjectCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setUsageExportBucketProjectCallable()");
  }

  @Override
  public abstract void close();
}
