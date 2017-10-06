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
import com.google.compute.v1.GetRegionHttpRequest;
import com.google.compute.v1.ListRegionsHttpRequest;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionsPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.Region;
import com.google.compute.v1.RegionList;
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
public abstract class RegionStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<GetRegionHttpRequest, Region> getRegionCallable() {
    throw new UnsupportedOperationException("Not implemented: getRegionCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRegionsHttpRequest, ListRegionsPagedResponse> listRegionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRegionsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListRegionsHttpRequest, RegionList> listRegionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listRegionsCallable()");
  }

}