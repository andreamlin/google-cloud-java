/*
 * Copyright 2017, Google Inc. All rights reserved.
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
public final class SetTargetGlobalForwardingRuleHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String forwardingRule;
  private final String key;
  private final String prettyPrint;
  private final String project;
  private final String quotaUser;
  private final TargetReference targetReferenceResource;
  private final String userIp;

  private SetTargetGlobalForwardingRuleHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.forwardingRule = null;
    this.key = null;
    this.prettyPrint = null;
    this.project = null;
    this.quotaUser = null;
    this.targetReferenceResource = null;
    this.userIp = null;
  }


  private SetTargetGlobalForwardingRuleHttpRequest(
      String access_token,
      String callback,
      String fields,
      String forwardingRule,
      String key,
      String prettyPrint,
      String project,
      String quotaUser,
      TargetReference targetReferenceResource,
      String userIp
      ) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.forwardingRule = forwardingRule;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.project = project;
    this.quotaUser = quotaUser;
    this.targetReferenceResource = targetReferenceResource;
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
    if (fieldNames.contains("forwardingRule") && forwardingRule != null) {
      fieldMap.put("forwardingRule", Collections.singletonList(String.valueOf(forwardingRule)));
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
    if (fieldNames.contains("targetReferenceResource") && targetReferenceResource != null) {
      fieldMap.put("targetReferenceResource", Collections.singletonList(String.valueOf(targetReferenceResource)));
    }
    if (fieldNames.contains("userIp") && userIp != null) {
      fieldMap.put("userIp", Collections.singletonList(String.valueOf(userIp)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public TargetReference getRequestBody() {
    return targetReferenceResource;
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

  public String getForwardingRule() {
    return forwardingRule;
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

  public TargetReference getTargetReferenceResource() {
    return targetReferenceResource;
  }

  public String getUserIp() {
    return userIp;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SetTargetGlobalForwardingRuleHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SetTargetGlobalForwardingRuleHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final SetTargetGlobalForwardingRuleHttpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SetTargetGlobalForwardingRuleHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String forwardingRule;
    private String key;
    private String prettyPrint;
    private String project;
    private String quotaUser;
    private TargetReference targetReferenceResource;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(SetTargetGlobalForwardingRuleHttpRequest other) {
      if (other == SetTargetGlobalForwardingRuleHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getForwardingRule() != null) {
        this.forwardingRule = other.forwardingRule;
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
      if (other.getTargetReferenceResource() != null) {
        this.targetReferenceResource = other.targetReferenceResource;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(SetTargetGlobalForwardingRuleHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.forwardingRule = source.forwardingRule;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.project = source.project;
      this.quotaUser = source.quotaUser;
      this.targetReferenceResource = source.targetReferenceResource;
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

    public String getForwardingRule() {
      return forwardingRule;
    }

    public Builder setForwardingRule(String forwardingRule) {
      this.forwardingRule = forwardingRule;
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

    public TargetReference getTargetReferenceResource() {
      return targetReferenceResource;
    }

    public Builder setTargetReferenceResource(TargetReference targetReferenceResource) {
      this.targetReferenceResource = targetReferenceResource;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }


    public SetTargetGlobalForwardingRuleHttpRequest build() {
      String missing = "";



      if (forwardingRule == null) {
        missing += " forwardingRule";
      }


      if (project == null) {
        missing += " project";
      }



      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new SetTargetGlobalForwardingRuleHttpRequest(
        access_token,
        callback,
        fields,
        forwardingRule,
        key,
        prettyPrint,
        project,
        quotaUser,
        targetReferenceResource,
        userIp
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setForwardingRule(this.forwardingRule);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setProject(this.project);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setTargetReferenceResource(this.targetReferenceResource);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }

    public final Builder setForwardingRuleWithGlobalForwardingRulesForwardingRuleName(GlobalForwardingRulesForwardingRuleName value) {
      if (value == null) {
        return
            setForwardingRule("").
            setProject("")
            ;
      }
      return
          setForwardingRule(value.getForwardingRule()).
          setProject(value.getProject())
          ;
    }

    public final GlobalForwardingRulesForwardingRuleName getForwardingRuleAsGlobalForwardingRulesForwardingRuleName() {
      return GlobalForwardingRulesForwardingRuleName.create(
          getForwardingRule(),
          getProject()
          );
    }
  }

  @Override
  public String toString() {
    return "SetTargetGlobalForwardingRuleHttpRequest{"
        + "access_token=" + access_token + ", "
        + "callback=" + callback + ", "
        + "fields=" + fields + ", "
        + "forwardingRule=" + forwardingRule + ", "
        + "key=" + key + ", "
        + "prettyPrint=" + prettyPrint + ", "
        + "project=" + project + ", "
        + "quotaUser=" + quotaUser + ", "
        + "targetReferenceResource=" + targetReferenceResource + ", "
        + "userIp=" + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SetTargetGlobalForwardingRuleHttpRequest) {
      SetTargetGlobalForwardingRuleHttpRequest that = (SetTargetGlobalForwardingRuleHttpRequest) o;
      return
          Objects.equals(this.access_token, that.getAccessToken()) &&
          Objects.equals(this.callback, that.getCallback()) &&
          Objects.equals(this.fields, that.getFields()) &&
          Objects.equals(this.forwardingRule, that.getForwardingRule()) &&
          Objects.equals(this.key, that.getKey()) &&
          Objects.equals(this.prettyPrint, that.getPrettyPrint()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.quotaUser, that.getQuotaUser()) &&
          Objects.equals(this.targetReferenceResource, that.getTargetReferenceResource()) &&
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
      forwardingRule,
      key,
      prettyPrint,
      project,
      quotaUser,
      targetReferenceResource,
      userIp
    );
  }
}
