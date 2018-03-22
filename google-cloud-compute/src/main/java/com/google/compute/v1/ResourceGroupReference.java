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
public final class ResourceGroupReference implements ApiMessage {
  private final String group;

  private ResourceGroupReference() {
    this.group = null;
  }


  private ResourceGroupReference(
      String group
      ) {
    this.group = group;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("group") && group != null) {
      fieldMap.put("group", Collections.singletonList(String.valueOf(group)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("group")) {
      return String.valueOf(group);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getGroup() {
    return group;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ResourceGroupReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ResourceGroupReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final ResourceGroupReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ResourceGroupReference();
  }

  public static class Builder {
    private String group;

    Builder() {}

    public Builder mergeFrom(ResourceGroupReference other) {
      if (other == ResourceGroupReference.getDefaultInstance()) return this;
      if (other.getGroup() != null) {
        this.group = other.group;
      }
      return this;
    }

    Builder(ResourceGroupReference source) {
      this.group = source.group;
    }

    public String getGroup() {
      return group;
    }

    public Builder setGroup(String group) {
      this.group = group;
      return this;
    }


    public ResourceGroupReference build() {
      return new ResourceGroupReference(
        group
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setGroup(this.group);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ResourceGroupReference{"
        + "group=" + group
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResourceGroupReference) {
      ResourceGroupReference that = (ResourceGroupReference) o;
      return
          Objects.equals(this.group, that.getGroup())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      group
    );
  }
}
