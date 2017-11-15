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
package com.google.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetVpnGatewaysPagedResponse;
import com.google.compute.v1.stub.HttpJsonTargetVpnGatewayStub;
import com.google.compute.v1.stub.TargetVpnGatewayStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetVpnGatewayClient}.
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
 * object. For example, to set the total timeout of deleteTargetVpnGateway to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetVpnGatewaySettings.Builder targetVpnGatewaySettingsBuilder =
 *     TargetVpnGatewaySettings.newBuilder();
 * targetVpnGatewaySettingsBuilder.deleteTargetVpnGatewaySettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetVpnGatewaySettings targetVpnGatewaySettings = targetVpnGatewaySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetVpnGatewaySettings extends ClientSettings<TargetVpnGatewaySettings> {
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

  private final PagedCallSettings<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysSettings;
  private final UnaryCallSettings<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings;
  private final UnaryCallSettings<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings;
  private final UnaryCallSettings<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings;
  private final PagedCallSettings<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListTargetVpnGateways.
   */
  public PagedCallSettings<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysSettings() {
    return aggregatedListTargetVpnGatewaysSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteTargetVpnGateway.
   */
  public UnaryCallSettings<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings() {
    return deleteTargetVpnGatewaySettings;
  }

  /**
   * Returns the object with the settings used for calls to getTargetVpnGateway.
   */
  public UnaryCallSettings<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings() {
    return getTargetVpnGatewaySettings;
  }

  /**
   * Returns the object with the settings used for calls to insertTargetVpnGateway.
   */
  public UnaryCallSettings<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings() {
    return insertTargetVpnGatewaySettings;
  }

  /**
   * Returns the object with the settings used for calls to listTargetVpnGateways.
   */
  public PagedCallSettings<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings() {
    return listTargetVpnGatewaysSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetVpnGatewayStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetVpnGatewayStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
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
  public static InstantiatingHttpJsonChannelProvider.Builder defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        ;
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion = PropertiesProvider.loadProperty(
          TargetVpnGatewaySettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /**
   * Returns a new builder for this class.
   */
  public static Builder newBuilder() {
    return Builder.createDefault();
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

  private TargetVpnGatewaySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    aggregatedListTargetVpnGatewaysSettings = settingsBuilder.aggregatedListTargetVpnGatewaysSettings().build();
    deleteTargetVpnGatewaySettings = settingsBuilder.deleteTargetVpnGatewaySettings().build();
    getTargetVpnGatewaySettings = settingsBuilder.getTargetVpnGatewaySettings().build();
    insertTargetVpnGatewaySettings = settingsBuilder.insertTargetVpnGatewaySettings().build();
    listTargetVpnGatewaysSettings = settingsBuilder.listTargetVpnGatewaysSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway> AGGREGATED_LIST_TARGET_VPN_GATEWAYS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListTargetVpnGatewaysHttpRequest injectToken(AggregatedListTargetVpnGatewaysHttpRequest payload, String token) {
          return AggregatedListTargetVpnGatewaysHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListTargetVpnGatewaysHttpRequest injectPageSize(AggregatedListTargetVpnGatewaysHttpRequest payload, int pageSize) {
          return AggregatedListTargetVpnGatewaysHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListTargetVpnGatewaysHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(TargetVpnGatewayAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<TargetVpnGateway> extractResources(TargetVpnGatewayAggregatedList payload) {
          return payload.getItems().getTargetVpnGateways();
        }
      };

  private static final PagedListDescriptor<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway> LIST_TARGET_VPN_GATEWAYS_PAGE_STR_DESC =
      new PagedListDescriptor<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListTargetVpnGatewaysHttpRequest injectToken(ListTargetVpnGatewaysHttpRequest payload, String token) {
          return ListTargetVpnGatewaysHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListTargetVpnGatewaysHttpRequest injectPageSize(ListTargetVpnGatewaysHttpRequest payload, int pageSize) {
          return ListTargetVpnGatewaysHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListTargetVpnGatewaysHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(TargetVpnGatewayList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<TargetVpnGateway> extractResources(TargetVpnGatewayList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> AGGREGATED_LIST_TARGET_VPN_GATEWAYS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListTargetVpnGatewaysPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList> callable,
            AggregatedListTargetVpnGatewaysHttpRequest request,
            ApiCallContext context,
            ApiFuture<TargetVpnGatewayAggregatedList> futureResponse) {
          PageContext<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_TARGET_VPN_GATEWAYS_PAGE_STR_DESC, request, context);
          return AggregatedListTargetVpnGatewaysPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> LIST_TARGET_VPN_GATEWAYS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse>() {
        @Override
        public ApiFuture<ListTargetVpnGatewaysPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList> callable,
            ListTargetVpnGatewaysHttpRequest request,
            ApiCallContext context,
            ApiFuture<TargetVpnGatewayList> futureResponse) {
          PageContext<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway> pageContext =
              PageContext.create(callable, LIST_TARGET_VPN_GATEWAYS_PAGE_STR_DESC, request, context);
          return ListTargetVpnGatewaysPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for TargetVpnGatewaySettings.
   */
  public static class Builder extends ClientSettings.Builder<TargetVpnGatewaySettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysSettings;
    private final UnaryCallSettings.Builder<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings;
    private final UnaryCallSettings.Builder<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings;
    private final UnaryCallSettings.Builder<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings;
    private final PagedCallSettings.Builder<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "non_idempotent",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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

      aggregatedListTargetVpnGatewaysSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_TARGET_VPN_GATEWAYS_PAGE_STR_FACT);

      deleteTargetVpnGatewaySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getTargetVpnGatewaySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetVpnGatewaySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listTargetVpnGatewaysSettings = PagedCallSettings.newBuilder(
          LIST_TARGET_VPN_GATEWAYS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          aggregatedListTargetVpnGatewaysSettings,
          deleteTargetVpnGatewaySettings,
          getTargetVpnGatewaySettings,
          insertTargetVpnGatewaySettings,
          listTargetVpnGatewaysSettings
      );

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder.aggregatedListTargetVpnGatewaysSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteTargetVpnGatewaySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getTargetVpnGatewaySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertTargetVpnGatewaySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listTargetVpnGatewaysSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(TargetVpnGatewaySettings settings) {
      super(settings);

      aggregatedListTargetVpnGatewaysSettings = settings.aggregatedListTargetVpnGatewaysSettings.toBuilder();
      deleteTargetVpnGatewaySettings = settings.deleteTargetVpnGatewaySettings.toBuilder();
      getTargetVpnGatewaySettings = settings.getTargetVpnGatewaySettings.toBuilder();
      insertTargetVpnGatewaySettings = settings.insertTargetVpnGatewaySettings.toBuilder();
      listTargetVpnGatewaysSettings = settings.listTargetVpnGatewaysSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          aggregatedListTargetVpnGatewaysSettings,
          deleteTargetVpnGatewaySettings,
          getTargetVpnGatewaySettings,
          insertTargetVpnGatewaySettings,
          listTargetVpnGatewaysSettings
      );
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListTargetVpnGateways.
     */
    public PagedCallSettings.Builder<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysSettings() {
      return aggregatedListTargetVpnGatewaysSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteTargetVpnGateway.
     */
    public UnaryCallSettings.Builder<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings() {
      return deleteTargetVpnGatewaySettings;
    }

    /**
     * Returns the builder for the settings used for calls to getTargetVpnGateway.
     */
    public UnaryCallSettings.Builder<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings() {
      return getTargetVpnGatewaySettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertTargetVpnGateway.
     */
    public UnaryCallSettings.Builder<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings() {
      return insertTargetVpnGatewaySettings;
    }

    /**
     * Returns the builder for the settings used for calls to listTargetVpnGateways.
     */
    public PagedCallSettings.Builder<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings() {
      return listTargetVpnGatewaysSettings;
    }

    @Override
    public TargetVpnGatewaySettings build() throws IOException {
      return new TargetVpnGatewaySettings(this);
    }
  }
}