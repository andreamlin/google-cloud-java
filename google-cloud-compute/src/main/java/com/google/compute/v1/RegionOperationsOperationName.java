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
public final class RegionOperationsOperationName implements ResourceName {
  private final String operation;
  private final String project;
  private final String region;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/regions/{region}/operations/{operation}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RegionOperationsOperationName(Builder builder) {
    operation = Preconditions.checkNotNull(builder.getOperation());
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
  }

  public static RegionOperationsOperationName of(
      String operation,
      String project,
      String region
      ) {
    return newBuilder()
    .setOperation(operation)
    .setProject(project)
    .setRegion(region)
      .build();
  }

  public static String format(
      String operation,
      String project,
      String region
      ) {
    return of(
        operation,
        project,
        region
        )
        .toString();
  }

  public String getOperation() {
    return operation;
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }


  public static RegionOperationsOperationName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RegionOperationsOperationName.parse: formattedString not in valid format");
    return of(
      matchMap.get("operation"),
      matchMap.get("project"),
      matchMap.get("region")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return RegionOperationsOperationNameType.instance();
  }

  public static class Builder {
    private String operation;
    private String project;
    private String region;

    public String getOperation() {
      return operation;
    }
    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }

    public Builder setOperation(String operation) {
      this.operation = operation;
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

    public Builder (RegionOperationsOperationName regionOperationsOperationName) {
      operation = regionOperationsOperationName.operation;
      project = regionOperationsOperationName.project;
      region = regionOperationsOperationName.region;
    }

    public RegionOperationsOperationName build() {
      return new RegionOperationsOperationName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "operation", operation,
        "project", project,
        "region", region
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionOperationsOperationName) {
      RegionOperationsOperationName that = (RegionOperationsOperationName) o;
      return
          Objects.equals(this.operation, that.getOperation()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      operation,
      project,
      region
    );
  }
}
