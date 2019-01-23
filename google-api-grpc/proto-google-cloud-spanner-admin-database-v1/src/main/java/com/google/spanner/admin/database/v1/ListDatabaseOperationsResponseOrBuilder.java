// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public interface ListDatabaseOperationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.ListDatabaseOperationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of matching
   * [long-running operations][google.longrunning.Operation] whose names are
   * prefixed by a database name. The long-running operation
   * [metadata][google.longrunning.Operation.metadata] field type
   * `metadata.type_url` describes the type of the metadata.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  java.util.List<com.google.longrunning.Operation> getOperationsList();
  /**
   *
   *
   * <pre>
   * The list of matching
   * [long-running operations][google.longrunning.Operation] whose names are
   * prefixed by a database name. The long-running operation
   * [metadata][google.longrunning.Operation.metadata] field type
   * `metadata.type_url` describes the type of the metadata.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  com.google.longrunning.Operation getOperations(int index);
  /**
   *
   *
   * <pre>
   * The list of matching
   * [long-running operations][google.longrunning.Operation] whose names are
   * prefixed by a database name. The long-running operation
   * [metadata][google.longrunning.Operation.metadata] field type
   * `metadata.type_url` describes the type of the metadata.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  int getOperationsCount();
  /**
   *
   *
   * <pre>
   * The list of matching
   * [long-running operations][google.longrunning.Operation] whose names are
   * prefixed by a database name. The long-running operation
   * [metadata][google.longrunning.Operation.metadata] field type
   * `metadata.type_url` describes the type of the metadata.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  java.util.List<? extends com.google.longrunning.OperationOrBuilder> getOperationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of matching
   * [long-running operations][google.longrunning.Operation] whose names are
   * prefixed by a database name. The long-running operation
   * [metadata][google.longrunning.Operation.metadata] field type
   * `metadata.type_url` describes the type of the metadata.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListDatabaseOperations][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseOperations]
   * call to fetch more of the matching metadata.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListDatabaseOperations][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseOperations]
   * call to fetch more of the matching metadata.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
