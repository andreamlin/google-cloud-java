package com.google.cloud.compute.longrunning;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.Callables;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.stub.GlobalOperationStub;

public class OperationCallableFactory {

  @BetaApi("The surface for long-running operations is not stable yet and may change in the future.")
  public static <RequestT, ResponseT, MetadataT> OperationCallable<RequestT, ResponseT, MetadataT> createOperationCallable(
      HttpJsonCallSettings<RequestT, Operation> httpJsonCallSettings,
      OperationCallSettings<RequestT, ResponseT, MetadataT> operationCallSettings,
      ClientContext clientContext,
      GlobalOperationStub operationsStub) {
    UnaryCallable<RequestT, Operation> initialGrpcCallable = HttpJsonCallableFactory.createBaseUnaryCallable(httpJsonCallSettings, operationCallSettings.getInitialCallSettings(), clientContext);
    UnaryCallable<RequestT, OperationSnapshot> initialCallable = new OperationSnapshotCallable<>(initialGrpcCallable);
    ComputeLongRunningClient longRunningClient = ComputeLongRunningClient.create(operationsStub);
    OperationCallable<RequestT, ResponseT, MetadataT> operationCallable = Callables
        .longRunningOperation(initialCallable, operationCallSettings, clientContext, longRunningClient);
    return operationCallable.withDefaultCallContext(clientContext.getDefaultCallContext());
  }
}
