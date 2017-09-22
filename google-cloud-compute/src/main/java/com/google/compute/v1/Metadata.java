/*
 * Copyright 2017, Google Inc. All rights reserved.
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
public final class Metadata implements ApiMessage {
  private final String fingerprint;
  private final List<Items> items;
  private final String kind;

  private Metadata() {
    this.fingerprint = null;
    this.items = null;
    this.kind = null;
  }


  private Metadata(
      String fingerprint,
      List<Items> items,
      String kind
      ) {
    this.fingerprint = fingerprint;
    this.items = items;
    this.kind = kind;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("fingerprint") && fingerprint != null) {
      fieldMap.put("fingerprint", Collections.singletonList(String.valueOf(fingerprint)));
    }
    if (fieldNames.contains("items") && items != null) {
      fieldMap.put("items", Collections.singletonList(String.valueOf(items)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
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

  public List<Items> getItems() {
    return items;
  }

  public String getKind() {
    return kind;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Metadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Metadata();
  }

  public static class Builder {
    private String fingerprint;
    private List<Items> items;
    private String kind;

    Builder() {}

    public Builder mergeFrom(Metadata other) {
      if (other == Metadata.getDefaultInstance()) return this;
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getItems() != null) {
        this.items = other.items;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      return this;
    }

    Builder(Metadata source) {
      this.fingerprint = source.fingerprint;
      this.items = source.items;
      this.kind = source.kind;
    }

    public String getFingerprint() {
      return fingerprint;
    }

    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    public List<Items> getItems() {
      return items;
    }

    public Builder setItems(List<Items> items) {
      this.items = items;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }


    public Metadata build() {


      return new Metadata(
        fingerprint,
        items,
        kind
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.setItems(this.items);
      newBuilder.setKind(this.kind);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Metadata{"
        + "fingerprint=" + fingerprint + ", "
        + "items=" + items + ", "
        + "kind=" + kind
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Metadata) {
      Metadata that = (Metadata) o;
      return
          Objects.equals(this.fingerprint, that.getFingerprint()) &&
          Objects.equals(this.items, that.getItems()) &&
          Objects.equals(this.kind, that.getKind())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      fingerprint,
      items,
      kind
    );
  }
}
