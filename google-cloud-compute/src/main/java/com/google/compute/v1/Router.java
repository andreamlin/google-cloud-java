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
public final class Router implements ApiMessage {
  private final RouterBgp bgp;
  private final List<RouterBgpPeer> bgpPeers;
  private final String creationTimestamp;
  private final String description;
  private final String id;
  private final List<RouterInterface> interfaces;
  private final String kind;
  private final String name;
  private final String network;
  private final String region;
  private final String selfLink;

  private Router() {
    this.bgp = null;
    this.bgpPeers = null;
    this.creationTimestamp = null;
    this.description = null;
    this.id = null;
    this.interfaces = null;
    this.kind = null;
    this.name = null;
    this.network = null;
    this.region = null;
    this.selfLink = null;
  }


  private Router(
      RouterBgp bgp,
      List<RouterBgpPeer> bgpPeers,
      String creationTimestamp,
      String description,
      String id,
      List<RouterInterface> interfaces,
      String kind,
      String name,
      String network,
      String region,
      String selfLink
      ) {
    this.bgp = bgp;
    this.bgpPeers = bgpPeers;
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.id = id;
    this.interfaces = interfaces;
    this.kind = kind;
    this.name = name;
    this.network = network;
    this.region = region;
    this.selfLink = selfLink;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("bgp") && bgp != null) {
      fieldMap.put("bgp", Collections.singletonList(String.valueOf(bgp)));
    }
    if (fieldNames.contains("bgpPeers") && bgpPeers != null) {
      fieldMap.put("bgpPeers", Collections.singletonList(String.valueOf(bgpPeers)));
    }
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("interfaces") && interfaces != null) {
      fieldMap.put("interfaces", Collections.singletonList(String.valueOf(interfaces)));
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
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public RouterBgp getBgp() {
    return bgp;
  }

  public List<RouterBgpPeer> getBgpPeers() {
    return bgpPeers;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDescription() {
    return description;
  }

  public String getId() {
    return id;
  }

  public List<RouterInterface> getInterfaces() {
    return interfaces;
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


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Router prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Router getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Router DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Router();
  }

  public static class Builder {
    private RouterBgp bgp;
    private List<RouterBgpPeer> bgpPeers;
    private String creationTimestamp;
    private String description;
    private String id;
    private List<RouterInterface> interfaces;
    private String kind;
    private String name;
    private String network;
    private String region;
    private String selfLink;

    Builder() {}

    public Builder mergeFrom(Router other) {
      if (other == Router.getDefaultInstance()) return this;
      if (other.getBgp() != null) {
        this.bgp = other.bgp;
      }
      if (other.getBgpPeers() != null) {
        this.bgpPeers = other.bgpPeers;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getInterfaces() != null) {
        this.interfaces = other.interfaces;
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
      return this;
    }

    Builder(Router source) {
      this.bgp = source.bgp;
      this.bgpPeers = source.bgpPeers;
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.id = source.id;
      this.interfaces = source.interfaces;
      this.kind = source.kind;
      this.name = source.name;
      this.network = source.network;
      this.region = source.region;
      this.selfLink = source.selfLink;
    }

    public RouterBgp getBgp() {
      return bgp;
    }

    public Builder setBgp(RouterBgp bgp) {
      this.bgp = bgp;
      return this;
    }

    public List<RouterBgpPeer> getBgpPeers() {
      return bgpPeers;
    }

    public Builder setBgpPeers(List<RouterBgpPeer> bgpPeers) {
      this.bgpPeers = bgpPeers;
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

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public List<RouterInterface> getInterfaces() {
      return interfaces;
    }

    public Builder setInterfaces(List<RouterInterface> interfaces) {
      this.interfaces = interfaces;
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


    public Router build() {










      return new Router(
        bgp,
        bgpPeers,
        creationTimestamp,
        description,
        id,
        interfaces,
        kind,
        name,
        network,
        region,
        selfLink
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setBgp(this.bgp);
      newBuilder.setBgpPeers(this.bgpPeers);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setId(this.id);
      newBuilder.setInterfaces(this.interfaces);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNetwork(this.network);
      newBuilder.setRegion(this.region);
      newBuilder.setSelfLink(this.selfLink);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Router{"
        + "bgp=" + bgp + ", "
        + "bgpPeers=" + bgpPeers + ", "
        + "creationTimestamp=" + creationTimestamp + ", "
        + "description=" + description + ", "
        + "id=" + id + ", "
        + "interfaces=" + interfaces + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "network=" + network + ", "
        + "region=" + region + ", "
        + "selfLink=" + selfLink
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Router) {
      Router that = (Router) o;
      return
          Objects.equals(this.bgp, that.getBgp()) &&
          Objects.equals(this.bgpPeers, that.getBgpPeers()) &&
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.interfaces, that.getInterfaces()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.network, that.getNetwork()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.selfLink, that.getSelfLink())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      bgp,
      bgpPeers,
      creationTimestamp,
      description,
      id,
      interfaces,
      kind,
      name,
      network,
      region,
      selfLink
    );
  }
}
