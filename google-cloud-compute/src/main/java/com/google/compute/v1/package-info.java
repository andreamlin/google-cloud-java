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
 * ==================
 * AddressAdminClient
 * ==================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for AddressAdminClient:
 * <pre>
 * <code>
 * try (AddressAdminClient addressAdminClient = AddressAdminClient.create()) {
 *
 *   Operation response = addressAdminClient.deleteAddress();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * AutoscalerAdminClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for AutoscalerAdminClient:
 * <pre>
 * <code>
 * try (AutoscalerAdminClient autoscalerAdminClient = AutoscalerAdminClient.create()) {
 *
 *   Operation response = autoscalerAdminClient.deleteAutoscaler();
 * }
 * </code>
 * </pre>
 *
 * =========================
 * BackendServiceAdminClient
 * =========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for BackendServiceAdminClient:
 * <pre>
 * <code>
 * try (BackendServiceAdminClient backendServiceAdminClient = BackendServiceAdminClient.create()) {
 *
 *   Operation response = backendServiceAdminClient.deleteBackendService();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * DiskTypeAdminClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for DiskTypeAdminClient:
 * <pre>
 * <code>
 * try (DiskTypeAdminClient diskTypeAdminClient = DiskTypeAdminClient.create()) {
 *
 *   DiskType response = diskTypeAdminClient.getDiskType();
 * }
 * </code>
 * </pre>
 *
 * ===============
 * DiskAdminClient
 * ===============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for DiskAdminClient:
 * <pre>
 * <code>
 * try (DiskAdminClient diskAdminClient = DiskAdminClient.create()) {
 *
 *   Operation response = diskAdminClient.createSnapshotDisk();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * FirewallAdminClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for FirewallAdminClient:
 * <pre>
 * <code>
 * try (FirewallAdminClient firewallAdminClient = FirewallAdminClient.create()) {
 *
 *   Operation response = firewallAdminClient.deleteFirewall();
 * }
 * </code>
 * </pre>
 *
 * =========================
 * ForwardingRuleAdminClient
 * =========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ForwardingRuleAdminClient:
 * <pre>
 * <code>
 * try (ForwardingRuleAdminClient forwardingRuleAdminClient = ForwardingRuleAdminClient.create()) {
 *
 *   Operation response = forwardingRuleAdminClient.deleteForwardingRule();
 * }
 * </code>
 * </pre>
 *
 * ========================
 * GlobalAddressAdminClient
 * ========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for GlobalAddressAdminClient:
 * <pre>
 * <code>
 * try (GlobalAddressAdminClient globalAddressAdminClient = GlobalAddressAdminClient.create()) {
 *
 *   Operation response = globalAddressAdminClient.deleteGlobalAddress();
 * }
 * </code>
 * </pre>
 *
 * ===============================
 * GlobalForwardingRuleAdminClient
 * ===============================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for GlobalForwardingRuleAdminClient:
 * <pre>
 * <code>
 * try (GlobalForwardingRuleAdminClient globalForwardingRuleAdminClient = GlobalForwardingRuleAdminClient.create()) {
 *
 *   Operation response = globalForwardingRuleAdminClient.deleteGlobalForwardingRule();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * GlobalOperationAdminClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for GlobalOperationAdminClient:
 * <pre>
 * <code>
 * try (GlobalOperationAdminClient globalOperationAdminClient = GlobalOperationAdminClient.create()) {
 *
 *   globalOperationAdminClient.deleteGlobalOperation();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * HealthCheckAdminClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for HealthCheckAdminClient:
 * <pre>
 * <code>
 * try (HealthCheckAdminClient healthCheckAdminClient = HealthCheckAdminClient.create()) {
 *
 *   Operation response = healthCheckAdminClient.deleteHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * HttpHealthCheckAdminClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for HttpHealthCheckAdminClient:
 * <pre>
 * <code>
 * try (HttpHealthCheckAdminClient httpHealthCheckAdminClient = HttpHealthCheckAdminClient.create()) {
 *
 *   Operation response = httpHealthCheckAdminClient.deleteHttpHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * ===========================
 * HttpsHealthCheckAdminClient
 * ===========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for HttpsHealthCheckAdminClient:
 * <pre>
 * <code>
 * try (HttpsHealthCheckAdminClient httpsHealthCheckAdminClient = HttpsHealthCheckAdminClient.create()) {
 *
 *   Operation response = httpsHealthCheckAdminClient.deleteHttpsHealthCheck();
 * }
 * </code>
 * </pre>
 *
 * ================
 * ImageAdminClient
 * ================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ImageAdminClient:
 * <pre>
 * <code>
 * try (ImageAdminClient imageAdminClient = ImageAdminClient.create()) {
 *
 *   Operation response = imageAdminClient.deleteImage();
 * }
 * </code>
 * </pre>
 *
 * ===============================
 * InstanceGroupManagerAdminClient
 * ===============================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceGroupManagerAdminClient:
 * <pre>
 * <code>
 * try (InstanceGroupManagerAdminClient instanceGroupManagerAdminClient = InstanceGroupManagerAdminClient.create()) {
 *
 *   Operation response = instanceGroupManagerAdminClient.abandonInstancesInstanceGroupManager();
 * }
 * </code>
 * </pre>
 *
 * ========================
 * InstanceGroupAdminClient
 * ========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceGroupAdminClient:
 * <pre>
 * <code>
 * try (InstanceGroupAdminClient instanceGroupAdminClient = InstanceGroupAdminClient.create()) {
 *
 *   Operation response = instanceGroupAdminClient.addInstancesInstanceGroup();
 * }
 * </code>
 * </pre>
 *
 * ===========================
 * InstanceTemplateAdminClient
 * ===========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceTemplateAdminClient:
 * <pre>
 * <code>
 * try (InstanceTemplateAdminClient instanceTemplateAdminClient = InstanceTemplateAdminClient.create()) {
 *
 *   Operation response = instanceTemplateAdminClient.deleteInstanceTemplate();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * InstanceAdminClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for InstanceAdminClient:
 * <pre>
 * <code>
 * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
 *
 *   Operation response = instanceAdminClient.addAccessConfigInstance();
 * }
 * </code>
 * </pre>
 *
 * =================
 * LicensAdminClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for LicensAdminClient:
 * <pre>
 * <code>
 * try (LicensAdminClient licensAdminClient = LicensAdminClient.create()) {
 *
 *   License response = licensAdminClient.getLicens();
 * }
 * </code>
 * </pre>
 *
 * ======================
 * MachineTypeAdminClient
 * ======================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for MachineTypeAdminClient:
 * <pre>
 * <code>
 * try (MachineTypeAdminClient machineTypeAdminClient = MachineTypeAdminClient.create()) {
 *
 *   MachineType response = machineTypeAdminClient.getMachineType();
 * }
 * </code>
 * </pre>
 *
 * ==================
 * NetworkAdminClient
 * ==================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for NetworkAdminClient:
 * <pre>
 * <code>
 * try (NetworkAdminClient networkAdminClient = NetworkAdminClient.create()) {
 *
 *   Operation response = networkAdminClient.deleteNetwork();
 * }
 * </code>
 * </pre>
 *
 * ==================
 * ProjectAdminClient
 * ==================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ProjectAdminClient:
 * <pre>
 * <code>
 * try (ProjectAdminClient projectAdminClient = ProjectAdminClient.create()) {
 *
 *   Project response = projectAdminClient.getProject();
 * }
 * </code>
 * </pre>
 *
 * ===========================
 * RegionAutoscalerAdminClient
 * ===========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionAutoscalerAdminClient:
 * <pre>
 * <code>
 * try (RegionAutoscalerAdminClient regionAutoscalerAdminClient = RegionAutoscalerAdminClient.create()) {
 *
 *   Operation response = regionAutoscalerAdminClient.deleteRegionAutoscaler();
 * }
 * </code>
 * </pre>
 *
 * ===============================
 * RegionBackendServiceAdminClient
 * ===============================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionBackendServiceAdminClient:
 * <pre>
 * <code>
 * try (RegionBackendServiceAdminClient regionBackendServiceAdminClient = RegionBackendServiceAdminClient.create()) {
 *
 *   Operation response = regionBackendServiceAdminClient.deleteRegionBackendService();
 * }
 * </code>
 * </pre>
 *
 * =====================================
 * RegionInstanceGroupManagerAdminClient
 * =====================================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionInstanceGroupManagerAdminClient:
 * <pre>
 * <code>
 * try (RegionInstanceGroupManagerAdminClient regionInstanceGroupManagerAdminClient = RegionInstanceGroupManagerAdminClient.create()) {
 *
 *   Operation response = regionInstanceGroupManagerAdminClient.abandonInstancesRegionInstanceGroupManager();
 * }
 * </code>
 * </pre>
 *
 * ==============================
 * RegionInstanceGroupAdminClient
 * ==============================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionInstanceGroupAdminClient:
 * <pre>
 * <code>
 * try (RegionInstanceGroupAdminClient regionInstanceGroupAdminClient = RegionInstanceGroupAdminClient.create()) {
 *
 *   InstanceGroup response = regionInstanceGroupAdminClient.getRegionInstanceGroup();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * RegionOperationAdminClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionOperationAdminClient:
 * <pre>
 * <code>
 * try (RegionOperationAdminClient regionOperationAdminClient = RegionOperationAdminClient.create()) {
 *
 *   regionOperationAdminClient.deleteRegionOperation();
 * }
 * </code>
 * </pre>
 *
 * =================
 * RegionAdminClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RegionAdminClient:
 * <pre>
 * <code>
 * try (RegionAdminClient regionAdminClient = RegionAdminClient.create()) {
 *
 *   Region response = regionAdminClient.getRegion();
 * }
 * </code>
 * </pre>
 *
 * =================
 * RouterAdminClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RouterAdminClient:
 * <pre>
 * <code>
 * try (RouterAdminClient routerAdminClient = RouterAdminClient.create()) {
 *
 *   Operation response = routerAdminClient.deleteRouter();
 * }
 * </code>
 * </pre>
 *
 * ================
 * RouteAdminClient
 * ================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for RouteAdminClient:
 * <pre>
 * <code>
 * try (RouteAdminClient routeAdminClient = RouteAdminClient.create()) {
 *
 *   Operation response = routeAdminClient.deleteRoute();
 * }
 * </code>
 * </pre>
 *
 * ===================
 * SnapshotAdminClient
 * ===================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for SnapshotAdminClient:
 * <pre>
 * <code>
 * try (SnapshotAdminClient snapshotAdminClient = SnapshotAdminClient.create()) {
 *
 *   Operation response = snapshotAdminClient.deleteSnapshot();
 * }
 * </code>
 * </pre>
 *
 * =========================
 * SslCertificateAdminClient
 * =========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for SslCertificateAdminClient:
 * <pre>
 * <code>
 * try (SslCertificateAdminClient sslCertificateAdminClient = SslCertificateAdminClient.create()) {
 *
 *   Operation response = sslCertificateAdminClient.deleteSslCertificate();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * SubnetworkAdminClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for SubnetworkAdminClient:
 * <pre>
 * <code>
 * try (SubnetworkAdminClient subnetworkAdminClient = SubnetworkAdminClient.create()) {
 *
 *   Operation response = subnetworkAdminClient.deleteSubnetwork();
 * }
 * </code>
 * </pre>
 *
 * ==========================
 * TargetHttpProxyAdminClient
 * ==========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetHttpProxyAdminClient:
 * <pre>
 * <code>
 * try (TargetHttpProxyAdminClient targetHttpProxyAdminClient = TargetHttpProxyAdminClient.create()) {
 *
 *   Operation response = targetHttpProxyAdminClient.deleteTargetHttpProxy();
 * }
 * </code>
 * </pre>
 *
 * ===========================
 * TargetHttpsProxyAdminClient
 * ===========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetHttpsProxyAdminClient:
 * <pre>
 * <code>
 * try (TargetHttpsProxyAdminClient targetHttpsProxyAdminClient = TargetHttpsProxyAdminClient.create()) {
 *
 *   Operation response = targetHttpsProxyAdminClient.deleteTargetHttpsProxy();
 * }
 * </code>
 * </pre>
 *
 * =========================
 * TargetInstanceAdminClient
 * =========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetInstanceAdminClient:
 * <pre>
 * <code>
 * try (TargetInstanceAdminClient targetInstanceAdminClient = TargetInstanceAdminClient.create()) {
 *
 *   Operation response = targetInstanceAdminClient.deleteTargetInstance();
 * }
 * </code>
 * </pre>
 *
 * =====================
 * TargetPoolAdminClient
 * =====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetPoolAdminClient:
 * <pre>
 * <code>
 * try (TargetPoolAdminClient targetPoolAdminClient = TargetPoolAdminClient.create()) {
 *
 *   Operation response = targetPoolAdminClient.addHealthCheckTargetPool();
 * }
 * </code>
 * </pre>
 *
 * =========================
 * TargetSslProxyAdminClient
 * =========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetSslProxyAdminClient:
 * <pre>
 * <code>
 * try (TargetSslProxyAdminClient targetSslProxyAdminClient = TargetSslProxyAdminClient.create()) {
 *
 *   Operation response = targetSslProxyAdminClient.deleteTargetSslProxy();
 * }
 * </code>
 * </pre>
 *
 * ===========================
 * TargetVpnGatewayAdminClient
 * ===========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for TargetVpnGatewayAdminClient:
 * <pre>
 * <code>
 * try (TargetVpnGatewayAdminClient targetVpnGatewayAdminClient = TargetVpnGatewayAdminClient.create()) {
 *
 *   Operation response = targetVpnGatewayAdminClient.deleteTargetVpnGateway();
 * }
 * </code>
 * </pre>
 *
 * =================
 * UrlMapAdminClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for UrlMapAdminClient:
 * <pre>
 * <code>
 * try (UrlMapAdminClient urlMapAdminClient = UrlMapAdminClient.create()) {
 *
 *   Operation response = urlMapAdminClient.deleteUrlMap();
 * }
 * </code>
 * </pre>
 *
 * ====================
 * VpnTunnelAdminClient
 * ====================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for VpnTunnelAdminClient:
 * <pre>
 * <code>
 * try (VpnTunnelAdminClient vpnTunnelAdminClient = VpnTunnelAdminClient.create()) {
 *
 *   Operation response = vpnTunnelAdminClient.deleteVpnTunnel();
 * }
 * </code>
 * </pre>
 *
 * ========================
 * ZoneOperationAdminClient
 * ========================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ZoneOperationAdminClient:
 * <pre>
 * <code>
 * try (ZoneOperationAdminClient zoneOperationAdminClient = ZoneOperationAdminClient.create()) {
 *
 *   zoneOperationAdminClient.deleteZoneOperation();
 * }
 * </code>
 * </pre>
 *
 * ===============
 * ZoneAdminClient
 * ===============
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for ZoneAdminClient:
 * <pre>
 * <code>
 * try (ZoneAdminClient zoneAdminClient = ZoneAdminClient.create()) {
 *
 *   Zone response = zoneAdminClient.getZone();
 * }
 * </code>
 * </pre>
 *
 */

package com.google.compute.v1;