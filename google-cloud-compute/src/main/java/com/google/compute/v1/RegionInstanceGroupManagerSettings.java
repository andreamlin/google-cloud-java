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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionInstanceGroupManagersPagedResponse;
import com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub;
import com.google.compute.v1.stub.RegionInstanceGroupManagerStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionInstanceGroupManagerClient}.
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
 * object. For example, to set the total timeout of abandonInstancesRegionInstanceGroupManager to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionInstanceGroupManagerSettings.Builder regionInstanceGroupManagerSettingsBuilder =
 *     RegionInstanceGroupManagerSettings.newBuilder();
 * regionInstanceGroupManagerSettingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RegionInstanceGroupManagerSettings regionInstanceGroupManagerSettings = regionInstanceGroupManagerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionInstanceGroupManagerSettings extends ClientSettings {
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

  private final SimpleCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings;
  private final PagedCallSettings<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersSettings;
  private final SimpleCallSettings<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings;
  private final SimpleCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings;
  private final SimpleCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings;

  /**
   * Returns the object with the settings used for calls to abandonInstancesRegionInstanceGroupManager.
   */
  public SimpleCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings() {
    return abandonInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteRegionInstanceGroupManager.
   */
  public SimpleCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings() {
    return deleteRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteInstancesRegionInstanceGroupManager.
   */
  public SimpleCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings() {
    return deleteInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to getRegionInstanceGroupManager.
   */
  public SimpleCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings() {
    return getRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertRegionInstanceGroupManager.
   */
  public SimpleCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings() {
    return insertRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to listRegionInstanceGroupManagers.
   */
  public PagedCallSettings<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersSettings() {
    return listRegionInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to listManagedInstancesRegionInstanceGroupManagers.
   */
  public SimpleCallSettings<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings() {
    return listManagedInstancesRegionInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to recreateInstancesRegionInstanceGroupManager.
   */
  public SimpleCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings() {
    return recreateInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to resizeRegionInstanceGroupManager.
   */
  public SimpleCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings() {
    return resizeRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setInstanceTemplateRegionInstanceGroupManager.
   */
  public SimpleCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings() {
    return setInstanceTemplateRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setTargetPoolsRegionInstanceGroupManager.
   */
  public SimpleCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings() {
    return setTargetPoolsRegionInstanceGroupManagerSettings;
  }


  public RegionInstanceGroupManagerStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpJsonRegionInstanceGroupManagerStub.create(this);
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
          RegionInstanceGroupManagerSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private RegionInstanceGroupManagerSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    abandonInstancesRegionInstanceGroupManagerSettings = settingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().build();
    deleteRegionInstanceGroupManagerSettings = settingsBuilder.deleteRegionInstanceGroupManagerSettings().build();
    deleteInstancesRegionInstanceGroupManagerSettings = settingsBuilder.deleteInstancesRegionInstanceGroupManagerSettings().build();
    getRegionInstanceGroupManagerSettings = settingsBuilder.getRegionInstanceGroupManagerSettings().build();
    insertRegionInstanceGroupManagerSettings = settingsBuilder.insertRegionInstanceGroupManagerSettings().build();
    listRegionInstanceGroupManagersSettings = settingsBuilder.listRegionInstanceGroupManagersSettings().build();
    listManagedInstancesRegionInstanceGroupManagersSettings = settingsBuilder.listManagedInstancesRegionInstanceGroupManagersSettings().build();
    recreateInstancesRegionInstanceGroupManagerSettings = settingsBuilder.recreateInstancesRegionInstanceGroupManagerSettings().build();
    resizeRegionInstanceGroupManagerSettings = settingsBuilder.resizeRegionInstanceGroupManagerSettings().build();
    setInstanceTemplateRegionInstanceGroupManagerSettings = settingsBuilder.setInstanceTemplateRegionInstanceGroupManagerSettings().build();
    setTargetPoolsRegionInstanceGroupManagerSettings = settingsBuilder.setTargetPoolsRegionInstanceGroupManagerSettings().build();
  }

  private static final PagedListDescriptor<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager> LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
      new PagedListDescriptor<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListRegionInstanceGroupManagersHttpRequest injectToken(ListRegionInstanceGroupManagersHttpRequest payload, String token) {
          return ListRegionInstanceGroupManagersHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListRegionInstanceGroupManagersHttpRequest injectPageSize(ListRegionInstanceGroupManagersHttpRequest payload, int pageSize) {
          return ListRegionInstanceGroupManagersHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListRegionInstanceGroupManagersHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(RegionInstanceGroupManagerList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<InstanceGroupManager> extractResources(RegionInstanceGroupManagerList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse>() {
        @Override
        public ApiFuture<ListRegionInstanceGroupManagersPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList> callable,
            ListRegionInstanceGroupManagersHttpRequest request,
            ApiCallContext context,
            ApiFuture<RegionInstanceGroupManagerList> futureResponse) {
          PageContext<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager> pageContext =
              PageContext.create(callable, LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC, request, context);
          return ListRegionInstanceGroupManagersPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for RegionInstanceGroupManagerSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersSettings;
    private final SimpleCallSettings.Builder<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings;
    private final SimpleCallSettings.Builder<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings;
    private final SimpleCallSettings.Builder<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings;

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

      abandonInstancesRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      deleteRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      deleteInstancesRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      getRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      insertRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      listRegionInstanceGroupManagersSettings = PagedCallSettings.newBuilder(
          LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listManagedInstancesRegionInstanceGroupManagersSettings = SimpleCallSettings.newBuilder();

      recreateInstancesRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      resizeRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      setInstanceTemplateRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      setTargetPoolsRegionInstanceGroupManagerSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          abandonInstancesRegionInstanceGroupManagerSettings,
          deleteRegionInstanceGroupManagerSettings,
          deleteInstancesRegionInstanceGroupManagerSettings,
          getRegionInstanceGroupManagerSettings,
          insertRegionInstanceGroupManagerSettings,
          listRegionInstanceGroupManagersSettings,
          listManagedInstancesRegionInstanceGroupManagersSettings,
          recreateInstancesRegionInstanceGroupManagerSettings,
          resizeRegionInstanceGroupManagerSettings,
          setInstanceTemplateRegionInstanceGroupManagerSettings,
          setTargetPoolsRegionInstanceGroupManagerSettings
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

      builder.abandonInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listRegionInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listManagedInstancesRegionInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.recreateInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.resizeRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setInstanceTemplateRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setTargetPoolsRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(RegionInstanceGroupManagerSettings settings) {
      super(settings);

      abandonInstancesRegionInstanceGroupManagerSettings = settings.abandonInstancesRegionInstanceGroupManagerSettings.toBuilder();
      deleteRegionInstanceGroupManagerSettings = settings.deleteRegionInstanceGroupManagerSettings.toBuilder();
      deleteInstancesRegionInstanceGroupManagerSettings = settings.deleteInstancesRegionInstanceGroupManagerSettings.toBuilder();
      getRegionInstanceGroupManagerSettings = settings.getRegionInstanceGroupManagerSettings.toBuilder();
      insertRegionInstanceGroupManagerSettings = settings.insertRegionInstanceGroupManagerSettings.toBuilder();
      listRegionInstanceGroupManagersSettings = settings.listRegionInstanceGroupManagersSettings.toBuilder();
      listManagedInstancesRegionInstanceGroupManagersSettings = settings.listManagedInstancesRegionInstanceGroupManagersSettings.toBuilder();
      recreateInstancesRegionInstanceGroupManagerSettings = settings.recreateInstancesRegionInstanceGroupManagerSettings.toBuilder();
      resizeRegionInstanceGroupManagerSettings = settings.resizeRegionInstanceGroupManagerSettings.toBuilder();
      setInstanceTemplateRegionInstanceGroupManagerSettings = settings.setInstanceTemplateRegionInstanceGroupManagerSettings.toBuilder();
      setTargetPoolsRegionInstanceGroupManagerSettings = settings.setTargetPoolsRegionInstanceGroupManagerSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          abandonInstancesRegionInstanceGroupManagerSettings,
          deleteRegionInstanceGroupManagerSettings,
          deleteInstancesRegionInstanceGroupManagerSettings,
          getRegionInstanceGroupManagerSettings,
          insertRegionInstanceGroupManagerSettings,
          listRegionInstanceGroupManagersSettings,
          listManagedInstancesRegionInstanceGroupManagersSettings,
          recreateInstancesRegionInstanceGroupManagerSettings,
          resizeRegionInstanceGroupManagerSettings,
          setInstanceTemplateRegionInstanceGroupManagerSettings,
          setTargetPoolsRegionInstanceGroupManagerSettings
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
     * Returns the builder for the settings used for calls to abandonInstancesRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings() {
      return abandonInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings() {
      return deleteRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstancesRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings() {
      return deleteInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings() {
      return getRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings() {
      return insertRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listRegionInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersSettings() {
      return listRegionInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listManagedInstancesRegionInstanceGroupManagers.
     */
    public SimpleCallSettings.Builder<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings() {
      return listManagedInstancesRegionInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to recreateInstancesRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings() {
      return recreateInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to resizeRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings() {
      return resizeRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setInstanceTemplateRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings() {
      return setInstanceTemplateRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetPoolsRegionInstanceGroupManager.
     */
    public SimpleCallSettings.Builder<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings() {
      return setTargetPoolsRegionInstanceGroupManagerSettings;
    }

    @Override
    public RegionInstanceGroupManagerSettings build() throws IOException {
      return new RegionInstanceGroupManagerSettings(this);
    }
  }
}