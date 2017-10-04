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
import com.google.compute.v1.Address;
import com.google.compute.v1.AddressList;
import com.google.compute.v1.DeleteGlobalAddressHttpRequest;
import com.google.compute.v1.GetGlobalAddressHttpRequest;
import com.google.compute.v1.GlobalAddressAdminSettings;
import com.google.compute.v1.GlobalAddressesAddressName;
import com.google.compute.v1.GlobalAddressesProjectName;
import com.google.compute.v1.InsertGlobalAddressHttpRequest;
import com.google.compute.v1.ListGlobalAddressesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalAddressesPagedResponse;
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
public class HttpJsonGlobalAddressAdminStub extends GlobalAddressAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteGlobalAddressHttpRequest, Operation> directDeleteGlobalAddressCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteGlobalAddressHttpRequest, Operation>newBuilder()
              .setMethodName("compute.globalAddresses.delete")
              .setRequestInstance(DeleteGlobalAddressHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/addresses/{address}")
              .setPathParams(Sets.<String>newHashSet(
                                "address",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetGlobalAddressHttpRequest, Address> directGetGlobalAddressCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetGlobalAddressHttpRequest, Address>newBuilder()
              .setMethodName("compute.globalAddresses.get")
              .setRequestInstance(GetGlobalAddressHttpRequest.getDefaultInstance())
              .setResponseInstance(Address.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/addresses/{address}")
              .setPathParams(Sets.<String>newHashSet(
                                "address",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertGlobalAddressHttpRequest, Operation> directInsertGlobalAddressCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertGlobalAddressHttpRequest, Operation>newBuilder()
              .setMethodName("compute.globalAddresses.insert")
              .setRequestInstance(InsertGlobalAddressHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/addresses")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListGlobalAddressesHttpRequest, AddressList> directListGlobalAddressesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListGlobalAddressesHttpRequest, AddressList>newBuilder()
              .setMethodName("compute.globalAddresses.list")
              .setRequestInstance(ListGlobalAddressesHttpRequest.getDefaultInstance())
              .setResponseInstance(AddressList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/addresses")
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

  private final UnaryCallable<DeleteGlobalAddressHttpRequest, Operation> deleteGlobalAddressCallable;
  private final UnaryCallable<GetGlobalAddressHttpRequest, Address> getGlobalAddressCallable;
  private final UnaryCallable<InsertGlobalAddressHttpRequest, Operation> insertGlobalAddressCallable;
  private final UnaryCallable<ListGlobalAddressesHttpRequest, AddressList> listGlobalAddressesCallable;
  private final UnaryCallable<ListGlobalAddressesHttpRequest, ListGlobalAddressesPagedResponse> listGlobalAddressesPagedCallable;

  public static final HttpJsonGlobalAddressAdminStub create(GlobalAddressAdminSettings settings) throws IOException {
    return new HttpJsonGlobalAddressAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonGlobalAddressAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonGlobalAddressAdminStub(GlobalAddressAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonGlobalAddressAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonGlobalAddressAdminStub(GlobalAddressAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteGlobalAddressCallable = HttpJsonCallableFactory.create(directDeleteGlobalAddressCallable,settings.deleteGlobalAddressSettings(), clientContext);
    this.getGlobalAddressCallable = HttpJsonCallableFactory.create(directGetGlobalAddressCallable,settings.getGlobalAddressSettings(), clientContext);
    this.insertGlobalAddressCallable = HttpJsonCallableFactory.create(directInsertGlobalAddressCallable,settings.insertGlobalAddressSettings(), clientContext);
    this.listGlobalAddressesCallable = HttpJsonCallableFactory.create(directListGlobalAddressesCallable,settings.listGlobalAddressesSettings(), clientContext);
    this.listGlobalAddressesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListGlobalAddressesCallable,settings.listGlobalAddressesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteGlobalAddressHttpRequest, Operation> deleteGlobalAddressCallable() {
    return deleteGlobalAddressCallable;
  }

  @BetaApi
  public UnaryCallable<GetGlobalAddressHttpRequest, Address> getGlobalAddressCallable() {
    return getGlobalAddressCallable;
  }

  @BetaApi
  public UnaryCallable<InsertGlobalAddressHttpRequest, Operation> insertGlobalAddressCallable() {
    return insertGlobalAddressCallable;
  }

  @BetaApi
  public UnaryCallable<ListGlobalAddressesHttpRequest, ListGlobalAddressesPagedResponse> listGlobalAddressesPagedCallable() {
    return listGlobalAddressesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListGlobalAddressesHttpRequest, AddressList> listGlobalAddressesCallable() {
    return listGlobalAddressesCallable;
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