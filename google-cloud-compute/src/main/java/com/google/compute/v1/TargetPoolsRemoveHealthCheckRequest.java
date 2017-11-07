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
public final class TargetPoolsRemoveHealthCheckRequest implements ApiMessage {
  private final List<HealthCheckReference> healthChecks;

  private TargetPoolsRemoveHealthCheckRequest() {
    this.healthChecks = null;
  }


  private TargetPoolsRemoveHealthCheckRequest(
      List<HealthCheckReference> healthChecks
      ) {
    this.healthChecks = healthChecks;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("healthChecks") && healthChecks != null) {
      fieldMap.put("healthChecks", Collections.singletonList(String.valueOf(healthChecks)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public List<HealthCheckReference> getHealthChecks() {
    return healthChecks;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetPoolsRemoveHealthCheckRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetPoolsRemoveHealthCheckRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetPoolsRemoveHealthCheckRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetPoolsRemoveHealthCheckRequest();
  }

  public static class Builder {
    private List<HealthCheckReference> healthChecks;

    Builder() {}

    public Builder mergeFrom(TargetPoolsRemoveHealthCheckRequest other) {
      if (other == TargetPoolsRemoveHealthCheckRequest.getDefaultInstance()) return this;
      if (other.getHealthChecks() != null) {
        this.healthChecks = other.healthChecks;
      }
      return this;
    }

    Builder(TargetPoolsRemoveHealthCheckRequest source) {
      this.healthChecks = source.healthChecks;
    }

    public List<HealthCheckReference> getHealthChecks() {
      return healthChecks;
    }

    public Builder setHealthChecks(List<HealthCheckReference> healthChecks) {
      this.healthChecks = healthChecks;
      return this;
    }


    public TargetPoolsRemoveHealthCheckRequest build() {
      return new TargetPoolsRemoveHealthCheckRequest(
        healthChecks
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setHealthChecks(this.healthChecks);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetPoolsRemoveHealthCheckRequest{"
        + "healthChecks=" + healthChecks
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetPoolsRemoveHealthCheckRequest) {
      TargetPoolsRemoveHealthCheckRequest that = (TargetPoolsRemoveHealthCheckRequest) o;
      return
          Objects.equals(this.healthChecks, that.getHealthChecks())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      healthChecks
    );
  }
}
