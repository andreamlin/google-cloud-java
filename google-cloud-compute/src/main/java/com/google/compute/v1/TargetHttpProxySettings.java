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
import static com.google.compute.v1.PagedResponseWrappers.ListTargetHttpProxiesPagedResponse;
import com.google.compute.v1.stub.HttpJsonTargetHttpProxyStub;
import com.google.compute.v1.stub.TargetHttpProxyStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetHttpProxyClient}.
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
 * object. For example, to set the total timeout of deleteTargetHttpProxy to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetHttpProxySettings.Builder targetHttpProxySettingsBuilder =
 *     TargetHttpProxySettings.newBuilder();
 * targetHttpProxySettingsBuilder.deleteTargetHttpProxySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetHttpProxySettings targetHttpProxySettings = targetHttpProxySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TargetHttpProxySettings extends ClientSettings<TargetHttpProxySettings> {
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

  private final UnaryCallSettings<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxySettings;
  private final UnaryCallSettings<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxySettings;
  private final UnaryCallSettings<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxySettings;
  private final PagedCallSettings<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesSettings;
  private final UnaryCallSettings<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxySettings;

  /**
   * Returns the object with the settings used for calls to deleteTargetHttpProxy.
   */
  public UnaryCallSettings<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxySettings() {
    return deleteTargetHttpProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to getTargetHttpProxy.
   */
  public UnaryCallSettings<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxySettings() {
    return getTargetHttpProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to insertTargetHttpProxy.
   */
  public UnaryCallSettings<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxySettings() {
    return insertTargetHttpProxySettings;
  }

  /**
   * Returns the object with the settings used for calls to listTargetHttpProxies.
   */
  public PagedCallSettings<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesSettings() {
    return listTargetHttpProxiesSettings;
  }

  /**
   * Returns the object with the settings used for calls to setUrlMapTargetHttpProxy.
   */
  public UnaryCallSettings<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxySettings() {
    return setUrlMapTargetHttpProxySettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetHttpProxyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetHttpProxyStub.create(this);
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
          TargetHttpProxySettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private TargetHttpProxySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteTargetHttpProxySettings = settingsBuilder.deleteTargetHttpProxySettings().build();
    getTargetHttpProxySettings = settingsBuilder.getTargetHttpProxySettings().build();
    insertTargetHttpProxySettings = settingsBuilder.insertTargetHttpProxySettings().build();
    listTargetHttpProxiesSettings = settingsBuilder.listTargetHttpProxiesSettings().build();
    setUrlMapTargetHttpProxySettings = settingsBuilder.setUrlMapTargetHttpProxySettings().build();
  }

  private static final PagedListDescriptor<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> LIST_TARGET_HTTP_PROXIES_PAGE_STR_DESC =
      new PagedListDescriptor<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListTargetHttpProxiesHttpRequest injectToken(ListTargetHttpProxiesHttpRequest payload, String token) {
          return ListTargetHttpProxiesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListTargetHttpProxiesHttpRequest injectPageSize(ListTargetHttpProxiesHttpRequest payload, int pageSize) {
          return ListTargetHttpProxiesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListTargetHttpProxiesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(TargetHttpProxyList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<TargetHttpProxy> extractResources(TargetHttpProxyList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, ListTargetHttpProxiesPagedResponse> LIST_TARGET_HTTP_PROXIES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, ListTargetHttpProxiesPagedResponse>() {
        @Override
        public ApiFuture<ListTargetHttpProxiesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList> callable,
            ListTargetHttpProxiesHttpRequest request,
            ApiCallContext context,
            ApiFuture<TargetHttpProxyList> futureResponse) {
          PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> pageContext =
              PageContext.create(callable, LIST_TARGET_HTTP_PROXIES_PAGE_STR_DESC, request, context);
          return ListTargetHttpProxiesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for TargetHttpProxySettings.
   */
  public static class Builder extends ClientSettings.Builder<TargetHttpProxySettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxySettings;
    private final UnaryCallSettings.Builder<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxySettings;
    private final UnaryCallSettings.Builder<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxySettings;
    private final PagedCallSettings.Builder<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesSettings;
    private final UnaryCallSettings.Builder<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxySettings;

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

      deleteTargetHttpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getTargetHttpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetHttpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listTargetHttpProxiesSettings = PagedCallSettings.newBuilder(
          LIST_TARGET_HTTP_PROXIES_PAGE_STR_FACT);

      setUrlMapTargetHttpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteTargetHttpProxySettings,
          getTargetHttpProxySettings,
          insertTargetHttpProxySettings,
          listTargetHttpProxiesSettings,
          setUrlMapTargetHttpProxySettings
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

      builder.deleteTargetHttpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getTargetHttpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertTargetHttpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listTargetHttpProxiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setUrlMapTargetHttpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(TargetHttpProxySettings settings) {
      super(settings);

      deleteTargetHttpProxySettings = settings.deleteTargetHttpProxySettings.toBuilder();
      getTargetHttpProxySettings = settings.getTargetHttpProxySettings.toBuilder();
      insertTargetHttpProxySettings = settings.insertTargetHttpProxySettings.toBuilder();
      listTargetHttpProxiesSettings = settings.listTargetHttpProxiesSettings.toBuilder();
      setUrlMapTargetHttpProxySettings = settings.setUrlMapTargetHttpProxySettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteTargetHttpProxySettings,
          getTargetHttpProxySettings,
          insertTargetHttpProxySettings,
          listTargetHttpProxiesSettings,
          setUrlMapTargetHttpProxySettings
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
     * Returns the builder for the settings used for calls to deleteTargetHttpProxy.
     */
    public UnaryCallSettings.Builder<DeleteTargetHttpProxyHttpRequest, Operation> deleteTargetHttpProxySettings() {
      return deleteTargetHttpProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to getTargetHttpProxy.
     */
    public UnaryCallSettings.Builder<GetTargetHttpProxyHttpRequest, TargetHttpProxy> getTargetHttpProxySettings() {
      return getTargetHttpProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertTargetHttpProxy.
     */
    public UnaryCallSettings.Builder<InsertTargetHttpProxyHttpRequest, Operation> insertTargetHttpProxySettings() {
      return insertTargetHttpProxySettings;
    }

    /**
     * Returns the builder for the settings used for calls to listTargetHttpProxies.
     */
    public PagedCallSettings.Builder<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, ListTargetHttpProxiesPagedResponse> listTargetHttpProxiesSettings() {
      return listTargetHttpProxiesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setUrlMapTargetHttpProxy.
     */
    public UnaryCallSettings.Builder<SetUrlMapTargetHttpProxyHttpRequest, Operation> setUrlMapTargetHttpProxySettings() {
      return setUrlMapTargetHttpProxySettings;
    }

    @Override
    public TargetHttpProxySettings build() throws IOException {
      return new TargetHttpProxySettings(this);
    }
  }
}