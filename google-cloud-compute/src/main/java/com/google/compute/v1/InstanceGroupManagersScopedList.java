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
public final class InstanceGroupManagersScopedList implements ApiMessage {
  private final List<InstanceGroupManager> instanceGroupManagers;
  private final Warning warning;
  private final Map<String, String> pathParams;

  private InstanceGroupManagersScopedList() {
    this.instanceGroupManagers = null;
    this.warning = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstanceGroupManagersScopedList(
      List<InstanceGroupManager> instanceGroupManagers,
      Warning warning
      ) {
    this.instanceGroupManagers = instanceGroupManagers;
    this.warning = warning;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instanceGroupManagers") && instanceGroupManagers != null) {
      fieldMap.put("instanceGroupManagers", Collections.singletonList(String.valueOf(instanceGroupManagers)));
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

  public List<InstanceGroupManager> getInstanceGroupManagers() {
    return instanceGroupManagers;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceGroupManagersScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupManagersScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceGroupManagersScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceGroupManagersScopedList();
  }

  public static class Builder {
    private List<InstanceGroupManager> instanceGroupManagers;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(InstanceGroupManagersScopedList other) {
      if (other == InstanceGroupManagersScopedList.getDefaultInstance()) return this;
      if (other.getInstanceGroupManagers() != null) {
        this.instanceGroupManagers = other.instanceGroupManagers;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(InstanceGroupManagersScopedList source) {
      this.instanceGroupManagers = source.instanceGroupManagers;
      this.warning = source.warning;
    }

    public List<InstanceGroupManager> getInstanceGroupManagers() {
      return instanceGroupManagers;
    }

    public Builder addAllInstanceGroupManagers(List<InstanceGroupManager> instanceGroupManagers) {
      this.instanceGroupManagers = instanceGroupManagers;
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public InstanceGroupManagersScopedList build() {

      return new InstanceGroupManagersScopedList(
        instanceGroupManagers,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllInstanceGroupManagers(this.instanceGroupManagers);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroupManagersScopedList{"
        + "instanceGroupManagers=" + instanceGroupManagers + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupManagersScopedList) {
      InstanceGroupManagersScopedList that = (InstanceGroupManagersScopedList) o;
      return
          Objects.equals(this.instanceGroupManagers, that.getInstanceGroupManagers()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceGroupManagers,
      warning
    );
  }
}
