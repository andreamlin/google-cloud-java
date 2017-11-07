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
import com.google.compute.v1.DeleteZoneOperationHttpRequest;
import com.google.compute.v1.GetZoneOperationHttpRequest;
import com.google.compute.v1.ListZoneOperationsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.OperationList;
import static com.google.compute.v1.PagedResponseWrappers.ListZoneOperationsPagedResponse;
import com.google.compute.v1.ZoneName;
import com.google.compute.v1.ZoneOperationSettings;
import com.google.compute.v1.ZoneOperationsOperationName;
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
public class HttpJsonZoneOperationStub extends ZoneOperationStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteZoneOperationHttpRequest, Void> deleteZoneOperationMethodDescriptor =
      ApiMethodDescriptor.<DeleteZoneOperationHttpRequest, Void>newBuilder()
          .setMethodName("compute.zoneOperations.delete")
          .setRequestInstance(DeleteZoneOperationHttpRequest.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/operations/{operation}")
          .setPathParams(Sets.<String>newHashSet(
                            "operation",    "project",    "zone"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build());
  private static final ApiMethodDescriptor<GetZoneOperationHttpRequest, Operation> getZoneOperationMethodDescriptor =
      ApiMethodDescriptor.<GetZoneOperationHttpRequest, Operation>newBuilder()
          .setMethodName("compute.zoneOperations.get")
          .setRequestInstance(GetZoneOperationHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/operations/{operation}")
          .setPathParams(Sets.<String>newHashSet(
                            "operation",    "project",    "zone"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());
  private static final ApiMethodDescriptor<ListZoneOperationsHttpRequest, OperationList> listZoneOperationsMethodDescriptor =
      ApiMethodDescriptor.<ListZoneOperationsHttpRequest, OperationList>newBuilder()
          .setMethodName("compute.zoneOperations.list")
          .setRequestInstance(ListZoneOperationsHttpRequest.getDefaultInstance())
          .setResponseInstance(OperationList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/operations")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "zone"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteZoneOperationHttpRequest, Void> deleteZoneOperationCallable;
  private final UnaryCallable<GetZoneOperationHttpRequest, Operation> getZoneOperationCallable;
  private final UnaryCallable<ListZoneOperationsHttpRequest, OperationList> listZoneOperationsCallable;
  private final UnaryCallable<ListZoneOperationsHttpRequest, ListZoneOperationsPagedResponse> listZoneOperationsPagedCallable;

  public static final HttpJsonZoneOperationStub create(ZoneOperationSettings settings) throws IOException {
    return new HttpJsonZoneOperationStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonZoneOperationStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonZoneOperationStub(ZoneOperationSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonZoneOperationStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonZoneOperationStub(ZoneOperationSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteZoneOperationHttpRequest, Void> deleteZoneOperationTransportSettings =
        HttpJsonCallSettings.<DeleteZoneOperationHttpRequest, Void>newBuilder()
            .setMethodDescriptor(deleteZoneOperationMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetZoneOperationHttpRequest, Operation> getZoneOperationTransportSettings =
        HttpJsonCallSettings.<GetZoneOperationHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(getZoneOperationMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListZoneOperationsHttpRequest, OperationList> listZoneOperationsTransportSettings =
        HttpJsonCallSettings.<ListZoneOperationsHttpRequest, OperationList>newBuilder()
            .setMethodDescriptor(listZoneOperationsMethodDescriptor)
            .build();

    this.deleteZoneOperationCallable = HttpJsonCallableFactory.createUnaryCallable(deleteZoneOperationTransportSettings,settings.deleteZoneOperationSettings(), clientContext);
    this.getZoneOperationCallable = HttpJsonCallableFactory.createUnaryCallable(getZoneOperationTransportSettings,settings.getZoneOperationSettings(), clientContext);
    this.listZoneOperationsCallable = HttpJsonCallableFactory.createUnaryCallable(listZoneOperationsTransportSettings,settings.listZoneOperationsSettings(), clientContext);
    this.listZoneOperationsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listZoneOperationsTransportSettings,settings.listZoneOperationsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteZoneOperationHttpRequest, Void> deleteZoneOperationCallable() {
    return deleteZoneOperationCallable;
  }

  @BetaApi
  public UnaryCallable<GetZoneOperationHttpRequest, Operation> getZoneOperationCallable() {
    return getZoneOperationCallable;
  }

  @BetaApi
  public UnaryCallable<ListZoneOperationsHttpRequest, ListZoneOperationsPagedResponse> listZoneOperationsPagedCallable() {
    return listZoneOperationsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListZoneOperationsHttpRequest, OperationList> listZoneOperationsCallable() {
    return listZoneOperationsCallable;
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