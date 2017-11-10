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
import static com.google.compute.v1.PagedResponseWrappers.ListRegionInstanceGroupManagersPagedResponse;
import com.google.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub;
import com.google.compute.v1.stub.RegionInstanceGroupManagerStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
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
 * regionInstanceGroupManagerSettingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RegionInstanceGroupManagerSettings regionInstanceGroupManagerSettings = regionInstanceGroupManagerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionInstanceGroupManagerSettings extends ClientSettings<RegionInstanceGroupManagerSettings> {
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

  private final UnaryCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings;
  private final PagedCallSettings<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersSettings;
  private final UnaryCallSettings<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings;
  private final UnaryCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings;

  /**
   * Returns the object with the settings used for calls to abandonInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings() {
    return abandonInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteRegionInstanceGroupManager.
   */
  public UnaryCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings() {
    return deleteRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings() {
    return deleteInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to getRegionInstanceGroupManager.
   */
  public UnaryCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings() {
    return getRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertRegionInstanceGroupManager.
   */
  public UnaryCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings() {
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
  public UnaryCallSettings<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings() {
    return listManagedInstancesRegionInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to recreateInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings() {
    return recreateInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to resizeRegionInstanceGroupManager.
   */
  public UnaryCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings() {
    return resizeRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setInstanceTemplateRegionInstanceGroupManager.
   */
  public UnaryCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings() {
    return setInstanceTemplateRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setTargetPoolsRegionInstanceGroupManager.
   */
  public UnaryCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings() {
    return setTargetPoolsRegionInstanceGroupManagerSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionInstanceGroupManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionInstanceGroupManagerStub.create(this);
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
          RegionInstanceGroupManagerSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private RegionInstanceGroupManagerSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

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
  public static class Builder extends ClientSettings.Builder<RegionInstanceGroupManagerSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, ListRegionInstanceGroupManagersPagedResponse> listRegionInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings;

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

      abandonInstancesRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstancesRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listRegionInstanceGroupManagersSettings = PagedCallSettings.newBuilder(
          LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listManagedInstancesRegionInstanceGroupManagersSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      recreateInstancesRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      resizeRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setInstanceTemplateRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTargetPoolsRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
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
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
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

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
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
     * Returns the builder for the settings used for calls to abandonInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation> abandonInstancesRegionInstanceGroupManagerSettings() {
      return abandonInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<DeleteRegionInstanceGroupManagerHttpRequest, Operation> deleteRegionInstanceGroupManagerSettings() {
      return deleteRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation> deleteInstancesRegionInstanceGroupManagerSettings() {
      return deleteInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager> getRegionInstanceGroupManagerSettings() {
      return getRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<InsertRegionInstanceGroupManagerHttpRequest, Operation> insertRegionInstanceGroupManagerSettings() {
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
    public UnaryCallSettings.Builder<ListManagedInstancesRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagersListInstancesResponse> listManagedInstancesRegionInstanceGroupManagersSettings() {
      return listManagedInstancesRegionInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to recreateInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation> recreateInstancesRegionInstanceGroupManagerSettings() {
      return recreateInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to resizeRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<ResizeRegionInstanceGroupManagerHttpRequest, Operation> resizeRegionInstanceGroupManagerSettings() {
      return resizeRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setInstanceTemplateRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation> setInstanceTemplateRegionInstanceGroupManagerSettings() {
      return setInstanceTemplateRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetPoolsRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation> setTargetPoolsRegionInstanceGroupManagerSettings() {
      return setTargetPoolsRegionInstanceGroupManagerSettings;
    }

    @Override
    public RegionInstanceGroupManagerSettings build() throws IOException {
      return new RegionInstanceGroupManagerSettings(this);
    }
  }
}