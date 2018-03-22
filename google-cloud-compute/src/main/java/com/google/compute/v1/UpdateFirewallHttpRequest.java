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
public final class UpdateFirewallHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String firewall;
  private final Firewall firewallResource;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String userIp;

  private UpdateFirewallHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.firewall = null;
    this.firewallResource = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.userIp = null;
  }


  private UpdateFirewallHttpRequest(
      String access_token,
      String callback,
      String fields,
      String firewall,
      Firewall firewallResource,
      String key,
      String prettyPrint,
      String quotaUser,
      String userIp
      ) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.firewall = firewall;
    this.firewallResource = firewallResource;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
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
    if (fieldNames.contains("firewall") && firewall != null) {
      fieldMap.put("firewall", Collections.singletonList(String.valueOf(firewall)));
    }
    if (fieldNames.contains("firewallResource") && firewallResource != null) {
      fieldMap.put("firewallResource", Collections.singletonList(String.valueOf(firewallResource)));
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

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("access_token")) {
      return String.valueOf(access_token);
    }
    if (fieldName.equals("callback")) {
      return String.valueOf(callback);
    }
    if (fieldName.equals("fields")) {
      return String.valueOf(fields);
    }
    if (fieldName.equals("firewall")) {
      return String.valueOf(firewall);
    }
    if (fieldName.equals("firewallResource")) {
      return String.valueOf(firewallResource);
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
    if (fieldName.equals("userIp")) {
      return String.valueOf(userIp);
    }
    return null;
  }

  @Nullable
  @Override
  public Firewall getApiMessageRequestBody() {
    return firewallResource;
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

  public String getFirewall() {
    return firewall;
  }

  public Firewall getFirewallResource() {
    return firewallResource;
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
  public static Builder newBuilder(UpdateFirewallHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static UpdateFirewallHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final UpdateFirewallHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UpdateFirewallHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String firewall;
    private Firewall firewallResource;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(UpdateFirewallHttpRequest other) {
      if (other == UpdateFirewallHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getFirewall() != null) {
        this.firewall = other.firewall;
      }
      if (other.getFirewallResource() != null) {
        this.firewallResource = other.firewallResource;
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

    Builder(UpdateFirewallHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.firewall = source.firewall;
      this.firewallResource = source.firewallResource;
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

    public String getFirewall() {
      return firewall;
    }

    public Builder setFirewall(String firewall) {
      this.firewall = firewall;
      return this;
    }

    public Firewall getFirewallResource() {
      return firewallResource;
    }

    public Builder setFirewallResource(Firewall firewallResource) {
      this.firewallResource = firewallResource;
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


    public UpdateFirewallHttpRequest build() {
      String missing = "";



      if (firewall == null) {
        missing += " firewall";
      }





      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new UpdateFirewallHttpRequest(
        access_token,
        callback,
        fields,
        firewall,
        firewallResource,
        key,
        prettyPrint,
        quotaUser,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setFirewall(this.firewall);
      newBuilder.setFirewallResource(this.firewallResource);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "UpdateFirewallHttpRequest{"
        + "access_token=" + access_token + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "firewall=" + firewall + ", "
        + "firewallResource=" + firewallResource + ", "
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
    if (o instanceof UpdateFirewallHttpRequest) {
      UpdateFirewallHttpRequest that = (UpdateFirewallHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.firewall, that.getFirewall()) &&
          Objects.equals(this.firewallResource, that.getFirewallResource()) &&
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
      callback,
      fields,
      firewall,
      firewallResource,
      key,
      prettyPrint,
      quotaUser,
      userIp
    );
  }
}