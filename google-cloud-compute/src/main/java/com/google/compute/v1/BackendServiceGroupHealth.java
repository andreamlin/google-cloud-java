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
public final class BackendServiceGroupHealth implements ApiMessage {
  private final List<HealthStatus> healthStatus;
  private final String kind;
  private final Map<String, String> pathParams;

  private BackendServiceGroupHealth() {
    this.healthStatus = null;
    this.kind = null;
    this.pathParams = ImmutableMap.of();
  }


  private BackendServiceGroupHealth(
      List<HealthStatus> healthStatus,
      String kind
      ) {
    this.healthStatus = healthStatus;
    this.kind = kind;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("healthStatus") && healthStatus != null) {
      fieldMap.put("healthStatus", Collections.singletonList(String.valueOf(healthStatus)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
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

  public List<HealthStatus> getHealthStatus() {
    return healthStatus;
  }

  public String getKind() {
    return kind;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BackendServiceGroupHealth prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static BackendServiceGroupHealth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final BackendServiceGroupHealth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BackendServiceGroupHealth();
  }

  public static class Builder {
    private List<HealthStatus> healthStatus;
    private String kind;

    Builder() {}

    public Builder mergeFrom(BackendServiceGroupHealth other) {
      if (other == BackendServiceGroupHealth.getDefaultInstance()) return this;
      if (other.getHealthStatus() != null) {
        this.healthStatus = other.healthStatus;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      return this;
    }

    Builder(BackendServiceGroupHealth source) {
      this.healthStatus = source.healthStatus;
      this.kind = source.kind;
    }

    public List<HealthStatus> getHealthStatus() {
      return healthStatus;
    }

    public Builder addAllHealthStatus(List<HealthStatus> healthStatus) {
      this.healthStatus = healthStatus;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }


    public BackendServiceGroupHealth build() {

      return new BackendServiceGroupHealth(
        healthStatus,
        kind
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllHealthStatus(this.healthStatus);
      newBuilder.setKind(this.kind);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "BackendServiceGroupHealth{"
        + "healthStatus=" + healthStatus + ", "
        + "kind=" + kind
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendServiceGroupHealth) {
      BackendServiceGroupHealth that = (BackendServiceGroupHealth) o;
      return
          Objects.equals(this.healthStatus, that.getHealthStatus()) &&
          Objects.equals(this.kind, that.getKind())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      healthStatus,
      kind
    );
  }
}
