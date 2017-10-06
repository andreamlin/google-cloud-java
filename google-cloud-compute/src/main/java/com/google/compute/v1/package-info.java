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

/**
 * A client to Compute Engine API.
 *
 * The interfaces provided are listed below, along with usage samples.
 *
 * =============
 * AddressClient
 * =============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for AddressClient:
 * <pre>
 * <code>
 * try (AddressClient addressClient = AddressClient.create()) {
 *
 *   Operation response = addressClient.deleteAddress();
 * }
 * </code>
 * </pre>
 *
 * ================
 * AutoscalerClient
 * ================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for AutoscalerClient:
 * <pre>
 * <code>
 * try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
 *
 *   Operation response = autoscalerClient.deleteAutoscaler();
 * }
 * </code>
 * </pre>
 *
 * ====================
 * BackendServiceClient
 * ====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for BackendServiceClient:
 * <pre>
 * <code>
 * try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
 *
 *   Operation response = backendServiceClient.deleteBackendService();
 * }
 * </code>
 * </pre>
 *
 * ==============
 * DiskTypeClient
 * ==============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for DiskTypeClient:
 * <pre>
 * <code>
 * try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
 *
 *   DiskType response = diskTypeClient.getDiskType();
 * }
 * </code>
 * </pre>
 *
 * ==========
 * DiskClient
 * ==========
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for DiskClient:
 * <pre>
 * <code>
 * try (DiskClient diskClient = DiskClient.create()) {
 *
 *   Operation response = diskClient.createSnapshotDisk();
 * }
 * </code>
 * </pre>
 *
 * ==============
 * FirewallClient
 * ==============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for FirewallClient:
 * <pre>
 * <code>
 * try (FirewallClient firewallClient = FirewallClient.create()) {
 *
 *   Operation response = firewallClient.deleteFirewall();
 * }
 * </code>
 * </pre>
 *
 * ====================
 * ForwardingRuleClient
 * ====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ForwardingRuleClient:
 * <pre>
 * <code>
 * try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
 *
 *   Operation response = forwardingRuleClient.deleteForwardingRule();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * GlobalAddressClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for GlobalAddressClient:
 * <pre>
 * <code>
 * try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
 *
 *   Operation response = globalAddressClient.deleteGlobalAddress();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * GlobalForwardingRuleClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for GlobalForwardingRuleClient:
 * <pre>
 * <code>
 * try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
 *
 *   Operation response = globalForwardingRuleClient.deleteGlobalForwardingRule();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * GlobalOperationClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for GlobalOperationClient:
 * <pre>
 * <code>
 * try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
 *
 *   globalOperationClient.deleteGlobalOperation();
 * }
 * </code>
 * </pre>
 *
 * =================
 * HealthCheckClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for HealthCheckClient:
 * <pre>
 * <code>
 * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
 *
 *   Operation response = healthCheckClient.deleteHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * HttpHealthCheckClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for HttpHealthCheckClient:
 * <pre>
 * <code>
 * try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
 *
 *   Operation response = httpHealthCheckClient.deleteHttpHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * HttpsHealthCheckClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for HttpsHealthCheckClient:
 * <pre>
 * <code>
 * try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
 *
 *   Operation response = httpsHealthCheckClient.deleteHttpsHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * ===========
 * ImageClient
 * ===========
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ImageClient:
 * <pre>
 * <code>
 * try (ImageClient imageClient = ImageClient.create()) {
 *
 *   Operation response = imageClient.deleteImage();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * InstanceGroupManagerClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceGroupManagerClient:
 * <pre>
 * <code>
 * try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
 *
 *   Operation response = instanceGroupManagerClient.abandonInstancesInstanceGroupManager();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * InstanceGroupClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceGroupClient:
 * <pre>
 * <code>
 * try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
 *
 *   Operation response = instanceGroupClient.addInstancesInstanceGroup();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * InstanceTemplateClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceTemplateClient:
 * <pre>
 * <code>
 * try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
 *
 *   Operation response = instanceTemplateClient.deleteInstanceTemplate();
 * }
 * </code>
 * </pre>
 *
 * ==============
 * InstanceClient
 * ==============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceClient:
 * <pre>
 * <code>
 * try (InstanceClient instanceClient = InstanceClient.create()) {
 *
 *   Operation response = instanceClient.addAccessConfigInstance();
 * }
 * </code>
 * </pre>
 *
 * ============
 * LicensClient
 * ============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for LicensClient:
 * <pre>
 * <code>
 * try (LicensClient licensClient = LicensClient.create()) {
 *
 *   License response = licensClient.getLicens();
 * }
 * </code>
 * </pre>
 *
 * =================
 * MachineTypeClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for MachineTypeClient:
 * <pre>
 * <code>
 * try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
 *
 *   MachineType response = machineTypeClient.getMachineType();
 * }
 * </code>
 * </pre>
 *
 * =============
 * NetworkClient
 * =============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for NetworkClient:
 * <pre>
 * <code>
 * try (NetworkClient networkClient = NetworkClient.create()) {
 *
 *   Operation response = networkClient.deleteNetwork();
 * }
 * </code>
 * </pre>
 *
 * =============
 * ProjectClient
 * =============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ProjectClient:
 * <pre>
 * <code>
 * try (ProjectClient projectClient = ProjectClient.create()) {
 *
 *   Project response = projectClient.getProject();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * RegionAutoscalerClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionAutoscalerClient:
 * <pre>
 * <code>
 * try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
 *
 *   Operation response = regionAutoscalerClient.deleteRegionAutoscaler();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * RegionBackendServiceClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionBackendServiceClient:
 * <pre>
 * <code>
 * try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
 *
 *   Operation response = regionBackendServiceClient.deleteRegionBackendService();
 * }
 * </code>
 * </pre>
 *
 * ================================
 * RegionInstanceGroupManagerClient
 * ================================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionInstanceGroupManagerClient:
 * <pre>
 * <code>
 * try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
 *
 *   Operation response = regionInstanceGroupManagerClient.abandonInstancesRegionInstanceGroupManager();
 * }
 * </code>
 * </pre>
 *
 * =========================
 * RegionInstanceGroupClient
 * =========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionInstanceGroupClient:
 * <pre>
 * <code>
 * try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
 *
 *   InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * RegionOperationClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionOperationClient:
 * <pre>
 * <code>
 * try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
 *
 *   regionOperationClient.deleteRegionOperation();
 * }
 * </code>
 * </pre>
 *
 * ============
 * RegionClient
 * ============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionClient:
 * <pre>
 * <code>
 * try (RegionClient regionClient = RegionClient.create()) {
 *
 *   Region response = regionClient.getRegion();
 * }
 * </code>
 * </pre>
 *
 * ============
 * RouterClient
 * ============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RouterClient:
 * <pre>
 * <code>
 * try (RouterClient routerClient = RouterClient.create()) {
 *
 *   Operation response = routerClient.deleteRouter();
 * }
 * </code>
 * </pre>
 *
 * ===========
 * RouteClient
 * ===========
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RouteClient:
 * <pre>
 * <code>
 * try (RouteClient routeClient = RouteClient.create()) {
 *
 *   Operation response = routeClient.deleteRoute();
 * }
 * </code>
 * </pre>
 *
 * ==============
 * SnapshotClient
 * ==============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for SnapshotClient:
 * <pre>
 * <code>
 * try (SnapshotClient snapshotClient = SnapshotClient.create()) {
 *
 *   Operation response = snapshotClient.deleteSnapshot();
 * }
 * </code>
 * </pre>
 *
 * ====================
 * SslCertificateClient
 * ====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for SslCertificateClient:
 * <pre>
 * <code>
 * try (SslCertificateClient sslCertificateClient = SslCertificateClient.create()) {
 *
 *   Operation response = sslCertificateClient.deleteSslCertificate();
 * }
 * </code>
 * </pre>
 *
 * ================
 * SubnetworkClient
 * ================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for SubnetworkClient:
 * <pre>
 * <code>
 * try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
 *
 *   Operation response = subnetworkClient.deleteSubnetwork();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * TargetHttpProxyClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetHttpProxyClient:
 * <pre>
 * <code>
 * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
 *
 *   Operation response = targetHttpProxyClient.deleteTargetHttpProxy();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * TargetHttpsProxyClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetHttpsProxyClient:
 * <pre>
 * <code>
 * try (TargetHttpsProxyClient targetHttpsProxyClient = TargetHttpsProxyClient.create()) {
 *
 *   Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy();
 * }
 * </code>
 * </pre>
 *
 * ====================
 * TargetInstanceClient
 * ====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetInstanceClient:
 * <pre>
 * <code>
 * try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
 *
 *   Operation response = targetInstanceClient.deleteTargetInstance();
 * }
 * </code>
 * </pre>
 *
 * ================
 * TargetPoolClient
 * ================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetPoolClient:
 * <pre>
 * <code>
 * try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
 *
 *   Operation response = targetPoolClient.addHealthCheckTargetPool();
 * }
 * </code>
 * </pre>
 *
 * ====================
 * TargetSslProxyClient
 * ====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetSslProxyClient:
 * <pre>
 * <code>
 * try (TargetSslProxyClient targetSslProxyClient = TargetSslProxyClient.create()) {
 *
 *   Operation response = targetSslProxyClient.deleteTargetSslProxy();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * TargetVpnGatewayClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetVpnGatewayClient:
 * <pre>
 * <code>
 * try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
 *
 *   Operation response = targetVpnGatewayClient.deleteTargetVpnGateway();
 * }
 * </code>
 * </pre>
 *
 * ============
 * UrlMapClient
 * ============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for UrlMapClient:
 * <pre>
 * <code>
 * try (UrlMapClient urlMapClient = UrlMapClient.create()) {
 *
 *   Operation response = urlMapClient.deleteUrlMap();
 * }
 * </code>
 * </pre>
 *
 * ===============
 * VpnTunnelClient
 * ===============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for VpnTunnelClient:
 * <pre>
 * <code>
 * try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
 *
 *   Operation response = vpnTunnelClient.deleteVpnTunnel();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * ZoneOperationClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ZoneOperationClient:
 * <pre>
 * <code>
 * try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
 *
 *   zoneOperationClient.deleteZoneOperation();
 * }
 * </code>
 * </pre>
 *
 * ==========
 * ZoneClient
 * ==========
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ZoneClient:
 * <pre>
 * <code>
 * try (ZoneClient zoneClient = ZoneClient.create()) {
 *
 *   Zone response = zoneClient.getZone();
 * }
 * </code>
 * </pre>
 *
 */

package com.google.compute.v1;