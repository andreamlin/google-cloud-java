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
 *   AddressName address = AddressName.create("[PROJECT]", "[REGION]", "[ADDRESS]");
 *   Operation response = addressClient.deleteAddress(address);
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
 *   AutoscalerName autoscaler = AutoscalerName.create("[PROJECT]", "[ZONE]", "[AUTOSCALER]");
 *   Operation response = autoscalerClient.deleteAutoscaler(autoscaler);
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
 *   BackendServiceName backendService = BackendServiceName.create("[PROJECT]", "[BACKEND_SERVICE]");
 *   Operation response = backendServiceClient.deleteBackendService(backendService);
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
 *   DiskTypeName diskType = DiskTypeName.create("[PROJECT]", "[ZONE]", "[DISK_TYPE]");
 *   DiskType response = diskTypeClient.getDiskType(diskType);
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
 *   DiskName disk = DiskName.create("[PROJECT]", "[ZONE]", "[DISK]");
 *   Snapshot snapshot = Snapshot.newBuilder().build();
 *   Operation response = diskClient.createSnapshotDisk(disk, snapshot);
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
 *   FirewallName firewall = FirewallName.create("[PROJECT]", "[FIREWALL]");
 *   Operation response = firewallClient.deleteFirewall(firewall);
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
 *   ForwardingRuleName forwardingRule = ForwardingRuleName.create("[PROJECT]", "[REGION]", "[FORWARDING_RULE]");
 *   Operation response = forwardingRuleClient.deleteForwardingRule(forwardingRule);
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
 *   GlobalAddressesAddressName address = GlobalAddressesAddressName.create("[PROJECT]", "[ADDRESS]");
 *   Operation response = globalAddressClient.deleteGlobalAddress(address);
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
 *   GlobalForwardingRulesForwardingRuleName forwardingRule = GlobalForwardingRulesForwardingRuleName.create("[PROJECT]", "[FORWARDING_RULE]");
 *   Operation response = globalForwardingRuleClient.deleteGlobalForwardingRule(forwardingRule);
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
 *   GlobalOperationsOperationName operation = GlobalOperationsOperationName.create("[PROJECT]", "[OPERATION]");
 *   globalOperationClient.deleteGlobalOperation(operation);
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
 *   HealthCheckName healthCheck = HealthCheckName.create("[PROJECT]", "[HEALTH_CHECK]");
 *   Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
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
 *   HttpHealthCheckName httpHealthCheck = HttpHealthCheckName.create("[PROJECT]", "[HTTP_HEALTH_CHECK]");
 *   Operation response = httpHealthCheckClient.deleteHttpHealthCheck(httpHealthCheck);
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
 *   HttpsHealthCheckName httpsHealthCheck = HttpsHealthCheckName.create("[PROJECT]", "[HTTPS_HEALTH_CHECK]");
 *   Operation response = httpsHealthCheckClient.deleteHttpsHealthCheck(httpsHealthCheck);
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
 *   ImageName image = ImageName.create("[PROJECT]", "[IMAGE]");
 *   Operation response = imageClient.deleteImage(image);
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
 *   InstanceGroupManagerName instanceGroupManager = InstanceGroupManagerName.create("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP_MANAGER]");
 *   InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequest = InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
 *   Operation response = instanceGroupManagerClient.abandonInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersAbandonInstancesRequest);
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
 *   InstanceGroupName instanceGroup = InstanceGroupName.create("[PROJECT]", "[ZONE]", "[INSTANCE_GROUP]");
 *   InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequest = InstanceGroupsAddInstancesRequest.newBuilder().build();
 *   Operation response = instanceGroupClient.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequest);
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
 *   InstanceTemplateName instanceTemplate = InstanceTemplateName.create("[PROJECT]", "[INSTANCE_TEMPLATE]");
 *   Operation response = instanceTemplateClient.deleteInstanceTemplate(instanceTemplate);
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
 *   InstanceName instance = InstanceName.create("[PROJECT]", "[ZONE]", "[INSTANCE]");
 *   String networkInterface = "";
 *   AccessConfig accessConfig = AccessConfig.newBuilder().build();
 *   Operation response = instanceClient.addAccessConfigInstance(instance, networkInterface, accessConfig);
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
 *   LicenseName license = LicenseName.create("[PROJECT]", "[LICENSE]");
 *   License response = licensClient.getLicens(license);
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
 *   MachineTypeName machineType = MachineTypeName.create("[PROJECT]", "[ZONE]", "[MACHINE_TYPE]");
 *   MachineType response = machineTypeClient.getMachineType(machineType);
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
 *   NetworkName network = NetworkName.create("[PROJECT]", "[NETWORK]");
 *   Operation response = networkClient.deleteNetwork(network);
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
 *   ProjectName project = ProjectName.create("[PROJECT]");
 *   Project response = projectClient.getProject(project);
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
 *   RegionAutoscalersAutoscalerName autoscaler = RegionAutoscalersAutoscalerName.create("[PROJECT]", "[REGION]", "[AUTOSCALER]");
 *   Operation response = regionAutoscalerClient.deleteRegionAutoscaler(autoscaler);
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
 *   RegionBackendServicesBackendServiceName backendService = RegionBackendServicesBackendServiceName.create("[PROJECT]", "[REGION]", "[BACKEND_SERVICE]");
 *   Operation response = regionBackendServiceClient.deleteRegionBackendService(backendService);
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
 *   RegionInstanceGroupManagersInstanceGroupManagerName instanceGroupManager = RegionInstanceGroupManagersInstanceGroupManagerName.create("[PROJECT]", "[REGION]", "[INSTANCE_GROUP_MANAGER]");
 *   RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequest = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
 *   Operation response = regionInstanceGroupManagerClient.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequest);
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
 *   RegionInstanceGroupsInstanceGroupName instanceGroup = RegionInstanceGroupsInstanceGroupName.create("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
 *   InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup(instanceGroup);
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
 *   RegionOperationsOperationName operation = RegionOperationsOperationName.create("[PROJECT]", "[REGION]", "[OPERATION]");
 *   regionOperationClient.deleteRegionOperation(operation);
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
 *   RegionName region = RegionName.create("[PROJECT]", "[REGION]");
 *   Region response = regionClient.getRegion(region);
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
 *   RouterName router = RouterName.create("[PROJECT]", "[REGION]", "[ROUTER]");
 *   Operation response = routerClient.deleteRouter(router);
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
 *   RouteName route = RouteName.create("[PROJECT]", "[ROUTE]");
 *   Operation response = routeClient.deleteRoute(route);
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
 *   SnapshotName snapshot = SnapshotName.create("[PROJECT]", "[SNAPSHOT]");
 *   Operation response = snapshotClient.deleteSnapshot(snapshot);
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
 *   SslCertificateName sslCertificate = SslCertificateName.create("[PROJECT]", "[SSL_CERTIFICATE]");
 *   Operation response = sslCertificateClient.deleteSslCertificate(sslCertificate);
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
 *   SubnetworkName subnetwork = SubnetworkName.create("[PROJECT]", "[REGION]", "[SUBNETWORK]");
 *   Operation response = subnetworkClient.deleteSubnetwork(subnetwork);
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
 *   TargetHttpProxyName targetHttpProxy = TargetHttpProxyName.create("[PROJECT]", "[TARGET_HTTP_PROXY]");
 *   Operation response = targetHttpProxyClient.deleteTargetHttpProxy(targetHttpProxy);
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
 *   TargetHttpsProxyName targetHttpsProxy = TargetHttpsProxyName.create("[PROJECT]", "[TARGET_HTTPS_PROXY]");
 *   Operation response = targetHttpsProxyClient.deleteTargetHttpsProxy(targetHttpsProxy);
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
 *   TargetInstanceName targetInstance = TargetInstanceName.create("[PROJECT]", "[ZONE]", "[TARGET_INSTANCE]");
 *   Operation response = targetInstanceClient.deleteTargetInstance(targetInstance);
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
 *   TargetPoolName targetPool = TargetPoolName.create("[PROJECT]", "[REGION]", "[TARGET_POOL]");
 *   TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequest = TargetPoolsAddHealthCheckRequest.newBuilder().build();
 *   Operation response = targetPoolClient.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequest);
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
 *   TargetSslProxyName targetSslProxy = TargetSslProxyName.create("[PROJECT]", "[TARGET_SSL_PROXY]");
 *   Operation response = targetSslProxyClient.deleteTargetSslProxy(targetSslProxy);
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
 *   TargetVpnGatewayName targetVpnGateway = TargetVpnGatewayName.create("[PROJECT]", "[REGION]", "[TARGET_VPN_GATEWAY]");
 *   Operation response = targetVpnGatewayClient.deleteTargetVpnGateway(targetVpnGateway);
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
 *   UrlMapName urlMap = UrlMapName.create("[PROJECT]", "[URL_MAP]");
 *   Operation response = urlMapClient.deleteUrlMap(urlMap);
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
 *   VpnTunnelName vpnTunnel = VpnTunnelName.create("[PROJECT]", "[REGION]", "[VPN_TUNNEL]");
 *   Operation response = vpnTunnelClient.deleteVpnTunnel(vpnTunnel);
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
 *   ZoneOperationsOperationName operation = ZoneOperationsOperationName.create("[PROJECT]", "[ZONE]", "[OPERATION]");
 *   zoneOperationClient.deleteZoneOperation(operation);
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
 *   ZoneName zone = ZoneName.create("[PROJECT]", "[ZONE]");
 *   Zone response = zoneClient.getZone(zone);
 * }
 * </code>
 * </pre>
 *
 */

package com.google.compute.v1;