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
package com.google.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.Sets;
import com.google.compute.v1.DeleteSslCertificateHttpRequest;
import com.google.compute.v1.GetSslCertificateHttpRequest;
import com.google.compute.v1.InsertSslCertificateHttpRequest;
import com.google.compute.v1.ListSslCertificatesHttpRequest;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.ListSslCertificatesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.SslCertificate;
import com.google.compute.v1.SslCertificateAdminSettings;
import com.google.compute.v1.SslCertificateList;
import com.google.compute.v1.SslCertificateName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class HttpJsonSslCertificateAdminStub extends SslCertificateAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<DeleteSslCertificateHttpRequest, Operation> directDeleteSslCertificateCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteSslCertificateHttpRequest, Operation>newBuilder()
              .setMethodName("compute.sslCertificates.delete")
              .setRequestInstance(DeleteSslCertificateHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/sslCertificates/{sslCertificate}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "sslCertificate"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<GetSslCertificateHttpRequest, SslCertificate> directGetSslCertificateCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetSslCertificateHttpRequest, SslCertificate>newBuilder()
              .setMethodName("compute.sslCertificates.get")
              .setRequestInstance(GetSslCertificateHttpRequest.getDefaultInstance())
              .setResponseInstance(SslCertificate.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/sslCertificates/{sslCertificate}")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "sslCertificate"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertSslCertificateHttpRequest, Operation> directInsertSslCertificateCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertSslCertificateHttpRequest, Operation>newBuilder()
              .setMethodName("compute.sslCertificates.insert")
              .setRequestInstance(InsertSslCertificateHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/sslCertificates")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListSslCertificatesHttpRequest, SslCertificateList> directListSslCertificatesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListSslCertificatesHttpRequest, SslCertificateList>newBuilder()
              .setMethodName("compute.sslCertificates.list")
              .setRequestInstance(ListSslCertificatesHttpRequest.getDefaultInstance())
              .setResponseInstance(SslCertificateList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/global/sslCertificates")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateCallable;
  private final UnaryCallable<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateCallable;
  private final UnaryCallable<InsertSslCertificateHttpRequest, Operation> insertSslCertificateCallable;
  private final UnaryCallable<ListSslCertificatesHttpRequest, SslCertificateList> listSslCertificatesCallable;
  private final UnaryCallable<ListSslCertificatesHttpRequest, ListSslCertificatesPagedResponse> listSslCertificatesPagedCallable;

  public static final HttpJsonSslCertificateAdminStub create(SslCertificateAdminSettings settings) throws IOException {
    return new HttpJsonSslCertificateAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonSslCertificateAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonSslCertificateAdminStub(SslCertificateAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonSslCertificateAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonSslCertificateAdminStub(SslCertificateAdminSettings settings, ClientContext clientContext) throws IOException {

    this.deleteSslCertificateCallable = HttpJsonCallableFactory.create(directDeleteSslCertificateCallable,settings.deleteSslCertificateSettings(), clientContext);
    this.getSslCertificateCallable = HttpJsonCallableFactory.create(directGetSslCertificateCallable,settings.getSslCertificateSettings(), clientContext);
    this.insertSslCertificateCallable = HttpJsonCallableFactory.create(directInsertSslCertificateCallable,settings.insertSslCertificateSettings(), clientContext);
    this.listSslCertificatesCallable = HttpJsonCallableFactory.create(directListSslCertificatesCallable,settings.listSslCertificatesSettings(), clientContext);
    this.listSslCertificatesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListSslCertificatesCallable,settings.listSslCertificatesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<DeleteSslCertificateHttpRequest, Operation> deleteSslCertificateCallable() {
    return deleteSslCertificateCallable;
  }

  @BetaApi
  public UnaryCallable<GetSslCertificateHttpRequest, SslCertificate> getSslCertificateCallable() {
    return getSslCertificateCallable;
  }

  @BetaApi
  public UnaryCallable<InsertSslCertificateHttpRequest, Operation> insertSslCertificateCallable() {
    return insertSslCertificateCallable;
  }

  @BetaApi
  public UnaryCallable<ListSslCertificatesHttpRequest, ListSslCertificatesPagedResponse> listSslCertificatesPagedCallable() {
    return listSslCertificatesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListSslCertificatesHttpRequest, SslCertificateList> listSslCertificatesCallable() {
    return listSslCertificatesCallable;
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