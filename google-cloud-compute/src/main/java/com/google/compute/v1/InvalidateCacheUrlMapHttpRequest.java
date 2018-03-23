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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InvalidateCacheUrlMapHttpRequest implements ApiMessage {
  private final String access_token;
  private final CacheInvalidationRule cacheInvalidationRuleResource;
  private final String callback;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String urlMap;
  private final String userIp;

  private InvalidateCacheUrlMapHttpRequest() {
    this.access_token = null;
    this.cacheInvalidationRuleResource = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.urlMap = null;
    this.userIp = null;
  }


  private InvalidateCacheUrlMapHttpRequest(
      String access_token,
      CacheInvalidationRule cacheInvalidationRuleResource,
      String callback,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      String urlMap,
      String userIp
      ) {
    this.access_token = access_token;
    this.cacheInvalidationRuleResource = cacheInvalidationRuleResource;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.urlMap = urlMap;
    this.userIp = userIp;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("access_token") && access_token != null) {
      fieldMap.put("access_token", Collections.singletonList(String.valueOf(access_token)));
    }
    if (fieldNames.contains("cacheInvalidationRuleResource") && cacheInvalidationRuleResource != null) {
      fieldMap.put("cacheInvalidationRuleResource", Collections.singletonList(String.valueOf(cacheInvalidationRuleResource)));
    }
    if (fieldNames.contains("callback") && callback != null) {
      fieldMap.put("callback", Collections.singletonList(String.valueOf(callback)));
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
    if (fieldNames.contains("urlMap") && urlMap != null) {
      fieldMap.put("urlMap", Collections.singletonList(String.valueOf(urlMap)));
    }
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("access_token")) {
      return String.valueOf(access_token);
    }
    if (fieldName.equals("cacheInvalidationRuleResource")) {
      return String.valueOf(cacheInvalidationRuleResource);
    }
    if (fieldName.equals("callback")) {
      return String.valueOf(callback);
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
    if (fieldName.equals("urlMap")) {
      return String.valueOf(urlMap);
    }
    if (fieldName.equals("userIp")) {
      return String.valueOf(userIp);
    }
    return null;
  }

  @Nullable
  @Override
  public CacheInvalidationRule getApiMessageRequestBody() {
    return cacheInvalidationRuleResource;
  }

  public String getAccessToken() {
    return access_token;
  }

  public CacheInvalidationRule getCacheInvalidationRuleResource() {
    return cacheInvalidationRuleResource;
  }

  public String getCallback() {
    return callback;
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

  public String getUrlMap() {
    return urlMap;
  }

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InvalidateCacheUrlMapHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InvalidateCacheUrlMapHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InvalidateCacheUrlMapHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InvalidateCacheUrlMapHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private CacheInvalidationRule cacheInvalidationRuleResource;
    private String callback;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String urlMap;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(InvalidateCacheUrlMapHttpRequest other) {
      if (other == InvalidateCacheUrlMapHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCacheInvalidationRuleResource() != null) {
        this.cacheInvalidationRuleResource = other.cacheInvalidationRuleResource;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
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
      if (other.getUrlMap() != null) {
        this.urlMap = other.urlMap;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(InvalidateCacheUrlMapHttpRequest source) {
      this.access_token = source.access_token;
      this.cacheInvalidationRuleResource = source.cacheInvalidationRuleResource;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.urlMap = source.urlMap;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public CacheInvalidationRule getCacheInvalidationRuleResource() {
      return cacheInvalidationRuleResource;
    }

    public Builder setCacheInvalidationRuleResource(CacheInvalidationRule cacheInvalidationRuleResource) {
      this.cacheInvalidationRuleResource = cacheInvalidationRuleResource;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
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

    public String getUrlMap() {
      return urlMap;
    }

    public Builder setUrlMap(String urlMap) {
      this.urlMap = urlMap;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public InvalidateCacheUrlMapHttpRequest build() {
      String missing = "";







      if (urlMap == null) {
        missing += " urlMap";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new InvalidateCacheUrlMapHttpRequest(
        access_token,
        cacheInvalidationRuleResource,
        callback,
        fields,
        key,
        prettyPrint,
        quotaUser,
        urlMap,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCacheInvalidationRuleResource(this.cacheInvalidationRuleResource);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setUrlMap(this.urlMap);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InvalidateCacheUrlMapHttpRequest{"
        + "access_token=" + access_token + ", "
        + "cacheInvalidationRuleResource=" + cacheInvalidationRuleResource + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "quotaUser=" + quotaUser + ", "
        + "urlMap=" + urlMap + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InvalidateCacheUrlMapHttpRequest) {
      InvalidateCacheUrlMapHttpRequest that = (InvalidateCacheUrlMapHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.cacheInvalidationRuleResource, that.getCacheInvalidationRuleResource()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.urlMap, that.getUrlMap()) &&
          Objects.equals(this.userIp, that.getUserIp())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access_token,
      cacheInvalidationRuleResource,
      callback,
      fields,
      key,
      prettyPrint,
      quotaUser,
      urlMap,
      userIp
    );
  }
}
