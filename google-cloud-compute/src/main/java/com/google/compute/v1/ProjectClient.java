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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.compute.v1.stub.ProjectStub;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ProjectClient projectClient = ProjectClient.create()) {
 *
 *   Project response = projectClient.getProject();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the projectClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's methods:
 *
 * <ol>
 * <li> A "flattened" method. With this type of method, the fields of the request type have been
 * converted into function parameters. It may be the case that not all fields are available
 * as parameters, and not every API method will have a flattened method entry point.
 * <li> A "request object" method. This type of method only takes one parameter, a request
 * object, which must be constructed before the call. Not every API method will have a request
 * object method.
 * <li> A "callable" method. This type of method takes no parameters and returns an immutable
 * API callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 *
 * <p>This class can be customized by passing in a custom instance of ProjectSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * ProjectSettings projectSettings =
 *     ProjectSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ProjectClient projectClient =
 *     ProjectClient.create(projectSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ProjectSettings projectSettings =
 *     ProjectSettings.newBuilder()
 *         .setTransportProvider(ProjectSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(ProjectSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * ProjectClient projectClient =
 *     ProjectClient.create(projectSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ProjectClient implements BackgroundResource {
  private final ProjectSettings settings;
  private final ProjectStub stub;



  /**
   * Constructs an instance of ProjectClient with default settings.
   */
  public static final ProjectClient create() throws IOException {
    return create(ProjectSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ProjectClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final ProjectClient create(ProjectSettings settings) throws IOException {
    return new ProjectClient(settings);
  }

  /**
   * Constructs an instance of ProjectClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ProjectSettings}.
   */
  public static final ProjectClient create(ProjectStub stub) {
    return new ProjectClient(stub);
  }

  /**
   * Constructs an instance of ProjectClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected ProjectClient(ProjectSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected ProjectClient(ProjectStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ProjectSettings getSettings() {
    return settings;
  }

  @BetaApi
  public ProjectStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Project resource.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Project response = projectClient.getProject();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Project getProject(ProjectName project) {

    GetProjectHttpRequest request =
        GetProjectHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return getProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Project resource.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Project response = projectClient.getProject();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  private final Project getProject(GetProjectHttpRequest request) {
    return getProjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Project resource.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   ApiFuture&lt;Project&gt; future = projectClient.getProjectCallable().futureCall();
   *   // Do something
   *   Project response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetProjectHttpRequest, Project> getProjectCallable() {
    return stub.getProjectCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Moves a persistent disk from one zone to another.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.moveDiskProject();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param diskMoveRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation moveDiskProject(ProjectName project, DiskMoveRequest diskMoveRequestResource) {

    MoveDiskProjectHttpRequest request =
        MoveDiskProjectHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setDiskMoveRequestResource(diskMoveRequestResource)
        .build();
    return moveDiskProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Moves a persistent disk from one zone to another.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.moveDiskProject();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation moveDiskProject(MoveDiskProjectHttpRequest request) {
    return moveDiskProjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Moves a persistent disk from one zone to another.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = projectClient.moveDiskProjectCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<MoveDiskProjectHttpRequest, Operation> moveDiskProjectCallable() {
    return stub.moveDiskProjectCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Moves an instance and its attached persistent disks from one zone to another.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.moveInstanceProject();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param instanceMoveRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation moveInstanceProject(ProjectName project, InstanceMoveRequest instanceMoveRequestResource) {

    MoveInstanceProjectHttpRequest request =
        MoveInstanceProjectHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setInstanceMoveRequestResource(instanceMoveRequestResource)
        .build();
    return moveInstanceProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Moves an instance and its attached persistent disks from one zone to another.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.moveInstanceProject();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation moveInstanceProject(MoveInstanceProjectHttpRequest request) {
    return moveInstanceProjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Moves an instance and its attached persistent disks from one zone to another.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = projectClient.moveInstanceProjectCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<MoveInstanceProjectHttpRequest, Operation> moveInstanceProjectCallable() {
    return stub.moveInstanceProjectCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata common to all instances within the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.setCommonInstanceMetadataProject();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param metadataResource A metadata key/value entry.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setCommonInstanceMetadataProject(ProjectName project, Metadata metadataResource) {

    SetCommonInstanceMetadataProjectHttpRequest request =
        SetCommonInstanceMetadataProjectHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setMetadataResource(metadataResource)
        .build();
    return setCommonInstanceMetadataProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata common to all instances within the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.setCommonInstanceMetadataProject();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setCommonInstanceMetadataProject(SetCommonInstanceMetadataProjectHttpRequest request) {
    return setCommonInstanceMetadataProjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets metadata common to all instances within the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = projectClient.setCommonInstanceMetadataProjectCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetCommonInstanceMetadataProjectHttpRequest, Operation> setCommonInstanceMetadataProjectCallable() {
    return stub.setCommonInstanceMetadataProjectCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the usage export feature will be disabled.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.setUsageExportBucketProject();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param usageExportLocationResource The location in Cloud Storage and naming method of the daily usage report. Contains bucket_name and report_name prefix.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUsageExportBucketProject(ProjectName project, UsageExportLocation usageExportLocationResource) {

    SetUsageExportBucketProjectHttpRequest request =
        SetUsageExportBucketProjectHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setUsageExportLocationResource(usageExportLocationResource)
        .build();
    return setUsageExportBucketProject(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the usage export feature will be disabled.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   Operation response = projectClient.setUsageExportBucketProject();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUsageExportBucketProject(SetUsageExportBucketProjectHttpRequest request) {
    return setUsageExportBucketProjectCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the usage export feature will be disabled.
   *
   * Sample code:
   * <pre><code>
   * try (ProjectClient projectClient = ProjectClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = projectClient.setUsageExportBucketProjectCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetUsageExportBucketProjectHttpRequest, Operation> setUsageExportBucketProjectCallable() {
    return stub.setUsageExportBucketProjectCallable();
  }

  @Override
  public final void close() throws Exception {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

}