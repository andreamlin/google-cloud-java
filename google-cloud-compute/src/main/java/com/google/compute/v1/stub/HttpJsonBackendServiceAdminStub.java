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
import com.google.compute.v1.AggregatedListBackendServicesHttpRequest;
import com.google.compute.v1.BackendService;
import com.google.compute.v1.BackendServiceAdminSettings;
import com.google.compute.v1.BackendServiceAggregatedList;
import com.google.compute.v1.BackendServiceGroupHealth;
import com.google.compute.v1.BackendServiceList;
import com.google.compute.v1.BackendServiceName;
import com.google.compute.v1.BackendServicesProjectName;
import com.google.compute.v1.DeleteBackendServiceHttpRequest;
import com.google.compute.v1.GetBackendServiceHttpRequest;
import com.google.compute.v1.GetHealthBackendServiceHttpRequest;
import com.google.compute.v1.InsertBackendServiceHttpRequest;
import com.google.compute.v1.ListBackendServicesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListBackendServicesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListBackendServicesPagedResponse;
import com.google.compute.v1.PatchBackendServiceHttpRequest;
import com.google.compute.v1.ResourceGroupReference;
import com.google.compute.v1.UpdateBackendServiceHttpRequest;
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
public class HttpJsonBackendServiceAdminStub extends BackendServiceAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> directAggregatedListBackendServicesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList>newBuilder()
              .setMethodName("compute.backendServices.aggregatedList")
              .setRequestInstance(AggregatedListBackendServicesHttpRequest.getDefaultInstance())
              .setResponseInstance(BackendServiceAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/backendServices")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteBackendServiceHttpRequest, Operation> directDeleteBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteBackendServiceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.backendServices.delete")
              .setRequestInstance(DeleteBackendServiceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices/{backendService}")
              .setPathParams(Sets.<String>newHashSet(
                                "backendService",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetBackendServiceHttpRequest, BackendService> directGetBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetBackendServiceHttpRequest, BackendService>newBuilder()
              .setMethodName("compute.backendServices.get")
              .setRequestInstance(GetBackendServiceHttpRequest.getDefaultInstance())
              .setResponseInstance(BackendService.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices/{backendService}")
              .setPathParams(Sets.<String>newHashSet(
                                "backendService",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> directGetHealthBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth>newBuilder()
              .setMethodName("compute.backendServices.getHealth")
              .setRequestInstance(GetHealthBackendServiceHttpRequest.getDefaultInstance())
              .setResponseInstance(BackendServiceGroupHealth.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices/{backendService}/getHealth")
              .setPathParams(Sets.<String>newHashSet(
                                "backendService",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<InsertBackendServiceHttpRequest, Operation> directInsertBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertBackendServiceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.backendServices.insert")
              .setRequestInstance(InsertBackendServiceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> directListBackendServicesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListBackendServicesHttpRequest, BackendServiceList>newBuilder()
              .setMethodName("compute.backendServices.list")
              .setRequestInstance(ListBackendServicesHttpRequest.getDefaultInstance())
              .setResponseInstance(BackendServiceList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<PatchBackendServiceHttpRequest, Operation> directPatchBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<PatchBackendServiceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.backendServices.patch")
              .setRequestInstance(PatchBackendServiceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices/{backendService}")
              .setPathParams(Sets.<String>newHashSet(
                                "backendService",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PATCH)
              .build());
  private static final UnaryCallable<UpdateBackendServiceHttpRequest, Operation> directUpdateBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<UpdateBackendServiceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.backendServices.update")
              .setRequestInstance(UpdateBackendServiceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/backendServices/{backendService}")
              .setPathParams(Sets.<String>newHashSet(
                                "backendService",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PUT)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesCallable;
  private final UnaryCallable<AggregatedListBackendServicesHttpRequest, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesPagedCallable;
  private final UnaryCallable<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceCallable;
  private final UnaryCallable<GetBackendServiceHttpRequest, BackendService> getBackendServiceCallable;
  private final UnaryCallable<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceCallable;
  private final UnaryCallable<InsertBackendServiceHttpRequest, Operation> insertBackendServiceCallable;
  private final UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesCallable;
  private final UnaryCallable<ListBackendServicesHttpRequest, ListBackendServicesPagedResponse> listBackendServicesPagedCallable;
  private final UnaryCallable<PatchBackendServiceHttpRequest, Operation> patchBackendServiceCallable;
  private final UnaryCallable<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceCallable;

  public static final HttpJsonBackendServiceAdminStub create(BackendServiceAdminSettings settings) throws IOException {
    return new HttpJsonBackendServiceAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonBackendServiceAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonBackendServiceAdminStub(BackendServiceAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonBackendServiceAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonBackendServiceAdminStub(BackendServiceAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListBackendServicesCallable = HttpJsonCallableFactory.create(directAggregatedListBackendServicesCallable,settings.aggregatedListBackendServicesSettings(), clientContext);
    this.aggregatedListBackendServicesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListBackendServicesCallable,settings.aggregatedListBackendServicesSettings(), clientContext);
    this.deleteBackendServiceCallable = HttpJsonCallableFactory.create(directDeleteBackendServiceCallable,settings.deleteBackendServiceSettings(), clientContext);
    this.getBackendServiceCallable = HttpJsonCallableFactory.create(directGetBackendServiceCallable,settings.getBackendServiceSettings(), clientContext);
    this.getHealthBackendServiceCallable = HttpJsonCallableFactory.create(directGetHealthBackendServiceCallable,settings.getHealthBackendServiceSettings(), clientContext);
    this.insertBackendServiceCallable = HttpJsonCallableFactory.create(directInsertBackendServiceCallable,settings.insertBackendServiceSettings(), clientContext);
    this.listBackendServicesCallable = HttpJsonCallableFactory.create(directListBackendServicesCallable,settings.listBackendServicesSettings(), clientContext);
    this.listBackendServicesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListBackendServicesCallable,settings.listBackendServicesSettings(), clientContext);
    this.patchBackendServiceCallable = HttpJsonCallableFactory.create(directPatchBackendServiceCallable,settings.patchBackendServiceSettings(), clientContext);
    this.updateBackendServiceCallable = HttpJsonCallableFactory.create(directUpdateBackendServiceCallable,settings.updateBackendServiceSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListBackendServicesHttpRequest, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesPagedCallable() {
    return aggregatedListBackendServicesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> aggregatedListBackendServicesCallable() {
    return aggregatedListBackendServicesCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceCallable() {
    return deleteBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<GetBackendServiceHttpRequest, BackendService> getBackendServiceCallable() {
    return getBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceCallable() {
    return getHealthBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<InsertBackendServiceHttpRequest, Operation> insertBackendServiceCallable() {
    return insertBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<ListBackendServicesHttpRequest, ListBackendServicesPagedResponse> listBackendServicesPagedCallable() {
    return listBackendServicesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> listBackendServicesCallable() {
    return listBackendServicesCallable;
  }

  @BetaApi
  public UnaryCallable<PatchBackendServiceHttpRequest, Operation> patchBackendServiceCallable() {
    return patchBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceCallable() {
    return updateBackendServiceCallable;
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