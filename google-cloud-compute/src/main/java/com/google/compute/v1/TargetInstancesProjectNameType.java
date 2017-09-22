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

import com.google.api.core.BetaApi;
import com.google.api.resourcenames.ResourceNameType;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class TargetInstancesProjectNameType implements ResourceNameType {
  private static TargetInstancesProjectNameType instance = new TargetInstancesProjectNameType();

  private TargetInstancesProjectNameType() {}

  public static TargetInstancesProjectNameType instance() {
    return instance;
  }
}
