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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class DiskTypeName implements ResourceName {
  private final String diskType;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("/projects/{project}/zones/{zone}/diskTypes/{diskType}");


  private static final String REGEX = ".*?projects/([^/]+)/zones/([^/]+)/diskTypes/([^/]+)";
  private static final Pattern PATTERN = Pattern.compile(REGEX);

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DiskTypeName(Builder builder) {
    diskType = Preconditions.checkNotNull(builder.getDiskType());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static DiskTypeName of(
      String diskType,
      String project,
      String zone
      ) {
    return newBuilder()
    .setDiskType(diskType)
    .setProject(project)
    .setZone(zone)
      .build();
  }

  public static String format(
      String diskType,
      String project,
      String zone
      ) {
    return of(
        diskType,
        project,
        zone
        )
        .toString();
  }

  public String getDiskType() {
    return diskType;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }


  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("diskType", diskType);
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("zone", zone);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }


  public static ResourceNameFactory<DiskTypeName> newFactory() {
    return new ResourceNameFactory<DiskTypeName>() {
      public DiskTypeName parse(String formattedString) {return DiskTypeName.parse(formattedString);}
    };
  }

  public static DiskTypeName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DiskTypeName.parse: formattedString not in valid format");
    return of(
      matchMap.get("diskType"),
      matchMap.get("project"),
      matchMap.get("zone")
    );
  }

  /**
   * Returns {@code true} if the provided string matches the expected format of a disk type URL.
   * Returns {@code false} otherwise.
   */
  public static boolean matchesUrl(String url) {
    return PATTERN.matcher(url).matches();
  }

  public static DiskTypeName fromUrl(String url) {
    Matcher matcher = PATTERN.matcher(url);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(url + " is not a valid disk type URL");
    }
    return DiskTypeName.newBuilder()
      .setProject(matcher.group(1))
      .setZone(matcher.group(2))
      .setDiskType(matcher.group(3)).build();
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public static class Builder {
    private String diskType;
    private String project;
    private String zone;

    public String getDiskType() {
      return diskType;
    }
    public String getProject() {
      return project;
    }
    public String getZone() {
      return zone;
    }

    public Builder setDiskType(String diskType) {
      this.diskType = diskType;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    private Builder() {}

    public Builder (DiskTypeName diskTypeName) {
      diskType = diskTypeName.diskType;
      project = diskTypeName.project;
      zone = diskTypeName.zone;
    }

    public DiskTypeName build() {
      return new DiskTypeName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "diskType", diskType,
        "project", project,
        "zone", zone
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DiskTypeName) {
      DiskTypeName that = (DiskTypeName) o;
      return
          Objects.equals(this.diskType, that.getDiskType()) &&
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.zone, that.getZone())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      diskType,
      project,
      zone
    );
  }
}
