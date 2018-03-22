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
public final class InsertDiskHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final Disk diskResource;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String sourceImage;
  private final String userIp;
  private final String zone;

  private InsertDiskHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.diskResource = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.sourceImage = null;
    this.userIp = null;
    this.zone = null;
  }


  private InsertDiskHttpRequest(
      String access_token,
      String callback,
      Disk diskResource,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      String sourceImage,
      String userIp,
      String zone
      ) {
    this.access_token = access_token;
    this.callback = callback;
    this.diskResource = diskResource;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.sourceImage = sourceImage;
    this.userIp = userIp;
    this.zone = zone;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("access_token") && access_token != null) {
      fieldMap.put("access_token", Collections.singletonList(String.valueOf(access_token)));
    }
    if (fieldNames.contains("callback") && callback != null) {
      fieldMap.put("callback", Collections.singletonList(String.valueOf(callback)));
    }
    if (fieldNames.contains("diskResource") && diskResource != null) {
      fieldMap.put("diskResource", Collections.singletonList(String.valueOf(diskResource)));
    }
    if (fieldNames.contains("fields") && fields != null) {
      fieldMap.put("fields", Collections.singletonList(String.valueOf(fields)));
    }
    if (fieldNames.contains("key") && key != null) {
      fieldMap.put("key", Collections.singletonList(String.valueOf(key)));
    }
    if (fieldNames.contains("prettyPrint") && prettyPrint != null) {
      fieldMap.put("prettyPrint", Collections.singletonList(String.valueOf(prettyPrint)));
    }
    if (fieldNames.contains("quotaUser") && quotaUser != null) {
      fieldMap.put("quotaUser", Collections.singletonList(String.valueOf(quotaUser)));
    }
    if (fieldNames.contains("sourceImage") && sourceImage != null) {
      fieldMap.put("sourceImage", Collections.singletonList(String.valueOf(sourceImage)));
    }
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    if (fieldNames.contains("zone") && zone != null) {
      fieldMap.put("zone", Collections.singletonList(String.valueOf(zone)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("access_token")) {
      return String.valueOf(access_token);
    }
    if (fieldName.equals("callback")) {
      return String.valueOf(callback);
    }
    if (fieldName.equals("diskResource")) {
      return String.valueOf(diskResource);
    }
    if (fieldName.equals("fields")) {
      return String.valueOf(fields);
    }
    if (fieldName.equals("key")) {
      return String.valueOf(key);
    }
    if (fieldName.equals("prettyPrint")) {
      return String.valueOf(prettyPrint);
    }
    if (fieldName.equals("quotaUser")) {
      return String.valueOf(quotaUser);
    }
    if (fieldName.equals("sourceImage")) {
      return String.valueOf(sourceImage);
    }
    if (fieldName.equals("userIp")) {
      return String.valueOf(userIp);
    }
    if (fieldName.equals("zone")) {
      return String.valueOf(zone);
    }
    return null;
  }

  @Nullable
  @Override
  public Disk getApiMessageRequestBody() {
    return diskResource;
  }

  public String getAccessToken() {
    return access_token;
  }

  public String getCallback() {
    return callback;
  }

  public Disk getDiskResource() {
    return diskResource;
  }

  public String getFields() {
    return fields;
  }

  public String getKey() {
    return key;
  }

  public String getPrettyPrint() {
    return prettyPrint;
  }

  public String getQuotaUser() {
    return quotaUser;
  }

  public String getSourceImage() {
    return sourceImage;
  }

  public String getUserIp() {
    return userIp;
  }

  public String getZone() {
    return zone;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InsertDiskHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InsertDiskHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InsertDiskHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InsertDiskHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private Disk diskResource;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String sourceImage;
    private String userIp;
    private String zone;

    Builder() {}

    public Builder mergeFrom(InsertDiskHttpRequest other) {
      if (other == InsertDiskHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getDiskResource() != null) {
        this.diskResource = other.diskResource;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getSourceImage() != null) {
        this.sourceImage = other.sourceImage;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      if (other.getZone() != null) {
        this.zone = other.zone;
      }
      return this;
    }

    Builder(InsertDiskHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.diskResource = source.diskResource;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.sourceImage = source.sourceImage;
      this.userIp = source.userIp;
      this.zone = source.zone;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public Disk getDiskResource() {
      return diskResource;
    }

    public Builder setDiskResource(Disk diskResource) {
      this.diskResource = diskResource;
      return this;
    }

    public String getFields() {
      return fields;
    }

    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    public String getKey() {
      return key;
    }

    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    public String getPrettyPrint() {
      return prettyPrint;
    }

    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    public String getQuotaUser() {
      return quotaUser;
    }

    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    public String getSourceImage() {
      return sourceImage;
    }

    public Builder setSourceImage(String sourceImage) {
      this.sourceImage = sourceImage;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public String getZone() {
      return zone;
    }

    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }


    public InsertDiskHttpRequest build() {
      String missing = "";









      if (zone == null) {
        missing += " zone";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new InsertDiskHttpRequest(
        access_token,
        callback,
        diskResource,
        fields,
        key,
        prettyPrint,
        quotaUser,
        sourceImage,
        userIp,
        zone
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setDiskResource(this.diskResource);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setSourceImage(this.sourceImage);
      newBuilder.setUserIp(this.userIp);
      newBuilder.setZone(this.zone);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InsertDiskHttpRequest{"
        + "access_token=" + access_token + ", "
        + "callback=" + callback + ", "
        + "diskResource=" + diskResource + ", "
        + "fields=" + fields + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "quotaUser=" + quotaUser + ", "
        + "sourceImage=" + sourceImage + ", "
        + "userIp=" + userIp + ", "
        + "zone=" + zone
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InsertDiskHttpRequest) {
      InsertDiskHttpRequest that = (InsertDiskHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.diskResource, that.getDiskResource()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.sourceImage, that.getSourceImage()) &&
          Objects.equals(this.userIp, that.getUserIp()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access_token,
      callback,
      diskResource,
      fields,
      key,
      prettyPrint,
      quotaUser,
      sourceImage,
      userIp,
      zone
    );
  }
}
