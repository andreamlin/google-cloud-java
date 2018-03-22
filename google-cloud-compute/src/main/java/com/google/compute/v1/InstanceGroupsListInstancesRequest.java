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
public final class InstanceGroupsListInstancesRequest implements ApiMessage {
  private final String instanceState;

  private InstanceGroupsListInstancesRequest() {
    this.instanceState = null;
  }


  private InstanceGroupsListInstancesRequest(
      String instanceState
      ) {
    this.instanceState = instanceState;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instanceState") && instanceState != null) {
      fieldMap.put("instanceState", Collections.singletonList(String.valueOf(instanceState)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("instanceState")) {
      return String.valueOf(instanceState);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getInstanceState() {
    return instanceState;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceGroupsListInstancesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupsListInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceGroupsListInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceGroupsListInstancesRequest();
  }

  public static class Builder {
    private String instanceState;

    Builder() {}

    public Builder mergeFrom(InstanceGroupsListInstancesRequest other) {
      if (other == InstanceGroupsListInstancesRequest.getDefaultInstance()) return this;
      if (other.getInstanceState() != null) {
        this.instanceState = other.instanceState;
      }
      return this;
    }

    Builder(InstanceGroupsListInstancesRequest source) {
      this.instanceState = source.instanceState;
    }

    public String getInstanceState() {
      return instanceState;
    }

    public Builder setInstanceState(String instanceState) {
      this.instanceState = instanceState;
      return this;
    }


    public InstanceGroupsListInstancesRequest build() {
      return new InstanceGroupsListInstancesRequest(
        instanceState
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setInstanceState(this.instanceState);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroupsListInstancesRequest{"
        + "instanceState=" + instanceState
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupsListInstancesRequest) {
      InstanceGroupsListInstancesRequest that = (InstanceGroupsListInstancesRequest) o;
      return
          Objects.equals(this.instanceState, that.getInstanceState())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceState
    );
  }
}