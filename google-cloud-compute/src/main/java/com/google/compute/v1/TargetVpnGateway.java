/*
 * Copyright 2017 Google LLC
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
public final class TargetVpnGateway implements ApiMessage {
  private final String creationTimestamp;
  private final String description;
  private final List<String> forwardingRules;
  private final String id;
  private final String kind;
  private final String name;
  private final String network;
  private final String region;
  private final String selfLink;
  private final String status;
  private final List<String> tunnels;

  private TargetVpnGateway() {
    this.creationTimestamp = null;
    this.description = null;
    this.forwardingRules = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.network = null;
    this.region = null;
    this.selfLink = null;
    this.status = null;
    this.tunnels = null;
  }


  private TargetVpnGateway(
      String creationTimestamp,
      String description,
      List<String> forwardingRules,
      String id,
      String kind,
      String name,
      String network,
      String region,
      String selfLink,
      String status,
      List<String> tunnels
      ) {
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.forwardingRules = forwardingRules;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.network = network;
    this.region = region;
    this.selfLink = selfLink;
    this.status = status;
    this.tunnels = tunnels;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("forwardingRules") && forwardingRules != null) {
      fieldMap.put("forwardingRules", Collections.singletonList(String.valueOf(forwardingRules)));
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
    if (fieldNames.contains("network") && network != null) {
      fieldMap.put("network", Collections.singletonList(String.valueOf(network)));
    }
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("status") && status != null) {
      fieldMap.put("status", Collections.singletonList(String.valueOf(status)));
    }
    if (fieldNames.contains("tunnels") && tunnels != null) {
      fieldMap.put("tunnels", Collections.singletonList(String.valueOf(tunnels)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getForwardingRules() {
    return forwardingRules;
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

  public String getNetwork() {
    return network;
  }

  public String getRegion() {
    return region;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public String getStatus() {
    return status;
  }

  public List<String> getTunnels() {
    return tunnels;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetVpnGateway prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetVpnGateway getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetVpnGateway DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetVpnGateway();
  }

  public static class Builder {
    private String creationTimestamp;
    private String description;
    private List<String> forwardingRules;
    private String id;
    private String kind;
    private String name;
    private String network;
    private String region;
    private String selfLink;
    private String status;
    private List<String> tunnels;

    Builder() {}

    public Builder mergeFrom(TargetVpnGateway other) {
      if (other == TargetVpnGateway.getDefaultInstance()) return this;
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getForwardingRules() != null) {
        this.forwardingRules = other.forwardingRules;
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
      if (other.getNetwork() != null) {
        this.network = other.network;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getStatus() != null) {
        this.status = other.status;
      }
      if (other.getTunnels() != null) {
        this.tunnels = other.tunnels;
      }
      return this;
    }

    Builder(TargetVpnGateway source) {
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.forwardingRules = source.forwardingRules;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.network = source.network;
      this.region = source.region;
      this.selfLink = source.selfLink;
      this.status = source.status;
      this.tunnels = source.tunnels;
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

    public List<String> getForwardingRules() {
      return forwardingRules;
    }

    public Builder setForwardingRules(List<String> forwardingRules) {
      this.forwardingRules = forwardingRules;
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

    public String getNetwork() {
      return network;
    }

    public Builder setNetwork(String network) {
      this.network = network;
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

    public String getStatus() {
      return status;
    }

    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }

    public List<String> getTunnels() {
      return tunnels;
    }

    public Builder setTunnels(List<String> tunnels) {
      this.tunnels = tunnels;
      return this;
    }


    public TargetVpnGateway build() {










      return new TargetVpnGateway(
        creationTimestamp,
        description,
        forwardingRules,
        id,
        kind,
        name,
        network,
        region,
        selfLink,
        status,
        tunnels
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setForwardingRules(this.forwardingRules);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNetwork(this.network);
      newBuilder.setRegion(this.region);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setStatus(this.status);
      newBuilder.setTunnels(this.tunnels);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetVpnGateway{"
        + "creationTimestamp=" + creationTimestamp + ", "
        + "description=" + description + ", "
        + "forwardingRules=" + forwardingRules + ", "
        + "id=" + id + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "network=" + network + ", "
        + "region=" + region + ", "
        + "selfLink=" + selfLink + ", "
        + "status=" + status + ", "
        + "tunnels=" + tunnels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetVpnGateway) {
      TargetVpnGateway that = (TargetVpnGateway) o;
      return
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.forwardingRules, that.getForwardingRules()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.network, that.getNetwork()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.status, that.getStatus()) &&
          Objects.equals(this.tunnels, that.getTunnels())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      creationTimestamp,
      description,
      forwardingRules,
      id,
      kind,
      name,
      network,
      region,
      selfLink,
      status,
      tunnels
    );
  }
}
