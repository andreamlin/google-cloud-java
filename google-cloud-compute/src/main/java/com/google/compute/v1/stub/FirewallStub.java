/*
 * Copyright 2017 Google LLC
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
import com.google.compute.v1.DeleteFirewallHttpRequest;
import com.google.compute.v1.Firewall;
import com.google.compute.v1.FirewallList;
import com.google.compute.v1.FirewallName;
import com.google.compute.v1.GetFirewallHttpRequest;
import com.google.compute.v1.InsertFirewallHttpRequest;
import com.google.compute.v1.ListFirewallsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListFirewallsPagedResponse;
import com.google.compute.v1.PatchFirewallHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateFirewallHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class FirewallStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteFirewallHttpRequest, Operation> deleteFirewallCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteFirewallCallable()");
  }

  @BetaApi
  public UnaryCallable<GetFirewallHttpRequest, Firewall> getFirewallCallable() {
    throw new UnsupportedOperationException("Not implemented: getFirewallCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertFirewallHttpRequest, Operation> insertFirewallCallable() {
    throw new UnsupportedOperationException("Not implemented: insertFirewallCallable()");
  }

  @BetaApi
  public UnaryCallable<ListFirewallsHttpRequest, ListFirewallsPagedResponse> listFirewallsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listFirewallsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListFirewallsHttpRequest, FirewallList> listFirewallsCallable() {
    throw new UnsupportedOperationException("Not implemented: listFirewallsCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchFirewallHttpRequest, Operation> patchFirewallCallable() {
    throw new UnsupportedOperationException("Not implemented: patchFirewallCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateFirewallHttpRequest, Operation> updateFirewallCallable() {
    throw new UnsupportedOperationException("Not implemented: updateFirewallCallable()");
  }

}