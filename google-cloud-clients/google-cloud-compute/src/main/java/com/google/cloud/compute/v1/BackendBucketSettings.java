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

import static com.google.cloud.compute.v1.BackendBucketClient.ListBackendBucketsPagedResponse;

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
import com.google.cloud.compute.v1.stub.BackendBucketStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link BackendBucketClient}.
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
 * example, to set the total timeout of getBackendBucket to 30 seconds:
 *
 * <pre>
 * <code>
 * BackendBucketSettings.Builder backendBucketSettingsBuilder =
 *     BackendBucketSettings.newBuilder();
 * backendBucketSettingsBuilder.getBackendBucketSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * BackendBucketSettings backendBucketSettings = backendBucketSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class BackendBucketSettings extends ClientSettings<BackendBucketSettings> {
  /** Returns the object with the settings used for calls to addSignedUrlKeyBackendBucket. */
  public UnaryCallSettings<AddSignedUrlKeyBackendBucketHttpRequest, Operation>
      addSignedUrlKeyBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).addSignedUrlKeyBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to addSignedUrlKeyBackendBucket. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<AddSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, Operation>
      addSignedUrlKeyBackendBucketOperationSettings() {
    return ((BackendBucketStubSettings) getStubSettings())
        .addSignedUrlKeyBackendBucketOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteBackendBucket. */
  public UnaryCallSettings<DeleteBackendBucketHttpRequest, Operation>
      deleteBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).deleteBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to deleteBackendBucket. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteBackendBucketHttpRequest, EmptyMessage, Operation>
      deleteBackendBucketOperationSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).deleteBackendBucketOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteSignedUrlKeyBackendBucket. */
  public UnaryCallSettings<DeleteSignedUrlKeyBackendBucketHttpRequest, Operation>
      deleteSignedUrlKeyBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings())
        .deleteSignedUrlKeyBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to deleteSignedUrlKeyBackendBucket. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, Operation>
      deleteSignedUrlKeyBackendBucketOperationSettings() {
    return ((BackendBucketStubSettings) getStubSettings())
        .deleteSignedUrlKeyBackendBucketOperationSettings();
  }

  /** Returns the object with the settings used for calls to getBackendBucket. */
  public UnaryCallSettings<GetBackendBucketHttpRequest, BackendBucket> getBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).getBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to insertBackendBucket. */
  public UnaryCallSettings<InsertBackendBucketHttpRequest, Operation>
      insertBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).insertBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to insertBackendBucket. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<InsertBackendBucketHttpRequest, EmptyMessage, Operation>
      insertBackendBucketOperationSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).insertBackendBucketOperationSettings();
  }

  /** Returns the object with the settings used for calls to listBackendBuckets. */
  public PagedCallSettings<
          ListBackendBucketsHttpRequest, BackendBucketList, ListBackendBucketsPagedResponse>
      listBackendBucketsSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).listBackendBucketsSettings();
  }

  /** Returns the object with the settings used for calls to patchBackendBucket. */
  public UnaryCallSettings<PatchBackendBucketHttpRequest, Operation> patchBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).patchBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to patchBackendBucket. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<PatchBackendBucketHttpRequest, EmptyMessage, Operation>
      patchBackendBucketOperationSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).patchBackendBucketOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateBackendBucket. */
  public UnaryCallSettings<UpdateBackendBucketHttpRequest, Operation>
      updateBackendBucketSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).updateBackendBucketSettings();
  }

  /** Returns the object with the settings used for calls to updateBackendBucket. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<UpdateBackendBucketHttpRequest, EmptyMessage, Operation>
      updateBackendBucketOperationSettings() {
    return ((BackendBucketStubSettings) getStubSettings()).updateBackendBucketOperationSettings();
  }

  public static final BackendBucketSettings create(BackendBucketStubSettings stub)
      throws IOException {
    return new BackendBucketSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return BackendBucketStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return BackendBucketStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return BackendBucketStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return BackendBucketStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return BackendBucketStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return BackendBucketStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return BackendBucketStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return BackendBucketStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected BackendBucketSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for BackendBucketSettings. */
  public static class Builder extends ClientSettings.Builder<BackendBucketSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(BackendBucketStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(BackendBucketStubSettings.newBuilder());
    }

    protected Builder(BackendBucketSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(BackendBucketStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public BackendBucketStubSettings.Builder getStubSettingsBuilder() {
      return ((BackendBucketStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to addSignedUrlKeyBackendBucket. */
    public UnaryCallSettings.Builder<AddSignedUrlKeyBackendBucketHttpRequest, Operation>
        addSignedUrlKeyBackendBucketSettings() {
      return getStubSettingsBuilder().addSignedUrlKeyBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to addSignedUrlKeyBackendBucket. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, Operation>
        addSignedUrlKeyBackendBucketOperationSettings() {
      return getStubSettingsBuilder().addSignedUrlKeyBackendBucketOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteBackendBucket. */
    public UnaryCallSettings.Builder<DeleteBackendBucketHttpRequest, Operation>
        deleteBackendBucketSettings() {
      return getStubSettingsBuilder().deleteBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to deleteBackendBucket. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteBackendBucketHttpRequest, EmptyMessage, Operation>
        deleteBackendBucketOperationSettings() {
      return getStubSettingsBuilder().deleteBackendBucketOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSignedUrlKeyBackendBucket. */
    public UnaryCallSettings.Builder<DeleteSignedUrlKeyBackendBucketHttpRequest, Operation>
        deleteSignedUrlKeyBackendBucketSettings() {
      return getStubSettingsBuilder().deleteSignedUrlKeyBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSignedUrlKeyBackendBucket. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteSignedUrlKeyBackendBucketHttpRequest, EmptyMessage, Operation>
        deleteSignedUrlKeyBackendBucketOperationSettings() {
      return getStubSettingsBuilder().deleteSignedUrlKeyBackendBucketOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getBackendBucket. */
    public UnaryCallSettings.Builder<GetBackendBucketHttpRequest, BackendBucket>
        getBackendBucketSettings() {
      return getStubSettingsBuilder().getBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to insertBackendBucket. */
    public UnaryCallSettings.Builder<InsertBackendBucketHttpRequest, Operation>
        insertBackendBucketSettings() {
      return getStubSettingsBuilder().insertBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to insertBackendBucket. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<InsertBackendBucketHttpRequest, EmptyMessage, Operation>
        insertBackendBucketOperationSettings() {
      return getStubSettingsBuilder().insertBackendBucketOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listBackendBuckets. */
    public PagedCallSettings.Builder<
            ListBackendBucketsHttpRequest, BackendBucketList, ListBackendBucketsPagedResponse>
        listBackendBucketsSettings() {
      return getStubSettingsBuilder().listBackendBucketsSettings();
    }

    /** Returns the builder for the settings used for calls to patchBackendBucket. */
    public UnaryCallSettings.Builder<PatchBackendBucketHttpRequest, Operation>
        patchBackendBucketSettings() {
      return getStubSettingsBuilder().patchBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to patchBackendBucket. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<PatchBackendBucketHttpRequest, EmptyMessage, Operation>
        patchBackendBucketOperationSettings() {
      return getStubSettingsBuilder().patchBackendBucketOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateBackendBucket. */
    public UnaryCallSettings.Builder<UpdateBackendBucketHttpRequest, Operation>
        updateBackendBucketSettings() {
      return getStubSettingsBuilder().updateBackendBucketSettings();
    }

    /** Returns the builder for the settings used for calls to updateBackendBucket. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UpdateBackendBucketHttpRequest, EmptyMessage, Operation>
        updateBackendBucketOperationSettings() {
      return getStubSettingsBuilder().updateBackendBucketOperationSettings();
    }

    @Override
    public BackendBucketSettings build() throws IOException {
      return new BackendBucketSettings(this);
    }
  }
}
