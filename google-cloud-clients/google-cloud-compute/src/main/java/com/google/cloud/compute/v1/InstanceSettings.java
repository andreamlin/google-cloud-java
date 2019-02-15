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
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.InstanceClient.AggregatedListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListReferrersInstancesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.InstanceStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceClient}.
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
 * example, to set the total timeout of getInstance to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceSettings.Builder instanceSettingsBuilder =
 *     InstanceSettings.newBuilder();
 * instanceSettingsBuilder.getInstanceSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceSettings instanceSettings = instanceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class InstanceSettings extends ClientSettings<InstanceSettings> {
  /** Returns the object with the settings used for calls to addAccessConfigInstance. */
  public UnaryCallSettings<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).addAccessConfigInstanceSettings();
  }

  /** Returns the object with the settings used for calls to addAccessConfigInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      addAccessConfigInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).addAccessConfigInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to aggregatedListInstances. */
  public PagedCallSettings<
          AggregatedListInstancesHttpRequest,
          InstanceAggregatedList,
          AggregatedListInstancesPagedResponse>
      aggregatedListInstancesSettings() {
    return ((InstanceStubSettings) getStubSettings()).aggregatedListInstancesSettings();
  }

  /** Returns the object with the settings used for calls to attachDiskInstance. */
  public UnaryCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).attachDiskInstanceSettings();
  }

  /** Returns the object with the settings used for calls to attachDiskInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      attachDiskInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).attachDiskInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public UnaryCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).deleteInstanceSettings();
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).deleteInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteAccessConfigInstance. */
  public UnaryCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).deleteAccessConfigInstanceSettings();
  }

  /** Returns the object with the settings used for calls to deleteAccessConfigInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      deleteAccessConfigInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).deleteAccessConfigInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to detachDiskInstance. */
  public UnaryCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).detachDiskInstanceSettings();
  }

  /** Returns the object with the settings used for calls to detachDiskInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
      detachDiskInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).detachDiskInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public UnaryCallSettings<GetInstanceHttpRequest, Instance> getInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).getInstanceSettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicyInstance. */
  public UnaryCallSettings<GetIamPolicyInstanceHttpRequest, Policy> getIamPolicyInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).getIamPolicyInstanceSettings();
  }

  /** Returns the object with the settings used for calls to getSerialPortOutputInstance. */
  public UnaryCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).getSerialPortOutputInstanceSettings();
  }

  /** Returns the object with the settings used for calls to insertInstance. */
  public UnaryCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).insertInstanceSettings();
  }

  /** Returns the object with the settings used for calls to insertInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
      insertInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).insertInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
      listInstancesSettings() {
    return ((InstanceStubSettings) getStubSettings()).listInstancesSettings();
  }

  /** Returns the object with the settings used for calls to listReferrersInstances. */
  public PagedCallSettings<
          ListReferrersInstancesHttpRequest,
          InstanceListReferrers,
          ListReferrersInstancesPagedResponse>
      listReferrersInstancesSettings() {
    return ((InstanceStubSettings) getStubSettings()).listReferrersInstancesSettings();
  }

  /** Returns the object with the settings used for calls to resetInstance. */
  public UnaryCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).resetInstanceSettings();
  }

  /** Returns the object with the settings used for calls to resetInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
      resetInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).resetInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setDeletionProtectionInstance. */
  public UnaryCallSettings<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setDeletionProtectionInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setDeletionProtectionInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDeletionProtectionInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings())
        .setDeletionProtectionInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setDiskAutoDeleteInstance. */
  public UnaryCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setDiskAutoDeleteInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setDiskAutoDeleteInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setDiskAutoDeleteInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setDiskAutoDeleteInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicyInstance. */
  public UnaryCallSettings<SetIamPolicyInstanceHttpRequest, Policy> setIamPolicyInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setIamPolicyInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setLabelsInstance. */
  public UnaryCallSettings<SetLabelsInstanceHttpRequest, Operation> setLabelsInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setLabelsInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setLabelsInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setLabelsInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setLabelsInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setMachineResourcesInstance. */
  public UnaryCallSettings<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMachineResourcesInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setMachineResourcesInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineResourcesInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings())
        .setMachineResourcesInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setMachineTypeInstance. */
  public UnaryCallSettings<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMachineTypeInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setMachineTypeInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMachineTypeInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMachineTypeInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setMetadataInstance. */
  public UnaryCallSettings<SetMetadataInstanceHttpRequest, Operation>
      setMetadataInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMetadataInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setMetadataInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMetadataInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMetadataInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setMinCpuPlatformInstance. */
  public UnaryCallSettings<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMinCpuPlatformInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setMinCpuPlatformInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setMinCpuPlatformInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setMinCpuPlatformInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setSchedulingInstance. */
  public UnaryCallSettings<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setSchedulingInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setSchedulingInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setSchedulingInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setSchedulingInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setServiceAccountInstance. */
  public UnaryCallSettings<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setServiceAccountInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setServiceAccountInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setServiceAccountInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setServiceAccountInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setTagsInstance. */
  public UnaryCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).setTagsInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setTagsInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
      setTagsInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).setTagsInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to simulateMaintenanceEventInstance. */
  public UnaryCallSettings<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).simulateMaintenanceEventInstanceSettings();
  }

  /** Returns the object with the settings used for calls to simulateMaintenanceEventInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
      simulateMaintenanceEventInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings())
        .simulateMaintenanceEventInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to startInstance. */
  public UnaryCallSettings<StartInstanceHttpRequest, Operation> startInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).startInstanceSettings();
  }

  /** Returns the object with the settings used for calls to startInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).startInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to startWithEncryptionKeyInstance. */
  public UnaryCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).startWithEncryptionKeyInstanceSettings();
  }

  /** Returns the object with the settings used for calls to startWithEncryptionKeyInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
      startWithEncryptionKeyInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings())
        .startWithEncryptionKeyInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to stopInstance. */
  public UnaryCallSettings<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).stopInstanceSettings();
  }

  /** Returns the object with the settings used for calls to stopInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
      stopInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).stopInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissionsInstance. */
  public UnaryCallSettings<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).testIamPermissionsInstanceSettings();
  }

  /** Returns the object with the settings used for calls to updateAccessConfigInstance. */
  public UnaryCallSettings<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).updateAccessConfigInstanceSettings();
  }

  /** Returns the object with the settings used for calls to updateAccessConfigInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateAccessConfigInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings()).updateAccessConfigInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateNetworkInterfaceInstance. */
  public UnaryCallSettings<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceSettings() {
    return ((InstanceStubSettings) getStubSettings()).updateNetworkInterfaceInstanceSettings();
  }

  /** Returns the object with the settings used for calls to updateNetworkInterfaceInstance. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
      updateNetworkInterfaceInstanceOperationSettings() {
    return ((InstanceStubSettings) getStubSettings())
        .updateNetworkInterfaceInstanceOperationSettings();
  }

  public static final InstanceSettings create(InstanceStubSettings stub) throws IOException {
    return new InstanceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstanceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return InstanceStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return InstanceStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return InstanceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return InstanceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstanceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return InstanceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return InstanceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected InstanceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for InstanceSettings. */
  public static class Builder extends ClientSettings.Builder<InstanceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(InstanceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(InstanceStubSettings.newBuilder());
    }

    protected Builder(InstanceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(InstanceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public InstanceStubSettings.Builder getStubSettingsBuilder() {
      return ((InstanceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to addAccessConfigInstance. */
    public UnaryCallSettings.Builder<AddAccessConfigInstanceHttpRequest, Operation>
        addAccessConfigInstanceSettings() {
      return getStubSettingsBuilder().addAccessConfigInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to addAccessConfigInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        addAccessConfigInstanceOperationSettings() {
      return getStubSettingsBuilder().addAccessConfigInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to aggregatedListInstances. */
    public PagedCallSettings.Builder<
            AggregatedListInstancesHttpRequest,
            InstanceAggregatedList,
            AggregatedListInstancesPagedResponse>
        aggregatedListInstancesSettings() {
      return getStubSettingsBuilder().aggregatedListInstancesSettings();
    }

    /** Returns the builder for the settings used for calls to attachDiskInstance. */
    public UnaryCallSettings.Builder<AttachDiskInstanceHttpRequest, Operation>
        attachDiskInstanceSettings() {
      return getStubSettingsBuilder().attachDiskInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to attachDiskInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<AttachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
        attachDiskInstanceOperationSettings() {
      return getStubSettingsBuilder().attachDiskInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public UnaryCallSettings.Builder<DeleteInstanceHttpRequest, Operation>
        deleteInstanceSettings() {
      return getStubSettingsBuilder().deleteInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
        deleteInstanceOperationSettings() {
      return getStubSettingsBuilder().deleteInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteAccessConfigInstance. */
    public UnaryCallSettings.Builder<DeleteAccessConfigInstanceHttpRequest, Operation>
        deleteAccessConfigInstanceSettings() {
      return getStubSettingsBuilder().deleteAccessConfigInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteAccessConfigInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        deleteAccessConfigInstanceOperationSettings() {
      return getStubSettingsBuilder().deleteAccessConfigInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to detachDiskInstance. */
    public UnaryCallSettings.Builder<DetachDiskInstanceHttpRequest, Operation>
        detachDiskInstanceSettings() {
      return getStubSettingsBuilder().detachDiskInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to detachDiskInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DetachDiskInstanceHttpRequest, EmptyMessage, EmptyMessage>
        detachDiskInstanceOperationSettings() {
      return getStubSettingsBuilder().detachDiskInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public UnaryCallSettings.Builder<GetInstanceHttpRequest, Instance> getInstanceSettings() {
      return getStubSettingsBuilder().getInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicyInstance. */
    public UnaryCallSettings.Builder<GetIamPolicyInstanceHttpRequest, Policy>
        getIamPolicyInstanceSettings() {
      return getStubSettingsBuilder().getIamPolicyInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to getSerialPortOutputInstance. */
    public UnaryCallSettings.Builder<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
        getSerialPortOutputInstanceSettings() {
      return getStubSettingsBuilder().getSerialPortOutputInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to insertInstance. */
    public UnaryCallSettings.Builder<InsertInstanceHttpRequest, Operation>
        insertInstanceSettings() {
      return getStubSettingsBuilder().insertInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to insertInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertInstanceHttpRequest, EmptyMessage, EmptyMessage>
        insertInstanceOperationSettings() {
      return getStubSettingsBuilder().insertInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<
            ListInstancesHttpRequest, InstanceList, ListInstancesPagedResponse>
        listInstancesSettings() {
      return getStubSettingsBuilder().listInstancesSettings();
    }

    /** Returns the builder for the settings used for calls to listReferrersInstances. */
    public PagedCallSettings.Builder<
            ListReferrersInstancesHttpRequest,
            InstanceListReferrers,
            ListReferrersInstancesPagedResponse>
        listReferrersInstancesSettings() {
      return getStubSettingsBuilder().listReferrersInstancesSettings();
    }

    /** Returns the builder for the settings used for calls to resetInstance. */
    public UnaryCallSettings.Builder<ResetInstanceHttpRequest, Operation> resetInstanceSettings() {
      return getStubSettingsBuilder().resetInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to resetInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ResetInstanceHttpRequest, EmptyMessage, EmptyMessage>
        resetInstanceOperationSettings() {
      return getStubSettingsBuilder().resetInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setDeletionProtectionInstance. */
    public UnaryCallSettings.Builder<SetDeletionProtectionInstanceHttpRequest, Operation>
        setDeletionProtectionInstanceSettings() {
      return getStubSettingsBuilder().setDeletionProtectionInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setDeletionProtectionInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetDeletionProtectionInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setDeletionProtectionInstanceOperationSettings() {
      return getStubSettingsBuilder().setDeletionProtectionInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setDiskAutoDeleteInstance. */
    public UnaryCallSettings.Builder<SetDiskAutoDeleteInstanceHttpRequest, Operation>
        setDiskAutoDeleteInstanceSettings() {
      return getStubSettingsBuilder().setDiskAutoDeleteInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setDiskAutoDeleteInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setDiskAutoDeleteInstanceOperationSettings() {
      return getStubSettingsBuilder().setDiskAutoDeleteInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicyInstance. */
    public UnaryCallSettings.Builder<SetIamPolicyInstanceHttpRequest, Policy>
        setIamPolicyInstanceSettings() {
      return getStubSettingsBuilder().setIamPolicyInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setLabelsInstance. */
    public UnaryCallSettings.Builder<SetLabelsInstanceHttpRequest, Operation>
        setLabelsInstanceSettings() {
      return getStubSettingsBuilder().setLabelsInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setLabelsInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<SetLabelsInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setLabelsInstanceOperationSettings() {
      return getStubSettingsBuilder().setLabelsInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setMachineResourcesInstance. */
    public UnaryCallSettings.Builder<SetMachineResourcesInstanceHttpRequest, Operation>
        setMachineResourcesInstanceSettings() {
      return getStubSettingsBuilder().setMachineResourcesInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setMachineResourcesInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetMachineResourcesInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMachineResourcesInstanceOperationSettings() {
      return getStubSettingsBuilder().setMachineResourcesInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setMachineTypeInstance. */
    public UnaryCallSettings.Builder<SetMachineTypeInstanceHttpRequest, Operation>
        setMachineTypeInstanceSettings() {
      return getStubSettingsBuilder().setMachineTypeInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setMachineTypeInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetMachineTypeInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMachineTypeInstanceOperationSettings() {
      return getStubSettingsBuilder().setMachineTypeInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setMetadataInstance. */
    public UnaryCallSettings.Builder<SetMetadataInstanceHttpRequest, Operation>
        setMetadataInstanceSettings() {
      return getStubSettingsBuilder().setMetadataInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setMetadataInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<SetMetadataInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMetadataInstanceOperationSettings() {
      return getStubSettingsBuilder().setMetadataInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setMinCpuPlatformInstance. */
    public UnaryCallSettings.Builder<SetMinCpuPlatformInstanceHttpRequest, Operation>
        setMinCpuPlatformInstanceSettings() {
      return getStubSettingsBuilder().setMinCpuPlatformInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setMinCpuPlatformInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setMinCpuPlatformInstanceOperationSettings() {
      return getStubSettingsBuilder().setMinCpuPlatformInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setSchedulingInstance. */
    public UnaryCallSettings.Builder<SetSchedulingInstanceHttpRequest, Operation>
        setSchedulingInstanceSettings() {
      return getStubSettingsBuilder().setSchedulingInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setSchedulingInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSchedulingInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setSchedulingInstanceOperationSettings() {
      return getStubSettingsBuilder().setSchedulingInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setServiceAccountInstance. */
    public UnaryCallSettings.Builder<SetServiceAccountInstanceHttpRequest, Operation>
        setServiceAccountInstanceSettings() {
      return getStubSettingsBuilder().setServiceAccountInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setServiceAccountInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetServiceAccountInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setServiceAccountInstanceOperationSettings() {
      return getStubSettingsBuilder().setServiceAccountInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setTagsInstance. */
    public UnaryCallSettings.Builder<SetTagsInstanceHttpRequest, Operation>
        setTagsInstanceSettings() {
      return getStubSettingsBuilder().setTagsInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setTagsInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<SetTagsInstanceHttpRequest, EmptyMessage, EmptyMessage>
        setTagsInstanceOperationSettings() {
      return getStubSettingsBuilder().setTagsInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to simulateMaintenanceEventInstance. */
    public UnaryCallSettings.Builder<SimulateMaintenanceEventInstanceHttpRequest, Operation>
        simulateMaintenanceEventInstanceSettings() {
      return getStubSettingsBuilder().simulateMaintenanceEventInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to simulateMaintenanceEventInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, EmptyMessage>
        simulateMaintenanceEventInstanceOperationSettings() {
      return getStubSettingsBuilder().simulateMaintenanceEventInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to startInstance. */
    public UnaryCallSettings.Builder<StartInstanceHttpRequest, Operation> startInstanceSettings() {
      return getStubSettingsBuilder().startInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to startInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<StartInstanceHttpRequest, EmptyMessage, EmptyMessage>
        startInstanceOperationSettings() {
      return getStubSettingsBuilder().startInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to startWithEncryptionKeyInstance. */
    public UnaryCallSettings.Builder<StartWithEncryptionKeyInstanceHttpRequest, Operation>
        startWithEncryptionKeyInstanceSettings() {
      return getStubSettingsBuilder().startWithEncryptionKeyInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to startWithEncryptionKeyInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, EmptyMessage>
        startWithEncryptionKeyInstanceOperationSettings() {
      return getStubSettingsBuilder().startWithEncryptionKeyInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to stopInstance. */
    public UnaryCallSettings.Builder<StopInstanceHttpRequest, Operation> stopInstanceSettings() {
      return getStubSettingsBuilder().stopInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to stopInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<StopInstanceHttpRequest, EmptyMessage, EmptyMessage>
        stopInstanceOperationSettings() {
      return getStubSettingsBuilder().stopInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissionsInstance. */
    public UnaryCallSettings.Builder<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
        testIamPermissionsInstanceSettings() {
      return getStubSettingsBuilder().testIamPermissionsInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to updateAccessConfigInstance. */
    public UnaryCallSettings.Builder<UpdateAccessConfigInstanceHttpRequest, Operation>
        updateAccessConfigInstanceSettings() {
      return getStubSettingsBuilder().updateAccessConfigInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to updateAccessConfigInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateAccessConfigInstanceHttpRequest, EmptyMessage, EmptyMessage>
        updateAccessConfigInstanceOperationSettings() {
      return getStubSettingsBuilder().updateAccessConfigInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateNetworkInterfaceInstance. */
    public UnaryCallSettings.Builder<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
        updateNetworkInterfaceInstanceSettings() {
      return getStubSettingsBuilder().updateNetworkInterfaceInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to updateNetworkInterfaceInstance. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, EmptyMessage>
        updateNetworkInterfaceInstanceOperationSettings() {
      return getStubSettingsBuilder().updateNetworkInterfaceInstanceOperationSettings();
    }

    @Override
    public InstanceSettings build() throws IOException {
      return new InstanceSettings(this);
    }
  }
}
