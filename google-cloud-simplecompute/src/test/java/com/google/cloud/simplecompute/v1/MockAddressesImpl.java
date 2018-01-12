// /*
//  * Copyright 2017 Google LLC
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  *     https://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */
// package com.google.cloud.simplecompute.v1;
//
// import com.google.api.core.BetaApi;
// import com.google.api.gax.httpjson.ApiMessage;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
//
// @javax.annotation.Generated("by GAPIC")
// @BetaApi
// public class MockAddressesImpl {
//   private ArrayList<ApiMessage> requests;
//   private Queue<Object> responses;
//
//   public MockAddressesImpl() {
//     requests = new ArrayList<>();
//     responses = new LinkedList<>();
//   }
//
//   public List<ApiMessage> getRequests() {
//     return requests;
//   }
//
//   public void addResponse(ApiMessage response) {
//     responses.add(response);
//   }
//
//   public void setResponses(List<ApiMessage> responses) {
//     this.responses = new LinkedList<Object>(responses);
//   }
//
//   public void addException(Exception exception) {
//     responses.add(exception);
//   }
//
//   public void reset() {
//     requests = new ArrayList<>();
//     responses = new LinkedList<>();
//   }
//
//   public Operation deleteAddress(DeleteAddressHttpRequest request) {
//     Object response = responses.remove();
//     if (response instanceof Operation) {
//       requests.add(request);
//       responseObserver.onNext((Operation) response);
//       responseObserver.onCompleted();
//     } else if (response instanceof Exception) {
//       responseObserver.onError((Exception) response);
//     } else {
//       responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
//     }
//   }
//
//   public void getAddress(GetAddressHttpRequest request,
//     StreamObserver<Address> responseObserver) {
//     Object response = responses.remove();
//     if (response instanceof Address) {
//       requests.add(request);
//       responseObserver.onNext((Address) response);
//       responseObserver.onCompleted();
//     } else if (response instanceof Exception) {
//       responseObserver.onError((Exception) response);
//     } else {
//       responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
//     }
//   }
//
//   public void insertAddress(InsertAddressHttpRequest request,
//     StreamObserver<Operation> responseObserver) {
//     Object response = responses.remove();
//     if (response instanceof Operation) {
//       requests.add(request);
//       responseObserver.onNext((Operation) response);
//       responseObserver.onCompleted();
//     } else if (response instanceof Exception) {
//       responseObserver.onError((Exception) response);
//     } else {
//       responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
//     }
//   }
//
//   public void listAddresses(ListAddressesHttpRequest request,
//     StreamObserver<AddressList> responseObserver) {
//     Object response = responses.remove();
//     if (response instanceof AddressList) {
//       requests.add(request);
//       responseObserver.onNext((AddressList) response);
//       responseObserver.onCompleted();
//     } else if (response instanceof Exception) {
//       responseObserver.onError((Exception) response);
//     } else {
//       responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
//     }
//   }
//
// }