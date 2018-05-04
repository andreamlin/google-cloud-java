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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
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
public final class DisksScopedList implements ApiMessage {
  private final List<Disk> disks;
  private final Warning warning;

  private DisksScopedList() {
    this.disks = null;
    this.warning = null;
  }

  private DisksScopedList(List<Disk> disks, Warning warning) {
    this.disks = disks;
    this.warning = warning;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("disks") && disks != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (Disk item : disks) {
        stringList.add(item.toString());
      }
      fieldMap.put("disks", stringList.build());
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("disks")) {
      return String.valueOf(disks);
    }
    if (fieldName.equals("warning")) {
      return String.valueOf(warning);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<Disk> getDisksList() {
    return disks;
  }

  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(DisksScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DisksScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DisksScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DisksScopedList();
  }

  public static class Builder {
    private List<Disk> disks;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(DisksScopedList other) {
      if (other == DisksScopedList.getDefaultInstance()) return this;
      if (other.getDisksList() != null) {
        this.disks = other.disks;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(DisksScopedList source) {
      this.disks = source.disks;
      this.warning = source.warning;
    }

    public List<Disk> getDisksList() {
      return disks;
    }

    public Builder addAllDisks(List<Disk> disks) {
      if (this.disks == null) {
        this.disks = new ArrayList<>(disks.size());
      }
      this.disks.addAll(disks);
      return this;
    }

    public Builder addDisks(Disk disks) {
      this.disks.add(disks);
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public DisksScopedList build() {

      return new DisksScopedList(disks, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllDisks(this.disks);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DisksScopedList{" + "disks=" + disks + ", " + "warning=" + warning + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DisksScopedList) {
      DisksScopedList that = (DisksScopedList) o;
      return Objects.equals(this.disks, that.getDisksList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(disks, warning);
  }
}
