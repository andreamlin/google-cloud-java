/*
 * Copyright 2017, Google LLC All rights reserved.
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
import com.google.compute.v1.AggregatedListAutoscalersHttpRequest;
import com.google.compute.v1.Autoscaler;
import com.google.compute.v1.AutoscalerAggregatedList;
import com.google.compute.v1.AutoscalerList;
import com.google.compute.v1.AutoscalerName;
import com.google.compute.v1.DeleteAutoscalerHttpRequest;
import com.google.compute.v1.GetAutoscalerHttpRequest;
import com.google.compute.v1.InsertAutoscalerHttpRequest;
import com.google.compute.v1.ListAutoscalersHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAutoscalersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAutoscalersPagedResponse;
import com.google.compute.v1.PatchAutoscalerHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateAutoscalerHttpRequest;
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
public abstract class AutoscalerStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListAutoscalersHttpRequest, AggregatedListAutoscalersPagedResponse> aggregatedListAutoscalersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListAutoscalersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList> aggregatedListAutoscalersCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListAutoscalersCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteAutoscalerHttpRequest, Operation> deleteAutoscalerCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAutoscalerCallable()");
  }

  @BetaApi
  public UnaryCallable<GetAutoscalerHttpRequest, Autoscaler> getAutoscalerCallable() {
    throw new UnsupportedOperationException("Not implemented: getAutoscalerCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertAutoscalerHttpRequest, Operation> insertAutoscalerCallable() {
    throw new UnsupportedOperationException("Not implemented: insertAutoscalerCallable()");
  }

  @BetaApi
  public UnaryCallable<ListAutoscalersHttpRequest, ListAutoscalersPagedResponse> listAutoscalersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAutoscalersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListAutoscalersHttpRequest, AutoscalerList> listAutoscalersCallable() {
    throw new UnsupportedOperationException("Not implemented: listAutoscalersCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchAutoscalerHttpRequest, Operation> patchAutoscalerCallable() {
    throw new UnsupportedOperationException("Not implemented: patchAutoscalerCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateAutoscalerHttpRequest, Operation> updateAutoscalerCallable() {
    throw new UnsupportedOperationException("Not implemented: updateAutoscalerCallable()");
  }

}