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
import com.google.compute.v1.RegionBackendServiceAdminSettings;
import com.google.compute.v1.RegionBackendServicesBackendServiceName;
import com.google.compute.v1.RegionBackendServicesRegionName;
import com.google.compute.v1.ResourceGroupReference;
import com.google.compute.v1.UpdateRegionBackendServiceHttpRequest;
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
public class HttpRegionBackendServiceAdminStub extends RegionBackendServiceAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteRegionBackendServiceHttpRequest, Operation> directDeleteRegionBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
  private static final UnaryCallable<GetRegionBackendServiceHttpRequest, BackendService> directGetRegionBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
  private static final UnaryCallable<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> directGetHealthRegionBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
  private static final UnaryCallable<InsertRegionBackendServiceHttpRequest, Operation> directInsertRegionBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
  private static final UnaryCallable<ListRegionBackendServicesHttpRequest, BackendServiceList> directListRegionBackendServicesCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
  private static final UnaryCallable<PatchRegionBackendServiceHttpRequest, Operation> directPatchRegionBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
  private static final UnaryCallable<UpdateRegionBackendServiceHttpRequest, Operation> directUpdateRegionBackendServiceCallable =
      HttpJsonCallableFactory.createDirectCallable(
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

  public static final HttpRegionBackendServiceAdminStub create(RegionBackendServiceAdminSettings settings) throws IOException {
    return new HttpRegionBackendServiceAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpRegionBackendServiceAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpRegionBackendServiceAdminStub(RegionBackendServiceAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpRegionBackendServiceAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpRegionBackendServiceAdminStub(RegionBackendServiceAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteRegionBackendServiceCallable = HttpJsonCallableFactory.create(directDeleteRegionBackendServiceCallable,settings.deleteRegionBackendServiceSettings(), clientContext);
    this.getRegionBackendServiceCallable = HttpJsonCallableFactory.create(directGetRegionBackendServiceCallable,settings.getRegionBackendServiceSettings(), clientContext);
    this.getHealthRegionBackendServiceCallable = HttpJsonCallableFactory.create(directGetHealthRegionBackendServiceCallable,settings.getHealthRegionBackendServiceSettings(), clientContext);
    this.insertRegionBackendServiceCallable = HttpJsonCallableFactory.create(directInsertRegionBackendServiceCallable,settings.insertRegionBackendServiceSettings(), clientContext);
    this.listRegionBackendServicesCallable = HttpJsonCallableFactory.create(directListRegionBackendServicesCallable,settings.listRegionBackendServicesSettings(), clientContext);
    this.listRegionBackendServicesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRegionBackendServicesCallable,settings.listRegionBackendServicesSettings(), clientContext);
    this.patchRegionBackendServiceCallable = HttpJsonCallableFactory.create(directPatchRegionBackendServiceCallable,settings.patchRegionBackendServiceSettings(), clientContext);
    this.updateRegionBackendServiceCallable = HttpJsonCallableFactory.create(directUpdateRegionBackendServiceCallable,settings.updateRegionBackendServiceSettings(), clientContext);

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