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
public final class MachineTypesScopedList implements ApiMessage {
  private final List<MachineType> machineTypes;
  private final Warning warning;
  private final Map<String, String> pathParams;

  private MachineTypesScopedList() {
    this.machineTypes = null;
    this.warning = null;
    this.pathParams = ImmutableMap.of();
  }


  private MachineTypesScopedList(
      List<MachineType> machineTypes,
      Warning warning
      ) {
    this.machineTypes = machineTypes;
    this.warning = warning;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("machineTypes") && machineTypes != null) {
      fieldMap.put("machineTypes", Collections.singletonList(String.valueOf(machineTypes)));
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
    }
    return fieldMap;
  }

  @Override
  public Map<String, String> pathParams() {
    return pathParams;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public List<MachineType> getMachineTypes() {
    return machineTypes;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MachineTypesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static MachineTypesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final MachineTypesScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MachineTypesScopedList();
  }

  public static class Builder {
    private List<MachineType> machineTypes;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(MachineTypesScopedList other) {
      if (other == MachineTypesScopedList.getDefaultInstance()) return this;
      if (other.getMachineTypes() != null) {
        this.machineTypes = other.machineTypes;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(MachineTypesScopedList source) {
      this.machineTypes = source.machineTypes;
      this.warning = source.warning;
    }

    public List<MachineType> getMachineTypes() {
      return machineTypes;
    }

    public Builder addAllMachineTypes(List<MachineType> machineTypes) {
      this.machineTypes = machineTypes;
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public MachineTypesScopedList build() {

      return new MachineTypesScopedList(
        machineTypes,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllMachineTypes(this.machineTypes);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "MachineTypesScopedList{"
        + "machineTypes=" + machineTypes + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MachineTypesScopedList) {
      MachineTypesScopedList that = (MachineTypesScopedList) o;
      return
          Objects.equals(this.machineTypes, that.getMachineTypes()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      machineTypes,
      warning
    );
  }
}
