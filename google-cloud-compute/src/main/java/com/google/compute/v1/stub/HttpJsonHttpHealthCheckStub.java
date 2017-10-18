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
import com.google.api.gax.rpc.EmptyRequestParamsExtractor;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteHttpHealthCheckHttpRequest;
import com.google.compute.v1.GetHttpHealthCheckHttpRequest;
import com.google.compute.v1.HttpHealthCheck;
import com.google.compute.v1.HttpHealthCheckList;
import com.google.compute.v1.HttpHealthCheckName;
import com.google.compute.v1.HttpHealthCheckSettings;
import com.google.compute.v1.InsertHttpHealthCheckHttpRequest;
import com.google.compute.v1.ListHttpHealthChecksHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListHttpHealthChecksPagedResponse;
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
@BetaApi
public class HttpJsonHttpHealthCheckStub extends HttpHealthCheckStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteHttpHealthCheckHttpRequest, Operation> directDeleteHttpHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<GetHttpHealthCheckHttpRequest, HttpHealthCheck> directGetHttpHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<InsertHttpHealthCheckHttpRequest, Operation> directInsertHttpHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> directListHttpHealthChecksCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<PatchHttpHealthCheckHttpRequest, Operation> directPatchHttpHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());
  private static final UnaryCallable<UpdateHttpHealthCheckHttpRequest, Operation> directUpdateHttpHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
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
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckCallable;
  private final UnaryCallable<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckCallable;
  private final UnaryCallable<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckCallable;
  private final UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> listHttpHealthChecksCallable;
  private final UnaryCallable<ListHttpHealthChecksHttpRequest, ListHttpHealthChecksPagedResponse> listHttpHealthChecksPagedCallable;
  private final UnaryCallable<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckCallable;
  private final UnaryCallable<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckCallable;

  public static final HttpJsonHttpHealthCheckStub create(HttpHealthCheckSettings settings) throws IOException {
    return new HttpJsonHttpHealthCheckStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonHttpHealthCheckStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonHttpHealthCheckStub(HttpHealthCheckSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonHttpHealthCheckStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonHttpHealthCheckStub(HttpHealthCheckSettings settings, ClientContext clientContext) throws IOException {

    this.deleteHttpHealthCheckCallable = HttpJsonCallableFactory.create(directDeleteHttpHealthCheckCallable,settings.deleteHttpHealthCheckSettings(), clientContext);
    this.getHttpHealthCheckCallable = HttpJsonCallableFactory.create(directGetHttpHealthCheckCallable,settings.getHttpHealthCheckSettings(), clientContext);
    this.insertHttpHealthCheckCallable = HttpJsonCallableFactory.create(directInsertHttpHealthCheckCallable,settings.insertHttpHealthCheckSettings(), clientContext);
    this.listHttpHealthChecksCallable = HttpJsonCallableFactory.create(directListHttpHealthChecksCallable,settings.listHttpHealthChecksSettings(), clientContext);
    this.listHttpHealthChecksPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListHttpHealthChecksCallable,settings.listHttpHealthChecksSettings(), clientContext);
    this.patchHttpHealthCheckCallable = HttpJsonCallableFactory.create(directPatchHttpHealthCheckCallable,settings.patchHttpHealthCheckSettings(), clientContext);
    this.updateHttpHealthCheckCallable = HttpJsonCallableFactory.create(directUpdateHttpHealthCheckCallable,settings.updateHttpHealthCheckSettings(), clientContext);

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