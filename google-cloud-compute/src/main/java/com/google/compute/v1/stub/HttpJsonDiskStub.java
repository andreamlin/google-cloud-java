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
import com.google.compute.v1.AggregatedListDisksHttpRequest;
import com.google.compute.v1.CreateSnapshotDiskHttpRequest;
import com.google.compute.v1.DeleteDiskHttpRequest;
import com.google.compute.v1.Disk;
import com.google.compute.v1.DiskAggregatedList;
import com.google.compute.v1.DiskList;
import com.google.compute.v1.DiskName;
import com.google.compute.v1.DiskSettings;
import com.google.compute.v1.DisksResizeRequest;
import com.google.compute.v1.GetDiskHttpRequest;
import com.google.compute.v1.InsertDiskHttpRequest;
import com.google.compute.v1.ListDisksHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListDisksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListDisksPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.ResizeDiskHttpRequest;
import com.google.compute.v1.Snapshot;
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
public class HttpJsonDiskStub extends DiskStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AggregatedListDisksHttpRequest, DiskAggregatedList> directAggregatedListDisksCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListDisksHttpRequest, DiskAggregatedList>newBuilder()
              .setMethodName("compute.disks.aggregatedList")
              .setRequestInstance(AggregatedListDisksHttpRequest.getDefaultInstance())
              .setResponseInstance(DiskAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/disks")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<CreateSnapshotDiskHttpRequest, Operation> directCreateSnapshotDiskCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<CreateSnapshotDiskHttpRequest, Operation>newBuilder()
              .setMethodName("compute.disks.createSnapshot")
              .setRequestInstance(CreateSnapshotDiskHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/disks/{disk}/createSnapshot")
              .setPathParams(Sets.<String>newHashSet(
                                "disk",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<DeleteDiskHttpRequest, Operation> directDeleteDiskCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteDiskHttpRequest, Operation>newBuilder()
              .setMethodName("compute.disks.delete")
              .setRequestInstance(DeleteDiskHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/disks/{disk}")
              .setPathParams(Sets.<String>newHashSet(
                                "disk",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetDiskHttpRequest, Disk> directGetDiskCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetDiskHttpRequest, Disk>newBuilder()
              .setMethodName("compute.disks.get")
              .setRequestInstance(GetDiskHttpRequest.getDefaultInstance())
              .setResponseInstance(Disk.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/disks/{disk}")
              .setPathParams(Sets.<String>newHashSet(
                                "disk",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertDiskHttpRequest, Operation> directInsertDiskCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertDiskHttpRequest, Operation>newBuilder()
              .setMethodName("compute.disks.insert")
              .setRequestInstance(InsertDiskHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/disks")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "sourceImage"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListDisksHttpRequest, DiskList> directListDisksCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListDisksHttpRequest, DiskList>newBuilder()
              .setMethodName("compute.disks.list")
              .setRequestInstance(ListDisksHttpRequest.getDefaultInstance())
              .setResponseInstance(DiskList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/disks")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ResizeDiskHttpRequest, Operation> directResizeDiskCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ResizeDiskHttpRequest, Operation>newBuilder()
              .setMethodName("compute.disks.resize")
              .setRequestInstance(ResizeDiskHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/disks/{disk}/resize")
              .setPathParams(Sets.<String>newHashSet(
                                "disk",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListDisksHttpRequest, DiskAggregatedList> aggregatedListDisksCallable;
  private final UnaryCallable<AggregatedListDisksHttpRequest, AggregatedListDisksPagedResponse> aggregatedListDisksPagedCallable;
  private final UnaryCallable<CreateSnapshotDiskHttpRequest, Operation> createSnapshotDiskCallable;
  private final UnaryCallable<DeleteDiskHttpRequest, Operation> deleteDiskCallable;
  private final UnaryCallable<GetDiskHttpRequest, Disk> getDiskCallable;
  private final UnaryCallable<InsertDiskHttpRequest, Operation> insertDiskCallable;
  private final UnaryCallable<ListDisksHttpRequest, DiskList> listDisksCallable;
  private final UnaryCallable<ListDisksHttpRequest, ListDisksPagedResponse> listDisksPagedCallable;
  private final UnaryCallable<ResizeDiskHttpRequest, Operation> resizeDiskCallable;

  public static final HttpJsonDiskStub create(DiskSettings settings) throws IOException {
    return new HttpJsonDiskStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDiskStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonDiskStub(DiskSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonDiskStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonDiskStub(DiskSettings settings, ClientContext clientContext) throws IOException {

    this.aggregatedListDisksCallable = HttpJsonCallableFactory.create(directAggregatedListDisksCallable,settings.aggregatedListDisksSettings(), clientContext);
    this.aggregatedListDisksPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListDisksCallable,settings.aggregatedListDisksSettings(), clientContext);
    this.createSnapshotDiskCallable = HttpJsonCallableFactory.create(directCreateSnapshotDiskCallable,settings.createSnapshotDiskSettings(), clientContext);
    this.deleteDiskCallable = HttpJsonCallableFactory.create(directDeleteDiskCallable,settings.deleteDiskSettings(), clientContext);
    this.getDiskCallable = HttpJsonCallableFactory.create(directGetDiskCallable,settings.getDiskSettings(), clientContext);
    this.insertDiskCallable = HttpJsonCallableFactory.create(directInsertDiskCallable,settings.insertDiskSettings(), clientContext);
    this.listDisksCallable = HttpJsonCallableFactory.create(directListDisksCallable,settings.listDisksSettings(), clientContext);
    this.listDisksPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListDisksCallable,settings.listDisksSettings(), clientContext);
    this.resizeDiskCallable = HttpJsonCallableFactory.create(directResizeDiskCallable,settings.resizeDiskSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListDisksHttpRequest, AggregatedListDisksPagedResponse> aggregatedListDisksPagedCallable() {
    return aggregatedListDisksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListDisksHttpRequest, DiskAggregatedList> aggregatedListDisksCallable() {
    return aggregatedListDisksCallable;
  }

  @BetaApi
  public UnaryCallable<CreateSnapshotDiskHttpRequest, Operation> createSnapshotDiskCallable() {
    return createSnapshotDiskCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteDiskHttpRequest, Operation> deleteDiskCallable() {
    return deleteDiskCallable;
  }

  @BetaApi
  public UnaryCallable<GetDiskHttpRequest, Disk> getDiskCallable() {
    return getDiskCallable;
  }

  @BetaApi
  public UnaryCallable<InsertDiskHttpRequest, Operation> insertDiskCallable() {
    return insertDiskCallable;
  }

  @BetaApi
  public UnaryCallable<ListDisksHttpRequest, ListDisksPagedResponse> listDisksPagedCallable() {
    return listDisksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListDisksHttpRequest, DiskList> listDisksCallable() {
    return listDisksCallable;
  }

  @BetaApi
  public UnaryCallable<ResizeDiskHttpRequest, Operation> resizeDiskCallable() {
    return resizeDiskCallable;
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