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

import static com.google.cloud.compute.v1.TargetHttpsProxyClient.ListTargetHttpsProxiesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest;
import com.google.cloud.compute.v1.TargetHttpsProxy;
import com.google.cloud.compute.v1.TargetHttpsProxyList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class TargetHttpsProxyStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      deleteTargetHttpsProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTargetHttpsProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation>
      deleteTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTargetHttpsProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy>
      getTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: getTargetHttpsProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      insertTargetHttpsProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertTargetHttpsProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation>
      insertTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: insertTargetHttpsProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse>
      listTargetHttpsProxiesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTargetHttpsProxiesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList>
      listTargetHttpsProxiesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetHttpsProxiesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetQuicOverrideTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setQuicOverrideTargetHttpsProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setQuicOverrideTargetHttpsProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetQuicOverrideTargetHttpsProxyHttpRequest, Operation>
      setQuicOverrideTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setQuicOverrideTargetHttpsProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setSslCertificatesTargetHttpsProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslCertificatesTargetHttpsProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation>
      setSslCertificatesTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslCertificatesTargetHttpsProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetSslPolicyTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setSslPolicyTargetHttpsProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslPolicyTargetHttpsProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSslPolicyTargetHttpsProxyHttpRequest, Operation>
      setSslPolicyTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setSslPolicyTargetHttpsProxyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetUrlMapTargetHttpsProxyHttpRequest, EmptyMessage, Operation>
      setUrlMapTargetHttpsProxyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setUrlMapTargetHttpsProxyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation>
      setUrlMapTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setUrlMapTargetHttpsProxyCallable()");
  }

  @Override
  public abstract void close();
}
