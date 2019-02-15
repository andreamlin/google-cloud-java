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

import static com.google.cloud.compute.v1.TargetSslProxyClient.ListTargetSslProxiesPagedResponse;

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
import com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest;
import com.google.cloud.compute.v1.TargetSslProxy;
import com.google.cloud.compute.v1.TargetSslProxyList;
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
 * Settings class to configure an instance of {@link TargetSslProxyStub}.
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
 * example, to set the total timeout of getTargetSslProxy to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetSslProxyStubSettings.Builder targetSslProxySettingsBuilder =
 *     TargetSslProxyStubSettings.newBuilder();
 * targetSslProxySettingsBuilder.getTargetSslProxySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetSslProxyStubSettings targetSslProxySettings = targetSslProxySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetSslProxyStubSettings extends StubSettings<TargetSslProxyStubSettings> {
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

  private final UnaryCallSettings<DeleteTargetSslProxyHttpRequest, Operation>
      deleteTargetSslProxySettings;
  private final OperationCallSettings<DeleteTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetSslProxyOperationSettings;
  private final UnaryCallSettings<GetTargetSslProxyHttpRequest, TargetSslProxy>
      getTargetSslProxySettings;
  private final UnaryCallSettings<InsertTargetSslProxyHttpRequest, Operation>
      insertTargetSslProxySettings;
  private final OperationCallSettings<InsertTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetSslProxyOperationSettings;
  private final PagedCallSettings<
          ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse>
      listTargetSslProxiesSettings;
  private final UnaryCallSettings<SetBackendServiceTargetSslProxyHttpRequest, Operation>
      setBackendServiceTargetSslProxySettings;
  private final OperationCallSettings<
          SetBackendServiceTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setBackendServiceTargetSslProxyOperationSettings;
  private final UnaryCallSettings<SetProxyHeaderTargetSslProxyHttpRequest, Operation>
      setProxyHeaderTargetSslProxySettings;
  private final OperationCallSettings<
          SetProxyHeaderTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setProxyHeaderTargetSslProxyOperationSettings;
  private final UnaryCallSettings<SetSslCertificatesTargetSslProxyHttpRequest, Operation>
      setSslCertificatesTargetSslProxySettings;
  private final OperationCallSettings<
          SetSslCertificatesTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslCertificatesTargetSslProxyOperationSettings;
  private final UnaryCallSettings<SetSslPolicyTargetSslProxyHttpRequest, Operation>
      setSslPolicyTargetSslProxySettings;
  private final OperationCallSettings<
          SetSslPolicyTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslPolicyTargetSslProxyOperationSettings;

  /** Returns the object with the settings used for calls to deleteTargetSslProxy. */
  public UnaryCallSettings<DeleteTargetSslProxyHttpRequest, Operation>
      deleteTargetSslProxySettings() {
    return deleteTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to deleteTargetSslProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetSslProxyOperationSettings() {
    return deleteTargetSslProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to getTargetSslProxy. */
  public UnaryCallSettings<GetTargetSslProxyHttpRequest, TargetSslProxy>
      getTargetSslProxySettings() {
    return getTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to insertTargetSslProxy. */
  public UnaryCallSettings<InsertTargetSslProxyHttpRequest, Operation>
      insertTargetSslProxySettings() {
    return insertTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to insertTargetSslProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<InsertTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetSslProxyOperationSettings() {
    return insertTargetSslProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to listTargetSslProxies. */
  public PagedCallSettings<
          ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse>
      listTargetSslProxiesSettings() {
    return listTargetSslProxiesSettings;
  }

  /** Returns the object with the settings used for calls to setBackendServiceTargetSslProxy. */
  public UnaryCallSettings<SetBackendServiceTargetSslProxyHttpRequest, Operation>
      setBackendServiceTargetSslProxySettings() {
    return setBackendServiceTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to setBackendServiceTargetSslProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetBackendServiceTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setBackendServiceTargetSslProxyOperationSettings() {
    return setBackendServiceTargetSslProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to setProxyHeaderTargetSslProxy. */
  public UnaryCallSettings<SetProxyHeaderTargetSslProxyHttpRequest, Operation>
      setProxyHeaderTargetSslProxySettings() {
    return setProxyHeaderTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to setProxyHeaderTargetSslProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetProxyHeaderTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setProxyHeaderTargetSslProxyOperationSettings() {
    return setProxyHeaderTargetSslProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to setSslCertificatesTargetSslProxy. */
  public UnaryCallSettings<SetSslCertificatesTargetSslProxyHttpRequest, Operation>
      setSslCertificatesTargetSslProxySettings() {
    return setSslCertificatesTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to setSslCertificatesTargetSslProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetSslCertificatesTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslCertificatesTargetSslProxyOperationSettings() {
    return setSslCertificatesTargetSslProxyOperationSettings;
  }

  /** Returns the object with the settings used for calls to setSslPolicyTargetSslProxy. */
  public UnaryCallSettings<SetSslPolicyTargetSslProxyHttpRequest, Operation>
      setSslPolicyTargetSslProxySettings() {
    return setSslPolicyTargetSslProxySettings;
  }

  /** Returns the object with the settings used for calls to setSslPolicyTargetSslProxy. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetSslPolicyTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslPolicyTargetSslProxyOperationSettings() {
    return setSslPolicyTargetSslProxyOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetSslProxyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetSslProxyStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(TargetSslProxyStubSettings.class))
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

  protected TargetSslProxyStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteTargetSslProxySettings = settingsBuilder.deleteTargetSslProxySettings().build();
    deleteTargetSslProxyOperationSettings =
        settingsBuilder.deleteTargetSslProxyOperationSettings().build();
    getTargetSslProxySettings = settingsBuilder.getTargetSslProxySettings().build();
    insertTargetSslProxySettings = settingsBuilder.insertTargetSslProxySettings().build();
    insertTargetSslProxyOperationSettings =
        settingsBuilder.insertTargetSslProxyOperationSettings().build();
    listTargetSslProxiesSettings = settingsBuilder.listTargetSslProxiesSettings().build();
    setBackendServiceTargetSslProxySettings =
        settingsBuilder.setBackendServiceTargetSslProxySettings().build();
    setBackendServiceTargetSslProxyOperationSettings =
        settingsBuilder.setBackendServiceTargetSslProxyOperationSettings().build();
    setProxyHeaderTargetSslProxySettings =
        settingsBuilder.setProxyHeaderTargetSslProxySettings().build();
    setProxyHeaderTargetSslProxyOperationSettings =
        settingsBuilder.setProxyHeaderTargetSslProxyOperationSettings().build();
    setSslCertificatesTargetSslProxySettings =
        settingsBuilder.setSslCertificatesTargetSslProxySettings().build();
    setSslCertificatesTargetSslProxyOperationSettings =
        settingsBuilder.setSslCertificatesTargetSslProxyOperationSettings().build();
    setSslPolicyTargetSslProxySettings =
        settingsBuilder.setSslPolicyTargetSslProxySettings().build();
    setSslPolicyTargetSslProxyOperationSettings =
        settingsBuilder.setSslPolicyTargetSslProxyOperationSettings().build();
  }

  private static final PagedListDescriptor<
          ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy>
      LIST_TARGET_SSL_PROXIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTargetSslProxiesHttpRequest injectToken(
                ListTargetSslProxiesHttpRequest payload, String token) {
              return ListTargetSslProxiesHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListTargetSslProxiesHttpRequest injectPageSize(
                ListTargetSslProxiesHttpRequest payload, int pageSize) {
              return ListTargetSslProxiesHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListTargetSslProxiesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(TargetSslProxyList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TargetSslProxy> extractResources(TargetSslProxyList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<TargetSslProxy>of();
            }
          };

  private static final PagedListResponseFactory<
          ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse>
      LIST_TARGET_SSL_PROXIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTargetSslProxiesHttpRequest,
              TargetSslProxyList,
              ListTargetSslProxiesPagedResponse>() {
            @Override
            public ApiFuture<ListTargetSslProxiesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTargetSslProxiesHttpRequest, TargetSslProxyList> callable,
                ListTargetSslProxiesHttpRequest request,
                ApiCallContext context,
                ApiFuture<TargetSslProxyList> futureResponse) {
              PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TARGET_SSL_PROXIES_PAGE_STR_DESC, request, context);
              return ListTargetSslProxiesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for TargetSslProxyStubSettings. */
  public static class Builder extends StubSettings.Builder<TargetSslProxyStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteTargetSslProxyHttpRequest, Operation>
        deleteTargetSslProxySettings;
    private final OperationCallSettings.Builder<
            DeleteTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        deleteTargetSslProxyOperationSettings;
    private final UnaryCallSettings.Builder<GetTargetSslProxyHttpRequest, TargetSslProxy>
        getTargetSslProxySettings;
    private final UnaryCallSettings.Builder<InsertTargetSslProxyHttpRequest, Operation>
        insertTargetSslProxySettings;
    private final OperationCallSettings.Builder<
            InsertTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        insertTargetSslProxyOperationSettings;
    private final PagedCallSettings.Builder<
            ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse>
        listTargetSslProxiesSettings;
    private final UnaryCallSettings.Builder<SetBackendServiceTargetSslProxyHttpRequest, Operation>
        setBackendServiceTargetSslProxySettings;
    private final OperationCallSettings.Builder<
            SetBackendServiceTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setBackendServiceTargetSslProxyOperationSettings;
    private final UnaryCallSettings.Builder<SetProxyHeaderTargetSslProxyHttpRequest, Operation>
        setProxyHeaderTargetSslProxySettings;
    private final OperationCallSettings.Builder<
            SetProxyHeaderTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setProxyHeaderTargetSslProxyOperationSettings;
    private final UnaryCallSettings.Builder<SetSslCertificatesTargetSslProxyHttpRequest, Operation>
        setSslCertificatesTargetSslProxySettings;
    private final OperationCallSettings.Builder<
            SetSslCertificatesTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setSslCertificatesTargetSslProxyOperationSettings;
    private final UnaryCallSettings.Builder<SetSslPolicyTargetSslProxyHttpRequest, Operation>
        setSslPolicyTargetSslProxySettings;
    private final OperationCallSettings.Builder<
            SetSslPolicyTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setSslPolicyTargetSslProxyOperationSettings;

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

      deleteTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteTargetSslProxyOperationSettings = OperationCallSettings.newBuilder();

      getTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertTargetSslProxyOperationSettings = OperationCallSettings.newBuilder();

      listTargetSslProxiesSettings =
          PagedCallSettings.newBuilder(LIST_TARGET_SSL_PROXIES_PAGE_STR_FACT);

      setBackendServiceTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setBackendServiceTargetSslProxyOperationSettings = OperationCallSettings.newBuilder();

      setProxyHeaderTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setProxyHeaderTargetSslProxyOperationSettings = OperationCallSettings.newBuilder();

      setSslCertificatesTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setSslCertificatesTargetSslProxyOperationSettings = OperationCallSettings.newBuilder();

      setSslPolicyTargetSslProxySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setSslPolicyTargetSslProxyOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteTargetSslProxySettings,
              getTargetSslProxySettings,
              insertTargetSslProxySettings,
              listTargetSslProxiesSettings,
              setBackendServiceTargetSslProxySettings,
              setProxyHeaderTargetSslProxySettings,
              setSslCertificatesTargetSslProxySettings,
              setSslPolicyTargetSslProxySettings);

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
          .deleteTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listTargetSslProxiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setBackendServiceTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setProxyHeaderTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setSslCertificatesTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setSslPolicyTargetSslProxySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .deleteTargetSslProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTargetSslProxyHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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
          .insertTargetSslProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertTargetSslProxyHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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
          .setBackendServiceTargetSslProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetBackendServiceTargetSslProxyHttpRequest, OperationSnapshot>
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
          .setProxyHeaderTargetSslProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetProxyHeaderTargetSslProxyHttpRequest, OperationSnapshot>
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
          .setSslCertificatesTargetSslProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetSslCertificatesTargetSslProxyHttpRequest, OperationSnapshot>
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
          .setSslPolicyTargetSslProxyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetSslPolicyTargetSslProxyHttpRequest, OperationSnapshot>
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

    protected Builder(TargetSslProxyStubSettings settings) {
      super(settings);

      deleteTargetSslProxySettings = settings.deleteTargetSslProxySettings.toBuilder();
      deleteTargetSslProxyOperationSettings =
          settings.deleteTargetSslProxyOperationSettings.toBuilder();
      getTargetSslProxySettings = settings.getTargetSslProxySettings.toBuilder();
      insertTargetSslProxySettings = settings.insertTargetSslProxySettings.toBuilder();
      insertTargetSslProxyOperationSettings =
          settings.insertTargetSslProxyOperationSettings.toBuilder();
      listTargetSslProxiesSettings = settings.listTargetSslProxiesSettings.toBuilder();
      setBackendServiceTargetSslProxySettings =
          settings.setBackendServiceTargetSslProxySettings.toBuilder();
      setBackendServiceTargetSslProxyOperationSettings =
          settings.setBackendServiceTargetSslProxyOperationSettings.toBuilder();
      setProxyHeaderTargetSslProxySettings =
          settings.setProxyHeaderTargetSslProxySettings.toBuilder();
      setProxyHeaderTargetSslProxyOperationSettings =
          settings.setProxyHeaderTargetSslProxyOperationSettings.toBuilder();
      setSslCertificatesTargetSslProxySettings =
          settings.setSslCertificatesTargetSslProxySettings.toBuilder();
      setSslCertificatesTargetSslProxyOperationSettings =
          settings.setSslCertificatesTargetSslProxyOperationSettings.toBuilder();
      setSslPolicyTargetSslProxySettings = settings.setSslPolicyTargetSslProxySettings.toBuilder();
      setSslPolicyTargetSslProxyOperationSettings =
          settings.setSslPolicyTargetSslProxyOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteTargetSslProxySettings,
              getTargetSslProxySettings,
              insertTargetSslProxySettings,
              listTargetSslProxiesSettings,
              setBackendServiceTargetSslProxySettings,
              setProxyHeaderTargetSslProxySettings,
              setSslCertificatesTargetSslProxySettings,
              setSslPolicyTargetSslProxySettings);
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

    /** Returns the builder for the settings used for calls to deleteTargetSslProxy. */
    public UnaryCallSettings.Builder<DeleteTargetSslProxyHttpRequest, Operation>
        deleteTargetSslProxySettings() {
      return deleteTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to deleteTargetSslProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        deleteTargetSslProxyOperationSettings() {
      return deleteTargetSslProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getTargetSslProxy. */
    public UnaryCallSettings.Builder<GetTargetSslProxyHttpRequest, TargetSslProxy>
        getTargetSslProxySettings() {
      return getTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to insertTargetSslProxy. */
    public UnaryCallSettings.Builder<InsertTargetSslProxyHttpRequest, Operation>
        insertTargetSslProxySettings() {
      return insertTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to insertTargetSslProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        insertTargetSslProxyOperationSettings() {
      return insertTargetSslProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listTargetSslProxies. */
    public PagedCallSettings.Builder<
            ListTargetSslProxiesHttpRequest, TargetSslProxyList, ListTargetSslProxiesPagedResponse>
        listTargetSslProxiesSettings() {
      return listTargetSslProxiesSettings;
    }

    /** Returns the builder for the settings used for calls to setBackendServiceTargetSslProxy. */
    public UnaryCallSettings.Builder<SetBackendServiceTargetSslProxyHttpRequest, Operation>
        setBackendServiceTargetSslProxySettings() {
      return setBackendServiceTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to setBackendServiceTargetSslProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetBackendServiceTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setBackendServiceTargetSslProxyOperationSettings() {
      return setBackendServiceTargetSslProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setProxyHeaderTargetSslProxy. */
    public UnaryCallSettings.Builder<SetProxyHeaderTargetSslProxyHttpRequest, Operation>
        setProxyHeaderTargetSslProxySettings() {
      return setProxyHeaderTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to setProxyHeaderTargetSslProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetProxyHeaderTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setProxyHeaderTargetSslProxyOperationSettings() {
      return setProxyHeaderTargetSslProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setSslCertificatesTargetSslProxy. */
    public UnaryCallSettings.Builder<SetSslCertificatesTargetSslProxyHttpRequest, Operation>
        setSslCertificatesTargetSslProxySettings() {
      return setSslCertificatesTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to setSslCertificatesTargetSslProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSslCertificatesTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setSslCertificatesTargetSslProxyOperationSettings() {
      return setSslCertificatesTargetSslProxyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setSslPolicyTargetSslProxy. */
    public UnaryCallSettings.Builder<SetSslPolicyTargetSslProxyHttpRequest, Operation>
        setSslPolicyTargetSslProxySettings() {
      return setSslPolicyTargetSslProxySettings;
    }

    /** Returns the builder for the settings used for calls to setSslPolicyTargetSslProxy. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSslPolicyTargetSslProxyHttpRequest, EmptyMessage, EmptyMessage>
        setSslPolicyTargetSslProxyOperationSettings() {
      return setSslPolicyTargetSslProxyOperationSettings;
    }

    @Override
    public TargetSslProxyStubSettings build() throws IOException {
      return new TargetSslProxyStubSettings(this);
    }
  }
}
