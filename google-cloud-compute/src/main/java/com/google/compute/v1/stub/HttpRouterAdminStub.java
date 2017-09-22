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
import com.google.compute.v1.AggregatedListRoutersHttpRequest;
import com.google.compute.v1.DeleteRouterHttpRequest;
import com.google.compute.v1.GetRouterHttpRequest;
import com.google.compute.v1.GetRouterStatusRouterHttpRequest;
import com.google.compute.v1.InsertRouterHttpRequest;
import com.google.compute.v1.ListRoutersHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListRoutersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutersPagedResponse;
import com.google.compute.v1.PatchRouterHttpRequest;
import com.google.compute.v1.PreviewRouterHttpRequest;
import com.google.compute.v1.Router;
import com.google.compute.v1.RouterAdminSettings;
import com.google.compute.v1.RouterAggregatedList;
import com.google.compute.v1.RouterList;
import com.google.compute.v1.RouterName;
import com.google.compute.v1.RouterStatusResponse;
import com.google.compute.v1.RoutersPreviewResponse;
import com.google.compute.v1.RoutersProjectName;
import com.google.compute.v1.RoutersRegionName;
import com.google.compute.v1.UpdateRouterHttpRequest;
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
public class HttpRouterAdminStub extends RouterAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListRoutersHttpRequest, RouterAggregatedList> directAggregatedListRoutersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListRoutersHttpRequest, RouterAggregatedList>newBuilder()
              .setMethodName("compute.routers.aggregatedList")
              .setRequestInstance(AggregatedListRoutersHttpRequest.getDefaultInstance())
              .setResponseInstance(RouterAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/routers")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteRouterHttpRequest, Operation> directDeleteRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteRouterHttpRequest, Operation>newBuilder()
              .setMethodName("compute.routers.delete")
              .setRequestInstance(DeleteRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers/{router}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "router"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetRouterHttpRequest, Router> directGetRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetRouterHttpRequest, Router>newBuilder()
              .setMethodName("compute.routers.get")
              .setRequestInstance(GetRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(Router.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers/{router}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "router"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<GetRouterStatusRouterHttpRequest, RouterStatusResponse> directGetRouterStatusRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetRouterStatusRouterHttpRequest, RouterStatusResponse>newBuilder()
              .setMethodName("compute.routers.getRouterStatus")
              .setRequestInstance(GetRouterStatusRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(RouterStatusResponse.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers/{router}/getRouterStatus")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "router"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertRouterHttpRequest, Operation> directInsertRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertRouterHttpRequest, Operation>newBuilder()
              .setMethodName("compute.routers.insert")
              .setRequestInstance(InsertRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListRoutersHttpRequest, RouterList> directListRoutersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListRoutersHttpRequest, RouterList>newBuilder()
              .setMethodName("compute.routers.list")
              .setRequestInstance(ListRoutersHttpRequest.getDefaultInstance())
              .setResponseInstance(RouterList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<PatchRouterHttpRequest, Operation> directPatchRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<PatchRouterHttpRequest, Operation>newBuilder()
              .setMethodName("compute.routers.patch")
              .setRequestInstance(PatchRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers/{router}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "router"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PATCH)
              .build());
  private static final UnaryCallable<PreviewRouterHttpRequest, RoutersPreviewResponse> directPreviewRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<PreviewRouterHttpRequest, RoutersPreviewResponse>newBuilder()
              .setMethodName("compute.routers.preview")
              .setRequestInstance(PreviewRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(RoutersPreviewResponse.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers/{router}/preview")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "router"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<UpdateRouterHttpRequest, Operation> directUpdateRouterCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<UpdateRouterHttpRequest, Operation>newBuilder()
              .setMethodName("compute.routers.update")
              .setRequestInstance(UpdateRouterHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/routers/{router}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region",    "router"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PUT)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListRoutersHttpRequest, RouterAggregatedList> aggregatedListRoutersCallable;
  private final UnaryCallable<AggregatedListRoutersHttpRequest, AggregatedListRoutersPagedResponse> aggregatedListRoutersPagedCallable;
  private final UnaryCallable<DeleteRouterHttpRequest, Operation> deleteRouterCallable;
  private final UnaryCallable<GetRouterHttpRequest, Router> getRouterCallable;
  private final UnaryCallable<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterCallable;
  private final UnaryCallable<InsertRouterHttpRequest, Operation> insertRouterCallable;
  private final UnaryCallable<ListRoutersHttpRequest, RouterList> listRoutersCallable;
  private final UnaryCallable<ListRoutersHttpRequest, ListRoutersPagedResponse> listRoutersPagedCallable;
  private final UnaryCallable<PatchRouterHttpRequest, Operation> patchRouterCallable;
  private final UnaryCallable<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterCallable;
  private final UnaryCallable<UpdateRouterHttpRequest, Operation> updateRouterCallable;

  public static final HttpRouterAdminStub create(RouterAdminSettings settings) throws IOException {
    return new HttpRouterAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpRouterAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpRouterAdminStub(RouterAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpRouterAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpRouterAdminStub(RouterAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListRoutersCallable = HttpJsonCallableFactory.create(directAggregatedListRoutersCallable,settings.aggregatedListRoutersSettings(), clientContext);
    this.aggregatedListRoutersPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListRoutersCallable,settings.aggregatedListRoutersSettings(), clientContext);
    this.deleteRouterCallable = HttpJsonCallableFactory.create(directDeleteRouterCallable,settings.deleteRouterSettings(), clientContext);
    this.getRouterCallable = HttpJsonCallableFactory.create(directGetRouterCallable,settings.getRouterSettings(), clientContext);
    this.getRouterStatusRouterCallable = HttpJsonCallableFactory.create(directGetRouterStatusRouterCallable,settings.getRouterStatusRouterSettings(), clientContext);
    this.insertRouterCallable = HttpJsonCallableFactory.create(directInsertRouterCallable,settings.insertRouterSettings(), clientContext);
    this.listRoutersCallable = HttpJsonCallableFactory.create(directListRoutersCallable,settings.listRoutersSettings(), clientContext);
    this.listRoutersPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRoutersCallable,settings.listRoutersSettings(), clientContext);
    this.patchRouterCallable = HttpJsonCallableFactory.create(directPatchRouterCallable,settings.patchRouterSettings(), clientContext);
    this.previewRouterCallable = HttpJsonCallableFactory.create(directPreviewRouterCallable,settings.previewRouterSettings(), clientContext);
    this.updateRouterCallable = HttpJsonCallableFactory.create(directUpdateRouterCallable,settings.updateRouterSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListRoutersHttpRequest, AggregatedListRoutersPagedResponse> aggregatedListRoutersPagedCallable() {
    return aggregatedListRoutersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListRoutersHttpRequest, RouterAggregatedList> aggregatedListRoutersCallable() {
    return aggregatedListRoutersCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteRouterHttpRequest, Operation> deleteRouterCallable() {
    return deleteRouterCallable;
  }

  @BetaApi
  public UnaryCallable<GetRouterHttpRequest, Router> getRouterCallable() {
    return getRouterCallable;
  }

  @BetaApi
  public UnaryCallable<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterCallable() {
    return getRouterStatusRouterCallable;
  }

  @BetaApi
  public UnaryCallable<InsertRouterHttpRequest, Operation> insertRouterCallable() {
    return insertRouterCallable;
  }

  @BetaApi
  public UnaryCallable<ListRoutersHttpRequest, ListRoutersPagedResponse> listRoutersPagedCallable() {
    return listRoutersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRoutersHttpRequest, RouterList> listRoutersCallable() {
    return listRoutersCallable;
  }

  @BetaApi
  public UnaryCallable<PatchRouterHttpRequest, Operation> patchRouterCallable() {
    return patchRouterCallable;
  }

  @BetaApi
  public UnaryCallable<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterCallable() {
    return previewRouterCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateRouterHttpRequest, Operation> updateRouterCallable() {
    return updateRouterCallable;
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