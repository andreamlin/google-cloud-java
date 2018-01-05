/*
 * Copyright 2017 Google LLC
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
import com.google.common.collect.Lists;
import google.compute.v1.MachineTypesHttp.MachineTypesImplBase;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockMachineTypesImpl extends MachineTypesImplBase {
  private ArrayList<GeneratedMessageV3> requests;
  private Queue<Object> responses;

  public MockMachineTypesImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<GeneratedMessageV3> getRequests() {
    return requests;
  }

  public void addResponse(GeneratedMessageV3 response) {
    responses.add(response);
  }

  public void setResponses(List<GeneratedMessageV3> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void aggregatedListMachineTypes(AggregatedListMachineTypesHttpRequest request,
    StreamObserver<MachineTypeAggregatedList> responseObserver) {
    Object response = responses.remove();
    if (response instanceof MachineTypeAggregatedList) {
      requests.add(request);
      responseObserver.onNext((MachineTypeAggregatedList) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getMachineType(GetMachineTypeHttpRequest request,
    StreamObserver<MachineType> responseObserver) {
    Object response = responses.remove();
    if (response instanceof MachineType) {
      requests.add(request);
      responseObserver.onNext((MachineType) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listMachineTypes(ListMachineTypesHttpRequest request,
    StreamObserver<MachineTypeList> responseObserver) {
    Object response = responses.remove();
    if (response instanceof MachineTypeList) {
      requests.add(request);
      responseObserver.onNext((MachineTypeList) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

}