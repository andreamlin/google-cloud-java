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
package com.google.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.paging.FixedSizeCollection;
import com.google.api.gax.paging.Page;
import com.google.api.gax.paging.PagedListResponse;
import com.google.api.gax.rpc.ApiExceptions;
import com.google.api.gax.rpc.PageContext;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods.
 * Each static class inside this wrapper class is used as the return type of
 * one of an API method that implements the page streaming pattern.
 */
@Generated("by GAPIC")
@BetaApi
public class PagedResponseWrappers {

  public static class AggregatedListAddressesPagedResponse extends AbstractPagedListResponse<
      AggregatedListAddressesHttpRequest,
      AddressAggregatedList,
      Address,
      AggregatedListAddressesPage,
      AggregatedListAddressesFixedSizeCollection> {

    public static ApiFuture<AggregatedListAddressesPagedResponse> createAsync(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        ApiFuture<AddressAggregatedList> futureResponse) {
      ApiFuture<AggregatedListAddressesPage> futurePage =
          AggregatedListAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListAddressesPage, AggregatedListAddressesPagedResponse>() {
            @Override
            public AggregatedListAddressesPagedResponse apply(AggregatedListAddressesPage input) {
              return new AggregatedListAddressesPagedResponse(input);
            }
          });
    }

    private AggregatedListAddressesPagedResponse(AggregatedListAddressesPage page) {
      super(page, AggregatedListAddressesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListAddressesPage extends AbstractPage<
      AggregatedListAddressesHttpRequest,
      AddressAggregatedList,
      Address,
      AggregatedListAddressesPage> {

    private AggregatedListAddressesPage(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        AddressAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListAddressesPage createEmptyPage() {
      return new AggregatedListAddressesPage(null, null);
    }

    @Override
    protected AggregatedListAddressesPage createPage(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        AddressAggregatedList response) {
      return new AggregatedListAddressesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListAddressesPage> createPageAsync(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, Address> context,
        ApiFuture<AddressAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListAddressesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListAddressesHttpRequest,
      AddressAggregatedList,
      Address,
      AggregatedListAddressesPage,
      AggregatedListAddressesFixedSizeCollection> {

    private AggregatedListAddressesFixedSizeCollection(List<AggregatedListAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListAddressesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListAddressesFixedSizeCollection createCollection(
        List<AggregatedListAddressesPage> pages, int collectionSize) {
      return new AggregatedListAddressesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListAddressesPagedResponse extends AbstractPagedListResponse<
      ListAddressesHttpRequest,
      AddressList,
      Address,
      ListAddressesPage,
      ListAddressesFixedSizeCollection> {

    public static ApiFuture<ListAddressesPagedResponse> createAsync(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      ApiFuture<ListAddressesPage> futurePage =
          ListAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAddressesPage, ListAddressesPagedResponse>() {
            @Override
            public ListAddressesPagedResponse apply(ListAddressesPage input) {
              return new ListAddressesPagedResponse(input);
            }
          });
    }

    private ListAddressesPagedResponse(ListAddressesPage page) {
      super(page, ListAddressesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListAddressesPage extends AbstractPage<
      ListAddressesHttpRequest,
      AddressList,
      Address,
      ListAddressesPage> {

    private ListAddressesPage(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        AddressList response) {
      super(context, response);
    }

    private static ListAddressesPage createEmptyPage() {
      return new ListAddressesPage(null, null);
    }

    @Override
    protected ListAddressesPage createPage(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        AddressList response) {
      return new ListAddressesPage(context, response);
    }

    @Override
    public ApiFuture<ListAddressesPage> createPageAsync(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListAddressesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListAddressesHttpRequest,
      AddressList,
      Address,
      ListAddressesPage,
      ListAddressesFixedSizeCollection> {

    private ListAddressesFixedSizeCollection(List<ListAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAddressesFixedSizeCollection createEmptyCollection() {
      return new ListAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAddressesFixedSizeCollection createCollection(
        List<ListAddressesPage> pages, int collectionSize) {
      return new ListAddressesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListAutoscalersPagedResponse extends AbstractPagedListResponse<
      AggregatedListAutoscalersHttpRequest,
      AutoscalerAggregatedList,
      Autoscaler,
      AggregatedListAutoscalersPage,
      AggregatedListAutoscalersFixedSizeCollection> {

    public static ApiFuture<AggregatedListAutoscalersPagedResponse> createAsync(
        PageContext<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler> context,
        ApiFuture<AutoscalerAggregatedList> futureResponse) {
      ApiFuture<AggregatedListAutoscalersPage> futurePage =
          AggregatedListAutoscalersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListAutoscalersPage, AggregatedListAutoscalersPagedResponse>() {
            @Override
            public AggregatedListAutoscalersPagedResponse apply(AggregatedListAutoscalersPage input) {
              return new AggregatedListAutoscalersPagedResponse(input);
            }
          });
    }

    private AggregatedListAutoscalersPagedResponse(AggregatedListAutoscalersPage page) {
      super(page, AggregatedListAutoscalersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListAutoscalersPage extends AbstractPage<
      AggregatedListAutoscalersHttpRequest,
      AutoscalerAggregatedList,
      Autoscaler,
      AggregatedListAutoscalersPage> {

    private AggregatedListAutoscalersPage(
        PageContext<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler> context,
        AutoscalerAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListAutoscalersPage createEmptyPage() {
      return new AggregatedListAutoscalersPage(null, null);
    }

    @Override
    protected AggregatedListAutoscalersPage createPage(
        PageContext<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler> context,
        AutoscalerAggregatedList response) {
      return new AggregatedListAutoscalersPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListAutoscalersPage> createPageAsync(
        PageContext<AggregatedListAutoscalersHttpRequest, AutoscalerAggregatedList, Autoscaler> context,
        ApiFuture<AutoscalerAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListAutoscalersFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListAutoscalersHttpRequest,
      AutoscalerAggregatedList,
      Autoscaler,
      AggregatedListAutoscalersPage,
      AggregatedListAutoscalersFixedSizeCollection> {

    private AggregatedListAutoscalersFixedSizeCollection(List<AggregatedListAutoscalersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListAutoscalersFixedSizeCollection createEmptyCollection() {
      return new AggregatedListAutoscalersFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListAutoscalersFixedSizeCollection createCollection(
        List<AggregatedListAutoscalersPage> pages, int collectionSize) {
      return new AggregatedListAutoscalersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListAutoscalersPagedResponse extends AbstractPagedListResponse<
      ListAutoscalersHttpRequest,
      AutoscalerList,
      Autoscaler,
      ListAutoscalersPage,
      ListAutoscalersFixedSizeCollection> {

    public static ApiFuture<ListAutoscalersPagedResponse> createAsync(
        PageContext<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler> context,
        ApiFuture<AutoscalerList> futureResponse) {
      ApiFuture<ListAutoscalersPage> futurePage =
          ListAutoscalersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAutoscalersPage, ListAutoscalersPagedResponse>() {
            @Override
            public ListAutoscalersPagedResponse apply(ListAutoscalersPage input) {
              return new ListAutoscalersPagedResponse(input);
            }
          });
    }

    private ListAutoscalersPagedResponse(ListAutoscalersPage page) {
      super(page, ListAutoscalersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListAutoscalersPage extends AbstractPage<
      ListAutoscalersHttpRequest,
      AutoscalerList,
      Autoscaler,
      ListAutoscalersPage> {

    private ListAutoscalersPage(
        PageContext<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler> context,
        AutoscalerList response) {
      super(context, response);
    }

    private static ListAutoscalersPage createEmptyPage() {
      return new ListAutoscalersPage(null, null);
    }

    @Override
    protected ListAutoscalersPage createPage(
        PageContext<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler> context,
        AutoscalerList response) {
      return new ListAutoscalersPage(context, response);
    }

    @Override
    public ApiFuture<ListAutoscalersPage> createPageAsync(
        PageContext<ListAutoscalersHttpRequest, AutoscalerList, Autoscaler> context,
        ApiFuture<AutoscalerList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListAutoscalersFixedSizeCollection extends AbstractFixedSizeCollection<
      ListAutoscalersHttpRequest,
      AutoscalerList,
      Autoscaler,
      ListAutoscalersPage,
      ListAutoscalersFixedSizeCollection> {

    private ListAutoscalersFixedSizeCollection(List<ListAutoscalersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAutoscalersFixedSizeCollection createEmptyCollection() {
      return new ListAutoscalersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAutoscalersFixedSizeCollection createCollection(
        List<ListAutoscalersPage> pages, int collectionSize) {
      return new ListAutoscalersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListBackendServicesPagedResponse extends AbstractPagedListResponse<
      AggregatedListBackendServicesHttpRequest,
      BackendServiceAggregatedList,
      BackendService,
      AggregatedListBackendServicesPage,
      AggregatedListBackendServicesFixedSizeCollection> {

    public static ApiFuture<AggregatedListBackendServicesPagedResponse> createAsync(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        ApiFuture<BackendServiceAggregatedList> futureResponse) {
      ApiFuture<AggregatedListBackendServicesPage> futurePage =
          AggregatedListBackendServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListBackendServicesPage, AggregatedListBackendServicesPagedResponse>() {
            @Override
            public AggregatedListBackendServicesPagedResponse apply(AggregatedListBackendServicesPage input) {
              return new AggregatedListBackendServicesPagedResponse(input);
            }
          });
    }

    private AggregatedListBackendServicesPagedResponse(AggregatedListBackendServicesPage page) {
      super(page, AggregatedListBackendServicesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListBackendServicesPage extends AbstractPage<
      AggregatedListBackendServicesHttpRequest,
      BackendServiceAggregatedList,
      BackendService,
      AggregatedListBackendServicesPage> {

    private AggregatedListBackendServicesPage(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        BackendServiceAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListBackendServicesPage createEmptyPage() {
      return new AggregatedListBackendServicesPage(null, null);
    }

    @Override
    protected AggregatedListBackendServicesPage createPage(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        BackendServiceAggregatedList response) {
      return new AggregatedListBackendServicesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListBackendServicesPage> createPageAsync(
        PageContext<AggregatedListBackendServicesHttpRequest, BackendServiceAggregatedList, BackendService> context,
        ApiFuture<BackendServiceAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListBackendServicesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListBackendServicesHttpRequest,
      BackendServiceAggregatedList,
      BackendService,
      AggregatedListBackendServicesPage,
      AggregatedListBackendServicesFixedSizeCollection> {

    private AggregatedListBackendServicesFixedSizeCollection(List<AggregatedListBackendServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListBackendServicesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListBackendServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListBackendServicesFixedSizeCollection createCollection(
        List<AggregatedListBackendServicesPage> pages, int collectionSize) {
      return new AggregatedListBackendServicesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListBackendServicesPagedResponse extends AbstractPagedListResponse<
      ListBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListBackendServicesPage,
      ListBackendServicesFixedSizeCollection> {

    public static ApiFuture<ListBackendServicesPagedResponse> createAsync(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        ApiFuture<BackendServiceList> futureResponse) {
      ApiFuture<ListBackendServicesPage> futurePage =
          ListBackendServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListBackendServicesPage, ListBackendServicesPagedResponse>() {
            @Override
            public ListBackendServicesPagedResponse apply(ListBackendServicesPage input) {
              return new ListBackendServicesPagedResponse(input);
            }
          });
    }

    private ListBackendServicesPagedResponse(ListBackendServicesPage page) {
      super(page, ListBackendServicesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListBackendServicesPage extends AbstractPage<
      ListBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListBackendServicesPage> {

    private ListBackendServicesPage(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        BackendServiceList response) {
      super(context, response);
    }

    private static ListBackendServicesPage createEmptyPage() {
      return new ListBackendServicesPage(null, null);
    }

    @Override
    protected ListBackendServicesPage createPage(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        BackendServiceList response) {
      return new ListBackendServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListBackendServicesPage> createPageAsync(
        PageContext<ListBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        ApiFuture<BackendServiceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListBackendServicesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListBackendServicesPage,
      ListBackendServicesFixedSizeCollection> {

    private ListBackendServicesFixedSizeCollection(List<ListBackendServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListBackendServicesFixedSizeCollection createEmptyCollection() {
      return new ListBackendServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListBackendServicesFixedSizeCollection createCollection(
        List<ListBackendServicesPage> pages, int collectionSize) {
      return new ListBackendServicesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListDiskTypesPagedResponse extends AbstractPagedListResponse<
      AggregatedListDiskTypesHttpRequest,
      DiskTypeAggregatedList,
      DiskType,
      AggregatedListDiskTypesPage,
      AggregatedListDiskTypesFixedSizeCollection> {

    public static ApiFuture<AggregatedListDiskTypesPagedResponse> createAsync(
        PageContext<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList, DiskType> context,
        ApiFuture<DiskTypeAggregatedList> futureResponse) {
      ApiFuture<AggregatedListDiskTypesPage> futurePage =
          AggregatedListDiskTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListDiskTypesPage, AggregatedListDiskTypesPagedResponse>() {
            @Override
            public AggregatedListDiskTypesPagedResponse apply(AggregatedListDiskTypesPage input) {
              return new AggregatedListDiskTypesPagedResponse(input);
            }
          });
    }

    private AggregatedListDiskTypesPagedResponse(AggregatedListDiskTypesPage page) {
      super(page, AggregatedListDiskTypesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListDiskTypesPage extends AbstractPage<
      AggregatedListDiskTypesHttpRequest,
      DiskTypeAggregatedList,
      DiskType,
      AggregatedListDiskTypesPage> {

    private AggregatedListDiskTypesPage(
        PageContext<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList, DiskType> context,
        DiskTypeAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListDiskTypesPage createEmptyPage() {
      return new AggregatedListDiskTypesPage(null, null);
    }

    @Override
    protected AggregatedListDiskTypesPage createPage(
        PageContext<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList, DiskType> context,
        DiskTypeAggregatedList response) {
      return new AggregatedListDiskTypesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListDiskTypesPage> createPageAsync(
        PageContext<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList, DiskType> context,
        ApiFuture<DiskTypeAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListDiskTypesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListDiskTypesHttpRequest,
      DiskTypeAggregatedList,
      DiskType,
      AggregatedListDiskTypesPage,
      AggregatedListDiskTypesFixedSizeCollection> {

    private AggregatedListDiskTypesFixedSizeCollection(List<AggregatedListDiskTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListDiskTypesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListDiskTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListDiskTypesFixedSizeCollection createCollection(
        List<AggregatedListDiskTypesPage> pages, int collectionSize) {
      return new AggregatedListDiskTypesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListDiskTypesPagedResponse extends AbstractPagedListResponse<
      ListDiskTypesHttpRequest,
      DiskTypeList,
      DiskType,
      ListDiskTypesPage,
      ListDiskTypesFixedSizeCollection> {

    public static ApiFuture<ListDiskTypesPagedResponse> createAsync(
        PageContext<ListDiskTypesHttpRequest, DiskTypeList, DiskType> context,
        ApiFuture<DiskTypeList> futureResponse) {
      ApiFuture<ListDiskTypesPage> futurePage =
          ListDiskTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListDiskTypesPage, ListDiskTypesPagedResponse>() {
            @Override
            public ListDiskTypesPagedResponse apply(ListDiskTypesPage input) {
              return new ListDiskTypesPagedResponse(input);
            }
          });
    }

    private ListDiskTypesPagedResponse(ListDiskTypesPage page) {
      super(page, ListDiskTypesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListDiskTypesPage extends AbstractPage<
      ListDiskTypesHttpRequest,
      DiskTypeList,
      DiskType,
      ListDiskTypesPage> {

    private ListDiskTypesPage(
        PageContext<ListDiskTypesHttpRequest, DiskTypeList, DiskType> context,
        DiskTypeList response) {
      super(context, response);
    }

    private static ListDiskTypesPage createEmptyPage() {
      return new ListDiskTypesPage(null, null);
    }

    @Override
    protected ListDiskTypesPage createPage(
        PageContext<ListDiskTypesHttpRequest, DiskTypeList, DiskType> context,
        DiskTypeList response) {
      return new ListDiskTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListDiskTypesPage> createPageAsync(
        PageContext<ListDiskTypesHttpRequest, DiskTypeList, DiskType> context,
        ApiFuture<DiskTypeList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListDiskTypesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListDiskTypesHttpRequest,
      DiskTypeList,
      DiskType,
      ListDiskTypesPage,
      ListDiskTypesFixedSizeCollection> {

    private ListDiskTypesFixedSizeCollection(List<ListDiskTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDiskTypesFixedSizeCollection createEmptyCollection() {
      return new ListDiskTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDiskTypesFixedSizeCollection createCollection(
        List<ListDiskTypesPage> pages, int collectionSize) {
      return new ListDiskTypesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListDisksPagedResponse extends AbstractPagedListResponse<
      AggregatedListDisksHttpRequest,
      DiskAggregatedList,
      Disk,
      AggregatedListDisksPage,
      AggregatedListDisksFixedSizeCollection> {

    public static ApiFuture<AggregatedListDisksPagedResponse> createAsync(
        PageContext<AggregatedListDisksHttpRequest, DiskAggregatedList, Disk> context,
        ApiFuture<DiskAggregatedList> futureResponse) {
      ApiFuture<AggregatedListDisksPage> futurePage =
          AggregatedListDisksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListDisksPage, AggregatedListDisksPagedResponse>() {
            @Override
            public AggregatedListDisksPagedResponse apply(AggregatedListDisksPage input) {
              return new AggregatedListDisksPagedResponse(input);
            }
          });
    }

    private AggregatedListDisksPagedResponse(AggregatedListDisksPage page) {
      super(page, AggregatedListDisksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListDisksPage extends AbstractPage<
      AggregatedListDisksHttpRequest,
      DiskAggregatedList,
      Disk,
      AggregatedListDisksPage> {

    private AggregatedListDisksPage(
        PageContext<AggregatedListDisksHttpRequest, DiskAggregatedList, Disk> context,
        DiskAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListDisksPage createEmptyPage() {
      return new AggregatedListDisksPage(null, null);
    }

    @Override
    protected AggregatedListDisksPage createPage(
        PageContext<AggregatedListDisksHttpRequest, DiskAggregatedList, Disk> context,
        DiskAggregatedList response) {
      return new AggregatedListDisksPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListDisksPage> createPageAsync(
        PageContext<AggregatedListDisksHttpRequest, DiskAggregatedList, Disk> context,
        ApiFuture<DiskAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListDisksFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListDisksHttpRequest,
      DiskAggregatedList,
      Disk,
      AggregatedListDisksPage,
      AggregatedListDisksFixedSizeCollection> {

    private AggregatedListDisksFixedSizeCollection(List<AggregatedListDisksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListDisksFixedSizeCollection createEmptyCollection() {
      return new AggregatedListDisksFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListDisksFixedSizeCollection createCollection(
        List<AggregatedListDisksPage> pages, int collectionSize) {
      return new AggregatedListDisksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListDisksPagedResponse extends AbstractPagedListResponse<
      ListDisksHttpRequest,
      DiskList,
      Disk,
      ListDisksPage,
      ListDisksFixedSizeCollection> {

    public static ApiFuture<ListDisksPagedResponse> createAsync(
        PageContext<ListDisksHttpRequest, DiskList, Disk> context,
        ApiFuture<DiskList> futureResponse) {
      ApiFuture<ListDisksPage> futurePage =
          ListDisksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListDisksPage, ListDisksPagedResponse>() {
            @Override
            public ListDisksPagedResponse apply(ListDisksPage input) {
              return new ListDisksPagedResponse(input);
            }
          });
    }

    private ListDisksPagedResponse(ListDisksPage page) {
      super(page, ListDisksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListDisksPage extends AbstractPage<
      ListDisksHttpRequest,
      DiskList,
      Disk,
      ListDisksPage> {

    private ListDisksPage(
        PageContext<ListDisksHttpRequest, DiskList, Disk> context,
        DiskList response) {
      super(context, response);
    }

    private static ListDisksPage createEmptyPage() {
      return new ListDisksPage(null, null);
    }

    @Override
    protected ListDisksPage createPage(
        PageContext<ListDisksHttpRequest, DiskList, Disk> context,
        DiskList response) {
      return new ListDisksPage(context, response);
    }

    @Override
    public ApiFuture<ListDisksPage> createPageAsync(
        PageContext<ListDisksHttpRequest, DiskList, Disk> context,
        ApiFuture<DiskList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListDisksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListDisksHttpRequest,
      DiskList,
      Disk,
      ListDisksPage,
      ListDisksFixedSizeCollection> {

    private ListDisksFixedSizeCollection(List<ListDisksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDisksFixedSizeCollection createEmptyCollection() {
      return new ListDisksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDisksFixedSizeCollection createCollection(
        List<ListDisksPage> pages, int collectionSize) {
      return new ListDisksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListFirewallsPagedResponse extends AbstractPagedListResponse<
      ListFirewallsHttpRequest,
      FirewallList,
      Firewall,
      ListFirewallsPage,
      ListFirewallsFixedSizeCollection> {

    public static ApiFuture<ListFirewallsPagedResponse> createAsync(
        PageContext<ListFirewallsHttpRequest, FirewallList, Firewall> context,
        ApiFuture<FirewallList> futureResponse) {
      ApiFuture<ListFirewallsPage> futurePage =
          ListFirewallsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListFirewallsPage, ListFirewallsPagedResponse>() {
            @Override
            public ListFirewallsPagedResponse apply(ListFirewallsPage input) {
              return new ListFirewallsPagedResponse(input);
            }
          });
    }

    private ListFirewallsPagedResponse(ListFirewallsPage page) {
      super(page, ListFirewallsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListFirewallsPage extends AbstractPage<
      ListFirewallsHttpRequest,
      FirewallList,
      Firewall,
      ListFirewallsPage> {

    private ListFirewallsPage(
        PageContext<ListFirewallsHttpRequest, FirewallList, Firewall> context,
        FirewallList response) {
      super(context, response);
    }

    private static ListFirewallsPage createEmptyPage() {
      return new ListFirewallsPage(null, null);
    }

    @Override
    protected ListFirewallsPage createPage(
        PageContext<ListFirewallsHttpRequest, FirewallList, Firewall> context,
        FirewallList response) {
      return new ListFirewallsPage(context, response);
    }

    @Override
    public ApiFuture<ListFirewallsPage> createPageAsync(
        PageContext<ListFirewallsHttpRequest, FirewallList, Firewall> context,
        ApiFuture<FirewallList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListFirewallsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListFirewallsHttpRequest,
      FirewallList,
      Firewall,
      ListFirewallsPage,
      ListFirewallsFixedSizeCollection> {

    private ListFirewallsFixedSizeCollection(List<ListFirewallsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFirewallsFixedSizeCollection createEmptyCollection() {
      return new ListFirewallsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFirewallsFixedSizeCollection createCollection(
        List<ListFirewallsPage> pages, int collectionSize) {
      return new ListFirewallsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListForwardingRulesPagedResponse extends AbstractPagedListResponse<
      AggregatedListForwardingRulesHttpRequest,
      ForwardingRuleAggregatedList,
      ForwardingRule,
      AggregatedListForwardingRulesPage,
      AggregatedListForwardingRulesFixedSizeCollection> {

    public static ApiFuture<AggregatedListForwardingRulesPagedResponse> createAsync(
        PageContext<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule> context,
        ApiFuture<ForwardingRuleAggregatedList> futureResponse) {
      ApiFuture<AggregatedListForwardingRulesPage> futurePage =
          AggregatedListForwardingRulesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListForwardingRulesPage, AggregatedListForwardingRulesPagedResponse>() {
            @Override
            public AggregatedListForwardingRulesPagedResponse apply(AggregatedListForwardingRulesPage input) {
              return new AggregatedListForwardingRulesPagedResponse(input);
            }
          });
    }

    private AggregatedListForwardingRulesPagedResponse(AggregatedListForwardingRulesPage page) {
      super(page, AggregatedListForwardingRulesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListForwardingRulesPage extends AbstractPage<
      AggregatedListForwardingRulesHttpRequest,
      ForwardingRuleAggregatedList,
      ForwardingRule,
      AggregatedListForwardingRulesPage> {

    private AggregatedListForwardingRulesPage(
        PageContext<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule> context,
        ForwardingRuleAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListForwardingRulesPage createEmptyPage() {
      return new AggregatedListForwardingRulesPage(null, null);
    }

    @Override
    protected AggregatedListForwardingRulesPage createPage(
        PageContext<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule> context,
        ForwardingRuleAggregatedList response) {
      return new AggregatedListForwardingRulesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListForwardingRulesPage> createPageAsync(
        PageContext<AggregatedListForwardingRulesHttpRequest, ForwardingRuleAggregatedList, ForwardingRule> context,
        ApiFuture<ForwardingRuleAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListForwardingRulesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListForwardingRulesHttpRequest,
      ForwardingRuleAggregatedList,
      ForwardingRule,
      AggregatedListForwardingRulesPage,
      AggregatedListForwardingRulesFixedSizeCollection> {

    private AggregatedListForwardingRulesFixedSizeCollection(List<AggregatedListForwardingRulesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListForwardingRulesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListForwardingRulesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListForwardingRulesFixedSizeCollection createCollection(
        List<AggregatedListForwardingRulesPage> pages, int collectionSize) {
      return new AggregatedListForwardingRulesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListForwardingRulesPagedResponse extends AbstractPagedListResponse<
      ListForwardingRulesHttpRequest,
      ForwardingRuleList,
      ForwardingRule,
      ListForwardingRulesPage,
      ListForwardingRulesFixedSizeCollection> {

    public static ApiFuture<ListForwardingRulesPagedResponse> createAsync(
        PageContext<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ApiFuture<ForwardingRuleList> futureResponse) {
      ApiFuture<ListForwardingRulesPage> futurePage =
          ListForwardingRulesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListForwardingRulesPage, ListForwardingRulesPagedResponse>() {
            @Override
            public ListForwardingRulesPagedResponse apply(ListForwardingRulesPage input) {
              return new ListForwardingRulesPagedResponse(input);
            }
          });
    }

    private ListForwardingRulesPagedResponse(ListForwardingRulesPage page) {
      super(page, ListForwardingRulesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListForwardingRulesPage extends AbstractPage<
      ListForwardingRulesHttpRequest,
      ForwardingRuleList,
      ForwardingRule,
      ListForwardingRulesPage> {

    private ListForwardingRulesPage(
        PageContext<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ForwardingRuleList response) {
      super(context, response);
    }

    private static ListForwardingRulesPage createEmptyPage() {
      return new ListForwardingRulesPage(null, null);
    }

    @Override
    protected ListForwardingRulesPage createPage(
        PageContext<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ForwardingRuleList response) {
      return new ListForwardingRulesPage(context, response);
    }

    @Override
    public ApiFuture<ListForwardingRulesPage> createPageAsync(
        PageContext<ListForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ApiFuture<ForwardingRuleList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListForwardingRulesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListForwardingRulesHttpRequest,
      ForwardingRuleList,
      ForwardingRule,
      ListForwardingRulesPage,
      ListForwardingRulesFixedSizeCollection> {

    private ListForwardingRulesFixedSizeCollection(List<ListForwardingRulesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListForwardingRulesFixedSizeCollection createEmptyCollection() {
      return new ListForwardingRulesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListForwardingRulesFixedSizeCollection createCollection(
        List<ListForwardingRulesPage> pages, int collectionSize) {
      return new ListForwardingRulesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListGlobalAddressesPagedResponse extends AbstractPagedListResponse<
      ListGlobalAddressesHttpRequest,
      AddressList,
      Address,
      ListGlobalAddressesPage,
      ListGlobalAddressesFixedSizeCollection> {

    public static ApiFuture<ListGlobalAddressesPagedResponse> createAsync(
        PageContext<ListGlobalAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      ApiFuture<ListGlobalAddressesPage> futurePage =
          ListGlobalAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListGlobalAddressesPage, ListGlobalAddressesPagedResponse>() {
            @Override
            public ListGlobalAddressesPagedResponse apply(ListGlobalAddressesPage input) {
              return new ListGlobalAddressesPagedResponse(input);
            }
          });
    }

    private ListGlobalAddressesPagedResponse(ListGlobalAddressesPage page) {
      super(page, ListGlobalAddressesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListGlobalAddressesPage extends AbstractPage<
      ListGlobalAddressesHttpRequest,
      AddressList,
      Address,
      ListGlobalAddressesPage> {

    private ListGlobalAddressesPage(
        PageContext<ListGlobalAddressesHttpRequest, AddressList, Address> context,
        AddressList response) {
      super(context, response);
    }

    private static ListGlobalAddressesPage createEmptyPage() {
      return new ListGlobalAddressesPage(null, null);
    }

    @Override
    protected ListGlobalAddressesPage createPage(
        PageContext<ListGlobalAddressesHttpRequest, AddressList, Address> context,
        AddressList response) {
      return new ListGlobalAddressesPage(context, response);
    }

    @Override
    public ApiFuture<ListGlobalAddressesPage> createPageAsync(
        PageContext<ListGlobalAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListGlobalAddressesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListGlobalAddressesHttpRequest,
      AddressList,
      Address,
      ListGlobalAddressesPage,
      ListGlobalAddressesFixedSizeCollection> {

    private ListGlobalAddressesFixedSizeCollection(List<ListGlobalAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListGlobalAddressesFixedSizeCollection createEmptyCollection() {
      return new ListGlobalAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListGlobalAddressesFixedSizeCollection createCollection(
        List<ListGlobalAddressesPage> pages, int collectionSize) {
      return new ListGlobalAddressesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListGlobalForwardingRulesPagedResponse extends AbstractPagedListResponse<
      ListGlobalForwardingRulesHttpRequest,
      ForwardingRuleList,
      ForwardingRule,
      ListGlobalForwardingRulesPage,
      ListGlobalForwardingRulesFixedSizeCollection> {

    public static ApiFuture<ListGlobalForwardingRulesPagedResponse> createAsync(
        PageContext<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ApiFuture<ForwardingRuleList> futureResponse) {
      ApiFuture<ListGlobalForwardingRulesPage> futurePage =
          ListGlobalForwardingRulesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListGlobalForwardingRulesPage, ListGlobalForwardingRulesPagedResponse>() {
            @Override
            public ListGlobalForwardingRulesPagedResponse apply(ListGlobalForwardingRulesPage input) {
              return new ListGlobalForwardingRulesPagedResponse(input);
            }
          });
    }

    private ListGlobalForwardingRulesPagedResponse(ListGlobalForwardingRulesPage page) {
      super(page, ListGlobalForwardingRulesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListGlobalForwardingRulesPage extends AbstractPage<
      ListGlobalForwardingRulesHttpRequest,
      ForwardingRuleList,
      ForwardingRule,
      ListGlobalForwardingRulesPage> {

    private ListGlobalForwardingRulesPage(
        PageContext<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ForwardingRuleList response) {
      super(context, response);
    }

    private static ListGlobalForwardingRulesPage createEmptyPage() {
      return new ListGlobalForwardingRulesPage(null, null);
    }

    @Override
    protected ListGlobalForwardingRulesPage createPage(
        PageContext<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ForwardingRuleList response) {
      return new ListGlobalForwardingRulesPage(context, response);
    }

    @Override
    public ApiFuture<ListGlobalForwardingRulesPage> createPageAsync(
        PageContext<ListGlobalForwardingRulesHttpRequest, ForwardingRuleList, ForwardingRule> context,
        ApiFuture<ForwardingRuleList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListGlobalForwardingRulesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListGlobalForwardingRulesHttpRequest,
      ForwardingRuleList,
      ForwardingRule,
      ListGlobalForwardingRulesPage,
      ListGlobalForwardingRulesFixedSizeCollection> {

    private ListGlobalForwardingRulesFixedSizeCollection(List<ListGlobalForwardingRulesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListGlobalForwardingRulesFixedSizeCollection createEmptyCollection() {
      return new ListGlobalForwardingRulesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListGlobalForwardingRulesFixedSizeCollection createCollection(
        List<ListGlobalForwardingRulesPage> pages, int collectionSize) {
      return new ListGlobalForwardingRulesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListGlobalOperationsPagedResponse extends AbstractPagedListResponse<
      AggregatedListGlobalOperationsHttpRequest,
      OperationAggregatedList,
      Operation,
      AggregatedListGlobalOperationsPage,
      AggregatedListGlobalOperationsFixedSizeCollection> {

    public static ApiFuture<AggregatedListGlobalOperationsPagedResponse> createAsync(
        PageContext<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation> context,
        ApiFuture<OperationAggregatedList> futureResponse) {
      ApiFuture<AggregatedListGlobalOperationsPage> futurePage =
          AggregatedListGlobalOperationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListGlobalOperationsPage, AggregatedListGlobalOperationsPagedResponse>() {
            @Override
            public AggregatedListGlobalOperationsPagedResponse apply(AggregatedListGlobalOperationsPage input) {
              return new AggregatedListGlobalOperationsPagedResponse(input);
            }
          });
    }

    private AggregatedListGlobalOperationsPagedResponse(AggregatedListGlobalOperationsPage page) {
      super(page, AggregatedListGlobalOperationsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListGlobalOperationsPage extends AbstractPage<
      AggregatedListGlobalOperationsHttpRequest,
      OperationAggregatedList,
      Operation,
      AggregatedListGlobalOperationsPage> {

    private AggregatedListGlobalOperationsPage(
        PageContext<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation> context,
        OperationAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListGlobalOperationsPage createEmptyPage() {
      return new AggregatedListGlobalOperationsPage(null, null);
    }

    @Override
    protected AggregatedListGlobalOperationsPage createPage(
        PageContext<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation> context,
        OperationAggregatedList response) {
      return new AggregatedListGlobalOperationsPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListGlobalOperationsPage> createPageAsync(
        PageContext<AggregatedListGlobalOperationsHttpRequest, OperationAggregatedList, Operation> context,
        ApiFuture<OperationAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListGlobalOperationsFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListGlobalOperationsHttpRequest,
      OperationAggregatedList,
      Operation,
      AggregatedListGlobalOperationsPage,
      AggregatedListGlobalOperationsFixedSizeCollection> {

    private AggregatedListGlobalOperationsFixedSizeCollection(List<AggregatedListGlobalOperationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListGlobalOperationsFixedSizeCollection createEmptyCollection() {
      return new AggregatedListGlobalOperationsFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListGlobalOperationsFixedSizeCollection createCollection(
        List<AggregatedListGlobalOperationsPage> pages, int collectionSize) {
      return new AggregatedListGlobalOperationsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListGlobalOperationsPagedResponse extends AbstractPagedListResponse<
      ListGlobalOperationsHttpRequest,
      OperationList,
      Operation,
      ListGlobalOperationsPage,
      ListGlobalOperationsFixedSizeCollection> {

    public static ApiFuture<ListGlobalOperationsPagedResponse> createAsync(
        PageContext<ListGlobalOperationsHttpRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      ApiFuture<ListGlobalOperationsPage> futurePage =
          ListGlobalOperationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListGlobalOperationsPage, ListGlobalOperationsPagedResponse>() {
            @Override
            public ListGlobalOperationsPagedResponse apply(ListGlobalOperationsPage input) {
              return new ListGlobalOperationsPagedResponse(input);
            }
          });
    }

    private ListGlobalOperationsPagedResponse(ListGlobalOperationsPage page) {
      super(page, ListGlobalOperationsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListGlobalOperationsPage extends AbstractPage<
      ListGlobalOperationsHttpRequest,
      OperationList,
      Operation,
      ListGlobalOperationsPage> {

    private ListGlobalOperationsPage(
        PageContext<ListGlobalOperationsHttpRequest, OperationList, Operation> context,
        OperationList response) {
      super(context, response);
    }

    private static ListGlobalOperationsPage createEmptyPage() {
      return new ListGlobalOperationsPage(null, null);
    }

    @Override
    protected ListGlobalOperationsPage createPage(
        PageContext<ListGlobalOperationsHttpRequest, OperationList, Operation> context,
        OperationList response) {
      return new ListGlobalOperationsPage(context, response);
    }

    @Override
    public ApiFuture<ListGlobalOperationsPage> createPageAsync(
        PageContext<ListGlobalOperationsHttpRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListGlobalOperationsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListGlobalOperationsHttpRequest,
      OperationList,
      Operation,
      ListGlobalOperationsPage,
      ListGlobalOperationsFixedSizeCollection> {

    private ListGlobalOperationsFixedSizeCollection(List<ListGlobalOperationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListGlobalOperationsFixedSizeCollection createEmptyCollection() {
      return new ListGlobalOperationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListGlobalOperationsFixedSizeCollection createCollection(
        List<ListGlobalOperationsPage> pages, int collectionSize) {
      return new ListGlobalOperationsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListHealthChecksPagedResponse extends AbstractPagedListResponse<
      ListHealthChecksHttpRequest,
      HealthCheckList,
      HealthCheck,
      ListHealthChecksPage,
      ListHealthChecksFixedSizeCollection> {

    public static ApiFuture<ListHealthChecksPagedResponse> createAsync(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        ApiFuture<HealthCheckList> futureResponse) {
      ApiFuture<ListHealthChecksPage> futurePage =
          ListHealthChecksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListHealthChecksPage, ListHealthChecksPagedResponse>() {
            @Override
            public ListHealthChecksPagedResponse apply(ListHealthChecksPage input) {
              return new ListHealthChecksPagedResponse(input);
            }
          });
    }

    private ListHealthChecksPagedResponse(ListHealthChecksPage page) {
      super(page, ListHealthChecksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListHealthChecksPage extends AbstractPage<
      ListHealthChecksHttpRequest,
      HealthCheckList,
      HealthCheck,
      ListHealthChecksPage> {

    private ListHealthChecksPage(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        HealthCheckList response) {
      super(context, response);
    }

    private static ListHealthChecksPage createEmptyPage() {
      return new ListHealthChecksPage(null, null);
    }

    @Override
    protected ListHealthChecksPage createPage(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        HealthCheckList response) {
      return new ListHealthChecksPage(context, response);
    }

    @Override
    public ApiFuture<ListHealthChecksPage> createPageAsync(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        ApiFuture<HealthCheckList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListHealthChecksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListHealthChecksHttpRequest,
      HealthCheckList,
      HealthCheck,
      ListHealthChecksPage,
      ListHealthChecksFixedSizeCollection> {

    private ListHealthChecksFixedSizeCollection(List<ListHealthChecksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListHealthChecksFixedSizeCollection createEmptyCollection() {
      return new ListHealthChecksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListHealthChecksFixedSizeCollection createCollection(
        List<ListHealthChecksPage> pages, int collectionSize) {
      return new ListHealthChecksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListHttpHealthChecksPagedResponse extends AbstractPagedListResponse<
      ListHttpHealthChecksHttpRequest,
      HttpHealthCheckList,
      HttpHealthCheck,
      ListHttpHealthChecksPage,
      ListHttpHealthChecksFixedSizeCollection> {

    public static ApiFuture<ListHttpHealthChecksPagedResponse> createAsync(
        PageContext<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck> context,
        ApiFuture<HttpHealthCheckList> futureResponse) {
      ApiFuture<ListHttpHealthChecksPage> futurePage =
          ListHttpHealthChecksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListHttpHealthChecksPage, ListHttpHealthChecksPagedResponse>() {
            @Override
            public ListHttpHealthChecksPagedResponse apply(ListHttpHealthChecksPage input) {
              return new ListHttpHealthChecksPagedResponse(input);
            }
          });
    }

    private ListHttpHealthChecksPagedResponse(ListHttpHealthChecksPage page) {
      super(page, ListHttpHealthChecksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListHttpHealthChecksPage extends AbstractPage<
      ListHttpHealthChecksHttpRequest,
      HttpHealthCheckList,
      HttpHealthCheck,
      ListHttpHealthChecksPage> {

    private ListHttpHealthChecksPage(
        PageContext<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck> context,
        HttpHealthCheckList response) {
      super(context, response);
    }

    private static ListHttpHealthChecksPage createEmptyPage() {
      return new ListHttpHealthChecksPage(null, null);
    }

    @Override
    protected ListHttpHealthChecksPage createPage(
        PageContext<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck> context,
        HttpHealthCheckList response) {
      return new ListHttpHealthChecksPage(context, response);
    }

    @Override
    public ApiFuture<ListHttpHealthChecksPage> createPageAsync(
        PageContext<ListHttpHealthChecksHttpRequest, HttpHealthCheckList, HttpHealthCheck> context,
        ApiFuture<HttpHealthCheckList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListHttpHealthChecksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListHttpHealthChecksHttpRequest,
      HttpHealthCheckList,
      HttpHealthCheck,
      ListHttpHealthChecksPage,
      ListHttpHealthChecksFixedSizeCollection> {

    private ListHttpHealthChecksFixedSizeCollection(List<ListHttpHealthChecksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListHttpHealthChecksFixedSizeCollection createEmptyCollection() {
      return new ListHttpHealthChecksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListHttpHealthChecksFixedSizeCollection createCollection(
        List<ListHttpHealthChecksPage> pages, int collectionSize) {
      return new ListHttpHealthChecksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListHttpsHealthChecksPagedResponse extends AbstractPagedListResponse<
      ListHttpsHealthChecksHttpRequest,
      HttpsHealthCheckList,
      HttpsHealthCheck,
      ListHttpsHealthChecksPage,
      ListHttpsHealthChecksFixedSizeCollection> {

    public static ApiFuture<ListHttpsHealthChecksPagedResponse> createAsync(
        PageContext<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck> context,
        ApiFuture<HttpsHealthCheckList> futureResponse) {
      ApiFuture<ListHttpsHealthChecksPage> futurePage =
          ListHttpsHealthChecksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListHttpsHealthChecksPage, ListHttpsHealthChecksPagedResponse>() {
            @Override
            public ListHttpsHealthChecksPagedResponse apply(ListHttpsHealthChecksPage input) {
              return new ListHttpsHealthChecksPagedResponse(input);
            }
          });
    }

    private ListHttpsHealthChecksPagedResponse(ListHttpsHealthChecksPage page) {
      super(page, ListHttpsHealthChecksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListHttpsHealthChecksPage extends AbstractPage<
      ListHttpsHealthChecksHttpRequest,
      HttpsHealthCheckList,
      HttpsHealthCheck,
      ListHttpsHealthChecksPage> {

    private ListHttpsHealthChecksPage(
        PageContext<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck> context,
        HttpsHealthCheckList response) {
      super(context, response);
    }

    private static ListHttpsHealthChecksPage createEmptyPage() {
      return new ListHttpsHealthChecksPage(null, null);
    }

    @Override
    protected ListHttpsHealthChecksPage createPage(
        PageContext<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck> context,
        HttpsHealthCheckList response) {
      return new ListHttpsHealthChecksPage(context, response);
    }

    @Override
    public ApiFuture<ListHttpsHealthChecksPage> createPageAsync(
        PageContext<ListHttpsHealthChecksHttpRequest, HttpsHealthCheckList, HttpsHealthCheck> context,
        ApiFuture<HttpsHealthCheckList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListHttpsHealthChecksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListHttpsHealthChecksHttpRequest,
      HttpsHealthCheckList,
      HttpsHealthCheck,
      ListHttpsHealthChecksPage,
      ListHttpsHealthChecksFixedSizeCollection> {

    private ListHttpsHealthChecksFixedSizeCollection(List<ListHttpsHealthChecksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListHttpsHealthChecksFixedSizeCollection createEmptyCollection() {
      return new ListHttpsHealthChecksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListHttpsHealthChecksFixedSizeCollection createCollection(
        List<ListHttpsHealthChecksPage> pages, int collectionSize) {
      return new ListHttpsHealthChecksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListImagesPagedResponse extends AbstractPagedListResponse<
      ListImagesHttpRequest,
      ImageList,
      Image,
      ListImagesPage,
      ListImagesFixedSizeCollection> {

    public static ApiFuture<ListImagesPagedResponse> createAsync(
        PageContext<ListImagesHttpRequest, ImageList, Image> context,
        ApiFuture<ImageList> futureResponse) {
      ApiFuture<ListImagesPage> futurePage =
          ListImagesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListImagesPage, ListImagesPagedResponse>() {
            @Override
            public ListImagesPagedResponse apply(ListImagesPage input) {
              return new ListImagesPagedResponse(input);
            }
          });
    }

    private ListImagesPagedResponse(ListImagesPage page) {
      super(page, ListImagesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListImagesPage extends AbstractPage<
      ListImagesHttpRequest,
      ImageList,
      Image,
      ListImagesPage> {

    private ListImagesPage(
        PageContext<ListImagesHttpRequest, ImageList, Image> context,
        ImageList response) {
      super(context, response);
    }

    private static ListImagesPage createEmptyPage() {
      return new ListImagesPage(null, null);
    }

    @Override
    protected ListImagesPage createPage(
        PageContext<ListImagesHttpRequest, ImageList, Image> context,
        ImageList response) {
      return new ListImagesPage(context, response);
    }

    @Override
    public ApiFuture<ListImagesPage> createPageAsync(
        PageContext<ListImagesHttpRequest, ImageList, Image> context,
        ApiFuture<ImageList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListImagesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListImagesHttpRequest,
      ImageList,
      Image,
      ListImagesPage,
      ListImagesFixedSizeCollection> {

    private ListImagesFixedSizeCollection(List<ListImagesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListImagesFixedSizeCollection createEmptyCollection() {
      return new ListImagesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListImagesFixedSizeCollection createCollection(
        List<ListImagesPage> pages, int collectionSize) {
      return new ListImagesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListInstanceGroupManagersPagedResponse extends AbstractPagedListResponse<
      AggregatedListInstanceGroupManagersHttpRequest,
      InstanceGroupManagerAggregatedList,
      InstanceGroupManager,
      AggregatedListInstanceGroupManagersPage,
      AggregatedListInstanceGroupManagersFixedSizeCollection> {

    public static ApiFuture<AggregatedListInstanceGroupManagersPagedResponse> createAsync(
        PageContext<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager> context,
        ApiFuture<InstanceGroupManagerAggregatedList> futureResponse) {
      ApiFuture<AggregatedListInstanceGroupManagersPage> futurePage =
          AggregatedListInstanceGroupManagersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListInstanceGroupManagersPage, AggregatedListInstanceGroupManagersPagedResponse>() {
            @Override
            public AggregatedListInstanceGroupManagersPagedResponse apply(AggregatedListInstanceGroupManagersPage input) {
              return new AggregatedListInstanceGroupManagersPagedResponse(input);
            }
          });
    }

    private AggregatedListInstanceGroupManagersPagedResponse(AggregatedListInstanceGroupManagersPage page) {
      super(page, AggregatedListInstanceGroupManagersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListInstanceGroupManagersPage extends AbstractPage<
      AggregatedListInstanceGroupManagersHttpRequest,
      InstanceGroupManagerAggregatedList,
      InstanceGroupManager,
      AggregatedListInstanceGroupManagersPage> {

    private AggregatedListInstanceGroupManagersPage(
        PageContext<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager> context,
        InstanceGroupManagerAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListInstanceGroupManagersPage createEmptyPage() {
      return new AggregatedListInstanceGroupManagersPage(null, null);
    }

    @Override
    protected AggregatedListInstanceGroupManagersPage createPage(
        PageContext<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager> context,
        InstanceGroupManagerAggregatedList response) {
      return new AggregatedListInstanceGroupManagersPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListInstanceGroupManagersPage> createPageAsync(
        PageContext<AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList, InstanceGroupManager> context,
        ApiFuture<InstanceGroupManagerAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListInstanceGroupManagersFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListInstanceGroupManagersHttpRequest,
      InstanceGroupManagerAggregatedList,
      InstanceGroupManager,
      AggregatedListInstanceGroupManagersPage,
      AggregatedListInstanceGroupManagersFixedSizeCollection> {

    private AggregatedListInstanceGroupManagersFixedSizeCollection(List<AggregatedListInstanceGroupManagersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListInstanceGroupManagersFixedSizeCollection createEmptyCollection() {
      return new AggregatedListInstanceGroupManagersFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListInstanceGroupManagersFixedSizeCollection createCollection(
        List<AggregatedListInstanceGroupManagersPage> pages, int collectionSize) {
      return new AggregatedListInstanceGroupManagersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListInstanceGroupManagersPagedResponse extends AbstractPagedListResponse<
      ListInstanceGroupManagersHttpRequest,
      InstanceGroupManagerList,
      InstanceGroupManager,
      ListInstanceGroupManagersPage,
      ListInstanceGroupManagersFixedSizeCollection> {

    public static ApiFuture<ListInstanceGroupManagersPagedResponse> createAsync(
        PageContext<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager> context,
        ApiFuture<InstanceGroupManagerList> futureResponse) {
      ApiFuture<ListInstanceGroupManagersPage> futurePage =
          ListInstanceGroupManagersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstanceGroupManagersPage, ListInstanceGroupManagersPagedResponse>() {
            @Override
            public ListInstanceGroupManagersPagedResponse apply(ListInstanceGroupManagersPage input) {
              return new ListInstanceGroupManagersPagedResponse(input);
            }
          });
    }

    private ListInstanceGroupManagersPagedResponse(ListInstanceGroupManagersPage page) {
      super(page, ListInstanceGroupManagersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListInstanceGroupManagersPage extends AbstractPage<
      ListInstanceGroupManagersHttpRequest,
      InstanceGroupManagerList,
      InstanceGroupManager,
      ListInstanceGroupManagersPage> {

    private ListInstanceGroupManagersPage(
        PageContext<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager> context,
        InstanceGroupManagerList response) {
      super(context, response);
    }

    private static ListInstanceGroupManagersPage createEmptyPage() {
      return new ListInstanceGroupManagersPage(null, null);
    }

    @Override
    protected ListInstanceGroupManagersPage createPage(
        PageContext<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager> context,
        InstanceGroupManagerList response) {
      return new ListInstanceGroupManagersPage(context, response);
    }

    @Override
    public ApiFuture<ListInstanceGroupManagersPage> createPageAsync(
        PageContext<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager> context,
        ApiFuture<InstanceGroupManagerList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListInstanceGroupManagersFixedSizeCollection extends AbstractFixedSizeCollection<
      ListInstanceGroupManagersHttpRequest,
      InstanceGroupManagerList,
      InstanceGroupManager,
      ListInstanceGroupManagersPage,
      ListInstanceGroupManagersFixedSizeCollection> {

    private ListInstanceGroupManagersFixedSizeCollection(List<ListInstanceGroupManagersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstanceGroupManagersFixedSizeCollection createEmptyCollection() {
      return new ListInstanceGroupManagersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstanceGroupManagersFixedSizeCollection createCollection(
        List<ListInstanceGroupManagersPage> pages, int collectionSize) {
      return new ListInstanceGroupManagersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListInstanceGroupsPagedResponse extends AbstractPagedListResponse<
      AggregatedListInstanceGroupsHttpRequest,
      InstanceGroupAggregatedList,
      InstanceGroup,
      AggregatedListInstanceGroupsPage,
      AggregatedListInstanceGroupsFixedSizeCollection> {

    public static ApiFuture<AggregatedListInstanceGroupsPagedResponse> createAsync(
        PageContext<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList, InstanceGroup> context,
        ApiFuture<InstanceGroupAggregatedList> futureResponse) {
      ApiFuture<AggregatedListInstanceGroupsPage> futurePage =
          AggregatedListInstanceGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListInstanceGroupsPage, AggregatedListInstanceGroupsPagedResponse>() {
            @Override
            public AggregatedListInstanceGroupsPagedResponse apply(AggregatedListInstanceGroupsPage input) {
              return new AggregatedListInstanceGroupsPagedResponse(input);
            }
          });
    }

    private AggregatedListInstanceGroupsPagedResponse(AggregatedListInstanceGroupsPage page) {
      super(page, AggregatedListInstanceGroupsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListInstanceGroupsPage extends AbstractPage<
      AggregatedListInstanceGroupsHttpRequest,
      InstanceGroupAggregatedList,
      InstanceGroup,
      AggregatedListInstanceGroupsPage> {

    private AggregatedListInstanceGroupsPage(
        PageContext<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList, InstanceGroup> context,
        InstanceGroupAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListInstanceGroupsPage createEmptyPage() {
      return new AggregatedListInstanceGroupsPage(null, null);
    }

    @Override
    protected AggregatedListInstanceGroupsPage createPage(
        PageContext<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList, InstanceGroup> context,
        InstanceGroupAggregatedList response) {
      return new AggregatedListInstanceGroupsPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListInstanceGroupsPage> createPageAsync(
        PageContext<AggregatedListInstanceGroupsHttpRequest, InstanceGroupAggregatedList, InstanceGroup> context,
        ApiFuture<InstanceGroupAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListInstanceGroupsFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListInstanceGroupsHttpRequest,
      InstanceGroupAggregatedList,
      InstanceGroup,
      AggregatedListInstanceGroupsPage,
      AggregatedListInstanceGroupsFixedSizeCollection> {

    private AggregatedListInstanceGroupsFixedSizeCollection(List<AggregatedListInstanceGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListInstanceGroupsFixedSizeCollection createEmptyCollection() {
      return new AggregatedListInstanceGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListInstanceGroupsFixedSizeCollection createCollection(
        List<AggregatedListInstanceGroupsPage> pages, int collectionSize) {
      return new AggregatedListInstanceGroupsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListInstanceGroupsPagedResponse extends AbstractPagedListResponse<
      ListInstanceGroupsHttpRequest,
      InstanceGroupList,
      InstanceGroup,
      ListInstanceGroupsPage,
      ListInstanceGroupsFixedSizeCollection> {

    public static ApiFuture<ListInstanceGroupsPagedResponse> createAsync(
        PageContext<ListInstanceGroupsHttpRequest, InstanceGroupList, InstanceGroup> context,
        ApiFuture<InstanceGroupList> futureResponse) {
      ApiFuture<ListInstanceGroupsPage> futurePage =
          ListInstanceGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstanceGroupsPage, ListInstanceGroupsPagedResponse>() {
            @Override
            public ListInstanceGroupsPagedResponse apply(ListInstanceGroupsPage input) {
              return new ListInstanceGroupsPagedResponse(input);
            }
          });
    }

    private ListInstanceGroupsPagedResponse(ListInstanceGroupsPage page) {
      super(page, ListInstanceGroupsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListInstanceGroupsPage extends AbstractPage<
      ListInstanceGroupsHttpRequest,
      InstanceGroupList,
      InstanceGroup,
      ListInstanceGroupsPage> {

    private ListInstanceGroupsPage(
        PageContext<ListInstanceGroupsHttpRequest, InstanceGroupList, InstanceGroup> context,
        InstanceGroupList response) {
      super(context, response);
    }

    private static ListInstanceGroupsPage createEmptyPage() {
      return new ListInstanceGroupsPage(null, null);
    }

    @Override
    protected ListInstanceGroupsPage createPage(
        PageContext<ListInstanceGroupsHttpRequest, InstanceGroupList, InstanceGroup> context,
        InstanceGroupList response) {
      return new ListInstanceGroupsPage(context, response);
    }

    @Override
    public ApiFuture<ListInstanceGroupsPage> createPageAsync(
        PageContext<ListInstanceGroupsHttpRequest, InstanceGroupList, InstanceGroup> context,
        ApiFuture<InstanceGroupList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListInstanceGroupsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListInstanceGroupsHttpRequest,
      InstanceGroupList,
      InstanceGroup,
      ListInstanceGroupsPage,
      ListInstanceGroupsFixedSizeCollection> {

    private ListInstanceGroupsFixedSizeCollection(List<ListInstanceGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstanceGroupsFixedSizeCollection createEmptyCollection() {
      return new ListInstanceGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstanceGroupsFixedSizeCollection createCollection(
        List<ListInstanceGroupsPage> pages, int collectionSize) {
      return new ListInstanceGroupsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListInstancesInstanceGroupsPagedResponse extends AbstractPagedListResponse<
      ListInstancesInstanceGroupsHttpRequest,
      InstanceGroupsListInstances,
      InstanceWithNamedPorts,
      ListInstancesInstanceGroupsPage,
      ListInstancesInstanceGroupsFixedSizeCollection> {

    public static ApiFuture<ListInstancesInstanceGroupsPagedResponse> createAsync(
        PageContext<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances, InstanceWithNamedPorts> context,
        ApiFuture<InstanceGroupsListInstances> futureResponse) {
      ApiFuture<ListInstancesInstanceGroupsPage> futurePage =
          ListInstancesInstanceGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstancesInstanceGroupsPage, ListInstancesInstanceGroupsPagedResponse>() {
            @Override
            public ListInstancesInstanceGroupsPagedResponse apply(ListInstancesInstanceGroupsPage input) {
              return new ListInstancesInstanceGroupsPagedResponse(input);
            }
          });
    }

    private ListInstancesInstanceGroupsPagedResponse(ListInstancesInstanceGroupsPage page) {
      super(page, ListInstancesInstanceGroupsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListInstancesInstanceGroupsPage extends AbstractPage<
      ListInstancesInstanceGroupsHttpRequest,
      InstanceGroupsListInstances,
      InstanceWithNamedPorts,
      ListInstancesInstanceGroupsPage> {

    private ListInstancesInstanceGroupsPage(
        PageContext<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances, InstanceWithNamedPorts> context,
        InstanceGroupsListInstances response) {
      super(context, response);
    }

    private static ListInstancesInstanceGroupsPage createEmptyPage() {
      return new ListInstancesInstanceGroupsPage(null, null);
    }

    @Override
    protected ListInstancesInstanceGroupsPage createPage(
        PageContext<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances, InstanceWithNamedPorts> context,
        InstanceGroupsListInstances response) {
      return new ListInstancesInstanceGroupsPage(context, response);
    }

    @Override
    public ApiFuture<ListInstancesInstanceGroupsPage> createPageAsync(
        PageContext<ListInstancesInstanceGroupsHttpRequest, InstanceGroupsListInstances, InstanceWithNamedPorts> context,
        ApiFuture<InstanceGroupsListInstances> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListInstancesInstanceGroupsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListInstancesInstanceGroupsHttpRequest,
      InstanceGroupsListInstances,
      InstanceWithNamedPorts,
      ListInstancesInstanceGroupsPage,
      ListInstancesInstanceGroupsFixedSizeCollection> {

    private ListInstancesInstanceGroupsFixedSizeCollection(List<ListInstancesInstanceGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstancesInstanceGroupsFixedSizeCollection createEmptyCollection() {
      return new ListInstancesInstanceGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstancesInstanceGroupsFixedSizeCollection createCollection(
        List<ListInstancesInstanceGroupsPage> pages, int collectionSize) {
      return new ListInstancesInstanceGroupsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListInstanceTemplatesPagedResponse extends AbstractPagedListResponse<
      ListInstanceTemplatesHttpRequest,
      InstanceTemplateList,
      InstanceTemplate,
      ListInstanceTemplatesPage,
      ListInstanceTemplatesFixedSizeCollection> {

    public static ApiFuture<ListInstanceTemplatesPagedResponse> createAsync(
        PageContext<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate> context,
        ApiFuture<InstanceTemplateList> futureResponse) {
      ApiFuture<ListInstanceTemplatesPage> futurePage =
          ListInstanceTemplatesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstanceTemplatesPage, ListInstanceTemplatesPagedResponse>() {
            @Override
            public ListInstanceTemplatesPagedResponse apply(ListInstanceTemplatesPage input) {
              return new ListInstanceTemplatesPagedResponse(input);
            }
          });
    }

    private ListInstanceTemplatesPagedResponse(ListInstanceTemplatesPage page) {
      super(page, ListInstanceTemplatesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListInstanceTemplatesPage extends AbstractPage<
      ListInstanceTemplatesHttpRequest,
      InstanceTemplateList,
      InstanceTemplate,
      ListInstanceTemplatesPage> {

    private ListInstanceTemplatesPage(
        PageContext<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate> context,
        InstanceTemplateList response) {
      super(context, response);
    }

    private static ListInstanceTemplatesPage createEmptyPage() {
      return new ListInstanceTemplatesPage(null, null);
    }

    @Override
    protected ListInstanceTemplatesPage createPage(
        PageContext<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate> context,
        InstanceTemplateList response) {
      return new ListInstanceTemplatesPage(context, response);
    }

    @Override
    public ApiFuture<ListInstanceTemplatesPage> createPageAsync(
        PageContext<ListInstanceTemplatesHttpRequest, InstanceTemplateList, InstanceTemplate> context,
        ApiFuture<InstanceTemplateList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListInstanceTemplatesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListInstanceTemplatesHttpRequest,
      InstanceTemplateList,
      InstanceTemplate,
      ListInstanceTemplatesPage,
      ListInstanceTemplatesFixedSizeCollection> {

    private ListInstanceTemplatesFixedSizeCollection(List<ListInstanceTemplatesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstanceTemplatesFixedSizeCollection createEmptyCollection() {
      return new ListInstanceTemplatesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstanceTemplatesFixedSizeCollection createCollection(
        List<ListInstanceTemplatesPage> pages, int collectionSize) {
      return new ListInstanceTemplatesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListInstancesPagedResponse extends AbstractPagedListResponse<
      AggregatedListInstancesHttpRequest,
      InstanceAggregatedList,
      Instance,
      AggregatedListInstancesPage,
      AggregatedListInstancesFixedSizeCollection> {

    public static ApiFuture<AggregatedListInstancesPagedResponse> createAsync(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance> context,
        ApiFuture<InstanceAggregatedList> futureResponse) {
      ApiFuture<AggregatedListInstancesPage> futurePage =
          AggregatedListInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListInstancesPage, AggregatedListInstancesPagedResponse>() {
            @Override
            public AggregatedListInstancesPagedResponse apply(AggregatedListInstancesPage input) {
              return new AggregatedListInstancesPagedResponse(input);
            }
          });
    }

    private AggregatedListInstancesPagedResponse(AggregatedListInstancesPage page) {
      super(page, AggregatedListInstancesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListInstancesPage extends AbstractPage<
      AggregatedListInstancesHttpRequest,
      InstanceAggregatedList,
      Instance,
      AggregatedListInstancesPage> {

    private AggregatedListInstancesPage(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance> context,
        InstanceAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListInstancesPage createEmptyPage() {
      return new AggregatedListInstancesPage(null, null);
    }

    @Override
    protected AggregatedListInstancesPage createPage(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance> context,
        InstanceAggregatedList response) {
      return new AggregatedListInstancesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListInstancesPage> createPageAsync(
        PageContext<AggregatedListInstancesHttpRequest, InstanceAggregatedList, Instance> context,
        ApiFuture<InstanceAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListInstancesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListInstancesHttpRequest,
      InstanceAggregatedList,
      Instance,
      AggregatedListInstancesPage,
      AggregatedListInstancesFixedSizeCollection> {

    private AggregatedListInstancesFixedSizeCollection(List<AggregatedListInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListInstancesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListInstancesFixedSizeCollection createCollection(
        List<AggregatedListInstancesPage> pages, int collectionSize) {
      return new AggregatedListInstancesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListInstancesPagedResponse extends AbstractPagedListResponse<
      ListInstancesHttpRequest,
      InstanceList,
      Instance,
      ListInstancesPage,
      ListInstancesFixedSizeCollection> {

    public static ApiFuture<ListInstancesPagedResponse> createAsync(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        ApiFuture<InstanceList> futureResponse) {
      ApiFuture<ListInstancesPage> futurePage =
          ListInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstancesPage, ListInstancesPagedResponse>() {
            @Override
            public ListInstancesPagedResponse apply(ListInstancesPage input) {
              return new ListInstancesPagedResponse(input);
            }
          });
    }

    private ListInstancesPagedResponse(ListInstancesPage page) {
      super(page, ListInstancesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListInstancesPage extends AbstractPage<
      ListInstancesHttpRequest,
      InstanceList,
      Instance,
      ListInstancesPage> {

    private ListInstancesPage(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        InstanceList response) {
      super(context, response);
    }

    private static ListInstancesPage createEmptyPage() {
      return new ListInstancesPage(null, null);
    }

    @Override
    protected ListInstancesPage createPage(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        InstanceList response) {
      return new ListInstancesPage(context, response);
    }

    @Override
    public ApiFuture<ListInstancesPage> createPageAsync(
        PageContext<ListInstancesHttpRequest, InstanceList, Instance> context,
        ApiFuture<InstanceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListInstancesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListInstancesHttpRequest,
      InstanceList,
      Instance,
      ListInstancesPage,
      ListInstancesFixedSizeCollection> {

    private ListInstancesFixedSizeCollection(List<ListInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstancesFixedSizeCollection createEmptyCollection() {
      return new ListInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstancesFixedSizeCollection createCollection(
        List<ListInstancesPage> pages, int collectionSize) {
      return new ListInstancesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListMachineTypesPagedResponse extends AbstractPagedListResponse<
      AggregatedListMachineTypesHttpRequest,
      MachineTypeAggregatedList,
      MachineType,
      AggregatedListMachineTypesPage,
      AggregatedListMachineTypesFixedSizeCollection> {

    public static ApiFuture<AggregatedListMachineTypesPagedResponse> createAsync(
        PageContext<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList, MachineType> context,
        ApiFuture<MachineTypeAggregatedList> futureResponse) {
      ApiFuture<AggregatedListMachineTypesPage> futurePage =
          AggregatedListMachineTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListMachineTypesPage, AggregatedListMachineTypesPagedResponse>() {
            @Override
            public AggregatedListMachineTypesPagedResponse apply(AggregatedListMachineTypesPage input) {
              return new AggregatedListMachineTypesPagedResponse(input);
            }
          });
    }

    private AggregatedListMachineTypesPagedResponse(AggregatedListMachineTypesPage page) {
      super(page, AggregatedListMachineTypesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListMachineTypesPage extends AbstractPage<
      AggregatedListMachineTypesHttpRequest,
      MachineTypeAggregatedList,
      MachineType,
      AggregatedListMachineTypesPage> {

    private AggregatedListMachineTypesPage(
        PageContext<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList, MachineType> context,
        MachineTypeAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListMachineTypesPage createEmptyPage() {
      return new AggregatedListMachineTypesPage(null, null);
    }

    @Override
    protected AggregatedListMachineTypesPage createPage(
        PageContext<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList, MachineType> context,
        MachineTypeAggregatedList response) {
      return new AggregatedListMachineTypesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListMachineTypesPage> createPageAsync(
        PageContext<AggregatedListMachineTypesHttpRequest, MachineTypeAggregatedList, MachineType> context,
        ApiFuture<MachineTypeAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListMachineTypesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListMachineTypesHttpRequest,
      MachineTypeAggregatedList,
      MachineType,
      AggregatedListMachineTypesPage,
      AggregatedListMachineTypesFixedSizeCollection> {

    private AggregatedListMachineTypesFixedSizeCollection(List<AggregatedListMachineTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListMachineTypesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListMachineTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListMachineTypesFixedSizeCollection createCollection(
        List<AggregatedListMachineTypesPage> pages, int collectionSize) {
      return new AggregatedListMachineTypesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListMachineTypesPagedResponse extends AbstractPagedListResponse<
      ListMachineTypesHttpRequest,
      MachineTypeList,
      MachineType,
      ListMachineTypesPage,
      ListMachineTypesFixedSizeCollection> {

    public static ApiFuture<ListMachineTypesPagedResponse> createAsync(
        PageContext<ListMachineTypesHttpRequest, MachineTypeList, MachineType> context,
        ApiFuture<MachineTypeList> futureResponse) {
      ApiFuture<ListMachineTypesPage> futurePage =
          ListMachineTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListMachineTypesPage, ListMachineTypesPagedResponse>() {
            @Override
            public ListMachineTypesPagedResponse apply(ListMachineTypesPage input) {
              return new ListMachineTypesPagedResponse(input);
            }
          });
    }

    private ListMachineTypesPagedResponse(ListMachineTypesPage page) {
      super(page, ListMachineTypesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListMachineTypesPage extends AbstractPage<
      ListMachineTypesHttpRequest,
      MachineTypeList,
      MachineType,
      ListMachineTypesPage> {

    private ListMachineTypesPage(
        PageContext<ListMachineTypesHttpRequest, MachineTypeList, MachineType> context,
        MachineTypeList response) {
      super(context, response);
    }

    private static ListMachineTypesPage createEmptyPage() {
      return new ListMachineTypesPage(null, null);
    }

    @Override
    protected ListMachineTypesPage createPage(
        PageContext<ListMachineTypesHttpRequest, MachineTypeList, MachineType> context,
        MachineTypeList response) {
      return new ListMachineTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListMachineTypesPage> createPageAsync(
        PageContext<ListMachineTypesHttpRequest, MachineTypeList, MachineType> context,
        ApiFuture<MachineTypeList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListMachineTypesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListMachineTypesHttpRequest,
      MachineTypeList,
      MachineType,
      ListMachineTypesPage,
      ListMachineTypesFixedSizeCollection> {

    private ListMachineTypesFixedSizeCollection(List<ListMachineTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMachineTypesFixedSizeCollection createEmptyCollection() {
      return new ListMachineTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMachineTypesFixedSizeCollection createCollection(
        List<ListMachineTypesPage> pages, int collectionSize) {
      return new ListMachineTypesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListNetworksPagedResponse extends AbstractPagedListResponse<
      ListNetworksHttpRequest,
      NetworkList,
      Network,
      ListNetworksPage,
      ListNetworksFixedSizeCollection> {

    public static ApiFuture<ListNetworksPagedResponse> createAsync(
        PageContext<ListNetworksHttpRequest, NetworkList, Network> context,
        ApiFuture<NetworkList> futureResponse) {
      ApiFuture<ListNetworksPage> futurePage =
          ListNetworksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListNetworksPage, ListNetworksPagedResponse>() {
            @Override
            public ListNetworksPagedResponse apply(ListNetworksPage input) {
              return new ListNetworksPagedResponse(input);
            }
          });
    }

    private ListNetworksPagedResponse(ListNetworksPage page) {
      super(page, ListNetworksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListNetworksPage extends AbstractPage<
      ListNetworksHttpRequest,
      NetworkList,
      Network,
      ListNetworksPage> {

    private ListNetworksPage(
        PageContext<ListNetworksHttpRequest, NetworkList, Network> context,
        NetworkList response) {
      super(context, response);
    }

    private static ListNetworksPage createEmptyPage() {
      return new ListNetworksPage(null, null);
    }

    @Override
    protected ListNetworksPage createPage(
        PageContext<ListNetworksHttpRequest, NetworkList, Network> context,
        NetworkList response) {
      return new ListNetworksPage(context, response);
    }

    @Override
    public ApiFuture<ListNetworksPage> createPageAsync(
        PageContext<ListNetworksHttpRequest, NetworkList, Network> context,
        ApiFuture<NetworkList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListNetworksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListNetworksHttpRequest,
      NetworkList,
      Network,
      ListNetworksPage,
      ListNetworksFixedSizeCollection> {

    private ListNetworksFixedSizeCollection(List<ListNetworksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNetworksFixedSizeCollection createEmptyCollection() {
      return new ListNetworksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNetworksFixedSizeCollection createCollection(
        List<ListNetworksPage> pages, int collectionSize) {
      return new ListNetworksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRegionAutoscalersPagedResponse extends AbstractPagedListResponse<
      ListRegionAutoscalersHttpRequest,
      RegionAutoscalerList,
      Autoscaler,
      ListRegionAutoscalersPage,
      ListRegionAutoscalersFixedSizeCollection> {

    public static ApiFuture<ListRegionAutoscalersPagedResponse> createAsync(
        PageContext<ListRegionAutoscalersHttpRequest, RegionAutoscalerList, Autoscaler> context,
        ApiFuture<RegionAutoscalerList> futureResponse) {
      ApiFuture<ListRegionAutoscalersPage> futurePage =
          ListRegionAutoscalersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionAutoscalersPage, ListRegionAutoscalersPagedResponse>() {
            @Override
            public ListRegionAutoscalersPagedResponse apply(ListRegionAutoscalersPage input) {
              return new ListRegionAutoscalersPagedResponse(input);
            }
          });
    }

    private ListRegionAutoscalersPagedResponse(ListRegionAutoscalersPage page) {
      super(page, ListRegionAutoscalersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRegionAutoscalersPage extends AbstractPage<
      ListRegionAutoscalersHttpRequest,
      RegionAutoscalerList,
      Autoscaler,
      ListRegionAutoscalersPage> {

    private ListRegionAutoscalersPage(
        PageContext<ListRegionAutoscalersHttpRequest, RegionAutoscalerList, Autoscaler> context,
        RegionAutoscalerList response) {
      super(context, response);
    }

    private static ListRegionAutoscalersPage createEmptyPage() {
      return new ListRegionAutoscalersPage(null, null);
    }

    @Override
    protected ListRegionAutoscalersPage createPage(
        PageContext<ListRegionAutoscalersHttpRequest, RegionAutoscalerList, Autoscaler> context,
        RegionAutoscalerList response) {
      return new ListRegionAutoscalersPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionAutoscalersPage> createPageAsync(
        PageContext<ListRegionAutoscalersHttpRequest, RegionAutoscalerList, Autoscaler> context,
        ApiFuture<RegionAutoscalerList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRegionAutoscalersFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRegionAutoscalersHttpRequest,
      RegionAutoscalerList,
      Autoscaler,
      ListRegionAutoscalersPage,
      ListRegionAutoscalersFixedSizeCollection> {

    private ListRegionAutoscalersFixedSizeCollection(List<ListRegionAutoscalersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionAutoscalersFixedSizeCollection createEmptyCollection() {
      return new ListRegionAutoscalersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionAutoscalersFixedSizeCollection createCollection(
        List<ListRegionAutoscalersPage> pages, int collectionSize) {
      return new ListRegionAutoscalersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRegionBackendServicesPagedResponse extends AbstractPagedListResponse<
      ListRegionBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListRegionBackendServicesPage,
      ListRegionBackendServicesFixedSizeCollection> {

    public static ApiFuture<ListRegionBackendServicesPagedResponse> createAsync(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        ApiFuture<BackendServiceList> futureResponse) {
      ApiFuture<ListRegionBackendServicesPage> futurePage =
          ListRegionBackendServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionBackendServicesPage, ListRegionBackendServicesPagedResponse>() {
            @Override
            public ListRegionBackendServicesPagedResponse apply(ListRegionBackendServicesPage input) {
              return new ListRegionBackendServicesPagedResponse(input);
            }
          });
    }

    private ListRegionBackendServicesPagedResponse(ListRegionBackendServicesPage page) {
      super(page, ListRegionBackendServicesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRegionBackendServicesPage extends AbstractPage<
      ListRegionBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListRegionBackendServicesPage> {

    private ListRegionBackendServicesPage(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        BackendServiceList response) {
      super(context, response);
    }

    private static ListRegionBackendServicesPage createEmptyPage() {
      return new ListRegionBackendServicesPage(null, null);
    }

    @Override
    protected ListRegionBackendServicesPage createPage(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        BackendServiceList response) {
      return new ListRegionBackendServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionBackendServicesPage> createPageAsync(
        PageContext<ListRegionBackendServicesHttpRequest, BackendServiceList, BackendService> context,
        ApiFuture<BackendServiceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRegionBackendServicesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRegionBackendServicesHttpRequest,
      BackendServiceList,
      BackendService,
      ListRegionBackendServicesPage,
      ListRegionBackendServicesFixedSizeCollection> {

    private ListRegionBackendServicesFixedSizeCollection(List<ListRegionBackendServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionBackendServicesFixedSizeCollection createEmptyCollection() {
      return new ListRegionBackendServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionBackendServicesFixedSizeCollection createCollection(
        List<ListRegionBackendServicesPage> pages, int collectionSize) {
      return new ListRegionBackendServicesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRegionInstanceGroupManagersPagedResponse extends AbstractPagedListResponse<
      ListRegionInstanceGroupManagersHttpRequest,
      RegionInstanceGroupManagerList,
      InstanceGroupManager,
      ListRegionInstanceGroupManagersPage,
      ListRegionInstanceGroupManagersFixedSizeCollection> {

    public static ApiFuture<ListRegionInstanceGroupManagersPagedResponse> createAsync(
        PageContext<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager> context,
        ApiFuture<RegionInstanceGroupManagerList> futureResponse) {
      ApiFuture<ListRegionInstanceGroupManagersPage> futurePage =
          ListRegionInstanceGroupManagersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionInstanceGroupManagersPage, ListRegionInstanceGroupManagersPagedResponse>() {
            @Override
            public ListRegionInstanceGroupManagersPagedResponse apply(ListRegionInstanceGroupManagersPage input) {
              return new ListRegionInstanceGroupManagersPagedResponse(input);
            }
          });
    }

    private ListRegionInstanceGroupManagersPagedResponse(ListRegionInstanceGroupManagersPage page) {
      super(page, ListRegionInstanceGroupManagersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRegionInstanceGroupManagersPage extends AbstractPage<
      ListRegionInstanceGroupManagersHttpRequest,
      RegionInstanceGroupManagerList,
      InstanceGroupManager,
      ListRegionInstanceGroupManagersPage> {

    private ListRegionInstanceGroupManagersPage(
        PageContext<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager> context,
        RegionInstanceGroupManagerList response) {
      super(context, response);
    }

    private static ListRegionInstanceGroupManagersPage createEmptyPage() {
      return new ListRegionInstanceGroupManagersPage(null, null);
    }

    @Override
    protected ListRegionInstanceGroupManagersPage createPage(
        PageContext<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager> context,
        RegionInstanceGroupManagerList response) {
      return new ListRegionInstanceGroupManagersPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionInstanceGroupManagersPage> createPageAsync(
        PageContext<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList, InstanceGroupManager> context,
        ApiFuture<RegionInstanceGroupManagerList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRegionInstanceGroupManagersFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRegionInstanceGroupManagersHttpRequest,
      RegionInstanceGroupManagerList,
      InstanceGroupManager,
      ListRegionInstanceGroupManagersPage,
      ListRegionInstanceGroupManagersFixedSizeCollection> {

    private ListRegionInstanceGroupManagersFixedSizeCollection(List<ListRegionInstanceGroupManagersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionInstanceGroupManagersFixedSizeCollection createEmptyCollection() {
      return new ListRegionInstanceGroupManagersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionInstanceGroupManagersFixedSizeCollection createCollection(
        List<ListRegionInstanceGroupManagersPage> pages, int collectionSize) {
      return new ListRegionInstanceGroupManagersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRegionInstanceGroupsPagedResponse extends AbstractPagedListResponse<
      ListRegionInstanceGroupsHttpRequest,
      RegionInstanceGroupList,
      InstanceGroup,
      ListRegionInstanceGroupsPage,
      ListRegionInstanceGroupsFixedSizeCollection> {

    public static ApiFuture<ListRegionInstanceGroupsPagedResponse> createAsync(
        PageContext<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList, InstanceGroup> context,
        ApiFuture<RegionInstanceGroupList> futureResponse) {
      ApiFuture<ListRegionInstanceGroupsPage> futurePage =
          ListRegionInstanceGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionInstanceGroupsPage, ListRegionInstanceGroupsPagedResponse>() {
            @Override
            public ListRegionInstanceGroupsPagedResponse apply(ListRegionInstanceGroupsPage input) {
              return new ListRegionInstanceGroupsPagedResponse(input);
            }
          });
    }

    private ListRegionInstanceGroupsPagedResponse(ListRegionInstanceGroupsPage page) {
      super(page, ListRegionInstanceGroupsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRegionInstanceGroupsPage extends AbstractPage<
      ListRegionInstanceGroupsHttpRequest,
      RegionInstanceGroupList,
      InstanceGroup,
      ListRegionInstanceGroupsPage> {

    private ListRegionInstanceGroupsPage(
        PageContext<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList, InstanceGroup> context,
        RegionInstanceGroupList response) {
      super(context, response);
    }

    private static ListRegionInstanceGroupsPage createEmptyPage() {
      return new ListRegionInstanceGroupsPage(null, null);
    }

    @Override
    protected ListRegionInstanceGroupsPage createPage(
        PageContext<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList, InstanceGroup> context,
        RegionInstanceGroupList response) {
      return new ListRegionInstanceGroupsPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionInstanceGroupsPage> createPageAsync(
        PageContext<ListRegionInstanceGroupsHttpRequest, RegionInstanceGroupList, InstanceGroup> context,
        ApiFuture<RegionInstanceGroupList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRegionInstanceGroupsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRegionInstanceGroupsHttpRequest,
      RegionInstanceGroupList,
      InstanceGroup,
      ListRegionInstanceGroupsPage,
      ListRegionInstanceGroupsFixedSizeCollection> {

    private ListRegionInstanceGroupsFixedSizeCollection(List<ListRegionInstanceGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionInstanceGroupsFixedSizeCollection createEmptyCollection() {
      return new ListRegionInstanceGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionInstanceGroupsFixedSizeCollection createCollection(
        List<ListRegionInstanceGroupsPage> pages, int collectionSize) {
      return new ListRegionInstanceGroupsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListInstancesRegionInstanceGroupsPagedResponse extends AbstractPagedListResponse<
      ListInstancesRegionInstanceGroupsHttpRequest,
      RegionInstanceGroupsListInstances,
      InstanceWithNamedPorts,
      ListInstancesRegionInstanceGroupsPage,
      ListInstancesRegionInstanceGroupsFixedSizeCollection> {

    public static ApiFuture<ListInstancesRegionInstanceGroupsPagedResponse> createAsync(
        PageContext<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances, InstanceWithNamedPorts> context,
        ApiFuture<RegionInstanceGroupsListInstances> futureResponse) {
      ApiFuture<ListInstancesRegionInstanceGroupsPage> futurePage =
          ListInstancesRegionInstanceGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstancesRegionInstanceGroupsPage, ListInstancesRegionInstanceGroupsPagedResponse>() {
            @Override
            public ListInstancesRegionInstanceGroupsPagedResponse apply(ListInstancesRegionInstanceGroupsPage input) {
              return new ListInstancesRegionInstanceGroupsPagedResponse(input);
            }
          });
    }

    private ListInstancesRegionInstanceGroupsPagedResponse(ListInstancesRegionInstanceGroupsPage page) {
      super(page, ListInstancesRegionInstanceGroupsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListInstancesRegionInstanceGroupsPage extends AbstractPage<
      ListInstancesRegionInstanceGroupsHttpRequest,
      RegionInstanceGroupsListInstances,
      InstanceWithNamedPorts,
      ListInstancesRegionInstanceGroupsPage> {

    private ListInstancesRegionInstanceGroupsPage(
        PageContext<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances, InstanceWithNamedPorts> context,
        RegionInstanceGroupsListInstances response) {
      super(context, response);
    }

    private static ListInstancesRegionInstanceGroupsPage createEmptyPage() {
      return new ListInstancesRegionInstanceGroupsPage(null, null);
    }

    @Override
    protected ListInstancesRegionInstanceGroupsPage createPage(
        PageContext<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances, InstanceWithNamedPorts> context,
        RegionInstanceGroupsListInstances response) {
      return new ListInstancesRegionInstanceGroupsPage(context, response);
    }

    @Override
    public ApiFuture<ListInstancesRegionInstanceGroupsPage> createPageAsync(
        PageContext<ListInstancesRegionInstanceGroupsHttpRequest, RegionInstanceGroupsListInstances, InstanceWithNamedPorts> context,
        ApiFuture<RegionInstanceGroupsListInstances> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListInstancesRegionInstanceGroupsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListInstancesRegionInstanceGroupsHttpRequest,
      RegionInstanceGroupsListInstances,
      InstanceWithNamedPorts,
      ListInstancesRegionInstanceGroupsPage,
      ListInstancesRegionInstanceGroupsFixedSizeCollection> {

    private ListInstancesRegionInstanceGroupsFixedSizeCollection(List<ListInstancesRegionInstanceGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstancesRegionInstanceGroupsFixedSizeCollection createEmptyCollection() {
      return new ListInstancesRegionInstanceGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstancesRegionInstanceGroupsFixedSizeCollection createCollection(
        List<ListInstancesRegionInstanceGroupsPage> pages, int collectionSize) {
      return new ListInstancesRegionInstanceGroupsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRegionOperationsPagedResponse extends AbstractPagedListResponse<
      ListRegionOperationsHttpRequest,
      OperationList,
      Operation,
      ListRegionOperationsPage,
      ListRegionOperationsFixedSizeCollection> {

    public static ApiFuture<ListRegionOperationsPagedResponse> createAsync(
        PageContext<ListRegionOperationsHttpRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      ApiFuture<ListRegionOperationsPage> futurePage =
          ListRegionOperationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionOperationsPage, ListRegionOperationsPagedResponse>() {
            @Override
            public ListRegionOperationsPagedResponse apply(ListRegionOperationsPage input) {
              return new ListRegionOperationsPagedResponse(input);
            }
          });
    }

    private ListRegionOperationsPagedResponse(ListRegionOperationsPage page) {
      super(page, ListRegionOperationsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRegionOperationsPage extends AbstractPage<
      ListRegionOperationsHttpRequest,
      OperationList,
      Operation,
      ListRegionOperationsPage> {

    private ListRegionOperationsPage(
        PageContext<ListRegionOperationsHttpRequest, OperationList, Operation> context,
        OperationList response) {
      super(context, response);
    }

    private static ListRegionOperationsPage createEmptyPage() {
      return new ListRegionOperationsPage(null, null);
    }

    @Override
    protected ListRegionOperationsPage createPage(
        PageContext<ListRegionOperationsHttpRequest, OperationList, Operation> context,
        OperationList response) {
      return new ListRegionOperationsPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionOperationsPage> createPageAsync(
        PageContext<ListRegionOperationsHttpRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRegionOperationsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRegionOperationsHttpRequest,
      OperationList,
      Operation,
      ListRegionOperationsPage,
      ListRegionOperationsFixedSizeCollection> {

    private ListRegionOperationsFixedSizeCollection(List<ListRegionOperationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionOperationsFixedSizeCollection createEmptyCollection() {
      return new ListRegionOperationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionOperationsFixedSizeCollection createCollection(
        List<ListRegionOperationsPage> pages, int collectionSize) {
      return new ListRegionOperationsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRegionsPagedResponse extends AbstractPagedListResponse<
      ListRegionsHttpRequest,
      RegionList,
      Region,
      ListRegionsPage,
      ListRegionsFixedSizeCollection> {

    public static ApiFuture<ListRegionsPagedResponse> createAsync(
        PageContext<ListRegionsHttpRequest, RegionList, Region> context,
        ApiFuture<RegionList> futureResponse) {
      ApiFuture<ListRegionsPage> futurePage =
          ListRegionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRegionsPage, ListRegionsPagedResponse>() {
            @Override
            public ListRegionsPagedResponse apply(ListRegionsPage input) {
              return new ListRegionsPagedResponse(input);
            }
          });
    }

    private ListRegionsPagedResponse(ListRegionsPage page) {
      super(page, ListRegionsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRegionsPage extends AbstractPage<
      ListRegionsHttpRequest,
      RegionList,
      Region,
      ListRegionsPage> {

    private ListRegionsPage(
        PageContext<ListRegionsHttpRequest, RegionList, Region> context,
        RegionList response) {
      super(context, response);
    }

    private static ListRegionsPage createEmptyPage() {
      return new ListRegionsPage(null, null);
    }

    @Override
    protected ListRegionsPage createPage(
        PageContext<ListRegionsHttpRequest, RegionList, Region> context,
        RegionList response) {
      return new ListRegionsPage(context, response);
    }

    @Override
    public ApiFuture<ListRegionsPage> createPageAsync(
        PageContext<ListRegionsHttpRequest, RegionList, Region> context,
        ApiFuture<RegionList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRegionsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRegionsHttpRequest,
      RegionList,
      Region,
      ListRegionsPage,
      ListRegionsFixedSizeCollection> {

    private ListRegionsFixedSizeCollection(List<ListRegionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRegionsFixedSizeCollection createEmptyCollection() {
      return new ListRegionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRegionsFixedSizeCollection createCollection(
        List<ListRegionsPage> pages, int collectionSize) {
      return new ListRegionsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListRoutersPagedResponse extends AbstractPagedListResponse<
      AggregatedListRoutersHttpRequest,
      RouterAggregatedList,
      Router,
      AggregatedListRoutersPage,
      AggregatedListRoutersFixedSizeCollection> {

    public static ApiFuture<AggregatedListRoutersPagedResponse> createAsync(
        PageContext<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router> context,
        ApiFuture<RouterAggregatedList> futureResponse) {
      ApiFuture<AggregatedListRoutersPage> futurePage =
          AggregatedListRoutersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListRoutersPage, AggregatedListRoutersPagedResponse>() {
            @Override
            public AggregatedListRoutersPagedResponse apply(AggregatedListRoutersPage input) {
              return new AggregatedListRoutersPagedResponse(input);
            }
          });
    }

    private AggregatedListRoutersPagedResponse(AggregatedListRoutersPage page) {
      super(page, AggregatedListRoutersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListRoutersPage extends AbstractPage<
      AggregatedListRoutersHttpRequest,
      RouterAggregatedList,
      Router,
      AggregatedListRoutersPage> {

    private AggregatedListRoutersPage(
        PageContext<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router> context,
        RouterAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListRoutersPage createEmptyPage() {
      return new AggregatedListRoutersPage(null, null);
    }

    @Override
    protected AggregatedListRoutersPage createPage(
        PageContext<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router> context,
        RouterAggregatedList response) {
      return new AggregatedListRoutersPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListRoutersPage> createPageAsync(
        PageContext<AggregatedListRoutersHttpRequest, RouterAggregatedList, Router> context,
        ApiFuture<RouterAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListRoutersFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListRoutersHttpRequest,
      RouterAggregatedList,
      Router,
      AggregatedListRoutersPage,
      AggregatedListRoutersFixedSizeCollection> {

    private AggregatedListRoutersFixedSizeCollection(List<AggregatedListRoutersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListRoutersFixedSizeCollection createEmptyCollection() {
      return new AggregatedListRoutersFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListRoutersFixedSizeCollection createCollection(
        List<AggregatedListRoutersPage> pages, int collectionSize) {
      return new AggregatedListRoutersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRoutersPagedResponse extends AbstractPagedListResponse<
      ListRoutersHttpRequest,
      RouterList,
      Router,
      ListRoutersPage,
      ListRoutersFixedSizeCollection> {

    public static ApiFuture<ListRoutersPagedResponse> createAsync(
        PageContext<ListRoutersHttpRequest, RouterList, Router> context,
        ApiFuture<RouterList> futureResponse) {
      ApiFuture<ListRoutersPage> futurePage =
          ListRoutersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRoutersPage, ListRoutersPagedResponse>() {
            @Override
            public ListRoutersPagedResponse apply(ListRoutersPage input) {
              return new ListRoutersPagedResponse(input);
            }
          });
    }

    private ListRoutersPagedResponse(ListRoutersPage page) {
      super(page, ListRoutersFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRoutersPage extends AbstractPage<
      ListRoutersHttpRequest,
      RouterList,
      Router,
      ListRoutersPage> {

    private ListRoutersPage(
        PageContext<ListRoutersHttpRequest, RouterList, Router> context,
        RouterList response) {
      super(context, response);
    }

    private static ListRoutersPage createEmptyPage() {
      return new ListRoutersPage(null, null);
    }

    @Override
    protected ListRoutersPage createPage(
        PageContext<ListRoutersHttpRequest, RouterList, Router> context,
        RouterList response) {
      return new ListRoutersPage(context, response);
    }

    @Override
    public ApiFuture<ListRoutersPage> createPageAsync(
        PageContext<ListRoutersHttpRequest, RouterList, Router> context,
        ApiFuture<RouterList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRoutersFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRoutersHttpRequest,
      RouterList,
      Router,
      ListRoutersPage,
      ListRoutersFixedSizeCollection> {

    private ListRoutersFixedSizeCollection(List<ListRoutersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRoutersFixedSizeCollection createEmptyCollection() {
      return new ListRoutersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRoutersFixedSizeCollection createCollection(
        List<ListRoutersPage> pages, int collectionSize) {
      return new ListRoutersFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListRoutesPagedResponse extends AbstractPagedListResponse<
      ListRoutesHttpRequest,
      RouteList,
      Route,
      ListRoutesPage,
      ListRoutesFixedSizeCollection> {

    public static ApiFuture<ListRoutesPagedResponse> createAsync(
        PageContext<ListRoutesHttpRequest, RouteList, Route> context,
        ApiFuture<RouteList> futureResponse) {
      ApiFuture<ListRoutesPage> futurePage =
          ListRoutesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRoutesPage, ListRoutesPagedResponse>() {
            @Override
            public ListRoutesPagedResponse apply(ListRoutesPage input) {
              return new ListRoutesPagedResponse(input);
            }
          });
    }

    private ListRoutesPagedResponse(ListRoutesPage page) {
      super(page, ListRoutesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListRoutesPage extends AbstractPage<
      ListRoutesHttpRequest,
      RouteList,
      Route,
      ListRoutesPage> {

    private ListRoutesPage(
        PageContext<ListRoutesHttpRequest, RouteList, Route> context,
        RouteList response) {
      super(context, response);
    }

    private static ListRoutesPage createEmptyPage() {
      return new ListRoutesPage(null, null);
    }

    @Override
    protected ListRoutesPage createPage(
        PageContext<ListRoutesHttpRequest, RouteList, Route> context,
        RouteList response) {
      return new ListRoutesPage(context, response);
    }

    @Override
    public ApiFuture<ListRoutesPage> createPageAsync(
        PageContext<ListRoutesHttpRequest, RouteList, Route> context,
        ApiFuture<RouteList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListRoutesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListRoutesHttpRequest,
      RouteList,
      Route,
      ListRoutesPage,
      ListRoutesFixedSizeCollection> {

    private ListRoutesFixedSizeCollection(List<ListRoutesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRoutesFixedSizeCollection createEmptyCollection() {
      return new ListRoutesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRoutesFixedSizeCollection createCollection(
        List<ListRoutesPage> pages, int collectionSize) {
      return new ListRoutesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListSnapshotsPagedResponse extends AbstractPagedListResponse<
      ListSnapshotsHttpRequest,
      SnapshotList,
      Snapshot,
      ListSnapshotsPage,
      ListSnapshotsFixedSizeCollection> {

    public static ApiFuture<ListSnapshotsPagedResponse> createAsync(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        ApiFuture<SnapshotList> futureResponse) {
      ApiFuture<ListSnapshotsPage> futurePage =
          ListSnapshotsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSnapshotsPage, ListSnapshotsPagedResponse>() {
            @Override
            public ListSnapshotsPagedResponse apply(ListSnapshotsPage input) {
              return new ListSnapshotsPagedResponse(input);
            }
          });
    }

    private ListSnapshotsPagedResponse(ListSnapshotsPage page) {
      super(page, ListSnapshotsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListSnapshotsPage extends AbstractPage<
      ListSnapshotsHttpRequest,
      SnapshotList,
      Snapshot,
      ListSnapshotsPage> {

    private ListSnapshotsPage(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        SnapshotList response) {
      super(context, response);
    }

    private static ListSnapshotsPage createEmptyPage() {
      return new ListSnapshotsPage(null, null);
    }

    @Override
    protected ListSnapshotsPage createPage(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        SnapshotList response) {
      return new ListSnapshotsPage(context, response);
    }

    @Override
    public ApiFuture<ListSnapshotsPage> createPageAsync(
        PageContext<ListSnapshotsHttpRequest, SnapshotList, Snapshot> context,
        ApiFuture<SnapshotList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListSnapshotsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListSnapshotsHttpRequest,
      SnapshotList,
      Snapshot,
      ListSnapshotsPage,
      ListSnapshotsFixedSizeCollection> {

    private ListSnapshotsFixedSizeCollection(List<ListSnapshotsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSnapshotsFixedSizeCollection createEmptyCollection() {
      return new ListSnapshotsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSnapshotsFixedSizeCollection createCollection(
        List<ListSnapshotsPage> pages, int collectionSize) {
      return new ListSnapshotsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListSslCertificatesPagedResponse extends AbstractPagedListResponse<
      ListSslCertificatesHttpRequest,
      SslCertificateList,
      SslCertificate,
      ListSslCertificatesPage,
      ListSslCertificatesFixedSizeCollection> {

    public static ApiFuture<ListSslCertificatesPagedResponse> createAsync(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        ApiFuture<SslCertificateList> futureResponse) {
      ApiFuture<ListSslCertificatesPage> futurePage =
          ListSslCertificatesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSslCertificatesPage, ListSslCertificatesPagedResponse>() {
            @Override
            public ListSslCertificatesPagedResponse apply(ListSslCertificatesPage input) {
              return new ListSslCertificatesPagedResponse(input);
            }
          });
    }

    private ListSslCertificatesPagedResponse(ListSslCertificatesPage page) {
      super(page, ListSslCertificatesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListSslCertificatesPage extends AbstractPage<
      ListSslCertificatesHttpRequest,
      SslCertificateList,
      SslCertificate,
      ListSslCertificatesPage> {

    private ListSslCertificatesPage(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        SslCertificateList response) {
      super(context, response);
    }

    private static ListSslCertificatesPage createEmptyPage() {
      return new ListSslCertificatesPage(null, null);
    }

    @Override
    protected ListSslCertificatesPage createPage(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        SslCertificateList response) {
      return new ListSslCertificatesPage(context, response);
    }

    @Override
    public ApiFuture<ListSslCertificatesPage> createPageAsync(
        PageContext<ListSslCertificatesHttpRequest, SslCertificateList, SslCertificate> context,
        ApiFuture<SslCertificateList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListSslCertificatesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListSslCertificatesHttpRequest,
      SslCertificateList,
      SslCertificate,
      ListSslCertificatesPage,
      ListSslCertificatesFixedSizeCollection> {

    private ListSslCertificatesFixedSizeCollection(List<ListSslCertificatesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSslCertificatesFixedSizeCollection createEmptyCollection() {
      return new ListSslCertificatesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSslCertificatesFixedSizeCollection createCollection(
        List<ListSslCertificatesPage> pages, int collectionSize) {
      return new ListSslCertificatesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListSubnetworksPagedResponse extends AbstractPagedListResponse<
      AggregatedListSubnetworksHttpRequest,
      SubnetworkAggregatedList,
      Subnetwork,
      AggregatedListSubnetworksPage,
      AggregatedListSubnetworksFixedSizeCollection> {

    public static ApiFuture<AggregatedListSubnetworksPagedResponse> createAsync(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        ApiFuture<SubnetworkAggregatedList> futureResponse) {
      ApiFuture<AggregatedListSubnetworksPage> futurePage =
          AggregatedListSubnetworksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListSubnetworksPage, AggregatedListSubnetworksPagedResponse>() {
            @Override
            public AggregatedListSubnetworksPagedResponse apply(AggregatedListSubnetworksPage input) {
              return new AggregatedListSubnetworksPagedResponse(input);
            }
          });
    }

    private AggregatedListSubnetworksPagedResponse(AggregatedListSubnetworksPage page) {
      super(page, AggregatedListSubnetworksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListSubnetworksPage extends AbstractPage<
      AggregatedListSubnetworksHttpRequest,
      SubnetworkAggregatedList,
      Subnetwork,
      AggregatedListSubnetworksPage> {

    private AggregatedListSubnetworksPage(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        SubnetworkAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListSubnetworksPage createEmptyPage() {
      return new AggregatedListSubnetworksPage(null, null);
    }

    @Override
    protected AggregatedListSubnetworksPage createPage(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        SubnetworkAggregatedList response) {
      return new AggregatedListSubnetworksPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListSubnetworksPage> createPageAsync(
        PageContext<AggregatedListSubnetworksHttpRequest, SubnetworkAggregatedList, Subnetwork> context,
        ApiFuture<SubnetworkAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListSubnetworksFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListSubnetworksHttpRequest,
      SubnetworkAggregatedList,
      Subnetwork,
      AggregatedListSubnetworksPage,
      AggregatedListSubnetworksFixedSizeCollection> {

    private AggregatedListSubnetworksFixedSizeCollection(List<AggregatedListSubnetworksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListSubnetworksFixedSizeCollection createEmptyCollection() {
      return new AggregatedListSubnetworksFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListSubnetworksFixedSizeCollection createCollection(
        List<AggregatedListSubnetworksPage> pages, int collectionSize) {
      return new AggregatedListSubnetworksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListSubnetworksPagedResponse extends AbstractPagedListResponse<
      ListSubnetworksHttpRequest,
      SubnetworkList,
      Subnetwork,
      ListSubnetworksPage,
      ListSubnetworksFixedSizeCollection> {

    public static ApiFuture<ListSubnetworksPagedResponse> createAsync(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        ApiFuture<SubnetworkList> futureResponse) {
      ApiFuture<ListSubnetworksPage> futurePage =
          ListSubnetworksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSubnetworksPage, ListSubnetworksPagedResponse>() {
            @Override
            public ListSubnetworksPagedResponse apply(ListSubnetworksPage input) {
              return new ListSubnetworksPagedResponse(input);
            }
          });
    }

    private ListSubnetworksPagedResponse(ListSubnetworksPage page) {
      super(page, ListSubnetworksFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListSubnetworksPage extends AbstractPage<
      ListSubnetworksHttpRequest,
      SubnetworkList,
      Subnetwork,
      ListSubnetworksPage> {

    private ListSubnetworksPage(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        SubnetworkList response) {
      super(context, response);
    }

    private static ListSubnetworksPage createEmptyPage() {
      return new ListSubnetworksPage(null, null);
    }

    @Override
    protected ListSubnetworksPage createPage(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        SubnetworkList response) {
      return new ListSubnetworksPage(context, response);
    }

    @Override
    public ApiFuture<ListSubnetworksPage> createPageAsync(
        PageContext<ListSubnetworksHttpRequest, SubnetworkList, Subnetwork> context,
        ApiFuture<SubnetworkList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListSubnetworksFixedSizeCollection extends AbstractFixedSizeCollection<
      ListSubnetworksHttpRequest,
      SubnetworkList,
      Subnetwork,
      ListSubnetworksPage,
      ListSubnetworksFixedSizeCollection> {

    private ListSubnetworksFixedSizeCollection(List<ListSubnetworksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSubnetworksFixedSizeCollection createEmptyCollection() {
      return new ListSubnetworksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSubnetworksFixedSizeCollection createCollection(
        List<ListSubnetworksPage> pages, int collectionSize) {
      return new ListSubnetworksFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListTargetHttpProxiesPagedResponse extends AbstractPagedListResponse<
      ListTargetHttpProxiesHttpRequest,
      TargetHttpProxyList,
      TargetHttpProxy,
      ListTargetHttpProxiesPage,
      ListTargetHttpProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetHttpProxiesPagedResponse> createAsync(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        ApiFuture<TargetHttpProxyList> futureResponse) {
      ApiFuture<ListTargetHttpProxiesPage> futurePage =
          ListTargetHttpProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetHttpProxiesPage, ListTargetHttpProxiesPagedResponse>() {
            @Override
            public ListTargetHttpProxiesPagedResponse apply(ListTargetHttpProxiesPage input) {
              return new ListTargetHttpProxiesPagedResponse(input);
            }
          });
    }

    private ListTargetHttpProxiesPagedResponse(ListTargetHttpProxiesPage page) {
      super(page, ListTargetHttpProxiesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListTargetHttpProxiesPage extends AbstractPage<
      ListTargetHttpProxiesHttpRequest,
      TargetHttpProxyList,
      TargetHttpProxy,
      ListTargetHttpProxiesPage> {

    private ListTargetHttpProxiesPage(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        TargetHttpProxyList response) {
      super(context, response);
    }

    private static ListTargetHttpProxiesPage createEmptyPage() {
      return new ListTargetHttpProxiesPage(null, null);
    }

    @Override
    protected ListTargetHttpProxiesPage createPage(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        TargetHttpProxyList response) {
      return new ListTargetHttpProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetHttpProxiesPage> createPageAsync(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        ApiFuture<TargetHttpProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListTargetHttpProxiesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListTargetHttpProxiesHttpRequest,
      TargetHttpProxyList,
      TargetHttpProxy,
      ListTargetHttpProxiesPage,
      ListTargetHttpProxiesFixedSizeCollection> {

    private ListTargetHttpProxiesFixedSizeCollection(List<ListTargetHttpProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetHttpProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetHttpProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetHttpProxiesFixedSizeCollection createCollection(
        List<ListTargetHttpProxiesPage> pages, int collectionSize) {
      return new ListTargetHttpProxiesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListTargetHttpsProxiesPagedResponse extends AbstractPagedListResponse<
      ListTargetHttpsProxiesHttpRequest,
      TargetHttpsProxyList,
      TargetHttpsProxy,
      ListTargetHttpsProxiesPage,
      ListTargetHttpsProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetHttpsProxiesPagedResponse> createAsync(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy> context,
        ApiFuture<TargetHttpsProxyList> futureResponse) {
      ApiFuture<ListTargetHttpsProxiesPage> futurePage =
          ListTargetHttpsProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetHttpsProxiesPage, ListTargetHttpsProxiesPagedResponse>() {
            @Override
            public ListTargetHttpsProxiesPagedResponse apply(ListTargetHttpsProxiesPage input) {
              return new ListTargetHttpsProxiesPagedResponse(input);
            }
          });
    }

    private ListTargetHttpsProxiesPagedResponse(ListTargetHttpsProxiesPage page) {
      super(page, ListTargetHttpsProxiesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListTargetHttpsProxiesPage extends AbstractPage<
      ListTargetHttpsProxiesHttpRequest,
      TargetHttpsProxyList,
      TargetHttpsProxy,
      ListTargetHttpsProxiesPage> {

    private ListTargetHttpsProxiesPage(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy> context,
        TargetHttpsProxyList response) {
      super(context, response);
    }

    private static ListTargetHttpsProxiesPage createEmptyPage() {
      return new ListTargetHttpsProxiesPage(null, null);
    }

    @Override
    protected ListTargetHttpsProxiesPage createPage(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy> context,
        TargetHttpsProxyList response) {
      return new ListTargetHttpsProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetHttpsProxiesPage> createPageAsync(
        PageContext<ListTargetHttpsProxiesHttpRequest, TargetHttpsProxyList, TargetHttpsProxy> context,
        ApiFuture<TargetHttpsProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListTargetHttpsProxiesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListTargetHttpsProxiesHttpRequest,
      TargetHttpsProxyList,
      TargetHttpsProxy,
      ListTargetHttpsProxiesPage,
      ListTargetHttpsProxiesFixedSizeCollection> {

    private ListTargetHttpsProxiesFixedSizeCollection(List<ListTargetHttpsProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetHttpsProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetHttpsProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetHttpsProxiesFixedSizeCollection createCollection(
        List<ListTargetHttpsProxiesPage> pages, int collectionSize) {
      return new ListTargetHttpsProxiesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListTargetInstancesPagedResponse extends AbstractPagedListResponse<
      AggregatedListTargetInstancesHttpRequest,
      TargetInstanceAggregatedList,
      TargetInstance,
      AggregatedListTargetInstancesPage,
      AggregatedListTargetInstancesFixedSizeCollection> {

    public static ApiFuture<AggregatedListTargetInstancesPagedResponse> createAsync(
        PageContext<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList, TargetInstance> context,
        ApiFuture<TargetInstanceAggregatedList> futureResponse) {
      ApiFuture<AggregatedListTargetInstancesPage> futurePage =
          AggregatedListTargetInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListTargetInstancesPage, AggregatedListTargetInstancesPagedResponse>() {
            @Override
            public AggregatedListTargetInstancesPagedResponse apply(AggregatedListTargetInstancesPage input) {
              return new AggregatedListTargetInstancesPagedResponse(input);
            }
          });
    }

    private AggregatedListTargetInstancesPagedResponse(AggregatedListTargetInstancesPage page) {
      super(page, AggregatedListTargetInstancesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListTargetInstancesPage extends AbstractPage<
      AggregatedListTargetInstancesHttpRequest,
      TargetInstanceAggregatedList,
      TargetInstance,
      AggregatedListTargetInstancesPage> {

    private AggregatedListTargetInstancesPage(
        PageContext<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList, TargetInstance> context,
        TargetInstanceAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListTargetInstancesPage createEmptyPage() {
      return new AggregatedListTargetInstancesPage(null, null);
    }

    @Override
    protected AggregatedListTargetInstancesPage createPage(
        PageContext<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList, TargetInstance> context,
        TargetInstanceAggregatedList response) {
      return new AggregatedListTargetInstancesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListTargetInstancesPage> createPageAsync(
        PageContext<AggregatedListTargetInstancesHttpRequest, TargetInstanceAggregatedList, TargetInstance> context,
        ApiFuture<TargetInstanceAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListTargetInstancesFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListTargetInstancesHttpRequest,
      TargetInstanceAggregatedList,
      TargetInstance,
      AggregatedListTargetInstancesPage,
      AggregatedListTargetInstancesFixedSizeCollection> {

    private AggregatedListTargetInstancesFixedSizeCollection(List<AggregatedListTargetInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListTargetInstancesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListTargetInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListTargetInstancesFixedSizeCollection createCollection(
        List<AggregatedListTargetInstancesPage> pages, int collectionSize) {
      return new AggregatedListTargetInstancesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListTargetInstancesPagedResponse extends AbstractPagedListResponse<
      ListTargetInstancesHttpRequest,
      TargetInstanceList,
      TargetInstance,
      ListTargetInstancesPage,
      ListTargetInstancesFixedSizeCollection> {

    public static ApiFuture<ListTargetInstancesPagedResponse> createAsync(
        PageContext<ListTargetInstancesHttpRequest, TargetInstanceList, TargetInstance> context,
        ApiFuture<TargetInstanceList> futureResponse) {
      ApiFuture<ListTargetInstancesPage> futurePage =
          ListTargetInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetInstancesPage, ListTargetInstancesPagedResponse>() {
            @Override
            public ListTargetInstancesPagedResponse apply(ListTargetInstancesPage input) {
              return new ListTargetInstancesPagedResponse(input);
            }
          });
    }

    private ListTargetInstancesPagedResponse(ListTargetInstancesPage page) {
      super(page, ListTargetInstancesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListTargetInstancesPage extends AbstractPage<
      ListTargetInstancesHttpRequest,
      TargetInstanceList,
      TargetInstance,
      ListTargetInstancesPage> {

    private ListTargetInstancesPage(
        PageContext<ListTargetInstancesHttpRequest, TargetInstanceList, TargetInstance> context,
        TargetInstanceList response) {
      super(context, response);
    }

    private static ListTargetInstancesPage createEmptyPage() {
      return new ListTargetInstancesPage(null, null);
    }

    @Override
    protected ListTargetInstancesPage createPage(
        PageContext<ListTargetInstancesHttpRequest, TargetInstanceList, TargetInstance> context,
        TargetInstanceList response) {
      return new ListTargetInstancesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetInstancesPage> createPageAsync(
        PageContext<ListTargetInstancesHttpRequest, TargetInstanceList, TargetInstance> context,
        ApiFuture<TargetInstanceList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListTargetInstancesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListTargetInstancesHttpRequest,
      TargetInstanceList,
      TargetInstance,
      ListTargetInstancesPage,
      ListTargetInstancesFixedSizeCollection> {

    private ListTargetInstancesFixedSizeCollection(List<ListTargetInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetInstancesFixedSizeCollection createEmptyCollection() {
      return new ListTargetInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetInstancesFixedSizeCollection createCollection(
        List<ListTargetInstancesPage> pages, int collectionSize) {
      return new ListTargetInstancesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListTargetPoolsPagedResponse extends AbstractPagedListResponse<
      AggregatedListTargetPoolsHttpRequest,
      TargetPoolAggregatedList,
      TargetPool,
      AggregatedListTargetPoolsPage,
      AggregatedListTargetPoolsFixedSizeCollection> {

    public static ApiFuture<AggregatedListTargetPoolsPagedResponse> createAsync(
        PageContext<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool> context,
        ApiFuture<TargetPoolAggregatedList> futureResponse) {
      ApiFuture<AggregatedListTargetPoolsPage> futurePage =
          AggregatedListTargetPoolsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListTargetPoolsPage, AggregatedListTargetPoolsPagedResponse>() {
            @Override
            public AggregatedListTargetPoolsPagedResponse apply(AggregatedListTargetPoolsPage input) {
              return new AggregatedListTargetPoolsPagedResponse(input);
            }
          });
    }

    private AggregatedListTargetPoolsPagedResponse(AggregatedListTargetPoolsPage page) {
      super(page, AggregatedListTargetPoolsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListTargetPoolsPage extends AbstractPage<
      AggregatedListTargetPoolsHttpRequest,
      TargetPoolAggregatedList,
      TargetPool,
      AggregatedListTargetPoolsPage> {

    private AggregatedListTargetPoolsPage(
        PageContext<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool> context,
        TargetPoolAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListTargetPoolsPage createEmptyPage() {
      return new AggregatedListTargetPoolsPage(null, null);
    }

    @Override
    protected AggregatedListTargetPoolsPage createPage(
        PageContext<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool> context,
        TargetPoolAggregatedList response) {
      return new AggregatedListTargetPoolsPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListTargetPoolsPage> createPageAsync(
        PageContext<AggregatedListTargetPoolsHttpRequest, TargetPoolAggregatedList, TargetPool> context,
        ApiFuture<TargetPoolAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListTargetPoolsFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListTargetPoolsHttpRequest,
      TargetPoolAggregatedList,
      TargetPool,
      AggregatedListTargetPoolsPage,
      AggregatedListTargetPoolsFixedSizeCollection> {

    private AggregatedListTargetPoolsFixedSizeCollection(List<AggregatedListTargetPoolsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListTargetPoolsFixedSizeCollection createEmptyCollection() {
      return new AggregatedListTargetPoolsFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListTargetPoolsFixedSizeCollection createCollection(
        List<AggregatedListTargetPoolsPage> pages, int collectionSize) {
      return new AggregatedListTargetPoolsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListTargetPoolsPagedResponse extends AbstractPagedListResponse<
      ListTargetPoolsHttpRequest,
      TargetPoolList,
      TargetPool,
      ListTargetPoolsPage,
      ListTargetPoolsFixedSizeCollection> {

    public static ApiFuture<ListTargetPoolsPagedResponse> createAsync(
        PageContext<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool> context,
        ApiFuture<TargetPoolList> futureResponse) {
      ApiFuture<ListTargetPoolsPage> futurePage =
          ListTargetPoolsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetPoolsPage, ListTargetPoolsPagedResponse>() {
            @Override
            public ListTargetPoolsPagedResponse apply(ListTargetPoolsPage input) {
              return new ListTargetPoolsPagedResponse(input);
            }
          });
    }

    private ListTargetPoolsPagedResponse(ListTargetPoolsPage page) {
      super(page, ListTargetPoolsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListTargetPoolsPage extends AbstractPage<
      ListTargetPoolsHttpRequest,
      TargetPoolList,
      TargetPool,
      ListTargetPoolsPage> {

    private ListTargetPoolsPage(
        PageContext<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool> context,
        TargetPoolList response) {
      super(context, response);
    }

    private static ListTargetPoolsPage createEmptyPage() {
      return new ListTargetPoolsPage(null, null);
    }

    @Override
    protected ListTargetPoolsPage createPage(
        PageContext<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool> context,
        TargetPoolList response) {
      return new ListTargetPoolsPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetPoolsPage> createPageAsync(
        PageContext<ListTargetPoolsHttpRequest, TargetPoolList, TargetPool> context,
        ApiFuture<TargetPoolList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListTargetPoolsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListTargetPoolsHttpRequest,
      TargetPoolList,
      TargetPool,
      ListTargetPoolsPage,
      ListTargetPoolsFixedSizeCollection> {

    private ListTargetPoolsFixedSizeCollection(List<ListTargetPoolsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetPoolsFixedSizeCollection createEmptyCollection() {
      return new ListTargetPoolsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetPoolsFixedSizeCollection createCollection(
        List<ListTargetPoolsPage> pages, int collectionSize) {
      return new ListTargetPoolsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListTargetSslProxiesPagedResponse extends AbstractPagedListResponse<
      ListTargetSslProxiesHttpRequest,
      TargetSslProxyList,
      TargetSslProxy,
      ListTargetSslProxiesPage,
      ListTargetSslProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetSslProxiesPagedResponse> createAsync(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        ApiFuture<TargetSslProxyList> futureResponse) {
      ApiFuture<ListTargetSslProxiesPage> futurePage =
          ListTargetSslProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetSslProxiesPage, ListTargetSslProxiesPagedResponse>() {
            @Override
            public ListTargetSslProxiesPagedResponse apply(ListTargetSslProxiesPage input) {
              return new ListTargetSslProxiesPagedResponse(input);
            }
          });
    }

    private ListTargetSslProxiesPagedResponse(ListTargetSslProxiesPage page) {
      super(page, ListTargetSslProxiesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListTargetSslProxiesPage extends AbstractPage<
      ListTargetSslProxiesHttpRequest,
      TargetSslProxyList,
      TargetSslProxy,
      ListTargetSslProxiesPage> {

    private ListTargetSslProxiesPage(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        TargetSslProxyList response) {
      super(context, response);
    }

    private static ListTargetSslProxiesPage createEmptyPage() {
      return new ListTargetSslProxiesPage(null, null);
    }

    @Override
    protected ListTargetSslProxiesPage createPage(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        TargetSslProxyList response) {
      return new ListTargetSslProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetSslProxiesPage> createPageAsync(
        PageContext<ListTargetSslProxiesHttpRequest, TargetSslProxyList, TargetSslProxy> context,
        ApiFuture<TargetSslProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListTargetSslProxiesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListTargetSslProxiesHttpRequest,
      TargetSslProxyList,
      TargetSslProxy,
      ListTargetSslProxiesPage,
      ListTargetSslProxiesFixedSizeCollection> {

    private ListTargetSslProxiesFixedSizeCollection(List<ListTargetSslProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetSslProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetSslProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetSslProxiesFixedSizeCollection createCollection(
        List<ListTargetSslProxiesPage> pages, int collectionSize) {
      return new ListTargetSslProxiesFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListTargetVpnGatewaysPagedResponse extends AbstractPagedListResponse<
      AggregatedListTargetVpnGatewaysHttpRequest,
      TargetVpnGatewayAggregatedList,
      TargetVpnGateway,
      AggregatedListTargetVpnGatewaysPage,
      AggregatedListTargetVpnGatewaysFixedSizeCollection> {

    public static ApiFuture<AggregatedListTargetVpnGatewaysPagedResponse> createAsync(
        PageContext<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway> context,
        ApiFuture<TargetVpnGatewayAggregatedList> futureResponse) {
      ApiFuture<AggregatedListTargetVpnGatewaysPage> futurePage =
          AggregatedListTargetVpnGatewaysPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListTargetVpnGatewaysPage, AggregatedListTargetVpnGatewaysPagedResponse>() {
            @Override
            public AggregatedListTargetVpnGatewaysPagedResponse apply(AggregatedListTargetVpnGatewaysPage input) {
              return new AggregatedListTargetVpnGatewaysPagedResponse(input);
            }
          });
    }

    private AggregatedListTargetVpnGatewaysPagedResponse(AggregatedListTargetVpnGatewaysPage page) {
      super(page, AggregatedListTargetVpnGatewaysFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListTargetVpnGatewaysPage extends AbstractPage<
      AggregatedListTargetVpnGatewaysHttpRequest,
      TargetVpnGatewayAggregatedList,
      TargetVpnGateway,
      AggregatedListTargetVpnGatewaysPage> {

    private AggregatedListTargetVpnGatewaysPage(
        PageContext<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway> context,
        TargetVpnGatewayAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListTargetVpnGatewaysPage createEmptyPage() {
      return new AggregatedListTargetVpnGatewaysPage(null, null);
    }

    @Override
    protected AggregatedListTargetVpnGatewaysPage createPage(
        PageContext<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway> context,
        TargetVpnGatewayAggregatedList response) {
      return new AggregatedListTargetVpnGatewaysPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListTargetVpnGatewaysPage> createPageAsync(
        PageContext<AggregatedListTargetVpnGatewaysHttpRequest, TargetVpnGatewayAggregatedList, TargetVpnGateway> context,
        ApiFuture<TargetVpnGatewayAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListTargetVpnGatewaysFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListTargetVpnGatewaysHttpRequest,
      TargetVpnGatewayAggregatedList,
      TargetVpnGateway,
      AggregatedListTargetVpnGatewaysPage,
      AggregatedListTargetVpnGatewaysFixedSizeCollection> {

    private AggregatedListTargetVpnGatewaysFixedSizeCollection(List<AggregatedListTargetVpnGatewaysPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListTargetVpnGatewaysFixedSizeCollection createEmptyCollection() {
      return new AggregatedListTargetVpnGatewaysFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListTargetVpnGatewaysFixedSizeCollection createCollection(
        List<AggregatedListTargetVpnGatewaysPage> pages, int collectionSize) {
      return new AggregatedListTargetVpnGatewaysFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListTargetVpnGatewaysPagedResponse extends AbstractPagedListResponse<
      ListTargetVpnGatewaysHttpRequest,
      TargetVpnGatewayList,
      TargetVpnGateway,
      ListTargetVpnGatewaysPage,
      ListTargetVpnGatewaysFixedSizeCollection> {

    public static ApiFuture<ListTargetVpnGatewaysPagedResponse> createAsync(
        PageContext<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway> context,
        ApiFuture<TargetVpnGatewayList> futureResponse) {
      ApiFuture<ListTargetVpnGatewaysPage> futurePage =
          ListTargetVpnGatewaysPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetVpnGatewaysPage, ListTargetVpnGatewaysPagedResponse>() {
            @Override
            public ListTargetVpnGatewaysPagedResponse apply(ListTargetVpnGatewaysPage input) {
              return new ListTargetVpnGatewaysPagedResponse(input);
            }
          });
    }

    private ListTargetVpnGatewaysPagedResponse(ListTargetVpnGatewaysPage page) {
      super(page, ListTargetVpnGatewaysFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListTargetVpnGatewaysPage extends AbstractPage<
      ListTargetVpnGatewaysHttpRequest,
      TargetVpnGatewayList,
      TargetVpnGateway,
      ListTargetVpnGatewaysPage> {

    private ListTargetVpnGatewaysPage(
        PageContext<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway> context,
        TargetVpnGatewayList response) {
      super(context, response);
    }

    private static ListTargetVpnGatewaysPage createEmptyPage() {
      return new ListTargetVpnGatewaysPage(null, null);
    }

    @Override
    protected ListTargetVpnGatewaysPage createPage(
        PageContext<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway> context,
        TargetVpnGatewayList response) {
      return new ListTargetVpnGatewaysPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetVpnGatewaysPage> createPageAsync(
        PageContext<ListTargetVpnGatewaysHttpRequest, TargetVpnGatewayList, TargetVpnGateway> context,
        ApiFuture<TargetVpnGatewayList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListTargetVpnGatewaysFixedSizeCollection extends AbstractFixedSizeCollection<
      ListTargetVpnGatewaysHttpRequest,
      TargetVpnGatewayList,
      TargetVpnGateway,
      ListTargetVpnGatewaysPage,
      ListTargetVpnGatewaysFixedSizeCollection> {

    private ListTargetVpnGatewaysFixedSizeCollection(List<ListTargetVpnGatewaysPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetVpnGatewaysFixedSizeCollection createEmptyCollection() {
      return new ListTargetVpnGatewaysFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetVpnGatewaysFixedSizeCollection createCollection(
        List<ListTargetVpnGatewaysPage> pages, int collectionSize) {
      return new ListTargetVpnGatewaysFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListUrlMapsPagedResponse extends AbstractPagedListResponse<
      ListUrlMapsHttpRequest,
      UrlMapList,
      UrlMap,
      ListUrlMapsPage,
      ListUrlMapsFixedSizeCollection> {

    public static ApiFuture<ListUrlMapsPagedResponse> createAsync(
        PageContext<ListUrlMapsHttpRequest, UrlMapList, UrlMap> context,
        ApiFuture<UrlMapList> futureResponse) {
      ApiFuture<ListUrlMapsPage> futurePage =
          ListUrlMapsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListUrlMapsPage, ListUrlMapsPagedResponse>() {
            @Override
            public ListUrlMapsPagedResponse apply(ListUrlMapsPage input) {
              return new ListUrlMapsPagedResponse(input);
            }
          });
    }

    private ListUrlMapsPagedResponse(ListUrlMapsPage page) {
      super(page, ListUrlMapsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListUrlMapsPage extends AbstractPage<
      ListUrlMapsHttpRequest,
      UrlMapList,
      UrlMap,
      ListUrlMapsPage> {

    private ListUrlMapsPage(
        PageContext<ListUrlMapsHttpRequest, UrlMapList, UrlMap> context,
        UrlMapList response) {
      super(context, response);
    }

    private static ListUrlMapsPage createEmptyPage() {
      return new ListUrlMapsPage(null, null);
    }

    @Override
    protected ListUrlMapsPage createPage(
        PageContext<ListUrlMapsHttpRequest, UrlMapList, UrlMap> context,
        UrlMapList response) {
      return new ListUrlMapsPage(context, response);
    }

    @Override
    public ApiFuture<ListUrlMapsPage> createPageAsync(
        PageContext<ListUrlMapsHttpRequest, UrlMapList, UrlMap> context,
        ApiFuture<UrlMapList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListUrlMapsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListUrlMapsHttpRequest,
      UrlMapList,
      UrlMap,
      ListUrlMapsPage,
      ListUrlMapsFixedSizeCollection> {

    private ListUrlMapsFixedSizeCollection(List<ListUrlMapsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListUrlMapsFixedSizeCollection createEmptyCollection() {
      return new ListUrlMapsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListUrlMapsFixedSizeCollection createCollection(
        List<ListUrlMapsPage> pages, int collectionSize) {
      return new ListUrlMapsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class AggregatedListVpnTunnelsPagedResponse extends AbstractPagedListResponse<
      AggregatedListVpnTunnelsHttpRequest,
      VpnTunnelAggregatedList,
      VpnTunnel,
      AggregatedListVpnTunnelsPage,
      AggregatedListVpnTunnelsFixedSizeCollection> {

    public static ApiFuture<AggregatedListVpnTunnelsPagedResponse> createAsync(
        PageContext<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel> context,
        ApiFuture<VpnTunnelAggregatedList> futureResponse) {
      ApiFuture<AggregatedListVpnTunnelsPage> futurePage =
          AggregatedListVpnTunnelsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListVpnTunnelsPage, AggregatedListVpnTunnelsPagedResponse>() {
            @Override
            public AggregatedListVpnTunnelsPagedResponse apply(AggregatedListVpnTunnelsPage input) {
              return new AggregatedListVpnTunnelsPagedResponse(input);
            }
          });
    }

    private AggregatedListVpnTunnelsPagedResponse(AggregatedListVpnTunnelsPage page) {
      super(page, AggregatedListVpnTunnelsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class AggregatedListVpnTunnelsPage extends AbstractPage<
      AggregatedListVpnTunnelsHttpRequest,
      VpnTunnelAggregatedList,
      VpnTunnel,
      AggregatedListVpnTunnelsPage> {

    private AggregatedListVpnTunnelsPage(
        PageContext<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel> context,
        VpnTunnelAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListVpnTunnelsPage createEmptyPage() {
      return new AggregatedListVpnTunnelsPage(null, null);
    }

    @Override
    protected AggregatedListVpnTunnelsPage createPage(
        PageContext<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel> context,
        VpnTunnelAggregatedList response) {
      return new AggregatedListVpnTunnelsPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListVpnTunnelsPage> createPageAsync(
        PageContext<AggregatedListVpnTunnelsHttpRequest, VpnTunnelAggregatedList, VpnTunnel> context,
        ApiFuture<VpnTunnelAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class AggregatedListVpnTunnelsFixedSizeCollection extends AbstractFixedSizeCollection<
      AggregatedListVpnTunnelsHttpRequest,
      VpnTunnelAggregatedList,
      VpnTunnel,
      AggregatedListVpnTunnelsPage,
      AggregatedListVpnTunnelsFixedSizeCollection> {

    private AggregatedListVpnTunnelsFixedSizeCollection(List<AggregatedListVpnTunnelsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListVpnTunnelsFixedSizeCollection createEmptyCollection() {
      return new AggregatedListVpnTunnelsFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListVpnTunnelsFixedSizeCollection createCollection(
        List<AggregatedListVpnTunnelsPage> pages, int collectionSize) {
      return new AggregatedListVpnTunnelsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListVpnTunnelsPagedResponse extends AbstractPagedListResponse<
      ListVpnTunnelsHttpRequest,
      VpnTunnelList,
      VpnTunnel,
      ListVpnTunnelsPage,
      ListVpnTunnelsFixedSizeCollection> {

    public static ApiFuture<ListVpnTunnelsPagedResponse> createAsync(
        PageContext<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel> context,
        ApiFuture<VpnTunnelList> futureResponse) {
      ApiFuture<ListVpnTunnelsPage> futurePage =
          ListVpnTunnelsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListVpnTunnelsPage, ListVpnTunnelsPagedResponse>() {
            @Override
            public ListVpnTunnelsPagedResponse apply(ListVpnTunnelsPage input) {
              return new ListVpnTunnelsPagedResponse(input);
            }
          });
    }

    private ListVpnTunnelsPagedResponse(ListVpnTunnelsPage page) {
      super(page, ListVpnTunnelsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListVpnTunnelsPage extends AbstractPage<
      ListVpnTunnelsHttpRequest,
      VpnTunnelList,
      VpnTunnel,
      ListVpnTunnelsPage> {

    private ListVpnTunnelsPage(
        PageContext<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel> context,
        VpnTunnelList response) {
      super(context, response);
    }

    private static ListVpnTunnelsPage createEmptyPage() {
      return new ListVpnTunnelsPage(null, null);
    }

    @Override
    protected ListVpnTunnelsPage createPage(
        PageContext<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel> context,
        VpnTunnelList response) {
      return new ListVpnTunnelsPage(context, response);
    }

    @Override
    public ApiFuture<ListVpnTunnelsPage> createPageAsync(
        PageContext<ListVpnTunnelsHttpRequest, VpnTunnelList, VpnTunnel> context,
        ApiFuture<VpnTunnelList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListVpnTunnelsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListVpnTunnelsHttpRequest,
      VpnTunnelList,
      VpnTunnel,
      ListVpnTunnelsPage,
      ListVpnTunnelsFixedSizeCollection> {

    private ListVpnTunnelsFixedSizeCollection(List<ListVpnTunnelsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListVpnTunnelsFixedSizeCollection createEmptyCollection() {
      return new ListVpnTunnelsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListVpnTunnelsFixedSizeCollection createCollection(
        List<ListVpnTunnelsPage> pages, int collectionSize) {
      return new ListVpnTunnelsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListZoneOperationsPagedResponse extends AbstractPagedListResponse<
      ListZoneOperationsHttpRequest,
      OperationList,
      Operation,
      ListZoneOperationsPage,
      ListZoneOperationsFixedSizeCollection> {

    public static ApiFuture<ListZoneOperationsPagedResponse> createAsync(
        PageContext<ListZoneOperationsHttpRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      ApiFuture<ListZoneOperationsPage> futurePage =
          ListZoneOperationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListZoneOperationsPage, ListZoneOperationsPagedResponse>() {
            @Override
            public ListZoneOperationsPagedResponse apply(ListZoneOperationsPage input) {
              return new ListZoneOperationsPagedResponse(input);
            }
          });
    }

    private ListZoneOperationsPagedResponse(ListZoneOperationsPage page) {
      super(page, ListZoneOperationsFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListZoneOperationsPage extends AbstractPage<
      ListZoneOperationsHttpRequest,
      OperationList,
      Operation,
      ListZoneOperationsPage> {

    private ListZoneOperationsPage(
        PageContext<ListZoneOperationsHttpRequest, OperationList, Operation> context,
        OperationList response) {
      super(context, response);
    }

    private static ListZoneOperationsPage createEmptyPage() {
      return new ListZoneOperationsPage(null, null);
    }

    @Override
    protected ListZoneOperationsPage createPage(
        PageContext<ListZoneOperationsHttpRequest, OperationList, Operation> context,
        OperationList response) {
      return new ListZoneOperationsPage(context, response);
    }

    @Override
    public ApiFuture<ListZoneOperationsPage> createPageAsync(
        PageContext<ListZoneOperationsHttpRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListZoneOperationsFixedSizeCollection extends AbstractFixedSizeCollection<
      ListZoneOperationsHttpRequest,
      OperationList,
      Operation,
      ListZoneOperationsPage,
      ListZoneOperationsFixedSizeCollection> {

    private ListZoneOperationsFixedSizeCollection(List<ListZoneOperationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListZoneOperationsFixedSizeCollection createEmptyCollection() {
      return new ListZoneOperationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListZoneOperationsFixedSizeCollection createCollection(
        List<ListZoneOperationsPage> pages, int collectionSize) {
      return new ListZoneOperationsFixedSizeCollection(pages, collectionSize);
    }


  }

  public static class ListZonesPagedResponse extends AbstractPagedListResponse<
      ListZonesHttpRequest,
      ZoneList,
      Zone,
      ListZonesPage,
      ListZonesFixedSizeCollection> {

    public static ApiFuture<ListZonesPagedResponse> createAsync(
        PageContext<ListZonesHttpRequest, ZoneList, Zone> context,
        ApiFuture<ZoneList> futureResponse) {
      ApiFuture<ListZonesPage> futurePage =
          ListZonesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListZonesPage, ListZonesPagedResponse>() {
            @Override
            public ListZonesPagedResponse apply(ListZonesPage input) {
              return new ListZonesPagedResponse(input);
            }
          });
    }

    private ListZonesPagedResponse(ListZonesPage page) {
      super(page, ListZonesFixedSizeCollection.createEmptyCollection());
    }


  }

  public static class ListZonesPage extends AbstractPage<
      ListZonesHttpRequest,
      ZoneList,
      Zone,
      ListZonesPage> {

    private ListZonesPage(
        PageContext<ListZonesHttpRequest, ZoneList, Zone> context,
        ZoneList response) {
      super(context, response);
    }

    private static ListZonesPage createEmptyPage() {
      return new ListZonesPage(null, null);
    }

    @Override
    protected ListZonesPage createPage(
        PageContext<ListZonesHttpRequest, ZoneList, Zone> context,
        ZoneList response) {
      return new ListZonesPage(context, response);
    }

    @Override
    public ApiFuture<ListZonesPage> createPageAsync(
        PageContext<ListZonesHttpRequest, ZoneList, Zone> context,
        ApiFuture<ZoneList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }




  }

  public static class ListZonesFixedSizeCollection extends AbstractFixedSizeCollection<
      ListZonesHttpRequest,
      ZoneList,
      Zone,
      ListZonesPage,
      ListZonesFixedSizeCollection> {

    private ListZonesFixedSizeCollection(List<ListZonesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListZonesFixedSizeCollection createEmptyCollection() {
      return new ListZonesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListZonesFixedSizeCollection createCollection(
        List<ListZonesPage> pages, int collectionSize) {
      return new ListZonesFixedSizeCollection(pages, collectionSize);
    }


  }

}