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
public final class AutoscalersScopedList implements ApiMessage {
  private final List<Autoscaler> autoscalers;
  private final Warning warning;

  private AutoscalersScopedList() {
    this.autoscalers = null;
    this.warning = null;
  }


  private AutoscalersScopedList(
      List<Autoscaler> autoscalers,
      Warning warning
      ) {
    this.autoscalers = autoscalers;
    this.warning = warning;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("autoscalers") && autoscalers != null) {
      fieldMap.put("autoscalers", Collections.singletonList(String.valueOf(autoscalers)));
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public List<Autoscaler> getAutoscalers() {
    return autoscalers;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AutoscalersScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AutoscalersScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final AutoscalersScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AutoscalersScopedList();
  }

  public static class Builder {
    private List<Autoscaler> autoscalers;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(AutoscalersScopedList other) {
      if (other == AutoscalersScopedList.getDefaultInstance()) return this;
      if (other.getAutoscalers() != null) {
        this.autoscalers = other.autoscalers;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(AutoscalersScopedList source) {
      this.autoscalers = source.autoscalers;
      this.warning = source.warning;
    }

    public List<Autoscaler> getAutoscalers() {
      return autoscalers;
    }

    public Builder setAutoscalers(List<Autoscaler> autoscalers) {
      this.autoscalers = autoscalers;
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public AutoscalersScopedList build() {

      return new AutoscalersScopedList(
        autoscalers,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAutoscalers(this.autoscalers);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AutoscalersScopedList{"
        + "autoscalers=" + autoscalers + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoscalersScopedList) {
      AutoscalersScopedList that = (AutoscalersScopedList) o;
      return
          Objects.equals(this.autoscalers, that.getAutoscalers()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      autoscalers,
      warning
    );
  }
}
