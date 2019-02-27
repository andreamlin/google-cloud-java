package com.google.cloud.compute.v1.longrunning;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.HttpJsonStatusCode;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.compute.v1.Operation;

/**
 * Implementation of a long-running operation for the Compute client. Wraps a compute Operation
 * object.
 */
@BetaApi
public class ComputeOperationSnapshot implements OperationSnapshot {

  private static final EmptyMessage response = EmptyMessage.getDefaultInstance();

  private final Operation operation;

  private ComputeOperationSnapshot(Operation operation) {
    this.operation = operation;
  }

  public static ComputeOperationSnapshot create(Operation operation) {
    return new ComputeOperationSnapshot(operation);
  }

  @Override
  // Returns full resource name of the operation.
  public String getName() {
    return operation.getSelfLink();
  }

  @Override
  // Returns the underlying Compute Operation object that is natively returned by
  // longrunning methods.
  public Operation getMetadata() {
    return operation;
  }

  @Override
  public boolean isDone() {
    return "DONE".equals(operation.getStatus());
  }

  @Override
  public EmptyMessage getResponse() {
    // Compute methods do not have responses.
    return response;
  }

  @Override
  public StatusCode getErrorCode() {
    int code;
    String message;
    try {
      code = Integer.valueOf(operation.getError().getErrorsList().get(0).getCode());
      message = operation.getError().getErrorsList().get(0).getMessage();
    } catch (NullPointerException | IndexOutOfBoundsException e) {
      code = 200;
      message = "OK";
    }

    return HttpJsonStatusCode.of(code, message);
  }

  @Override
  public String getErrorMessage() {

    try {
      return operation.getError().getErrorsList().toString();
    } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
      // No error found.
      return null;
    }
  }
}
