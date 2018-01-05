/*
 * Copyright 2017 Google LLC
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
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class TargetPoolName implements ResourceName {
  private final String project;
  private final String region;
  private final String targetPool;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/regions/{region}/targetPools/{targetPool}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private TargetPoolName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
    targetPool = Preconditions.checkNotNull(builder.getTargetPool());
  }

  public static TargetPoolName of(
      String project,
      String region,
      String targetPool
      ) {
    return newBuilder()
    .setProject(project)
    .setRegion(region)
    .setTargetPool(targetPool)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }

  public String getTargetPool() {
    return targetPool;
  }


  public static TargetPoolName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "TargetPoolName.parse: formattedString not in valid format");
    return of(
      matchMap.get("project"),
      matchMap.get("region"),
      matchMap.get("targetPool")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return TargetPoolNameType.instance();
  }

  public static class Builder {
    private String project;
    private String region;
    private String targetPool;

    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }
    public String getTargetPool() {
      return targetPool;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }
    public Builder setTargetPool(String targetPool) {
      this.targetPool = targetPool;
      return this;
    }

    private Builder() {}

    public Builder (TargetPoolName targetPoolName) {
      project = targetPoolName.project;
      region = targetPoolName.region;
      targetPool = targetPoolName.targetPool;
    }

    public TargetPoolName build() {
      return new TargetPoolName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "region", region,
        "targetPool", targetPool
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetPoolName) {
      TargetPoolName that = (TargetPoolName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.targetPool, that.getTargetPool())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      region,
      targetPool
    );
  }
}
