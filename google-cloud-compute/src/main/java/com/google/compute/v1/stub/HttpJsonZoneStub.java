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
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.EmptyRequestParamsExtractor;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.GetZoneHttpRequest;
import com.google.compute.v1.ListZonesHttpRequest;
import static com.google.compute.v1.PagedResponseWrappers.ListZonesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.Zone;
import com.google.compute.v1.ZoneList;
import com.google.compute.v1.ZoneName;
import com.google.compute.v1.ZoneSettings;
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
public class HttpJsonZoneStub extends ZoneStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<GetZoneHttpRequest, Zone> getZoneMethodDescriptor =
      ApiMethodDescriptor.<GetZoneHttpRequest, Zone>newBuilder()
          .setMethodName("compute.zones.get")
          .setRequestInstance(GetZoneHttpRequest.getDefaultInstance())
          .setResponseInstance(Zone.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones/{zone}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "zone"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());
  private static final ApiMethodDescriptor<ListZonesHttpRequest, ZoneList> listZonesMethodDescriptor =
      ApiMethodDescriptor.<ListZonesHttpRequest, ZoneList>newBuilder()
          .setMethodName("compute.zones.list")
          .setRequestInstance(ListZonesHttpRequest.getDefaultInstance())
          .setResponseInstance(ZoneList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/zones")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetZoneHttpRequest, Zone> getZoneCallable;
  private final UnaryCallable<ListZonesHttpRequest, ZoneList> listZonesCallable;
  private final UnaryCallable<ListZonesHttpRequest, ListZonesPagedResponse> listZonesPagedCallable;

  public static final HttpJsonZoneStub create(ZoneSettings settings) throws IOException {
    return new HttpJsonZoneStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonZoneStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonZoneStub(ZoneSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonZoneStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonZoneStub(ZoneSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<GetZoneHttpRequest, Zone> getZoneTransportSettings =
        HttpJsonCallSettings.<GetZoneHttpRequest, Zone>newBuilder()
            .setMethodDescriptor(getZoneMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListZonesHttpRequest, ZoneList> listZonesTransportSettings =
        HttpJsonCallSettings.<ListZonesHttpRequest, ZoneList>newBuilder()
            .setMethodDescriptor(listZonesMethodDescriptor)
            .build();

    this.getZoneCallable = HttpJsonCallableFactory.createUnaryCallable(getZoneTransportSettings,settings.getZoneSettings(), clientContext);
    this.listZonesCallable = HttpJsonCallableFactory.createUnaryCallable(listZonesTransportSettings,settings.listZonesSettings(), clientContext);
    this.listZonesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listZonesTransportSettings,settings.listZonesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetZoneHttpRequest, Zone> getZoneCallable() {
    return getZoneCallable;
  }

  @BetaApi
  public UnaryCallable<ListZonesHttpRequest, ListZonesPagedResponse> listZonesPagedCallable() {
    return listZonesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListZonesHttpRequest, ZoneList> listZonesCallable() {
    return listZonesCallable;
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