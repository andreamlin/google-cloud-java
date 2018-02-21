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
public final class SetDiskAutoDeleteInstanceHttpRequest implements ApiMessage {
  private final String access_token;
  private final Boolean autoDelete;
  private final String callback;
  private final String deviceName;
  private final String fields;
  private final String instance;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String userIp;

  private SetDiskAutoDeleteInstanceHttpRequest() {
    this.access_token = null;
    this.autoDelete = null;
    this.callback = null;
    this.deviceName = null;
    this.fields = null;
    this.instance = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.userIp = null;
  }


  private SetDiskAutoDeleteInstanceHttpRequest(
      String access_token,
      Boolean autoDelete,
      String callback,
      String deviceName,
      String fields,
      String instance,
      String key,
      String prettyPrint,
      String quotaUser,
      String userIp
      ) {
    this.access_token = access_token;
    this.autoDelete = autoDelete;
    this.callback = callback;
    this.deviceName = deviceName;
    this.fields = fields;
    this.instance = instance;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.userIp = userIp;
  }

  @Override
  public InstanceName resourceNamePath() {
    return InstanceName.parse(instance);
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("access_token") && access_token != null) {
      fieldMap.put("access_token", Collections.singletonList(String.valueOf(access_token)));
    }
    if (fieldNames.contains("autoDelete") && autoDelete != null) {
      fieldMap.put("autoDelete", Collections.singletonList(String.valueOf(autoDelete)));
    }
    if (fieldNames.contains("callback") && callback != null) {
      fieldMap.put("callback", Collections.singletonList(String.valueOf(callback)));
    }
    if (fieldNames.contains("deviceName") && deviceName != null) {
      fieldMap.put("deviceName", Collections.singletonList(String.valueOf(deviceName)));
    }
    if (fieldNames.contains("fields") && fields != null) {
      fieldMap.put("fields", Collections.singletonList(String.valueOf(fields)));
    }
    if (fieldNames.contains("instance") && instance != null) {
      fieldMap.put("instance", Collections.singletonList(String.valueOf(instance)));
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
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage requestBody() {
    return null;
  }

  public String getAccessToken() {
    return access_token;
  }

  public Boolean getAutoDelete() {
    return autoDelete;
  }

  public String getCallback() {
    return callback;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public String getFields() {
    return fields;
  }

  public String getInstance() {
    return instance;
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

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SetDiskAutoDeleteInstanceHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SetDiskAutoDeleteInstanceHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final SetDiskAutoDeleteInstanceHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SetDiskAutoDeleteInstanceHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private Boolean autoDelete;
    private String callback;
    private String deviceName;
    private String fields;
    private String instance;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(SetDiskAutoDeleteInstanceHttpRequest other) {
      if (other == SetDiskAutoDeleteInstanceHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getAutoDelete() != null) {
        this.autoDelete = other.autoDelete;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getDeviceName() != null) {
        this.deviceName = other.deviceName;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstance() != null) {
        this.instance = other.instance;
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
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(SetDiskAutoDeleteInstanceHttpRequest source) {
      this.access_token = source.access_token;
      this.autoDelete = source.autoDelete;
      this.callback = source.callback;
      this.deviceName = source.deviceName;
      this.fields = source.fields;
      this.instance = source.instance;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public Boolean getAutoDelete() {
      return autoDelete;
    }

    public Builder setAutoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public String getDeviceName() {
      return deviceName;
    }

    public Builder setDeviceName(String deviceName) {
      this.deviceName = deviceName;
      return this;
    }

    public String getFields() {
      return fields;
    }

    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    public String getInstance() {
      return instance;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
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

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public SetDiskAutoDeleteInstanceHttpRequest build() {
      String missing = "";

      if (autoDelete == null) {
        missing += " autoDelete";
      }

      if (deviceName == null) {
        missing += " deviceName";
      }

      if (instance == null) {
        missing += " instance";
      }




      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new SetDiskAutoDeleteInstanceHttpRequest(
        access_token,
        autoDelete,
        callback,
        deviceName,
        fields,
        instance,
        key,
        prettyPrint,
        quotaUser,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setAutoDelete(this.autoDelete);
      newBuilder.setCallback(this.callback);
      newBuilder.setDeviceName(this.deviceName);
      newBuilder.setFields(this.fields);
      newBuilder.setInstance(this.instance);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SetDiskAutoDeleteInstanceHttpRequest{"
        + "access_token=" + access_token + ", "
        + "autoDelete=" + autoDelete + ", "
        + "callback=" + callback + ", "
        + "deviceName=" + deviceName + ", "
        + "fields=" + fields + ", "
        + "instance=" + instance + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "quotaUser=" + quotaUser + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SetDiskAutoDeleteInstanceHttpRequest) {
      SetDiskAutoDeleteInstanceHttpRequest that = (SetDiskAutoDeleteInstanceHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.autoDelete, that.getAutoDelete()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.deviceName, that.getDeviceName()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.instance, that.getInstance()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.userIp, that.getUserIp())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access_token,
      autoDelete,
      callback,
      deviceName,
      fields,
      instance,
      key,
      prettyPrint,
      quotaUser,
      userIp
    );
  }
}
