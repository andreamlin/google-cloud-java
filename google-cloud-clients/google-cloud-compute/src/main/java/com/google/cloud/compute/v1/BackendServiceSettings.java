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

import static com.google.cloud.compute.v1.BackendServiceClient.AggregatedListBackendServicesPagedResponse;
import static com.google.cloud.compute.v1.BackendServiceClient.ListBackendServicesPagedResponse;

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
import com.google.cloud.compute.v1.stub.BackendServiceStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link BackendServiceClient}.
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
 * example, to set the total timeout of getBackendService to 30 seconds:
 *
 * <pre>
 * <code>
 * BackendServiceSettings.Builder backendServiceSettingsBuilder =
 *     BackendServiceSettings.newBuilder();
 * backendServiceSettingsBuilder.getBackendServiceSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * BackendServiceSettings backendServiceSettings = backendServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class BackendServiceSettings extends ClientSettings<BackendServiceSettings> {
  /** Returns the object with the settings used for calls to addSignedUrlKeyBackendService. */
  public UnaryCallSettings<AddSignedUrlKeyBackendServiceHttpRequest, Operation>
      addSignedUrlKeyBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).addSignedUrlKeyBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to addSignedUrlKeyBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<AddSignedUrlKeyBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      addSignedUrlKeyBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings())
        .addSignedUrlKeyBackendServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to aggregatedListBackendServices. */
  public PagedCallSettings<
          AggregatedListBackendServicesHttpRequest,
          BackendServiceAggregatedList,
          AggregatedListBackendServicesPagedResponse>
      aggregatedListBackendServicesSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).aggregatedListBackendServicesSettings();
  }

  /** Returns the object with the settings used for calls to deleteBackendService. */
  public UnaryCallSettings<DeleteBackendServiceHttpRequest, Operation>
      deleteBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).deleteBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to deleteBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      deleteBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).deleteBackendServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteSignedUrlKeyBackendService. */
  public UnaryCallSettings<DeleteSignedUrlKeyBackendServiceHttpRequest, Operation>
      deleteSignedUrlKeyBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings())
        .deleteSignedUrlKeyBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to deleteSignedUrlKeyBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          DeleteSignedUrlKeyBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      deleteSignedUrlKeyBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings())
        .deleteSignedUrlKeyBackendServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to getBackendService. */
  public UnaryCallSettings<GetBackendServiceHttpRequest, BackendService>
      getBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).getBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to getHealthBackendService. */
  public UnaryCallSettings<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth>
      getHealthBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).getHealthBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to insertBackendService. */
  public UnaryCallSettings<InsertBackendServiceHttpRequest, Operation>
      insertBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).insertBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to insertBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<InsertBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      insertBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).insertBackendServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to listBackendServices. */
  public PagedCallSettings<
          ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse>
      listBackendServicesSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).listBackendServicesSettings();
  }

  /** Returns the object with the settings used for calls to patchBackendService. */
  public UnaryCallSettings<PatchBackendServiceHttpRequest, Operation>
      patchBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).patchBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to patchBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<PatchBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      patchBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).patchBackendServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to setSecurityPolicyBackendService. */
  public UnaryCallSettings<SetSecurityPolicyBackendServiceHttpRequest, Operation>
      setSecurityPolicyBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings())
        .setSecurityPolicyBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to setSecurityPolicyBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetSecurityPolicyBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      setSecurityPolicyBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings())
        .setSecurityPolicyBackendServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateBackendService. */
  public UnaryCallSettings<UpdateBackendServiceHttpRequest, Operation>
      updateBackendServiceSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).updateBackendServiceSettings();
  }

  /** Returns the object with the settings used for calls to updateBackendService. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<UpdateBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
      updateBackendServiceOperationSettings() {
    return ((BackendServiceStubSettings) getStubSettings()).updateBackendServiceOperationSettings();
  }

  public static final BackendServiceSettings create(BackendServiceStubSettings stub)
      throws IOException {
    return new BackendServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return BackendServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return BackendServiceStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return BackendServiceStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return BackendServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return BackendServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return BackendServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return BackendServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return BackendServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected BackendServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for BackendServiceSettings. */
  public static class Builder extends ClientSettings.Builder<BackendServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(BackendServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(BackendServiceStubSettings.newBuilder());
    }

    protected Builder(BackendServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(BackendServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public BackendServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((BackendServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to addSignedUrlKeyBackendService. */
    public UnaryCallSettings.Builder<AddSignedUrlKeyBackendServiceHttpRequest, Operation>
        addSignedUrlKeyBackendServiceSettings() {
      return getStubSettingsBuilder().addSignedUrlKeyBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to addSignedUrlKeyBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddSignedUrlKeyBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        addSignedUrlKeyBackendServiceOperationSettings() {
      return getStubSettingsBuilder().addSignedUrlKeyBackendServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to aggregatedListBackendServices. */
    public PagedCallSettings.Builder<
            AggregatedListBackendServicesHttpRequest,
            BackendServiceAggregatedList,
            AggregatedListBackendServicesPagedResponse>
        aggregatedListBackendServicesSettings() {
      return getStubSettingsBuilder().aggregatedListBackendServicesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteBackendService. */
    public UnaryCallSettings.Builder<DeleteBackendServiceHttpRequest, Operation>
        deleteBackendServiceSettings() {
      return getStubSettingsBuilder().deleteBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        deleteBackendServiceOperationSettings() {
      return getStubSettingsBuilder().deleteBackendServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSignedUrlKeyBackendService. */
    public UnaryCallSettings.Builder<DeleteSignedUrlKeyBackendServiceHttpRequest, Operation>
        deleteSignedUrlKeyBackendServiceSettings() {
      return getStubSettingsBuilder().deleteSignedUrlKeyBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSignedUrlKeyBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteSignedUrlKeyBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        deleteSignedUrlKeyBackendServiceOperationSettings() {
      return getStubSettingsBuilder().deleteSignedUrlKeyBackendServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getBackendService. */
    public UnaryCallSettings.Builder<GetBackendServiceHttpRequest, BackendService>
        getBackendServiceSettings() {
      return getStubSettingsBuilder().getBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to getHealthBackendService. */
    public UnaryCallSettings.Builder<GetHealthBackendServiceHttpRequest, BackendServiceGroupHealth>
        getHealthBackendServiceSettings() {
      return getStubSettingsBuilder().getHealthBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to insertBackendService. */
    public UnaryCallSettings.Builder<InsertBackendServiceHttpRequest, Operation>
        insertBackendServiceSettings() {
      return getStubSettingsBuilder().insertBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to insertBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        insertBackendServiceOperationSettings() {
      return getStubSettingsBuilder().insertBackendServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listBackendServices. */
    public PagedCallSettings.Builder<
            ListBackendServicesHttpRequest, BackendServiceList, ListBackendServicesPagedResponse>
        listBackendServicesSettings() {
      return getStubSettingsBuilder().listBackendServicesSettings();
    }

    /** Returns the builder for the settings used for calls to patchBackendService. */
    public UnaryCallSettings.Builder<PatchBackendServiceHttpRequest, Operation>
        patchBackendServiceSettings() {
      return getStubSettingsBuilder().patchBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to patchBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<PatchBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        patchBackendServiceOperationSettings() {
      return getStubSettingsBuilder().patchBackendServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setSecurityPolicyBackendService. */
    public UnaryCallSettings.Builder<SetSecurityPolicyBackendServiceHttpRequest, Operation>
        setSecurityPolicyBackendServiceSettings() {
      return getStubSettingsBuilder().setSecurityPolicyBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to setSecurityPolicyBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSecurityPolicyBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        setSecurityPolicyBackendServiceOperationSettings() {
      return getStubSettingsBuilder().setSecurityPolicyBackendServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateBackendService. */
    public UnaryCallSettings.Builder<UpdateBackendServiceHttpRequest, Operation>
        updateBackendServiceSettings() {
      return getStubSettingsBuilder().updateBackendServiceSettings();
    }

    /** Returns the builder for the settings used for calls to updateBackendService. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateBackendServiceHttpRequest, EmptyMessage, EmptyMessage>
        updateBackendServiceOperationSettings() {
      return getStubSettingsBuilder().updateBackendServiceOperationSettings();
    }

    @Override
    public BackendServiceSettings build() throws IOException {
      return new BackendServiceSettings(this);
    }
  }
}
