package com.google.cloud.compute.v1.longrunning;

import com.google.auto.value.AutoValue;
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
 *  Package-private for internal use. Used by gax-java to get callables.*/
@AutoValue
abstract class ComputeLongRunningClient<GetRequestT, DeleteRequestT>
    implements LongRunningClient, BackgroundResource {

  abstract BackgroundResource getStub();

  abstract UnaryCallable<GetRequestT, Operation> getGetOperationCallable();

  abstract UnaryCallable<DeleteRequestT, EmptyMessage> getDeleteOperationCallable();

  /* Function that takes an Operation name as a String and creates a Get request object from it. */
  abstract ApiFunction<String, GetRequestT> getCreateGetRequestFunc();

  /* Function that takes an Operation name as a String and creates a Delete request object from it. */
  abstract ApiFunction<String, DeleteRequestT> getCreateDeleteRequestFunc();

  @Override
  public UnaryCallable<String, OperationSnapshot> getOperationCallable() {
    return TranslatingUnaryCallable.create(
        getGetOperationCallable(),
        getCreateGetRequestFunc(),
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
        getDeleteOperationCallable(),
        getCreateDeleteRequestFunc(),
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

  static <GetRequestT, DeleteRequestT> ComputeLongRunningClient.Builder<GetRequestT, DeleteRequestT> newBuilder() {
    return new com.google.cloud.compute.v1.longrunning.AutoValue_ComputeLongRunningClient.Builder<>();
  }

  @AutoValue.Builder
  public abstract static class Builder<GetRequestT, DeleteRequestT> {
    abstract Builder<GetRequestT, DeleteRequestT> setDeleteOperationCallable(UnaryCallable<DeleteRequestT, EmptyMessage> deleteOperationCallable);

    abstract Builder<GetRequestT, DeleteRequestT> setGetOperationCallable(
        UnaryCallable<GetRequestT, Operation> requestFormatter);

    abstract Builder<GetRequestT, DeleteRequestT> setStub(
        BackgroundResource backgroundResource);

    abstract Builder<GetRequestT, DeleteRequestT> setCreateGetRequestFunc(ApiFunction<String, GetRequestT> httpMethod);

    abstract Builder<GetRequestT, DeleteRequestT> setCreateDeleteRequestFunc(ApiFunction<String, DeleteRequestT> httpMethod);

    abstract ComputeLongRunningClient<GetRequestT, DeleteRequestT> build();
  }
}
