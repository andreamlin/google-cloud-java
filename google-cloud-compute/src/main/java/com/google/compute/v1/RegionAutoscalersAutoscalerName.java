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
public final class RegionAutoscalersAutoscalerName implements ResourceName {
  private final String autoscaler;
  private final String project;
  private final String region;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/regions/{region}/autoscalers/{autoscaler}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RegionAutoscalersAutoscalerName(Builder builder) {
    autoscaler = Preconditions.checkNotNull(builder.getAutoscaler());
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
  }

  public static RegionAutoscalersAutoscalerName of(
      String autoscaler,
      String project,
      String region
      ) {
    return newBuilder()
    .setAutoscaler(autoscaler)
    .setProject(project)
    .setRegion(region)
      .build();
  }

  public String getAutoscaler() {
    return autoscaler;
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }


  public static RegionAutoscalersAutoscalerName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RegionAutoscalersAutoscalerName.parse: formattedString not in valid format");
    return of(
      matchMap.get("autoscaler"),
      matchMap.get("project"),
      matchMap.get("region")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return RegionAutoscalersAutoscalerNameType.instance();
  }

  public static class Builder {
    private String autoscaler;
    private String project;
    private String region;

    public String getAutoscaler() {
      return autoscaler;
    }
    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }

    public Builder setAutoscaler(String autoscaler) {
      this.autoscaler = autoscaler;
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

    public Builder (RegionAutoscalersAutoscalerName regionAutoscalersAutoscalerName) {
      autoscaler = regionAutoscalersAutoscalerName.autoscaler;
      project = regionAutoscalersAutoscalerName.project;
      region = regionAutoscalersAutoscalerName.region;
    }

    public RegionAutoscalersAutoscalerName build() {
      return new RegionAutoscalersAutoscalerName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "autoscaler", autoscaler,
        "project", project,
        "region", region
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionAutoscalersAutoscalerName) {
      RegionAutoscalersAutoscalerName that = (RegionAutoscalersAutoscalerName) o;
      return
          Objects.equals(this.autoscaler, that.getAutoscaler()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      autoscaler,
      project,
      region
    );
  }
}
