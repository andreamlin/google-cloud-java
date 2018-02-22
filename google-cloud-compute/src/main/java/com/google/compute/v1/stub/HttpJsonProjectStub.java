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
import com.google.compute.v1.DiskMoveRequest;
import com.google.compute.v1.GetProjectHttpRequest;
import com.google.compute.v1.InstanceMoveRequest;
import com.google.compute.v1.Metadata;
import com.google.compute.v1.MoveDiskProjectHttpRequest;
import com.google.compute.v1.MoveInstanceProjectHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.Project;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.ProjectSettings;
import com.google.compute.v1.SetCommonInstanceMetadataProjectHttpRequest;
import com.google.compute.v1.SetUsageExportBucketProjectHttpRequest;
import com.google.compute.v1.UsageExportLocation;
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
public class HttpJsonProjectStub extends ProjectStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<GetProjectHttpRequest, Project> getProjectMethodDescriptor =
      ApiMethodDescriptor.<GetProjectHttpRequest, Project>newBuilder()
          .setMethodName("compute.projects.get")
          .setRequestInstance(GetProjectHttpRequest.getDefaultInstance())
          .setResponseInstance(Project.getDefaultInstance())
          .setEndpointPathTemplate("{project}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<MoveDiskProjectHttpRequest, Operation> moveDiskProjectMethodDescriptor =
      ApiMethodDescriptor.<MoveDiskProjectHttpRequest, Operation>newBuilder()
          .setMethodName("compute.projects.moveDisk")
          .setRequestInstance(MoveDiskProjectHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/moveDisk")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectMethodDescriptor =
      ApiMethodDescriptor.<MoveInstanceProjectHttpRequest, Operation>newBuilder()
          .setMethodName("compute.projects.moveInstance")
          .setRequestInstance(MoveInstanceProjectHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/moveInstance")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectMethodDescriptor =
      ApiMethodDescriptor.<SetCommonInstanceMetadataProjectHttpRequest, Operation>newBuilder()
          .setMethodName("compute.projects.setCommonInstanceMetadata")
          .setRequestInstance(SetCommonInstanceMetadataProjectHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/setCommonInstanceMetadata")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectMethodDescriptor =
      ApiMethodDescriptor.<SetUsageExportBucketProjectHttpRequest, Operation>newBuilder()
          .setMethodName("compute.projects.setUsageExportBucket")
          .setRequestInstance(SetUsageExportBucketProjectHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/setUsageExportBucket")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable;
  private final UnaryCallable<MoveDiskProjectHttpRequest, Operation> moveDiskProjectCallable;
  private final UnaryCallable<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectCallable;
  private final UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectCallable;
  private final UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectCallable;

  public static final HttpJsonProjectStub create(ProjectStubSettings settings) throws IOException {
    return new HttpJsonProjectStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonProjectStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonProjectStub(ProjectStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonProjectStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonProjectStub(ProjectStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<GetProjectHttpRequest, Project> getProjectTransportSettings =
        HttpJsonCallSettings.<GetProjectHttpRequest, Project>newBuilder()
            .setMethodDescriptor(getProjectMethodDescriptor)
            .build();
    HttpJsonCallSettings<MoveDiskProjectHttpRequest, Operation> moveDiskProjectTransportSettings =
        HttpJsonCallSettings.<MoveDiskProjectHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(moveDiskProjectMethodDescriptor)
            .build();
    HttpJsonCallSettings<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectTransportSettings =
        HttpJsonCallSettings.<MoveInstanceProjectHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(moveInstanceProjectMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectTransportSettings =
        HttpJsonCallSettings.<SetCommonInstanceMetadataProjectHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setCommonInstanceMetadataProjectMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectTransportSettings =
        HttpJsonCallSettings.<SetUsageExportBucketProjectHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setUsageExportBucketProjectMethodDescriptor)
            .build();

    this.getProjectCallable = HttpJsonCallableFactory.createUnaryCallable(getProjectTransportSettings,settings.getProjectSettings(), clientContext);
    this.moveDiskProjectCallable = HttpJsonCallableFactory.createUnaryCallable(moveDiskProjectTransportSettings,settings.moveDiskProjectSettings(), clientContext);
    this.moveInstanceProjectCallable = HttpJsonCallableFactory.createUnaryCallable(moveInstanceProjectTransportSettings,settings.moveInstanceProjectSettings(), clientContext);
    this.setCommonInstanceMetadataProjectCallable = HttpJsonCallableFactory.createUnaryCallable(setCommonInstanceMetadataProjectTransportSettings,settings.setCommonInstanceMetadataProjectSettings(), clientContext);
    this.setUsageExportBucketProjectCallable = HttpJsonCallableFactory.createUnaryCallable(setUsageExportBucketProjectTransportSettings,settings.setUsageExportBucketProjectSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable() {
    return getProjectCallable;
  }

  @BetaApi
  public UnaryCallable<MoveDiskProjectHttpRequest, Operation> moveDiskProjectCallable() {
    return moveDiskProjectCallable;
  }

  @BetaApi
  public UnaryCallable<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectCallable() {
    return moveInstanceProjectCallable;
  }

  @BetaApi
  public UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectCallable() {
    return setCommonInstanceMetadataProjectCallable;
  }

  @BetaApi
  public UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectCallable() {
    return setUsageExportBucketProjectCallable;
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