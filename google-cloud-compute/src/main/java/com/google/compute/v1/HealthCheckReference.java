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
public final class HealthCheckReference implements ApiMessage {
  private final String healthCheck;
  private final Map<String, String> pathParams;

  private HealthCheckReference() {
    this.healthCheck = null;
    this.pathParams = ImmutableMap.of();
  }


  private HealthCheckReference(
      String healthCheck
      ) {
    this.healthCheck = healthCheck;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("healthCheck") && healthCheck != null) {
      fieldMap.put("healthCheck", Collections.singletonList(String.valueOf(healthCheck)));
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

  public String getHealthCheck() {
    return healthCheck;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(HealthCheckReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static HealthCheckReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final HealthCheckReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HealthCheckReference();
  }

  public static class Builder {
    private String healthCheck;

    Builder() {}

    public Builder mergeFrom(HealthCheckReference other) {
      if (other == HealthCheckReference.getDefaultInstance()) return this;
      if (other.getHealthCheck() != null) {
        this.healthCheck = other.healthCheck;
      }
      return this;
    }

    Builder(HealthCheckReference source) {
      this.healthCheck = source.healthCheck;
    }

    public String getHealthCheck() {
      return healthCheck;
    }

    public Builder setHealthCheck(String healthCheck) {
      this.healthCheck = healthCheck;
      return this;
    }


    public HealthCheckReference build() {
      return new HealthCheckReference(
        healthCheck
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setHealthCheck(this.healthCheck);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "HealthCheckReference{"
        + "healthCheck=" + healthCheck
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HealthCheckReference) {
      HealthCheckReference that = (HealthCheckReference) o;
      return
          Objects.equals(this.healthCheck, that.getHealthCheck())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      healthCheck
    );
  }
}
