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
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.AggregatedListDiskTypesHttpRequest;
import com.google.compute.v1.DiskType;
import com.google.compute.v1.DiskTypeAggregatedList;
import static com.google.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import static com.google.compute.v1.DiskTypeClient.ListDiskTypesPagedResponse;
import com.google.compute.v1.DiskTypeList;
import com.google.compute.v1.DiskTypeName;
import com.google.compute.v1.DiskTypeSettings;
import com.google.compute.v1.GetDiskTypeHttpRequest;
import com.google.compute.v1.ListDiskTypesHttpRequest;
import com.google.compute.v1.ProjectName;
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
public class HttpJsonDiskTypeStub extends DiskTypeStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList>newBuilder()
          .setMethodName("compute.diskTypes.aggregatedList")
          .setRequestInstance(AggregatedListDiskTypesHttpRequest.getDefaultInstance())
          .setResponseInstance(DiskTypeAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/diskTypes")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetDiskTypeHttpRequest, DiskType> getDiskTypeMethodDescriptor =
      ApiMethodDescriptor.<GetDiskTypeHttpRequest, DiskType>newBuilder()
          .setMethodName("compute.diskTypes.get")
          .setRequestInstance(GetDiskTypeHttpRequest.getDefaultInstance())
          .setResponseInstance(DiskType.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/diskTypes/{diskType}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(DiskTypeName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("diskType")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesMethodDescriptor =
      ApiMethodDescriptor.<ListDiskTypesHttpRequest, DiskTypeList>newBuilder()
          .setMethodName("compute.diskTypes.list")
          .setRequestInstance(ListDiskTypesHttpRequest.getDefaultInstance())
          .setResponseInstance(DiskTypeList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}/diskTypes")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ZoneName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("zone")
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesCallable;
  private final UnaryCallable<AggregatedListDiskTypesHttpRequest, AggregatedListDiskTypesPagedResponse> aggregatedListDiskTypesPagedCallable;
  private final UnaryCallable<GetDiskTypeHttpRequest, DiskType> getDiskTypeCallable;
  private final UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesCallable;
  private final UnaryCallable<ListDiskTypesHttpRequest, ListDiskTypesPagedResponse> listDiskTypesPagedCallable;

  public static final HttpJsonDiskTypeStub create(DiskTypeStubSettings settings) throws IOException {
    return new HttpJsonDiskTypeStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDiskTypeStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonDiskTypeStub(DiskTypeStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonDiskTypeStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonDiskTypeStub(DiskTypeStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList> aggregatedListDiskTypesTransportSettings =
        HttpJsonCallSettings.<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListDiskTypesMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetDiskTypeHttpRequest, DiskType> getDiskTypeTransportSettings =
        HttpJsonCallSettings.<GetDiskTypeHttpRequest, DiskType>newBuilder()
            .setMethodDescriptor(getDiskTypeMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesTransportSettings =
        HttpJsonCallSettings.<ListDiskTypesHttpRequest, DiskTypeList>newBuilder()
            .setMethodDescriptor(listDiskTypesMethodDescriptor)
            .build();

    this.aggregatedListDiskTypesCallable = HttpJsonCallableFactory.createUnaryCallable(aggregatedListDiskTypesTransportSettings,settings.aggregatedListDiskTypesSettings(), clientContext);
    this.aggregatedListDiskTypesPagedCallable = HttpJsonCallableFactory.createPagedCallable(aggregatedListDiskTypesTransportSettings,settings.aggregatedListDiskTypesSettings(), clientContext);
    this.getDiskTypeCallable = HttpJsonCallableFactory.createUnaryCallable(getDiskTypeTransportSettings,settings.getDiskTypeSettings(), clientContext);
    this.listDiskTypesCallable = HttpJsonCallableFactory.createUnaryCallable(listDiskTypesTransportSettings,settings.listDiskTypesSettings(), clientContext);
    this.listDiskTypesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listDiskTypesTransportSettings,settings.listDiskTypesSettings(), clientContext);

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