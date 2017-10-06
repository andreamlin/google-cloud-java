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
import com.google.compute.v1.DeleteInstanceTemplateHttpRequest;
import com.google.compute.v1.GetInstanceTemplateHttpRequest;
import com.google.compute.v1.InsertInstanceTemplateHttpRequest;
import com.google.compute.v1.InstanceTemplate;
import com.google.compute.v1.InstanceTemplateList;
import com.google.compute.v1.InstanceTemplateName;
import com.google.compute.v1.InstanceTemplateSettings;
import com.google.compute.v1.ListInstanceTemplatesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceTemplatesPagedResponse;
import com.google.compute.v1.ProjectName;
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
public class HttpJsonInstanceTemplateStub extends InstanceTemplateStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteInstanceTemplateHttpRequest, Operation> directDeleteInstanceTemplateCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteInstanceTemplateHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceTemplates.delete")
              .setRequestInstance(DeleteInstanceTemplateHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/instanceTemplates/{instanceTemplate}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceTemplate",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetInstanceTemplateHttpRequest, InstanceTemplate> directGetInstanceTemplateCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetInstanceTemplateHttpRequest, InstanceTemplate>newBuilder()
              .setMethodName("compute.instanceTemplates.get")
              .setRequestInstance(GetInstanceTemplateHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceTemplate.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/instanceTemplates/{instanceTemplate}")
              .setPathParams(Sets.<String>newHashSet(
                                "instanceTemplate",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertInstanceTemplateHttpRequest, Operation> directInsertInstanceTemplateCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertInstanceTemplateHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instanceTemplates.insert")
              .setRequestInstance(InsertInstanceTemplateHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/instanceTemplates")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListInstanceTemplatesHttpRequest, InstanceTemplateList> directListInstanceTemplatesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListInstanceTemplatesHttpRequest, InstanceTemplateList>newBuilder()
              .setMethodName("compute.instanceTemplates.list")
              .setRequestInstance(ListInstanceTemplatesHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceTemplateList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/instanceTemplates")
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

  private final UnaryCallable<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateCallable;
  private final UnaryCallable<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateCallable;
  private final UnaryCallable<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateCallable;
  private final UnaryCallable<ListInstanceTemplatesHttpRequest, InstanceTemplateList> listInstanceTemplatesCallable;
  private final UnaryCallable<ListInstanceTemplatesHttpRequest, ListInstanceTemplatesPagedResponse> listInstanceTemplatesPagedCallable;

  public static final HttpJsonInstanceTemplateStub create(InstanceTemplateSettings settings) throws IOException {
    return new HttpJsonInstanceTemplateStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceTemplateStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceTemplateStub(InstanceTemplateSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonInstanceTemplateStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceTemplateStub(InstanceTemplateSettings settings, ClientContext clientContext) throws IOException {

    this.deleteInstanceTemplateCallable = HttpJsonCallableFactory.create(directDeleteInstanceTemplateCallable,settings.deleteInstanceTemplateSettings(), clientContext);
    this.getInstanceTemplateCallable = HttpJsonCallableFactory.create(directGetInstanceTemplateCallable,settings.getInstanceTemplateSettings(), clientContext);
    this.insertInstanceTemplateCallable = HttpJsonCallableFactory.create(directInsertInstanceTemplateCallable,settings.insertInstanceTemplateSettings(), clientContext);
    this.listInstanceTemplatesCallable = HttpJsonCallableFactory.create(directListInstanceTemplatesCallable,settings.listInstanceTemplatesSettings(), clientContext);
    this.listInstanceTemplatesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListInstanceTemplatesCallable,settings.listInstanceTemplatesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateCallable() {
    return deleteInstanceTemplateCallable;
  }

  @BetaApi
  public UnaryCallable<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateCallable() {
    return getInstanceTemplateCallable;
  }

  @BetaApi
  public UnaryCallable<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateCallable() {
    return insertInstanceTemplateCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstanceTemplatesHttpRequest, ListInstanceTemplatesPagedResponse> listInstanceTemplatesPagedCallable() {
    return listInstanceTemplatesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstanceTemplatesHttpRequest, InstanceTemplateList> listInstanceTemplatesCallable() {
    return listInstanceTemplatesCallable;
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