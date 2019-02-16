/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.HttpHealthCheckClient.ListHttpHealthChecksPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.ApiMessageOperationTransformers;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest;
import com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest;
import com.google.cloud.compute.v1.HttpHealthCheck2;
import com.google.cloud.compute.v1.HttpHealthCheckList;
import com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest;
import com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest;
import com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link HttpHealthCheckStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://www.googleapis.com/compute/v1/projects/) and default
 *       port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getHttpHealthCheck to 30 seconds:
 *
 * <pre>
 * <code>
 * HttpHealthCheckStubSettings.Builder httpHealthCheckSettingsBuilder =
 *     HttpHealthCheckStubSettings.newBuilder();
 * httpHealthCheckSettingsBuilder.getHttpHealthCheckSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * HttpHealthCheckStubSettings httpHealthCheckSettings = httpHealthCheckSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class HttpHealthCheckStubSettings extends StubSettings<HttpHealthCheckStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<DeleteHttpHealthCheckHttpRequest, Operation>
      deleteHttpHealthCheckSettings;
  private final OperationCallSettings<DeleteHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      deleteHttpHealthCheckOperationSettings;
  private final UnaryCallSettings<GetHttpHealthCheckHttpRequest, HttpHealthCheck2>
      getHttpHealthCheckSettings;
  private final UnaryCallSettings<InsertHttpHealthCheckHttpRequest, Operation>
      insertHttpHealthCheckSettings;
  private final OperationCallSettings<InsertHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      insertHttpHealthCheckOperationSettings;
  private final PagedCallSettings<
          ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse>
      listHttpHealthChecksSettings;
  private final UnaryCallSettings<PatchHttpHealthCheckHttpRequest, Operation>
      patchHttpHealthCheckSettings;
  private final OperationCallSettings<PatchHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      patchHttpHealthCheckOperationSettings;
  private final UnaryCallSettings<UpdateHttpHealthCheckHttpRequest, Operation>
      updateHttpHealthCheckSettings;
  private final OperationCallSettings<UpdateHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      updateHttpHealthCheckOperationSettings;

  /** Returns the object with the settings used for calls to deleteHttpHealthCheck. */
  public UnaryCallSettings<DeleteHttpHealthCheckHttpRequest, Operation>
      deleteHttpHealthCheckSettings() {
    return deleteHttpHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to deleteHttpHealthCheck. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      deleteHttpHealthCheckOperationSettings() {
    return deleteHttpHealthCheckOperationSettings;
  }

  /** Returns the object with the settings used for calls to getHttpHealthCheck. */
  public UnaryCallSettings<GetHttpHealthCheckHttpRequest, HttpHealthCheck2>
      getHttpHealthCheckSettings() {
    return getHttpHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to insertHttpHealthCheck. */
  public UnaryCallSettings<InsertHttpHealthCheckHttpRequest, Operation>
      insertHttpHealthCheckSettings() {
    return insertHttpHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to insertHttpHealthCheck. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<InsertHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      insertHttpHealthCheckOperationSettings() {
    return insertHttpHealthCheckOperationSettings;
  }

  /** Returns the object with the settings used for calls to listHttpHealthChecks. */
  public PagedCallSettings<
          ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse>
      listHttpHealthChecksSettings() {
    return listHttpHealthChecksSettings;
  }

  /** Returns the object with the settings used for calls to patchHttpHealthCheck. */
  public UnaryCallSettings<PatchHttpHealthCheckHttpRequest, Operation>
      patchHttpHealthCheckSettings() {
    return patchHttpHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to patchHttpHealthCheck. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<PatchHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      patchHttpHealthCheckOperationSettings() {
    return patchHttpHealthCheckOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateHttpHealthCheck. */
  public UnaryCallSettings<UpdateHttpHealthCheckHttpRequest, Operation>
      updateHttpHealthCheckSettings() {
    return updateHttpHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to updateHttpHealthCheck. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<UpdateHttpHealthCheckHttpRequest, EmptyMessage, Operation>
      updateHttpHealthCheckOperationSettings() {
    return updateHttpHealthCheckOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public HttpHealthCheckStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonHttpHealthCheckStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://www.googleapis.com/compute/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(HttpHealthCheckStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected HttpHealthCheckStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteHttpHealthCheckSettings = settingsBuilder.deleteHttpHealthCheckSettings().build();
    deleteHttpHealthCheckOperationSettings =
        settingsBuilder.deleteHttpHealthCheckOperationSettings().build();
    getHttpHealthCheckSettings = settingsBuilder.getHttpHealthCheckSettings().build();
    insertHttpHealthCheckSettings = settingsBuilder.insertHttpHealthCheckSettings().build();
    insertHttpHealthCheckOperationSettings =
        settingsBuilder.insertHttpHealthCheckOperationSettings().build();
    listHttpHealthChecksSettings = settingsBuilder.listHttpHealthChecksSettings().build();
    patchHttpHealthCheckSettings = settingsBuilder.patchHttpHealthCheckSettings().build();
    patchHttpHealthCheckOperationSettings =
        settingsBuilder.patchHttpHealthCheckOperationSettings().build();
    updateHttpHealthCheckSettings = settingsBuilder.updateHttpHealthCheckSettings().build();
    updateHttpHealthCheckOperationSettings =
        settingsBuilder.updateHttpHealthCheckOperationSettings().build();
  }

  private static final PagedListDescriptor<
          ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck2>
      LIST_HTTP_HEALTH_CHECKS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck2>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListHttpHealthChecksHttpRequest injectToken(
                ListHttpHealthChecksHttpRequest payload, String token) {
              return ListHttpHealthChecksHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListHttpHealthChecksHttpRequest injectPageSize(
                ListHttpHealthChecksHttpRequest payload, int pageSize) {
              return ListHttpHealthChecksHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListHttpHealthChecksHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(HttpHealthCheckList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<HttpHealthCheck2> extractResources(HttpHealthCheckList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<HttpHealthCheck2>of();
            }
          };

  private static final PagedListResponseFactory<
          ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse>
      LIST_HTTP_HEALTH_CHECKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListHttpHealthChecksHttpRequest,
              HttpHealthCheckList,
              ListHttpHealthChecksPagedResponse>() {
            @Override
            public ApiFuture<ListHttpHealthChecksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListHttpHealthChecksHttpRequest, HttpHealthCheckList> callable,
                ListHttpHealthChecksHttpRequest request,
                ApiCallContext context,
                ApiFuture<HttpHealthCheckList> futureResponse) {
              PageContext<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck2>
                  pageContext =
                      PageContext.create(
                          callable, LIST_HTTP_HEALTH_CHECKS_PAGE_STR_DESC, request, context);
              return ListHttpHealthChecksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for HttpHealthCheckStubSettings. */
  public static class Builder extends StubSettings.Builder<HttpHealthCheckStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteHttpHealthCheckHttpRequest, Operation>
        deleteHttpHealthCheckSettings;
    private final OperationCallSettings.Builder<
            DeleteHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        deleteHttpHealthCheckOperationSettings;
    private final UnaryCallSettings.Builder<GetHttpHealthCheckHttpRequest, HttpHealthCheck2>
        getHttpHealthCheckSettings;
    private final UnaryCallSettings.Builder<InsertHttpHealthCheckHttpRequest, Operation>
        insertHttpHealthCheckSettings;
    private final OperationCallSettings.Builder<
            InsertHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        insertHttpHealthCheckOperationSettings;
    private final PagedCallSettings.Builder<
            ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse>
        listHttpHealthChecksSettings;
    private final UnaryCallSettings.Builder<PatchHttpHealthCheckHttpRequest, Operation>
        patchHttpHealthCheckSettings;
    private final OperationCallSettings.Builder<
            PatchHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        patchHttpHealthCheckOperationSettings;
    private final UnaryCallSettings.Builder<UpdateHttpHealthCheckHttpRequest, Operation>
        updateHttpHealthCheckSettings;
    private final OperationCallSettings.Builder<
            UpdateHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        updateHttpHealthCheckOperationSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
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

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      deleteHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteHttpHealthCheckOperationSettings = OperationCallSettings.newBuilder();

      getHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertHttpHealthCheckOperationSettings = OperationCallSettings.newBuilder();

      listHttpHealthChecksSettings =
          PagedCallSettings.newBuilder(LIST_HTTP_HEALTH_CHECKS_PAGE_STR_FACT);

      patchHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchHttpHealthCheckOperationSettings = OperationCallSettings.newBuilder();

      updateHttpHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateHttpHealthCheckOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteHttpHealthCheckSettings,
              getHttpHealthCheckSettings,
              insertHttpHealthCheckSettings,
              listHttpHealthChecksSettings,
              patchHttpHealthCheckSettings,
              updateHttpHealthCheckSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .deleteHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listHttpHealthChecksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateHttpHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .deleteHttpHealthCheckOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteHttpHealthCheckHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .insertHttpHealthCheckOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertHttpHealthCheckHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .patchHttpHealthCheckOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PatchHttpHealthCheckHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .updateHttpHealthCheckOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateHttpHealthCheckHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(HttpHealthCheckStubSettings settings) {
      super(settings);

      deleteHttpHealthCheckSettings = settings.deleteHttpHealthCheckSettings.toBuilder();
      deleteHttpHealthCheckOperationSettings =
          settings.deleteHttpHealthCheckOperationSettings.toBuilder();
      getHttpHealthCheckSettings = settings.getHttpHealthCheckSettings.toBuilder();
      insertHttpHealthCheckSettings = settings.insertHttpHealthCheckSettings.toBuilder();
      insertHttpHealthCheckOperationSettings =
          settings.insertHttpHealthCheckOperationSettings.toBuilder();
      listHttpHealthChecksSettings = settings.listHttpHealthChecksSettings.toBuilder();
      patchHttpHealthCheckSettings = settings.patchHttpHealthCheckSettings.toBuilder();
      patchHttpHealthCheckOperationSettings =
          settings.patchHttpHealthCheckOperationSettings.toBuilder();
      updateHttpHealthCheckSettings = settings.updateHttpHealthCheckSettings.toBuilder();
      updateHttpHealthCheckOperationSettings =
          settings.updateHttpHealthCheckOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteHttpHealthCheckSettings,
              getHttpHealthCheckSettings,
              insertHttpHealthCheckSettings,
              listHttpHealthChecksSettings,
              patchHttpHealthCheckSettings,
              updateHttpHealthCheckSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to deleteHttpHealthCheck. */
    public UnaryCallSettings.Builder<DeleteHttpHealthCheckHttpRequest, Operation>
        deleteHttpHealthCheckSettings() {
      return deleteHttpHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to deleteHttpHealthCheck. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        deleteHttpHealthCheckOperationSettings() {
      return deleteHttpHealthCheckOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getHttpHealthCheck. */
    public UnaryCallSettings.Builder<GetHttpHealthCheckHttpRequest, HttpHealthCheck2>
        getHttpHealthCheckSettings() {
      return getHttpHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to insertHttpHealthCheck. */
    public UnaryCallSettings.Builder<InsertHttpHealthCheckHttpRequest, Operation>
        insertHttpHealthCheckSettings() {
      return insertHttpHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to insertHttpHealthCheck. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        insertHttpHealthCheckOperationSettings() {
      return insertHttpHealthCheckOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listHttpHealthChecks. */
    public PagedCallSettings.Builder<
            ListHttpHealthChecksHttpRequest, HttpHealthCheckList, ListHttpHealthChecksPagedResponse>
        listHttpHealthChecksSettings() {
      return listHttpHealthChecksSettings;
    }

    /** Returns the builder for the settings used for calls to patchHttpHealthCheck. */
    public UnaryCallSettings.Builder<PatchHttpHealthCheckHttpRequest, Operation>
        patchHttpHealthCheckSettings() {
      return patchHttpHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to patchHttpHealthCheck. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<PatchHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        patchHttpHealthCheckOperationSettings() {
      return patchHttpHealthCheckOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateHttpHealthCheck. */
    public UnaryCallSettings.Builder<UpdateHttpHealthCheckHttpRequest, Operation>
        updateHttpHealthCheckSettings() {
      return updateHttpHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to updateHttpHealthCheck. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UpdateHttpHealthCheckHttpRequest, EmptyMessage, Operation>
        updateHttpHealthCheckOperationSettings() {
      return updateHttpHealthCheckOperationSettings;
    }

    @Override
    public HttpHealthCheckStubSettings build() throws IOException {
      return new HttpHealthCheckStubSettings(this);
    }
  }
}
