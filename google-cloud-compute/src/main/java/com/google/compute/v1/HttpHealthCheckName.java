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
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
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
public final class HttpHealthCheckName implements ResourceName {
  private final String httpHealthCheck;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/httpHealthChecks/{httpHealthCheck}");

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private HttpHealthCheckName(Builder builder) {
    httpHealthCheck = Preconditions.checkNotNull(builder.getHttpHealthCheck());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static HttpHealthCheckName of(
      String httpHealthCheck,
      String project
      ) {
    return newBuilder()
    .setHttpHealthCheck(httpHealthCheck)
    .setProject(project)
      .build();
  }

  public static String format(
      String httpHealthCheck,
      String project
      ) {
    return of(
        httpHealthCheck,
        project
        )
        .toString();
  }

  public String getHttpHealthCheck() {
    return httpHealthCheck;
  }

  public String getProject() {
    return project;
  }


  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("httpHealthCheck", httpHealthCheck);
          fieldMapBuilder.put("project", project);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }


  public static ResourceNameFactory<HttpHealthCheckName> newFactory() {
    return new ResourceNameFactory<HttpHealthCheckName>() {
      public HttpHealthCheckName parse(String formattedString) {return HttpHealthCheckName.parse(formattedString);}
    };
  }

  public static HttpHealthCheckName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "HttpHealthCheckName.parse: formattedString not in valid format");
    return of(
      matchMap.get("httpHealthCheck"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public static class Builder {
    private String httpHealthCheck;
    private String project;

    public String getHttpHealthCheck() {
      return httpHealthCheck;
    }
    public String getProject() {
      return project;
    }

    public Builder setHttpHealthCheck(String httpHealthCheck) {
      this.httpHealthCheck = httpHealthCheck;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (HttpHealthCheckName httpHealthCheckName) {
      httpHealthCheck = httpHealthCheckName.httpHealthCheck;
      project = httpHealthCheckName.project;
    }

    public HttpHealthCheckName build() {
      return new HttpHealthCheckName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "httpHealthCheck", httpHealthCheck,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HttpHealthCheckName) {
      HttpHealthCheckName that = (HttpHealthCheckName) o;
      return
          Objects.equals(this.httpHealthCheck, that.getHttpHealthCheck()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      httpHealthCheck,
      project
    );
  }
}
