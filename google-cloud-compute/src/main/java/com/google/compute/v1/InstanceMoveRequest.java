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
public final class InstanceMoveRequest implements ApiMessage {
  private final String destinationZone;
  private final String targetInstance;
  private final Map<String, String> pathParams;

  private InstanceMoveRequest() {
    this.destinationZone = null;
    this.targetInstance = null;
    this.pathParams = ImmutableMap.of();
  }


  private InstanceMoveRequest(
      String destinationZone,
      String targetInstance
      ) {
    this.destinationZone = destinationZone;
    this.targetInstance = targetInstance;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("destinationZone") && destinationZone != null) {
      fieldMap.put("destinationZone", Collections.singletonList(String.valueOf(destinationZone)));
    }
    if (fieldNames.contains("targetInstance") && targetInstance != null) {
      fieldMap.put("targetInstance", Collections.singletonList(String.valueOf(targetInstance)));
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

  public String getDestinationZone() {
    return destinationZone;
  }

  public String getTargetInstance() {
    return targetInstance;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstanceMoveRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceMoveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstanceMoveRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstanceMoveRequest();
  }

  public static class Builder {
    private String destinationZone;
    private String targetInstance;

    Builder() {}

    public Builder mergeFrom(InstanceMoveRequest other) {
      if (other == InstanceMoveRequest.getDefaultInstance()) return this;
      if (other.getDestinationZone() != null) {
        this.destinationZone = other.destinationZone;
      }
      if (other.getTargetInstance() != null) {
        this.targetInstance = other.targetInstance;
      }
      return this;
    }

    Builder(InstanceMoveRequest source) {
      this.destinationZone = source.destinationZone;
      this.targetInstance = source.targetInstance;
    }

    public String getDestinationZone() {
      return destinationZone;
    }

    public Builder setDestinationZone(String destinationZone) {
      this.destinationZone = destinationZone;
      return this;
    }

    public String getTargetInstance() {
      return targetInstance;
    }

    public Builder setTargetInstance(String targetInstance) {
      this.targetInstance = targetInstance;
      return this;
    }


    public InstanceMoveRequest build() {

      return new InstanceMoveRequest(
        destinationZone,
        targetInstance
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDestinationZone(this.destinationZone);
      newBuilder.setTargetInstance(this.targetInstance);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceMoveRequest{"
        + "destinationZone=" + destinationZone + ", "
        + "targetInstance=" + targetInstance
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceMoveRequest) {
      InstanceMoveRequest that = (InstanceMoveRequest) o;
      return
          Objects.equals(this.destinationZone, that.getDestinationZone()) &&
          Objects.equals(this.targetInstance, that.getTargetInstance())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      destinationZone,
      targetInstance
    );
  }
}
