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
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class RouterStatus implements ApiMessage {
  private final List<Route> bestRoutes;
  private final List<RouterStatusBgpPeerStatus> bgpPeerStatus;
  private final String network;

  private RouterStatus() {
    this.bestRoutes = null;
    this.bgpPeerStatus = null;
    this.network = null;
  }


  private RouterStatus(
      List<Route> bestRoutes,
      List<RouterStatusBgpPeerStatus> bgpPeerStatus,
      String network
      ) {
    this.bestRoutes = bestRoutes;
    this.bgpPeerStatus = bgpPeerStatus;
    this.network = network;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("bestRoutes") && bestRoutes != null) {
      List<String> stringList = new LinkedList<>();
      for (Route item : bestRoutes) {
        stringList.add(item.toString());
      }
      fieldMap.put("bestRoutes", stringList);
    }
    if (fieldNames.contains("bgpPeerStatus") && bgpPeerStatus != null) {
      List<String> stringList = new LinkedList<>();
      for (RouterStatusBgpPeerStatus item : bgpPeerStatus) {
        stringList.add(item.toString());
      }
      fieldMap.put("bgpPeerStatus", stringList);
    }
    if (fieldNames.contains("network") && network != null) {
      fieldMap.put("network", Collections.singletonList(String.valueOf(network)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("bestRoutes")) {
      return String.valueOf(bestRoutes);
    }
    if (fieldName.equals("bgpPeerStatus")) {
      return String.valueOf(bgpPeerStatus);
    }
    if (fieldName.equals("network")) {
      return String.valueOf(network);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<Route> getBestRoutes() {
    return bestRoutes;
  }

  public List<RouterStatusBgpPeerStatus> getBgpPeerStatus() {
    return bgpPeerStatus;
  }

  public String getNetwork() {
    return network;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RouterStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RouterStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RouterStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RouterStatus();
  }

  public static class Builder {
    private List<Route> bestRoutes;
    private List<RouterStatusBgpPeerStatus> bgpPeerStatus;
    private String network;

    Builder() {}

    public Builder mergeFrom(RouterStatus other) {
      if (other == RouterStatus.getDefaultInstance()) return this;
      if (other.getBestRoutes() != null) {
        this.bestRoutes = other.bestRoutes;
      }
      if (other.getBgpPeerStatus() != null) {
        this.bgpPeerStatus = other.bgpPeerStatus;
      }
      if (other.getNetwork() != null) {
        this.network = other.network;
      }
      return this;
    }

    Builder(RouterStatus source) {
      this.bestRoutes = source.bestRoutes;
      this.bgpPeerStatus = source.bgpPeerStatus;
      this.network = source.network;
    }

    public List<Route> getBestRoutes() {
      return bestRoutes;
    }

    public Builder addAllBestRoutes(List<Route> bestRoutes) {
      if (this.bestRoutes == null) {
        this.bestRoutes = new LinkedList<>();
      }
      this.bestRoutes.addAll(bestRoutes);
      return this;
    }

    public Builder addBestRoutes(Route bestRoutes) {
      this.bestRoutes.add(bestRoutes);
      return this;
    }

    public List<RouterStatusBgpPeerStatus> getBgpPeerStatus() {
      return bgpPeerStatus;
    }

    public Builder addAllBgpPeerStatus(List<RouterStatusBgpPeerStatus> bgpPeerStatus) {
      if (this.bgpPeerStatus == null) {
        this.bgpPeerStatus = new LinkedList<>();
      }
      this.bgpPeerStatus.addAll(bgpPeerStatus);
      return this;
    }

    public Builder addBgpPeerStatus(RouterStatusBgpPeerStatus bgpPeerStatus) {
      this.bgpPeerStatus.add(bgpPeerStatus);
      return this;
    }

    public String getNetwork() {
      return network;
    }

    public Builder setNetwork(String network) {
      this.network = network;
      return this;
    }


    public RouterStatus build() {


      return new RouterStatus(
        bestRoutes,
        bgpPeerStatus,
        network
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllBestRoutes(this.bestRoutes);
      newBuilder.addAllBgpPeerStatus(this.bgpPeerStatus);
      newBuilder.setNetwork(this.network);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RouterStatus{"
        + "bestRoutes=" + bestRoutes + ", "
        + "bgpPeerStatus=" + bgpPeerStatus + ", "
        + "network=" + network
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouterStatus) {
      RouterStatus that = (RouterStatus) o;
      return
          Objects.equals(this.bestRoutes, that.getBestRoutes()) &&
          Objects.equals(this.bgpPeerStatus, that.getBgpPeerStatus()) &&
          Objects.equals(this.network, that.getNetwork())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      bestRoutes,
      bgpPeerStatus,
      network
    );
  }
}
