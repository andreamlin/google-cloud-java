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
public final class ZoneOperationsOperationName implements ResourceName {
  private final String operation;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("{project}/zones/{zone}/operations/{operation}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ZoneOperationsOperationName(Builder builder) {
    operation = Preconditions.checkNotNull(builder.getOperation());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static ZoneOperationsOperationName create(
      String operation,
      String project,
      String zone
      ) {
    return newBuilder()
    .setOperation(operation)
    .setProject(project)
    .setZone(zone)
      .build();
  }

  public String getOperation() {
    return operation;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }


  public static ZoneOperationsOperationName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ZoneOperationsOperationName.parse: formattedString not in valid format");
    return create(
      matchMap.get("operation"),
      matchMap.get("project"),
      matchMap.get("zone")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return ZoneOperationsOperationNameType.instance();
  }

  public static class Builder {
    private String operation;
    private String project;
    private String zone;

    public String getOperation() {
      return operation;
    }
    public String getProject() {
      return project;
    }
    public String getZone() {
      return zone;
    }

    public Builder setOperation(String operation) {
      this.operation = operation;
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

    public Builder (ZoneOperationsOperationName zoneOperationsOperationName) {
      operation = zoneOperationsOperationName.operation;
      project = zoneOperationsOperationName.project;
      zone = zoneOperationsOperationName.zone;
    }

    public ZoneOperationsOperationName build() {
      return new ZoneOperationsOperationName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "operation", operation,
        "project", project,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ZoneOperationsOperationName) {
      ZoneOperationsOperationName that = (ZoneOperationsOperationName) o;
      return
          Objects.equals(this.operation, that.getOperation()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      operation,
      project,
      zone
    );
  }
}
