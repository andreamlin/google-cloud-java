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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InstanceGroupManagersRecreateInstancesRequest implements ApiMessage {
  private final List<String> instances;

  private InstanceGroupManagersRecreateInstancesRequest() {
    this.instances = null;
  }


  private InstanceGroupManagersRecreateInstancesRequest(
      List<String> instances
      ) {
    this.instances = instances;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instances") && instances != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : instances) {
        stringList.add(item.toString());
      }
      fieldMap.put("instances", stringList.build());
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("instances")) {
      return String.valueOf(instances);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<String> getInstancesList() {
    return instances;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceGroupManagersRecreateInstancesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupManagersRecreateInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceGroupManagersRecreateInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceGroupManagersRecreateInstancesRequest();
  }

  public static class Builder {
    private List<String> instances;

    Builder() {}

    public Builder mergeFrom(InstanceGroupManagersRecreateInstancesRequest other) {
      if (other == InstanceGroupManagersRecreateInstancesRequest.getDefaultInstance()) return this;
      if (other.getInstancesList() != null) {
        this.instances = other.instances;
      }
      return this;
    }

    Builder(InstanceGroupManagersRecreateInstancesRequest source) {
      this.instances = source.instances;
    }

    public List<String> getInstancesList() {
      return instances;
    }

    public Builder addAllInstances(List<String> instances) {
      if (this.instances == null) {
        this.instances = new ArrayList<>(instances.size());
      }
      this.instances.addAll(instances);
      return this;
    }

    public Builder addInstances(String instances) {
      this.instances.add(instances);
      return this;
    }


    public InstanceGroupManagersRecreateInstancesRequest build() {
      return new InstanceGroupManagersRecreateInstancesRequest(
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
    return "InstanceGroupManagersRecreateInstancesRequest{"
        + "instances=" + instances
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupManagersRecreateInstancesRequest) {
      InstanceGroupManagersRecreateInstancesRequest that = (InstanceGroupManagersRecreateInstancesRequest) o;
      return
          Objects.equals(this.instances, that.getInstancesList())
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