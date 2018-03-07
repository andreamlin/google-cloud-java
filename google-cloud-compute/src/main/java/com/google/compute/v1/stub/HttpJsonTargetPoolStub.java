/*
 * Copyright 2018 Google LLC
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
package com.google.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
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
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.RemoveHealthCheckTargetPoolHttpRequest;
import com.google.compute.v1.RemoveInstanceTargetPoolHttpRequest;
import com.google.compute.v1.SetBackupTargetPoolHttpRequest;
import com.google.compute.v1.TargetPool;
import com.google.compute.v1.TargetPoolAggregatedList;
import static com.google.compute.v1.TargetPoolClient.AggregatedListTargetPoolsPagedResponse;
import static com.google.compute.v1.TargetPoolClient.ListTargetPoolsPagedResponse;
import com.google.compute.v1.TargetPoolInstanceHealth;
import com.google.compute.v1.TargetPoolList;
import com.google.compute.v1.TargetPoolName;
import com.google.compute.v1.TargetPoolSettings;
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
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonTargetPoolStub extends TargetPoolStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @InternalApi
  public static final ApiMethodDescriptor<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<AddHealthCheckTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.addHealthCheck")
          .setRequestInstance(AddHealthCheckTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/addHealthCheck")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<AddInstanceTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.addInstance")
          .setRequestInstance(AddInstanceTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/addInstance")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> aggregatedListTargetPoolsMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList>newBuilder()
          .setMethodName("compute.targetPools.aggregatedList")
          .setRequestInstance(AggregatedListTargetPoolsHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetPoolAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/targetPools")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<DeleteTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.delete")
          .setRequestInstance(DeleteTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetTargetPoolHttpRequest, TargetPool> getTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<GetTargetPoolHttpRequest, TargetPool>newBuilder()
          .setMethodName("compute.targetPools.get")
          .setRequestInstance(GetTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetPool.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth>newBuilder()
          .setMethodName("compute.targetPools.getHealth")
          .setRequestInstance(GetHealthTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetPoolInstanceHealth.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/getHealth")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertTargetPoolHttpRequest, Operation> insertTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<InsertTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.insert")
          .setRequestInstance(InsertTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("region")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListTargetPoolsHttpRequest, TargetPoolList> listTargetPoolsMethodDescriptor =
      ApiMethodDescriptor.<ListTargetPoolsHttpRequest, TargetPoolList>newBuilder()
          .setMethodName("compute.targetPools.list")
          .setRequestInstance(ListTargetPoolsHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetPoolList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("region")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<RemoveHealthCheckTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.removeHealthCheck")
          .setRequestInstance(RemoveHealthCheckTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/removeHealthCheck")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<RemoveInstanceTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.removeInstance")
          .setRequestInstance(RemoveInstanceTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/removeInstance")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetPool")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolMethodDescriptor =
      ApiMethodDescriptor.<SetBackupTargetPoolHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetPools.setBackup")
          .setRequestInstance(SetBackupTargetPoolHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetPools/{targetPool}/setBackup")
          .setQueryParams(Sets.<String>newHashSet(
                             "failoverRatio"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetPoolName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetPool")
          .build();

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

  public static final HttpJsonTargetPoolStub create(TargetPoolStubSettings settings) throws IOException {
    return new HttpJsonTargetPoolStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetPoolStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetPoolStub(TargetPoolStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetPoolStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetPoolStub(TargetPoolStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolTransportSettings =
        HttpJsonCallSettings.<AddHealthCheckTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(addHealthCheckTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolTransportSettings =
        HttpJsonCallSettings.<AddInstanceTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(addInstanceTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> aggregatedListTargetPoolsTransportSettings =
        HttpJsonCallSettings.<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListTargetPoolsMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolTransportSettings =
        HttpJsonCallSettings.<DeleteTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetTargetPoolHttpRequest, TargetPool> getTargetPoolTransportSettings =
        HttpJsonCallSettings.<GetTargetPoolHttpRequest, TargetPool>newBuilder()
            .setMethodDescriptor(getTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolTransportSettings =
        HttpJsonCallSettings.<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth>newBuilder()
            .setMethodDescriptor(getHealthTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertTargetPoolHttpRequest, Operation> insertTargetPoolTransportSettings =
        HttpJsonCallSettings.<InsertTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListTargetPoolsHttpRequest, TargetPoolList> listTargetPoolsTransportSettings =
        HttpJsonCallSettings.<ListTargetPoolsHttpRequest, TargetPoolList>newBuilder()
            .setMethodDescriptor(listTargetPoolsMethodDescriptor)
            .build();
    HttpJsonCallSettings<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolTransportSettings =
        HttpJsonCallSettings.<RemoveHealthCheckTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(removeHealthCheckTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolTransportSettings =
        HttpJsonCallSettings.<RemoveInstanceTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(removeInstanceTargetPoolMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolTransportSettings =
        HttpJsonCallSettings.<SetBackupTargetPoolHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setBackupTargetPoolMethodDescriptor)
            .build();

    this.addHealthCheckTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(addHealthCheckTargetPoolTransportSettings,settings.addHealthCheckTargetPoolSettings(), clientContext);
    this.addInstanceTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(addInstanceTargetPoolTransportSettings,settings.addInstanceTargetPoolSettings(), clientContext);
    this.aggregatedListTargetPoolsCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListTargetPoolsTransportSettings,settings.aggregatedListTargetPoolsSettings(), clientContext);
    this.aggregatedListTargetPoolsPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListTargetPoolsTransportSettings,settings.aggregatedListTargetPoolsSettings(), clientContext);
    this.deleteTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(deleteTargetPoolTransportSettings,settings.deleteTargetPoolSettings(), clientContext);
    this.getTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(getTargetPoolTransportSettings,settings.getTargetPoolSettings(), clientContext);
    this.getHealthTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(getHealthTargetPoolTransportSettings,settings.getHealthTargetPoolSettings(), clientContext);
    this.insertTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(insertTargetPoolTransportSettings,settings.insertTargetPoolSettings(), clientContext);
    this.listTargetPoolsCallable = HttpJsonCallableFactory.createUnaryCallable(listTargetPoolsTransportSettings,settings.listTargetPoolsSettings(), clientContext);
    this.listTargetPoolsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listTargetPoolsTransportSettings,settings.listTargetPoolsSettings(), clientContext);
    this.removeHealthCheckTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(removeHealthCheckTargetPoolTransportSettings,settings.removeHealthCheckTargetPoolSettings(), clientContext);
    this.removeInstanceTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(removeInstanceTargetPoolTransportSettings,settings.removeInstanceTargetPoolSettings(), clientContext);
    this.setBackupTargetPoolCallable = HttpJsonCallableFactory.createUnaryCallable(setBackupTargetPoolTransportSettings,settings.setBackupTargetPoolSettings(), clientContext);

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