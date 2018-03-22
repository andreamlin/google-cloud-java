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
public final class ManagedInstance implements ApiMessage {
  private final String currentAction;
  private final String id;
  private final String instance;
  private final String instanceStatus;
  private final ManagedInstanceLastAttempt lastAttempt;

  private ManagedInstance() {
    this.currentAction = null;
    this.id = null;
    this.instance = null;
    this.instanceStatus = null;
    this.lastAttempt = null;
  }


  private ManagedInstance(
      String currentAction,
      String id,
      String instance,
      String instanceStatus,
      ManagedInstanceLastAttempt lastAttempt
      ) {
    this.currentAction = currentAction;
    this.id = id;
    this.instance = instance;
    this.instanceStatus = instanceStatus;
    this.lastAttempt = lastAttempt;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("currentAction") && currentAction != null) {
      fieldMap.put("currentAction", Collections.singletonList(String.valueOf(currentAction)));
    }
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("instance") && instance != null) {
      fieldMap.put("instance", Collections.singletonList(String.valueOf(instance)));
    }
    if (fieldNames.contains("instanceStatus") && instanceStatus != null) {
      fieldMap.put("instanceStatus", Collections.singletonList(String.valueOf(instanceStatus)));
    }
    if (fieldNames.contains("lastAttempt") && lastAttempt != null) {
      fieldMap.put("lastAttempt", Collections.singletonList(String.valueOf(lastAttempt)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("currentAction")) {
      return String.valueOf(currentAction);
    }
    if (fieldName.equals("id")) {
      return String.valueOf(id);
    }
    if (fieldName.equals("instance")) {
      return String.valueOf(instance);
    }
    if (fieldName.equals("instanceStatus")) {
      return String.valueOf(instanceStatus);
    }
    if (fieldName.equals("lastAttempt")) {
      return String.valueOf(lastAttempt);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getCurrentAction() {
    return currentAction;
  }

  public String getId() {
    return id;
  }

  public String getInstance() {
    return instance;
  }

  public String getInstanceStatus() {
    return instanceStatus;
  }

  public ManagedInstanceLastAttempt getManagedInstanceLastAttempt() {
    return lastAttempt;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ManagedInstance prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final ManagedInstance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ManagedInstance();
  }

  public static class Builder {
    private String currentAction;
    private String id;
    private String instance;
    private String instanceStatus;
    private ManagedInstanceLastAttempt lastAttempt;

    Builder() {}

    public Builder mergeFrom(ManagedInstance other) {
      if (other == ManagedInstance.getDefaultInstance()) return this;
      if (other.getCurrentAction() != null) {
        this.currentAction = other.currentAction;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      if (other.getInstanceStatus() != null) {
        this.instanceStatus = other.instanceStatus;
      }
      if (other.getManagedInstanceLastAttempt() != null) {
        this.lastAttempt = other.lastAttempt;
      }
      return this;
    }

    Builder(ManagedInstance source) {
      this.currentAction = source.currentAction;
      this.id = source.id;
      this.instance = source.instance;
      this.instanceStatus = source.instanceStatus;
      this.lastAttempt = source.lastAttempt;
    }

    public String getCurrentAction() {
      return currentAction;
    }

    public Builder setCurrentAction(String currentAction) {
      this.currentAction = currentAction;
      return this;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public String getInstance() {
      return instance;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    public String getInstanceStatus() {
      return instanceStatus;
    }

    public Builder setInstanceStatus(String instanceStatus) {
      this.instanceStatus = instanceStatus;
      return this;
    }

    public ManagedInstanceLastAttempt getManagedInstanceLastAttempt() {
      return lastAttempt;
    }

    public Builder setManagedInstanceLastAttempt(ManagedInstanceLastAttempt lastAttempt) {
      this.lastAttempt = lastAttempt;
      return this;
    }


    public ManagedInstance build() {




      return new ManagedInstance(
        currentAction,
        id,
        instance,
        instanceStatus,
        lastAttempt
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCurrentAction(this.currentAction);
      newBuilder.setId(this.id);
      newBuilder.setInstance(this.instance);
      newBuilder.setInstanceStatus(this.instanceStatus);
      newBuilder.setManagedInstanceLastAttempt(this.lastAttempt);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedInstance{"
        + "currentAction=" + currentAction + ", "
        + "id=" + id + ", "
        + "instance=" + instance + ", "
        + "instanceStatus=" + instanceStatus + ", "
        + "lastAttempt=" + lastAttempt
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedInstance) {
      ManagedInstance that = (ManagedInstance) o;
      return
          Objects.equals(this.currentAction, that.getCurrentAction()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.instance, that.getInstance()) &&
          Objects.equals(this.instanceStatus, that.getInstanceStatus()) &&
          Objects.equals(this.lastAttempt, that.getManagedInstanceLastAttempt())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      currentAction,
      id,
      instance,
      instanceStatus,
      lastAttempt
    );
  }
}
