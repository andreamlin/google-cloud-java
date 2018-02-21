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
public final class AccessConfig implements ApiMessage {
  private final String kind;
  private final String name;
  private final String natIP;
  private final String type;

  private AccessConfig() {
    this.kind = null;
    this.name = null;
    this.natIP = null;
    this.type = null;
  }


  private AccessConfig(
      String kind,
      String name,
      String natIP,
      String type
      ) {
    this.kind = kind;
    this.name = name;
    this.natIP = natIP;
    this.type = type;
  }

  @Override
  public ResourceNamePath resourceNamePath() {
    return null;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("natIP") && natIP != null) {
      fieldMap.put("natIP", Collections.singletonList(String.valueOf(natIP)));
    }
    if (fieldNames.contains("type") && type != null) {
      fieldMap.put("type", Collections.singletonList(String.valueOf(type)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public String getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public String getNatIP() {
    return natIP;
  }

  public String getType() {
    return type;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AccessConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AccessConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final AccessConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AccessConfig();
  }

  public static class Builder {
    private String kind;
    private String name;
    private String natIP;
    private String type;

    Builder() {}

    public Builder mergeFrom(AccessConfig other) {
      if (other == AccessConfig.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNatIP() != null) {
        this.natIP = other.natIP;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(AccessConfig source) {
      this.kind = source.kind;
      this.name = source.name;
      this.natIP = source.natIP;
      this.type = source.type;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public String getNatIP() {
      return natIP;
    }

    public Builder setNatIP(String natIP) {
      this.natIP = natIP;
      return this;
    }

    public String getType() {
      return type;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }


    public AccessConfig build() {



      return new AccessConfig(
        kind,
        name,
        natIP,
        type
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNatIP(this.natIP);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AccessConfig{"
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "natIP=" + natIP + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AccessConfig) {
      AccessConfig that = (AccessConfig) o;
      return
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.natIP, that.getNatIP()) &&
          Objects.equals(this.type, that.getType())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      kind,
      name,
      natIP,
      type
    );
  }
}
