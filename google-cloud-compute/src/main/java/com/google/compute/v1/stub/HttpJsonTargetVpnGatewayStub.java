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
import com.google.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest;
import com.google.compute.v1.DeleteTargetVpnGatewayHttpRequest;
import com.google.compute.v1.GetTargetVpnGatewayHttpRequest;
import com.google.compute.v1.InsertTargetVpnGatewayHttpRequest;
import com.google.compute.v1.ListTargetVpnGatewaysHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.TargetVpnGateway;
import com.google.compute.v1.TargetVpnGatewayAggregatedList;
import static com.google.compute.v1.TargetVpnGatewayClient.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.TargetVpnGatewayClient.ListTargetVpnGatewaysPagedResponse;
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
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonTargetVpnGatewayStub extends TargetVpnGatewayStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList>newBuilder()
          .setMethodName("compute.targetVpnGateways.aggregatedList")
          .setRequestInstance(AggregatedListTargetVpnGatewaysHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetVpnGatewayAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/targetVpnGateways")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayMethodDescriptor =
      ApiMethodDescriptor.<DeleteTargetVpnGatewayHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetVpnGateways.delete")
          .setRequestInstance(DeleteTargetVpnGatewayHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways/{targetVpnGateway}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetVpnGatewayName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("targetVpnGateway")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayMethodDescriptor =
      ApiMethodDescriptor.<GetTargetVpnGatewayHttpRequest, TargetVpnGateway>newBuilder()
          .setMethodName("compute.targetVpnGateways.get")
          .setRequestInstance(GetTargetVpnGatewayHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetVpnGateway.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways/{targetVpnGateway}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetVpnGatewayName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("targetVpnGateway")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayMethodDescriptor =
      ApiMethodDescriptor.<InsertTargetVpnGatewayHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetVpnGateways.insert")
          .setRequestInstance(InsertTargetVpnGatewayHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("region")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysMethodDescriptor =
      ApiMethodDescriptor.<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList>newBuilder()
          .setMethodName("compute.targetVpnGateways.list")
          .setRequestInstance(ListTargetVpnGatewaysHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetVpnGatewayList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/targetVpnGateways")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("region")
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysCallable;
  private final UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysPagedCallable;
  private final UnaryCallable<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayCallable;
  private final UnaryCallable<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayCallable;
  private final UnaryCallable<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayCallable;
  private final UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysCallable;
  private final UnaryCallable<ListTargetVpnGatewaysHttpRequest, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysPagedCallable;

  public static final HttpJsonTargetVpnGatewayStub create(TargetVpnGatewayStubSettings settings) throws IOException {
    return new HttpJsonTargetVpnGatewayStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetVpnGatewayStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetVpnGatewayStub(TargetVpnGatewayStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetVpnGatewayStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetVpnGatewayStub(TargetVpnGatewayStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> aggregatedListTargetVpnGatewaysTransportSettings =
        HttpJsonCallSettings.<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListTargetVpnGatewaysMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewayTransportSettings =
        HttpJsonCallSettings.<DeleteTargetVpnGatewayHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteTargetVpnGatewayMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewayTransportSettings =
        HttpJsonCallSettings.<GetTargetVpnGatewayHttpRequest, TargetVpnGateway>newBuilder()
            .setMethodDescriptor(getTargetVpnGatewayMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewayTransportSettings =
        HttpJsonCallSettings.<InsertTargetVpnGatewayHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertTargetVpnGatewayMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> listTargetVpnGatewaysTransportSettings =
        HttpJsonCallSettings.<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList>newBuilder()
            .setMethodDescriptor(listTargetVpnGatewaysMethodDescriptor)
            .build();

    this.aggregatedListTargetVpnGatewaysCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListTargetVpnGatewaysTransportSettings,settings.aggregatedListTargetVpnGatewaysSettings(), clientContext);
    this.aggregatedListTargetVpnGatewaysPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListTargetVpnGatewaysTransportSettings,settings.aggregatedListTargetVpnGatewaysSettings(), clientContext);
    this.deleteTargetVpnGatewayCallable = HttpJsonCallableFactory.createUnaryCallable(deleteTargetVpnGatewayTransportSettings,settings.deleteTargetVpnGatewaySettings(), clientContext);
    this.getTargetVpnGatewayCallable = HttpJsonCallableFactory.createUnaryCallable(getTargetVpnGatewayTransportSettings,settings.getTargetVpnGatewaySettings(), clientContext);
    this.insertTargetVpnGatewayCallable = HttpJsonCallableFactory.createUnaryCallable(insertTargetVpnGatewayTransportSettings,settings.insertTargetVpnGatewaySettings(), clientContext);
    this.listTargetVpnGatewaysCallable = HttpJsonCallableFactory.createUnaryCallable(listTargetVpnGatewaysTransportSettings,settings.listTargetVpnGatewaysSettings(), clientContext);
    this.listTargetVpnGatewaysPagedCallable = HttpJsonCallableFactory.createPagedCallable(listTargetVpnGatewaysTransportSettings,settings.listTargetVpnGatewaysSettings(), clientContext);

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