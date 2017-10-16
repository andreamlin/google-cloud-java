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
import static com.google.compute.v1.PagedResponseWrappers.ListImagesPagedResponse;
import com.google.compute.v1.stub.ImageStub;
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
 * try (ImageClient imageClient = ImageClient.create()) {
 *   ImageName image = ImageName.create("[PROJECT]", "[IMAGE]");
 *   Operation response = imageClient.deleteImage(image);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the imageClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of ImageSettings to
 * create(). For example:
 *
 * To customize credentials:
 *
 * <pre>
 * <code>
 * ImageSettings imageSettings =
 *     ImageSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ImageClient imageClient =
 *     ImageClient.create(imageSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ImageSettings imageSettings =
 *     ImageSettings.newBuilder()
 *         .setTransportProvider(ImageSettings.defaultHttpJsonTransportProviderBuilder()
 *             .setChannelProvider(ImageSettings.defaultHttpJsonChannelProviderBuilder()
 *                 .setEndpoint(myEndpoint)
 *                 .build())
 *             .build())
 *         .build();
 * ImageClient imageClient =
 *     ImageClient.create(imageSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ImageClient implements BackgroundResource {
  private final ImageSettings settings;
  private final ImageStub stub;



  /**
   * Constructs an instance of ImageClient with default settings.
   */
  public static final ImageClient create() throws IOException {
    return create(ImageSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ImageClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final ImageClient create(ImageSettings settings) throws IOException {
    return new ImageClient(settings);
  }

  /**
   * Constructs an instance of ImageClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ImageSettings}.
   */
  public static final ImageClient create(ImageStub stub) {
    return new ImageClient(stub);
  }

  /**
   * Constructs an instance of ImageClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected ImageClient(ImageSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected ImageClient(ImageStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ImageSettings getSettings() {
    return settings;
  }

  @BetaApi
  public ImageStub getStub() {
    return stub;
  }


  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified image.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   ImageName image = ImageName.create("[PROJECT]", "[IMAGE]");
   *   Operation response = imageClient.deleteImage(image);
   * }
   * </code></pre>
   *
   * @param image Name of the image resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteImage(ImageName image) {

    DeleteImageHttpRequest request =
        DeleteImageHttpRequest.newBuilder()
        .setImageWithImageName(image)
        .build();
    return deleteImage(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified image.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedImage = ImageClient.formatImageName("[PROJECT]", "[IMAGE]");
   *   DeleteImageHttpRequest request = DeleteImageHttpRequest.newBuilder()
   *     .setImage(formattedImage)
   *     .build();
   *   Operation response = imageClient.deleteImage(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteImage(DeleteImageHttpRequest request) {
    return deleteImageCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified image.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedImage = ImageClient.formatImageName("[PROJECT]", "[IMAGE]");
   *   DeleteImageHttpRequest request = DeleteImageHttpRequest.newBuilder()
   *     .setImage(formattedImage)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = imageClient.deleteImageCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteImageHttpRequest, Operation> deleteImageCallable() {
    return stub.deleteImageCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the deprecation status of an image.
   *
   * If an empty request body is given, clears the deprecation status instead.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   ImageName image = ImageName.create("[PROJECT]", "[IMAGE]");
   *   DeprecationStatus deprecationStatus = DeprecationStatus.newBuilder().build();
   *   Operation response = imageClient.deprecateImage(image, deprecationStatus);
   * }
   * </code></pre>
   *
   * @param image Image name.
   * @param deprecationStatusResource Deprecation status for a public resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deprecateImage(ImageName image, DeprecationStatus deprecationStatusResource) {

    DeprecateImageHttpRequest request =
        DeprecateImageHttpRequest.newBuilder()
        .setImageWithImageName(image)
        .setDeprecationStatusResource(deprecationStatusResource)
        .build();
    return deprecateImage(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the deprecation status of an image.
   *
   * If an empty request body is given, clears the deprecation status instead.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedImage = ImageClient.formatImageName("[PROJECT]", "[IMAGE]");
   *   DeprecationStatus deprecationStatus = DeprecationStatus.newBuilder().build();
   *   DeprecateImageHttpRequest request = DeprecateImageHttpRequest.newBuilder()
   *     .setImage(formattedImage)
   *     .setDeprecationStatus(deprecationStatus)
   *     .build();
   *   Operation response = imageClient.deprecateImage(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deprecateImage(DeprecateImageHttpRequest request) {
    return deprecateImageCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the deprecation status of an image.
   *
   * If an empty request body is given, clears the deprecation status instead.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedImage = ImageClient.formatImageName("[PROJECT]", "[IMAGE]");
   *   DeprecationStatus deprecationStatus = DeprecationStatus.newBuilder().build();
   *   DeprecateImageHttpRequest request = DeprecateImageHttpRequest.newBuilder()
   *     .setImage(formattedImage)
   *     .setDeprecationStatus(deprecationStatus)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = imageClient.deprecateImageCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeprecateImageHttpRequest, Operation> deprecateImageCallable() {
    return stub.deprecateImageCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified image. Get a list of available images by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   ImageName image = ImageName.create("[PROJECT]", "[IMAGE]");
   *   Image response = imageClient.getImage(image);
   * }
   * </code></pre>
   *
   * @param image Name of the image resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Image getImage(ImageName image) {

    GetImageHttpRequest request =
        GetImageHttpRequest.newBuilder()
        .setImageWithImageName(image)
        .build();
    return getImage(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified image. Get a list of available images by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedImage = ImageClient.formatImageName("[PROJECT]", "[IMAGE]");
   *   GetImageHttpRequest request = GetImageHttpRequest.newBuilder()
   *     .setImage(formattedImage)
   *     .build();
   *   Image response = imageClient.getImage(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Image getImage(GetImageHttpRequest request) {
    return getImageCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified image. Get a list of available images by making a list() request.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedImage = ImageClient.formatImageName("[PROJECT]", "[IMAGE]");
   *   GetImageHttpRequest request = GetImageHttpRequest.newBuilder()
   *     .setImage(formattedImage)
   *     .build();
   *   ApiFuture&lt;Image&gt; future = imageClient.getImageCallable().futureCall(request);
   *   // Do something
   *   Image response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetImageHttpRequest, Image> getImageCallable() {
    return stub.getImageCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the latest image that is part of an image family and is not deprecated.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   FamilyName family = FamilyName.create("[PROJECT]", "[FAMILY]");
   *   Image response = imageClient.getFromFamilyImage(family);
   * }
   * </code></pre>
   *
   * @param family Name of the image family to search for.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Image getFromFamilyImage(FamilyName family) {

    GetFromFamilyImageHttpRequest request =
        GetFromFamilyImageHttpRequest.newBuilder()
        .setFamilyWithFamilyName(family)
        .build();
    return getFromFamilyImage(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the latest image that is part of an image family and is not deprecated.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedFamily = ImageClient.formatFamilyName("[PROJECT]", "[FAMILY]");
   *   GetFromFamilyImageHttpRequest request = GetFromFamilyImageHttpRequest.newBuilder()
   *     .setFamily(formattedFamily)
   *     .build();
   *   Image response = imageClient.getFromFamilyImage(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Image getFromFamilyImage(GetFromFamilyImageHttpRequest request) {
    return getFromFamilyImageCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the latest image that is part of an image family and is not deprecated.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedFamily = ImageClient.formatFamilyName("[PROJECT]", "[FAMILY]");
   *   GetFromFamilyImageHttpRequest request = GetFromFamilyImageHttpRequest.newBuilder()
   *     .setFamily(formattedFamily)
   *     .build();
   *   ApiFuture&lt;Image&gt; future = imageClient.getFromFamilyImageCallable().futureCall(request);
   *   // Do something
   *   Image response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetFromFamilyImageHttpRequest, Image> getFromFamilyImageCallable() {
    return stub.getFromFamilyImageCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an image in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   Image image = Image.newBuilder().build();
   *   Operation response = imageClient.insertImage(project, image);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param imageResource An Image resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertImage(ProjectName project, Image imageResource) {

    InsertImageHttpRequest request =
        InsertImageHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .setImageResource(imageResource)
        .build();
    return insertImage(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an image in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedProject = ImageClient.formatProjectName("[PROJECT]");
   *   Image image = Image.newBuilder().build();
   *   InsertImageHttpRequest request = InsertImageHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setImage(image)
   *     .build();
   *   Operation response = imageClient.insertImage(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertImage(InsertImageHttpRequest request) {
    return insertImageCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an image in the specified project using the data included in the request.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedProject = ImageClient.formatProjectName("[PROJECT]");
   *   Image image = Image.newBuilder().build();
   *   InsertImageHttpRequest request = InsertImageHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setImage(image)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = imageClient.insertImageCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertImageHttpRequest, Operation> insertImageCallable() {
    return stub.insertImageCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   ProjectName project = ProjectName.create("[PROJECT]");
   *   for (Image element : imageClient.listImages(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListImagesPagedResponse listImages(ProjectName project) {
    ListImagesHttpRequest request =
        ListImagesHttpRequest.newBuilder()
        .setProjectWithProjectName(project)
        .build();
    return listImages(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedProject = ImageClient.formatProjectName("[PROJECT]");
   *   ListImagesHttpRequest request = ListImagesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (Image element : imageClient.listImages(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListImagesPagedResponse listImages(ListImagesHttpRequest request) {
    return listImagesPagedCallable()
        .call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedProject = ImageClient.formatProjectName("[PROJECT]");
   *   ListImagesHttpRequest request = ListImagesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListImagesPagedResponse&gt; future = imageClient.listImagesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Image element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListImagesHttpRequest, ListImagesPagedResponse> listImagesPagedCallable() {
    return stub.listImagesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
   *
   * Sample code:
   * <pre><code>
   * try (ImageClient imageClient = ImageClient.create()) {
   *   String formattedProject = ImageClient.formatProjectName("[PROJECT]");
   *   ListImagesHttpRequest request = ListImagesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     ImageList response = imageClient.listImagesCallable().call(request);
   *     for (Image element : response.getItems()) {
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
  public final UnaryCallable<ListImagesHttpRequest, ImageList> listImagesCallable() {
    return stub.listImagesCallable();
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