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
import static com.google.compute.v1.PagedResponseWrappers.ListInstanceTemplatesPagedResponse;
import com.google.compute.v1.stub.InstanceTemplateStub;
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
 * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
 *
 *   Operation response = instanceTemplateClient.deleteInstanceTemplate();
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceTemplateClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of InstanceTemplateSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * InstanceTemplateSettings instanceTemplateSettings =
 *     InstanceTemplateSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstanceTemplateClient instanceTemplateClient =
 *     InstanceTemplateClient.create(instanceTemplateSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * InstanceTemplateSettings instanceTemplateSettings =
 *     InstanceTemplateSettings.newBuilder()
 *         .setTransportProvider(InstanceTemplateSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(InstanceTemplateSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * InstanceTemplateClient instanceTemplateClient =
 *     InstanceTemplateClient.create(instanceTemplateSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceTemplateClient implements BackgroundResource {
  private final InstanceTemplateSettings settings;
  private final InstanceTemplateStub stub;



  /**
   * Constructs an instance of InstanceTemplateClient with default settings.
   */
  public static final InstanceTemplateClient create() throws IOException {
    return create(InstanceTemplateSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InstanceTemplateClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final InstanceTemplateClient create(InstanceTemplateSettings settings) throws IOException {
    return new InstanceTemplateClient(settings);
  }

  /**
   * Constructs an instance of InstanceTemplateClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use InstanceTemplateSettings}.
   */
  public static final InstanceTemplateClient create(InstanceTemplateStub stub) {
    return new InstanceTemplateClient(stub);
  }

  /**
   * Constructs an instance of InstanceTemplateClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected InstanceTemplateClient(InstanceTemplateSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected InstanceTemplateClient(InstanceTemplateStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InstanceTemplateSettings getSettings() {
    return settings;
  }

  @BetaApi
  public InstanceTemplateStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   Operation response = instanceTemplateClient.deleteInstanceTemplate();
   * }
   * </code></pre>
   *
   * @param instanceTemplate The name of the instance template to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstanceTemplate(InstanceTemplateName instanceTemplate) {

    DeleteInstanceTemplateHttpRequest request =
        DeleteInstanceTemplateHttpRequest.newBuilder()
        .setInstanceTemplateWithInstanceTemplateName(instanceTemplate)
        .build();
    return deleteInstanceTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   Operation response = instanceTemplateClient.deleteInstanceTemplate();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteInstanceTemplate(DeleteInstanceTemplateHttpRequest request) {
    return deleteInstanceTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceTemplateClient.deleteInstanceTemplateCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteInstanceTemplateHttpRequest, Operation> deleteInstanceTemplateCallable() {
    return stub.deleteInstanceTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance template. Get a list of available instance templates by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   InstanceTemplate response = instanceTemplateClient.getInstanceTemplate();
   * }
   * </code></pre>
   *
   * @param instanceTemplate The name of the instance template.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceTemplate getInstanceTemplate(InstanceTemplateName instanceTemplate) {

    GetInstanceTemplateHttpRequest request =
        GetInstanceTemplateHttpRequest.newBuilder()
        .setInstanceTemplateWithInstanceTemplateName(instanceTemplate)
        .build();
    return getInstanceTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance template. Get a list of available instance templates by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   InstanceTemplate response = instanceTemplateClient.getInstanceTemplate();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final InstanceTemplate getInstanceTemplate(GetInstanceTemplateHttpRequest request) {
    return getInstanceTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified instance template. Get a list of available instance templates by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   ApiFuture&lt;InstanceTemplate&gt; future = instanceTemplateClient.getInstanceTemplateCallable().futureCall();
   *   // Do something
   *   InstanceTemplate response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetInstanceTemplateHttpRequest, InstanceTemplate> getInstanceTemplateCallable() {
    return stub.getInstanceTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   Operation response = instanceTemplateClient.insertInstanceTemplate();
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param instanceTemplateResource An Instance Template resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstanceTemplate(ProjectName project, InstanceTemplate instanceTemplateResource) {

    InsertInstanceTemplateHttpRequest request =
        InsertInstanceTemplateHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setInstanceTemplateResource(instanceTemplateResource)
        .build();
    return insertInstanceTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   Operation response = instanceTemplateClient.insertInstanceTemplate();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertInstanceTemplate(InsertInstanceTemplateHttpRequest request) {
    return insertInstanceTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   ApiFuture&lt;Operation&gt; future = instanceTemplateClient.insertInstanceTemplateCallable().futureCall();
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertInstanceTemplateHttpRequest, Operation> insertInstanceTemplateCallable() {
    return stub.insertInstanceTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of instance templates that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   for (InstanceTemplate element : instanceTemplateClient.listInstanceTemplates().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstanceTemplatesPagedResponse listInstanceTemplates(ProjectName project) {
    ListInstanceTemplatesHttpRequest request =
        ListInstanceTemplatesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listInstanceTemplates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of instance templates that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   for (InstanceTemplate element : instanceTemplateClient.listInstanceTemplates().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListInstanceTemplatesPagedResponse listInstanceTemplates(ListInstanceTemplatesHttpRequest request) {
    return listInstanceTemplatesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of instance templates that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   ApiFuture&lt;ListInstanceTemplatesPagedResponse&gt; future = instanceTemplateClient.listInstanceTemplatesPagedCallable().futureCall();
   *   // Do something
   *   for (InstanceTemplate element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListInstanceTemplatesHttpRequest, ListInstanceTemplatesPagedResponse> listInstanceTemplatesPagedCallable() {
    return stub.listInstanceTemplatesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of instance templates that are contained within the specified project and zone.
   *
   * Sample code:
   * <pre><code>
   * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
   *
   *   while (true) {
   *     InstanceTemplateList response = instanceTemplateClient.listInstanceTemplatesCallable().call();
   *     for (InstanceTemplate element : response.getItems()) {
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
  public final UnaryCallable<ListInstanceTemplatesHttpRequest, InstanceTemplateList> listInstanceTemplatesCallable() {
    return stub.listInstanceTemplatesCallable();
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