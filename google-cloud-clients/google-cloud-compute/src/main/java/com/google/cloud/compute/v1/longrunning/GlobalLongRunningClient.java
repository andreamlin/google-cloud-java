package com.google.cloud.compute.v1.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest;
import com.google.cloud.compute.v1.GetGlobalOperationHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.stub.GlobalOperationStub;

/** Implementation of LongRunningClient for the Compute client. Package-private for internal use. */
class GlobalLongRunningClient
    extends ComputeLongRunningInterface<
    GetGlobalOperationHttpRequest, DeleteGlobalOperationHttpRequest> {

  private final GlobalOperationStub operationStub;

  private final ApiFunction<String, GetGlobalOperationHttpRequest> createGetRequestFunc =
      new ApiFunction<String, GetGlobalOperationHttpRequest>() {
        public GetGlobalOperationHttpRequest apply(String operationSelfLink) {
          // Make sure operation is a formatted string.
          return GetGlobalOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
        }
      };

  private final ApiFunction<String, DeleteGlobalOperationHttpRequest> createDeleteRequestFunc =
      new ApiFunction<String, DeleteGlobalOperationHttpRequest>() {
        public DeleteGlobalOperationHttpRequest apply(String operationSelfLink) {
          // Make sure operation is a formatted string.
          return DeleteGlobalOperationHttpRequest.newBuilder()
              .setOperation(operationSelfLink)
              .build();
        }
      };

  GlobalLongRunningClient(GlobalOperationStub operationStub) {
    this.operationStub = operationStub;
  }

  UnaryCallable<GetGlobalOperationHttpRequest, Operation> getGetOperationCallable() {
    return operationStub.getGlobalOperationCallable();
  }

  UnaryCallable<DeleteGlobalOperationHttpRequest, EmptyMessage> getDeleteOperationCallable() {
    return operationStub.deleteGlobalOperationCallable();
  }

  /* Function that takes an Operation name as a String and creates a Get request object from it. */
  ApiFunction<String, GetGlobalOperationHttpRequest> createGetRequest() {
    return createGetRequestFunc;
  }

  /* Function that takes an Operation name as a String and creates a Delete request object from it. */
  ApiFunction<String, DeleteGlobalOperationHttpRequest> createDeleteRequest() {
    return createDeleteRequestFunc;
  }
}
