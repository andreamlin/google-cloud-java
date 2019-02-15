package com.google.cloud.compute.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest;
import com.google.cloud.compute.v1.GetZoneOperationHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.stub.ZoneOperationStub;


/** Implementation of LongRunningClient for the Compute client.
 *  Package-private for internal use. */
class ZoneLongRunningClient extends ComputeLongRunningInterface<GetZoneOperationHttpRequest, DeleteZoneOperationHttpRequest> {

  private final ZoneOperationStub operationStub;

  private final ApiFunction<String, GetZoneOperationHttpRequest> createGetRequestFunc = new ApiFunction<String, GetZoneOperationHttpRequest>() {
    public GetZoneOperationHttpRequest apply(String operationSelfLink) {
      // Make sure operation is a formatted string.
      return GetZoneOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
    }
  };

  private final ApiFunction<String, DeleteZoneOperationHttpRequest> createDeleteRequestFunc = new ApiFunction<String, DeleteZoneOperationHttpRequest>() {
    public DeleteZoneOperationHttpRequest apply(String operationSelfLink) {
      // Make sure operation is a formatted string.
      return DeleteZoneOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
    }
  };

  ZoneLongRunningClient(ZoneOperationStub operationStub) {
    this.operationStub = operationStub;
  }

  UnaryCallable<GetZoneOperationHttpRequest, Operation> getGetOperationCallable() {
    return operationStub.getZoneOperationCallable();
  }

  UnaryCallable<DeleteZoneOperationHttpRequest, EmptyMessage> getDeleteOperationCallable() {
    return operationStub.deleteZoneOperationCallable();
  }

  /* Function that takes an Operation name as a String and creates a Get request object from it. */
  ApiFunction<String, GetZoneOperationHttpRequest> createGetRequest() {
    return createGetRequestFunc;
  }

  /* Function that takes an Operation name as a String and creates a Delete request object from it. */
  ApiFunction<String, DeleteZoneOperationHttpRequest> createDeleteRequest() {
    return createDeleteRequestFunc;
  }


}
