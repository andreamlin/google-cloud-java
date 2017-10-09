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
import com.google.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.AggregatedListInstanceGroupManagersHttpRequest;
import com.google.compute.v1.DeleteInstanceGroupManagerHttpRequest;
import com.google.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.GetInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InsertInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InstanceGroupManager;
import com.google.compute.v1.InstanceGroupManagerAggregatedList;
import com.google.compute.v1.InstanceGroupManagerList;
import com.google.compute.v1.InstanceGroupManagerName;
import com.google.compute.v1.InstanceGroupManagerSettings;
import com.google.compute.v1.InstanceGroupManagersAbandonInstancesRequest;
import com.google.compute.v1.InstanceGroupManagersDeleteInstancesRequest;
import com.google.compute.v1.InstanceGroupManagersListManagedInstancesResponse;
import com.google.compute.v1.InstanceGroupManagersRecreateInstancesRequest;
import com.google.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest;
import com.google.compute.v1.InstanceGroupManagersSetTargetPoolsRequest;
import com.google.compute.v1.ListInstanceGroupManagersHttpRequest;
import com.google.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupManagersPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.ResizeInstanceGroupManagerHttpRequest;
import com.google.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest;
import com.google.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest;
import com.google.compute.v1.ZoneName;
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
public class HttpJsonInstanceGroupManagerStub extends InstanceGroupManagerStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> directAbandonInstancesInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.abandonInstances")
              .setRequestInstance(AbandonInstancesInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/abandonInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> directAggregatedListInstanceGroupManagersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList>newBuilder()
              .setMethodName("compute.instanceGroupManagers.aggregatedList")
              .setRequestInstance(AggregatedListInstanceGroupManagersHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceGroupManagerAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/instanceGroupManagers")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<DeleteInstanceGroupManagerHttpRequest, Operation> directDeleteInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.delete")
              .setRequestInstance(DeleteInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> directDeleteInstancesInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.deleteInstances")
              .setRequestInstance(DeleteInstancesInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/deleteInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> directGetInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
              .setMethodName("compute.instanceGroupManagers.get")
              .setRequestInstance(GetInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceGroupManager.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertInstanceGroupManagerHttpRequest, Operation> directInsertInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.insert")
              .setRequestInstance(InsertInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> directListInstanceGroupManagersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList>newBuilder()
              .setMethodName("compute.instanceGroupManagers.list")
              .setRequestInstance(ListInstanceGroupManagersHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceGroupManagerList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> directListManagedInstancesInstanceGroupManagersCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse>newBuilder()
              .setMethodName("compute.instanceGroupManagers.listManagedInstances")
              .setRequestInstance(ListManagedInstancesInstanceGroupManagersHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceGroupManagersListManagedInstancesResponse.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/listManagedInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "order_by",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> directRecreateInstancesInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.recreateInstances")
              .setRequestInstance(RecreateInstancesInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/recreateInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ResizeInstanceGroupManagerHttpRequest, Operation> directResizeInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ResizeInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.resize")
              .setRequestInstance(ResizeInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/resize")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "size"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> directSetInstanceTemplateInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.setInstanceTemplate")
              .setRequestInstance(SetInstanceTemplateInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/setInstanceTemplate")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> directSetTargetPoolsInstanceGroupManagerCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceGroupManagers.setTargetPools")
              .setRequestInstance(SetTargetPoolsInstanceGroupManagerHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/setTargetPools")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroupManager",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerCallable;
  private final UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> aggregatedListInstanceGroupManagersCallable;
  private final UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersPagedCallable;
  private final UnaryCallable<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerCallable;
  private final UnaryCallable<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerCallable;
  private final UnaryCallable<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerCallable;
  private final UnaryCallable<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerCallable;
  private final UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> listInstanceGroupManagersCallable;
  private final UnaryCallable<ListInstanceGroupManagersHttpRequest, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersPagedCallable;
  private final UnaryCallable<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersCallable;
  private final UnaryCallable<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerCallable;
  private final UnaryCallable<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerCallable;
  private final UnaryCallable<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerCallable;
  private final UnaryCallable<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerCallable;

  public static final HttpJsonInstanceGroupManagerStub create(InstanceGroupManagerSettings settings) throws IOException {
    return new HttpJsonInstanceGroupManagerStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceGroupManagerStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceGroupManagerStub(InstanceGroupManagerSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonInstanceGroupManagerStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceGroupManagerStub(InstanceGroupManagerSettings settings, ClientContext clientContext) throws IOException {

    this.abandonInstancesInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directAbandonInstancesInstanceGroupManagerCallable,settings.abandonInstancesInstanceGroupManagerSettings(), clientContext);
    this.aggregatedListInstanceGroupManagersCallable = HttpJsonCallableFactory.create(directAggregatedListInstanceGroupManagersCallable,settings.aggregatedListInstanceGroupManagersSettings(), clientContext);
    this.aggregatedListInstanceGroupManagersPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListInstanceGroupManagersCallable,settings.aggregatedListInstanceGroupManagersSettings(), clientContext);
    this.deleteInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directDeleteInstanceGroupManagerCallable,settings.deleteInstanceGroupManagerSettings(), clientContext);
    this.deleteInstancesInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directDeleteInstancesInstanceGroupManagerCallable,settings.deleteInstancesInstanceGroupManagerSettings(), clientContext);
    this.getInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directGetInstanceGroupManagerCallable,settings.getInstanceGroupManagerSettings(), clientContext);
    this.insertInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directInsertInstanceGroupManagerCallable,settings.insertInstanceGroupManagerSettings(), clientContext);
    this.listInstanceGroupManagersCallable = HttpJsonCallableFactory.create(directListInstanceGroupManagersCallable,settings.listInstanceGroupManagersSettings(), clientContext);
    this.listInstanceGroupManagersPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListInstanceGroupManagersCallable,settings.listInstanceGroupManagersSettings(), clientContext);
    this.listManagedInstancesInstanceGroupManagersCallable = HttpJsonCallableFactory.create(directListManagedInstancesInstanceGroupManagersCallable,settings.listManagedInstancesInstanceGroupManagersSettings(), clientContext);
    this.recreateInstancesInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directRecreateInstancesInstanceGroupManagerCallable,settings.recreateInstancesInstanceGroupManagerSettings(), clientContext);
    this.resizeInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directResizeInstanceGroupManagerCallable,settings.resizeInstanceGroupManagerSettings(), clientContext);
    this.setInstanceTemplateInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directSetInstanceTemplateInstanceGroupManagerCallable,settings.setInstanceTemplateInstanceGroupManagerSettings(), clientContext);
    this.setTargetPoolsInstanceGroupManagerCallable = HttpJsonCallableFactory.create(directSetTargetPoolsInstanceGroupManagerCallable,settings.setTargetPoolsInstanceGroupManagerSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerCallable() {
    return abandonInstancesInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersPagedCallable() {
    return aggregatedListInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> aggregatedListInstanceGroupManagersCallable() {
    return aggregatedListInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerCallable() {
    return deleteInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerCallable() {
    return deleteInstancesInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerCallable() {
    return getInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerCallable() {
    return insertInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupManagersHttpRequest, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersPagedCallable() {
    return listInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> listInstanceGroupManagersCallable() {
    return listInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersCallable() {
    return listManagedInstancesInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerCallable() {
    return recreateInstancesInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerCallable() {
    return resizeInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerCallable() {
    return setInstanceTemplateInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerCallable() {
    return setTargetPoolsInstanceGroupManagerCallable;
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