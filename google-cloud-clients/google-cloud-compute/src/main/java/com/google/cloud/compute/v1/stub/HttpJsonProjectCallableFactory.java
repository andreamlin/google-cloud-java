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

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.BatchingCallSettings;
import com.google.api.gax.rpc.Callables;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.LongRunningClient;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.longrunning.ComputeLongRunningClientFactory;
import com.google.cloud.compute.v1.longrunning.OperationSnapshotCallable;
import com.google.cloud.compute.v1.Operation;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP callable factory implementation for compute.
 *
 * <p>This class is for advanced usage.
 */
@Generated("by gapic-generator")
@BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
public class HttpJsonProjectCallableFactory
    implements HttpJsonStubCallableFactory<Operation, GlobalOperationStub> {
  @Override
  public <RequestT, ResponseT> UnaryCallable<RequestT, ResponseT> createUnaryCallable(
      HttpJsonCallSettings<RequestT, ResponseT> httpJsonCallSettings,
      UnaryCallSettings<RequestT, ResponseT> callSettings,
      ClientContext clientContext) {
    return HttpJsonCallableFactory.createUnaryCallable(
        httpJsonCallSettings, callSettings, clientContext);
  }

  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  @Override
  public <RequestT, ResponseT, MetadataT>
      OperationCallable<RequestT, ResponseT, MetadataT> createOperationCallable(
          HttpJsonCallSettings<RequestT, com.google.cloud.compute.v1.Operation>
              httpJsonCallSettings,
          OperationCallSettings<RequestT, ResponseT, MetadataT> operationCallSettings,
          ClientContext clientContext,
          GlobalOperationStub operationsStub) {
    UnaryCallable<RequestT, Operation> initialHttpCallable =
        HttpJsonCallableFactory.createBaseUnaryCallable(
            httpJsonCallSettings, operationCallSettings.getInitialCallSettings(), clientContext);
    UnaryCallable<RequestT, OperationSnapshot> initialCallable =
        new OperationSnapshotCallable<>(initialHttpCallable);
    LongRunningClient longRunningClient = ComputeLongRunningClientFactory.create(operationsStub);
    OperationCallable<RequestT, ResponseT, MetadataT> operationCallable =
        Callables.longRunningOperation(
            initialCallable, operationCallSettings, clientContext, longRunningClient);
    return HttpJsonCallableFactory.createOperationCallable(
        operationCallSettings, clientContext, longRunningClient, initialCallable);
  }

  @Override
  public <RequestT, ResponseT, PagedListResponseT>
      UnaryCallable<RequestT, PagedListResponseT> createPagedCallable(
          HttpJsonCallSettings<RequestT, ResponseT> httpJsonCallSettings,
          PagedCallSettings<RequestT, ResponseT, PagedListResponseT> pagedCallSettings,
          ClientContext clientContext) {
    return HttpJsonCallableFactory.createPagedCallable(
        httpJsonCallSettings, pagedCallSettings, clientContext);
  }

  @Override
  public <RequestT, ResponseT> UnaryCallable<RequestT, ResponseT> createBatchingCallable(
      HttpJsonCallSettings<RequestT, ResponseT> httpJsonCallSettings,
      BatchingCallSettings<RequestT, ResponseT> batchingCallSettings,
      ClientContext clientContext) {
    return HttpJsonCallableFactory.createBatchingCallable(
        httpJsonCallSettings, batchingCallSettings, clientContext);
  }
}
