/*
 * Copyright 2019 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

public interface PolylineConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.PolylineConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1;</code>
   *
   * @return The annotationSpecSet.
   */
  java.lang.String getAnnotationSpecSet();
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1;</code>
   *
   * @return The bytes for annotationSpecSet.
   */
  com.google.protobuf.ByteString getAnnotationSpecSetBytes();

  /**
   *
   *
   * <pre>
   * Optional. Instruction message showed on contributors UI.
   * </pre>
   *
   * <code>string instruction_message = 2;</code>
   *
   * @return The instructionMessage.
   */
  java.lang.String getInstructionMessage();
  /**
   *
   *
   * <pre>
   * Optional. Instruction message showed on contributors UI.
   * </pre>
   *
   * <code>string instruction_message = 2;</code>
   *
   * @return The bytes for instructionMessage.
   */
  com.google.protobuf.ByteString getInstructionMessageBytes();
}
