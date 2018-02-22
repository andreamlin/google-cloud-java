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
public final class HostRule implements ApiMessage {
  private final String description;
  private final List<String> hosts;
  private final String pathMatcher;
  private final Map<String, String> pathParams;

  private HostRule() {
    this.description = null;
    this.hosts = null;
    this.pathMatcher = null;
    this.pathParams = ImmutableMap.of();
  }


  private HostRule(
      String description,
      List<String> hosts,
      String pathMatcher
      ) {
    this.description = description;
    this.hosts = hosts;
    this.pathMatcher = pathMatcher;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("hosts") && hosts != null) {
      fieldMap.put("hosts", hosts);
    }
    if (fieldNames.contains("pathMatcher") && pathMatcher != null) {
      fieldMap.put("pathMatcher", Collections.singletonList(String.valueOf(pathMatcher)));
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

  public String getDescription() {
    return description;
  }

  public List<String> getHosts() {
    return hosts;
  }

  public String getPathMatcher() {
    return pathMatcher;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(HostRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static HostRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final HostRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HostRule();
  }

  public static class Builder {
    private String description;
    private List<String> hosts;
    private String pathMatcher;

    Builder() {}

    public Builder mergeFrom(HostRule other) {
      if (other == HostRule.getDefaultInstance()) return this;
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getHosts() != null) {
        this.hosts = other.hosts;
      }
      if (other.getPathMatcher() != null) {
        this.pathMatcher = other.pathMatcher;
      }
      return this;
    }

    Builder(HostRule source) {
      this.description = source.description;
      this.hosts = source.hosts;
      this.pathMatcher = source.pathMatcher;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public List<String> getHosts() {
      return hosts;
    }

    public Builder addAllHosts(List<String> hosts) {
      this.hosts.addAll(hosts);
      return this;
    }

    public Builder addHosts(String hosts) {
      this.hosts.add(hosts);
      return this;
    }

    public String getPathMatcher() {
      return pathMatcher;
    }

    public Builder setPathMatcher(String pathMatcher) {
      this.pathMatcher = pathMatcher;
      return this;
    }


    public HostRule build() {


      return new HostRule(
        description,
        hosts,
        pathMatcher
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDescription(this.description);
      newBuilder.addAllHosts(this.hosts);
      newBuilder.setPathMatcher(this.pathMatcher);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "HostRule{"
        + "description=" + description + ", "
        + "hosts=" + hosts + ", "
        + "pathMatcher=" + pathMatcher
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HostRule) {
      HostRule that = (HostRule) o;
      return
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.hosts, that.getHosts()) &&
          Objects.equals(this.pathMatcher, that.getPathMatcher())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      description,
      hosts,
      pathMatcher
    );
  }
}
