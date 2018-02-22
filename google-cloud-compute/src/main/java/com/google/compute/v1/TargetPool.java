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
public final class TargetPool implements ApiMessage {
  private final String backupPool;
  private final String creationTimestamp;
  private final String description;
  private final Float failoverRatio;
  private final List<String> healthChecks;
  private final String id;
  private final List<String> instances;
  private final String kind;
  private final String name;
  private final String region;
  private final String selfLink;
  private final String sessionAffinity;
  private final Map<String, String> pathParams;

  private TargetPool() {
    this.backupPool = null;
    this.creationTimestamp = null;
    this.description = null;
    this.failoverRatio = null;
    this.healthChecks = null;
    this.id = null;
    this.instances = null;
    this.kind = null;
    this.name = null;
    this.region = null;
    this.selfLink = null;
    this.sessionAffinity = null;
    this.pathParams = ImmutableMap.of();
  }


  private TargetPool(
      String backupPool,
      String creationTimestamp,
      String description,
      Float failoverRatio,
      List<String> healthChecks,
      String id,
      List<String> instances,
      String kind,
      String name,
      String region,
      String selfLink,
      String sessionAffinity
      ) {
    this.backupPool = backupPool;
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.failoverRatio = failoverRatio;
    this.healthChecks = healthChecks;
    this.id = id;
    this.instances = instances;
    this.kind = kind;
    this.name = name;
    this.region = region;
    this.selfLink = selfLink;
    this.sessionAffinity = sessionAffinity;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("backupPool") && backupPool != null) {
      fieldMap.put("backupPool", Collections.singletonList(String.valueOf(backupPool)));
    }
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("failoverRatio") && failoverRatio != null) {
      fieldMap.put("failoverRatio", Collections.singletonList(String.valueOf(failoverRatio)));
    }
    if (fieldNames.contains("healthChecks") && healthChecks != null) {
      fieldMap.put("healthChecks", Collections.singletonList(String.valueOf(healthChecks)));
    }
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("instances") && instances != null) {
      fieldMap.put("instances", Collections.singletonList(String.valueOf(instances)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("sessionAffinity") && sessionAffinity != null) {
      fieldMap.put("sessionAffinity", Collections.singletonList(String.valueOf(sessionAffinity)));
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

  public String getBackupPool() {
    return backupPool;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDescription() {
    return description;
  }

  public Float getFailoverRatio() {
    return failoverRatio;
  }

  public List<String> getHealthChecks() {
    return healthChecks;
  }

  public String getId() {
    return id;
  }

  public List<String> getInstances() {
    return instances;
  }

  public String getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public String getRegion() {
    return region;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public String getSessionAffinity() {
    return sessionAffinity;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetPool prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetPool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetPool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetPool();
  }

  public static class Builder {
    private String backupPool;
    private String creationTimestamp;
    private String description;
    private Float failoverRatio;
    private List<String> healthChecks;
    private String id;
    private List<String> instances;
    private String kind;
    private String name;
    private String region;
    private String selfLink;
    private String sessionAffinity;

    Builder() {}

    public Builder mergeFrom(TargetPool other) {
      if (other == TargetPool.getDefaultInstance()) return this;
      if (other.getBackupPool() != null) {
        this.backupPool = other.backupPool;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getFailoverRatio() != null) {
        this.failoverRatio = other.failoverRatio;
      }
      if (other.getHealthChecks() != null) {
        this.healthChecks = other.healthChecks;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getInstances() != null) {
        this.instances = other.instances;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getSessionAffinity() != null) {
        this.sessionAffinity = other.sessionAffinity;
      }
      return this;
    }

    Builder(TargetPool source) {
      this.backupPool = source.backupPool;
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.failoverRatio = source.failoverRatio;
      this.healthChecks = source.healthChecks;
      this.id = source.id;
      this.instances = source.instances;
      this.kind = source.kind;
      this.name = source.name;
      this.region = source.region;
      this.selfLink = source.selfLink;
      this.sessionAffinity = source.sessionAffinity;
    }

    public String getBackupPool() {
      return backupPool;
    }

    public Builder setBackupPool(String backupPool) {
      this.backupPool = backupPool;
      return this;
    }

    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Float getFailoverRatio() {
      return failoverRatio;
    }

    public Builder setFailoverRatio(Float failoverRatio) {
      this.failoverRatio = failoverRatio;
      return this;
    }

    public List<String> getHealthChecks() {
      return healthChecks;
    }

    public Builder addAllHealthChecks(List<String> healthChecks) {
      this.healthChecks = healthChecks;
      return this;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public List<String> getInstances() {
      return instances;
    }

    public Builder addAllInstances(List<String> instances) {
      this.instances = instances;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public String getRegion() {
      return region;
    }

    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public String getSessionAffinity() {
      return sessionAffinity;
    }

    public Builder setSessionAffinity(String sessionAffinity) {
      this.sessionAffinity = sessionAffinity;
      return this;
    }


    public TargetPool build() {











      return new TargetPool(
        backupPool,
        creationTimestamp,
        description,
        failoverRatio,
        healthChecks,
        id,
        instances,
        kind,
        name,
        region,
        selfLink,
        sessionAffinity
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setBackupPool(this.backupPool);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setFailoverRatio(this.failoverRatio);
      newBuilder.addAllHealthChecks(this.healthChecks);
      newBuilder.setId(this.id);
      newBuilder.addAllInstances(this.instances);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setRegion(this.region);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setSessionAffinity(this.sessionAffinity);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetPool{"
        + "backupPool=" + backupPool + ", "
        + "creationTimestamp=" + creationTimestamp + ", "
        + "description=" + description + ", "
        + "failoverRatio=" + failoverRatio + ", "
        + "healthChecks=" + healthChecks + ", "
        + "id=" + id + ", "
        + "instances=" + instances + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "region=" + region + ", "
        + "selfLink=" + selfLink + ", "
        + "sessionAffinity=" + sessionAffinity
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetPool) {
      TargetPool that = (TargetPool) o;
      return
          Objects.equals(this.backupPool, that.getBackupPool()) &&
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.failoverRatio, that.getFailoverRatio()) &&
          Objects.equals(this.healthChecks, that.getHealthChecks()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.instances, that.getInstances()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.sessionAffinity, that.getSessionAffinity())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      backupPool,
      creationTimestamp,
      description,
      failoverRatio,
      healthChecks,
      id,
      instances,
      kind,
      name,
      region,
      selfLink,
      sessionAffinity
    );
  }
}
