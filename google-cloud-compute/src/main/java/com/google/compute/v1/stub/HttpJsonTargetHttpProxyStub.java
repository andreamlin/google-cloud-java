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
import com.google.compute.v1.DeleteTargetHttpProxyHttpRequest;
import com.google.compute.v1.GetTargetHttpProxyHttpRequest;
import com.google.compute.v1.InsertTargetHttpProxyHttpRequest;
import com.google.compute.v1.ListTargetHttpProxiesHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetUrlMapTargetHttpProxyHttpRequest;
import com.google.compute.v1.TargetHttpProxy;
import static com.google.compute.v1.TargetHttpProxyClient.ListTargetHttpProxiesPagedResponse;
import com.google.compute.v1.TargetHttpProxyList;
import com.google.compute.v1.TargetHttpProxyName;
import com.google.compute.v1.TargetHttpProxySettings;
import com.google.compute.v1.UrlMapReference;
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
public class HttpJsonTargetHttpProxyStub extends TargetHttpProxyStub {
  @InternalApi
  public static final ApiMethodDescriptor<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<DeleteTargetHttpProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetHttpProxies.delete")
          .setRequestInstance(DeleteTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies/{targetHttpProxy}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetHttpProxyName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("targetHttpProxy")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<GetTargetHttpProxyHttpRequest, TargetHttpProxy>newBuilder()
          .setMethodName("compute.targetHttpProxies.get")
          .setRequestInstance(GetTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetHttpProxy.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies/{targetHttpProxy}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetHttpProxyName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("targetHttpProxy")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<InsertTargetHttpProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetHttpProxies.insert")
          .setRequestInstance(InsertTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesMethodDescriptor =
      ApiMethodDescriptor.<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList>newBuilder()
          .setMethodName("compute.targetHttpProxies.list")
          .setRequestInstance(ListTargetHttpProxiesHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetHttpProxyList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<SetUrlMapTargetHttpProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetHttpProxies.setUrlMap")
          .setRequestInstance(SetUrlMapTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/targetHttpProxies/{targetHttpProxy}/setUrlMap")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetHttpProxyName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetHttpProxy")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyCallable;
  private final UnaryCallable<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyCallable;
  private final UnaryCallable<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyCallable;
  private final UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesCallable;
  private final UnaryCallable<ListTargetHttpProxiesHttpRequest, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesPagedCallable;
  private final UnaryCallable<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyCallable;

  private final HttpJsonClientCallableFactory callableFactory;
  public static final HttpJsonTargetHttpProxyStub create(TargetHttpProxyStubSettings settings) throws IOException {
    return new HttpJsonTargetHttpProxyStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetHttpProxyStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetHttpProxyStub(TargetHttpProxyStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonTargetHttpProxyStub create(ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    return new HttpJsonTargetHttpProxyStub(TargetHttpProxySettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonTargetHttpProxyStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetHttpProxyStub(TargetHttpProxyStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonTargetHttpProxyCallableFactory();
  }

  /**
   * Constructs an instance of HttpJsonTargetHttpProxyStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetHttpProxyStub(TargetHttpProxyStubSettings settings, ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyTransportSettings =
        HttpJsonCallSettings.<DeleteTargetHttpProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteTargetHttpProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyTransportSettings =
        HttpJsonCallSettings.<GetTargetHttpProxyHttpRequest, TargetHttpProxy>newBuilder()
            .setMethodDescriptor(getTargetHttpProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyTransportSettings =
        HttpJsonCallSettings.<InsertTargetHttpProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertTargetHttpProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesTransportSettings =
        HttpJsonCallSettings.<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList>newBuilder()
            .setMethodDescriptor(listTargetHttpProxiesMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyTransportSettings =
        HttpJsonCallSettings.<SetUrlMapTargetHttpProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setUrlMapTargetHttpProxyMethodDescriptor)
            .build();

    this.deleteTargetHttpProxyCallable = callableFactory.createUnaryCallable(deleteTargetHttpProxyTransportSettings,settings.deleteTargetHttpProxySettings(), clientContext);
    this.getTargetHttpProxyCallable = callableFactory.createUnaryCallable(getTargetHttpProxyTransportSettings,settings.getTargetHttpProxySettings(), clientContext);
    this.insertTargetHttpProxyCallable = callableFactory.createUnaryCallable(insertTargetHttpProxyTransportSettings,settings.insertTargetHttpProxySettings(), clientContext);
    this.listTargetHttpProxiesCallable = callableFactory.createUnaryCallable(listTargetHttpProxiesTransportSettings,settings.listTargetHttpProxiesSettings(), clientContext);
    this.listTargetHttpProxiesPagedCallable = callableFactory.createPagedCallable(listTargetHttpProxiesTransportSettings,settings.listTargetHttpProxiesSettings(), clientContext);
    this.setUrlMapTargetHttpProxyCallable = callableFactory.createUnaryCallable(setUrlMapTargetHttpProxyTransportSettings,settings.setUrlMapTargetHttpProxySettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyCallable() {
    return deleteTargetHttpProxyCallable;
  }

  @BetaApi
  public UnaryCallable<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyCallable() {
    return getTargetHttpProxyCallable;
  }

  @BetaApi
  public UnaryCallable<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyCallable() {
    return insertTargetHttpProxyCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpProxiesHttpRequest, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesPagedCallable() {
    return listTargetHttpProxiesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesCallable() {
    return listTargetHttpProxiesCallable;
  }

  @BetaApi
  public UnaryCallable<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyCallable() {
    return setUrlMapTargetHttpProxyCallable;
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