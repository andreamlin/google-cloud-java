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
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class CacheInvalidationRule implements ApiMessage {
  private final String host;
  private final String path;
  private final Map<String, String> pathParams;

  private CacheInvalidationRule() {
    this.host = null;
    this.path = null;
    this.pathParams = ImmutableMap.of();
  }


  private CacheInvalidationRule(
      String host,
      String path
      ) {
    this.host = host;
    this.path = path;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("host") && host != null) {
      fieldMap.put("host", Collections.singletonList(String.valueOf(host)));
    }
    if (fieldNames.contains("path") && path != null) {
      fieldMap.put("path", Collections.singletonList(String.valueOf(path)));
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

  public String getHost() {
    return host;
  }

  public String getPath() {
    return path;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(CacheInvalidationRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static CacheInvalidationRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final CacheInvalidationRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CacheInvalidationRule();
  }

  public static class Builder {
    private String host;
    private String path;

    Builder() {}

    public Builder mergeFrom(CacheInvalidationRule other) {
      if (other == CacheInvalidationRule.getDefaultInstance()) return this;
      if (other.getHost() != null) {
        this.host = other.host;
      }
      if (other.getPath() != null) {
        this.path = other.path;
      }
      return this;
    }

    Builder(CacheInvalidationRule source) {
      this.host = source.host;
      this.path = source.path;
    }

    public String getHost() {
      return host;
    }

    public Builder setHost(String host) {
      this.host = host;
      return this;
    }

    public String getPath() {
      return path;
    }

    public Builder setPath(String path) {
      this.path = path;
      return this;
    }


    public CacheInvalidationRule build() {

      return new CacheInvalidationRule(
        host,
        path
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setHost(this.host);
      newBuilder.setPath(this.path);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "CacheInvalidationRule{"
        + "host=" + host + ", "
        + "path=" + path
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CacheInvalidationRule) {
      CacheInvalidationRule that = (CacheInvalidationRule) o;
      return
          Objects.equals(this.host, that.getHost()) &&
          Objects.equals(this.path, that.getPath())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      host,
      path
    );
  }
}
