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
public final class CustomerEncryptionKeyProtectedDisk implements ApiMessage {
  private final CustomerEncryptionKey diskEncryptionKey;
  private final String source;
  private final Map<String, String> pathParams;

  private CustomerEncryptionKeyProtectedDisk() {
    this.diskEncryptionKey = null;
    this.source = null;
    this.pathParams = ImmutableMap.of();
  }


  private CustomerEncryptionKeyProtectedDisk(
      CustomerEncryptionKey diskEncryptionKey,
      String source
      ) {
    this.diskEncryptionKey = diskEncryptionKey;
    this.source = source;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("diskEncryptionKey") && diskEncryptionKey != null) {
      fieldMap.put("diskEncryptionKey", Collections.singletonList(String.valueOf(diskEncryptionKey)));
    }
    if (fieldNames.contains("source") && source != null) {
      fieldMap.put("source", Collections.singletonList(String.valueOf(source)));
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

  public CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  public String getSource() {
    return source;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(CustomerEncryptionKeyProtectedDisk prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static CustomerEncryptionKeyProtectedDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final CustomerEncryptionKeyProtectedDisk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CustomerEncryptionKeyProtectedDisk();
  }

  public static class Builder {
    private CustomerEncryptionKey diskEncryptionKey;
    private String source;

    Builder() {}

    public Builder mergeFrom(CustomerEncryptionKeyProtectedDisk other) {
      if (other == CustomerEncryptionKeyProtectedDisk.getDefaultInstance()) return this;
      if (other.getDiskEncryptionKey() != null) {
        this.diskEncryptionKey = other.diskEncryptionKey;
      }
      if (other.getSource() != null) {
        this.source = other.source;
      }
      return this;
    }

    Builder(CustomerEncryptionKeyProtectedDisk source) {
      this.diskEncryptionKey = source.diskEncryptionKey;
      this.source = source.source;
    }

    public CustomerEncryptionKey getDiskEncryptionKey() {
      return diskEncryptionKey;
    }

    public Builder setDiskEncryptionKey(CustomerEncryptionKey diskEncryptionKey) {
      this.diskEncryptionKey = diskEncryptionKey;
      return this;
    }

    public String getSource() {
      return source;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }


    public CustomerEncryptionKeyProtectedDisk build() {

      return new CustomerEncryptionKeyProtectedDisk(
        diskEncryptionKey,
        source
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDiskEncryptionKey(this.diskEncryptionKey);
      newBuilder.setSource(this.source);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "CustomerEncryptionKeyProtectedDisk{"
        + "diskEncryptionKey=" + diskEncryptionKey + ", "
        + "source=" + source
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerEncryptionKeyProtectedDisk) {
      CustomerEncryptionKeyProtectedDisk that = (CustomerEncryptionKeyProtectedDisk) o;
      return
          Objects.equals(this.diskEncryptionKey, that.getDiskEncryptionKey()) &&
          Objects.equals(this.source, that.getSource())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      diskEncryptionKey,
      source
    );
  }
}
