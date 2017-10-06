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
import com.google.compute.v1.DeleteInstanceTemplateHttpRequest;
import com.google.compute.v1.GetInstanceTemplateHttpRequest;
import com.google.compute.v1.InsertInstanceTemplateHttpRequest;
import com.google.compute.v1.InstanceTemplate;
import com.google.compute.v1.InstanceTemplateList;
import com.google.compute.v1.InstanceTemplateName;
import com.google.compute.v1.ListInstanceTemplatesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceTemplatesPagedResponse;
import com.google.compute.v1.ProjectName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class InstanceTemplateStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceTemplateCallable()");
  }

  @BetaApi
  public UnaryCallable<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceTemplateCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: insertInstanceTemplateCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstanceTemplatesHttpRequest, ListInstanceTemplatesPagedResponse> listInstanceTemplatesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstanceTemplatesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstanceTemplatesHttpRequest, InstanceTemplateList> listInstanceTemplatesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstanceTemplatesCallable()");
  }

}