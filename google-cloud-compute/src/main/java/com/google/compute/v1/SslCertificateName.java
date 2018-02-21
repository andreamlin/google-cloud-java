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
public final class SslCertificateName implements ResourceNamePath {
  private final String project;
  private final String sslCertificate;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/sslCertificates/{sslCertificate}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SslCertificateName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    sslCertificate = Preconditions.checkNotNull(builder.getSslCertificate());
  }

  public static SslCertificateName of(
      String project,
      String sslCertificate
      ) {
    return newBuilder()
    .setProject(project)
    .setSslCertificate(sslCertificate)
      .build();
  }

  public static String format(
      String project,
      String sslCertificate
      ) {
    return of(
        project,
        sslCertificate
        )
        .toString();
  }

  public String getProject() {
    return project;
  }

  public String getSslCertificate() {
    return sslCertificate;
  }


  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("project") && project != null) {
      fieldMap.put("project", Collections.singletonList(String.valueOf(project)));
    }
    if (fieldNames.contains("sslCertificate") && sslCertificate != null) {
      fieldMap.put("sslCertificate", Collections.singletonList(String.valueOf(sslCertificate)));
    }
    return fieldMap;
  }

  public static SslCertificateName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SslCertificateName.parse: formattedString not in valid format");
    return of(
      matchMap.get("project"),
      matchMap.get("sslCertificate")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return SslCertificateNameType.instance();
  }

  public static class Builder {
    private String project;
    private String sslCertificate;

    public String getProject() {
      return project;
    }
    public String getSslCertificate() {
      return sslCertificate;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setSslCertificate(String sslCertificate) {
      this.sslCertificate = sslCertificate;
      return this;
    }

    private Builder() {}

    public Builder (SslCertificateName sslCertificateName) {
      project = sslCertificateName.project;
      sslCertificate = sslCertificateName.sslCertificate;
    }

    public SslCertificateName build() {
      return new SslCertificateName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "sslCertificate", sslCertificate
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SslCertificateName) {
      SslCertificateName that = (SslCertificateName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.sslCertificate, that.getSslCertificate())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      sslCertificate
    );
  }
}
