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
import com.google.compute.v1.DeleteNetworkHttpRequest;
import com.google.compute.v1.GetNetworkHttpRequest;
import com.google.compute.v1.InsertNetworkHttpRequest;
import com.google.compute.v1.ListNetworksHttpRequest;
import com.google.compute.v1.Network;
import static com.google.compute.v1.NetworkClient.ListNetworksPagedResponse;
import com.google.compute.v1.NetworkList;
import com.google.compute.v1.NetworkName;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SwitchToCustomModeNetworkHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class NetworkStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteNetworkHttpRequest, Operation> deleteNetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteNetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<GetNetworkHttpRequest, Network> getNetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: getNetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertNetworkHttpRequest, Operation> insertNetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: insertNetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<ListNetworksHttpRequest, ListNetworksPagedResponse> listNetworksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listNetworksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListNetworksHttpRequest, NetworkList> listNetworksCallable() {
    throw new UnsupportedOperationException("Not implemented: listNetworksCallable()");
  }

  @BetaApi
  public UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation> switchToCustomModeNetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: switchToCustomModeNetworkCallable()");
  }

}