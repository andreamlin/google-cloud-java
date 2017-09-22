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
import com.google.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest;
import com.google.compute.v1.DeleteTargetVpnGatewayHttpRequest;
import com.google.compute.v1.GetTargetVpnGatewayHttpRequest;
import com.google.compute.v1.InsertTargetVpnGatewayHttpRequest;
import com.google.compute.v1.ListTargetVpnGatewaysHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetVpnGatewaysPagedResponse;
import com.google.compute.v1.TargetVpnGateway;
import com.google.compute.v1.TargetVpnGatewayAggregatedList;
import com.google.compute.v1.TargetVpnGatewayList;
import com.google.compute.v1.TargetVpnGatewayName;
import com.google.compute.v1.TargetVpnGatewaysProjectName;
import com.google.compute.v1.TargetVpnGatewaysRegionName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class TargetVpnGatewayAdminStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListTargetVpnGatewaysPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListTargetVpnGatewaysCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTargetVpnGatewayCallable()");
  }

  @BetaApi
  public UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayCallable() {
    throw new UnsupportedOperationException("Not implemented: getTargetVpnGatewayCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayCallable() {
    throw new UnsupportedOperationException("Not implemented: insertTargetVpnGatewayCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetVpnGatewaysHttpRequest, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetVpnGatewaysPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetVpnGatewaysCallable()");
  }

}