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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
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
public final class TargetInstanceName implements ResourceName {
  private final String project;
  private final String targetInstance;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/zones/{zone}/targetInstances/{targetInstance}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private TargetInstanceName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    targetInstance = Preconditions.checkNotNull(builder.getTargetInstance());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static TargetInstanceName of(
      String project,
      String targetInstance,
      String zone
      ) {
    return newBuilder()
    .setProject(project)
    .setTargetInstance(targetInstance)
    .setZone(zone)
      .build();
  }

  public static String format(
      String project,
      String targetInstance,
      String zone
      ) {
    return of(
        project,
        targetInstance,
        zone
        )
        .toString();
  }

  public String getProject() {
    return project;
  }

  public String getTargetInstance() {
    return targetInstance;
  }

  public String getZone() {
    return zone;
  }


  public static TargetInstanceName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "TargetInstanceName.parse: formattedString not in valid format");
    return of(
      matchMap.get("project"),
      matchMap.get("targetInstance"),
      matchMap.get("zone")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return TargetInstanceNameType.instance();
  }

  public static class Builder {
    private String project;
    private String targetInstance;
    private String zone;

    public String getProject() {
      return project;
    }
    public String getTargetInstance() {
      return targetInstance;
    }
    public String getZone() {
      return zone;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setTargetInstance(String targetInstance) {
      this.targetInstance = targetInstance;
      return this;
    }
    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    private Builder() {}

    public Builder (TargetInstanceName targetInstanceName) {
      project = targetInstanceName.project;
      targetInstance = targetInstanceName.targetInstance;
      zone = targetInstanceName.zone;
    }

    public TargetInstanceName build() {
      return new TargetInstanceName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "targetInstance", targetInstance,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetInstanceName) {
      TargetInstanceName that = (TargetInstanceName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.targetInstance, that.getTargetInstance()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      targetInstance,
      zone
    );
  }
}
