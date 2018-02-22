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
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InstancesSetMachineTypeRequest implements ApiMessage {
  private final String machineType;
  private final Map<String, String> pathParams;

  private InstancesSetMachineTypeRequest() {
    this.machineType = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstancesSetMachineTypeRequest(
      String machineType
      ) {
    this.machineType = machineType;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("machineType") && machineType != null) {
      fieldMap.put("machineType", Collections.singletonList(String.valueOf(machineType)));
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

  public String getMachineType() {
    return machineType;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstancesSetMachineTypeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstancesSetMachineTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstancesSetMachineTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstancesSetMachineTypeRequest();
  }

  public static class Builder {
    private String machineType;

    Builder() {}

    public Builder mergeFrom(InstancesSetMachineTypeRequest other) {
      if (other == InstancesSetMachineTypeRequest.getDefaultInstance()) return this;
      if (other.getMachineType() != null) {
        this.machineType = other.machineType;
      }
      return this;
    }

    Builder(InstancesSetMachineTypeRequest source) {
      this.machineType = source.machineType;
    }

    public String getMachineType() {
      return machineType;
    }

    public Builder setMachineType(String machineType) {
      this.machineType = machineType;
      return this;
    }


    public InstancesSetMachineTypeRequest build() {
      return new InstancesSetMachineTypeRequest(
        machineType
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setMachineType(this.machineType);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstancesSetMachineTypeRequest{"
        + "machineType=" + machineType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstancesSetMachineTypeRequest) {
      InstancesSetMachineTypeRequest that = (InstancesSetMachineTypeRequest) o;
      return
          Objects.equals(this.machineType, that.getMachineType())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      machineType
    );
  }
}
