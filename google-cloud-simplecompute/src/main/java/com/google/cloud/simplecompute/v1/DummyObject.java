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
public final class DummyObject implements ApiMessage {
  private final Float floatie;
  private final String name;
  private final Double precisionFloatie;
  private final Address primaryAddress;
  private final Address secondaryAddress;

  private DummyObject() {
    this.floatie = null;
    this.name = null;
    this.precisionFloatie = null;
    this.primaryAddress = null;
    this.secondaryAddress = null;
  }


  private DummyObject(
      Float floatie,
      String name,
      Double precisionFloatie,
      Address primaryAddress,
      Address secondaryAddress
      ) {
    this.floatie = floatie;
    this.name = name;
    this.precisionFloatie = precisionFloatie;
    this.primaryAddress = primaryAddress;
    this.secondaryAddress = secondaryAddress;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("floatie") && floatie != null) {
      fieldMap.put("floatie", Collections.singletonList(String.valueOf(floatie)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("precisionFloatie") && precisionFloatie != null) {
      fieldMap.put("precisionFloatie", Collections.singletonList(String.valueOf(precisionFloatie)));
    }
    if (fieldNames.contains("primaryAddress") && primaryAddress != null) {
      fieldMap.put("primaryAddress", Collections.singletonList(String.valueOf(primaryAddress)));
    }
    if (fieldNames.contains("secondaryAddress") && secondaryAddress != null) {
      fieldMap.put("secondaryAddress", Collections.singletonList(String.valueOf(secondaryAddress)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("floatie")) {
      return String.valueOf(floatie);
    }
    if (fieldName.equals("name")) {
      return String.valueOf(name);
    }
    if (fieldName.equals("precisionFloatie")) {
      return String.valueOf(precisionFloatie);
    }
    if (fieldName.equals("primaryAddress")) {
      return String.valueOf(primaryAddress);
    }
    if (fieldName.equals("secondaryAddress")) {
      return String.valueOf(secondaryAddress);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public Float getFloatie() {
    return floatie;
  }

  public String getName() {
    return name;
  }

  public Double getPrecisionFloatie() {
    return precisionFloatie;
  }

  public Address getPrimaryAddress() {
    return primaryAddress;
  }

  public Address getSecondaryAddress() {
    return secondaryAddress;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(DummyObject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DummyObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final DummyObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DummyObject();
  }

  public static class Builder {
    private Float floatie;
    private String name;
    private Double precisionFloatie;
    private Address primaryAddress;
    private Address secondaryAddress;

    Builder() {}

    public Builder mergeFrom(DummyObject other) {
      if (other == DummyObject.getDefaultInstance()) return this;
      if (other.getFloatie() != null) {
        this.floatie = other.floatie;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getPrecisionFloatie() != null) {
        this.precisionFloatie = other.precisionFloatie;
      }
      if (other.getPrimaryAddress() != null) {
        this.primaryAddress = other.primaryAddress;
      }
      if (other.getSecondaryAddress() != null) {
        this.secondaryAddress = other.secondaryAddress;
      }
      return this;
    }

    Builder(DummyObject source) {
      this.floatie = source.floatie;
      this.name = source.name;
      this.precisionFloatie = source.precisionFloatie;
      this.primaryAddress = source.primaryAddress;
      this.secondaryAddress = source.secondaryAddress;
    }

    public Float getFloatie() {
      return floatie;
    }

    public Builder setFloatie(Float floatie) {
      this.floatie = floatie;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Double getPrecisionFloatie() {
      return precisionFloatie;
    }

    public Builder setPrecisionFloatie(Double precisionFloatie) {
      this.precisionFloatie = precisionFloatie;
      return this;
    }

    public Address getPrimaryAddress() {
      return primaryAddress;
    }

    public Builder setPrimaryAddress(Address primaryAddress) {
      this.primaryAddress = primaryAddress;
      return this;
    }

    public Address getSecondaryAddress() {
      return secondaryAddress;
    }

    public Builder setSecondaryAddress(Address secondaryAddress) {
      this.secondaryAddress = secondaryAddress;
      return this;
    }


    public DummyObject build() {




      return new DummyObject(
        floatie,
        name,
        precisionFloatie,
        primaryAddress,
        secondaryAddress
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFloatie(this.floatie);
      newBuilder.setName(this.name);
      newBuilder.setPrecisionFloatie(this.precisionFloatie);
      newBuilder.setPrimaryAddress(this.primaryAddress);
      newBuilder.setSecondaryAddress(this.secondaryAddress);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DummyObject{"
        + "floatie=" + floatie + ", "
        + "name=" + name + ", "
        + "precisionFloatie=" + precisionFloatie + ", "
        + "primaryAddress=" + primaryAddress + ", "
        + "secondaryAddress=" + secondaryAddress
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DummyObject) {
      DummyObject that = (DummyObject) o;
      return
          Objects.equals(this.floatie, that.getFloatie()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.precisionFloatie, that.getPrecisionFloatie()) &&
          Objects.equals(this.primaryAddress, that.getPrimaryAddress()) &&
          Objects.equals(this.secondaryAddress, that.getSecondaryAddress())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      floatie,
      name,
      precisionFloatie,
      primaryAddress,
      secondaryAddress
    );
  }
}
