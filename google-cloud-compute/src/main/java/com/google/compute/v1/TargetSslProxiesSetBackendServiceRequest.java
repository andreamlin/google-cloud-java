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
import com.google.api.gax.httpjson.ResourceNamePath;
import com.google.api.resourcenames.ResourceName;
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
public final class TargetSslProxiesSetBackendServiceRequest implements ApiMessage {
  private final String service;

  private TargetSslProxiesSetBackendServiceRequest() {
    this.service = null;
  }


  private TargetSslProxiesSetBackendServiceRequest(
      String service
      ) {
    this.service = service;
  }

  @Override
  public ResourceNamePath resourceNamePath() {
    return null;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("service") && service != null) {
      fieldMap.put("service", Collections.singletonList(String.valueOf(service)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public String getService() {
    return service;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetSslProxiesSetBackendServiceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetSslProxiesSetBackendServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetSslProxiesSetBackendServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetSslProxiesSetBackendServiceRequest();
  }

  public static class Builder {
    private String service;

    Builder() {}

    public Builder mergeFrom(TargetSslProxiesSetBackendServiceRequest other) {
      if (other == TargetSslProxiesSetBackendServiceRequest.getDefaultInstance()) return this;
      if (other.getService() != null) {
        this.service = other.service;
      }
      return this;
    }

    Builder(TargetSslProxiesSetBackendServiceRequest source) {
      this.service = source.service;
    }

    public String getService() {
      return service;
    }

    public Builder setService(String service) {
      this.service = service;
      return this;
    }


    public TargetSslProxiesSetBackendServiceRequest build() {
      return new TargetSslProxiesSetBackendServiceRequest(
        service
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setService(this.service);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetSslProxiesSetBackendServiceRequest{"
        + "service=" + service
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetSslProxiesSetBackendServiceRequest) {
      TargetSslProxiesSetBackendServiceRequest that = (TargetSslProxiesSetBackendServiceRequest) o;
      return
          Objects.equals(this.service, that.getService())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      service
    );
  }
}
