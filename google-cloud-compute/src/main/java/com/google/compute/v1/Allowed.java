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
public final class Allowed implements ApiMessage {
  private final String iPProtocol;
  private final List<String> ports;
  private final Map<String, String> pathParams;

  private Allowed() {
    this.iPProtocol = null;
    this.ports = null;
    this.pathParams = ImmutableMap.of();
  }


  private Allowed(
      String iPProtocol,
      List<String> ports
      ) {
    this.iPProtocol = iPProtocol;
    this.ports = ports;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("iPProtocol") && iPProtocol != null) {
      fieldMap.put("iPProtocol", Collections.singletonList(String.valueOf(iPProtocol)));
    }
    if (fieldNames.contains("ports") && ports != null) {
      fieldMap.put("ports", Collections.singletonList(String.valueOf(ports)));
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

  public String getIPProtocol() {
    return iPProtocol;
  }

  public List<String> getPorts() {
    return ports;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Allowed prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Allowed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Allowed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Allowed();
  }

  public static class Builder {
    private String iPProtocol;
    private List<String> ports;

    Builder() {}

    public Builder mergeFrom(Allowed other) {
      if (other == Allowed.getDefaultInstance()) return this;
      if (other.getIPProtocol() != null) {
        this.iPProtocol = other.iPProtocol;
      }
      if (other.getPorts() != null) {
        this.ports = other.ports;
      }
      return this;
    }

    Builder(Allowed source) {
      this.iPProtocol = source.iPProtocol;
      this.ports = source.ports;
    }

    public String getIPProtocol() {
      return iPProtocol;
    }

    public Builder setIPProtocol(String iPProtocol) {
      this.iPProtocol = iPProtocol;
      return this;
    }

    public List<String> getPorts() {
      return ports;
    }

    public Builder addAllPorts(List<String> ports) {
      this.ports = ports;
      return this;
    }


    public Allowed build() {

      return new Allowed(
        iPProtocol,
        ports
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setIPProtocol(this.iPProtocol);
      newBuilder.addAllPorts(this.ports);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Allowed{"
        + "iPProtocol=" + iPProtocol + ", "
        + "ports=" + ports
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Allowed) {
      Allowed that = (Allowed) o;
      return
          Objects.equals(this.iPProtocol, that.getIPProtocol()) &&
          Objects.equals(this.ports, that.getPorts())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      iPProtocol,
      ports
    );
  }
}
