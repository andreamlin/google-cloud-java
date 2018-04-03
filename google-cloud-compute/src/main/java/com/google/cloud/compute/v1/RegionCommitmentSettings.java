/*
 * Copyright 2018 Google LLC
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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
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
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.auth.Credentials;
import static com.google.cloud.compute.v1.RegionCommitmentClient.AggregatedListRegionCommitmentsPagedResponse;
import static com.google.cloud.compute.v1.RegionCommitmentClient.ListRegionCommitmentsPagedResponse;
import com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionCommitmentClient}.
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
 * object. For example, to set the total timeout of getRegionCommitment to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionCommitmentSettings.Builder regionCommitmentSettingsBuilder =
 *     RegionCommitmentSettings.newBuilder();
 * regionCommitmentSettingsBuilder.getRegionCommitmentSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RegionCommitmentSettings regionCommitmentSettings = regionCommitmentSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class RegionCommitmentSettings extends ClientSettings<RegionCommitmentSettings> {
  /**
   * Returns the object with the settings used for calls to aggregatedListRegionCommitments.
   */
  public PagedCallSettings<AggregatedListRegionCommitmentsHttpRequest, CommitmentAggregatedList, AggregatedListRegionCommitmentsPagedResponse> aggregatedListRegionCommitmentsSettings() {
    return ((RegionCommitmentStubSettings) getStubSettings()).aggregatedListRegionCommitmentsSettings();
  }

  /**
   * Returns the object with the settings used for calls to getRegionCommitment.
   */
  public UnaryCallSettings<GetRegionCommitmentHttpRequest, Commitment> getRegionCommitmentSettings() {
    return ((RegionCommitmentStubSettings) getStubSettings()).getRegionCommitmentSettings();
  }

  /**
   * Returns the object with the settings used for calls to insertRegionCommitment.
   */
  public UnaryCallSettings<InsertRegionCommitmentHttpRequest, Operation> insertRegionCommitmentSettings() {
    return ((RegionCommitmentStubSettings) getStubSettings()).insertRegionCommitmentSettings();
  }

  /**
   * Returns the object with the settings used for calls to listRegionCommitments.
   */
  public PagedCallSettings<ListRegionCommitmentsHttpRequest, CommitmentList, ListRegionCommitmentsPagedResponse> listRegionCommitmentsSettings() {
    return ((RegionCommitmentStubSettings) getStubSettings()).listRegionCommitmentsSettings();
  }


  public static final RegionCommitmentSettings create(RegionCommitmentStubSettings stub) throws IOException {
    return new RegionCommitmentSettings.Builder(stub.toBuilder()).build();
  }

  /**
   * Returns a builder for the default ExecutorProvider for this service.
   */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RegionCommitmentStubSettings.defaultExecutorProviderBuilder();
  }

  /**
   * Returns the default service endpoint.
   */
   public static String getDefaultEndpoint() {
     return RegionCommitmentStubSettings.getDefaultEndpoint();
   }
  /**
   * Returns the default service port.
   */
  public static int getDefaultServicePort() {
    return RegionCommitmentStubSettings.getDefaultServicePort();
  }


  /**
   * Returns the default service scopes.
   */
  public static List<String> getDefaultServiceScopes() {
    return RegionCommitmentStubSettings.getDefaultServiceScopes();
  }


  /**
   * Returns a builder for the default credentials for this service.
   */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RegionCommitmentStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder defaultHttpJsonTransportProviderBuilder() {
    return RegionCommitmentStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RegionCommitmentStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RegionCommitmentStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected RegionCommitmentSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /**
   * Builder for RegionCommitmentSettings.
   */
  public static class Builder extends ClientSettings.Builder<RegionCommitmentSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(RegionCommitmentStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(RegionCommitmentStubSettings.newBuilder());
    }

    protected Builder(RegionCommitmentSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RegionCommitmentStubSettings.Builder stubSettings) {
      super(stubSettings);
    }


    public RegionCommitmentStubSettings.Builder getStubSettingsBuilder() {
      return ((RegionCommitmentStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListRegionCommitments.
     */
    public PagedCallSettings.Builder<AggregatedListRegionCommitmentsHttpRequest, CommitmentAggregatedList, AggregatedListRegionCommitmentsPagedResponse> aggregatedListRegionCommitmentsSettings() {
      return getStubSettingsBuilder().aggregatedListRegionCommitmentsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to getRegionCommitment.
     */
    public UnaryCallSettings.Builder<GetRegionCommitmentHttpRequest, Commitment> getRegionCommitmentSettings() {
      return getStubSettingsBuilder().getRegionCommitmentSettings();
    }

    /**
     * Returns the builder for the settings used for calls to insertRegionCommitment.
     */
    public UnaryCallSettings.Builder<InsertRegionCommitmentHttpRequest, Operation> insertRegionCommitmentSettings() {
      return getStubSettingsBuilder().insertRegionCommitmentSettings();
    }

    /**
     * Returns the builder for the settings used for calls to listRegionCommitments.
     */
    public PagedCallSettings.Builder<ListRegionCommitmentsHttpRequest, CommitmentList, ListRegionCommitmentsPagedResponse> listRegionCommitmentsSettings() {
      return getStubSettingsBuilder().listRegionCommitmentsSettings();
    }

    @Override
    public RegionCommitmentSettings build() throws IOException {
      return new RegionCommitmentSettings(this);
    }
  }
}