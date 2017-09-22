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
public final class InstanceTemplateName implements ResourceName {
  private final String instanceTemplate;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("{project}/global/instanceTemplates/{instanceTemplate}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private InstanceTemplateName(Builder builder) {
    instanceTemplate = Preconditions.checkNotNull(builder.getInstanceTemplate());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static InstanceTemplateName create(
      String instanceTemplate,
      String project
      ) {
    return newBuilder()
    .setInstanceTemplate(instanceTemplate)
    .setProject(project)
      .build();
  }

  public String getInstanceTemplate() {
    return instanceTemplate;
  }

  public String getProject() {
    return project;
  }


  public static InstanceTemplateName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "InstanceTemplateName.parse: formattedString not in valid format");
    return create(
      matchMap.get("instanceTemplate"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return InstanceTemplateNameType.instance();
  }

  public static class Builder {
    private String instanceTemplate;
    private String project;

    public String getInstanceTemplate() {
      return instanceTemplate;
    }
    public String getProject() {
      return project;
    }

    public Builder setInstanceTemplate(String instanceTemplate) {
      this.instanceTemplate = instanceTemplate;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (InstanceTemplateName instanceTemplateName) {
      instanceTemplate = instanceTemplateName.instanceTemplate;
      project = instanceTemplateName.project;
    }

    public InstanceTemplateName build() {
      return new InstanceTemplateName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "instanceTemplate", instanceTemplate,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceTemplateName) {
      InstanceTemplateName that = (InstanceTemplateName) o;
      return
          Objects.equals(this.instanceTemplate, that.getInstanceTemplate()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceTemplate,
      project
    );
  }
}
