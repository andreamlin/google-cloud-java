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
public final class SslCertificateName implements ResourceName {
  private final String project;
  private final String sslCertificate;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("project/{project}/sslCertificates/{sslCertificate}");

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

  public static SslCertificateName create(
      String project,
      String sslCertificate
      ) {
    return newBuilder()
    .setProject(project)
    .setSslCertificate(sslCertificate)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getSslCertificate() {
    return sslCertificate;
  }


  public static SslCertificateName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SslCertificateName.parse: formattedString not in valid format");
    return create(
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
