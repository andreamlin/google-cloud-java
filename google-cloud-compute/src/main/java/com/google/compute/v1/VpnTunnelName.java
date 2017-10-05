/*
 * Copyright 2017, Google Inc. All rights reserved.
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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class VpnTunnelName implements ResourceName {
  private final String project;
  private final String region;
  private final String vpnTunnel;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("project/{project}/regions/{region}/vpnTunnels/{vpnTunnel}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private VpnTunnelName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
    vpnTunnel = Preconditions.checkNotNull(builder.getVpnTunnel());
  }

  public static VpnTunnelName create(
      String project,
      String region,
      String vpnTunnel
      ) {
    return newBuilder()
    .setProject(project)
    .setRegion(region)
    .setVpnTunnel(vpnTunnel)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }

  public String getVpnTunnel() {
    return vpnTunnel;
  }


  public static VpnTunnelName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "VpnTunnelName.parse: formattedString not in valid format");
    return create(
      matchMap.get("project"),
      matchMap.get("region"),
      matchMap.get("vpnTunnel")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return VpnTunnelNameType.instance();
  }

  public static class Builder {
    private String project;
    private String region;
    private String vpnTunnel;

    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }
    public String getVpnTunnel() {
      return vpnTunnel;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }
    public Builder setVpnTunnel(String vpnTunnel) {
      this.vpnTunnel = vpnTunnel;
      return this;
    }

    private Builder() {}

    public Builder (VpnTunnelName vpnTunnelName) {
      project = vpnTunnelName.project;
      region = vpnTunnelName.region;
      vpnTunnel = vpnTunnelName.vpnTunnel;
    }

    public VpnTunnelName build() {
      return new VpnTunnelName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "region", region,
        "vpnTunnel", vpnTunnel
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VpnTunnelName) {
      VpnTunnelName that = (VpnTunnelName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.vpnTunnel, that.getVpnTunnel())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      region,
      vpnTunnel
    );
  }
}
