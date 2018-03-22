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
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.Address;
import com.google.compute.v1.AddressAggregatedList;
import static com.google.compute.v1.AddressClient.AggregatedListAddressesPagedResponse;
import static com.google.compute.v1.AddressClient.ListAddressesPagedResponse;
import com.google.compute.v1.AddressList;
import com.google.compute.v1.AddressName;
import com.google.compute.v1.AddressSettings;
import com.google.compute.v1.AggregatedListAddressesHttpRequest;
import com.google.compute.v1.DeleteAddressHttpRequest;
import com.google.compute.v1.GetAddressHttpRequest;
import com.google.compute.v1.InsertAddressHttpRequest;
import com.google.compute.v1.ListAddressesHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.RegionName;
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
public class HttpJsonAddressStub extends AddressStub {
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListAddressesHttpRequest, AddressAggregatedList> aggregatedListAddressesMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListAddressesHttpRequest, AddressAggregatedList>newBuilder()
          .setMethodName("compute.addresses.aggregatedList")
          .setRequestInstance(AggregatedListAddressesHttpRequest.getDefaultInstance())
          .setResponseInstance(AddressAggregatedList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/aggregated/addresses")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(ProjectName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("project")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteAddressHttpRequest, Operation> deleteAddressMethodDescriptor =
      ApiMethodDescriptor.<DeleteAddressHttpRequest, Operation>newBuilder()
          .setMethodName("compute.addresses.delete")
          .setRequestInstance(DeleteAddressHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/addresses/{address}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(AddressName.newFactory()))
          .setHttpMethod(HttpMethods.DELETE)
          .setResourceNameField("address")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetAddressHttpRequest, Address> getAddressMethodDescriptor =
      ApiMethodDescriptor.<GetAddressHttpRequest, Address>newBuilder()
          .setMethodName("compute.addresses.get")
          .setRequestInstance(GetAddressHttpRequest.getDefaultInstance())
          .setResponseInstance(Address.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/addresses/{address}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(AddressName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("address")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertAddressHttpRequest, Operation> insertAddressMethodDescriptor =
      ApiMethodDescriptor.<InsertAddressHttpRequest, Operation>newBuilder()
          .setMethodName("compute.addresses.insert")
          .setRequestInstance(InsertAddressHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/addresses")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.POST)
          .setResourceNameField("region")
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListAddressesHttpRequest, AddressList> listAddressesMethodDescriptor =
      ApiMethodDescriptor.<ListAddressesHttpRequest, AddressList>newBuilder()
          .setMethodName("compute.addresses.list")
          .setRequestInstance(ListAddressesHttpRequest.getDefaultInstance())
          .setResponseInstance(AddressList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/regions/{region}/addresses")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter(RegionName.newFactory()))
          .setHttpMethod(HttpMethods.GET)
          .setResourceNameField("region")
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListAddressesHttpRequest, AddressAggregatedList> aggregatedListAddressesCallable;
  private final UnaryCallable<AggregatedListAddressesHttpRequest, AggregatedListAddressesPagedResponse> aggregatedListAddressesPagedCallable;
  private final UnaryCallable<DeleteAddressHttpRequest, Operation> deleteAddressCallable;
  private final UnaryCallable<GetAddressHttpRequest, Address> getAddressCallable;
  private final UnaryCallable<InsertAddressHttpRequest, Operation> insertAddressCallable;
  private final UnaryCallable<ListAddressesHttpRequest, AddressList> listAddressesCallable;
  private final UnaryCallable<ListAddressesHttpRequest, ListAddressesPagedResponse> listAddressesPagedCallable;

  private final HttpJsonClientCallableFactory callableFactory;
  public static final HttpJsonAddressStub create(AddressStubSettings settings) throws IOException {
    return new HttpJsonAddressStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAddressStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonAddressStub(AddressStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonAddressStub create(ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    return new HttpJsonAddressStub(AddressSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAddressStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonAddressStub(AddressStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonAddressCallableFactory();
  }

  /**
   * Constructs an instance of HttpJsonAddressStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonAddressStub(AddressStubSettings settings, ClientContext clientContext, HttpJsonClientCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListAddressesHttpRequest, AddressAggregatedList> aggregatedListAddressesTransportSettings =
        HttpJsonCallSettings.<AggregatedListAddressesHttpRequest, AddressAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListAddressesMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteAddressHttpRequest, Operation> deleteAddressTransportSettings =
        HttpJsonCallSettings.<DeleteAddressHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteAddressMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetAddressHttpRequest, Address> getAddressTransportSettings =
        HttpJsonCallSettings.<GetAddressHttpRequest, Address>newBuilder()
            .setMethodDescriptor(getAddressMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertAddressHttpRequest, Operation> insertAddressTransportSettings =
        HttpJsonCallSettings.<InsertAddressHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertAddressMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListAddressesHttpRequest, AddressList> listAddressesTransportSettings =
        HttpJsonCallSettings.<ListAddressesHttpRequest, AddressList>newBuilder()
            .setMethodDescriptor(listAddressesMethodDescriptor)
            .build();

    this.aggregatedListAddressesCallable = callableFactory.createUnaryCallable(aggregatedListAddressesTransportSettings,settings.aggregatedListAddressesSettings(), clientContext);
    this.aggregatedListAddressesPagedCallable = callableFactory.createPagedCallable(aggregatedListAddressesTransportSettings,settings.aggregatedListAddressesSettings(), clientContext);
    this.deleteAddressCallable = callableFactory.createUnaryCallable(deleteAddressTransportSettings,settings.deleteAddressSettings(), clientContext);
    this.getAddressCallable = callableFactory.createUnaryCallable(getAddressTransportSettings,settings.getAddressSettings(), clientContext);
    this.insertAddressCallable = callableFactory.createUnaryCallable(insertAddressTransportSettings,settings.insertAddressSettings(), clientContext);
    this.listAddressesCallable = callableFactory.createUnaryCallable(listAddressesTransportSettings,settings.listAddressesSettings(), clientContext);
    this.listAddressesPagedCallable = callableFactory.createPagedCallable(listAddressesTransportSettings,settings.listAddressesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AggregatedListAddressesHttpRequest, AggregatedListAddressesPagedResponse> aggregatedListAddressesPagedCallable() {
    return aggregatedListAddressesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListAddressesHttpRequest, AddressAggregatedList> aggregatedListAddressesCallable() {
    return aggregatedListAddressesCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteAddressHttpRequest, Operation> deleteAddressCallable() {
    return deleteAddressCallable;
  }

  @BetaApi
  public UnaryCallable<GetAddressHttpRequest, Address> getAddressCallable() {
    return getAddressCallable;
  }

  @BetaApi
  public UnaryCallable<InsertAddressHttpRequest, Operation> insertAddressCallable() {
    return insertAddressCallable;
  }

  @BetaApi
  public UnaryCallable<ListAddressesHttpRequest, ListAddressesPagedResponse> listAddressesPagedCallable() {
    return listAddressesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListAddressesHttpRequest, AddressList> listAddressesCallable() {
    return listAddressesCallable;
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