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
public final class PatchRegionAutoscalerHttpRequest implements ApiMessage {
  private final String access_token;
  private final String autoscaler;
  private final Autoscaler autoscalerResource;
  private final String callback;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String region;
  private final String userIp;
  private final Map<String, String> pathParams;

  private PatchRegionAutoscalerHttpRequest() {
    this.access_token = null;
    this.autoscaler = null;
    this.autoscalerResource = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.region = null;
    this.userIp = null;
    this.pathParams = ImmutableMap.of();
  }


  private PatchRegionAutoscalerHttpRequest(
      String access_token,
      String autoscaler,
      Autoscaler autoscalerResource,
      String callback,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      String region,
      String userIp
      ) {
    this.access_token = access_token;
    this.autoscaler = autoscaler;
    this.autoscalerResource = autoscalerResource;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.region = region;
    this.userIp = userIp;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    RegionName resourceName = RegionName.parse(region);
    mapBuilder.put("project", resourceName.getProject());
    mapBuilder.put("region", resourceName.getRegion());
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("access_token") && access_token != null) {
      fieldMap.put("access_token", Collections.singletonList(String.valueOf(access_token)));
    }
    if (fieldNames.contains("autoscaler") && autoscaler != null) {
      fieldMap.put("autoscaler", Collections.singletonList(String.valueOf(autoscaler)));
    }
    if (fieldNames.contains("autoscalerResource") && autoscalerResource != null) {
      fieldMap.put("autoscalerResource", Collections.singletonList(String.valueOf(autoscalerResource)));
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
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    return fieldMap;
  }

  @Override
  public Map<String, String> pathParams() {
    return pathParams;
  }

  @Nullable
  @Override
  public Autoscaler requestBody() {
    return autoscalerResource;
  }

  public String getAccessToken() {
    return access_token;
  }

  public String getAutoscaler() {
    return autoscaler;
  }

  public Autoscaler getAutoscalerResource() {
    return autoscalerResource;
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

  public String getRegion() {
    return region;
  }

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(PatchRegionAutoscalerHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PatchRegionAutoscalerHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final PatchRegionAutoscalerHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PatchRegionAutoscalerHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String autoscaler;
    private Autoscaler autoscalerResource;
    private String callback;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String region;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(PatchRegionAutoscalerHttpRequest other) {
      if (other == PatchRegionAutoscalerHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getAutoscaler() != null) {
        this.autoscaler = other.autoscaler;
      }
      if (other.getAutoscalerResource() != null) {
        this.autoscalerResource = other.autoscalerResource;
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
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(PatchRegionAutoscalerHttpRequest source) {
      this.access_token = source.access_token;
      this.autoscaler = source.autoscaler;
      this.autoscalerResource = source.autoscalerResource;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.region = source.region;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public String getAutoscaler() {
      return autoscaler;
    }

    public Builder setAutoscaler(String autoscaler) {
      this.autoscaler = autoscaler;
      return this;
    }

    public Autoscaler getAutoscalerResource() {
      return autoscalerResource;
    }

    public Builder setAutoscalerResource(Autoscaler autoscalerResource) {
      this.autoscalerResource = autoscalerResource;
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

    public String getRegion() {
      return region;
    }

    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public PatchRegionAutoscalerHttpRequest build() {
      String missing = "";

      if (autoscaler == null) {
        missing += " autoscaler";
      }






      if (region == null) {
        missing += " region";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new PatchRegionAutoscalerHttpRequest(
        access_token,
        autoscaler,
        autoscalerResource,
        callback,
        fields,
        key,
        prettyPrint,
        quotaUser,
        region,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setAutoscaler(this.autoscaler);
      newBuilder.setAutoscalerResource(this.autoscalerResource);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRegion(this.region);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PatchRegionAutoscalerHttpRequest{"
        + "access_token=" + access_token + ", "
        + "autoscaler=" + autoscaler + ", "
        + "autoscalerResource=" + autoscalerResource + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "quotaUser=" + quotaUser + ", "
        + "region=" + region + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PatchRegionAutoscalerHttpRequest) {
      PatchRegionAutoscalerHttpRequest that = (PatchRegionAutoscalerHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.autoscaler, that.getAutoscaler()) &&
          Objects.equals(this.autoscalerResource, that.getAutoscalerResource()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.userIp, that.getUserIp())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access_token,
      autoscaler,
      autoscalerResource,
      callback,
      fields,
      key,
      prettyPrint,
      quotaUser,
      region,
      userIp
    );
  }
}
