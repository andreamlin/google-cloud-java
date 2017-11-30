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
public final class InstancesSetServiceAccountRequest implements ApiMessage {
  private final String email;
  private final List<String> scopes;

  private InstancesSetServiceAccountRequest() {
    this.email = null;
    this.scopes = null;
  }


  private InstancesSetServiceAccountRequest(
      String email,
      List<String> scopes
      ) {
    this.email = email;
    this.scopes = scopes;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("email") && email != null) {
      fieldMap.put("email", Collections.singletonList(String.valueOf(email)));
    }
    if (fieldNames.contains("scopes") && scopes != null) {
      fieldMap.put("scopes", Collections.singletonList(String.valueOf(scopes)));
    }
    return fieldMap;
  }

  @Nullable
  @Override
  public ApiMessage getRequestBody() {
    return null;
  }

  public String getEmail() {
    return email;
  }

  public List<String> getScopes() {
    return scopes;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(InstancesSetServiceAccountRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstancesSetServiceAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final InstancesSetServiceAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InstancesSetServiceAccountRequest();
  }

  public static class Builder {
    private String email;
    private List<String> scopes;

    Builder() {}

    public Builder mergeFrom(InstancesSetServiceAccountRequest other) {
      if (other == InstancesSetServiceAccountRequest.getDefaultInstance()) return this;
      if (other.getEmail() != null) {
        this.email = other.email;
      }
      if (other.getScopes() != null) {
        this.scopes = other.scopes;
      }
      return this;
    }

    Builder(InstancesSetServiceAccountRequest source) {
      this.email = source.email;
      this.scopes = source.scopes;
    }

    public String getEmail() {
      return email;
    }

    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public List<String> getScopes() {
      return scopes;
    }

    public Builder setScopes(List<String> scopes) {
      this.scopes = scopes;
      return this;
    }


    public InstancesSetServiceAccountRequest build() {

      return new InstancesSetServiceAccountRequest(
        email,
        scopes
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setEmail(this.email);
      newBuilder.setScopes(this.scopes);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstancesSetServiceAccountRequest{"
        + "email=" + email + ", "
        + "scopes=" + scopes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstancesSetServiceAccountRequest) {
      InstancesSetServiceAccountRequest that = (InstancesSetServiceAccountRequest) o;
      return
          Objects.equals(this.email, that.getEmail()) &&
          Objects.equals(this.scopes, that.getScopes())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      email,
      scopes
    );
  }
}