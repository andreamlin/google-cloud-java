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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceGroupManagersPagedResponse;
import com.google.compute.v1.stub.HttpJsonInstanceGroupManagerStub;
import com.google.compute.v1.stub.InstanceGroupManagerStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceGroupManagerClient}.
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
 * object. For example, to set the total timeout of abandonInstancesInstanceGroupManager to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceGroupManagerSettings.Builder instanceGroupManagerSettingsBuilder =
 *     InstanceGroupManagerSettings.defaultBuilder();
 * instanceGroupManagerSettingsBuilder.abandonInstancesInstanceGroupManagerSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceGroupManagerSettings instanceGroupManagerSettings = instanceGroupManagerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceGroupManagerSettings extends ClientSettings {
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

  private final SimpleCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerSettings;
  private final PagedCallSettings<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersSettings;
  private final SimpleCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerSettings;
  private final SimpleCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerSettings;
  private final SimpleCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerSettings;
  private final SimpleCallSettings<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerSettings;
  private final PagedCallSettings<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersSettings;
  private final SimpleCallSettings<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersSettings;
  private final SimpleCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerSettings;
  private final SimpleCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerSettings;
  private final SimpleCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerSettings;
  private final SimpleCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerSettings;

  /**
   * Returns the object with the settings used for calls to abandonInstancesInstanceGroupManager.
   */
  public SimpleCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerSettings() {
    return abandonInstancesInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to aggregatedListInstanceGroupManagers.
   */
  public PagedCallSettings<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersSettings() {
    return aggregatedListInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteInstanceGroupManager.
   */
  public SimpleCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerSettings() {
    return deleteInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteInstancesInstanceGroupManager.
   */
  public SimpleCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerSettings() {
    return deleteInstancesInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to getInstanceGroupManager.
   */
  public SimpleCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerSettings() {
    return getInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertInstanceGroupManager.
   */
  public SimpleCallSettings<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerSettings() {
    return insertInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to listInstanceGroupManagers.
   */
  public PagedCallSettings<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersSettings() {
    return listInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to listManagedInstancesInstanceGroupManagers.
   */
  public SimpleCallSettings<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersSettings() {
    return listManagedInstancesInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to recreateInstancesInstanceGroupManager.
   */
  public SimpleCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerSettings() {
    return recreateInstancesInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to resizeInstanceGroupManager.
   */
  public SimpleCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerSettings() {
    return resizeInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setInstanceTemplateInstanceGroupManager.
   */
  public SimpleCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerSettings() {
    return setInstanceTemplateInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setTargetPoolsInstanceGroupManager.
   */
  public SimpleCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerSettings() {
    return setTargetPoolsInstanceGroupManagerSettings;
  }


  public InstanceGroupManagerStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpJsonInstanceGroupManagerStub.create(this);
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
          InstanceGroupManagerSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private InstanceGroupManagerSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    abandonInstancesInstanceGroupManagerSettings = settingsBuilder.abandonInstancesInstanceGroupManagerSettings().build();
    aggregatedListInstanceGroupManagersSettings = settingsBuilder.aggregatedListInstanceGroupManagersSettings().build();
    deleteInstanceGroupManagerSettings = settingsBuilder.deleteInstanceGroupManagerSettings().build();
    deleteInstancesInstanceGroupManagerSettings = settingsBuilder.deleteInstancesInstanceGroupManagerSettings().build();
    getInstanceGroupManagerSettings = settingsBuilder.getInstanceGroupManagerSettings().build();
    insertInstanceGroupManagerSettings = settingsBuilder.insertInstanceGroupManagerSettings().build();
    listInstanceGroupManagersSettings = settingsBuilder.listInstanceGroupManagersSettings().build();
    listManagedInstancesInstanceGroupManagersSettings = settingsBuilder.listManagedInstancesInstanceGroupManagersSettings().build();
    recreateInstancesInstanceGroupManagerSettings = settingsBuilder.recreateInstancesInstanceGroupManagerSettings().build();
    resizeInstanceGroupManagerSettings = settingsBuilder.resizeInstanceGroupManagerSettings().build();
    setInstanceTemplateInstanceGroupManagerSettings = settingsBuilder.setInstanceTemplateInstanceGroupManagerSettings().build();
    setTargetPoolsInstanceGroupManagerSettings = settingsBuilder.setTargetPoolsInstanceGroupManagerSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager> AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListInstanceGroupManagersHttpRequest injectToken(AggregatedListInstanceGroupManagersHttpRequest payload, String token) {
          return AggregatedListInstanceGroupManagersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListInstanceGroupManagersHttpRequest injectPageSize(AggregatedListInstanceGroupManagersHttpRequest payload, int pageSize) {
          return AggregatedListInstanceGroupManagersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListInstanceGroupManagersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(InstanceGroupManagerAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<InstanceGroupManager> extractResources(InstanceGroupManagerAggregatedList payload) {
          return payload.getItems().getInstanceGroupManagers();
        }
      };

  private static final PagedListDescriptor<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager> LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
      new PagedListDescriptor<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListInstanceGroupManagersHttpRequest injectToken(ListInstanceGroupManagersHttpRequest payload, String token) {
          return ListInstanceGroupManagersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListInstanceGroupManagersHttpRequest injectPageSize(ListInstanceGroupManagersHttpRequest payload, int pageSize) {
          return ListInstanceGroupManagersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListInstanceGroupManagersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(InstanceGroupManagerList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<InstanceGroupManager> extractResources(InstanceGroupManagerList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, AggregatedListInstanceGroupManagersPagedResponse> AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, AggregatedListInstanceGroupManagersPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListInstanceGroupManagersPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList> callable,
            AggregatedListInstanceGroupManagersHttpRequest request,
            ApiCallContext context,
            ApiFuture<InstanceGroupManagerAggregatedList> futureResponse) {
          PageContext<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC, request, context);
          return AggregatedListInstanceGroupManagersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, ListInstanceGroupManagersPagedResponse> LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, ListInstanceGroupManagersPagedResponse>() {
        @Override
        public ApiFuture<ListInstanceGroupManagersPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList> callable,
            ListInstanceGroupManagersHttpRequest request,
            ApiCallContext context,
            ApiFuture<InstanceGroupManagerList> futureResponse) {
          PageContext<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager> pageContext =
              PageContext.create(callable, LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC, request, context);
          return ListInstanceGroupManagersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for InstanceGroupManagerSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersSettings;
    private final SimpleCallSettings.Builder<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersSettings;
    private final SimpleCallSettings.Builder<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersSettings;
    private final SimpleCallSettings.Builder<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerSettings;

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

      abandonInstancesInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      aggregatedListInstanceGroupManagersSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      deleteInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      deleteInstancesInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      getInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      insertInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      listInstanceGroupManagersSettings = PagedCallSettings.newBuilder(
          LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listManagedInstancesInstanceGroupManagersSettings = SimpleCallSettings.newBuilder();

      recreateInstancesInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      resizeInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      setInstanceTemplateInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      setTargetPoolsInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          abandonInstancesInstanceGroupManagerSettings,
          aggregatedListInstanceGroupManagersSettings,
          deleteInstanceGroupManagerSettings,
          deleteInstancesInstanceGroupManagerSettings,
          getInstanceGroupManagerSettings,
          insertInstanceGroupManagerSettings,
          listInstanceGroupManagersSettings,
          listManagedInstancesInstanceGroupManagersSettings,
          recreateInstancesInstanceGroupManagerSettings,
          resizeInstanceGroupManagerSettings,
          setInstanceTemplateInstanceGroupManagerSettings,
          setTargetPoolsInstanceGroupManagerSettings
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

      builder.abandonInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.aggregatedListInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listManagedInstancesInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.recreateInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.resizeInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setInstanceTemplateInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setTargetPoolsInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(InstanceGroupManagerSettings settings) {
      super(settings);

      abandonInstancesInstanceGroupManagerSettings = settings.abandonInstancesInstanceGroupManagerSettings.toBuilder();
      aggregatedListInstanceGroupManagersSettings = settings.aggregatedListInstanceGroupManagersSettings.toBuilder();
      deleteInstanceGroupManagerSettings = settings.deleteInstanceGroupManagerSettings.toBuilder();
      deleteInstancesInstanceGroupManagerSettings = settings.deleteInstancesInstanceGroupManagerSettings.toBuilder();
      getInstanceGroupManagerSettings = settings.getInstanceGroupManagerSettings.toBuilder();
      insertInstanceGroupManagerSettings = settings.insertInstanceGroupManagerSettings.toBuilder();
      listInstanceGroupManagersSettings = settings.listInstanceGroupManagersSettings.toBuilder();
      listManagedInstancesInstanceGroupManagersSettings = settings.listManagedInstancesInstanceGroupManagersSettings.toBuilder();
      recreateInstancesInstanceGroupManagerSettings = settings.recreateInstancesInstanceGroupManagerSettings.toBuilder();
      resizeInstanceGroupManagerSettings = settings.resizeInstanceGroupManagerSettings.toBuilder();
      setInstanceTemplateInstanceGroupManagerSettings = settings.setInstanceTemplateInstanceGroupManagerSettings.toBuilder();
      setTargetPoolsInstanceGroupManagerSettings = settings.setTargetPoolsInstanceGroupManagerSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          abandonInstancesInstanceGroupManagerSettings,
          aggregatedListInstanceGroupManagersSettings,
          deleteInstanceGroupManagerSettings,
          deleteInstancesInstanceGroupManagerSettings,
          getInstanceGroupManagerSettings,
          insertInstanceGroupManagerSettings,
          listInstanceGroupManagersSettings,
          listManagedInstancesInstanceGroupManagersSettings,
          recreateInstancesInstanceGroupManagerSettings,
          resizeInstanceGroupManagerSettings,
          setInstanceTemplateInstanceGroupManagerSettings,
          setTargetPoolsInstanceGroupManagerSettings
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
     * Returns the builder for the settings used for calls to abandonInstancesInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<AbandonInstancesInstanceGroupManagerHttpRequest, Operation> abandonInstancesInstanceGroupManagerSettings() {
      return abandonInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, AggregatedListInstanceGroupManagersPagedResponse> aggregatedListInstanceGroupManagersSettings() {
      return aggregatedListInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<DeleteInstanceGroupManagerHttpRequest, Operation> deleteInstanceGroupManagerSettings() {
      return deleteInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstancesInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<DeleteInstancesInstanceGroupManagerHttpRequest, Operation> deleteInstancesInstanceGroupManagerSettings() {
      return deleteInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<GetInstanceGroupManagerHttpRequest, InstanceGroupManager> getInstanceGroupManagerSettings() {
      return getInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<InsertInstanceGroupManagerHttpRequest, Operation> insertInstanceGroupManagerSettings() {
      return insertInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, ListInstanceGroupManagersPagedResponse> listInstanceGroupManagersSettings() {
      return listInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listManagedInstancesInstanceGroupManagers.
     */
    public SimpleCallSettings.Builder<ListManagedInstancesInstanceGroupManagersHttpRequest, InstanceGroupManagersListManagedInstancesResponse> listManagedInstancesInstanceGroupManagersSettings() {
      return listManagedInstancesInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to recreateInstancesInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<RecreateInstancesInstanceGroupManagerHttpRequest, Operation> recreateInstancesInstanceGroupManagerSettings() {
      return recreateInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to resizeInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<ResizeInstanceGroupManagerHttpRequest, Operation> resizeInstanceGroupManagerSettings() {
      return resizeInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setInstanceTemplateInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateInstanceGroupManagerSettings() {
      return setInstanceTemplateInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetPoolsInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation> setTargetPoolsInstanceGroupManagerSettings() {
      return setTargetPoolsInstanceGroupManagerSettings;
    }

    @Override
    public InstanceGroupManagerSettings build() throws IOException {
      return new InstanceGroupManagerSettings(this);
    }
  }
}