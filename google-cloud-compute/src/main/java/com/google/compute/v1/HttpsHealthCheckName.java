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
public final class HttpsHealthCheckName implements ResourceName {
  private final String httpsHealthCheck;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/httpsHealthChecks/{httpsHealthCheck}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private HttpsHealthCheckName(Builder builder) {
    httpsHealthCheck = Preconditions.checkNotNull(builder.getHttpsHealthCheck());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static HttpsHealthCheckName of(
      String httpsHealthCheck,
      String project
      ) {
    return newBuilder()
    .setHttpsHealthCheck(httpsHealthCheck)
    .setProject(project)
      .build();
  }

  public String getHttpsHealthCheck() {
    return httpsHealthCheck;
  }

  public String getProject() {
    return project;
  }


  public static HttpsHealthCheckName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "HttpsHealthCheckName.parse: formattedString not in valid format");
    return of(
      matchMap.get("httpsHealthCheck"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return HttpsHealthCheckNameType.instance();
  }

  public static class Builder {
    private String httpsHealthCheck;
    private String project;

    public String getHttpsHealthCheck() {
      return httpsHealthCheck;
    }
    public String getProject() {
      return project;
    }

    public Builder setHttpsHealthCheck(String httpsHealthCheck) {
      this.httpsHealthCheck = httpsHealthCheck;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (HttpsHealthCheckName httpsHealthCheckName) {
      httpsHealthCheck = httpsHealthCheckName.httpsHealthCheck;
      project = httpsHealthCheckName.project;
    }

    public HttpsHealthCheckName build() {
      return new HttpsHealthCheckName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "httpsHealthCheck", httpsHealthCheck,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HttpsHealthCheckName) {
      HttpsHealthCheckName that = (HttpsHealthCheckName) o;
      return
          Objects.equals(this.httpsHealthCheck, that.getHttpsHealthCheck()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      httpsHealthCheck,
      project
    );
  }
}
