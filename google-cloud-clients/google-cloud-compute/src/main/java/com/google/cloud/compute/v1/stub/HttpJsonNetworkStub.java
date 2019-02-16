/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.NetworkClient.ListNetworksPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMessageHttpResponseParser;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest;
import com.google.cloud.compute.v1.DeleteNetworkHttpRequest;
import com.google.cloud.compute.v1.GetNetworkHttpRequest;
import com.google.cloud.compute.v1.InsertNetworkHttpRequest;
import com.google.cloud.compute.v1.ListNetworksHttpRequest;
import com.google.cloud.compute.v1.Network;
import com.google.cloud.compute.v1.NetworkList;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchNetworkHttpRequest;
import com.google.cloud.compute.v1.ProjectGlobalNetworkName;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest;
import com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonNetworkStub extends NetworkStub {
  @InternalApi
  public static final ApiMethodDescriptor<AddPeeringNetworkHttpRequest, Operation>
      addPeeringNetworkMethodDescriptor =
          ApiMethodDescriptor.<AddPeeringNetworkHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.networks.addPeering")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<AddPeeringNetworkHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/global/networks/{network}/addPeering"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectGlobalNetworkName.newFactory())
                      .setResourceNameField("network")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteNetworkHttpRequest, Operation>
      deleteNetworkMethodDescriptor =
          ApiMethodDescriptor.<DeleteNetworkHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.networks.delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<DeleteNetworkHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/global/networks/{network}"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectGlobalNetworkName.newFactory())
                      .setResourceNameField("network")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetNetworkHttpRequest, Network>
      getNetworkMethodDescriptor =
          ApiMethodDescriptor.<GetNetworkHttpRequest, Network>newBuilder()
              .setFullMethodName("compute.networks.get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<GetNetworkHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/global/networks/{network}"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectGlobalNetworkName.newFactory())
                      .setResourceNameField("network")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Network>newBuilder()
                      .setResponseInstance(Network.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<InsertNetworkHttpRequest, Operation>
      insertNetworkMethodDescriptor =
          ApiMethodDescriptor.<InsertNetworkHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.networks.insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<InsertNetworkHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/global/networks"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListNetworksHttpRequest, NetworkList>
      listNetworksMethodDescriptor =
          ApiMethodDescriptor.<ListNetworksHttpRequest, NetworkList>newBuilder()
              .setFullMethodName("compute.networks.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListNetworksHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/global/networks"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<NetworkList>newBuilder()
                      .setResponseInstance(NetworkList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<PatchNetworkHttpRequest, Operation>
      patchNetworkMethodDescriptor =
          ApiMethodDescriptor.<PatchNetworkHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.networks.patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<PatchNetworkHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/global/networks/{network}"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectGlobalNetworkName.newFactory())
                      .setResourceNameField("network")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<RemovePeeringNetworkHttpRequest, Operation>
      removePeeringNetworkMethodDescriptor =
          ApiMethodDescriptor.<RemovePeeringNetworkHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.networks.removePeering")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<RemovePeeringNetworkHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/global/networks/{network}/removePeering"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectGlobalNetworkName.newFactory())
                      .setResourceNameField("network")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SwitchToCustomModeNetworkHttpRequest, Operation>
      switchToCustomModeNetworkMethodDescriptor =
          ApiMethodDescriptor.<SwitchToCustomModeNetworkHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.networks.switchToCustomMode")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SwitchToCustomModeNetworkHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/global/networks/{network}/switchToCustomMode"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectGlobalNetworkName.newFactory())
                      .setResourceNameField("network")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;
  private final HttpJsonGlobalOperationStub operationsStub;

  private final UnaryCallable<AddPeeringNetworkHttpRequest, Operation> addPeeringNetworkCallable;
  private final OperationCallable<AddPeeringNetworkHttpRequest, EmptyMessage, Operation>
      addPeeringNetworkOperationCallable;
  private final UnaryCallable<DeleteNetworkHttpRequest, Operation> deleteNetworkCallable;
  private final OperationCallable<DeleteNetworkHttpRequest, EmptyMessage, Operation>
      deleteNetworkOperationCallable;
  private final UnaryCallable<GetNetworkHttpRequest, Network> getNetworkCallable;
  private final UnaryCallable<InsertNetworkHttpRequest, Operation> insertNetworkCallable;
  private final OperationCallable<InsertNetworkHttpRequest, EmptyMessage, Operation>
      insertNetworkOperationCallable;
  private final UnaryCallable<ListNetworksHttpRequest, NetworkList> listNetworksCallable;
  private final UnaryCallable<ListNetworksHttpRequest, ListNetworksPagedResponse>
      listNetworksPagedCallable;
  private final UnaryCallable<PatchNetworkHttpRequest, Operation> patchNetworkCallable;
  private final OperationCallable<PatchNetworkHttpRequest, EmptyMessage, Operation>
      patchNetworkOperationCallable;
  private final UnaryCallable<RemovePeeringNetworkHttpRequest, Operation>
      removePeeringNetworkCallable;
  private final OperationCallable<RemovePeeringNetworkHttpRequest, EmptyMessage, Operation>
      removePeeringNetworkOperationCallable;
  private final UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation>
      switchToCustomModeNetworkCallable;
  private final OperationCallable<SwitchToCustomModeNetworkHttpRequest, EmptyMessage, Operation>
      switchToCustomModeNetworkOperationCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonNetworkStub create(NetworkStubSettings settings) throws IOException {
    return new HttpJsonNetworkStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonNetworkStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonNetworkStub(NetworkStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonNetworkStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonNetworkStub(
        NetworkStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonNetworkStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonNetworkStub(NetworkStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonNetworkCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonNetworkStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonNetworkStub(
      NetworkStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = HttpJsonGlobalOperationStub.create(clientContext, callableFactory);

    HttpJsonCallSettings<AddPeeringNetworkHttpRequest, Operation>
        addPeeringNetworkTransportSettings =
            HttpJsonCallSettings.<AddPeeringNetworkHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(addPeeringNetworkMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteNetworkHttpRequest, Operation> deleteNetworkTransportSettings =
        HttpJsonCallSettings.<DeleteNetworkHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteNetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetNetworkHttpRequest, Network> getNetworkTransportSettings =
        HttpJsonCallSettings.<GetNetworkHttpRequest, Network>newBuilder()
            .setMethodDescriptor(getNetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertNetworkHttpRequest, Operation> insertNetworkTransportSettings =
        HttpJsonCallSettings.<InsertNetworkHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertNetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListNetworksHttpRequest, NetworkList> listNetworksTransportSettings =
        HttpJsonCallSettings.<ListNetworksHttpRequest, NetworkList>newBuilder()
            .setMethodDescriptor(listNetworksMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchNetworkHttpRequest, Operation> patchNetworkTransportSettings =
        HttpJsonCallSettings.<PatchNetworkHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchNetworkMethodDescriptor)
            .build();
    HttpJsonCallSettings<RemovePeeringNetworkHttpRequest, Operation>
        removePeeringNetworkTransportSettings =
            HttpJsonCallSettings.<RemovePeeringNetworkHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(removePeeringNetworkMethodDescriptor)
                .build();
    HttpJsonCallSettings<SwitchToCustomModeNetworkHttpRequest, Operation>
        switchToCustomModeNetworkTransportSettings =
            HttpJsonCallSettings.<SwitchToCustomModeNetworkHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(switchToCustomModeNetworkMethodDescriptor)
                .build();

    this.addPeeringNetworkCallable =
        callableFactory.createUnaryCallable(
            addPeeringNetworkTransportSettings,
            settings.addPeeringNetworkSettings(),
            clientContext);
    this.addPeeringNetworkOperationCallable =
        callableFactory.createOperationCallable(
            addPeeringNetworkTransportSettings,
            settings.addPeeringNetworkOperationSettings(),
            clientContext,
            this.operationsStub);
    this.deleteNetworkCallable =
        callableFactory.createUnaryCallable(
            deleteNetworkTransportSettings, settings.deleteNetworkSettings(), clientContext);
    this.deleteNetworkOperationCallable =
        callableFactory.createOperationCallable(
            deleteNetworkTransportSettings,
            settings.deleteNetworkOperationSettings(),
            clientContext,
            this.operationsStub);
    this.getNetworkCallable =
        callableFactory.createUnaryCallable(
            getNetworkTransportSettings, settings.getNetworkSettings(), clientContext);
    this.insertNetworkCallable =
        callableFactory.createUnaryCallable(
            insertNetworkTransportSettings, settings.insertNetworkSettings(), clientContext);
    this.insertNetworkOperationCallable =
        callableFactory.createOperationCallable(
            insertNetworkTransportSettings,
            settings.insertNetworkOperationSettings(),
            clientContext,
            this.operationsStub);
    this.listNetworksCallable =
        callableFactory.createUnaryCallable(
            listNetworksTransportSettings, settings.listNetworksSettings(), clientContext);
    this.listNetworksPagedCallable =
        callableFactory.createPagedCallable(
            listNetworksTransportSettings, settings.listNetworksSettings(), clientContext);
    this.patchNetworkCallable =
        callableFactory.createUnaryCallable(
            patchNetworkTransportSettings, settings.patchNetworkSettings(), clientContext);
    this.patchNetworkOperationCallable =
        callableFactory.createOperationCallable(
            patchNetworkTransportSettings,
            settings.patchNetworkOperationSettings(),
            clientContext,
            this.operationsStub);
    this.removePeeringNetworkCallable =
        callableFactory.createUnaryCallable(
            removePeeringNetworkTransportSettings,
            settings.removePeeringNetworkSettings(),
            clientContext);
    this.removePeeringNetworkOperationCallable =
        callableFactory.createOperationCallable(
            removePeeringNetworkTransportSettings,
            settings.removePeeringNetworkOperationSettings(),
            clientContext,
            this.operationsStub);
    this.switchToCustomModeNetworkCallable =
        callableFactory.createUnaryCallable(
            switchToCustomModeNetworkTransportSettings,
            settings.switchToCustomModeNetworkSettings(),
            clientContext);
    this.switchToCustomModeNetworkOperationCallable =
        callableFactory.createOperationCallable(
            switchToCustomModeNetworkTransportSettings,
            settings.switchToCustomModeNetworkOperationSettings(),
            clientContext,
            this.operationsStub);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public HttpJsonGlobalOperationStub getOperationsStub() {
    return operationsStub;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AddPeeringNetworkHttpRequest, EmptyMessage, Operation>
      addPeeringNetworkOperationCallable() {
    return addPeeringNetworkOperationCallable;
  }

  @BetaApi
  public UnaryCallable<AddPeeringNetworkHttpRequest, Operation> addPeeringNetworkCallable() {
    return addPeeringNetworkCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteNetworkHttpRequest, EmptyMessage, Operation>
      deleteNetworkOperationCallable() {
    return deleteNetworkOperationCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteNetworkHttpRequest, Operation> deleteNetworkCallable() {
    return deleteNetworkCallable;
  }

  @BetaApi
  public UnaryCallable<GetNetworkHttpRequest, Network> getNetworkCallable() {
    return getNetworkCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertNetworkHttpRequest, EmptyMessage, Operation>
      insertNetworkOperationCallable() {
    return insertNetworkOperationCallable;
  }

  @BetaApi
  public UnaryCallable<InsertNetworkHttpRequest, Operation> insertNetworkCallable() {
    return insertNetworkCallable;
  }

  @BetaApi
  public UnaryCallable<ListNetworksHttpRequest, ListNetworksPagedResponse>
      listNetworksPagedCallable() {
    return listNetworksPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListNetworksHttpRequest, NetworkList> listNetworksCallable() {
    return listNetworksCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PatchNetworkHttpRequest, EmptyMessage, Operation>
      patchNetworkOperationCallable() {
    return patchNetworkOperationCallable;
  }

  @BetaApi
  public UnaryCallable<PatchNetworkHttpRequest, Operation> patchNetworkCallable() {
    return patchNetworkCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RemovePeeringNetworkHttpRequest, EmptyMessage, Operation>
      removePeeringNetworkOperationCallable() {
    return removePeeringNetworkOperationCallable;
  }

  @BetaApi
  public UnaryCallable<RemovePeeringNetworkHttpRequest, Operation> removePeeringNetworkCallable() {
    return removePeeringNetworkCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SwitchToCustomModeNetworkHttpRequest, EmptyMessage, Operation>
      switchToCustomModeNetworkOperationCallable() {
    return switchToCustomModeNetworkOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SwitchToCustomModeNetworkHttpRequest, Operation>
      switchToCustomModeNetworkCallable() {
    return switchToCustomModeNetworkCallable;
  }

  @Override
  public final void close() {
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
