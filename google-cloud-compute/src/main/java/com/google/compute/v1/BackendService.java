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
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class BackendService implements ApiMessage {
  private final Integer affinityCookieTtlSec;
  private final List<Backend> backends;
  private final ConnectionDraining connectionDraining;
  private final String creationTimestamp;
  private final String description;
  private final Boolean enableCDN;
  private final String fingerprint;
  private final List<String> healthChecks;
  private final String id;
  private final String kind;
  private final String loadBalancingScheme;
  private final String name;
  private final Integer port;
  private final String portName;
  private final String protocol;
  private final String region;
  private final String selfLink;
  private final String sessionAffinity;
  private final Integer timeoutSec;
  private final Map<String, String> pathParams;

  private BackendService() {
    this.affinityCookieTtlSec = null;
    this.backends = null;
    this.connectionDraining = null;
    this.creationTimestamp = null;
    this.description = null;
    this.enableCDN = null;
    this.fingerprint = null;
    this.healthChecks = null;
    this.id = null;
    this.kind = null;
    this.loadBalancingScheme = null;
    this.name = null;
    this.port = null;
    this.portName = null;
    this.protocol = null;
    this.region = null;
    this.selfLink = null;
    this.sessionAffinity = null;
    this.timeoutSec = null;
    this.pathParams = ImmutableMap.of();
  }


  private BackendService(
      Integer affinityCookieTtlSec,
      List<Backend> backends,
      ConnectionDraining connectionDraining,
      String creationTimestamp,
      String description,
      Boolean enableCDN,
      String fingerprint,
      List<String> healthChecks,
      String id,
      String kind,
      String loadBalancingScheme,
      String name,
      Integer port,
      String portName,
      String protocol,
      String region,
      String selfLink,
      String sessionAffinity,
      Integer timeoutSec
      ) {
    this.affinityCookieTtlSec = affinityCookieTtlSec;
    this.backends = backends;
    this.connectionDraining = connectionDraining;
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.enableCDN = enableCDN;
    this.fingerprint = fingerprint;
    this.healthChecks = healthChecks;
    this.id = id;
    this.kind = kind;
    this.loadBalancingScheme = loadBalancingScheme;
    this.name = name;
    this.port = port;
    this.portName = portName;
    this.protocol = protocol;
    this.region = region;
    this.selfLink = selfLink;
    this.sessionAffinity = sessionAffinity;
    this.timeoutSec = timeoutSec;
    ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
    this.pathParams = mapBuilder.build();
  }

  @Override
  public Map<String, List<String>> populateFieldsInMap(Set<String> fieldNames) {
    Map<String, List<String>> fieldMap = new HashMap<>();
    if (fieldNames.contains("affinityCookieTtlSec") && affinityCookieTtlSec != null) {
      fieldMap.put("affinityCookieTtlSec", Collections.singletonList(String.valueOf(affinityCookieTtlSec)));
    }
    if (fieldNames.contains("backends") && backends != null) {
      fieldMap.put("backends", backends);
    }
    if (fieldNames.contains("connectionDraining") && connectionDraining != null) {
      fieldMap.put("connectionDraining", Collections.singletonList(String.valueOf(connectionDraining)));
    }
    if (fieldNames.contains("creationTimestamp") && creationTimestamp != null) {
      fieldMap.put("creationTimestamp", Collections.singletonList(String.valueOf(creationTimestamp)));
    }
    if (fieldNames.contains("description") && description != null) {
      fieldMap.put("description", Collections.singletonList(String.valueOf(description)));
    }
    if (fieldNames.contains("enableCDN") && enableCDN != null) {
      fieldMap.put("enableCDN", Collections.singletonList(String.valueOf(enableCDN)));
    }
    if (fieldNames.contains("fingerprint") && fingerprint != null) {
      fieldMap.put("fingerprint", Collections.singletonList(String.valueOf(fingerprint)));
    }
    if (fieldNames.contains("healthChecks") && healthChecks != null) {
      fieldMap.put("healthChecks", healthChecks);
    }
    if (fieldNames.contains("id") && id != null) {
      fieldMap.put("id", Collections.singletonList(String.valueOf(id)));
    }
    if (fieldNames.contains("kind") && kind != null) {
      fieldMap.put("kind", Collections.singletonList(String.valueOf(kind)));
    }
    if (fieldNames.contains("loadBalancingScheme") && loadBalancingScheme != null) {
      fieldMap.put("loadBalancingScheme", Collections.singletonList(String.valueOf(loadBalancingScheme)));
    }
    if (fieldNames.contains("name") && name != null) {
      fieldMap.put("name", Collections.singletonList(String.valueOf(name)));
    }
    if (fieldNames.contains("port") && port != null) {
      fieldMap.put("port", Collections.singletonList(String.valueOf(port)));
    }
    if (fieldNames.contains("portName") && portName != null) {
      fieldMap.put("portName", Collections.singletonList(String.valueOf(portName)));
    }
    if (fieldNames.contains("protocol") && protocol != null) {
      fieldMap.put("protocol", Collections.singletonList(String.valueOf(protocol)));
    }
    if (fieldNames.contains("region") && region != null) {
      fieldMap.put("region", Collections.singletonList(String.valueOf(region)));
    }
    if (fieldNames.contains("selfLink") && selfLink != null) {
      fieldMap.put("selfLink", Collections.singletonList(String.valueOf(selfLink)));
    }
    if (fieldNames.contains("sessionAffinity") && sessionAffinity != null) {
      fieldMap.put("sessionAffinity", Collections.singletonList(String.valueOf(sessionAffinity)));
    }
    if (fieldNames.contains("timeoutSec") && timeoutSec != null) {
      fieldMap.put("timeoutSec", Collections.singletonList(String.valueOf(timeoutSec)));
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

  public Integer getAffinityCookieTtlSec() {
    return affinityCookieTtlSec;
  }

  public List<Backend> getBackends() {
    return backends;
  }

  public ConnectionDraining getConnectionDraining() {
    return connectionDraining;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDescription() {
    return description;
  }

  public Boolean getEnableCDN() {
    return enableCDN;
  }

  public String getFingerprint() {
    return fingerprint;
  }

  public List<String> getHealthChecks() {
    return healthChecks;
  }

  public String getId() {
    return id;
  }

  public String getKind() {
    return kind;
  }

  public String getLoadBalancingScheme() {
    return loadBalancingScheme;
  }

  public String getName() {
    return name;
  }

  public Integer getPort() {
    return port;
  }

  public String getPortName() {
    return portName;
  }

  public String getProtocol() {
    return protocol;
  }

  public String getRegion() {
    return region;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public String getSessionAffinity() {
    return sessionAffinity;
  }

  public Integer getTimeoutSec() {
    return timeoutSec;
  }


  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BackendService prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  public static BackendService getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }
  private static final BackendService DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BackendService();
  }

  public static class Builder {
    private Integer affinityCookieTtlSec;
    private List<Backend> backends;
    private ConnectionDraining connectionDraining;
    private String creationTimestamp;
    private String description;
    private Boolean enableCDN;
    private String fingerprint;
    private List<String> healthChecks;
    private String id;
    private String kind;
    private String loadBalancingScheme;
    private String name;
    private Integer port;
    private String portName;
    private String protocol;
    private String region;
    private String selfLink;
    private String sessionAffinity;
    private Integer timeoutSec;

    Builder() {}

    public Builder mergeFrom(BackendService other) {
      if (other == BackendService.getDefaultInstance()) return this;
      if (other.getAffinityCookieTtlSec() != null) {
        this.affinityCookieTtlSec = other.affinityCookieTtlSec;
      }
      if (other.getBackends() != null) {
        this.backends = other.backends;
      }
      if (other.getConnectionDraining() != null) {
        this.connectionDraining = other.connectionDraining;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getEnableCDN() != null) {
        this.enableCDN = other.enableCDN;
      }
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getHealthChecks() != null) {
        this.healthChecks = other.healthChecks;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getLoadBalancingScheme() != null) {
        this.loadBalancingScheme = other.loadBalancingScheme;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getPort() != null) {
        this.port = other.port;
      }
      if (other.getPortName() != null) {
        this.portName = other.portName;
      }
      if (other.getProtocol() != null) {
        this.protocol = other.protocol;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getSessionAffinity() != null) {
        this.sessionAffinity = other.sessionAffinity;
      }
      if (other.getTimeoutSec() != null) {
        this.timeoutSec = other.timeoutSec;
      }
      return this;
    }

    Builder(BackendService source) {
      this.affinityCookieTtlSec = source.affinityCookieTtlSec;
      this.backends = source.backends;
      this.connectionDraining = source.connectionDraining;
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.enableCDN = source.enableCDN;
      this.fingerprint = source.fingerprint;
      this.healthChecks = source.healthChecks;
      this.id = source.id;
      this.kind = source.kind;
      this.loadBalancingScheme = source.loadBalancingScheme;
      this.name = source.name;
      this.port = source.port;
      this.portName = source.portName;
      this.protocol = source.protocol;
      this.region = source.region;
      this.selfLink = source.selfLink;
      this.sessionAffinity = source.sessionAffinity;
      this.timeoutSec = source.timeoutSec;
    }

    public Integer getAffinityCookieTtlSec() {
      return affinityCookieTtlSec;
    }

    public Builder setAffinityCookieTtlSec(Integer affinityCookieTtlSec) {
      this.affinityCookieTtlSec = affinityCookieTtlSec;
      return this;
    }

    public List<Backend> getBackends() {
      return backends;
    }

    public Builder addAllBackends(List<Backend> backends) {
      this.backends.addAll(backends);
      return this;
    }

    public Builder addBackends(Backend backends) {
      this.backends.add(backends);
      return this;
    }

    public ConnectionDraining getConnectionDraining() {
      return connectionDraining;
    }

    public Builder setConnectionDraining(ConnectionDraining connectionDraining) {
      this.connectionDraining = connectionDraining;
      return this;
    }

    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Boolean getEnableCDN() {
      return enableCDN;
    }

    public Builder setEnableCDN(Boolean enableCDN) {
      this.enableCDN = enableCDN;
      return this;
    }

    public String getFingerprint() {
      return fingerprint;
    }

    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    public List<String> getHealthChecks() {
      return healthChecks;
    }

    public Builder addAllHealthChecks(List<String> healthChecks) {
      this.healthChecks.addAll(healthChecks);
      return this;
    }

    public Builder addHealthChecks(String healthChecks) {
      this.healthChecks.add(healthChecks);
      return this;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getLoadBalancingScheme() {
      return loadBalancingScheme;
    }

    public Builder setLoadBalancingScheme(String loadBalancingScheme) {
      this.loadBalancingScheme = loadBalancingScheme;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
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

    public String getProtocol() {
      return protocol;
    }

    public Builder setProtocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    public String getRegion() {
      return region;
    }

    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public String getSessionAffinity() {
      return sessionAffinity;
    }

    public Builder setSessionAffinity(String sessionAffinity) {
      this.sessionAffinity = sessionAffinity;
      return this;
    }

    public Integer getTimeoutSec() {
      return timeoutSec;
    }

    public Builder setTimeoutSec(Integer timeoutSec) {
      this.timeoutSec = timeoutSec;
      return this;
    }


    public BackendService build() {


















      return new BackendService(
        affinityCookieTtlSec,
        backends,
        connectionDraining,
        creationTimestamp,
        description,
        enableCDN,
        fingerprint,
        healthChecks,
        id,
        kind,
        loadBalancingScheme,
        name,
        port,
        portName,
        protocol,
        region,
        selfLink,
        sessionAffinity,
        timeoutSec
      );
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAffinityCookieTtlSec(this.affinityCookieTtlSec);
      newBuilder.addAllBackends(this.backends);
      newBuilder.setConnectionDraining(this.connectionDraining);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setEnableCDN(this.enableCDN);
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.addAllHealthChecks(this.healthChecks);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setLoadBalancingScheme(this.loadBalancingScheme);
      newBuilder.setName(this.name);
      newBuilder.setPort(this.port);
      newBuilder.setPortName(this.portName);
      newBuilder.setProtocol(this.protocol);
      newBuilder.setRegion(this.region);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setSessionAffinity(this.sessionAffinity);
      newBuilder.setTimeoutSec(this.timeoutSec);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "BackendService{"
        + "affinityCookieTtlSec=" + affinityCookieTtlSec + ", "
        + "backends=" + backends + ", "
        + "connectionDraining=" + connectionDraining + ", "
        + "creationTimestamp=" + creationTimestamp + ", "
        + "description=" + description + ", "
        + "enableCDN=" + enableCDN + ", "
        + "fingerprint=" + fingerprint + ", "
        + "healthChecks=" + healthChecks + ", "
        + "id=" + id + ", "
        + "kind=" + kind + ", "
        + "loadBalancingScheme=" + loadBalancingScheme + ", "
        + "name=" + name + ", "
        + "port=" + port + ", "
        + "portName=" + portName + ", "
        + "protocol=" + protocol + ", "
        + "region=" + region + ", "
        + "selfLink=" + selfLink + ", "
        + "sessionAffinity=" + sessionAffinity + ", "
        + "timeoutSec=" + timeoutSec
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendService) {
      BackendService that = (BackendService) o;
      return
          Objects.equals(this.affinityCookieTtlSec, that.getAffinityCookieTtlSec()) &&
          Objects.equals(this.backends, that.getBackends()) &&
          Objects.equals(this.connectionDraining, that.getConnectionDraining()) &&
          Objects.equals(this.creationTimestamp, that.getCreationTimestamp()) &&
          Objects.equals(this.description, that.getDescription()) &&
          Objects.equals(this.enableCDN, that.getEnableCDN()) &&
          Objects.equals(this.fingerprint, that.getFingerprint()) &&
          Objects.equals(this.healthChecks, that.getHealthChecks()) &&
          Objects.equals(this.id, that.getId()) &&
          Objects.equals(this.kind, that.getKind()) &&
          Objects.equals(this.loadBalancingScheme, that.getLoadBalancingScheme()) &&
          Objects.equals(this.name, that.getName()) &&
          Objects.equals(this.port, that.getPort()) &&
          Objects.equals(this.portName, that.getPortName()) &&
          Objects.equals(this.protocol, that.getProtocol()) &&
          Objects.equals(this.region, that.getRegion()) &&
          Objects.equals(this.selfLink, that.getSelfLink()) &&
          Objects.equals(this.sessionAffinity, that.getSessionAffinity()) &&
          Objects.equals(this.timeoutSec, that.getTimeoutSec())
          ;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      affinityCookieTtlSec,
      backends,
      connectionDraining,
      creationTimestamp,
      description,
      enableCDN,
      fingerprint,
      healthChecks,
      id,
      kind,
      loadBalancingScheme,
      name,
      port,
      portName,
      protocol,
      region,
      selfLink,
      sessionAffinity,
      timeoutSec
    );
  }
}
