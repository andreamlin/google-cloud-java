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

import static com.google.cloud.compute.v1.TargetHttpProxyClient.ListTargetHttpProxiesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest;
import com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest;
import com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest;
import com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest;
import com.google.cloud.compute.v1.TargetHttpProxy;
import com.google.cloud.compute.v1.TargetHttpProxyList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class TargetHttpProxyStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteTargetHttpProxyHttpRequest, EmptyMessage, Operation>
      deleteTargetHttpProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTargetHttpProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteTargetHttpProxyHttpRequest, Operation>
      deleteTargetHttpProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTargetHttpProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetTargetHttpProxyHttpRequest, TargetHttpProxy>
      getTargetHttpProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: getTargetHttpProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertTargetHttpProxyHttpRequest, EmptyMessage, Operation>
      insertTargetHttpProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertTargetHttpProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertTargetHttpProxyHttpRequest, Operation>
      insertTargetHttpProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: insertTargetHttpProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpProxiesHttpRequest, ListTargetHttpProxiesPagedResponse>
      listTargetHttpProxiesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTargetHttpProxiesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList>
      listTargetHttpProxiesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetHttpProxiesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetUrlMapTargetHttpProxyHttpRequest, EmptyMessage, Operation>
      setUrlMapTargetHttpProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setUrlMapTargetHttpProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetUrlMapTargetHttpProxyHttpRequest, Operation>
      setUrlMapTargetHttpProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setUrlMapTargetHttpProxyCallable()");
  }

  @Override
  public abstract void close();
}
