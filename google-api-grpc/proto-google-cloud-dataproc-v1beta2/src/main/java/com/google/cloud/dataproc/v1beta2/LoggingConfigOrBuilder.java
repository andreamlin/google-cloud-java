// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/jobs.proto

package com.google.cloud.dataproc.v1beta2;

public interface LoggingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.LoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  int getDriverLogLevelsCount();
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  boolean containsDriverLogLevels(java.lang.String key);
  /** Use {@link #getDriverLogLevelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.dataproc.v1beta2.LoggingConfig.Level>
      getDriverLogLevels();
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.dataproc.v1beta2.LoggingConfig.Level>
      getDriverLogLevelsMap();
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.LoggingConfig.Level getDriverLogLevelsOrDefault(
      java.lang.String key, com.google.cloud.dataproc.v1beta2.LoggingConfig.Level defaultValue);
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.LoggingConfig.Level getDriverLogLevelsOrThrow(
      java.lang.String key);
  /** Use {@link #getDriverLogLevelsValueMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getDriverLogLevelsValue();
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getDriverLogLevelsValueMap();
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  int getDriverLogLevelsValueOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * The per-package log levels for the driver. This may include
   * "root" package name to configure rootLogger.
   * Examples:
   *   'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataproc.v1beta2.LoggingConfig.Level&gt; driver_log_levels = 2;
   * </code>
   */
  int getDriverLogLevelsValueOrThrow(java.lang.String key);
}
