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
import static com.google.compute.v1.PagedResponseWrappers.ListHttpsHealthChecksPagedResponse;
import com.google.compute.v1.stub.HttpJsonHttpsHealthCheckStub;
import com.google.compute.v1.stub.HttpsHealthCheckStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link HttpsHealthCheckClient}.
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
 * object. For example, to set the total timeout of deleteHttpsHealthCheck to 30 seconds:
 *
 * <pre>
 * <code>
 * HttpsHealthCheckSettings.Builder httpsHealthCheckSettingsBuilder =
 *     HttpsHealthCheckSettings.newBuilder();
 * httpsHealthCheckSettingsBuilder.deleteHttpsHealthCheckSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * HttpsHealthCheckSettings httpsHealthCheckSettings = httpsHealthCheckSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HttpsHealthCheckSettings extends ClientSettings<HttpsHealthCheckSettings> {
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

  private final UnaryCallSettings<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckSettings;
  private final UnaryCallSettings<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckSettings;
  private final UnaryCallSettings<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckSettings;
  private final PagedCallSettings<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksSettings;
  private final UnaryCallSettings<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckSettings;
  private final UnaryCallSettings<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckSettings;

  /**
   * Returns the object with the settings used for calls to deleteHttpsHealthCheck.
   */
  public UnaryCallSettings<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckSettings() {
    return deleteHttpsHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to getHttpsHealthCheck.
   */
  public UnaryCallSettings<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckSettings() {
    return getHttpsHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertHttpsHealthCheck.
   */
  public UnaryCallSettings<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckSettings() {
    return insertHttpsHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to listHttpsHealthChecks.
   */
  public PagedCallSettings<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksSettings() {
    return listHttpsHealthChecksSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchHttpsHealthCheck.
   */
  public UnaryCallSettings<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckSettings() {
    return patchHttpsHealthCheckSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateHttpsHealthCheck.
   */
  public UnaryCallSettings<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckSettings() {
    return updateHttpsHealthCheckSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public HttpsHealthCheckStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonHttpsHealthCheckStub.create(this);
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
          HttpsHealthCheckSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private HttpsHealthCheckSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteHttpsHealthCheckSettings = settingsBuilder.deleteHttpsHealthCheckSettings().build();
    getHttpsHealthCheckSettings = settingsBuilder.getHttpsHealthCheckSettings().build();
    insertHttpsHealthCheckSettings = settingsBuilder.insertHttpsHealthCheckSettings().build();
    listHttpsHealthChecksSettings = settingsBuilder.listHttpsHealthChecksSettings().build();
    patchHttpsHealthCheckSettings = settingsBuilder.patchHttpsHealthCheckSettings().build();
    updateHttpsHealthCheckSettings = settingsBuilder.updateHttpsHealthCheckSettings().build();
  }

  private static final PagedListDescriptor<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck> LIST_HTTPS_HEALTH_CHECKS_PAGE_STR_DESC =
      new PagedListDescriptor<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListHttpsHealthChecksHttpRequest injectToken(ListHttpsHealthChecksHttpRequest payload, String token) {
          return ListHttpsHealthChecksHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListHttpsHealthChecksHttpRequest injectPageSize(ListHttpsHealthChecksHttpRequest payload, int pageSize) {
          return ListHttpsHealthChecksHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListHttpsHealthChecksHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(HttpsHealthCheckList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<HttpsHealthCheck> extractResources(HttpsHealthCheckList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, ListHttpsHealthChecksPagedResponse> LIST_HTTPS_HEALTH_CHECKS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, ListHttpsHealthChecksPagedResponse>() {
        @Override
        public ApiFuture<ListHttpsHealthChecksPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList> callable,
            ListHttpsHealthChecksHttpRequest request,
            ApiCallContext context,
            ApiFuture<HttpsHealthCheckList> futureResponse) {
          PageContext<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck> pageContext =
              PageContext.create(callable, LIST_HTTPS_HEALTH_CHECKS_PAGE_STR_DESC, request, context);
          return ListHttpsHealthChecksPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for HttpsHealthCheckSettings.
   */
  public static class Builder extends ClientSettings.Builder<HttpsHealthCheckSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckSettings;
    private final UnaryCallSettings.Builder<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckSettings;
    private final UnaryCallSettings.Builder<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckSettings;
    private final PagedCallSettings.Builder<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksSettings;
    private final UnaryCallSettings.Builder<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckSettings;
    private final UnaryCallSettings.Builder<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckSettings;

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

      deleteHttpsHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getHttpsHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertHttpsHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listHttpsHealthChecksSettings = PagedCallSettings.newBuilder(
          LIST_HTTPS_HEALTH_CHECKS_PAGE_STR_FACT);

      patchHttpsHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateHttpsHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteHttpsHealthCheckSettings,
          getHttpsHealthCheckSettings,
          insertHttpsHealthCheckSettings,
          listHttpsHealthChecksSettings,
          patchHttpsHealthCheckSettings,
          updateHttpsHealthCheckSettings
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

      builder.deleteHttpsHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getHttpsHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertHttpsHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listHttpsHealthChecksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchHttpsHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateHttpsHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(HttpsHealthCheckSettings settings) {
      super(settings);

      deleteHttpsHealthCheckSettings = settings.deleteHttpsHealthCheckSettings.toBuilder();
      getHttpsHealthCheckSettings = settings.getHttpsHealthCheckSettings.toBuilder();
      insertHttpsHealthCheckSettings = settings.insertHttpsHealthCheckSettings.toBuilder();
      listHttpsHealthChecksSettings = settings.listHttpsHealthChecksSettings.toBuilder();
      patchHttpsHealthCheckSettings = settings.patchHttpsHealthCheckSettings.toBuilder();
      updateHttpsHealthCheckSettings = settings.updateHttpsHealthCheckSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteHttpsHealthCheckSettings,
          getHttpsHealthCheckSettings,
          insertHttpsHealthCheckSettings,
          listHttpsHealthChecksSettings,
          patchHttpsHealthCheckSettings,
          updateHttpsHealthCheckSettings
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
     * Returns the builder for the settings used for calls to deleteHttpsHealthCheck.
     */
    public UnaryCallSettings.Builder<DeleteHttpsHealthCheckHttpRequest, Operation> deleteHttpsHealthCheckSettings() {
      return deleteHttpsHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getHttpsHealthCheck.
     */
    public UnaryCallSettings.Builder<GetHttpsHealthCheckHttpRequest, HttpsHealthCheck> getHttpsHealthCheckSettings() {
      return getHttpsHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertHttpsHealthCheck.
     */
    public UnaryCallSettings.Builder<InsertHttpsHealthCheckHttpRequest, Operation> insertHttpsHealthCheckSettings() {
      return insertHttpsHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listHttpsHealthChecks.
     */
    public PagedCallSettings.Builder<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, ListHttpsHealthChecksPagedResponse> listHttpsHealthChecksSettings() {
      return listHttpsHealthChecksSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchHttpsHealthCheck.
     */
    public UnaryCallSettings.Builder<PatchHttpsHealthCheckHttpRequest, Operation> patchHttpsHealthCheckSettings() {
      return patchHttpsHealthCheckSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateHttpsHealthCheck.
     */
    public UnaryCallSettings.Builder<UpdateHttpsHealthCheckHttpRequest, Operation> updateHttpsHealthCheckSettings() {
      return updateHttpsHealthCheckSettings;
    }

    @Override
    public HttpsHealthCheckSettings build() throws IOException {
      return new HttpsHealthCheckSettings(this);
    }
  }
}