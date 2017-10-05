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
import com.google.compute.v1.DeleteImageHttpRequest;
import com.google.compute.v1.DeprecateImageHttpRequest;
import com.google.compute.v1.DeprecationStatus;
import com.google.compute.v1.FamilyName;
import com.google.compute.v1.GetFromFamilyImageHttpRequest;
import com.google.compute.v1.GetImageHttpRequest;
import com.google.compute.v1.Image;
import com.google.compute.v1.ImageList;
import com.google.compute.v1.ImageName;
import com.google.compute.v1.InsertImageHttpRequest;
import com.google.compute.v1.ListImagesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListImagesPagedResponse;
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
public abstract class ImageAdminStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<DeleteImageHttpRequest, Operation> deleteImageCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteImageCallable()");
  }

  @BetaApi
  public UnaryCallable<DeprecateImageHttpRequest, Operation> deprecateImageCallable() {
    throw new UnsupportedOperationException("Not implemented: deprecateImageCallable()");
  }

  @BetaApi
  public UnaryCallable<GetImageHttpRequest, Image> getImageCallable() {
    throw new UnsupportedOperationException("Not implemented: getImageCallable()");
  }

  @BetaApi
  public UnaryCallable<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageCallable() {
    throw new UnsupportedOperationException("Not implemented: getFromFamilyImageCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertImageHttpRequest, Operation> insertImageCallable() {
    throw new UnsupportedOperationException("Not implemented: insertImageCallable()");
  }

  @BetaApi
  public UnaryCallable<ListImagesHttpRequest, ListImagesPagedResponse> listImagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listImagesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListImagesHttpRequest, ImageList> listImagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listImagesCallable()");
  }

}