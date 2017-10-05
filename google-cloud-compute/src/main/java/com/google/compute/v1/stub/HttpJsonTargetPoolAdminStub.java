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
import com.google.compute.v1.AddHealthCheckTargetPoolHttpRequest;
import com.google.compute.v1.AddInstanceTargetPoolHttpRequest;
import com.google.compute.v1.AggregatedListTargetPoolsHttpRequest;
import com.google.compute.v1.DeleteTargetPoolHttpRequest;
import com.google.compute.v1.GetHealthTargetPoolHttpRequest;
import com.google.compute.v1.GetTargetPoolHttpRequest;
import com.google.compute.v1.InsertTargetPoolHttpRequest;
import com.google.compute.v1.InstanceReference;
import com.google.compute.v1.ListTargetPoolsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetPoolsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetPoolsPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.RemoveHealthCheckTargetPoolHttpRequest;
import com.google.compute.v1.RemoveInstanceTargetPoolHttpRequest;
import com.google.compute.v1.SetBackupTargetPoolHttpRequest;
import com.google.compute.v1.TargetPool;
import com.google.compute.v1.TargetPoolAdminSettings;
import com.google.compute.v1.TargetPoolAggregatedList;
import com.google.compute.v1.TargetPoolInstanceHealth;
import com.google.compute.v1.TargetPoolList;
import com.google.compute.v1.TargetPoolName;
import com.google.compute.v1.TargetPoolsAddHealthCheckRequest;
import com.google.compute.v1.TargetPoolsAddInstanceRequest;
import com.google.compute.v1.TargetPoolsRemoveHealthCheckRequest;
import com.google.compute.v1.TargetPoolsRemoveInstanceRequest;
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
public class HttpJsonTargetPoolAdminStub extends TargetPoolAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AddHealthCheckTargetPoolHttpRequest, Operation> directAddHealthCheckTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AddHealthCheckTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.addHealthCheck")
              .setRequestInstance(AddHealthCheckTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/addHealthCheck")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<AddInstanceTargetPoolHttpRequest, Operation> directAddInstanceTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AddInstanceTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.addInstance")
              .setRequestInstance(AddInstanceTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/addInstance")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> directAggregatedListTargetPoolsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList>newBuilder()
              .setMethodName("compute.targetPools.aggregatedList")
              .setRequestInstance(AggregatedListTargetPoolsHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetPoolAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/targetPools")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteTargetPoolHttpRequest, Operation> directDeleteTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.delete")
              .setRequestInstance(DeleteTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetTargetPoolHttpRequest, TargetPool> directGetTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetTargetPoolHttpRequest, TargetPool>newBuilder()
              .setMethodName("compute.targetPools.get")
              .setRequestInstance(GetTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetPool.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> directGetHealthTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth>newBuilder()
              .setMethodName("compute.targetPools.getHealth")
              .setRequestInstance(GetHealthTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetPoolInstanceHealth.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/getHealth")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<InsertTargetPoolHttpRequest, Operation> directInsertTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.insert")
              .setRequestInstance(InsertTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListTargetPoolsHttpRequest, TargetPoolList> directListTargetPoolsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListTargetPoolsHttpRequest, TargetPoolList>newBuilder()
              .setMethodName("compute.targetPools.list")
              .setRequestInstance(ListTargetPoolsHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetPoolList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<RemoveHealthCheckTargetPoolHttpRequest, Operation> directRemoveHealthCheckTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<RemoveHealthCheckTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.removeHealthCheck")
              .setRequestInstance(RemoveHealthCheckTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/removeHealthCheck")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<RemoveInstanceTargetPoolHttpRequest, Operation> directRemoveInstanceTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<RemoveInstanceTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.removeInstance")
              .setRequestInstance(RemoveInstanceTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/removeInstance")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetBackupTargetPoolHttpRequest, Operation> directSetBackupTargetPoolCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetBackupTargetPoolHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetPools.setBackup")
              .setRequestInstance(SetBackupTargetPoolHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/setBackup")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "targetPool"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "failoverRatio"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolCallable;
  private final UnaryCallable<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolCallable;
  private final UnaryCallable<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> aggregatedListTargetPoolsCallable;
  private final UnaryCallable<AggregatedListTargetPoolsHttpRequest, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsPagedCallable;
  private final UnaryCallable<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolCallable;
  private final UnaryCallable<GetTargetPoolHttpRequest, TargetPool> getTargetPoolCallable;
  private final UnaryCallable<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolCallable;
  private final UnaryCallable<InsertTargetPoolHttpRequest, Operation> insertTargetPoolCallable;
  private final UnaryCallable<ListTargetPoolsHttpRequest, TargetPoolList> listTargetPoolsCallable;
  private final UnaryCallable<ListTargetPoolsHttpRequest, ListTargetPoolsPagedResponse> listTargetPoolsPagedCallable;
  private final UnaryCallable<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolCallable;
  private final UnaryCallable<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolCallable;
  private final UnaryCallable<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolCallable;

  public static final HttpJsonTargetPoolAdminStub create(TargetPoolAdminSettings settings) throws IOException {
    return new HttpJsonTargetPoolAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetPoolAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetPoolAdminStub(TargetPoolAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetPoolAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetPoolAdminStub(TargetPoolAdminSettings settings, ClientContext clientContext) throws IOException {

    this.addHealthCheckTargetPoolCallable = HttpJsonCallableFactory.create(directAddHealthCheckTargetPoolCallable,settings.addHealthCheckTargetPoolSettings(), clientContext);
    this.addInstanceTargetPoolCallable = HttpJsonCallableFactory.create(directAddInstanceTargetPoolCallable,settings.addInstanceTargetPoolSettings(), clientContext);
    this.aggregatedListTargetPoolsCallable = HttpJsonCallableFactory.create(directAggregatedListTargetPoolsCallable,settings.aggregatedListTargetPoolsSettings(), clientContext);
    this.aggregatedListTargetPoolsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListTargetPoolsCallable,settings.aggregatedListTargetPoolsSettings(), clientContext);
    this.deleteTargetPoolCallable = HttpJsonCallableFactory.create(directDeleteTargetPoolCallable,settings.deleteTargetPoolSettings(), clientContext);
    this.getTargetPoolCallable = HttpJsonCallableFactory.create(directGetTargetPoolCallable,settings.getTargetPoolSettings(), clientContext);
    this.getHealthTargetPoolCallable = HttpJsonCallableFactory.create(directGetHealthTargetPoolCallable,settings.getHealthTargetPoolSettings(), clientContext);
    this.insertTargetPoolCallable = HttpJsonCallableFactory.create(directInsertTargetPoolCallable,settings.insertTargetPoolSettings(), clientContext);
    this.listTargetPoolsCallable = HttpJsonCallableFactory.create(directListTargetPoolsCallable,settings.listTargetPoolsSettings(), clientContext);
    this.listTargetPoolsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListTargetPoolsCallable,settings.listTargetPoolsSettings(), clientContext);
    this.removeHealthCheckTargetPoolCallable = HttpJsonCallableFactory.create(directRemoveHealthCheckTargetPoolCallable,settings.removeHealthCheckTargetPoolSettings(), clientContext);
    this.removeInstanceTargetPoolCallable = HttpJsonCallableFactory.create(directRemoveInstanceTargetPoolCallable,settings.removeInstanceTargetPoolSettings(), clientContext);
    this.setBackupTargetPoolCallable = HttpJsonCallableFactory.create(directSetBackupTargetPoolCallable,settings.setBackupTargetPoolSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolCallable() {
    return addHealthCheckTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolCallable() {
    return addInstanceTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetPoolsHttpRequest, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsPagedCallable() {
    return aggregatedListTargetPoolsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> aggregatedListTargetPoolsCallable() {
    return aggregatedListTargetPoolsCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolCallable() {
    return deleteTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<GetTargetPoolHttpRequest, TargetPool> getTargetPoolCallable() {
    return getTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolCallable() {
    return getHealthTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<InsertTargetPoolHttpRequest, Operation> insertTargetPoolCallable() {
    return insertTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetPoolsHttpRequest, ListTargetPoolsPagedResponse> listTargetPoolsPagedCallable() {
    return listTargetPoolsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetPoolsHttpRequest, TargetPoolList> listTargetPoolsCallable() {
    return listTargetPoolsCallable;
  }

  @BetaApi
  public UnaryCallable<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolCallable() {
    return removeHealthCheckTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolCallable() {
    return removeInstanceTargetPoolCallable;
  }

  @BetaApi
  public UnaryCallable<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolCallable() {
    return setBackupTargetPoolCallable;
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