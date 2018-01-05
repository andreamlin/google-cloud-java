/*
 * Copyright 2017 Google LLC
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
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteRouteHttpRequest;
import com.google.compute.v1.GetRouteHttpRequest;
import com.google.compute.v1.InsertRouteHttpRequest;
import com.google.compute.v1.ListRoutesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.Route;
import com.google.compute.v1.RouteList;
import com.google.compute.v1.RouteName;
import com.google.compute.v1.RouteSettings;
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
public class HttpJsonRouteStub extends RouteStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteRouteHttpRequest, Operation> deleteRouteMethodDescriptor =
      ApiMethodDescriptor.<DeleteRouteHttpRequest, Operation>newBuilder()
          .setMethodName("compute.routes.delete")
          .setRequestInstance(DeleteRouteHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/routes/{route}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "route"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  private static final ApiMethodDescriptor<GetRouteHttpRequest, Route> getRouteMethodDescriptor =
      ApiMethodDescriptor.<GetRouteHttpRequest, Route>newBuilder()
          .setMethodName("compute.routes.get")
          .setRequestInstance(GetRouteHttpRequest.getDefaultInstance())
          .setResponseInstance(Route.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/routes/{route}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "route"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<InsertRouteHttpRequest, Operation> insertRouteMethodDescriptor =
      ApiMethodDescriptor.<InsertRouteHttpRequest, Operation>newBuilder()
          .setMethodName("compute.routes.insert")
          .setRequestInstance(InsertRouteHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/routes")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<ListRoutesHttpRequest, RouteList> listRoutesMethodDescriptor =
      ApiMethodDescriptor.<ListRoutesHttpRequest, RouteList>newBuilder()
          .setMethodName("compute.routes.list")
          .setRequestInstance(ListRoutesHttpRequest.getDefaultInstance())
          .setResponseInstance(RouteList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/routes")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteRouteHttpRequest, Operation> deleteRouteCallable;
  private final UnaryCallable<GetRouteHttpRequest, Route> getRouteCallable;
  private final UnaryCallable<InsertRouteHttpRequest, Operation> insertRouteCallable;
  private final UnaryCallable<ListRoutesHttpRequest, RouteList> listRoutesCallable;
  private final UnaryCallable<ListRoutesHttpRequest, ListRoutesPagedResponse> listRoutesPagedCallable;

  public static final HttpJsonRouteStub create(RouteSettings settings) throws IOException {
    return new HttpJsonRouteStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRouteStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRouteStub(RouteSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRouteStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRouteStub(RouteSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteRouteHttpRequest, Operation> deleteRouteTransportSettings =
        HttpJsonCallSettings.<DeleteRouteHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteRouteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetRouteHttpRequest, Route> getRouteTransportSettings =
        HttpJsonCallSettings.<GetRouteHttpRequest, Route>newBuilder()
            .setMethodDescriptor(getRouteMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertRouteHttpRequest, Operation> insertRouteTransportSettings =
        HttpJsonCallSettings.<InsertRouteHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertRouteMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRoutesHttpRequest, RouteList> listRoutesTransportSettings =
        HttpJsonCallSettings.<ListRoutesHttpRequest, RouteList>newBuilder()
            .setMethodDescriptor(listRoutesMethodDescriptor)
            .build();

    this.deleteRouteCallable = HttpJsonCallableFactory.createUnaryCallable(deleteRouteTransportSettings,settings.deleteRouteSettings(), clientContext);
    this.getRouteCallable = HttpJsonCallableFactory.createUnaryCallable(getRouteTransportSettings,settings.getRouteSettings(), clientContext);
    this.insertRouteCallable = HttpJsonCallableFactory.createUnaryCallable(insertRouteTransportSettings,settings.insertRouteSettings(), clientContext);
    this.listRoutesCallable = HttpJsonCallableFactory.createUnaryCallable(listRoutesTransportSettings,settings.listRoutesSettings(), clientContext);
    this.listRoutesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listRoutesTransportSettings,settings.listRoutesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteRouteHttpRequest, Operation> deleteRouteCallable() {
    return deleteRouteCallable;
  }

  @BetaApi
  public UnaryCallable<GetRouteHttpRequest, Route> getRouteCallable() {
    return getRouteCallable;
  }

  @BetaApi
  public UnaryCallable<InsertRouteHttpRequest, Operation> insertRouteCallable() {
    return insertRouteCallable;
  }

  @BetaApi
  public UnaryCallable<ListRoutesHttpRequest, ListRoutesPagedResponse> listRoutesPagedCallable() {
    return listRoutesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRoutesHttpRequest, RouteList> listRoutesCallable() {
    return listRoutesCallable;
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