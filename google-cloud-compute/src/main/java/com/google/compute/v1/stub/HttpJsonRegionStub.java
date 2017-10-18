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
import com.google.api.gax.rpc.EmptyRequestParamsExtractor;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.GetRegionHttpRequest;
import com.google.compute.v1.ListRegionsHttpRequest;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionsPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.Region;
import com.google.compute.v1.RegionList;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.RegionSettings;
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
public class HttpJsonRegionStub extends RegionStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<GetRegionHttpRequest, Region> directGetRegionCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetRegionHttpRequest, Region>newBuilder()
              .setMethodName("compute.regions.get")
              .setRequestInstance(GetRegionHttpRequest.getDefaultInstance())
              .setResponseInstance(Region.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListRegionsHttpRequest, RegionList> directListRegionsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListRegionsHttpRequest, RegionList>newBuilder()
              .setMethodName("compute.regions.list")
              .setRequestInstance(ListRegionsHttpRequest.getDefaultInstance())
              .setResponseInstance(RegionList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions")
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

  private final UnaryCallable<GetRegionHttpRequest, Region> getRegionCallable;
  private final UnaryCallable<ListRegionsHttpRequest, RegionList> listRegionsCallable;
  private final UnaryCallable<ListRegionsHttpRequest, ListRegionsPagedResponse> listRegionsPagedCallable;

  public static final HttpJsonRegionStub create(RegionSettings settings) throws IOException {
    return new HttpJsonRegionStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionStub(RegionSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionStub(RegionSettings settings, ClientContext clientContext) throws IOException {

    this.getRegionCallable = HttpJsonCallableFactory.create(directGetRegionCallable,settings.getRegionSettings(), clientContext);
    this.listRegionsCallable = HttpJsonCallableFactory.create(directListRegionsCallable,settings.listRegionsSettings(), clientContext);
    this.listRegionsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRegionsCallable,settings.listRegionsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetRegionHttpRequest, Region> getRegionCallable() {
    return getRegionCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionsHttpRequest, ListRegionsPagedResponse> listRegionsPagedCallable() {
    return listRegionsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionsHttpRequest, RegionList> listRegionsCallable() {
    return listRegionsCallable;
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