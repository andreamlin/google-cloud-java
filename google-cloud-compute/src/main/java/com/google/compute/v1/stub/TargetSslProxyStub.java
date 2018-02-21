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
import com.google.compute.v1.DeleteTargetSslProxyHttpRequest;
import com.google.compute.v1.GetTargetSslProxyHttpRequest;
import com.google.compute.v1.InsertTargetSslProxyHttpRequest;
import com.google.compute.v1.ListTargetSslProxiesHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetBackendServiceTargetSslProxyHttpRequest;
import com.google.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest;
import com.google.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest;
import com.google.compute.v1.TargetSslProxiesSetBackendServiceRequest;
import com.google.compute.v1.TargetSslProxiesSetProxyHeaderRequest;
import com.google.compute.v1.TargetSslProxiesSetSslCertificatesRequest;
import com.google.compute.v1.TargetSslProxy;
import static com.google.compute.v1.TargetSslProxyClient.ListTargetSslProxiesPagedResponse;
import com.google.compute.v1.TargetSslProxyList;
import com.google.compute.v1.TargetSslProxyName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class TargetSslProxyStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: getTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: insertTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse> listTargetSslProxiesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetSslProxiesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetSslProxiesCallable()");
  }

  @BetaApi
  public UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setBackendServiceTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setProxyHeaderTargetSslProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setSslCertificatesTargetSslProxyCallable()");
  }

}