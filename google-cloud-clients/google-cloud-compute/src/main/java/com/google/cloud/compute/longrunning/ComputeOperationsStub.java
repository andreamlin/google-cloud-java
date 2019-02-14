package com.google.cloud.compute.longrunning;

import com.google.longrunning.stub.OperationsStub;
import java.util.concurrent.TimeUnit;

public class ComputeOperationsStub extends OperationsStub {

  @Override
  public void close() {}

  @Override
  public void shutdown() {}

  @Override
  public boolean isShutdown() {
    return false;
  }

  @Override
  public boolean isTerminated() {
    return false;
  }

  @Override
  public void shutdownNow() {}

  @Override
  public boolean awaitTermination(long l, TimeUnit timeUnit) throws InterruptedException {
    return false;
  }
}
