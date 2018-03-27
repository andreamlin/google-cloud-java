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
package com.google.cloud.simplecompute.v1;

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
public final class DummyObjectName implements ResourceName {
  private final String dummyObject;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/dummyObjects/{dummyObject}");

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DummyObjectName(Builder builder) {
    dummyObject = Preconditions.checkNotNull(builder.getDummyObject());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static DummyObjectName of(
      String dummyObject,
      String project
      ) {
    return newBuilder()
    .setDummyObject(dummyObject)
    .setProject(project)
      .build();
  }

  public static String format(
      String dummyObject,
      String project
      ) {
    return of(
        dummyObject,
        project
        )
        .toString();
  }

  public String getDummyObject() {
    return dummyObject;
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
          fieldMapBuilder.put("dummyObject", dummyObject);
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


  public static ResourceNameFactory<DummyObjectName> newFactory() {
    return new ResourceNameFactory<DummyObjectName>() {
      public DummyObjectName parse(String formattedString) {return DummyObjectName.parse(formattedString);}
    };
  }

  public static DummyObjectName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DummyObjectName.parse: formattedString not in valid format");
    return of(
      matchMap.get("dummyObject"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public static class Builder {
    private String dummyObject;
    private String project;

    public String getDummyObject() {
      return dummyObject;
    }
    public String getProject() {
      return project;
    }

    public Builder setDummyObject(String dummyObject) {
      this.dummyObject = dummyObject;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (DummyObjectName dummyObjectName) {
      dummyObject = dummyObjectName.dummyObject;
      project = dummyObjectName.project;
    }

    public DummyObjectName build() {
      return new DummyObjectName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "dummyObject", dummyObject,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DummyObjectName) {
      DummyObjectName that = (DummyObjectName) o;
      return
          Objects.equals(this.dummyObject, that.getDummyObject()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      dummyObject,
      project
    );
  }
}
