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
import com.google.api.gax.httpjson.ResourceNamePath;
import com.google.api.resourcenames.ResourceName;
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
public final class GuestOsFeature implements ApiMessage {
  private final String type;

  private GuestOsFeature() {
    this.type = null;
  }


  private GuestOsFeature(
      String type
      ) {
    this.type = type;
  }

  @Override
  public ResourceNamePath resourceNamePath() {
    return null;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("type") && type != null) {
      fieldMap.put("type", Collections.singletonList(String.valueOf(type)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public String getType() {
    return type;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GuestOsFeature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static GuestOsFeature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final GuestOsFeature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GuestOsFeature();
  }

  public static class Builder {
    private String type;

    Builder() {}

    public Builder mergeFrom(GuestOsFeature other) {
      if (other == GuestOsFeature.getDefaultInstance()) return this;
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(GuestOsFeature source) {
      this.type = source.type;
    }

    public String getType() {
      return type;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }


    public GuestOsFeature build() {
      return new GuestOsFeature(
        type
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "GuestOsFeature{"
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GuestOsFeature) {
      GuestOsFeature that = (GuestOsFeature) o;
      return
          Objects.equals(this.type, that.getType())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type
    );
  }
}
