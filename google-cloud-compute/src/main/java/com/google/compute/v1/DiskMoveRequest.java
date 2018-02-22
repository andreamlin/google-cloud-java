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
public final class DiskMoveRequest implements ApiMessage {
  private final String destinationZone;
  private final String targetDisk;
  private final Map<String, String> pathParams;

  private DiskMoveRequest() {
    this.destinationZone = null;
    this.targetDisk = null;
    this.pathParams = ImmutableMap.of();
  }


  private DiskMoveRequest(
      String destinationZone,
      String targetDisk
      ) {
    this.destinationZone = destinationZone;
    this.targetDisk = targetDisk;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("destinationZone") && destinationZone != null) {
      fieldMap.put("destinationZone", Collections.singletonList(String.valueOf(destinationZone)));
    }
    if (fieldNames.contains("targetDisk") && targetDisk != null) {
      fieldMap.put("targetDisk", Collections.singletonList(String.valueOf(targetDisk)));
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

  public String getTargetDisk() {
    return targetDisk;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(DiskMoveRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DiskMoveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final DiskMoveRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DiskMoveRequest();
  }

  public static class Builder {
    private String destinationZone;
    private String targetDisk;

    Builder() {}

    public Builder mergeFrom(DiskMoveRequest other) {
      if (other == DiskMoveRequest.getDefaultInstance()) return this;
      if (other.getDestinationZone() != null) {
        this.destinationZone = other.destinationZone;
      }
      if (other.getTargetDisk() != null) {
        this.targetDisk = other.targetDisk;
      }
      return this;
    }

    Builder(DiskMoveRequest source) {
      this.destinationZone = source.destinationZone;
      this.targetDisk = source.targetDisk;
    }

    public String getDestinationZone() {
      return destinationZone;
    }

    public Builder setDestinationZone(String destinationZone) {
      this.destinationZone = destinationZone;
      return this;
    }

    public String getTargetDisk() {
      return targetDisk;
    }

    public Builder setTargetDisk(String targetDisk) {
      this.targetDisk = targetDisk;
      return this;
    }


    public DiskMoveRequest build() {

      return new DiskMoveRequest(
        destinationZone,
        targetDisk
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDestinationZone(this.destinationZone);
      newBuilder.setTargetDisk(this.targetDisk);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DiskMoveRequest{"
        + "destinationZone=" + destinationZone + ", "
        + "targetDisk=" + targetDisk
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DiskMoveRequest) {
      DiskMoveRequest that = (DiskMoveRequest) o;
      return
          Objects.equals(this.destinationZone, that.getDestinationZone()) &&
          Objects.equals(this.targetDisk, that.getTargetDisk())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      destinationZone,
      targetDisk
    );
  }
}
