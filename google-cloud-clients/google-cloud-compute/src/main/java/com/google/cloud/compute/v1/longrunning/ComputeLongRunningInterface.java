package com.google.cloud.compute.v1.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.LongRunningClient;
import com.google.api.gax.rpc.TranslatingUnaryCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.Operation;

/** Implementation of LongRunningClient for the Compute client. Package-private for internal use.
 *  Used by gax-java to get callables. */
abstract class ComputeLongRunningInterface<GetRequestT, DeleteRequestT>
    implements LongRunningClient {

  abstract UnaryCallable<GetRequestT, Operation> getGetOperationCallable();

  abstract UnaryCallable<DeleteRequestT, EmptyMessage> getDeleteOperationCallable();

  /* Function that takes an Operation name as a String and creates a Get request object from it. */
  abstract ApiFunction<String, GetRequestT> createGetRequest();

  /* Function that takes an Operation name as a String and creates a Delete request object from it. */
  abstract ApiFunction<String, DeleteRequestT> createDeleteRequest();

  @Override
  public UnaryCallable<String, OperationSnapshot> getOperationCallable() {
    return TranslatingUnaryCallable.create(
        getGetOperationCallable(),
        createGetRequest(),
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
        createDeleteRequest(),
        new ApiFunction<EmptyMessage, Void>() {
          @Override
          public Void apply(EmptyMessage empty) {
            return null;
          }
        });
  }
}
