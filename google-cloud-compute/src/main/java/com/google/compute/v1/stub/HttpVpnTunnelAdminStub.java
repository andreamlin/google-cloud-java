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
import com.google.compute.v1.AggregatedListVpnTunnelsHttpRequest;
import com.google.compute.v1.DeleteVpnTunnelHttpRequest;
import com.google.compute.v1.GetVpnTunnelHttpRequest;
import com.google.compute.v1.InsertVpnTunnelHttpRequest;
import com.google.compute.v1.ListVpnTunnelsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListVpnTunnelsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListVpnTunnelsPagedResponse;
import com.google.compute.v1.VpnTunnel;
import com.google.compute.v1.VpnTunnelAdminSettings;
import com.google.compute.v1.VpnTunnelAggregatedList;
import com.google.compute.v1.VpnTunnelList;
import com.google.compute.v1.VpnTunnelName;
import com.google.compute.v1.VpnTunnelsProjectName;
import com.google.compute.v1.VpnTunnelsRegionName;
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
public class HttpVpnTunnelAdminStub extends VpnTunnelAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> directAggregatedListVpnTunnelsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList>newBuilder()
              .setMethodName("compute.vpnTunnels.aggregatedList")
              .setRequestInstance(AggregatedListVpnTunnelsHttpRequest.getDefaultInstance())
              .setResponseInstance(VpnTunnelAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/vpnTunnels")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteVpnTunnelHttpRequest, Operation> directDeleteVpnTunnelCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteVpnTunnelHttpRequest, Operation>newBuilder()
              .setMethodName("compute.vpnTunnels.delete")
              .setRequestInstance(DeleteVpnTunnelHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels/{vpnTunnel}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "vpnTunnel"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetVpnTunnelHttpRequest, VpnTunnel> directGetVpnTunnelCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetVpnTunnelHttpRequest, VpnTunnel>newBuilder()
              .setMethodName("compute.vpnTunnels.get")
              .setRequestInstance(GetVpnTunnelHttpRequest.getDefaultInstance())
              .setResponseInstance(VpnTunnel.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels/{vpnTunnel}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "vpnTunnel"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertVpnTunnelHttpRequest, Operation> directInsertVpnTunnelCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertVpnTunnelHttpRequest, Operation>newBuilder()
              .setMethodName("compute.vpnTunnels.insert")
              .setRequestInstance(InsertVpnTunnelHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListVpnTunnelsHttpRequest, VpnTunnelList> directListVpnTunnelsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListVpnTunnelsHttpRequest, VpnTunnelList>newBuilder()
              .setMethodName("compute.vpnTunnels.list")
              .setRequestInstance(ListVpnTunnelsHttpRequest.getDefaultInstance())
              .setResponseInstance(VpnTunnelList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/vpnTunnels")
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

  private final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> aggregatedListVpnTunnelsCallable;
  private final UnaryCallable<AggregatedListVpnTunnelsHttpRequest, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsPagedCallable;
  private final UnaryCallable<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelCallable;
  private final UnaryCallable<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelCallable;
  private final UnaryCallable<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelCallable;
  private final UnaryCallable<ListVpnTunnelsHttpRequest, VpnTunnelList> listVpnTunnelsCallable;
  private final UnaryCallable<ListVpnTunnelsHttpRequest, ListVpnTunnelsPagedResponse> listVpnTunnelsPagedCallable;

  public static final HttpVpnTunnelAdminStub create(VpnTunnelAdminSettings settings) throws IOException {
    return new HttpVpnTunnelAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpVpnTunnelAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpVpnTunnelAdminStub(VpnTunnelAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpVpnTunnelAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpVpnTunnelAdminStub(VpnTunnelAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListVpnTunnelsCallable = HttpJsonCallableFactory.create(directAggregatedListVpnTunnelsCallable,settings.aggregatedListVpnTunnelsSettings(), clientContext);
    this.aggregatedListVpnTunnelsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListVpnTunnelsCallable,settings.aggregatedListVpnTunnelsSettings(), clientContext);
    this.deleteVpnTunnelCallable = HttpJsonCallableFactory.create(directDeleteVpnTunnelCallable,settings.deleteVpnTunnelSettings(), clientContext);
    this.getVpnTunnelCallable = HttpJsonCallableFactory.create(directGetVpnTunnelCallable,settings.getVpnTunnelSettings(), clientContext);
    this.insertVpnTunnelCallable = HttpJsonCallableFactory.create(directInsertVpnTunnelCallable,settings.insertVpnTunnelSettings(), clientContext);
    this.listVpnTunnelsCallable = HttpJsonCallableFactory.create(directListVpnTunnelsCallable,settings.listVpnTunnelsSettings(), clientContext);
    this.listVpnTunnelsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListVpnTunnelsCallable,settings.listVpnTunnelsSettings(), clientContext);

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