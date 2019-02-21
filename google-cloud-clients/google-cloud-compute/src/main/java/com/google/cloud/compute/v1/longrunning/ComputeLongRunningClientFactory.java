package com.google.cloud.compute.v1.longrunning;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest;
import com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest;
import com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest;
import com.google.cloud.compute.v1.GetGlobalOperationHttpRequest;
import com.google.cloud.compute.v1.GetRegionOperationHttpRequest;
import com.google.cloud.compute.v1.GetZoneOperationHttpRequest;
import com.google.cloud.compute.v1.stub.GlobalOperationStub;
import com.google.cloud.compute.v1.stub.RegionOperationStub;
import com.google.cloud.compute.v1.stub.ZoneOperationStub;

/** Factory for creating Compute LongRunningClients for a given [Scope]OperationStub. */
@BetaApi
public class ComputeLongRunningClientFactory {

  /* Create a ComputeLongRunningClient from a GlobalOperationsStub. */
  public static ComputeLongRunningClient create(GlobalOperationStub operationStub) {
    return ComputeLongRunningClient.<GetGlobalOperationHttpRequest, DeleteGlobalOperationHttpRequest>newBuilder()
        .setStub(operationStub)
        .setGetOperationCallable(operationStub.getGlobalOperationCallable())
        .setDeleteOperationCallable(operationStub.deleteGlobalOperationCallable())
        .setCreateDeleteRequestFunc(
            new ApiFunction<String, DeleteGlobalOperationHttpRequest>() {
              public DeleteGlobalOperationHttpRequest apply(String operationSelfLink) {
                // Make sure operation is a formatted string.
                return DeleteGlobalOperationHttpRequest.newBuilder()
                    .setOperation(operationSelfLink)
                    .build();
              }
            }
        )
        .setCreateGetRequestFunc( new ApiFunction<String, GetGlobalOperationHttpRequest>() {
          public GetGlobalOperationHttpRequest apply(String operationSelfLink) {
            // Make sure operation is a formatted string.
            return GetGlobalOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
          }
        })
        .build();
  }

  /* Create a ComputeLongRunningClient from a ZoneOperationStub. */
  public static ComputeLongRunningClient create(ZoneOperationStub operationStub) {
    return ComputeLongRunningClient.<GetZoneOperationHttpRequest, DeleteZoneOperationHttpRequest>newBuilder()
        .setStub(operationStub)
        .setGetOperationCallable(operationStub.getZoneOperationCallable())
        .setDeleteOperationCallable(operationStub.deleteZoneOperationCallable())
        .setCreateDeleteRequestFunc(
            new ApiFunction<String, DeleteZoneOperationHttpRequest>() {
              public DeleteZoneOperationHttpRequest apply(String operationSelfLink) {
                // Make sure operation is a formatted string.
                return DeleteZoneOperationHttpRequest.newBuilder()
                    .setOperation(operationSelfLink)
                    .build();
              }
            }
        )
        .setCreateGetRequestFunc( new ApiFunction<String, GetZoneOperationHttpRequest>() {
          public GetZoneOperationHttpRequest apply(String operationSelfLink) {
            // Make sure operation is a formatted string.
            return GetZoneOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
          }
        })
        .build();
  }

  /* Create a ComputeLongRunningClient from a RegionOperationStub. */
  public static ComputeLongRunningClient create(RegionOperationStub operationStub) {
    return ComputeLongRunningClient.<GetRegionOperationHttpRequest, DeleteRegionOperationHttpRequest>newBuilder()
        .setStub(operationStub)
        .setGetOperationCallable(operationStub.getRegionOperationCallable())
        .setDeleteOperationCallable(operationStub.deleteRegionOperationCallable())
        .setCreateDeleteRequestFunc(
            new ApiFunction<String, DeleteRegionOperationHttpRequest>() {
              public DeleteRegionOperationHttpRequest apply(String operationSelfLink) {
                // Make sure operation is a formatted string.
                return DeleteRegionOperationHttpRequest.newBuilder()
                    .setOperation(operationSelfLink)
                    .build();
              }
            }
        )
        .setCreateGetRequestFunc( new ApiFunction<String, GetRegionOperationHttpRequest>() {
          public GetRegionOperationHttpRequest apply(String operationSelfLink) {
            // Make sure operation is a formatted string.
            return GetRegionOperationHttpRequest.newBuilder().setOperation(operationSelfLink).build();
          }
        })
        .build();
  }
}
