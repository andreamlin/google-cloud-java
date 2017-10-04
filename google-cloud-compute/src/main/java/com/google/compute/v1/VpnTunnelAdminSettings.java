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
package com.google.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.httpjson.HttpJsonStatusCode;
import com.google.api.gax.httpjson.HttpJsonTransport;
import com.google.api.gax.httpjson.HttpJsonTransportProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.SimpleCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.TransportProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListVpnTunnelsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListVpnTunnelsPagedResponse;
import com.google.compute.v1.stub.HttpVpnTunnelAdminStub;
import com.google.compute.v1.stub.VpnTunnelAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link VpnTunnelAdminClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 * <li>The default service address (https://www.googleapis.com/compute/v1/projects/) and default port (443)
 * are used.
 * <li>Credentials are acquired automatically through Application Default Credentials.
 * <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders.
 * When build() is called, the tree of builders is called to create the complete settings
 * object. For example, to set the total timeout of deleteVpnTunnel to 30 seconds:
 *
 * <pre>
 * <code>
 * VpnTunnelAdminSettings.Builder vpnTunnelAdminSettingsBuilder =
 *     VpnTunnelAdminSettings.defaultBuilder();
 * vpnTunnelAdminSettingsBuilder.deleteVpnTunnelSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * VpnTunnelAdminSettings vpnTunnelAdminSettings = vpnTunnelAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class VpnTunnelAdminSettings extends ClientSettings {
  /**
   * The default scopes of the service.
   */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES = ImmutableList.<String>builder()
      .add("https://www.googleapis.com/auth/cloud-platform")
      .add("https://www.googleapis.com/auth/compute")
      .add("https://www.googleapis.com/auth/compute.readonly")
      .add("https://www.googleapis.com/auth/devstorage.full_control")
      .add("https://www.googleapis.com/auth/devstorage.read_only")
      .add("https://www.googleapis.com/auth/devstorage.read_write")
      .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/com/google/compute/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private final PagedCallSettings<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsSettings;
  private final SimpleCallSettings<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelSettings;
  private final SimpleCallSettings<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelSettings;
  private final SimpleCallSettings<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelSettings;
  private final PagedCallSettings<ListVpnTunnelsHttpRequest, VpnTunnelList, ListVpnTunnelsPagedResponse> listVpnTunnelsSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListVpnTunnels.
   */
  public PagedCallSettings<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsSettings() {
    return aggregatedListVpnTunnelsSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteVpnTunnel.
   */
  public SimpleCallSettings<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelSettings() {
    return deleteVpnTunnelSettings;
  }

  /**
   * Returns the object with the settings used for calls to getVpnTunnel.
   */
  public SimpleCallSettings<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelSettings() {
    return getVpnTunnelSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertVpnTunnel.
   */
  public SimpleCallSettings<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelSettings() {
    return insertVpnTunnelSettings;
  }

  /**
   * Returns the object with the settings used for calls to listVpnTunnels.
   */
  public PagedCallSettings<ListVpnTunnelsHttpRequest, VpnTunnelList, ListVpnTunnelsPagedResponse> listVpnTunnelsSettings() {
    return listVpnTunnelsSettings;
  }


  public VpnTunnelAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpVpnTunnelAdminStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportProvider().getTransportName());
    }
  }

  /**
   * Returns a builder for the default ExecutorProvider for this service.
   */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /**
   * Returns the default service endpoint.
   */
  public static String getDefaultEndpoint() {
    return "https://www.googleapis.com/compute/v1/projects/";
  }

  /**
   * Returns the default service port.
   */
  public static int getDefaultServicePort() {
    return 443;
  }


  /**
   * Returns the default service scopes.
   */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }


  /**
   * Returns a builder for the default credentials for this service.
   */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        ;
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder defaultHttpJsonChannelProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint())
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion());
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static HttpJsonTransportProvider.Builder defaultHttpJsonTransportProviderBuilder() {
    return HttpJsonTransportProvider.newBuilder()
        .setChannelProvider(defaultHttpJsonChannelProviderBuilder().build());
  }

  public static TransportProvider defaultTransportProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion = PropertiesProvider.loadProperty(
          VpnTunnelAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /**
   * Returns a builder for this class with recommended defaults.
   */
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /**
   * Returns a builder for this class with recommended defaults for API methods, and the given
   * ClientContext used for executor/transport/credentials.
   */
  public static Builder defaultBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /**
   * Returns a new builder for this class.
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Returns a new builder for this class.
   */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /**
   * Returns a builder containing all the values of this settings class.
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  private VpnTunnelAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    aggregatedListVpnTunnelsSettings = settingsBuilder.aggregatedListVpnTunnelsSettings().build();
    deleteVpnTunnelSettings = settingsBuilder.deleteVpnTunnelSettings().build();
    getVpnTunnelSettings = settingsBuilder.getVpnTunnelSettings().build();
    insertVpnTunnelSettings = settingsBuilder.insertVpnTunnelSettings().build();
    listVpnTunnelsSettings = settingsBuilder.listVpnTunnelsSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel> AGGREGATED_LIST_VPN_TUNNELS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListVpnTunnelsHttpRequest injectToken(AggregatedListVpnTunnelsHttpRequest payload, String token) {
          return AggregatedListVpnTunnelsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListVpnTunnelsHttpRequest injectPageSize(AggregatedListVpnTunnelsHttpRequest payload, int pageSize) {
          return AggregatedListVpnTunnelsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListVpnTunnelsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(VpnTunnelAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<VpnTunnel> extractResources(VpnTunnelAggregatedList payload) {
          return payload.getVpnTunnelsScopedList().getVpnTunnels();
        }
      };

  private static final PagedListDescriptor<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel> LIST_VPN_TUNNELS_PAGE_STR_DESC =
      new PagedListDescriptor<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListVpnTunnelsHttpRequest injectToken(ListVpnTunnelsHttpRequest payload, String token) {
          return ListVpnTunnelsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListVpnTunnelsHttpRequest injectPageSize(ListVpnTunnelsHttpRequest payload, int pageSize) {
          return ListVpnTunnelsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListVpnTunnelsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(VpnTunnelList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<VpnTunnel> extractResources(VpnTunnelList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, AggregatedListVpnTunnelsPagedResponse> AGGREGATED_LIST_VPN_TUNNELS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, AggregatedListVpnTunnelsPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListVpnTunnelsPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList> callable,
            AggregatedListVpnTunnelsHttpRequest request,
            ApiCallContext context,
            ApiFuture<VpnTunnelAggregatedList> futureResponse) {
          PageContext<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_VPN_TUNNELS_PAGE_STR_DESC, request, context);
          return AggregatedListVpnTunnelsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListVpnTunnelsHttpRequest, VpnTunnelList, ListVpnTunnelsPagedResponse> LIST_VPN_TUNNELS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListVpnTunnelsHttpRequest, VpnTunnelList, ListVpnTunnelsPagedResponse>() {
        @Override
        public ApiFuture<ListVpnTunnelsPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListVpnTunnelsHttpRequest, VpnTunnelList> callable,
            ListVpnTunnelsHttpRequest request,
            ApiCallContext context,
            ApiFuture<VpnTunnelList> futureResponse) {
          PageContext<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel> pageContext =
              PageContext.create(callable, LIST_VPN_TUNNELS_PAGE_STR_DESC, request, context);
          return ListVpnTunnelsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for VpnTunnelAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsSettings;
    private final SimpleCallSettings.Builder<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelSettings;
    private final SimpleCallSettings.Builder<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelSettings;
    private final SimpleCallSettings.Builder<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelSettings;
    private final PagedCallSettings.Builder<ListVpnTunnelsHttpRequest, VpnTunnelList, ListVpnTunnelsPagedResponse> listVpnTunnelsSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(Lists.<StatusCode>newArrayList(HttpJsonStatusCode.of(HttpStatus.SC_GATEWAY_TIMEOUT), HttpJsonStatusCode.of(HttpStatus.SC_SERVICE_UNAVAILABLE))));
      definitions.put(
          "non_idempotent",
          ImmutableSet.copyOf(Lists.<StatusCode>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder()
          .setInitialRetryDelay(Duration.ofMillis(100L))
          .setRetryDelayMultiplier(1.3)
          .setMaxRetryDelay(Duration.ofMillis(60000L))
          .setInitialRpcTimeout(Duration.ofMillis(20000L))
          .setRpcTimeoutMultiplier(1.0)
          .setMaxRpcTimeout(Duration.ofMillis(20000L))
          .setTotalTimeout(Duration.ofMillis(600000L))
          .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      this((ClientContext) null);
    }

    private Builder(ClientContext clientContext) {
      super(clientContext);

      aggregatedListVpnTunnelsSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_VPN_TUNNELS_PAGE_STR_FACT);

      deleteVpnTunnelSettings = SimpleCallSettings.newBuilder();

      getVpnTunnelSettings = SimpleCallSettings.newBuilder();

      insertVpnTunnelSettings = SimpleCallSettings.newBuilder();

      listVpnTunnelsSettings = PagedCallSettings.newBuilder(
          LIST_VPN_TUNNELS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListVpnTunnelsSettings,
          deleteVpnTunnelSettings,
          getVpnTunnelSettings,
          insertVpnTunnelSettings,
          listVpnTunnelsSettings
      );

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportProvider(defaultTransportProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder.aggregatedListVpnTunnelsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteVpnTunnelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getVpnTunnelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertVpnTunnelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listVpnTunnelsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(VpnTunnelAdminSettings settings) {
      super(settings);

      aggregatedListVpnTunnelsSettings = settings.aggregatedListVpnTunnelsSettings.toBuilder();
      deleteVpnTunnelSettings = settings.deleteVpnTunnelSettings.toBuilder();
      getVpnTunnelSettings = settings.getVpnTunnelSettings.toBuilder();
      insertVpnTunnelSettings = settings.insertVpnTunnelSettings.toBuilder();
      listVpnTunnelsSettings = settings.listVpnTunnelsSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListVpnTunnelsSettings,
          deleteVpnTunnelSettings,
          getVpnTunnelSettings,
          insertVpnTunnelSettings,
          listVpnTunnelsSettings
      );
    }

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setTransportProvider(TransportProvider transportProvider) {
      super.setTransportProvider(transportProvider);
      return this;
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      super.setCredentialsProvider(credentialsProvider);
      return this;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListVpnTunnels.
     */
    public PagedCallSettings.Builder<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, AggregatedListVpnTunnelsPagedResponse> aggregatedListVpnTunnelsSettings() {
      return aggregatedListVpnTunnelsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteVpnTunnel.
     */
    public SimpleCallSettings.Builder<DeleteVpnTunnelHttpRequest, Operation> deleteVpnTunnelSettings() {
      return deleteVpnTunnelSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getVpnTunnel.
     */
    public SimpleCallSettings.Builder<GetVpnTunnelHttpRequest, VpnTunnel> getVpnTunnelSettings() {
      return getVpnTunnelSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertVpnTunnel.
     */
    public SimpleCallSettings.Builder<InsertVpnTunnelHttpRequest, Operation> insertVpnTunnelSettings() {
      return insertVpnTunnelSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listVpnTunnels.
     */
    public PagedCallSettings.Builder<ListVpnTunnelsHttpRequest, VpnTunnelList, ListVpnTunnelsPagedResponse> listVpnTunnelsSettings() {
      return listVpnTunnelsSettings;
    }

    @Override
    public VpnTunnelAdminSettings build() throws IOException {
      return new VpnTunnelAdminSettings(this);
    }
  }
}