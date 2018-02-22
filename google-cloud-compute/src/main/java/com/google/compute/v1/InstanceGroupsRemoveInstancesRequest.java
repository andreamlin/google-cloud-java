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

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import com.google.api.resourcenames.ResourceName;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InstanceGroupsRemoveInstancesRequest implements ApiMessage {
  private final List<InstanceReference> instances;
  private final Map<String, String> pathParams;

  private InstanceGroupsRemoveInstancesRequest() {
    this.instances = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstanceGroupsRemoveInstancesRequest(
      List<InstanceReference> instances
      ) {
    this.instances = instances;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instances") && instances != null) {
      fieldMap.put("instances", instances.stream().map(item -> item.toString()).collect(Collectors.toList()));
    }
    return fieldMap;
  }

  @Override
  public Map<String, String> getApiMessagePathParams() {
    return pathParams;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<InstanceReference> getInstances() {
    return instances;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceGroupsRemoveInstancesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupsRemoveInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceGroupsRemoveInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceGroupsRemoveInstancesRequest();
  }

  public static class Builder {
    private List<InstanceReference> instances;

    Builder() {}

    public Builder mergeFrom(InstanceGroupsRemoveInstancesRequest other) {
      if (other == InstanceGroupsRemoveInstancesRequest.getDefaultInstance()) return this;
      if (other.getInstances() != null) {
        this.instances = other.instances;
      }
      return this;
    }

    Builder(InstanceGroupsRemoveInstancesRequest source) {
      this.instances = source.instances;
    }

    public List<InstanceReference> getInstances() {
      return instances;
    }

    public Builder addAllInstances(List<InstanceReference> instances) {
      this.instances.addAll(instances);
      return this;
    }

    public Builder addInstances(InstanceReference instances) {
      this.instances.add(instances);
      return this;
    }


    public InstanceGroupsRemoveInstancesRequest build() {
      return new InstanceGroupsRemoveInstancesRequest(
        instances
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllInstances(this.instances);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroupsRemoveInstancesRequest{"
        + "instances=" + instances
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupsRemoveInstancesRequest) {
      InstanceGroupsRemoveInstancesRequest that = (InstanceGroupsRemoveInstancesRequest) o;
      return
          Objects.equals(this.instances, that.getInstances())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instances
    );
  }
}
