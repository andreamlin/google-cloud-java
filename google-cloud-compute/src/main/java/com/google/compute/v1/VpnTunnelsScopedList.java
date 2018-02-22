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
public final class VpnTunnelsScopedList implements ApiMessage {
  private final List<VpnTunnel> vpnTunnels;
  private final Warning warning;
  private final Map<String, String> pathParams;

  private VpnTunnelsScopedList() {
    this.vpnTunnels = null;
    this.warning = null;
    this.pathParams = ImmutableMap.of();
  }


  private VpnTunnelsScopedList(
      List<VpnTunnel> vpnTunnels,
      Warning warning
      ) {
    this.vpnTunnels = vpnTunnels;
    this.warning = warning;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("vpnTunnels") && vpnTunnels != null) {
      fieldMap.put("vpnTunnels", vpnTunnels);
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
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

  public List<VpnTunnel> getVpnTunnels() {
    return vpnTunnels;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(VpnTunnelsScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static VpnTunnelsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final VpnTunnelsScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VpnTunnelsScopedList();
  }

  public static class Builder {
    private List<VpnTunnel> vpnTunnels;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(VpnTunnelsScopedList other) {
      if (other == VpnTunnelsScopedList.getDefaultInstance()) return this;
      if (other.getVpnTunnels() != null) {
        this.vpnTunnels = other.vpnTunnels;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(VpnTunnelsScopedList source) {
      this.vpnTunnels = source.vpnTunnels;
      this.warning = source.warning;
    }

    public List<VpnTunnel> getVpnTunnels() {
      return vpnTunnels;
    }

    public Builder addAllVpnTunnels(List<VpnTunnel> vpnTunnels) {
      this.vpnTunnels.addAll(vpnTunnels);
      return this;
    }

    public Builder addVpnTunnels(VpnTunnel vpnTunnels) {
      this.vpnTunnels.add(vpnTunnels);
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public VpnTunnelsScopedList build() {

      return new VpnTunnelsScopedList(
        vpnTunnels,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllVpnTunnels(this.vpnTunnels);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "VpnTunnelsScopedList{"
        + "vpnTunnels=" + vpnTunnels + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VpnTunnelsScopedList) {
      VpnTunnelsScopedList that = (VpnTunnelsScopedList) o;
      return
          Objects.equals(this.vpnTunnels, that.getVpnTunnels()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      vpnTunnels,
      warning
    );
  }
}
