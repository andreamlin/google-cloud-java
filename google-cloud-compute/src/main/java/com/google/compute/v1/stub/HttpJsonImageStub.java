/*
 * Copyright 2017 Google LLC
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
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteImageHttpRequest;
import com.google.compute.v1.DeprecateImageHttpRequest;
import com.google.compute.v1.DeprecationStatus;
import com.google.compute.v1.FamilyName;
import com.google.compute.v1.GetFromFamilyImageHttpRequest;
import com.google.compute.v1.GetImageHttpRequest;
import com.google.compute.v1.Image;
import com.google.compute.v1.ImageList;
import com.google.compute.v1.ImageName;
import com.google.compute.v1.ImageSettings;
import com.google.compute.v1.InsertImageHttpRequest;
import com.google.compute.v1.ListImagesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListImagesPagedResponse;
import com.google.compute.v1.ProjectName;
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
public class HttpJsonImageStub extends ImageStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteImageHttpRequest, Operation> deleteImageMethodDescriptor =
      ApiMethodDescriptor.<DeleteImageHttpRequest, Operation>newBuilder()
          .setMethodName("compute.images.delete")
          .setRequestInstance(DeleteImageHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/images/{image}")
          .setPathParams(Sets.<String>newHashSet(
                            "image",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  private static final ApiMethodDescriptor<DeprecateImageHttpRequest, Operation> deprecateImageMethodDescriptor =
      ApiMethodDescriptor.<DeprecateImageHttpRequest, Operation>newBuilder()
          .setMethodName("compute.images.deprecate")
          .setRequestInstance(DeprecateImageHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/images/{image}/deprecate")
          .setPathParams(Sets.<String>newHashSet(
                            "image",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<GetImageHttpRequest, Image> getImageMethodDescriptor =
      ApiMethodDescriptor.<GetImageHttpRequest, Image>newBuilder()
          .setMethodName("compute.images.get")
          .setRequestInstance(GetImageHttpRequest.getDefaultInstance())
          .setResponseInstance(Image.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/images/{image}")
          .setPathParams(Sets.<String>newHashSet(
                            "image",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageMethodDescriptor =
      ApiMethodDescriptor.<GetFromFamilyImageHttpRequest, Image>newBuilder()
          .setMethodName("compute.images.getFromFamily")
          .setRequestInstance(GetFromFamilyImageHttpRequest.getDefaultInstance())
          .setResponseInstance(Image.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/images/family/{family}")
          .setPathParams(Sets.<String>newHashSet(
                            "family",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<InsertImageHttpRequest, Operation> insertImageMethodDescriptor =
      ApiMethodDescriptor.<InsertImageHttpRequest, Operation>newBuilder()
          .setMethodName("compute.images.insert")
          .setRequestInstance(InsertImageHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/images")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<ListImagesHttpRequest, ImageList> listImagesMethodDescriptor =
      ApiMethodDescriptor.<ListImagesHttpRequest, ImageList>newBuilder()
          .setMethodName("compute.images.list")
          .setRequestInstance(ListImagesHttpRequest.getDefaultInstance())
          .setResponseInstance(ImageList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/images")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteImageHttpRequest, Operation> deleteImageCallable;
  private final UnaryCallable<DeprecateImageHttpRequest, Operation> deprecateImageCallable;
  private final UnaryCallable<GetImageHttpRequest, Image> getImageCallable;
  private final UnaryCallable<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageCallable;
  private final UnaryCallable<InsertImageHttpRequest, Operation> insertImageCallable;
  private final UnaryCallable<ListImagesHttpRequest, ImageList> listImagesCallable;
  private final UnaryCallable<ListImagesHttpRequest, ListImagesPagedResponse> listImagesPagedCallable;

  public static final HttpJsonImageStub create(ImageSettings settings) throws IOException {
    return new HttpJsonImageStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonImageStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonImageStub(ImageSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonImageStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonImageStub(ImageSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteImageHttpRequest, Operation> deleteImageTransportSettings =
        HttpJsonCallSettings.<DeleteImageHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteImageMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeprecateImageHttpRequest, Operation> deprecateImageTransportSettings =
        HttpJsonCallSettings.<DeprecateImageHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deprecateImageMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetImageHttpRequest, Image> getImageTransportSettings =
        HttpJsonCallSettings.<GetImageHttpRequest, Image>newBuilder()
            .setMethodDescriptor(getImageMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageTransportSettings =
        HttpJsonCallSettings.<GetFromFamilyImageHttpRequest, Image>newBuilder()
            .setMethodDescriptor(getFromFamilyImageMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertImageHttpRequest, Operation> insertImageTransportSettings =
        HttpJsonCallSettings.<InsertImageHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertImageMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListImagesHttpRequest, ImageList> listImagesTransportSettings =
        HttpJsonCallSettings.<ListImagesHttpRequest, ImageList>newBuilder()
            .setMethodDescriptor(listImagesMethodDescriptor)
            .build();

    this.deleteImageCallable = HttpJsonCallableFactory.createUnaryCallable(deleteImageTransportSettings,settings.deleteImageSettings(), clientContext);
    this.deprecateImageCallable = HttpJsonCallableFactory.createUnaryCallable(deprecateImageTransportSettings,settings.deprecateImageSettings(), clientContext);
    this.getImageCallable = HttpJsonCallableFactory.createUnaryCallable(getImageTransportSettings,settings.getImageSettings(), clientContext);
    this.getFromFamilyImageCallable = HttpJsonCallableFactory.createUnaryCallable(getFromFamilyImageTransportSettings,settings.getFromFamilyImageSettings(), clientContext);
    this.insertImageCallable = HttpJsonCallableFactory.createUnaryCallable(insertImageTransportSettings,settings.insertImageSettings(), clientContext);
    this.listImagesCallable = HttpJsonCallableFactory.createUnaryCallable(listImagesTransportSettings,settings.listImagesSettings(), clientContext);
    this.listImagesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listImagesTransportSettings,settings.listImagesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteImageHttpRequest, Operation> deleteImageCallable() {
    return deleteImageCallable;
  }

  @BetaApi
  public UnaryCallable<DeprecateImageHttpRequest, Operation> deprecateImageCallable() {
    return deprecateImageCallable;
  }

  @BetaApi
  public UnaryCallable<GetImageHttpRequest, Image> getImageCallable() {
    return getImageCallable;
  }

  @BetaApi
  public UnaryCallable<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageCallable() {
    return getFromFamilyImageCallable;
  }

  @BetaApi
  public UnaryCallable<InsertImageHttpRequest, Operation> insertImageCallable() {
    return insertImageCallable;
  }

  @BetaApi
  public UnaryCallable<ListImagesHttpRequest, ListImagesPagedResponse> listImagesPagedCallable() {
    return listImagesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListImagesHttpRequest, ImageList> listImagesCallable() {
    return listImagesCallable;
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