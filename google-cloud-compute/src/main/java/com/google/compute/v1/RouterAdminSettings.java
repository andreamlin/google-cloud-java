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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListRoutersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListRoutersPagedResponse;
import com.google.compute.v1.stub.HttpRouterAdminStub;
import com.google.compute.v1.stub.RouterAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RouterAdminClient}.
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
 * object. For example, to set the total timeout of deleteRouter to 30 seconds:
 *
 * <pre>
 * <code>
 * RouterAdminSettings.Builder routerAdminSettingsBuilder =
 *     RouterAdminSettings.defaultBuilder();
 * routerAdminSettingsBuilder.deleteRouterSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RouterAdminSettings routerAdminSettings = routerAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RouterAdminSettings extends ClientSettings {
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

  private final PagedCallSettings<AggregatedListRoutersHttpRequest, RouterAggregatedList, AggregatedListRoutersPagedResponse> aggregatedListRoutersSettings;
  private final SimpleCallSettings<DeleteRouterHttpRequest, Operation> deleteRouterSettings;
  private final SimpleCallSettings<GetRouterHttpRequest, Router> getRouterSettings;
  private final SimpleCallSettings<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterSettings;
  private final SimpleCallSettings<InsertRouterHttpRequest, Operation> insertRouterSettings;
  private final PagedCallSettings<ListRoutersHttpRequest, RouterList, ListRoutersPagedResponse> listRoutersSettings;
  private final SimpleCallSettings<PatchRouterHttpRequest, Operation> patchRouterSettings;
  private final SimpleCallSettings<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterSettings;
  private final SimpleCallSettings<UpdateRouterHttpRequest, Operation> updateRouterSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListRouters.
   */
  public PagedCallSettings<AggregatedListRoutersHttpRequest, RouterAggregatedList, AggregatedListRoutersPagedResponse> aggregatedListRoutersSettings() {
    return aggregatedListRoutersSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteRouter.
   */
  public SimpleCallSettings<DeleteRouterHttpRequest, Operation> deleteRouterSettings() {
    return deleteRouterSettings;
  }

  /**
   * Returns the object with the settings used for calls to getRouter.
   */
  public SimpleCallSettings<GetRouterHttpRequest, Router> getRouterSettings() {
    return getRouterSettings;
  }

  /**
   * Returns the object with the settings used for calls to getRouterStatusRouter.
   */
  public SimpleCallSettings<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterSettings() {
    return getRouterStatusRouterSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertRouter.
   */
  public SimpleCallSettings<InsertRouterHttpRequest, Operation> insertRouterSettings() {
    return insertRouterSettings;
  }

  /**
   * Returns the object with the settings used for calls to listRouters.
   */
  public PagedCallSettings<ListRoutersHttpRequest, RouterList, ListRoutersPagedResponse> listRoutersSettings() {
    return listRoutersSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchRouter.
   */
  public SimpleCallSettings<PatchRouterHttpRequest, Operation> patchRouterSettings() {
    return patchRouterSettings;
  }

  /**
   * Returns the object with the settings used for calls to previewRouter.
   */
  public SimpleCallSettings<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterSettings() {
    return previewRouterSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateRouter.
   */
  public SimpleCallSettings<UpdateRouterHttpRequest, Operation> updateRouterSettings() {
    return updateRouterSettings;
  }


  public RouterAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpRouterAdminStub.create(this);
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
          RouterAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private RouterAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    aggregatedListRoutersSettings = settingsBuilder.aggregatedListRoutersSettings().build();
    deleteRouterSettings = settingsBuilder.deleteRouterSettings().build();
    getRouterSettings = settingsBuilder.getRouterSettings().build();
    getRouterStatusRouterSettings = settingsBuilder.getRouterStatusRouterSettings().build();
    insertRouterSettings = settingsBuilder.insertRouterSettings().build();
    listRoutersSettings = settingsBuilder.listRoutersSettings().build();
    patchRouterSettings = settingsBuilder.patchRouterSettings().build();
    previewRouterSettings = settingsBuilder.previewRouterSettings().build();
    updateRouterSettings = settingsBuilder.updateRouterSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router> AGGREGATED_LIST_ROUTERS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListRoutersHttpRequest injectToken(AggregatedListRoutersHttpRequest payload, String token) {
          return AggregatedListRoutersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListRoutersHttpRequest injectPageSize(AggregatedListRoutersHttpRequest payload, int pageSize) {
          return AggregatedListRoutersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListRoutersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(RouterAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Router> extractResources(RouterAggregatedList payload) {
          return payload.getRouters();
        }
      };

  private static final PagedListDescriptor<ListRoutersHttpRequest, RouterList, Router> LIST_ROUTERS_PAGE_STR_DESC =
      new PagedListDescriptor<ListRoutersHttpRequest, RouterList, Router>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListRoutersHttpRequest injectToken(ListRoutersHttpRequest payload, String token) {
          return ListRoutersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListRoutersHttpRequest injectPageSize(ListRoutersHttpRequest payload, int pageSize) {
          return ListRoutersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListRoutersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(RouterList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Router> extractResources(RouterList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListRoutersHttpRequest, RouterAggregatedList, AggregatedListRoutersPagedResponse> AGGREGATED_LIST_ROUTERS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListRoutersHttpRequest, RouterAggregatedList, AggregatedListRoutersPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListRoutersPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListRoutersHttpRequest, RouterAggregatedList> callable,
            AggregatedListRoutersHttpRequest request,
            ApiCallContext context,
            ApiFuture<RouterAggregatedList> futureResponse) {
          PageContext<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_ROUTERS_PAGE_STR_DESC, request, context);
          return AggregatedListRoutersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListRoutersHttpRequest, RouterList, ListRoutersPagedResponse> LIST_ROUTERS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListRoutersHttpRequest, RouterList, ListRoutersPagedResponse>() {
        @Override
        public ApiFuture<ListRoutersPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListRoutersHttpRequest, RouterList> callable,
            ListRoutersHttpRequest request,
            ApiCallContext context,
            ApiFuture<RouterList> futureResponse) {
          PageContext<ListRoutersHttpRequest, RouterList, Router> pageContext =
              PageContext.create(callable, LIST_ROUTERS_PAGE_STR_DESC, request, context);
          return ListRoutersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for RouterAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListRoutersHttpRequest, RouterAggregatedList, AggregatedListRoutersPagedResponse> aggregatedListRoutersSettings;
    private final SimpleCallSettings.Builder<DeleteRouterHttpRequest, Operation> deleteRouterSettings;
    private final SimpleCallSettings.Builder<GetRouterHttpRequest, Router> getRouterSettings;
    private final SimpleCallSettings.Builder<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterSettings;
    private final SimpleCallSettings.Builder<InsertRouterHttpRequest, Operation> insertRouterSettings;
    private final PagedCallSettings.Builder<ListRoutersHttpRequest, RouterList, ListRoutersPagedResponse> listRoutersSettings;
    private final SimpleCallSettings.Builder<PatchRouterHttpRequest, Operation> patchRouterSettings;
    private final SimpleCallSettings.Builder<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterSettings;
    private final SimpleCallSettings.Builder<UpdateRouterHttpRequest, Operation> updateRouterSettings;

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

      aggregatedListRoutersSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_ROUTERS_PAGE_STR_FACT);

      deleteRouterSettings = SimpleCallSettings.newBuilder();

      getRouterSettings = SimpleCallSettings.newBuilder();

      getRouterStatusRouterSettings = SimpleCallSettings.newBuilder();

      insertRouterSettings = SimpleCallSettings.newBuilder();

      listRoutersSettings = PagedCallSettings.newBuilder(
          LIST_ROUTERS_PAGE_STR_FACT);

      patchRouterSettings = SimpleCallSettings.newBuilder();

      previewRouterSettings = SimpleCallSettings.newBuilder();

      updateRouterSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListRoutersSettings,
          deleteRouterSettings,
          getRouterSettings,
          getRouterStatusRouterSettings,
          insertRouterSettings,
          listRoutersSettings,
          patchRouterSettings,
          previewRouterSettings,
          updateRouterSettings
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

      builder.aggregatedListRoutersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getRouterStatusRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listRoutersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.previewRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateRouterSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(RouterAdminSettings settings) {
      super(settings);

      aggregatedListRoutersSettings = settings.aggregatedListRoutersSettings.toBuilder();
      deleteRouterSettings = settings.deleteRouterSettings.toBuilder();
      getRouterSettings = settings.getRouterSettings.toBuilder();
      getRouterStatusRouterSettings = settings.getRouterStatusRouterSettings.toBuilder();
      insertRouterSettings = settings.insertRouterSettings.toBuilder();
      listRoutersSettings = settings.listRoutersSettings.toBuilder();
      patchRouterSettings = settings.patchRouterSettings.toBuilder();
      previewRouterSettings = settings.previewRouterSettings.toBuilder();
      updateRouterSettings = settings.updateRouterSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListRoutersSettings,
          deleteRouterSettings,
          getRouterSettings,
          getRouterStatusRouterSettings,
          insertRouterSettings,
          listRoutersSettings,
          patchRouterSettings,
          previewRouterSettings,
          updateRouterSettings
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
     * Returns the builder for the settings used for calls to aggregatedListRouters.
     */
    public PagedCallSettings.Builder<AggregatedListRoutersHttpRequest, RouterAggregatedList, AggregatedListRoutersPagedResponse> aggregatedListRoutersSettings() {
      return aggregatedListRoutersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteRouter.
     */
    public SimpleCallSettings.Builder<DeleteRouterHttpRequest, Operation> deleteRouterSettings() {
      return deleteRouterSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getRouter.
     */
    public SimpleCallSettings.Builder<GetRouterHttpRequest, Router> getRouterSettings() {
      return getRouterSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getRouterStatusRouter.
     */
    public SimpleCallSettings.Builder<GetRouterStatusRouterHttpRequest, RouterStatusResponse> getRouterStatusRouterSettings() {
      return getRouterStatusRouterSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertRouter.
     */
    public SimpleCallSettings.Builder<InsertRouterHttpRequest, Operation> insertRouterSettings() {
      return insertRouterSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listRouters.
     */
    public PagedCallSettings.Builder<ListRoutersHttpRequest, RouterList, ListRoutersPagedResponse> listRoutersSettings() {
      return listRoutersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchRouter.
     */
    public SimpleCallSettings.Builder<PatchRouterHttpRequest, Operation> patchRouterSettings() {
      return patchRouterSettings;
    }

    /**
     * Returns the builder for the settings used for calls to previewRouter.
     */
    public SimpleCallSettings.Builder<PreviewRouterHttpRequest, RoutersPreviewResponse> previewRouterSettings() {
      return previewRouterSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateRouter.
     */
    public SimpleCallSettings.Builder<UpdateRouterHttpRequest, Operation> updateRouterSettings() {
      return updateRouterSettings;
    }

    @Override
    public RouterAdminSettings build() throws IOException {
      return new RouterAdminSettings(this);
    }
  }
}