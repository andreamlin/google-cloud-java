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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class GlobalAddressesAddressName implements ResourceName {
  private final String address;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("project/{project}/addresses/{address}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private GlobalAddressesAddressName(Builder builder) {
    address = Preconditions.checkNotNull(builder.getAddress());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static GlobalAddressesAddressName create(
      String address,
      String project
      ) {
    return newBuilder()
    .setAddress(address)
    .setProject(project)
      .build();
  }

  public String getAddress() {
    return address;
  }

  public String getProject() {
    return project;
  }


  public static GlobalAddressesAddressName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "GlobalAddressesAddressName.parse: formattedString not in valid format");
    return create(
      matchMap.get("address"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return GlobalAddressesAddressNameType.instance();
  }

  public static class Builder {
    private String address;
    private String project;

    public String getAddress() {
      return address;
    }
    public String getProject() {
      return project;
    }

    public Builder setAddress(String address) {
      this.address = address;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (GlobalAddressesAddressName globalAddressesAddressName) {
      address = globalAddressesAddressName.address;
      project = globalAddressesAddressName.project;
    }

    public GlobalAddressesAddressName build() {
      return new GlobalAddressesAddressName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "address", address,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GlobalAddressesAddressName) {
      GlobalAddressesAddressName that = (GlobalAddressesAddressName) o;
      return
          Objects.equals(this.address, that.getAddress()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      address,
      project
    );
  }
}
