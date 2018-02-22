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
import com.google.api.resourcenames.ResourceName;
import com.google.common.collect.ImmutableMap;
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
public final class TargetHttpsProxiesSetSslCertificatesRequest implements ApiMessage {
  private final List<String> sslCertificates;
  private final Map<String, String> pathParams;

  private TargetHttpsProxiesSetSslCertificatesRequest() {
    this.sslCertificates = null;
    this.pathParams = ImmutableMap.of();
  }


  private TargetHttpsProxiesSetSslCertificatesRequest(
      List<String> sslCertificates
      ) {
    this.sslCertificates = sslCertificates;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("sslCertificates") && sslCertificates != null) {
      fieldMap.put("sslCertificates", sslCertificates);
    }
    return fieldMap;
  }

  @Override
  public Map<String, String> getApiMessagePathParams() {
    return pathParams;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<String> getSslCertificates() {
    return sslCertificates;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetHttpsProxiesSetSslCertificatesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetHttpsProxiesSetSslCertificatesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetHttpsProxiesSetSslCertificatesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetHttpsProxiesSetSslCertificatesRequest();
  }

  public static class Builder {
    private List<String> sslCertificates;

    Builder() {}

    public Builder mergeFrom(TargetHttpsProxiesSetSslCertificatesRequest other) {
      if (other == TargetHttpsProxiesSetSslCertificatesRequest.getDefaultInstance()) return this;
      if (other.getSslCertificates() != null) {
        this.sslCertificates = other.sslCertificates;
      }
      return this;
    }

    Builder(TargetHttpsProxiesSetSslCertificatesRequest source) {
      this.sslCertificates = source.sslCertificates;
    }

    public List<String> getSslCertificates() {
      return sslCertificates;
    }

    public Builder addAllSslCertificates(List<String> sslCertificates) {
      this.sslCertificates.addAll(sslCertificates);
      return this;
    }

    public Builder addSslCertificates(String sslCertificates) {
      this.sslCertificates.add(sslCertificates);
      return this;
    }


    public TargetHttpsProxiesSetSslCertificatesRequest build() {
      return new TargetHttpsProxiesSetSslCertificatesRequest(
        sslCertificates
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllSslCertificates(this.sslCertificates);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetHttpsProxiesSetSslCertificatesRequest{"
        + "sslCertificates=" + sslCertificates
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetHttpsProxiesSetSslCertificatesRequest) {
      TargetHttpsProxiesSetSslCertificatesRequest that = (TargetHttpsProxiesSetSslCertificatesRequest) o;
      return
          Objects.equals(this.sslCertificates, that.getSslCertificates())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      sslCertificates
    );
  }
}
