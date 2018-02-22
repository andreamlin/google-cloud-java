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
public final class Route implements ApiMessage {
  private final String creationTimestamp;
  private final String description;
  private final String destRange;
  private final String id;
  private final String kind;
  private final String name;
  private final String network;
  private final String nextHopGateway;
  private final String nextHopInstance;
  private final String nextHopIp;
  private final String nextHopNetwork;
  private final String nextHopVpnTunnel;
  private final Integer priority;
  private final String selfLink;
  private final List<String> tags;
  private final List<Warnings> warnings;
  private final Map<String, String> pathParams;

  private Route() {
    this.creationTimestamp = null;
    this.description = null;
    this.destRange = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.network = null;
    this.nextHopGateway = null;
    this.nextHopInstance = null;
    this.nextHopIp = null;
    this.nextHopNetwork = null;
    this.nextHopVpnTunnel = null;
    this.priority = null;
    this.selfLink = null;
    this.tags = null;
    this.warnings = null;
    this.pathParams = ImmutableMap.of();
  }


  private Route(
      String creationTimestamp,
      String description,
      String destRange,
      String id,
      String kind,
      String name,
      String network,
      String nextHopGateway,
      String nextHopInstance,
      String nextHopIp,
      String nextHopNetwork,
      String nextHopVpnTunnel,
      Integer priority,
      String selfLink,
      List<String> tags,
      List<Warnings> warnings
      ) {
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.destRange = destRange;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.network = network;
    this.nextHopGateway = nextHopGateway;
    this.nextHopInstance = nextHopInstance;
    this.nextHopIp = nextHopIp;
    this.nextHopNetwork = nextHopNetwork;
    this.nextHopVpnTunnel = nextHopVpnTunnel;
    this.priority = priority;
    this.selfLink = selfLink;
    this.tags = tags;
    this.warnings = warnings;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
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
    if (fieldNames.contains("destRange") && destRange != null) {
      fieldMap.put("destRange", Collections.singletonList(String.valueOf(destRange)));
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
    if (fieldNames.contains("nextHopGateway") && nextHopGateway != null) {
      fieldMap.put("nextHopGateway", Collections.singletonList(String.valueOf(nextHopGateway)));
    }
    if (fieldNames.contains("nextHopInstance") && nextHopInstance != null) {
      fieldMap.put("nextHopInstance", Collections.singletonList(String.valueOf(nextHopInstance)));
    }
    if (fieldNames.contains("nextHopIp") && nextHopIp != null) {
      fieldMap.put("nextHopIp", Collections.singletonList(String.valueOf(nextHopIp)));
    }
    if (fieldNames.contains("nextHopNetwork") && nextHopNetwork != null) {
      fieldMap.put("nextHopNetwork", Collections.singletonList(String.valueOf(nextHopNetwork)));
    }
    if (fieldNames.contains("nextHopVpnTunnel") && nextHopVpnTunnel != null) {
      fieldMap.put("nextHopVpnTunnel", Collections.singletonList(String.valueOf(nextHopVpnTunnel)));
    }
    if (fieldNames.contains("priority") && priority != null) {
      fieldMap.put("priority", Collections.singletonList(String.valueOf(priority)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("tags") && tags != null) {
      fieldMap.put("tags", Collections.singletonList(String.valueOf(tags)));
    }
    if (fieldNames.contains("warnings") && warnings != null) {
      fieldMap.put("warnings", Collections.singletonList(String.valueOf(warnings)));
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

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDescription() {
    return description;
  }

  public String getDestRange() {
    return destRange;
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

  public String getNextHopGateway() {
    return nextHopGateway;
  }

  public String getNextHopInstance() {
    return nextHopInstance;
  }

  public String getNextHopIp() {
    return nextHopIp;
  }

  public String getNextHopNetwork() {
    return nextHopNetwork;
  }

  public String getNextHopVpnTunnel() {
    return nextHopVpnTunnel;
  }

  public Integer getPriority() {
    return priority;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public List<String> getTags() {
    return tags;
  }

  public List<Warnings> getWarnings() {
    return warnings;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Route prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Route getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Route DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Route();
  }

  public static class Builder {
    private String creationTimestamp;
    private String description;
    private String destRange;
    private String id;
    private String kind;
    private String name;
    private String network;
    private String nextHopGateway;
    private String nextHopInstance;
    private String nextHopIp;
    private String nextHopNetwork;
    private String nextHopVpnTunnel;
    private Integer priority;
    private String selfLink;
    private List<String> tags;
    private List<Warnings> warnings;

    Builder() {}

    public Builder mergeFrom(Route other) {
      if (other == Route.getDefaultInstance()) return this;
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getDestRange() != null) {
        this.destRange = other.destRange;
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
      if (other.getNextHopGateway() != null) {
        this.nextHopGateway = other.nextHopGateway;
      }
      if (other.getNextHopInstance() != null) {
        this.nextHopInstance = other.nextHopInstance;
      }
      if (other.getNextHopIp() != null) {
        this.nextHopIp = other.nextHopIp;
      }
      if (other.getNextHopNetwork() != null) {
        this.nextHopNetwork = other.nextHopNetwork;
      }
      if (other.getNextHopVpnTunnel() != null) {
        this.nextHopVpnTunnel = other.nextHopVpnTunnel;
      }
      if (other.getPriority() != null) {
        this.priority = other.priority;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getTags() != null) {
        this.tags = other.tags;
      }
      if (other.getWarnings() != null) {
        this.warnings = other.warnings;
      }
      return this;
    }

    Builder(Route source) {
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.destRange = source.destRange;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.network = source.network;
      this.nextHopGateway = source.nextHopGateway;
      this.nextHopInstance = source.nextHopInstance;
      this.nextHopIp = source.nextHopIp;
      this.nextHopNetwork = source.nextHopNetwork;
      this.nextHopVpnTunnel = source.nextHopVpnTunnel;
      this.priority = source.priority;
      this.selfLink = source.selfLink;
      this.tags = source.tags;
      this.warnings = source.warnings;
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

    public String getDestRange() {
      return destRange;
    }

    public Builder setDestRange(String destRange) {
      this.destRange = destRange;
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

    public String getNextHopGateway() {
      return nextHopGateway;
    }

    public Builder setNextHopGateway(String nextHopGateway) {
      this.nextHopGateway = nextHopGateway;
      return this;
    }

    public String getNextHopInstance() {
      return nextHopInstance;
    }

    public Builder setNextHopInstance(String nextHopInstance) {
      this.nextHopInstance = nextHopInstance;
      return this;
    }

    public String getNextHopIp() {
      return nextHopIp;
    }

    public Builder setNextHopIp(String nextHopIp) {
      this.nextHopIp = nextHopIp;
      return this;
    }

    public String getNextHopNetwork() {
      return nextHopNetwork;
    }

    public Builder setNextHopNetwork(String nextHopNetwork) {
      this.nextHopNetwork = nextHopNetwork;
      return this;
    }

    public String getNextHopVpnTunnel() {
      return nextHopVpnTunnel;
    }

    public Builder setNextHopVpnTunnel(String nextHopVpnTunnel) {
      this.nextHopVpnTunnel = nextHopVpnTunnel;
      return this;
    }

    public Integer getPriority() {
      return priority;
    }

    public Builder setPriority(Integer priority) {
      this.priority = priority;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public List<String> getTags() {
      return tags;
    }

    public Builder addAllTags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public List<Warnings> getWarnings() {
      return warnings;
    }

    public Builder addAllWarnings(List<Warnings> warnings) {
      this.warnings = warnings;
      return this;
    }


    public Route build() {















      return new Route(
        creationTimestamp,
        description,
        destRange,
        id,
        kind,
        name,
        network,
        nextHopGateway,
        nextHopInstance,
        nextHopIp,
        nextHopNetwork,
        nextHopVpnTunnel,
        priority,
        selfLink,
        tags,
        warnings
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setDestRange(this.destRange);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNetwork(this.network);
      newBuilder.setNextHopGateway(this.nextHopGateway);
      newBuilder.setNextHopInstance(this.nextHopInstance);
      newBuilder.setNextHopIp(this.nextHopIp);
      newBuilder.setNextHopNetwork(this.nextHopNetwork);
      newBuilder.setNextHopVpnTunnel(this.nextHopVpnTunnel);
      newBuilder.setPriority(this.priority);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.addAllTags(this.tags);
      newBuilder.addAllWarnings(this.warnings);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Route{"
        + "creationTimestamp=" + creationTimestamp + ", "
        + "description=" + description + ", "
        + "destRange=" + destRange + ", "
        + "id=" + id + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "network=" + network + ", "
        + "nextHopGateway=" + nextHopGateway + ", "
        + "nextHopInstance=" + nextHopInstance + ", "
        + "nextHopIp=" + nextHopIp + ", "
        + "nextHopNetwork=" + nextHopNetwork + ", "
        + "nextHopVpnTunnel=" + nextHopVpnTunnel + ", "
        + "priority=" + priority + ", "
        + "selfLink=" + selfLink + ", "
        + "tags=" + tags + ", "
        + "warnings=" + warnings
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Route) {
      Route that = (Route) o;
      return
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.destRange, that.getDestRange()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.network, that.getNetwork()) &&
          Objects.equals(this.nextHopGateway, that.getNextHopGateway()) &&
          Objects.equals(this.nextHopInstance, that.getNextHopInstance()) &&
          Objects.equals(this.nextHopIp, that.getNextHopIp()) &&
          Objects.equals(this.nextHopNetwork, that.getNextHopNetwork()) &&
          Objects.equals(this.nextHopVpnTunnel, that.getNextHopVpnTunnel()) &&
          Objects.equals(this.priority, that.getPriority()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.tags, that.getTags()) &&
          Objects.equals(this.warnings, that.getWarnings())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      creationTimestamp,
      description,
      destRange,
      id,
      kind,
      name,
      network,
      nextHopGateway,
      nextHopInstance,
      nextHopIp,
      nextHopNetwork,
      nextHopVpnTunnel,
      priority,
      selfLink,
      tags,
      warnings
    );
  }
}
