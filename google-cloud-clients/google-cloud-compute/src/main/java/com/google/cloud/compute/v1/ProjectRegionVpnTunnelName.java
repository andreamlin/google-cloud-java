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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class ProjectRegionVpnTunnelName implements ResourceName {
  private final String project;
  private final String region;
  private final String vpnTunnel;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("{project}/regions/{region}/vpnTunnels/{vpnTunnel}");

  public static final String SERVICE_ADDRESS = "https://www.googleapis.com/compute/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectRegionVpnTunnelName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
    vpnTunnel = Preconditions.checkNotNull(builder.getVpnTunnel());
  }

  public static ProjectRegionVpnTunnelName of(String project, String region, String vpnTunnel) {
    return newBuilder().setProject(project).setRegion(region).setVpnTunnel(vpnTunnel).build();
  }

  public static String format(String project, String region, String vpnTunnel) {
    return of(project, region, vpnTunnel).toString();
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
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("region", region);
          fieldMapBuilder.put("vpnTunnel", vpnTunnel);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  public static ResourceNameFactory<ProjectRegionVpnTunnelName> newFactory() {
    return new ResourceNameFactory<ProjectRegionVpnTunnelName>() {
      public ProjectRegionVpnTunnelName parse(String formattedString) {
        return ProjectRegionVpnTunnelName.parse(formattedString);
      }
    };
  }

  public static ProjectRegionVpnTunnelName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath, "ProjectRegionVpnTunnelName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("region"), matchMap.get("vpnTunnel"));
  }

  public static boolean isParsableFrom(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    return PATH_TEMPLATE.matches(resourcePath);
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

    public Builder(ProjectRegionVpnTunnelName projectRegionVpnTunnelName) {
      project = projectRegionVpnTunnelName.project;
      region = projectRegionVpnTunnelName.region;
      vpnTunnel = projectRegionVpnTunnelName.vpnTunnel;
    }

    public ProjectRegionVpnTunnelName build() {
      return new ProjectRegionVpnTunnelName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "region", region,
        "vpnTunnel", vpnTunnel);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectRegionVpnTunnelName) {
      ProjectRegionVpnTunnelName that = (ProjectRegionVpnTunnelName) o;
      return Objects.equals(this.project, that.getProject())
          && Objects.equals(this.region, that.getRegion())
          && Objects.equals(this.vpnTunnel, that.getVpnTunnel());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, region, vpnTunnel);
  }
}
