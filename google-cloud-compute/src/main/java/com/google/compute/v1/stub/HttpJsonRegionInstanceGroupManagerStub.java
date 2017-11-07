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
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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

  private static final ApiMethodDescriptor<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList> listRegionInstanceGroupManagersMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor =
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
          .build();
  private static final ApiMethodDescriptor<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerMethodDescriptor =
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
          .build();

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

    HttpJsonCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(abandonInstancesRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<DeleteRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstancesRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
            .setMethodDescriptor(getRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<InsertRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList> listRegionInstanceGroupManagersTransportSettings =
        HttpJsonCallSettings.<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>newBuilder()
            .setMethodDescriptor(listRegionInstanceGroupManagersMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersTransportSettings =
        HttpJsonCallSettings.<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse>newBuilder()
            .setMethodDescriptor(listManagedInstancesRegionInstanceGroupManagersMethodDescriptor)
            .build();
    HttpJsonCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(recreateInstancesRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<ResizeRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(resizeRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setTargetPoolsRegionInstanceGroupManagerMethodDescriptor)
            .build();

    this.abandonInstancesRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(abandonInstancesRegionInstanceGroupManagerTransportSettings,settings.abandonInstancesRegionInstanceGroupManagerSettings(), clientContext);
    this.deleteRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(deleteRegionInstanceGroupManagerTransportSettings,settings.deleteRegionInstanceGroupManagerSettings(), clientContext);
    this.deleteInstancesRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(deleteInstancesRegionInstanceGroupManagerTransportSettings,settings.deleteInstancesRegionInstanceGroupManagerSettings(), clientContext);
    this.getRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(getRegionInstanceGroupManagerTransportSettings,settings.getRegionInstanceGroupManagerSettings(), clientContext);
    this.insertRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(insertRegionInstanceGroupManagerTransportSettings,settings.insertRegionInstanceGroupManagerSettings(), clientContext);
    this.listRegionInstanceGroupManagersCallable = HttpJsonCallableFactory.createUnaryCallable(listRegionInstanceGroupManagersTransportSettings,settings.listRegionInstanceGroupManagersSettings(), clientContext);
    this.listRegionInstanceGroupManagersPagedCallable = HttpJsonCallableFactory.createPagedCallable(listRegionInstanceGroupManagersTransportSettings,settings.listRegionInstanceGroupManagersSettings(), clientContext);
    this.listManagedInstancesRegionInstanceGroupManagersCallable = HttpJsonCallableFactory.createUnaryCallable(listManagedInstancesRegionInstanceGroupManagersTransportSettings,settings.listManagedInstancesRegionInstanceGroupManagersSettings(), clientContext);
    this.recreateInstancesRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(recreateInstancesRegionInstanceGroupManagerTransportSettings,settings.recreateInstancesRegionInstanceGroupManagerSettings(), clientContext);
    this.resizeRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(resizeRegionInstanceGroupManagerTransportSettings,settings.resizeRegionInstanceGroupManagerSettings(), clientContext);
    this.setInstanceTemplateRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(setInstanceTemplateRegionInstanceGroupManagerTransportSettings,settings.setInstanceTemplateRegionInstanceGroupManagerSettings(), clientContext);
    this.setTargetPoolsRegionInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(setTargetPoolsRegionInstanceGroupManagerTransportSettings,settings.setTargetPoolsRegionInstanceGroupManagerSettings(), clientContext);

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