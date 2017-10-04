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
import com.google.compute.v1.AggregatedListDiskTypesHttpRequest;
import com.google.compute.v1.DiskType;
import com.google.compute.v1.DiskTypeAdminSettings;
import com.google.compute.v1.DiskTypeAggregatedList;
import com.google.compute.v1.DiskTypeList;
import com.google.compute.v1.DiskTypeName;
import com.google.compute.v1.DiskTypesProjectName;
import com.google.compute.v1.DiskTypesZoneName;
import com.google.compute.v1.GetDiskTypeHttpRequest;
import com.google.compute.v1.ListDiskTypesHttpRequest;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDiskTypesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDiskTypesPagedResponse;
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
public class HttpJsonDiskTypeAdminStub extends DiskTypeAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> directAggregatedListDiskTypesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList>newBuilder()
              .setMethodName("compute.diskTypes.aggregatedList")
              .setRequestInstance(AggregatedListDiskTypesHttpRequest.getDefaultInstance())
              .setResponseInstance(DiskTypeAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/diskTypes")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<GetDiskTypeHttpRequest, DiskType> directGetDiskTypeCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetDiskTypeHttpRequest, DiskType>newBuilder()
              .setMethodName("compute.diskTypes.get")
              .setRequestInstance(GetDiskTypeHttpRequest.getDefaultInstance())
              .setResponseInstance(DiskType.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/diskTypes/{diskType}")
              .setPathParams(Sets.<String>newHashSet(
                                "diskType",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> directListDiskTypesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListDiskTypesHttpRequest, DiskTypeList>newBuilder()
              .setMethodName("compute.diskTypes.list")
              .setRequestInstance(ListDiskTypesHttpRequest.getDefaultInstance())
              .setResponseInstance(DiskTypeList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/diskTypes")
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

  private final UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesCallable;
  private final UnaryCallable<AggregatedListDiskTypesHttpRequest, AggregatedListDiskTypesPagedResponse> aggregatedListDiskTypesPagedCallable;
  private final UnaryCallable<GetDiskTypeHttpRequest, DiskType> getDiskTypeCallable;
  private final UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesCallable;
  private final UnaryCallable<ListDiskTypesHttpRequest, ListDiskTypesPagedResponse> listDiskTypesPagedCallable;

  public static final HttpJsonDiskTypeAdminStub create(DiskTypeAdminSettings settings) throws IOException {
    return new HttpJsonDiskTypeAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDiskTypeAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonDiskTypeAdminStub(DiskTypeAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonDiskTypeAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonDiskTypeAdminStub(DiskTypeAdminSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListDiskTypesCallable = HttpJsonCallableFactory.create(directAggregatedListDiskTypesCallable,settings.aggregatedListDiskTypesSettings(), clientContext);
    this.aggregatedListDiskTypesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListDiskTypesCallable,settings.aggregatedListDiskTypesSettings(), clientContext);
    this.getDiskTypeCallable = HttpJsonCallableFactory.create(directGetDiskTypeCallable,settings.getDiskTypeSettings(), clientContext);
    this.listDiskTypesCallable = HttpJsonCallableFactory.create(directListDiskTypesCallable,settings.listDiskTypesSettings(), clientContext);
    this.listDiskTypesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListDiskTypesCallable,settings.listDiskTypesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListDiskTypesHttpRequest, AggregatedListDiskTypesPagedResponse> aggregatedListDiskTypesPagedCallable() {
    return aggregatedListDiskTypesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesCallable() {
    return aggregatedListDiskTypesCallable;
  }

  @BetaApi
  public UnaryCallable<GetDiskTypeHttpRequest, DiskType> getDiskTypeCallable() {
    return getDiskTypeCallable;
  }

  @BetaApi
  public UnaryCallable<ListDiskTypesHttpRequest, ListDiskTypesPagedResponse> listDiskTypesPagedCallable() {
    return listDiskTypesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesCallable() {
    return listDiskTypesCallable;
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