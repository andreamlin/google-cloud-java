// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Contains an HSM-generated attestation about a key operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.KeyOperationAttestation}
 */
public final class KeyOperationAttestation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.KeyOperationAttestation)
    KeyOperationAttestationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use KeyOperationAttestation.newBuilder() to construct.
  private KeyOperationAttestation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private KeyOperationAttestation() {
    format_ = 0;
    content_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private KeyOperationAttestation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 32:
            {
              int rawValue = input.readEnum();

              format_ = rawValue;
              break;
            }
          case 42:
            {
              content_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsResourcesProto
        .internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsResourcesProto
        .internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.KeyOperationAttestation.class,
            com.google.cloud.kms.v1.KeyOperationAttestation.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Attestion formats provided by the HSM.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat}
   */
  public enum AttestationFormat implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>ATTESTATION_FORMAT_UNSPECIFIED = 0;</code> */
    ATTESTATION_FORMAT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Cavium HSM attestation compressed with gzip. Note that this format is
     * defined by Cavium and subject to change at any time.
     * </pre>
     *
     * <code>CAVIUM_V1_COMPRESSED = 3;</code>
     */
    CAVIUM_V1_COMPRESSED(3),
    UNRECOGNIZED(-1),
    ;

    /** <code>ATTESTATION_FORMAT_UNSPECIFIED = 0;</code> */
    public static final int ATTESTATION_FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Cavium HSM attestation compressed with gzip. Note that this format is
     * defined by Cavium and subject to change at any time.
     * </pre>
     *
     * <code>CAVIUM_V1_COMPRESSED = 3;</code>
     */
    public static final int CAVIUM_V1_COMPRESSED_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static AttestationFormat valueOf(int value) {
      return forNumber(value);
    }

    public static AttestationFormat forNumber(int value) {
      switch (value) {
        case 0:
          return ATTESTATION_FORMAT_UNSPECIFIED;
        case 3:
          return CAVIUM_V1_COMPRESSED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AttestationFormat>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AttestationFormat>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AttestationFormat>() {
              public AttestationFormat findValueByNumber(int number) {
                return AttestationFormat.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.kms.v1.KeyOperationAttestation.getDescriptor().getEnumTypes().get(0);
    }

    private static final AttestationFormat[] VALUES = values();

    public static AttestationFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AttestationFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat)
  }

  public static final int FORMAT_FIELD_NUMBER = 4;
  private int format_;
  /**
   *
   *
   * <pre>
   * Output only. The format of the attestation data.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
   */
  public int getFormatValue() {
    return format_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The format of the attestation data.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
   */
  public com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat getFormat() {
    @SuppressWarnings("deprecation")
    com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat result =
        com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat.valueOf(format_);
    return result == null
        ? com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat.UNRECOGNIZED
        : result;
  }

  public static final int CONTENT_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString content_;
  /**
   *
   *
   * <pre>
   * Output only. The attestation data provided by the HSM when the key
   * operation was performed.
   * </pre>
   *
   * <code>bytes content = 5;</code>
   */
  public com.google.protobuf.ByteString getContent() {
    return content_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (format_
        != com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat
            .ATTESTATION_FORMAT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, format_);
    }
    if (!content_.isEmpty()) {
      output.writeBytes(5, content_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (format_
        != com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat
            .ATTESTATION_FORMAT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, format_);
    }
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(5, content_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.kms.v1.KeyOperationAttestation)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.KeyOperationAttestation other =
        (com.google.cloud.kms.v1.KeyOperationAttestation) obj;

    boolean result = true;
    result = result && format_ == other.format_;
    result = result && getContent().equals(other.getContent());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.kms.v1.KeyOperationAttestation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Contains an HSM-generated attestation about a key operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.KeyOperationAttestation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.KeyOperationAttestation)
      com.google.cloud.kms.v1.KeyOperationAttestationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.KeyOperationAttestation.class,
              com.google.cloud.kms.v1.KeyOperationAttestation.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.KeyOperationAttestation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      format_ = 0;

      content_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.KeyOperationAttestation getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.KeyOperationAttestation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.KeyOperationAttestation build() {
      com.google.cloud.kms.v1.KeyOperationAttestation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.KeyOperationAttestation buildPartial() {
      com.google.cloud.kms.v1.KeyOperationAttestation result =
          new com.google.cloud.kms.v1.KeyOperationAttestation(this);
      result.format_ = format_;
      result.content_ = content_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.KeyOperationAttestation) {
        return mergeFrom((com.google.cloud.kms.v1.KeyOperationAttestation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.KeyOperationAttestation other) {
      if (other == com.google.cloud.kms.v1.KeyOperationAttestation.getDefaultInstance())
        return this;
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
      }
      if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
        setContent(other.getContent());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.kms.v1.KeyOperationAttestation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.KeyOperationAttestation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int format_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The format of the attestation data.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
     */
    public int getFormatValue() {
      return format_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The format of the attestation data.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The format of the attestation data.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
     */
    public com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat getFormat() {
      @SuppressWarnings("deprecation")
      com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat result =
          com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat.valueOf(format_);
      return result == null
          ? com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The format of the attestation data.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
     */
    public Builder setFormat(
        com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }

      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The format of the attestation data.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4;</code>
     */
    public Builder clearFormat() {

      format_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Output only. The attestation data provided by the HSM when the key
     * operation was performed.
     * </pre>
     *
     * <code>bytes content = 5;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The attestation data provided by the HSM when the key
     * operation was performed.
     * </pre>
     *
     * <code>bytes content = 5;</code>
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      content_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The attestation data provided by the HSM when the key
     * operation was performed.
     * </pre>
     *
     * <code>bytes content = 5;</code>
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.KeyOperationAttestation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.KeyOperationAttestation)
  private static final com.google.cloud.kms.v1.KeyOperationAttestation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.KeyOperationAttestation();
  }

  public static com.google.cloud.kms.v1.KeyOperationAttestation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyOperationAttestation> PARSER =
      new com.google.protobuf.AbstractParser<KeyOperationAttestation>() {
        @java.lang.Override
        public KeyOperationAttestation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new KeyOperationAttestation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<KeyOperationAttestation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyOperationAttestation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.KeyOperationAttestation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
