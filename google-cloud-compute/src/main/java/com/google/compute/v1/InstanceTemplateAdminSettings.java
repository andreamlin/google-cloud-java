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
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceTemplatesPagedResponse;
import com.google.compute.v1.stub.HttpInstanceTemplateAdminStub;
import com.google.compute.v1.stub.InstanceTemplateAdminStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.http.HttpStatus;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceTemplateAdminClient}.
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
 * object. For example, to set the total timeout of deleteInstanceTemplate to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceTemplateAdminSettings.Builder instanceTemplateAdminSettingsBuilder =
 *     InstanceTemplateAdminSettings.defaultBuilder();
 * instanceTemplateAdminSettingsBuilder.deleteInstanceTemplateSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceTemplateAdminSettings instanceTemplateAdminSettings = instanceTemplateAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceTemplateAdminSettings extends ClientSettings {
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

  private final SimpleCallSettings<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateSettings;
  private final SimpleCallSettings<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateSettings;
  private final SimpleCallSettings<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateSettings;
  private final PagedCallSettings<ListInstanceTemplatesHttpRequest, InstanceTemplateList, ListInstanceTemplatesPagedResponse> listInstanceTemplatesSettings;

  /**
   * Returns the object with the settings used for calls to deleteInstanceTemplate.
   */
  public SimpleCallSettings<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateSettings() {
    return deleteInstanceTemplateSettings;
  }

  /**
   * Returns the object with the settings used for calls to getInstanceTemplate.
   */
  public SimpleCallSettings<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateSettings() {
    return getInstanceTemplateSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertInstanceTemplate.
   */
  public SimpleCallSettings<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateSettings() {
    return insertInstanceTemplateSettings;
  }

  /**
   * Returns the object with the settings used for calls to listInstanceTemplates.
   */
  public PagedCallSettings<ListInstanceTemplatesHttpRequest, InstanceTemplateList, ListInstanceTemplatesPagedResponse> listInstanceTemplatesSettings() {
    return listInstanceTemplatesSettings;
  }


  public InstanceTemplateAdminStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(HttpJsonTransport.getHttpJsonTransportName())) {
      return HttpInstanceTemplateAdminStub.create(this);
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
          InstanceTemplateAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private InstanceTemplateAdminSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    deleteInstanceTemplateSettings = settingsBuilder.deleteInstanceTemplateSettings().build();
    getInstanceTemplateSettings = settingsBuilder.getInstanceTemplateSettings().build();
    insertInstanceTemplateSettings = settingsBuilder.insertInstanceTemplateSettings().build();
    listInstanceTemplatesSettings = settingsBuilder.listInstanceTemplatesSettings().build();
  }

  private static final PagedListDescriptor<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate> LIST_INSTANCE_TEMPLATES_PAGE_STR_DESC =
      new PagedListDescriptor<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListInstanceTemplatesHttpRequest injectToken(ListInstanceTemplatesHttpRequest payload, String token) {
          return ListInstanceTemplatesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListInstanceTemplatesHttpRequest injectPageSize(ListInstanceTemplatesHttpRequest payload, int pageSize) {
          return ListInstanceTemplatesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListInstanceTemplatesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(InstanceTemplateList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<InstanceTemplate> extractResources(InstanceTemplateList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListInstanceTemplatesHttpRequest, InstanceTemplateList, ListInstanceTemplatesPagedResponse> LIST_INSTANCE_TEMPLATES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListInstanceTemplatesHttpRequest, InstanceTemplateList, ListInstanceTemplatesPagedResponse>() {
        @Override
        public ApiFuture<ListInstanceTemplatesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListInstanceTemplatesHttpRequest, InstanceTemplateList> callable,
            ListInstanceTemplatesHttpRequest request,
            ApiCallContext context,
            ApiFuture<InstanceTemplateList> futureResponse) {
          PageContext<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate> pageContext =
              PageContext.create(callable, LIST_INSTANCE_TEMPLATES_PAGE_STR_DESC, request, context);
          return ListInstanceTemplatesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for InstanceTemplateAdminSettings.
   */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateSettings;
    private final SimpleCallSettings.Builder<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateSettings;
    private final SimpleCallSettings.Builder<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateSettings;
    private final PagedCallSettings.Builder<ListInstanceTemplatesHttpRequest, InstanceTemplateList, ListInstanceTemplatesPagedResponse> listInstanceTemplatesSettings;

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

      deleteInstanceTemplateSettings = SimpleCallSettings.newBuilder();

      getInstanceTemplateSettings = SimpleCallSettings.newBuilder();

      insertInstanceTemplateSettings = SimpleCallSettings.newBuilder();

      listInstanceTemplatesSettings = PagedCallSettings.newBuilder(
          LIST_INSTANCE_TEMPLATES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          deleteInstanceTemplateSettings,
          getInstanceTemplateSettings,
          insertInstanceTemplateSettings,
          listInstanceTemplatesSettings
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

      builder.deleteInstanceTemplateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getInstanceTemplateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertInstanceTemplateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listInstanceTemplatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(InstanceTemplateAdminSettings settings) {
      super(settings);

      deleteInstanceTemplateSettings = settings.deleteInstanceTemplateSettings.toBuilder();
      getInstanceTemplateSettings = settings.getInstanceTemplateSettings.toBuilder();
      insertInstanceTemplateSettings = settings.insertInstanceTemplateSettings.toBuilder();
      listInstanceTemplatesSettings = settings.listInstanceTemplatesSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder>of(
          deleteInstanceTemplateSettings,
          getInstanceTemplateSettings,
          insertInstanceTemplateSettings,
          listInstanceTemplatesSettings
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
     * Returns the builder for the settings used for calls to deleteInstanceTemplate.
     */
    public SimpleCallSettings.Builder<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateSettings() {
      return deleteInstanceTemplateSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getInstanceTemplate.
     */
    public SimpleCallSettings.Builder<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateSettings() {
      return getInstanceTemplateSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertInstanceTemplate.
     */
    public SimpleCallSettings.Builder<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateSettings() {
      return insertInstanceTemplateSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listInstanceTemplates.
     */
    public PagedCallSettings.Builder<ListInstanceTemplatesHttpRequest, InstanceTemplateList, ListInstanceTemplatesPagedResponse> listInstanceTemplatesSettings() {
      return listInstanceTemplatesSettings;
    }

    @Override
    public InstanceTemplateAdminSettings build() throws IOException {
      return new InstanceTemplateAdminSettings(this);
    }
  }
}