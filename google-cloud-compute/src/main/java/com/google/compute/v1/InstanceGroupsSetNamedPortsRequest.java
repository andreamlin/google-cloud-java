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
public final class InstanceGroupsSetNamedPortsRequest implements ApiMessage {
  private final String fingerprint;
  private final List<NamedPort> namedPorts;
  private final Map<String, String> pathParams;

  private InstanceGroupsSetNamedPortsRequest() {
    this.fingerprint = null;
    this.namedPorts = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstanceGroupsSetNamedPortsRequest(
      String fingerprint,
      List<NamedPort> namedPorts
      ) {
    this.fingerprint = fingerprint;
    this.namedPorts = namedPorts;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
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

  public List<NamedPort> getNamedPorts() {
    return namedPorts;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceGroupsSetNamedPortsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupsSetNamedPortsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceGroupsSetNamedPortsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceGroupsSetNamedPortsRequest();
  }

  public static class Builder {
    private String fingerprint;
    private List<NamedPort> namedPorts;

    Builder() {}

    public Builder mergeFrom(InstanceGroupsSetNamedPortsRequest other) {
      if (other == InstanceGroupsSetNamedPortsRequest.getDefaultInstance()) return this;
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getNamedPorts() != null) {
        this.namedPorts = other.namedPorts;
      }
      return this;
    }

    Builder(InstanceGroupsSetNamedPortsRequest source) {
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

    public Builder addAllNamedPorts(List<NamedPort> namedPorts) {
      this.namedPorts = namedPorts;
      return this;
    }


    public InstanceGroupsSetNamedPortsRequest build() {

      return new InstanceGroupsSetNamedPortsRequest(
        fingerprint,
        namedPorts
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.addAllNamedPorts(this.namedPorts);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroupsSetNamedPortsRequest{"
        + "fingerprint=" + fingerprint + ", "
        + "namedPorts=" + namedPorts
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupsSetNamedPortsRequest) {
      InstanceGroupsSetNamedPortsRequest that = (InstanceGroupsSetNamedPortsRequest) o;
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
