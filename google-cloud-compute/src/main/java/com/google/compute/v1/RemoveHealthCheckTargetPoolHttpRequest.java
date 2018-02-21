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
public final class RemoveHealthCheckTargetPoolHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String targetPool;
  private final TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource;
  private final String userIp;

  private RemoveHealthCheckTargetPoolHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.targetPool = null;
    this.targetPoolsRemoveHealthCheckRequestResource = null;
    this.userIp = null;
  }


  private RemoveHealthCheckTargetPoolHttpRequest(
      String access_token,
      String callback,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      String targetPool,
      TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource,
      String userIp
      ) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.targetPool = targetPool;
    this.targetPoolsRemoveHealthCheckRequestResource = targetPoolsRemoveHealthCheckRequestResource;
    this.userIp = userIp;
  }

  @Override
  public TargetPoolName resourceNamePath() {
    return TargetPoolName.parse(targetPool);
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
    if (fieldNames.contains("targetPool") && targetPool != null) {
      fieldMap.put("targetPool", Collections.singletonList(String.valueOf(targetPool)));
    }
    if (fieldNames.contains("targetPoolsRemoveHealthCheckRequestResource") && targetPoolsRemoveHealthCheckRequestResource != null) {
      fieldMap.put("targetPoolsRemoveHealthCheckRequestResource", Collections.singletonList(String.valueOf(targetPoolsRemoveHealthCheckRequestResource)));
    }
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public TargetPoolsRemoveHealthCheckRequest requestBody() {
    return targetPoolsRemoveHealthCheckRequestResource;
  }

  public String getAccessToken() {
    return access_token;
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

  public String getTargetPool() {
    return targetPool;
  }

  public TargetPoolsRemoveHealthCheckRequest getTargetPoolsRemoveHealthCheckRequestResource() {
    return targetPoolsRemoveHealthCheckRequestResource;
  }

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RemoveHealthCheckTargetPoolHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RemoveHealthCheckTargetPoolHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final RemoveHealthCheckTargetPoolHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RemoveHealthCheckTargetPoolHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String targetPool;
    private TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(RemoveHealthCheckTargetPoolHttpRequest other) {
      if (other == RemoveHealthCheckTargetPoolHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
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
      if (other.getTargetPool() != null) {
        this.targetPool = other.targetPool;
      }
      if (other.getTargetPoolsRemoveHealthCheckRequestResource() != null) {
        this.targetPoolsRemoveHealthCheckRequestResource = other.targetPoolsRemoveHealthCheckRequestResource;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(RemoveHealthCheckTargetPoolHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.targetPool = source.targetPool;
      this.targetPoolsRemoveHealthCheckRequestResource = source.targetPoolsRemoveHealthCheckRequestResource;
      this.userIp = source.userIp;
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

    public String getTargetPool() {
      return targetPool;
    }

    public Builder setTargetPool(String targetPool) {
      this.targetPool = targetPool;
      return this;
    }

    public TargetPoolsRemoveHealthCheckRequest getTargetPoolsRemoveHealthCheckRequestResource() {
      return targetPoolsRemoveHealthCheckRequestResource;
    }

    public Builder setTargetPoolsRemoveHealthCheckRequestResource(TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource) {
      this.targetPoolsRemoveHealthCheckRequestResource = targetPoolsRemoveHealthCheckRequestResource;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public RemoveHealthCheckTargetPoolHttpRequest build() {
      String missing = "";






      if (targetPool == null) {
        missing += " targetPool";
      }


      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new RemoveHealthCheckTargetPoolHttpRequest(
        access_token,
        callback,
        fields,
        key,
        prettyPrint,
        quotaUser,
        targetPool,
        targetPoolsRemoveHealthCheckRequestResource,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setTargetPool(this.targetPool);
      newBuilder.setTargetPoolsRemoveHealthCheckRequestResource(this.targetPoolsRemoveHealthCheckRequestResource);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RemoveHealthCheckTargetPoolHttpRequest{"
        + "access_token=" + access_token + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "quotaUser=" + quotaUser + ", "
        + "targetPool=" + targetPool + ", "
        + "targetPoolsRemoveHealthCheckRequestResource=" + targetPoolsRemoveHealthCheckRequestResource + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RemoveHealthCheckTargetPoolHttpRequest) {
      RemoveHealthCheckTargetPoolHttpRequest that = (RemoveHealthCheckTargetPoolHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.targetPool, that.getTargetPool()) &&
          Objects.equals(this.targetPoolsRemoveHealthCheckRequestResource, that.getTargetPoolsRemoveHealthCheckRequestResource()) &&
          Objects.equals(this.userIp, that.getUserIp())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access_token,
      callback,
      fields,
      key,
      prettyPrint,
      quotaUser,
      targetPool,
      targetPoolsRemoveHealthCheckRequestResource,
      userIp
    );
  }
}
