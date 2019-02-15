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
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RouteClient.ListRoutesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.RouteStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RouteClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://www.googleapis.com/compute/v1/projects/) and default
 *       port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getRoute to 30 seconds:
 *
 * <pre>
 * <code>
 * RouteSettings.Builder routeSettingsBuilder =
 *     RouteSettings.newBuilder();
 * routeSettingsBuilder.getRouteSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RouteSettings routeSettings = routeSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RouteSettings extends ClientSettings<RouteSettings> {
  /** Returns the object with the settings used for calls to deleteRoute. */
  public UnaryCallSettings<DeleteRouteHttpRequest, Operation> deleteRouteSettings() {
    return ((RouteStubSettings) getStubSettings()).deleteRouteSettings();
  }

  /** Returns the object with the settings used for calls to deleteRoute. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteRouteHttpRequest, EmptyMessage, EmptyMessage>
      deleteRouteOperationSettings() {
    return ((RouteStubSettings) getStubSettings()).deleteRouteOperationSettings();
  }

  /** Returns the object with the settings used for calls to getRoute. */
  public UnaryCallSettings<GetRouteHttpRequest, Route> getRouteSettings() {
    return ((RouteStubSettings) getStubSettings()).getRouteSettings();
  }

  /** Returns the object with the settings used for calls to insertRoute. */
  public UnaryCallSettings<InsertRouteHttpRequest, Operation> insertRouteSettings() {
    return ((RouteStubSettings) getStubSettings()).insertRouteSettings();
  }

  /** Returns the object with the settings used for calls to insertRoute. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<InsertRouteHttpRequest, EmptyMessage, EmptyMessage>
      insertRouteOperationSettings() {
    return ((RouteStubSettings) getStubSettings()).insertRouteOperationSettings();
  }

  /** Returns the object with the settings used for calls to listRoutes. */
  public PagedCallSettings<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse>
      listRoutesSettings() {
    return ((RouteStubSettings) getStubSettings()).listRoutesSettings();
  }

  public static final RouteSettings create(RouteStubSettings stub) throws IOException {
    return new RouteSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RouteStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return RouteStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return RouteStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return RouteStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RouteStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return RouteStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RouteStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RouteStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RouteSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for RouteSettings. */
  public static class Builder extends ClientSettings.Builder<RouteSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(RouteStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(RouteStubSettings.newBuilder());
    }

    protected Builder(RouteSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RouteStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public RouteStubSettings.Builder getStubSettingsBuilder() {
      return ((RouteStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to deleteRoute. */
    public UnaryCallSettings.Builder<DeleteRouteHttpRequest, Operation> deleteRouteSettings() {
      return getStubSettingsBuilder().deleteRouteSettings();
    }

    /** Returns the builder for the settings used for calls to deleteRoute. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteRouteHttpRequest, EmptyMessage, EmptyMessage>
        deleteRouteOperationSettings() {
      return getStubSettingsBuilder().deleteRouteOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getRoute. */
    public UnaryCallSettings.Builder<GetRouteHttpRequest, Route> getRouteSettings() {
      return getStubSettingsBuilder().getRouteSettings();
    }

    /** Returns the builder for the settings used for calls to insertRoute. */
    public UnaryCallSettings.Builder<InsertRouteHttpRequest, Operation> insertRouteSettings() {
      return getStubSettingsBuilder().insertRouteSettings();
    }

    /** Returns the builder for the settings used for calls to insertRoute. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertRouteHttpRequest, EmptyMessage, EmptyMessage>
        insertRouteOperationSettings() {
      return getStubSettingsBuilder().insertRouteOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listRoutes. */
    public PagedCallSettings.Builder<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse>
        listRoutesSettings() {
      return getStubSettingsBuilder().listRoutesSettings();
    }

    @Override
    public RouteSettings build() throws IOException {
      return new RouteSettings(this);
    }
  }
}
