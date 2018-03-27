/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.paging.Page;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.compute.v1.AddressClient.AggregatedListAddressesPagedResponse;
import com.google.cloud.compute.v1.DiskClient;
import com.google.cloud.compute.v1.DiskName;
import com.google.cloud.compute.v1.DiskType;
import com.google.cloud.compute.v1.DiskTypeClient;
import com.google.cloud.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import com.google.cloud.compute.v1.DiskTypeName;
import com.google.cloud.compute.v1.DiskTypeSettings;
import com.google.cloud.compute.v1.ImageName;
import com.google.cloud.compute.v1.LicenseName;
import com.google.cloud.compute.v1.ListDiskTypesHttpRequest;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.Zone;
import com.google.cloud.compute.v1.ZoneName;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ITComputeTest {

  private static final String ZONE = "us-central1-a";
  private static final String DISK_TYPE = "local-ssd";
  private  static  final String DEFAULT_PROJECT = ServiceOptions.getDefaultProjectId();

  private static DiskTypeClient diskTypeClient;
  private static DiskTypeSettings diskTypeSettings;


  @Rule
  public Timeout globalTimeout = Timeout.seconds(300);

  @BeforeClass
  public static void beforeClass() throws IOException{
    Credentials credentials = GoogleCredentials.getApplicationDefault();

    diskTypeSettings =
        DiskTypeSettings.newBuilder().setCredentialsProvider(FixedCredentialsProvider.create(credentials)).build();
    diskTypeClient =
        DiskTypeClient.create(diskTypeSettings);
  }

  @AfterClass
  public static void tearDown() throws Exception {
    diskTypeClient.close();
  }

  @Test
  public void testGetDiskType() {
    DiskType diskType = diskTypeClient.getDiskType(DiskTypeName.of(DISK_TYPE, DEFAULT_PROJECT, ZONE));
    DiskTypeName returnDiskName = DiskTypeName.parse(trimUrl(diskType.getSelfLink()));
    assertEquals(ZONE, returnDiskName.getZone());
    assertEquals(DISK_TYPE, returnDiskName.getDiskType());
    assertNotNull(diskType.getCreationTimestamp());
    assertNotNull(diskType.getDescription());
    assertNotNull(diskType.getValidDiskSize());
    assertNotNull(diskType.getDefaultDiskSizeGb());
  }

  @Test
  public void testListDiskTypes() {
    Page<DiskType> diskPage = diskTypeClient.listDiskTypes(ZoneName.of(DEFAULT_PROJECT, ZONE)).getPage();
    Iterator<DiskType> diskTypeIterator = diskPage.iterateAll().iterator();
    assertTrue(diskTypeIterator.hasNext());
    while (diskTypeIterator.hasNext()) {
      DiskType diskType = diskTypeIterator.next();
      assertNotNull(diskType.getSelfLink());
      DiskTypeName returnDiskName = DiskTypeName.parse(trimUrl(diskType.getSelfLink()));
      // assertNotNull(diskType.getGeneratedId());
      assertEquals(ZONE, returnDiskName.getZone());
      assertNotNull(diskType.getCreationTimestamp());
      assertNotNull(diskType.getDescription());
      assertNotNull(diskType.getValidDiskSize());
      assertNotNull(diskType.getDefaultDiskSizeGb());
    }
  }

  @Test
  public void testListDiskTypesWithFilter() {
    ListDiskTypesHttpRequest request = ListDiskTypesHttpRequest.newBuilder()
        .setZone(ZoneName.of(DEFAULT_PROJECT, ZONE).toString())
        .setFilter("(defaultDiskSizeGb = 375)")
        .build();
    Page<DiskType> diskPage = diskTypeClient.listDiskTypes(request).getPage();
    Iterator<DiskType> diskTypeIterator = diskPage.iterateAll().iterator();
    assertTrue(diskTypeIterator.hasNext());
    while (diskTypeIterator.hasNext()) {
      DiskType diskType = diskTypeIterator.next();
      assertNotNull(diskType.getZone());
      ZoneName zoneName = ZoneName.parse(trimUrl(diskType.getZone()));
      assertEquals(ZONE, zoneName.getZone());
      assertNotNull(diskType.getCreationTimestamp());
      assertNotNull(diskType.getDescription());
      assertNotNull(diskType.getValidDiskSize());
      assertEquals(375, Long.parseLong(diskType.getDefaultDiskSizeGb()));
    }
  }

  @Test
  public void testAggregatedListDiskTypes() {
    // Page<DiskType> diskPage = diskTypeClient.aggregatedListDiskTypes(ProjectName.of(DEFAULT_PROJECT)).getPage();
    AggregatedListDiskTypesPagedResponse pagedListResponse = diskTypeClient.aggregatedListDiskTypes(ProjectName.of(DEFAULT_PROJECT));
    List<DiskType> diskTypeIterator = Lists.newArrayList(pagedListResponse.iterateAll());
    assertTrue(diskTypeIterator.size() > 0);
    for (DiskType diskType : diskTypeIterator) {
      assertNotNull(diskType.getZone());
      ZoneName zoneName = ZoneName.parse(diskType.getZone());
      assertEquals(ZONE, zoneName.getZone());
      assertNotNull(diskType.getCreationTimestamp());
      assertNotNull(diskType.getDescription());
      assertNotNull(diskType.getValidDiskSize());
      assertNotNull(diskType.getDefaultDiskSizeGb());
    }
  }

  /** For a given resource's URI, trim the path until it contains only the PathTemplate string. */
  private String trimUrl(String url) {
    return url.replaceFirst("^https://www.googleapis.com/compute/v1/", "");
  }
}
