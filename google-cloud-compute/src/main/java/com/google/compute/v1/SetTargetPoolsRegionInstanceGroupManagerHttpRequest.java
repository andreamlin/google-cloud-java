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
public final class SetTargetPoolsRegionInstanceGroupManagerHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String instanceGroupManager;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequestResource;
  private final String userIp;
  private final Map<String, String> pathParams;

  private SetTargetPoolsRegionInstanceGroupManagerHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.instanceGroupManager = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.regionInstanceGroupManagersSetTargetPoolsRequestResource = null;
    this.userIp = null;
    this.pathParams = ImmutableMap.of();
  }


  private SetTargetPoolsRegionInstanceGroupManagerHttpRequest(
      String access_token,
      String callback,
      String fields,
      String instanceGroupManager,
      String key,
      String prettyPrint,
      String quotaUser,
      RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequestResource,
      String userIp
      ) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.instanceGroupManager = instanceGroupManager;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.regionInstanceGroupManagersSetTargetPoolsRequestResource = regionInstanceGroupManagersSetTargetPoolsRequestResource;
    this.userIp = userIp;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    RegionInstanceGroupManagersInstanceGroupManagerName resourceName = RegionInstanceGroupManagersInstanceGroupManagerName.parse(instanceGroupManager);
    mapBuilder.put("instanceGroupManager", resourceName.getInstanceGroupManager());
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
    if (fieldNames.contains("callback") && callback != null) {
      fieldMap.put("callback", Collections.singletonList(String.valueOf(callback)));
    }
    if (fieldNames.contains("fields") && fields != null) {
      fieldMap.put("fields", Collections.singletonList(String.valueOf(fields)));
    }
    if (fieldNames.contains("instanceGroupManager") && instanceGroupManager != null) {
      fieldMap.put("instanceGroupManager", Collections.singletonList(String.valueOf(instanceGroupManager)));
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
    if (fieldNames.contains("regionInstanceGroupManagersSetTargetPoolsRequestResource") && regionInstanceGroupManagersSetTargetPoolsRequestResource != null) {
      fieldMap.put("regionInstanceGroupManagersSetTargetPoolsRequestResource", Collections.singletonList(String.valueOf(regionInstanceGroupManagersSetTargetPoolsRequestResource)));
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
  public RegionInstanceGroupManagersSetTargetPoolsRequest requestBody() {
    return regionInstanceGroupManagersSetTargetPoolsRequestResource;
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

  public String getInstanceGroupManager() {
    return instanceGroupManager;
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

  public RegionInstanceGroupManagersSetTargetPoolsRequest getRegionInstanceGroupManagersSetTargetPoolsRequestResource() {
    return regionInstanceGroupManagersSetTargetPoolsRequestResource;
  }

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SetTargetPoolsRegionInstanceGroupManagerHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SetTargetPoolsRegionInstanceGroupManagerHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final SetTargetPoolsRegionInstanceGroupManagerHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SetTargetPoolsRegionInstanceGroupManagerHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String instanceGroupManager;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequestResource;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(SetTargetPoolsRegionInstanceGroupManagerHttpRequest other) {
      if (other == SetTargetPoolsRegionInstanceGroupManagerHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstanceGroupManager() != null) {
        this.instanceGroupManager = other.instanceGroupManager;
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
      if (other.getRegionInstanceGroupManagersSetTargetPoolsRequestResource() != null) {
        this.regionInstanceGroupManagersSetTargetPoolsRequestResource = other.regionInstanceGroupManagersSetTargetPoolsRequestResource;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(SetTargetPoolsRegionInstanceGroupManagerHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.instanceGroupManager = source.instanceGroupManager;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.regionInstanceGroupManagersSetTargetPoolsRequestResource = source.regionInstanceGroupManagersSetTargetPoolsRequestResource;
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

    public String getInstanceGroupManager() {
      return instanceGroupManager;
    }

    public Builder setInstanceGroupManager(String instanceGroupManager) {
      this.instanceGroupManager = instanceGroupManager;
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

    public RegionInstanceGroupManagersSetTargetPoolsRequest getRegionInstanceGroupManagersSetTargetPoolsRequestResource() {
      return regionInstanceGroupManagersSetTargetPoolsRequestResource;
    }

    public Builder setRegionInstanceGroupManagersSetTargetPoolsRequestResource(RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequestResource) {
      this.regionInstanceGroupManagersSetTargetPoolsRequestResource = regionInstanceGroupManagersSetTargetPoolsRequestResource;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public SetTargetPoolsRegionInstanceGroupManagerHttpRequest build() {
      String missing = "";



      if (instanceGroupManager == null) {
        missing += " instanceGroupManager";
      }





      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new SetTargetPoolsRegionInstanceGroupManagerHttpRequest(
        access_token,
        callback,
        fields,
        instanceGroupManager,
        key,
        prettyPrint,
        quotaUser,
        regionInstanceGroupManagersSetTargetPoolsRequestResource,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setInstanceGroupManager(this.instanceGroupManager);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRegionInstanceGroupManagersSetTargetPoolsRequestResource(this.regionInstanceGroupManagersSetTargetPoolsRequestResource);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SetTargetPoolsRegionInstanceGroupManagerHttpRequest{"
        + "access_token=" + access_token + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "instanceGroupManager=" + instanceGroupManager + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "quotaUser=" + quotaUser + ", "
        + "regionInstanceGroupManagersSetTargetPoolsRequestResource=" + regionInstanceGroupManagersSetTargetPoolsRequestResource + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SetTargetPoolsRegionInstanceGroupManagerHttpRequest) {
      SetTargetPoolsRegionInstanceGroupManagerHttpRequest that = (SetTargetPoolsRegionInstanceGroupManagerHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.instanceGroupManager, that.getInstanceGroupManager()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.regionInstanceGroupManagersSetTargetPoolsRequestResource, that.getRegionInstanceGroupManagersSetTargetPoolsRequestResource()) &&
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
      instanceGroupManager,
      key,
      prettyPrint,
      quotaUser,
      regionInstanceGroupManagersSetTargetPoolsRequestResource,
      userIp
    );
  }
}
