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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
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
public final class Reference implements ApiMessage {
  private final String kind;
  private final String referenceType;
  private final String referrer;
  private final String target;

  private Reference() {
    this.kind = null;
    this.referenceType = null;
    this.referrer = null;
    this.target = null;
  }


  private Reference(
      String kind,
      String referenceType,
      String referrer,
      String target
      ) {
    this.kind = kind;
    this.referenceType = referenceType;
    this.referrer = referrer;
    this.target = target;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("referenceType") && referenceType != null) {
      fieldMap.put("referenceType", Collections.singletonList(String.valueOf(referenceType)));
    }
    if (fieldNames.contains("referrer") && referrer != null) {
      fieldMap.put("referrer", Collections.singletonList(String.valueOf(referrer)));
    }
    if (fieldNames.contains("target") && target != null) {
      fieldMap.put("target", Collections.singletonList(String.valueOf(target)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("kind")) {
      return String.valueOf(kind);
    }
    if (fieldName.equals("referenceType")) {
      return String.valueOf(referenceType);
    }
    if (fieldName.equals("referrer")) {
      return String.valueOf(referrer);
    }
    if (fieldName.equals("target")) {
      return String.valueOf(target);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getKind() {
    return kind;
  }

  public String getReferenceType() {
    return referenceType;
  }

  public String getReferrer() {
    return referrer;
  }

  public String getTarget() {
    return target;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Reference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Reference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Reference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Reference();
  }

  public static class Builder {
    private String kind;
    private String referenceType;
    private String referrer;
    private String target;

    Builder() {}

    public Builder mergeFrom(Reference other) {
      if (other == Reference.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getReferenceType() != null) {
        this.referenceType = other.referenceType;
      }
      if (other.getReferrer() != null) {
        this.referrer = other.referrer;
      }
      if (other.getTarget() != null) {
        this.target = other.target;
      }
      return this;
    }

    Builder(Reference source) {
      this.kind = source.kind;
      this.referenceType = source.referenceType;
      this.referrer = source.referrer;
      this.target = source.target;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getReferenceType() {
      return referenceType;
    }

    public Builder setReferenceType(String referenceType) {
      this.referenceType = referenceType;
      return this;
    }

    public String getReferrer() {
      return referrer;
    }

    public Builder setReferrer(String referrer) {
      this.referrer = referrer;
      return this;
    }

    public String getTarget() {
      return target;
    }

    public Builder setTarget(String target) {
      this.target = target;
      return this;
    }


    public Reference build() {



      return new Reference(
        kind,
        referenceType,
        referrer,
        target
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.setReferenceType(this.referenceType);
      newBuilder.setReferrer(this.referrer);
      newBuilder.setTarget(this.target);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Reference{"
        + "kind=" + kind + ", "
        + "referenceType=" + referenceType + ", "
        + "referrer=" + referrer + ", "
        + "target=" + target
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Reference) {
      Reference that = (Reference) o;
      return
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.referenceType, that.getReferenceType()) &&
          Objects.equals(this.referrer, that.getReferrer()) &&
          Objects.equals(this.target, that.getTarget())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      kind,
      referenceType,
      referrer,
      target
    );
  }
}
