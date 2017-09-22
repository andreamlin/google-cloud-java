/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteGlobalForwardingRuleHttpRequest;
import com.google.compute.v1.ForwardingRule;
import com.google.compute.v1.ForwardingRuleList;
import com.google.compute.v1.GetGlobalForwardingRuleHttpRequest;
import com.google.compute.v1.GlobalForwardingRuleAdminSettings;
import com.google.compute.v1.GlobalForwardingRulesForwardingRuleName;
import com.google.compute.v1.GlobalForwardingRulesProjectName;
import com.google.compute.v1.InsertGlobalForwardingRuleHttpRequest;
import com.google.compute.v1.ListGlobalForwardingRulesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalForwardingRulesPagedResponse;
import com.google.compute.v1.SetTargetGlobalForwardingRuleHttpRequest;
import com.google.compute.v1.TargetReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HttpGlobalForwardingRuleAdminStub extends GlobalForwardingRuleAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteGlobalForwardingRuleHttpRequest, Operation> directDeleteGlobalForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteGlobalForwardingRuleHttpRequest, Operation>newBuilder()
              .setMethodName("compute.globalForwardingRules.delete")
              .setRequestInstance(DeleteGlobalForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/forwardingRules/{forwardingRule}")
              .setPathParams(Sets.<String>newHashSet(
                                "forwardingRule",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetGlobalForwardingRuleHttpRequest, ForwardingRule> directGetGlobalForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetGlobalForwardingRuleHttpRequest, ForwardingRule>newBuilder()
              .setMethodName("compute.globalForwardingRules.get")
              .setRequestInstance(GetGlobalForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(ForwardingRule.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/forwardingRules/{forwardingRule}")
              .setPathParams(Sets.<String>newHashSet(
                                "forwardingRule",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertGlobalForwardingRuleHttpRequest, Operation> directInsertGlobalForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertGlobalForwardingRuleHttpRequest, Operation>newBuilder()
              .setMethodName("compute.globalForwardingRules.insert")
              .setRequestInstance(InsertGlobalForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/forwardingRules")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList> directListGlobalForwardingRulesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList>newBuilder()
              .setMethodName("compute.globalForwardingRules.list")
              .setRequestInstance(ListGlobalForwardingRulesHttpRequest.getDefaultInstance())
              .setResponseInstance(ForwardingRuleList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/forwardingRules")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<SetTargetGlobalForwardingRuleHttpRequest, Operation> directSetTargetGlobalForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetTargetGlobalForwardingRuleHttpRequest, Operation>newBuilder()
              .setMethodName("compute.globalForwardingRules.setTarget")
              .setRequestInstance(SetTargetGlobalForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/forwardingRules/{forwardingRule}/setTarget")
              .setPathParams(Sets.<String>newHashSet(
                                "forwardingRule",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteGlobalForwardingRuleHttpRequest, Operation> deleteGlobalForwardingRuleCallable;
  private final UnaryCallable<GetGlobalForwardingRuleHttpRequest, ForwardingRule> getGlobalForwardingRuleCallable;
  private final UnaryCallable<InsertGlobalForwardingRuleHttpRequest, Operation> insertGlobalForwardingRuleCallable;
  private final UnaryCallable<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList> listGlobalForwardingRulesCallable;
  private final UnaryCallable<ListGlobalForwardingRulesHttpRequest, ListGlobalForwardingRulesPagedResponse> listGlobalForwardingRulesPagedCallable;
  private final UnaryCallable<SetTargetGlobalForwardingRuleHttpRequest, Operation> setTargetGlobalForwardingRuleCallable;

  public static final HttpGlobalForwardingRuleAdminStub create(GlobalForwardingRuleAdminSettings settings) throws IOException {
    return new HttpGlobalForwardingRuleAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpGlobalForwardingRuleAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpGlobalForwardingRuleAdminStub(GlobalForwardingRuleAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpGlobalForwardingRuleAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpGlobalForwardingRuleAdminStub(GlobalForwardingRuleAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteGlobalForwardingRuleCallable = HttpJsonCallableFactory.create(directDeleteGlobalForwardingRuleCallable,settings.deleteGlobalForwardingRuleSettings(), clientContext);
    this.getGlobalForwardingRuleCallable = HttpJsonCallableFactory.create(directGetGlobalForwardingRuleCallable,settings.getGlobalForwardingRuleSettings(), clientContext);
    this.insertGlobalForwardingRuleCallable = HttpJsonCallableFactory.create(directInsertGlobalForwardingRuleCallable,settings.insertGlobalForwardingRuleSettings(), clientContext);
    this.listGlobalForwardingRulesCallable = HttpJsonCallableFactory.create(directListGlobalForwardingRulesCallable,settings.listGlobalForwardingRulesSettings(), clientContext);
    this.listGlobalForwardingRulesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListGlobalForwardingRulesCallable,settings.listGlobalForwardingRulesSettings(), clientContext);
    this.setTargetGlobalForwardingRuleCallable = HttpJsonCallableFactory.create(directSetTargetGlobalForwardingRuleCallable,settings.setTargetGlobalForwardingRuleSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteGlobalForwardingRuleHttpRequest, Operation> deleteGlobalForwardingRuleCallable() {
    return deleteGlobalForwardingRuleCallable;
  }

  @BetaApi
  public UnaryCallable<GetGlobalForwardingRuleHttpRequest, ForwardingRule> getGlobalForwardingRuleCallable() {
    return getGlobalForwardingRuleCallable;
  }

  @BetaApi
  public UnaryCallable<InsertGlobalForwardingRuleHttpRequest, Operation> insertGlobalForwardingRuleCallable() {
    return insertGlobalForwardingRuleCallable;
  }

  @BetaApi
  public UnaryCallable<ListGlobalForwardingRulesHttpRequest, ListGlobalForwardingRulesPagedResponse> listGlobalForwardingRulesPagedCallable() {
    return listGlobalForwardingRulesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList> listGlobalForwardingRulesCallable() {
    return listGlobalForwardingRulesCallable;
  }

  @BetaApi
  public UnaryCallable<SetTargetGlobalForwardingRuleHttpRequest, Operation> setTargetGlobalForwardingRuleCallable() {
    return setTargetGlobalForwardingRuleCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }

}