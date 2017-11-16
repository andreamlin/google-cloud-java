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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListForwardingRulesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListForwardingRulesPagedResponse;
import com.google.compute.v1.stub.ForwardingRuleStub;
import com.google.compute.v1.stub.HttpJsonForwardingRuleStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ForwardingRuleClient}.
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
 * object. For example, to set the total timeout of deleteForwardingRule to 30 seconds:
 *
 * <pre>
 * <code>
 * ForwardingRuleSettings.Builder forwardingRuleSettingsBuilder =
 *     ForwardingRuleSettings.newBuilder();
 * forwardingRuleSettingsBuilder.deleteForwardingRuleSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * ForwardingRuleSettings forwardingRuleSettings = forwardingRuleSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ForwardingRuleSettings extends ClientSettings<ForwardingRuleSettings> {
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

  private final PagedCallSettings<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesSettings;
  private final UnaryCallSettings<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleSettings;
  private final UnaryCallSettings<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleSettings;
  private final UnaryCallSettings<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleSettings;
  private final PagedCallSettings<ListForwardingRulesHttpRequest, ForwardingRuleList, ListForwardingRulesPagedResponse> listForwardingRulesSettings;
  private final UnaryCallSettings<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListForwardingRules.
   */
  public PagedCallSettings<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesSettings() {
    return aggregatedListForwardingRulesSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteForwardingRule.
   */
  public UnaryCallSettings<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleSettings() {
    return deleteForwardingRuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to getForwardingRule.
   */
  public UnaryCallSettings<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleSettings() {
    return getForwardingRuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertForwardingRule.
   */
  public UnaryCallSettings<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleSettings() {
    return insertForwardingRuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to listForwardingRules.
   */
  public PagedCallSettings<ListForwardingRulesHttpRequest, ForwardingRuleList, ListForwardingRulesPagedResponse> listForwardingRulesSettings() {
    return listForwardingRulesSettings;
  }

  /**
   * Returns the object with the settings used for calls to setTargetForwardingRule.
   */
  public UnaryCallSettings<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleSettings() {
    return setTargetForwardingRuleSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ForwardingRuleStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonForwardingRuleStub.create(this);
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
        .setApiClientHeaderLineKey("x-goog-api-client")
        ;
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion = PropertiesProvider.loadProperty(
          ForwardingRuleSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private ForwardingRuleSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    aggregatedListForwardingRulesSettings = settingsBuilder.aggregatedListForwardingRulesSettings().build();
    deleteForwardingRuleSettings = settingsBuilder.deleteForwardingRuleSettings().build();
    getForwardingRuleSettings = settingsBuilder.getForwardingRuleSettings().build();
    insertForwardingRuleSettings = settingsBuilder.insertForwardingRuleSettings().build();
    listForwardingRulesSettings = settingsBuilder.listForwardingRulesSettings().build();
    setTargetForwardingRuleSettings = settingsBuilder.setTargetForwardingRuleSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule> AGGREGATED_LIST_FORWARDING_RULES_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListForwardingRulesHttpRequest injectToken(AggregatedListForwardingRulesHttpRequest payload, String token) {
          return AggregatedListForwardingRulesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListForwardingRulesHttpRequest injectPageSize(AggregatedListForwardingRulesHttpRequest payload, int pageSize) {
          return AggregatedListForwardingRulesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListForwardingRulesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(ForwardingRuleAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<ForwardingRule> extractResources(ForwardingRuleAggregatedList payload) {
          return payload.getItems().getForwardingRules();
        }
      };

  private static final PagedListDescriptor<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> LIST_FORWARDING_RULES_PAGE_STR_DESC =
      new PagedListDescriptor<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListForwardingRulesHttpRequest injectToken(ListForwardingRulesHttpRequest payload, String token) {
          return ListForwardingRulesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListForwardingRulesHttpRequest injectPageSize(ListForwardingRulesHttpRequest payload, int pageSize) {
          return ListForwardingRulesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListForwardingRulesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(ForwardingRuleList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<ForwardingRule> extractResources(ForwardingRuleList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, AggregatedListForwardingRulesPagedResponse> AGGREGATED_LIST_FORWARDING_RULES_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, AggregatedListForwardingRulesPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListForwardingRulesPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList> callable,
            AggregatedListForwardingRulesHttpRequest request,
            ApiCallContext context,
            ApiFuture<ForwardingRuleAggregatedList> futureResponse) {
          PageContext<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_FORWARDING_RULES_PAGE_STR_DESC, request, context);
          return AggregatedListForwardingRulesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListForwardingRulesHttpRequest, ForwardingRuleList, ListForwardingRulesPagedResponse> LIST_FORWARDING_RULES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListForwardingRulesHttpRequest, ForwardingRuleList, ListForwardingRulesPagedResponse>() {
        @Override
        public ApiFuture<ListForwardingRulesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListForwardingRulesHttpRequest, ForwardingRuleList> callable,
            ListForwardingRulesHttpRequest request,
            ApiCallContext context,
            ApiFuture<ForwardingRuleList> futureResponse) {
          PageContext<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> pageContext =
              PageContext.create(callable, LIST_FORWARDING_RULES_PAGE_STR_DESC, request, context);
          return ListForwardingRulesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for ForwardingRuleSettings.
   */
  public static class Builder extends ClientSettings.Builder<ForwardingRuleSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesSettings;
    private final UnaryCallSettings.Builder<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleSettings;
    private final UnaryCallSettings.Builder<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleSettings;
    private final UnaryCallSettings.Builder<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleSettings;
    private final PagedCallSettings.Builder<ListForwardingRulesHttpRequest, ForwardingRuleList, ListForwardingRulesPagedResponse> listForwardingRulesSettings;
    private final UnaryCallSettings.Builder<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleSettings;

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

      aggregatedListForwardingRulesSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_FORWARDING_RULES_PAGE_STR_FACT);

      deleteForwardingRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getForwardingRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertForwardingRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listForwardingRulesSettings = PagedCallSettings.newBuilder(
          LIST_FORWARDING_RULES_PAGE_STR_FACT);

      setTargetForwardingRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          aggregatedListForwardingRulesSettings,
          deleteForwardingRuleSettings,
          getForwardingRuleSettings,
          insertForwardingRuleSettings,
          listForwardingRulesSettings,
          setTargetForwardingRuleSettings
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

      builder.aggregatedListForwardingRulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteForwardingRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getForwardingRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertForwardingRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listForwardingRulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setTargetForwardingRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(ForwardingRuleSettings settings) {
      super(settings);

      aggregatedListForwardingRulesSettings = settings.aggregatedListForwardingRulesSettings.toBuilder();
      deleteForwardingRuleSettings = settings.deleteForwardingRuleSettings.toBuilder();
      getForwardingRuleSettings = settings.getForwardingRuleSettings.toBuilder();
      insertForwardingRuleSettings = settings.insertForwardingRuleSettings.toBuilder();
      listForwardingRulesSettings = settings.listForwardingRulesSettings.toBuilder();
      setTargetForwardingRuleSettings = settings.setTargetForwardingRuleSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          aggregatedListForwardingRulesSettings,
          deleteForwardingRuleSettings,
          getForwardingRuleSettings,
          insertForwardingRuleSettings,
          listForwardingRulesSettings,
          setTargetForwardingRuleSettings
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
     * Returns the builder for the settings used for calls to aggregatedListForwardingRules.
     */
    public PagedCallSettings.Builder<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, AggregatedListForwardingRulesPagedResponse> aggregatedListForwardingRulesSettings() {
      return aggregatedListForwardingRulesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteForwardingRule.
     */
    public UnaryCallSettings.Builder<DeleteForwardingRuleHttpRequest, Operation> deleteForwardingRuleSettings() {
      return deleteForwardingRuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getForwardingRule.
     */
    public UnaryCallSettings.Builder<GetForwardingRuleHttpRequest, ForwardingRule> getForwardingRuleSettings() {
      return getForwardingRuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertForwardingRule.
     */
    public UnaryCallSettings.Builder<InsertForwardingRuleHttpRequest, Operation> insertForwardingRuleSettings() {
      return insertForwardingRuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listForwardingRules.
     */
    public PagedCallSettings.Builder<ListForwardingRulesHttpRequest, ForwardingRuleList, ListForwardingRulesPagedResponse> listForwardingRulesSettings() {
      return listForwardingRulesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetForwardingRule.
     */
    public UnaryCallSettings.Builder<SetTargetForwardingRuleHttpRequest, Operation> setTargetForwardingRuleSettings() {
      return setTargetForwardingRuleSettings;
    }

    @Override
    public ForwardingRuleSettings build() throws IOException {
      return new ForwardingRuleSettings(this);
    }
  }
}