// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ExportAgentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The
   * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
   * URI to export the agent to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * If left unspecified, the serialized agent is returned inline.
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  java.lang.String getAgentUri();
  /**
   *
   *
   * <pre>
   * Optional. The
   * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
   * URI to export the agent to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * If left unspecified, the serialized agent is returned inline.
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  com.google.protobuf.ByteString getAgentUriBytes();
}
