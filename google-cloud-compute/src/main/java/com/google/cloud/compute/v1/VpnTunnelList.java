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
public final class VpnTunnelList implements ApiMessage {
  private final String id;
  private final List<VpnTunnel> items;
  private final String kind;
  private final String nextPageToken;
  private final String selfLink;

  private VpnTunnelList() {
    this.id = null;
    this.items = null;
    this.kind = null;
    this.nextPageToken = null;
    this.selfLink = null;
  }


  private VpnTunnelList(
      String id,
      List<VpnTunnel> items,
      String kind,
      String nextPageToken,
      String selfLink
      ) {
    this.id = id;
    this.items = items;
    this.kind = kind;
    this.nextPageToken = nextPageToken;
    this.selfLink = selfLink;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("items") && items != null) {
      ImmutableList.Builder stringList = ImmutableList.builder();
      for (VpnTunnel item : items) {
        stringList.add(item.toString());
      }
      fieldMap.put("items", stringList.build());
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("nextPageToken") && nextPageToken != null) {
      fieldMap.put("nextPageToken", Collections.singletonList(String.valueOf(nextPageToken)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("id")) {
      return String.valueOf(id);
    }
    if (fieldName.equals("items")) {
      return String.valueOf(items);
    }
    if (fieldName.equals("kind")) {
      return String.valueOf(kind);
    }
    if (fieldName.equals("nextPageToken")) {
      return String.valueOf(nextPageToken);
    }
    if (fieldName.equals("selfLink")) {
      return String.valueOf(selfLink);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getId() {
    return id;
  }

  public List<VpnTunnel> getItemsList() {
    return items;
  }

  public String getKind() {
    return kind;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public String getSelfLink() {
    return selfLink;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(VpnTunnelList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static VpnTunnelList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final VpnTunnelList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VpnTunnelList();
  }

  public static class Builder {
    private String id;
    private List<VpnTunnel> items;
    private String kind;
    private String nextPageToken;
    private String selfLink;

    Builder() {}

    public Builder mergeFrom(VpnTunnelList other) {
      if (other == VpnTunnelList.getDefaultInstance()) return this;
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getItemsList() != null) {
        this.items = other.items;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNextPageToken() != null) {
        this.nextPageToken = other.nextPageToken;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      return this;
    }

    Builder(VpnTunnelList source) {
      this.id = source.id;
      this.items = source.items;
      this.kind = source.kind;
      this.nextPageToken = source.nextPageToken;
      this.selfLink = source.selfLink;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public List<VpnTunnel> getItemsList() {
      return items;
    }

    public Builder addAllItems(List<VpnTunnel> items) {
      if (this.items == null) {
        this.items = new ArrayList<>(items.size());
      }
      this.items.addAll(items);
      return this;
    }

    public Builder addItems(VpnTunnel items) {
      this.items.add(items);
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getNextPageToken() {
      return nextPageToken;
    }

    public Builder setNextPageToken(String nextPageToken) {
      this.nextPageToken = nextPageToken;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }


    public VpnTunnelList build() {




      return new VpnTunnelList(
        id,
        items,
        kind,
        nextPageToken,
        selfLink
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setId(this.id);
      newBuilder.addAllItems(this.items);
      newBuilder.setKind(this.kind);
      newBuilder.setNextPageToken(this.nextPageToken);
      newBuilder.setSelfLink(this.selfLink);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "VpnTunnelList{"
        + "id=" + id + ", "
        + "items=" + items + ", "
        + "kind=" + kind + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "selfLink=" + selfLink
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VpnTunnelList) {
      VpnTunnelList that = (VpnTunnelList) o;
      return
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.items, that.getItemsList()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.nextPageToken, that.getNextPageToken()) &&
          Objects.equals(this.selfLink, that.getSelfLink())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id,
      items,
      kind,
      nextPageToken,
      selfLink
    );
  }
}