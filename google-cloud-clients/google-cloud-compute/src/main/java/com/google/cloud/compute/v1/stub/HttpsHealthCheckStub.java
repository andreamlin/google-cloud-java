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

import static com.google.cloud.compute.v1.HttpsHealthCheckClient.ListHttpsHealthChecksPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest;
import com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest;
import com.google.cloud.compute.v1.HttpsHealthCheck2;
import com.google.cloud.compute.v1.HttpsHealthCheckList;
import com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest;
import com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest;
import com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class HttpsHealthCheckStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteHttpsHealthCheckHttpRequest, EmptyMessage, EmptyMessage>
      deleteHttpsHealthCheckOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteHttpsHealthCheckOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteHttpsHealthCheckHttpRequest, Operation>
      deleteHttpsHealthCheckCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteHttpsHealthCheckCallable()");
  }

  @BetaApi
  public UnaryCallable<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck2>
      getHttpsHealthCheckCallable() {
    throw new UnsupportedOperationException("Not implemented: getHttpsHealthCheckCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertHttpsHealthCheckHttpRequest, EmptyMessage, EmptyMessage>
      insertHttpsHealthCheckOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertHttpsHealthCheckOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertHttpsHealthCheckHttpRequest, Operation>
      insertHttpsHealthCheckCallable() {
    throw new UnsupportedOperationException("Not implemented: insertHttpsHealthCheckCallable()");
  }

  @BetaApi
  public UnaryCallable<ListHttpsHealthChecksHttpRequest, ListHttpsHealthChecksPagedResponse>
      listHttpsHealthChecksPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listHttpsHealthChecksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList>
      listHttpsHealthChecksCallable() {
    throw new UnsupportedOperationException("Not implemented: listHttpsHealthChecksCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchHttpsHealthCheckHttpRequest, EmptyMessage, EmptyMessage>
      patchHttpsHealthCheckOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchHttpsHealthCheckOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchHttpsHealthCheckHttpRequest, Operation>
      patchHttpsHealthCheckCallable() {
    throw new UnsupportedOperationException("Not implemented: patchHttpsHealthCheckCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<UpdateHttpsHealthCheckHttpRequest, EmptyMessage, EmptyMessage>
      updateHttpsHealthCheckOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateHttpsHealthCheckOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateHttpsHealthCheckHttpRequest, Operation>
      updateHttpsHealthCheckCallable() {
    throw new UnsupportedOperationException("Not implemented: updateHttpsHealthCheckCallable()");
  }

  @Override
  public abstract void close();
}
