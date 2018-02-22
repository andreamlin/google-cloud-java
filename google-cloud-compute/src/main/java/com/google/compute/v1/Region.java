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
public final class Region implements ApiMessage {
  private final String creationTimestamp;
  private final DeprecationStatus deprecated;
  private final String description;
  private final String id;
  private final String kind;
  private final String name;
  private final List<Quota> quotas;
  private final String selfLink;
  private final String status;
  private final List<String> zones;
  private final Map<String, String> pathParams;

  private Region() {
    this.creationTimestamp = null;
    this.deprecated = null;
    this.description = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.quotas = null;
    this.selfLink = null;
    this.status = null;
    this.zones = null;
    this.pathParams = ImmutableMap.of();
  }


  private Region(
      String creationTimestamp,
      DeprecationStatus deprecated,
      String description,
      String id,
      String kind,
      String name,
      List<Quota> quotas,
      String selfLink,
      String status,
      List<String> zones
      ) {
    this.creationTimestamp = creationTimestamp;
    this.deprecated = deprecated;
    this.description = description;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.quotas = quotas;
    this.selfLink = selfLink;
    this.status = status;
    this.zones = zones;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("deprecated") && deprecated != null) {
      fieldMap.put("deprecated", Collections.singletonList(String.valueOf(deprecated)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("quotas") && quotas != null) {
      fieldMap.put("quotas", Collections.singletonList(String.valueOf(quotas)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("status") && status != null) {
      fieldMap.put("status", Collections.singletonList(String.valueOf(status)));
    }
    if (fieldNames.contains("zones") && zones != null) {
      fieldMap.put("zones", Collections.singletonList(String.valueOf(zones)));
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

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public DeprecationStatus getDeprecated() {
    return deprecated;
  }

  public String getDescription() {
    return description;
  }

  public String getId() {
    return id;
  }

  public String getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public List<Quota> getQuotas() {
    return quotas;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public String getStatus() {
    return status;
  }

  public List<String> getZones() {
    return zones;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Region prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Region getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Region DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Region();
  }

  public static class Builder {
    private String creationTimestamp;
    private DeprecationStatus deprecated;
    private String description;
    private String id;
    private String kind;
    private String name;
    private List<Quota> quotas;
    private String selfLink;
    private String status;
    private List<String> zones;

    Builder() {}

    public Builder mergeFrom(Region other) {
      if (other == Region.getDefaultInstance()) return this;
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDeprecated() != null) {
        this.deprecated = other.deprecated;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getQuotas() != null) {
        this.quotas = other.quotas;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getStatus() != null) {
        this.status = other.status;
      }
      if (other.getZones() != null) {
        this.zones = other.zones;
      }
      return this;
    }

    Builder(Region source) {
      this.creationTimestamp = source.creationTimestamp;
      this.deprecated = source.deprecated;
      this.description = source.description;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.quotas = source.quotas;
      this.selfLink = source.selfLink;
      this.status = source.status;
      this.zones = source.zones;
    }

    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    public DeprecationStatus getDeprecated() {
      return deprecated;
    }

    public Builder setDeprecated(DeprecationStatus deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
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

    public List<Quota> getQuotas() {
      return quotas;
    }

    public Builder addAllQuotas(List<Quota> quotas) {
      this.quotas = quotas;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public String getStatus() {
      return status;
    }

    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }

    public List<String> getZones() {
      return zones;
    }

    public Builder addAllZones(List<String> zones) {
      this.zones = zones;
      return this;
    }


    public Region build() {









      return new Region(
        creationTimestamp,
        deprecated,
        description,
        id,
        kind,
        name,
        quotas,
        selfLink,
        status,
        zones
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDeprecated(this.deprecated);
      newBuilder.setDescription(this.description);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.addAllQuotas(this.quotas);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setStatus(this.status);
      newBuilder.addAllZones(this.zones);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Region{"
        + "creationTimestamp=" + creationTimestamp + ", "
        + "deprecated=" + deprecated + ", "
        + "description=" + description + ", "
        + "id=" + id + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "quotas=" + quotas + ", "
        + "selfLink=" + selfLink + ", "
        + "status=" + status + ", "
        + "zones=" + zones
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Region) {
      Region that = (Region) o;
      return
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.deprecated, that.getDeprecated()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.quotas, that.getQuotas()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.status, that.getStatus()) &&
          Objects.equals(this.zones, that.getZones())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      creationTimestamp,
      deprecated,
      description,
      id,
      kind,
      name,
      quotas,
      selfLink,
      status,
      zones
    );
  }
}
