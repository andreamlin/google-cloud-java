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
package com.google.cloud.simplecompute.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.simplecompute.v1.Address;
import com.google.cloud.simplecompute.v1.AddressAggregatedList;
import static com.google.cloud.simplecompute.v1.AddressClient.AggregatedListAddressesPagedResponse;
import static com.google.cloud.simplecompute.v1.AddressClient.ListAddressesPagedResponse;
import com.google.cloud.simplecompute.v1.AddressList;
import com.google.cloud.simplecompute.v1.AddressName;
import com.google.cloud.simplecompute.v1.AggregatedListAddressesHttpRequest;
import com.google.cloud.simplecompute.v1.DeleteAddressHttpRequest;
import com.google.cloud.simplecompute.v1.GetAddressHttpRequest;
import com.google.cloud.simplecompute.v1.InsertAddressHttpRequest;
import com.google.cloud.simplecompute.v1.ListAddressesHttpRequest;
import com.google.cloud.simplecompute.v1.Operation;
import com.google.cloud.simplecompute.v1.PatchAddressHttpRequest;
import com.google.cloud.simplecompute.v1.ProjectAddressName;
import com.google.cloud.simplecompute.v1.ProjectName;
import com.google.cloud.simplecompute.v1.RegionName;
import com.google.cloud.simplecompute.v1.UpdateAddressHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for simplecompute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi
  public UnaryCallable<PatchAddressHttpRequest, Operation> patchAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: patchAddressCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateAddressHttpRequest, Operation> updateAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: updateAddressCallable()");
  }

}