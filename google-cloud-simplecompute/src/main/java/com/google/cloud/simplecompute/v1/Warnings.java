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
package com.google.cloud.simplecompute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import com.google.common.collect.ImmutableMap;
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
public final class Warnings implements ApiMessage {
  private final String code;
  private final List<Data> data;
  private final String message;

  private Warnings() {
    this.code = null;
    this.data = null;
    this.message = null;
  }


  private Warnings(
      String code,
      List<Data> data,
      String message
      ) {
    this.code = code;
    this.data = data;
    this.message = message;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("code") && code != null) {
      fieldMap.put("code", Collections.singletonList(String.valueOf(code)));
    }
    if (fieldNames.contains("data") && data != null) {
      fieldMap.put("data", Collections.singletonList(String.valueOf(data)));
    }
    if (fieldNames.contains("message") && message != null) {
      fieldMap.put("message", Collections.singletonList(String.valueOf(message)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("code")) {
      return String.valueOf(code);
    }
    if (fieldName.equals("data")) {
      return String.valueOf(data);
    }
    if (fieldName.equals("message")) {
      return String.valueOf(message);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getCode() {
    return code;
  }

  public List<Data> getDataList() {
    return data;
  }

  public String getMessage() {
    return message;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Warnings prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Warnings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final Warnings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Warnings();
  }

  public static class Builder {
    private String code;
    private List<Data> data;
    private String message;

    Builder() {}

    public Builder mergeFrom(Warnings other) {
      if (other == Warnings.getDefaultInstance()) return this;
      if (other.getCode() != null) {
        this.code = other.code;
      }
      if (other.getDataList() != null) {
        this.data = other.data;
      }
      if (other.getMessage() != null) {
        this.message = other.message;
      }
      return this;
    }

    Builder(Warnings source) {
      this.code = source.code;
      this.data = source.data;
      this.message = source.message;
    }

    public String getCode() {
      return code;
    }

    public Builder setCode(String code) {
      this.code = code;
      return this;
    }

    public List<Data> getDataList() {
      return data;
    }

    public Builder addAllData(List<Data> data) {
      this.data = data;
      return this;
    }

    public String getMessage() {
      return message;
    }

    public Builder setMessage(String message) {
      this.message = message;
      return this;
    }


    public Warnings build() {


      return new Warnings(
        code,
        data,
        message
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCode(this.code);
      newBuilder.addAllData(this.data);
      newBuilder.setMessage(this.message);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Warnings{"
        + "code=" + code + ", "
        + "data=" + data + ", "
        + "message=" + message
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Warnings) {
      Warnings that = (Warnings) o;
      return
          Objects.equals(this.code, that.getCode()) &&
          Objects.equals(this.data, that.getDataList()) &&
          Objects.equals(this.message, that.getMessage())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      code,
      data,
      message
    );
  }
}
