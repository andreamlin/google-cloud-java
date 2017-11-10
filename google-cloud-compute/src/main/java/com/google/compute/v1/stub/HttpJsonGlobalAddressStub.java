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
import com.google.compute.v1.Address;
import com.google.compute.v1.AddressList;
import com.google.compute.v1.DeleteGlobalAddressHttpRequest;
import com.google.compute.v1.GetGlobalAddressHttpRequest;
import com.google.compute.v1.GlobalAddressSettings;
import com.google.compute.v1.GlobalAddressesAddressName;
import com.google.compute.v1.InsertGlobalAddressHttpRequest;
import com.google.compute.v1.ListGlobalAddressesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalAddressesPagedResponse;
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
public class HttpJsonGlobalAddressStub extends GlobalAddressStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<DeleteGlobalAddressHttpRequest, Operation> deleteGlobalAddressMethodDescriptor =
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
  private static final ApiMethodDescriptor<GetGlobalAddressHttpRequest, Address> getGlobalAddressMethodDescriptor =
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
  private static final ApiMethodDescriptor<InsertGlobalAddressHttpRequest, Operation> insertGlobalAddressMethodDescriptor =
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
  private static final ApiMethodDescriptor<ListGlobalAddressesHttpRequest, AddressList> listGlobalAddressesMethodDescriptor =
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

  public static final HttpJsonGlobalAddressStub create(GlobalAddressSettings settings) throws IOException {
    return new HttpJsonGlobalAddressStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonGlobalAddressStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonGlobalAddressStub(GlobalAddressSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonGlobalAddressStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonGlobalAddressStub(GlobalAddressSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteGlobalAddressHttpRequest, Operation> deleteGlobalAddressTransportSettings =
        HttpJsonCallSettings.<DeleteGlobalAddressHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteGlobalAddressMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetGlobalAddressHttpRequest, Address> getGlobalAddressTransportSettings =
        HttpJsonCallSettings.<GetGlobalAddressHttpRequest, Address>newBuilder()
            .setMethodDescriptor(getGlobalAddressMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertGlobalAddressHttpRequest, Operation> insertGlobalAddressTransportSettings =
        HttpJsonCallSettings.<InsertGlobalAddressHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertGlobalAddressMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListGlobalAddressesHttpRequest, AddressList> listGlobalAddressesTransportSettings =
        HttpJsonCallSettings.<ListGlobalAddressesHttpRequest, AddressList>newBuilder()
            .setMethodDescriptor(listGlobalAddressesMethodDescriptor)
            .build();

    this.deleteGlobalAddressCallable = HttpJsonCallableFactory.createUnaryCallable(deleteGlobalAddressTransportSettings,settings.deleteGlobalAddressSettings(), clientContext);
    this.getGlobalAddressCallable = HttpJsonCallableFactory.createUnaryCallable(getGlobalAddressTransportSettings,settings.getGlobalAddressSettings(), clientContext);
    this.insertGlobalAddressCallable = HttpJsonCallableFactory.createUnaryCallable(insertGlobalAddressTransportSettings,settings.insertGlobalAddressSettings(), clientContext);
    this.listGlobalAddressesCallable = HttpJsonCallableFactory.createUnaryCallable(listGlobalAddressesTransportSettings,settings.listGlobalAddressesSettings(), clientContext);
    this.listGlobalAddressesPagedCallable = HttpJsonCallableFactory.createPagedCallable(listGlobalAddressesTransportSettings,settings.listGlobalAddressesSettings(), clientContext);

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