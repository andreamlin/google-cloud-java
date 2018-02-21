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
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.AggregatedListGlobalOperationsHttpRequest;
import com.google.compute.v1.DeleteGlobalOperationHttpRequest;
import com.google.compute.v1.GetGlobalOperationHttpRequest;
import static com.google.compute.v1.GlobalOperationClient.AggregatedListGlobalOperationsPagedResponse;
import static com.google.compute.v1.GlobalOperationClient.ListGlobalOperationsPagedResponse;
import com.google.compute.v1.GlobalOperationSettings;
import com.google.compute.v1.GlobalOperationsOperationName;
import com.google.compute.v1.ListGlobalOperationsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.OperationAggregatedList;
import com.google.compute.v1.OperationList;
import com.google.compute.v1.ProjectName;
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
public class HttpJsonGlobalOperationStub extends GlobalOperationStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> aggregatedListGlobalOperationsMethodDescriptor =
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
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<DeleteGlobalOperationHttpRequest, java.lang.Void> deleteGlobalOperationMethodDescriptor =
      ApiMethodDescriptor.<DeleteGlobalOperationHttpRequest, java.lang.Void>newBuilder()
          .setMethodName("compute.globalOperations.delete")
          .setRequestInstance(DeleteGlobalOperationHttpRequest.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/operations/{operation}")
          .setPathParams(Sets.<String>newHashSet(
                            "operation",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<GetGlobalOperationHttpRequest, Operation> getGlobalOperationMethodDescriptor =
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
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListGlobalOperationsHttpRequest, OperationList> listGlobalOperationsMethodDescriptor =
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
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> aggregatedListGlobalOperationsCallable;
  private final UnaryCallable<AggregatedListGlobalOperationsHttpRequest, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsPagedCallable;
  private final UnaryCallable<DeleteGlobalOperationHttpRequest, java.lang.Void> deleteGlobalOperationCallable;
  private final UnaryCallable<GetGlobalOperationHttpRequest, Operation> getGlobalOperationCallable;
  private final UnaryCallable<ListGlobalOperationsHttpRequest, OperationList> listGlobalOperationsCallable;
  private final UnaryCallable<ListGlobalOperationsHttpRequest, ListGlobalOperationsPagedResponse> listGlobalOperationsPagedCallable;

  public static final HttpJsonGlobalOperationStub create(GlobalOperationStubSettings settings) throws IOException {
    return new HttpJsonGlobalOperationStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonGlobalOperationStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonGlobalOperationStub(GlobalOperationStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonGlobalOperationStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonGlobalOperationStub(GlobalOperationStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> aggregatedListGlobalOperationsTransportSettings =
        HttpJsonCallSettings.<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListGlobalOperationsMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteGlobalOperationHttpRequest, java.lang.Void> deleteGlobalOperationTransportSettings =
        HttpJsonCallSettings.<DeleteGlobalOperationHttpRequest, java.lang.Void>newBuilder()
            .setMethodDescriptor(deleteGlobalOperationMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetGlobalOperationHttpRequest, Operation> getGlobalOperationTransportSettings =
        HttpJsonCallSettings.<GetGlobalOperationHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(getGlobalOperationMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListGlobalOperationsHttpRequest, OperationList> listGlobalOperationsTransportSettings =
        HttpJsonCallSettings.<ListGlobalOperationsHttpRequest, OperationList>newBuilder()
            .setMethodDescriptor(listGlobalOperationsMethodDescriptor)
            .build();

    this.aggregatedListGlobalOperationsCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListGlobalOperationsTransportSettings,settings.aggregatedListGlobalOperationsSettings(), clientContext);
    this.aggregatedListGlobalOperationsPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListGlobalOperationsTransportSettings,settings.aggregatedListGlobalOperationsSettings(), clientContext);
    this.deleteGlobalOperationCallable = HttpJsonCallableFactory.createUnaryCallable(deleteGlobalOperationTransportSettings,settings.deleteGlobalOperationSettings(), clientContext);
    this.getGlobalOperationCallable = HttpJsonCallableFactory.createUnaryCallable(getGlobalOperationTransportSettings,settings.getGlobalOperationSettings(), clientContext);
    this.listGlobalOperationsCallable = HttpJsonCallableFactory.createUnaryCallable(listGlobalOperationsTransportSettings,settings.listGlobalOperationsSettings(), clientContext);
    this.listGlobalOperationsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listGlobalOperationsTransportSettings,settings.listGlobalOperationsSettings(), clientContext);

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
  public UnaryCallable<DeleteGlobalOperationHttpRequest, java.lang.Void> deleteGlobalOperationCallable() {
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