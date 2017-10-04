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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListGlobalOperationsPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListGlobalOperationsPagedResponse;
import com.google.compute.v1.stub.GlobalOperationAdminStub;
import com.google.compute.v1.stub.HttpGlobalOperationAdminStub;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link GlobalOperationAdminClient}.
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
 * object. For example, to set the total timeout of deleteGlobalOperation to 30 seconds:
 *
 * <pre>
 * <code>
 * GlobalOperationAdminSettings.Builder globalOperationAdminSettingsBuilder =
 *     GlobalOperationAdminSettings.defaultBuilder();
 * globalOperationAdminSettingsBuilder.deleteGlobalOperationSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * GlobalOperationAdminSettings globalOperationAdminSettings = globalOperationAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GlobalOperationAdminSettings extends ClientSettings {
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

  private final PagedCallSettings<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsSettings;
  private final SimpleCallSettings<DeleteGlobalOperationHttpRequest, Empty> deleteGlobalOperationSettings;
  private final SimpleCallSettings<GetGlobalOperationHttpRequest, Operation> getGlobalOperationSettings;
  private final PagedCallSettings<ListGlobalOperationsHttpRequest, OperationList, ListGlobalOperationsPagedResponse> listGlobalOperationsSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListGlobalOperations.
   */
  public PagedCallSettings<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsSettings() {
    return aggregatedListGlobalOperationsSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteGlobalOperation.
   */
  public SimpleCallSettings<DeleteGlobalOperationHttpRequest, Empty> deleteGlobalOperationSettings() {
    return deleteGlobalOperationSettings;
  }

  /**
   * Returns the object with the settings used for calls to getGlobalOperation.
   */
  public SimpleCallSettings<GetGlobalOperationHttpRequest, Operation> getGlobalOperationSettings() {
    return getGlobalOperationSettings;
  }

  /**
   * Returns the object with the settings used for calls to listGlobalOperations.
   */
  public PagedCallSettings<ListGlobalOperationsHttpRequest, OperationList, ListGlobalOperationsPagedResponse> listGlobalOperationsSettings() {
    return listGlobalOperationsSettings;
  }


  public GlobalOperationAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpGlobalOperationAdminStub.create(this);
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
          GlobalOperationAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private GlobalOperationAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    aggregatedListGlobalOperationsSettings = settingsBuilder.aggregatedListGlobalOperationsSettings().build();
    deleteGlobalOperationSettings = settingsBuilder.deleteGlobalOperationSettings().build();
    getGlobalOperationSettings = settingsBuilder.getGlobalOperationSettings().build();
    listGlobalOperationsSettings = settingsBuilder.listGlobalOperationsSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation> AGGREGATED_LIST_GLOBAL_OPERATIONS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListGlobalOperationsHttpRequest injectToken(AggregatedListGlobalOperationsHttpRequest payload, String token) {
          return AggregatedListGlobalOperationsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListGlobalOperationsHttpRequest injectPageSize(AggregatedListGlobalOperationsHttpRequest payload, int pageSize) {
          return AggregatedListGlobalOperationsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListGlobalOperationsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(OperationAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Operation> extractResources(OperationAggregatedList payload) {
          return payload.getOperationsScopedList().getOperations();
        }
      };

  private static final PagedListDescriptor<ListGlobalOperationsHttpRequest, OperationList, Operation> LIST_GLOBAL_OPERATIONS_PAGE_STR_DESC =
      new PagedListDescriptor<ListGlobalOperationsHttpRequest, OperationList, Operation>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListGlobalOperationsHttpRequest injectToken(ListGlobalOperationsHttpRequest payload, String token) {
          return ListGlobalOperationsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListGlobalOperationsHttpRequest injectPageSize(ListGlobalOperationsHttpRequest payload, int pageSize) {
          return ListGlobalOperationsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListGlobalOperationsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(OperationList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Operation> extractResources(OperationList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, AggregatedListGlobalOperationsPagedResponse> AGGREGATED_LIST_GLOBAL_OPERATIONS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, AggregatedListGlobalOperationsPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListGlobalOperationsPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList> callable,
            AggregatedListGlobalOperationsHttpRequest request,
            ApiCallContext context,
            ApiFuture<OperationAggregatedList> futureResponse) {
          PageContext<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_GLOBAL_OPERATIONS_PAGE_STR_DESC, request, context);
          return AggregatedListGlobalOperationsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListGlobalOperationsHttpRequest, OperationList, ListGlobalOperationsPagedResponse> LIST_GLOBAL_OPERATIONS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListGlobalOperationsHttpRequest, OperationList, ListGlobalOperationsPagedResponse>() {
        @Override
        public ApiFuture<ListGlobalOperationsPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListGlobalOperationsHttpRequest, OperationList> callable,
            ListGlobalOperationsHttpRequest request,
            ApiCallContext context,
            ApiFuture<OperationList> futureResponse) {
          PageContext<ListGlobalOperationsHttpRequest, OperationList, Operation> pageContext =
              PageContext.create(callable, LIST_GLOBAL_OPERATIONS_PAGE_STR_DESC, request, context);
          return ListGlobalOperationsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for GlobalOperationAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsSettings;
    private final SimpleCallSettings.Builder<DeleteGlobalOperationHttpRequest, Empty> deleteGlobalOperationSettings;
    private final SimpleCallSettings.Builder<GetGlobalOperationHttpRequest, Operation> getGlobalOperationSettings;
    private final PagedCallSettings.Builder<ListGlobalOperationsHttpRequest, OperationList, ListGlobalOperationsPagedResponse> listGlobalOperationsSettings;

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

      aggregatedListGlobalOperationsSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_GLOBAL_OPERATIONS_PAGE_STR_FACT);

      deleteGlobalOperationSettings = SimpleCallSettings.newBuilder();

      getGlobalOperationSettings = SimpleCallSettings.newBuilder();

      listGlobalOperationsSettings = PagedCallSettings.newBuilder(
          LIST_GLOBAL_OPERATIONS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListGlobalOperationsSettings,
          deleteGlobalOperationSettings,
          getGlobalOperationSettings,
          listGlobalOperationsSettings
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

      builder.aggregatedListGlobalOperationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteGlobalOperationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getGlobalOperationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listGlobalOperationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(GlobalOperationAdminSettings settings) {
      super(settings);

      aggregatedListGlobalOperationsSettings = settings.aggregatedListGlobalOperationsSettings.toBuilder();
      deleteGlobalOperationSettings = settings.deleteGlobalOperationSettings.toBuilder();
      getGlobalOperationSettings = settings.getGlobalOperationSettings.toBuilder();
      listGlobalOperationsSettings = settings.listGlobalOperationsSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListGlobalOperationsSettings,
          deleteGlobalOperationSettings,
          getGlobalOperationSettings,
          listGlobalOperationsSettings
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
     * Returns the builder for the settings used for calls to aggregatedListGlobalOperations.
     */
    public PagedCallSettings.Builder<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, AggregatedListGlobalOperationsPagedResponse> aggregatedListGlobalOperationsSettings() {
      return aggregatedListGlobalOperationsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteGlobalOperation.
     */
    public SimpleCallSettings.Builder<DeleteGlobalOperationHttpRequest, Empty> deleteGlobalOperationSettings() {
      return deleteGlobalOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getGlobalOperation.
     */
    public SimpleCallSettings.Builder<GetGlobalOperationHttpRequest, Operation> getGlobalOperationSettings() {
      return getGlobalOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listGlobalOperations.
     */
    public PagedCallSettings.Builder<ListGlobalOperationsHttpRequest, OperationList, ListGlobalOperationsPagedResponse> listGlobalOperationsSettings() {
      return listGlobalOperationsSettings;
    }

    @Override
    public GlobalOperationAdminSettings build() throws IOException {
      return new GlobalOperationAdminSettings(this);
    }
  }
}