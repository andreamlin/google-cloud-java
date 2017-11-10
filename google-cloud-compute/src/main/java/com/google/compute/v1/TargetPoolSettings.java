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
import com.google.api.gax.core.ChannelProvider;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListTargetPoolsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListTargetPoolsPagedResponse;
import com.google.compute.v1.stub.HttpJsonTargetPoolStub;
import com.google.compute.v1.stub.TargetPoolStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetPoolClient}.
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
 * object. For example, to set the total timeout of addHealthCheckTargetPool to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetPoolSettings.Builder targetPoolSettingsBuilder =
 *     TargetPoolSettings.newBuilder();
 * targetPoolSettingsBuilder.addHealthCheckTargetPoolSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetPoolSettings targetPoolSettings = targetPoolSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetPoolSettings extends ClientSettings<TargetPoolSettings> {
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

  private final UnaryCallSettings<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolSettings;
  private final UnaryCallSettings<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolSettings;
  private final PagedCallSettings<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsSettings;
  private final UnaryCallSettings<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolSettings;
  private final UnaryCallSettings<GetTargetPoolHttpRequest, TargetPool> getTargetPoolSettings;
  private final UnaryCallSettings<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolSettings;
  private final UnaryCallSettings<InsertTargetPoolHttpRequest, Operation> insertTargetPoolSettings;
  private final PagedCallSettings<ListTargetPoolsHttpRequest, TargetPoolList, ListTargetPoolsPagedResponse> listTargetPoolsSettings;
  private final UnaryCallSettings<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolSettings;
  private final UnaryCallSettings<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolSettings;
  private final UnaryCallSettings<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolSettings;

  /**
   * Returns the object with the settings used for calls to addHealthCheckTargetPool.
   */
  public UnaryCallSettings<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolSettings() {
    return addHealthCheckTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to addInstanceTargetPool.
   */
  public UnaryCallSettings<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolSettings() {
    return addInstanceTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to aggregatedListTargetPools.
   */
  public PagedCallSettings<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsSettings() {
    return aggregatedListTargetPoolsSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteTargetPool.
   */
  public UnaryCallSettings<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolSettings() {
    return deleteTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to getTargetPool.
   */
  public UnaryCallSettings<GetTargetPoolHttpRequest, TargetPool> getTargetPoolSettings() {
    return getTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to getHealthTargetPool.
   */
  public UnaryCallSettings<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolSettings() {
    return getHealthTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertTargetPool.
   */
  public UnaryCallSettings<InsertTargetPoolHttpRequest, Operation> insertTargetPoolSettings() {
    return insertTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to listTargetPools.
   */
  public PagedCallSettings<ListTargetPoolsHttpRequest, TargetPoolList, ListTargetPoolsPagedResponse> listTargetPoolsSettings() {
    return listTargetPoolsSettings;
  }

  /**
   * Returns the object with the settings used for calls to removeHealthCheckTargetPool.
   */
  public UnaryCallSettings<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolSettings() {
    return removeHealthCheckTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to removeInstanceTargetPool.
   */
  public UnaryCallSettings<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolSettings() {
    return removeInstanceTargetPoolSettings;
  }

  /**
   * Returns the object with the settings used for calls to setBackupTargetPool.
   */
  public UnaryCallSettings<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolSettings() {
    return setBackupTargetPoolSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetPoolStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetPoolStub.create(this);
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
        .addApiClientHeaderLineData(GrpcExtraHeaderData.getXGoogApiClientData());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion = PropertiesProvider.loadProperty(
          TargetPoolSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private TargetPoolSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addHealthCheckTargetPoolSettings = settingsBuilder.addHealthCheckTargetPoolSettings().build();
    addInstanceTargetPoolSettings = settingsBuilder.addInstanceTargetPoolSettings().build();
    aggregatedListTargetPoolsSettings = settingsBuilder.aggregatedListTargetPoolsSettings().build();
    deleteTargetPoolSettings = settingsBuilder.deleteTargetPoolSettings().build();
    getTargetPoolSettings = settingsBuilder.getTargetPoolSettings().build();
    getHealthTargetPoolSettings = settingsBuilder.getHealthTargetPoolSettings().build();
    insertTargetPoolSettings = settingsBuilder.insertTargetPoolSettings().build();
    listTargetPoolsSettings = settingsBuilder.listTargetPoolsSettings().build();
    removeHealthCheckTargetPoolSettings = settingsBuilder.removeHealthCheckTargetPoolSettings().build();
    removeInstanceTargetPoolSettings = settingsBuilder.removeInstanceTargetPoolSettings().build();
    setBackupTargetPoolSettings = settingsBuilder.setBackupTargetPoolSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool> AGGREGATED_LIST_TARGET_POOLS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListTargetPoolsHttpRequest injectToken(AggregatedListTargetPoolsHttpRequest payload, String token) {
          return AggregatedListTargetPoolsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListTargetPoolsHttpRequest injectPageSize(AggregatedListTargetPoolsHttpRequest payload, int pageSize) {
          return AggregatedListTargetPoolsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListTargetPoolsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(TargetPoolAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<TargetPool> extractResources(TargetPoolAggregatedList payload) {
          return payload.getItems().getTargetPools();
        }
      };

  private static final PagedListDescriptor<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool> LIST_TARGET_POOLS_PAGE_STR_DESC =
      new PagedListDescriptor<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListTargetPoolsHttpRequest injectToken(ListTargetPoolsHttpRequest payload, String token) {
          return ListTargetPoolsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListTargetPoolsHttpRequest injectPageSize(ListTargetPoolsHttpRequest payload, int pageSize) {
          return ListTargetPoolsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListTargetPoolsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(TargetPoolList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<TargetPool> extractResources(TargetPoolList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, AggregatedListTargetPoolsPagedResponse> AGGREGATED_LIST_TARGET_POOLS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, AggregatedListTargetPoolsPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListTargetPoolsPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList> callable,
            AggregatedListTargetPoolsHttpRequest request,
            ApiCallContext context,
            ApiFuture<TargetPoolAggregatedList> futureResponse) {
          PageContext<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_TARGET_POOLS_PAGE_STR_DESC, request, context);
          return AggregatedListTargetPoolsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListTargetPoolsHttpRequest, TargetPoolList, ListTargetPoolsPagedResponse> LIST_TARGET_POOLS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListTargetPoolsHttpRequest, TargetPoolList, ListTargetPoolsPagedResponse>() {
        @Override
        public ApiFuture<ListTargetPoolsPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListTargetPoolsHttpRequest, TargetPoolList> callable,
            ListTargetPoolsHttpRequest request,
            ApiCallContext context,
            ApiFuture<TargetPoolList> futureResponse) {
          PageContext<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool> pageContext =
              PageContext.create(callable, LIST_TARGET_POOLS_PAGE_STR_DESC, request, context);
          return ListTargetPoolsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for TargetPoolSettings.
   */
  public static class Builder extends ClientSettings.Builder<TargetPoolSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolSettings;
    private final UnaryCallSettings.Builder<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolSettings;
    private final PagedCallSettings.Builder<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsSettings;
    private final UnaryCallSettings.Builder<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolSettings;
    private final UnaryCallSettings.Builder<GetTargetPoolHttpRequest, TargetPool> getTargetPoolSettings;
    private final UnaryCallSettings.Builder<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolSettings;
    private final UnaryCallSettings.Builder<InsertTargetPoolHttpRequest, Operation> insertTargetPoolSettings;
    private final PagedCallSettings.Builder<ListTargetPoolsHttpRequest, TargetPoolList, ListTargetPoolsPagedResponse> listTargetPoolsSettings;
    private final UnaryCallSettings.Builder<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolSettings;
    private final UnaryCallSettings.Builder<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolSettings;
    private final UnaryCallSettings.Builder<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolSettings;

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

      addHealthCheckTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      addInstanceTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      aggregatedListTargetPoolsSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_TARGET_POOLS_PAGE_STR_FACT);

      deleteTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getHealthTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listTargetPoolsSettings = PagedCallSettings.newBuilder(
          LIST_TARGET_POOLS_PAGE_STR_FACT);

      removeHealthCheckTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      removeInstanceTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setBackupTargetPoolSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          addHealthCheckTargetPoolSettings,
          addInstanceTargetPoolSettings,
          aggregatedListTargetPoolsSettings,
          deleteTargetPoolSettings,
          getTargetPoolSettings,
          getHealthTargetPoolSettings,
          insertTargetPoolSettings,
          listTargetPoolsSettings,
          removeHealthCheckTargetPoolSettings,
          removeInstanceTargetPoolSettings,
          setBackupTargetPoolSettings
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

      builder.addHealthCheckTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.addInstanceTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.aggregatedListTargetPoolsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getHealthTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listTargetPoolsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.removeHealthCheckTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.removeInstanceTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setBackupTargetPoolSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(TargetPoolSettings settings) {
      super(settings);

      addHealthCheckTargetPoolSettings = settings.addHealthCheckTargetPoolSettings.toBuilder();
      addInstanceTargetPoolSettings = settings.addInstanceTargetPoolSettings.toBuilder();
      aggregatedListTargetPoolsSettings = settings.aggregatedListTargetPoolsSettings.toBuilder();
      deleteTargetPoolSettings = settings.deleteTargetPoolSettings.toBuilder();
      getTargetPoolSettings = settings.getTargetPoolSettings.toBuilder();
      getHealthTargetPoolSettings = settings.getHealthTargetPoolSettings.toBuilder();
      insertTargetPoolSettings = settings.insertTargetPoolSettings.toBuilder();
      listTargetPoolsSettings = settings.listTargetPoolsSettings.toBuilder();
      removeHealthCheckTargetPoolSettings = settings.removeHealthCheckTargetPoolSettings.toBuilder();
      removeInstanceTargetPoolSettings = settings.removeInstanceTargetPoolSettings.toBuilder();
      setBackupTargetPoolSettings = settings.setBackupTargetPoolSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          addHealthCheckTargetPoolSettings,
          addInstanceTargetPoolSettings,
          aggregatedListTargetPoolsSettings,
          deleteTargetPoolSettings,
          getTargetPoolSettings,
          getHealthTargetPoolSettings,
          insertTargetPoolSettings,
          listTargetPoolsSettings,
          removeHealthCheckTargetPoolSettings,
          removeInstanceTargetPoolSettings,
          setBackupTargetPoolSettings
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
     * Returns the builder for the settings used for calls to addHealthCheckTargetPool.
     */
    public UnaryCallSettings.Builder<AddHealthCheckTargetPoolHttpRequest, Operation> addHealthCheckTargetPoolSettings() {
      return addHealthCheckTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to addInstanceTargetPool.
     */
    public UnaryCallSettings.Builder<AddInstanceTargetPoolHttpRequest, Operation> addInstanceTargetPoolSettings() {
      return addInstanceTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListTargetPools.
     */
    public PagedCallSettings.Builder<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, AggregatedListTargetPoolsPagedResponse> aggregatedListTargetPoolsSettings() {
      return aggregatedListTargetPoolsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteTargetPool.
     */
    public UnaryCallSettings.Builder<DeleteTargetPoolHttpRequest, Operation> deleteTargetPoolSettings() {
      return deleteTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getTargetPool.
     */
    public UnaryCallSettings.Builder<GetTargetPoolHttpRequest, TargetPool> getTargetPoolSettings() {
      return getTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getHealthTargetPool.
     */
    public UnaryCallSettings.Builder<GetHealthTargetPoolHttpRequest, TargetPoolInstanceHealth> getHealthTargetPoolSettings() {
      return getHealthTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertTargetPool.
     */
    public UnaryCallSettings.Builder<InsertTargetPoolHttpRequest, Operation> insertTargetPoolSettings() {
      return insertTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listTargetPools.
     */
    public PagedCallSettings.Builder<ListTargetPoolsHttpRequest, TargetPoolList, ListTargetPoolsPagedResponse> listTargetPoolsSettings() {
      return listTargetPoolsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to removeHealthCheckTargetPool.
     */
    public UnaryCallSettings.Builder<RemoveHealthCheckTargetPoolHttpRequest, Operation> removeHealthCheckTargetPoolSettings() {
      return removeHealthCheckTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to removeInstanceTargetPool.
     */
    public UnaryCallSettings.Builder<RemoveInstanceTargetPoolHttpRequest, Operation> removeInstanceTargetPoolSettings() {
      return removeInstanceTargetPoolSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setBackupTargetPool.
     */
    public UnaryCallSettings.Builder<SetBackupTargetPoolHttpRequest, Operation> setBackupTargetPoolSettings() {
      return setBackupTargetPoolSettings;
    }

    @Override
    public TargetPoolSettings build() throws IOException {
      return new TargetPoolSettings(this);
    }
  }
}