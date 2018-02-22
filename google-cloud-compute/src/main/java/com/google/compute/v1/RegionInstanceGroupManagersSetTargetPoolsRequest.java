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
public final class RegionInstanceGroupManagersSetTargetPoolsRequest implements ApiMessage {
  private final String fingerprint;
  private final List<String> targetPools;
  private final Map<String, String> pathParams;

  private RegionInstanceGroupManagersSetTargetPoolsRequest() {
    this.fingerprint = null;
    this.targetPools = null;
    this.pathParams = ImmutableMap.of();
  }


  private RegionInstanceGroupManagersSetTargetPoolsRequest(
      String fingerprint,
      List<String> targetPools
      ) {
    this.fingerprint = fingerprint;
    this.targetPools = targetPools;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("fingerprint") && fingerprint != null) {
      fieldMap.put("fingerprint", Collections.singletonList(String.valueOf(fingerprint)));
    }
    if (fieldNames.contains("targetPools") && targetPools != null) {
      fieldMap.put("targetPools", targetPools.stream().map(item -> item.toString()).collect(Collectors.toList()));
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

  public String getFingerprint() {
    return fingerprint;
  }

  public List<String> getTargetPools() {
    return targetPools;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RegionInstanceGroupManagersSetTargetPoolsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RegionInstanceGroupManagersSetTargetPoolsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RegionInstanceGroupManagersSetTargetPoolsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegionInstanceGroupManagersSetTargetPoolsRequest();
  }

  public static class Builder {
    private String fingerprint;
    private List<String> targetPools;

    Builder() {}

    public Builder mergeFrom(RegionInstanceGroupManagersSetTargetPoolsRequest other) {
      if (other == RegionInstanceGroupManagersSetTargetPoolsRequest.getDefaultInstance()) return this;
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getTargetPools() != null) {
        this.targetPools = other.targetPools;
      }
      return this;
    }

    Builder(RegionInstanceGroupManagersSetTargetPoolsRequest source) {
      this.fingerprint = source.fingerprint;
      this.targetPools = source.targetPools;
    }

    public String getFingerprint() {
      return fingerprint;
    }

    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    public List<String> getTargetPools() {
      return targetPools;
    }

    public Builder addAllTargetPools(List<String> targetPools) {
      this.targetPools.addAll(targetPools);
      return this;
    }

    public Builder addTargetPools(String targetPools) {
      this.targetPools.add(targetPools);
      return this;
    }


    public RegionInstanceGroupManagersSetTargetPoolsRequest build() {

      return new RegionInstanceGroupManagersSetTargetPoolsRequest(
        fingerprint,
        targetPools
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.addAllTargetPools(this.targetPools);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RegionInstanceGroupManagersSetTargetPoolsRequest{"
        + "fingerprint=" + fingerprint + ", "
        + "targetPools=" + targetPools
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionInstanceGroupManagersSetTargetPoolsRequest) {
      RegionInstanceGroupManagersSetTargetPoolsRequest that = (RegionInstanceGroupManagersSetTargetPoolsRequest) o;
      return
          Objects.equals(this.fingerprint, that.getFingerprint()) &&
          Objects.equals(this.targetPools, that.getTargetPools())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      fingerprint,
      targetPools
    );
  }
}
