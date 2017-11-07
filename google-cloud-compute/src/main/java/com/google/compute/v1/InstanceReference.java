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
public final class InstanceReference implements ApiMessage {
  private final String instance;

  private InstanceReference() {
    this.instance = null;
  }


  private InstanceReference(
      String instance
      ) {
    this.instance = instance;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instance") && instance != null) {
      fieldMap.put("instance", Collections.singletonList(String.valueOf(instance)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public String getInstance() {
    return instance;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceReference();
  }

  public static class Builder {
    private String instance;

    Builder() {}

    public Builder mergeFrom(InstanceReference other) {
      if (other == InstanceReference.getDefaultInstance()) return this;
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      return this;
    }

    Builder(InstanceReference source) {
      this.instance = source.instance;
    }

    public String getInstance() {
      return instance;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }


    public InstanceReference build() {
      return new InstanceReference(
        instance
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setInstance(this.instance);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceReference{"
        + "instance=" + instance
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceReference) {
      InstanceReference that = (InstanceReference) o;
      return
          Objects.equals(this.instance, that.getInstance())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instance
    );
  }
}
