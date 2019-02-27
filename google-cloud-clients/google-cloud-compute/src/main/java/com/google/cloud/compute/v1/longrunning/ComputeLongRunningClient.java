package com.google.cloud.compute.v1.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.LongRunningClient;
import com.google.api.gax.rpc.TranslatingUnaryCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.Operation;
import java.util.concurrent.TimeUnit;

/** Unites all Compute's different [Scope]OperationClients under a single shared implementation of the LongRunningClient.
 *  Package-private for internal use. Used by gax-java to get callables. */
class ComputeLongRunningClient<GetRequestT, DeleteRequestT>
    implements LongRunningClient, BackgroundResource {

  private final  UnaryCallable<GetRequestT, Operation> getOperationCallable;
  private final  UnaryCallable<DeleteRequestT, EmptyMessage> deleteOperationCallable;
  private final ApiFunction<String, GetRequestT> createGetRequestFunc;
  private final ApiFunction<String, DeleteRequestT> createDeleteRequestFunc;
  private final BackgroundResource stub;

  public ComputeLongRunningClient(
      BackgroundResource stub,
      UnaryCallable<DeleteRequestT, EmptyMessage> deleteOperationCallable,
      UnaryCallable<GetRequestT, Operation> getOperationCallable,
      ApiFunction<String, DeleteRequestT> createDeleteRequestFunc,
      ApiFunction<String, GetRequestT> createGetRequestFunc) {
    this.stub = stub;
    this.getOperationCallable = getOperationCallable;
    this.deleteOperationCallable = deleteOperationCallable;
    this.createGetRequestFunc = createGetRequestFunc;
    this.createDeleteRequestFunc = createDeleteRequestFunc;
  }

  private BackgroundResource getStub() { return stub; }

  @Override
  public UnaryCallable<String, OperationSnapshot> getOperationCallable() {
    return TranslatingUnaryCallable.create(
        getOperationCallable,
        createGetRequestFunc,
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
        deleteOperationCallable,
        createDeleteRequestFunc,
        new ApiFunction<EmptyMessage, Void>() {
          @Override
          public Void apply(EmptyMessage empty) {
            return null;
          }
        });
  }

  @Override
  public void shutdown() {
    getStub().shutdown();
  }

  @Override
  public boolean isShutdown() {
    return getStub().isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return getStub().isTerminated();
  }

  @Override
  public void shutdownNow() {
    getStub().shutdown();
  }

  @Override
  public boolean awaitTermination(long l, TimeUnit timeUnit) throws InterruptedException {
    return getStub().awaitTermination(l, timeUnit);
  }

  @Override
  public void close() throws Exception {
    getStub().close();
  }
}
