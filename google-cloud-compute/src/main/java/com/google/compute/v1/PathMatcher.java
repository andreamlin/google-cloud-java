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
public final class PathMatcher implements ApiMessage {
  private final String defaultService;
  private final String description;
  private final String name;
  private final List<PathRule> pathRules;
  private final Map<String, String> pathParams;

  private PathMatcher() {
    this.defaultService = null;
    this.description = null;
    this.name = null;
    this.pathRules = null;
    this.pathParams = ImmutableMap.of();
  }


  private PathMatcher(
      String defaultService,
      String description,
      String name,
      List<PathRule> pathRules
      ) {
    this.defaultService = defaultService;
    this.description = description;
    this.name = name;
    this.pathRules = pathRules;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("defaultService") && defaultService != null) {
      fieldMap.put("defaultService", Collections.singletonList(String.valueOf(defaultService)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("pathRules") && pathRules != null) {
      fieldMap.put("pathRules", Collections.singletonList(String.valueOf(pathRules)));
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

  public String getDefaultService() {
    return defaultService;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public List<PathRule> getPathRules() {
    return pathRules;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(PathMatcher prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PathMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final PathMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PathMatcher();
  }

  public static class Builder {
    private String defaultService;
    private String description;
    private String name;
    private List<PathRule> pathRules;

    Builder() {}

    public Builder mergeFrom(PathMatcher other) {
      if (other == PathMatcher.getDefaultInstance()) return this;
      if (other.getDefaultService() != null) {
        this.defaultService = other.defaultService;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getPathRules() != null) {
        this.pathRules = other.pathRules;
      }
      return this;
    }

    Builder(PathMatcher source) {
      this.defaultService = source.defaultService;
      this.description = source.description;
      this.name = source.name;
      this.pathRules = source.pathRules;
    }

    public String getDefaultService() {
      return defaultService;
    }

    public Builder setDefaultService(String defaultService) {
      this.defaultService = defaultService;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public List<PathRule> getPathRules() {
      return pathRules;
    }

    public Builder addAllPathRules(List<PathRule> pathRules) {
      this.pathRules = pathRules;
      return this;
    }


    public PathMatcher build() {



      return new PathMatcher(
        defaultService,
        description,
        name,
        pathRules
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDefaultService(this.defaultService);
      newBuilder.setDescription(this.description);
      newBuilder.setName(this.name);
      newBuilder.addAllPathRules(this.pathRules);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PathMatcher{"
        + "defaultService=" + defaultService + ", "
        + "description=" + description + ", "
        + "name=" + name + ", "
        + "pathRules=" + pathRules
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PathMatcher) {
      PathMatcher that = (PathMatcher) o;
      return
          Objects.equals(this.defaultService, that.getDefaultService()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.pathRules, that.getPathRules())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      defaultService,
      description,
      name,
      pathRules
    );
  }
}
