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
import com.google.api.gax.httpjson.ResourceNameStruct;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class AddressesScopedList implements ApiMessage {
  private final List<Address> addresses;
  private final Warning warning;

  private AddressesScopedList() {
    this.addresses = null;
    this.warning = null;
  }


  private AddressesScopedList(
      List<Address> addresses,
      Warning warning
      ) {
    this.addresses = addresses;
    this.warning = warning;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("addresses") && addresses != null) {
      List<String> stringList = new LinkedList<>();
      for (Address item : addresses) {
        stringList.add(item.toString());
      }
      fieldMap.put("addresses", stringList);
    }
    if (fieldNames.contains("warning") && warning != null) {
      fieldMap.put("warning", Collections.singletonList(String.valueOf(warning)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) throws IOException {
    if (fieldName.equals("addresses")) {
      return String.valueOf(addresses);
    }
    if (fieldName.equals("warning")) {
      return String.valueOf(warning);
    }
    throw new IOException(String.format("Field '%s' not found in AddressesScopedList fields", fieldName));
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public Warning getWarning() {
    return warning;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AddressesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AddressesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final AddressesScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AddressesScopedList();
  }

  public static class Builder {
    private List<Address> addresses;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(AddressesScopedList other) {
      if (other == AddressesScopedList.getDefaultInstance()) return this;
      if (other.getAddresses() != null) {
        this.addresses = other.addresses;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(AddressesScopedList source) {
      this.addresses = source.addresses;
      this.warning = source.warning;
    }

    public List<Address> getAddresses() {
      return addresses;
    }

    public Builder addAllAddresses(List<Address> addresses) {
      if (this.addresses == null) {
        this.addresses = new LinkedList<>();
      }
      this.addresses.addAll(addresses);
      return this;
    }

    public Builder addAddresses(Address addresses) {
      this.addresses.add(addresses);
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }


    public AddressesScopedList build() {

      return new AddressesScopedList(
        addresses,
        warning
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllAddresses(this.addresses);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AddressesScopedList{"
        + "addresses=" + addresses + ", "
        + "warning=" + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AddressesScopedList) {
      AddressesScopedList that = (AddressesScopedList) o;
      return
          Objects.equals(this.addresses, that.getAddresses()) &&
          Objects.equals(this.warning, that.getWarning())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      addresses,
      warning
    );
  }
}
