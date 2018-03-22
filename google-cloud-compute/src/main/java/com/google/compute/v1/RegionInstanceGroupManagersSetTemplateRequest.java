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
import com.google.api.gax.httpjson.ApiMessage;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class RegionInstanceGroupManagersSetTemplateRequest implements ApiMessage {
  private final String instanceTemplate;

  private RegionInstanceGroupManagersSetTemplateRequest() {
    this.instanceTemplate = null;
  }


  private RegionInstanceGroupManagersSetTemplateRequest(
      String instanceTemplate
      ) {
    this.instanceTemplate = instanceTemplate;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("instanceTemplate") && instanceTemplate != null) {
      fieldMap.put("instanceTemplate", Collections.singletonList(String.valueOf(instanceTemplate)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("instanceTemplate")) {
      return String.valueOf(instanceTemplate);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getInstanceTemplate() {
    return instanceTemplate;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RegionInstanceGroupManagersSetTemplateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RegionInstanceGroupManagersSetTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RegionInstanceGroupManagersSetTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegionInstanceGroupManagersSetTemplateRequest();
  }

  public static class Builder {
    private String instanceTemplate;

    Builder() {}

    public Builder mergeFrom(RegionInstanceGroupManagersSetTemplateRequest other) {
      if (other == RegionInstanceGroupManagersSetTemplateRequest.getDefaultInstance()) return this;
      if (other.getInstanceTemplate() != null) {
        this.instanceTemplate = other.instanceTemplate;
      }
      return this;
    }

    Builder(RegionInstanceGroupManagersSetTemplateRequest source) {
      this.instanceTemplate = source.instanceTemplate;
    }

    public String getInstanceTemplate() {
      return instanceTemplate;
    }

    public Builder setInstanceTemplate(String instanceTemplate) {
      this.instanceTemplate = instanceTemplate;
      return this;
    }


    public RegionInstanceGroupManagersSetTemplateRequest build() {
      return new RegionInstanceGroupManagersSetTemplateRequest(
        instanceTemplate
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setInstanceTemplate(this.instanceTemplate);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RegionInstanceGroupManagersSetTemplateRequest{"
        + "instanceTemplate=" + instanceTemplate
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionInstanceGroupManagersSetTemplateRequest) {
      RegionInstanceGroupManagersSetTemplateRequest that = (RegionInstanceGroupManagersSetTemplateRequest) o;
      return
          Objects.equals(this.instanceTemplate, that.getInstanceTemplate())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      instanceTemplate
    );
  }
}
