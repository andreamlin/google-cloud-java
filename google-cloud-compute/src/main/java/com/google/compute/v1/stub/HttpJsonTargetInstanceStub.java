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
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.AggregatedListTargetInstancesHttpRequest;
import com.google.compute.v1.DeleteTargetInstanceHttpRequest;
import com.google.compute.v1.GetTargetInstanceHttpRequest;
import com.google.compute.v1.InsertTargetInstanceHttpRequest;
import com.google.compute.v1.ListTargetInstancesHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.TargetInstance;
import com.google.compute.v1.TargetInstanceAggregatedList;
import static com.google.compute.v1.TargetInstanceClient.AggregatedListTargetInstancesPagedResponse;
import static com.google.compute.v1.TargetInstanceClient.ListTargetInstancesPagedResponse;
import com.google.compute.v1.TargetInstanceList;
import com.google.compute.v1.TargetInstanceName;
import com.google.compute.v1.TargetInstanceSettings;
import com.google.compute.v1.ZoneName;
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
public class HttpJsonTargetInstanceStub extends TargetInstanceStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> aggregatedListTargetInstancesMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList>newBuilder()
          .setMethodName("compute.targetInstances.aggregatedList")
          .setRequestInstance(AggregatedListTargetInstancesHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetInstanceAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/targetInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<DeleteTargetInstanceHttpRequest, Operation> deleteTargetInstanceMethodDescriptor =
      ApiMethodDescriptor.<DeleteTargetInstanceHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetInstances.delete")
          .setRequestInstance(DeleteTargetInstanceHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances/{targetInstance}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<GetTargetInstanceHttpRequest, TargetInstance> getTargetInstanceMethodDescriptor =
      ApiMethodDescriptor.<GetTargetInstanceHttpRequest, TargetInstance>newBuilder()
          .setMethodName("compute.targetInstances.get")
          .setRequestInstance(GetTargetInstanceHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetInstance.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances/{targetInstance}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<InsertTargetInstanceHttpRequest, Operation> insertTargetInstanceMethodDescriptor =
      ApiMethodDescriptor.<InsertTargetInstanceHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetInstances.insert")
          .setRequestInstance(InsertTargetInstanceHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListTargetInstancesHttpRequest, TargetInstanceList> listTargetInstancesMethodDescriptor =
      ApiMethodDescriptor.<ListTargetInstancesHttpRequest, TargetInstanceList>newBuilder()
          .setMethodName("compute.targetInstances.list")
          .setRequestInstance(ListTargetInstancesHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetInstanceList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/targetInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> aggregatedListTargetInstancesCallable;
  private final UnaryCallable<AggregatedListTargetInstancesHttpRequest, AggregatedListTargetInstancesPagedResponse> aggregatedListTargetInstancesPagedCallable;
  private final UnaryCallable<DeleteTargetInstanceHttpRequest, Operation> deleteTargetInstanceCallable;
  private final UnaryCallable<GetTargetInstanceHttpRequest, TargetInstance> getTargetInstanceCallable;
  private final UnaryCallable<InsertTargetInstanceHttpRequest, Operation> insertTargetInstanceCallable;
  private final UnaryCallable<ListTargetInstancesHttpRequest, TargetInstanceList> listTargetInstancesCallable;
  private final UnaryCallable<ListTargetInstancesHttpRequest, ListTargetInstancesPagedResponse> listTargetInstancesPagedCallable;

  public static final HttpJsonTargetInstanceStub create(TargetInstanceStubSettings settings) throws IOException {
    return new HttpJsonTargetInstanceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetInstanceStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetInstanceStub(TargetInstanceStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetInstanceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetInstanceStub(TargetInstanceStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList> aggregatedListTargetInstancesTransportSettings =
        HttpJsonCallSettings.<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListTargetInstancesMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteTargetInstanceHttpRequest, Operation> deleteTargetInstanceTransportSettings =
        HttpJsonCallSettings.<DeleteTargetInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteTargetInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetTargetInstanceHttpRequest, TargetInstance> getTargetInstanceTransportSettings =
        HttpJsonCallSettings.<GetTargetInstanceHttpRequest, TargetInstance>newBuilder()
            .setMethodDescriptor(getTargetInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertTargetInstanceHttpRequest, Operation> insertTargetInstanceTransportSettings =
        HttpJsonCallSettings.<InsertTargetInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertTargetInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListTargetInstancesHttpRequest, TargetInstanceList> listTargetInstancesTransportSettings =
        HttpJsonCallSettings.<ListTargetInstancesHttpRequest, TargetInstanceList>newBuilder()
            .setMethodDescriptor(listTargetInstancesMethodDescriptor)
            .build();

    this.aggregatedListTargetInstancesCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListTargetInstancesTransportSettings,settings.aggregatedListTargetInstancesSettings(), clientContext);
    this.aggregatedListTargetInstancesPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListTargetInstancesTransportSettings,settings.aggregatedListTargetInstancesSettings(), clientContext);
    this.deleteTargetInstanceCallable = HttpJsonCallableFactory.createUnaryCallable(deleteTargetInstanceTransportSettings,settings.deleteTargetInstanceSettings(), clientContext);
    this.getTargetInstanceCallable = HttpJsonCallableFactory.createUnaryCallable(getTargetInstanceTransportSettings,settings.getTargetInstanceSettings(), clientContext);
    this.insertTargetInstanceCallable = HttpJsonCallableFactory.createUnaryCallable(insertTargetInstanceTransportSettings,settings.insertTargetInstanceSettings(), clientContext);
    this.listTargetInstancesCallable = HttpJsonCallableFactory.createUnaryCallable(listTargetInstancesTransportSettings,settings.listTargetInstancesSettings(), clientContext);
    this.listTargetInstancesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listTargetInstancesTransportSettings,settings.listTargetInstancesSettings(), clientContext);

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