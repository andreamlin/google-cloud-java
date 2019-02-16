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

import static com.google.cloud.compute.v1.FirewallClient.ListFirewallsPagedResponse;

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
import com.google.cloud.compute.v1.stub.FirewallStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link FirewallClient}.
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
 * example, to set the total timeout of getFirewall to 30 seconds:
 *
 * <pre>
 * <code>
 * FirewallSettings.Builder firewallSettingsBuilder =
 *     FirewallSettings.newBuilder();
 * firewallSettingsBuilder.getFirewallSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * FirewallSettings firewallSettings = firewallSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FirewallSettings extends ClientSettings<FirewallSettings> {
  /** Returns the object with the settings used for calls to deleteFirewall. */
  public UnaryCallSettings<DeleteFirewallHttpRequest, Operation> deleteFirewallSettings() {
    return ((FirewallStubSettings) getStubSettings()).deleteFirewallSettings();
  }

  /** Returns the object with the settings used for calls to deleteFirewall. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteFirewallHttpRequest, EmptyMessage, Operation>
      deleteFirewallOperationSettings() {
    return ((FirewallStubSettings) getStubSettings()).deleteFirewallOperationSettings();
  }

  /** Returns the object with the settings used for calls to getFirewall. */
  public UnaryCallSettings<GetFirewallHttpRequest, Firewall> getFirewallSettings() {
    return ((FirewallStubSettings) getStubSettings()).getFirewallSettings();
  }

  /** Returns the object with the settings used for calls to insertFirewall. */
  public UnaryCallSettings<InsertFirewallHttpRequest, Operation> insertFirewallSettings() {
    return ((FirewallStubSettings) getStubSettings()).insertFirewallSettings();
  }

  /** Returns the object with the settings used for calls to insertFirewall. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<InsertFirewallHttpRequest, EmptyMessage, Operation>
      insertFirewallOperationSettings() {
    return ((FirewallStubSettings) getStubSettings()).insertFirewallOperationSettings();
  }

  /** Returns the object with the settings used for calls to listFirewalls. */
  public PagedCallSettings<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse>
      listFirewallsSettings() {
    return ((FirewallStubSettings) getStubSettings()).listFirewallsSettings();
  }

  /** Returns the object with the settings used for calls to patchFirewall. */
  public UnaryCallSettings<PatchFirewallHttpRequest, Operation> patchFirewallSettings() {
    return ((FirewallStubSettings) getStubSettings()).patchFirewallSettings();
  }

  /** Returns the object with the settings used for calls to patchFirewall. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<PatchFirewallHttpRequest, EmptyMessage, Operation>
      patchFirewallOperationSettings() {
    return ((FirewallStubSettings) getStubSettings()).patchFirewallOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateFirewall. */
  public UnaryCallSettings<UpdateFirewallHttpRequest, Operation> updateFirewallSettings() {
    return ((FirewallStubSettings) getStubSettings()).updateFirewallSettings();
  }

  /** Returns the object with the settings used for calls to updateFirewall. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<UpdateFirewallHttpRequest, EmptyMessage, Operation>
      updateFirewallOperationSettings() {
    return ((FirewallStubSettings) getStubSettings()).updateFirewallOperationSettings();
  }

  public static final FirewallSettings create(FirewallStubSettings stub) throws IOException {
    return new FirewallSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return FirewallStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return FirewallStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return FirewallStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return FirewallStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return FirewallStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return FirewallStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return FirewallStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return FirewallStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected FirewallSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for FirewallSettings. */
  public static class Builder extends ClientSettings.Builder<FirewallSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(FirewallStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(FirewallStubSettings.newBuilder());
    }

    protected Builder(FirewallSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(FirewallStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public FirewallStubSettings.Builder getStubSettingsBuilder() {
      return ((FirewallStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to deleteFirewall. */
    public UnaryCallSettings.Builder<DeleteFirewallHttpRequest, Operation>
        deleteFirewallSettings() {
      return getStubSettingsBuilder().deleteFirewallSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFirewall. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteFirewallHttpRequest, EmptyMessage, Operation>
        deleteFirewallOperationSettings() {
      return getStubSettingsBuilder().deleteFirewallOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getFirewall. */
    public UnaryCallSettings.Builder<GetFirewallHttpRequest, Firewall> getFirewallSettings() {
      return getStubSettingsBuilder().getFirewallSettings();
    }

    /** Returns the builder for the settings used for calls to insertFirewall. */
    public UnaryCallSettings.Builder<InsertFirewallHttpRequest, Operation>
        insertFirewallSettings() {
      return getStubSettingsBuilder().insertFirewallSettings();
    }

    /** Returns the builder for the settings used for calls to insertFirewall. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertFirewallHttpRequest, EmptyMessage, Operation>
        insertFirewallOperationSettings() {
      return getStubSettingsBuilder().insertFirewallOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listFirewalls. */
    public PagedCallSettings.Builder<
            ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse>
        listFirewallsSettings() {
      return getStubSettingsBuilder().listFirewallsSettings();
    }

    /** Returns the builder for the settings used for calls to patchFirewall. */
    public UnaryCallSettings.Builder<PatchFirewallHttpRequest, Operation> patchFirewallSettings() {
      return getStubSettingsBuilder().patchFirewallSettings();
    }

    /** Returns the builder for the settings used for calls to patchFirewall. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<PatchFirewallHttpRequest, EmptyMessage, Operation>
        patchFirewallOperationSettings() {
      return getStubSettingsBuilder().patchFirewallOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateFirewall. */
    public UnaryCallSettings.Builder<UpdateFirewallHttpRequest, Operation>
        updateFirewallSettings() {
      return getStubSettingsBuilder().updateFirewallSettings();
    }

    /** Returns the builder for the settings used for calls to updateFirewall. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UpdateFirewallHttpRequest, EmptyMessage, Operation>
        updateFirewallOperationSettings() {
      return getStubSettingsBuilder().updateFirewallOperationSettings();
    }

    @Override
    public FirewallSettings build() throws IOException {
      return new FirewallSettings(this);
    }
  }
}
