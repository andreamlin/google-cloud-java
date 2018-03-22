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
package com.google.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.paging.FixedSizeCollection;
import com.google.api.gax.paging.Page;
import com.google.api.gax.rpc.ApiExceptions;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.compute.v1.stub.SubnetworkStub;
import com.google.compute.v1.stub.SubnetworkStubSettings;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
 * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
 *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
 *   Operation response = subnetworkClient.deleteSubnetwork(subnetwork);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the subnetworkClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of SubnetworkSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * SubnetworkSettings subnetworkSettings =
 *     SubnetworkSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SubnetworkClient subnetworkClient =
 *     SubnetworkClient.create(subnetworkSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SubnetworkSettings subnetworkSettings =
 *     SubnetworkSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SubnetworkClient subnetworkClient =
 *     SubnetworkClient.create(subnetworkSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SubnetworkClient implements BackgroundResource {
  private final SubnetworkSettings settings;
  private final SubnetworkStub stub;



  /**
   * Constructs an instance of SubnetworkClient with default settings.
   */
  public static final SubnetworkClient create() throws IOException {
    return create(SubnetworkSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SubnetworkClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final SubnetworkClient create(SubnetworkSettings settings) throws IOException {
    return new SubnetworkClient(settings);
  }

  /**
   * Constructs an instance of SubnetworkClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use SubnetworkSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SubnetworkClient create(SubnetworkStub stub) {
    return new SubnetworkClient(stub);
  }

  /**
   * Constructs an instance of SubnetworkClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected SubnetworkClient(SubnetworkSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SubnetworkStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SubnetworkClient(SubnetworkStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SubnetworkSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SubnetworkStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Subnetwork element : subnetworkClient.aggregatedListSubnetworks(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListSubnetworksPagedResponse aggregatedListSubnetworks(ProjectName project) {
    AggregatedListSubnetworksHttpRequest request =
        AggregatedListSubnetworksHttpRequest.newBuilder()
        .setProject(project == null ? null : project.toString())
        .build();
    return aggregatedListSubnetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Subnetwork element : subnetworkClient.aggregatedListSubnetworks(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListSubnetworksPagedResponse aggregatedListSubnetworks(String project) {
    AggregatedListSubnetworksHttpRequest request =
        AggregatedListSubnetworksHttpRequest.newBuilder()
        .setProject(project)
        .build();
    return aggregatedListSubnetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListSubnetworksHttpRequest request = AggregatedListSubnetworksHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   for (Subnetwork element : subnetworkClient.aggregatedListSubnetworks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListSubnetworksPagedResponse aggregatedListSubnetworks(AggregatedListSubnetworksHttpRequest request) {
    return aggregatedListSubnetworksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListSubnetworksHttpRequest request = AggregatedListSubnetworksHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   ApiFuture&lt;AggregatedListSubnetworksPagedResponse&gt; future = subnetworkClient.aggregatedListSubnetworksPagedCallable().futureCall(request);
   *   // Do something
   *   for (Subnetwork element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListSubnetworksHttpRequest, AggregatedListSubnetworksPagedResponse> aggregatedListSubnetworksPagedCallable() {
    return stub.aggregatedListSubnetworksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of subnetworks.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   AggregatedListSubnetworksHttpRequest request = AggregatedListSubnetworksHttpRequest.newBuilder()
   *     .setProject(project.toString())
   *     .build();
   *   while (true) {
   *     SubnetworkAggregatedList response = subnetworkClient.aggregatedListSubnetworksCallable().call(request);
   *     for (Subnetwork element : response.getSubnetworksList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList> aggregatedListSubnetworksCallable() {
    return stub.aggregatedListSubnetworksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   Operation response = subnetworkClient.deleteSubnetwork(subnetwork);
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSubnetwork(SubnetworkName subnetwork) {

    DeleteSubnetworkHttpRequest request =
        DeleteSubnetworkHttpRequest.newBuilder()
        .setSubnetwork(subnetwork == null ? null : subnetwork.toString())
        .build();
    return deleteSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   Operation response = subnetworkClient.deleteSubnetwork(subnetwork.toString());
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSubnetwork(String subnetwork) {

    DeleteSubnetworkHttpRequest request =
        DeleteSubnetworkHttpRequest.newBuilder()
        .setSubnetwork(subnetwork)
        .build();
    return deleteSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   DeleteSubnetworkHttpRequest request = DeleteSubnetworkHttpRequest.newBuilder()
   *     .setSubnetwork(subnetwork.toString())
   *     .build();
   *   Operation response = subnetworkClient.deleteSubnetwork(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteSubnetwork(DeleteSubnetworkHttpRequest request) {
    return deleteSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified subnetwork.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   DeleteSubnetworkHttpRequest request = DeleteSubnetworkHttpRequest.newBuilder()
   *     .setSubnetwork(subnetwork.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = subnetworkClient.deleteSubnetworkCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteSubnetworkHttpRequest, Operation> deleteSubnetworkCallable() {
    return stub.deleteSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();
   *   Operation response = subnetworkClient.expandIpCidrRangeSubnetwork(subnetwork, subnetworksExpandIpCidrRangeRequestResource);
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to update.
   * @param subnetworksExpandIpCidrRangeRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation expandIpCidrRangeSubnetwork(SubnetworkName subnetwork, SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource) {

    ExpandIpCidrRangeSubnetworkHttpRequest request =
        ExpandIpCidrRangeSubnetworkHttpRequest.newBuilder()
        .setSubnetwork(subnetwork == null ? null : subnetwork.toString())
        .setSubnetworksExpandIpCidrRangeRequestResource(subnetworksExpandIpCidrRangeRequestResource)
        .build();
    return expandIpCidrRangeSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();
   *   Operation response = subnetworkClient.expandIpCidrRangeSubnetwork(subnetwork.toString(), subnetworksExpandIpCidrRangeRequestResource);
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to update.
   * @param subnetworksExpandIpCidrRangeRequestResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation expandIpCidrRangeSubnetwork(String subnetwork, SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource) {

    ExpandIpCidrRangeSubnetworkHttpRequest request =
        ExpandIpCidrRangeSubnetworkHttpRequest.newBuilder()
        .setSubnetwork(subnetwork)
        .setSubnetworksExpandIpCidrRangeRequestResource(subnetworksExpandIpCidrRangeRequestResource)
        .build();
    return expandIpCidrRangeSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();
   *   ExpandIpCidrRangeSubnetworkHttpRequest request = ExpandIpCidrRangeSubnetworkHttpRequest.newBuilder()
   *     .setSubnetwork(subnetwork.toString())
   *     .setSubnetworksExpandIpCidrRangeRequestResource(subnetworksExpandIpCidrRangeRequestResource)
   *     .build();
   *   Operation response = subnetworkClient.expandIpCidrRangeSubnetwork(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation expandIpCidrRangeSubnetwork(ExpandIpCidrRangeSubnetworkHttpRequest request) {
    return expandIpCidrRangeSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Expands the IP CIDR range of the subnetwork to a specified value.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();
   *   ExpandIpCidrRangeSubnetworkHttpRequest request = ExpandIpCidrRangeSubnetworkHttpRequest.newBuilder()
   *     .setSubnetwork(subnetwork.toString())
   *     .setSubnetworksExpandIpCidrRangeRequestResource(subnetworksExpandIpCidrRangeRequestResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = subnetworkClient.expandIpCidrRangeSubnetworkCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ExpandIpCidrRangeSubnetworkHttpRequest, Operation> expandIpCidrRangeSubnetworkCallable() {
    return stub.expandIpCidrRangeSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   Subnetwork response = subnetworkClient.getSubnetwork(subnetwork);
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Subnetwork getSubnetwork(SubnetworkName subnetwork) {

    GetSubnetworkHttpRequest request =
        GetSubnetworkHttpRequest.newBuilder()
        .setSubnetwork(subnetwork == null ? null : subnetwork.toString())
        .build();
    return getSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   Subnetwork response = subnetworkClient.getSubnetwork(subnetwork.toString());
   * }
   * </code></pre>
   *
   * @param subnetwork Name of the Subnetwork resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Subnetwork getSubnetwork(String subnetwork) {

    GetSubnetworkHttpRequest request =
        GetSubnetworkHttpRequest.newBuilder()
        .setSubnetwork(subnetwork)
        .build();
    return getSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   GetSubnetworkHttpRequest request = GetSubnetworkHttpRequest.newBuilder()
   *     .setSubnetwork(subnetwork.toString())
   *     .build();
   *   Subnetwork response = subnetworkClient.getSubnetwork(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Subnetwork getSubnetwork(GetSubnetworkHttpRequest request) {
    return getSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified subnetwork. Get a list of available subnetworks list() request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   SubnetworkName subnetwork = SubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
   *   GetSubnetworkHttpRequest request = GetSubnetworkHttpRequest.newBuilder()
   *     .setSubnetwork(subnetwork.toString())
   *     .build();
   *   ApiFuture&lt;Subnetwork&gt; future = subnetworkClient.getSubnetworkCallable().futureCall(request);
   *   // Do something
   *   Subnetwork response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetSubnetworkHttpRequest, Subnetwork> getSubnetworkCallable() {
    return stub.getSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
   *   Operation response = subnetworkClient.insertSubnetwork(region, subnetworkResource);
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param subnetworkResource A Subnetwork resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSubnetwork(RegionName region, Subnetwork subnetworkResource) {

    InsertSubnetworkHttpRequest request =
        InsertSubnetworkHttpRequest.newBuilder()
        .setRegion(region == null ? null : region.toString())
        .setSubnetworkResource(subnetworkResource)
        .build();
    return insertSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
   *   Operation response = subnetworkClient.insertSubnetwork(region.toString(), subnetworkResource);
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @param subnetworkResource A Subnetwork resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSubnetwork(String region, Subnetwork subnetworkResource) {

    InsertSubnetworkHttpRequest request =
        InsertSubnetworkHttpRequest.newBuilder()
        .setRegion(region)
        .setSubnetworkResource(subnetworkResource)
        .build();
    return insertSubnetwork(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
   *   InsertSubnetworkHttpRequest request = InsertSubnetworkHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setSubnetworkResource(subnetworkResource)
   *     .build();
   *   Operation response = subnetworkClient.insertSubnetwork(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertSubnetwork(InsertSubnetworkHttpRequest request) {
    return insertSubnetworkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a subnetwork in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
   *   InsertSubnetworkHttpRequest request = InsertSubnetworkHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .setSubnetworkResource(subnetworkResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = subnetworkClient.insertSubnetworkCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertSubnetworkHttpRequest, Operation> insertSubnetworkCallable() {
    return stub.insertSubnetworkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   for (Subnetwork element : subnetworkClient.listSubnetworks(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSubnetworksPagedResponse listSubnetworks(RegionName region) {
    ListSubnetworksHttpRequest request =
        ListSubnetworksHttpRequest.newBuilder()
        .setRegion(region == null ? null : region.toString())
        .build();
    return listSubnetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   for (Subnetwork element : subnetworkClient.listSubnetworks(region.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSubnetworksPagedResponse listSubnetworks(String region) {
    ListSubnetworksHttpRequest request =
        ListSubnetworksHttpRequest.newBuilder()
        .setRegion(region)
        .build();
    return listSubnetworks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListSubnetworksHttpRequest request = ListSubnetworksHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .build();
   *   for (Subnetwork element : subnetworkClient.listSubnetworks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListSubnetworksPagedResponse listSubnetworks(ListSubnetworksHttpRequest request) {
    return listSubnetworksPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListSubnetworksHttpRequest request = ListSubnetworksHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .build();
   *   ApiFuture&lt;ListSubnetworksPagedResponse&gt; future = subnetworkClient.listSubnetworksPagedCallable().futureCall(request);
   *   // Do something
   *   for (Subnetwork element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSubnetworksHttpRequest, ListSubnetworksPagedResponse> listSubnetworksPagedCallable() {
    return stub.listSubnetworksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of subnetworks available to the specified project.
   *
   * Sample code:
   * <pre><code>
   * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
   *   RegionName region = RegionName.of("[PROJECT]", "[REGION]");
   *   ListSubnetworksHttpRequest request = ListSubnetworksHttpRequest.newBuilder()
   *     .setRegion(region.toString())
   *     .build();
   *   while (true) {
   *     SubnetworkList response = subnetworkClient.listSubnetworksCallable().call(request);
   *     for (Subnetwork element : response.getItemsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListSubnetworksHttpRequest, SubnetworkList> listSubnetworksCallable() {
    return stub.listSubnetworksCallable();
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

  public static class AggregatedListSubnetworksPagedResponse extends AbstractPagedListResponse<
      AggregatedListSubnetworksHttpRequest,
      SubnetworkAggregatedList,
      Subnetwork,
      AggregatedListSubnetworksPage,
      AggregatedListSubnetworksFixedSizeCollection> {

    public static ApiFuture<AggregatedListSubnetworksPagedResponse> createAsync(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        ApiFuture<SubnetworkAggregatedList> futureResponse) {
      ApiFuture<AggregatedListSubnetworksPage> futurePage =
          AggregatedListSubnetworksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListSubnetworksPage, AggregatedListSubnetworksPagedResponse>() {
            @Override
            public AggregatedListSubnetworksPagedResponse apply(AggregatedListSubnetworksPage input) {
              return new AggregatedListSubnetworksPagedResponse(input);
            }
          });
    }

    private AggregatedListSubnetworksPagedResponse(AggregatedListSubnetworksPage page) {
      super(page, AggregatedListSubnetworksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListSubnetworksPage extends AbstractPage<
      AggregatedListSubnetworksHttpRequest,
      SubnetworkAggregatedList,
      Subnetwork,
      AggregatedListSubnetworksPage> {

    private AggregatedListSubnetworksPage(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        SubnetworkAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListSubnetworksPage createEmptyPage() {
      return new AggregatedListSubnetworksPage(null, null);
    }

    @Override
    protected AggregatedListSubnetworksPage createPage(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        SubnetworkAggregatedList response) {
      return new AggregatedListSubnetworksPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListSubnetworksPage> createPageAsync(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        ApiFuture<SubnetworkAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListSubnetworksFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListSubnetworksHttpRequest,
      SubnetworkAggregatedList,
      Subnetwork,
      AggregatedListSubnetworksPage,
      AggregatedListSubnetworksFixedSizeCollection> {

    private AggregatedListSubnetworksFixedSizeCollection(List<AggregatedListSubnetworksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListSubnetworksFixedSizeCollection createEmptyCollection() {
      return new AggregatedListSubnetworksFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListSubnetworksFixedSizeCollection createCollection(
        List<AggregatedListSubnetworksPage> pages, int collectionSize) {
      return new AggregatedListSubnetworksFixedSizeCollection(pages, collectionSize);
    }


  }
  public static class ListSubnetworksPagedResponse extends AbstractPagedListResponse<
      ListSubnetworksHttpRequest,
      SubnetworkList,
      Subnetwork,
      ListSubnetworksPage,
      ListSubnetworksFixedSizeCollection> {

    public static ApiFuture<ListSubnetworksPagedResponse> createAsync(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        ApiFuture<SubnetworkList> futureResponse) {
      ApiFuture<ListSubnetworksPage> futurePage =
          ListSubnetworksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSubnetworksPage, ListSubnetworksPagedResponse>() {
            @Override
            public ListSubnetworksPagedResponse apply(ListSubnetworksPage input) {
              return new ListSubnetworksPagedResponse(input);
            }
          });
    }

    private ListSubnetworksPagedResponse(ListSubnetworksPage page) {
      super(page, ListSubnetworksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListSubnetworksPage extends AbstractPage<
      ListSubnetworksHttpRequest,
      SubnetworkList,
      Subnetwork,
      ListSubnetworksPage> {

    private ListSubnetworksPage(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        SubnetworkList response) {
      super(context, response);
    }

    private static ListSubnetworksPage createEmptyPage() {
      return new ListSubnetworksPage(null, null);
    }

    @Override
    protected ListSubnetworksPage createPage(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        SubnetworkList response) {
      return new ListSubnetworksPage(context, response);
    }

    @Override
    public ApiFuture<ListSubnetworksPage> createPageAsync(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        ApiFuture<SubnetworkList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListSubnetworksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListSubnetworksHttpRequest,
      SubnetworkList,
      Subnetwork,
      ListSubnetworksPage,
      ListSubnetworksFixedSizeCollection> {

    private ListSubnetworksFixedSizeCollection(List<ListSubnetworksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSubnetworksFixedSizeCollection createEmptyCollection() {
      return new ListSubnetworksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSubnetworksFixedSizeCollection createCollection(
        List<ListSubnetworksPage> pages, int collectionSize) {
      return new ListSubnetworksFixedSizeCollection(pages, collectionSize);
    }


  }
}