package com.google.cloud.compute.longrunning;

import static com.google.cloud.compute.longrunning.ComputeOperationSnapshot.Status.DONE;

import com.google.api.gax.httpjson.HttpJsonStatusCode;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.compute.v1.Operation;

public class ComputeOperationSnapshot implements OperationSnapshot {

  public enum Status {
    PENDING,
    RUNNING,
    DONE
  }

  private final Operation operation;

  public ComputeOperationSnapshot(Operation operation) {
    this.operation = operation;
  }

  @Override
  public String getName() {
    return operation.getName();
  }

  @Override
  public Object getMetadata() {
    return null;
  }

  @Override
  public boolean isDone() {
    return DONE.equals(getOperationStatus());
  }

  @Override
  public Object getResponse() {
    return null;
  }

  @Override
  public StatusCode getErrorCode() {
    if (operation.getError().getErrorsList().isEmpty()) {
      return null;
    }

    // Return the first Error code.
    return HttpJsonStatusCode
        .of(Integer.valueOf(operation.getError().getErrorsList().get(0).getCode()), operation.getError().getErrorsList().get(0).getMessage());
  }

  @Override
  public String getErrorMessage() {
    return operation.getError().getErrorsList().toString();
  }


  public Status getOperationStatus() {
    return Status.valueOf(operation.getStatus());
  }
}
