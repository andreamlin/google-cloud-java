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
import com.google.compute.v1.AccessConfig;
import com.google.compute.v1.AddAccessConfigInstanceHttpRequest;
import com.google.compute.v1.AggregatedListInstancesHttpRequest;
import com.google.compute.v1.AttachDiskInstanceHttpRequest;
import com.google.compute.v1.AttachedDisk;
import com.google.compute.v1.DeleteAccessConfigInstanceHttpRequest;
import com.google.compute.v1.DeleteInstanceHttpRequest;
import com.google.compute.v1.DetachDiskInstanceHttpRequest;
import com.google.compute.v1.GetInstanceHttpRequest;
import com.google.compute.v1.GetSerialPortOutputInstanceHttpRequest;
import com.google.compute.v1.InsertInstanceHttpRequest;
import com.google.compute.v1.Instance;
import com.google.compute.v1.InstanceAdminSettings;
import com.google.compute.v1.InstanceAggregatedList;
import com.google.compute.v1.InstanceList;
import com.google.compute.v1.InstanceName;
import com.google.compute.v1.InstancesSetMachineTypeRequest;
import com.google.compute.v1.InstancesSetServiceAccountRequest;
import com.google.compute.v1.InstancesStartWithEncryptionKeyRequest;
import com.google.compute.v1.ListInstancesHttpRequest;
import com.google.compute.v1.Metadata;
import com.google.compute.v1.Operation;
import static com.google.compute.v1.PagedResponseWrappers.AggregatedListInstancesPagedResponse;
import static com.google.compute.v1.PagedResponseWrappers.ListInstancesPagedResponse;
import com.google.compute.v1.ProjectName;
import com.google.compute.v1.ResetInstanceHttpRequest;
import com.google.compute.v1.Scheduling;
import com.google.compute.v1.SerialPortOutput;
import com.google.compute.v1.SetDiskAutoDeleteInstanceHttpRequest;
import com.google.compute.v1.SetMachineTypeInstanceHttpRequest;
import com.google.compute.v1.SetMetadataInstanceHttpRequest;
import com.google.compute.v1.SetSchedulingInstanceHttpRequest;
import com.google.compute.v1.SetServiceAccountInstanceHttpRequest;
import com.google.compute.v1.SetTagsInstanceHttpRequest;
import com.google.compute.v1.StartInstanceHttpRequest;
import com.google.compute.v1.StartWithEncryptionKeyInstanceHttpRequest;
import com.google.compute.v1.StopInstanceHttpRequest;
import com.google.compute.v1.Tags;
import com.google.compute.v1.ZoneName;
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
public class HttpJsonInstanceAdminStub extends InstanceAdminStub {
  private static final String BASE_URL = "https://www.googleapis.com/compute/v1/projects/";

  private static final UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation> directAddAccessConfigInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AddAccessConfigInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.addAccessConfig")
              .setRequestInstance(AddAccessConfigInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/addAccessConfig")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "networkInterface"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> directAggregatedListInstancesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AggregatedListInstancesHttpRequest, InstanceAggregatedList>newBuilder()
              .setMethodName("compute.instances.aggregatedList")
              .setRequestInstance(AggregatedListInstancesHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceAggregatedList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/aggregated/instances")
              .setPathParams(Sets.<String>newHashSet(
                                "project"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<AttachDiskInstanceHttpRequest, Operation> directAttachDiskInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<AttachDiskInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.attachDisk")
              .setRequestInstance(AttachDiskInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/attachDisk")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<DeleteInstanceHttpRequest, Operation> directDeleteInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.delete")
              .setRequestInstance(DeleteInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.DELETE)
              .build());
  private static final UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation> directDeleteAccessConfigInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DeleteAccessConfigInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.deleteAccessConfig")
              .setRequestInstance(DeleteAccessConfigInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/deleteAccessConfig")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "accessConfig",    "networkInterface"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<DetachDiskInstanceHttpRequest, Operation> directDetachDiskInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<DetachDiskInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.detachDisk")
              .setRequestInstance(DetachDiskInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/detachDisk")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "deviceName"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<GetInstanceHttpRequest, Instance> directGetInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetInstanceHttpRequest, Instance>newBuilder()
              .setMethodName("compute.instances.get")
              .setRequestInstance(GetInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Instance.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> directGetSerialPortOutputInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>newBuilder()
              .setMethodName("compute.instances.getSerialPortOutput")
              .setRequestInstance(GetSerialPortOutputInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(SerialPortOutput.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/serialPort")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "port",    "start"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<InsertInstanceHttpRequest, Operation> directInsertInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<InsertInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.insert")
              .setRequestInstance(InsertInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<ListInstancesHttpRequest, InstanceList> directListInstancesCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ListInstancesHttpRequest, InstanceList>newBuilder()
              .setMethodName("compute.instances.list")
              .setRequestInstance(ListInstancesHttpRequest.getDefaultInstance())
              .setResponseInstance(InstanceList.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances")
              .setPathParams(Sets.<String>newHashSet(
                                "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "filter",    "maxResults",    "orderBy",    "pageToken"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.GET)
              .build());
  private static final UnaryCallable<ResetInstanceHttpRequest, Operation> directResetInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<ResetInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.reset")
              .setRequestInstance(ResetInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/reset")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation> directSetDiskAutoDeleteInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetDiskAutoDeleteInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.setDiskAutoDelete")
              .setRequestInstance(SetDiskAutoDeleteInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/setDiskAutoDelete")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 "autoDelete",    "deviceName"
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation> directSetMachineTypeInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetMachineTypeInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.setMachineType")
              .setRequestInstance(SetMachineTypeInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/setMachineType")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetMetadataInstanceHttpRequest, Operation> directSetMetadataInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetMetadataInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.setMetadata")
              .setRequestInstance(SetMetadataInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/setMetadata")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetSchedulingInstanceHttpRequest, Operation> directSetSchedulingInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetSchedulingInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.setScheduling")
              .setRequestInstance(SetSchedulingInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/setScheduling")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation> directSetServiceAccountInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetServiceAccountInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.setServiceAccount")
              .setRequestInstance(SetServiceAccountInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/setServiceAccount")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<SetTagsInstanceHttpRequest, Operation> directSetTagsInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<SetTagsInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.setTags")
              .setRequestInstance(SetTagsInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/setTags")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<StartInstanceHttpRequest, Operation> directStartInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<StartInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.start")
              .setRequestInstance(StartInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/start")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation> directStartWithEncryptionKeyInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<StartWithEncryptionKeyInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.startWithEncryptionKey")
              .setRequestInstance(StartWithEncryptionKeyInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/startWithEncryptionKey")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());
  private static final UnaryCallable<StopInstanceHttpRequest, Operation> directStopInstanceCallable =
      HttpJsonCallableFactory.createDirectCallable(
          ApiMethodDescriptor.<StopInstanceHttpRequest, Operation>newBuilder()
              .setMethodName("compute.instances.stop")
              .setRequestInstance(StopInstanceHttpRequest.getDefaultInstance())
              .setResponseInstance(Operation.getDefaultInstance())
              .setEndpointPathTemplate("{project}/zones/{zone}/instances/{instance}/stop")
              .setPathParams(Sets.<String>newHashSet(
                                "instance",    "project",    "zone"
                                ))
              .setQueryParams(Sets.<String>newHashSet(
                                 ))
              .setHttpRequestFormatter(new ApiMessageHttpRequestFormatter())
              .setHttpMethod(HttpMethods.POST)
              .build());

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceCallable;
  private final UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> aggregatedListInstancesCallable;
  private final UnaryCallable<AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse> aggregatedListInstancesPagedCallable;
  private final UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable;
  private final UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable;
  private final UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceCallable;
  private final UnaryCallable<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceCallable;
  private final UnaryCallable<GetInstanceHttpRequest, Instance> getInstanceCallable;
  private final UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceCallable;
  private final UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable;
  private final UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable;
  private final UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse> listInstancesPagedCallable;
  private final UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable;
  private final UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceCallable;
  private final UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceCallable;
  private final UnaryCallable<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceCallable;
  private final UnaryCallable<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceCallable;
  private final UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceCallable;
  private final UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable;
  private final UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable;
  private final UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceCallable;
  private final UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable;

  public static final HttpJsonInstanceAdminStub create(InstanceAdminSettings settings) throws IOException {
    return new HttpJsonInstanceAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceAdminStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceAdminStub(InstanceAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of HttpJsonInstanceAdminStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceAdminStub(InstanceAdminSettings settings, ClientContext clientContext) throws IOException {

    this.addAccessConfigInstanceCallable = HttpJsonCallableFactory.create(directAddAccessConfigInstanceCallable,settings.addAccessConfigInstanceSettings(), clientContext);
    this.aggregatedListInstancesCallable = HttpJsonCallableFactory.create(directAggregatedListInstancesCallable,settings.aggregatedListInstancesSettings(), clientContext);
    this.aggregatedListInstancesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directAggregatedListInstancesCallable,settings.aggregatedListInstancesSettings(), clientContext);
    this.attachDiskInstanceCallable = HttpJsonCallableFactory.create(directAttachDiskInstanceCallable,settings.attachDiskInstanceSettings(), clientContext);
    this.deleteInstanceCallable = HttpJsonCallableFactory.create(directDeleteInstanceCallable,settings.deleteInstanceSettings(), clientContext);
    this.deleteAccessConfigInstanceCallable = HttpJsonCallableFactory.create(directDeleteAccessConfigInstanceCallable,settings.deleteAccessConfigInstanceSettings(), clientContext);
    this.detachDiskInstanceCallable = HttpJsonCallableFactory.create(directDetachDiskInstanceCallable,settings.detachDiskInstanceSettings(), clientContext);
    this.getInstanceCallable = HttpJsonCallableFactory.create(directGetInstanceCallable,settings.getInstanceSettings(), clientContext);
    this.getSerialPortOutputInstanceCallable = HttpJsonCallableFactory.create(directGetSerialPortOutputInstanceCallable,settings.getSerialPortOutputInstanceSettings(), clientContext);
    this.insertInstanceCallable = HttpJsonCallableFactory.create(directInsertInstanceCallable,settings.insertInstanceSettings(), clientContext);
    this.listInstancesCallable = HttpJsonCallableFactory.create(directListInstancesCallable,settings.listInstancesSettings(), clientContext);
    this.listInstancesPagedCallable =
        HttpJsonCallableFactory.createPagedVariant(directListInstancesCallable,settings.listInstancesSettings(), clientContext);
    this.resetInstanceCallable = HttpJsonCallableFactory.create(directResetInstanceCallable,settings.resetInstanceSettings(), clientContext);
    this.setDiskAutoDeleteInstanceCallable = HttpJsonCallableFactory.create(directSetDiskAutoDeleteInstanceCallable,settings.setDiskAutoDeleteInstanceSettings(), clientContext);
    this.setMachineTypeInstanceCallable = HttpJsonCallableFactory.create(directSetMachineTypeInstanceCallable,settings.setMachineTypeInstanceSettings(), clientContext);
    this.setMetadataInstanceCallable = HttpJsonCallableFactory.create(directSetMetadataInstanceCallable,settings.setMetadataInstanceSettings(), clientContext);
    this.setSchedulingInstanceCallable = HttpJsonCallableFactory.create(directSetSchedulingInstanceCallable,settings.setSchedulingInstanceSettings(), clientContext);
    this.setServiceAccountInstanceCallable = HttpJsonCallableFactory.create(directSetServiceAccountInstanceCallable,settings.setServiceAccountInstanceSettings(), clientContext);
    this.setTagsInstanceCallable = HttpJsonCallableFactory.create(directSetTagsInstanceCallable,settings.setTagsInstanceSettings(), clientContext);
    this.startInstanceCallable = HttpJsonCallableFactory.create(directStartInstanceCallable,settings.startInstanceSettings(), clientContext);
    this.startWithEncryptionKeyInstanceCallable = HttpJsonCallableFactory.create(directStartWithEncryptionKeyInstanceCallable,settings.startWithEncryptionKeyInstanceSettings(), clientContext);
    this.stopInstanceCallable = HttpJsonCallableFactory.create(directStopInstanceCallable,settings.stopInstanceSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceCallable() {
    return addAccessConfigInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse> aggregatedListInstancesPagedCallable() {
    return aggregatedListInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList> aggregatedListInstancesCallable() {
    return aggregatedListInstancesCallable;
  }

  @BetaApi
  public UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable() {
    return attachDiskInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable() {
    return deleteInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceCallable() {
    return deleteAccessConfigInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceCallable() {
    return detachDiskInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<GetInstanceHttpRequest, Instance> getInstanceCallable() {
    return getInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceCallable() {
    return getSerialPortOutputInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable() {
    return insertInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse> listInstancesPagedCallable() {
    return listInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable() {
    return listInstancesCallable;
  }

  @BetaApi
  public UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable() {
    return resetInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceCallable() {
    return setDiskAutoDeleteInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceCallable() {
    return setMachineTypeInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceCallable() {
    return setMetadataInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceCallable() {
    return setSchedulingInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceCallable() {
    return setServiceAccountInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable() {
    return setTagsInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable() {
    return startInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceCallable() {
    return startWithEncryptionKeyInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable() {
    return stopInstanceCallable;
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