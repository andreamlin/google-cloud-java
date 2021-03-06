// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationOutcomeReasonFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ApplicationOutcomeReasonFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected outcome reason. The API does an exact match on the
   * [JobApplication.outcome_reason][google.cloud.talent.v4beta1.JobApplication.outcome_reason]
   * in profiles.
   * </pre>
   *
   * <code>string outcome_reason = 1;</code>
   */
  java.lang.String getOutcomeReason();
  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected outcome reason. The API does an exact match on the
   * [JobApplication.outcome_reason][google.cloud.talent.v4beta1.JobApplication.outcome_reason]
   * in profiles.
   * </pre>
   *
   * <code>string outcome_reason = 1;</code>
   */
  com.google.protobuf.ByteString getOutcomeReasonBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * If true, The API excludes all candidates with any
   * [JobApplication.outcome_reason][google.cloud.talent.v4beta1.JobApplication.outcome_reason]
   * matching the outcome reason specified in the filter.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   */
  boolean getNegated();
}
