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
public final class RegionInstanceGroupsSetNamedPortsRequest implements ApiMessage {
  private final String fingerprint;
  private final List<NamedPort> namedPorts;

  private RegionInstanceGroupsSetNamedPortsRequest() {
    this.fingerprint = null;
    this.namedPorts = null;
  }


  private RegionInstanceGroupsSetNamedPortsRequest(
      String fingerprint,
      List<NamedPort> namedPorts
      ) {
    this.fingerprint = fingerprint;
    this.namedPorts = namedPorts;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("fingerprint") && fingerprint != null) {
      fieldMap.put("fingerprint", Collections.singletonList(String.valueOf(fingerprint)));
    }
    if (fieldNames.contains("namedPorts") && namedPorts != null) {
      fieldMap.put("namedPorts", Collections.singletonList(String.valueOf(namedPorts)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public String getFingerprint() {
    return fingerprint;
  }

  public List<NamedPort> getNamedPorts() {
    return namedPorts;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RegionInstanceGroupsSetNamedPortsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RegionInstanceGroupsSetNamedPortsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RegionInstanceGroupsSetNamedPortsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegionInstanceGroupsSetNamedPortsRequest();
  }

  public static class Builder {
    private String fingerprint;
    private List<NamedPort> namedPorts;

    Builder() {}

    public Builder mergeFrom(RegionInstanceGroupsSetNamedPortsRequest other) {
      if (other == RegionInstanceGroupsSetNamedPortsRequest.getDefaultInstance()) return this;
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getNamedPorts() != null) {
        this.namedPorts = other.namedPorts;
      }
      return this;
    }

    Builder(RegionInstanceGroupsSetNamedPortsRequest source) {
      this.fingerprint = source.fingerprint;
      this.namedPorts = source.namedPorts;
    }

    public String getFingerprint() {
      return fingerprint;
    }

    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    public List<NamedPort> getNamedPorts() {
      return namedPorts;
    }

    public Builder setNamedPorts(List<NamedPort> namedPorts) {
      this.namedPorts = namedPorts;
      return this;
    }


    public RegionInstanceGroupsSetNamedPortsRequest build() {

      return new RegionInstanceGroupsSetNamedPortsRequest(
        fingerprint,
        namedPorts
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.setNamedPorts(this.namedPorts);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RegionInstanceGroupsSetNamedPortsRequest{"
        + "fingerprint=" + fingerprint + ", "
        + "namedPorts=" + namedPorts
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionInstanceGroupsSetNamedPortsRequest) {
      RegionInstanceGroupsSetNamedPortsRequest that = (RegionInstanceGroupsSetNamedPortsRequest) o;
      return
          Objects.equals(this.fingerprint, that.getFingerprint()) &&
          Objects.equals(this.namedPorts, that.getNamedPorts())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      fingerprint,
      namedPorts
    );
  }
}