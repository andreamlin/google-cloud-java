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
import com.google.cloud.compute.v1.AccessConfig;
import com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest;
import com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest;
import com.google.cloud.compute.v1.AttachedDisk;
import com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.DeleteInstanceHttpRequest;
import com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest;
import com.google.cloud.compute.v1.GetInstanceHttpRequest;
import com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest;
import com.google.cloud.compute.v1.InsertInstanceHttpRequest;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceAggregatedList;
import static com.google.cloud.compute.v1.InstanceClient.AggregatedListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListInstancesPagedResponse;
import com.google.cloud.compute.v1.InstanceList;
import com.google.cloud.compute.v1.InstanceName;
import com.google.cloud.compute.v1.InstanceSettings;
import com.google.cloud.compute.v1.InstancesSetMachineTypeRequest;
import com.google.cloud.compute.v1.InstancesSetServiceAccountRequest;
import com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest;
import com.google.cloud.compute.v1.ListInstancesHttpRequest;
import com.google.cloud.compute.v1.Metadata;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.ResetInstanceHttpRequest;
import com.google.cloud.compute.v1.Scheduling;
import com.google.cloud.compute.v1.SerialPortOutput;
import com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest;
import com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest;
import com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest;
import com.google.cloud.compute.v1.SetTagsInstanceHttpRequest;
import com.google.cloud.compute.v1.StartInstanceHttpRequest;
import com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest;
import com.google.cloud.compute.v1.StopInstanceHttpRequest;
import com.google.cloud.compute.v1.Tags;
import com.google.cloud.compute.v1.ZoneName;
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
public class HttpJsonInstanceStub extends InstanceStub {
  @InternalApi
  public static final ApiMethodDescriptor<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceMethodDescriptor =
      ApiMethodDescriptor.<AddAccessConfigInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.addAccessConfig")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<AddAccessConfigInstanceHttpRequest>newBuilder()
                  .setRequestInstance(AddAccessConfigInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/addAccessConfig"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "networkInterface"
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListInstancesHttpRequest, InstanceAggregatedList> aggregatedListInstancesMethodDescriptor =
      ApiMethodDescriptor.<AggregatedListInstancesHttpRequest, InstanceAggregatedList>newBuilder()
          .setFullMethodName("compute.instances.aggregatedList")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<AggregatedListInstancesHttpRequest>newBuilder()
                  .setRequestInstance(AggregatedListInstancesHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/aggregated/instances"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "filter",    "maxResults",    "orderBy",    "pageToken"
                                     ))
                  .setResourceNameFactory(ProjectName.newFactory())
                  .setResourceNameField("project")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<InstanceAggregatedList>newBuilder()
                  .setResponseInstance(InstanceAggregatedList.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceMethodDescriptor =
      ApiMethodDescriptor.<AttachDiskInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.attachDisk")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<AttachDiskInstanceHttpRequest>newBuilder()
                  .setRequestInstance(AttachDiskInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/attachDisk"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteInstanceHttpRequest, Operation> deleteInstanceMethodDescriptor =
      ApiMethodDescriptor.<DeleteInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.delete")
          .setHttpMethod(HttpMethods.DELETE)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<DeleteInstanceHttpRequest>newBuilder()
                  .setRequestInstance(DeleteInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceMethodDescriptor =
      ApiMethodDescriptor.<DeleteAccessConfigInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.deleteAccessConfig")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<DeleteAccessConfigInstanceHttpRequest>newBuilder()
                  .setRequestInstance(DeleteAccessConfigInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/deleteAccessConfig"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "accessConfig",    "networkInterface"
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceMethodDescriptor =
      ApiMethodDescriptor.<DetachDiskInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.detachDisk")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<DetachDiskInstanceHttpRequest>newBuilder()
                  .setRequestInstance(DetachDiskInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/detachDisk"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "deviceName"
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetInstanceHttpRequest, Instance> getInstanceMethodDescriptor =
      ApiMethodDescriptor.<GetInstanceHttpRequest, Instance>newBuilder()
          .setFullMethodName("compute.instances.get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetInstanceHttpRequest>newBuilder()
                  .setRequestInstance(GetInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Instance>newBuilder()
                  .setResponseInstance(Instance.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceMethodDescriptor =
      ApiMethodDescriptor.<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>newBuilder()
          .setFullMethodName("compute.instances.getSerialPortOutput")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetSerialPortOutputInstanceHttpRequest>newBuilder()
                  .setRequestInstance(GetSerialPortOutputInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/serialPort"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "port",    "start"
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<SerialPortOutput>newBuilder()
                  .setResponseInstance(SerialPortOutput.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<InsertInstanceHttpRequest, Operation> insertInstanceMethodDescriptor =
      ApiMethodDescriptor.<InsertInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.insert")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<InsertInstanceHttpRequest>newBuilder()
                  .setRequestInstance(InsertInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(ZoneName.newFactory())
                  .setResourceNameField("zone")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ListInstancesHttpRequest, InstanceList> listInstancesMethodDescriptor =
      ApiMethodDescriptor.<ListInstancesHttpRequest, InstanceList>newBuilder()
          .setFullMethodName("compute.instances.list")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<ListInstancesHttpRequest>newBuilder()
                  .setRequestInstance(ListInstancesHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "filter",    "maxResults",    "orderBy",    "pageToken"
                                     ))
                  .setResourceNameFactory(ZoneName.newFactory())
                  .setResourceNameField("zone")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<InstanceList>newBuilder()
                  .setResponseInstance(InstanceList.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<ResetInstanceHttpRequest, Operation> resetInstanceMethodDescriptor =
      ApiMethodDescriptor.<ResetInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.reset")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<ResetInstanceHttpRequest>newBuilder()
                  .setRequestInstance(ResetInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/reset"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceMethodDescriptor =
      ApiMethodDescriptor.<SetDiskAutoDeleteInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.setDiskAutoDelete")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<SetDiskAutoDeleteInstanceHttpRequest>newBuilder()
                  .setRequestInstance(SetDiskAutoDeleteInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/setDiskAutoDelete"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     "autoDelete",    "deviceName"
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceMethodDescriptor =
      ApiMethodDescriptor.<SetMachineTypeInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.setMachineType")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<SetMachineTypeInstanceHttpRequest>newBuilder()
                  .setRequestInstance(SetMachineTypeInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/setMachineType"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceMethodDescriptor =
      ApiMethodDescriptor.<SetMetadataInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.setMetadata")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<SetMetadataInstanceHttpRequest>newBuilder()
                  .setRequestInstance(SetMetadataInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/setMetadata"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceMethodDescriptor =
      ApiMethodDescriptor.<SetSchedulingInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.setScheduling")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<SetSchedulingInstanceHttpRequest>newBuilder()
                  .setRequestInstance(SetSchedulingInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/setScheduling"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceMethodDescriptor =
      ApiMethodDescriptor.<SetServiceAccountInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.setServiceAccount")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<SetServiceAccountInstanceHttpRequest>newBuilder()
                  .setRequestInstance(SetServiceAccountInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/setServiceAccount"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<SetTagsInstanceHttpRequest, Operation> setTagsInstanceMethodDescriptor =
      ApiMethodDescriptor.<SetTagsInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.setTags")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<SetTagsInstanceHttpRequest>newBuilder()
                  .setRequestInstance(SetTagsInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/setTags"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<StartInstanceHttpRequest, Operation> startInstanceMethodDescriptor =
      ApiMethodDescriptor.<StartInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.start")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<StartInstanceHttpRequest>newBuilder()
                  .setRequestInstance(StartInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/start"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceMethodDescriptor =
      ApiMethodDescriptor.<StartWithEncryptionKeyInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.startWithEncryptionKey")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<StartWithEncryptionKeyInstanceHttpRequest>newBuilder()
                  .setRequestInstance(StartWithEncryptionKeyInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/startWithEncryptionKey"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
  @InternalApi
  public static final ApiMethodDescriptor<StopInstanceHttpRequest, Operation> stopInstanceMethodDescriptor =
      ApiMethodDescriptor.<StopInstanceHttpRequest, Operation>newBuilder()
          .setFullMethodName("compute.instances.stop")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<StopInstanceHttpRequest>newBuilder()
                  .setRequestInstance(StopInstanceHttpRequest.getDefaultInstance())
                  .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances/{instance}/stop"))
                  .setQueryParams(Sets.<String>newHashSet(
                                     ))
                  .setResourceNameFactory(InstanceName.newFactory())
                  .setResourceNameField("instance")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Operation>newBuilder()
                  .setResponseInstance(Operation.getDefaultInstance())
                  .build())
          .build();
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

  private final HttpJsonStubCallableFactory callableFactory;
  public static final HttpJsonInstanceStub create(InstanceStubSettings settings) throws IOException {
    return new HttpJsonInstanceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceStub(InstanceStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonInstanceStub create(ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonInstanceStub(InstanceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonInstanceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceStub(InstanceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonInstanceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonInstanceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonInstanceStub(InstanceStubSettings settings, ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AddAccessConfigInstanceHttpRequest, Operation> addAccessConfigInstanceTransportSettings =
        HttpJsonCallSettings.<AddAccessConfigInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(addAccessConfigInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<AggregatedListInstancesHttpRequest, InstanceAggregatedList> aggregatedListInstancesTransportSettings =
        HttpJsonCallSettings.<AggregatedListInstancesHttpRequest, InstanceAggregatedList>newBuilder()
            .setMethodDescriptor(aggregatedListInstancesMethodDescriptor)
            .build();
    HttpJsonCallSettings<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceTransportSettings =
        HttpJsonCallSettings.<AttachDiskInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(attachDiskInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceTransportSettings =
        HttpJsonCallSettings.<DeleteInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation> deleteAccessConfigInstanceTransportSettings =
        HttpJsonCallSettings.<DeleteAccessConfigInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteAccessConfigInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceTransportSettings =
        HttpJsonCallSettings.<DetachDiskInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(detachDiskInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetInstanceHttpRequest, Instance> getInstanceTransportSettings =
        HttpJsonCallSettings.<GetInstanceHttpRequest, Instance>newBuilder()
            .setMethodDescriptor(getInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput> getSerialPortOutputInstanceTransportSettings =
        HttpJsonCallSettings.<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>newBuilder()
            .setMethodDescriptor(getSerialPortOutputInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertInstanceHttpRequest, Operation> insertInstanceTransportSettings =
        HttpJsonCallSettings.<InsertInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(insertInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInstancesHttpRequest, InstanceList> listInstancesTransportSettings =
        HttpJsonCallSettings.<ListInstancesHttpRequest, InstanceList>newBuilder()
            .setMethodDescriptor(listInstancesMethodDescriptor)
            .build();
    HttpJsonCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceTransportSettings =
        HttpJsonCallSettings.<ResetInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(resetInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation> setDiskAutoDeleteInstanceTransportSettings =
        HttpJsonCallSettings.<SetDiskAutoDeleteInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setDiskAutoDeleteInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetMachineTypeInstanceHttpRequest, Operation> setMachineTypeInstanceTransportSettings =
        HttpJsonCallSettings.<SetMachineTypeInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setMachineTypeInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceTransportSettings =
        HttpJsonCallSettings.<SetMetadataInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setMetadataInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetSchedulingInstanceHttpRequest, Operation> setSchedulingInstanceTransportSettings =
        HttpJsonCallSettings.<SetSchedulingInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setSchedulingInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetServiceAccountInstanceHttpRequest, Operation> setServiceAccountInstanceTransportSettings =
        HttpJsonCallSettings.<SetServiceAccountInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setServiceAccountInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceTransportSettings =
        HttpJsonCallSettings.<SetTagsInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setTagsInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<StartInstanceHttpRequest, Operation> startInstanceTransportSettings =
        HttpJsonCallSettings.<StartInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(startInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation> startWithEncryptionKeyInstanceTransportSettings =
        HttpJsonCallSettings.<StartWithEncryptionKeyInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(startWithEncryptionKeyInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<StopInstanceHttpRequest, Operation> stopInstanceTransportSettings =
        HttpJsonCallSettings.<StopInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(stopInstanceMethodDescriptor)
            .build();

    this.addAccessConfigInstanceCallable = callableFactory.createUnaryCallable(addAccessConfigInstanceTransportSettings,settings.addAccessConfigInstanceSettings(), clientContext);
    this.aggregatedListInstancesCallable = callableFactory.createUnaryCallable(aggregatedListInstancesTransportSettings,settings.aggregatedListInstancesSettings(), clientContext);
    this.aggregatedListInstancesPagedCallable = callableFactory.createPagedCallable(aggregatedListInstancesTransportSettings,settings.aggregatedListInstancesSettings(), clientContext);
    this.attachDiskInstanceCallable = callableFactory.createUnaryCallable(attachDiskInstanceTransportSettings,settings.attachDiskInstanceSettings(), clientContext);
    this.deleteInstanceCallable = callableFactory.createUnaryCallable(deleteInstanceTransportSettings,settings.deleteInstanceSettings(), clientContext);
    this.deleteAccessConfigInstanceCallable = callableFactory.createUnaryCallable(deleteAccessConfigInstanceTransportSettings,settings.deleteAccessConfigInstanceSettings(), clientContext);
    this.detachDiskInstanceCallable = callableFactory.createUnaryCallable(detachDiskInstanceTransportSettings,settings.detachDiskInstanceSettings(), clientContext);
    this.getInstanceCallable = callableFactory.createUnaryCallable(getInstanceTransportSettings,settings.getInstanceSettings(), clientContext);
    this.getSerialPortOutputInstanceCallable = callableFactory.createUnaryCallable(getSerialPortOutputInstanceTransportSettings,settings.getSerialPortOutputInstanceSettings(), clientContext);
    this.insertInstanceCallable = callableFactory.createUnaryCallable(insertInstanceTransportSettings,settings.insertInstanceSettings(), clientContext);
    this.listInstancesCallable = callableFactory.createUnaryCallable(listInstancesTransportSettings,settings.listInstancesSettings(), clientContext);
    this.listInstancesPagedCallable = callableFactory.createPagedCallable(listInstancesTransportSettings,settings.listInstancesSettings(), clientContext);
    this.resetInstanceCallable = callableFactory.createUnaryCallable(resetInstanceTransportSettings,settings.resetInstanceSettings(), clientContext);
    this.setDiskAutoDeleteInstanceCallable = callableFactory.createUnaryCallable(setDiskAutoDeleteInstanceTransportSettings,settings.setDiskAutoDeleteInstanceSettings(), clientContext);
    this.setMachineTypeInstanceCallable = callableFactory.createUnaryCallable(setMachineTypeInstanceTransportSettings,settings.setMachineTypeInstanceSettings(), clientContext);
    this.setMetadataInstanceCallable = callableFactory.createUnaryCallable(setMetadataInstanceTransportSettings,settings.setMetadataInstanceSettings(), clientContext);
    this.setSchedulingInstanceCallable = callableFactory.createUnaryCallable(setSchedulingInstanceTransportSettings,settings.setSchedulingInstanceSettings(), clientContext);
    this.setServiceAccountInstanceCallable = callableFactory.createUnaryCallable(setServiceAccountInstanceTransportSettings,settings.setServiceAccountInstanceSettings(), clientContext);
    this.setTagsInstanceCallable = callableFactory.createUnaryCallable(setTagsInstanceTransportSettings,settings.setTagsInstanceSettings(), clientContext);
    this.startInstanceCallable = callableFactory.createUnaryCallable(startInstanceTransportSettings,settings.startInstanceSettings(), clientContext);
    this.startWithEncryptionKeyInstanceCallable = callableFactory.createUnaryCallable(startWithEncryptionKeyInstanceTransportSettings,settings.startWithEncryptionKeyInstanceSettings(), clientContext);
    this.stopInstanceCallable = callableFactory.createUnaryCallable(stopInstanceTransportSettings,settings.stopInstanceSettings(), clientContext);

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