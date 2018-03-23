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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
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
public final class NetworkInterface implements ApiMessage {
  private final List<AccessConfig> accessConfigs;
  private final String kind;
  private final String name;
  private final String network;
  private final String networkIP;
  private final String subnetwork;

  private NetworkInterface() {
    this.accessConfigs = null;
    this.kind = null;
    this.name = null;
    this.network = null;
    this.networkIP = null;
    this.subnetwork = null;
  }


  private NetworkInterface(
      List<AccessConfig> accessConfigs,
      String kind,
      String name,
      String network,
      String networkIP,
      String subnetwork
      ) {
    this.accessConfigs = accessConfigs;
    this.kind = kind;
    this.name = name;
    this.network = network;
    this.networkIP = networkIP;
    this.subnetwork = subnetwork;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("accessConfigs") && accessConfigs != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (AccessConfig item : accessConfigs) {
        stringList.add(item.toString());
      }
      fieldMap.put("accessConfigs", stringList.build());
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
    if (fieldNames.contains("networkIP") && networkIP != null) {
      fieldMap.put("networkIP", Collections.singletonList(String.valueOf(networkIP)));
    }
    if (fieldNames.contains("subnetwork") && subnetwork != null) {
      fieldMap.put("subnetwork", Collections.singletonList(String.valueOf(subnetwork)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("accessConfigs")) {
      return String.valueOf(accessConfigs);
    }
    if (fieldName.equals("kind")) {
      return String.valueOf(kind);
    }
    if (fieldName.equals("name")) {
      return String.valueOf(name);
    }
    if (fieldName.equals("network")) {
      return String.valueOf(network);
    }
    if (fieldName.equals("networkIP")) {
      return String.valueOf(networkIP);
    }
    if (fieldName.equals("subnetwork")) {
      return String.valueOf(subnetwork);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<AccessConfig> getAccessConfigsList() {
    return accessConfigs;
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

  public String getNetworkIP() {
    return networkIP;
  }

  public String getSubnetwork() {
    return subnetwork;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(NetworkInterface prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static NetworkInterface getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final NetworkInterface DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NetworkInterface();
  }

  public static class Builder {
    private List<AccessConfig> accessConfigs;
    private String kind;
    private String name;
    private String network;
    private String networkIP;
    private String subnetwork;

    Builder() {}

    public Builder mergeFrom(NetworkInterface other) {
      if (other == NetworkInterface.getDefaultInstance()) return this;
      if (other.getAccessConfigsList() != null) {
        this.accessConfigs = other.accessConfigs;
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
      if (other.getNetworkIP() != null) {
        this.networkIP = other.networkIP;
      }
      if (other.getSubnetwork() != null) {
        this.subnetwork = other.subnetwork;
      }
      return this;
    }

    Builder(NetworkInterface source) {
      this.accessConfigs = source.accessConfigs;
      this.kind = source.kind;
      this.name = source.name;
      this.network = source.network;
      this.networkIP = source.networkIP;
      this.subnetwork = source.subnetwork;
    }

    public List<AccessConfig> getAccessConfigsList() {
      return accessConfigs;
    }

    public Builder addAllAccessConfigs(List<AccessConfig> accessConfigs) {
      if (this.accessConfigs == null) {
        this.accessConfigs = new ArrayList<>(accessConfigs.size());
      }
      this.accessConfigs.addAll(accessConfigs);
      return this;
    }

    public Builder addAccessConfigs(AccessConfig accessConfigs) {
      this.accessConfigs.add(accessConfigs);
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

    public String getNetworkIP() {
      return networkIP;
    }

    public Builder setNetworkIP(String networkIP) {
      this.networkIP = networkIP;
      return this;
    }

    public String getSubnetwork() {
      return subnetwork;
    }

    public Builder setSubnetwork(String subnetwork) {
      this.subnetwork = subnetwork;
      return this;
    }


    public NetworkInterface build() {





      return new NetworkInterface(
        accessConfigs,
        kind,
        name,
        network,
        networkIP,
        subnetwork
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllAccessConfigs(this.accessConfigs);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNetwork(this.network);
      newBuilder.setNetworkIP(this.networkIP);
      newBuilder.setSubnetwork(this.subnetwork);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "NetworkInterface{"
        + "accessConfigs=" + accessConfigs + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "network=" + network + ", "
        + "networkIP=" + networkIP + ", "
        + "subnetwork=" + subnetwork
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworkInterface) {
      NetworkInterface that = (NetworkInterface) o;
      return
          Objects.equals(this.accessConfigs, that.getAccessConfigsList()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.network, that.getNetwork()) &&
          Objects.equals(this.networkIP, that.getNetworkIP()) &&
          Objects.equals(this.subnetwork, that.getSubnetwork())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      accessConfigs,
      kind,
      name,
      network,
      networkIP,
      subnetwork
    );
  }
}
