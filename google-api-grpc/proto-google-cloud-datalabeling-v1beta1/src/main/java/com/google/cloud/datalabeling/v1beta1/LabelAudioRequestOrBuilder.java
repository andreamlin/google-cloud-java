// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface LabelAudioRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.LabelAudioRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the dataset to request labeling task, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Name of the dataset to request labeling task, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  boolean hasBasicConfig();
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig();
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder getBasicConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The type of audio labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
   */
  int getFeatureValue();
  /**
   *
   *
   * <pre>
   * Required. The type of audio labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature getFeature();
}