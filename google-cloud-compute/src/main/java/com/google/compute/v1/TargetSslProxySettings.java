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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetSslProxiesPagedResponse;
import com.google.compute.v1.stub.HttpJsonTargetSslProxyStub;
import com.google.compute.v1.stub.TargetSslProxyStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetSslProxyClient}.
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
 * object. For example, to set the total timeout of deleteTargetSslProxy to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetSslProxySettings.Builder targetSslProxySettingsBuilder =
 *     TargetSslProxySettings.newBuilder();
 * targetSslProxySettingsBuilder.deleteTargetSslProxySettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetSslProxySettings targetSslProxySettings = targetSslProxySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetSslProxySettings extends ClientSettings<TargetSslProxySettings> {
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

  private final UnaryCallSettings<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxySettings;
  private final UnaryCallSettings<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxySettings;
  private final UnaryCallSettings<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxySettings;
  private final PagedCallSettings<ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse> listTargetSslProxiesSettings;
  private final UnaryCallSettings<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxySettings;
  private final UnaryCallSettings<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxySettings;
  private final UnaryCallSettings<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxySettings;

  /**
   * Returns the object with the settings used for calls to deleteTargetSslProxy.
   */
  public UnaryCallSettings<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxySettings() {
    return deleteTargetSslProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to getTargetSslProxy.
   */
  public UnaryCallSettings<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxySettings() {
    return getTargetSslProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to insertTargetSslProxy.
   */
  public UnaryCallSettings<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxySettings() {
    return insertTargetSslProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to listTargetSslProxies.
   */
  public PagedCallSettings<ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse> listTargetSslProxiesSettings() {
    return listTargetSslProxiesSettings;
  }

  /**
   * Returns the object with the settings used for calls to setBackendServiceTargetSslProxy.
   */
  public UnaryCallSettings<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxySettings() {
    return setBackendServiceTargetSslProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to setProxyHeaderTargetSslProxy.
   */
  public UnaryCallSettings<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxySettings() {
    return setProxyHeaderTargetSslProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to setSslCertificatesTargetSslProxy.
   */
  public UnaryCallSettings<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxySettings() {
    return setSslCertificatesTargetSslProxySettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetSslProxyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetSslProxyStub.create(this);
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
          TargetSslProxySettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private TargetSslProxySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteTargetSslProxySettings = settingsBuilder.deleteTargetSslProxySettings().build();
    getTargetSslProxySettings = settingsBuilder.getTargetSslProxySettings().build();
    insertTargetSslProxySettings = settingsBuilder.insertTargetSslProxySettings().build();
    listTargetSslProxiesSettings = settingsBuilder.listTargetSslProxiesSettings().build();
    setBackendServiceTargetSslProxySettings = settingsBuilder.setBackendServiceTargetSslProxySettings().build();
    setProxyHeaderTargetSslProxySettings = settingsBuilder.setProxyHeaderTargetSslProxySettings().build();
    setSslCertificatesTargetSslProxySettings = settingsBuilder.setSslCertificatesTargetSslProxySettings().build();
  }

  private static final PagedListDescriptor<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> LIST_TARGET_SSL_PROXIES_PAGE_STR_DESC =
      new PagedListDescriptor<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListTargetSslProxiesHttpRequest injectToken(ListTargetSslProxiesHttpRequest payload, String token) {
          return ListTargetSslProxiesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListTargetSslProxiesHttpRequest injectPageSize(ListTargetSslProxiesHttpRequest payload, int pageSize) {
          return ListTargetSslProxiesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListTargetSslProxiesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(TargetSslProxyList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<TargetSslProxy> extractResources(TargetSslProxyList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse> LIST_TARGET_SSL_PROXIES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse>() {
        @Override
        public ApiFuture<ListTargetSslProxiesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> callable,
            ListTargetSslProxiesHttpRequest request,
            ApiCallContext context,
            ApiFuture<TargetSslProxyList> futureResponse) {
          PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> pageContext =
              PageContext.create(callable, LIST_TARGET_SSL_PROXIES_PAGE_STR_DESC, request, context);
          return ListTargetSslProxiesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for TargetSslProxySettings.
   */
  public static class Builder extends ClientSettings.Builder<TargetSslProxySettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxySettings;
    private final UnaryCallSettings.Builder<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxySettings;
    private final UnaryCallSettings.Builder<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxySettings;
    private final PagedCallSettings.Builder<ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse> listTargetSslProxiesSettings;
    private final UnaryCallSettings.Builder<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxySettings;
    private final UnaryCallSettings.Builder<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxySettings;
    private final UnaryCallSettings.Builder<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxySettings;

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

      deleteTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listTargetSslProxiesSettings = PagedCallSettings.newBuilder(
          LIST_TARGET_SSL_PROXIES_PAGE_STR_FACT);

      setBackendServiceTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setProxyHeaderTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setSslCertificatesTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteTargetSslProxySettings,
          getTargetSslProxySettings,
          insertTargetSslProxySettings,
          listTargetSslProxiesSettings,
          setBackendServiceTargetSslProxySettings,
          setProxyHeaderTargetSslProxySettings,
          setSslCertificatesTargetSslProxySettings
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

      builder.deleteTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listTargetSslProxiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setBackendServiceTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setProxyHeaderTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setSslCertificatesTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(TargetSslProxySettings settings) {
      super(settings);

      deleteTargetSslProxySettings = settings.deleteTargetSslProxySettings.toBuilder();
      getTargetSslProxySettings = settings.getTargetSslProxySettings.toBuilder();
      insertTargetSslProxySettings = settings.insertTargetSslProxySettings.toBuilder();
      listTargetSslProxiesSettings = settings.listTargetSslProxiesSettings.toBuilder();
      setBackendServiceTargetSslProxySettings = settings.setBackendServiceTargetSslProxySettings.toBuilder();
      setProxyHeaderTargetSslProxySettings = settings.setProxyHeaderTargetSslProxySettings.toBuilder();
      setSslCertificatesTargetSslProxySettings = settings.setSslCertificatesTargetSslProxySettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteTargetSslProxySettings,
          getTargetSslProxySettings,
          insertTargetSslProxySettings,
          listTargetSslProxiesSettings,
          setBackendServiceTargetSslProxySettings,
          setProxyHeaderTargetSslProxySettings,
          setSslCertificatesTargetSslProxySettings
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
     * Returns the builder for the settings used for calls to deleteTargetSslProxy.
     */
    public UnaryCallSettings.Builder<DeleteTargetSslProxyHttpRequest, Operation> deleteTargetSslProxySettings() {
      return deleteTargetSslProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to getTargetSslProxy.
     */
    public UnaryCallSettings.Builder<GetTargetSslProxyHttpRequest, TargetSslProxy> getTargetSslProxySettings() {
      return getTargetSslProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertTargetSslProxy.
     */
    public UnaryCallSettings.Builder<InsertTargetSslProxyHttpRequest, Operation> insertTargetSslProxySettings() {
      return insertTargetSslProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to listTargetSslProxies.
     */
    public PagedCallSettings.Builder<ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse> listTargetSslProxiesSettings() {
      return listTargetSslProxiesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setBackendServiceTargetSslProxy.
     */
    public UnaryCallSettings.Builder<SetBackendServiceTargetSslProxyHttpRequest, Operation> setBackendServiceTargetSslProxySettings() {
      return setBackendServiceTargetSslProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to setProxyHeaderTargetSslProxy.
     */
    public UnaryCallSettings.Builder<SetProxyHeaderTargetSslProxyHttpRequest, Operation> setProxyHeaderTargetSslProxySettings() {
      return setProxyHeaderTargetSslProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to setSslCertificatesTargetSslProxy.
     */
    public UnaryCallSettings.Builder<SetSslCertificatesTargetSslProxyHttpRequest, Operation> setSslCertificatesTargetSslProxySettings() {
      return setSslCertificatesTargetSslProxySettings;
    }

    @Override
    public TargetSslProxySettings build() throws IOException {
      return new TargetSslProxySettings(this);
    }
  }
}