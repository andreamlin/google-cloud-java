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
import com.google.compute.v1.DeleteRouteHttpRequest;
import com.google.compute.v1.GetRouteHttpRequest;
import com.google.compute.v1.InsertRouteHttpRequest;
import com.google.compute.v1.ListRoutesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.Route;
import com.google.compute.v1.RouteList;
import com.google.compute.v1.RouteName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class RouteStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteRouteHttpRequest, Operation> deleteRouteCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRouteCallable()");
  }

  @BetaApi
  public UnaryCallable<GetRouteHttpRequest, Route> getRouteCallable() {
    throw new UnsupportedOperationException("Not implemented: getRouteCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertRouteHttpRequest, Operation> insertRouteCallable() {
    throw new UnsupportedOperationException("Not implemented: insertRouteCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRoutesHttpRequest, ListRoutesPagedResponse> listRoutesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRoutesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRoutesHttpRequest, RouteList> listRoutesCallable() {
    throw new UnsupportedOperationException("Not implemented: listRoutesCallable()");
  }

}