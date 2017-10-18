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
import com.google.api.gax.rpc.EmptyRequestParamsExtractor;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest;
import com.google.compute.v1.DeleteTargetVpnGatewayHttpRequest;
import com.google.compute.v1.GetTargetVpnGatewayHttpRequest;
import com.google.compute.v1.InsertTargetVpnGatewayHttpRequest;
import com.google.compute.v1.ListTargetVpnGatewaysHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetVpnGatewaysPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.TargetVpnGateway;
import com.google.compute.v1.TargetVpnGatewayAggregatedList;
import com.google.compute.v1.TargetVpnGatewayList;
import com.google.compute.v1.TargetVpnGatewayName;
import com.google.compute.v1.TargetVpnGatewaySettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
public class HttpJsonTargetVpnGatewayStub extends TargetVpnGatewayStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> directAggregatedListTargetVpnGatewaysCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList>newBuilder()
              .setMethodName("compute.targetVpnGateways.aggregatedList")
              .setRequestInstance(AggregatedListTargetVpnGatewaysHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetVpnGatewayAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/targetVpnGateways")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> directDeleteTargetVpnGatewayCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteTargetVpnGatewayHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetVpnGateways.delete")
              .setRequestInstance(DeleteTargetVpnGatewayHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways/{targetVpnGateway}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetVpnGateway"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> directGetTargetVpnGatewayCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetTargetVpnGatewayHttpRequest, TargetVpnGateway>newBuilder()
              .setMethodName("compute.targetVpnGateways.get")
              .setRequestInstance(GetTargetVpnGatewayHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetVpnGateway.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways/{targetVpnGateway}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetVpnGateway"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> directInsertTargetVpnGatewayCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertTargetVpnGatewayHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetVpnGateways.insert")
              .setRequestInstance(InsertTargetVpnGatewayHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> directListTargetVpnGatewaysCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList>newBuilder()
              .setMethodName("compute.targetVpnGateways.list")
              .setRequestInstance(ListTargetVpnGatewaysHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetVpnGatewayList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysCallable;
  private final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysPagedCallable;
  private final UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayCallable;
  private final UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayCallable;
  private final UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayCallable;
  private final UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysCallable;
  private final UnaryCallable<ListTargetVpnGatewaysHttpRequest, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysPagedCallable;

  public static final HttpJsonTargetVpnGatewayStub create(TargetVpnGatewaySettings settings) throws IOException {
    return new HttpJsonTargetVpnGatewayStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetVpnGatewayStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetVpnGatewayStub(TargetVpnGatewaySettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetVpnGatewayStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetVpnGatewayStub(TargetVpnGatewaySettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListTargetVpnGatewaysCallable = HttpJsonCallableFactory.create(directAggregatedListTargetVpnGatewaysCallable,settings.aggregatedListTargetVpnGatewaysSettings(), clientContext);
    this.aggregatedListTargetVpnGatewaysPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListTargetVpnGatewaysCallable,settings.aggregatedListTargetVpnGatewaysSettings(), clientContext);
    this.deleteTargetVpnGatewayCallable = HttpJsonCallableFactory.create(directDeleteTargetVpnGatewayCallable,settings.deleteTargetVpnGatewaySettings(), clientContext);
    this.getTargetVpnGatewayCallable = HttpJsonCallableFactory.create(directGetTargetVpnGatewayCallable,settings.getTargetVpnGatewaySettings(), clientContext);
    this.insertTargetVpnGatewayCallable = HttpJsonCallableFactory.create(directInsertTargetVpnGatewayCallable,settings.insertTargetVpnGatewaySettings(), clientContext);
    this.listTargetVpnGatewaysCallable = HttpJsonCallableFactory.create(directListTargetVpnGatewaysCallable,settings.listTargetVpnGatewaysSettings(), clientContext);
    this.listTargetVpnGatewaysPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListTargetVpnGatewaysCallable,settings.listTargetVpnGatewaysSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysPagedCallable() {
    return aggregatedListTargetVpnGatewaysPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysCallable() {
    return aggregatedListTargetVpnGatewaysCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayCallable() {
    return deleteTargetVpnGatewayCallable;
  }

  @BetaApi
  public UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayCallable() {
    return getTargetVpnGatewayCallable;
  }

  @BetaApi
  public UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayCallable() {
    return insertTargetVpnGatewayCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetVpnGatewaysHttpRequest, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysPagedCallable() {
    return listTargetVpnGatewaysPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysCallable() {
    return listTargetVpnGatewaysCallable;
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