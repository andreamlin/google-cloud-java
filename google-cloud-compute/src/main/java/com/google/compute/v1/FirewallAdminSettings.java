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
import static com.google.compute.v1.PagedResponseWrappers.ListFirewallsPagedResponse;
import com.google.compute.v1.stub.FirewallAdminStub;
import com.google.compute.v1.stub.HttpJsonFirewallAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link FirewallAdminClient}.
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
 * object. For example, to set the total timeout of deleteFirewall to 30 seconds:
 *
 * <pre>
 * <code>
 * FirewallAdminSettings.Builder firewallAdminSettingsBuilder =
 *     FirewallAdminSettings.defaultBuilder();
 * firewallAdminSettingsBuilder.deleteFirewallSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * FirewallAdminSettings firewallAdminSettings = firewallAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class FirewallAdminSettings extends ClientSettings {
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

  private final SimpleCallSettings<DeleteFirewallHttpRequest, Operation> deleteFirewallSettings;
  private final SimpleCallSettings<GetFirewallHttpRequest, Firewall> getFirewallSettings;
  private final SimpleCallSettings<InsertFirewallHttpRequest, Operation> insertFirewallSettings;
  private final PagedCallSettings<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse> listFirewallsSettings;
  private final SimpleCallSettings<PatchFirewallHttpRequest, Operation> patchFirewallSettings;
  private final SimpleCallSettings<UpdateFirewallHttpRequest, Operation> updateFirewallSettings;

  /**
   * Returns the object with the settings used for calls to deleteFirewall.
   */
  public SimpleCallSettings<DeleteFirewallHttpRequest, Operation> deleteFirewallSettings() {
    return deleteFirewallSettings;
  }

  /**
   * Returns the object with the settings used for calls to getFirewall.
   */
  public SimpleCallSettings<GetFirewallHttpRequest, Firewall> getFirewallSettings() {
    return getFirewallSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertFirewall.
   */
  public SimpleCallSettings<InsertFirewallHttpRequest, Operation> insertFirewallSettings() {
    return insertFirewallSettings;
  }

  /**
   * Returns the object with the settings used for calls to listFirewalls.
   */
  public PagedCallSettings<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse> listFirewallsSettings() {
    return listFirewallsSettings;
  }

  /**
   * Returns the object with the settings used for calls to patchFirewall.
   */
  public SimpleCallSettings<PatchFirewallHttpRequest, Operation> patchFirewallSettings() {
    return patchFirewallSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateFirewall.
   */
  public SimpleCallSettings<UpdateFirewallHttpRequest, Operation> updateFirewallSettings() {
    return updateFirewallSettings;
  }


  public FirewallAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpJsonFirewallAdminStub.create(this);
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
          FirewallAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private FirewallAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    deleteFirewallSettings = settingsBuilder.deleteFirewallSettings().build();
    getFirewallSettings = settingsBuilder.getFirewallSettings().build();
    insertFirewallSettings = settingsBuilder.insertFirewallSettings().build();
    listFirewallsSettings = settingsBuilder.listFirewallsSettings().build();
    patchFirewallSettings = settingsBuilder.patchFirewallSettings().build();
    updateFirewallSettings = settingsBuilder.updateFirewallSettings().build();
  }

  private static final PagedListDescriptor<ListFirewallsHttpRequest, FirewallList, Firewall> LIST_FIREWALLS_PAGE_STR_DESC =
      new PagedListDescriptor<ListFirewallsHttpRequest, FirewallList, Firewall>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListFirewallsHttpRequest injectToken(ListFirewallsHttpRequest payload, String token) {
          return ListFirewallsHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListFirewallsHttpRequest injectPageSize(ListFirewallsHttpRequest payload, int pageSize) {
          return ListFirewallsHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListFirewallsHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(FirewallList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Firewall> extractResources(FirewallList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse> LIST_FIREWALLS_PAGE_STR_FACT =
      new PagedListResponseFactory<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse>() {
        @Override
        public ApiFuture<ListFirewallsPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListFirewallsHttpRequest, FirewallList> callable,
            ListFirewallsHttpRequest request,
            ApiCallContext context,
            ApiFuture<FirewallList> futureResponse) {
          PageContext<ListFirewallsHttpRequest, FirewallList, Firewall> pageContext =
              PageContext.create(callable, LIST_FIREWALLS_PAGE_STR_DESC, request, context);
          return ListFirewallsPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for FirewallAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<DeleteFirewallHttpRequest, Operation> deleteFirewallSettings;
    private final SimpleCallSettings.Builder<GetFirewallHttpRequest, Firewall> getFirewallSettings;
    private final SimpleCallSettings.Builder<InsertFirewallHttpRequest, Operation> insertFirewallSettings;
    private final PagedCallSettings.Builder<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse> listFirewallsSettings;
    private final SimpleCallSettings.Builder<PatchFirewallHttpRequest, Operation> patchFirewallSettings;
    private final SimpleCallSettings.Builder<UpdateFirewallHttpRequest, Operation> updateFirewallSettings;

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

      deleteFirewallSettings = SimpleCallSettings.newBuilder();

      getFirewallSettings = SimpleCallSettings.newBuilder();

      insertFirewallSettings = SimpleCallSettings.newBuilder();

      listFirewallsSettings = PagedCallSettings.newBuilder(
          LIST_FIREWALLS_PAGE_STR_FACT);

      patchFirewallSettings = SimpleCallSettings.newBuilder();

      updateFirewallSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          deleteFirewallSettings,
          getFirewallSettings,
          insertFirewallSettings,
          listFirewallsSettings,
          patchFirewallSettings,
          updateFirewallSettings
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

      builder.deleteFirewallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getFirewallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertFirewallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listFirewallsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.patchFirewallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.updateFirewallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(FirewallAdminSettings settings) {
      super(settings);

      deleteFirewallSettings = settings.deleteFirewallSettings.toBuilder();
      getFirewallSettings = settings.getFirewallSettings.toBuilder();
      insertFirewallSettings = settings.insertFirewallSettings.toBuilder();
      listFirewallsSettings = settings.listFirewallsSettings.toBuilder();
      patchFirewallSettings = settings.patchFirewallSettings.toBuilder();
      updateFirewallSettings = settings.updateFirewallSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          deleteFirewallSettings,
          getFirewallSettings,
          insertFirewallSettings,
          listFirewallsSettings,
          patchFirewallSettings,
          updateFirewallSettings
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
     * Returns the builder for the settings used for calls to deleteFirewall.
     */
    public SimpleCallSettings.Builder<DeleteFirewallHttpRequest, Operation> deleteFirewallSettings() {
      return deleteFirewallSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getFirewall.
     */
    public SimpleCallSettings.Builder<GetFirewallHttpRequest, Firewall> getFirewallSettings() {
      return getFirewallSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertFirewall.
     */
    public SimpleCallSettings.Builder<InsertFirewallHttpRequest, Operation> insertFirewallSettings() {
      return insertFirewallSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listFirewalls.
     */
    public PagedCallSettings.Builder<ListFirewallsHttpRequest, FirewallList, ListFirewallsPagedResponse> listFirewallsSettings() {
      return listFirewallsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to patchFirewall.
     */
    public SimpleCallSettings.Builder<PatchFirewallHttpRequest, Operation> patchFirewallSettings() {
      return patchFirewallSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateFirewall.
     */
    public SimpleCallSettings.Builder<UpdateFirewallHttpRequest, Operation> updateFirewallSettings() {
      return updateFirewallSettings;
    }

    @Override
    public FirewallAdminSettings build() throws IOException {
      return new FirewallAdminSettings(this);
    }
  }
}