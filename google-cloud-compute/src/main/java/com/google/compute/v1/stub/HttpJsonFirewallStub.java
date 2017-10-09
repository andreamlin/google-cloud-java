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
import com.google.compute.v1.DeleteFirewallHttpRequest;
import com.google.compute.v1.Firewall;
import com.google.compute.v1.FirewallList;
import com.google.compute.v1.FirewallName;
import com.google.compute.v1.FirewallSettings;
import com.google.compute.v1.GetFirewallHttpRequest;
import com.google.compute.v1.InsertFirewallHttpRequest;
import com.google.compute.v1.ListFirewallsHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListFirewallsPagedResponse;
import com.google.compute.v1.PatchFirewallHttpRequest;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.UpdateFirewallHttpRequest;
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
public class HttpJsonFirewallStub extends FirewallStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteFirewallHttpRequest, Operation> directDeleteFirewallCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteFirewallHttpRequest, Operation>newBuilder()
              .setMethodName("compute.firewalls.delete")
              .setRequestInstance(DeleteFirewallHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
              .setPathParams(Sets.<String>newHashSet(
                                "firewall",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetFirewallHttpRequest, Firewall> directGetFirewallCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetFirewallHttpRequest, Firewall>newBuilder()
              .setMethodName("compute.firewalls.get")
              .setRequestInstance(GetFirewallHttpRequest.getDefaultInstance())
              .setResponseInstance(Firewall.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
              .setPathParams(Sets.<String>newHashSet(
                                "firewall",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertFirewallHttpRequest, Operation> directInsertFirewallCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertFirewallHttpRequest, Operation>newBuilder()
              .setMethodName("compute.firewalls.insert")
              .setRequestInstance(InsertFirewallHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/firewalls")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListFirewallsHttpRequest, FirewallList> directListFirewallsCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListFirewallsHttpRequest, FirewallList>newBuilder()
              .setMethodName("compute.firewalls.list")
              .setRequestInstance(ListFirewallsHttpRequest.getDefaultInstance())
              .setResponseInstance(FirewallList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/firewalls")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<PatchFirewallHttpRequest, Operation> directPatchFirewallCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<PatchFirewallHttpRequest, Operation>newBuilder()
              .setMethodName("compute.firewalls.patch")
              .setRequestInstance(PatchFirewallHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
              .setPathParams(Sets.<String>newHashSet(
                                "firewall",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PATCH)
              .build());
  private static final UnaryCallable<UpdateFirewallHttpRequest, Operation> directUpdateFirewallCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<UpdateFirewallHttpRequest, Operation>newBuilder()
              .setMethodName("compute.firewalls.update")
              .setRequestInstance(UpdateFirewallHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/firewalls/{firewall}")
              .setPathParams(Sets.<String>newHashSet(
                                "firewall",    "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.PUT)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteFirewallHttpRequest, Operation> deleteFirewallCallable;
  private final UnaryCallable<GetFirewallHttpRequest, Firewall> getFirewallCallable;
  private final UnaryCallable<InsertFirewallHttpRequest, Operation> insertFirewallCallable;
  private final UnaryCallable<ListFirewallsHttpRequest, FirewallList> listFirewallsCallable;
  private final UnaryCallable<ListFirewallsHttpRequest, ListFirewallsPagedResponse> listFirewallsPagedCallable;
  private final UnaryCallable<PatchFirewallHttpRequest, Operation> patchFirewallCallable;
  private final UnaryCallable<UpdateFirewallHttpRequest, Operation> updateFirewallCallable;

  public static final HttpJsonFirewallStub create(FirewallSettings settings) throws IOException {
    return new HttpJsonFirewallStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonFirewallStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonFirewallStub(FirewallSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonFirewallStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonFirewallStub(FirewallSettings settings, ClientContext clientContext) throws IOException {

    this.deleteFirewallCallable = HttpJsonCallableFactory.create(directDeleteFirewallCallable,settings.deleteFirewallSettings(), clientContext);
    this.getFirewallCallable = HttpJsonCallableFactory.create(directGetFirewallCallable,settings.getFirewallSettings(), clientContext);
    this.insertFirewallCallable = HttpJsonCallableFactory.create(directInsertFirewallCallable,settings.insertFirewallSettings(), clientContext);
    this.listFirewallsCallable = HttpJsonCallableFactory.create(directListFirewallsCallable,settings.listFirewallsSettings(), clientContext);
    this.listFirewallsPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListFirewallsCallable,settings.listFirewallsSettings(), clientContext);
    this.patchFirewallCallable = HttpJsonCallableFactory.create(directPatchFirewallCallable,settings.patchFirewallSettings(), clientContext);
    this.updateFirewallCallable = HttpJsonCallableFactory.create(directUpdateFirewallCallable,settings.updateFirewallSettings(), clientContext);

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