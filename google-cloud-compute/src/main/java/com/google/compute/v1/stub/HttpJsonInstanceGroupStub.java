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
import com.google.compute.v1.AddInstancesInstanceGroupHttpRequest;
import com.google.compute.v1.AggregatedListInstanceGroupsHttpRequest;
import com.google.compute.v1.DeleteInstanceGroupHttpRequest;
import com.google.compute.v1.GetInstanceGroupHttpRequest;
import com.google.compute.v1.InsertInstanceGroupHttpRequest;
import com.google.compute.v1.InstanceGroup;
import com.google.compute.v1.InstanceGroupAggregatedList;
import static com.google.compute.v1.InstanceGroupClient.AggregatedListInstanceGroupsPagedResponse;
import static com.google.compute.v1.InstanceGroupClient.ListInstanceGroupsPagedResponse;
import static com.google.compute.v1.InstanceGroupClient.ListInstancesInstanceGroupsPagedResponse;
import com.google.compute.v1.InstanceGroupList;
import com.google.compute.v1.InstanceGroupName;
import com.google.compute.v1.InstanceGroupSettings;
import com.google.compute.v1.InstanceGroupsAddInstancesRequest;
import com.google.compute.v1.InstanceGroupsListInstances;
import com.google.compute.v1.InstanceGroupsListInstancesRequest;
import com.google.compute.v1.InstanceGroupsRemoveInstancesRequest;
import com.google.compute.v1.InstanceGroupsSetNamedPortsRequest;
import com.google.compute.v1.InstanceWithNamedPorts;
import com.google.compute.v1.ListInstanceGroupsHttpRequest;
import com.google.compute.v1.ListInstancesInstanceGroupsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RemoveInstancesInstanceGroupHttpRequest;
import com.google.compute.v1.SetNamedPortsInstanceGroupHttpRequest;
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
public class HttpJsonInstanceGroupStub extends InstanceGroupStub {
  @InternalApi
  public static final ApiMethodDescriptor<AddInstancesInstanceGroupHttpRequest, Operation> addInstancesInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<AddInstancesInstanceGroupHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroups.addInstances")
          .setRequestInstance(AddInstancesInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups/{instanceGroup}/addInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(InstanceGroupName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("instanceGroup")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList> aggregatedListInstanceGroupsMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList>newBuilder()
          .setMethodName("compute.instanceGroups.aggregatedList")
          .setRequestInstance(AggregatedListInstanceGroupsHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/instanceGroups")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteInstanceGroupHttpRequest, Operation> deleteInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<DeleteInstanceGroupHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroups.delete")
          .setRequestInstance(DeleteInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups/{instanceGroup}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(InstanceGroupName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("instanceGroup")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetInstanceGroupHttpRequest, InstanceGroup> getInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<GetInstanceGroupHttpRequest, InstanceGroup>newBuilder()
          .setMethodName("compute.instanceGroups.get")
          .setRequestInstance(GetInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroup.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups/{instanceGroup}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(InstanceGroupName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("instanceGroup")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertInstanceGroupHttpRequest, Operation> insertInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<InsertInstanceGroupHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroups.insert")
          .setRequestInstance(InsertInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ZoneName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("zone")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListInstanceGroupsHttpRequest, InstanceGroupList> listInstanceGroupsMethodDescriptor =
      ApiMethodDescriptor.<ListInstanceGroupsHttpRequest, InstanceGroupList>newBuilder()
          .setMethodName("compute.instanceGroups.list")
          .setRequestInstance(ListInstanceGroupsHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ZoneName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("zone")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances> listInstancesInstanceGroupsMethodDescriptor =
      ApiMethodDescriptor.<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances>newBuilder()
          .setMethodName("compute.instanceGroups.listInstances")
          .setRequestInstance(ListInstancesInstanceGroupsHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroupsListInstances.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups/{instanceGroup}/listInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(InstanceGroupName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("instanceGroup")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<RemoveInstancesInstanceGroupHttpRequest, Operation> removeInstancesInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<RemoveInstancesInstanceGroupHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroups.removeInstances")
          .setRequestInstance(RemoveInstancesInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups/{instanceGroup}/removeInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(InstanceGroupName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("instanceGroup")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetNamedPortsInstanceGroupHttpRequest, Operation> setNamedPortsInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<SetNamedPortsInstanceGroupHttpRequest, Operation>newBuilder()
          .setMethodName("compute.instanceGroups.setNamedPorts")
          .setRequestInstance(SetNamedPortsInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/instanceGroups/{instanceGroup}/setNamedPorts")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(InstanceGroupName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("instanceGroup")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AddInstancesInstanceGroupHttpRequest, Operation> addInstancesInstanceGroupCallable;
  private final UnaryCallable<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList> aggregatedListInstanceGroupsCallable;
  private final UnaryCallable<AggregatedListInstanceGroupsHttpRequest, AggregatedListInstanceGroupsPagedResponse> aggregatedListInstanceGroupsPagedCallable;
  private final UnaryCallable<DeleteInstanceGroupHttpRequest, Operation> deleteInstanceGroupCallable;
  private final UnaryCallable<GetInstanceGroupHttpRequest, InstanceGroup> getInstanceGroupCallable;
  private final UnaryCallable<InsertInstanceGroupHttpRequest, Operation> insertInstanceGroupCallable;
  private final UnaryCallable<ListInstanceGroupsHttpRequest, InstanceGroupList> listInstanceGroupsCallable;
  private final UnaryCallable<ListInstanceGroupsHttpRequest, ListInstanceGroupsPagedResponse> listInstanceGroupsPagedCallable;
  private final UnaryCallable<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances> listInstancesInstanceGroupsCallable;
  private final UnaryCallable<ListInstancesInstanceGroupsHttpRequest, ListInstancesInstanceGroupsPagedResponse> listInstancesInstanceGroupsPagedCallable;
  private final UnaryCallable<RemoveInstancesInstanceGroupHttpRequest, Operation> removeInstancesInstanceGroupCallable;
  private final UnaryCallable<SetNamedPortsInstanceGroupHttpRequest, Operation> setNamedPortsInstanceGroupCallable;

  private final HttpJsonClientCallableFactory callableFactory;
  public static final HttpJsonInstanceGroupStub create(InstanceGroupStubSettings settings) throws IOException {
    return new HttpJsonInstanceGroupStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceGroupStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceGroupStub(InstanceGroupStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonInstanceGroupStub create(ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    return new HttpJsonInstanceGroupStub(InstanceGroupSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonInstanceGroupStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceGroupStub(InstanceGroupStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonInstanceGroupCallableFactory();
  }

  /**
   * Constructs an instance of HttpJsonInstanceGroupStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceGroupStub(InstanceGroupStubSettings settings, ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AddInstancesInstanceGroupHttpRequest, Operation> addInstancesInstanceGroupTransportSettings =
        HttpJsonCallSettings.<AddInstancesInstanceGroupHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(addInstancesInstanceGroupMethodDescriptor)
            .build();
    HttpJsonCallSettings<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList> aggregatedListInstanceGroupsTransportSettings =
        HttpJsonCallSettings.<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListInstanceGroupsMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteInstanceGroupHttpRequest, Operation> deleteInstanceGroupTransportSettings =
        HttpJsonCallSettings.<DeleteInstanceGroupHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstanceGroupMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetInstanceGroupHttpRequest, InstanceGroup> getInstanceGroupTransportSettings =
        HttpJsonCallSettings.<GetInstanceGroupHttpRequest, InstanceGroup>newBuilder()
            .setMethodDescriptor(getInstanceGroupMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertInstanceGroupHttpRequest, Operation> insertInstanceGroupTransportSettings =
        HttpJsonCallSettings.<InsertInstanceGroupHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertInstanceGroupMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInstanceGroupsHttpRequest, InstanceGroupList> listInstanceGroupsTransportSettings =
        HttpJsonCallSettings.<ListInstanceGroupsHttpRequest, InstanceGroupList>newBuilder()
            .setMethodDescriptor(listInstanceGroupsMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances> listInstancesInstanceGroupsTransportSettings =
        HttpJsonCallSettings.<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances>newBuilder()
            .setMethodDescriptor(listInstancesInstanceGroupsMethodDescriptor)
            .build();
    HttpJsonCallSettings<RemoveInstancesInstanceGroupHttpRequest, Operation> removeInstancesInstanceGroupTransportSettings =
        HttpJsonCallSettings.<RemoveInstancesInstanceGroupHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(removeInstancesInstanceGroupMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetNamedPortsInstanceGroupHttpRequest, Operation> setNamedPortsInstanceGroupTransportSettings =
        HttpJsonCallSettings.<SetNamedPortsInstanceGroupHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setNamedPortsInstanceGroupMethodDescriptor)
            .build();

    this.addInstancesInstanceGroupCallable = callableFactory.createUnaryCallable(addInstancesInstanceGroupTransportSettings,settings.addInstancesInstanceGroupSettings(), clientContext);
    this.aggregatedListInstanceGroupsCallable = callableFactory.createUnaryCallable(aggregatedListInstanceGroupsTransportSettings,settings.aggregatedListInstanceGroupsSettings(), clientContext);
    this.aggregatedListInstanceGroupsPagedCallable = callableFactory.createPagedCallable(aggregatedListInstanceGroupsTransportSettings,settings.aggregatedListInstanceGroupsSettings(), clientContext);
    this.deleteInstanceGroupCallable = callableFactory.createUnaryCallable(deleteInstanceGroupTransportSettings,settings.deleteInstanceGroupSettings(), clientContext);
    this.getInstanceGroupCallable = callableFactory.createUnaryCallable(getInstanceGroupTransportSettings,settings.getInstanceGroupSettings(), clientContext);
    this.insertInstanceGroupCallable = callableFactory.createUnaryCallable(insertInstanceGroupTransportSettings,settings.insertInstanceGroupSettings(), clientContext);
    this.listInstanceGroupsCallable = callableFactory.createUnaryCallable(listInstanceGroupsTransportSettings,settings.listInstanceGroupsSettings(), clientContext);
    this.listInstanceGroupsPagedCallable = callableFactory.createPagedCallable(listInstanceGroupsTransportSettings,settings.listInstanceGroupsSettings(), clientContext);
    this.listInstancesInstanceGroupsCallable = callableFactory.createUnaryCallable(listInstancesInstanceGroupsTransportSettings,settings.listInstancesInstanceGroupsSettings(), clientContext);
    this.listInstancesInstanceGroupsPagedCallable = callableFactory.createPagedCallable(listInstancesInstanceGroupsTransportSettings,settings.listInstancesInstanceGroupsSettings(), clientContext);
    this.removeInstancesInstanceGroupCallable = callableFactory.createUnaryCallable(removeInstancesInstanceGroupTransportSettings,settings.removeInstancesInstanceGroupSettings(), clientContext);
    this.setNamedPortsInstanceGroupCallable = callableFactory.createUnaryCallable(setNamedPortsInstanceGroupTransportSettings,settings.setNamedPortsInstanceGroupSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AddInstancesInstanceGroupHttpRequest, Operation> addInstancesInstanceGroupCallable() {
    return addInstancesInstanceGroupCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstanceGroupsHttpRequest, AggregatedListInstanceGroupsPagedResponse> aggregatedListInstanceGroupsPagedCallable() {
    return aggregatedListInstanceGroupsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList> aggregatedListInstanceGroupsCallable() {
    return aggregatedListInstanceGroupsCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceGroupHttpRequest, Operation> deleteInstanceGroupCallable() {
    return deleteInstanceGroupCallable;
  }

  @BetaApi
  public UnaryCallable<GetInstanceGroupHttpRequest, InstanceGroup> getInstanceGroupCallable() {
    return getInstanceGroupCallable;
  }

  @BetaApi
  public UnaryCallable<InsertInstanceGroupHttpRequest, Operation> insertInstanceGroupCallable() {
    return insertInstanceGroupCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupsHttpRequest, ListInstanceGroupsPagedResponse> listInstanceGroupsPagedCallable() {
    return listInstanceGroupsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupsHttpRequest, InstanceGroupList> listInstanceGroupsCallable() {
    return listInstanceGroupsCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesInstanceGroupsHttpRequest, ListInstancesInstanceGroupsPagedResponse> listInstancesInstanceGroupsPagedCallable() {
    return listInstancesInstanceGroupsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances> listInstancesInstanceGroupsCallable() {
    return listInstancesInstanceGroupsCallable;
  }

  @BetaApi
  public UnaryCallable<RemoveInstancesInstanceGroupHttpRequest, Operation> removeInstancesInstanceGroupCallable() {
    return removeInstancesInstanceGroupCallable;
  }

  @BetaApi
  public UnaryCallable<SetNamedPortsInstanceGroupHttpRequest, Operation> setNamedPortsInstanceGroupCallable() {
    return setNamedPortsInstanceGroupCallable;
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