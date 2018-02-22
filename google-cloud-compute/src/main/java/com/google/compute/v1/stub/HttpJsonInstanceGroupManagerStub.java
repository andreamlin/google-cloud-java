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
import com.google.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.AggregatedListInstanceGroupManagersHttpRequest;
import com.google.compute.v1.DeleteInstanceGroupManagerHttpRequest;
import com.google.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest;
import com.google.compute.v1.GetInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InsertInstanceGroupManagerHttpRequest;
import com.google.compute.v1.InstanceGroupManager;
import com.google.compute.v1.InstanceGroupManagerAggregatedList;
import static com.google.compute.v1.InstanceGroupManagerClient.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.InstanceGroupManagerClient.ListInstanceGroupManagersPagedResponse;
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
public class HttpJsonInstanceGroupManagerStub extends InstanceGroupManagerStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.abandonInstances")
          .setRequestInstance(AbandonInstancesInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/abandonInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> aggregatedListInstanceGroupManagersMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList>newBuilder()
          .setMethodName("compute.instanceGroupManagers.aggregatedList")
          .setRequestInstance(AggregatedListInstanceGroupManagersHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupManagerAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/instanceGroupManagers")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<DeleteInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.delete")
          .setRequestInstance(DeleteInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.deleteInstances")
          .setRequestInstance(DeleteInstancesInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/deleteInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
          .setMethodName("compute.instanceGroupManagers.get")
          .setRequestInstance(GetInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupManager.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<InsertInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.insert")
          .setRequestInstance(InsertInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> listInstanceGroupManagersMethodDescriptor =
      ApiMethodDescriptor.<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList>newBuilder()
          .setMethodName("compute.instanceGroupManagers.list")
          .setRequestInstance(ListInstanceGroupManagersHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupManagerList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersMethodDescriptor =
      ApiMethodDescriptor.<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse>newBuilder()
          .setMethodName("compute.instanceGroupManagers.listManagedInstances")
          .setRequestInstance(ListManagedInstancesInstanceGroupManagersHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupManagersListManagedInstancesResponse.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/listManagedInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "order_by",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.recreateInstances")
          .setRequestInstance(RecreateInstancesInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/recreateInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<ResizeInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.resize")
          .setRequestInstance(ResizeInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/resize")
          .setQueryParams(Sets.<String>newHashSet(
                             "size"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.setInstanceTemplate")
          .setRequestInstance(SetInstanceTemplateInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/setInstanceTemplate")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerMethodDescriptor =
      ApiMethodDescriptor.<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroupManagers.setTargetPools")
          .setRequestInstance(SetTargetPoolsInstanceGroupManagerHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/setTargetPools")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();

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

  public static final HttpJsonInstanceGroupManagerStub create(InstanceGroupManagerStubSettings settings) throws IOException {
    return new HttpJsonInstanceGroupManagerStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceGroupManagerStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceGroupManagerStub(InstanceGroupManagerStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonInstanceGroupManagerStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceGroupManagerStub(InstanceGroupManagerStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(abandonInstancesInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> aggregatedListInstanceGroupManagersTransportSettings =
        HttpJsonCallSettings.<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListInstanceGroupManagersMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<DeleteInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstancesInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
            .setMethodDescriptor(getInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<InsertInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> listInstanceGroupManagersTransportSettings =
        HttpJsonCallSettings.<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList>newBuilder()
            .setMethodDescriptor(listInstanceGroupManagersMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersTransportSettings =
        HttpJsonCallSettings.<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse>newBuilder()
            .setMethodDescriptor(listManagedInstancesInstanceGroupManagersMethodDescriptor)
            .build();
    HttpJsonCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(recreateInstancesInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<ResizeInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(resizeInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setInstanceTemplateInstanceGroupManagerMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerTransportSettings =
        HttpJsonCallSettings.<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setTargetPoolsInstanceGroupManagerMethodDescriptor)
            .build();

    this.abandonInstancesInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(abandonInstancesInstanceGroupManagerTransportSettings,settings.abandonInstancesInstanceGroupManagerSettings(), clientContext);
    this.aggregatedListInstanceGroupManagersCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListInstanceGroupManagersTransportSettings,settings.aggregatedListInstanceGroupManagersSettings(), clientContext);
    this.aggregatedListInstanceGroupManagersPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListInstanceGroupManagersTransportSettings,settings.aggregatedListInstanceGroupManagersSettings(), clientContext);
    this.deleteInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(deleteInstanceGroupManagerTransportSettings,settings.deleteInstanceGroupManagerSettings(), clientContext);
    this.deleteInstancesInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(deleteInstancesInstanceGroupManagerTransportSettings,settings.deleteInstancesInstanceGroupManagerSettings(), clientContext);
    this.getInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(getInstanceGroupManagerTransportSettings,settings.getInstanceGroupManagerSettings(), clientContext);
    this.insertInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(insertInstanceGroupManagerTransportSettings,settings.insertInstanceGroupManagerSettings(), clientContext);
    this.listInstanceGroupManagersCallable = HttpJsonCallableFactory.createUnaryCallable(listInstanceGroupManagersTransportSettings,settings.listInstanceGroupManagersSettings(), clientContext);
    this.listInstanceGroupManagersPagedCallable = HttpJsonCallableFactory.createPagedCallable(listInstanceGroupManagersTransportSettings,settings.listInstanceGroupManagersSettings(), clientContext);
    this.listManagedInstancesInstanceGroupManagersCallable = HttpJsonCallableFactory.createUnaryCallable(listManagedInstancesInstanceGroupManagersTransportSettings,settings.listManagedInstancesInstanceGroupManagersSettings(), clientContext);
    this.recreateInstancesInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(recreateInstancesInstanceGroupManagerTransportSettings,settings.recreateInstancesInstanceGroupManagerSettings(), clientContext);
    this.resizeInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(resizeInstanceGroupManagerTransportSettings,settings.resizeInstanceGroupManagerSettings(), clientContext);
    this.setInstanceTemplateInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(setInstanceTemplateInstanceGroupManagerTransportSettings,settings.setInstanceTemplateInstanceGroupManagerSettings(), clientContext);
    this.setTargetPoolsInstanceGroupManagerCallable = HttpJsonCallableFactory.createUnaryCallable(setTargetPoolsInstanceGroupManagerTransportSettings,settings.setTargetPoolsInstanceGroupManagerSettings(), clientContext);

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