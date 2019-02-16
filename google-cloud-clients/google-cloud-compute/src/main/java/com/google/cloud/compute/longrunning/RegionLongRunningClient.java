package com.google.cloud.compute.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest;
import com.google.cloud.compute.v1.GetRegionOperationHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.stub.RegionOperationStub;

/** Implementation of LongRunningClient for the Compute client. Package-private for internal use. */
class RegionLongRunningClient
    extends ComputeLongRunningInterface<
        GetRegionOperationHttpRequest, DeleteRegionOperationHttpRequest> {

  private final RegionOperationStub operationStub;

  private final ApiFunction<String, GetRegionOperationHttpRequest> createGetRequestFunc =
      new ApiFunction<String, GetRegionOperationHttpRequest>() {
        public GetRegionOperationHttpRequest apply(String operationSelfLink) {
          // Make sure operation is a formatted string.
          return GetRegionOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
        }
      };

  private final ApiFunction<String, DeleteRegionOperationHttpRequest> createDeleteRequestFunc =
      new ApiFunction<String, DeleteRegionOperationHttpRequest>() {
        public DeleteRegionOperationHttpRequest apply(String operationSelfLink) {
          // Make sure operation is a formatted string.
          return DeleteRegionOperationHttpRequest.newBuilder()
              .setOperation(operationSelfLink)
              .build();
        }
      };

  RegionLongRunningClient(RegionOperationStub operationStub) {
    this.operationStub = operationStub;
  }

  UnaryCallable<GetRegionOperationHttpRequest, Operation> getGetOperationCallable() {
    return operationStub.getRegionOperationCallable();
  }

  UnaryCallable<DeleteRegionOperationHttpRequest, EmptyMessage> getDeleteOperationCallable() {
    return operationStub.deleteRegionOperationCallable();
  }

  /* Function that takes an Operation name as a String and creates a Get request object from it. */
  ApiFunction<String, GetRegionOperationHttpRequest> createGetRequest() {
    return createGetRequestFunc;
  }

  /* Function that takes an Operation name as a String and creates a Delete request object from it. */
  ApiFunction<String, DeleteRegionOperationHttpRequest> createDeleteRequest() {
    return createDeleteRequestFunc;
  }
}
