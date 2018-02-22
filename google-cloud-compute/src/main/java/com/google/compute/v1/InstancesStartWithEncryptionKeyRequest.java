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
public final class InstancesStartWithEncryptionKeyRequest implements ApiMessage {
  private final List<CustomerEncryptionKeyProtectedDisk> disks;
  private final Map<String, String> pathParams;

  private InstancesStartWithEncryptionKeyRequest() {
    this.disks = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstancesStartWithEncryptionKeyRequest(
      List<CustomerEncryptionKeyProtectedDisk> disks
      ) {
    this.disks = disks;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("disks") && disks != null) {
      fieldMap.put("disks", Collections.singletonList(String.valueOf(disks)));
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

  public List<CustomerEncryptionKeyProtectedDisk> getDisks() {
    return disks;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstancesStartWithEncryptionKeyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstancesStartWithEncryptionKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstancesStartWithEncryptionKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstancesStartWithEncryptionKeyRequest();
  }

  public static class Builder {
    private List<CustomerEncryptionKeyProtectedDisk> disks;

    Builder() {}

    public Builder mergeFrom(InstancesStartWithEncryptionKeyRequest other) {
      if (other == InstancesStartWithEncryptionKeyRequest.getDefaultInstance()) return this;
      if (other.getDisks() != null) {
        this.disks = other.disks;
      }
      return this;
    }

    Builder(InstancesStartWithEncryptionKeyRequest source) {
      this.disks = source.disks;
    }

    public List<CustomerEncryptionKeyProtectedDisk> getDisks() {
      return disks;
    }

    public Builder addAllDisks(List<CustomerEncryptionKeyProtectedDisk> disks) {
      this.disks = disks;
      return this;
    }


    public InstancesStartWithEncryptionKeyRequest build() {
      return new InstancesStartWithEncryptionKeyRequest(
        disks
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllDisks(this.disks);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstancesStartWithEncryptionKeyRequest{"
        + "disks=" + disks
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstancesStartWithEncryptionKeyRequest) {
      InstancesStartWithEncryptionKeyRequest that = (InstancesStartWithEncryptionKeyRequest) o;
      return
          Objects.equals(this.disks, that.getDisks())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      disks
    );
  }
}
