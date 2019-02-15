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
package com.google.cloud.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.SecurityPolicyStub;
import com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
 *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
 *   SecurityPolicy response = securityPolicyClient.getSecurityPolicy(securityPolicy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the securityPolicyClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SecurityPolicySettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * SecurityPolicySettings securityPolicySettings =
 *     SecurityPolicySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SecurityPolicyClient securityPolicyClient =
 *     SecurityPolicyClient.create(securityPolicySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SecurityPolicySettings securityPolicySettings =
 *     SecurityPolicySettings.newBuilder().setEndpoint(myEndpoint).build();
 * SecurityPolicyClient securityPolicyClient =
 *     SecurityPolicyClient.create(securityPolicySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SecurityPolicyClient implements BackgroundResource {
  private final SecurityPolicySettings settings;
  private final SecurityPolicyStub stub;
  private final GlobalOperationClient operationsClient;

  /** Constructs an instance of SecurityPolicyClient with default settings. */
  public static final SecurityPolicyClient create() throws IOException {
    return create(SecurityPolicySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SecurityPolicyClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SecurityPolicyClient create(SecurityPolicySettings settings)
      throws IOException {
    return new SecurityPolicyClient(settings);
  }

  /**
   * Constructs an instance of SecurityPolicyClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use SecurityPolicySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SecurityPolicyClient create(SecurityPolicyStub stub) {
    return new SecurityPolicyClient(stub);
  }

  /**
   * Constructs an instance of SecurityPolicyClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SecurityPolicyClient(SecurityPolicySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SecurityPolicyStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SecurityPolicyClient(SecurityPolicyStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = GlobalOperationClient.create(this.stub.getOperationsStub());
  }

  public final SecurityPolicySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SecurityPolicyStub getStub() {
    return stub;
  }

  /**
   * Returns the GlobalOperationClient that can be used to query the status of a long-running
   * operation returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final GlobalOperationClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Inserts a rule into a security policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   securityPolicyClient.addRuleSecurityPolicyAsync(securityPolicy, securityPolicyRuleResource).get();
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to update.
   * @param securityPolicyRuleResource Represents a rule that describes one or more match conditions
   *     along with the action to be taken when traffic matches this condition (allow or deny).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addRuleSecurityPolicyAsync(
      ProjectGlobalSecurityPolicyName securityPolicy,
      SecurityPolicyRule securityPolicyRuleResource) {

    AddRuleSecurityPolicyHttpRequest request =
        AddRuleSecurityPolicyHttpRequest.newBuilder()
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .setSecurityPolicyRuleResource(securityPolicyRuleResource)
            .build();
    return addRuleSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Inserts a rule into a security policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   securityPolicyClient.addRuleSecurityPolicyAsync(securityPolicy.toString(), securityPolicyRuleResource).get();
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to update.
   * @param securityPolicyRuleResource Represents a rule that describes one or more match conditions
   *     along with the action to be taken when traffic matches this condition (allow or deny).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addRuleSecurityPolicyAsync(
      String securityPolicy, SecurityPolicyRule securityPolicyRuleResource) {

    AddRuleSecurityPolicyHttpRequest request =
        AddRuleSecurityPolicyHttpRequest.newBuilder()
            .setSecurityPolicy(securityPolicy)
            .setSecurityPolicyRuleResource(securityPolicyRuleResource)
            .build();
    return addRuleSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Inserts a rule into a security policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   AddRuleSecurityPolicyHttpRequest request = AddRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyRuleResource(securityPolicyRuleResource)
   *     .build();
   *   securityPolicyClient.addRuleSecurityPolicyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> addRuleSecurityPolicyAsync(
      AddRuleSecurityPolicyHttpRequest request) {
    return addRuleSecurityPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Inserts a rule into a security policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   AddRuleSecurityPolicyHttpRequest request = AddRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyRuleResource(securityPolicyRuleResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = securityPolicyClient.addRuleSecurityPolicyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<AddRuleSecurityPolicyHttpRequest, EmptyMessage, EmptyMessage>
      addRuleSecurityPolicyOperationCallable() {
    return stub.addRuleSecurityPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Inserts a rule into a security policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   AddRuleSecurityPolicyHttpRequest request = AddRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyRuleResource(securityPolicyRuleResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = securityPolicyClient.addRuleSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AddRuleSecurityPolicyHttpRequest, Operation>
      addRuleSecurityPolicyCallable() {
    return stub.addRuleSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   securityPolicyClient.deleteSecurityPolicyAsync(securityPolicy).get();
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSecurityPolicyAsync(
      ProjectGlobalSecurityPolicyName securityPolicy) {

    DeleteSecurityPolicyHttpRequest request =
        DeleteSecurityPolicyHttpRequest.newBuilder()
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .build();
    return deleteSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   securityPolicyClient.deleteSecurityPolicyAsync(securityPolicy.toString()).get();
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSecurityPolicyAsync(
      String securityPolicy) {

    DeleteSecurityPolicyHttpRequest request =
        DeleteSecurityPolicyHttpRequest.newBuilder().setSecurityPolicy(securityPolicy).build();
    return deleteSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   DeleteSecurityPolicyHttpRequest request = DeleteSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   securityPolicyClient.deleteSecurityPolicyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> deleteSecurityPolicyAsync(
      DeleteSecurityPolicyHttpRequest request) {
    return deleteSecurityPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   DeleteSecurityPolicyHttpRequest request = DeleteSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = securityPolicyClient.deleteSecurityPolicyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteSecurityPolicyHttpRequest, EmptyMessage, EmptyMessage>
      deleteSecurityPolicyOperationCallable() {
    return stub.deleteSecurityPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   DeleteSecurityPolicyHttpRequest request = DeleteSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = securityPolicyClient.deleteSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSecurityPolicyHttpRequest, Operation>
      deleteSecurityPolicyCallable() {
    return stub.deleteSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all of the ordered rules present in a single specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy response = securityPolicyClient.getSecurityPolicy(securityPolicy);
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SecurityPolicy getSecurityPolicy(ProjectGlobalSecurityPolicyName securityPolicy) {

    GetSecurityPolicyHttpRequest request =
        GetSecurityPolicyHttpRequest.newBuilder()
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .build();
    return getSecurityPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all of the ordered rules present in a single specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy response = securityPolicyClient.getSecurityPolicy(securityPolicy.toString());
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SecurityPolicy getSecurityPolicy(String securityPolicy) {

    GetSecurityPolicyHttpRequest request =
        GetSecurityPolicyHttpRequest.newBuilder().setSecurityPolicy(securityPolicy).build();
    return getSecurityPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all of the ordered rules present in a single specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   GetSecurityPolicyHttpRequest request = GetSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   SecurityPolicy response = securityPolicyClient.getSecurityPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SecurityPolicy getSecurityPolicy(GetSecurityPolicyHttpRequest request) {
    return getSecurityPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all of the ordered rules present in a single specified policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   GetSecurityPolicyHttpRequest request = GetSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   ApiFuture&lt;SecurityPolicy&gt; future = securityPolicyClient.getSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   SecurityPolicy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSecurityPolicyHttpRequest, SecurityPolicy>
      getSecurityPolicyCallable() {
    return stub.getSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule response = securityPolicyClient.getRuleSecurityPolicy(priority, securityPolicy);
   * }
   * </code></pre>
   *
   * @param priority The priority of the rule to get from the security policy.
   * @param securityPolicy Name of the security policy to which the queried rule belongs.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SecurityPolicyRule getRuleSecurityPolicy(
      Integer priority, ProjectGlobalSecurityPolicyName securityPolicy) {

    GetRuleSecurityPolicyHttpRequest request =
        GetRuleSecurityPolicyHttpRequest.newBuilder()
            .setPriority(priority)
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .build();
    return getRuleSecurityPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule response = securityPolicyClient.getRuleSecurityPolicy(priority, securityPolicy.toString());
   * }
   * </code></pre>
   *
   * @param priority The priority of the rule to get from the security policy.
   * @param securityPolicy Name of the security policy to which the queried rule belongs.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SecurityPolicyRule getRuleSecurityPolicy(Integer priority, String securityPolicy) {

    GetRuleSecurityPolicyHttpRequest request =
        GetRuleSecurityPolicyHttpRequest.newBuilder()
            .setPriority(priority)
            .setSecurityPolicy(securityPolicy)
            .build();
    return getRuleSecurityPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   GetRuleSecurityPolicyHttpRequest request = GetRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   SecurityPolicyRule response = securityPolicyClient.getRuleSecurityPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final SecurityPolicyRule getRuleSecurityPolicy(GetRuleSecurityPolicyHttpRequest request) {
    return getRuleSecurityPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   GetRuleSecurityPolicyHttpRequest request = GetRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   ApiFuture&lt;SecurityPolicyRule&gt; future = securityPolicyClient.getRuleSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   SecurityPolicyRule response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetRuleSecurityPolicyHttpRequest, SecurityPolicyRule>
      getRuleSecurityPolicyCallable() {
    return stub.getRuleSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new policy in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   securityPolicyClient.insertSecurityPolicyAsync(project, securityPolicyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param securityPolicyResource A security policy is comprised of one or more rules. It can also
   *     be associated with one or more 'targets'. (== resource_for v1.securityPolicies ==) (==
   *     resource_for beta.securityPolicies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertSecurityPolicyAsync(
      ProjectName project, SecurityPolicy securityPolicyResource) {

    InsertSecurityPolicyHttpRequest request =
        InsertSecurityPolicyHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setSecurityPolicyResource(securityPolicyResource)
            .build();
    return insertSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new policy in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   securityPolicyClient.insertSecurityPolicyAsync(project.toString(), securityPolicyResource).get();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param securityPolicyResource A security policy is comprised of one or more rules. It can also
   *     be associated with one or more 'targets'. (== resource_for v1.securityPolicies ==) (==
   *     resource_for beta.securityPolicies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertSecurityPolicyAsync(
      String project, SecurityPolicy securityPolicyResource) {

    InsertSecurityPolicyHttpRequest request =
        InsertSecurityPolicyHttpRequest.newBuilder()
            .setProject(project)
            .setSecurityPolicyResource(securityPolicyResource)
            .build();
    return insertSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new policy in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   InsertSecurityPolicyHttpRequest request = InsertSecurityPolicyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setSecurityPolicyResource(securityPolicyResource)
   *     .build();
   *   securityPolicyClient.insertSecurityPolicyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> insertSecurityPolicyAsync(
      InsertSecurityPolicyHttpRequest request) {
    return insertSecurityPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new policy in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   InsertSecurityPolicyHttpRequest request = InsertSecurityPolicyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setSecurityPolicyResource(securityPolicyResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = securityPolicyClient.insertSecurityPolicyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InsertSecurityPolicyHttpRequest, EmptyMessage, EmptyMessage>
      insertSecurityPolicyOperationCallable() {
    return stub.insertSecurityPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new policy in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   InsertSecurityPolicyHttpRequest request = InsertSecurityPolicyHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .setSecurityPolicyResource(securityPolicyResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = securityPolicyClient.insertSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertSecurityPolicyHttpRequest, Operation>
      insertSecurityPolicyCallable() {
    return stub.insertSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all the policies that have been configured for the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (SecurityPolicy element : securityPolicyClient.listSecurityPolicies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSecurityPoliciesPagedResponse listSecurityPolicies(ProjectName project) {
    ListSecurityPoliciesHttpRequest request =
        ListSecurityPoliciesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listSecurityPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all the policies that have been configured for the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (SecurityPolicy element : securityPolicyClient.listSecurityPolicies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSecurityPoliciesPagedResponse listSecurityPolicies(String project) {
    ListSecurityPoliciesHttpRequest request =
        ListSecurityPoliciesHttpRequest.newBuilder().setProject(project).build();
    return listSecurityPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all the policies that have been configured for the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSecurityPoliciesHttpRequest request = ListSecurityPoliciesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (SecurityPolicy element : securityPolicyClient.listSecurityPolicies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSecurityPoliciesPagedResponse listSecurityPolicies(
      ListSecurityPoliciesHttpRequest request) {
    return listSecurityPoliciesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all the policies that have been configured for the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSecurityPoliciesHttpRequest request = ListSecurityPoliciesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;ListSecurityPoliciesPagedResponse&gt; future = securityPolicyClient.listSecurityPoliciesPagedCallable().futureCall(request);
   *   // Do something
   *   for (SecurityPolicy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSecurityPoliciesHttpRequest, ListSecurityPoliciesPagedResponse>
      listSecurityPoliciesPagedCallable() {
    return stub.listSecurityPoliciesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List all the policies that have been configured for the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ListSecurityPoliciesHttpRequest request = ListSecurityPoliciesHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     SecurityPolicyList response = securityPolicyClient.listSecurityPoliciesCallable().call(request);
   *     for (SecurityPolicy element : response.getItemsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSecurityPoliciesHttpRequest, SecurityPolicyList>
      listSecurityPoliciesCallable() {
    return stub.listSecurityPoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches the specified policy with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   securityPolicyClient.patchSecurityPolicyAsync(securityPolicy, securityPolicyResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to update.
   * @param securityPolicyResource A security policy is comprised of one or more rules. It can also
   *     be associated with one or more 'targets'. (== resource_for v1.securityPolicies ==) (==
   *     resource_for beta.securityPolicies ==)
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchSecurityPolicyAsync(
      ProjectGlobalSecurityPolicyName securityPolicy,
      SecurityPolicy securityPolicyResource,
      List<String> fieldMask) {

    PatchSecurityPolicyHttpRequest request =
        PatchSecurityPolicyHttpRequest.newBuilder()
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .setSecurityPolicyResource(securityPolicyResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches the specified policy with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   securityPolicyClient.patchSecurityPolicyAsync(securityPolicy.toString(), securityPolicyResource, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param securityPolicy Name of the security policy to update.
   * @param securityPolicyResource A security policy is comprised of one or more rules. It can also
   *     be associated with one or more 'targets'. (== resource_for v1.securityPolicies ==) (==
   *     resource_for beta.securityPolicies ==)
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchSecurityPolicyAsync(
      String securityPolicy, SecurityPolicy securityPolicyResource, List<String> fieldMask) {

    PatchSecurityPolicyHttpRequest request =
        PatchSecurityPolicyHttpRequest.newBuilder()
            .setSecurityPolicy(securityPolicy)
            .setSecurityPolicyResource(securityPolicyResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches the specified policy with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchSecurityPolicyHttpRequest request = PatchSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyResource(securityPolicyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   securityPolicyClient.patchSecurityPolicyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchSecurityPolicyAsync(
      PatchSecurityPolicyHttpRequest request) {
    return patchSecurityPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches the specified policy with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchSecurityPolicyHttpRequest request = PatchSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyResource(securityPolicyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = securityPolicyClient.patchSecurityPolicyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<PatchSecurityPolicyHttpRequest, EmptyMessage, EmptyMessage>
      patchSecurityPolicyOperationCallable() {
    return stub.patchSecurityPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches the specified policy with the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchSecurityPolicyHttpRequest request = PatchSecurityPolicyHttpRequest.newBuilder()
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyResource(securityPolicyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = securityPolicyClient.patchSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchSecurityPolicyHttpRequest, Operation>
      patchSecurityPolicyCallable() {
    return stub.patchSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   securityPolicyClient.patchRuleSecurityPolicyAsync(priority, securityPolicy, securityPolicyRuleResource).get();
   * }
   * </code></pre>
   *
   * @param priority The priority of the rule to patch.
   * @param securityPolicy Name of the security policy to update.
   * @param securityPolicyRuleResource Represents a rule that describes one or more match conditions
   *     along with the action to be taken when traffic matches this condition (allow or deny).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchRuleSecurityPolicyAsync(
      Integer priority,
      ProjectGlobalSecurityPolicyName securityPolicy,
      SecurityPolicyRule securityPolicyRuleResource) {

    PatchRuleSecurityPolicyHttpRequest request =
        PatchRuleSecurityPolicyHttpRequest.newBuilder()
            .setPriority(priority)
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .setSecurityPolicyRuleResource(securityPolicyRuleResource)
            .build();
    return patchRuleSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   securityPolicyClient.patchRuleSecurityPolicyAsync(priority, securityPolicy.toString(), securityPolicyRuleResource).get();
   * }
   * </code></pre>
   *
   * @param priority The priority of the rule to patch.
   * @param securityPolicy Name of the security policy to update.
   * @param securityPolicyRuleResource Represents a rule that describes one or more match conditions
   *     along with the action to be taken when traffic matches this condition (allow or deny).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchRuleSecurityPolicyAsync(
      Integer priority, String securityPolicy, SecurityPolicyRule securityPolicyRuleResource) {

    PatchRuleSecurityPolicyHttpRequest request =
        PatchRuleSecurityPolicyHttpRequest.newBuilder()
            .setPriority(priority)
            .setSecurityPolicy(securityPolicy)
            .setSecurityPolicyRuleResource(securityPolicyRuleResource)
            .build();
    return patchRuleSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   PatchRuleSecurityPolicyHttpRequest request = PatchRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyRuleResource(securityPolicyRuleResource)
   *     .build();
   *   securityPolicyClient.patchRuleSecurityPolicyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> patchRuleSecurityPolicyAsync(
      PatchRuleSecurityPolicyHttpRequest request) {
    return patchRuleSecurityPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   PatchRuleSecurityPolicyHttpRequest request = PatchRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyRuleResource(securityPolicyRuleResource)
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = securityPolicyClient.patchRuleSecurityPolicyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<PatchRuleSecurityPolicyHttpRequest, EmptyMessage, EmptyMessage>
      patchRuleSecurityPolicyOperationCallable() {
    return stub.patchRuleSecurityPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Patches a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
   *   PatchRuleSecurityPolicyHttpRequest request = PatchRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .setSecurityPolicyRuleResource(securityPolicyRuleResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = securityPolicyClient.patchRuleSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchRuleSecurityPolicyHttpRequest, Operation>
      patchRuleSecurityPolicyCallable() {
    return stub.patchRuleSecurityPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   securityPolicyClient.removeRuleSecurityPolicyAsync(priority, securityPolicy).get();
   * }
   * </code></pre>
   *
   * @param priority The priority of the rule to remove from the security policy.
   * @param securityPolicy Name of the security policy to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> removeRuleSecurityPolicyAsync(
      Integer priority, ProjectGlobalSecurityPolicyName securityPolicy) {

    RemoveRuleSecurityPolicyHttpRequest request =
        RemoveRuleSecurityPolicyHttpRequest.newBuilder()
            .setPriority(priority)
            .setSecurityPolicy(securityPolicy == null ? null : securityPolicy.toString())
            .build();
    return removeRuleSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   securityPolicyClient.removeRuleSecurityPolicyAsync(priority, securityPolicy.toString()).get();
   * }
   * </code></pre>
   *
   * @param priority The priority of the rule to remove from the security policy.
   * @param securityPolicy Name of the security policy to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> removeRuleSecurityPolicyAsync(
      Integer priority, String securityPolicy) {

    RemoveRuleSecurityPolicyHttpRequest request =
        RemoveRuleSecurityPolicyHttpRequest.newBuilder()
            .setPriority(priority)
            .setSecurityPolicy(securityPolicy)
            .build();
    return removeRuleSecurityPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   RemoveRuleSecurityPolicyHttpRequest request = RemoveRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   securityPolicyClient.removeRuleSecurityPolicyAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<EmptyMessage, EmptyMessage> removeRuleSecurityPolicyAsync(
      RemoveRuleSecurityPolicyHttpRequest request) {
    return removeRuleSecurityPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   RemoveRuleSecurityPolicyHttpRequest request = RemoveRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   OperationFuture&lt;EmptyMessage, EmptyMessage&gt; future = securityPolicyClient.removeRuleSecurityPolicyOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<RemoveRuleSecurityPolicyHttpRequest, EmptyMessage, EmptyMessage>
      removeRuleSecurityPolicyOperationCallable() {
    return stub.removeRuleSecurityPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a rule at the specified priority.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
   *   Integer priority = 0;
   *   ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of("[PROJECT]", "[SECURITY_POLICY]");
   *   RemoveRuleSecurityPolicyHttpRequest request = RemoveRuleSecurityPolicyHttpRequest.newBuilder()
   *     .setPriority(priority)
   *     .setSecurityPolicy(securityPolicy.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = securityPolicyClient.removeRuleSecurityPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<RemoveRuleSecurityPolicyHttpRequest, Operation>
      removeRuleSecurityPolicyCallable() {
    return stub.removeRuleSecurityPolicyCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListSecurityPoliciesPagedResponse
      extends AbstractPagedListResponse<
          ListSecurityPoliciesHttpRequest,
          SecurityPolicyList,
          SecurityPolicy,
          ListSecurityPoliciesPage,
          ListSecurityPoliciesFixedSizeCollection> {

    public static ApiFuture<ListSecurityPoliciesPagedResponse> createAsync(
        PageContext<ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy> context,
        ApiFuture<SecurityPolicyList> futureResponse) {
      ApiFuture<ListSecurityPoliciesPage> futurePage =
          ListSecurityPoliciesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSecurityPoliciesPage, ListSecurityPoliciesPagedResponse>() {
            @Override
            public ListSecurityPoliciesPagedResponse apply(ListSecurityPoliciesPage input) {
              return new ListSecurityPoliciesPagedResponse(input);
            }
          });
    }

    private ListSecurityPoliciesPagedResponse(ListSecurityPoliciesPage page) {
      super(page, ListSecurityPoliciesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSecurityPoliciesPage
      extends AbstractPage<
          ListSecurityPoliciesHttpRequest,
          SecurityPolicyList,
          SecurityPolicy,
          ListSecurityPoliciesPage> {

    private ListSecurityPoliciesPage(
        PageContext<ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy> context,
        SecurityPolicyList response) {
      super(context, response);
    }

    private static ListSecurityPoliciesPage createEmptyPage() {
      return new ListSecurityPoliciesPage(null, null);
    }

    @Override
    protected ListSecurityPoliciesPage createPage(
        PageContext<ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy> context,
        SecurityPolicyList response) {
      return new ListSecurityPoliciesPage(context, response);
    }

    @Override
    public ApiFuture<ListSecurityPoliciesPage> createPageAsync(
        PageContext<ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy> context,
        ApiFuture<SecurityPolicyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSecurityPoliciesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSecurityPoliciesHttpRequest,
          SecurityPolicyList,
          SecurityPolicy,
          ListSecurityPoliciesPage,
          ListSecurityPoliciesFixedSizeCollection> {

    private ListSecurityPoliciesFixedSizeCollection(
        List<ListSecurityPoliciesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSecurityPoliciesFixedSizeCollection createEmptyCollection() {
      return new ListSecurityPoliciesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSecurityPoliciesFixedSizeCollection createCollection(
        List<ListSecurityPoliciesPage> pages, int collectionSize) {
      return new ListSecurityPoliciesFixedSizeCollection(pages, collectionSize);
    }
  }
}
