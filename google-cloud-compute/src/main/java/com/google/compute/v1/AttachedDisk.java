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
import com.google.api.resourcenames.ResourceName;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class AttachedDisk implements ApiMessage {
  private final Boolean autoDelete;
  private final Boolean boot;
  private final String deviceName;
  private final CustomerEncryptionKey diskEncryptionKey;
  private final Integer index;
  private final AttachedDiskInitializeParams initializeParams;
  private final String interface2;
  private final String kind;
  private final List<String> licenses;
  private final String mode;
  private final String source;
  private final String type;
  private final Map<String, String> pathParams;

  private AttachedDisk() {
    this.autoDelete = null;
    this.boot = null;
    this.deviceName = null;
    this.diskEncryptionKey = null;
    this.index = null;
    this.initializeParams = null;
    this.interface2 = null;
    this.kind = null;
    this.licenses = null;
    this.mode = null;
    this.source = null;
    this.type = null;
    this.pathParams = ImmutableMap.of();
  }


  private AttachedDisk(
      Boolean autoDelete,
      Boolean boot,
      String deviceName,
      CustomerEncryptionKey diskEncryptionKey,
      Integer index,
      AttachedDiskInitializeParams initializeParams,
      String interface2,
      String kind,
      List<String> licenses,
      String mode,
      String source,
      String type
      ) {
    this.autoDelete = autoDelete;
    this.boot = boot;
    this.deviceName = deviceName;
    this.diskEncryptionKey = diskEncryptionKey;
    this.index = index;
    this.initializeParams = initializeParams;
    this.interface2 = interface2;
    this.kind = kind;
    this.licenses = licenses;
    this.mode = mode;
    this.source = source;
    this.type = type;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("autoDelete") && autoDelete != null) {
      fieldMap.put("autoDelete", Collections.singletonList(String.valueOf(autoDelete)));
    }
    if (fieldNames.contains("boot") && boot != null) {
      fieldMap.put("boot", Collections.singletonList(String.valueOf(boot)));
    }
    if (fieldNames.contains("deviceName") && deviceName != null) {
      fieldMap.put("deviceName", Collections.singletonList(String.valueOf(deviceName)));
    }
    if (fieldNames.contains("diskEncryptionKey") && diskEncryptionKey != null) {
      fieldMap.put("diskEncryptionKey", Collections.singletonList(String.valueOf(diskEncryptionKey)));
    }
    if (fieldNames.contains("index") && index != null) {
      fieldMap.put("index", Collections.singletonList(String.valueOf(index)));
    }
    if (fieldNames.contains("initializeParams") && initializeParams != null) {
      fieldMap.put("initializeParams", Collections.singletonList(String.valueOf(initializeParams)));
    }
    if (fieldNames.contains("interface2") && interface2 != null) {
      fieldMap.put("interface2", Collections.singletonList(String.valueOf(interface2)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("licenses") && licenses != null) {
      fieldMap.put("licenses", licenses.stream().map(item -> item.toString()).collect(Collectors.toList()));
    }
    if (fieldNames.contains("mode") && mode != null) {
      fieldMap.put("mode", Collections.singletonList(String.valueOf(mode)));
    }
    if (fieldNames.contains("source") && source != null) {
      fieldMap.put("source", Collections.singletonList(String.valueOf(source)));
    }
    if (fieldNames.contains("type") && type != null) {
      fieldMap.put("type", Collections.singletonList(String.valueOf(type)));
    }
    return fieldMap;
  }

  @Override
  public Map<String, String> getApiMessagePathParams() {
    return pathParams;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public Boolean getAutoDelete() {
    return autoDelete;
  }

  public Boolean getBoot() {
    return boot;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  public Integer getIndex() {
    return index;
  }

  public AttachedDiskInitializeParams getInitializeParams() {
    return initializeParams;
  }

  public String getInterface() {
    return interface2;
  }

  public String getKind() {
    return kind;
  }

  public List<String> getLicenses() {
    return licenses;
  }

  public String getMode() {
    return mode;
  }

  public String getSource() {
    return source;
  }

  public String getType() {
    return type;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AttachedDisk prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AttachedDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final AttachedDisk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AttachedDisk();
  }

  public static class Builder {
    private Boolean autoDelete;
    private Boolean boot;
    private String deviceName;
    private CustomerEncryptionKey diskEncryptionKey;
    private Integer index;
    private AttachedDiskInitializeParams initializeParams;
    private String interface2;
    private String kind;
    private List<String> licenses;
    private String mode;
    private String source;
    private String type;

    Builder() {}

    public Builder mergeFrom(AttachedDisk other) {
      if (other == AttachedDisk.getDefaultInstance()) return this;
      if (other.getAutoDelete() != null) {
        this.autoDelete = other.autoDelete;
      }
      if (other.getBoot() != null) {
        this.boot = other.boot;
      }
      if (other.getDeviceName() != null) {
        this.deviceName = other.deviceName;
      }
      if (other.getDiskEncryptionKey() != null) {
        this.diskEncryptionKey = other.diskEncryptionKey;
      }
      if (other.getIndex() != null) {
        this.index = other.index;
      }
      if (other.getInitializeParams() != null) {
        this.initializeParams = other.initializeParams;
      }
      if (other.getInterface() != null) {
        this.interface2 = other.interface2;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getLicenses() != null) {
        this.licenses = other.licenses;
      }
      if (other.getMode() != null) {
        this.mode = other.mode;
      }
      if (other.getSource() != null) {
        this.source = other.source;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(AttachedDisk source) {
      this.autoDelete = source.autoDelete;
      this.boot = source.boot;
      this.deviceName = source.deviceName;
      this.diskEncryptionKey = source.diskEncryptionKey;
      this.index = source.index;
      this.initializeParams = source.initializeParams;
      this.interface2 = source.interface2;
      this.kind = source.kind;
      this.licenses = source.licenses;
      this.mode = source.mode;
      this.source = source.source;
      this.type = source.type;
    }

    public Boolean getAutoDelete() {
      return autoDelete;
    }

    public Builder setAutoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    public Boolean getBoot() {
      return boot;
    }

    public Builder setBoot(Boolean boot) {
      this.boot = boot;
      return this;
    }

    public String getDeviceName() {
      return deviceName;
    }

    public Builder setDeviceName(String deviceName) {
      this.deviceName = deviceName;
      return this;
    }

    public CustomerEncryptionKey getDiskEncryptionKey() {
      return diskEncryptionKey;
    }

    public Builder setDiskEncryptionKey(CustomerEncryptionKey diskEncryptionKey) {
      this.diskEncryptionKey = diskEncryptionKey;
      return this;
    }

    public Integer getIndex() {
      return index;
    }

    public Builder setIndex(Integer index) {
      this.index = index;
      return this;
    }

    public AttachedDiskInitializeParams getInitializeParams() {
      return initializeParams;
    }

    public Builder setInitializeParams(AttachedDiskInitializeParams initializeParams) {
      this.initializeParams = initializeParams;
      return this;
    }

    public String getInterface() {
      return interface2;
    }

    public Builder setInterface(String interface2) {
      this.interface2 = interface2;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public List<String> getLicenses() {
      return licenses;
    }

    public Builder addAllLicenses(List<String> licenses) {
      this.licenses.addAll(licenses);
      return this;
    }

    public Builder addLicenses(String licenses) {
      this.licenses.add(licenses);
      return this;
    }

    public String getMode() {
      return mode;
    }

    public Builder setMode(String mode) {
      this.mode = mode;
      return this;
    }

    public String getSource() {
      return source;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    public String getType() {
      return type;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }


    public AttachedDisk build() {











      return new AttachedDisk(
        autoDelete,
        boot,
        deviceName,
        diskEncryptionKey,
        index,
        initializeParams,
        interface2,
        kind,
        licenses,
        mode,
        source,
        type
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAutoDelete(this.autoDelete);
      newBuilder.setBoot(this.boot);
      newBuilder.setDeviceName(this.deviceName);
      newBuilder.setDiskEncryptionKey(this.diskEncryptionKey);
      newBuilder.setIndex(this.index);
      newBuilder.setInitializeParams(this.initializeParams);
      newBuilder.setInterface(this.interface2);
      newBuilder.setKind(this.kind);
      newBuilder.addAllLicenses(this.licenses);
      newBuilder.setMode(this.mode);
      newBuilder.setSource(this.source);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AttachedDisk{"
        + "autoDelete=" + autoDelete + ", "
        + "boot=" + boot + ", "
        + "deviceName=" + deviceName + ", "
        + "diskEncryptionKey=" + diskEncryptionKey + ", "
        + "index=" + index + ", "
        + "initializeParams=" + initializeParams + ", "
        + "interface2=" + interface2 + ", "
        + "kind=" + kind + ", "
        + "licenses=" + licenses + ", "
        + "mode=" + mode + ", "
        + "source=" + source + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AttachedDisk) {
      AttachedDisk that = (AttachedDisk) o;
      return
          Objects.equals(this.autoDelete, that.getAutoDelete()) &&
          Objects.equals(this.boot, that.getBoot()) &&
          Objects.equals(this.deviceName, that.getDeviceName()) &&
          Objects.equals(this.diskEncryptionKey, that.getDiskEncryptionKey()) &&
          Objects.equals(this.index, that.getIndex()) &&
          Objects.equals(this.initializeParams, that.getInitializeParams()) &&
          Objects.equals(this.interface2, that.getInterface()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.licenses, that.getLicenses()) &&
          Objects.equals(this.mode, that.getMode()) &&
          Objects.equals(this.source, that.getSource()) &&
          Objects.equals(this.type, that.getType())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      autoDelete,
      boot,
      deviceName,
      diskEncryptionKey,
      index,
      initializeParams,
      interface2,
      kind,
      licenses,
      mode,
      source,
      type
    );
  }
}
