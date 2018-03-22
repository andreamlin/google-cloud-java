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
import com.google.compute.v1.DeleteTargetSslProxyHttpRequest;
import com.google.compute.v1.GetTargetSslProxyHttpRequest;
import com.google.compute.v1.InsertTargetSslProxyHttpRequest;
import com.google.compute.v1.ListTargetSslProxiesHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetBackendServiceTargetSslProxyHttpRequest;
import com.google.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest;
import com.google.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest;
import com.google.compute.v1.TargetSslProxiesSetBackendServiceRequest;
import com.google.compute.v1.TargetSslProxiesSetProxyHeaderRequest;
import com.google.compute.v1.TargetSslProxiesSetSslCertificatesRequest;
import com.google.compute.v1.TargetSslProxy;
import static com.google.compute.v1.TargetSslProxyClient.ListTargetSslProxiesPagedResponse;
import com.google.compute.v1.TargetSslProxyList;
import com.google.compute.v1.TargetSslProxyName;
import com.google.compute.v1.TargetSslProxySettings;
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
public class HttpJsonTargetSslProxyStub extends TargetSslProxyStub {
  @InternalApi
  public static final ApiMethodDescriptor<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyMethodDescriptor =
      ApiMethodDescriptor.<DeleteTargetSslProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetSslProxies.delete")
          .setRequestInstance(DeleteTargetSslProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetSslProxyName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("targetSslProxy")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyMethodDescriptor =
      ApiMethodDescriptor.<GetTargetSslProxyHttpRequest, TargetSslProxy>newBuilder()
          .setMethodName("compute.targetSslProxies.get")
          .setRequestInstance(GetTargetSslProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetSslProxy.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetSslProxyName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("targetSslProxy")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyMethodDescriptor =
      ApiMethodDescriptor.<InsertTargetSslProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetSslProxies.insert")
          .setRequestInstance(InsertTargetSslProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesMethodDescriptor =
      ApiMethodDescriptor.<ListTargetSslProxiesHttpRequest, TargetSslProxyList>newBuilder()
          .setMethodName("compute.targetSslProxies.list")
          .setRequestInstance(ListTargetSslProxiesHttpRequest.getDefaultInstance())
          .setResponseInstance(TargetSslProxyList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyMethodDescriptor =
      ApiMethodDescriptor.<SetBackendServiceTargetSslProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetSslProxies.setBackendService")
          .setRequestInstance(SetBackendServiceTargetSslProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}/setBackendService")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetSslProxyName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetSslProxy")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyMethodDescriptor =
      ApiMethodDescriptor.<SetProxyHeaderTargetSslProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetSslProxies.setProxyHeader")
          .setRequestInstance(SetProxyHeaderTargetSslProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}/setProxyHeader")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetSslProxyName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetSslProxy")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyMethodDescriptor =
      ApiMethodDescriptor.<SetSslCertificatesTargetSslProxyHttpRequest, Operation>newBuilder()
          .setMethodName("compute.targetSslProxies.setSslCertificates")
          .setRequestInstance(SetSslCertificatesTargetSslProxyHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/targetSslProxies/{targetSslProxy}/setSslCertificates")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(TargetSslProxyName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("targetSslProxy")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyCallable;
  private final UnaryCallable<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyCallable;
  private final UnaryCallable<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyCallable;
  private final UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesCallable;
  private final UnaryCallable<ListTargetSslProxiesHttpRequest, ListTargetSslProxiesPagedResponse> listTargetSslProxiesPagedCallable;
  private final UnaryCallable<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyCallable;
  private final UnaryCallable<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyCallable;
  private final UnaryCallable<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyCallable;

  private final HttpJsonClientCallableFactory callableFactory;
  public static final HttpJsonTargetSslProxyStub create(TargetSslProxyStubSettings settings) throws IOException {
    return new HttpJsonTargetSslProxyStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetSslProxyStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonTargetSslProxyStub(TargetSslProxyStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonTargetSslProxyStub create(ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    return new HttpJsonTargetSslProxyStub(TargetSslProxySettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonTargetSslProxyStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetSslProxyStub(TargetSslProxyStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonTargetSslProxyCallableFactory();
  }

  /**
   * Constructs an instance of HttpJsonTargetSslProxyStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonTargetSslProxyStub(TargetSslProxyStubSettings settings, ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxyTransportSettings =
        HttpJsonCallSettings.<DeleteTargetSslProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteTargetSslProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxyTransportSettings =
        HttpJsonCallSettings.<GetTargetSslProxyHttpRequest, TargetSslProxy>newBuilder()
            .setMethodDescriptor(getTargetSslProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxyTransportSettings =
        HttpJsonCallSettings.<InsertTargetSslProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertTargetSslProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListTargetSslProxiesHttpRequest, TargetSslProxyList> listTargetSslProxiesTransportSettings =
        HttpJsonCallSettings.<ListTargetSslProxiesHttpRequest, TargetSslProxyList>newBuilder()
            .setMethodDescriptor(listTargetSslProxiesMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxyTransportSettings =
        HttpJsonCallSettings.<SetBackendServiceTargetSslProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setBackendServiceTargetSslProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxyTransportSettings =
        HttpJsonCallSettings.<SetProxyHeaderTargetSslProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setProxyHeaderTargetSslProxyMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxyTransportSettings =
        HttpJsonCallSettings.<SetSslCertificatesTargetSslProxyHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setSslCertificatesTargetSslProxyMethodDescriptor)
            .build();

    this.deleteTargetSslProxyCallable = callableFactory.createUnaryCallable(deleteTargetSslProxyTransportSettings,settings.deleteTargetSslProxySettings(), clientContext);
    this.getTargetSslProxyCallable = callableFactory.createUnaryCallable(getTargetSslProxyTransportSettings,settings.getTargetSslProxySettings(), clientContext);
    this.insertTargetSslProxyCallable = callableFactory.createUnaryCallable(insertTargetSslProxyTransportSettings,settings.insertTargetSslProxySettings(), clientContext);
    this.listTargetSslProxiesCallable = callableFactory.createUnaryCallable(listTargetSslProxiesTransportSettings,settings.listTargetSslProxiesSettings(), clientContext);
    this.listTargetSslProxiesPagedCallable = callableFactory.createPagedCallable(listTargetSslProxiesTransportSettings,settings.listTargetSslProxiesSettings(), clientContext);
    this.setBackendServiceTargetSslProxyCallable = callableFactory.createUnaryCallable(setBackendServiceTargetSslProxyTransportSettings,settings.setBackendServiceTargetSslProxySettings(), clientContext);
    this.setProxyHeaderTargetSslProxyCallable = callableFactory.createUnaryCallable(setProxyHeaderTargetSslProxyTransportSettings,settings.setProxyHeaderTargetSslProxySettings(), clientContext);
    this.setSslCertificatesTargetSslProxyCallable = callableFactory.createUnaryCallable(setSslCertificatesTargetSslProxyTransportSettings,settings.setSslCertificatesTargetSslProxySettings(), clientContext);

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