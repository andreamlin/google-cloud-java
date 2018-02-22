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
import com.google.compute.v1.GetRegionInstanceGroupHttpRequest;
import com.google.compute.v1.InstanceGroup;
import com.google.compute.v1.InstanceWithNamedPorts;
import com.google.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest;
import com.google.compute.v1.ListRegionInstanceGroupsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.RegionInstanceGroupClient.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.compute.v1.RegionInstanceGroupClient.ListRegionInstanceGroupsPagedResponse;
import com.google.compute.v1.RegionInstanceGroupList;
import com.google.compute.v1.RegionInstanceGroupSettings;
import com.google.compute.v1.RegionInstanceGroupsInstanceGroupName;
import com.google.compute.v1.RegionInstanceGroupsListInstances;
import com.google.compute.v1.RegionInstanceGroupsListInstancesRequest;
import com.google.compute.v1.RegionInstanceGroupsSetNamedPortsRequest;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest;
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
public class HttpJsonRegionInstanceGroupStub extends RegionInstanceGroupStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<GetRegionInstanceGroupHttpRequest, InstanceGroup> getRegionInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<GetRegionInstanceGroupHttpRequest, InstanceGroup>newBuilder()
          .setMethodName("compute.regionInstanceGroups.get")
          .setRequestInstance(GetRegionInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(InstanceGroup.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups/{instanceGroup}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> listRegionInstanceGroupsMethodDescriptor =
      ApiMethodDescriptor.<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList>newBuilder()
          .setMethodName("compute.regionInstanceGroups.list")
          .setRequestInstance(ListRegionInstanceGroupsHttpRequest.getDefaultInstance())
          .setResponseInstance(RegionInstanceGroupList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> listInstancesRegionInstanceGroupsMethodDescriptor =
      ApiMethodDescriptor.<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances>newBuilder()
          .setMethodName("compute.regionInstanceGroups.listInstances")
          .setRequestInstance(ListInstancesRegionInstanceGroupsHttpRequest.getDefaultInstance())
          .setResponseInstance(RegionInstanceGroupsListInstances.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups/{instanceGroup}/listInstances")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> setNamedPortsRegionInstanceGroupMethodDescriptor =
      ApiMethodDescriptor.<SetNamedPortsRegionInstanceGroupHttpRequest, Operation>newBuilder()
          .setMethodName("compute.regionInstanceGroups.setNamedPorts")
          .setRequestInstance(SetNamedPortsRegionInstanceGroupHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups/{instanceGroup}/setNamedPorts")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetRegionInstanceGroupHttpRequest, InstanceGroup> getRegionInstanceGroupCallable;
  private final UnaryCallable<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> listRegionInstanceGroupsCallable;
  private final UnaryCallable<ListRegionInstanceGroupsHttpRequest, ListRegionInstanceGroupsPagedResponse> listRegionInstanceGroupsPagedCallable;
  private final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> listInstancesRegionInstanceGroupsCallable;
  private final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, ListInstancesRegionInstanceGroupsPagedResponse> listInstancesRegionInstanceGroupsPagedCallable;
  private final UnaryCallable<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> setNamedPortsRegionInstanceGroupCallable;

  public static final HttpJsonRegionInstanceGroupStub create(RegionInstanceGroupStubSettings settings) throws IOException {
    return new HttpJsonRegionInstanceGroupStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionInstanceGroupStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionInstanceGroupStub(RegionInstanceGroupStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionInstanceGroupStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionInstanceGroupStub(RegionInstanceGroupStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<GetRegionInstanceGroupHttpRequest, InstanceGroup> getRegionInstanceGroupTransportSettings =
        HttpJsonCallSettings.<GetRegionInstanceGroupHttpRequest, InstanceGroup>newBuilder()
            .setMethodDescriptor(getRegionInstanceGroupMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> listRegionInstanceGroupsTransportSettings =
        HttpJsonCallSettings.<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList>newBuilder()
            .setMethodDescriptor(listRegionInstanceGroupsMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> listInstancesRegionInstanceGroupsTransportSettings =
        HttpJsonCallSettings.<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances>newBuilder()
            .setMethodDescriptor(listInstancesRegionInstanceGroupsMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> setNamedPortsRegionInstanceGroupTransportSettings =
        HttpJsonCallSettings.<SetNamedPortsRegionInstanceGroupHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setNamedPortsRegionInstanceGroupMethodDescriptor)
            .build();

    this.getRegionInstanceGroupCallable = HttpJsonCallableFactory.createUnaryCallable(getRegionInstanceGroupTransportSettings,settings.getRegionInstanceGroupSettings(), clientContext);
    this.listRegionInstanceGroupsCallable = HttpJsonCallableFactory.createUnaryCallable(listRegionInstanceGroupsTransportSettings,settings.listRegionInstanceGroupsSettings(), clientContext);
    this.listRegionInstanceGroupsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listRegionInstanceGroupsTransportSettings,settings.listRegionInstanceGroupsSettings(), clientContext);
    this.listInstancesRegionInstanceGroupsCallable = HttpJsonCallableFactory.createUnaryCallable(listInstancesRegionInstanceGroupsTransportSettings,settings.listInstancesRegionInstanceGroupsSettings(), clientContext);
    this.listInstancesRegionInstanceGroupsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listInstancesRegionInstanceGroupsTransportSettings,settings.listInstancesRegionInstanceGroupsSettings(), clientContext);
    this.setNamedPortsRegionInstanceGroupCallable = HttpJsonCallableFactory.createUnaryCallable(setNamedPortsRegionInstanceGroupTransportSettings,settings.setNamedPortsRegionInstanceGroupSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetRegionInstanceGroupHttpRequest, InstanceGroup> getRegionInstanceGroupCallable() {
    return getRegionInstanceGroupCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionInstanceGroupsHttpRequest, ListRegionInstanceGroupsPagedResponse> listRegionInstanceGroupsPagedCallable() {
    return listRegionInstanceGroupsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> listRegionInstanceGroupsCallable() {
    return listRegionInstanceGroupsCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, ListInstancesRegionInstanceGroupsPagedResponse> listInstancesRegionInstanceGroupsPagedCallable() {
    return listInstancesRegionInstanceGroupsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> listInstancesRegionInstanceGroupsCallable() {
    return listInstancesRegionInstanceGroupsCallable;
  }

  @BetaApi
  public UnaryCallable<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> setNamedPortsRegionInstanceGroupCallable() {
    return setNamedPortsRegionInstanceGroupCallable;
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