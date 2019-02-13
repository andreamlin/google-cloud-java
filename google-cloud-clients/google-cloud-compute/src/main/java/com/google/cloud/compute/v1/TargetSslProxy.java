/*
 * Copyright 2019 Google LLC
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
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * A TargetSslProxy resource. This resource defines an SSL proxy. (== resource_for
 * beta.targetSslProxies ==) (== resource_for v1.targetSslProxies ==)
 */
public final class TargetSslProxy implements ApiMessage {
  private final String creationTimestamp;
  private final String description;
  private final String id;
  private final String kind;
  private final String name;
  private final String proxyHeader;
  private final String selfLink;
  private final String service;
  private final List<String> sslCertificates;
  private final String sslPolicy;

  private TargetSslProxy() {
    this.creationTimestamp = null;
    this.description = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.proxyHeader = null;
    this.selfLink = null;
    this.service = null;
    this.sslCertificates = null;
    this.sslPolicy = null;
  }

  private TargetSslProxy(
      String creationTimestamp,
      String description,
      String id,
      String kind,
      String name,
      String proxyHeader,
      String selfLink,
      String service,
      List<String> sslCertificates,
      String sslPolicy) {
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.proxyHeader = proxyHeader;
    this.selfLink = selfLink;
    this.service = service;
    this.sslCertificates = sslCertificates;
    this.sslPolicy = sslPolicy;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("creationTimestamp".equals(fieldName)) {
      return creationTimestamp;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("proxyHeader".equals(fieldName)) {
      return proxyHeader;
    }
    if ("selfLink".equals(fieldName)) {
      return selfLink;
    }
    if ("service".equals(fieldName)) {
      return service;
    }
    if ("sslCertificates".equals(fieldName)) {
      return sslCertificates;
    }
    if ("sslPolicy".equals(fieldName)) {
      return sslPolicy;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** [Output Only] Creation timestamp in RFC3339 text format. */
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   */
  public String getDescription() {
    return description;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   */
  public String getId() {
    return id;
  }

  /** [Output Only] Type of the resource. Always compute#targetSslProxy for target SSL proxies. */
  public String getKind() {
    return kind;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   */
  public String getName() {
    return name;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   */
  public String getProxyHeader() {
    return proxyHeader;
  }

  /** [Output Only] Server-defined URL for the resource. */
  public String getSelfLink() {
    return selfLink;
  }

  /** URL to the BackendService resource. */
  public String getService() {
    return service;
  }

  /**
   * URLs to SslCertificate resources that are used to authenticate connections to Backends. At
   * least one SSL certificate must be specified. Currently, you may specify up to 15 SSL
   * certificates.
   */
  public List<String> getSslCertificatesList() {
    return sslCertificates;
  }

  /**
   * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set,
   * the TargetSslProxy resource will not have any SSL policy configured.
   */
  public String getSslPolicy() {
    return sslPolicy;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(TargetSslProxy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetSslProxy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final TargetSslProxy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new TargetSslProxy();
  }

  public static class Builder {
    private String creationTimestamp;
    private String description;
    private String id;
    private String kind;
    private String name;
    private String proxyHeader;
    private String selfLink;
    private String service;
    private List<String> sslCertificates;
    private String sslPolicy;

    Builder() {}

    public Builder mergeFrom(TargetSslProxy other) {
      if (other == TargetSslProxy.getDefaultInstance()) return this;
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getProxyHeader() != null) {
        this.proxyHeader = other.proxyHeader;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getService() != null) {
        this.service = other.service;
      }
      if (other.getSslCertificatesList() != null) {
        this.sslCertificates = other.sslCertificates;
      }
      if (other.getSslPolicy() != null) {
        this.sslPolicy = other.sslPolicy;
      }
      return this;
    }

    Builder(TargetSslProxy source) {
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.proxyHeader = source.proxyHeader;
      this.selfLink = source.selfLink;
      this.service = source.service;
      this.sslCertificates = source.sslCertificates;
      this.sslPolicy = source.sslPolicy;
    }

    /** [Output Only] Creation timestamp in RFC3339 text format. */
    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    /** [Output Only] Creation timestamp in RFC3339 text format. */
    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public String getDescription() {
      return description;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * [Output Only] The unique identifier for the resource. This identifier is defined by the
     * server.
     */
    public String getId() {
      return id;
    }

    /**
     * [Output Only] The unique identifier for the resource. This identifier is defined by the
     * server.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** [Output Only] Type of the resource. Always compute#targetSslProxy for target SSL proxies. */
    public String getKind() {
      return kind;
    }

    /** [Output Only] Type of the resource. Always compute#targetSslProxy for target SSL proxies. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     */
    public String getName() {
      return name;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE
     * or PROXY_V1. The default is NONE.
     */
    public String getProxyHeader() {
      return proxyHeader;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE
     * or PROXY_V1. The default is NONE.
     */
    public Builder setProxyHeader(String proxyHeader) {
      this.proxyHeader = proxyHeader;
      return this;
    }

    /** [Output Only] Server-defined URL for the resource. */
    public String getSelfLink() {
      return selfLink;
    }

    /** [Output Only] Server-defined URL for the resource. */
    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    /** URL to the BackendService resource. */
    public String getService() {
      return service;
    }

    /** URL to the BackendService resource. */
    public Builder setService(String service) {
      this.service = service;
      return this;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At
     * least one SSL certificate must be specified. Currently, you may specify up to 15 SSL
     * certificates.
     */
    public List<String> getSslCertificatesList() {
      return sslCertificates;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At
     * least one SSL certificate must be specified. Currently, you may specify up to 15 SSL
     * certificates.
     */
    public Builder addAllSslCertificates(List<String> sslCertificates) {
      if (this.sslCertificates == null) {
        this.sslCertificates = new LinkedList<>();
      }
      this.sslCertificates.addAll(sslCertificates);
      return this;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At
     * least one SSL certificate must be specified. Currently, you may specify up to 15 SSL
     * certificates.
     */
    public Builder addSslCertificates(String sslCertificates) {
      if (this.sslCertificates == null) {
        this.sslCertificates = new LinkedList<>();
      }
      this.sslCertificates.add(sslCertificates);
      return this;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not
     * set, the TargetSslProxy resource will not have any SSL policy configured.
     */
    public String getSslPolicy() {
      return sslPolicy;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not
     * set, the TargetSslProxy resource will not have any SSL policy configured.
     */
    public Builder setSslPolicy(String sslPolicy) {
      this.sslPolicy = sslPolicy;
      return this;
    }

    public TargetSslProxy build() {

      return new TargetSslProxy(
          creationTimestamp,
          description,
          id,
          kind,
          name,
          proxyHeader,
          selfLink,
          service,
          sslCertificates,
          sslPolicy);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setProxyHeader(this.proxyHeader);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setService(this.service);
      newBuilder.addAllSslCertificates(this.sslCertificates);
      newBuilder.setSslPolicy(this.sslPolicy);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetSslProxy{"
        + "creationTimestamp="
        + creationTimestamp
        + ", "
        + "description="
        + description
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "name="
        + name
        + ", "
        + "proxyHeader="
        + proxyHeader
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "service="
        + service
        + ", "
        + "sslCertificates="
        + sslCertificates
        + ", "
        + "sslPolicy="
        + sslPolicy
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetSslProxy) {
      TargetSslProxy that = (TargetSslProxy) o;
      return Objects.equals(this.creationTimestamp, that.getCreationTimestamp())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.proxyHeader, that.getProxyHeader())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.service, that.getService())
          && Objects.equals(this.sslCertificates, that.getSslCertificatesList())
          && Objects.equals(this.sslPolicy, that.getSslPolicy());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        description,
        id,
        kind,
        name,
        proxyHeader,
        selfLink,
        service,
        sslCertificates,
        sslPolicy);
  }
}
