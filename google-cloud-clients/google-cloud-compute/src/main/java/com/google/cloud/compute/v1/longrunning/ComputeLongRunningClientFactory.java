package com.google.cloud.compute.v1.longrunning;

import com.google.api.core.BetaApi;
import com.google.cloud.compute.v1.stub.GlobalOperationStub;
import com.google.cloud.compute.v1.stub.RegionOperationStub;
import com.google.cloud.compute.v1.stub.ZoneOperationStub;

/** Factory for creating Compute LongRunningClients for a given *OperationStub. */
@BetaApi
public class ComputeLongRunningClientFactory {

  public static GlobalLongRunningClient create(GlobalOperationStub operationStub) {
    return new GlobalLongRunningClient(operationStub);
  }

  public static ZoneLongRunningClient create(ZoneOperationStub operationStub) {
    return new ZoneLongRunningClient(operationStub);
  }

  public static RegionLongRunningClient create(RegionOperationStub operationStub) {
    return new RegionLongRunningClient(operationStub);
  }
}
