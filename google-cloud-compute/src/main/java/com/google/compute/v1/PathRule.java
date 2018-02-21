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
public final class PathRule implements ApiMessage {
  private final List<String> paths;
  private final String service;

  private PathRule() {
    this.paths = null;
    this.service = null;
  }


  private PathRule(
      List<String> paths,
      String service
      ) {
    this.paths = paths;
    this.service = service;
  }

  @Override
  public ResourceNamePath resourceNamePath() {
    return null;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("paths") && paths != null) {
      fieldMap.put("paths", Collections.singletonList(String.valueOf(paths)));
    }
    if (fieldNames.contains("service") && service != null) {
      fieldMap.put("service", Collections.singletonList(String.valueOf(service)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public List<String> getPaths() {
    return paths;
  }

  public String getService() {
    return service;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(PathRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PathRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final PathRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PathRule();
  }

  public static class Builder {
    private List<String> paths;
    private String service;

    Builder() {}

    public Builder mergeFrom(PathRule other) {
      if (other == PathRule.getDefaultInstance()) return this;
      if (other.getPaths() != null) {
        this.paths = other.paths;
      }
      if (other.getService() != null) {
        this.service = other.service;
      }
      return this;
    }

    Builder(PathRule source) {
      this.paths = source.paths;
      this.service = source.service;
    }

    public List<String> getPaths() {
      return paths;
    }

    public Builder addAllPaths(List<String> paths) {
      this.paths = paths;
      return this;
    }

    public String getService() {
      return service;
    }

    public Builder setService(String service) {
      this.service = service;
      return this;
    }


    public PathRule build() {

      return new PathRule(
        paths,
        service
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllPaths(this.paths);
      newBuilder.setService(this.service);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PathRule{"
        + "paths=" + paths + ", "
        + "service=" + service
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PathRule) {
      PathRule that = (PathRule) o;
      return
          Objects.equals(this.paths, that.getPaths()) &&
          Objects.equals(this.service, that.getService())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      paths,
      service
    );
  }
}
