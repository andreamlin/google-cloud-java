// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface ClusterOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ClusterOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The id of the cluster operation.
   * </pre>
   *
   * <code>string operation_id = 1;</code>
   */
  java.lang.String getOperationId();
  /**
   *
   *
   * <pre>
   * Output only. The id of the cluster operation.
   * </pre>
   *
   * <code>string operation_id = 1;</code>
   */
  com.google.protobuf.ByteString getOperationIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Error, if operation failed.
   * </pre>
   *
   * <code>string error = 2;</code>
   */
  java.lang.String getError();
  /**
   *
   *
   * <pre>
   * Output only. Error, if operation failed.
   * </pre>
   *
   * <code>string error = 2;</code>
   */
  com.google.protobuf.ByteString getErrorBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates the operation is done.
   * </pre>
   *
   * <code>bool done = 3;</code>
   */
  boolean getDone();
}
