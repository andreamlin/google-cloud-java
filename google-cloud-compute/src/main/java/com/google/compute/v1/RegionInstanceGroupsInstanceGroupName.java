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
public final class RegionInstanceGroupsInstanceGroupName implements ResourceName {
  private final String instanceGroup;
  private final String project;
  private final String region;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("{project}/regions/{region}/instanceGroups/{instanceGroup}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RegionInstanceGroupsInstanceGroupName(Builder builder) {
    instanceGroup = Preconditions.checkNotNull(builder.getInstanceGroup());
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
  }

  public static RegionInstanceGroupsInstanceGroupName create(
      String instanceGroup,
      String project,
      String region
      ) {
    return newBuilder()
    .setInstanceGroup(instanceGroup)
    .setProject(project)
    .setRegion(region)
      .build();
  }

  public String getInstanceGroup() {
    return instanceGroup;
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }


  public static RegionInstanceGroupsInstanceGroupName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RegionInstanceGroupsInstanceGroupName.parse: formattedString not in valid format");
    return create(
      matchMap.get("instanceGroup"),
      matchMap.get("project"),
      matchMap.get("region")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return RegionInstanceGroupsInstanceGroupNameType.instance();
  }

  public static class Builder {
    private String instanceGroup;
    private String project;
    private String region;

    public String getInstanceGroup() {
      return instanceGroup;
    }
    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }

    public Builder setInstanceGroup(String instanceGroup) {
      this.instanceGroup = instanceGroup;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    private Builder() {}

    public Builder (RegionInstanceGroupsInstanceGroupName regionInstanceGroupsInstanceGroupName) {
      instanceGroup = regionInstanceGroupsInstanceGroupName.instanceGroup;
      project = regionInstanceGroupsInstanceGroupName.project;
      region = regionInstanceGroupsInstanceGroupName.region;
    }

    public RegionInstanceGroupsInstanceGroupName build() {
      return new RegionInstanceGroupsInstanceGroupName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "instanceGroup", instanceGroup,
        "project", project,
        "region", region
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionInstanceGroupsInstanceGroupName) {
      RegionInstanceGroupsInstanceGroupName that = (RegionInstanceGroupsInstanceGroupName) o;
      return
          Objects.equals(this.instanceGroup, that.getInstanceGroup()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceGroup,
      project,
      region
    );
  }
}
