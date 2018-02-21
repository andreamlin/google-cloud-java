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
import com.google.api.gax.httpjson.ResourceNamePath;
import com.google.api.pathtemplate.PathTemplate;
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
public final class MachineTypeName implements ResourceNamePath {
  private final String machineType;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/zones/{zone}/machineTypes/{machineType}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MachineTypeName(Builder builder) {
    machineType = Preconditions.checkNotNull(builder.getMachineType());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static MachineTypeName of(
      String machineType,
      String project,
      String zone
      ) {
    return newBuilder()
    .setMachineType(machineType)
    .setProject(project)
    .setZone(zone)
      .build();
  }

  public static String format(
      String machineType,
      String project,
      String zone
      ) {
    return of(
        machineType,
        project,
        zone
        )
        .toString();
  }

  public String getMachineType() {
    return machineType;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }


  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("machineType") && machineType != null) {
      fieldMap.put("machineType", Collections.singletonList(String.valueOf(machineType)));
    }
    if (fieldNames.contains("project") && project != null) {
      fieldMap.put("project", Collections.singletonList(String.valueOf(project)));
    }
    if (fieldNames.contains("zone") && zone != null) {
      fieldMap.put("zone", Collections.singletonList(String.valueOf(zone)));
    }
    return fieldMap;
  }

  public static MachineTypeName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MachineTypeName.parse: formattedString not in valid format");
    return of(
      matchMap.get("machineType"),
      matchMap.get("project"),
      matchMap.get("zone")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return MachineTypeNameType.instance();
  }

  public static class Builder {
    private String machineType;
    private String project;
    private String zone;

    public String getMachineType() {
      return machineType;
    }
    public String getProject() {
      return project;
    }
    public String getZone() {
      return zone;
    }

    public Builder setMachineType(String machineType) {
      this.machineType = machineType;
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

    public Builder (MachineTypeName machineTypeName) {
      machineType = machineTypeName.machineType;
      project = machineTypeName.project;
      zone = machineTypeName.zone;
    }

    public MachineTypeName build() {
      return new MachineTypeName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "machineType", machineType,
        "project", project,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MachineTypeName) {
      MachineTypeName that = (MachineTypeName) o;
      return
          Objects.equals(this.machineType, that.getMachineType()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      machineType,
      project,
      zone
    );
  }
}
