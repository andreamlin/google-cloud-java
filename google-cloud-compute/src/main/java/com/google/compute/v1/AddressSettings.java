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
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.GrpcExtraHeaderData;
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
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListAddressesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListAddressesPagedResponse;
import com.google.compute.v1.stub.AddressStub;
import com.google.compute.v1.stub.HttpJsonAddressStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AddressClient}.
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
 * object. For example, to set the total timeout of deleteAddress to 30 seconds:
 *
 * <pre>
 * <code>
 * AddressSettings.Builder addressSettingsBuilder =
 *     AddressSettings.newBuilder();
 * addressSettingsBuilder.deleteAddressSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * AddressSettings addressSettings = addressSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class AddressSettings extends ClientSettings<AddressSettings> {
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

  private final PagedCallSettings<AggregatedListAddressesHttpRequest, AddressAggregatedList, AggregatedListAddressesPagedResponse> aggregatedListAddressesSettings;
  private final UnaryCallSettings<DeleteAddressHttpRequest, Operation> deleteAddressSettings;
  private final UnaryCallSettings<GetAddressHttpRequest, Address> getAddressSettings;
  private final UnaryCallSettings<InsertAddressHttpRequest, Operation> insertAddressSettings;
  private final PagedCallSettings<ListAddressesHttpRequest, AddressList, ListAddressesPagedResponse> listAddressesSettings;

  /**
   * Returns the object with the settings used for calls to aggregatedListAddresses.
   */
  public PagedCallSettings<AggregatedListAddressesHttpRequest, AddressAggregatedList, AggregatedListAddressesPagedResponse> aggregatedListAddressesSettings() {
    return aggregatedListAddressesSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteAddress.
   */
  public UnaryCallSettings<DeleteAddressHttpRequest, Operation> deleteAddressSettings() {
    return deleteAddressSettings;
  }

  /**
   * Returns the object with the settings used for calls to getAddress.
   */
  public UnaryCallSettings<GetAddressHttpRequest, Address> getAddressSettings() {
    return getAddressSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertAddress.
   */
  public UnaryCallSettings<InsertAddressHttpRequest, Operation> insertAddressSettings() {
    return insertAddressSettings;
  }

  /**
   * Returns the object with the settings used for calls to listAddresses.
   */
  public PagedCallSettings<ListAddressesHttpRequest, AddressList, ListAddressesPagedResponse> listAddressesSettings() {
    return listAddressesSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AddressStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonAddressStub.create(this);
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
          AddressSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private AddressSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    aggregatedListAddressesSettings = settingsBuilder.aggregatedListAddressesSettings().build();
    deleteAddressSettings = settingsBuilder.deleteAddressSettings().build();
    getAddressSettings = settingsBuilder.getAddressSettings().build();
    insertAddressSettings = settingsBuilder.insertAddressSettings().build();
    listAddressesSettings = settingsBuilder.listAddressesSettings().build();
  }

  private static final PagedListDescriptor<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> AGGREGATED_LIST_ADDRESSES_PAGE_STR_DESC =
      new PagedListDescriptor<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public AggregatedListAddressesHttpRequest injectToken(AggregatedListAddressesHttpRequest payload, String token) {
          return AggregatedListAddressesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public AggregatedListAddressesHttpRequest injectPageSize(AggregatedListAddressesHttpRequest payload, int pageSize) {
          return AggregatedListAddressesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(AggregatedListAddressesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(AddressAggregatedList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Address> extractResources(AddressAggregatedList payload) {
          return payload.getItems().getAddresses();
        }
      };

  private static final PagedListDescriptor<ListAddressesHttpRequest, AddressList, Address> LIST_ADDRESSES_PAGE_STR_DESC =
      new PagedListDescriptor<ListAddressesHttpRequest, AddressList, Address>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListAddressesHttpRequest injectToken(ListAddressesHttpRequest payload, String token) {
          return ListAddressesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListAddressesHttpRequest injectPageSize(ListAddressesHttpRequest payload, int pageSize) {
          return ListAddressesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListAddressesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(AddressList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Address> extractResources(AddressList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<AggregatedListAddressesHttpRequest, AddressAggregatedList, AggregatedListAddressesPagedResponse> AGGREGATED_LIST_ADDRESSES_PAGE_STR_FACT =
      new PagedListResponseFactory<AggregatedListAddressesHttpRequest, AddressAggregatedList, AggregatedListAddressesPagedResponse>() {
        @Override
        public ApiFuture<AggregatedListAddressesPagedResponse> getFuturePagedResponse(
            UnaryCallable<AggregatedListAddressesHttpRequest, AddressAggregatedList> callable,
            AggregatedListAddressesHttpRequest request,
            ApiCallContext context,
            ApiFuture<AddressAggregatedList> futureResponse) {
          PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> pageContext =
              PageContext.create(callable, AGGREGATED_LIST_ADDRESSES_PAGE_STR_DESC, request, context);
          return AggregatedListAddressesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };

  private static final PagedListResponseFactory<ListAddressesHttpRequest, AddressList, ListAddressesPagedResponse> LIST_ADDRESSES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListAddressesHttpRequest, AddressList, ListAddressesPagedResponse>() {
        @Override
        public ApiFuture<ListAddressesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListAddressesHttpRequest, AddressList> callable,
            ListAddressesHttpRequest request,
            ApiCallContext context,
            ApiFuture<AddressList> futureResponse) {
          PageContext<ListAddressesHttpRequest, AddressList, Address> pageContext =
              PageContext.create(callable, LIST_ADDRESSES_PAGE_STR_DESC, request, context);
          return ListAddressesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for AddressSettings.
   */
  public static class Builder extends ClientSettings.Builder<AddressSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<AggregatedListAddressesHttpRequest, AddressAggregatedList, AggregatedListAddressesPagedResponse> aggregatedListAddressesSettings;
    private final UnaryCallSettings.Builder<DeleteAddressHttpRequest, Operation> deleteAddressSettings;
    private final UnaryCallSettings.Builder<GetAddressHttpRequest, Address> getAddressSettings;
    private final UnaryCallSettings.Builder<InsertAddressHttpRequest, Operation> insertAddressSettings;
    private final PagedCallSettings.Builder<ListAddressesHttpRequest, AddressList, ListAddressesPagedResponse> listAddressesSettings;

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

      aggregatedListAddressesSettings = PagedCallSettings.newBuilder(
          AGGREGATED_LIST_ADDRESSES_PAGE_STR_FACT);

      deleteAddressSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getAddressSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertAddressSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listAddressesSettings = PagedCallSettings.newBuilder(
          LIST_ADDRESSES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          aggregatedListAddressesSettings,
          deleteAddressSettings,
          getAddressSettings,
          insertAddressSettings,
          listAddressesSettings
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

      builder.aggregatedListAddressesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deleteAddressSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getAddressSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertAddressSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listAddressesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(AddressSettings settings) {
      super(settings);

      aggregatedListAddressesSettings = settings.aggregatedListAddressesSettings.toBuilder();
      deleteAddressSettings = settings.deleteAddressSettings.toBuilder();
      getAddressSettings = settings.getAddressSettings.toBuilder();
      insertAddressSettings = settings.insertAddressSettings.toBuilder();
      listAddressesSettings = settings.listAddressesSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          aggregatedListAddressesSettings,
          deleteAddressSettings,
          getAddressSettings,
          insertAddressSettings,
          listAddressesSettings
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
     * Returns the builder for the settings used for calls to aggregatedListAddresses.
     */
    public PagedCallSettings.Builder<AggregatedListAddressesHttpRequest, AddressAggregatedList, AggregatedListAddressesPagedResponse> aggregatedListAddressesSettings() {
      return aggregatedListAddressesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteAddress.
     */
    public UnaryCallSettings.Builder<DeleteAddressHttpRequest, Operation> deleteAddressSettings() {
      return deleteAddressSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getAddress.
     */
    public UnaryCallSettings.Builder<GetAddressHttpRequest, Address> getAddressSettings() {
      return getAddressSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertAddress.
     */
    public UnaryCallSettings.Builder<InsertAddressHttpRequest, Operation> insertAddressSettings() {
      return insertAddressSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listAddresses.
     */
    public PagedCallSettings.Builder<ListAddressesHttpRequest, AddressList, ListAddressesPagedResponse> listAddressesSettings() {
      return listAddressesSettings;
    }

    @Override
    public AddressSettings build() throws IOException {
      return new AddressSettings(this);
    }
  }
}