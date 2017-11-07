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
import static com.google.compute.v1.PagedResponseWrappers.ListSslCertificatesPagedResponse;
import com.google.compute.v1.stub.HttpJsonSslCertificateStub;
import com.google.compute.v1.stub.SslCertificateStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link SslCertificateClient}.
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
 * object. For example, to set the total timeout of deleteSslCertificate to 30 seconds:
 *
 * <pre>
 * <code>
 * SslCertificateSettings.Builder sslCertificateSettingsBuilder =
 *     SslCertificateSettings.newBuilder();
 * sslCertificateSettingsBuilder.deleteSslCertificateSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * SslCertificateSettings sslCertificateSettings = sslCertificateSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SslCertificateSettings extends ClientSettings {
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

  private final UnaryCallSettings<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateSettings;
  private final UnaryCallSettings<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateSettings;
  private final UnaryCallSettings<InsertSslCertificateHttpRequest, Operation> insertSslCertificateSettings;
  private final PagedCallSettings<ListSslCertificatesHttpRequest, SslCertificateList, ListSslCertificatesPagedResponse> listSslCertificatesSettings;

  /**
   * Returns the object with the settings used for calls to deleteSslCertificate.
   */
  public UnaryCallSettings<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateSettings() {
    return deleteSslCertificateSettings;
  }

  /**
   * Returns the object with the settings used for calls to getSslCertificate.
   */
  public UnaryCallSettings<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateSettings() {
    return getSslCertificateSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertSslCertificate.
   */
  public UnaryCallSettings<InsertSslCertificateHttpRequest, Operation> insertSslCertificateSettings() {
    return insertSslCertificateSettings;
  }

  /**
   * Returns the object with the settings used for calls to listSslCertificates.
   */
  public PagedCallSettings<ListSslCertificatesHttpRequest, SslCertificateList, ListSslCertificatesPagedResponse> listSslCertificatesSettings() {
    return listSslCertificatesSettings;
  }


  public SslCertificateStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSslCertificateStub.create(this);
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
          SslCertificateSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private SslCertificateSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportChannelProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getHeaderProvider(),
        settingsBuilder.getClock());

    deleteSslCertificateSettings = settingsBuilder.deleteSslCertificateSettings().build();
    getSslCertificateSettings = settingsBuilder.getSslCertificateSettings().build();
    insertSslCertificateSettings = settingsBuilder.insertSslCertificateSettings().build();
    listSslCertificatesSettings = settingsBuilder.listSslCertificatesSettings().build();
  }

  private static final PagedListDescriptor<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> LIST_SSL_CERTIFICATES_PAGE_STR_DESC =
      new PagedListDescriptor<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListSslCertificatesHttpRequest injectToken(ListSslCertificatesHttpRequest payload, String token) {
          return ListSslCertificatesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListSslCertificatesHttpRequest injectPageSize(ListSslCertificatesHttpRequest payload, int pageSize) {
          return ListSslCertificatesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListSslCertificatesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(SslCertificateList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<SslCertificate> extractResources(SslCertificateList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListSslCertificatesHttpRequest, SslCertificateList, ListSslCertificatesPagedResponse> LIST_SSL_CERTIFICATES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListSslCertificatesHttpRequest, SslCertificateList, ListSslCertificatesPagedResponse>() {
        @Override
        public ApiFuture<ListSslCertificatesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListSslCertificatesHttpRequest, SslCertificateList> callable,
            ListSslCertificatesHttpRequest request,
            ApiCallContext context,
            ApiFuture<SslCertificateList> futureResponse) {
          PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> pageContext =
              PageContext.create(callable, LIST_SSL_CERTIFICATES_PAGE_STR_DESC, request, context);
          return ListSslCertificatesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for SslCertificateSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateSettings;
    private final UnaryCallSettings.Builder<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateSettings;
    private final UnaryCallSettings.Builder<InsertSslCertificateHttpRequest, Operation> insertSslCertificateSettings;
    private final PagedCallSettings.Builder<ListSslCertificatesHttpRequest, SslCertificateList, ListSslCertificatesPagedResponse> listSslCertificatesSettings;

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

      deleteSslCertificateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSslCertificateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSslCertificateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSslCertificatesSettings = PagedCallSettings.newBuilder(
          LIST_SSL_CERTIFICATES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteSslCertificateSettings,
          getSslCertificateSettings,
          insertSslCertificateSettings,
          listSslCertificatesSettings
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

      builder.deleteSslCertificateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getSslCertificateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertSslCertificateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listSslCertificatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(SslCertificateSettings settings) {
      super(settings);

      deleteSslCertificateSettings = settings.deleteSslCertificateSettings.toBuilder();
      getSslCertificateSettings = settings.getSslCertificateSettings.toBuilder();
      insertSslCertificateSettings = settings.insertSslCertificateSettings.toBuilder();
      listSslCertificatesSettings = settings.listSslCertificatesSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteSslCertificateSettings,
          getSslCertificateSettings,
          insertSslCertificateSettings,
          listSslCertificatesSettings
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
     * Returns the builder for the settings used for calls to deleteSslCertificate.
     */
    public UnaryCallSettings.Builder<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateSettings() {
      return deleteSslCertificateSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getSslCertificate.
     */
    public UnaryCallSettings.Builder<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateSettings() {
      return getSslCertificateSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertSslCertificate.
     */
    public UnaryCallSettings.Builder<InsertSslCertificateHttpRequest, Operation> insertSslCertificateSettings() {
      return insertSslCertificateSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listSslCertificates.
     */
    public PagedCallSettings.Builder<ListSslCertificatesHttpRequest, SslCertificateList, ListSslCertificatesPagedResponse> listSslCertificatesSettings() {
      return listSslCertificatesSettings;
    }

    @Override
    public SslCertificateSettings build() throws IOException {
      return new SslCertificateSettings(this);
    }
  }
}