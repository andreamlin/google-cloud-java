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
import com.google.compute.v1.AggregatedListTargetInstancesHttpRequest;
import com.google.compute.v1.DeleteTargetInstanceHttpRequest;
import com.google.compute.v1.GetTargetInstanceHttpRequest;
import com.google.compute.v1.InsertTargetInstanceHttpRequest;
import com.google.compute.v1.ListTargetInstancesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetInstancesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.TargetInstance;
import com.google.compute.v1.TargetInstanceAggregatedList;
import com.google.compute.v1.TargetInstanceList;
import com.google.compute.v1.TargetInstanceName;
import com.google.compute.v1.TargetInstanceSettings;
import com.google.compute.v1.ZoneName;
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
public class HttpJsonTargetInstanceStub extends TargetInstanceStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> directAggregatedListTargetInstancesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList>newBuilder()
              .setMethodName("compute.targetInstances.aggregatedList")
              .setRequestInstance(AggregatedListTargetInstancesHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetInstanceAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/targetInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteTargetInstanceHttpRequest, Operation> directDeleteTargetInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteTargetInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetInstances.delete")
              .setRequestInstance(DeleteTargetInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances/{targetInstance}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetInstance",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetTargetInstanceHttpRequest, TargetInstance> directGetTargetInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetTargetInstanceHttpRequest, TargetInstance>newBuilder()
              .setMethodName("compute.targetInstances.get")
              .setRequestInstance(GetTargetInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetInstance.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances/{targetInstance}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetInstance",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertTargetInstanceHttpRequest, Operation> directInsertTargetInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertTargetInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetInstances.insert")
              .setRequestInstance(InsertTargetInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListTargetInstancesHttpRequest, TargetInstanceList> directListTargetInstancesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListTargetInstancesHttpRequest, TargetInstanceList>newBuilder()
              .setMethodName("compute.targetInstances.list")
              .setRequestInstance(ListTargetInstancesHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetInstanceList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> aggregatedListTargetInstancesCallable;
  private final UnaryCallable<AggregatedListTargetInstancesHttpRequest, AggregatedListTargetInstancesPagedResponse> aggregatedListTargetInstancesPagedCallable;
  private final UnaryCallable<DeleteTargetInstanceHttpRequest, Operation> deleteTargetInstanceCallable;
  private final UnaryCallable<GetTargetInstanceHttpRequest, TargetInstance> getTargetInstanceCallable;
  private final UnaryCallable<InsertTargetInstanceHttpRequest, Operation> insertTargetInstanceCallable;
  private final UnaryCallable<ListTargetInstancesHttpRequest, TargetInstanceList> listTargetInstancesCallable;
  private final UnaryCallable<ListTargetInstancesHttpRequest, ListTargetInstancesPagedResponse> listTargetInstancesPagedCallable;

  public static final HttpJsonTargetInstanceStub create(TargetInstanceSettings settings) throws IOException {
    return new HttpJsonTargetInstanceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetInstanceStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetInstanceStub(TargetInstanceSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetInstanceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetInstanceStub(TargetInstanceSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListTargetInstancesCallable = HttpJsonCallableFactory.create(directAggregatedListTargetInstancesCallable,settings.aggregatedListTargetInstancesSettings(), clientContext);
    this.aggregatedListTargetInstancesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListTargetInstancesCallable,settings.aggregatedListTargetInstancesSettings(), clientContext);
    this.deleteTargetInstanceCallable = HttpJsonCallableFactory.create(directDeleteTargetInstanceCallable,settings.deleteTargetInstanceSettings(), clientContext);
    this.getTargetInstanceCallable = HttpJsonCallableFactory.create(directGetTargetInstanceCallable,settings.getTargetInstanceSettings(), clientContext);
    this.insertTargetInstanceCallable = HttpJsonCallableFactory.create(directInsertTargetInstanceCallable,settings.insertTargetInstanceSettings(), clientContext);
    this.listTargetInstancesCallable = HttpJsonCallableFactory.create(directListTargetInstancesCallable,settings.listTargetInstancesSettings(), clientContext);
    this.listTargetInstancesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListTargetInstancesCallable,settings.listTargetInstancesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetInstancesHttpRequest, AggregatedListTargetInstancesPagedResponse> aggregatedListTargetInstancesPagedCallable() {
    return aggregatedListTargetInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> aggregatedListTargetInstancesCallable() {
    return aggregatedListTargetInstancesCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteTargetInstanceHttpRequest, Operation> deleteTargetInstanceCallable() {
    return deleteTargetInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<GetTargetInstanceHttpRequest, TargetInstance> getTargetInstanceCallable() {
    return getTargetInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<InsertTargetInstanceHttpRequest, Operation> insertTargetInstanceCallable() {
    return insertTargetInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetInstancesHttpRequest, ListTargetInstancesPagedResponse> listTargetInstancesPagedCallable() {
    return listTargetInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetInstancesHttpRequest, TargetInstanceList> listTargetInstancesCallable() {
    return listTargetInstancesCallable;
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