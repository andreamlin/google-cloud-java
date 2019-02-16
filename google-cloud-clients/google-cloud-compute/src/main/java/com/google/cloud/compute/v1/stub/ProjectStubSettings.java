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

import static com.google.cloud.compute.v1.ProjectClient.GetXpnResourcesProjectsPagedResponse;
import static com.google.cloud.compute.v1.ProjectClient.ListXpnHostsProjectsPagedResponse;

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
import com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest;
import com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest;
import com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest;
import com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest;
import com.google.cloud.compute.v1.GetProjectHttpRequest;
import com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest;
import com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest;
import com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest;
import com.google.cloud.compute.v1.MoveDiskProjectHttpRequest;
import com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Project;
import com.google.cloud.compute.v1.ProjectsGetXpnResources;
import com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest;
import com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest;
import com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest;
import com.google.cloud.compute.v1.XpnHostList;
import com.google.cloud.compute.v1.XpnResourceId;
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
 * Settings class to configure an instance of {@link ProjectStub}.
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
 * example, to set the total timeout of getProject to 30 seconds:
 *
 * <pre>
 * <code>
 * ProjectStubSettings.Builder projectSettingsBuilder =
 *     ProjectStubSettings.newBuilder();
 * projectSettingsBuilder.getProjectSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * ProjectStubSettings projectSettings = projectSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ProjectStubSettings extends StubSettings<ProjectStubSettings> {
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

  private final UnaryCallSettings<DisableXpnHostProjectHttpRequest, Operation>
      disableXpnHostProjectSettings;
  private final OperationCallSettings<DisableXpnHostProjectHttpRequest, EmptyMessage, Operation>
      disableXpnHostProjectOperationSettings;
  private final UnaryCallSettings<DisableXpnResourceProjectHttpRequest, Operation>
      disableXpnResourceProjectSettings;
  private final OperationCallSettings<DisableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
      disableXpnResourceProjectOperationSettings;
  private final UnaryCallSettings<EnableXpnHostProjectHttpRequest, Operation>
      enableXpnHostProjectSettings;
  private final OperationCallSettings<EnableXpnHostProjectHttpRequest, EmptyMessage, Operation>
      enableXpnHostProjectOperationSettings;
  private final UnaryCallSettings<EnableXpnResourceProjectHttpRequest, Operation>
      enableXpnResourceProjectSettings;
  private final OperationCallSettings<EnableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
      enableXpnResourceProjectOperationSettings;
  private final UnaryCallSettings<GetProjectHttpRequest, Project> getProjectSettings;
  private final UnaryCallSettings<GetXpnHostProjectHttpRequest, Project> getXpnHostProjectSettings;
  private final PagedCallSettings<
          GetXpnResourcesProjectsHttpRequest,
          ProjectsGetXpnResources,
          GetXpnResourcesProjectsPagedResponse>
      getXpnResourcesProjectsSettings;
  private final PagedCallSettings<
          ListXpnHostsProjectsHttpRequest, XpnHostList, ListXpnHostsProjectsPagedResponse>
      listXpnHostsProjectsSettings;
  private final UnaryCallSettings<MoveDiskProjectHttpRequest, Operation> moveDiskProjectSettings;
  private final OperationCallSettings<MoveDiskProjectHttpRequest, EmptyMessage, Operation>
      moveDiskProjectOperationSettings;
  private final UnaryCallSettings<MoveInstanceProjectHttpRequest, Operation>
      moveInstanceProjectSettings;
  private final OperationCallSettings<MoveInstanceProjectHttpRequest, EmptyMessage, Operation>
      moveInstanceProjectOperationSettings;
  private final UnaryCallSettings<SetCommonInstanceMetadataProjectHttpRequest, Operation>
      setCommonInstanceMetadataProjectSettings;
  private final OperationCallSettings<
          SetCommonInstanceMetadataProjectHttpRequest, EmptyMessage, Operation>
      setCommonInstanceMetadataProjectOperationSettings;
  private final UnaryCallSettings<SetDefaultNetworkTierProjectHttpRequest, Operation>
      setDefaultNetworkTierProjectSettings;
  private final OperationCallSettings<
          SetDefaultNetworkTierProjectHttpRequest, EmptyMessage, Operation>
      setDefaultNetworkTierProjectOperationSettings;
  private final UnaryCallSettings<SetUsageExportBucketProjectHttpRequest, Operation>
      setUsageExportBucketProjectSettings;
  private final OperationCallSettings<
          SetUsageExportBucketProjectHttpRequest, EmptyMessage, Operation>
      setUsageExportBucketProjectOperationSettings;

  /** Returns the object with the settings used for calls to disableXpnHostProject. */
  public UnaryCallSettings<DisableXpnHostProjectHttpRequest, Operation>
      disableXpnHostProjectSettings() {
    return disableXpnHostProjectSettings;
  }

  /** Returns the object with the settings used for calls to disableXpnHostProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DisableXpnHostProjectHttpRequest, EmptyMessage, Operation>
      disableXpnHostProjectOperationSettings() {
    return disableXpnHostProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to disableXpnResourceProject. */
  public UnaryCallSettings<DisableXpnResourceProjectHttpRequest, Operation>
      disableXpnResourceProjectSettings() {
    return disableXpnResourceProjectSettings;
  }

  /** Returns the object with the settings used for calls to disableXpnResourceProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<DisableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
      disableXpnResourceProjectOperationSettings() {
    return disableXpnResourceProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to enableXpnHostProject. */
  public UnaryCallSettings<EnableXpnHostProjectHttpRequest, Operation>
      enableXpnHostProjectSettings() {
    return enableXpnHostProjectSettings;
  }

  /** Returns the object with the settings used for calls to enableXpnHostProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<EnableXpnHostProjectHttpRequest, EmptyMessage, Operation>
      enableXpnHostProjectOperationSettings() {
    return enableXpnHostProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to enableXpnResourceProject. */
  public UnaryCallSettings<EnableXpnResourceProjectHttpRequest, Operation>
      enableXpnResourceProjectSettings() {
    return enableXpnResourceProjectSettings;
  }

  /** Returns the object with the settings used for calls to enableXpnResourceProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<EnableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
      enableXpnResourceProjectOperationSettings() {
    return enableXpnResourceProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to getProject. */
  public UnaryCallSettings<GetProjectHttpRequest, Project> getProjectSettings() {
    return getProjectSettings;
  }

  /** Returns the object with the settings used for calls to getXpnHostProject. */
  public UnaryCallSettings<GetXpnHostProjectHttpRequest, Project> getXpnHostProjectSettings() {
    return getXpnHostProjectSettings;
  }

  /** Returns the object with the settings used for calls to getXpnResourcesProjects. */
  public PagedCallSettings<
          GetXpnResourcesProjectsHttpRequest,
          ProjectsGetXpnResources,
          GetXpnResourcesProjectsPagedResponse>
      getXpnResourcesProjectsSettings() {
    return getXpnResourcesProjectsSettings;
  }

  /** Returns the object with the settings used for calls to listXpnHostsProjects. */
  public PagedCallSettings<
          ListXpnHostsProjectsHttpRequest, XpnHostList, ListXpnHostsProjectsPagedResponse>
      listXpnHostsProjectsSettings() {
    return listXpnHostsProjectsSettings;
  }

  /** Returns the object with the settings used for calls to moveDiskProject. */
  public UnaryCallSettings<MoveDiskProjectHttpRequest, Operation> moveDiskProjectSettings() {
    return moveDiskProjectSettings;
  }

  /** Returns the object with the settings used for calls to moveDiskProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<MoveDiskProjectHttpRequest, EmptyMessage, Operation>
      moveDiskProjectOperationSettings() {
    return moveDiskProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to moveInstanceProject. */
  public UnaryCallSettings<MoveInstanceProjectHttpRequest, Operation>
      moveInstanceProjectSettings() {
    return moveInstanceProjectSettings;
  }

  /** Returns the object with the settings used for calls to moveInstanceProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<MoveInstanceProjectHttpRequest, EmptyMessage, Operation>
      moveInstanceProjectOperationSettings() {
    return moveInstanceProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to setCommonInstanceMetadataProject. */
  public UnaryCallSettings<SetCommonInstanceMetadataProjectHttpRequest, Operation>
      setCommonInstanceMetadataProjectSettings() {
    return setCommonInstanceMetadataProjectSettings;
  }

  /** Returns the object with the settings used for calls to setCommonInstanceMetadataProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetCommonInstanceMetadataProjectHttpRequest, EmptyMessage, Operation>
      setCommonInstanceMetadataProjectOperationSettings() {
    return setCommonInstanceMetadataProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to setDefaultNetworkTierProject. */
  public UnaryCallSettings<SetDefaultNetworkTierProjectHttpRequest, Operation>
      setDefaultNetworkTierProjectSettings() {
    return setDefaultNetworkTierProjectSettings;
  }

  /** Returns the object with the settings used for calls to setDefaultNetworkTierProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetDefaultNetworkTierProjectHttpRequest, EmptyMessage, Operation>
      setDefaultNetworkTierProjectOperationSettings() {
    return setDefaultNetworkTierProjectOperationSettings;
  }

  /** Returns the object with the settings used for calls to setUsageExportBucketProject. */
  public UnaryCallSettings<SetUsageExportBucketProjectHttpRequest, Operation>
      setUsageExportBucketProjectSettings() {
    return setUsageExportBucketProjectSettings;
  }

  /** Returns the object with the settings used for calls to setUsageExportBucketProject. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<SetUsageExportBucketProjectHttpRequest, EmptyMessage, Operation>
      setUsageExportBucketProjectOperationSettings() {
    return setUsageExportBucketProjectOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ProjectStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonProjectStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(ProjectStubSettings.class))
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

  protected ProjectStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    disableXpnHostProjectSettings = settingsBuilder.disableXpnHostProjectSettings().build();
    disableXpnHostProjectOperationSettings =
        settingsBuilder.disableXpnHostProjectOperationSettings().build();
    disableXpnResourceProjectSettings = settingsBuilder.disableXpnResourceProjectSettings().build();
    disableXpnResourceProjectOperationSettings =
        settingsBuilder.disableXpnResourceProjectOperationSettings().build();
    enableXpnHostProjectSettings = settingsBuilder.enableXpnHostProjectSettings().build();
    enableXpnHostProjectOperationSettings =
        settingsBuilder.enableXpnHostProjectOperationSettings().build();
    enableXpnResourceProjectSettings = settingsBuilder.enableXpnResourceProjectSettings().build();
    enableXpnResourceProjectOperationSettings =
        settingsBuilder.enableXpnResourceProjectOperationSettings().build();
    getProjectSettings = settingsBuilder.getProjectSettings().build();
    getXpnHostProjectSettings = settingsBuilder.getXpnHostProjectSettings().build();
    getXpnResourcesProjectsSettings = settingsBuilder.getXpnResourcesProjectsSettings().build();
    listXpnHostsProjectsSettings = settingsBuilder.listXpnHostsProjectsSettings().build();
    moveDiskProjectSettings = settingsBuilder.moveDiskProjectSettings().build();
    moveDiskProjectOperationSettings = settingsBuilder.moveDiskProjectOperationSettings().build();
    moveInstanceProjectSettings = settingsBuilder.moveInstanceProjectSettings().build();
    moveInstanceProjectOperationSettings =
        settingsBuilder.moveInstanceProjectOperationSettings().build();
    setCommonInstanceMetadataProjectSettings =
        settingsBuilder.setCommonInstanceMetadataProjectSettings().build();
    setCommonInstanceMetadataProjectOperationSettings =
        settingsBuilder.setCommonInstanceMetadataProjectOperationSettings().build();
    setDefaultNetworkTierProjectSettings =
        settingsBuilder.setDefaultNetworkTierProjectSettings().build();
    setDefaultNetworkTierProjectOperationSettings =
        settingsBuilder.setDefaultNetworkTierProjectOperationSettings().build();
    setUsageExportBucketProjectSettings =
        settingsBuilder.setUsageExportBucketProjectSettings().build();
    setUsageExportBucketProjectOperationSettings =
        settingsBuilder.setUsageExportBucketProjectOperationSettings().build();
  }

  private static final PagedListDescriptor<
          GetXpnResourcesProjectsHttpRequest, ProjectsGetXpnResources, XpnResourceId>
      GET_XPN_RESOURCES_PROJECTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              GetXpnResourcesProjectsHttpRequest, ProjectsGetXpnResources, XpnResourceId>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public GetXpnResourcesProjectsHttpRequest injectToken(
                GetXpnResourcesProjectsHttpRequest payload, String token) {
              return GetXpnResourcesProjectsHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public GetXpnResourcesProjectsHttpRequest injectPageSize(
                GetXpnResourcesProjectsHttpRequest payload, int pageSize) {
              return GetXpnResourcesProjectsHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(GetXpnResourcesProjectsHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(ProjectsGetXpnResources payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<XpnResourceId> extractResources(ProjectsGetXpnResources payload) {
              return payload.getResourcesList() != null
                  ? payload.getResourcesList()
                  : ImmutableList.<XpnResourceId>of();
            }
          };

  private static final PagedListDescriptor<ListXpnHostsProjectsHttpRequest, XpnHostList, Project>
      LIST_XPN_HOSTS_PROJECTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListXpnHostsProjectsHttpRequest, XpnHostList, Project>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListXpnHostsProjectsHttpRequest injectToken(
                ListXpnHostsProjectsHttpRequest payload, String token) {
              return ListXpnHostsProjectsHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListXpnHostsProjectsHttpRequest injectPageSize(
                ListXpnHostsProjectsHttpRequest payload, int pageSize) {
              return ListXpnHostsProjectsHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListXpnHostsProjectsHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(XpnHostList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Project> extractResources(XpnHostList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<Project>of();
            }
          };

  private static final PagedListResponseFactory<
          GetXpnResourcesProjectsHttpRequest,
          ProjectsGetXpnResources,
          GetXpnResourcesProjectsPagedResponse>
      GET_XPN_RESOURCES_PROJECTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              GetXpnResourcesProjectsHttpRequest,
              ProjectsGetXpnResources,
              GetXpnResourcesProjectsPagedResponse>() {
            @Override
            public ApiFuture<GetXpnResourcesProjectsPagedResponse> getFuturePagedResponse(
                UnaryCallable<GetXpnResourcesProjectsHttpRequest, ProjectsGetXpnResources> callable,
                GetXpnResourcesProjectsHttpRequest request,
                ApiCallContext context,
                ApiFuture<ProjectsGetXpnResources> futureResponse) {
              PageContext<
                      GetXpnResourcesProjectsHttpRequest, ProjectsGetXpnResources, XpnResourceId>
                  pageContext =
                      PageContext.create(
                          callable, GET_XPN_RESOURCES_PROJECTS_PAGE_STR_DESC, request, context);
              return GetXpnResourcesProjectsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListXpnHostsProjectsHttpRequest, XpnHostList, ListXpnHostsProjectsPagedResponse>
      LIST_XPN_HOSTS_PROJECTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListXpnHostsProjectsHttpRequest, XpnHostList, ListXpnHostsProjectsPagedResponse>() {
            @Override
            public ApiFuture<ListXpnHostsProjectsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListXpnHostsProjectsHttpRequest, XpnHostList> callable,
                ListXpnHostsProjectsHttpRequest request,
                ApiCallContext context,
                ApiFuture<XpnHostList> futureResponse) {
              PageContext<ListXpnHostsProjectsHttpRequest, XpnHostList, Project> pageContext =
                  PageContext.create(
                      callable, LIST_XPN_HOSTS_PROJECTS_PAGE_STR_DESC, request, context);
              return ListXpnHostsProjectsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for ProjectStubSettings. */
  public static class Builder extends StubSettings.Builder<ProjectStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DisableXpnHostProjectHttpRequest, Operation>
        disableXpnHostProjectSettings;
    private final OperationCallSettings.Builder<
            DisableXpnHostProjectHttpRequest, EmptyMessage, Operation>
        disableXpnHostProjectOperationSettings;
    private final UnaryCallSettings.Builder<DisableXpnResourceProjectHttpRequest, Operation>
        disableXpnResourceProjectSettings;
    private final OperationCallSettings.Builder<
            DisableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
        disableXpnResourceProjectOperationSettings;
    private final UnaryCallSettings.Builder<EnableXpnHostProjectHttpRequest, Operation>
        enableXpnHostProjectSettings;
    private final OperationCallSettings.Builder<
            EnableXpnHostProjectHttpRequest, EmptyMessage, Operation>
        enableXpnHostProjectOperationSettings;
    private final UnaryCallSettings.Builder<EnableXpnResourceProjectHttpRequest, Operation>
        enableXpnResourceProjectSettings;
    private final OperationCallSettings.Builder<
            EnableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
        enableXpnResourceProjectOperationSettings;
    private final UnaryCallSettings.Builder<GetProjectHttpRequest, Project> getProjectSettings;
    private final UnaryCallSettings.Builder<GetXpnHostProjectHttpRequest, Project>
        getXpnHostProjectSettings;
    private final PagedCallSettings.Builder<
            GetXpnResourcesProjectsHttpRequest,
            ProjectsGetXpnResources,
            GetXpnResourcesProjectsPagedResponse>
        getXpnResourcesProjectsSettings;
    private final PagedCallSettings.Builder<
            ListXpnHostsProjectsHttpRequest, XpnHostList, ListXpnHostsProjectsPagedResponse>
        listXpnHostsProjectsSettings;
    private final UnaryCallSettings.Builder<MoveDiskProjectHttpRequest, Operation>
        moveDiskProjectSettings;
    private final OperationCallSettings.Builder<MoveDiskProjectHttpRequest, EmptyMessage, Operation>
        moveDiskProjectOperationSettings;
    private final UnaryCallSettings.Builder<MoveInstanceProjectHttpRequest, Operation>
        moveInstanceProjectSettings;
    private final OperationCallSettings.Builder<
            MoveInstanceProjectHttpRequest, EmptyMessage, Operation>
        moveInstanceProjectOperationSettings;
    private final UnaryCallSettings.Builder<SetCommonInstanceMetadataProjectHttpRequest, Operation>
        setCommonInstanceMetadataProjectSettings;
    private final OperationCallSettings.Builder<
            SetCommonInstanceMetadataProjectHttpRequest, EmptyMessage, Operation>
        setCommonInstanceMetadataProjectOperationSettings;
    private final UnaryCallSettings.Builder<SetDefaultNetworkTierProjectHttpRequest, Operation>
        setDefaultNetworkTierProjectSettings;
    private final OperationCallSettings.Builder<
            SetDefaultNetworkTierProjectHttpRequest, EmptyMessage, Operation>
        setDefaultNetworkTierProjectOperationSettings;
    private final UnaryCallSettings.Builder<SetUsageExportBucketProjectHttpRequest, Operation>
        setUsageExportBucketProjectSettings;
    private final OperationCallSettings.Builder<
            SetUsageExportBucketProjectHttpRequest, EmptyMessage, Operation>
        setUsageExportBucketProjectOperationSettings;

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

      disableXpnHostProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      disableXpnHostProjectOperationSettings = OperationCallSettings.newBuilder();

      disableXpnResourceProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      disableXpnResourceProjectOperationSettings = OperationCallSettings.newBuilder();

      enableXpnHostProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      enableXpnHostProjectOperationSettings = OperationCallSettings.newBuilder();

      enableXpnResourceProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      enableXpnResourceProjectOperationSettings = OperationCallSettings.newBuilder();

      getProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getXpnHostProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getXpnResourcesProjectsSettings =
          PagedCallSettings.newBuilder(GET_XPN_RESOURCES_PROJECTS_PAGE_STR_FACT);

      listXpnHostsProjectsSettings =
          PagedCallSettings.newBuilder(LIST_XPN_HOSTS_PROJECTS_PAGE_STR_FACT);

      moveDiskProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      moveDiskProjectOperationSettings = OperationCallSettings.newBuilder();

      moveInstanceProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      moveInstanceProjectOperationSettings = OperationCallSettings.newBuilder();

      setCommonInstanceMetadataProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setCommonInstanceMetadataProjectOperationSettings = OperationCallSettings.newBuilder();

      setDefaultNetworkTierProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setDefaultNetworkTierProjectOperationSettings = OperationCallSettings.newBuilder();

      setUsageExportBucketProjectSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setUsageExportBucketProjectOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              disableXpnHostProjectSettings,
              disableXpnResourceProjectSettings,
              enableXpnHostProjectSettings,
              enableXpnResourceProjectSettings,
              getProjectSettings,
              getXpnHostProjectSettings,
              getXpnResourcesProjectsSettings,
              listXpnHostsProjectsSettings,
              moveDiskProjectSettings,
              moveInstanceProjectSettings,
              setCommonInstanceMetadataProjectSettings,
              setDefaultNetworkTierProjectSettings,
              setUsageExportBucketProjectSettings);

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
          .disableXpnHostProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .disableXpnResourceProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .enableXpnHostProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .enableXpnResourceProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getXpnHostProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getXpnResourcesProjectsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listXpnHostsProjectsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .moveDiskProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .moveInstanceProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setCommonInstanceMetadataProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setDefaultNetworkTierProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setUsageExportBucketProjectSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .disableXpnHostProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DisableXpnHostProjectHttpRequest, OperationSnapshot>
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
          .disableXpnResourceProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DisableXpnResourceProjectHttpRequest, OperationSnapshot>
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
          .enableXpnHostProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<EnableXpnHostProjectHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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
          .enableXpnResourceProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<EnableXpnResourceProjectHttpRequest, OperationSnapshot>
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
          .moveDiskProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<MoveDiskProjectHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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
          .moveInstanceProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<MoveInstanceProjectHttpRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
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
          .setCommonInstanceMetadataProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetCommonInstanceMetadataProjectHttpRequest, OperationSnapshot>
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
          .setDefaultNetworkTierProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetDefaultNetworkTierProjectHttpRequest, OperationSnapshot>
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
          .setUsageExportBucketProjectOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetUsageExportBucketProjectHttpRequest, OperationSnapshot>
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

    protected Builder(ProjectStubSettings settings) {
      super(settings);

      disableXpnHostProjectSettings = settings.disableXpnHostProjectSettings.toBuilder();
      disableXpnHostProjectOperationSettings =
          settings.disableXpnHostProjectOperationSettings.toBuilder();
      disableXpnResourceProjectSettings = settings.disableXpnResourceProjectSettings.toBuilder();
      disableXpnResourceProjectOperationSettings =
          settings.disableXpnResourceProjectOperationSettings.toBuilder();
      enableXpnHostProjectSettings = settings.enableXpnHostProjectSettings.toBuilder();
      enableXpnHostProjectOperationSettings =
          settings.enableXpnHostProjectOperationSettings.toBuilder();
      enableXpnResourceProjectSettings = settings.enableXpnResourceProjectSettings.toBuilder();
      enableXpnResourceProjectOperationSettings =
          settings.enableXpnResourceProjectOperationSettings.toBuilder();
      getProjectSettings = settings.getProjectSettings.toBuilder();
      getXpnHostProjectSettings = settings.getXpnHostProjectSettings.toBuilder();
      getXpnResourcesProjectsSettings = settings.getXpnResourcesProjectsSettings.toBuilder();
      listXpnHostsProjectsSettings = settings.listXpnHostsProjectsSettings.toBuilder();
      moveDiskProjectSettings = settings.moveDiskProjectSettings.toBuilder();
      moveDiskProjectOperationSettings = settings.moveDiskProjectOperationSettings.toBuilder();
      moveInstanceProjectSettings = settings.moveInstanceProjectSettings.toBuilder();
      moveInstanceProjectOperationSettings =
          settings.moveInstanceProjectOperationSettings.toBuilder();
      setCommonInstanceMetadataProjectSettings =
          settings.setCommonInstanceMetadataProjectSettings.toBuilder();
      setCommonInstanceMetadataProjectOperationSettings =
          settings.setCommonInstanceMetadataProjectOperationSettings.toBuilder();
      setDefaultNetworkTierProjectSettings =
          settings.setDefaultNetworkTierProjectSettings.toBuilder();
      setDefaultNetworkTierProjectOperationSettings =
          settings.setDefaultNetworkTierProjectOperationSettings.toBuilder();
      setUsageExportBucketProjectSettings =
          settings.setUsageExportBucketProjectSettings.toBuilder();
      setUsageExportBucketProjectOperationSettings =
          settings.setUsageExportBucketProjectOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              disableXpnHostProjectSettings,
              disableXpnResourceProjectSettings,
              enableXpnHostProjectSettings,
              enableXpnResourceProjectSettings,
              getProjectSettings,
              getXpnHostProjectSettings,
              getXpnResourcesProjectsSettings,
              listXpnHostsProjectsSettings,
              moveDiskProjectSettings,
              moveInstanceProjectSettings,
              setCommonInstanceMetadataProjectSettings,
              setDefaultNetworkTierProjectSettings,
              setUsageExportBucketProjectSettings);
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

    /** Returns the builder for the settings used for calls to disableXpnHostProject. */
    public UnaryCallSettings.Builder<DisableXpnHostProjectHttpRequest, Operation>
        disableXpnHostProjectSettings() {
      return disableXpnHostProjectSettings;
    }

    /** Returns the builder for the settings used for calls to disableXpnHostProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DisableXpnHostProjectHttpRequest, EmptyMessage, Operation>
        disableXpnHostProjectOperationSettings() {
      return disableXpnHostProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to disableXpnResourceProject. */
    public UnaryCallSettings.Builder<DisableXpnResourceProjectHttpRequest, Operation>
        disableXpnResourceProjectSettings() {
      return disableXpnResourceProjectSettings;
    }

    /** Returns the builder for the settings used for calls to disableXpnResourceProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DisableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
        disableXpnResourceProjectOperationSettings() {
      return disableXpnResourceProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to enableXpnHostProject. */
    public UnaryCallSettings.Builder<EnableXpnHostProjectHttpRequest, Operation>
        enableXpnHostProjectSettings() {
      return enableXpnHostProjectSettings;
    }

    /** Returns the builder for the settings used for calls to enableXpnHostProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<EnableXpnHostProjectHttpRequest, EmptyMessage, Operation>
        enableXpnHostProjectOperationSettings() {
      return enableXpnHostProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to enableXpnResourceProject. */
    public UnaryCallSettings.Builder<EnableXpnResourceProjectHttpRequest, Operation>
        enableXpnResourceProjectSettings() {
      return enableXpnResourceProjectSettings;
    }

    /** Returns the builder for the settings used for calls to enableXpnResourceProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            EnableXpnResourceProjectHttpRequest, EmptyMessage, Operation>
        enableXpnResourceProjectOperationSettings() {
      return enableXpnResourceProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getProject. */
    public UnaryCallSettings.Builder<GetProjectHttpRequest, Project> getProjectSettings() {
      return getProjectSettings;
    }

    /** Returns the builder for the settings used for calls to getXpnHostProject. */
    public UnaryCallSettings.Builder<GetXpnHostProjectHttpRequest, Project>
        getXpnHostProjectSettings() {
      return getXpnHostProjectSettings;
    }

    /** Returns the builder for the settings used for calls to getXpnResourcesProjects. */
    public PagedCallSettings.Builder<
            GetXpnResourcesProjectsHttpRequest,
            ProjectsGetXpnResources,
            GetXpnResourcesProjectsPagedResponse>
        getXpnResourcesProjectsSettings() {
      return getXpnResourcesProjectsSettings;
    }

    /** Returns the builder for the settings used for calls to listXpnHostsProjects. */
    public PagedCallSettings.Builder<
            ListXpnHostsProjectsHttpRequest, XpnHostList, ListXpnHostsProjectsPagedResponse>
        listXpnHostsProjectsSettings() {
      return listXpnHostsProjectsSettings;
    }

    /** Returns the builder for the settings used for calls to moveDiskProject. */
    public UnaryCallSettings.Builder<MoveDiskProjectHttpRequest, Operation>
        moveDiskProjectSettings() {
      return moveDiskProjectSettings;
    }

    /** Returns the builder for the settings used for calls to moveDiskProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<MoveDiskProjectHttpRequest, EmptyMessage, Operation>
        moveDiskProjectOperationSettings() {
      return moveDiskProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to moveInstanceProject. */
    public UnaryCallSettings.Builder<MoveInstanceProjectHttpRequest, Operation>
        moveInstanceProjectSettings() {
      return moveInstanceProjectSettings;
    }

    /** Returns the builder for the settings used for calls to moveInstanceProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<MoveInstanceProjectHttpRequest, EmptyMessage, Operation>
        moveInstanceProjectOperationSettings() {
      return moveInstanceProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setCommonInstanceMetadataProject. */
    public UnaryCallSettings.Builder<SetCommonInstanceMetadataProjectHttpRequest, Operation>
        setCommonInstanceMetadataProjectSettings() {
      return setCommonInstanceMetadataProjectSettings;
    }

    /** Returns the builder for the settings used for calls to setCommonInstanceMetadataProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetCommonInstanceMetadataProjectHttpRequest, EmptyMessage, Operation>
        setCommonInstanceMetadataProjectOperationSettings() {
      return setCommonInstanceMetadataProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setDefaultNetworkTierProject. */
    public UnaryCallSettings.Builder<SetDefaultNetworkTierProjectHttpRequest, Operation>
        setDefaultNetworkTierProjectSettings() {
      return setDefaultNetworkTierProjectSettings;
    }

    /** Returns the builder for the settings used for calls to setDefaultNetworkTierProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetDefaultNetworkTierProjectHttpRequest, EmptyMessage, Operation>
        setDefaultNetworkTierProjectOperationSettings() {
      return setDefaultNetworkTierProjectOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setUsageExportBucketProject. */
    public UnaryCallSettings.Builder<SetUsageExportBucketProjectHttpRequest, Operation>
        setUsageExportBucketProjectSettings() {
      return setUsageExportBucketProjectSettings;
    }

    /** Returns the builder for the settings used for calls to setUsageExportBucketProject. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetUsageExportBucketProjectHttpRequest, EmptyMessage, Operation>
        setUsageExportBucketProjectOperationSettings() {
      return setUsageExportBucketProjectOperationSettings;
    }

    @Override
    public ProjectStubSettings build() throws IOException {
      return new ProjectStubSettings(this);
    }
  }
}
