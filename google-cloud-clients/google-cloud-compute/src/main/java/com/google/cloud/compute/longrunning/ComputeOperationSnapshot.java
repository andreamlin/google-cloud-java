package com.google.cloud.compute.longrunning;

import com.google.api.gax.httpjson.HttpJsonStatusCode;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectGlobalOperationName;
import com.google.cloud.compute.v1.ProjectRegionOperationName;
import com.google.cloud.compute.v1.ProjectZoneOperationName;
import com.google.common.base.Strings;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Implementation of a long-running operation for the Compute client.
 *  Wraps a compute Operation object. */
public class ComputeOperationSnapshot implements OperationSnapshot {

  private static final Logger logger = Logger.getLogger(ComputeOperationSnapshot.class.getName());

  public enum Status {
    PENDING,
    RUNNING,
    DONE
  }

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
  public Object getMetadata() {
    return null;
  }

  @Override
  public boolean isDone() {
    return Status.DONE.equals(getOperationStatus());
  }

  @Override
  public Object getResponse() {
    return null;
  }

  @Override
  public StatusCode getErrorCode() {
    if (operation.getError() == null
        || operation.getError().getErrorsList() == null
        || operation.getError().getErrorsList().isEmpty()) {
      // No errors; return 200.
      return HttpJsonStatusCode.of(200, "OK");
    }

    // Return the first Error code.
    return HttpJsonStatusCode.of(
        Integer.valueOf(operation.getError().getErrorsList().get(0).getCode()),
        operation.getError().getErrorsList().get(0).getMessage());
  }

  @Override
  public String getErrorMessage() {
    return operation.getError().getErrorsList().toString();
  }

  public Status getOperationStatus() {
    return Status.valueOf(operation.getStatus());
  }
}
