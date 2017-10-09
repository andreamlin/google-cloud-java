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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAutoscalersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAutoscalersPagedResponse;
import com.google.compute.v1.stub.AutoscalerStub;
import com.google.compute.v1.stub.HttpJsonAutoscalerStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AutoscalerClient}.
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
 * object. For example, to set the total timeout of deleteAutoscaler to 30 seconds:
 *
 * <pre>
 * <code>
 * AutoscalerSettings.Builder autoscalerSettingsBuilder =
 *     AutoscalerSettings.newBuilder();
 * autoscalerSettingsBuilder.deleteAutoscalerSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * AutoscalerSettings autoscalerSettings = autoscalerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class AutoscalerSettings extends ClientSettings {
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

  private final PagedCallSettings<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, AggregatedListAutoscalersPagedResponse> aggregatedListAutoscalersSettings;
  private final SimpleCallSettings<DeleteAutoscalerHttpRequest, Operation> deleteAutoscalerSettings;
  private final SimpleCallSettings<GetAutoscalerHttpRequest, Autoscaler> getAutoscalerSettings;
  private final SimpleCallSettings<InsertAutoscalerHttpRequest, Operation> insertAutoscalerSettings;
  private final PagedCallSettings<ListAutoscalersHttpRequest, AutoscalerList, ListAutoscalersPagedResponse> listAutoscalersSettings;
  private final SimpleCallSettings<PatchAutoscalerHttpRequest, Operation> patchAutoscalerSettings;
  private final SimpleCallSettings<UpdateAutoscalerHttpRequest, Operation> updateAutoscalerSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListAutoscalers.
   */
  public PagedCallSettings<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, AggregatedListAutoscalersPagedResponse> aggregatedListAutoscalersSettings() {
    return aggregatedListAutoscalersSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteAutoscaler.
   */
  public SimpleCallSettings<DeleteAutoscalerHttpRequest, Operation> deleteAutoscalerSettings() {
    return deleteAutoscalerSettings;
  }

  /**
   * Returns the object with the settings used for calls to getAutoscaler.
   */
  public SimpleCallSettings<GetAutoscalerHttpRequest, Autoscaler> getAutoscalerSettings() {
    return getAutoscalerSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertAutoscaler.
   */
  public SimpleCallSettings<InsertAutoscalerHttpRequest, Operation> insertAutoscalerSettings() {
    return insertAutoscalerSettings;
  }

  /**
   * Returns the object with the settings used for calls to listAutoscalers.
   */
  public PagedCallSettings<ListAutoscalersHttpRequest, AutoscalerList, ListAutoscalersPagedResponse> listAutoscalersSettings() {
    return listAutoscalersSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchAutoscaler.
   */
  public SimpleCallSettings<PatchAutoscalerHttpRequest, Operation> patchAutoscalerSettings() {
    return patchAutoscalerSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateAutoscaler.
   */
  public SimpleCallSettings<UpdateAutoscalerHttpRequest, Operation> updateAutoscalerSettings() {
    return updateAutoscalerSettings;
  }


  public AutoscalerStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpJsonAutoscalerStub.create(this);
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
          AutoscalerSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /**
   * Returns a builder for this class with recommended defaults.
   */
  @Deprecated
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /**
   * Returns a builder for this class with recommended defaults for API methods, and the given
   * ClientContext used for executor/transport/credentials.
   */
  @Deprecated
  public static Builder defaultBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
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

  private AutoscalerSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    aggregatedListAutoscalersSettings = settingsBuilder.aggregatedListAutoscalersSettings().build();
    deleteAutoscalerSettings = settingsBuilder.deleteAutoscalerSettings().build();
    getAutoscalerSettings = settingsBuilder.getAutoscalerSettings().build();
    insertAutoscalerSettings = settingsBuilder.insertAutoscalerSettings().build();
    listAutoscalersSettings = settingsBuilder.listAutoscalersSettings().build();
    patchAutoscalerSettings = settingsBuilder.patchAutoscalerSettings().build();
    updateAutoscalerSettings = settingsBuilder.updateAutoscalerSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler> AGGREGATED_LIST_AUTOSCALERS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListAutoscalersHttpRequest injectToken(AggregatedListAutoscalersHttpRequest payload, String token) {
          return AggregatedListAutoscalersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListAutoscalersHttpRequest injectPageSize(AggregatedListAutoscalersHttpRequest payload, int pageSize) {
          return AggregatedListAutoscalersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListAutoscalersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(AutoscalerAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Autoscaler> extractResources(AutoscalerAggregatedList payload) {
          return payload.getItems().getAutoscalers();
        }
      };

  private static final PagedListDescriptor<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler> LIST_AUTOSCALERS_PAGE_STR_DESC =
      new PagedListDescriptor<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListAutoscalersHttpRequest injectToken(ListAutoscalersHttpRequest payload, String token) {
          return ListAutoscalersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListAutoscalersHttpRequest injectPageSize(ListAutoscalersHttpRequest payload, int pageSize) {
          return ListAutoscalersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListAutoscalersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(AutoscalerList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Autoscaler> extractResources(AutoscalerList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, AggregatedListAutoscalersPagedResponse> AGGREGATED_LIST_AUTOSCALERS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, AggregatedListAutoscalersPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListAutoscalersPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList> callable,
            AggregatedListAutoscalersHttpRequest request,
            ApiCallContext context,
            ApiFuture<AutoscalerAggregatedList> futureResponse) {
          PageContext<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_AUTOSCALERS_PAGE_STR_DESC, request, context);
          return AggregatedListAutoscalersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListAutoscalersHttpRequest, AutoscalerList, ListAutoscalersPagedResponse> LIST_AUTOSCALERS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListAutoscalersHttpRequest, AutoscalerList, ListAutoscalersPagedResponse>() {
        @Override
        public ApiFuture<ListAutoscalersPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListAutoscalersHttpRequest, AutoscalerList> callable,
            ListAutoscalersHttpRequest request,
            ApiCallContext context,
            ApiFuture<AutoscalerList> futureResponse) {
          PageContext<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler> pageContext =
              PageContext.create(callable, LIST_AUTOSCALERS_PAGE_STR_DESC, request, context);
          return ListAutoscalersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for AutoscalerSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, AggregatedListAutoscalersPagedResponse> aggregatedListAutoscalersSettings;
    private final SimpleCallSettings.Builder<DeleteAutoscalerHttpRequest, Operation> deleteAutoscalerSettings;
    private final SimpleCallSettings.Builder<GetAutoscalerHttpRequest, Autoscaler> getAutoscalerSettings;
    private final SimpleCallSettings.Builder<InsertAutoscalerHttpRequest, Operation> insertAutoscalerSettings;
    private final PagedCallSettings.Builder<ListAutoscalersHttpRequest, AutoscalerList, ListAutoscalersPagedResponse> listAutoscalersSettings;
    private final SimpleCallSettings.Builder<PatchAutoscalerHttpRequest, Operation> patchAutoscalerSettings;
    private final SimpleCallSettings.Builder<UpdateAutoscalerHttpRequest, Operation> updateAutoscalerSettings;

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

      aggregatedListAutoscalersSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_AUTOSCALERS_PAGE_STR_FACT);

      deleteAutoscalerSettings = SimpleCallSettings.newBuilder();

      getAutoscalerSettings = SimpleCallSettings.newBuilder();

      insertAutoscalerSettings = SimpleCallSettings.newBuilder();

      listAutoscalersSettings = PagedCallSettings.newBuilder(
          LIST_AUTOSCALERS_PAGE_STR_FACT);

      patchAutoscalerSettings = SimpleCallSettings.newBuilder();

      updateAutoscalerSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListAutoscalersSettings,
          deleteAutoscalerSettings,
          getAutoscalerSettings,
          insertAutoscalerSettings,
          listAutoscalersSettings,
          patchAutoscalerSettings,
          updateAutoscalerSettings
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

      builder.aggregatedListAutoscalersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteAutoscalerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getAutoscalerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertAutoscalerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listAutoscalersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchAutoscalerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateAutoscalerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(AutoscalerSettings settings) {
      super(settings);

      aggregatedListAutoscalersSettings = settings.aggregatedListAutoscalersSettings.toBuilder();
      deleteAutoscalerSettings = settings.deleteAutoscalerSettings.toBuilder();
      getAutoscalerSettings = settings.getAutoscalerSettings.toBuilder();
      insertAutoscalerSettings = settings.insertAutoscalerSettings.toBuilder();
      listAutoscalersSettings = settings.listAutoscalersSettings.toBuilder();
      patchAutoscalerSettings = settings.patchAutoscalerSettings.toBuilder();
      updateAutoscalerSettings = settings.updateAutoscalerSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListAutoscalersSettings,
          deleteAutoscalerSettings,
          getAutoscalerSettings,
          insertAutoscalerSettings,
          listAutoscalersSettings,
          patchAutoscalerSettings,
          updateAutoscalerSettings
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
     * Returns the builder for the settings used for calls to aggregatedListAutoscalers.
     */
    public PagedCallSettings.Builder<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, AggregatedListAutoscalersPagedResponse> aggregatedListAutoscalersSettings() {
      return aggregatedListAutoscalersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteAutoscaler.
     */
    public SimpleCallSettings.Builder<DeleteAutoscalerHttpRequest, Operation> deleteAutoscalerSettings() {
      return deleteAutoscalerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getAutoscaler.
     */
    public SimpleCallSettings.Builder<GetAutoscalerHttpRequest, Autoscaler> getAutoscalerSettings() {
      return getAutoscalerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertAutoscaler.
     */
    public SimpleCallSettings.Builder<InsertAutoscalerHttpRequest, Operation> insertAutoscalerSettings() {
      return insertAutoscalerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listAutoscalers.
     */
    public PagedCallSettings.Builder<ListAutoscalersHttpRequest, AutoscalerList, ListAutoscalersPagedResponse> listAutoscalersSettings() {
      return listAutoscalersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchAutoscaler.
     */
    public SimpleCallSettings.Builder<PatchAutoscalerHttpRequest, Operation> patchAutoscalerSettings() {
      return patchAutoscalerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateAutoscaler.
     */
    public SimpleCallSettings.Builder<UpdateAutoscalerHttpRequest, Operation> updateAutoscalerSettings() {
      return updateAutoscalerSettings;
    }

    @Override
    public AutoscalerSettings build() throws IOException {
      return new AutoscalerSettings(this);
    }
  }
}