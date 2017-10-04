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
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
import com.google.compute.v1.stub.HttpInstanceAdminStub;
import com.google.compute.v1.stub.InstanceAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceAdminClient}.
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
 * InstanceAdminSettings.Builder instanceAdminSettingsBuilder =
 *     InstanceAdminSettings.defaultBuilder();
 * instanceAdminSettingsBuilder.addAccessConfigInstanceSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceAdminSettings instanceAdminSettings = instanceAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceAdminSettings extends ClientSettings {
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

  private final SimpleCallSettings<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings;
  private final PagedCallSettings<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> aggregatedListInstancesSettings;
  private final SimpleCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings;
  private final SimpleCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings;
  private final SimpleCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings;
  private final SimpleCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings;
  private final SimpleCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings;
  private final SimpleCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings;
  private final SimpleCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings;
  private final PagedCallSettings<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> listInstancesSettings;
  private final SimpleCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings;
  private final SimpleCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings;
  private final SimpleCallSettings<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings;
  private final SimpleCallSettings<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings;
  private final SimpleCallSettings<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings;
  private final SimpleCallSettings<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings;
  private final SimpleCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings;
  private final SimpleCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings;
  private final SimpleCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings;
  private final SimpleCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings;

  /**
   * Returns the object with the settings used for calls to addAccessConfigInstance.
   */
  public SimpleCallSettings<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings() {
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
  public SimpleCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings() {
    return attachDiskInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteInstance.
   */
  public SimpleCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings() {
    return deleteInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteAccessConfigInstance.
   */
  public SimpleCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings() {
    return deleteAccessConfigInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to detachDiskInstance.
   */
  public SimpleCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings() {
    return detachDiskInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getInstance.
   */
  public SimpleCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings() {
    return getInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to getSerialPortOutputInstance.
   */
  public SimpleCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings() {
    return getSerialPortOutputInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertInstance.
   */
  public SimpleCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings() {
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
  public SimpleCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
    return resetInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setDiskAutoDeleteInstance.
   */
  public SimpleCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings() {
    return setDiskAutoDeleteInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setMachineTypeInstance.
   */
  public SimpleCallSettings<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings() {
    return setMachineTypeInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setMetadataInstance.
   */
  public SimpleCallSettings<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings() {
    return setMetadataInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setSchedulingInstance.
   */
  public SimpleCallSettings<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings() {
    return setSchedulingInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setServiceAccountInstance.
   */
  public SimpleCallSettings<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings() {
    return setServiceAccountInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to setTagsInstance.
   */
  public SimpleCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings() {
    return setTagsInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to startInstance.
   */
  public SimpleCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings() {
    return startInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to startWithEncryptionKeyInstance.
   */
  public SimpleCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings() {
    return startWithEncryptionKeyInstanceSettings;
  }

  /**
   * Returns the object with the settings used for calls to stopInstance.
   */
  public SimpleCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
    return stopInstanceSettings;
  }


  public InstanceAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpInstanceAdminStub.create(this);
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
          InstanceAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private InstanceAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

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
          return payload.getInstancesScopedList().getInstances();
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
   * Builder for InstanceAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings;
    private final PagedCallSettings.Builder<AggregatedListInstancesHttpRequest, InstanceAggregatedList, AggregatedListInstancesPagedResponse> aggregatedListInstancesSettings;
    private final SimpleCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings;
    private final SimpleCallSettings.Builder<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings;
    private final SimpleCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings;
    private final SimpleCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings;
    private final SimpleCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings;
    private final SimpleCallSettings.Builder<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings;
    private final SimpleCallSettings.Builder<InsertInstanceHttpRequest, Operation> insertInstanceSettings;
    private final PagedCallSettings.Builder<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse> listInstancesSettings;
    private final SimpleCallSettings.Builder<ResetInstanceHttpRequest, Operation> resetInstanceSettings;
    private final SimpleCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings;
    private final SimpleCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings;
    private final SimpleCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings;
    private final SimpleCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings;
    private final SimpleCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings;
    private final SimpleCallSettings.Builder<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings;
    private final SimpleCallSettings.Builder<StartInstanceHttpRequest, Operation> startInstanceSettings;
    private final SimpleCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings;
    private final SimpleCallSettings.Builder<StopInstanceHttpRequest, Operation> stopInstanceSettings;

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

      addAccessConfigInstanceSettings = SimpleCallSettings.newBuilder();

      aggregatedListInstancesSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_INSTANCES_PAGE_STR_FACT);

      attachDiskInstanceSettings = SimpleCallSettings.newBuilder();

      deleteInstanceSettings = SimpleCallSettings.newBuilder();

      deleteAccessConfigInstanceSettings = SimpleCallSettings.newBuilder();

      detachDiskInstanceSettings = SimpleCallSettings.newBuilder();

      getInstanceSettings = SimpleCallSettings.newBuilder();

      getSerialPortOutputInstanceSettings = SimpleCallSettings.newBuilder();

      insertInstanceSettings = SimpleCallSettings.newBuilder();

      listInstancesSettings = PagedCallSettings.newBuilder(
          LIST_INSTANCES_PAGE_STR_FACT);

      resetInstanceSettings = SimpleCallSettings.newBuilder();

      setDiskAutoDeleteInstanceSettings = SimpleCallSettings.newBuilder();

      setMachineTypeInstanceSettings = SimpleCallSettings.newBuilder();

      setMetadataInstanceSettings = SimpleCallSettings.newBuilder();

      setSchedulingInstanceSettings = SimpleCallSettings.newBuilder();

      setServiceAccountInstanceSettings = SimpleCallSettings.newBuilder();

      setTagsInstanceSettings = SimpleCallSettings.newBuilder();

      startInstanceSettings = SimpleCallSettings.newBuilder();

      startWithEncryptionKeyInstanceSettings = SimpleCallSettings.newBuilder();

      stopInstanceSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
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
      builder.setTransportProvider(defaultTransportProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
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

    private Builder(InstanceAdminSettings settings) {
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

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
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
     * Returns the builder for the settings used for calls to addAccessConfigInstance.
     */
    public SimpleCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceSettings() {
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
    public SimpleCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings() {
      return attachDiskInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstance.
     */
    public SimpleCallSettings.Builder<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings() {
      return deleteInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteAccessConfigInstance.
     */
    public SimpleCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceSettings() {
      return deleteAccessConfigInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to detachDiskInstance.
     */
    public SimpleCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings() {
      return detachDiskInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getInstance.
     */
    public SimpleCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings() {
      return getInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getSerialPortOutputInstance.
     */
    public SimpleCallSettings.Builder<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceSettings() {
      return getSerialPortOutputInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertInstance.
     */
    public SimpleCallSettings.Builder<InsertInstanceHttpRequest, Operation> insertInstanceSettings() {
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
    public SimpleCallSettings.Builder<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
      return resetInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setDiskAutoDeleteInstance.
     */
    public SimpleCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceSettings() {
      return setDiskAutoDeleteInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setMachineTypeInstance.
     */
    public SimpleCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceSettings() {
      return setMachineTypeInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setMetadataInstance.
     */
    public SimpleCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceSettings() {
      return setMetadataInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setSchedulingInstance.
     */
    public SimpleCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceSettings() {
      return setSchedulingInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setServiceAccountInstance.
     */
    public SimpleCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceSettings() {
      return setServiceAccountInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTagsInstance.
     */
    public SimpleCallSettings.Builder<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings() {
      return setTagsInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to startInstance.
     */
    public SimpleCallSettings.Builder<StartInstanceHttpRequest, Operation> startInstanceSettings() {
      return startInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to startWithEncryptionKeyInstance.
     */
    public SimpleCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceSettings() {
      return startWithEncryptionKeyInstanceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to stopInstance.
     */
    public SimpleCallSettings.Builder<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
      return stopInstanceSettings;
    }

    @Override
    public InstanceAdminSettings build() throws IOException {
      return new InstanceAdminSettings(this);
    }
  }
}