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
import com.google.compute.v1.BackendService;
import com.google.compute.v1.BackendServiceGroupHealth;
import com.google.compute.v1.BackendServiceList;
import com.google.compute.v1.DeleteRegionBackendServiceHttpRequest;
import com.google.compute.v1.GetHealthRegionBackendServiceHttpRequest;
import com.google.compute.v1.GetRegionBackendServiceHttpRequest;
import com.google.compute.v1.InsertRegionBackendServiceHttpRequest;
import com.google.compute.v1.ListRegionBackendServicesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionBackendServicesPagedResponse;
import com.google.compute.v1.PatchRegionBackendServiceHttpRequest;
import com.google.compute.v1.RegionBackendServiceSettings;
import com.google.compute.v1.RegionBackendServicesBackendServiceName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.ResourceGroupReference;
import com.google.compute.v1.UpdateRegionBackendServiceHttpRequest;
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
public class HttpJsonRegionBackendServiceStub extends RegionBackendServiceStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<DeleteRegionBackendServiceHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionBackendServices.delete")
          .setRequestInstance(DeleteRegionBackendServiceHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices/{backendService}")
          .setPathParams(Sets.<String>newHashSet(
                            "backendService",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build());
  private static final ApiMethodDescriptor<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<GetRegionBackendServiceHttpRequest, BackendService>newBuilder()
          .setMethodName("compute.regionBackendServices.get")
          .setRequestInstance(GetRegionBackendServiceHttpRequest.getDefaultInstance())
          .setResponseInstance(BackendService.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices/{backendService}")
          .setPathParams(Sets.<String>newHashSet(
                            "backendService",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());
  private static final ApiMethodDescriptor<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth>newBuilder()
          .setMethodName("compute.regionBackendServices.getHealth")
          .setRequestInstance(GetHealthRegionBackendServiceHttpRequest.getDefaultInstance())
          .setResponseInstance(BackendServiceGroupHealth.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices/{backendService}/getHealth")
          .setPathParams(Sets.<String>newHashSet(
                            "backendService",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build());
  private static final ApiMethodDescriptor<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<InsertRegionBackendServiceHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionBackendServices.insert")
          .setRequestInstance(InsertRegionBackendServiceHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build());
  private static final ApiMethodDescriptor<ListRegionBackendServicesHttpRequest, BackendServiceList> listRegionBackendServicesMethodDescriptor =
      ApiMethodDescriptor.<ListRegionBackendServicesHttpRequest, BackendServiceList>newBuilder()
          .setMethodName("compute.regionBackendServices.list")
          .setRequestInstance(ListRegionBackendServicesHttpRequest.getDefaultInstance())
          .setResponseInstance(BackendServiceList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());
  private static final ApiMethodDescriptor<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<PatchRegionBackendServiceHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionBackendServices.patch")
          .setRequestInstance(PatchRegionBackendServiceHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices/{backendService}")
          .setPathParams(Sets.<String>newHashSet(
                            "backendService",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PATCH)
          .build());
  private static final ApiMethodDescriptor<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceMethodDescriptor =
      ApiMethodDescriptor.<UpdateRegionBackendServiceHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionBackendServices.update")
          .setRequestInstance(UpdateRegionBackendServiceHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/backendServices/{backendService}")
          .setPathParams(Sets.<String>newHashSet(
                            "backendService",    "project",    "region"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PUT)
          .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceCallable;
  private final UnaryCallable<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceCallable;
  private final UnaryCallable<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceCallable;
  private final UnaryCallable<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceCallable;
  private final UnaryCallable<ListRegionBackendServicesHttpRequest, BackendServiceList> listRegionBackendServicesCallable;
  private final UnaryCallable<ListRegionBackendServicesHttpRequest, ListRegionBackendServicesPagedResponse> listRegionBackendServicesPagedCallable;
  private final UnaryCallable<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceCallable;
  private final UnaryCallable<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceCallable;

  public static final HttpJsonRegionBackendServiceStub create(RegionBackendServiceSettings settings) throws IOException {
    return new HttpJsonRegionBackendServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionBackendServiceStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionBackendServiceStub(RegionBackendServiceSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionBackendServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionBackendServiceStub(RegionBackendServiceSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceTransportSettings =
        HttpJsonCallSettings.<DeleteRegionBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteRegionBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceTransportSettings =
        HttpJsonCallSettings.<GetRegionBackendServiceHttpRequest, BackendService>newBuilder()
            .setMethodDescriptor(getRegionBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceTransportSettings =
        HttpJsonCallSettings.<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth>newBuilder()
            .setMethodDescriptor(getHealthRegionBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceTransportSettings =
        HttpJsonCallSettings.<InsertRegionBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertRegionBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRegionBackendServicesHttpRequest, BackendServiceList> listRegionBackendServicesTransportSettings =
        HttpJsonCallSettings.<ListRegionBackendServicesHttpRequest, BackendServiceList>newBuilder()
            .setMethodDescriptor(listRegionBackendServicesMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceTransportSettings =
        HttpJsonCallSettings.<PatchRegionBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchRegionBackendServiceMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceTransportSettings =
        HttpJsonCallSettings.<UpdateRegionBackendServiceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateRegionBackendServiceMethodDescriptor)
            .build();

    this.deleteRegionBackendServiceCallable = HttpJsonCallableFactory.createUnaryCallable(deleteRegionBackendServiceTransportSettings,settings.deleteRegionBackendServiceSettings(), clientContext);
    this.getRegionBackendServiceCallable = HttpJsonCallableFactory.createUnaryCallable(getRegionBackendServiceTransportSettings,settings.getRegionBackendServiceSettings(), clientContext);
    this.getHealthRegionBackendServiceCallable = HttpJsonCallableFactory.createUnaryCallable(getHealthRegionBackendServiceTransportSettings,settings.getHealthRegionBackendServiceSettings(), clientContext);
    this.insertRegionBackendServiceCallable = HttpJsonCallableFactory.createUnaryCallable(insertRegionBackendServiceTransportSettings,settings.insertRegionBackendServiceSettings(), clientContext);
    this.listRegionBackendServicesCallable = HttpJsonCallableFactory.createUnaryCallable(listRegionBackendServicesTransportSettings,settings.listRegionBackendServicesSettings(), clientContext);
    this.listRegionBackendServicesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listRegionBackendServicesTransportSettings,settings.listRegionBackendServicesSettings(), clientContext);
    this.patchRegionBackendServiceCallable = HttpJsonCallableFactory.createUnaryCallable(patchRegionBackendServiceTransportSettings,settings.patchRegionBackendServiceSettings(), clientContext);
    this.updateRegionBackendServiceCallable = HttpJsonCallableFactory.createUnaryCallable(updateRegionBackendServiceTransportSettings,settings.updateRegionBackendServiceSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceCallable() {
    return deleteRegionBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceCallable() {
    return getRegionBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceCallable() {
    return getHealthRegionBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceCallable() {
    return insertRegionBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionBackendServicesHttpRequest, ListRegionBackendServicesPagedResponse> listRegionBackendServicesPagedCallable() {
    return listRegionBackendServicesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionBackendServicesHttpRequest, BackendServiceList> listRegionBackendServicesCallable() {
    return listRegionBackendServicesCallable;
  }

  @BetaApi
  public UnaryCallable<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceCallable() {
    return patchRegionBackendServiceCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceCallable() {
    return updateRegionBackendServiceCallable;
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