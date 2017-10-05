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
import com.google.compute.v1.AggregatedListForwardingRulesHttpRequest;
import com.google.compute.v1.DeleteForwardingRuleHttpRequest;
import com.google.compute.v1.ForwardingRule;
import com.google.compute.v1.ForwardingRuleAdminSettings;
import com.google.compute.v1.ForwardingRuleAggregatedList;
import com.google.compute.v1.ForwardingRuleList;
import com.google.compute.v1.ForwardingRuleName;
import com.google.compute.v1.GetForwardingRuleHttpRequest;
import com.google.compute.v1.InsertForwardingRuleHttpRequest;
import com.google.compute.v1.ListForwardingRulesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListForwardingRulesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListForwardingRulesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.SetTargetForwardingRuleHttpRequest;
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
public class HttpJsonForwardingRuleAdminStub extends ForwardingRuleAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList> directAggregatedListForwardingRulesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList>newBuilder()
              .setMethodName("compute.forwardingRules.aggregatedList")
              .setRequestInstance(AggregatedListForwardingRulesHttpRequest.getDefaultInstance())
              .setResponseInstance(ForwardingRuleAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/forwardingRules")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteForwardingRuleHttpRequest, Operation> directDeleteForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteForwardingRuleHttpRequest, Operation>newBuilder()
              .setMethodName("compute.forwardingRules.delete")
              .setRequestInstance(DeleteForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/forwardingRules/{forwardingRule}")
              .setPathParams(Sets.<String>newHashSet(
                                "forwardingRule",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetForwardingRuleHttpRequest, ForwardingRule> directGetForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetForwardingRuleHttpRequest, ForwardingRule>newBuilder()
              .setMethodName("compute.forwardingRules.get")
              .setRequestInstance(GetForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(ForwardingRule.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/forwardingRules/{forwardingRule}")
              .setPathParams(Sets.<String>newHashSet(
                                "forwardingRule",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertForwardingRuleHttpRequest, Operation> directInsertForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertForwardingRuleHttpRequest, Operation>newBuilder()
              .setMethodName("compute.forwardingRules.insert")
              .setRequestInstance(InsertForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/forwardingRules")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListForwardingRulesHttpRequest, ForwardingRuleList> directListForwardingRulesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListForwardingRulesHttpRequest, ForwardingRuleList>newBuilder()
              .setMethodName("compute.forwardingRules.list")
              .setRequestInstance(ListForwardingRulesHttpRequest.getDefaultInstance())
              .setResponseInstance(ForwardingRuleList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/forwardingRules")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<SetTargetForwardingRuleHttpRequest, Operation> directSetTargetForwardingRuleCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetTargetForwardingRuleHttpRequest, Operation>newBuilder()
              .setMethodName("compute.forwardingRules.setTarget")
              .setRequestInstance(SetTargetForwardingRuleHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/forwardingRules/{forwardingRule}/setTarget")
              .setPathParams(Sets.<String>newHashSet(
                                "forwardingRule",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList> aggregatedListForwardingRulesCallable;
  private final UnaryCallable<AggregatedListForwardingRulesHttpRequest, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesPagedCallable;
  private final UnaryCallable<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleCallable;
  private final UnaryCallable<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleCallable;
  private final UnaryCallable<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleCallable;
  private final UnaryCallable<ListForwardingRulesHttpRequest, ForwardingRuleList> listForwardingRulesCallable;
  private final UnaryCallable<ListForwardingRulesHttpRequest, ListForwardingRulesPagedResponse> listForwardingRulesPagedCallable;
  private final UnaryCallable<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleCallable;

  public static final HttpJsonForwardingRuleAdminStub create(ForwardingRuleAdminSettings settings) throws IOException {
    return new HttpJsonForwardingRuleAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonForwardingRuleAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonForwardingRuleAdminStub(ForwardingRuleAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonForwardingRuleAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonForwardingRuleAdminStub(ForwardingRuleAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListForwardingRulesCallable = HttpJsonCallableFactory.create(directAggregatedListForwardingRulesCallable,settings.aggregatedListForwardingRulesSettings(), clientContext);
    this.aggregatedListForwardingRulesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListForwardingRulesCallable,settings.aggregatedListForwardingRulesSettings(), clientContext);
    this.deleteForwardingRuleCallable = HttpJsonCallableFactory.create(directDeleteForwardingRuleCallable,settings.deleteForwardingRuleSettings(), clientContext);
    this.getForwardingRuleCallable = HttpJsonCallableFactory.create(directGetForwardingRuleCallable,settings.getForwardingRuleSettings(), clientContext);
    this.insertForwardingRuleCallable = HttpJsonCallableFactory.create(directInsertForwardingRuleCallable,settings.insertForwardingRuleSettings(), clientContext);
    this.listForwardingRulesCallable = HttpJsonCallableFactory.create(directListForwardingRulesCallable,settings.listForwardingRulesSettings(), clientContext);
    this.listForwardingRulesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListForwardingRulesCallable,settings.listForwardingRulesSettings(), clientContext);
    this.setTargetForwardingRuleCallable = HttpJsonCallableFactory.create(directSetTargetForwardingRuleCallable,settings.setTargetForwardingRuleSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListForwardingRulesHttpRequest, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesPagedCallable() {
    return aggregatedListForwardingRulesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList> aggregatedListForwardingRulesCallable() {
    return aggregatedListForwardingRulesCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleCallable() {
    return deleteForwardingRuleCallable;
  }

  @BetaApi
  public UnaryCallable<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleCallable() {
    return getForwardingRuleCallable;
  }

  @BetaApi
  public UnaryCallable<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleCallable() {
    return insertForwardingRuleCallable;
  }

  @BetaApi
  public UnaryCallable<ListForwardingRulesHttpRequest, ListForwardingRulesPagedResponse> listForwardingRulesPagedCallable() {
    return listForwardingRulesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListForwardingRulesHttpRequest, ForwardingRuleList> listForwardingRulesCallable() {
    return listForwardingRulesCallable;
  }

  @BetaApi
  public UnaryCallable<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleCallable() {
    return setTargetForwardingRuleCallable;
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