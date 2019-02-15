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

import static com.google.cloud.compute.v1.BackendBucketClient.ListBackendBucketsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest;
import com.google.cloud.compute.v1.BackendBucket;
import com.google.cloud.compute.v1.BackendBucketList;
import com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest;
import com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest;
import com.google.cloud.compute.v1.GetBackendBucketHttpRequest;
import com.google.cloud.compute.v1.InsertBackendBucketHttpRequest;
import com.google.cloud.compute.v1.ListBackendBucketsHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchBackendBucketHttpRequest;
import com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class BackendBucketStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AddSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      addSignedUrlKeyBackendBucketOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: addSignedUrlKeyBackendBucketOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<AddSignedUrlKeyBackendBucketHttpRequest, Operation>
      addSignedUrlKeyBackendBucketCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: addSignedUrlKeyBackendBucketCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      deleteBackendBucketOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteBackendBucketOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteBackendBucketHttpRequest, Operation> deleteBackendBucketCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBackendBucketCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      deleteSignedUrlKeyBackendBucketOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteSignedUrlKeyBackendBucketOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteSignedUrlKeyBackendBucketHttpRequest, Operation>
      deleteSignedUrlKeyBackendBucketCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteSignedUrlKeyBackendBucketCallable()");
  }

  @BetaApi
  public UnaryCallable<GetBackendBucketHttpRequest, BackendBucket> getBackendBucketCallable() {
    throw new UnsupportedOperationException("Not implemented: getBackendBucketCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      insertBackendBucketOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertBackendBucketOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertBackendBucketHttpRequest, Operation> insertBackendBucketCallable() {
    throw new UnsupportedOperationException("Not implemented: insertBackendBucketCallable()");
  }

  @BetaApi
  public UnaryCallable<ListBackendBucketsHttpRequest, ListBackendBucketsPagedResponse>
      listBackendBucketsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackendBucketsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListBackendBucketsHttpRequest, BackendBucketList>
      listBackendBucketsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackendBucketsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      patchBackendBucketOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchBackendBucketOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchBackendBucketHttpRequest, Operation> patchBackendBucketCallable() {
    throw new UnsupportedOperationException("Not implemented: patchBackendBucketCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<UpdateBackendBucketHttpRequest, EmptyMessage, EmptyMessage>
      updateBackendBucketOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateBackendBucketOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateBackendBucketHttpRequest, Operation> updateBackendBucketCallable() {
    throw new UnsupportedOperationException("Not implemented: updateBackendBucketCallable()");
  }

  @Override
  public abstract void close();
}
