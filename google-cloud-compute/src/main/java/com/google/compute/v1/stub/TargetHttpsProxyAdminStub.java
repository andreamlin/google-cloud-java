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
import com.google.compute.v1.DeleteTargetHttpsProxyHttpRequest;
import com.google.compute.v1.GetTargetHttpsProxyHttpRequest;
import com.google.compute.v1.InsertTargetHttpsProxyHttpRequest;
import com.google.compute.v1.ListTargetHttpsProxiesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpsProxiesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest;
import com.google.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest;
import com.google.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest;
import com.google.compute.v1.TargetHttpsProxy;
import com.google.compute.v1.TargetHttpsProxyList;
import com.google.compute.v1.TargetHttpsProxyName;
import com.google.compute.v1.UrlMapReference;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class TargetHttpsProxyAdminStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation> deleteTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTargetHttpsProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy> getTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: getTargetHttpsProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation> insertTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: insertTargetHttpsProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse> listTargetHttpsProxiesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetHttpsProxiesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList> listTargetHttpsProxiesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTargetHttpsProxiesCallable()");
  }

  @BetaApi
  public UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation> setSslCertificatesTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setSslCertificatesTargetHttpsProxyCallable()");
  }

  @BetaApi
  public UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation> setUrlMapTargetHttpsProxyCallable() {
    throw new UnsupportedOperationException("Not implemented: setUrlMapTargetHttpsProxyCallable()");
  }

}