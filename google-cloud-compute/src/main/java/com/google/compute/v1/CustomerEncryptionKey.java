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
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class CustomerEncryptionKey implements ApiMessage {
  private final String rawKey;
  private final String sha256;
  private final Map<String, String> pathParams;

  private CustomerEncryptionKey() {
    this.rawKey = null;
    this.sha256 = null;
    this.pathParams = ImmutableMap.of();
  }


  private CustomerEncryptionKey(
      String rawKey,
      String sha256
      ) {
    this.rawKey = rawKey;
    this.sha256 = sha256;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("rawKey") && rawKey != null) {
      fieldMap.put("rawKey", Collections.singletonList(String.valueOf(rawKey)));
    }
    if (fieldNames.contains("sha256") && sha256 != null) {
      fieldMap.put("sha256", Collections.singletonList(String.valueOf(sha256)));
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

  public String getRawKey() {
    return rawKey;
  }

  public String getSha256() {
    return sha256;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(CustomerEncryptionKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static CustomerEncryptionKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final CustomerEncryptionKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CustomerEncryptionKey();
  }

  public static class Builder {
    private String rawKey;
    private String sha256;

    Builder() {}

    public Builder mergeFrom(CustomerEncryptionKey other) {
      if (other == CustomerEncryptionKey.getDefaultInstance()) return this;
      if (other.getRawKey() != null) {
        this.rawKey = other.rawKey;
      }
      if (other.getSha256() != null) {
        this.sha256 = other.sha256;
      }
      return this;
    }

    Builder(CustomerEncryptionKey source) {
      this.rawKey = source.rawKey;
      this.sha256 = source.sha256;
    }

    public String getRawKey() {
      return rawKey;
    }

    public Builder setRawKey(String rawKey) {
      this.rawKey = rawKey;
      return this;
    }

    public String getSha256() {
      return sha256;
    }

    public Builder setSha256(String sha256) {
      this.sha256 = sha256;
      return this;
    }


    public CustomerEncryptionKey build() {

      return new CustomerEncryptionKey(
        rawKey,
        sha256
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setRawKey(this.rawKey);
      newBuilder.setSha256(this.sha256);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "CustomerEncryptionKey{"
        + "rawKey=" + rawKey + ", "
        + "sha256=" + sha256
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerEncryptionKey) {
      CustomerEncryptionKey that = (CustomerEncryptionKey) o;
      return
          Objects.equals(this.rawKey, that.getRawKey()) &&
          Objects.equals(this.sha256, that.getSha256())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      rawKey,
      sha256
    );
  }
}
