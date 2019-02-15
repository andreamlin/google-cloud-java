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

import static com.google.cloud.compute.v1.LicenseClient.ListLicensesPagedResponse;

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
import com.google.cloud.compute.v1.DeleteLicenseHttpRequest;
import com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest;
import com.google.cloud.compute.v1.GetLicenseHttpRequest;
import com.google.cloud.compute.v1.InsertLicenseHttpRequest;
import com.google.cloud.compute.v1.License;
import com.google.cloud.compute.v1.LicensesListResponse;
import com.google.cloud.compute.v1.ListLicensesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest;
import com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
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
 * Settings class to configure an instance of {@link LicenseStub}.
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
 * example, to set the total timeout of getLicense to 30 seconds:
 *
 * <pre>
 * <code>
 * LicenseStubSettings.Builder licenseSettingsBuilder =
 *     LicenseStubSettings.newBuilder();
 * licenseSettingsBuilder.getLicenseSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * LicenseStubSettings licenseSettings = licenseSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class LicenseStubSettings extends StubSettings<LicenseStubSettings> {
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

  private final UnaryCallSettings<DeleteLicenseHttpRequest, Operation> deleteLicenseSettings;
  private final OperationCallSettings<DeleteLicenseHttpRequest, EmptyMessage, EmptyMessage>
      deleteLicenseOperationSettings;
  private final UnaryCallSettings<GetLicenseHttpRequest, License> getLicenseSettings;
  private final UnaryCallSettings<GetIamPolicyLicenseHttpRequest, Policy>
      getIamPolicyLicenseSettings;
  private final UnaryCallSettings<InsertLicenseHttpRequest, Operation> insertLicenseSettings;
  private final OperationCallSettings<InsertLicenseHttpRequest, EmptyMessage, EmptyMessage>
      insertLicenseOperationSettings;
  private final PagedCallSettings<
          ListLicensesHttpRequest, LicensesListResponse, ListLicensesPagedResponse>
      listLicensesSettings;
  private final UnaryCallSettings<SetIamPolicyLicenseHttpRequest, Policy>
      setIamPolicyLicenseSettings;
  private final UnaryCallSettings<TestIamPermissionsLicenseHttpRequest, TestPermissionsResponse>
      testIamPermissionsLicenseSettings;

  /** Returns the object with the settings used for calls to deleteLicense. */
  public UnaryCallSettings<DeleteLicenseHttpRequest, Operation> deleteLicenseSettings() {
    return deleteLicenseSettings;
  }

  /** Returns the object with the settings used for calls to deleteLicense. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteLicenseHttpRequest, EmptyMessage, EmptyMessage>
      deleteLicenseOperationSettings() {
    return deleteLicenseOperationSettings;
  }

  /** Returns the object with the settings used for calls to getLicense. */
  public UnaryCallSettings<GetLicenseHttpRequest, License> getLicenseSettings() {
    return getLicenseSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicyLicense. */
  public UnaryCallSettings<GetIamPolicyLicenseHttpRequest, Policy> getIamPolicyLicenseSettings() {
    return getIamPolicyLicenseSettings;
  }

  /** Returns the object with the settings used for calls to insertLicense. */
  public UnaryCallSettings<InsertLicenseHttpRequest, Operation> insertLicenseSettings() {
    return insertLicenseSettings;
  }

  /** Returns the object with the settings used for calls to insertLicense. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<InsertLicenseHttpRequest, EmptyMessage, EmptyMessage>
      insertLicenseOperationSettings() {
    return insertLicenseOperationSettings;
  }

  /** Returns the object with the settings used for calls to listLicenses. */
  public PagedCallSettings<ListLicensesHttpRequest, LicensesListResponse, ListLicensesPagedResponse>
      listLicensesSettings() {
    return listLicensesSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicyLicense. */
  public UnaryCallSettings<SetIamPolicyLicenseHttpRequest, Policy> setIamPolicyLicenseSettings() {
    return setIamPolicyLicenseSettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissionsLicense. */
  public UnaryCallSettings<TestIamPermissionsLicenseHttpRequest, TestPermissionsResponse>
      testIamPermissionsLicenseSettings() {
    return testIamPermissionsLicenseSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LicenseStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonLicenseStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(LicenseStubSettings.class))
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

  protected LicenseStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteLicenseSettings = settingsBuilder.deleteLicenseSettings().build();
    deleteLicenseOperationSettings = settingsBuilder.deleteLicenseOperationSettings().build();
    getLicenseSettings = settingsBuilder.getLicenseSettings().build();
    getIamPolicyLicenseSettings = settingsBuilder.getIamPolicyLicenseSettings().build();
    insertLicenseSettings = settingsBuilder.insertLicenseSettings().build();
    insertLicenseOperationSettings = settingsBuilder.insertLicenseOperationSettings().build();
    listLicensesSettings = settingsBuilder.listLicensesSettings().build();
    setIamPolicyLicenseSettings = settingsBuilder.setIamPolicyLicenseSettings().build();
    testIamPermissionsLicenseSettings = settingsBuilder.testIamPermissionsLicenseSettings().build();
  }

  private static final PagedListDescriptor<ListLicensesHttpRequest, LicensesListResponse, License>
      LIST_LICENSES_PAGE_STR_DESC =
          new PagedListDescriptor<ListLicensesHttpRequest, LicensesListResponse, License>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLicensesHttpRequest injectToken(
                ListLicensesHttpRequest payload, String token) {
              return ListLicensesHttpRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLicensesHttpRequest injectPageSize(
                ListLicensesHttpRequest payload, int pageSize) {
              return ListLicensesHttpRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLicensesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(LicensesListResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<License> extractResources(LicensesListResponse payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<License>of();
            }
          };

  private static final PagedListResponseFactory<
          ListLicensesHttpRequest, LicensesListResponse, ListLicensesPagedResponse>
      LIST_LICENSES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLicensesHttpRequest, LicensesListResponse, ListLicensesPagedResponse>() {
            @Override
            public ApiFuture<ListLicensesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLicensesHttpRequest, LicensesListResponse> callable,
                ListLicensesHttpRequest request,
                ApiCallContext context,
                ApiFuture<LicensesListResponse> futureResponse) {
              PageContext<ListLicensesHttpRequest, LicensesListResponse, License> pageContext =
                  PageContext.create(callable, LIST_LICENSES_PAGE_STR_DESC, request, context);
              return ListLicensesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for LicenseStubSettings. */
  public static class Builder extends StubSettings.Builder<LicenseStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteLicenseHttpRequest, Operation>
        deleteLicenseSettings;
    private final OperationCallSettings.Builder<
            DeleteLicenseHttpRequest, EmptyMessage, EmptyMessage>
        deleteLicenseOperationSettings;
    private final UnaryCallSettings.Builder<GetLicenseHttpRequest, License> getLicenseSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyLicenseHttpRequest, Policy>
        getIamPolicyLicenseSettings;
    private final UnaryCallSettings.Builder<InsertLicenseHttpRequest, Operation>
        insertLicenseSettings;
    private final OperationCallSettings.Builder<
            InsertLicenseHttpRequest, EmptyMessage, EmptyMessage>
        insertLicenseOperationSettings;
    private final PagedCallSettings.Builder<
            ListLicensesHttpRequest, LicensesListResponse, ListLicensesPagedResponse>
        listLicensesSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyLicenseHttpRequest, Policy>
        setIamPolicyLicenseSettings;
    private final UnaryCallSettings.Builder<
            TestIamPermissionsLicenseHttpRequest, TestPermissionsResponse>
        testIamPermissionsLicenseSettings;

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

      deleteLicenseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteLicenseOperationSettings = OperationCallSettings.newBuilder();

      getLicenseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getIamPolicyLicenseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertLicenseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertLicenseOperationSettings = OperationCallSettings.newBuilder();

      listLicensesSettings = PagedCallSettings.newBuilder(LIST_LICENSES_PAGE_STR_FACT);

      setIamPolicyLicenseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      testIamPermissionsLicenseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteLicenseSettings,
              getLicenseSettings,
              getIamPolicyLicenseSettings,
              insertLicenseSettings,
              listLicensesSettings,
              setIamPolicyLicenseSettings,
              testIamPermissionsLicenseSettings);

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
          .deleteLicenseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getLicenseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getIamPolicyLicenseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertLicenseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listLicensesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setIamPolicyLicenseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .testIamPermissionsLicenseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .deleteLicenseOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteLicenseHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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
          .insertLicenseOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertLicenseHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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

    protected Builder(LicenseStubSettings settings) {
      super(settings);

      deleteLicenseSettings = settings.deleteLicenseSettings.toBuilder();
      deleteLicenseOperationSettings = settings.deleteLicenseOperationSettings.toBuilder();
      getLicenseSettings = settings.getLicenseSettings.toBuilder();
      getIamPolicyLicenseSettings = settings.getIamPolicyLicenseSettings.toBuilder();
      insertLicenseSettings = settings.insertLicenseSettings.toBuilder();
      insertLicenseOperationSettings = settings.insertLicenseOperationSettings.toBuilder();
      listLicensesSettings = settings.listLicensesSettings.toBuilder();
      setIamPolicyLicenseSettings = settings.setIamPolicyLicenseSettings.toBuilder();
      testIamPermissionsLicenseSettings = settings.testIamPermissionsLicenseSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteLicenseSettings,
              getLicenseSettings,
              getIamPolicyLicenseSettings,
              insertLicenseSettings,
              listLicensesSettings,
              setIamPolicyLicenseSettings,
              testIamPermissionsLicenseSettings);
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

    /** Returns the builder for the settings used for calls to deleteLicense. */
    public UnaryCallSettings.Builder<DeleteLicenseHttpRequest, Operation> deleteLicenseSettings() {
      return deleteLicenseSettings;
    }

    /** Returns the builder for the settings used for calls to deleteLicense. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteLicenseHttpRequest, EmptyMessage, EmptyMessage>
        deleteLicenseOperationSettings() {
      return deleteLicenseOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getLicense. */
    public UnaryCallSettings.Builder<GetLicenseHttpRequest, License> getLicenseSettings() {
      return getLicenseSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicyLicense. */
    public UnaryCallSettings.Builder<GetIamPolicyLicenseHttpRequest, Policy>
        getIamPolicyLicenseSettings() {
      return getIamPolicyLicenseSettings;
    }

    /** Returns the builder for the settings used for calls to insertLicense. */
    public UnaryCallSettings.Builder<InsertLicenseHttpRequest, Operation> insertLicenseSettings() {
      return insertLicenseSettings;
    }

    /** Returns the builder for the settings used for calls to insertLicense. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertLicenseHttpRequest, EmptyMessage, EmptyMessage>
        insertLicenseOperationSettings() {
      return insertLicenseOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listLicenses. */
    public PagedCallSettings.Builder<
            ListLicensesHttpRequest, LicensesListResponse, ListLicensesPagedResponse>
        listLicensesSettings() {
      return listLicensesSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicyLicense. */
    public UnaryCallSettings.Builder<SetIamPolicyLicenseHttpRequest, Policy>
        setIamPolicyLicenseSettings() {
      return setIamPolicyLicenseSettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissionsLicense. */
    public UnaryCallSettings.Builder<TestIamPermissionsLicenseHttpRequest, TestPermissionsResponse>
        testIamPermissionsLicenseSettings() {
      return testIamPermissionsLicenseSettings;
    }

    @Override
    public LicenseStubSettings build() throws IOException {
      return new LicenseStubSettings(this);
    }
  }
}
