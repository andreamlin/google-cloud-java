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

import static com.google.cloud.compute.v1.TargetSslProxyClient.ListTargetSslProxiesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.TargetSslProxy;
import com.google.cloud.compute.v1.TargetSslProxyList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class TargetSslProxyStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetSslProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTargetSslProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: getTargetSslProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetSslProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertTargetSslProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: insertTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse>
      listTargetSslProxiesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetSslProxiesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList>
      listTargetSslProxiesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetSslProxiesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetBackendServiceTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setBackendServiceTargetSslProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setBackendServiceTargetSslProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation>
      setBackendServiceTargetSslProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setBackendServiceTargetSslProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetProxyHeaderTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setProxyHeaderTargetSslProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setProxyHeaderTargetSslProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation>
      setProxyHeaderTargetSslProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setProxyHeaderTargetSslProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetSslCertificatesTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslCertificatesTargetSslProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslCertificatesTargetSslProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation>
      setSslCertificatesTargetSslProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslCertificatesTargetSslProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetSslPolicyTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslPolicyTargetSslProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslPolicyTargetSslProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSslPolicyTargetSslProxyHttpRequest, Operation>
      setSslPolicyTargetSslProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslPolicyTargetSslProxyCallable()");
  }

  @Override
  public abstract void close();
}
