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
public final class LicenseName implements ResourceNamePath {
  private final String license;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/licenses/{license}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private LicenseName(Builder builder) {
    license = Preconditions.checkNotNull(builder.getLicense());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static LicenseName of(
      String license,
      String project
      ) {
    return newBuilder()
    .setLicense(license)
    .setProject(project)
      .build();
  }

  public static String format(
      String license,
      String project
      ) {
    return of(
        license,
        project
        )
        .toString();
  }

  public String getLicense() {
    return license;
  }

  public String getProject() {
    return project;
  }


  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("license") && license != null) {
      fieldMap.put("license", Collections.singletonList(String.valueOf(license)));
    }
    if (fieldNames.contains("project") && project != null) {
      fieldMap.put("project", Collections.singletonList(String.valueOf(project)));
    }
    return fieldMap;
  }

  public static LicenseName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "LicenseName.parse: formattedString not in valid format");
    return of(
      matchMap.get("license"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return LicenseNameType.instance();
  }

  public static class Builder {
    private String license;
    private String project;

    public String getLicense() {
      return license;
    }
    public String getProject() {
      return project;
    }

    public Builder setLicense(String license) {
      this.license = license;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (LicenseName licenseName) {
      license = licenseName.license;
      project = licenseName.project;
    }

    public LicenseName build() {
      return new LicenseName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "license", license,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LicenseName) {
      LicenseName that = (LicenseName) o;
      return
          Objects.equals(this.license, that.getLicense()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      license,
      project
    );
  }
}
