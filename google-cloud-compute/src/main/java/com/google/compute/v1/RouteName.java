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
public final class RouteName implements ResourceName {
  private final String project;
  private final String route;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/routes/{route}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RouteName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    route = Preconditions.checkNotNull(builder.getRoute());
  }

  public static RouteName create(
      String project,
      String route
      ) {
    return newBuilder()
    .setProject(project)
    .setRoute(route)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getRoute() {
    return route;
  }


  public static RouteName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RouteName.parse: formattedString not in valid format");
    return create(
      matchMap.get("project"),
      matchMap.get("route")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return RouteNameType.instance();
  }

  public static class Builder {
    private String project;
    private String route;

    public String getProject() {
      return project;
    }
    public String getRoute() {
      return route;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setRoute(String route) {
      this.route = route;
      return this;
    }

    private Builder() {}

    public Builder (RouteName routeName) {
      project = routeName.project;
      route = routeName.route;
    }

    public RouteName build() {
      return new RouteName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "route", route
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouteName) {
      RouteName that = (RouteName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.route, that.getRoute())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      route
    );
  }
}
