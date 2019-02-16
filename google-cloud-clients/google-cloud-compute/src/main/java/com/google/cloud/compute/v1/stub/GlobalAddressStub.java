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

import static com.google.cloud.compute.v1.GlobalAddressClient.ListGlobalAddressesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressList;
import com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest;
import com.google.cloud.compute.v1.GetGlobalAddressHttpRequest;
import com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest;
import com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class GlobalAddressStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteGlobalAddressHttpRequest, EmptyMessage, Operation>
      deleteGlobalAddressOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteGlobalAddressOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteGlobalAddressHttpRequest, Operation> deleteGlobalAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGlobalAddressCallable()");
  }

  @BetaApi
  public UnaryCallable<GetGlobalAddressHttpRequest, Address> getGlobalAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: getGlobalAddressCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertGlobalAddressHttpRequest, EmptyMessage, Operation>
      insertGlobalAddressOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertGlobalAddressOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertGlobalAddressHttpRequest, Operation> insertGlobalAddressCallable() {
    throw new UnsupportedOperationException("Not implemented: insertGlobalAddressCallable()");
  }

  @BetaApi
  public UnaryCallable<ListGlobalAddressesHttpRequest, ListGlobalAddressesPagedResponse>
      listGlobalAddressesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlobalAddressesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListGlobalAddressesHttpRequest, AddressList> listGlobalAddressesCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlobalAddressesCallable()");
  }

  @Override
  public abstract void close();
}
