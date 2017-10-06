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
import com.google.compute.v1.DeleteRegionOperationHttpRequest;
import com.google.compute.v1.GetRegionOperationHttpRequest;
import com.google.compute.v1.ListRegionOperationsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.OperationList;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionOperationsPagedResponse;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.RegionOperationSettings;
import com.google.compute.v1.RegionOperationsOperationName;
import com.google.protobuf.Empty;
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
public class HttpJsonRegionOperationStub extends RegionOperationStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteRegionOperationHttpRequest, Empty> directDeleteRegionOperationCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteRegionOperationHttpRequest, Empty>newBuilder()
              .setMethodName("compute.regionOperations.delete")
              .setRequestInstance(DeleteRegionOperationHttpRequest.getDefaultInstance())
              .setResponseInstance(Empty.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/operations/{operation}")
              .setPathParams(Sets.<String>newHashSet(
                                "operation",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetRegionOperationHttpRequest, Operation> directGetRegionOperationCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetRegionOperationHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionOperations.get")
              .setRequestInstance(GetRegionOperationHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/operations/{operation}")
              .setPathParams(Sets.<String>newHashSet(
                                "operation",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListRegionOperationsHttpRequest, OperationList> directListRegionOperationsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListRegionOperationsHttpRequest, OperationList>newBuilder()
              .setMethodName("compute.regionOperations.list")
              .setRequestInstance(ListRegionOperationsHttpRequest.getDefaultInstance())
              .setResponseInstance(OperationList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/operations")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteRegionOperationHttpRequest, Empty> deleteRegionOperationCallable;
  private final UnaryCallable<GetRegionOperationHttpRequest, Operation> getRegionOperationCallable;
  private final UnaryCallable<ListRegionOperationsHttpRequest, OperationList> listRegionOperationsCallable;
  private final UnaryCallable<ListRegionOperationsHttpRequest, ListRegionOperationsPagedResponse> listRegionOperationsPagedCallable;

  public static final HttpJsonRegionOperationStub create(RegionOperationSettings settings) throws IOException {
    return new HttpJsonRegionOperationStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionOperationStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionOperationStub(RegionOperationSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionOperationStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionOperationStub(RegionOperationSettings settings, ClientContext clientContext) throws IOException {

    this.deleteRegionOperationCallable = HttpJsonCallableFactory.create(directDeleteRegionOperationCallable,settings.deleteRegionOperationSettings(), clientContext);
    this.getRegionOperationCallable = HttpJsonCallableFactory.create(directGetRegionOperationCallable,settings.getRegionOperationSettings(), clientContext);
    this.listRegionOperationsCallable = HttpJsonCallableFactory.create(directListRegionOperationsCallable,settings.listRegionOperationsSettings(), clientContext);
    this.listRegionOperationsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRegionOperationsCallable,settings.listRegionOperationsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteRegionOperationHttpRequest, Empty> deleteRegionOperationCallable() {
    return deleteRegionOperationCallable;
  }

  @BetaApi
  public UnaryCallable<GetRegionOperationHttpRequest, Operation> getRegionOperationCallable() {
    return getRegionOperationCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionOperationsHttpRequest, ListRegionOperationsPagedResponse> listRegionOperationsPagedCallable() {
    return listRegionOperationsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionOperationsHttpRequest, OperationList> listRegionOperationsCallable() {
    return listRegionOperationsCallable;
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