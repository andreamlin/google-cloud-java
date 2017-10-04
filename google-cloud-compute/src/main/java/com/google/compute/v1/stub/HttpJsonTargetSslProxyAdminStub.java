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
import com.google.compute.v1.DeleteTargetSslProxyHttpRequest;
import com.google.compute.v1.GetTargetSslProxyHttpRequest;
import com.google.compute.v1.InsertTargetSslProxyHttpRequest;
import com.google.compute.v1.ListTargetSslProxiesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetSslProxiesPagedResponse;
import com.google.compute.v1.SetBackendServiceTargetSslProxyHttpRequest;
import com.google.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest;
import com.google.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest;
import com.google.compute.v1.TargetSslProxiesProjectName;
import com.google.compute.v1.TargetSslProxiesSetBackendServiceRequest;
import com.google.compute.v1.TargetSslProxiesSetProxyHeaderRequest;
import com.google.compute.v1.TargetSslProxiesSetSslCertificatesRequest;
import com.google.compute.v1.TargetSslProxy;
import com.google.compute.v1.TargetSslProxyAdminSettings;
import com.google.compute.v1.TargetSslProxyList;
import com.google.compute.v1.TargetSslProxyName;
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
public class HttpJsonTargetSslProxyAdminStub extends TargetSslProxyAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> directDeleteTargetSslProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteTargetSslProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetSslProxies.delete")
              .setRequestInstance(DeleteTargetSslProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetSslProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> directGetTargetSslProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetTargetSslProxyHttpRequest, TargetSslProxy>newBuilder()
              .setMethodName("compute.targetSslProxies.get")
              .setRequestInstance(GetTargetSslProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetSslProxy.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetSslProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> directInsertTargetSslProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertTargetSslProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetSslProxies.insert")
              .setRequestInstance(InsertTargetSslProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> directListTargetSslProxiesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListTargetSslProxiesHttpRequest, TargetSslProxyList>newBuilder()
              .setMethodName("compute.targetSslProxies.list")
              .setRequestInstance(ListTargetSslProxiesHttpRequest.getDefaultInstance())
              .setResponseInstance(TargetSslProxyList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation> directSetBackendServiceTargetSslProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetBackendServiceTargetSslProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetSslProxies.setBackendService")
              .setRequestInstance(SetBackendServiceTargetSslProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}/setBackendService")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetSslProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation> directSetProxyHeaderTargetSslProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetProxyHeaderTargetSslProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetSslProxies.setProxyHeader")
              .setRequestInstance(SetProxyHeaderTargetSslProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}/setProxyHeader")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetSslProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation> directSetSslCertificatesTargetSslProxyCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetSslCertificatesTargetSslProxyHttpRequest, Operation>newBuilder()
              .setMethodName("compute.targetSslProxies.setSslCertificates")
              .setRequestInstance(SetSslCertificatesTargetSslProxyHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}/setSslCertificates")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "targetSslProxy"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyCallable;
  private final UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyCallable;
  private final UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyCallable;
  private final UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesCallable;
  private final UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse> listTargetSslProxiesPagedCallable;
  private final UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyCallable;
  private final UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyCallable;
  private final UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyCallable;

  public static final HttpJsonTargetSslProxyAdminStub create(TargetSslProxyAdminSettings settings) throws IOException {
    return new HttpJsonTargetSslProxyAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetSslProxyAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetSslProxyAdminStub(TargetSslProxyAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonTargetSslProxyAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetSslProxyAdminStub(TargetSslProxyAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteTargetSslProxyCallable = HttpJsonCallableFactory.create(directDeleteTargetSslProxyCallable,settings.deleteTargetSslProxySettings(), clientContext);
    this.getTargetSslProxyCallable = HttpJsonCallableFactory.create(directGetTargetSslProxyCallable,settings.getTargetSslProxySettings(), clientContext);
    this.insertTargetSslProxyCallable = HttpJsonCallableFactory.create(directInsertTargetSslProxyCallable,settings.insertTargetSslProxySettings(), clientContext);
    this.listTargetSslProxiesCallable = HttpJsonCallableFactory.create(directListTargetSslProxiesCallable,settings.listTargetSslProxiesSettings(), clientContext);
    this.listTargetSslProxiesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListTargetSslProxiesCallable,settings.listTargetSslProxiesSettings(), clientContext);
    this.setBackendServiceTargetSslProxyCallable = HttpJsonCallableFactory.create(directSetBackendServiceTargetSslProxyCallable,settings.setBackendServiceTargetSslProxySettings(), clientContext);
    this.setProxyHeaderTargetSslProxyCallable = HttpJsonCallableFactory.create(directSetProxyHeaderTargetSslProxyCallable,settings.setProxyHeaderTargetSslProxySettings(), clientContext);
    this.setSslCertificatesTargetSslProxyCallable = HttpJsonCallableFactory.create(directSetSslCertificatesTargetSslProxyCallable,settings.setSslCertificatesTargetSslProxySettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyCallable() {
    return deleteTargetSslProxyCallable;
  }

  @BetaApi
  public UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyCallable() {
    return getTargetSslProxyCallable;
  }

  @BetaApi
  public UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyCallable() {
    return insertTargetSslProxyCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse> listTargetSslProxiesPagedCallable() {
    return listTargetSslProxiesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesCallable() {
    return listTargetSslProxiesCallable;
  }

  @BetaApi
  public UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyCallable() {
    return setBackendServiceTargetSslProxyCallable;
  }

  @BetaApi
  public UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyCallable() {
    return setProxyHeaderTargetSslProxyCallable;
  }

  @BetaApi
  public UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyCallable() {
    return setSslCertificatesTargetSslProxyCallable;
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