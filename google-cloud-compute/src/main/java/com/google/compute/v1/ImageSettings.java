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
import static com.google.compute.v1.PagedResponseWrappers.ListImagesPagedResponse;
import com.google.compute.v1.stub.HttpJsonImageStub;
import com.google.compute.v1.stub.ImageStub;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ImageClient}.
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
 * object. For example, to set the total timeout of deleteImage to 30 seconds:
 *
 * <pre>
 * <code>
 * ImageSettings.Builder imageSettingsBuilder =
 *     ImageSettings.newBuilder();
 * imageSettingsBuilder.deleteImageSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * ImageSettings imageSettings = imageSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ImageSettings extends ClientSettings<ImageSettings> {
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

  private final UnaryCallSettings<DeleteImageHttpRequest, Operation> deleteImageSettings;
  private final UnaryCallSettings<DeprecateImageHttpRequest, Operation> deprecateImageSettings;
  private final UnaryCallSettings<GetImageHttpRequest, Image> getImageSettings;
  private final UnaryCallSettings<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageSettings;
  private final UnaryCallSettings<InsertImageHttpRequest, Operation> insertImageSettings;
  private final PagedCallSettings<ListImagesHttpRequest, ImageList, ListImagesPagedResponse> listImagesSettings;

  /**
   * Returns the object with the settings used for calls to deleteImage.
   */
  public UnaryCallSettings<DeleteImageHttpRequest, Operation> deleteImageSettings() {
    return deleteImageSettings;
  }

  /**
   * Returns the object with the settings used for calls to deprecateImage.
   */
  public UnaryCallSettings<DeprecateImageHttpRequest, Operation> deprecateImageSettings() {
    return deprecateImageSettings;
  }

  /**
   * Returns the object with the settings used for calls to getImage.
   */
  public UnaryCallSettings<GetImageHttpRequest, Image> getImageSettings() {
    return getImageSettings;
  }

  /**
   * Returns the object with the settings used for calls to getFromFamilyImage.
   */
  public UnaryCallSettings<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageSettings() {
    return getFromFamilyImageSettings;
  }

  /**
   * Returns the object with the settings used for calls to insertImage.
   */
  public UnaryCallSettings<InsertImageHttpRequest, Operation> insertImageSettings() {
    return insertImageSettings;
  }

  /**
   * Returns the object with the settings used for calls to listImages.
   */
  public PagedCallSettings<ListImagesHttpRequest, ImageList, ListImagesPagedResponse> listImagesSettings() {
    return listImagesSettings;
  }


  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ImageStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonImageStub.create(this);
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
          ImageSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private ImageSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteImageSettings = settingsBuilder.deleteImageSettings().build();
    deprecateImageSettings = settingsBuilder.deprecateImageSettings().build();
    getImageSettings = settingsBuilder.getImageSettings().build();
    getFromFamilyImageSettings = settingsBuilder.getFromFamilyImageSettings().build();
    insertImageSettings = settingsBuilder.insertImageSettings().build();
    listImagesSettings = settingsBuilder.listImagesSettings().build();
  }

  private static final PagedListDescriptor<ListImagesHttpRequest, ImageList, Image> LIST_IMAGES_PAGE_STR_DESC =
      new PagedListDescriptor<ListImagesHttpRequest, ImageList, Image>() {
        @Override
        public String emptyToken() {
          return "";
        }
        @Override
        public ListImagesHttpRequest injectToken(ListImagesHttpRequest payload, String token) {
          return ListImagesHttpRequest
            .newBuilder(payload)
            .setPageToken(token)
            .build();
        }
        @Override
        public ListImagesHttpRequest injectPageSize(ListImagesHttpRequest payload, int pageSize) {
          return ListImagesHttpRequest
            .newBuilder(payload)
            .setMaxResults(pageSize)
            .build();
        }
        @Override
        public Integer extractPageSize(ListImagesHttpRequest payload) {
          return payload.getMaxResults();
        }
        @Override
        public String extractNextToken(ImageList payload) {
          return payload.getNextPageToken();
        }
        @Override
        public Iterable<Image> extractResources(ImageList payload) {
          return payload.getItems();
        }
      };

  private static final PagedListResponseFactory<ListImagesHttpRequest, ImageList, ListImagesPagedResponse> LIST_IMAGES_PAGE_STR_FACT =
      new PagedListResponseFactory<ListImagesHttpRequest, ImageList, ListImagesPagedResponse>() {
        @Override
        public ApiFuture<ListImagesPagedResponse> getFuturePagedResponse(
            UnaryCallable<ListImagesHttpRequest, ImageList> callable,
            ListImagesHttpRequest request,
            ApiCallContext context,
            ApiFuture<ImageList> futureResponse) {
          PageContext<ListImagesHttpRequest, ImageList, Image> pageContext =
              PageContext.create(callable, LIST_IMAGES_PAGE_STR_DESC, request, context);
          return ListImagesPagedResponse.createAsync(pageContext, futureResponse);
        }
      };


  /**
   * Builder for ImageSettings.
   */
  public static class Builder extends ClientSettings.Builder<ImageSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteImageHttpRequest, Operation> deleteImageSettings;
    private final UnaryCallSettings.Builder<DeprecateImageHttpRequest, Operation> deprecateImageSettings;
    private final UnaryCallSettings.Builder<GetImageHttpRequest, Image> getImageSettings;
    private final UnaryCallSettings.Builder<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageSettings;
    private final UnaryCallSettings.Builder<InsertImageHttpRequest, Operation> insertImageSettings;
    private final PagedCallSettings.Builder<ListImagesHttpRequest, ImageList, ListImagesPagedResponse> listImagesSettings;

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

      deleteImageSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deprecateImageSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getImageSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getFromFamilyImageSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertImageSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listImagesSettings = PagedCallSettings.newBuilder(
          LIST_IMAGES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteImageSettings,
          deprecateImageSettings,
          getImageSettings,
          getFromFamilyImageSettings,
          insertImageSettings,
          listImagesSettings
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

      builder.deleteImageSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.deprecateImageSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getImageSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.getFromFamilyImageSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.insertImageSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder.listImagesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(ImageSettings settings) {
      super(settings);

      deleteImageSettings = settings.deleteImageSettings.toBuilder();
      deprecateImageSettings = settings.deprecateImageSettings.toBuilder();
      getImageSettings = settings.getImageSettings.toBuilder();
      getFromFamilyImageSettings = settings.getFromFamilyImageSettings.toBuilder();
      insertImageSettings = settings.insertImageSettings.toBuilder();
      listImagesSettings = settings.listImagesSettings.toBuilder();

      unaryMethodSettingsBuilders = ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
          deleteImageSettings,
          deprecateImageSettings,
          getImageSettings,
          getFromFamilyImageSettings,
          insertImageSettings,
          listImagesSettings
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
     * Returns the builder for the settings used for calls to deleteImage.
     */
    public UnaryCallSettings.Builder<DeleteImageHttpRequest, Operation> deleteImageSettings() {
      return deleteImageSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deprecateImage.
     */
    public UnaryCallSettings.Builder<DeprecateImageHttpRequest, Operation> deprecateImageSettings() {
      return deprecateImageSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getImage.
     */
    public UnaryCallSettings.Builder<GetImageHttpRequest, Image> getImageSettings() {
      return getImageSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getFromFamilyImage.
     */
    public UnaryCallSettings.Builder<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageSettings() {
      return getFromFamilyImageSettings;
    }

    /**
     * Returns the builder for the settings used for calls to insertImage.
     */
    public UnaryCallSettings.Builder<InsertImageHttpRequest, Operation> insertImageSettings() {
      return insertImageSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listImages.
     */
    public PagedCallSettings.Builder<ListImagesHttpRequest, ImageList, ListImagesPagedResponse> listImagesSettings() {
      return listImagesSettings;
    }

    @Override
    public ImageSettings build() throws IOException {
      return new ImageSettings(this);
    }
  }
}