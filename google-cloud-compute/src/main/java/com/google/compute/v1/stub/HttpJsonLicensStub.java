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
package com.google.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.EmptyRequestParamsExtractor;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.compute.v1.GetLicensHttpRequest;
import com.google.compute.v1.LicensSettings;
import com.google.compute.v1.License;
import com.google.compute.v1.LicenseName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonLicensStub extends LicensStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final ApiMethodDescriptor<GetLicensHttpRequest, License> getLicensMethodDescriptor =
      ApiMethodDescriptor.<GetLicensHttpRequest, License>newBuilder()
          .setMethodName("compute.licenses.get")
          .setRequestInstance(GetLicensHttpRequest.getDefaultInstance())
          .setResponseInstance(License.getDefaultInstance())
          .setEndpointPathTemplate("{project}/global/licenses/{license}")
          .setPathParams(Sets.<String>newHashSet(
                            "license",    "project"
                            ))
          .setQueryParams(Sets.<String>newHashSet(
                             ))
          .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
          .setHttpMethod(HttpMethods.GET)
          .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetLicensHttpRequest, License> getLicensCallable;

  public static final HttpJsonLicensStub create(LicensSettings settings) throws IOException {
    return new HttpJsonLicensStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonLicensStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonLicensStub(LicensSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonLicensStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonLicensStub(LicensSettings settings, ClientContext clientContext) throws IOException {

    HttpJsonCallSettings<GetLicensHttpRequest, License> getLicensTransportSettings =
        HttpJsonCallSettings.<GetLicensHttpRequest, License>newBuilder()
            .setMethodDescriptor(getLicensMethodDescriptor)
            .build();

    this.getLicensCallable = HttpJsonCallableFactory.createUnaryCallable(getLicensTransportSettings,settings.getLicensSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetLicensHttpRequest, License> getLicensCallable() {
    return getLicensCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }

}