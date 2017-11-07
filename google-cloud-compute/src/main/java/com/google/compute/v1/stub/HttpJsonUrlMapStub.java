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
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.CacheInvalidationRule;
import com.google.compute.v1.DeleteUrlMapHttpRequest;
import com.google.compute.v1.GetUrlMapHttpRequest;
import com.google.compute.v1.InsertUrlMapHttpRequest;
import com.google.compute.v1.InvalidateCacheUrlMapHttpRequest;
import com.google.compute.v1.ListUrlMapsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListUrlMapsPagedResponse;
import com.google.compute.v1.PatchUrlMapHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateUrlMapHttpRequest;
import com.google.compute.v1.UrlMap;
import com.google.compute.v1.UrlMapList;
import com.google.compute.v1.UrlMapName;
import com.google.compute.v1.UrlMapSettings;
import com.google.compute.v1.UrlMapsValidateRequest;
import com.google.compute.v1.UrlMapsValidateResponse;
import com.google.compute.v1.ValidateUrlMapHttpRequest;
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
public class HttpJsonUrlMapStub extends UrlMapStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteUrlMapHttpRequest, Operation> deleteUrlMapMethodDescriptor =
      ApiMethodDescriptor.<DeleteUrlMapHttpRequest, Operation>newBuilder()
          .setMethodName("compute.urlMaps.delete")
          .setRequestInstance(DeleteUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps/{urlMap}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "urlMap"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  private static final ApiMethodDescriptor<GetUrlMapHttpRequest, UrlMap> getUrlMapMethodDescriptor =
      ApiMethodDescriptor.<GetUrlMapHttpRequest, UrlMap>newBuilder()
          .setMethodName("compute.urlMaps.get")
          .setRequestInstance(GetUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(UrlMap.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps/{urlMap}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "urlMap"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<InsertUrlMapHttpRequest, Operation> insertUrlMapMethodDescriptor =
      ApiMethodDescriptor.<InsertUrlMapHttpRequest, Operation>newBuilder()
          .setMethodName("compute.urlMaps.insert")
          .setRequestInstance(InsertUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<InvalidateCacheUrlMapHttpRequest, Operation> invalidateCacheUrlMapMethodDescriptor =
      ApiMethodDescriptor.<InvalidateCacheUrlMapHttpRequest, Operation>newBuilder()
          .setMethodName("compute.urlMaps.invalidateCache")
          .setRequestInstance(InvalidateCacheUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps/{urlMap}/invalidateCache")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "urlMap"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  private static final ApiMethodDescriptor<ListUrlMapsHttpRequest, UrlMapList> listUrlMapsMethodDescriptor =
      ApiMethodDescriptor.<ListUrlMapsHttpRequest, UrlMapList>newBuilder()
          .setMethodName("compute.urlMaps.list")
          .setRequestInstance(ListUrlMapsHttpRequest.getDefaultInstance())
          .setResponseInstance(UrlMapList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps")
          .setPathParams(Sets.<String>newHashSet(
                            "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  private static final ApiMethodDescriptor<PatchUrlMapHttpRequest, Operation> patchUrlMapMethodDescriptor =
      ApiMethodDescriptor.<PatchUrlMapHttpRequest, Operation>newBuilder()
          .setMethodName("compute.urlMaps.patch")
          .setRequestInstance(PatchUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps/{urlMap}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "urlMap"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PATCH)
          .build();
  private static final ApiMethodDescriptor<UpdateUrlMapHttpRequest, Operation> updateUrlMapMethodDescriptor =
      ApiMethodDescriptor.<UpdateUrlMapHttpRequest, Operation>newBuilder()
          .setMethodName("compute.urlMaps.update")
          .setRequestInstance(UpdateUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps/{urlMap}")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "urlMap"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PUT)
          .build();
  private static final ApiMethodDescriptor<ValidateUrlMapHttpRequest, UrlMapsValidateResponse> validateUrlMapMethodDescriptor =
      ApiMethodDescriptor.<ValidateUrlMapHttpRequest, UrlMapsValidateResponse>newBuilder()
          .setMethodName("compute.urlMaps.validate")
          .setRequestInstance(ValidateUrlMapHttpRequest.getDefaultInstance())
          .setResponseInstance(UrlMapsValidateResponse.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/urlMaps/{urlMap}/validate")
          .setPathParams(Sets.<String>newHashSet(
                            "project",    "urlMap"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteUrlMapHttpRequest, Operation> deleteUrlMapCallable;
  private final UnaryCallable<GetUrlMapHttpRequest, UrlMap> getUrlMapCallable;
  private final UnaryCallable<InsertUrlMapHttpRequest, Operation> insertUrlMapCallable;
  private final UnaryCallable<InvalidateCacheUrlMapHttpRequest, Operation> invalidateCacheUrlMapCallable;
  private final UnaryCallable<ListUrlMapsHttpRequest, UrlMapList> listUrlMapsCallable;
  private final UnaryCallable<ListUrlMapsHttpRequest, ListUrlMapsPagedResponse> listUrlMapsPagedCallable;
  private final UnaryCallable<PatchUrlMapHttpRequest, Operation> patchUrlMapCallable;
  private final UnaryCallable<UpdateUrlMapHttpRequest, Operation> updateUrlMapCallable;
  private final UnaryCallable<ValidateUrlMapHttpRequest, UrlMapsValidateResponse> validateUrlMapCallable;

  public static final HttpJsonUrlMapStub create(UrlMapSettings settings) throws IOException {
    return new HttpJsonUrlMapStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonUrlMapStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonUrlMapStub(UrlMapSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonUrlMapStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonUrlMapStub(UrlMapSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteUrlMapHttpRequest, Operation> deleteUrlMapTransportSettings =
        HttpJsonCallSettings.<DeleteUrlMapHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteUrlMapMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetUrlMapHttpRequest, UrlMap> getUrlMapTransportSettings =
        HttpJsonCallSettings.<GetUrlMapHttpRequest, UrlMap>newBuilder()
            .setMethodDescriptor(getUrlMapMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertUrlMapHttpRequest, Operation> insertUrlMapTransportSettings =
        HttpJsonCallSettings.<InsertUrlMapHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertUrlMapMethodDescriptor)
            .build();
    HttpJsonCallSettings<InvalidateCacheUrlMapHttpRequest, Operation> invalidateCacheUrlMapTransportSettings =
        HttpJsonCallSettings.<InvalidateCacheUrlMapHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(invalidateCacheUrlMapMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListUrlMapsHttpRequest, UrlMapList> listUrlMapsTransportSettings =
        HttpJsonCallSettings.<ListUrlMapsHttpRequest, UrlMapList>newBuilder()
            .setMethodDescriptor(listUrlMapsMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchUrlMapHttpRequest, Operation> patchUrlMapTransportSettings =
        HttpJsonCallSettings.<PatchUrlMapHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchUrlMapMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateUrlMapHttpRequest, Operation> updateUrlMapTransportSettings =
        HttpJsonCallSettings.<UpdateUrlMapHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateUrlMapMethodDescriptor)
            .build();
    HttpJsonCallSettings<ValidateUrlMapHttpRequest, UrlMapsValidateResponse> validateUrlMapTransportSettings =
        HttpJsonCallSettings.<ValidateUrlMapHttpRequest, UrlMapsValidateResponse>newBuilder()
            .setMethodDescriptor(validateUrlMapMethodDescriptor)
            .build();

    this.deleteUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(deleteUrlMapTransportSettings,settings.deleteUrlMapSettings(), clientContext);
    this.getUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(getUrlMapTransportSettings,settings.getUrlMapSettings(), clientContext);
    this.insertUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(insertUrlMapTransportSettings,settings.insertUrlMapSettings(), clientContext);
    this.invalidateCacheUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(invalidateCacheUrlMapTransportSettings,settings.invalidateCacheUrlMapSettings(), clientContext);
    this.listUrlMapsCallable = HttpJsonCallableFactory.createUnaryCallable(listUrlMapsTransportSettings,settings.listUrlMapsSettings(), clientContext);
    this.listUrlMapsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listUrlMapsTransportSettings,settings.listUrlMapsSettings(), clientContext);
    this.patchUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(patchUrlMapTransportSettings,settings.patchUrlMapSettings(), clientContext);
    this.updateUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(updateUrlMapTransportSettings,settings.updateUrlMapSettings(), clientContext);
    this.validateUrlMapCallable = HttpJsonCallableFactory.createUnaryCallable(validateUrlMapTransportSettings,settings.validateUrlMapSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteUrlMapHttpRequest, Operation> deleteUrlMapCallable() {
    return deleteUrlMapCallable;
  }

  @BetaApi
  public UnaryCallable<GetUrlMapHttpRequest, UrlMap> getUrlMapCallable() {
    return getUrlMapCallable;
  }

  @BetaApi
  public UnaryCallable<InsertUrlMapHttpRequest, Operation> insertUrlMapCallable() {
    return insertUrlMapCallable;
  }

  @BetaApi
  public UnaryCallable<InvalidateCacheUrlMapHttpRequest, Operation> invalidateCacheUrlMapCallable() {
    return invalidateCacheUrlMapCallable;
  }

  @BetaApi
  public UnaryCallable<ListUrlMapsHttpRequest, ListUrlMapsPagedResponse> listUrlMapsPagedCallable() {
    return listUrlMapsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListUrlMapsHttpRequest, UrlMapList> listUrlMapsCallable() {
    return listUrlMapsCallable;
  }

  @BetaApi
  public UnaryCallable<PatchUrlMapHttpRequest, Operation> patchUrlMapCallable() {
    return patchUrlMapCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateUrlMapHttpRequest, Operation> updateUrlMapCallable() {
    return updateUrlMapCallable;
  }

  @BetaApi
  public UnaryCallable<ValidateUrlMapHttpRequest, UrlMapsValidateResponse> validateUrlMapCallable() {
    return validateUrlMapCallable;
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