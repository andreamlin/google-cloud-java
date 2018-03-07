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
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class Quota implements ApiMessage {
  private final Double limit;
  private final String metric;
  private final Double usage;

  private Quota() {
    this.limit = null;
    this.metric = null;
    this.usage = null;
  }


  private Quota(
      Double limit,
      String metric,
      Double usage
      ) {
    this.limit = limit;
    this.metric = metric;
    this.usage = usage;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("limit") && limit != null) {
      fieldMap.put("limit", Collections.singletonList(String.valueOf(limit)));
    }
    if (fieldNames.contains("metric") && metric != null) {
      fieldMap.put("metric", Collections.singletonList(String.valueOf(metric)));
    }
    if (fieldNames.contains("usage") && usage != null) {
      fieldMap.put("usage", Collections.singletonList(String.valueOf(usage)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("limit")) {
      return String.valueOf(limit);
    }
    if (fieldName.equals("metric")) {
      return String.valueOf(metric);
    }
    if (fieldName.equals("usage")) {
      return String.valueOf(usage);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public Double getLimit() {
    return limit;
  }

  public String getMetric() {
    return metric;
  }

  public Double getUsage() {
    return usage;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Quota prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Quota getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Quota DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Quota();
  }

  public static class Builder {
    private Double limit;
    private String metric;
    private Double usage;

    Builder() {}

    public Builder mergeFrom(Quota other) {
      if (other == Quota.getDefaultInstance()) return this;
      if (other.getLimit() != null) {
        this.limit = other.limit;
      }
      if (other.getMetric() != null) {
        this.metric = other.metric;
      }
      if (other.getUsage() != null) {
        this.usage = other.usage;
      }
      return this;
    }

    Builder(Quota source) {
      this.limit = source.limit;
      this.metric = source.metric;
      this.usage = source.usage;
    }

    public Double getLimit() {
      return limit;
    }

    public Builder setLimit(Double limit) {
      this.limit = limit;
      return this;
    }

    public String getMetric() {
      return metric;
    }

    public Builder setMetric(String metric) {
      this.metric = metric;
      return this;
    }

    public Double getUsage() {
      return usage;
    }

    public Builder setUsage(Double usage) {
      this.usage = usage;
      return this;
    }


    public Quota build() {


      return new Quota(
        limit,
        metric,
        usage
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setLimit(this.limit);
      newBuilder.setMetric(this.metric);
      newBuilder.setUsage(this.usage);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Quota{"
        + "limit=" + limit + ", "
        + "metric=" + metric + ", "
        + "usage=" + usage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Quota) {
      Quota that = (Quota) o;
      return
          Objects.equals(this.limit, that.getLimit()) &&
          Objects.equals(this.metric, that.getMetric()) &&
          Objects.equals(this.usage, that.getUsage())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      limit,
      metric,
      usage
    );
  }
}
