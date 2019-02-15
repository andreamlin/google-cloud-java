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

import static com.google.cloud.compute.v1.TargetHttpsProxyClient.ListTargetHttpsProxiesPagedResponse;

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
import com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetHttpsProxyClient}.
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
 * example, to set the total timeout of getTargetHttpsProxy to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetHttpsProxySettings.Builder targetHttpsProxySettingsBuilder =
 *     TargetHttpsProxySettings.newBuilder();
 * targetHttpsProxySettingsBuilder.getTargetHttpsProxySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TargetHttpsProxySettings targetHttpsProxySettings = targetHttpsProxySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetHttpsProxySettings extends ClientSettings<TargetHttpsProxySettings> {
  /** Returns the object with the settings used for calls to deleteTargetHttpsProxy. */
  public UnaryCallSettings<DeleteTargetHttpsProxyHttpRequest, Operation>
      deleteTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings()).deleteTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to deleteTargetHttpsProxy. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
      deleteTargetHttpsProxyOperationSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .deleteTargetHttpsProxyOperationSettings();
  }

  /** Returns the object with the settings used for calls to getTargetHttpsProxy. */
  public UnaryCallSettings<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy>
      getTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings()).getTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to insertTargetHttpsProxy. */
  public UnaryCallSettings<InsertTargetHttpsProxyHttpRequest, Operation>
      insertTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings()).insertTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to insertTargetHttpsProxy. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<InsertTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
      insertTargetHttpsProxyOperationSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .insertTargetHttpsProxyOperationSettings();
  }

  /** Returns the object with the settings used for calls to listTargetHttpsProxies. */
  public PagedCallSettings<
          ListTargetHttpsProxiesHttpRequest,
          TargetHttpsProxyList,
          ListTargetHttpsProxiesPagedResponse>
      listTargetHttpsProxiesSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings()).listTargetHttpsProxiesSettings();
  }

  /** Returns the object with the settings used for calls to setQuicOverrideTargetHttpsProxy. */
  public UnaryCallSettings<SetQuicOverrideTargetHttpsProxyHttpRequest, Operation>
      setQuicOverrideTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setQuicOverrideTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to setQuicOverrideTargetHttpsProxy. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetQuicOverrideTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
      setQuicOverrideTargetHttpsProxyOperationSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setQuicOverrideTargetHttpsProxyOperationSettings();
  }

  /** Returns the object with the settings used for calls to setSslCertificatesTargetHttpsProxy. */
  public UnaryCallSettings<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation>
      setSslCertificatesTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setSslCertificatesTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to setSslCertificatesTargetHttpsProxy. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetSslCertificatesTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslCertificatesTargetHttpsProxyOperationSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setSslCertificatesTargetHttpsProxyOperationSettings();
  }

  /** Returns the object with the settings used for calls to setSslPolicyTargetHttpsProxy. */
  public UnaryCallSettings<SetSslPolicyTargetHttpsProxyHttpRequest, Operation>
      setSslPolicyTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setSslPolicyTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to setSslPolicyTargetHttpsProxy. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetSslPolicyTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
      setSslPolicyTargetHttpsProxyOperationSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setSslPolicyTargetHttpsProxyOperationSettings();
  }

  /** Returns the object with the settings used for calls to setUrlMapTargetHttpsProxy. */
  public UnaryCallSettings<SetUrlMapTargetHttpsProxyHttpRequest, Operation>
      setUrlMapTargetHttpsProxySettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings()).setUrlMapTargetHttpsProxySettings();
  }

  /** Returns the object with the settings used for calls to setUrlMapTargetHttpsProxy. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<SetUrlMapTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
      setUrlMapTargetHttpsProxyOperationSettings() {
    return ((TargetHttpsProxyStubSettings) getStubSettings())
        .setUrlMapTargetHttpsProxyOperationSettings();
  }

  public static final TargetHttpsProxySettings create(TargetHttpsProxyStubSettings stub)
      throws IOException {
    return new TargetHttpsProxySettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return TargetHttpsProxyStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return TargetHttpsProxyStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return TargetHttpsProxyStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return TargetHttpsProxyStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return TargetHttpsProxyStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return TargetHttpsProxyStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return TargetHttpsProxyStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TargetHttpsProxyStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected TargetHttpsProxySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for TargetHttpsProxySettings. */
  public static class Builder extends ClientSettings.Builder<TargetHttpsProxySettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(TargetHttpsProxyStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(TargetHttpsProxyStubSettings.newBuilder());
    }

    protected Builder(TargetHttpsProxySettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(TargetHttpsProxyStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public TargetHttpsProxyStubSettings.Builder getStubSettingsBuilder() {
      return ((TargetHttpsProxyStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to deleteTargetHttpsProxy. */
    public UnaryCallSettings.Builder<DeleteTargetHttpsProxyHttpRequest, Operation>
        deleteTargetHttpsProxySettings() {
      return getStubSettingsBuilder().deleteTargetHttpsProxySettings();
    }

    /** Returns the builder for the settings used for calls to deleteTargetHttpsProxy. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
        deleteTargetHttpsProxyOperationSettings() {
      return getStubSettingsBuilder().deleteTargetHttpsProxyOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getTargetHttpsProxy. */
    public UnaryCallSettings.Builder<GetTargetHttpsProxyHttpRequest, TargetHttpsProxy>
        getTargetHttpsProxySettings() {
      return getStubSettingsBuilder().getTargetHttpsProxySettings();
    }

    /** Returns the builder for the settings used for calls to insertTargetHttpsProxy. */
    public UnaryCallSettings.Builder<InsertTargetHttpsProxyHttpRequest, Operation>
        insertTargetHttpsProxySettings() {
      return getStubSettingsBuilder().insertTargetHttpsProxySettings();
    }

    /** Returns the builder for the settings used for calls to insertTargetHttpsProxy. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
        insertTargetHttpsProxyOperationSettings() {
      return getStubSettingsBuilder().insertTargetHttpsProxyOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listTargetHttpsProxies. */
    public PagedCallSettings.Builder<
            ListTargetHttpsProxiesHttpRequest,
            TargetHttpsProxyList,
            ListTargetHttpsProxiesPagedResponse>
        listTargetHttpsProxiesSettings() {
      return getStubSettingsBuilder().listTargetHttpsProxiesSettings();
    }

    /** Returns the builder for the settings used for calls to setQuicOverrideTargetHttpsProxy. */
    public UnaryCallSettings.Builder<SetQuicOverrideTargetHttpsProxyHttpRequest, Operation>
        setQuicOverrideTargetHttpsProxySettings() {
      return getStubSettingsBuilder().setQuicOverrideTargetHttpsProxySettings();
    }

    /** Returns the builder for the settings used for calls to setQuicOverrideTargetHttpsProxy. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetQuicOverrideTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
        setQuicOverrideTargetHttpsProxyOperationSettings() {
      return getStubSettingsBuilder().setQuicOverrideTargetHttpsProxyOperationSettings();
    }

    /**
     * Returns the builder for the settings used for calls to setSslCertificatesTargetHttpsProxy.
     */
    public UnaryCallSettings.Builder<SetSslCertificatesTargetHttpsProxyHttpRequest, Operation>
        setSslCertificatesTargetHttpsProxySettings() {
      return getStubSettingsBuilder().setSslCertificatesTargetHttpsProxySettings();
    }

    /**
     * Returns the builder for the settings used for calls to setSslCertificatesTargetHttpsProxy.
     */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSslCertificatesTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
        setSslCertificatesTargetHttpsProxyOperationSettings() {
      return getStubSettingsBuilder().setSslCertificatesTargetHttpsProxyOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setSslPolicyTargetHttpsProxy. */
    public UnaryCallSettings.Builder<SetSslPolicyTargetHttpsProxyHttpRequest, Operation>
        setSslPolicyTargetHttpsProxySettings() {
      return getStubSettingsBuilder().setSslPolicyTargetHttpsProxySettings();
    }

    /** Returns the builder for the settings used for calls to setSslPolicyTargetHttpsProxy. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSslPolicyTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
        setSslPolicyTargetHttpsProxyOperationSettings() {
      return getStubSettingsBuilder().setSslPolicyTargetHttpsProxyOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setUrlMapTargetHttpsProxy. */
    public UnaryCallSettings.Builder<SetUrlMapTargetHttpsProxyHttpRequest, Operation>
        setUrlMapTargetHttpsProxySettings() {
      return getStubSettingsBuilder().setUrlMapTargetHttpsProxySettings();
    }

    /** Returns the builder for the settings used for calls to setUrlMapTargetHttpsProxy. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetUrlMapTargetHttpsProxyHttpRequest, EmptyMessage, EmptyMessage>
        setUrlMapTargetHttpsProxyOperationSettings() {
      return getStubSettingsBuilder().setUrlMapTargetHttpsProxyOperationSettings();
    }

    @Override
    public TargetHttpsProxySettings build() throws IOException {
      return new TargetHttpsProxySettings(this);
    }
  }
}
