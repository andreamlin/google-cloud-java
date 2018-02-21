/*
 * Copyright 2018 Google LLC
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
package com.google.compute.v1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
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
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.compute.v1.AggregatedListBackendServicesHttpRequest;
import com.google.compute.v1.BackendService;
import com.google.compute.v1.BackendServiceAggregatedList;
import static com.google.compute.v1.BackendServiceClient.AggregatedListBackendServicesPagedResponse;
import static com.google.compute.v1.BackendServiceClient.ListBackendServicesPagedResponse;
import com.google.compute.v1.BackendServiceGroupHealth;
import com.google.compute.v1.BackendServiceList;
import com.google.compute.v1.DeleteBackendServiceHttpRequest;
import com.google.compute.v1.GetBackendServiceHttpRequest;
import com.google.compute.v1.GetHealthBackendServiceHttpRequest;
import com.google.compute.v1.InsertBackendServiceHttpRequest;
import com.google.compute.v1.ListBackendServicesHttpRequest;
import com.google.compute.v1.Operation;
import com.google.compute.v1.PatchBackendServiceHttpRequest;
import com.google.compute.v1.UpdateBackendServiceHttpRequest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link BackendServiceStub}.
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
 * BackendServiceStubSettings.Builder backendServiceSettingsBuilder =
 *     BackendServiceStubSettings.newBuilder();
 * backendServiceSettingsBuilder.deleteBackendServiceSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * BackendServiceStubSettings backendServiceSettings = backendServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class BackendServiceStubSettings extends StubSettings<BackendServiceStubSettings> {
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

  private final PagedCallSettings<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings;
  private final UnaryCallSettings<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings;
  private final UnaryCallSettings<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings;
  private final UnaryCallSettings<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings;
  private final UnaryCallSettings<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings;
  private final PagedCallSettings<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> listBackendServicesSettings;
  private final UnaryCallSettings<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings;
  private final UnaryCallSettings<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListBackendServices.
   */
  public PagedCallSettings<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings() {
    return aggregatedListBackendServicesSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteBackendService.
   */
  public UnaryCallSettings<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings() {
    return deleteBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getBackendService.
   */
  public UnaryCallSettings<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings() {
    return getBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getHealthBackendService.
   */
  public UnaryCallSettings<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings() {
    return getHealthBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertBackendService.
   */
  public UnaryCallSettings<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings() {
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
  public UnaryCallSettings<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings() {
    return patchBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateBackendService.
   */
  public UnaryCallSettings<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings() {
    return updateBackendServiceSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BackendServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonBackendServiceStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(BackendServiceStubSettings.class))
        .setTransportToken(GaxHttpJsonProperties.getHttpJsonTokenName(), GaxHttpJsonProperties.getHttpJsonVersion());
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

  protected BackendServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

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
   * Builder for BackendServiceStubSettings.
   */
  public static class Builder extends StubSettings.Builder<BackendServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, AggregatedListBackendServicesPagedResponse> aggregatedListBackendServicesSettings;
    private final UnaryCallSettings.Builder<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings;
    private final UnaryCallSettings.Builder<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings;
    private final UnaryCallSettings.Builder<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings;
    private final UnaryCallSettings.Builder<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings;
    private final PagedCallSettings.Builder<ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse> listBackendServicesSettings;
    private final UnaryCallSettings.Builder<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings;
    private final UnaryCallSettings.Builder<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings;

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

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      aggregatedListBackendServicesSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_BACKEND_SERVICES_PAGE_STR_FACT);

      deleteBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getHealthBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listBackendServicesSettings = PagedCallSettings.newBuilder(
          LIST_BACKEND_SERVICES_PAGE_STR_FACT);

      patchBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
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
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
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

    protected Builder(BackendServiceStubSettings settings) {
      super(settings);

      aggregatedListBackendServicesSettings = settings.aggregatedListBackendServicesSettings.toBuilder();
      deleteBackendServiceSettings = settings.deleteBackendServiceSettings.toBuilder();
      getBackendServiceSettings = settings.getBackendServiceSettings.toBuilder();
      getHealthBackendServiceSettings = settings.getHealthBackendServiceSettings.toBuilder();
      insertBackendServiceSettings = settings.insertBackendServiceSettings.toBuilder();
      listBackendServicesSettings = settings.listBackendServicesSettings.toBuilder();
      patchBackendServiceSettings = settings.patchBackendServiceSettings.toBuilder();
      updateBackendServiceSettings = settings.updateBackendServiceSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
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

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
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
    public UnaryCallSettings.Builder<DeleteBackendServiceHttpRequest, Operation> deleteBackendServiceSettings() {
      return deleteBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getBackendService.
     */
    public UnaryCallSettings.Builder<GetBackendServiceHttpRequest, BackendService> getBackendServiceSettings() {
      return getBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getHealthBackendService.
     */
    public UnaryCallSettings.Builder<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthBackendServiceSettings() {
      return getHealthBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertBackendService.
     */
    public UnaryCallSettings.Builder<InsertBackendServiceHttpRequest, Operation> insertBackendServiceSettings() {
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
    public UnaryCallSettings.Builder<PatchBackendServiceHttpRequest, Operation> patchBackendServiceSettings() {
      return patchBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateBackendService.
     */
    public UnaryCallSettings.Builder<UpdateBackendServiceHttpRequest, Operation> updateBackendServiceSettings() {
      return updateBackendServiceSettings;
    }

    @Override
    public BackendServiceStubSettings build() throws IOException {
      return new BackendServiceStubSettings(this);
    }
  }
}