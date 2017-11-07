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
import com.google.compute.v1.AggregatedListSubnetworksHttpRequest;
import com.google.compute.v1.DeleteSubnetworkHttpRequest;
import com.google.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest;
import com.google.compute.v1.GetSubnetworkHttpRequest;
import com.google.compute.v1.InsertSubnetworkHttpRequest;
import com.google.compute.v1.ListSubnetworksHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListSubnetworksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListSubnetworksPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.Subnetwork;
import com.google.compute.v1.SubnetworkAggregatedList;
import com.google.compute.v1.SubnetworkList;
import com.google.compute.v1.SubnetworkName;
import com.google.compute.v1.SubnetworksExpandIpCidrRangeRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class SubnetworkStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListSubnetworksHttpRequest, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListSubnetworksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListSubnetworksCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: expandIpCidrRangeSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: getSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertSubnetworkHttpRequest, Operation> insertSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: insertSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSubnetworksHttpRequest, ListSubnetworksPagedResponse> listSubnetworksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSubnetworksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksCallable() {
    throw new UnsupportedOperationException("Not implemented: listSubnetworksCallable()");
  }

}