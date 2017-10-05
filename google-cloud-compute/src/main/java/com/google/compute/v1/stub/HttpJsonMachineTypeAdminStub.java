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
import com.google.compute.v1.AggregatedListMachineTypesHttpRequest;
import com.google.compute.v1.GetMachineTypeHttpRequest;
import com.google.compute.v1.ListMachineTypesHttpRequest;
import com.google.compute.v1.MachineType;
import com.google.compute.v1.MachineTypeAdminSettings;
import com.google.compute.v1.MachineTypeAggregatedList;
import com.google.compute.v1.MachineTypeList;
import com.google.compute.v1.MachineTypeName;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListMachineTypesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListMachineTypesPagedResponse;
import com.google.compute.v1.ProjectName;
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
public class HttpJsonMachineTypeAdminStub extends MachineTypeAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList> directAggregatedListMachineTypesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList>newBuilder()
              .setMethodName("compute.machineTypes.aggregatedList")
              .setRequestInstance(AggregatedListMachineTypesHttpRequest.getDefaultInstance())
              .setResponseInstance(MachineTypeAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/machineTypes")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<GetMachineTypeHttpRequest, MachineType> directGetMachineTypeCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetMachineTypeHttpRequest, MachineType>newBuilder()
              .setMethodName("compute.machineTypes.get")
              .setRequestInstance(GetMachineTypeHttpRequest.getDefaultInstance())
              .setResponseInstance(MachineType.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/machineTypes/{machineType}")
              .setPathParams(Sets.<String>newHashSet(
                                "machineType",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListMachineTypesHttpRequest, MachineTypeList> directListMachineTypesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListMachineTypesHttpRequest, MachineTypeList>newBuilder()
              .setMethodName("compute.machineTypes.list")
              .setRequestInstance(ListMachineTypesHttpRequest.getDefaultInstance())
              .setResponseInstance(MachineTypeList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/machineTypes")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList> aggregatedListMachineTypesCallable;
  private final UnaryCallable<AggregatedListMachineTypesHttpRequest, AggregatedListMachineTypesPagedResponse> aggregatedListMachineTypesPagedCallable;
  private final UnaryCallable<GetMachineTypeHttpRequest, MachineType> getMachineTypeCallable;
  private final UnaryCallable<ListMachineTypesHttpRequest, MachineTypeList> listMachineTypesCallable;
  private final UnaryCallable<ListMachineTypesHttpRequest, ListMachineTypesPagedResponse> listMachineTypesPagedCallable;

  public static final HttpJsonMachineTypeAdminStub create(MachineTypeAdminSettings settings) throws IOException {
    return new HttpJsonMachineTypeAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonMachineTypeAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonMachineTypeAdminStub(MachineTypeAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonMachineTypeAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonMachineTypeAdminStub(MachineTypeAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListMachineTypesCallable = HttpJsonCallableFactory.create(directAggregatedListMachineTypesCallable,settings.aggregatedListMachineTypesSettings(), clientContext);
    this.aggregatedListMachineTypesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListMachineTypesCallable,settings.aggregatedListMachineTypesSettings(), clientContext);
    this.getMachineTypeCallable = HttpJsonCallableFactory.create(directGetMachineTypeCallable,settings.getMachineTypeSettings(), clientContext);
    this.listMachineTypesCallable = HttpJsonCallableFactory.create(directListMachineTypesCallable,settings.listMachineTypesSettings(), clientContext);
    this.listMachineTypesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListMachineTypesCallable,settings.listMachineTypesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListMachineTypesHttpRequest, AggregatedListMachineTypesPagedResponse> aggregatedListMachineTypesPagedCallable() {
    return aggregatedListMachineTypesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList> aggregatedListMachineTypesCallable() {
    return aggregatedListMachineTypesCallable;
  }

  @BetaApi
  public UnaryCallable<GetMachineTypeHttpRequest, MachineType> getMachineTypeCallable() {
    return getMachineTypeCallable;
  }

  @BetaApi
  public UnaryCallable<ListMachineTypesHttpRequest, ListMachineTypesPagedResponse> listMachineTypesPagedCallable() {
    return listMachineTypesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListMachineTypesHttpRequest, MachineTypeList> listMachineTypesCallable() {
    return listMachineTypesCallable;
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