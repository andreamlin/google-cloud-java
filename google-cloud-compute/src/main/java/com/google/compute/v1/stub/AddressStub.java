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
import com.google.compute.v1.Address;
import com.google.compute.v1.AddressAggregatedList;
import com.google.compute.v1.AddressList;
import com.google.compute.v1.AddressName;
import com.google.compute.v1.AggregatedListAddressesHttpRequest;
import com.google.compute.v1.DeleteAddressHttpRequest;
import com.google.compute.v1.GetAddressHttpRequest;
import com.google.compute.v1.InsertAddressHttpRequest;
import com.google.compute.v1.ListAddressesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAddressesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAddressesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class AddressStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListAddressesHttpRequest, AggregatedListAddressesPagedResponse> aggregatedListAddressesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListAddressesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListAddressesHttpRequest, AddressAggregatedList> aggregatedListAddressesCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListAddressesCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteAddressHttpRequest, Operation> deleteAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAddressCallable()");
  }

  @BetaApi
  public UnaryCallable<GetAddressHttpRequest, Address> getAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: getAddressCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertAddressHttpRequest, Operation> insertAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: insertAddressCallable()");
  }

  @BetaApi
  public UnaryCallable<ListAddressesHttpRequest, ListAddressesPagedResponse> listAddressesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAddressesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListAddressesHttpRequest, AddressList> listAddressesCallable() {
    throw new UnsupportedOperationException("Not implemented: listAddressesCallable()");
  }

}