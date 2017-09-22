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
public final class DiskTypeName implements ResourceName {
  private final String diskType;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("{project}/zones/{zone}/diskTypes/{diskType}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DiskTypeName(Builder builder) {
    diskType = Preconditions.checkNotNull(builder.getDiskType());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static DiskTypeName create(
      String diskType,
      String project,
      String zone
      ) {
    return newBuilder()
    .setDiskType(diskType)
    .setProject(project)
    .setZone(zone)
      .build();
  }

  public String getDiskType() {
    return diskType;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }


  public static DiskTypeName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DiskTypeName.parse: formattedString not in valid format");
    return create(
      matchMap.get("diskType"),
      matchMap.get("project"),
      matchMap.get("zone")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return DiskTypeNameType.instance();
  }

  public static class Builder {
    private String diskType;
    private String project;
    private String zone;

    public String getDiskType() {
      return diskType;
    }
    public String getProject() {
      return project;
    }
    public String getZone() {
      return zone;
    }

    public Builder setDiskType(String diskType) {
      this.diskType = diskType;
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

    public Builder (DiskTypeName diskTypeName) {
      diskType = diskTypeName.diskType;
      project = diskTypeName.project;
      zone = diskTypeName.zone;
    }

    public DiskTypeName build() {
      return new DiskTypeName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "diskType", diskType,
        "project", project,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DiskTypeName) {
      DiskTypeName that = (DiskTypeName) o;
      return
          Objects.equals(this.diskType, that.getDiskType()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      diskType,
      project,
      zone
    );
  }
}
