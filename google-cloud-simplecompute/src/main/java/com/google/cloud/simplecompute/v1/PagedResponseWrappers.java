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
package com.google.cloud.simplecompute.v1;

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

}