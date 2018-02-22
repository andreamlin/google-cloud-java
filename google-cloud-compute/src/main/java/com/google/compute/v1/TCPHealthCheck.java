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
public final class TCPHealthCheck implements ApiMessage {
  private final Integer port;
  private final String portName;
  private final String proxyHeader;
  private final String request;
  private final String response;
  private final Map<String, String> pathParams;

  private TCPHealthCheck() {
    this.port = null;
    this.portName = null;
    this.proxyHeader = null;
    this.request = null;
    this.response = null;
    this.pathParams = ImmutableMap.of();
  }


  private TCPHealthCheck(
      Integer port,
      String portName,
      String proxyHeader,
      String request,
      String response
      ) {
    this.port = port;
    this.portName = portName;
    this.proxyHeader = proxyHeader;
    this.request = request;
    this.response = response;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("port") && port != null) {
      fieldMap.put("port", Collections.singletonList(String.valueOf(port)));
    }
    if (fieldNames.contains("portName") && portName != null) {
      fieldMap.put("portName", Collections.singletonList(String.valueOf(portName)));
    }
    if (fieldNames.contains("proxyHeader") && proxyHeader != null) {
      fieldMap.put("proxyHeader", Collections.singletonList(String.valueOf(proxyHeader)));
    }
    if (fieldNames.contains("request") && request != null) {
      fieldMap.put("request", Collections.singletonList(String.valueOf(request)));
    }
    if (fieldNames.contains("response") && response != null) {
      fieldMap.put("response", Collections.singletonList(String.valueOf(response)));
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

  public Integer getPort() {
    return port;
  }

  public String getPortName() {
    return portName;
  }

  public String getProxyHeader() {
    return proxyHeader;
  }

  public String getRequest() {
    return request;
  }

  public String getResponse() {
    return response;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TCPHealthCheck prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TCPHealthCheck getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final TCPHealthCheck DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TCPHealthCheck();
  }

  public static class Builder {
    private Integer port;
    private String portName;
    private String proxyHeader;
    private String request;
    private String response;

    Builder() {}

    public Builder mergeFrom(TCPHealthCheck other) {
      if (other == TCPHealthCheck.getDefaultInstance()) return this;
      if (other.getPort() != null) {
        this.port = other.port;
      }
      if (other.getPortName() != null) {
        this.portName = other.portName;
      }
      if (other.getProxyHeader() != null) {
        this.proxyHeader = other.proxyHeader;
      }
      if (other.getRequest() != null) {
        this.request = other.request;
      }
      if (other.getResponse() != null) {
        this.response = other.response;
      }
      return this;
    }

    Builder(TCPHealthCheck source) {
      this.port = source.port;
      this.portName = source.portName;
      this.proxyHeader = source.proxyHeader;
      this.request = source.request;
      this.response = source.response;
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

    public String getRequest() {
      return request;
    }

    public Builder setRequest(String request) {
      this.request = request;
      return this;
    }

    public String getResponse() {
      return response;
    }

    public Builder setResponse(String response) {
      this.response = response;
      return this;
    }


    public TCPHealthCheck build() {




      return new TCPHealthCheck(
        port,
        portName,
        proxyHeader,
        request,
        response
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setPort(this.port);
      newBuilder.setPortName(this.portName);
      newBuilder.setProxyHeader(this.proxyHeader);
      newBuilder.setRequest(this.request);
      newBuilder.setResponse(this.response);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TCPHealthCheck{"
        + "port=" + port + ", "
        + "portName=" + portName + ", "
        + "proxyHeader=" + proxyHeader + ", "
        + "request=" + request + ", "
        + "response=" + response
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TCPHealthCheck) {
      TCPHealthCheck that = (TCPHealthCheck) o;
      return
          Objects.equals(this.port, that.getPort()) &&
          Objects.equals(this.portName, that.getPortName()) &&
          Objects.equals(this.proxyHeader, that.getProxyHeader()) &&
          Objects.equals(this.request, that.getRequest()) &&
          Objects.equals(this.response, that.getResponse())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      port,
      portName,
      proxyHeader,
      request,
      response
    );
  }
}
