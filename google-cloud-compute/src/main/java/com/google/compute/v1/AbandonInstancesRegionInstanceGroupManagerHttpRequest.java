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
public final class AbandonInstancesRegionInstanceGroupManagerHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String instanceGroupManager;
  private final String key;
  private final String prettyPrint;
  private final String project;
  private final String quotaUser;
  private final String region;
  private final RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource;
  private final String userIp;

  private AbandonInstancesRegionInstanceGroupManagerHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.instanceGroupManager = null;
    this.key = null;
    this.prettyPrint = null;
    this.project = null;
    this.quotaUser = null;
    this.region = null;
    this.regionInstanceGroupManagersAbandonInstancesRequestResource = null;
    this.userIp = null;
  }


  private AbandonInstancesRegionInstanceGroupManagerHttpRequest(
      String access_token,
      String callback,
      String fields,
      String instanceGroupManager,
      String key,
      String prettyPrint,
      String project,
      String quotaUser,
      String region,
      RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource,
      String userIp
      ) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.instanceGroupManager = instanceGroupManager;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.project = project;
    this.quotaUser = quotaUser;
    this.region = region;
    this.regionInstanceGroupManagersAbandonInstancesRequestResource = regionInstanceGroupManagersAbandonInstancesRequestResource;
    this.userIp = userIp;
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
    if (fieldNames.contains("project") && project != null) {
      fieldMap.put("project", Collections.singletonList(String.valueOf(project)));
    }
    if (fieldNames.contains("quotaUser") && quotaUser != null) {
      fieldMap.put("quotaUser", Collections.singletonList(String.valueOf(quotaUser)));
    }
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    if (fieldNames.contains("regionInstanceGroupManagersAbandonInstancesRequestResource") && regionInstanceGroupManagersAbandonInstancesRequestResource != null) {
      fieldMap.put("regionInstanceGroupManagersAbandonInstancesRequestResource", Collections.singletonList(String.valueOf(regionInstanceGroupManagersAbandonInstancesRequestResource)));
    }
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public RegionInstanceGroupManagersAbandonInstancesRequest getRequestBody() {
    return regionInstanceGroupManagersAbandonInstancesRequestResource;
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

  public String getProject() {
    return project;
  }

  public String getQuotaUser() {
    return quotaUser;
  }

  public String getRegion() {
    return region;
  }

  public RegionInstanceGroupManagersAbandonInstancesRequest getRegionInstanceGroupManagersAbandonInstancesRequestResource() {
    return regionInstanceGroupManagersAbandonInstancesRequestResource;
  }

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AbandonInstancesRegionInstanceGroupManagerHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AbandonInstancesRegionInstanceGroupManagerHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final AbandonInstancesRegionInstanceGroupManagerHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AbandonInstancesRegionInstanceGroupManagerHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String instanceGroupManager;
    private String key;
    private String prettyPrint;
    private String project;
    private String quotaUser;
    private String region;
    private RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(AbandonInstancesRegionInstanceGroupManagerHttpRequest other) {
      if (other == AbandonInstancesRegionInstanceGroupManagerHttpRequest.getDefaultInstance()) return this;
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
      if (other.getProject() != null) {
        this.project = other.project;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getRegionInstanceGroupManagersAbandonInstancesRequestResource() != null) {
        this.regionInstanceGroupManagersAbandonInstancesRequestResource = other.regionInstanceGroupManagersAbandonInstancesRequestResource;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(AbandonInstancesRegionInstanceGroupManagerHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.instanceGroupManager = source.instanceGroupManager;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.project = source.project;
      this.quotaUser = source.quotaUser;
      this.region = source.region;
      this.regionInstanceGroupManagersAbandonInstancesRequestResource = source.regionInstanceGroupManagersAbandonInstancesRequestResource;
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

    public String getProject() {
      return project;
    }

    public Builder setProject(String project) {
      this.project = project;
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

    public RegionInstanceGroupManagersAbandonInstancesRequest getRegionInstanceGroupManagersAbandonInstancesRequestResource() {
      return regionInstanceGroupManagersAbandonInstancesRequestResource;
    }

    public Builder setRegionInstanceGroupManagersAbandonInstancesRequestResource(RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource) {
      this.regionInstanceGroupManagersAbandonInstancesRequestResource = regionInstanceGroupManagersAbandonInstancesRequestResource;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public AbandonInstancesRegionInstanceGroupManagerHttpRequest build() {
      String missing = "";



      if (instanceGroupManager == null) {
        missing += " instanceGroupManager";
      }


      if (project == null) {
        missing += " project";
      }

      if (region == null) {
        missing += " region";
      }


      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AbandonInstancesRegionInstanceGroupManagerHttpRequest(
        access_token,
        callback,
        fields,
        instanceGroupManager,
        key,
        prettyPrint,
        project,
        quotaUser,
        region,
        regionInstanceGroupManagersAbandonInstancesRequestResource,
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
      newBuilder.setProject(this.project);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRegion(this.region);
      newBuilder.setRegionInstanceGroupManagersAbandonInstancesRequestResource(this.regionInstanceGroupManagersAbandonInstancesRequestResource);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }

    public final Builder setInstanceGroupManagerWithRegionInstanceGroupManagersInstanceGroupManagerName(RegionInstanceGroupManagersInstanceGroupManagerName value) {
      if (value == null) {
        return
            setInstanceGroupManager("").
            setProject("").
            setRegion("")
            ;
      }
      return
          setInstanceGroupManager(value.getInstanceGroupManager()).
          setProject(value.getProject()).
          setRegion(value.getRegion())
          ;
    }

    public final RegionInstanceGroupManagersInstanceGroupManagerName getInstanceGroupManagerAsRegionInstanceGroupManagersInstanceGroupManagerName() {
      return RegionInstanceGroupManagersInstanceGroupManagerName.of(
          getInstanceGroupManager(),
          getProject(),
          getRegion()
          );
    }
  }

  @Override
  public String toString() {
    return "AbandonInstancesRegionInstanceGroupManagerHttpRequest{"
        + "access_token=" + access_token + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "instanceGroupManager=" + instanceGroupManager + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "project=" + project + ", "
        + "quotaUser=" + quotaUser + ", "
        + "region=" + region + ", "
        + "regionInstanceGroupManagersAbandonInstancesRequestResource=" + regionInstanceGroupManagersAbandonInstancesRequestResource + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AbandonInstancesRegionInstanceGroupManagerHttpRequest) {
      AbandonInstancesRegionInstanceGroupManagerHttpRequest that = (AbandonInstancesRegionInstanceGroupManagerHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.instanceGroupManager, that.getInstanceGroupManager()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.regionInstanceGroupManagersAbandonInstancesRequestResource, that.getRegionInstanceGroupManagersAbandonInstancesRequestResource()) &&
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
      project,
      quotaUser,
      region,
      regionInstanceGroupManagersAbandonInstancesRequestResource,
      userIp
    );
  }
}