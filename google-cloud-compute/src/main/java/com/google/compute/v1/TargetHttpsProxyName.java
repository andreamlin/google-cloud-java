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
public final class TargetHttpsProxyName implements ResourceName {
  private final String project;
  private final String targetHttpsProxy;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/targetHttpsProxies/{targetHttpsProxy}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private TargetHttpsProxyName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    targetHttpsProxy = Preconditions.checkNotNull(builder.getTargetHttpsProxy());
  }

  public static TargetHttpsProxyName create(
      String project,
      String targetHttpsProxy
      ) {
    return newBuilder()
    .setProject(project)
    .setTargetHttpsProxy(targetHttpsProxy)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getTargetHttpsProxy() {
    return targetHttpsProxy;
  }


  public static TargetHttpsProxyName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "TargetHttpsProxyName.parse: formattedString not in valid format");
    return create(
      matchMap.get("project"),
      matchMap.get("targetHttpsProxy")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return TargetHttpsProxyNameType.instance();
  }

  public static class Builder {
    private String project;
    private String targetHttpsProxy;

    public String getProject() {
      return project;
    }
    public String getTargetHttpsProxy() {
      return targetHttpsProxy;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setTargetHttpsProxy(String targetHttpsProxy) {
      this.targetHttpsProxy = targetHttpsProxy;
      return this;
    }

    private Builder() {}

    public Builder (TargetHttpsProxyName targetHttpsProxyName) {
      project = targetHttpsProxyName.project;
      targetHttpsProxy = targetHttpsProxyName.targetHttpsProxy;
    }

    public TargetHttpsProxyName build() {
      return new TargetHttpsProxyName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "targetHttpsProxy", targetHttpsProxy
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetHttpsProxyName) {
      TargetHttpsProxyName that = (TargetHttpsProxyName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.targetHttpsProxy, that.getTargetHttpsProxy())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      targetHttpsProxy
    );
  }
}
