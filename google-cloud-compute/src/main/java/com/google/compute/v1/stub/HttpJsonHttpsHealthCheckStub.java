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
import com.google.compute.v1.DeleteHttpsHealthCheckHttpRequest;
import com.google.compute.v1.GetHttpsHealthCheckHttpRequest;
import com.google.compute.v1.HttpsHealthCheck;
import com.google.compute.v1.HttpsHealthCheckList;
import com.google.compute.v1.HttpsHealthCheckName;
import com.google.compute.v1.HttpsHealthCheckSettings;
import com.google.compute.v1.InsertHttpsHealthCheckHttpRequest;
import com.google.compute.v1.ListHttpsHealthChecksHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListHttpsHealthChecksPagedResponse;
import com.google.compute.v1.PatchHttpsHealthCheckHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateHttpsHealthCheckHttpRequest;
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
public class HttpJsonHttpsHealthCheckStub extends HttpsHealthCheckStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteHttpsHealthCheckHttpRequest, Operation> directDeleteHttpsHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteHttpsHealthCheckHttpRequest, Operation>newBuilder()
              .setMethodName("compute.httpsHealthChecks.delete")
              .setRequestInstance(DeleteHttpsHealthCheckHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
              .setPathParams(Sets.<String>newHashSet(
                                "httpsHealthCheck",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> directGetHttpsHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck>newBuilder()
              .setMethodName("compute.httpsHealthChecks.get")
              .setRequestInstance(GetHttpsHealthCheckHttpRequest.getDefaultInstance())
              .setResponseInstance(HttpsHealthCheck.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
              .setPathParams(Sets.<String>newHashSet(
                                "httpsHealthCheck",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertHttpsHealthCheckHttpRequest, Operation> directInsertHttpsHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertHttpsHealthCheckHttpRequest, Operation>newBuilder()
              .setMethodName("compute.httpsHealthChecks.insert")
              .setRequestInstance(InsertHttpsHealthCheckHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/httpsHealthChecks")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> directListHttpsHealthChecksCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList>newBuilder()
              .setMethodName("compute.httpsHealthChecks.list")
              .setRequestInstance(ListHttpsHealthChecksHttpRequest.getDefaultInstance())
              .setResponseInstance(HttpsHealthCheckList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/httpsHealthChecks")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<PatchHttpsHealthCheckHttpRequest, Operation> directPatchHttpsHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<PatchHttpsHealthCheckHttpRequest, Operation>newBuilder()
              .setMethodName("compute.httpsHealthChecks.patch")
              .setRequestInstance(PatchHttpsHealthCheckHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
              .setPathParams(Sets.<String>newHashSet(
                                "httpsHealthCheck",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PATCH)
              .build());
  private static final UnaryCallable<UpdateHttpsHealthCheckHttpRequest, Operation> directUpdateHttpsHealthCheckCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<UpdateHttpsHealthCheckHttpRequest, Operation>newBuilder()
              .setMethodName("compute.httpsHealthChecks.update")
              .setRequestInstance(UpdateHttpsHealthCheckHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
              .setPathParams(Sets.<String>newHashSet(
                                "httpsHealthCheck",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PUT)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckCallable;
  private final UnaryCallable<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckCallable;
  private final UnaryCallable<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckCallable;
  private final UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> listHttpsHealthChecksCallable;
  private final UnaryCallable<ListHttpsHealthChecksHttpRequest, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksPagedCallable;
  private final UnaryCallable<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckCallable;
  private final UnaryCallable<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckCallable;

  public static final HttpJsonHttpsHealthCheckStub create(HttpsHealthCheckSettings settings) throws IOException {
    return new HttpJsonHttpsHealthCheckStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonHttpsHealthCheckStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonHttpsHealthCheckStub(HttpsHealthCheckSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonHttpsHealthCheckStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonHttpsHealthCheckStub(HttpsHealthCheckSettings settings, ClientContext clientContext) throws IOException {

    this.deleteHttpsHealthCheckCallable = HttpJsonCallableFactory.create(directDeleteHttpsHealthCheckCallable,settings.deleteHttpsHealthCheckSettings(), clientContext);
    this.getHttpsHealthCheckCallable = HttpJsonCallableFactory.create(directGetHttpsHealthCheckCallable,settings.getHttpsHealthCheckSettings(), clientContext);
    this.insertHttpsHealthCheckCallable = HttpJsonCallableFactory.create(directInsertHttpsHealthCheckCallable,settings.insertHttpsHealthCheckSettings(), clientContext);
    this.listHttpsHealthChecksCallable = HttpJsonCallableFactory.create(directListHttpsHealthChecksCallable,settings.listHttpsHealthChecksSettings(), clientContext);
    this.listHttpsHealthChecksPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListHttpsHealthChecksCallable,settings.listHttpsHealthChecksSettings(), clientContext);
    this.patchHttpsHealthCheckCallable = HttpJsonCallableFactory.create(directPatchHttpsHealthCheckCallable,settings.patchHttpsHealthCheckSettings(), clientContext);
    this.updateHttpsHealthCheckCallable = HttpJsonCallableFactory.create(directUpdateHttpsHealthCheckCallable,settings.updateHttpsHealthCheckSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckCallable() {
    return deleteHttpsHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckCallable() {
    return getHttpsHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckCallable() {
    return insertHttpsHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<ListHttpsHealthChecksHttpRequest, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksPagedCallable() {
    return listHttpsHealthChecksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> listHttpsHealthChecksCallable() {
    return listHttpsHealthChecksCallable;
  }

  @BetaApi
  public UnaryCallable<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckCallable() {
    return patchHttpsHealthCheckCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckCallable() {
    return updateHttpsHealthCheckCallable;
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