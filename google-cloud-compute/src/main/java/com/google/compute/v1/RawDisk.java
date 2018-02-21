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
import com.google.api.gax.httpjson.ResourceNamePath;
import com.google.api.resourcenames.ResourceName;
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
public final class RawDisk implements ApiMessage {
  private final String containerType;
  private final String sha1Checksum;
  private final String source;

  private RawDisk() {
    this.containerType = null;
    this.sha1Checksum = null;
    this.source = null;
  }


  private RawDisk(
      String containerType,
      String sha1Checksum,
      String source
      ) {
    this.containerType = containerType;
    this.sha1Checksum = sha1Checksum;
    this.source = source;
  }

  @Override
  public ResourceNamePath resourceNamePath() {
    return null;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("containerType") && containerType != null) {
      fieldMap.put("containerType", Collections.singletonList(String.valueOf(containerType)));
    }
    if (fieldNames.contains("sha1Checksum") && sha1Checksum != null) {
      fieldMap.put("sha1Checksum", Collections.singletonList(String.valueOf(sha1Checksum)));
    }
    if (fieldNames.contains("source") && source != null) {
      fieldMap.put("source", Collections.singletonList(String.valueOf(source)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public String getContainerType() {
    return containerType;
  }

  public String getSha1Checksum() {
    return sha1Checksum;
  }

  public String getSource() {
    return source;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RawDisk prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RawDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RawDisk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RawDisk();
  }

  public static class Builder {
    private String containerType;
    private String sha1Checksum;
    private String source;

    Builder() {}

    public Builder mergeFrom(RawDisk other) {
      if (other == RawDisk.getDefaultInstance()) return this;
      if (other.getContainerType() != null) {
        this.containerType = other.containerType;
      }
      if (other.getSha1Checksum() != null) {
        this.sha1Checksum = other.sha1Checksum;
      }
      if (other.getSource() != null) {
        this.source = other.source;
      }
      return this;
    }

    Builder(RawDisk source) {
      this.containerType = source.containerType;
      this.sha1Checksum = source.sha1Checksum;
      this.source = source.source;
    }

    public String getContainerType() {
      return containerType;
    }

    public Builder setContainerType(String containerType) {
      this.containerType = containerType;
      return this;
    }

    public String getSha1Checksum() {
      return sha1Checksum;
    }

    public Builder setSha1Checksum(String sha1Checksum) {
      this.sha1Checksum = sha1Checksum;
      return this;
    }

    public String getSource() {
      return source;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }


    public RawDisk build() {


      return new RawDisk(
        containerType,
        sha1Checksum,
        source
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setContainerType(this.containerType);
      newBuilder.setSha1Checksum(this.sha1Checksum);
      newBuilder.setSource(this.source);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RawDisk{"
        + "containerType=" + containerType + ", "
        + "sha1Checksum=" + sha1Checksum + ", "
        + "source=" + source
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RawDisk) {
      RawDisk that = (RawDisk) o;
      return
          Objects.equals(this.containerType, that.getContainerType()) &&
          Objects.equals(this.sha1Checksum, that.getSha1Checksum()) &&
          Objects.equals(this.source, that.getSource())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      containerType,
      sha1Checksum,
      source
    );
  }
}
