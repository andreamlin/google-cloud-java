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
public final class RegionBackendServicesBackendServiceName implements ResourceNamePath {
  private final String backendService;
  private final String project;
  private final String region;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/regions/{region}/backendServices/{backendService}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RegionBackendServicesBackendServiceName(Builder builder) {
    backendService = Preconditions.checkNotNull(builder.getBackendService());
    project = Preconditions.checkNotNull(builder.getProject());
    region = Preconditions.checkNotNull(builder.getRegion());
  }

  public static RegionBackendServicesBackendServiceName of(
      String backendService,
      String project,
      String region
      ) {
    return newBuilder()
    .setBackendService(backendService)
    .setProject(project)
    .setRegion(region)
      .build();
  }

  public static String format(
      String backendService,
      String project,
      String region
      ) {
    return of(
        backendService,
        project,
        region
        )
        .toString();
  }

  public String getBackendService() {
    return backendService;
  }

  public String getProject() {
    return project;
  }

  public String getRegion() {
    return region;
  }


  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("backendService") && backendService != null) {
      fieldMap.put("backendService", Collections.singletonList(String.valueOf(backendService)));
    }
    if (fieldNames.contains("project") && project != null) {
      fieldMap.put("project", Collections.singletonList(String.valueOf(project)));
    }
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    return fieldMap;
  }

  public static RegionBackendServicesBackendServiceName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RegionBackendServicesBackendServiceName.parse: formattedString not in valid format");
    return of(
      matchMap.get("backendService"),
      matchMap.get("project"),
      matchMap.get("region")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return RegionBackendServicesBackendServiceNameType.instance();
  }

  public static class Builder {
    private String backendService;
    private String project;
    private String region;

    public String getBackendService() {
      return backendService;
    }
    public String getProject() {
      return project;
    }
    public String getRegion() {
      return region;
    }

    public Builder setBackendService(String backendService) {
      this.backendService = backendService;
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

    public Builder (RegionBackendServicesBackendServiceName regionBackendServicesBackendServiceName) {
      backendService = regionBackendServicesBackendServiceName.backendService;
      project = regionBackendServicesBackendServiceName.project;
      region = regionBackendServicesBackendServiceName.region;
    }

    public RegionBackendServicesBackendServiceName build() {
      return new RegionBackendServicesBackendServiceName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "backendService", backendService,
        "project", project,
        "region", region
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionBackendServicesBackendServiceName) {
      RegionBackendServicesBackendServiceName that = (RegionBackendServicesBackendServiceName) o;
      return
          Objects.equals(this.backendService, that.getBackendService()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.region, that.getRegion())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      backendService,
      project,
      region
    );
  }
}
