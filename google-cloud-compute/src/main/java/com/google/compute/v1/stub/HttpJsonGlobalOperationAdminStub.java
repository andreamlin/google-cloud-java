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
import com.google.compute.v1.AggregatedListGlobalOperationsHttpRequest;
import com.google.compute.v1.DeleteGlobalOperationHttpRequest;
import com.google.compute.v1.GetGlobalOperationHttpRequest;
import com.google.compute.v1.GlobalOperationAdminSettings;
import com.google.compute.v1.GlobalOperationsOperationName;
import com.google.compute.v1.GlobalOperationsProjectName;
import com.google.compute.v1.ListGlobalOperationsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.OperationAggregatedList;
import com.google.compute.v1.OperationList;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListGlobalOperationsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalOperationsPagedResponse;
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
public class HttpJsonGlobalOperationAdminStub extends GlobalOperationAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> directAggregatedListGlobalOperationsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList>newBuilder()
              .setMethodName("compute.globalOperations.aggregatedList")
              .setRequestInstance(AggregatedListGlobalOperationsHttpRequest.getDefaultInstance())
              .setResponseInstance(OperationAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/operations")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteGlobalOperationHttpRequest, Empty> directDeleteGlobalOperationCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteGlobalOperationHttpRequest, Empty>newBuilder()
              .setMethodName("compute.globalOperations.delete")
              .setRequestInstance(DeleteGlobalOperationHttpRequest.getDefaultInstance())
              .setResponseInstance(Empty.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/operations/{operation}")
              .setPathParams(Sets.<String>newHashSet(
                                "operation",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetGlobalOperationHttpRequest, Operation> directGetGlobalOperationCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetGlobalOperationHttpRequest, Operation>newBuilder()
              .setMethodName("compute.globalOperations.get")
              .setRequestInstance(GetGlobalOperationHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/operations/{operation}")
              .setPathParams(Sets.<String>newHashSet(
                                "operation",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListGlobalOperationsHttpRequest, OperationList> directListGlobalOperationsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListGlobalOperationsHttpRequest, OperationList>newBuilder()
              .setMethodName("compute.globalOperations.list")
              .setRequestInstance(ListGlobalOperationsHttpRequest.getDefaultInstance())
              .setResponseInstance(OperationList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/operations")
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

  private final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> aggregatedListGlobalOperationsCallable;
  private final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsPagedCallable;
  private final UnaryCallable<DeleteGlobalOperationHttpRequest, Empty> deleteGlobalOperationCallable;
  private final UnaryCallable<GetGlobalOperationHttpRequest, Operation> getGlobalOperationCallable;
  private final UnaryCallable<ListGlobalOperationsHttpRequest, OperationList> listGlobalOperationsCallable;
  private final UnaryCallable<ListGlobalOperationsHttpRequest, ListGlobalOperationsPagedResponse> listGlobalOperationsPagedCallable;

  public static final HttpJsonGlobalOperationAdminStub create(GlobalOperationAdminSettings settings) throws IOException {
    return new HttpJsonGlobalOperationAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonGlobalOperationAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonGlobalOperationAdminStub(GlobalOperationAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonGlobalOperationAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonGlobalOperationAdminStub(GlobalOperationAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListGlobalOperationsCallable = HttpJsonCallableFactory.create(directAggregatedListGlobalOperationsCallable,settings.aggregatedListGlobalOperationsSettings(), clientContext);
    this.aggregatedListGlobalOperationsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListGlobalOperationsCallable,settings.aggregatedListGlobalOperationsSettings(), clientContext);
    this.deleteGlobalOperationCallable = HttpJsonCallableFactory.create(directDeleteGlobalOperationCallable,settings.deleteGlobalOperationSettings(), clientContext);
    this.getGlobalOperationCallable = HttpJsonCallableFactory.create(directGetGlobalOperationCallable,settings.getGlobalOperationSettings(), clientContext);
    this.listGlobalOperationsCallable = HttpJsonCallableFactory.create(directListGlobalOperationsCallable,settings.listGlobalOperationsSettings(), clientContext);
    this.listGlobalOperationsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListGlobalOperationsCallable,settings.listGlobalOperationsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListGlobalOperationsHttpRequest, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsPagedCallable() {
    return aggregatedListGlobalOperationsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> aggregatedListGlobalOperationsCallable() {
    return aggregatedListGlobalOperationsCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteGlobalOperationHttpRequest, Empty> deleteGlobalOperationCallable() {
    return deleteGlobalOperationCallable;
  }

  @BetaApi
  public UnaryCallable<GetGlobalOperationHttpRequest, Operation> getGlobalOperationCallable() {
    return getGlobalOperationCallable;
  }

  @BetaApi
  public UnaryCallable<ListGlobalOperationsHttpRequest, ListGlobalOperationsPagedResponse> listGlobalOperationsPagedCallable() {
    return listGlobalOperationsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListGlobalOperationsHttpRequest, OperationList> listGlobalOperationsCallable() {
    return listGlobalOperationsCallable;
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