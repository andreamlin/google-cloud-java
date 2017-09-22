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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionBackendServicesPagedResponse;
import com.google.compute.v1.stub.HttpRegionBackendServiceAdminStub;
import com.google.compute.v1.stub.RegionBackendServiceAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionBackendServiceAdminClient}.
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
 * object. For example, to set the total timeout of deleteRegionBackendService to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionBackendServiceAdminSettings.Builder regionBackendServiceAdminSettingsBuilder =
 *     RegionBackendServiceAdminSettings.defaultBuilder();
 * regionBackendServiceAdminSettingsBuilder.deleteRegionBackendServiceSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RegionBackendServiceAdminSettings regionBackendServiceAdminSettings = regionBackendServiceAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionBackendServiceAdminSettings extends ClientSettings {
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

  private final SimpleCallSettings<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceSettings;
  private final SimpleCallSettings<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceSettings;
  private final SimpleCallSettings<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceSettings;
  private final SimpleCallSettings<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceSettings;
  private final PagedCallSettings<ListRegionBackendServicesHttpRequest, BackendServiceList, ListRegionBackendServicesPagedResponse> listRegionBackendServicesSettings;
  private final SimpleCallSettings<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceSettings;
  private final SimpleCallSettings<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceSettings;

  /**
   * Returns the object with the settings used for calls to deleteRegionBackendService.
   */
  public SimpleCallSettings<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceSettings() {
    return deleteRegionBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getRegionBackendService.
   */
  public SimpleCallSettings<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceSettings() {
    return getRegionBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getHealthRegionBackendService.
   */
  public SimpleCallSettings<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceSettings() {
    return getHealthRegionBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertRegionBackendService.
   */
  public SimpleCallSettings<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceSettings() {
    return insertRegionBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to listRegionBackendServices.
   */
  public PagedCallSettings<ListRegionBackendServicesHttpRequest, BackendServiceList, ListRegionBackendServicesPagedResponse> listRegionBackendServicesSettings() {
    return listRegionBackendServicesSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchRegionBackendService.
   */
  public SimpleCallSettings<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceSettings() {
    return patchRegionBackendServiceSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateRegionBackendService.
   */
  public SimpleCallSettings<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceSettings() {
    return updateRegionBackendServiceSettings;
  }


  public RegionBackendServiceAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpRegionBackendServiceAdminStub.create(this);
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
          RegionBackendServiceAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private RegionBackendServiceAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    deleteRegionBackendServiceSettings = settingsBuilder.deleteRegionBackendServiceSettings().build();
    getRegionBackendServiceSettings = settingsBuilder.getRegionBackendServiceSettings().build();
    getHealthRegionBackendServiceSettings = settingsBuilder.getHealthRegionBackendServiceSettings().build();
    insertRegionBackendServiceSettings = settingsBuilder.insertRegionBackendServiceSettings().build();
    listRegionBackendServicesSettings = settingsBuilder.listRegionBackendServicesSettings().build();
    patchRegionBackendServiceSettings = settingsBuilder.patchRegionBackendServiceSettings().build();
    updateRegionBackendServiceSettings = settingsBuilder.updateRegionBackendServiceSettings().build();
  }

  private static final PagedListDescriptor<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService> LIST_REGION_BACKEND_SERVICES_PAGE_STR_DESC =
      new PagedListDescriptor<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListRegionBackendServicesHttpRequest injectToken(ListRegionBackendServicesHttpRequest payload, String token) {
          return ListRegionBackendServicesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListRegionBackendServicesHttpRequest injectPageSize(ListRegionBackendServicesHttpRequest payload, int pageSize) {
          return ListRegionBackendServicesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListRegionBackendServicesHttpRequest payload) {
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

  private static final PagedListResponseFactory<ListRegionBackendServicesHttpRequest, BackendServiceList, ListRegionBackendServicesPagedResponse> LIST_REGION_BACKEND_SERVICES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListRegionBackendServicesHttpRequest, BackendServiceList, ListRegionBackendServicesPagedResponse>() {
        @Override
        public ApiFuture<ListRegionBackendServicesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListRegionBackendServicesHttpRequest, BackendServiceList> callable,
            ListRegionBackendServicesHttpRequest request,
            ApiCallContext context,
            ApiFuture<BackendServiceList> futureResponse) {
          PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService> pageContext =
              PageContext.create(callable, LIST_REGION_BACKEND_SERVICES_PAGE_STR_DESC, request, context);
          return ListRegionBackendServicesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for RegionBackendServiceAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceSettings;
    private final SimpleCallSettings.Builder<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceSettings;
    private final SimpleCallSettings.Builder<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceSettings;
    private final SimpleCallSettings.Builder<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceSettings;
    private final PagedCallSettings.Builder<ListRegionBackendServicesHttpRequest, BackendServiceList, ListRegionBackendServicesPagedResponse> listRegionBackendServicesSettings;
    private final SimpleCallSettings.Builder<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceSettings;
    private final SimpleCallSettings.Builder<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceSettings;

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

      deleteRegionBackendServiceSettings = SimpleCallSettings.newBuilder();

      getRegionBackendServiceSettings = SimpleCallSettings.newBuilder();

      getHealthRegionBackendServiceSettings = SimpleCallSettings.newBuilder();

      insertRegionBackendServiceSettings = SimpleCallSettings.newBuilder();

      listRegionBackendServicesSettings = PagedCallSettings.newBuilder(
          LIST_REGION_BACKEND_SERVICES_PAGE_STR_FACT);

      patchRegionBackendServiceSettings = SimpleCallSettings.newBuilder();

      updateRegionBackendServiceSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          deleteRegionBackendServiceSettings,
          getRegionBackendServiceSettings,
          getHealthRegionBackendServiceSettings,
          insertRegionBackendServiceSettings,
          listRegionBackendServicesSettings,
          patchRegionBackendServiceSettings,
          updateRegionBackendServiceSettings
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

      builder.deleteRegionBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getRegionBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getHealthRegionBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertRegionBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listRegionBackendServicesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchRegionBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateRegionBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(RegionBackendServiceAdminSettings settings) {
      super(settings);

      deleteRegionBackendServiceSettings = settings.deleteRegionBackendServiceSettings.toBuilder();
      getRegionBackendServiceSettings = settings.getRegionBackendServiceSettings.toBuilder();
      getHealthRegionBackendServiceSettings = settings.getHealthRegionBackendServiceSettings.toBuilder();
      insertRegionBackendServiceSettings = settings.insertRegionBackendServiceSettings.toBuilder();
      listRegionBackendServicesSettings = settings.listRegionBackendServicesSettings.toBuilder();
      patchRegionBackendServiceSettings = settings.patchRegionBackendServiceSettings.toBuilder();
      updateRegionBackendServiceSettings = settings.updateRegionBackendServiceSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          deleteRegionBackendServiceSettings,
          getRegionBackendServiceSettings,
          getHealthRegionBackendServiceSettings,
          insertRegionBackendServiceSettings,
          listRegionBackendServicesSettings,
          patchRegionBackendServiceSettings,
          updateRegionBackendServiceSettings
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
     * Returns the builder for the settings used for calls to deleteRegionBackendService.
     */
    public SimpleCallSettings.Builder<DeleteRegionBackendServiceHttpRequest, Operation> deleteRegionBackendServiceSettings() {
      return deleteRegionBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getRegionBackendService.
     */
    public SimpleCallSettings.Builder<GetRegionBackendServiceHttpRequest, BackendService> getRegionBackendServiceSettings() {
      return getRegionBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getHealthRegionBackendService.
     */
    public SimpleCallSettings.Builder<GetHealthRegionBackendServiceHttpRequest, BackendServiceGroupHealth> getHealthRegionBackendServiceSettings() {
      return getHealthRegionBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertRegionBackendService.
     */
    public SimpleCallSettings.Builder<InsertRegionBackendServiceHttpRequest, Operation> insertRegionBackendServiceSettings() {
      return insertRegionBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listRegionBackendServices.
     */
    public PagedCallSettings.Builder<ListRegionBackendServicesHttpRequest, BackendServiceList, ListRegionBackendServicesPagedResponse> listRegionBackendServicesSettings() {
      return listRegionBackendServicesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchRegionBackendService.
     */
    public SimpleCallSettings.Builder<PatchRegionBackendServiceHttpRequest, Operation> patchRegionBackendServiceSettings() {
      return patchRegionBackendServiceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateRegionBackendService.
     */
    public SimpleCallSettings.Builder<UpdateRegionBackendServiceHttpRequest, Operation> updateRegionBackendServiceSettings() {
      return updateRegionBackendServiceSettings;
    }

    @Override
    public RegionBackendServiceAdminSettings build() throws IOException {
      return new RegionBackendServiceAdminSettings(this);
    }
  }
}