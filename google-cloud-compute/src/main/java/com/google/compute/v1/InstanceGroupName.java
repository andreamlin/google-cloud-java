/*
 * Copyright 2017, Google LLC All rights reserved.
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
public final class InstanceGroupName implements ResourceName {
  private final String instanceGroup;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/zones/{zone}/instanceGroups/{instanceGroup}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private InstanceGroupName(Builder builder) {
    instanceGroup = Preconditions.checkNotNull(builder.getInstanceGroup());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static InstanceGroupName of(
      String instanceGroup,
      String project,
      String zone
      ) {
    return newBuilder()
    .setInstanceGroup(instanceGroup)
    .setProject(project)
    .setZone(zone)
      .build();
  }

  public String getInstanceGroup() {
    return instanceGroup;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }


  public static InstanceGroupName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "InstanceGroupName.parse: formattedString not in valid format");
    return of(
      matchMap.get("instanceGroup"),
      matchMap.get("project"),
      matchMap.get("zone")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return InstanceGroupNameType.instance();
  }

  public static class Builder {
    private String instanceGroup;
    private String project;
    private String zone;

    public String getInstanceGroup() {
      return instanceGroup;
    }
    public String getProject() {
      return project;
    }
    public String getZone() {
      return zone;
    }

    public Builder setInstanceGroup(String instanceGroup) {
      this.instanceGroup = instanceGroup;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    private Builder() {}

    public Builder (InstanceGroupName instanceGroupName) {
      instanceGroup = instanceGroupName.instanceGroup;
      project = instanceGroupName.project;
      zone = instanceGroupName.zone;
    }

    public InstanceGroupName build() {
      return new InstanceGroupName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "instanceGroup", instanceGroup,
        "project", project,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupName) {
      InstanceGroupName that = (InstanceGroupName) o;
      return
          Objects.equals(this.instanceGroup, that.getInstanceGroup()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceGroup,
      project,
      zone
    );
  }
}
