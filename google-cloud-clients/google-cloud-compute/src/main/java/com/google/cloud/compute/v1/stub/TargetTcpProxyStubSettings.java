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

import static com.google.cloud.compute.v1.TargetTcpProxyClient.ListTargetTcpProxiesPagedResponse;

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
import com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest;
import com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest;
import com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest;
import com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest;
import com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest;
import com.google.cloud.compute.v1.TargetTcpProxy;
import com.google.cloud.compute.v1.TargetTcpProxyList;
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
 * Settings class to configure an instance of {@link TargetTcpProxyStub}.
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
 * example, to set the total timeout of getTargetTcpProxy to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetTcpProxyStubSettings.Builder targetTcpProxySettingsBuilder =
 *     TargetTcpProxyStubSettings.newBuilder();
 * targetTcpProxySettingsBuilder.getTargetTcpProxySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetTcpProxyStubSettings targetTcpProxySettings = targetTcpProxySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetTcpProxyStubSettings extends StubSettings<TargetTcpProxyStubSettings> {
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

  private final UnaryCallSettings<DeleteTargetTcpProxyHttpRequest, Operation>
      deleteTargetTcpProxySettings;
  private final OperationCallSettings<DeleteTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetTcpProxyOperationSettings;
  private final UnaryCallSettings<GetTargetTcpProxyHttpRequest, TargetTcpProxy>
      getTargetTcpProxySettings;
  private final UnaryCallSettings<InsertTargetTcpProxyHttpRequest, Operation>
      insertTargetTcpProxySettings;
  private final OperationCallSettings<InsertTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetTcpProxyOperationSettings;
  private final PagedCallSettings<
          ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, ListTargetTcpProxiesPagedResponse>
      listTargetTcpProxiesSettings;
  private final UnaryCallSettings<SetBackendServiceTargetTcpProxyHttpRequest, Operation>
      setBackendServiceTargetTcpProxySettings;
  private final OperationCallSettings<
          SetBackendServiceTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      setBackendServiceTargetTcpProxyOperationSettings;
  private final UnaryCallSettings<SetProxyHeaderTargetTcpProxyHttpRequest, Operation>
      setProxyHeaderTargetTcpProxySettings;
  private final OperationCallSettings<
          SetProxyHeaderTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      setProxyHeaderTargetTcpProxyOperationSettings;

  /** Returns the object with the settings used for calls to deleteTargetTcpProxy. */
  public UnaryCallSettings<DeleteTargetTcpProxyHttpRequest, Operation>
      deleteTargetTcpProxySettings() {
    return deleteTargetTcpProxySettings;
  }

  /** Returns the object with the settings used for calls to deleteTargetTcpProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetTcpProxyOperationSettings() {
    return deleteTargetTcpProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to getTargetTcpProxy. */
  public UnaryCallSettings<GetTargetTcpProxyHttpRequest, TargetTcpProxy>
      getTargetTcpProxySettings() {
    return getTargetTcpProxySettings;
  }

  /** Returns the object with the settings used for calls to insertTargetTcpProxy. */
  public UnaryCallSettings<InsertTargetTcpProxyHttpRequest, Operation>
      insertTargetTcpProxySettings() {
    return insertTargetTcpProxySettings;
  }

  /** Returns the object with the settings used for calls to insertTargetTcpProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<InsertTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetTcpProxyOperationSettings() {
    return insertTargetTcpProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to listTargetTcpProxies. */
  public PagedCallSettings<
          ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, ListTargetTcpProxiesPagedResponse>
      listTargetTcpProxiesSettings() {
    return listTargetTcpProxiesSettings;
  }

  /** Returns the object with the settings used for calls to setBackendServiceTargetTcpProxy. */
  public UnaryCallSettings<SetBackendServiceTargetTcpProxyHttpRequest, Operation>
      setBackendServiceTargetTcpProxySettings() {
    return setBackendServiceTargetTcpProxySettings;
  }

  /** Returns the object with the settings used for calls to setBackendServiceTargetTcpProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetBackendServiceTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      setBackendServiceTargetTcpProxyOperationSettings() {
    return setBackendServiceTargetTcpProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to setProxyHeaderTargetTcpProxy. */
  public UnaryCallSettings<SetProxyHeaderTargetTcpProxyHttpRequest, Operation>
      setProxyHeaderTargetTcpProxySettings() {
    return setProxyHeaderTargetTcpProxySettings;
  }

  /** Returns the object with the settings used for calls to setProxyHeaderTargetTcpProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetProxyHeaderTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
      setProxyHeaderTargetTcpProxyOperationSettings() {
    return setProxyHeaderTargetTcpProxyOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetTcpProxyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetTcpProxyStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(TargetTcpProxyStubSettings.class))
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

  protected TargetTcpProxyStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteTargetTcpProxySettings = settingsBuilder.deleteTargetTcpProxySettings().build();
    deleteTargetTcpProxyOperationSettings =
        settingsBuilder.deleteTargetTcpProxyOperationSettings().build();
    getTargetTcpProxySettings = settingsBuilder.getTargetTcpProxySettings().build();
    insertTargetTcpProxySettings = settingsBuilder.insertTargetTcpProxySettings().build();
    insertTargetTcpProxyOperationSettings =
        settingsBuilder.insertTargetTcpProxyOperationSettings().build();
    listTargetTcpProxiesSettings = settingsBuilder.listTargetTcpProxiesSettings().build();
    setBackendServiceTargetTcpProxySettings =
        settingsBuilder.setBackendServiceTargetTcpProxySettings().build();
    setBackendServiceTargetTcpProxyOperationSettings =
        settingsBuilder.setBackendServiceTargetTcpProxyOperationSettings().build();
    setProxyHeaderTargetTcpProxySettings =
        settingsBuilder.setProxyHeaderTargetTcpProxySettings().build();
    setProxyHeaderTargetTcpProxyOperationSettings =
        settingsBuilder.setProxyHeaderTargetTcpProxyOperationSettings().build();
  }

  private static final PagedListDescriptor<
          ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy>
      LIST_TARGET_TCP_PROXIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTargetTcpProxiesHttpRequest injectToken(
                ListTargetTcpProxiesHttpRequest payload, String token) {
              return ListTargetTcpProxiesHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListTargetTcpProxiesHttpRequest injectPageSize(
                ListTargetTcpProxiesHttpRequest payload, int pageSize) {
              return ListTargetTcpProxiesHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListTargetTcpProxiesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(TargetTcpProxyList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TargetTcpProxy> extractResources(TargetTcpProxyList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<TargetTcpProxy>of();
            }
          };

  private static final PagedListResponseFactory<
          ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, ListTargetTcpProxiesPagedResponse>
      LIST_TARGET_TCP_PROXIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTargetTcpProxiesHttpRequest,
              TargetTcpProxyList,
              ListTargetTcpProxiesPagedResponse>() {
            @Override
            public ApiFuture<ListTargetTcpProxiesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList> callable,
                ListTargetTcpProxiesHttpRequest request,
                ApiCallContext context,
                ApiFuture<TargetTcpProxyList> futureResponse) {
              PageContext<ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, TargetTcpProxy>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TARGET_TCP_PROXIES_PAGE_STR_DESC, request, context);
              return ListTargetTcpProxiesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for TargetTcpProxyStubSettings. */
  public static class Builder extends StubSettings.Builder<TargetTcpProxyStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteTargetTcpProxyHttpRequest, Operation>
        deleteTargetTcpProxySettings;
    private final OperationCallSettings.Builder<
            DeleteTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        deleteTargetTcpProxyOperationSettings;
    private final UnaryCallSettings.Builder<GetTargetTcpProxyHttpRequest, TargetTcpProxy>
        getTargetTcpProxySettings;
    private final UnaryCallSettings.Builder<InsertTargetTcpProxyHttpRequest, Operation>
        insertTargetTcpProxySettings;
    private final OperationCallSettings.Builder<
            InsertTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        insertTargetTcpProxyOperationSettings;
    private final PagedCallSettings.Builder<
            ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, ListTargetTcpProxiesPagedResponse>
        listTargetTcpProxiesSettings;
    private final UnaryCallSettings.Builder<SetBackendServiceTargetTcpProxyHttpRequest, Operation>
        setBackendServiceTargetTcpProxySettings;
    private final OperationCallSettings.Builder<
            SetBackendServiceTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        setBackendServiceTargetTcpProxyOperationSettings;
    private final UnaryCallSettings.Builder<SetProxyHeaderTargetTcpProxyHttpRequest, Operation>
        setProxyHeaderTargetTcpProxySettings;
    private final OperationCallSettings.Builder<
            SetProxyHeaderTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        setProxyHeaderTargetTcpProxyOperationSettings;

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

      deleteTargetTcpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteTargetTcpProxyOperationSettings = OperationCallSettings.newBuilder();

      getTargetTcpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetTcpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetTcpProxyOperationSettings = OperationCallSettings.newBuilder();

      listTargetTcpProxiesSettings =
          PagedCallSettings.newBuilder(LIST_TARGET_TCP_PROXIES_PAGE_STR_FACT);

      setBackendServiceTargetTcpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setBackendServiceTargetTcpProxyOperationSettings = OperationCallSettings.newBuilder();

      setProxyHeaderTargetTcpProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setProxyHeaderTargetTcpProxyOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteTargetTcpProxySettings,
              getTargetTcpProxySettings,
              insertTargetTcpProxySettings,
              listTargetTcpProxiesSettings,
              setBackendServiceTargetTcpProxySettings,
              setProxyHeaderTargetTcpProxySettings);

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
          .deleteTargetTcpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getTargetTcpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertTargetTcpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listTargetTcpProxiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setBackendServiceTargetTcpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setProxyHeaderTargetTcpProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .deleteTargetTcpProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTargetTcpProxyHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
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
          .insertTargetTcpProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertTargetTcpProxyHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
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
          .setBackendServiceTargetTcpProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetBackendServiceTargetTcpProxyHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
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
          .setProxyHeaderTargetTcpProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetProxyHeaderTargetTcpProxyHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.create(EmptyMessage.class))
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

    protected Builder(TargetTcpProxyStubSettings settings) {
      super(settings);

      deleteTargetTcpProxySettings = settings.deleteTargetTcpProxySettings.toBuilder();
      deleteTargetTcpProxyOperationSettings =
          settings.deleteTargetTcpProxyOperationSettings.toBuilder();
      getTargetTcpProxySettings = settings.getTargetTcpProxySettings.toBuilder();
      insertTargetTcpProxySettings = settings.insertTargetTcpProxySettings.toBuilder();
      insertTargetTcpProxyOperationSettings =
          settings.insertTargetTcpProxyOperationSettings.toBuilder();
      listTargetTcpProxiesSettings = settings.listTargetTcpProxiesSettings.toBuilder();
      setBackendServiceTargetTcpProxySettings =
          settings.setBackendServiceTargetTcpProxySettings.toBuilder();
      setBackendServiceTargetTcpProxyOperationSettings =
          settings.setBackendServiceTargetTcpProxyOperationSettings.toBuilder();
      setProxyHeaderTargetTcpProxySettings =
          settings.setProxyHeaderTargetTcpProxySettings.toBuilder();
      setProxyHeaderTargetTcpProxyOperationSettings =
          settings.setProxyHeaderTargetTcpProxyOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteTargetTcpProxySettings,
              getTargetTcpProxySettings,
              insertTargetTcpProxySettings,
              listTargetTcpProxiesSettings,
              setBackendServiceTargetTcpProxySettings,
              setProxyHeaderTargetTcpProxySettings);
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

    /** Returns the builder for the settings used for calls to deleteTargetTcpProxy. */
    public UnaryCallSettings.Builder<DeleteTargetTcpProxyHttpRequest, Operation>
        deleteTargetTcpProxySettings() {
      return deleteTargetTcpProxySettings;
    }

    /** Returns the builder for the settings used for calls to deleteTargetTcpProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        deleteTargetTcpProxyOperationSettings() {
      return deleteTargetTcpProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getTargetTcpProxy. */
    public UnaryCallSettings.Builder<GetTargetTcpProxyHttpRequest, TargetTcpProxy>
        getTargetTcpProxySettings() {
      return getTargetTcpProxySettings;
    }

    /** Returns the builder for the settings used for calls to insertTargetTcpProxy. */
    public UnaryCallSettings.Builder<InsertTargetTcpProxyHttpRequest, Operation>
        insertTargetTcpProxySettings() {
      return insertTargetTcpProxySettings;
    }

    /** Returns the builder for the settings used for calls to insertTargetTcpProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        insertTargetTcpProxyOperationSettings() {
      return insertTargetTcpProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listTargetTcpProxies. */
    public PagedCallSettings.Builder<
            ListTargetTcpProxiesHttpRequest, TargetTcpProxyList, ListTargetTcpProxiesPagedResponse>
        listTargetTcpProxiesSettings() {
      return listTargetTcpProxiesSettings;
    }

    /** Returns the builder for the settings used for calls to setBackendServiceTargetTcpProxy. */
    public UnaryCallSettings.Builder<SetBackendServiceTargetTcpProxyHttpRequest, Operation>
        setBackendServiceTargetTcpProxySettings() {
      return setBackendServiceTargetTcpProxySettings;
    }

    /** Returns the builder for the settings used for calls to setBackendServiceTargetTcpProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetBackendServiceTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        setBackendServiceTargetTcpProxyOperationSettings() {
      return setBackendServiceTargetTcpProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setProxyHeaderTargetTcpProxy. */
    public UnaryCallSettings.Builder<SetProxyHeaderTargetTcpProxyHttpRequest, Operation>
        setProxyHeaderTargetTcpProxySettings() {
      return setProxyHeaderTargetTcpProxySettings;
    }

    /** Returns the builder for the settings used for calls to setProxyHeaderTargetTcpProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetProxyHeaderTargetTcpProxyHttpRequest, EmptyMessage, EmptyMessage>
        setProxyHeaderTargetTcpProxyOperationSettings() {
      return setProxyHeaderTargetTcpProxyOperationSettings;
    }

    @Override
    public TargetTcpProxyStubSettings build() throws IOException {
      return new TargetTcpProxyStubSettings(this);
    }
  }
}
