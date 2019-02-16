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

import static com.google.cloud.compute.v1.SecurityPolicyClient.ListSecurityPoliciesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.SecurityPolicy;
import com.google.cloud.compute.v1.SecurityPolicyList;
import com.google.cloud.compute.v1.SecurityPolicyRule;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class SecurityPolicyStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GlobalOperationStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AddRuleSecurityPolicyHttpRequest, EmptyMessage, Operation>
      addRuleSecurityPolicyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: addRuleSecurityPolicyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<AddRuleSecurityPolicyHttpRequest, Operation>
      addRuleSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: addRuleSecurityPolicyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteSecurityPolicyHttpRequest, EmptyMessage, Operation>
      deleteSecurityPolicyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteSecurityPolicyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteSecurityPolicyHttpRequest, Operation> deleteSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSecurityPolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetSecurityPolicyHttpRequest, SecurityPolicy> getSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getSecurityPolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetRuleSecurityPolicyHttpRequest, SecurityPolicyRule>
      getRuleSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getRuleSecurityPolicyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertSecurityPolicyHttpRequest, EmptyMessage, Operation>
      insertSecurityPolicyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertSecurityPolicyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertSecurityPolicyHttpRequest, Operation> insertSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: insertSecurityPolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSecurityPoliciesHttpRequest, ListSecurityPoliciesPagedResponse>
      listSecurityPoliciesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSecurityPoliciesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListSecurityPoliciesHttpRequest, SecurityPolicyList>
      listSecurityPoliciesCallable() {
    throw new UnsupportedOperationException("Not implemented: listSecurityPoliciesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchSecurityPolicyHttpRequest, EmptyMessage, Operation>
      patchSecurityPolicyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchSecurityPolicyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchSecurityPolicyHttpRequest, Operation> patchSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: patchSecurityPolicyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchRuleSecurityPolicyHttpRequest, EmptyMessage, Operation>
      patchRuleSecurityPolicyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchRuleSecurityPolicyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchRuleSecurityPolicyHttpRequest, Operation>
      patchRuleSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: patchRuleSecurityPolicyCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RemoveRuleSecurityPolicyHttpRequest, EmptyMessage, Operation>
      removeRuleSecurityPolicyOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: removeRuleSecurityPolicyOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<RemoveRuleSecurityPolicyHttpRequest, Operation>
      removeRuleSecurityPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: removeRuleSecurityPolicyCallable()");
  }

  @Override
  public abstract void close();
}
