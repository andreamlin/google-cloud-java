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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListSubnetworksPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListSubnetworksPagedResponse;
import com.google.compute.v1.stub.HttpJsonSubnetworkAdminStub;
import com.google.compute.v1.stub.SubnetworkAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link SubnetworkAdminClient}.
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
 * object. For example, to set the total timeout of deleteSubnetwork to 30 seconds:
 *
 * <pre>
 * <code>
 * SubnetworkAdminSettings.Builder subnetworkAdminSettingsBuilder =
 *     SubnetworkAdminSettings.defaultBuilder();
 * subnetworkAdminSettingsBuilder.deleteSubnetworkSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * SubnetworkAdminSettings subnetworkAdminSettings = subnetworkAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SubnetworkAdminSettings extends ClientSettings {
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

  private final PagedCallSettings<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksSettings;
  private final SimpleCallSettings<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkSettings;
  private final SimpleCallSettings<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkSettings;
  private final SimpleCallSettings<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkSettings;
  private final SimpleCallSettings<InsertSubnetworkHttpRequest, Operation> insertSubnetworkSettings;
  private final PagedCallSettings<ListSubnetworksHttpRequest, SubnetworkList, ListSubnetworksPagedResponse> listSubnetworksSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListSubnetworks.
   */
  public PagedCallSettings<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksSettings() {
    return aggregatedListSubnetworksSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteSubnetwork.
   */
  public SimpleCallSettings<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkSettings() {
    return deleteSubnetworkSettings;
  }

  /**
   * Returns the object with the settings used for calls to expandIpCidrRangeSubnetwork.
   */
  public SimpleCallSettings<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkSettings() {
    return expandIpCidrRangeSubnetworkSettings;
  }

  /**
   * Returns the object with the settings used for calls to getSubnetwork.
   */
  public SimpleCallSettings<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkSettings() {
    return getSubnetworkSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertSubnetwork.
   */
  public SimpleCallSettings<InsertSubnetworkHttpRequest, Operation> insertSubnetworkSettings() {
    return insertSubnetworkSettings;
  }

  /**
   * Returns the object with the settings used for calls to listSubnetworks.
   */
  public PagedCallSettings<ListSubnetworksHttpRequest, SubnetworkList, ListSubnetworksPagedResponse> listSubnetworksSettings() {
    return listSubnetworksSettings;
  }


  public SubnetworkAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpJsonSubnetworkAdminStub.create(this);
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
          SubnetworkAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private SubnetworkAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    aggregatedListSubnetworksSettings = settingsBuilder.aggregatedListSubnetworksSettings().build();
    deleteSubnetworkSettings = settingsBuilder.deleteSubnetworkSettings().build();
    expandIpCidrRangeSubnetworkSettings = settingsBuilder.expandIpCidrRangeSubnetworkSettings().build();
    getSubnetworkSettings = settingsBuilder.getSubnetworkSettings().build();
    insertSubnetworkSettings = settingsBuilder.insertSubnetworkSettings().build();
    listSubnetworksSettings = settingsBuilder.listSubnetworksSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> AGGREGATED_LIST_SUBNETWORKS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListSubnetworksHttpRequest injectToken(AggregatedListSubnetworksHttpRequest payload, String token) {
          return AggregatedListSubnetworksHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListSubnetworksHttpRequest injectPageSize(AggregatedListSubnetworksHttpRequest payload, int pageSize) {
          return AggregatedListSubnetworksHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListSubnetworksHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(SubnetworkAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Subnetwork> extractResources(SubnetworkAggregatedList payload) {
          return payload.getItems().getSubnetworks();
        }
      };

  private static final PagedListDescriptor<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> LIST_SUBNETWORKS_PAGE_STR_DESC =
      new PagedListDescriptor<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListSubnetworksHttpRequest injectToken(ListSubnetworksHttpRequest payload, String token) {
          return ListSubnetworksHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListSubnetworksHttpRequest injectPageSize(ListSubnetworksHttpRequest payload, int pageSize) {
          return ListSubnetworksHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListSubnetworksHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(SubnetworkList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Subnetwork> extractResources(SubnetworkList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, AggregatedListSubnetworksPagedResponse> AGGREGATED_LIST_SUBNETWORKS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, AggregatedListSubnetworksPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListSubnetworksPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> callable,
            AggregatedListSubnetworksHttpRequest request,
            ApiCallContext context,
            ApiFuture<SubnetworkAggregatedList> futureResponse) {
          PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_SUBNETWORKS_PAGE_STR_DESC, request, context);
          return AggregatedListSubnetworksPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListSubnetworksHttpRequest, SubnetworkList, ListSubnetworksPagedResponse> LIST_SUBNETWORKS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListSubnetworksHttpRequest, SubnetworkList, ListSubnetworksPagedResponse>() {
        @Override
        public ApiFuture<ListSubnetworksPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> callable,
            ListSubnetworksHttpRequest request,
            ApiCallContext context,
            ApiFuture<SubnetworkList> futureResponse) {
          PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> pageContext =
              PageContext.create(callable, LIST_SUBNETWORKS_PAGE_STR_DESC, request, context);
          return ListSubnetworksPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for SubnetworkAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksSettings;
    private final SimpleCallSettings.Builder<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkSettings;
    private final SimpleCallSettings.Builder<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkSettings;
    private final SimpleCallSettings.Builder<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkSettings;
    private final SimpleCallSettings.Builder<InsertSubnetworkHttpRequest, Operation> insertSubnetworkSettings;
    private final PagedCallSettings.Builder<ListSubnetworksHttpRequest, SubnetworkList, ListSubnetworksPagedResponse> listSubnetworksSettings;

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

      aggregatedListSubnetworksSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_SUBNETWORKS_PAGE_STR_FACT);

      deleteSubnetworkSettings = SimpleCallSettings.newBuilder();

      expandIpCidrRangeSubnetworkSettings = SimpleCallSettings.newBuilder();

      getSubnetworkSettings = SimpleCallSettings.newBuilder();

      insertSubnetworkSettings = SimpleCallSettings.newBuilder();

      listSubnetworksSettings = PagedCallSettings.newBuilder(
          LIST_SUBNETWORKS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListSubnetworksSettings,
          deleteSubnetworkSettings,
          expandIpCidrRangeSubnetworkSettings,
          getSubnetworkSettings,
          insertSubnetworkSettings,
          listSubnetworksSettings
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

      builder.aggregatedListSubnetworksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteSubnetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.expandIpCidrRangeSubnetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getSubnetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertSubnetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listSubnetworksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(SubnetworkAdminSettings settings) {
      super(settings);

      aggregatedListSubnetworksSettings = settings.aggregatedListSubnetworksSettings.toBuilder();
      deleteSubnetworkSettings = settings.deleteSubnetworkSettings.toBuilder();
      expandIpCidrRangeSubnetworkSettings = settings.expandIpCidrRangeSubnetworkSettings.toBuilder();
      getSubnetworkSettings = settings.getSubnetworkSettings.toBuilder();
      insertSubnetworkSettings = settings.insertSubnetworkSettings.toBuilder();
      listSubnetworksSettings = settings.listSubnetworksSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          aggregatedListSubnetworksSettings,
          deleteSubnetworkSettings,
          expandIpCidrRangeSubnetworkSettings,
          getSubnetworkSettings,
          insertSubnetworkSettings,
          listSubnetworksSettings
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
     * Returns the builder for the settings used for calls to aggregatedListSubnetworks.
     */
    public PagedCallSettings.Builder<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksSettings() {
      return aggregatedListSubnetworksSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteSubnetwork.
     */
    public SimpleCallSettings.Builder<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkSettings() {
      return deleteSubnetworkSettings;
    }

    /**
     * Returns the builder for the settings used for calls to expandIpCidrRangeSubnetwork.
     */
    public SimpleCallSettings.Builder<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkSettings() {
      return expandIpCidrRangeSubnetworkSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getSubnetwork.
     */
    public SimpleCallSettings.Builder<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkSettings() {
      return getSubnetworkSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertSubnetwork.
     */
    public SimpleCallSettings.Builder<InsertSubnetworkHttpRequest, Operation> insertSubnetworkSettings() {
      return insertSubnetworkSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listSubnetworks.
     */
    public PagedCallSettings.Builder<ListSubnetworksHttpRequest, SubnetworkList, ListSubnetworksPagedResponse> listSubnetworksSettings() {
      return listSubnetworksSettings;
    }

    @Override
    public SubnetworkAdminSettings build() throws IOException {
      return new SubnetworkAdminSettings(this);
    }
  }
}