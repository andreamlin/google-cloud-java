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
public final class HTTPHealthCheck implements ApiMessage {
  private final String host;
  private final Integer port;
  private final String portName;
  private final String proxyHeader;
  private final String requestPath;

  private HTTPHealthCheck() {
    this.host = null;
    this.port = null;
    this.portName = null;
    this.proxyHeader = null;
    this.requestPath = null;
  }


  private HTTPHealthCheck(
      String host,
      Integer port,
      String portName,
      String proxyHeader,
      String requestPath
      ) {
    this.host = host;
    this.port = port;
    this.portName = portName;
    this.proxyHeader = proxyHeader;
    this.requestPath = requestPath;
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("host") && host != null) {
      fieldMap.put("host", Collections.singletonList(String.valueOf(host)));
    }
    if (fieldNames.contains("port") && port != null) {
      fieldMap.put("port", Collections.singletonList(String.valueOf(port)));
    }
    if (fieldNames.contains("portName") && portName != null) {
      fieldMap.put("portName", Collections.singletonList(String.valueOf(portName)));
    }
    if (fieldNames.contains("proxyHeader") && proxyHeader != null) {
      fieldMap.put("proxyHeader", Collections.singletonList(String.valueOf(proxyHeader)));
    }
    if (fieldNames.contains("requestPath") && requestPath != null) {
      fieldMap.put("requestPath", Collections.singletonList(String.valueOf(requestPath)));
    }
    return fieldMap;
  }

  @Override
  public String getFieldStringValue(String fieldName) {
    if (fieldName.equals("host")) {
      return String.valueOf(host);
    }
    if (fieldName.equals("port")) {
      return String.valueOf(port);
    }
    if (fieldName.equals("portName")) {
      return String.valueOf(portName);
    }
    if (fieldName.equals("proxyHeader")) {
      return String.valueOf(proxyHeader);
    }
    if (fieldName.equals("requestPath")) {
      return String.valueOf(requestPath);
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  public String getHost() {
    return host;
  }

  public Integer getPort() {
    return port;
  }

  public String getPortName() {
    return portName;
  }

  public String getProxyHeader() {
    return proxyHeader;
  }

  public String getRequestPath() {
    return requestPath;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(HTTPHealthCheck prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static HTTPHealthCheck getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final HTTPHealthCheck DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HTTPHealthCheck();
  }

  public static class Builder {
    private String host;
    private Integer port;
    private String portName;
    private String proxyHeader;
    private String requestPath;

    Builder() {}

    public Builder mergeFrom(HTTPHealthCheck other) {
      if (other == HTTPHealthCheck.getDefaultInstance()) return this;
      if (other.getHost() != null) {
        this.host = other.host;
      }
      if (other.getPort() != null) {
        this.port = other.port;
      }
      if (other.getPortName() != null) {
        this.portName = other.portName;
      }
      if (other.getProxyHeader() != null) {
        this.proxyHeader = other.proxyHeader;
      }
      if (other.getRequestPath() != null) {
        this.requestPath = other.requestPath;
      }
      return this;
    }

    Builder(HTTPHealthCheck source) {
      this.host = source.host;
      this.port = source.port;
      this.portName = source.portName;
      this.proxyHeader = source.proxyHeader;
      this.requestPath = source.requestPath;
    }

    public String getHost() {
      return host;
    }

    public Builder setHost(String host) {
      this.host = host;
      return this;
    }

    public Integer getPort() {
      return port;
    }

    public Builder setPort(Integer port) {
      this.port = port;
      return this;
    }

    public String getPortName() {
      return portName;
    }

    public Builder setPortName(String portName) {
      this.portName = portName;
      return this;
    }

    public String getProxyHeader() {
      return proxyHeader;
    }

    public Builder setProxyHeader(String proxyHeader) {
      this.proxyHeader = proxyHeader;
      return this;
    }

    public String getRequestPath() {
      return requestPath;
    }

    public Builder setRequestPath(String requestPath) {
      this.requestPath = requestPath;
      return this;
    }


    public HTTPHealthCheck build() {




      return new HTTPHealthCheck(
        host,
        port,
        portName,
        proxyHeader,
        requestPath
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setHost(this.host);
      newBuilder.setPort(this.port);
      newBuilder.setPortName(this.portName);
      newBuilder.setProxyHeader(this.proxyHeader);
      newBuilder.setRequestPath(this.requestPath);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "HTTPHealthCheck{"
        + "host=" + host + ", "
        + "port=" + port + ", "
        + "portName=" + portName + ", "
        + "proxyHeader=" + proxyHeader + ", "
        + "requestPath=" + requestPath
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HTTPHealthCheck) {
      HTTPHealthCheck that = (HTTPHealthCheck) o;
      return
          Objects.equals(this.host, that.getHost()) &&
          Objects.equals(this.port, that.getPort()) &&
          Objects.equals(this.portName, that.getPortName()) &&
          Objects.equals(this.proxyHeader, that.getProxyHeader()) &&
          Objects.equals(this.requestPath, that.getRequestPath())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      host,
      port,
      portName,
      proxyHeader,
      requestPath
    );
  }
}
