/*
 * Copyright 2017, Google LLC All rights reserved.
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
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpProxiesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetUrlMapTargetHttpProxyHttpRequest;
import com.google.compute.v1.TargetHttpProxy;
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
@BetaApi
public class HttpJsonTargetHttpProxyStub extends TargetHttpProxyStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<DeleteTargetHttpProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetHttpProxies.delete")
          .setRequestInstance(DeleteTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies/{targetHttpProxy}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "targetHttpProxy"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  private static final ApiMethodDescriptor<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<GetTargetHttpProxyHttpRequest, TargetHttpProxy>newBuilder()
          .setMethodName("compute.targetHttpProxies.get")
          .setRequestInstance(GetTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetHttpProxy.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies/{targetHttpProxy}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "targetHttpProxy"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<InsertTargetHttpProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetHttpProxies.insert")
          .setRequestInstance(InsertTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesMethodDescriptor =
      ApiMethodDescriptor.<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList>newBuilder()
          .setMethodName("compute.targetHttpProxies.list")
          .setRequestInstance(ListTargetHttpProxiesHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetHttpProxyList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetHttpProxies")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyMethodDescriptor =
      ApiMethodDescriptor.<SetUrlMapTargetHttpProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetHttpProxies.setUrlMap")
          .setRequestInstance(SetUrlMapTargetHttpProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/targetHttpProxies/{targetHttpProxy}/setUrlMap")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "targetHttpProxy"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxyCallable;
  private final UnaryCallable<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxyCallable;
  private final UnaryCallable<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxyCallable;
  private final UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> listTargetHttpProxiesCallable;
  private final UnaryCallable<ListTargetHttpProxiesHttpRequest, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesPagedCallable;
  private final UnaryCallable<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxyCallable;

  public static final HttpJsonTargetHttpProxyStub create(TargetHttpProxySettings settings) throws IOException {
    return new HttpJsonTargetHttpProxyStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetHttpProxyStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetHttpProxyStub(TargetHttpProxySettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetHttpProxyStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetHttpProxyStub(TargetHttpProxySettings settings, ClientContext clientContext) throws IOException {

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

    this.deleteTargetHttpProxyCallable = HttpJsonCallableFactory.createUnaryCallable(deleteTargetHttpProxyTransportSettings,settings.deleteTargetHttpProxySettings(), clientContext);
    this.getTargetHttpProxyCallable = HttpJsonCallableFactory.createUnaryCallable(getTargetHttpProxyTransportSettings,settings.getTargetHttpProxySettings(), clientContext);
    this.insertTargetHttpProxyCallable = HttpJsonCallableFactory.createUnaryCallable(insertTargetHttpProxyTransportSettings,settings.insertTargetHttpProxySettings(), clientContext);
    this.listTargetHttpProxiesCallable = HttpJsonCallableFactory.createUnaryCallable(listTargetHttpProxiesTransportSettings,settings.listTargetHttpProxiesSettings(), clientContext);
    this.listTargetHttpProxiesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listTargetHttpProxiesTransportSettings,settings.listTargetHttpProxiesSettings(), clientContext);
    this.setUrlMapTargetHttpProxyCallable = HttpJsonCallableFactory.createUnaryCallable(setUrlMapTargetHttpProxyTransportSettings,settings.setUrlMapTargetHttpProxySettings(), clientContext);

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