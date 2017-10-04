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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetVpnGatewaysPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetVpnGatewaysPagedResponse;
import com.google.compute.v1.stub.HttpTargetVpnGatewayAdminStub;
import com.google.compute.v1.stub.TargetVpnGatewayAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetVpnGatewayAdminClient}.
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
 * TargetVpnGatewayAdminSettings.Builder targetVpnGatewayAdminSettingsBuilder =
 *     TargetVpnGatewayAdminSettings.defaultBuilder();
 * targetVpnGatewayAdminSettingsBuilder.deleteTargetVpnGatewaySettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetVpnGatewayAdminSettings targetVpnGatewayAdminSettings = targetVpnGatewayAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetVpnGatewayAdminSettings extends ClientSettings {
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
  private final SimpleCallSettings<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings;
  private final SimpleCallSettings<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings;
  private final SimpleCallSettings<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings;
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
  public SimpleCallSettings<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings() {
    return deleteTargetVpnGatewaySettings;
  }

  /**
   * Returns the object with the settings used for calls to getTargetVpnGateway.
   */
  public SimpleCallSettings<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings() {
    return getTargetVpnGatewaySettings;
  }

  /**
   * Returns the object with the settings used for calls to insertTargetVpnGateway.
   */
  public SimpleCallSettings<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings() {
    return insertTargetVpnGatewaySettings;
  }

  /**
   * Returns the object with the settings used for calls to listTargetVpnGateways.
   */
  public PagedCallSettings<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings() {
    return listTargetVpnGatewaysSettings;
  }


  public TargetVpnGatewayAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpTargetVpnGatewayAdminStub.create(this);
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
          TargetVpnGatewayAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private TargetVpnGatewayAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

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
   * Builder for TargetVpnGatewayAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysSettings;
    private final SimpleCallSettings.Builder<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings;
    private final SimpleCallSettings.Builder<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings;
    private final SimpleCallSettings.Builder<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings;
    private final PagedCallSettings.Builder<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings;

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

      aggregatedListTargetVpnGatewaysSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_TARGET_VPN_GATEWAYS_PAGE_STR_FACT);

      deleteTargetVpnGatewaySettings = SimpleCallSettings.newBuilder();

      getTargetVpnGatewaySettings = SimpleCallSettings.newBuilder();

      insertTargetVpnGatewaySettings = SimpleCallSettings.newBuilder();

      listTargetVpnGatewaysSettings = PagedCallSettings.newBuilder(
          LIST_TARGET_VPN_GATEWAYS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
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
      builder.setTransportProvider(defaultTransportProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
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

    private Builder(TargetVpnGatewayAdminSettings settings) {
      super(settings);

      aggregatedListTargetVpnGatewaysSettings = settings.aggregatedListTargetVpnGatewaysSettings.toBuilder();
      deleteTargetVpnGatewaySettings = settings.deleteTargetVpnGatewaySettings.toBuilder();
      getTargetVpnGatewaySettings = settings.getTargetVpnGatewaySettings.toBuilder();
      insertTargetVpnGatewaySettings = settings.insertTargetVpnGatewaySettings.toBuilder();
      listTargetVpnGatewaysSettings = settings.listTargetVpnGatewaysSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListTargetVpnGatewaysSettings,
          deleteTargetVpnGatewaySettings,
          getTargetVpnGatewaySettings,
          insertTargetVpnGatewaySettings,
          listTargetVpnGatewaysSettings
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
     * Returns the builder for the settings used for calls to aggregatedListTargetVpnGateways.
     */
    public PagedCallSettings.Builder<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, AggregatedListTargetVpnGatewaysPagedResponse> aggregatedListTargetVpnGatewaysSettings() {
      return aggregatedListTargetVpnGatewaysSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteTargetVpnGateway.
     */
    public SimpleCallSettings.Builder<DeleteTargetVpnGatewayHttpRequest, Operation> deleteTargetVpnGatewaySettings() {
      return deleteTargetVpnGatewaySettings;
    }

    /**
     * Returns the builder for the settings used for calls to getTargetVpnGateway.
     */
    public SimpleCallSettings.Builder<GetTargetVpnGatewayHttpRequest, TargetVpnGateway> getTargetVpnGatewaySettings() {
      return getTargetVpnGatewaySettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertTargetVpnGateway.
     */
    public SimpleCallSettings.Builder<InsertTargetVpnGatewayHttpRequest, Operation> insertTargetVpnGatewaySettings() {
      return insertTargetVpnGatewaySettings;
    }

    /**
     * Returns the builder for the settings used for calls to listTargetVpnGateways.
     */
    public PagedCallSettings.Builder<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, ListTargetVpnGatewaysPagedResponse> listTargetVpnGatewaysSettings() {
      return listTargetVpnGatewaysSettings;
    }

    @Override
    public TargetVpnGatewayAdminSettings build() throws IOException {
      return new TargetVpnGatewayAdminSettings(this);
    }
  }
}