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
public final class SnapshotName implements ResourceName {
  private final String project;
  private final String snapshot;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/snapshots/{snapshot}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SnapshotName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    snapshot = Preconditions.checkNotNull(builder.getSnapshot());
  }

  public static SnapshotName of(
      String project,
      String snapshot
      ) {
    return newBuilder()
    .setProject(project)
    .setSnapshot(snapshot)
      .build();
  }

  public String getProject() {
    return project;
  }

  public String getSnapshot() {
    return snapshot;
  }


  public static SnapshotName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SnapshotName.parse: formattedString not in valid format");
    return of(
      matchMap.get("project"),
      matchMap.get("snapshot")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return SnapshotNameType.instance();
  }

  public static class Builder {
    private String project;
    private String snapshot;

    public String getProject() {
      return project;
    }
    public String getSnapshot() {
      return snapshot;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }
    public Builder setSnapshot(String snapshot) {
      this.snapshot = snapshot;
      return this;
    }

    private Builder() {}

    public Builder (SnapshotName snapshotName) {
      project = snapshotName.project;
      snapshot = snapshotName.snapshot;
    }

    public SnapshotName build() {
      return new SnapshotName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project,
        "snapshot", snapshot
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SnapshotName) {
      SnapshotName that = (SnapshotName) o;
      return
          Objects.equals(this.project, that.getProject()) &&
          Objects.equals(this.snapshot, that.getSnapshot())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      project,
      snapshot
    );
  }
}