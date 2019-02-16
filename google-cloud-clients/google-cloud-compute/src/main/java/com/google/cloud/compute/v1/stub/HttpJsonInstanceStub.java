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

import static com.google.cloud.compute.v1.InstanceClient.AggregatedListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceClient.ListReferrersInstancesPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMessageHttpResponseParser;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.EmptyMessage;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest;
import com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest;
import com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.DeleteInstanceHttpRequest;
import com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest;
import com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest;
import com.google.cloud.compute.v1.GetInstanceHttpRequest;
import com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest;
import com.google.cloud.compute.v1.InsertInstanceHttpRequest;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceAggregatedList;
import com.google.cloud.compute.v1.InstanceList;
import com.google.cloud.compute.v1.InstanceListReferrers;
import com.google.cloud.compute.v1.ListInstancesHttpRequest;
import com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.ProjectZoneInstanceName;
import com.google.cloud.compute.v1.ProjectZoneInstanceResourceName;
import com.google.cloud.compute.v1.ProjectZoneName;
import com.google.cloud.compute.v1.ResetInstanceHttpRequest;
import com.google.cloud.compute.v1.SerialPortOutput;
import com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest;
import com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest;
import com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest;
import com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest;
import com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest;
import com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest;
import com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest;
import com.google.cloud.compute.v1.SetTagsInstanceHttpRequest;
import com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest;
import com.google.cloud.compute.v1.StartInstanceHttpRequest;
import com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest;
import com.google.cloud.compute.v1.StopInstanceHttpRequest;
import com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
import com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest;
import com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonInstanceStub extends InstanceStub {
  @InternalApi
  public static final ApiMethodDescriptor<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceMethodDescriptor =
          ApiMethodDescriptor.<AddAccessConfigInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.addAccessConfig")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<AddAccessConfigInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/addAccessConfig"))
                      .setQueryParams(Sets.<String>newHashSet("networkInterface", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          AggregatedListInstancesHttpRequest, InstanceAggregatedList>
      aggregatedListInstancesMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListInstancesHttpRequest, InstanceAggregatedList>newBuilder()
              .setFullMethodName("compute.instances.aggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<AggregatedListInstancesHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/aggregated/instances"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<InstanceAggregatedList>newBuilder()
                      .setResponseInstance(InstanceAggregatedList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<AttachDiskInstanceHttpRequest, Operation>
      attachDiskInstanceMethodDescriptor =
          ApiMethodDescriptor.<AttachDiskInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.attachDisk")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<AttachDiskInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/attachDisk"))
                      .setQueryParams(Sets.<String>newHashSet("forceAttach", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteInstanceHttpRequest, Operation>
      deleteInstanceMethodDescriptor =
          ApiMethodDescriptor.<DeleteInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<DeleteInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/zones/{zone}/instances/{instance}"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceMethodDescriptor =
          ApiMethodDescriptor.<DeleteAccessConfigInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.deleteAccessConfig")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<DeleteAccessConfigInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/deleteAccessConfig"))
                      .setQueryParams(
                          Sets.<String>newHashSet("accessConfig", "networkInterface", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DetachDiskInstanceHttpRequest, Operation>
      detachDiskInstanceMethodDescriptor =
          ApiMethodDescriptor.<DetachDiskInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.detachDisk")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<DetachDiskInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/detachDisk"))
                      .setQueryParams(Sets.<String>newHashSet("deviceName", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetInstanceHttpRequest, Instance>
      getInstanceMethodDescriptor =
          ApiMethodDescriptor.<GetInstanceHttpRequest, Instance>newBuilder()
              .setFullMethodName("compute.instances.get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<GetInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/zones/{zone}/instances/{instance}"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Instance>newBuilder()
                      .setResponseInstance(Instance.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetIamPolicyInstanceHttpRequest, Policy>
      getIamPolicyInstanceMethodDescriptor =
          ApiMethodDescriptor.<GetIamPolicyInstanceHttpRequest, Policy>newBuilder()
              .setFullMethodName("compute.instances.getIamPolicy")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<GetIamPolicyInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{resource}/getIamPolicy"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectZoneInstanceResourceName.newFactory())
                      .setResourceNameField("resource")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Policy>newBuilder()
                      .setResponseInstance(Policy.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceMethodDescriptor =
          ApiMethodDescriptor.<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>newBuilder()
              .setFullMethodName("compute.instances.getSerialPortOutput")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<GetSerialPortOutputInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/serialPort"))
                      .setQueryParams(Sets.<String>newHashSet("port", "start"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<SerialPortOutput>newBuilder()
                      .setResponseInstance(SerialPortOutput.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<InsertInstanceHttpRequest, Operation>
      insertInstanceMethodDescriptor =
          ApiMethodDescriptor.<InsertInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<InsertInstanceHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances"))
                      .setQueryParams(
                          Sets.<String>newHashSet("requestId", "sourceInstanceTemplate"))
                      .setResourceNameFactory(ProjectZoneName.newFactory())
                      .setResourceNameField("zone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListInstancesHttpRequest, InstanceList>
      listInstancesMethodDescriptor =
          ApiMethodDescriptor.<ListInstancesHttpRequest, InstanceList>newBuilder()
              .setFullMethodName("compute.instances.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListInstancesHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/zones/{zone}/instances"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectZoneName.newFactory())
                      .setResourceNameField("zone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<InstanceList>newBuilder()
                      .setResponseInstance(InstanceList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListReferrersInstancesHttpRequest, InstanceListReferrers>
      listReferrersInstancesMethodDescriptor =
          ApiMethodDescriptor.<ListReferrersInstancesHttpRequest, InstanceListReferrers>newBuilder()
              .setFullMethodName("compute.instances.listReferrers")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListReferrersInstancesHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/referrers"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<InstanceListReferrers>newBuilder()
                      .setResponseInstance(InstanceListReferrers.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ResetInstanceHttpRequest, Operation>
      resetInstanceMethodDescriptor =
          ApiMethodDescriptor.<ResetInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.reset")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ResetInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/zones/{zone}/instances/{instance}/reset"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetDeletionProtectionInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setDeletionProtection")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<SetDeletionProtectionInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{resource}/setDeletionProtection"))
                      .setQueryParams(Sets.<String>newHashSet("deletionProtection", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceResourceName.newFactory())
                      .setResourceNameField("resource")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetDiskAutoDeleteInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setDiskAutoDelete")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetDiskAutoDeleteInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setDiskAutoDelete"))
                      .setQueryParams(
                          Sets.<String>newHashSet("autoDelete", "deviceName", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetIamPolicyInstanceHttpRequest, Policy>
      setIamPolicyInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetIamPolicyInstanceHttpRequest, Policy>newBuilder()
              .setFullMethodName("compute.instances.setIamPolicy")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetIamPolicyInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{resource}/setIamPolicy"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectZoneInstanceResourceName.newFactory())
                      .setResourceNameField("resource")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Policy>newBuilder()
                      .setResponseInstance(Policy.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetLabelsInstanceHttpRequest, Operation>
      setLabelsInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetLabelsInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setLabels")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetLabelsInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setLabels"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetMachineResourcesInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setMachineResources")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<SetMachineResourcesInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setMachineResources"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetMachineTypeInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setMachineType")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetMachineTypeInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setMachineType"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetMetadataInstanceHttpRequest, Operation>
      setMetadataInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetMetadataInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setMetadata")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetMetadataInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setMetadata"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetMinCpuPlatformInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setMinCpuPlatform")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetMinCpuPlatformInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setMinCpuPlatform"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetSchedulingInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setScheduling")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetSchedulingInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setScheduling"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetServiceAccountInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setServiceAccount")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetServiceAccountInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setServiceAccount"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetTagsInstanceHttpRequest, Operation>
      setTagsInstanceMethodDescriptor =
          ApiMethodDescriptor.<SetTagsInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.setTags")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<SetTagsInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/setTags"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceMethodDescriptor =
          ApiMethodDescriptor.<SimulateMaintenanceEventInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.simulateMaintenanceEvent")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<SimulateMaintenanceEventInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/simulateMaintenanceEvent"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<StartInstanceHttpRequest, Operation>
      startInstanceMethodDescriptor =
          ApiMethodDescriptor.<StartInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.start")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<StartInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/zones/{zone}/instances/{instance}/start"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceMethodDescriptor =
          ApiMethodDescriptor.<StartWithEncryptionKeyInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.startWithEncryptionKey")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<StartWithEncryptionKeyInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/startWithEncryptionKey"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<StopInstanceHttpRequest, Operation>
      stopInstanceMethodDescriptor =
          ApiMethodDescriptor.<StopInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.stop")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<StopInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/zones/{zone}/instances/{instance}/stop"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceMethodDescriptor =
          ApiMethodDescriptor
              .<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>newBuilder()
              .setFullMethodName("compute.instances.testIamPermissions")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<TestIamPermissionsInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{resource}/testIamPermissions"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectZoneInstanceResourceName.newFactory())
                      .setResourceNameField("resource")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<TestPermissionsResponse>newBuilder()
                      .setResponseInstance(TestPermissionsResponse.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceMethodDescriptor =
          ApiMethodDescriptor.<UpdateAccessConfigInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.updateAccessConfig")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<UpdateAccessConfigInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/updateAccessConfig"))
                      .setQueryParams(Sets.<String>newHashSet("networkInterface", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceMethodDescriptor =
          ApiMethodDescriptor.<UpdateNetworkInterfaceInstanceHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.instances.updateNetworkInterface")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<UpdateNetworkInterfaceInstanceHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/zones/{zone}/instances/{instance}/updateNetworkInterface"))
                      .setQueryParams(Sets.<String>newHashSet("networkInterface", "requestId"))
                      .setResourceNameFactory(ProjectZoneInstanceName.newFactory())
                      .setResourceNameField("instance")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;
  private final HttpJsonZoneOperationStub operationsStub;

  private final UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceCallable;
  private final OperationCallable<AddAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      addAccessConfigInstanceOperationCallable;
  private final UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList>
      aggregatedListInstancesCallable;
  private final UnaryCallable<
          AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse>
      aggregatedListInstancesPagedCallable;
  private final UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable;
  private final OperationCallable<AttachDiskInstanceHttpRequest, EmptyMessage, Operation>
      attachDiskInstanceOperationCallable;
  private final UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable;
  private final OperationCallable<DeleteInstanceHttpRequest, EmptyMessage, Operation>
      deleteInstanceOperationCallable;
  private final UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceCallable;
  private final OperationCallable<DeleteAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      deleteAccessConfigInstanceOperationCallable;
  private final UnaryCallable<DetachDiskInstanceHttpRequest, Operation> detachDiskInstanceCallable;
  private final OperationCallable<DetachDiskInstanceHttpRequest, EmptyMessage, Operation>
      detachDiskInstanceOperationCallable;
  private final UnaryCallable<GetInstanceHttpRequest, Instance> getInstanceCallable;
  private final UnaryCallable<GetIamPolicyInstanceHttpRequest, Policy> getIamPolicyInstanceCallable;
  private final UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceCallable;
  private final UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable;
  private final OperationCallable<InsertInstanceHttpRequest, EmptyMessage, Operation>
      insertInstanceOperationCallable;
  private final UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable;
  private final UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable;
  private final UnaryCallable<ListReferrersInstancesHttpRequest, InstanceListReferrers>
      listReferrersInstancesCallable;
  private final UnaryCallable<
          ListReferrersInstancesHttpRequest, ListReferrersInstancesPagedResponse>
      listReferrersInstancesPagedCallable;
  private final UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable;
  private final OperationCallable<ResetInstanceHttpRequest, EmptyMessage, Operation>
      resetInstanceOperationCallable;
  private final UnaryCallable<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceCallable;
  private final OperationCallable<SetDeletionProtectionInstanceHttpRequest, EmptyMessage, Operation>
      setDeletionProtectionInstanceOperationCallable;
  private final UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceCallable;
  private final OperationCallable<SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, Operation>
      setDiskAutoDeleteInstanceOperationCallable;
  private final UnaryCallable<SetIamPolicyInstanceHttpRequest, Policy> setIamPolicyInstanceCallable;
  private final UnaryCallable<SetLabelsInstanceHttpRequest, Operation> setLabelsInstanceCallable;
  private final OperationCallable<SetLabelsInstanceHttpRequest, EmptyMessage, Operation>
      setLabelsInstanceOperationCallable;
  private final UnaryCallable<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceCallable;
  private final OperationCallable<SetMachineResourcesInstanceHttpRequest, EmptyMessage, Operation>
      setMachineResourcesInstanceOperationCallable;
  private final UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceCallable;
  private final OperationCallable<SetMachineTypeInstanceHttpRequest, EmptyMessage, Operation>
      setMachineTypeInstanceOperationCallable;
  private final UnaryCallable<SetMetadataInstanceHttpRequest, Operation>
      setMetadataInstanceCallable;
  private final OperationCallable<SetMetadataInstanceHttpRequest, EmptyMessage, Operation>
      setMetadataInstanceOperationCallable;
  private final UnaryCallable<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceCallable;
  private final OperationCallable<SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, Operation>
      setMinCpuPlatformInstanceOperationCallable;
  private final UnaryCallable<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceCallable;
  private final OperationCallable<SetSchedulingInstanceHttpRequest, EmptyMessage, Operation>
      setSchedulingInstanceOperationCallable;
  private final UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceCallable;
  private final OperationCallable<SetServiceAccountInstanceHttpRequest, EmptyMessage, Operation>
      setServiceAccountInstanceOperationCallable;
  private final UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable;
  private final OperationCallable<SetTagsInstanceHttpRequest, EmptyMessage, Operation>
      setTagsInstanceOperationCallable;
  private final UnaryCallable<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceCallable;
  private final OperationCallable<
          SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, Operation>
      simulateMaintenanceEventInstanceOperationCallable;
  private final UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable;
  private final OperationCallable<StartInstanceHttpRequest, EmptyMessage, Operation>
      startInstanceOperationCallable;
  private final UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceCallable;
  private final OperationCallable<
          StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, Operation>
      startWithEncryptionKeyInstanceOperationCallable;
  private final UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable;
  private final OperationCallable<StopInstanceHttpRequest, EmptyMessage, Operation>
      stopInstanceOperationCallable;
  private final UnaryCallable<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceCallable;
  private final UnaryCallable<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceCallable;
  private final OperationCallable<UpdateAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      updateAccessConfigInstanceOperationCallable;
  private final UnaryCallable<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceCallable;
  private final OperationCallable<
          UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, Operation>
      updateNetworkInterfaceInstanceOperationCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonInstanceStub create(InstanceStubSettings settings)
      throws IOException {
    return new HttpJsonInstanceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInstanceStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonInstanceStub(InstanceStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonInstanceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonInstanceStub(
        InstanceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonInstanceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonInstanceStub(InstanceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonInstanceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonInstanceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonInstanceStub(
      InstanceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = HttpJsonZoneOperationStub.create(clientContext, callableFactory);

    HttpJsonCallSettings<AddAccessConfigInstanceHttpRequest, Operation>
        addAccessConfigInstanceTransportSettings =
            HttpJsonCallSettings.<AddAccessConfigInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(addAccessConfigInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<AggregatedListInstancesHttpRequest, InstanceAggregatedList>
        aggregatedListInstancesTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListInstancesHttpRequest, InstanceAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListInstancesMethodDescriptor)
                .build();
    HttpJsonCallSettings<AttachDiskInstanceHttpRequest, Operation>
        attachDiskInstanceTransportSettings =
            HttpJsonCallSettings.<AttachDiskInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(attachDiskInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteInstanceHttpRequest, Operation> deleteInstanceTransportSettings =
        HttpJsonCallSettings.<DeleteInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeleteAccessConfigInstanceHttpRequest, Operation>
        deleteAccessConfigInstanceTransportSettings =
            HttpJsonCallSettings.<DeleteAccessConfigInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteAccessConfigInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<DetachDiskInstanceHttpRequest, Operation>
        detachDiskInstanceTransportSettings =
            HttpJsonCallSettings.<DetachDiskInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(detachDiskInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<GetInstanceHttpRequest, Instance> getInstanceTransportSettings =
        HttpJsonCallSettings.<GetInstanceHttpRequest, Instance>newBuilder()
            .setMethodDescriptor(getInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetIamPolicyInstanceHttpRequest, Policy>
        getIamPolicyInstanceTransportSettings =
            HttpJsonCallSettings.<GetIamPolicyInstanceHttpRequest, Policy>newBuilder()
                .setMethodDescriptor(getIamPolicyInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
        getSerialPortOutputInstanceTransportSettings =
            HttpJsonCallSettings
                .<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>newBuilder()
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
    HttpJsonCallSettings<ListReferrersInstancesHttpRequest, InstanceListReferrers>
        listReferrersInstancesTransportSettings =
            HttpJsonCallSettings
                .<ListReferrersInstancesHttpRequest, InstanceListReferrers>newBuilder()
                .setMethodDescriptor(listReferrersInstancesMethodDescriptor)
                .build();
    HttpJsonCallSettings<ResetInstanceHttpRequest, Operation> resetInstanceTransportSettings =
        HttpJsonCallSettings.<ResetInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(resetInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetDeletionProtectionInstanceHttpRequest, Operation>
        setDeletionProtectionInstanceTransportSettings =
            HttpJsonCallSettings.<SetDeletionProtectionInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setDeletionProtectionInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetDiskAutoDeleteInstanceHttpRequest, Operation>
        setDiskAutoDeleteInstanceTransportSettings =
            HttpJsonCallSettings.<SetDiskAutoDeleteInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setDiskAutoDeleteInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetIamPolicyInstanceHttpRequest, Policy>
        setIamPolicyInstanceTransportSettings =
            HttpJsonCallSettings.<SetIamPolicyInstanceHttpRequest, Policy>newBuilder()
                .setMethodDescriptor(setIamPolicyInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetLabelsInstanceHttpRequest, Operation>
        setLabelsInstanceTransportSettings =
            HttpJsonCallSettings.<SetLabelsInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setLabelsInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetMachineResourcesInstanceHttpRequest, Operation>
        setMachineResourcesInstanceTransportSettings =
            HttpJsonCallSettings.<SetMachineResourcesInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setMachineResourcesInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetMachineTypeInstanceHttpRequest, Operation>
        setMachineTypeInstanceTransportSettings =
            HttpJsonCallSettings.<SetMachineTypeInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setMachineTypeInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetMetadataInstanceHttpRequest, Operation>
        setMetadataInstanceTransportSettings =
            HttpJsonCallSettings.<SetMetadataInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setMetadataInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetMinCpuPlatformInstanceHttpRequest, Operation>
        setMinCpuPlatformInstanceTransportSettings =
            HttpJsonCallSettings.<SetMinCpuPlatformInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setMinCpuPlatformInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetSchedulingInstanceHttpRequest, Operation>
        setSchedulingInstanceTransportSettings =
            HttpJsonCallSettings.<SetSchedulingInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setSchedulingInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetServiceAccountInstanceHttpRequest, Operation>
        setServiceAccountInstanceTransportSettings =
            HttpJsonCallSettings.<SetServiceAccountInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setServiceAccountInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetTagsInstanceHttpRequest, Operation> setTagsInstanceTransportSettings =
        HttpJsonCallSettings.<SetTagsInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(setTagsInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<SimulateMaintenanceEventInstanceHttpRequest, Operation>
        simulateMaintenanceEventInstanceTransportSettings =
            HttpJsonCallSettings
                .<SimulateMaintenanceEventInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(simulateMaintenanceEventInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<StartInstanceHttpRequest, Operation> startInstanceTransportSettings =
        HttpJsonCallSettings.<StartInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(startInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<StartWithEncryptionKeyInstanceHttpRequest, Operation>
        startWithEncryptionKeyInstanceTransportSettings =
            HttpJsonCallSettings.<StartWithEncryptionKeyInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(startWithEncryptionKeyInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<StopInstanceHttpRequest, Operation> stopInstanceTransportSettings =
        HttpJsonCallSettings.<StopInstanceHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(stopInstanceMethodDescriptor)
            .build();
    HttpJsonCallSettings<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
        testIamPermissionsInstanceTransportSettings =
            HttpJsonCallSettings
                .<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<UpdateAccessConfigInstanceHttpRequest, Operation>
        updateAccessConfigInstanceTransportSettings =
            HttpJsonCallSettings.<UpdateAccessConfigInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(updateAccessConfigInstanceMethodDescriptor)
                .build();
    HttpJsonCallSettings<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
        updateNetworkInterfaceInstanceTransportSettings =
            HttpJsonCallSettings.<UpdateNetworkInterfaceInstanceHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(updateNetworkInterfaceInstanceMethodDescriptor)
                .build();

    this.addAccessConfigInstanceCallable =
        callableFactory.createUnaryCallable(
            addAccessConfigInstanceTransportSettings,
            settings.addAccessConfigInstanceSettings(),
            clientContext);
    this.addAccessConfigInstanceOperationCallable =
        callableFactory.createOperationCallable(
            addAccessConfigInstanceTransportSettings,
            settings.addAccessConfigInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.aggregatedListInstancesCallable =
        callableFactory.createUnaryCallable(
            aggregatedListInstancesTransportSettings,
            settings.aggregatedListInstancesSettings(),
            clientContext);
    this.aggregatedListInstancesPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListInstancesTransportSettings,
            settings.aggregatedListInstancesSettings(),
            clientContext);
    this.attachDiskInstanceCallable =
        callableFactory.createUnaryCallable(
            attachDiskInstanceTransportSettings,
            settings.attachDiskInstanceSettings(),
            clientContext);
    this.attachDiskInstanceOperationCallable =
        callableFactory.createOperationCallable(
            attachDiskInstanceTransportSettings,
            settings.attachDiskInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.deleteInstanceCallable =
        callableFactory.createUnaryCallable(
            deleteInstanceTransportSettings, settings.deleteInstanceSettings(), clientContext);
    this.deleteInstanceOperationCallable =
        callableFactory.createOperationCallable(
            deleteInstanceTransportSettings,
            settings.deleteInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.deleteAccessConfigInstanceCallable =
        callableFactory.createUnaryCallable(
            deleteAccessConfigInstanceTransportSettings,
            settings.deleteAccessConfigInstanceSettings(),
            clientContext);
    this.deleteAccessConfigInstanceOperationCallable =
        callableFactory.createOperationCallable(
            deleteAccessConfigInstanceTransportSettings,
            settings.deleteAccessConfigInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.detachDiskInstanceCallable =
        callableFactory.createUnaryCallable(
            detachDiskInstanceTransportSettings,
            settings.detachDiskInstanceSettings(),
            clientContext);
    this.detachDiskInstanceOperationCallable =
        callableFactory.createOperationCallable(
            detachDiskInstanceTransportSettings,
            settings.detachDiskInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.getInstanceCallable =
        callableFactory.createUnaryCallable(
            getInstanceTransportSettings, settings.getInstanceSettings(), clientContext);
    this.getIamPolicyInstanceCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyInstanceTransportSettings,
            settings.getIamPolicyInstanceSettings(),
            clientContext);
    this.getSerialPortOutputInstanceCallable =
        callableFactory.createUnaryCallable(
            getSerialPortOutputInstanceTransportSettings,
            settings.getSerialPortOutputInstanceSettings(),
            clientContext);
    this.insertInstanceCallable =
        callableFactory.createUnaryCallable(
            insertInstanceTransportSettings, settings.insertInstanceSettings(), clientContext);
    this.insertInstanceOperationCallable =
        callableFactory.createOperationCallable(
            insertInstanceTransportSettings,
            settings.insertInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.listInstancesCallable =
        callableFactory.createUnaryCallable(
            listInstancesTransportSettings, settings.listInstancesSettings(), clientContext);
    this.listInstancesPagedCallable =
        callableFactory.createPagedCallable(
            listInstancesTransportSettings, settings.listInstancesSettings(), clientContext);
    this.listReferrersInstancesCallable =
        callableFactory.createUnaryCallable(
            listReferrersInstancesTransportSettings,
            settings.listReferrersInstancesSettings(),
            clientContext);
    this.listReferrersInstancesPagedCallable =
        callableFactory.createPagedCallable(
            listReferrersInstancesTransportSettings,
            settings.listReferrersInstancesSettings(),
            clientContext);
    this.resetInstanceCallable =
        callableFactory.createUnaryCallable(
            resetInstanceTransportSettings, settings.resetInstanceSettings(), clientContext);
    this.resetInstanceOperationCallable =
        callableFactory.createOperationCallable(
            resetInstanceTransportSettings,
            settings.resetInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setDeletionProtectionInstanceCallable =
        callableFactory.createUnaryCallable(
            setDeletionProtectionInstanceTransportSettings,
            settings.setDeletionProtectionInstanceSettings(),
            clientContext);
    this.setDeletionProtectionInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setDeletionProtectionInstanceTransportSettings,
            settings.setDeletionProtectionInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setDiskAutoDeleteInstanceCallable =
        callableFactory.createUnaryCallable(
            setDiskAutoDeleteInstanceTransportSettings,
            settings.setDiskAutoDeleteInstanceSettings(),
            clientContext);
    this.setDiskAutoDeleteInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setDiskAutoDeleteInstanceTransportSettings,
            settings.setDiskAutoDeleteInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setIamPolicyInstanceCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyInstanceTransportSettings,
            settings.setIamPolicyInstanceSettings(),
            clientContext);
    this.setLabelsInstanceCallable =
        callableFactory.createUnaryCallable(
            setLabelsInstanceTransportSettings,
            settings.setLabelsInstanceSettings(),
            clientContext);
    this.setLabelsInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setLabelsInstanceTransportSettings,
            settings.setLabelsInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setMachineResourcesInstanceCallable =
        callableFactory.createUnaryCallable(
            setMachineResourcesInstanceTransportSettings,
            settings.setMachineResourcesInstanceSettings(),
            clientContext);
    this.setMachineResourcesInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setMachineResourcesInstanceTransportSettings,
            settings.setMachineResourcesInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setMachineTypeInstanceCallable =
        callableFactory.createUnaryCallable(
            setMachineTypeInstanceTransportSettings,
            settings.setMachineTypeInstanceSettings(),
            clientContext);
    this.setMachineTypeInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setMachineTypeInstanceTransportSettings,
            settings.setMachineTypeInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setMetadataInstanceCallable =
        callableFactory.createUnaryCallable(
            setMetadataInstanceTransportSettings,
            settings.setMetadataInstanceSettings(),
            clientContext);
    this.setMetadataInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setMetadataInstanceTransportSettings,
            settings.setMetadataInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setMinCpuPlatformInstanceCallable =
        callableFactory.createUnaryCallable(
            setMinCpuPlatformInstanceTransportSettings,
            settings.setMinCpuPlatformInstanceSettings(),
            clientContext);
    this.setMinCpuPlatformInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setMinCpuPlatformInstanceTransportSettings,
            settings.setMinCpuPlatformInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setSchedulingInstanceCallable =
        callableFactory.createUnaryCallable(
            setSchedulingInstanceTransportSettings,
            settings.setSchedulingInstanceSettings(),
            clientContext);
    this.setSchedulingInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setSchedulingInstanceTransportSettings,
            settings.setSchedulingInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setServiceAccountInstanceCallable =
        callableFactory.createUnaryCallable(
            setServiceAccountInstanceTransportSettings,
            settings.setServiceAccountInstanceSettings(),
            clientContext);
    this.setServiceAccountInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setServiceAccountInstanceTransportSettings,
            settings.setServiceAccountInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.setTagsInstanceCallable =
        callableFactory.createUnaryCallable(
            setTagsInstanceTransportSettings, settings.setTagsInstanceSettings(), clientContext);
    this.setTagsInstanceOperationCallable =
        callableFactory.createOperationCallable(
            setTagsInstanceTransportSettings,
            settings.setTagsInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.simulateMaintenanceEventInstanceCallable =
        callableFactory.createUnaryCallable(
            simulateMaintenanceEventInstanceTransportSettings,
            settings.simulateMaintenanceEventInstanceSettings(),
            clientContext);
    this.simulateMaintenanceEventInstanceOperationCallable =
        callableFactory.createOperationCallable(
            simulateMaintenanceEventInstanceTransportSettings,
            settings.simulateMaintenanceEventInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.startInstanceCallable =
        callableFactory.createUnaryCallable(
            startInstanceTransportSettings, settings.startInstanceSettings(), clientContext);
    this.startInstanceOperationCallable =
        callableFactory.createOperationCallable(
            startInstanceTransportSettings,
            settings.startInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.startWithEncryptionKeyInstanceCallable =
        callableFactory.createUnaryCallable(
            startWithEncryptionKeyInstanceTransportSettings,
            settings.startWithEncryptionKeyInstanceSettings(),
            clientContext);
    this.startWithEncryptionKeyInstanceOperationCallable =
        callableFactory.createOperationCallable(
            startWithEncryptionKeyInstanceTransportSettings,
            settings.startWithEncryptionKeyInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.stopInstanceCallable =
        callableFactory.createUnaryCallable(
            stopInstanceTransportSettings, settings.stopInstanceSettings(), clientContext);
    this.stopInstanceOperationCallable =
        callableFactory.createOperationCallable(
            stopInstanceTransportSettings,
            settings.stopInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.testIamPermissionsInstanceCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsInstanceTransportSettings,
            settings.testIamPermissionsInstanceSettings(),
            clientContext);
    this.updateAccessConfigInstanceCallable =
        callableFactory.createUnaryCallable(
            updateAccessConfigInstanceTransportSettings,
            settings.updateAccessConfigInstanceSettings(),
            clientContext);
    this.updateAccessConfigInstanceOperationCallable =
        callableFactory.createOperationCallable(
            updateAccessConfigInstanceTransportSettings,
            settings.updateAccessConfigInstanceOperationSettings(),
            clientContext,
            this.operationsStub);
    this.updateNetworkInterfaceInstanceCallable =
        callableFactory.createUnaryCallable(
            updateNetworkInterfaceInstanceTransportSettings,
            settings.updateNetworkInterfaceInstanceSettings(),
            clientContext);
    this.updateNetworkInterfaceInstanceOperationCallable =
        callableFactory.createOperationCallable(
            updateNetworkInterfaceInstanceTransportSettings,
            settings.updateNetworkInterfaceInstanceOperationSettings(),
            clientContext,
            this.operationsStub);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public HttpJsonZoneOperationStub getOperationsStub() {
    return operationsStub;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AddAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      addAccessConfigInstanceOperationCallable() {
    return addAccessConfigInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<AddAccessConfigInstanceHttpRequest, Operation>
      addAccessConfigInstanceCallable() {
    return addAccessConfigInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, AggregatedListInstancesPagedResponse>
      aggregatedListInstancesPagedCallable() {
    return aggregatedListInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<AggregatedListInstancesHttpRequest, InstanceAggregatedList>
      aggregatedListInstancesCallable() {
    return aggregatedListInstancesCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<AttachDiskInstanceHttpRequest, EmptyMessage, Operation>
      attachDiskInstanceOperationCallable() {
    return attachDiskInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<AttachDiskInstanceHttpRequest, Operation> attachDiskInstanceCallable() {
    return attachDiskInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteInstanceHttpRequest, EmptyMessage, Operation>
      deleteInstanceOperationCallable() {
    return deleteInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceHttpRequest, Operation> deleteInstanceCallable() {
    return deleteInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      deleteAccessConfigInstanceOperationCallable() {
    return deleteAccessConfigInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteAccessConfigInstanceHttpRequest, Operation>
      deleteAccessConfigInstanceCallable() {
    return deleteAccessConfigInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DetachDiskInstanceHttpRequest, EmptyMessage, Operation>
      detachDiskInstanceOperationCallable() {
    return detachDiskInstanceOperationCallable;
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
  public UnaryCallable<GetIamPolicyInstanceHttpRequest, Policy> getIamPolicyInstanceCallable() {
    return getIamPolicyInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<GetSerialPortOutputInstanceHttpRequest, SerialPortOutput>
      getSerialPortOutputInstanceCallable() {
    return getSerialPortOutputInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertInstanceHttpRequest, EmptyMessage, Operation>
      insertInstanceOperationCallable() {
    return insertInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<InsertInstanceHttpRequest, Operation> insertInstanceCallable() {
    return insertInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return listInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListInstancesHttpRequest, InstanceList> listInstancesCallable() {
    return listInstancesCallable;
  }

  @BetaApi
  public UnaryCallable<ListReferrersInstancesHttpRequest, ListReferrersInstancesPagedResponse>
      listReferrersInstancesPagedCallable() {
    return listReferrersInstancesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListReferrersInstancesHttpRequest, InstanceListReferrers>
      listReferrersInstancesCallable() {
    return listReferrersInstancesCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ResetInstanceHttpRequest, EmptyMessage, Operation>
      resetInstanceOperationCallable() {
    return resetInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<ResetInstanceHttpRequest, Operation> resetInstanceCallable() {
    return resetInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetDeletionProtectionInstanceHttpRequest, EmptyMessage, Operation>
      setDeletionProtectionInstanceOperationCallable() {
    return setDeletionProtectionInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetDeletionProtectionInstanceHttpRequest, Operation>
      setDeletionProtectionInstanceCallable() {
    return setDeletionProtectionInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetDiskAutoDeleteInstanceHttpRequest, EmptyMessage, Operation>
      setDiskAutoDeleteInstanceOperationCallable() {
    return setDiskAutoDeleteInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetDiskAutoDeleteInstanceHttpRequest, Operation>
      setDiskAutoDeleteInstanceCallable() {
    return setDiskAutoDeleteInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<SetIamPolicyInstanceHttpRequest, Policy> setIamPolicyInstanceCallable() {
    return setIamPolicyInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetLabelsInstanceHttpRequest, EmptyMessage, Operation>
      setLabelsInstanceOperationCallable() {
    return setLabelsInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetLabelsInstanceHttpRequest, Operation> setLabelsInstanceCallable() {
    return setLabelsInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMachineResourcesInstanceHttpRequest, EmptyMessage, Operation>
      setMachineResourcesInstanceOperationCallable() {
    return setMachineResourcesInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetMachineResourcesInstanceHttpRequest, Operation>
      setMachineResourcesInstanceCallable() {
    return setMachineResourcesInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMachineTypeInstanceHttpRequest, EmptyMessage, Operation>
      setMachineTypeInstanceOperationCallable() {
    return setMachineTypeInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetMachineTypeInstanceHttpRequest, Operation>
      setMachineTypeInstanceCallable() {
    return setMachineTypeInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMetadataInstanceHttpRequest, EmptyMessage, Operation>
      setMetadataInstanceOperationCallable() {
    return setMetadataInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetMetadataInstanceHttpRequest, Operation> setMetadataInstanceCallable() {
    return setMetadataInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetMinCpuPlatformInstanceHttpRequest, EmptyMessage, Operation>
      setMinCpuPlatformInstanceOperationCallable() {
    return setMinCpuPlatformInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetMinCpuPlatformInstanceHttpRequest, Operation>
      setMinCpuPlatformInstanceCallable() {
    return setMinCpuPlatformInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetSchedulingInstanceHttpRequest, EmptyMessage, Operation>
      setSchedulingInstanceOperationCallable() {
    return setSchedulingInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetSchedulingInstanceHttpRequest, Operation>
      setSchedulingInstanceCallable() {
    return setSchedulingInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetServiceAccountInstanceHttpRequest, EmptyMessage, Operation>
      setServiceAccountInstanceOperationCallable() {
    return setServiceAccountInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetServiceAccountInstanceHttpRequest, Operation>
      setServiceAccountInstanceCallable() {
    return setServiceAccountInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SetTagsInstanceHttpRequest, EmptyMessage, Operation>
      setTagsInstanceOperationCallable() {
    return setTagsInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SetTagsInstanceHttpRequest, Operation> setTagsInstanceCallable() {
    return setTagsInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<SimulateMaintenanceEventInstanceHttpRequest, EmptyMessage, Operation>
      simulateMaintenanceEventInstanceOperationCallable() {
    return simulateMaintenanceEventInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<SimulateMaintenanceEventInstanceHttpRequest, Operation>
      simulateMaintenanceEventInstanceCallable() {
    return simulateMaintenanceEventInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<StartInstanceHttpRequest, EmptyMessage, Operation>
      startInstanceOperationCallable() {
    return startInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<StartInstanceHttpRequest, Operation> startInstanceCallable() {
    return startInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<StartWithEncryptionKeyInstanceHttpRequest, EmptyMessage, Operation>
      startWithEncryptionKeyInstanceOperationCallable() {
    return startWithEncryptionKeyInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<StartWithEncryptionKeyInstanceHttpRequest, Operation>
      startWithEncryptionKeyInstanceCallable() {
    return startWithEncryptionKeyInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<StopInstanceHttpRequest, EmptyMessage, Operation>
      stopInstanceOperationCallable() {
    return stopInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<StopInstanceHttpRequest, Operation> stopInstanceCallable() {
    return stopInstanceCallable;
  }

  @BetaApi
  public UnaryCallable<TestIamPermissionsInstanceHttpRequest, TestPermissionsResponse>
      testIamPermissionsInstanceCallable() {
    return testIamPermissionsInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<UpdateAccessConfigInstanceHttpRequest, EmptyMessage, Operation>
      updateAccessConfigInstanceOperationCallable() {
    return updateAccessConfigInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateAccessConfigInstanceHttpRequest, Operation>
      updateAccessConfigInstanceCallable() {
    return updateAccessConfigInstanceCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<UpdateNetworkInterfaceInstanceHttpRequest, EmptyMessage, Operation>
      updateNetworkInterfaceInstanceOperationCallable() {
    return updateNetworkInterfaceInstanceOperationCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateNetworkInterfaceInstanceHttpRequest, Operation>
      updateNetworkInterfaceInstanceCallable() {
    return updateNetworkInterfaceInstanceCallable;
  }

  @Override
  public final void close() {
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
