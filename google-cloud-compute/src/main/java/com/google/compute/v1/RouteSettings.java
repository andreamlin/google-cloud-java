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
import static com.google.compute.v1.PagedResponseWrappers.ListRoutesPagedResponse;
import com.google.compute.v1.stub.HttpJsonRouteStub;
import com.google.compute.v1.stub.RouteStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RouteClient}.
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
 * object. For example, to set the total timeout of deleteRoute to 30 seconds:
 *
 * <pre>
 * <code>
 * RouteSettings.Builder routeSettingsBuilder =
 *     RouteSettings.newBuilder();
 * routeSettingsBuilder.deleteRouteSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RouteSettings routeSettings = routeSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RouteSettings extends ClientSettings<RouteSettings> {
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

  private final UnaryCallSettings<DeleteRouteHttpRequest, Operation> deleteRouteSettings;
  private final UnaryCallSettings<GetRouteHttpRequest, Route> getRouteSettings;
  private final UnaryCallSettings<InsertRouteHttpRequest, Operation> insertRouteSettings;
  private final PagedCallSettings<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse> listRoutesSettings;

  /**
   * Returns the object with the settings used for calls to deleteRoute.
   */
  public UnaryCallSettings<DeleteRouteHttpRequest, Operation> deleteRouteSettings() {
    return deleteRouteSettings;
  }

  /**
   * Returns the object with the settings used for calls to getRoute.
   */
  public UnaryCallSettings<GetRouteHttpRequest, Route> getRouteSettings() {
    return getRouteSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertRoute.
   */
  public UnaryCallSettings<InsertRouteHttpRequest, Operation> insertRouteSettings() {
    return insertRouteSettings;
  }

  /**
   * Returns the object with the settings used for calls to listRoutes.
   */
  public PagedCallSettings<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse> listRoutesSettings() {
    return listRoutesSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RouteStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRouteStub.create(this);
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
        .addApiClientHeaderLineData(GrpcExtraHeaderData.getXGoogApiClientData());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion = PropertiesProvider.loadProperty(
          RouteSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private RouteSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteRouteSettings = settingsBuilder.deleteRouteSettings().build();
    getRouteSettings = settingsBuilder.getRouteSettings().build();
    insertRouteSettings = settingsBuilder.insertRouteSettings().build();
    listRoutesSettings = settingsBuilder.listRoutesSettings().build();
  }

  private static final PagedListDescriptor<ListRoutesHttpRequest, RouteList, Route> LIST_ROUTES_PAGE_STR_DESC =
      new PagedListDescriptor<ListRoutesHttpRequest, RouteList, Route>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListRoutesHttpRequest injectToken(ListRoutesHttpRequest payload, String token) {
          return ListRoutesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListRoutesHttpRequest injectPageSize(ListRoutesHttpRequest payload, int pageSize) {
          return ListRoutesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListRoutesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(RouteList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Route> extractResources(RouteList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse> LIST_ROUTES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse>() {
        @Override
        public ApiFuture<ListRoutesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListRoutesHttpRequest, RouteList> callable,
            ListRoutesHttpRequest request,
            ApiCallContext context,
            ApiFuture<RouteList> futureResponse) {
          PageContext<ListRoutesHttpRequest, RouteList, Route> pageContext =
              PageContext.create(callable, LIST_ROUTES_PAGE_STR_DESC, request, context);
          return ListRoutesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for RouteSettings.
   */
  public static class Builder extends ClientSettings.Builder<RouteSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteRouteHttpRequest, Operation> deleteRouteSettings;
    private final UnaryCallSettings.Builder<GetRouteHttpRequest, Route> getRouteSettings;
    private final UnaryCallSettings.Builder<InsertRouteHttpRequest, Operation> insertRouteSettings;
    private final PagedCallSettings.Builder<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse> listRoutesSettings;

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

      deleteRouteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getRouteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertRouteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listRoutesSettings = PagedCallSettings.newBuilder(
          LIST_ROUTES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteRouteSettings,
          getRouteSettings,
          insertRouteSettings,
          listRoutesSettings
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

      builder.deleteRouteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getRouteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertRouteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listRoutesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(RouteSettings settings) {
      super(settings);

      deleteRouteSettings = settings.deleteRouteSettings.toBuilder();
      getRouteSettings = settings.getRouteSettings.toBuilder();
      insertRouteSettings = settings.insertRouteSettings.toBuilder();
      listRoutesSettings = settings.listRoutesSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteRouteSettings,
          getRouteSettings,
          insertRouteSettings,
          listRoutesSettings
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
     * Returns the builder for the settings used for calls to deleteRoute.
     */
    public UnaryCallSettings.Builder<DeleteRouteHttpRequest, Operation> deleteRouteSettings() {
      return deleteRouteSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getRoute.
     */
    public UnaryCallSettings.Builder<GetRouteHttpRequest, Route> getRouteSettings() {
      return getRouteSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertRoute.
     */
    public UnaryCallSettings.Builder<InsertRouteHttpRequest, Operation> insertRouteSettings() {
      return insertRouteSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listRoutes.
     */
    public PagedCallSettings.Builder<ListRoutesHttpRequest, RouteList, ListRoutesPagedResponse> listRoutesSettings() {
      return listRoutesSettings;
    }

    @Override
    public RouteSettings build() throws IOException {
      return new RouteSettings(this);
    }
  }
}