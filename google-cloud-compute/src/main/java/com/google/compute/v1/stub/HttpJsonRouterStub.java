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
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.EmptyRequestParamsExtractor;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
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
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.Router;
import com.google.compute.v1.RouterAggregatedList;
import com.google.compute.v1.RouterList;
import com.google.compute.v1.RouterName;
import com.google.compute.v1.RouterSettings;
import com.google.compute.v1.RouterStatusResponse;
import com.google.compute.v1.RoutersPreviewResponse;
import com.google.compute.v1.UpdateRouterHttpRequest;
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
public class HttpJsonRouterStub extends RouterStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<AggregatedListRoutersHttpRequest, RouterAggregatedList> aggregatedListRoutersMethodDescriptor =
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
  private static final ApiMethodDescriptor<DeleteRouterHttpRequest, Operation> deleteRouterMethodDescriptor =
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
  private static final ApiMethodDescriptor<GetRouterHttpRequest, Router> getRouterMethodDescriptor =
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
  private static final ApiMethodDescriptor<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterMethodDescriptor =
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
  private static final ApiMethodDescriptor<InsertRouterHttpRequest, Operation> insertRouterMethodDescriptor =
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
  private static final ApiMethodDescriptor<ListRoutersHttpRequest, RouterList> listRoutersMethodDescriptor =
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
  private static final ApiMethodDescriptor<PatchRouterHttpRequest, Operation> patchRouterMethodDescriptor =
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
  private static final ApiMethodDescriptor<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterMethodDescriptor =
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
  private static final ApiMethodDescriptor<UpdateRouterHttpRequest, Operation> updateRouterMethodDescriptor =
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

  public static final HttpJsonRouterStub create(RouterSettings settings) throws IOException {
    return new HttpJsonRouterStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRouterStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRouterStub(RouterSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRouterStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRouterStub(RouterSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AggregatedListRoutersHttpRequest, RouterAggregatedList> aggregatedListRoutersTransportSettings =
        HttpJsonCallSettings.<AggregatedListRoutersHttpRequest, RouterAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListRoutersMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteRouterHttpRequest, Operation> deleteRouterTransportSettings =
        HttpJsonCallSettings.<DeleteRouterHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteRouterMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetRouterHttpRequest, Router> getRouterTransportSettings =
        HttpJsonCallSettings.<GetRouterHttpRequest, Router>newBuilder()
            .setMethodDescriptor(getRouterMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterTransportSettings =
        HttpJsonCallSettings.<GetRouterStatusRouterHttpRequest, RouterStatusResponse>newBuilder()
            .setMethodDescriptor(getRouterStatusRouterMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertRouterHttpRequest, Operation> insertRouterTransportSettings =
        HttpJsonCallSettings.<InsertRouterHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertRouterMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRoutersHttpRequest, RouterList> listRoutersTransportSettings =
        HttpJsonCallSettings.<ListRoutersHttpRequest, RouterList>newBuilder()
            .setMethodDescriptor(listRoutersMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchRouterHttpRequest, Operation> patchRouterTransportSettings =
        HttpJsonCallSettings.<PatchRouterHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchRouterMethodDescriptor)
            .build();
    HttpJsonCallSettings<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterTransportSettings =
        HttpJsonCallSettings.<PreviewRouterHttpRequest, RoutersPreviewResponse>newBuilder()
            .setMethodDescriptor(previewRouterMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateRouterHttpRequest, Operation> updateRouterTransportSettings =
        HttpJsonCallSettings.<UpdateRouterHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateRouterMethodDescriptor)
            .build();

    this.aggregatedListRoutersCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListRoutersTransportSettings,settings.aggregatedListRoutersSettings(), clientContext);
    this.aggregatedListRoutersPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListRoutersTransportSettings,settings.aggregatedListRoutersSettings(), clientContext);
    this.deleteRouterCallable = HttpJsonCallableFactory.createUnaryCallable(deleteRouterTransportSettings,settings.deleteRouterSettings(), clientContext);
    this.getRouterCallable = HttpJsonCallableFactory.createUnaryCallable(getRouterTransportSettings,settings.getRouterSettings(), clientContext);
    this.getRouterStatusRouterCallable = HttpJsonCallableFactory.createUnaryCallable(getRouterStatusRouterTransportSettings,settings.getRouterStatusRouterSettings(), clientContext);
    this.insertRouterCallable = HttpJsonCallableFactory.createUnaryCallable(insertRouterTransportSettings,settings.insertRouterSettings(), clientContext);
    this.listRoutersCallable = HttpJsonCallableFactory.createUnaryCallable(listRoutersTransportSettings,settings.listRoutersSettings(), clientContext);
    this.listRoutersPagedCallable = HttpJsonCallableFactory.createPagedCallable(listRoutersTransportSettings,settings.listRoutersSettings(), clientContext);
    this.patchRouterCallable = HttpJsonCallableFactory.createUnaryCallable(patchRouterTransportSettings,settings.patchRouterSettings(), clientContext);
    this.previewRouterCallable = HttpJsonCallableFactory.createUnaryCallable(previewRouterTransportSettings,settings.previewRouterSettings(), clientContext);
    this.updateRouterCallable = HttpJsonCallableFactory.createUnaryCallable(updateRouterTransportSettings,settings.updateRouterSettings(), clientContext);

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