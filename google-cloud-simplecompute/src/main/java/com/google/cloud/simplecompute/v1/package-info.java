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
 *   AddressName address = AddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
 *   Operation response = addressClient.deleteAddress(address);
 * }
 * </code>
 * </pre>
 *
 * =================
 * DummyObjectClient
 * =================
 *
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * Sample for DummyObjectClient:
 * <pre>
 * <code>
 * try (DummyObjectClient dummyObjectClient = DummyObjectClient.create()) {
 *   DummyObjectName dummyObject = DummyObjectName.of("[PROJECT]", "[DUMMY_OBJECT]");
 *   dummyObjectClient.deleteDummyObject(dummyObject);
 * }
 * </code>
 * </pre>
 *
 */

package com.google.cloud.simplecompute.v1;