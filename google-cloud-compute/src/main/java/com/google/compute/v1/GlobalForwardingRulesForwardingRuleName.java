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
public final class GlobalForwardingRulesForwardingRuleName implements ResourceName {
  private final String forwardingRule;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/forwardingRules/{forwardingRule}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private GlobalForwardingRulesForwardingRuleName(Builder builder) {
    forwardingRule = Preconditions.checkNotNull(builder.getForwardingRule());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static GlobalForwardingRulesForwardingRuleName create(
      String forwardingRule,
      String project
      ) {
    return newBuilder()
    .setForwardingRule(forwardingRule)
    .setProject(project)
      .build();
  }

  public String getForwardingRule() {
    return forwardingRule;
  }

  public String getProject() {
    return project;
  }


  public static GlobalForwardingRulesForwardingRuleName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "GlobalForwardingRulesForwardingRuleName.parse: formattedString not in valid format");
    return create(
      matchMap.get("forwardingRule"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return GlobalForwardingRulesForwardingRuleNameType.instance();
  }

  public static class Builder {
    private String forwardingRule;
    private String project;

    public String getForwardingRule() {
      return forwardingRule;
    }
    public String getProject() {
      return project;
    }

    public Builder setForwardingRule(String forwardingRule) {
      this.forwardingRule = forwardingRule;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (GlobalForwardingRulesForwardingRuleName globalForwardingRulesForwardingRuleName) {
      forwardingRule = globalForwardingRulesForwardingRuleName.forwardingRule;
      project = globalForwardingRulesForwardingRuleName.project;
    }

    public GlobalForwardingRulesForwardingRuleName build() {
      return new GlobalForwardingRulesForwardingRuleName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "forwardingRule", forwardingRule,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GlobalForwardingRulesForwardingRuleName) {
      GlobalForwardingRulesForwardingRuleName that = (GlobalForwardingRulesForwardingRuleName) o;
      return
          Objects.equals(this.forwardingRule, that.getForwardingRule()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      forwardingRule,
      project
    );
  }
}
