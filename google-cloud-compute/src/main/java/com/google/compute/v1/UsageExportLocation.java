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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
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
public final class UsageExportLocation implements ApiMessage {
  private final String bucketName;
  private final String reportNamePrefix;

  private UsageExportLocation() {
    this.bucketName = null;
    this.reportNamePrefix = null;
  }


  private UsageExportLocation(
      String bucketName,
      String reportNamePrefix
      ) {
    this.bucketName = bucketName;
    this.reportNamePrefix = reportNamePrefix;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("bucketName") && bucketName != null) {
      fieldMap.put("bucketName", Collections.singletonList(String.valueOf(bucketName)));
    }
    if (fieldNames.contains("reportNamePrefix") && reportNamePrefix != null) {
      fieldMap.put("reportNamePrefix", Collections.singletonList(String.valueOf(reportNamePrefix)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("bucketName")) {
      return String.valueOf(bucketName);
    }
    if (fieldName.equals("reportNamePrefix")) {
      return String.valueOf(reportNamePrefix);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getBucketName() {
    return bucketName;
  }

  public String getReportNamePrefix() {
    return reportNamePrefix;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UsageExportLocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static UsageExportLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final UsageExportLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UsageExportLocation();
  }

  public static class Builder {
    private String bucketName;
    private String reportNamePrefix;

    Builder() {}

    public Builder mergeFrom(UsageExportLocation other) {
      if (other == UsageExportLocation.getDefaultInstance()) return this;
      if (other.getBucketName() != null) {
        this.bucketName = other.bucketName;
      }
      if (other.getReportNamePrefix() != null) {
        this.reportNamePrefix = other.reportNamePrefix;
      }
      return this;
    }

    Builder(UsageExportLocation source) {
      this.bucketName = source.bucketName;
      this.reportNamePrefix = source.reportNamePrefix;
    }

    public String getBucketName() {
      return bucketName;
    }

    public Builder setBucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    public String getReportNamePrefix() {
      return reportNamePrefix;
    }

    public Builder setReportNamePrefix(String reportNamePrefix) {
      this.reportNamePrefix = reportNamePrefix;
      return this;
    }


    public UsageExportLocation build() {

      return new UsageExportLocation(
        bucketName,
        reportNamePrefix
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setBucketName(this.bucketName);
      newBuilder.setReportNamePrefix(this.reportNamePrefix);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "UsageExportLocation{"
        + "bucketName=" + bucketName + ", "
        + "reportNamePrefix=" + reportNamePrefix
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UsageExportLocation) {
      UsageExportLocation that = (UsageExportLocation) o;
      return
          Objects.equals(this.bucketName, that.getBucketName()) &&
          Objects.equals(this.reportNamePrefix, that.getReportNamePrefix())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      bucketName,
      reportNamePrefix
    );
  }
}
