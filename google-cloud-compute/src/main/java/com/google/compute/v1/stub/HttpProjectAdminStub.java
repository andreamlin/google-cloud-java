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
import com.google.compute.v1.DiskMoveRequest;
import com.google.compute.v1.GetProjectHttpRequest;
import com.google.compute.v1.InstanceMoveRequest;
import com.google.compute.v1.Metadata;
import com.google.compute.v1.MoveDiskProjectHttpRequest;
import com.google.compute.v1.MoveInstanceProjectHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.Project;
import com.google.compute.v1.ProjectAdminSettings;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SetCommonInstanceMetadataProjectHttpRequest;
import com.google.compute.v1.SetUsageExportBucketProjectHttpRequest;
import com.google.compute.v1.UsageExportLocation;
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
public class HttpProjectAdminStub extends ProjectAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<GetProjectHttpRequest, Project> directGetProjectCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetProjectHttpRequest, Project>newBuilder()
              .setMethodName("compute.projects.get")
              .setRequestInstance(GetProjectHttpRequest.getDefaultInstance())
              .setResponseInstance(Project.getDefaultInstance())
              .setEndpointPathTemplate("{project}")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<MoveDiskProjectHttpRequest, Operation> directMoveDiskProjectCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<MoveDiskProjectHttpRequest, Operation>newBuilder()
              .setMethodName("compute.projects.moveDisk")
              .setRequestInstance(MoveDiskProjectHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/moveDisk")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<MoveInstanceProjectHttpRequest, Operation> directMoveInstanceProjectCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<MoveInstanceProjectHttpRequest, Operation>newBuilder()
              .setMethodName("compute.projects.moveInstance")
              .setRequestInstance(MoveInstanceProjectHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/moveInstance")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation> directSetCommonInstanceMetadataProjectCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetCommonInstanceMetadataProjectHttpRequest, Operation>newBuilder()
              .setMethodName("compute.projects.setCommonInstanceMetadata")
              .setRequestInstance(SetCommonInstanceMetadataProjectHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/setCommonInstanceMetadata")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation> directSetUsageExportBucketProjectCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetUsageExportBucketProjectHttpRequest, Operation>newBuilder()
              .setMethodName("compute.projects.setUsageExportBucket")
              .setRequestInstance(SetUsageExportBucketProjectHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/setUsageExportBucket")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable;
  private final UnaryCallable<MoveDiskProjectHttpRequest, Operation> moveDiskProjectCallable;
  private final UnaryCallable<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectCallable;
  private final UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectCallable;
  private final UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectCallable;

  public static final HttpProjectAdminStub create(ProjectAdminSettings settings) throws IOException {
    return new HttpProjectAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpProjectAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpProjectAdminStub(ProjectAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpProjectAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpProjectAdminStub(ProjectAdminSettings settings, ClientContext clientContext) throws IOException {

    this.getProjectCallable = HttpJsonCallableFactory.create(directGetProjectCallable,settings.getProjectSettings(), clientContext);
    this.moveDiskProjectCallable = HttpJsonCallableFactory.create(directMoveDiskProjectCallable,settings.moveDiskProjectSettings(), clientContext);
    this.moveInstanceProjectCallable = HttpJsonCallableFactory.create(directMoveInstanceProjectCallable,settings.moveInstanceProjectSettings(), clientContext);
    this.setCommonInstanceMetadataProjectCallable = HttpJsonCallableFactory.create(directSetCommonInstanceMetadataProjectCallable,settings.setCommonInstanceMetadataProjectSettings(), clientContext);
    this.setUsageExportBucketProjectCallable = HttpJsonCallableFactory.create(directSetUsageExportBucketProjectCallable,settings.setUsageExportBucketProjectSettings(), clientContext);

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