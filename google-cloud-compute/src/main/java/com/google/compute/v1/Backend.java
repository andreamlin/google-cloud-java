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
public final class Backend implements ApiMessage {
  private final String balancingMode;
  private final Float capacityScaler;
  private final String description;
  private final String group;
  private final Integer maxConnections;
  private final Integer maxConnectionsPerInstance;
  private final Integer maxRate;
  private final Float maxRatePerInstance;
  private final Float maxUtilization;
  private final Map<String, String> pathParams;

  private Backend() {
    this.balancingMode = null;
    this.capacityScaler = null;
    this.description = null;
    this.group = null;
    this.maxConnections = null;
    this.maxConnectionsPerInstance = null;
    this.maxRate = null;
    this.maxRatePerInstance = null;
    this.maxUtilization = null;
    this.pathParams = ImmutableMap.of();
  }


  private Backend(
      String balancingMode,
      Float capacityScaler,
      String description,
      String group,
      Integer maxConnections,
      Integer maxConnectionsPerInstance,
      Integer maxRate,
      Float maxRatePerInstance,
      Float maxUtilization
      ) {
    this.balancingMode = balancingMode;
    this.capacityScaler = capacityScaler;
    this.description = description;
    this.group = group;
    this.maxConnections = maxConnections;
    this.maxConnectionsPerInstance = maxConnectionsPerInstance;
    this.maxRate = maxRate;
    this.maxRatePerInstance = maxRatePerInstance;
    this.maxUtilization = maxUtilization;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("balancingMode") && balancingMode != null) {
      fieldMap.put("balancingMode", Collections.singletonList(String.valueOf(balancingMode)));
    }
    if (fieldNames.contains("capacityScaler") && capacityScaler != null) {
      fieldMap.put("capacityScaler", Collections.singletonList(String.valueOf(capacityScaler)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("group") && group != null) {
      fieldMap.put("group", Collections.singletonList(String.valueOf(group)));
    }
    if (fieldNames.contains("maxConnections") && maxConnections != null) {
      fieldMap.put("maxConnections", Collections.singletonList(String.valueOf(maxConnections)));
    }
    if (fieldNames.contains("maxConnectionsPerInstance") && maxConnectionsPerInstance != null) {
      fieldMap.put("maxConnectionsPerInstance", Collections.singletonList(String.valueOf(maxConnectionsPerInstance)));
    }
    if (fieldNames.contains("maxRate") && maxRate != null) {
      fieldMap.put("maxRate", Collections.singletonList(String.valueOf(maxRate)));
    }
    if (fieldNames.contains("maxRatePerInstance") && maxRatePerInstance != null) {
      fieldMap.put("maxRatePerInstance", Collections.singletonList(String.valueOf(maxRatePerInstance)));
    }
    if (fieldNames.contains("maxUtilization") && maxUtilization != null) {
      fieldMap.put("maxUtilization", Collections.singletonList(String.valueOf(maxUtilization)));
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

  public String getBalancingMode() {
    return balancingMode;
  }

  public Float getCapacityScaler() {
    return capacityScaler;
  }

  public String getDescription() {
    return description;
  }

  public String getGroup() {
    return group;
  }

  public Integer getMaxConnections() {
    return maxConnections;
  }

  public Integer getMaxConnectionsPerInstance() {
    return maxConnectionsPerInstance;
  }

  public Integer getMaxRate() {
    return maxRate;
  }

  public Float getMaxRatePerInstance() {
    return maxRatePerInstance;
  }

  public Float getMaxUtilization() {
    return maxUtilization;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Backend prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Backend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Backend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Backend();
  }

  public static class Builder {
    private String balancingMode;
    private Float capacityScaler;
    private String description;
    private String group;
    private Integer maxConnections;
    private Integer maxConnectionsPerInstance;
    private Integer maxRate;
    private Float maxRatePerInstance;
    private Float maxUtilization;

    Builder() {}

    public Builder mergeFrom(Backend other) {
      if (other == Backend.getDefaultInstance()) return this;
      if (other.getBalancingMode() != null) {
        this.balancingMode = other.balancingMode;
      }
      if (other.getCapacityScaler() != null) {
        this.capacityScaler = other.capacityScaler;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getGroup() != null) {
        this.group = other.group;
      }
      if (other.getMaxConnections() != null) {
        this.maxConnections = other.maxConnections;
      }
      if (other.getMaxConnectionsPerInstance() != null) {
        this.maxConnectionsPerInstance = other.maxConnectionsPerInstance;
      }
      if (other.getMaxRate() != null) {
        this.maxRate = other.maxRate;
      }
      if (other.getMaxRatePerInstance() != null) {
        this.maxRatePerInstance = other.maxRatePerInstance;
      }
      if (other.getMaxUtilization() != null) {
        this.maxUtilization = other.maxUtilization;
      }
      return this;
    }

    Builder(Backend source) {
      this.balancingMode = source.balancingMode;
      this.capacityScaler = source.capacityScaler;
      this.description = source.description;
      this.group = source.group;
      this.maxConnections = source.maxConnections;
      this.maxConnectionsPerInstance = source.maxConnectionsPerInstance;
      this.maxRate = source.maxRate;
      this.maxRatePerInstance = source.maxRatePerInstance;
      this.maxUtilization = source.maxUtilization;
    }

    public String getBalancingMode() {
      return balancingMode;
    }

    public Builder setBalancingMode(String balancingMode) {
      this.balancingMode = balancingMode;
      return this;
    }

    public Float getCapacityScaler() {
      return capacityScaler;
    }

    public Builder setCapacityScaler(Float capacityScaler) {
      this.capacityScaler = capacityScaler;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public String getGroup() {
      return group;
    }

    public Builder setGroup(String group) {
      this.group = group;
      return this;
    }

    public Integer getMaxConnections() {
      return maxConnections;
    }

    public Builder setMaxConnections(Integer maxConnections) {
      this.maxConnections = maxConnections;
      return this;
    }

    public Integer getMaxConnectionsPerInstance() {
      return maxConnectionsPerInstance;
    }

    public Builder setMaxConnectionsPerInstance(Integer maxConnectionsPerInstance) {
      this.maxConnectionsPerInstance = maxConnectionsPerInstance;
      return this;
    }

    public Integer getMaxRate() {
      return maxRate;
    }

    public Builder setMaxRate(Integer maxRate) {
      this.maxRate = maxRate;
      return this;
    }

    public Float getMaxRatePerInstance() {
      return maxRatePerInstance;
    }

    public Builder setMaxRatePerInstance(Float maxRatePerInstance) {
      this.maxRatePerInstance = maxRatePerInstance;
      return this;
    }

    public Float getMaxUtilization() {
      return maxUtilization;
    }

    public Builder setMaxUtilization(Float maxUtilization) {
      this.maxUtilization = maxUtilization;
      return this;
    }


    public Backend build() {








      return new Backend(
        balancingMode,
        capacityScaler,
        description,
        group,
        maxConnections,
        maxConnectionsPerInstance,
        maxRate,
        maxRatePerInstance,
        maxUtilization
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setBalancingMode(this.balancingMode);
      newBuilder.setCapacityScaler(this.capacityScaler);
      newBuilder.setDescription(this.description);
      newBuilder.setGroup(this.group);
      newBuilder.setMaxConnections(this.maxConnections);
      newBuilder.setMaxConnectionsPerInstance(this.maxConnectionsPerInstance);
      newBuilder.setMaxRate(this.maxRate);
      newBuilder.setMaxRatePerInstance(this.maxRatePerInstance);
      newBuilder.setMaxUtilization(this.maxUtilization);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Backend{"
        + "balancingMode=" + balancingMode + ", "
        + "capacityScaler=" + capacityScaler + ", "
        + "description=" + description + ", "
        + "group=" + group + ", "
        + "maxConnections=" + maxConnections + ", "
        + "maxConnectionsPerInstance=" + maxConnectionsPerInstance + ", "
        + "maxRate=" + maxRate + ", "
        + "maxRatePerInstance=" + maxRatePerInstance + ", "
        + "maxUtilization=" + maxUtilization
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Backend) {
      Backend that = (Backend) o;
      return
          Objects.equals(this.balancingMode, that.getBalancingMode()) &&
          Objects.equals(this.capacityScaler, that.getCapacityScaler()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.group, that.getGroup()) &&
          Objects.equals(this.maxConnections, that.getMaxConnections()) &&
          Objects.equals(this.maxConnectionsPerInstance, that.getMaxConnectionsPerInstance()) &&
          Objects.equals(this.maxRate, that.getMaxRate()) &&
          Objects.equals(this.maxRatePerInstance, that.getMaxRatePerInstance()) &&
          Objects.equals(this.maxUtilization, that.getMaxUtilization())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      balancingMode,
      capacityScaler,
      description,
      group,
      maxConnections,
      maxConnectionsPerInstance,
      maxRate,
      maxRatePerInstance,
      maxUtilization
    );
  }
}
