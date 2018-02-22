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
public final class RouterBgp implements ApiMessage {
  private final Integer asn;
  private final Map<String, String> pathParams;

  private RouterBgp() {
    this.asn = null;
    this.pathParams = ImmutableMap.of();
  }


  private RouterBgp(
      Integer asn
      ) {
    this.asn = asn;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("asn") && asn != null) {
      fieldMap.put("asn", Collections.singletonList(String.valueOf(asn)));
    }
    return fieldMap;
  }

  @Override
  public Map<String, String> pathParams() {
    return pathParams;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public Integer getAsn() {
    return asn;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RouterBgp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RouterBgp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RouterBgp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RouterBgp();
  }

  public static class Builder {
    private Integer asn;

    Builder() {}

    public Builder mergeFrom(RouterBgp other) {
      if (other == RouterBgp.getDefaultInstance()) return this;
      if (other.getAsn() != null) {
        this.asn = other.asn;
      }
      return this;
    }

    Builder(RouterBgp source) {
      this.asn = source.asn;
    }

    public Integer getAsn() {
      return asn;
    }

    public Builder setAsn(Integer asn) {
      this.asn = asn;
      return this;
    }


    public RouterBgp build() {
      return new RouterBgp(
        asn
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAsn(this.asn);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RouterBgp{"
        + "asn=" + asn
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouterBgp) {
      RouterBgp that = (RouterBgp) o;
      return
          Objects.equals(this.asn, that.getAsn())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      asn
    );
  }
}
