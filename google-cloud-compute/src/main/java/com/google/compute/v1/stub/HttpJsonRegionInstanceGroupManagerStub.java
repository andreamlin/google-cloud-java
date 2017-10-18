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
import com.google.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.GetRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InsertRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InstanceGroupManager;
import com.google.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest;
import com.google.compute.v1.ListRegionInstanceGroupManagersHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionInstanceGroupManagersPagedResponse;
import com.google.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.RegionInstanceGroupManagerList;
import com.google.compute.v1.RegionInstanceGroupManagerSettings;
import com.google.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest;
import com.google.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest;
import com.google.compute.v1.RegionInstanceGroupManagersInstanceGroupManagerName;
import com.google.compute.v1.RegionInstanceGroupManagersListInstancesResponse;
import com.google.compute.v1.RegionInstanceGroupManagersRecreateRequest;
import com.google.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest;
import com.google.compute.v1.RegionInstanceGroupManagersSetTemplateRequest;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest;
import com.google.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest;
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
public class HttpJsonRegionInstanceGroupManagerStub extends RegionInstanceGroupManagerStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> directAbandonInstancesRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.abandonInstances")
              .setRequestInstance(AbandonInstancesRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/abandonInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<DeleteRegionInstanceGroupManagerHttpRequest, Operation> directDeleteRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.delete")
              .setRequestInstance(DeleteRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> directDeleteInstancesRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.deleteInstances")
              .setRequestInstance(DeleteInstancesRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/deleteInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> directGetRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.get")
              .setRequestInstance(GetRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceGroupManager.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertRegionInstanceGroupManagerHttpRequest, Operation> directInsertRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.insert")
              .setRequestInstance(InsertRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList> directListRegionInstanceGroupManagersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.list")
              .setRequestInstance(ListRegionInstanceGroupManagersHttpRequest.getDefaultInstance())
              .setResponseInstance(RegionInstanceGroupManagerList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> directListManagedInstancesRegionInstanceGroupManagersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.listManagedInstances")
              .setRequestInstance(ListManagedInstancesRegionInstanceGroupManagersHttpRequest.getDefaultInstance())
              .setResponseInstance(RegionInstanceGroupManagersListInstancesResponse.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/listManagedInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "order_by",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> directRecreateInstancesRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.recreateInstances")
              .setRequestInstance(RecreateInstancesRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/recreateInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ResizeRegionInstanceGroupManagerHttpRequest, Operation> directResizeRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ResizeRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.resize")
              .setRequestInstance(ResizeRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/resize")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "size"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> directSetInstanceTemplateRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.setInstanceTemplate")
              .setRequestInstance(SetInstanceTemplateRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/setInstanceTemplate")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> directSetTargetPoolsRegionInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroupManagers.setTargetPools")
              .setRequestInstance(SetTargetPoolsRegionInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/setTargetPools")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerCallable;
  private final UnaryCallable<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerCallable;
  private final UnaryCallable<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerCallable;
  private final UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList> listRegionInstanceGroupManagersCallable;
  private final UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersPagedCallable;
  private final UnaryCallable<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersCallable;
  private final UnaryCallable<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerCallable;
  private final UnaryCallable<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerCallable;
  private final UnaryCallable<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerCallable;

  public static final HttpJsonRegionInstanceGroupManagerStub create(RegionInstanceGroupManagerSettings settings) throws IOException {
    return new HttpJsonRegionInstanceGroupManagerStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionInstanceGroupManagerStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionInstanceGroupManagerStub(RegionInstanceGroupManagerSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionInstanceGroupManagerStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionInstanceGroupManagerStub(RegionInstanceGroupManagerSettings settings, ClientContext clientContext) throws IOException {

    this.abandonInstancesRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directAbandonInstancesRegionInstanceGroupManagerCallable,settings.abandonInstancesRegionInstanceGroupManagerSettings(), clientContext);
    this.deleteRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directDeleteRegionInstanceGroupManagerCallable,settings.deleteRegionInstanceGroupManagerSettings(), clientContext);
    this.deleteInstancesRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directDeleteInstancesRegionInstanceGroupManagerCallable,settings.deleteInstancesRegionInstanceGroupManagerSettings(), clientContext);
    this.getRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directGetRegionInstanceGroupManagerCallable,settings.getRegionInstanceGroupManagerSettings(), clientContext);
    this.insertRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directInsertRegionInstanceGroupManagerCallable,settings.insertRegionInstanceGroupManagerSettings(), clientContext);
    this.listRegionInstanceGroupManagersCallable = HttpJsonCallableFactory.create(directListRegionInstanceGroupManagersCallable,settings.listRegionInstanceGroupManagersSettings(), clientContext);
    this.listRegionInstanceGroupManagersPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRegionInstanceGroupManagersCallable,settings.listRegionInstanceGroupManagersSettings(), clientContext);
    this.listManagedInstancesRegionInstanceGroupManagersCallable = HttpJsonCallableFactory.create(directListManagedInstancesRegionInstanceGroupManagersCallable,settings.listManagedInstancesRegionInstanceGroupManagersSettings(), clientContext);
    this.recreateInstancesRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directRecreateInstancesRegionInstanceGroupManagerCallable,settings.recreateInstancesRegionInstanceGroupManagerSettings(), clientContext);
    this.resizeRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directResizeRegionInstanceGroupManagerCallable,settings.resizeRegionInstanceGroupManagerSettings(), clientContext);
    this.setInstanceTemplateRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directSetInstanceTemplateRegionInstanceGroupManagerCallable,settings.setInstanceTemplateRegionInstanceGroupManagerSettings(), clientContext);
    this.setTargetPoolsRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directSetTargetPoolsRegionInstanceGroupManagerCallable,settings.setTargetPoolsRegionInstanceGroupManagerSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerCallable() {
    return abandonInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerCallable() {
    return deleteRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerCallable() {
    return deleteInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerCallable() {
    return getRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerCallable() {
    return insertRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersPagedCallable() {
    return listRegionInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList> listRegionInstanceGroupManagersCallable() {
    return listRegionInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersCallable() {
    return listManagedInstancesRegionInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerCallable() {
    return recreateInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerCallable() {
    return resizeRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerCallable() {
    return setInstanceTemplateRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerCallable() {
    return setTargetPoolsRegionInstanceGroupManagerCallable;
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