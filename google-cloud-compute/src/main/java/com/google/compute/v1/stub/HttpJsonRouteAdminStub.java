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
import com.google.compute.v1.DeleteRouteHttpRequest;
import com.google.compute.v1.GetRouteHttpRequest;
import com.google.compute.v1.InsertRouteHttpRequest;
import com.google.compute.v1.ListRoutesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutesPagedResponse;
import com.google.compute.v1.Route;
import com.google.compute.v1.RouteAdminSettings;
import com.google.compute.v1.RouteList;
import com.google.compute.v1.RouteName;
import com.google.compute.v1.RoutesProjectName;
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
public class HttpJsonRouteAdminStub extends RouteAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteRouteHttpRequest, Operation> directDeleteRouteCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<GetRouteHttpRequest, Route> directGetRouteCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<InsertRouteHttpRequest, Operation> directInsertRouteCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<ListRoutesHttpRequest, RouteList> directListRoutesCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteRouteHttpRequest, Operation> deleteRouteCallable;
  private final UnaryCallable<GetRouteHttpRequest, Route> getRouteCallable;
  private final UnaryCallable<InsertRouteHttpRequest, Operation> insertRouteCallable;
  private final UnaryCallable<ListRoutesHttpRequest, RouteList> listRoutesCallable;
  private final UnaryCallable<ListRoutesHttpRequest, ListRoutesPagedResponse> listRoutesPagedCallable;

  public static final HttpJsonRouteAdminStub create(RouteAdminSettings settings) throws IOException {
    return new HttpJsonRouteAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRouteAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRouteAdminStub(RouteAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRouteAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRouteAdminStub(RouteAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteRouteCallable = HttpJsonCallableFactory.create(directDeleteRouteCallable,settings.deleteRouteSettings(), clientContext);
    this.getRouteCallable = HttpJsonCallableFactory.create(directGetRouteCallable,settings.getRouteSettings(), clientContext);
    this.insertRouteCallable = HttpJsonCallableFactory.create(directInsertRouteCallable,settings.insertRouteSettings(), clientContext);
    this.listRoutesCallable = HttpJsonCallableFactory.create(directListRoutesCallable,settings.listRoutesSettings(), clientContext);
    this.listRoutesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRoutesCallable,settings.listRoutesSettings(), clientContext);

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