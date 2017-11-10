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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
import com.google.compute.v1.stub.HttpJsonInstanceStub;
import com.google.compute.v1.stub.InstanceStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceClient}.
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
 * object. For example, to set the total timeout of addAccessConfigInstance to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceSettings.Builder instanceSettingsBuilder =
 *     InstanceSettings.newBuilder();
 * instanceSettingsBuilder.addAccessConfigInstanceSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceSettings instanceSettings = instanceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceSettings extends ClientSettings<InstanceSettings> {
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

  private final UnaryCallSettings<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings;
  private final PagedCallSettings<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> aggregatedListInstancesSettings;
  private final UnaryCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings;
  private final UnaryCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings;
  private final UnaryCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings;
  private final UnaryCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings;
  private final UnaryCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings;
  private final UnaryCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings;
  private final UnaryCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings;
  private final PagedCallSettings<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> listInstancesSettings;
  private final UnaryCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings;
  private final UnaryCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings;
  private final UnaryCallSettings<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings;
  private final UnaryCallSettings<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings;
  private final UnaryCallSettings<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings;
  private final UnaryCallSettings<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings;
  private final UnaryCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings;
  private final UnaryCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings;
  private final UnaryCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings;
  private final UnaryCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings;

  /**
   * Returns the object with the settings used for calls to addAccessConfigInstance.
   */
  public UnaryCallSettings<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings() {
    return addAccessConfigInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to aggregatedListInstances.
   */
  public PagedCallSettings<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> aggregatedListInstancesSettings() {
    return aggregatedListInstancesSettings;
  }

  /**
   * Returns the object with the settings used for calls to attachDiskInstance.
   */
  public UnaryCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings() {
    return attachDiskInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteInstance.
   */
  public UnaryCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings() {
    return deleteInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteAccessConfigInstance.
   */
  public UnaryCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings() {
    return deleteAccessConfigInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to detachDiskInstance.
   */
  public UnaryCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings() {
    return detachDiskInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getInstance.
   */
  public UnaryCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings() {
    return getInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getSerialPortOutputInstance.
   */
  public UnaryCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings() {
    return getSerialPortOutputInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertInstance.
   */
  public UnaryCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings() {
    return insertInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to listInstances.
   */
  public PagedCallSettings<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> listInstancesSettings() {
    return listInstancesSettings;
  }

  /**
   * Returns the object with the settings used for calls to resetInstance.
   */
  public UnaryCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
    return resetInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setDiskAutoDeleteInstance.
   */
  public UnaryCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings() {
    return setDiskAutoDeleteInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setMachineTypeInstance.
   */
  public UnaryCallSettings<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings() {
    return setMachineTypeInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setMetadataInstance.
   */
  public UnaryCallSettings<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings() {
    return setMetadataInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setSchedulingInstance.
   */
  public UnaryCallSettings<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings() {
    return setSchedulingInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setServiceAccountInstance.
   */
  public UnaryCallSettings<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings() {
    return setServiceAccountInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setTagsInstance.
   */
  public UnaryCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings() {
    return setTagsInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to startInstance.
   */
  public UnaryCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings() {
    return startInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to startWithEncryptionKeyInstance.
   */
  public UnaryCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings() {
    return startWithEncryptionKeyInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to stopInstance.
   */
  public UnaryCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
    return stopInstanceSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonInstanceStub.create(this);
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
          InstanceSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private InstanceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addAccessConfigInstanceSettings = settingsBuilder.addAccessConfigInstanceSettings().build();
    aggregatedListInstancesSettings = settingsBuilder.aggregatedListInstancesSettings().build();
    attachDiskInstanceSettings = settingsBuilder.attachDiskInstanceSettings().build();
    deleteInstanceSettings = settingsBuilder.deleteInstanceSettings().build();
    deleteAccessConfigInstanceSettings = settingsBuilder.deleteAccessConfigInstanceSettings().build();
    detachDiskInstanceSettings = settingsBuilder.detachDiskInstanceSettings().build();
    getInstanceSettings = settingsBuilder.getInstanceSettings().build();
    getSerialPortOutputInstanceSettings = settingsBuilder.getSerialPortOutputInstanceSettings().build();
    insertInstanceSettings = settingsBuilder.insertInstanceSettings().build();
    listInstancesSettings = settingsBuilder.listInstancesSettings().build();
    resetInstanceSettings = settingsBuilder.resetInstanceSettings().build();
    setDiskAutoDeleteInstanceSettings = settingsBuilder.setDiskAutoDeleteInstanceSettings().build();
    setMachineTypeInstanceSettings = settingsBuilder.setMachineTypeInstanceSettings().build();
    setMetadataInstanceSettings = settingsBuilder.setMetadataInstanceSettings().build();
    setSchedulingInstanceSettings = settingsBuilder.setSchedulingInstanceSettings().build();
    setServiceAccountInstanceSettings = settingsBuilder.setServiceAccountInstanceSettings().build();
    setTagsInstanceSettings = settingsBuilder.setTagsInstanceSettings().build();
    startInstanceSettings = settingsBuilder.startInstanceSettings().build();
    startWithEncryptionKeyInstanceSettings = settingsBuilder.startWithEncryptionKeyInstanceSettings().build();
    stopInstanceSettings = settingsBuilder.stopInstanceSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance> AGGREGATED_LIST_INSTANCES_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListInstancesHttpRequest injectToken(AggregatedListInstancesHttpRequest payload, String token) {
          return AggregatedListInstancesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListInstancesHttpRequest injectPageSize(AggregatedListInstancesHttpRequest payload, int pageSize) {
          return AggregatedListInstancesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListInstancesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(InstanceAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Instance> extractResources(InstanceAggregatedList payload) {
          return payload.getItems().getInstances();
        }
      };

  private static final PagedListDescriptor<ListInstancesHttpRequest, InstanceList, Instance> LIST_INSTANCES_PAGE_STR_DESC =
      new PagedListDescriptor<ListInstancesHttpRequest, InstanceList, Instance>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListInstancesHttpRequest injectToken(ListInstancesHttpRequest payload, String token) {
          return ListInstancesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListInstancesHttpRequest injectPageSize(ListInstancesHttpRequest payload, int pageSize) {
          return ListInstancesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListInstancesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(InstanceList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Instance> extractResources(InstanceList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> AGGREGATED_LIST_INSTANCES_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListInstancesPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> callable,
            AggregatedListInstancesHttpRequest request,
            ApiCallContext context,
            ApiFuture<InstanceAggregatedList> futureResponse) {
          PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_INSTANCES_PAGE_STR_DESC, request, context);
          return AggregatedListInstancesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> LIST_INSTANCES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>() {
        @Override
        public ApiFuture<ListInstancesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListInstancesHttpRequest, InstanceList> callable,
            ListInstancesHttpRequest request,
            ApiCallContext context,
            ApiFuture<InstanceList> futureResponse) {
          PageContext<ListInstancesHttpRequest, InstanceList, Instance> pageContext =
              PageContext.create(callable, LIST_INSTANCES_PAGE_STR_DESC, request, context);
          return ListInstancesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for InstanceSettings.
   */
  public static class Builder extends ClientSettings.Builder<InstanceSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings;
    private final PagedCallSettings.Builder<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> aggregatedListInstancesSettings;
    private final UnaryCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings;
    private final UnaryCallSettings.Builder<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings;
    private final UnaryCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings;
    private final UnaryCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings;
    private final UnaryCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings;
    private final UnaryCallSettings.Builder<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings;
    private final UnaryCallSettings.Builder<InsertInstanceHttpRequest, Operation> insertInstanceSettings;
    private final PagedCallSettings.Builder<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> listInstancesSettings;
    private final UnaryCallSettings.Builder<ResetInstanceHttpRequest, Operation> resetInstanceSettings;
    private final UnaryCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings;
    private final UnaryCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings;
    private final UnaryCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings;
    private final UnaryCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings;
    private final UnaryCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings;
    private final UnaryCallSettings.Builder<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings;
    private final UnaryCallSettings.Builder<StartInstanceHttpRequest, Operation> startInstanceSettings;
    private final UnaryCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings;
    private final UnaryCallSettings.Builder<StopInstanceHttpRequest, Operation> stopInstanceSettings;

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

      addAccessConfigInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      aggregatedListInstancesSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_INSTANCES_PAGE_STR_FACT);

      attachDiskInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteAccessConfigInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      detachDiskInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSerialPortOutputInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listInstancesSettings = PagedCallSettings.newBuilder(
          LIST_INSTANCES_PAGE_STR_FACT);

      resetInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setDiskAutoDeleteInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setMachineTypeInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setMetadataInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setSchedulingInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setServiceAccountInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTagsInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      startInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      startWithEncryptionKeyInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      stopInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          addAccessConfigInstanceSettings,
          aggregatedListInstancesSettings,
          attachDiskInstanceSettings,
          deleteInstanceSettings,
          deleteAccessConfigInstanceSettings,
          detachDiskInstanceSettings,
          getInstanceSettings,
          getSerialPortOutputInstanceSettings,
          insertInstanceSettings,
          listInstancesSettings,
          resetInstanceSettings,
          setDiskAutoDeleteInstanceSettings,
          setMachineTypeInstanceSettings,
          setMetadataInstanceSettings,
          setSchedulingInstanceSettings,
          setServiceAccountInstanceSettings,
          setTagsInstanceSettings,
          startInstanceSettings,
          startWithEncryptionKeyInstanceSettings,
          stopInstanceSettings
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

      builder.addAccessConfigInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.aggregatedListInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.attachDiskInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteAccessConfigInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.detachDiskInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getSerialPortOutputInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.resetInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setDiskAutoDeleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setMachineTypeInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setMetadataInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setSchedulingInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setServiceAccountInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.setTagsInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.startInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.startWithEncryptionKeyInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.stopInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(InstanceSettings settings) {
      super(settings);

      addAccessConfigInstanceSettings = settings.addAccessConfigInstanceSettings.toBuilder();
      aggregatedListInstancesSettings = settings.aggregatedListInstancesSettings.toBuilder();
      attachDiskInstanceSettings = settings.attachDiskInstanceSettings.toBuilder();
      deleteInstanceSettings = settings.deleteInstanceSettings.toBuilder();
      deleteAccessConfigInstanceSettings = settings.deleteAccessConfigInstanceSettings.toBuilder();
      detachDiskInstanceSettings = settings.detachDiskInstanceSettings.toBuilder();
      getInstanceSettings = settings.getInstanceSettings.toBuilder();
      getSerialPortOutputInstanceSettings = settings.getSerialPortOutputInstanceSettings.toBuilder();
      insertInstanceSettings = settings.insertInstanceSettings.toBuilder();
      listInstancesSettings = settings.listInstancesSettings.toBuilder();
      resetInstanceSettings = settings.resetInstanceSettings.toBuilder();
      setDiskAutoDeleteInstanceSettings = settings.setDiskAutoDeleteInstanceSettings.toBuilder();
      setMachineTypeInstanceSettings = settings.setMachineTypeInstanceSettings.toBuilder();
      setMetadataInstanceSettings = settings.setMetadataInstanceSettings.toBuilder();
      setSchedulingInstanceSettings = settings.setSchedulingInstanceSettings.toBuilder();
      setServiceAccountInstanceSettings = settings.setServiceAccountInstanceSettings.toBuilder();
      setTagsInstanceSettings = settings.setTagsInstanceSettings.toBuilder();
      startInstanceSettings = settings.startInstanceSettings.toBuilder();
      startWithEncryptionKeyInstanceSettings = settings.startWithEncryptionKeyInstanceSettings.toBuilder();
      stopInstanceSettings = settings.stopInstanceSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          addAccessConfigInstanceSettings,
          aggregatedListInstancesSettings,
          attachDiskInstanceSettings,
          deleteInstanceSettings,
          deleteAccessConfigInstanceSettings,
          detachDiskInstanceSettings,
          getInstanceSettings,
          getSerialPortOutputInstanceSettings,
          insertInstanceSettings,
          listInstancesSettings,
          resetInstanceSettings,
          setDiskAutoDeleteInstanceSettings,
          setMachineTypeInstanceSettings,
          setMetadataInstanceSettings,
          setSchedulingInstanceSettings,
          setServiceAccountInstanceSettings,
          setTagsInstanceSettings,
          startInstanceSettings,
          startWithEncryptionKeyInstanceSettings,
          stopInstanceSettings
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
     * Returns the builder for the settings used for calls to addAccessConfigInstance.
     */
    public UnaryCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings() {
      return addAccessConfigInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListInstances.
     */
    public PagedCallSettings.Builder<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> aggregatedListInstancesSettings() {
      return aggregatedListInstancesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to attachDiskInstance.
     */
    public UnaryCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings() {
      return attachDiskInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstance.
     */
    public UnaryCallSettings.Builder<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings() {
      return deleteInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteAccessConfigInstance.
     */
    public UnaryCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings() {
      return deleteAccessConfigInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to detachDiskInstance.
     */
    public UnaryCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings() {
      return detachDiskInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getInstance.
     */
    public UnaryCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings() {
      return getInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getSerialPortOutputInstance.
     */
    public UnaryCallSettings.Builder<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings() {
      return getSerialPortOutputInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertInstance.
     */
    public UnaryCallSettings.Builder<InsertInstanceHttpRequest, Operation> insertInstanceSettings() {
      return insertInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listInstances.
     */
    public PagedCallSettings.Builder<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> listInstancesSettings() {
      return listInstancesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to resetInstance.
     */
    public UnaryCallSettings.Builder<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
      return resetInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setDiskAutoDeleteInstance.
     */
    public UnaryCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings() {
      return setDiskAutoDeleteInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setMachineTypeInstance.
     */
    public UnaryCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings() {
      return setMachineTypeInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setMetadataInstance.
     */
    public UnaryCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings() {
      return setMetadataInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setSchedulingInstance.
     */
    public UnaryCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings() {
      return setSchedulingInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setServiceAccountInstance.
     */
    public UnaryCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings() {
      return setServiceAccountInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTagsInstance.
     */
    public UnaryCallSettings.Builder<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings() {
      return setTagsInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to startInstance.
     */
    public UnaryCallSettings.Builder<StartInstanceHttpRequest, Operation> startInstanceSettings() {
      return startInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to startWithEncryptionKeyInstance.
     */
    public UnaryCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings() {
      return startWithEncryptionKeyInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to stopInstance.
     */
    public UnaryCallSettings.Builder<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
      return stopInstanceSettings;
    }

    @Override
    public InstanceSettings build() throws IOException {
      return new InstanceSettings(this);
    }
  }
}