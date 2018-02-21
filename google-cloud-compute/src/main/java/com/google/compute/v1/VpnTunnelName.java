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
import com.google.api.gax.httpjson.ResourceNamePath;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceNameType;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class VpnTunnelName implements ResourceNamePath {
  private final String project;
  private final String region;
  private final String vpnTunnel;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/regions/{region}/vpnTunnels/{vpnTunnel}");

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

  public static VpnTunnelName of(
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

  public static String format(
      String project,
      String region,
      String vpnTunnel
      ) {
    return of(
        project,
        region,
        vpnTunnel
        )
        .toString();
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


  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("project") && project != null) {
      fieldMap.put("project", Collections.singletonList(String.valueOf(project)));
    }
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    if (fieldNames.contains("vpnTunnel") && vpnTunnel != null) {
      fieldMap.put("vpnTunnel", Collections.singletonList(String.valueOf(vpnTunnel)));
    }
    return fieldMap;
  }

  public static VpnTunnelName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "VpnTunnelName.parse: formattedString not in valid format");
    return of(
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
