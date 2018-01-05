/*
 * Copyright 2017 Google LLC
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
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteHealthCheckHttpRequest;
import com.google.compute.v1.GetHealthCheckHttpRequest;
import com.google.compute.v1.HealthCheck;
import com.google.compute.v1.HealthCheckList;
import com.google.compute.v1.HealthCheckName;
import com.google.compute.v1.HealthCheckSettings;
import com.google.compute.v1.InsertHealthCheckHttpRequest;
import com.google.compute.v1.ListHealthChecksHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListHealthChecksPagedResponse;
import com.google.compute.v1.PatchHealthCheckHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateHealthCheckHttpRequest;
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
public class HttpJsonHealthCheckStub extends HealthCheckStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteHealthCheckHttpRequest, Operation> deleteHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<DeleteHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.healthChecks.delete")
          .setRequestInstance(DeleteHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/healthChecks/{healthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "healthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  private static final ApiMethodDescriptor<GetHealthCheckHttpRequest, HealthCheck> getHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<GetHealthCheckHttpRequest, HealthCheck>newBuilder()
          .setMethodName("compute.healthChecks.get")
          .setRequestInstance(GetHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(HealthCheck.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/healthChecks/{healthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "healthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<InsertHealthCheckHttpRequest, Operation> insertHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<InsertHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.healthChecks.insert")
          .setRequestInstance(InsertHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/healthChecks")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<ListHealthChecksHttpRequest, HealthCheckList> listHealthChecksMethodDescriptor =
      ApiMethodDescriptor.<ListHealthChecksHttpRequest, HealthCheckList>newBuilder()
          .setMethodName("compute.healthChecks.list")
          .setRequestInstance(ListHealthChecksHttpRequest.getDefaultInstance())
          .setResponseInstance(HealthCheckList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/healthChecks")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<PatchHealthCheckHttpRequest, Operation> patchHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<PatchHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.healthChecks.patch")
          .setRequestInstance(PatchHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/healthChecks/{healthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "healthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PATCH)
          .build();
  private static final ApiMethodDescriptor<UpdateHealthCheckHttpRequest, Operation> updateHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<UpdateHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.healthChecks.update")
          .setRequestInstance(UpdateHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/healthChecks/{healthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "healthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PUT)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteHealthCheckHttpRequest, Operation> deleteHealthCheckCallable;
  private final UnaryCallable<GetHealthCheckHttpRequest, HealthCheck> getHealthCheckCallable;
  private final UnaryCallable<InsertHealthCheckHttpRequest, Operation> insertHealthCheckCallable;
  private final UnaryCallable<ListHealthChecksHttpRequest, HealthCheckList> listHealthChecksCallable;
  private final UnaryCallable<ListHealthChecksHttpRequest, ListHealthChecksPagedResponse> listHealthChecksPagedCallable;
  private final UnaryCallable<PatchHealthCheckHttpRequest, Operation> patchHealthCheckCallable;
  private final UnaryCallable<UpdateHealthCheckHttpRequest, Operation> updateHealthCheckCallable;

  public static final HttpJsonHealthCheckStub create(HealthCheckSettings settings) throws IOException {
    return new HttpJsonHealthCheckStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonHealthCheckStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonHealthCheckStub(HealthCheckSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonHealthCheckStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonHealthCheckStub(HealthCheckSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteHealthCheckHttpRequest, Operation> deleteHealthCheckTransportSettings =
        HttpJsonCallSettings.<DeleteHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetHealthCheckHttpRequest, HealthCheck> getHealthCheckTransportSettings =
        HttpJsonCallSettings.<GetHealthCheckHttpRequest, HealthCheck>newBuilder()
            .setMethodDescriptor(getHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertHealthCheckHttpRequest, Operation> insertHealthCheckTransportSettings =
        HttpJsonCallSettings.<InsertHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListHealthChecksHttpRequest, HealthCheckList> listHealthChecksTransportSettings =
        HttpJsonCallSettings.<ListHealthChecksHttpRequest, HealthCheckList>newBuilder()
            .setMethodDescriptor(listHealthChecksMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchHealthCheckHttpRequest, Operation> patchHealthCheckTransportSettings =
        HttpJsonCallSettings.<PatchHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateHealthCheckHttpRequest, Operation> updateHealthCheckTransportSettings =
        HttpJsonCallSettings.<UpdateHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateHealthCheckMethodDescriptor)
            .build();

    this.deleteHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(deleteHealthCheckTransportSettings,settings.deleteHealthCheckSettings(), clientContext);
    this.getHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(getHealthCheckTransportSettings,settings.getHealthCheckSettings(), clientContext);
    this.insertHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(insertHealthCheckTransportSettings,settings.insertHealthCheckSettings(), clientContext);
    this.listHealthChecksCallable = HttpJsonCallableFactory.createUnaryCallable(listHealthChecksTransportSettings,settings.listHealthChecksSettings(), clientContext);
    this.listHealthChecksPagedCallable = HttpJsonCallableFactory.createPagedCallable(listHealthChecksTransportSettings,settings.listHealthChecksSettings(), clientContext);
    this.patchHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(patchHealthCheckTransportSettings,settings.patchHealthCheckSettings(), clientContext);
    this.updateHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(updateHealthCheckTransportSettings,settings.updateHealthCheckSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteHealthCheckHttpRequest, Operation> deleteHealthCheckCallable() {
    return deleteHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<GetHealthCheckHttpRequest, HealthCheck> getHealthCheckCallable() {
    return getHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<InsertHealthCheckHttpRequest, Operation> insertHealthCheckCallable() {
    return insertHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<ListHealthChecksHttpRequest, ListHealthChecksPagedResponse> listHealthChecksPagedCallable() {
    return listHealthChecksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListHealthChecksHttpRequest, HealthCheckList> listHealthChecksCallable() {
    return listHealthChecksCallable;
  }

  @BetaApi
  public UnaryCallable<PatchHealthCheckHttpRequest, Operation> patchHealthCheckCallable() {
    return patchHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateHealthCheckHttpRequest, Operation> updateHealthCheckCallable() {
    return updateHealthCheckCallable;
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