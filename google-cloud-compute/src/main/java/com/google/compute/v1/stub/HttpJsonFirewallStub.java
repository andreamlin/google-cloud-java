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
import com.google.compute.v1.DeleteFirewallHttpRequest;
import com.google.compute.v1.Firewall;
import static com.google.compute.v1.FirewallClient.ListFirewallsPagedResponse;
import com.google.compute.v1.FirewallList;
import com.google.compute.v1.FirewallName;
import com.google.compute.v1.FirewallSettings;
import com.google.compute.v1.GetFirewallHttpRequest;
import com.google.compute.v1.InsertFirewallHttpRequest;
import com.google.compute.v1.ListFirewallsHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.PatchFirewallHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateFirewallHttpRequest;
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
public class HttpJsonFirewallStub extends FirewallStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  @VisibleForTesting
  public static final ApiMethodDescriptor<DeleteFirewallHttpRequest, Operation> deleteFirewallMethodDescriptor =
      ApiMethodDescriptor.<DeleteFirewallHttpRequest, Operation>newBuilder()
          .setMethodName("compute.firewalls.delete")
          .setRequestInstance(DeleteFirewallHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.DELETE)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<GetFirewallHttpRequest, Firewall> getFirewallMethodDescriptor =
      ApiMethodDescriptor.<GetFirewallHttpRequest, Firewall>newBuilder()
          .setMethodName("compute.firewalls.get")
          .setRequestInstance(GetFirewallHttpRequest.getDefaultInstance())
          .setResponseInstance(Firewall.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<InsertFirewallHttpRequest, Operation> insertFirewallMethodDescriptor =
      ApiMethodDescriptor.<InsertFirewallHttpRequest, Operation>newBuilder()
          .setMethodName("compute.firewalls.insert")
          .setRequestInstance(InsertFirewallHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/firewalls")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.POST)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<ListFirewallsHttpRequest, FirewallList> listFirewallsMethodDescriptor =
      ApiMethodDescriptor.<ListFirewallsHttpRequest, FirewallList>newBuilder()
          .setMethodName("compute.firewalls.list")
          .setRequestInstance(ListFirewallsHttpRequest.getDefaultInstance())
          .setResponseInstance(FirewallList.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/firewalls")
          .setQueryParams(Sets.<String>newHashSet(
                             "filter",    "maxResults",    "orderBy",    "pageToken"
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<PatchFirewallHttpRequest, Operation> patchFirewallMethodDescriptor =
      ApiMethodDescriptor.<PatchFirewallHttpRequest, Operation>newBuilder()
          .setMethodName("compute.firewalls.patch")
          .setRequestInstance(PatchFirewallHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PATCH)
          .build();
  @VisibleForTesting
  public static final ApiMethodDescriptor<UpdateFirewallHttpRequest, Operation> updateFirewallMethodDescriptor =
      ApiMethodDescriptor.<UpdateFirewallHttpRequest, Operation>newBuilder()
          .setMethodName("compute.firewalls.update")
          .setRequestInstance(UpdateFirewallHttpRequest.getDefaultInstance())
          .setResponseInstance(Operation.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.PUT)
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteFirewallHttpRequest, Operation> deleteFirewallCallable;
  private final UnaryCallable<GetFirewallHttpRequest, Firewall> getFirewallCallable;
  private final UnaryCallable<InsertFirewallHttpRequest, Operation> insertFirewallCallable;
  private final UnaryCallable<ListFirewallsHttpRequest, FirewallList> listFirewallsCallable;
  private final UnaryCallable<ListFirewallsHttpRequest, ListFirewallsPagedResponse> listFirewallsPagedCallable;
  private final UnaryCallable<PatchFirewallHttpRequest, Operation> patchFirewallCallable;
  private final UnaryCallable<UpdateFirewallHttpRequest, Operation> updateFirewallCallable;

  public static final HttpJsonFirewallStub create(FirewallStubSettings settings) throws IOException {
    return new HttpJsonFirewallStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonFirewallStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonFirewallStub(FirewallStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonFirewallStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonFirewallStub(FirewallStubSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<DeleteFirewallHttpRequest, Operation> deleteFirewallTransportSettings =
        HttpJsonCallSettings.<DeleteFirewallHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteFirewallMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetFirewallHttpRequest, Firewall> getFirewallTransportSettings =
        HttpJsonCallSettings.<GetFirewallHttpRequest, Firewall>newBuilder()
            .setMethodDescriptor(getFirewallMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertFirewallHttpRequest, Operation> insertFirewallTransportSettings =
        HttpJsonCallSettings.<InsertFirewallHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertFirewallMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListFirewallsHttpRequest, FirewallList> listFirewallsTransportSettings =
        HttpJsonCallSettings.<ListFirewallsHttpRequest, FirewallList>newBuilder()
            .setMethodDescriptor(listFirewallsMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchFirewallHttpRequest, Operation> patchFirewallTransportSettings =
        HttpJsonCallSettings.<PatchFirewallHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchFirewallMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateFirewallHttpRequest, Operation> updateFirewallTransportSettings =
        HttpJsonCallSettings.<UpdateFirewallHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(updateFirewallMethodDescriptor)
            .build();

    this.deleteFirewallCallable = HttpJsonCallableFactory.createUnaryCallable(deleteFirewallTransportSettings,settings.deleteFirewallSettings(), clientContext);
    this.getFirewallCallable = HttpJsonCallableFactory.createUnaryCallable(getFirewallTransportSettings,settings.getFirewallSettings(), clientContext);
    this.insertFirewallCallable = HttpJsonCallableFactory.createUnaryCallable(insertFirewallTransportSettings,settings.insertFirewallSettings(), clientContext);
    this.listFirewallsCallable = HttpJsonCallableFactory.createUnaryCallable(listFirewallsTransportSettings,settings.listFirewallsSettings(), clientContext);
    this.listFirewallsPagedCallable = HttpJsonCallableFactory.createPagedCallable(listFirewallsTransportSettings,settings.listFirewallsSettings(), clientContext);
    this.patchFirewallCallable = HttpJsonCallableFactory.createUnaryCallable(patchFirewallTransportSettings,settings.patchFirewallSettings(), clientContext);
    this.updateFirewallCallable = HttpJsonCallableFactory.createUnaryCallable(updateFirewallTransportSettings,settings.updateFirewallSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteFirewallHttpRequest, Operation> deleteFirewallCallable() {
    return deleteFirewallCallable;
  }

  @BetaApi
  public UnaryCallable<GetFirewallHttpRequest, Firewall> getFirewallCallable() {
    return getFirewallCallable;
  }

  @BetaApi
  public UnaryCallable<InsertFirewallHttpRequest, Operation> insertFirewallCallable() {
    return insertFirewallCallable;
  }

  @BetaApi
  public UnaryCallable<ListFirewallsHttpRequest, ListFirewallsPagedResponse> listFirewallsPagedCallable() {
    return listFirewallsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListFirewallsHttpRequest, FirewallList> listFirewallsCallable() {
    return listFirewallsCallable;
  }

  @BetaApi
  public UnaryCallable<PatchFirewallHttpRequest, Operation> patchFirewallCallable() {
    return patchFirewallCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateFirewallHttpRequest, Operation> updateFirewallCallable() {
    return updateFirewallCallable;
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