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
public final class OperationsScopedList implements ApiMessage {
  private final List<Operation> operations;
  private final Warning warning;

  private OperationsScopedList() {
    this.operations = null;
    this.warning = null;
  }

  private OperationsScopedList(List<Operation> operations, Warning warning) {
    this.operations = operations;
    this.warning = warning;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("operations") && operations != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (Operation item : operations) {
        stringList.add(item.toString());
      }
      fieldMap.put("operations", stringList.build());
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("operations")) {
      return String.valueOf(operations);
    }
    if (fieldName.equals("warning")) {
      return String.valueOf(warning);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<Operation> getOperationsList() {
    return operations;
  }

  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(OperationsScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static OperationsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final OperationsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new OperationsScopedList();
  }

  public static class Builder {
    private List<Operation> operations;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(OperationsScopedList other) {
      if (other == OperationsScopedList.getDefaultInstance()) return this;
      if (other.getOperationsList() != null) {
        this.operations = other.operations;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(OperationsScopedList source) {
      this.operations = source.operations;
      this.warning = source.warning;
    }

    public List<Operation> getOperationsList() {
      return operations;
    }

    public Builder addAllOperations(List<Operation> operations) {
      if (this.operations == null) {
        this.operations = new ArrayList<>(operations.size());
      }
      this.operations.addAll(operations);
      return this;
    }

    public Builder addOperations(Operation operations) {
      this.operations.add(operations);
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public OperationsScopedList build() {

      return new OperationsScopedList(operations, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllOperations(this.operations);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "OperationsScopedList{" + "operations=" + operations + ", " + "warning=" + warning + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OperationsScopedList) {
      OperationsScopedList that = (OperationsScopedList) o;
      return Objects.equals(this.operations, that.getOperationsList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, warning);
  }
}
