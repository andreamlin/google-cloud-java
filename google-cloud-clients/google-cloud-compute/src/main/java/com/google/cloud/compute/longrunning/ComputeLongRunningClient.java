package com.google.cloud.compute.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.LongRunningClient;
import com.google.api.gax.rpc.TranslatingUnaryCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest;
import com.google.cloud.compute.v1.GetGlobalOperationHttpRequest;
import com.google.cloud.compute.v1.GlobalOperationClient;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.stub.GlobalOperationStub;

/** Implementation of LongRunningClient for the Compute client. */
public class ComputeLongRunningClient implements LongRunningClient {

  private final GlobalOperationStub operationStub;

  public ComputeLongRunningClient(GlobalOperationClient globalOperationClient) {
    this.operationStub = globalOperationClient.getStub();
  }

  public ComputeLongRunningClient(GlobalOperationStub operationStub) {
    this.operationStub = operationStub;
  }

  @Override
  public UnaryCallable<String, OperationSnapshot> getOperationCallable() {
    return TranslatingUnaryCallable.create(
        operationStub.getGlobalOperationCallable(),
        new ApiFunction<String, GetGlobalOperationHttpRequest>() {
          @Override
          public GetGlobalOperationHttpRequest apply(String request) {
            return GetGlobalOperationHttpRequest.newBuilder().setOperation(request).build();
          }
        },
        new ApiFunction<Operation, OperationSnapshot>() {
          @Override
          public OperationSnapshot apply(Operation operation) {
            return ComputeOperationSnapshot.create(operation);
          }
        });
  }

  @Override
  public UnaryCallable<String, Void> cancelOperationCallable() {
    throw new UnsupportedOperationException("Cancelling operations is not supported by this API.");
  }

  @Override
  public UnaryCallable<String, Void> deleteOperationCallable() {
    return TranslatingUnaryCallable.create(
        operationStub.deleteGlobalOperationCallable(),
        new ApiFunction<String, DeleteGlobalOperationHttpRequest>() {
          @Override
          public DeleteGlobalOperationHttpRequest apply(String request) {
            return DeleteGlobalOperationHttpRequest.newBuilder().setOperation(request).build();
          }
        },
        new ApiFunction<EmptyMessage, Void>() {
          @Override
          public Void apply(EmptyMessage empty) {
            return null;
          }
        });
  }

  public static ComputeLongRunningClient create(GlobalOperationStub operationsStub) {
    return new ComputeLongRunningClient(operationsStub);
  }
}
