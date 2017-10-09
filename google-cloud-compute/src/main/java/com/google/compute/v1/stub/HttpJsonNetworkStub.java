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
import com.google.compute.v1.DeleteNetworkHttpRequest;
import com.google.compute.v1.GetNetworkHttpRequest;
import com.google.compute.v1.InsertNetworkHttpRequest;
import com.google.compute.v1.ListNetworksHttpRequest;
import com.google.compute.v1.Network;
import com.google.compute.v1.NetworkList;
import com.google.compute.v1.NetworkName;
import com.google.compute.v1.NetworkSettings;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListNetworksPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SwitchToCustomModeNetworkHttpRequest;
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
public class HttpJsonNetworkStub extends NetworkStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteNetworkHttpRequest, Operation> directDeleteNetworkCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteNetworkHttpRequest, Operation>newBuilder()
              .setMethodName("compute.networks.delete")
              .setRequestInstance(DeleteNetworkHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/networks/{network}")
              .setPathParams(Sets.<String>newHashSet(
                                "network",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetNetworkHttpRequest, Network> directGetNetworkCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetNetworkHttpRequest, Network>newBuilder()
              .setMethodName("compute.networks.get")
              .setRequestInstance(GetNetworkHttpRequest.getDefaultInstance())
              .setResponseInstance(Network.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/networks/{network}")
              .setPathParams(Sets.<String>newHashSet(
                                "network",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertNetworkHttpRequest, Operation> directInsertNetworkCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertNetworkHttpRequest, Operation>newBuilder()
              .setMethodName("compute.networks.insert")
              .setRequestInstance(InsertNetworkHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/networks")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListNetworksHttpRequest, NetworkList> directListNetworksCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListNetworksHttpRequest, NetworkList>newBuilder()
              .setMethodName("compute.networks.list")
              .setRequestInstance(ListNetworksHttpRequest.getDefaultInstance())
              .setResponseInstance(NetworkList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/networks")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation> directSwitchToCustomModeNetworkCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SwitchToCustomModeNetworkHttpRequest, Operation>newBuilder()
              .setMethodName("compute.networks.switchToCustomMode")
              .setRequestInstance(SwitchToCustomModeNetworkHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/networks/{network}/switchToCustomMode")
              .setPathParams(Sets.<String>newHashSet(
                                "network",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteNetworkHttpRequest, Operation> deleteNetworkCallable;
  private final UnaryCallable<GetNetworkHttpRequest, Network> getNetworkCallable;
  private final UnaryCallable<InsertNetworkHttpRequest, Operation> insertNetworkCallable;
  private final UnaryCallable<ListNetworksHttpRequest, NetworkList> listNetworksCallable;
  private final UnaryCallable<ListNetworksHttpRequest, ListNetworksPagedResponse> listNetworksPagedCallable;
  private final UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation> switchToCustomModeNetworkCallable;

  public static final HttpJsonNetworkStub create(NetworkSettings settings) throws IOException {
    return new HttpJsonNetworkStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonNetworkStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonNetworkStub(NetworkSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonNetworkStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonNetworkStub(NetworkSettings settings, ClientContext clientContext) throws IOException {

    this.deleteNetworkCallable = HttpJsonCallableFactory.create(directDeleteNetworkCallable,settings.deleteNetworkSettings(), clientContext);
    this.getNetworkCallable = HttpJsonCallableFactory.create(directGetNetworkCallable,settings.getNetworkSettings(), clientContext);
    this.insertNetworkCallable = HttpJsonCallableFactory.create(directInsertNetworkCallable,settings.insertNetworkSettings(), clientContext);
    this.listNetworksCallable = HttpJsonCallableFactory.create(directListNetworksCallable,settings.listNetworksSettings(), clientContext);
    this.listNetworksPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListNetworksCallable,settings.listNetworksSettings(), clientContext);
    this.switchToCustomModeNetworkCallable = HttpJsonCallableFactory.create(directSwitchToCustomModeNetworkCallable,settings.switchToCustomModeNetworkSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteNetworkHttpRequest, Operation> deleteNetworkCallable() {
    return deleteNetworkCallable;
  }

  @BetaApi
  public UnaryCallable<GetNetworkHttpRequest, Network> getNetworkCallable() {
    return getNetworkCallable;
  }

  @BetaApi
  public UnaryCallable<InsertNetworkHttpRequest, Operation> insertNetworkCallable() {
    return insertNetworkCallable;
  }

  @BetaApi
  public UnaryCallable<ListNetworksHttpRequest, ListNetworksPagedResponse> listNetworksPagedCallable() {
    return listNetworksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListNetworksHttpRequest, NetworkList> listNetworksCallable() {
    return listNetworksCallable;
  }

  @BetaApi
  public UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation> switchToCustomModeNetworkCallable() {
    return switchToCustomModeNetworkCallable;
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