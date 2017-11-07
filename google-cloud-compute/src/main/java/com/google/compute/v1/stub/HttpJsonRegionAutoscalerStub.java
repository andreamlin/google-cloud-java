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
import com.google.compute.v1.Autoscaler;
import com.google.compute.v1.DeleteRegionAutoscalerHttpRequest;
import com.google.compute.v1.GetRegionAutoscalerHttpRequest;
import com.google.compute.v1.InsertRegionAutoscalerHttpRequest;
import com.google.compute.v1.ListRegionAutoscalersHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionAutoscalersPagedResponse;
import com.google.compute.v1.PatchRegionAutoscalerHttpRequest;
import com.google.compute.v1.RegionAutoscalerList;
import com.google.compute.v1.RegionAutoscalerSettings;
import com.google.compute.v1.RegionAutoscalersAutoscalerName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.UpdateRegionAutoscalerHttpRequest;
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
public class HttpJsonRegionAutoscalerStub extends RegionAutoscalerStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteRegionAutoscalerHttpRequest, Operation> deleteRegionAutoscalerMethodDescriptor =
      ApiMethodDescriptor.<DeleteRegionAutoscalerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionAutoscalers.delete")
          .setRequestInstance(DeleteRegionAutoscalerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/autoscalers/{autoscaler}")
          .setPathParams(Sets.<String>newHashSet(
                            "autoscaler",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  private static final ApiMethodDescriptor<GetRegionAutoscalerHttpRequest, Autoscaler> getRegionAutoscalerMethodDescriptor =
      ApiMethodDescriptor.<GetRegionAutoscalerHttpRequest, Autoscaler>newBuilder()
          .setMethodName("compute.regionAutoscalers.get")
          .setRequestInstance(GetRegionAutoscalerHttpRequest.getDefaultInstance())
          .setResponseInstance(Autoscaler.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/autoscalers/{autoscaler}")
          .setPathParams(Sets.<String>newHashSet(
                            "autoscaler",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<InsertRegionAutoscalerHttpRequest, Operation> insertRegionAutoscalerMethodDescriptor =
      ApiMethodDescriptor.<InsertRegionAutoscalerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionAutoscalers.insert")
          .setRequestInstance(InsertRegionAutoscalerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/autoscalers")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<ListRegionAutoscalersHttpRequest, RegionAutoscalerList> listRegionAutoscalersMethodDescriptor =
      ApiMethodDescriptor.<ListRegionAutoscalersHttpRequest, RegionAutoscalerList>newBuilder()
          .setMethodName("compute.regionAutoscalers.list")
          .setRequestInstance(ListRegionAutoscalersHttpRequest.getDefaultInstance())
          .setResponseInstance(RegionAutoscalerList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/autoscalers")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<PatchRegionAutoscalerHttpRequest, Operation> patchRegionAutoscalerMethodDescriptor =
      ApiMethodDescriptor.<PatchRegionAutoscalerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionAutoscalers.patch")
          .setRequestInstance(PatchRegionAutoscalerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/autoscalers")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "autoscaler"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PATCH)
          .build();
  private static final ApiMethodDescriptor<UpdateRegionAutoscalerHttpRequest, Operation> updateRegionAutoscalerMethodDescriptor =
      ApiMethodDescriptor.<UpdateRegionAutoscalerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionAutoscalers.update")
          .setRequestInstance(UpdateRegionAutoscalerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/autoscalers")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "autoscaler"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PUT)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteRegionAutoscalerHttpRequest, Operation> deleteRegionAutoscalerCallable;
  private final UnaryCallable<GetRegionAutoscalerHttpRequest, Autoscaler> getRegionAutoscalerCallable;
  private final UnaryCallable<InsertRegionAutoscalerHttpRequest, Operation> insertRegionAutoscalerCallable;
  private final UnaryCallable<ListRegionAutoscalersHttpRequest, RegionAutoscalerList> listRegionAutoscalersCallable;
  private final UnaryCallable<ListRegionAutoscalersHttpRequest, ListRegionAutoscalersPagedResponse> listRegionAutoscalersPagedCallable;
  private final UnaryCallable<PatchRegionAutoscalerHttpRequest, Operation> patchRegionAutoscalerCallable;
  private final UnaryCallable<UpdateRegionAutoscalerHttpRequest, Operation> updateRegionAutoscalerCallable;

  public static final HttpJsonRegionAutoscalerStub create(RegionAutoscalerSettings settings) throws IOException {
    return new HttpJsonRegionAutoscalerStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionAutoscalerStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionAutoscalerStub(RegionAutoscalerSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionAutoscalerStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionAutoscalerStub(RegionAutoscalerSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteRegionAutoscalerHttpRequest, Operation> deleteRegionAutoscalerTransportSettings =
        HttpJsonCallSettings.<DeleteRegionAutoscalerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteRegionAutoscalerMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetRegionAutoscalerHttpRequest, Autoscaler> getRegionAutoscalerTransportSettings =
        HttpJsonCallSettings.<GetRegionAutoscalerHttpRequest, Autoscaler>newBuilder()
            .setMethodDescriptor(getRegionAutoscalerMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertRegionAutoscalerHttpRequest, Operation> insertRegionAutoscalerTransportSettings =
        HttpJsonCallSettings.<InsertRegionAutoscalerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertRegionAutoscalerMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRegionAutoscalersHttpRequest, RegionAutoscalerList> listRegionAutoscalersTransportSettings =
        HttpJsonCallSettings.<ListRegionAutoscalersHttpRequest, RegionAutoscalerList>newBuilder()
            .setMethodDescriptor(listRegionAutoscalersMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchRegionAutoscalerHttpRequest, Operation> patchRegionAutoscalerTransportSettings =
        HttpJsonCallSettings.<PatchRegionAutoscalerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchRegionAutoscalerMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateRegionAutoscalerHttpRequest, Operation> updateRegionAutoscalerTransportSettings =
        HttpJsonCallSettings.<UpdateRegionAutoscalerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateRegionAutoscalerMethodDescriptor)
            .build();

    this.deleteRegionAutoscalerCallable = HttpJsonCallableFactory.createUnaryCallable(deleteRegionAutoscalerTransportSettings,settings.deleteRegionAutoscalerSettings(), clientContext);
    this.getRegionAutoscalerCallable = HttpJsonCallableFactory.createUnaryCallable(getRegionAutoscalerTransportSettings,settings.getRegionAutoscalerSettings(), clientContext);
    this.insertRegionAutoscalerCallable = HttpJsonCallableFactory.createUnaryCallable(insertRegionAutoscalerTransportSettings,settings.insertRegionAutoscalerSettings(), clientContext);
    this.listRegionAutoscalersCallable = HttpJsonCallableFactory.createUnaryCallable(listRegionAutoscalersTransportSettings,settings.listRegionAutoscalersSettings(), clientContext);
    this.listRegionAutoscalersPagedCallable = HttpJsonCallableFactory.createPagedCallable(listRegionAutoscalersTransportSettings,settings.listRegionAutoscalersSettings(), clientContext);
    this.patchRegionAutoscalerCallable = HttpJsonCallableFactory.createUnaryCallable(patchRegionAutoscalerTransportSettings,settings.patchRegionAutoscalerSettings(), clientContext);
    this.updateRegionAutoscalerCallable = HttpJsonCallableFactory.createUnaryCallable(updateRegionAutoscalerTransportSettings,settings.updateRegionAutoscalerSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteRegionAutoscalerHttpRequest, Operation> deleteRegionAutoscalerCallable() {
    return deleteRegionAutoscalerCallable;
  }

  @BetaApi
  public UnaryCallable<GetRegionAutoscalerHttpRequest, Autoscaler> getRegionAutoscalerCallable() {
    return getRegionAutoscalerCallable;
  }

  @BetaApi
  public UnaryCallable<InsertRegionAutoscalerHttpRequest, Operation> insertRegionAutoscalerCallable() {
    return insertRegionAutoscalerCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionAutoscalersHttpRequest, ListRegionAutoscalersPagedResponse> listRegionAutoscalersPagedCallable() {
    return listRegionAutoscalersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionAutoscalersHttpRequest, RegionAutoscalerList> listRegionAutoscalersCallable() {
    return listRegionAutoscalersCallable;
  }

  @BetaApi
  public UnaryCallable<PatchRegionAutoscalerHttpRequest, Operation> patchRegionAutoscalerCallable() {
    return patchRegionAutoscalerCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateRegionAutoscalerHttpRequest, Operation> updateRegionAutoscalerCallable() {
    return updateRegionAutoscalerCallable;
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