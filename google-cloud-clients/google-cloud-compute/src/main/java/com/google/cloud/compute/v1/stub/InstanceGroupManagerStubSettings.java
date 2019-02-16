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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InstanceGroupManagerClient.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListInstanceGroupManagersPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.ApiMessageOperationTransformers;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList;
import com.google.cloud.compute.v1.InstanceGroupManagerList;
import com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersScopedList;
import com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceGroupManagerStub}.
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
 * example, to set the total timeout of getInstanceGroupManager to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceGroupManagerStubSettings.Builder instanceGroupManagerSettingsBuilder =
 *     InstanceGroupManagerStubSettings.newBuilder();
 * instanceGroupManagerSettingsBuilder.getInstanceGroupManagerSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceGroupManagerStubSettings instanceGroupManagerSettings = instanceGroupManagerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class InstanceGroupManagerStubSettings
    extends StubSettings<InstanceGroupManagerStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesInstanceGroupManagerSettings;
  private final OperationCallSettings<
          AbandonInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      abandonInstancesInstanceGroupManagerOperationSettings;
  private final PagedCallSettings<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListInstanceGroupManagersPagedResponse>
      aggregatedListInstanceGroupManagersSettings;
  private final UnaryCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation>
      deleteInstanceGroupManagerSettings;
  private final OperationCallSettings<
          DeleteInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      deleteInstanceGroupManagerOperationSettings;
  private final UnaryCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesInstanceGroupManagerSettings;
  private final OperationCallSettings<
          DeleteInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      deleteInstancesInstanceGroupManagerOperationSettings;
  private final UnaryCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getInstanceGroupManagerSettings;
  private final UnaryCallSettings<InsertInstanceGroupManagerHttpRequest, Operation>
      insertInstanceGroupManagerSettings;
  private final OperationCallSettings<
          InsertInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      insertInstanceGroupManagerOperationSettings;
  private final PagedCallSettings<
          ListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerList,
          ListInstanceGroupManagersPagedResponse>
      listInstanceGroupManagersSettings;
  private final UnaryCallSettings<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse>
      listManagedInstancesInstanceGroupManagersSettings;
  private final UnaryCallSettings<PatchInstanceGroupManagerHttpRequest, Operation>
      patchInstanceGroupManagerSettings;
  private final OperationCallSettings<PatchInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      patchInstanceGroupManagerOperationSettings;
  private final UnaryCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesInstanceGroupManagerSettings;
  private final OperationCallSettings<
          RecreateInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      recreateInstancesInstanceGroupManagerOperationSettings;
  private final UnaryCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation>
      resizeInstanceGroupManagerSettings;
  private final OperationCallSettings<
          ResizeInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      resizeInstanceGroupManagerOperationSettings;
  private final UnaryCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateInstanceGroupManagerSettings;
  private final OperationCallSettings<
          SetInstanceTemplateInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      setInstanceTemplateInstanceGroupManagerOperationSettings;
  private final UnaryCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsInstanceGroupManagerSettings;
  private final OperationCallSettings<
          SetTargetPoolsInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      setTargetPoolsInstanceGroupManagerOperationSettings;

  /**
   * Returns the object with the settings used for calls to abandonInstancesInstanceGroupManager.
   */
  public UnaryCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesInstanceGroupManagerSettings() {
    return abandonInstancesInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to abandonInstancesInstanceGroupManager.
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          AbandonInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      abandonInstancesInstanceGroupManagerOperationSettings() {
    return abandonInstancesInstanceGroupManagerOperationSettings;
  }

  /** Returns the object with the settings used for calls to aggregatedListInstanceGroupManagers. */
  public PagedCallSettings<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListInstanceGroupManagersPagedResponse>
      aggregatedListInstanceGroupManagersSettings() {
    return aggregatedListInstanceGroupManagersSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstanceGroupManager. */
  public UnaryCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation>
      deleteInstanceGroupManagerSettings() {
    return deleteInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstanceGroupManager. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      deleteInstanceGroupManagerOperationSettings() {
    return deleteInstanceGroupManagerOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstancesInstanceGroupManager. */
  public UnaryCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesInstanceGroupManagerSettings() {
    return deleteInstancesInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstancesInstanceGroupManager. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          DeleteInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      deleteInstancesInstanceGroupManagerOperationSettings() {
    return deleteInstancesInstanceGroupManagerOperationSettings;
  }

  /** Returns the object with the settings used for calls to getInstanceGroupManager. */
  public UnaryCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getInstanceGroupManagerSettings() {
    return getInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to insertInstanceGroupManager. */
  public UnaryCallSettings<InsertInstanceGroupManagerHttpRequest, Operation>
      insertInstanceGroupManagerSettings() {
    return insertInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to insertInstanceGroupManager. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<InsertInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      insertInstanceGroupManagerOperationSettings() {
    return insertInstanceGroupManagerOperationSettings;
  }

  /** Returns the object with the settings used for calls to listInstanceGroupManagers. */
  public PagedCallSettings<
          ListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerList,
          ListInstanceGroupManagersPagedResponse>
      listInstanceGroupManagersSettings() {
    return listInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listManagedInstancesInstanceGroupManagers.
   */
  public UnaryCallSettings<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse>
      listManagedInstancesInstanceGroupManagersSettings() {
    return listManagedInstancesInstanceGroupManagersSettings;
  }

  /** Returns the object with the settings used for calls to patchInstanceGroupManager. */
  public UnaryCallSettings<PatchInstanceGroupManagerHttpRequest, Operation>
      patchInstanceGroupManagerSettings() {
    return patchInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to patchInstanceGroupManager. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<PatchInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      patchInstanceGroupManagerOperationSettings() {
    return patchInstanceGroupManagerOperationSettings;
  }

  /**
   * Returns the object with the settings used for calls to recreateInstancesInstanceGroupManager.
   */
  public UnaryCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesInstanceGroupManagerSettings() {
    return recreateInstancesInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to recreateInstancesInstanceGroupManager.
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          RecreateInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      recreateInstancesInstanceGroupManagerOperationSettings() {
    return recreateInstancesInstanceGroupManagerOperationSettings;
  }

  /** Returns the object with the settings used for calls to resizeInstanceGroupManager. */
  public UnaryCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation>
      resizeInstanceGroupManagerSettings() {
    return resizeInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to resizeInstanceGroupManager. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<ResizeInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      resizeInstanceGroupManagerOperationSettings() {
    return resizeInstanceGroupManagerOperationSettings;
  }

  /**
   * Returns the object with the settings used for calls to setInstanceTemplateInstanceGroupManager.
   */
  public UnaryCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateInstanceGroupManagerSettings() {
    return setInstanceTemplateInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setInstanceTemplateInstanceGroupManager.
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetInstanceTemplateInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      setInstanceTemplateInstanceGroupManagerOperationSettings() {
    return setInstanceTemplateInstanceGroupManagerOperationSettings;
  }

  /** Returns the object with the settings used for calls to setTargetPoolsInstanceGroupManager. */
  public UnaryCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsInstanceGroupManagerSettings() {
    return setTargetPoolsInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to setTargetPoolsInstanceGroupManager. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          SetTargetPoolsInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
      setTargetPoolsInstanceGroupManagerOperationSettings() {
    return setTargetPoolsInstanceGroupManagerOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceGroupManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonInstanceGroupManagerStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://www.googleapis.com/compute/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(InstanceGroupManagerStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
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

  protected InstanceGroupManagerStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    abandonInstancesInstanceGroupManagerSettings =
        settingsBuilder.abandonInstancesInstanceGroupManagerSettings().build();
    abandonInstancesInstanceGroupManagerOperationSettings =
        settingsBuilder.abandonInstancesInstanceGroupManagerOperationSettings().build();
    aggregatedListInstanceGroupManagersSettings =
        settingsBuilder.aggregatedListInstanceGroupManagersSettings().build();
    deleteInstanceGroupManagerSettings =
        settingsBuilder.deleteInstanceGroupManagerSettings().build();
    deleteInstanceGroupManagerOperationSettings =
        settingsBuilder.deleteInstanceGroupManagerOperationSettings().build();
    deleteInstancesInstanceGroupManagerSettings =
        settingsBuilder.deleteInstancesInstanceGroupManagerSettings().build();
    deleteInstancesInstanceGroupManagerOperationSettings =
        settingsBuilder.deleteInstancesInstanceGroupManagerOperationSettings().build();
    getInstanceGroupManagerSettings = settingsBuilder.getInstanceGroupManagerSettings().build();
    insertInstanceGroupManagerSettings =
        settingsBuilder.insertInstanceGroupManagerSettings().build();
    insertInstanceGroupManagerOperationSettings =
        settingsBuilder.insertInstanceGroupManagerOperationSettings().build();
    listInstanceGroupManagersSettings = settingsBuilder.listInstanceGroupManagersSettings().build();
    listManagedInstancesInstanceGroupManagersSettings =
        settingsBuilder.listManagedInstancesInstanceGroupManagersSettings().build();
    patchInstanceGroupManagerSettings = settingsBuilder.patchInstanceGroupManagerSettings().build();
    patchInstanceGroupManagerOperationSettings =
        settingsBuilder.patchInstanceGroupManagerOperationSettings().build();
    recreateInstancesInstanceGroupManagerSettings =
        settingsBuilder.recreateInstancesInstanceGroupManagerSettings().build();
    recreateInstancesInstanceGroupManagerOperationSettings =
        settingsBuilder.recreateInstancesInstanceGroupManagerOperationSettings().build();
    resizeInstanceGroupManagerSettings =
        settingsBuilder.resizeInstanceGroupManagerSettings().build();
    resizeInstanceGroupManagerOperationSettings =
        settingsBuilder.resizeInstanceGroupManagerOperationSettings().build();
    setInstanceTemplateInstanceGroupManagerSettings =
        settingsBuilder.setInstanceTemplateInstanceGroupManagerSettings().build();
    setInstanceTemplateInstanceGroupManagerOperationSettings =
        settingsBuilder.setInstanceTemplateInstanceGroupManagerOperationSettings().build();
    setTargetPoolsInstanceGroupManagerSettings =
        settingsBuilder.setTargetPoolsInstanceGroupManagerSettings().build();
    setTargetPoolsInstanceGroupManagerOperationSettings =
        settingsBuilder.setTargetPoolsInstanceGroupManagerOperationSettings().build();
  }

  private static final PagedListDescriptor<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          InstanceGroupManagersScopedList>
      AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              AggregatedListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerAggregatedList,
              InstanceGroupManagersScopedList>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AggregatedListInstanceGroupManagersHttpRequest injectToken(
                AggregatedListInstanceGroupManagersHttpRequest payload, String token) {
              return AggregatedListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public AggregatedListInstanceGroupManagersHttpRequest injectPageSize(
                AggregatedListInstanceGroupManagersHttpRequest payload, int pageSize) {
              return AggregatedListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(AggregatedListInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagerAggregatedList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManagersScopedList> extractResources(
                InstanceGroupManagerAggregatedList payload) {
              return payload.getItemsMap() != null
                  ? payload.getItemsMap().values()
                  : ImmutableList.<InstanceGroupManagersScopedList>of();
            }
          };

  private static final PagedListDescriptor<
          ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager>
      LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerList,
              InstanceGroupManager>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstanceGroupManagersHttpRequest injectToken(
                ListInstanceGroupManagersHttpRequest payload, String token) {
              return ListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListInstanceGroupManagersHttpRequest injectPageSize(
                ListInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagerList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManager> extractResources(
                InstanceGroupManagerList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceGroupManager>of();
            }
          };

  private static final PagedListResponseFactory<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListInstanceGroupManagersPagedResponse>
      AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AggregatedListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerAggregatedList,
              AggregatedListInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<AggregatedListInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            AggregatedListInstanceGroupManagersHttpRequest,
                            InstanceGroupManagerAggregatedList>
                        callable,
                    AggregatedListInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<InstanceGroupManagerAggregatedList> futureResponse) {
              PageContext<
                      AggregatedListInstanceGroupManagersHttpRequest,
                      InstanceGroupManagerAggregatedList,
                      InstanceGroupManagersScopedList>
                  pageContext =
                      PageContext.create(
                          callable,
                          AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return AggregatedListInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerList,
          ListInstanceGroupManagersPagedResponse>
      LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerList,
              ListInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListInstanceGroupManagersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList>
                    callable,
                ListInstanceGroupManagersHttpRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagerList> futureResponse) {
              PageContext<
                      ListInstanceGroupManagersHttpRequest,
                      InstanceGroupManagerList,
                      InstanceGroupManager>
                  pageContext =
                      PageContext.create(
                          callable, LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC, request, context);
              return ListInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for InstanceGroupManagerStubSettings. */
  public static class Builder
      extends StubSettings.Builder<InstanceGroupManagerStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<
            AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            AbandonInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        abandonInstancesInstanceGroupManagerOperationSettings;
    private final PagedCallSettings.Builder<
            AggregatedListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerAggregatedList,
            AggregatedListInstanceGroupManagersPagedResponse>
        aggregatedListInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<DeleteInstanceGroupManagerHttpRequest, Operation>
        deleteInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            DeleteInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        deleteInstanceGroupManagerOperationSettings;
    private final UnaryCallSettings.Builder<
            DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            DeleteInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        deleteInstancesInstanceGroupManagerOperationSettings;
    private final UnaryCallSettings.Builder<
            GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<InsertInstanceGroupManagerHttpRequest, Operation>
        insertInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            InsertInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        insertInstanceGroupManagerOperationSettings;
    private final PagedCallSettings.Builder<
            ListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerList,
            ListInstanceGroupManagersPagedResponse>
        listInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<
            ListManagedInstancesInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListManagedInstancesResponse>
        listManagedInstancesInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<PatchInstanceGroupManagerHttpRequest, Operation>
        patchInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            PatchInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        patchInstanceGroupManagerOperationSettings;
    private final UnaryCallSettings.Builder<
            RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            RecreateInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        recreateInstancesInstanceGroupManagerOperationSettings;
    private final UnaryCallSettings.Builder<ResizeInstanceGroupManagerHttpRequest, Operation>
        resizeInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            ResizeInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        resizeInstanceGroupManagerOperationSettings;
    private final UnaryCallSettings.Builder<
            SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            SetInstanceTemplateInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        setInstanceTemplateInstanceGroupManagerOperationSettings;
    private final UnaryCallSettings.Builder<
            SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsInstanceGroupManagerSettings;
    private final OperationCallSettings.Builder<
            SetTargetPoolsInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        setTargetPoolsInstanceGroupManagerOperationSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
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

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      abandonInstancesInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      abandonInstancesInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      aggregatedListInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      deleteInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      deleteInstancesInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstancesInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      getInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      listInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listManagedInstancesInstanceGroupManagersSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      recreateInstancesInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      recreateInstancesInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      resizeInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      resizeInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      setInstanceTemplateInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      setInstanceTemplateInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      setTargetPoolsInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTargetPoolsInstanceGroupManagerOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesInstanceGroupManagerSettings,
              aggregatedListInstanceGroupManagersSettings,
              deleteInstanceGroupManagerSettings,
              deleteInstancesInstanceGroupManagerSettings,
              getInstanceGroupManagerSettings,
              insertInstanceGroupManagerSettings,
              listInstanceGroupManagersSettings,
              listManagedInstancesInstanceGroupManagersSettings,
              patchInstanceGroupManagerSettings,
              recreateInstancesInstanceGroupManagerSettings,
              resizeInstanceGroupManagerSettings,
              setInstanceTemplateInstanceGroupManagerSettings,
              setTargetPoolsInstanceGroupManagerSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .abandonInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .aggregatedListInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listManagedInstancesInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .recreateInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .resizeInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setInstanceTemplateInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setTargetPoolsInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .abandonInstancesInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AbandonInstancesInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .deleteInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .deleteInstancesInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteInstancesInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .insertInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .patchInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PatchInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .recreateInstancesInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RecreateInstancesInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .resizeInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ResizeInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setInstanceTemplateInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetInstanceTemplateInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .setTargetPoolsInstanceGroupManagerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetTargetPoolsInstanceGroupManagerHttpRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(ApiMessageOperationTransformers.ResponseTransformer.create(EmptyMessage.class))
          .setMetadataTransformer(ApiMessageOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(InstanceGroupManagerStubSettings settings) {
      super(settings);

      abandonInstancesInstanceGroupManagerSettings =
          settings.abandonInstancesInstanceGroupManagerSettings.toBuilder();
      abandonInstancesInstanceGroupManagerOperationSettings =
          settings.abandonInstancesInstanceGroupManagerOperationSettings.toBuilder();
      aggregatedListInstanceGroupManagersSettings =
          settings.aggregatedListInstanceGroupManagersSettings.toBuilder();
      deleteInstanceGroupManagerSettings = settings.deleteInstanceGroupManagerSettings.toBuilder();
      deleteInstanceGroupManagerOperationSettings =
          settings.deleteInstanceGroupManagerOperationSettings.toBuilder();
      deleteInstancesInstanceGroupManagerSettings =
          settings.deleteInstancesInstanceGroupManagerSettings.toBuilder();
      deleteInstancesInstanceGroupManagerOperationSettings =
          settings.deleteInstancesInstanceGroupManagerOperationSettings.toBuilder();
      getInstanceGroupManagerSettings = settings.getInstanceGroupManagerSettings.toBuilder();
      insertInstanceGroupManagerSettings = settings.insertInstanceGroupManagerSettings.toBuilder();
      insertInstanceGroupManagerOperationSettings =
          settings.insertInstanceGroupManagerOperationSettings.toBuilder();
      listInstanceGroupManagersSettings = settings.listInstanceGroupManagersSettings.toBuilder();
      listManagedInstancesInstanceGroupManagersSettings =
          settings.listManagedInstancesInstanceGroupManagersSettings.toBuilder();
      patchInstanceGroupManagerSettings = settings.patchInstanceGroupManagerSettings.toBuilder();
      patchInstanceGroupManagerOperationSettings =
          settings.patchInstanceGroupManagerOperationSettings.toBuilder();
      recreateInstancesInstanceGroupManagerSettings =
          settings.recreateInstancesInstanceGroupManagerSettings.toBuilder();
      recreateInstancesInstanceGroupManagerOperationSettings =
          settings.recreateInstancesInstanceGroupManagerOperationSettings.toBuilder();
      resizeInstanceGroupManagerSettings = settings.resizeInstanceGroupManagerSettings.toBuilder();
      resizeInstanceGroupManagerOperationSettings =
          settings.resizeInstanceGroupManagerOperationSettings.toBuilder();
      setInstanceTemplateInstanceGroupManagerSettings =
          settings.setInstanceTemplateInstanceGroupManagerSettings.toBuilder();
      setInstanceTemplateInstanceGroupManagerOperationSettings =
          settings.setInstanceTemplateInstanceGroupManagerOperationSettings.toBuilder();
      setTargetPoolsInstanceGroupManagerSettings =
          settings.setTargetPoolsInstanceGroupManagerSettings.toBuilder();
      setTargetPoolsInstanceGroupManagerOperationSettings =
          settings.setTargetPoolsInstanceGroupManagerOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesInstanceGroupManagerSettings,
              aggregatedListInstanceGroupManagersSettings,
              deleteInstanceGroupManagerSettings,
              deleteInstancesInstanceGroupManagerSettings,
              getInstanceGroupManagerSettings,
              insertInstanceGroupManagerSettings,
              listInstanceGroupManagersSettings,
              listManagedInstancesInstanceGroupManagersSettings,
              patchInstanceGroupManagerSettings,
              recreateInstancesInstanceGroupManagerSettings,
              resizeInstanceGroupManagerSettings,
              setInstanceTemplateInstanceGroupManagerSettings,
              setTargetPoolsInstanceGroupManagerSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /**
     * Returns the builder for the settings used for calls to abandonInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesInstanceGroupManagerSettings() {
      return abandonInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to abandonInstancesInstanceGroupManager.
     */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AbandonInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        abandonInstancesInstanceGroupManagerOperationSettings() {
      return abandonInstancesInstanceGroupManagerOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            AggregatedListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerAggregatedList,
            AggregatedListInstanceGroupManagersPagedResponse>
        aggregatedListInstanceGroupManagersSettings() {
      return aggregatedListInstanceGroupManagersSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstanceGroupManager. */
    public UnaryCallSettings.Builder<DeleteInstanceGroupManagerHttpRequest, Operation>
        deleteInstanceGroupManagerSettings() {
      return deleteInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstanceGroupManager. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        deleteInstanceGroupManagerOperationSettings() {
      return deleteInstanceGroupManagerOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesInstanceGroupManagerSettings() {
      return deleteInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstancesInstanceGroupManager.
     */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        deleteInstancesInstanceGroupManagerOperationSettings() {
      return deleteInstancesInstanceGroupManagerOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getInstanceGroupManager. */
    public UnaryCallSettings.Builder<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getInstanceGroupManagerSettings() {
      return getInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to insertInstanceGroupManager. */
    public UnaryCallSettings.Builder<InsertInstanceGroupManagerHttpRequest, Operation>
        insertInstanceGroupManagerSettings() {
      return insertInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to insertInstanceGroupManager. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        insertInstanceGroupManagerOperationSettings() {
      return insertInstanceGroupManagerOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listInstanceGroupManagers. */
    public PagedCallSettings.Builder<
            ListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerList,
            ListInstanceGroupManagersPagedResponse>
        listInstanceGroupManagersSettings() {
      return listInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listManagedInstancesInstanceGroupManagers.
     */
    public UnaryCallSettings.Builder<
            ListManagedInstancesInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListManagedInstancesResponse>
        listManagedInstancesInstanceGroupManagersSettings() {
      return listManagedInstancesInstanceGroupManagersSettings;
    }

    /** Returns the builder for the settings used for calls to patchInstanceGroupManager. */
    public UnaryCallSettings.Builder<PatchInstanceGroupManagerHttpRequest, Operation>
        patchInstanceGroupManagerSettings() {
      return patchInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to patchInstanceGroupManager. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            PatchInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        patchInstanceGroupManagerOperationSettings() {
      return patchInstanceGroupManagerOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to recreateInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesInstanceGroupManagerSettings() {
      return recreateInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to recreateInstancesInstanceGroupManager.
     */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            RecreateInstancesInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        recreateInstancesInstanceGroupManagerOperationSettings() {
      return recreateInstancesInstanceGroupManagerOperationSettings;
    }

    /** Returns the builder for the settings used for calls to resizeInstanceGroupManager. */
    public UnaryCallSettings.Builder<ResizeInstanceGroupManagerHttpRequest, Operation>
        resizeInstanceGroupManagerSettings() {
      return resizeInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to resizeInstanceGroupManager. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ResizeInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        resizeInstanceGroupManagerOperationSettings() {
      return resizeInstanceGroupManagerOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * setInstanceTemplateInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateInstanceGroupManagerSettings() {
      return setInstanceTemplateInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * setInstanceTemplateInstanceGroupManager.
     */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetInstanceTemplateInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        setInstanceTemplateInstanceGroupManagerOperationSettings() {
      return setInstanceTemplateInstanceGroupManagerOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetPoolsInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsInstanceGroupManagerSettings() {
      return setTargetPoolsInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetPoolsInstanceGroupManager.
     */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetTargetPoolsInstanceGroupManagerHttpRequest, EmptyMessage, Operation>
        setTargetPoolsInstanceGroupManagerOperationSettings() {
      return setTargetPoolsInstanceGroupManagerOperationSettings;
    }

    @Override
    public InstanceGroupManagerStubSettings build() throws IOException {
      return new InstanceGroupManagerStubSettings(this);
    }
  }
}
