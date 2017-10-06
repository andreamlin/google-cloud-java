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
import com.google.compute.v1.CacheInvalidationRule;
import com.google.compute.v1.DeleteUrlMapHttpRequest;
import com.google.compute.v1.GetUrlMapHttpRequest;
import com.google.compute.v1.InsertUrlMapHttpRequest;
import com.google.compute.v1.InvalidateCacheUrlMapHttpRequest;
import com.google.compute.v1.ListUrlMapsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListUrlMapsPagedResponse;
import com.google.compute.v1.PatchUrlMapHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateUrlMapHttpRequest;
import com.google.compute.v1.UrlMap;
import com.google.compute.v1.UrlMapList;
import com.google.compute.v1.UrlMapName;
import com.google.compute.v1.UrlMapsValidateRequest;
import com.google.compute.v1.UrlMapsValidateResponse;
import com.google.compute.v1.ValidateUrlMapHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class UrlMapStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteUrlMapHttpRequest, Operation> deleteUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteUrlMapCallable()");
  }

  @BetaApi
  public UnaryCallable<GetUrlMapHttpRequest, UrlMap> getUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: getUrlMapCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertUrlMapHttpRequest, Operation> insertUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: insertUrlMapCallable()");
  }

  @BetaApi
  public UnaryCallable<InvalidateCacheUrlMapHttpRequest, Operation> invalidateCacheUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: invalidateCacheUrlMapCallable()");
  }

  @BetaApi
  public UnaryCallable<ListUrlMapsHttpRequest, ListUrlMapsPagedResponse> listUrlMapsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listUrlMapsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListUrlMapsHttpRequest, UrlMapList> listUrlMapsCallable() {
    throw new UnsupportedOperationException("Not implemented: listUrlMapsCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchUrlMapHttpRequest, Operation> patchUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: patchUrlMapCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateUrlMapHttpRequest, Operation> updateUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: updateUrlMapCallable()");
  }

  @BetaApi
  public UnaryCallable<ValidateUrlMapHttpRequest, UrlMapsValidateResponse> validateUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: validateUrlMapCallable()");
  }

}