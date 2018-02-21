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
import com.google.compute.v1.DeleteHttpHealthCheckHttpRequest;
import com.google.compute.v1.GetHttpHealthCheckHttpRequest;
import com.google.compute.v1.HttpHealthCheck;
import static com.google.compute.v1.HttpHealthCheckClient.ListHttpHealthChecksPagedResponse;
import com.google.compute.v1.HttpHealthCheckList;
import com.google.compute.v1.HttpHealthCheckName;
import com.google.compute.v1.HttpHealthCheckSettings;
import com.google.compute.v1.InsertHttpHealthCheckHttpRequest;
import com.google.compute.v1.ListHttpHealthChecksHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.PatchHttpHealthCheckHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateHttpHealthCheckHttpRequest;
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
public class HttpJsonHttpHealthCheckStub extends HttpHealthCheckStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<DeleteHttpHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpHealthChecks.delete")
          .setRequestInstance(DeleteHttpHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpHealthChecks/{httpHealthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "httpHealthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<GetHttpHealthCheckHttpRequest, HttpHealthCheck>newBuilder()
          .setMethodName("compute.httpHealthChecks.get")
          .setRequestInstance(GetHttpHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(HttpHealthCheck.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpHealthChecks/{httpHealthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "httpHealthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<InsertHttpHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpHealthChecks.insert")
          .setRequestInstance(InsertHttpHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpHealthChecks")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> listHttpHealthChecksMethodDescriptor =
      ApiMethodDescriptor.<ListHttpHealthChecksHttpRequest, HttpHealthCheckList>newBuilder()
          .setMethodName("compute.httpHealthChecks.list")
          .setRequestInstance(ListHttpHealthChecksHttpRequest.getDefaultInstance())
          .setResponseInstance(HttpHealthCheckList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpHealthChecks")
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
  public static final ApiMethodDescriptor<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<PatchHttpHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpHealthChecks.patch")
          .setRequestInstance(PatchHttpHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpHealthChecks/{httpHealthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "httpHealthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PATCH)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<UpdateHttpHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpHealthChecks.update")
          .setRequestInstance(UpdateHttpHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpHealthChecks/{httpHealthCheck}")
          .setPathParams(Sets.<String>newHashSet(
                            "httpHealthCheck",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PUT)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckCallable;
  private final UnaryCallable<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckCallable;
  private final UnaryCallable<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckCallable;
  private final UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> listHttpHealthChecksCallable;
  private final UnaryCallable<ListHttpHealthChecksHttpRequest, ListHttpHealthChecksPagedResponse> listHttpHealthChecksPagedCallable;
  private final UnaryCallable<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckCallable;
  private final UnaryCallable<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckCallable;

  public static final HttpJsonHttpHealthCheckStub create(HttpHealthCheckStubSettings settings) throws IOException {
    return new HttpJsonHttpHealthCheckStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonHttpHealthCheckStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonHttpHealthCheckStub(HttpHealthCheckStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonHttpHealthCheckStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonHttpHealthCheckStub(HttpHealthCheckStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckTransportSettings =
        HttpJsonCallSettings.<DeleteHttpHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteHttpHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckTransportSettings =
        HttpJsonCallSettings.<GetHttpHealthCheckHttpRequest, HttpHealthCheck>newBuilder()
            .setMethodDescriptor(getHttpHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckTransportSettings =
        HttpJsonCallSettings.<InsertHttpHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertHttpHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> listHttpHealthChecksTransportSettings =
        HttpJsonCallSettings.<ListHttpHealthChecksHttpRequest, HttpHealthCheckList>newBuilder()
            .setMethodDescriptor(listHttpHealthChecksMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckTransportSettings =
        HttpJsonCallSettings.<PatchHttpHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchHttpHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckTransportSettings =
        HttpJsonCallSettings.<UpdateHttpHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateHttpHealthCheckMethodDescriptor)
            .build();

    this.deleteHttpHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(deleteHttpHealthCheckTransportSettings,settings.deleteHttpHealthCheckSettings(), clientContext);
    this.getHttpHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(getHttpHealthCheckTransportSettings,settings.getHttpHealthCheckSettings(), clientContext);
    this.insertHttpHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(insertHttpHealthCheckTransportSettings,settings.insertHttpHealthCheckSettings(), clientContext);
    this.listHttpHealthChecksCallable = HttpJsonCallableFactory.createUnaryCallable(listHttpHealthChecksTransportSettings,settings.listHttpHealthChecksSettings(), clientContext);
    this.listHttpHealthChecksPagedCallable = HttpJsonCallableFactory.createPagedCallable(listHttpHealthChecksTransportSettings,settings.listHttpHealthChecksSettings(), clientContext);
    this.patchHttpHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(patchHttpHealthCheckTransportSettings,settings.patchHttpHealthCheckSettings(), clientContext);
    this.updateHttpHealthCheckCallable = HttpJsonCallableFactory.createUnaryCallable(updateHttpHealthCheckTransportSettings,settings.updateHttpHealthCheckSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckCallable() {
    return deleteHttpHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckCallable() {
    return getHttpHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckCallable() {
    return insertHttpHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<ListHttpHealthChecksHttpRequest, ListHttpHealthChecksPagedResponse> listHttpHealthChecksPagedCallable() {
    return listHttpHealthChecksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> listHttpHealthChecksCallable() {
    return listHttpHealthChecksCallable;
  }

  @BetaApi
  public UnaryCallable<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckCallable() {
    return patchHttpHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckCallable() {
    return updateHttpHealthCheckCallable;
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