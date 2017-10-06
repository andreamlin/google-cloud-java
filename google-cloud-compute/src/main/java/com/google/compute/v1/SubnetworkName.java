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
public final class SubnetworkName implements ResourceName {
  private final String project;
  private final String region;
  private final String subnetwork;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/regions/{region}/subnetworks/{subnetwork}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SubnetworkName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
    subnetwork = Preconditions.checkNotNull(builder.getSubnetwork());
  }

  public static SubnetworkName create(
      String project,
      String region,
      String subnetwork
      ) {
    return newBuilder()
    .setProject(project)
    .setRegion(region)
    .setSubnetwork(subnetwork)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }

  public String getSubnetwork() {
    return subnetwork;
  }


  public static SubnetworkName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SubnetworkName.parse: formattedString not in valid format");
    return create(
      matchMap.get("project"),
      matchMap.get("region"),
      matchMap.get("subnetwork")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return SubnetworkNameType.instance();
  }

  public static class Builder {
    private String project;
    private String region;
    private String subnetwork;

    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }
    public String getSubnetwork() {
      return subnetwork;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }
    public Builder setSubnetwork(String subnetwork) {
      this.subnetwork = subnetwork;
      return this;
    }

    private Builder() {}

    public Builder (SubnetworkName subnetworkName) {
      project = subnetworkName.project;
      region = subnetworkName.region;
      subnetwork = subnetworkName.subnetwork;
    }

    public SubnetworkName build() {
      return new SubnetworkName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "region", region,
        "subnetwork", subnetwork
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SubnetworkName) {
      SubnetworkName that = (SubnetworkName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.subnetwork, that.getSubnetwork())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      region,
      subnetwork
    );
  }
}
