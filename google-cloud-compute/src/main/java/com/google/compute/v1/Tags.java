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
public final class Tags implements ApiMessage {
  private final String fingerprint;
  private final List<String> items;
  private final Map<String, String> pathParams;

  private Tags() {
    this.fingerprint = null;
    this.items = null;
    this.pathParams = ImmutableMap.of();
  }


  private Tags(
      String fingerprint,
      List<String> items
      ) {
    this.fingerprint = fingerprint;
    this.items = items;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("fingerprint") && fingerprint != null) {
      fieldMap.put("fingerprint", Collections.singletonList(String.valueOf(fingerprint)));
    }
    if (fieldNames.contains("items") && items != null) {
      fieldMap.put("items", Collections.singletonList(String.valueOf(items)));
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

  public String getFingerprint() {
    return fingerprint;
  }

  public List<String> getItems() {
    return items;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Tags prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Tags getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Tags DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Tags();
  }

  public static class Builder {
    private String fingerprint;
    private List<String> items;

    Builder() {}

    public Builder mergeFrom(Tags other) {
      if (other == Tags.getDefaultInstance()) return this;
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getItems() != null) {
        this.items = other.items;
      }
      return this;
    }

    Builder(Tags source) {
      this.fingerprint = source.fingerprint;
      this.items = source.items;
    }

    public String getFingerprint() {
      return fingerprint;
    }

    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    public List<String> getItems() {
      return items;
    }

    public Builder addAllItems(List<String> items) {
      this.items = items;
      return this;
    }


    public Tags build() {

      return new Tags(
        fingerprint,
        items
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.addAllItems(this.items);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Tags{"
        + "fingerprint=" + fingerprint + ", "
        + "items=" + items
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Tags) {
      Tags that = (Tags) o;
      return
          Objects.equals(this.fingerprint, that.getFingerprint()) &&
          Objects.equals(this.items, that.getItems())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      fingerprint,
      items
    );
  }
}
