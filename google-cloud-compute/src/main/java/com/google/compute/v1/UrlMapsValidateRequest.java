/*
 * Copyright 2017, Google LLC All rights reserved.
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
import com.google.api.gax.httpjson.ApiMessage;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class UrlMapsValidateRequest implements ApiMessage {
  private final UrlMap resource;

  private UrlMapsValidateRequest() {
    this.resource = null;
  }


  private UrlMapsValidateRequest(
      UrlMap resource
      ) {
    this.resource = resource;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("resource") && resource != null) {
      fieldMap.put("resource", Collections.singletonList(String.valueOf(resource)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public UrlMap getResource() {
    return resource;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UrlMapsValidateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static UrlMapsValidateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final UrlMapsValidateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UrlMapsValidateRequest();
  }

  public static class Builder {
    private UrlMap resource;

    Builder() {}

    public Builder mergeFrom(UrlMapsValidateRequest other) {
      if (other == UrlMapsValidateRequest.getDefaultInstance()) return this;
      if (other.getResource() != null) {
        this.resource = other.resource;
      }
      return this;
    }

    Builder(UrlMapsValidateRequest source) {
      this.resource = source.resource;
    }

    public UrlMap getResource() {
      return resource;
    }

    public Builder setResource(UrlMap resource) {
      this.resource = resource;
      return this;
    }


    public UrlMapsValidateRequest build() {
      return new UrlMapsValidateRequest(
        resource
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setResource(this.resource);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "UrlMapsValidateRequest{"
        + "resource=" + resource
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UrlMapsValidateRequest) {
      UrlMapsValidateRequest that = (UrlMapsValidateRequest) o;
      return
          Objects.equals(this.resource, that.getResource())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      resource
    );
  }
}