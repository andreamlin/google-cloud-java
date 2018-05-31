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
package com.google.cloud.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMessageHttpResponseParser;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.compute.v1.GetLicenseHttpRequest;
import com.google.cloud.compute.v1.License;
import com.google.cloud.compute.v1.LicenseName;
import com.google.cloud.compute.v1.LicenseSettings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
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
public class HttpJsonLicenseStub extends LicenseStub {
  @InternalApi
  public static final ApiMethodDescriptor<GetLicenseHttpRequest, License> getLicenseMethodDescriptor =
      ApiMethodDescriptor.<GetLicenseHttpRequest, License>newBuilder()
          .setFullMethodName("compute.licenses.get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetLicenseHttpRequest>newBuilder()
                  .setRequestInstance(GetLicenseHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/global/licenses/{license}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(LicenseName.newFactory())
                  .setResourceNameField("license")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<License>newBuilder()
                  .setResponseInstance(License.getDefaultInstance())
                  .build())
          .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetLicenseHttpRequest, License> getLicenseCallable;

  private final HttpJsonStubCallableFactory callableFactory;
  public static final HttpJsonLicenseStub create(LicenseStubSettings settings) throws IOException {
    return new HttpJsonLicenseStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonLicenseStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonLicenseStub(LicenseStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonLicenseStub create(ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonLicenseStub(LicenseStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonLicenseStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonLicenseStub(LicenseStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonLicenseCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonLicenseStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonLicenseStub(LicenseStubSettings settings, ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetLicenseHttpRequest, License> getLicenseTransportSettings =
        HttpJsonCallSettings.<GetLicenseHttpRequest, License>newBuilder()
            .setMethodDescriptor(getLicenseMethodDescriptor)
            .build();

    this.getLicenseCallable = callableFactory.createUnaryCallable(getLicenseTransportSettings,settings.getLicenseSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetLicenseHttpRequest, License> getLicenseCallable() {
    return getLicenseCallable;
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