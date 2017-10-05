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
import com.google.compute.v1.AggregatedListDiskTypesHttpRequest;
import com.google.compute.v1.DiskType;
import com.google.compute.v1.DiskTypeAggregatedList;
import com.google.compute.v1.DiskTypeList;
import com.google.compute.v1.DiskTypeName;
import com.google.compute.v1.GetDiskTypeHttpRequest;
import com.google.compute.v1.ListDiskTypesHttpRequest;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDiskTypesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDiskTypesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.ZoneName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class DiskTypeAdminStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListDiskTypesHttpRequest, AggregatedListDiskTypesPagedResponse> aggregatedListDiskTypesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListDiskTypesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListDiskTypesCallable()");
  }

  @BetaApi
  public UnaryCallable<GetDiskTypeHttpRequest, DiskType> getDiskTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: getDiskTypeCallable()");
  }

  @BetaApi
  public UnaryCallable<ListDiskTypesHttpRequest, ListDiskTypesPagedResponse> listDiskTypesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDiskTypesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: listDiskTypesCallable()");
  }

}