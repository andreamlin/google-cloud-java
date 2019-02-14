package com.google.cloud.compute.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.StatusCode.Code;

public class ComputeOperationTransformer<ResponseT>
    implements ApiFunction<OperationSnapshot, ResponseT> {

  @Override
  @SuppressWarnings("unchecked")
  public ResponseT apply(OperationSnapshot operationSnapshot) {
    if (!operationSnapshot.getErrorCode().getCode().equals(Code.OK)) {
      throw ApiExceptionFactory.createException(
          "Operation with name \""
              + operationSnapshot.getName()
              + "\" failed with status = "
              + operationSnapshot.getErrorCode()
              + " and message = "
              + operationSnapshot.getErrorMessage(),
          null,
          operationSnapshot.getErrorCode(),
          false);
    }
    try {
      return (ResponseT) operationSnapshot.getResponse();
    } catch (RuntimeException e) {
      throw ApiExceptionFactory.createException(
          "Operation with name \""
              + operationSnapshot.getName()
              + "\" succeeded, but encountered a problem unpacking it.",
          e,
          operationSnapshot.getErrorCode(),
          false);
    }
  }
}
