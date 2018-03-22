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
import com.google.compute.v1.AggregatedListSubnetworksHttpRequest;
import com.google.compute.v1.DeleteSubnetworkHttpRequest;
import com.google.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest;
import com.google.compute.v1.GetSubnetworkHttpRequest;
import com.google.compute.v1.InsertSubnetworkHttpRequest;
import com.google.compute.v1.ListSubnetworksHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
import com.google.compute.v1.Subnetwork;
import com.google.compute.v1.SubnetworkAggregatedList;
import static com.google.compute.v1.SubnetworkClient.AggregatedListSubnetworksPagedResponse;
import static com.google.compute.v1.SubnetworkClient.ListSubnetworksPagedResponse;
import com.google.compute.v1.SubnetworkList;
import com.google.compute.v1.SubnetworkName;
import com.google.compute.v1.SubnetworkSettings;
import com.google.compute.v1.SubnetworksExpandIpCidrRangeRequest;
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
public class HttpJsonSubnetworkStub extends SubnetworkStub {
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList>newBuilder()
          .setMethodName("compute.subnetworks.aggregatedList")
          .setRequestInstance(AggregatedListSubnetworksHttpRequest.getDefaultInstance())
          .setResponseInstance(SubnetworkAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/subnetworks")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkMethodDescriptor =
      ApiMethodDescriptor.<DeleteSubnetworkHttpRequest, Operation>newBuilder()
          .setMethodName("compute.subnetworks.delete")
          .setRequestInstance(DeleteSubnetworkHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/subnetworks/{subnetwork}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(SubnetworkName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("subnetwork")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkMethodDescriptor =
      ApiMethodDescriptor.<ExpandIpCidrRangeSubnetworkHttpRequest, Operation>newBuilder()
          .setMethodName("compute.subnetworks.expandIpCidrRange")
          .setRequestInstance(ExpandIpCidrRangeSubnetworkHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/subnetworks/{subnetwork}/expandIpCidrRange")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(SubnetworkName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("subnetwork")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkMethodDescriptor =
      ApiMethodDescriptor.<GetSubnetworkHttpRequest, Subnetwork>newBuilder()
          .setMethodName("compute.subnetworks.get")
          .setRequestInstance(GetSubnetworkHttpRequest.getDefaultInstance())
          .setResponseInstance(Subnetwork.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/subnetworks/{subnetwork}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(SubnetworkName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("subnetwork")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertSubnetworkHttpRequest, Operation> insertSubnetworkMethodDescriptor =
      ApiMethodDescriptor.<InsertSubnetworkHttpRequest, Operation>newBuilder()
          .setMethodName("compute.subnetworks.insert")
          .setRequestInstance(InsertSubnetworkHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/subnetworks")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("region")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksMethodDescriptor =
      ApiMethodDescriptor.<ListSubnetworksHttpRequest, SubnetworkList>newBuilder()
          .setMethodName("compute.subnetworks.list")
          .setRequestInstance(ListSubnetworksHttpRequest.getDefaultInstance())
          .setResponseInstance(SubnetworkList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/subnetworks")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("region")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksCallable;
  private final UnaryCallable<AggregatedListSubnetworksHttpRequest, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksPagedCallable;
  private final UnaryCallable<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkCallable;
  private final UnaryCallable<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkCallable;
  private final UnaryCallable<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkCallable;
  private final UnaryCallable<InsertSubnetworkHttpRequest, Operation> insertSubnetworkCallable;
  private final UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksCallable;
  private final UnaryCallable<ListSubnetworksHttpRequest, ListSubnetworksPagedResponse> listSubnetworksPagedCallable;

  private final HttpJsonClientCallableFactory callableFactory;
  public static final HttpJsonSubnetworkStub create(SubnetworkStubSettings settings) throws IOException {
    return new HttpJsonSubnetworkStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonSubnetworkStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonSubnetworkStub(SubnetworkStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonSubnetworkStub create(ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    return new HttpJsonSubnetworkStub(SubnetworkSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonSubnetworkStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonSubnetworkStub(SubnetworkStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonSubnetworkCallableFactory();
  }

  /**
   * Constructs an instance of HttpJsonSubnetworkStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonSubnetworkStub(SubnetworkStubSettings settings, ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksTransportSettings =
        HttpJsonCallSettings.<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListSubnetworksMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkTransportSettings =
        HttpJsonCallSettings.<DeleteSubnetworkHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteSubnetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkTransportSettings =
        HttpJsonCallSettings.<ExpandIpCidrRangeSubnetworkHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(expandIpCidrRangeSubnetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkTransportSettings =
        HttpJsonCallSettings.<GetSubnetworkHttpRequest, Subnetwork>newBuilder()
            .setMethodDescriptor(getSubnetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertSubnetworkHttpRequest, Operation> insertSubnetworkTransportSettings =
        HttpJsonCallSettings.<InsertSubnetworkHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertSubnetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksTransportSettings =
        HttpJsonCallSettings.<ListSubnetworksHttpRequest, SubnetworkList>newBuilder()
            .setMethodDescriptor(listSubnetworksMethodDescriptor)
            .build();

    this.aggregatedListSubnetworksCallable = callableFactory.createUnaryCallable(aggregatedListSubnetworksTransportSettings,settings.aggregatedListSubnetworksSettings(), clientContext);
    this.aggregatedListSubnetworksPagedCallable = callableFactory.createPagedCallable(aggregatedListSubnetworksTransportSettings,settings.aggregatedListSubnetworksSettings(), clientContext);
    this.deleteSubnetworkCallable = callableFactory.createUnaryCallable(deleteSubnetworkTransportSettings,settings.deleteSubnetworkSettings(), clientContext);
    this.expandIpCidrRangeSubnetworkCallable = callableFactory.createUnaryCallable(expandIpCidrRangeSubnetworkTransportSettings,settings.expandIpCidrRangeSubnetworkSettings(), clientContext);
    this.getSubnetworkCallable = callableFactory.createUnaryCallable(getSubnetworkTransportSettings,settings.getSubnetworkSettings(), clientContext);
    this.insertSubnetworkCallable = callableFactory.createUnaryCallable(insertSubnetworkTransportSettings,settings.insertSubnetworkSettings(), clientContext);
    this.listSubnetworksCallable = callableFactory.createUnaryCallable(listSubnetworksTransportSettings,settings.listSubnetworksSettings(), clientContext);
    this.listSubnetworksPagedCallable = callableFactory.createPagedCallable(listSubnetworksTransportSettings,settings.listSubnetworksSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListSubnetworksHttpRequest, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksPagedCallable() {
    return aggregatedListSubnetworksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksCallable() {
    return aggregatedListSubnetworksCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkCallable() {
    return deleteSubnetworkCallable;
  }

  @BetaApi
  public UnaryCallable<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkCallable() {
    return expandIpCidrRangeSubnetworkCallable;
  }

  @BetaApi
  public UnaryCallable<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkCallable() {
    return getSubnetworkCallable;
  }

  @BetaApi
  public UnaryCallable<InsertSubnetworkHttpRequest, Operation> insertSubnetworkCallable() {
    return insertSubnetworkCallable;
  }

  @BetaApi
  public UnaryCallable<ListSubnetworksHttpRequest, ListSubnetworksPagedResponse> listSubnetworksPagedCallable() {
    return listSubnetworksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksCallable() {
    return listSubnetworksCallable;
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