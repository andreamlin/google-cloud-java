/*
 * Copyright 2017 Google LLC
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
public final class TargetSslProxiesSetSslCertificatesRequest implements ApiMessage {
  private final List<String> sslCertificates;

  private TargetSslProxiesSetSslCertificatesRequest() {
    this.sslCertificates = null;
  }


  private TargetSslProxiesSetSslCertificatesRequest(
      List<String> sslCertificates
      ) {
    this.sslCertificates = sslCertificates;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("sslCertificates") && sslCertificates != null) {
      fieldMap.put("sslCertificates", Collections.singletonList(String.valueOf(sslCertificates)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public List<String> getSslCertificates() {
    return sslCertificates;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TargetSslProxiesSetSslCertificatesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetSslProxiesSetSslCertificatesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TargetSslProxiesSetSslCertificatesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TargetSslProxiesSetSslCertificatesRequest();
  }

  public static class Builder {
    private List<String> sslCertificates;

    Builder() {}

    public Builder mergeFrom(TargetSslProxiesSetSslCertificatesRequest other) {
      if (other == TargetSslProxiesSetSslCertificatesRequest.getDefaultInstance()) return this;
      if (other.getSslCertificates() != null) {
        this.sslCertificates = other.sslCertificates;
      }
      return this;
    }

    Builder(TargetSslProxiesSetSslCertificatesRequest source) {
      this.sslCertificates = source.sslCertificates;
    }

    public List<String> getSslCertificates() {
      return sslCertificates;
    }

    public Builder setSslCertificates(List<String> sslCertificates) {
      this.sslCertificates = sslCertificates;
      return this;
    }


    public TargetSslProxiesSetSslCertificatesRequest build() {
      return new TargetSslProxiesSetSslCertificatesRequest(
        sslCertificates
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setSslCertificates(this.sslCertificates);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetSslProxiesSetSslCertificatesRequest{"
        + "sslCertificates=" + sslCertificates
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetSslProxiesSetSslCertificatesRequest) {
      TargetSslProxiesSetSslCertificatesRequest that = (TargetSslProxiesSetSslCertificatesRequest) o;
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
