/*
 * Copyright 2017, Google LLC All rights reserved.
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

import com.google.api.core.BetaApi;
import com.google.common.collect.Lists;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockTargetVpnGatewaysImpl extends grpcClassName {
  private ArrayList<GeneratedMessageV3> requests;
  private Queue<Object> responses;

  public MockTargetVpnGatewaysImpl() {
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
  public void aggregatedListTargetVpnGateways(AggregatedListTargetVpnGatewaysHttpRequest request,
    StreamObserver<TargetVpnGatewayAggregatedList> responseObserver) {
    Object response = responses.remove();
    if (response instanceof TargetVpnGatewayAggregatedList) {
      requests.add(request);
      responseObserver.onNext((TargetVpnGatewayAggregatedList) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteTargetVpnGateway(DeleteTargetVpnGatewayHttpRequest request,
    StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getTargetVpnGateway(GetTargetVpnGatewayHttpRequest request,
    StreamObserver<TargetVpnGateway> responseObserver) {
    Object response = responses.remove();
    if (response instanceof TargetVpnGateway) {
      requests.add(request);
      responseObserver.onNext((TargetVpnGateway) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void insertTargetVpnGateway(InsertTargetVpnGatewayHttpRequest request,
    StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listTargetVpnGateways(ListTargetVpnGatewaysHttpRequest request,
    StreamObserver<TargetVpnGatewayList> responseObserver) {
    Object response = responses.remove();
    if (response instanceof TargetVpnGatewayList) {
      requests.add(request);
      responseObserver.onNext((TargetVpnGatewayList) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

}