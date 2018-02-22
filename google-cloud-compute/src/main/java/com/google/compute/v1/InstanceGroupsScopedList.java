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
public final class InstanceGroupsScopedList implements ApiMessage {
  private final List<InstanceGroup> instanceGroups;
  private final Warning warning;
  private final Map<String, String> pathParams;

  private InstanceGroupsScopedList() {
    this.instanceGroups = null;
    this.warning = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstanceGroupsScopedList(
      List<InstanceGroup> instanceGroups,
      Warning warning
      ) {
    this.instanceGroups = instanceGroups;
    this.warning = warning;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instanceGroups") && instanceGroups != null) {
      fieldMap.put("instanceGroups", instanceGroups);
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
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

  public List<InstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceGroupsScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceGroupsScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceGroupsScopedList();
  }

  public static class Builder {
    private List<InstanceGroup> instanceGroups;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(InstanceGroupsScopedList other) {
      if (other == InstanceGroupsScopedList.getDefaultInstance()) return this;
      if (other.getInstanceGroups() != null) {
        this.instanceGroups = other.instanceGroups;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(InstanceGroupsScopedList source) {
      this.instanceGroups = source.instanceGroups;
      this.warning = source.warning;
    }

    public List<InstanceGroup> getInstanceGroups() {
      return instanceGroups;
    }

    public Builder addAllInstanceGroups(List<InstanceGroup> instanceGroups) {
      this.instanceGroups.addAll(instanceGroups);
      return this;
    }

    public Builder addInstanceGroups(InstanceGroup instanceGroups) {
      this.instanceGroups.add(instanceGroups);
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public InstanceGroupsScopedList build() {

      return new InstanceGroupsScopedList(
        instanceGroups,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllInstanceGroups(this.instanceGroups);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroupsScopedList{"
        + "instanceGroups=" + instanceGroups + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupsScopedList) {
      InstanceGroupsScopedList that = (InstanceGroupsScopedList) o;
      return
          Objects.equals(this.instanceGroups, that.getInstanceGroups()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceGroups,
      warning
    );
  }
}
