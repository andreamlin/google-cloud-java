// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1alpha;

public interface ListFindingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.ListFindingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.Finding findings = 1;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1alpha.Finding> 
      getFindingsList();
  /**
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.Finding findings = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.Finding getFindings(int index);
  /**
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.Finding findings = 1;</code>
   */
  int getFindingsCount();
  /**
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.Finding findings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.FindingOrBuilder> 
      getFindingsOrBuilderList();
  /**
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.Finding findings = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.FindingOrBuilder getFindingsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
