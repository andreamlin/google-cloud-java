/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.SubnetworkClient.AggregatedListSubnetworksPagedResponse;
import static com.google.cloud.compute.v1.SubnetworkClient.ListSubnetworksPagedResponse;
import static com.google.cloud.compute.v1.SubnetworkClient.ListUsableSubnetworksPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest;
import com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest;
import com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest;
import com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest;
import com.google.cloud.compute.v1.GetSubnetworkHttpRequest;
import com.google.cloud.compute.v1.InsertSubnetworkHttpRequest;
import com.google.cloud.compute.v1.ListSubnetworksHttpRequest;
import com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchSubnetworkHttpRequest;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest;
import com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest;
import com.google.cloud.compute.v1.Subnetwork;
import com.google.cloud.compute.v1.SubnetworkAggregatedList;
import com.google.cloud.compute.v1.SubnetworkList;
import com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
import com.google.cloud.compute.v1.UsableSubnetworksAggregatedList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class SubnetworkStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListSubnetworksHttpRequest, AggregatedListSubnetworksPagedResponse>
      aggregatedListSubnetworksPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: aggregatedListSubnetworksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList>
      aggregatedListSubnetworksCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListSubnetworksCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteSubnetworkHttpRequest, EmptyMessage, EmptyMessage>
      deleteSubnetworkOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSubnetworkOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSubnetworkCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ExpandIpCidrRangeSubnetworkHttpRequest, EmptyMessage, EmptyMessage>
      expandIpCidrRangeSubnetworkOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: expandIpCidrRangeSubnetworkOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<ExpandIpCidrRangeSubnetworkHttpRequest, Operation>
      expandIpCidrRangeSubnetworkCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: expandIpCidrRangeSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: getSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<GetIamPolicySubnetworkHttpRequest, Policy> getIamPolicySubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicySubnetworkCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertSubnetworkHttpRequest, EmptyMessage, EmptyMessage>
      insertSubnetworkOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: insertSubnetworkOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertSubnetworkHttpRequest, Operation> insertSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: insertSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSubnetworksHttpRequest, ListSubnetworksPagedResponse>
      listSubnetworksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSubnetworksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksCallable() {
    throw new UnsupportedOperationException("Not implemented: listSubnetworksCallable()");
  }

  @BetaApi
  public UnaryCallable<ListUsableSubnetworksHttpRequest, ListUsableSubnetworksPagedResponse>
      listUsableSubnetworksPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listUsableSubnetworksPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListUsableSubnetworksHttpRequest, UsableSubnetworksAggregatedList>
      listUsableSubnetworksCallable() {
    throw new UnsupportedOperationException("Not implemented: listUsableSubnetworksCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchSubnetworkHttpRequest, EmptyMessage, EmptyMessage>
      patchSubnetworkOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: patchSubnetworkOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchSubnetworkHttpRequest, Operation> patchSubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: patchSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<SetIamPolicySubnetworkHttpRequest, Policy> setIamPolicySubnetworkCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicySubnetworkCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          SetPrivateIpGoogleAccessSubnetworkHttpRequest, EmptyMessage, EmptyMessage>
      setPrivateIpGoogleAccessSubnetworkOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setPrivateIpGoogleAccessSubnetworkOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<SetPrivateIpGoogleAccessSubnetworkHttpRequest, Operation>
      setPrivateIpGoogleAccessSubnetworkCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setPrivateIpGoogleAccessSubnetworkCallable()");
  }

  @BetaApi
  public UnaryCallable<TestIamPermissionsSubnetworkHttpRequest, TestPermissionsResponse>
      testIamPermissionsSubnetworkCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: testIamPermissionsSubnetworkCallable()");
  }

  @Override
  public abstract void close();
}
