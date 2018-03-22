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
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.AggregatedListVpnTunnelsHttpRequest;
import com.google.compute.v1.DeleteVpnTunnelHttpRequest;
import com.google.compute.v1.GetVpnTunnelHttpRequest;
import com.google.compute.v1.InsertVpnTunnelHttpRequest;
import com.google.compute.v1.ListVpnTunnelsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.VpnTunnel;
import com.google.compute.v1.VpnTunnelAggregatedList;
import static com.google.compute.v1.VpnTunnelClient.AggregatedListVpnTunnelsPagedResponse;
import static com.google.compute.v1.VpnTunnelClient.ListVpnTunnelsPagedResponse;
import com.google.compute.v1.VpnTunnelList;
import com.google.compute.v1.VpnTunnelName;
import com.google.compute.v1.VpnTunnelSettings;
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
public class HttpJsonVpnTunnelStub extends VpnTunnelStub {
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> aggregatedListVpnTunnelsMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList>newBuilder()
          .setMethodName("compute.vpnTunnels.aggregatedList")
          .setRequestInstance(AggregatedListVpnTunnelsHttpRequest.getDefaultInstance())
          .setResponseInstance(VpnTunnelAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/vpnTunnels")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelMethodDescriptor =
      ApiMethodDescriptor.<DeleteVpnTunnelHttpRequest, Operation>newBuilder()
          .setMethodName("compute.vpnTunnels.delete")
          .setRequestInstance(DeleteVpnTunnelHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels/{vpnTunnel}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(VpnTunnelName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("vpnTunnel")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelMethodDescriptor =
      ApiMethodDescriptor.<GetVpnTunnelHttpRequest, VpnTunnel>newBuilder()
          .setMethodName("compute.vpnTunnels.get")
          .setRequestInstance(GetVpnTunnelHttpRequest.getDefaultInstance())
          .setResponseInstance(VpnTunnel.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels/{vpnTunnel}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(VpnTunnelName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("vpnTunnel")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelMethodDescriptor =
      ApiMethodDescriptor.<InsertVpnTunnelHttpRequest, Operation>newBuilder()
          .setMethodName("compute.vpnTunnels.insert")
          .setRequestInstance(InsertVpnTunnelHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("region")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListVpnTunnelsHttpRequest, VpnTunnelList> listVpnTunnelsMethodDescriptor =
      ApiMethodDescriptor.<ListVpnTunnelsHttpRequest, VpnTunnelList>newBuilder()
          .setMethodName("compute.vpnTunnels.list")
          .setRequestInstance(ListVpnTunnelsHttpRequest.getDefaultInstance())
          .setResponseInstance(VpnTunnelList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("region")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> aggregatedListVpnTunnelsCallable;
  private final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsPagedCallable;
  private final UnaryCallable<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelCallable;
  private final UnaryCallable<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelCallable;
  private final UnaryCallable<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelCallable;
  private final UnaryCallable<ListVpnTunnelsHttpRequest, VpnTunnelList> listVpnTunnelsCallable;
  private final UnaryCallable<ListVpnTunnelsHttpRequest, ListVpnTunnelsPagedResponse> listVpnTunnelsPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;
  public static final HttpJsonVpnTunnelStub create(VpnTunnelStubSettings settings) throws IOException {
    return new HttpJsonVpnTunnelStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonVpnTunnelStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonVpnTunnelStub(VpnTunnelStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonVpnTunnelStub create(ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonVpnTunnelStub(VpnTunnelStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonVpnTunnelStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonVpnTunnelStub(VpnTunnelStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonVpnTunnelCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonVpnTunnelStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonVpnTunnelStub(VpnTunnelStubSettings settings, ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> aggregatedListVpnTunnelsTransportSettings =
        HttpJsonCallSettings.<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListVpnTunnelsMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelTransportSettings =
        HttpJsonCallSettings.<DeleteVpnTunnelHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteVpnTunnelMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelTransportSettings =
        HttpJsonCallSettings.<GetVpnTunnelHttpRequest, VpnTunnel>newBuilder()
            .setMethodDescriptor(getVpnTunnelMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelTransportSettings =
        HttpJsonCallSettings.<InsertVpnTunnelHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertVpnTunnelMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListVpnTunnelsHttpRequest, VpnTunnelList> listVpnTunnelsTransportSettings =
        HttpJsonCallSettings.<ListVpnTunnelsHttpRequest, VpnTunnelList>newBuilder()
            .setMethodDescriptor(listVpnTunnelsMethodDescriptor)
            .build();

    this.aggregatedListVpnTunnelsCallable = callableFactory.createUnaryCallable(aggregatedListVpnTunnelsTransportSettings,settings.aggregatedListVpnTunnelsSettings(), clientContext);
    this.aggregatedListVpnTunnelsPagedCallable = callableFactory.createPagedCallable(aggregatedListVpnTunnelsTransportSettings,settings.aggregatedListVpnTunnelsSettings(), clientContext);
    this.deleteVpnTunnelCallable = callableFactory.createUnaryCallable(deleteVpnTunnelTransportSettings,settings.deleteVpnTunnelSettings(), clientContext);
    this.getVpnTunnelCallable = callableFactory.createUnaryCallable(getVpnTunnelTransportSettings,settings.getVpnTunnelSettings(), clientContext);
    this.insertVpnTunnelCallable = callableFactory.createUnaryCallable(insertVpnTunnelTransportSettings,settings.insertVpnTunnelSettings(), clientContext);
    this.listVpnTunnelsCallable = callableFactory.createUnaryCallable(listVpnTunnelsTransportSettings,settings.listVpnTunnelsSettings(), clientContext);
    this.listVpnTunnelsPagedCallable = callableFactory.createPagedCallable(listVpnTunnelsTransportSettings,settings.listVpnTunnelsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListVpnTunnelsHttpRequest, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsPagedCallable() {
    return aggregatedListVpnTunnelsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> aggregatedListVpnTunnelsCallable() {
    return aggregatedListVpnTunnelsCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelCallable() {
    return deleteVpnTunnelCallable;
  }

  @BetaApi
  public UnaryCallable<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelCallable() {
    return getVpnTunnelCallable;
  }

  @BetaApi
  public UnaryCallable<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelCallable() {
    return insertVpnTunnelCallable;
  }

  @BetaApi
  public UnaryCallable<ListVpnTunnelsHttpRequest, ListVpnTunnelsPagedResponse> listVpnTunnelsPagedCallable() {
    return listVpnTunnelsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListVpnTunnelsHttpRequest, VpnTunnelList> listVpnTunnelsCallable() {
    return listVpnTunnelsCallable;
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