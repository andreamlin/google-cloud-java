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
public final class ImageName implements ResourceName {
  private final String image;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
        PathTemplate.createWithoutUrlEncoding("projects/{project}/images/{image}");

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ImageName(Builder builder) {
    image = Preconditions.checkNotNull(builder.getImage());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static ImageName create(
      String image,
      String project
      ) {
    return newBuilder()
    .setImage(image)
    .setProject(project)
      .build();
  }

  public String getImage() {
    return image;
  }

  public String getProject() {
    return project;
  }


  public static ImageName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ImageName.parse: formattedString not in valid format");
    return create(
      matchMap.get("image"),
      matchMap.get("project")
    );
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return ImageNameType.instance();
  }

  public static class Builder {
    private String image;
    private String project;

    public String getImage() {
      return image;
    }
    public String getProject() {
      return project;
    }

    public Builder setImage(String image) {
      this.image = image;
      return this;
    }
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder (ImageName imageName) {
      image = imageName.image;
      project = imageName.project;
    }

    public ImageName build() {
      return new ImageName(this);
    }
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "image", image,
        "project", project
        );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ImageName) {
      ImageName that = (ImageName) o;
      return
          Objects.equals(this.image, that.getImage()) &&
          Objects.equals(this.project, that.getProject())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      image,
      project
    );
  }
}
