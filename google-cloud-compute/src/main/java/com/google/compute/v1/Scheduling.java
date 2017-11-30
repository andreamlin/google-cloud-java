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
public final class Scheduling implements ApiMessage {
  private final Boolean automaticRestart;
  private final String onHostMaintenance;
  private final Boolean preemptible;

  private Scheduling() {
    this.automaticRestart = null;
    this.onHostMaintenance = null;
    this.preemptible = null;
  }


  private Scheduling(
      Boolean automaticRestart,
      String onHostMaintenance,
      Boolean preemptible
      ) {
    this.automaticRestart = automaticRestart;
    this.onHostMaintenance = onHostMaintenance;
    this.preemptible = preemptible;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("automaticRestart") && automaticRestart != null) {
      fieldMap.put("automaticRestart", Collections.singletonList(String.valueOf(automaticRestart)));
    }
    if (fieldNames.contains("onHostMaintenance") && onHostMaintenance != null) {
      fieldMap.put("onHostMaintenance", Collections.singletonList(String.valueOf(onHostMaintenance)));
    }
    if (fieldNames.contains("preemptible") && preemptible != null) {
      fieldMap.put("preemptible", Collections.singletonList(String.valueOf(preemptible)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public Boolean getAutomaticRestart() {
    return automaticRestart;
  }

  public String getOnHostMaintenance() {
    return onHostMaintenance;
  }

  public Boolean getPreemptible() {
    return preemptible;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Scheduling prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Scheduling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Scheduling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Scheduling();
  }

  public static class Builder {
    private Boolean automaticRestart;
    private String onHostMaintenance;
    private Boolean preemptible;

    Builder() {}

    public Builder mergeFrom(Scheduling other) {
      if (other == Scheduling.getDefaultInstance()) return this;
      if (other.getAutomaticRestart() != null) {
        this.automaticRestart = other.automaticRestart;
      }
      if (other.getOnHostMaintenance() != null) {
        this.onHostMaintenance = other.onHostMaintenance;
      }
      if (other.getPreemptible() != null) {
        this.preemptible = other.preemptible;
      }
      return this;
    }

    Builder(Scheduling source) {
      this.automaticRestart = source.automaticRestart;
      this.onHostMaintenance = source.onHostMaintenance;
      this.preemptible = source.preemptible;
    }

    public Boolean getAutomaticRestart() {
      return automaticRestart;
    }

    public Builder setAutomaticRestart(Boolean automaticRestart) {
      this.automaticRestart = automaticRestart;
      return this;
    }

    public String getOnHostMaintenance() {
      return onHostMaintenance;
    }

    public Builder setOnHostMaintenance(String onHostMaintenance) {
      this.onHostMaintenance = onHostMaintenance;
      return this;
    }

    public Boolean getPreemptible() {
      return preemptible;
    }

    public Builder setPreemptible(Boolean preemptible) {
      this.preemptible = preemptible;
      return this;
    }


    public Scheduling build() {


      return new Scheduling(
        automaticRestart,
        onHostMaintenance,
        preemptible
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAutomaticRestart(this.automaticRestart);
      newBuilder.setOnHostMaintenance(this.onHostMaintenance);
      newBuilder.setPreemptible(this.preemptible);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Scheduling{"
        + "automaticRestart=" + automaticRestart + ", "
        + "onHostMaintenance=" + onHostMaintenance + ", "
        + "preemptible=" + preemptible
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Scheduling) {
      Scheduling that = (Scheduling) o;
      return
          Objects.equals(this.automaticRestart, that.getAutomaticRestart()) &&
          Objects.equals(this.onHostMaintenance, that.getOnHostMaintenance()) &&
          Objects.equals(this.preemptible, that.getPreemptible())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      automaticRestart,
      onHostMaintenance,
      preemptible
    );
  }
}