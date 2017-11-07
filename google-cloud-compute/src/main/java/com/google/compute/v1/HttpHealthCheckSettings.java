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
import com.google.api.gax.grpc.GrpcExtraHeaderData;
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
import static com.google.compute.v1.PagedResponseWrappers.ListHttpHealthChecksPagedResponse;
import com.google.compute.v1.stub.HttpHealthCheckStub;
import com.google.compute.v1.stub.HttpJsonHttpHealthCheckStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link HttpHealthCheckClient}.
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
 * object. For example, to set the total timeout of deleteHttpHealthCheck to 30 seconds:
 *
 * <pre>
 * <code>
 * HttpHealthCheckSettings.Builder httpHealthCheckSettingsBuilder =
 *     HttpHealthCheckSettings.newBuilder();
 * httpHealthCheckSettingsBuilder.deleteHttpHealthCheckSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * HttpHealthCheckSettings httpHealthCheckSettings = httpHealthCheckSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HttpHealthCheckSettings extends ClientSettings {
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

  private final UnaryCallSettings<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckSettings;
  private final UnaryCallSettings<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckSettings;
  private final UnaryCallSettings<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckSettings;
  private final PagedCallSettings<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse> listHttpHealthChecksSettings;
  private final UnaryCallSettings<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckSettings;
  private final UnaryCallSettings<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckSettings;

  /**
   * Returns the object with the settings used for calls to deleteHttpHealthCheck.
   */
  public UnaryCallSettings<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckSettings() {
    return deleteHttpHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to getHttpHealthCheck.
   */
  public UnaryCallSettings<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckSettings() {
    return getHttpHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertHttpHealthCheck.
   */
  public UnaryCallSettings<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckSettings() {
    return insertHttpHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to listHttpHealthChecks.
   */
  public PagedCallSettings<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse> listHttpHealthChecksSettings() {
    return listHttpHealthChecksSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchHttpHealthCheck.
   */
  public UnaryCallSettings<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckSettings() {
    return patchHttpHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateHttpHealthCheck.
   */
  public UnaryCallSettings<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckSettings() {
    return updateHttpHealthCheckSettings;
  }


  public HttpHealthCheckStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonHttpHealthCheckStub.create(this);
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
    return InstantiatingHttpJsonChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint());
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        .setApiClientHeaderLineKey("x-goog-api-client")
        .addApiClientHeaderLineData(GrpcExtraHeaderData.getXGoogApiClientData());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion = PropertiesProvider.loadProperty(
          HttpHealthCheckSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private HttpHealthCheckSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportChannelProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getHeaderProvider(),
        settingsBuilder.getClock());

    deleteHttpHealthCheckSettings = settingsBuilder.deleteHttpHealthCheckSettings().build();
    getHttpHealthCheckSettings = settingsBuilder.getHttpHealthCheckSettings().build();
    insertHttpHealthCheckSettings = settingsBuilder.insertHttpHealthCheckSettings().build();
    listHttpHealthChecksSettings = settingsBuilder.listHttpHealthChecksSettings().build();
    patchHttpHealthCheckSettings = settingsBuilder.patchHttpHealthCheckSettings().build();
    updateHttpHealthCheckSettings = settingsBuilder.updateHttpHealthCheckSettings().build();
  }

  private static final PagedListDescriptor<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck> LIST_HTTP_HEALTH_CHECKS_PAGE_STR_DESC =
      new PagedListDescriptor<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListHttpHealthChecksHttpRequest injectToken(ListHttpHealthChecksHttpRequest payload, String token) {
          return ListHttpHealthChecksHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListHttpHealthChecksHttpRequest injectPageSize(ListHttpHealthChecksHttpRequest payload, int pageSize) {
          return ListHttpHealthChecksHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListHttpHealthChecksHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(HttpHealthCheckList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<HttpHealthCheck> extractResources(HttpHealthCheckList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse> LIST_HTTP_HEALTH_CHECKS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse>() {
        @Override
        public ApiFuture<ListHttpHealthChecksPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> callable,
            ListHttpHealthChecksHttpRequest request,
            ApiCallContext context,
            ApiFuture<HttpHealthCheckList> futureResponse) {
          PageContext<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck> pageContext =
              PageContext.create(callable, LIST_HTTP_HEALTH_CHECKS_PAGE_STR_DESC, request, context);
          return ListHttpHealthChecksPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for HttpHealthCheckSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder deleteHttpHealthCheckSettings;
    private final UnaryCallSettings.Builder getHttpHealthCheckSettings;
    private final UnaryCallSettings.Builder insertHttpHealthCheckSettings;
    private final PagedCallSettings.Builder<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse> listHttpHealthChecksSettings;
    private final UnaryCallSettings.Builder patchHttpHealthCheckSettings;
    private final UnaryCallSettings.Builder updateHttpHealthCheckSettings;

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

      deleteHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listHttpHealthChecksSettings = PagedCallSettings.newBuilder(
          LIST_HTTP_HEALTH_CHECKS_PAGE_STR_FACT);

      patchHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteHttpHealthCheckSettings,
          getHttpHealthCheckSettings,
          insertHttpHealthCheckSettings,
          listHttpHealthChecksSettings,
          patchHttpHealthCheckSettings,
          updateHttpHealthCheckSettings
      );

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder.deleteHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listHttpHealthChecksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(HttpHealthCheckSettings settings) {
      super(settings);

      deleteHttpHealthCheckSettings = settings.deleteHttpHealthCheckSettings.toBuilder();
      getHttpHealthCheckSettings = settings.getHttpHealthCheckSettings.toBuilder();
      insertHttpHealthCheckSettings = settings.insertHttpHealthCheckSettings.toBuilder();
      listHttpHealthChecksSettings = settings.listHttpHealthChecksSettings.toBuilder();
      patchHttpHealthCheckSettings = settings.patchHttpHealthCheckSettings.toBuilder();
      updateHttpHealthCheckSettings = settings.updateHttpHealthCheckSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteHttpHealthCheckSettings,
          getHttpHealthCheckSettings,
          insertHttpHealthCheckSettings,
          listHttpHealthChecksSettings,
          patchHttpHealthCheckSettings,
          updateHttpHealthCheckSettings
      );
    }

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setTransportChannelProvider(TransportChannelProvider transportProvider) {
      super.setTransportChannelProvider(transportProvider);
      return this;
    }

    @Override
    public Builder setHeaderProvider(HeaderProvider headerProvider) {
      super.setHeaderProvider(headerProvider);
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
    public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    /**
     * Returns the builder for the settings used for calls to deleteHttpHealthCheck.
     */
    public UnaryCallSettings.Builder<DeleteHttpHealthCheckHttpRequest, Operation> deleteHttpHealthCheckSettings() {
      return deleteHttpHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getHttpHealthCheck.
     */
    public UnaryCallSettings.Builder<GetHttpHealthCheckHttpRequest, HttpHealthCheck> getHttpHealthCheckSettings() {
      return getHttpHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertHttpHealthCheck.
     */
    public UnaryCallSettings.Builder<InsertHttpHealthCheckHttpRequest, Operation> insertHttpHealthCheckSettings() {
      return insertHttpHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listHttpHealthChecks.
     */
    public PagedCallSettings.Builder<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse> listHttpHealthChecksSettings() {
      return listHttpHealthChecksSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchHttpHealthCheck.
     */
    public UnaryCallSettings.Builder<PatchHttpHealthCheckHttpRequest, Operation> patchHttpHealthCheckSettings() {
      return patchHttpHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateHttpHealthCheck.
     */
    public UnaryCallSettings.Builder<UpdateHttpHealthCheckHttpRequest, Operation> updateHttpHealthCheckSettings() {
      return updateHttpHealthCheckSettings;
    }

    @Override
    public HttpHealthCheckSettings build() throws IOException {
      return new HttpHealthCheckSettings(this);
    }
  }
}