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
package com.google.cloud.compute.v1;

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
public final class Firewall implements ApiMessage {
  private final List<Allowed> allowed;
  private final String creationTimestamp;
  private final List<Denied> denied;
  private final String description;
  private final List<String> destinationRanges;
  private final String direction;
  private final String id;
  private final String kind;
  private final String name;
  private final String network;
  private final Integer priority;
  private final String selfLink;
  private final List<String> sourceRanges;
  private final List<String> sourceServiceAccounts;
  private final List<String> sourceTags;
  private final List<String> targetServiceAccounts;
  private final List<String> targetTags;

  private Firewall() {
    this.allowed = null;
    this.creationTimestamp = null;
    this.denied = null;
    this.description = null;
    this.destinationRanges = null;
    this.direction = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.network = null;
    this.priority = null;
    this.selfLink = null;
    this.sourceRanges = null;
    this.sourceServiceAccounts = null;
    this.sourceTags = null;
    this.targetServiceAccounts = null;
    this.targetTags = null;
  }


  private Firewall(
      List<Allowed> allowed,
      String creationTimestamp,
      List<Denied> denied,
      String description,
      List<String> destinationRanges,
      String direction,
      String id,
      String kind,
      String name,
      String network,
      Integer priority,
      String selfLink,
      List<String> sourceRanges,
      List<String> sourceServiceAccounts,
      List<String> sourceTags,
      List<String> targetServiceAccounts,
      List<String> targetTags
      ) {
    this.allowed = allowed;
    this.creationTimestamp = creationTimestamp;
    this.denied = denied;
    this.description = description;
    this.destinationRanges = destinationRanges;
    this.direction = direction;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.network = network;
    this.priority = priority;
    this.selfLink = selfLink;
    this.sourceRanges = sourceRanges;
    this.sourceServiceAccounts = sourceServiceAccounts;
    this.sourceTags = sourceTags;
    this.targetServiceAccounts = targetServiceAccounts;
    this.targetTags = targetTags;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("allowed") && allowed != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (Allowed item : allowed) {
        stringList.add(item.toString());
      }
      fieldMap.put("allowed", stringList.build());
    }
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("denied") && denied != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (Denied item : denied) {
        stringList.add(item.toString());
      }
      fieldMap.put("denied", stringList.build());
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("destinationRanges") && destinationRanges != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : destinationRanges) {
        stringList.add(item.toString());
      }
      fieldMap.put("destinationRanges", stringList.build());
    }
    if (fieldNames.contains("direction") && direction != null) {
      fieldMap.put("direction", Collections.singletonList(String.valueOf(direction)));
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
    if (fieldNames.contains("network") && network != null) {
      fieldMap.put("network", Collections.singletonList(String.valueOf(network)));
    }
    if (fieldNames.contains("priority") && priority != null) {
      fieldMap.put("priority", Collections.singletonList(String.valueOf(priority)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("sourceRanges") && sourceRanges != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : sourceRanges) {
        stringList.add(item.toString());
      }
      fieldMap.put("sourceRanges", stringList.build());
    }
    if (fieldNames.contains("sourceServiceAccounts") && sourceServiceAccounts != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : sourceServiceAccounts) {
        stringList.add(item.toString());
      }
      fieldMap.put("sourceServiceAccounts", stringList.build());
    }
    if (fieldNames.contains("sourceTags") && sourceTags != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : sourceTags) {
        stringList.add(item.toString());
      }
      fieldMap.put("sourceTags", stringList.build());
    }
    if (fieldNames.contains("targetServiceAccounts") && targetServiceAccounts != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : targetServiceAccounts) {
        stringList.add(item.toString());
      }
      fieldMap.put("targetServiceAccounts", stringList.build());
    }
    if (fieldNames.contains("targetTags") && targetTags != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (String item : targetTags) {
        stringList.add(item.toString());
      }
      fieldMap.put("targetTags", stringList.build());
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("allowed")) {
      return String.valueOf(allowed);
    }
    if (fieldName.equals("creationTimestamp")) {
      return String.valueOf(creationTimestamp);
    }
    if (fieldName.equals("denied")) {
      return String.valueOf(denied);
    }
    if (fieldName.equals("description")) {
      return String.valueOf(description);
    }
    if (fieldName.equals("destinationRanges")) {
      return String.valueOf(destinationRanges);
    }
    if (fieldName.equals("direction")) {
      return String.valueOf(direction);
    }
    if (fieldName.equals("id")) {
      return String.valueOf(id);
    }
    if (fieldName.equals("kind")) {
      return String.valueOf(kind);
    }
    if (fieldName.equals("name")) {
      return String.valueOf(name);
    }
    if (fieldName.equals("network")) {
      return String.valueOf(network);
    }
    if (fieldName.equals("priority")) {
      return String.valueOf(priority);
    }
    if (fieldName.equals("selfLink")) {
      return String.valueOf(selfLink);
    }
    if (fieldName.equals("sourceRanges")) {
      return String.valueOf(sourceRanges);
    }
    if (fieldName.equals("sourceServiceAccounts")) {
      return String.valueOf(sourceServiceAccounts);
    }
    if (fieldName.equals("sourceTags")) {
      return String.valueOf(sourceTags);
    }
    if (fieldName.equals("targetServiceAccounts")) {
      return String.valueOf(targetServiceAccounts);
    }
    if (fieldName.equals("targetTags")) {
      return String.valueOf(targetTags);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<Allowed> getAllowedList() {
    return allowed;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public List<Denied> getDeniedList() {
    return denied;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getDestinationRangesList() {
    return destinationRanges;
  }

  public String getDirection() {
    return direction;
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

  public String getNetwork() {
    return network;
  }

  public Integer getPriority() {
    return priority;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public List<String> getSourceRangesList() {
    return sourceRanges;
  }

  public List<String> getSourceServiceAccountsList() {
    return sourceServiceAccounts;
  }

  public List<String> getSourceTagsList() {
    return sourceTags;
  }

  public List<String> getTargetServiceAccountsList() {
    return targetServiceAccounts;
  }

  public List<String> getTargetTagsList() {
    return targetTags;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Firewall prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Firewall getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Firewall DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Firewall();
  }

  public static class Builder {
    private List<Allowed> allowed;
    private String creationTimestamp;
    private List<Denied> denied;
    private String description;
    private List<String> destinationRanges;
    private String direction;
    private String id;
    private String kind;
    private String name;
    private String network;
    private Integer priority;
    private String selfLink;
    private List<String> sourceRanges;
    private List<String> sourceServiceAccounts;
    private List<String> sourceTags;
    private List<String> targetServiceAccounts;
    private List<String> targetTags;

    Builder() {}

    public Builder mergeFrom(Firewall other) {
      if (other == Firewall.getDefaultInstance()) return this;
      if (other.getAllowedList() != null) {
        this.allowed = other.allowed;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDeniedList() != null) {
        this.denied = other.denied;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getDestinationRangesList() != null) {
        this.destinationRanges = other.destinationRanges;
      }
      if (other.getDirection() != null) {
        this.direction = other.direction;
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
      if (other.getNetwork() != null) {
        this.network = other.network;
      }
      if (other.getPriority() != null) {
        this.priority = other.priority;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getSourceRangesList() != null) {
        this.sourceRanges = other.sourceRanges;
      }
      if (other.getSourceServiceAccountsList() != null) {
        this.sourceServiceAccounts = other.sourceServiceAccounts;
      }
      if (other.getSourceTagsList() != null) {
        this.sourceTags = other.sourceTags;
      }
      if (other.getTargetServiceAccountsList() != null) {
        this.targetServiceAccounts = other.targetServiceAccounts;
      }
      if (other.getTargetTagsList() != null) {
        this.targetTags = other.targetTags;
      }
      return this;
    }

    Builder(Firewall source) {
      this.allowed = source.allowed;
      this.creationTimestamp = source.creationTimestamp;
      this.denied = source.denied;
      this.description = source.description;
      this.destinationRanges = source.destinationRanges;
      this.direction = source.direction;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.network = source.network;
      this.priority = source.priority;
      this.selfLink = source.selfLink;
      this.sourceRanges = source.sourceRanges;
      this.sourceServiceAccounts = source.sourceServiceAccounts;
      this.sourceTags = source.sourceTags;
      this.targetServiceAccounts = source.targetServiceAccounts;
      this.targetTags = source.targetTags;
    }

    public List<Allowed> getAllowedList() {
      return allowed;
    }

    public Builder addAllAllowed(List<Allowed> allowed) {
      if (this.allowed == null) {
        this.allowed = new ArrayList<>(allowed.size());
      }
      this.allowed.addAll(allowed);
      return this;
    }

    public Builder addAllowed(Allowed allowed) {
      this.allowed.add(allowed);
      return this;
    }

    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    public List<Denied> getDeniedList() {
      return denied;
    }

    public Builder addAllDenied(List<Denied> denied) {
      if (this.denied == null) {
        this.denied = new ArrayList<>(denied.size());
      }
      this.denied.addAll(denied);
      return this;
    }

    public Builder addDenied(Denied denied) {
      this.denied.add(denied);
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public List<String> getDestinationRangesList() {
      return destinationRanges;
    }

    public Builder addAllDestinationRanges(List<String> destinationRanges) {
      if (this.destinationRanges == null) {
        this.destinationRanges = new ArrayList<>(destinationRanges.size());
      }
      this.destinationRanges.addAll(destinationRanges);
      return this;
    }

    public Builder addDestinationRanges(String destinationRanges) {
      this.destinationRanges.add(destinationRanges);
      return this;
    }

    public String getDirection() {
      return direction;
    }

    public Builder setDirection(String direction) {
      this.direction = direction;
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

    public String getNetwork() {
      return network;
    }

    public Builder setNetwork(String network) {
      this.network = network;
      return this;
    }

    public Integer getPriority() {
      return priority;
    }

    public Builder setPriority(Integer priority) {
      this.priority = priority;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public List<String> getSourceRangesList() {
      return sourceRanges;
    }

    public Builder addAllSourceRanges(List<String> sourceRanges) {
      if (this.sourceRanges == null) {
        this.sourceRanges = new ArrayList<>(sourceRanges.size());
      }
      this.sourceRanges.addAll(sourceRanges);
      return this;
    }

    public Builder addSourceRanges(String sourceRanges) {
      this.sourceRanges.add(sourceRanges);
      return this;
    }

    public List<String> getSourceServiceAccountsList() {
      return sourceServiceAccounts;
    }

    public Builder addAllSourceServiceAccounts(List<String> sourceServiceAccounts) {
      if (this.sourceServiceAccounts == null) {
        this.sourceServiceAccounts = new ArrayList<>(sourceServiceAccounts.size());
      }
      this.sourceServiceAccounts.addAll(sourceServiceAccounts);
      return this;
    }

    public Builder addSourceServiceAccounts(String sourceServiceAccounts) {
      this.sourceServiceAccounts.add(sourceServiceAccounts);
      return this;
    }

    public List<String> getSourceTagsList() {
      return sourceTags;
    }

    public Builder addAllSourceTags(List<String> sourceTags) {
      if (this.sourceTags == null) {
        this.sourceTags = new ArrayList<>(sourceTags.size());
      }
      this.sourceTags.addAll(sourceTags);
      return this;
    }

    public Builder addSourceTags(String sourceTags) {
      this.sourceTags.add(sourceTags);
      return this;
    }

    public List<String> getTargetServiceAccountsList() {
      return targetServiceAccounts;
    }

    public Builder addAllTargetServiceAccounts(List<String> targetServiceAccounts) {
      if (this.targetServiceAccounts == null) {
        this.targetServiceAccounts = new ArrayList<>(targetServiceAccounts.size());
      }
      this.targetServiceAccounts.addAll(targetServiceAccounts);
      return this;
    }

    public Builder addTargetServiceAccounts(String targetServiceAccounts) {
      this.targetServiceAccounts.add(targetServiceAccounts);
      return this;
    }

    public List<String> getTargetTagsList() {
      return targetTags;
    }

    public Builder addAllTargetTags(List<String> targetTags) {
      if (this.targetTags == null) {
        this.targetTags = new ArrayList<>(targetTags.size());
      }
      this.targetTags.addAll(targetTags);
      return this;
    }

    public Builder addTargetTags(String targetTags) {
      this.targetTags.add(targetTags);
      return this;
    }


    public Firewall build() {
















      return new Firewall(
        allowed,
        creationTimestamp,
        denied,
        description,
        destinationRanges,
        direction,
        id,
        kind,
        name,
        network,
        priority,
        selfLink,
        sourceRanges,
        sourceServiceAccounts,
        sourceTags,
        targetServiceAccounts,
        targetTags
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllAllowed(this.allowed);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.addAllDenied(this.denied);
      newBuilder.setDescription(this.description);
      newBuilder.addAllDestinationRanges(this.destinationRanges);
      newBuilder.setDirection(this.direction);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNetwork(this.network);
      newBuilder.setPriority(this.priority);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.addAllSourceRanges(this.sourceRanges);
      newBuilder.addAllSourceServiceAccounts(this.sourceServiceAccounts);
      newBuilder.addAllSourceTags(this.sourceTags);
      newBuilder.addAllTargetServiceAccounts(this.targetServiceAccounts);
      newBuilder.addAllTargetTags(this.targetTags);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Firewall{"
        + "allowed=" + allowed + ", "
        + "creationTimestamp=" + creationTimestamp + ", "
        + "denied=" + denied + ", "
        + "description=" + description + ", "
        + "destinationRanges=" + destinationRanges + ", "
        + "direction=" + direction + ", "
        + "id=" + id + ", "
        + "kind=" + kind + ", "
        + "name=" + name + ", "
        + "network=" + network + ", "
        + "priority=" + priority + ", "
        + "selfLink=" + selfLink + ", "
        + "sourceRanges=" + sourceRanges + ", "
        + "sourceServiceAccounts=" + sourceServiceAccounts + ", "
        + "sourceTags=" + sourceTags + ", "
        + "targetServiceAccounts=" + targetServiceAccounts + ", "
        + "targetTags=" + targetTags
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Firewall) {
      Firewall that = (Firewall) o;
      return
          Objects.equals(this.allowed, that.getAllowedList()) &&
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.denied, that.getDeniedList()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.destinationRanges, that.getDestinationRangesList()) &&
          Objects.equals(this.direction, that.getDirection()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.network, that.getNetwork()) &&
          Objects.equals(this.priority, that.getPriority()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.sourceRanges, that.getSourceRangesList()) &&
          Objects.equals(this.sourceServiceAccounts, that.getSourceServiceAccountsList()) &&
          Objects.equals(this.sourceTags, that.getSourceTagsList()) &&
          Objects.equals(this.targetServiceAccounts, that.getTargetServiceAccountsList()) &&
          Objects.equals(this.targetTags, that.getTargetTagsList())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      allowed,
      creationTimestamp,
      denied,
      description,
      destinationRanges,
      direction,
      id,
      kind,
      name,
      network,
      priority,
      selfLink,
      sourceRanges,
      sourceServiceAccounts,
      sourceTags,
      targetServiceAccounts,
      targetTags
    );
  }
}
