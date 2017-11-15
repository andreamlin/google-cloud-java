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
public final class BackendServiceName implements ResourceName {
  private final String backendService;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/backendServices/{backendService}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private BackendServiceName(Builder builder) {
    backendService = Preconditions.checkNotNull(builder.getBackendService());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static BackendServiceName of(
      String backendService,
      String project
      ) {
    return newBuilder()
    .setBackendService(backendService)
    .setProject(project)
      .build();
  }

  public String getBackendService() {
    return backendService;
  }

  public String getProject() {
    return project;
  }


  public static BackendServiceName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "BackendServiceName.parse: formattedString not in valid format");
    return of(
      matchMap.get("backendService"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return BackendServiceNameType.instance();
  }

  public static class Builder {
    private String backendService;
    private String project;

    public String getBackendService() {
      return backendService;
    }
    public String getProject() {
      return project;
    }

    public Builder setBackendService(String backendService) {
      this.backendService = backendService;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (BackendServiceName backendServiceName) {
      backendService = backendServiceName.backendService;
      project = backendServiceName.project;
    }

    public BackendServiceName build() {
      return new BackendServiceName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "backendService", backendService,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendServiceName) {
      BackendServiceName that = (BackendServiceName) o;
      return
          Objects.equals(this.backendService, that.getBackendService()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      backendService,
      project
    );
  }
}
