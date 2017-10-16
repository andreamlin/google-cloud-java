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
public final class Project implements ApiMessage {
  private final Metadata commonInstanceMetadata;
  private final String creationTimestamp;
  private final String defaultServiceAccount;
  private final String description;
  private final List<String> enabledFeatures;
  private final String id;
  private final String kind;
  private final String name;
  private final List<Quota> quotas;
  private final String selfLink;
  private final UsageExportLocation usageExportLocation;

  private Project() {
    this.commonInstanceMetadata = null;
    this.creationTimestamp = null;
    this.defaultServiceAccount = null;
    this.description = null;
    this.enabledFeatures = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.quotas = null;
    this.selfLink = null;
    this.usageExportLocation = null;
  }


  private Project(
      Metadata commonInstanceMetadata,
      String creationTimestamp,
      String defaultServiceAccount,
      String description,
      List<String> enabledFeatures,
      String id,
      String kind,
      String name,
      List<Quota> quotas,
      String selfLink,
      UsageExportLocation usageExportLocation
      ) {
    this.commonInstanceMetadata = commonInstanceMetadata;
    this.creationTimestamp = creationTimestamp;
    this.defaultServiceAccount = defaultServiceAccount;
    this.description = description;
    this.enabledFeatures = enabledFeatures;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.quotas = quotas;
    this.selfLink = selfLink;
    this.usageExportLocation = usageExportLocation;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("commonInstanceMetadata") && commonInstanceMetadata != null) {
      fieldMap.put("commonInstanceMetadata", Collections.singletonList(String.valueOf(commonInstanceMetadata)));
    }
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("defaultServiceAccount") && defaultServiceAccount != null) {
      fieldMap.put("defaultServiceAccount", Collections.singletonList(String.valueOf(defaultServiceAccount)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("enabledFeatures") && enabledFeatures != null) {
      fieldMap.put("enabledFeatures", Collections.singletonList(String.valueOf(enabledFeatures)));
    }
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("quotas") && quotas != null) {
      fieldMap.put("quotas", Collections.singletonList(String.valueOf(quotas)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("usageExportLocation") && usageExportLocation != null) {
      fieldMap.put("usageExportLocation", Collections.singletonList(String.valueOf(usageExportLocation)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public Metadata getCommonInstanceMetadata() {
    return commonInstanceMetadata;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDefaultServiceAccount() {
    return defaultServiceAccount;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getEnabledFeatures() {
    return enabledFeatures;
  }

  public String getId() {
    return id;
  }

  public String getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public List<Quota> getQuotas() {
    return quotas;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public UsageExportLocation getUsageExportLocation() {
    return usageExportLocation;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Project prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Project DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Project();
  }

  public static class Builder {
    private Metadata commonInstanceMetadata;
    private String creationTimestamp;
    private String defaultServiceAccount;
    private String description;
    private List<String> enabledFeatures;
    private String id;
    private String kind;
    private String name;
    private List<Quota> quotas;
    private String selfLink;
    private UsageExportLocation usageExportLocation;

    Builder() {}

    public Builder mergeFrom(Project other) {
      if (other == Project.getDefaultInstance()) return this;
      if (other.getCommonInstanceMetadata() != null) {
        this.commonInstanceMetadata = other.commonInstanceMetadata;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDefaultServiceAccount() != null) {
        this.defaultServiceAccount = other.defaultServiceAccount;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getEnabledFeatures() != null) {
        this.enabledFeatures = other.enabledFeatures;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getQuotas() != null) {
        this.quotas = other.quotas;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getUsageExportLocation() != null) {
        this.usageExportLocation = other.usageExportLocation;
      }
      return this;
    }

    Builder(Project source) {
      this.commonInstanceMetadata = source.commonInstanceMetadata;
      this.creationTimestamp = source.creationTimestamp;
      this.defaultServiceAccount = source.defaultServiceAccount;
      this.description = source.description;
      this.enabledFeatures = source.enabledFeatures;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.quotas = source.quotas;
      this.selfLink = source.selfLink;
      this.usageExportLocation = source.usageExportLocation;
    }

    public Metadata getCommonInstanceMetadata() {
      return commonInstanceMetadata;
    }

    public Builder setCommonInstanceMetadata(Metadata commonInstanceMetadata) {
      this.commonInstanceMetadata = commonInstanceMetadata;
      return this;
    }

    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    public String getDefaultServiceAccount() {
      return defaultServiceAccount;
    }

    public Builder setDefaultServiceAccount(String defaultServiceAccount) {
      this.defaultServiceAccount = defaultServiceAccount;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public List<String> getEnabledFeatures() {
      return enabledFeatures;
    }

    public Builder setEnabledFeatures(List<String> enabledFeatures) {
      this.enabledFeatures = enabledFeatures;
      return this;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public List<Quota> getQuotas() {
      return quotas;
    }

    public Builder setQuotas(List<Quota> quotas) {
      this.quotas = quotas;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public UsageExportLocation getUsageExportLocation() {
      return usageExportLocation;
    }

    public Builder setUsageExportLocation(UsageExportLocation usageExportLocation) {
      this.usageExportLocation = usageExportLocation;
      return this;
    }


    public Project build() {










      return new Project(
        commonInstanceMetadata,
        creationTimestamp,
        defaultServiceAccount,
        description,
        enabledFeatures,
        id,
        kind,
        name,
        quotas,
        selfLink,
        usageExportLocation
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCommonInstanceMetadata(this.commonInstanceMetadata);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDefaultServiceAccount(this.defaultServiceAccount);
      newBuilder.setDescription(this.description);
      newBuilder.setEnabledFeatures(this.enabledFeatures);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setQuotas(this.quotas);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setUsageExportLocation(this.usageExportLocation);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Project{"
        + "commonInstanceMetadata=" + commonInstanceMetadata + ", "
        + "creationTimestamp=" + creationTimestamp + ", "
        + "defaultServiceAccount=" + defaultServiceAccount + ", "
        + "description=" + description + ", "
        + "enabledFeatures=" + enabledFeatures + ", "
        + "id=" + id + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "quotas=" + quotas + ", "
        + "selfLink=" + selfLink + ", "
        + "usageExportLocation=" + usageExportLocation
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Project) {
      Project that = (Project) o;
      return
          Objects.equals(this.commonInstanceMetadata, that.getCommonInstanceMetadata()) &&
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.defaultServiceAccount, that.getDefaultServiceAccount()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.enabledFeatures, that.getEnabledFeatures()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.quotas, that.getQuotas()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.usageExportLocation, that.getUsageExportLocation())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      commonInstanceMetadata,
      creationTimestamp,
      defaultServiceAccount,
      description,
      enabledFeatures,
      id,
      kind,
      name,
      quotas,
      selfLink,
      usageExportLocation
    );
  }
}