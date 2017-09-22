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
import com.google.compute.v1.DeleteSnapshotHttpRequest;
import com.google.compute.v1.GetSnapshotHttpRequest;
import com.google.compute.v1.ListSnapshotsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListSnapshotsPagedResponse;
import com.google.compute.v1.Snapshot;
import com.google.compute.v1.SnapshotAdminSettings;
import com.google.compute.v1.SnapshotList;
import com.google.compute.v1.SnapshotName;
import com.google.compute.v1.SnapshotsProjectName;
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
public class HttpSnapshotAdminStub extends SnapshotAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteSnapshotHttpRequest, Operation> directDeleteSnapshotCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteSnapshotHttpRequest, Operation>newBuilder()
              .setMethodName("compute.snapshots.delete")
              .setRequestInstance(DeleteSnapshotHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/snapshots/{snapshot}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "snapshot"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetSnapshotHttpRequest, Snapshot> directGetSnapshotCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetSnapshotHttpRequest, Snapshot>newBuilder()
              .setMethodName("compute.snapshots.get")
              .setRequestInstance(GetSnapshotHttpRequest.getDefaultInstance())
              .setResponseInstance(Snapshot.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/snapshots/{snapshot}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "snapshot"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ListSnapshotsHttpRequest, SnapshotList> directListSnapshotsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListSnapshotsHttpRequest, SnapshotList>newBuilder()
              .setMethodName("compute.snapshots.list")
              .setRequestInstance(ListSnapshotsHttpRequest.getDefaultInstance())
              .setResponseInstance(SnapshotList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/snapshots")
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

  private final UnaryCallable<DeleteSnapshotHttpRequest, Operation> deleteSnapshotCallable;
  private final UnaryCallable<GetSnapshotHttpRequest, Snapshot> getSnapshotCallable;
  private final UnaryCallable<ListSnapshotsHttpRequest, SnapshotList> listSnapshotsCallable;
  private final UnaryCallable<ListSnapshotsHttpRequest, ListSnapshotsPagedResponse> listSnapshotsPagedCallable;

  public static final HttpSnapshotAdminStub create(SnapshotAdminSettings settings) throws IOException {
    return new HttpSnapshotAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpSnapshotAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpSnapshotAdminStub(SnapshotAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpSnapshotAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpSnapshotAdminStub(SnapshotAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteSnapshotCallable = HttpJsonCallableFactory.create(directDeleteSnapshotCallable,settings.deleteSnapshotSettings(), clientContext);
    this.getSnapshotCallable = HttpJsonCallableFactory.create(directGetSnapshotCallable,settings.getSnapshotSettings(), clientContext);
    this.listSnapshotsCallable = HttpJsonCallableFactory.create(directListSnapshotsCallable,settings.listSnapshotsSettings(), clientContext);
    this.listSnapshotsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListSnapshotsCallable,settings.listSnapshotsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteSnapshotHttpRequest, Operation> deleteSnapshotCallable() {
    return deleteSnapshotCallable;
  }

  @BetaApi
  public UnaryCallable<GetSnapshotHttpRequest, Snapshot> getSnapshotCallable() {
    return getSnapshotCallable;
  }

  @BetaApi
  public UnaryCallable<ListSnapshotsHttpRequest, ListSnapshotsPagedResponse> listSnapshotsPagedCallable() {
    return listSnapshotsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListSnapshotsHttpRequest, SnapshotList> listSnapshotsCallable() {
    return listSnapshotsCallable;
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