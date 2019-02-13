// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface GcRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.GcRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Delete all cells in a column except the most recent N.
   * </pre>
   *
   * <code>int32 max_num_versions = 1;</code>
   */
  int getMaxNumVersions();

  /**
   *
   *
   * <pre>
   * Delete cells in a column older than the given age.
   * Values must be at least one millisecond, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 2;</code>
   */
  boolean hasMaxAge();
  /**
   *
   *
   * <pre>
   * Delete cells in a column older than the given age.
   * Values must be at least one millisecond, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 2;</code>
   */
  com.google.protobuf.Duration getMaxAge();
  /**
   *
   *
   * <pre>
   * Delete cells in a column older than the given age.
   * Values must be at least one millisecond, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxAgeOrBuilder();

  /**
   *
   *
   * <pre>
   * Delete cells that would be deleted by every nested rule.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule.Intersection intersection = 3;</code>
   */
  boolean hasIntersection();
  /**
   *
   *
   * <pre>
   * Delete cells that would be deleted by every nested rule.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule.Intersection intersection = 3;</code>
   */
  com.google.bigtable.admin.v2.GcRule.Intersection getIntersection();
  /**
   *
   *
   * <pre>
   * Delete cells that would be deleted by every nested rule.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule.Intersection intersection = 3;</code>
   */
  com.google.bigtable.admin.v2.GcRule.IntersectionOrBuilder getIntersectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Delete cells that would be deleted by any nested rule.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule.Union union = 4;</code>
   */
  boolean hasUnion();
  /**
   *
   *
   * <pre>
   * Delete cells that would be deleted by any nested rule.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule.Union union = 4;</code>
   */
  com.google.bigtable.admin.v2.GcRule.Union getUnion();
  /**
   *
   *
   * <pre>
   * Delete cells that would be deleted by any nested rule.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule.Union union = 4;</code>
   */
  com.google.bigtable.admin.v2.GcRule.UnionOrBuilder getUnionOrBuilder();

  public com.google.bigtable.admin.v2.GcRule.RuleCase getRuleCase();
}
