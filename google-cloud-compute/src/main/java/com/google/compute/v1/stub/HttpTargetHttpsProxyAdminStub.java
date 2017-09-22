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
import com.google.compute.v1.DeleteTargetHttpsProxyHttpRequest;
import com.google.compute.v1.GetTargetHttpsProxyHttpRequest;
import com.google.compute.v1.InsertTargetHttpsProxyHttpRequest;
import com.google.compute.v1.ListTargetHttpsProxiesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpsProxiesPagedResponse;
import com.google.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest;
import com.google.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest;
import com.google.compute.v1.TargetHttpsProxiesProjectName;
import com.google.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest;
import com.google.compute.v1.TargetHttpsProxy;
import com.google.compute.v1.TargetHttpsProxyAdminSettings;
import com.google.compute.v1.TargetHttpsProxyList;
import com.google.compute.v1.TargetHttpsProxyName;
import com.google.compute.v1.UrlMapReference;
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
public class HttpTargetHttpsProxyAdminStub extends TargetHttpsProxyAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation> directDeleteTargetHttpsProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteTargetHttpsProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetHttpsProxies.delete")
              .setRequestInstance(DeleteTargetHttpsProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetHttpsProxies/{targetHttpsProxy}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetHttpsProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy> directGetTargetHttpsProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy>newBuilder()
              .setMethodName("compute.targetHttpsProxies.get")
              .setRequestInstance(GetTargetHttpsProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetHttpsProxy.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetHttpsProxies/{targetHttpsProxy}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetHttpsProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation> directInsertTargetHttpsProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertTargetHttpsProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetHttpsProxies.insert")
              .setRequestInstance(InsertTargetHttpsProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetHttpsProxies")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList> directListTargetHttpsProxiesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList>newBuilder()
              .setMethodName("compute.targetHttpsProxies.list")
              .setRequestInstance(ListTargetHttpsProxiesHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetHttpsProxyList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetHttpsProxies")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation> directSetSslCertificatesTargetHttpsProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetHttpsProxies.setSslCertificates")
              .setRequestInstance(SetSslCertificatesTargetHttpsProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/targetHttpsProxies/{targetHttpsProxy}/setSslCertificates")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetHttpsProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation> directSetUrlMapTargetHttpsProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetUrlMapTargetHttpsProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetHttpsProxies.setUrlMap")
              .setRequestInstance(SetUrlMapTargetHttpsProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/targetHttpsProxies/{targetHttpsProxy}/setUrlMap")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetHttpsProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation> deleteTargetHttpsProxyCallable;
  private final UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy> getTargetHttpsProxyCallable;
  private final UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation> insertTargetHttpsProxyCallable;
  private final UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList> listTargetHttpsProxiesCallable;
  private final UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse> listTargetHttpsProxiesPagedCallable;
  private final UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation> setSslCertificatesTargetHttpsProxyCallable;
  private final UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation> setUrlMapTargetHttpsProxyCallable;

  public static final HttpTargetHttpsProxyAdminStub create(TargetHttpsProxyAdminSettings settings) throws IOException {
    return new HttpTargetHttpsProxyAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpTargetHttpsProxyAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpTargetHttpsProxyAdminStub(TargetHttpsProxyAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpTargetHttpsProxyAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpTargetHttpsProxyAdminStub(TargetHttpsProxyAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteTargetHttpsProxyCallable = HttpJsonCallableFactory.create(directDeleteTargetHttpsProxyCallable,settings.deleteTargetHttpsProxySettings(), clientContext);
    this.getTargetHttpsProxyCallable = HttpJsonCallableFactory.create(directGetTargetHttpsProxyCallable,settings.getTargetHttpsProxySettings(), clientContext);
    this.insertTargetHttpsProxyCallable = HttpJsonCallableFactory.create(directInsertTargetHttpsProxyCallable,settings.insertTargetHttpsProxySettings(), clientContext);
    this.listTargetHttpsProxiesCallable = HttpJsonCallableFactory.create(directListTargetHttpsProxiesCallable,settings.listTargetHttpsProxiesSettings(), clientContext);
    this.listTargetHttpsProxiesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListTargetHttpsProxiesCallable,settings.listTargetHttpsProxiesSettings(), clientContext);
    this.setSslCertificatesTargetHttpsProxyCallable = HttpJsonCallableFactory.create(directSetSslCertificatesTargetHttpsProxyCallable,settings.setSslCertificatesTargetHttpsProxySettings(), clientContext);
    this.setUrlMapTargetHttpsProxyCallable = HttpJsonCallableFactory.create(directSetUrlMapTargetHttpsProxyCallable,settings.setUrlMapTargetHttpsProxySettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteTargetHttpsProxyHttpRequest, Operation> deleteTargetHttpsProxyCallable() {
    return deleteTargetHttpsProxyCallable;
  }

  @BetaApi
  public UnaryCallable<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy> getTargetHttpsProxyCallable() {
    return getTargetHttpsProxyCallable;
  }

  @BetaApi
  public UnaryCallable<InsertTargetHttpsProxyHttpRequest, Operation> insertTargetHttpsProxyCallable() {
    return insertTargetHttpsProxyCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpsProxiesHttpRequest, ListTargetHttpsProxiesPagedResponse> listTargetHttpsProxiesPagedCallable() {
    return listTargetHttpsProxiesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList> listTargetHttpsProxiesCallable() {
    return listTargetHttpsProxiesCallable;
  }

  @BetaApi
  public UnaryCallable<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation> setSslCertificatesTargetHttpsProxyCallable() {
    return setSslCertificatesTargetHttpsProxyCallable;
  }

  @BetaApi
  public UnaryCallable<SetUrlMapTargetHttpsProxyHttpRequest, Operation> setUrlMapTargetHttpsProxyCallable() {
    return setUrlMapTargetHttpsProxyCallable;
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