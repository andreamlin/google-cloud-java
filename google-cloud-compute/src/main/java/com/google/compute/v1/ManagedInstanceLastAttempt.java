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
public final class ManagedInstanceLastAttempt implements ApiMessage {
  private final Errors errors;

  private ManagedInstanceLastAttempt() {
    this.errors = null;
  }


  private ManagedInstanceLastAttempt(
      Errors errors
      ) {
    this.errors = errors;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("errors") && errors != null) {
      fieldMap.put("errors", Collections.singletonList(String.valueOf(errors)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("errors")) {
      return String.valueOf(errors);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public Errors getErrors() {
    return errors;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ManagedInstanceLastAttempt prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedInstanceLastAttempt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final ManagedInstanceLastAttempt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ManagedInstanceLastAttempt();
  }

  public static class Builder {
    private Errors errors;

    Builder() {}

    public Builder mergeFrom(ManagedInstanceLastAttempt other) {
      if (other == ManagedInstanceLastAttempt.getDefaultInstance()) return this;
      if (other.getErrors() != null) {
        this.errors = other.errors;
      }
      return this;
    }

    Builder(ManagedInstanceLastAttempt source) {
      this.errors = source.errors;
    }

    public Errors getErrors() {
      return errors;
    }

    public Builder setErrors(Errors errors) {
      this.errors = errors;
      return this;
    }


    public ManagedInstanceLastAttempt build() {
      return new ManagedInstanceLastAttempt(
        errors
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setErrors(this.errors);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedInstanceLastAttempt{"
        + "errors=" + errors
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedInstanceLastAttempt) {
      ManagedInstanceLastAttempt that = (ManagedInstanceLastAttempt) o;
      return
          Objects.equals(this.errors, that.getErrors())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      errors
    );
  }
}