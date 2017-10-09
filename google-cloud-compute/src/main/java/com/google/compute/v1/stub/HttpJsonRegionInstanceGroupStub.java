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
import com.google.compute.v1.GetRegionInstanceGroupHttpRequest;
import com.google.compute.v1.InstanceGroup;
import com.google.compute.v1.InstanceWithNamedPorts;
import com.google.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest;
import com.google.compute.v1.ListRegionInstanceGroupsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListRegionInstanceGroupsPagedResponse;
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
public class HttpJsonRegionInstanceGroupStub extends RegionInstanceGroupStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<GetRegionInstanceGroupHttpRequest, InstanceGroup> directGetRegionInstanceGroupCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetRegionInstanceGroupHttpRequest, InstanceGroup>newBuilder()
              .setMethodName("compute.regionInstanceGroups.get")
              .setRequestInstance(GetRegionInstanceGroupHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceGroup.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups/{instanceGroup}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroup",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> directListRegionInstanceGroupsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList>newBuilder()
              .setMethodName("compute.regionInstanceGroups.list")
              .setRequestInstance(ListRegionInstanceGroupsHttpRequest.getDefaultInstance())
              .setResponseInstance(RegionInstanceGroupList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> directListInstancesRegionInstanceGroupsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances>newBuilder()
              .setMethodName("compute.regionInstanceGroups.listInstances")
              .setRequestInstance(ListInstancesRegionInstanceGroupsHttpRequest.getDefaultInstance())
              .setResponseInstance(RegionInstanceGroupsListInstances.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups/{instanceGroup}/listInstances")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroup",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> directSetNamedPortsRegionInstanceGroupCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetNamedPortsRegionInstanceGroupHttpRequest, Operation>newBuilder()
              .setMethodName("compute.regionInstanceGroups.setNamedPorts")
              .setRequestInstance(SetNamedPortsRegionInstanceGroupHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/regions/{region}/instanceGroups/{instanceGroup}/setNamedPorts")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceGroup",    "project",    "region"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetRegionInstanceGroupHttpRequest, InstanceGroup> getRegionInstanceGroupCallable;
  private final UnaryCallable<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList> listRegionInstanceGroupsCallable;
  private final UnaryCallable<ListRegionInstanceGroupsHttpRequest, ListRegionInstanceGroupsPagedResponse> listRegionInstanceGroupsPagedCallable;
  private final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances> listInstancesRegionInstanceGroupsCallable;
  private final UnaryCallable<ListInstancesRegionInstanceGroupsHttpRequest, ListInstancesRegionInstanceGroupsPagedResponse> listInstancesRegionInstanceGroupsPagedCallable;
  private final UnaryCallable<SetNamedPortsRegionInstanceGroupHttpRequest, Operation> setNamedPortsRegionInstanceGroupCallable;

  public static final HttpJsonRegionInstanceGroupStub create(RegionInstanceGroupSettings settings) throws IOException {
    return new HttpJsonRegionInstanceGroupStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionInstanceGroupStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonRegionInstanceGroupStub(RegionInstanceGroupSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonRegionInstanceGroupStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonRegionInstanceGroupStub(RegionInstanceGroupSettings settings, ClientContext clientContext) throws IOException {

    this.getRegionInstanceGroupCallable = HttpJsonCallableFactory.create(directGetRegionInstanceGroupCallable,settings.getRegionInstanceGroupSettings(), clientContext);
    this.listRegionInstanceGroupsCallable = HttpJsonCallableFactory.create(directListRegionInstanceGroupsCallable,settings.listRegionInstanceGroupsSettings(), clientContext);
    this.listRegionInstanceGroupsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListRegionInstanceGroupsCallable,settings.listRegionInstanceGroupsSettings(), clientContext);
    this.listInstancesRegionInstanceGroupsCallable = HttpJsonCallableFactory.create(directListInstancesRegionInstanceGroupsCallable,settings.listInstancesRegionInstanceGroupsSettings(), clientContext);
    this.listInstancesRegionInstanceGroupsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListInstancesRegionInstanceGroupsCallable,settings.listInstancesRegionInstanceGroupsSettings(), clientContext);
    this.setNamedPortsRegionInstanceGroupCallable = HttpJsonCallableFactory.create(directSetNamedPortsRegionInstanceGroupCallable,settings.setNamedPortsRegionInstanceGroupSettings(), clientContext);

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