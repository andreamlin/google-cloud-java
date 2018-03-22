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
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteHttpsHealthCheckHttpRequest;
import com.google.compute.v1.GetHttpsHealthCheckHttpRequest;
import com.google.compute.v1.HttpsHealthCheck;
import static com.google.compute.v1.HttpsHealthCheckClient.ListHttpsHealthChecksPagedResponse;
import com.google.compute.v1.HttpsHealthCheckList;
import com.google.compute.v1.HttpsHealthCheckName;
import com.google.compute.v1.HttpsHealthCheckSettings;
import com.google.compute.v1.InsertHttpsHealthCheckHttpRequest;
import com.google.compute.v1.ListHttpsHealthChecksHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.PatchHttpsHealthCheckHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateHttpsHealthCheckHttpRequest;
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
public class HttpJsonHttpsHealthCheckStub extends HttpsHealthCheckStub {
  @InternalApi
  public static final ApiMethodDescriptor<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<DeleteHttpsHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpsHealthChecks.delete")
          .setRequestInstance(DeleteHttpsHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(HttpsHealthCheckName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("httpsHealthCheck")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck>newBuilder()
          .setMethodName("compute.httpsHealthChecks.get")
          .setRequestInstance(GetHttpsHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(HttpsHealthCheck.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(HttpsHealthCheckName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("httpsHealthCheck")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<InsertHttpsHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpsHealthChecks.insert")
          .setRequestInstance(InsertHttpsHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpsHealthChecks")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> listHttpsHealthChecksMethodDescriptor =
      ApiMethodDescriptor.<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList>newBuilder()
          .setMethodName("compute.httpsHealthChecks.list")
          .setRequestInstance(ListHttpsHealthChecksHttpRequest.getDefaultInstance())
          .setResponseInstance(HttpsHealthCheckList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpsHealthChecks")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<PatchHttpsHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpsHealthChecks.patch")
          .setRequestInstance(PatchHttpsHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(HttpsHealthCheckName.newFactory()))
          .setHttpMethod(HttpMethods.PATCH)
          .setResourceNameField("httpsHealthCheck")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckMethodDescriptor =
      ApiMethodDescriptor.<UpdateHttpsHealthCheckHttpRequest, Operation>newBuilder()
          .setMethodName("compute.httpsHealthChecks.update")
          .setRequestInstance(UpdateHttpsHealthCheckHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/httpsHealthChecks/{httpsHealthCheck}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(HttpsHealthCheckName.newFactory()))
          .setHttpMethod(HttpMethods.PUT)
          .setResourceNameField("httpsHealthCheck")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckCallable;
  private final UnaryCallable<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckCallable;
  private final UnaryCallable<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckCallable;
  private final UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> listHttpsHealthChecksCallable;
  private final UnaryCallable<ListHttpsHealthChecksHttpRequest, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksPagedCallable;
  private final UnaryCallable<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckCallable;
  private final UnaryCallable<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckCallable;

  private final HttpJsonClientCallableFactory callableFactory;
  public static final HttpJsonHttpsHealthCheckStub create(HttpsHealthCheckStubSettings settings) throws IOException {
    return new HttpJsonHttpsHealthCheckStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonHttpsHealthCheckStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonHttpsHealthCheckStub(HttpsHealthCheckStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonHttpsHealthCheckStub create(ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    return new HttpJsonHttpsHealthCheckStub(HttpsHealthCheckSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonHttpsHealthCheckStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonHttpsHealthCheckStub(HttpsHealthCheckStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonHttpsHealthCheckCallableFactory();
  }

  /**
   * Constructs an instance of HttpJsonHttpsHealthCheckStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonHttpsHealthCheckStub(HttpsHealthCheckStubSettings settings, ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckTransportSettings =
        HttpJsonCallSettings.<DeleteHttpsHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteHttpsHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckTransportSettings =
        HttpJsonCallSettings.<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck>newBuilder()
            .setMethodDescriptor(getHttpsHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckTransportSettings =
        HttpJsonCallSettings.<InsertHttpsHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertHttpsHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> listHttpsHealthChecksTransportSettings =
        HttpJsonCallSettings.<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList>newBuilder()
            .setMethodDescriptor(listHttpsHealthChecksMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckTransportSettings =
        HttpJsonCallSettings.<PatchHttpsHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchHttpsHealthCheckMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckTransportSettings =
        HttpJsonCallSettings.<UpdateHttpsHealthCheckHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateHttpsHealthCheckMethodDescriptor)
            .build();

    this.deleteHttpsHealthCheckCallable = callableFactory.createUnaryCallable(deleteHttpsHealthCheckTransportSettings,settings.deleteHttpsHealthCheckSettings(), clientContext);
    this.getHttpsHealthCheckCallable = callableFactory.createUnaryCallable(getHttpsHealthCheckTransportSettings,settings.getHttpsHealthCheckSettings(), clientContext);
    this.insertHttpsHealthCheckCallable = callableFactory.createUnaryCallable(insertHttpsHealthCheckTransportSettings,settings.insertHttpsHealthCheckSettings(), clientContext);
    this.listHttpsHealthChecksCallable = callableFactory.createUnaryCallable(listHttpsHealthChecksTransportSettings,settings.listHttpsHealthChecksSettings(), clientContext);
    this.listHttpsHealthChecksPagedCallable = callableFactory.createPagedCallable(listHttpsHealthChecksTransportSettings,settings.listHttpsHealthChecksSettings(), clientContext);
    this.patchHttpsHealthCheckCallable = callableFactory.createUnaryCallable(patchHttpsHealthCheckTransportSettings,settings.patchHttpsHealthCheckSettings(), clientContext);
    this.updateHttpsHealthCheckCallable = callableFactory.createUnaryCallable(updateHttpsHealthCheckTransportSettings,settings.updateHttpsHealthCheckSettings(), clientContext);

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