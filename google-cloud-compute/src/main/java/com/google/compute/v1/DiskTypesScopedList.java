/*
 * Copyright 2017, Google LLC All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
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
public final class DiskTypesScopedList implements ApiMessage {
  private final List<DiskType> diskTypes;
  private final Warning warning;

  private DiskTypesScopedList() {
    this.diskTypes = null;
    this.warning = null;
  }


  private DiskTypesScopedList(
      List<DiskType> diskTypes,
      Warning warning
      ) {
    this.diskTypes = diskTypes;
    this.warning = warning;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("diskTypes") && diskTypes != null) {
      fieldMap.put("diskTypes", Collections.singletonList(String.valueOf(diskTypes)));
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public List<DiskType> getDiskTypes() {
    return diskTypes;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(DiskTypesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DiskTypesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final DiskTypesScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DiskTypesScopedList();
  }

  public static class Builder {
    private List<DiskType> diskTypes;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(DiskTypesScopedList other) {
      if (other == DiskTypesScopedList.getDefaultInstance()) return this;
      if (other.getDiskTypes() != null) {
        this.diskTypes = other.diskTypes;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(DiskTypesScopedList source) {
      this.diskTypes = source.diskTypes;
      this.warning = source.warning;
    }

    public List<DiskType> getDiskTypes() {
      return diskTypes;
    }

    public Builder setDiskTypes(List<DiskType> diskTypes) {
      this.diskTypes = diskTypes;
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public DiskTypesScopedList build() {

      return new DiskTypesScopedList(
        diskTypes,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDiskTypes(this.diskTypes);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DiskTypesScopedList{"
        + "diskTypes=" + diskTypes + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DiskTypesScopedList) {
      DiskTypesScopedList that = (DiskTypesScopedList) o;
      return
          Objects.equals(this.diskTypes, that.getDiskTypes()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      diskTypes,
      warning
    );
  }
}
