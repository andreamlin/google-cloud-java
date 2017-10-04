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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListBackendServicesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListBackendServicesPagedResponse;
import com.google.compute.v1.stub.BackendServiceAdminStub;
import com.google.compute.v1.stub.HttpJsonBackendServiceAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link BackendServiceAdminClient}.
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
 * object. For example, to set the total timeout of deleteBackendService to 30 seconds:
 *
 * <pre>
 * <code>
 * BackendServiceAdminSettings.Builder backendServiceAdminSettingsBuilder =
 *     BackendServiceAdminSettings.defaultBuilder();
 * backendServiceAdminSettingsBuilder.deleteBackendServiceSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * BackendServiceAdminSettings backendServiceAdminSettings = backendServiceAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class BackendServiceAdminSettings extends ClientSettings {
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

  private final PagedCallSettings<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings;
  private final SimpleCallSettings<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings;
  private final SimpleCallSettings<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings;
  private final SimpleCallSettings<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings;
  private final SimpleCallSettings<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings;
  private final PagedCallSettings<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> listBackendServicesSettings;
  private final SimpleCallSettings<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings;
  private final SimpleCallSettings<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListBackendServices.
   */
  public PagedCallSettings<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings() {
    return aggregatedListBackendServicesSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteBackendService.
   */
  public SimpleCallSettings<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings() {
    return deleteBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getBackendService.
   */
  public SimpleCallSettings<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings() {
    return getBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getHealthBackendService.
   */
  public SimpleCallSettings<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings() {
    return getHealthBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertBackendService.
   */
  public SimpleCallSettings<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings() {
    return insertBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to listBackendServices.
   */
  public PagedCallSettings<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> listBackendServicesSettings() {
    return listBackendServicesSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchBackendService.
   */
  public SimpleCallSettings<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings() {
    return patchBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateBackendService.
   */
  public SimpleCallSettings<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings() {
    return updateBackendServiceSettings;
  }


  public BackendServiceAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpJsonBackendServiceAdminStub.create(this);
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
          BackendServiceAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private BackendServiceAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    aggregatedListBackendServicesSettings = settingsBuilder.aggregatedListBackendServicesSettings().build();
    deleteBackendServiceSettings = settingsBuilder.deleteBackendServiceSettings().build();
    getBackendServiceSettings = settingsBuilder.getBackendServiceSettings().build();
    getHealthBackendServiceSettings = settingsBuilder.getHealthBackendServiceSettings().build();
    insertBackendServiceSettings = settingsBuilder.insertBackendServiceSettings().build();
    listBackendServicesSettings = settingsBuilder.listBackendServicesSettings().build();
    patchBackendServiceSettings = settingsBuilder.patchBackendServiceSettings().build();
    updateBackendServiceSettings = settingsBuilder.updateBackendServiceSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> AGGREGATED_LIST_BACKEND_SERVICES_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListBackendServicesHttpRequest injectToken(AggregatedListBackendServicesHttpRequest payload, String token) {
          return AggregatedListBackendServicesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListBackendServicesHttpRequest injectPageSize(AggregatedListBackendServicesHttpRequest payload, int pageSize) {
          return AggregatedListBackendServicesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListBackendServicesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(BackendServiceAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<BackendService> extractResources(BackendServiceAggregatedList payload) {
          return payload.getItems().getBackendServices();
        }
      };

  private static final PagedListDescriptor<ListBackendServicesHttpRequest, BackendServiceList, BackendService> LIST_BACKEND_SERVICES_PAGE_STR_DESC =
      new PagedListDescriptor<ListBackendServicesHttpRequest, BackendServiceList, BackendService>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListBackendServicesHttpRequest injectToken(ListBackendServicesHttpRequest payload, String token) {
          return ListBackendServicesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListBackendServicesHttpRequest injectPageSize(ListBackendServicesHttpRequest payload, int pageSize) {
          return ListBackendServicesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListBackendServicesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(BackendServiceList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<BackendService> extractResources(BackendServiceList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> AGGREGATED_LIST_BACKEND_SERVICES_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListBackendServicesPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList> callable,
            AggregatedListBackendServicesHttpRequest request,
            ApiCallContext context,
            ApiFuture<BackendServiceAggregatedList> futureResponse) {
          PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_BACKEND_SERVICES_PAGE_STR_DESC, request, context);
          return AggregatedListBackendServicesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> LIST_BACKEND_SERVICES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse>() {
        @Override
        public ApiFuture<ListBackendServicesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListBackendServicesHttpRequest, BackendServiceList> callable,
            ListBackendServicesHttpRequest request,
            ApiCallContext context,
            ApiFuture<BackendServiceList> futureResponse) {
          PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> pageContext =
              PageContext.create(callable, LIST_BACKEND_SERVICES_PAGE_STR_DESC, request, context);
          return ListBackendServicesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for BackendServiceAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings;
    private final SimpleCallSettings.Builder<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings;
    private final SimpleCallSettings.Builder<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings;
    private final SimpleCallSettings.Builder<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings;
    private final SimpleCallSettings.Builder<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings;
    private final PagedCallSettings.Builder<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> listBackendServicesSettings;
    private final SimpleCallSettings.Builder<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings;
    private final SimpleCallSettings.Builder<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings;

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

      aggregatedListBackendServicesSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_BACKEND_SERVICES_PAGE_STR_FACT);

      deleteBackendServiceSettings = SimpleCallSettings.newBuilder();

      getBackendServiceSettings = SimpleCallSettings.newBuilder();

      getHealthBackendServiceSettings = SimpleCallSettings.newBuilder();

      insertBackendServiceSettings = SimpleCallSettings.newBuilder();

      listBackendServicesSettings = PagedCallSettings.newBuilder(
          LIST_BACKEND_SERVICES_PAGE_STR_FACT);

      patchBackendServiceSettings = SimpleCallSettings.newBuilder();

      updateBackendServiceSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListBackendServicesSettings,
          deleteBackendServiceSettings,
          getBackendServiceSettings,
          getHealthBackendServiceSettings,
          insertBackendServiceSettings,
          listBackendServicesSettings,
          patchBackendServiceSettings,
          updateBackendServiceSettings
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

      builder.aggregatedListBackendServicesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getHealthBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listBackendServicesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(BackendServiceAdminSettings settings) {
      super(settings);

      aggregatedListBackendServicesSettings = settings.aggregatedListBackendServicesSettings.toBuilder();
      deleteBackendServiceSettings = settings.deleteBackendServiceSettings.toBuilder();
      getBackendServiceSettings = settings.getBackendServiceSettings.toBuilder();
      getHealthBackendServiceSettings = settings.getHealthBackendServiceSettings.toBuilder();
      insertBackendServiceSettings = settings.insertBackendServiceSettings.toBuilder();
      listBackendServicesSettings = settings.listBackendServicesSettings.toBuilder();
      patchBackendServiceSettings = settings.patchBackendServiceSettings.toBuilder();
      updateBackendServiceSettings = settings.updateBackendServiceSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListBackendServicesSettings,
          deleteBackendServiceSettings,
          getBackendServiceSettings,
          getHealthBackendServiceSettings,
          insertBackendServiceSettings,
          listBackendServicesSettings,
          patchBackendServiceSettings,
          updateBackendServiceSettings
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
     * Returns the builder for the settings used for calls to aggregatedListBackendServices.
     */
    public PagedCallSettings.Builder<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings() {
      return aggregatedListBackendServicesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteBackendService.
     */
    public SimpleCallSettings.Builder<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings() {
      return deleteBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getBackendService.
     */
    public SimpleCallSettings.Builder<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings() {
      return getBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getHealthBackendService.
     */
    public SimpleCallSettings.Builder<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings() {
      return getHealthBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertBackendService.
     */
    public SimpleCallSettings.Builder<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings() {
      return insertBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listBackendServices.
     */
    public PagedCallSettings.Builder<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> listBackendServicesSettings() {
      return listBackendServicesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchBackendService.
     */
    public SimpleCallSettings.Builder<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings() {
      return patchBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateBackendService.
     */
    public SimpleCallSettings.Builder<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings() {
      return updateBackendServiceSettings;
    }

    @Override
    public BackendServiceAdminSettings build() throws IOException {
      return new BackendServiceAdminSettings(this);
    }
  }
}