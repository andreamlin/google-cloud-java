// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/common.proto

package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * A precondition on a document, used for conditional operations.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.Precondition}
 */
public final class Precondition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.Precondition)
    PreconditionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Precondition.newBuilder() to construct.
  private Precondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Precondition() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Precondition(
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
          case 8:
            {
              conditionTypeCase_ = 1;
              conditionType_ = input.readBool();
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (conditionTypeCase_ == 2) {
                subBuilder = ((com.google.protobuf.Timestamp) conditionType_).toBuilder();
              }
              conditionType_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.protobuf.Timestamp) conditionType_);
                conditionType_ = subBuilder.buildPartial();
              }
              conditionTypeCase_ = 2;
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
    return com.google.firestore.v1.CommonProto
        .internal_static_google_firestore_v1_Precondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.CommonProto
        .internal_static_google_firestore_v1_Precondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.Precondition.class,
            com.google.firestore.v1.Precondition.Builder.class);
  }

  private int conditionTypeCase_ = 0;
  private java.lang.Object conditionType_;

  public enum ConditionTypeCase implements com.google.protobuf.Internal.EnumLite {
    EXISTS(1),
    UPDATE_TIME(2),
    CONDITIONTYPE_NOT_SET(0);
    private final int value;

    private ConditionTypeCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static ConditionTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConditionTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return EXISTS;
        case 2:
          return UPDATE_TIME;
        case 0:
          return CONDITIONTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ConditionTypeCase getConditionTypeCase() {
    return ConditionTypeCase.forNumber(conditionTypeCase_);
  }

  public static final int EXISTS_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * When set to `true`, the target document must exist.
   * When set to `false`, the target document must not exist.
   * </pre>
   *
   * <code>bool exists = 1;</code>
   */
  public boolean getExists() {
    if (conditionTypeCase_ == 1) {
      return (java.lang.Boolean) conditionType_;
    }
    return false;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * When set, the target document must exist and have been last updated at
   * that time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  public boolean hasUpdateTime() {
    return conditionTypeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * When set, the target document must exist and have been last updated at
   * that time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getUpdateTime() {
    if (conditionTypeCase_ == 2) {
      return (com.google.protobuf.Timestamp) conditionType_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * When set, the target document must exist and have been last updated at
   * that time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    if (conditionTypeCase_ == 2) {
      return (com.google.protobuf.Timestamp) conditionType_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
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
    if (conditionTypeCase_ == 1) {
      output.writeBool(1, (boolean) ((java.lang.Boolean) conditionType_));
    }
    if (conditionTypeCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Timestamp) conditionType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conditionTypeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              1, (boolean) ((java.lang.Boolean) conditionType_));
    }
    if (conditionTypeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.protobuf.Timestamp) conditionType_);
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
    if (!(obj instanceof com.google.firestore.v1.Precondition)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.Precondition other = (com.google.firestore.v1.Precondition) obj;

    boolean result = true;
    result = result && getConditionTypeCase().equals(other.getConditionTypeCase());
    if (!result) return false;
    switch (conditionTypeCase_) {
      case 1:
        result = result && (getExists() == other.getExists());
        break;
      case 2:
        result = result && getUpdateTime().equals(other.getUpdateTime());
        break;
      case 0:
      default:
    }
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
    switch (conditionTypeCase_) {
      case 1:
        hash = (37 * hash) + EXISTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getExists());
        break;
      case 2:
        hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getUpdateTime().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.Precondition parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.Precondition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.Precondition parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.Precondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.Precondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.Precondition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.Precondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.Precondition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.Precondition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.Precondition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.Precondition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.Precondition parseFrom(
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

  public static Builder newBuilder(com.google.firestore.v1.Precondition prototype) {
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
   * A precondition on a document, used for conditional operations.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.Precondition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.Precondition)
      com.google.firestore.v1.PreconditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.CommonProto
          .internal_static_google_firestore_v1_Precondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.CommonProto
          .internal_static_google_firestore_v1_Precondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.Precondition.class,
              com.google.firestore.v1.Precondition.Builder.class);
    }

    // Construct using com.google.firestore.v1.Precondition.newBuilder()
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
      conditionTypeCase_ = 0;
      conditionType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.CommonProto
          .internal_static_google_firestore_v1_Precondition_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.Precondition getDefaultInstanceForType() {
      return com.google.firestore.v1.Precondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.Precondition build() {
      com.google.firestore.v1.Precondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.Precondition buildPartial() {
      com.google.firestore.v1.Precondition result = new com.google.firestore.v1.Precondition(this);
      if (conditionTypeCase_ == 1) {
        result.conditionType_ = conditionType_;
      }
      if (conditionTypeCase_ == 2) {
        if (updateTimeBuilder_ == null) {
          result.conditionType_ = conditionType_;
        } else {
          result.conditionType_ = updateTimeBuilder_.build();
        }
      }
      result.conditionTypeCase_ = conditionTypeCase_;
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
      if (other instanceof com.google.firestore.v1.Precondition) {
        return mergeFrom((com.google.firestore.v1.Precondition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.Precondition other) {
      if (other == com.google.firestore.v1.Precondition.getDefaultInstance()) return this;
      switch (other.getConditionTypeCase()) {
        case EXISTS:
          {
            setExists(other.getExists());
            break;
          }
        case UPDATE_TIME:
          {
            mergeUpdateTime(other.getUpdateTime());
            break;
          }
        case CONDITIONTYPE_NOT_SET:
          {
            break;
          }
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
      com.google.firestore.v1.Precondition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.Precondition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int conditionTypeCase_ = 0;
    private java.lang.Object conditionType_;

    public ConditionTypeCase getConditionTypeCase() {
      return ConditionTypeCase.forNumber(conditionTypeCase_);
    }

    public Builder clearConditionType() {
      conditionTypeCase_ = 0;
      conditionType_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * When set to `true`, the target document must exist.
     * When set to `false`, the target document must not exist.
     * </pre>
     *
     * <code>bool exists = 1;</code>
     */
    public boolean getExists() {
      if (conditionTypeCase_ == 1) {
        return (java.lang.Boolean) conditionType_;
      }
      return false;
    }
    /**
     *
     *
     * <pre>
     * When set to `true`, the target document must exist.
     * When set to `false`, the target document must not exist.
     * </pre>
     *
     * <code>bool exists = 1;</code>
     */
    public Builder setExists(boolean value) {
      conditionTypeCase_ = 1;
      conditionType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When set to `true`, the target document must exist.
     * When set to `false`, the target document must not exist.
     * </pre>
     *
     * <code>bool exists = 1;</code>
     */
    public Builder clearExists() {
      if (conditionTypeCase_ == 1) {
        conditionTypeCase_ = 0;
        conditionType_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public boolean hasUpdateTime() {
      return conditionTypeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        if (conditionTypeCase_ == 2) {
          return (com.google.protobuf.Timestamp) conditionType_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (conditionTypeCase_ == 2) {
          return updateTimeBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conditionType_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      conditionTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        conditionType_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      conditionTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (conditionTypeCase_ == 2
            && conditionType_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          conditionType_ =
              com.google.protobuf.Timestamp.newBuilder(
                      (com.google.protobuf.Timestamp) conditionType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          conditionType_ = value;
        }
        onChanged();
      } else {
        if (conditionTypeCase_ == 2) {
          updateTimeBuilder_.mergeFrom(value);
        }
        updateTimeBuilder_.setMessage(value);
      }
      conditionTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        if (conditionTypeCase_ == 2) {
          conditionTypeCase_ = 0;
          conditionType_ = null;
          onChanged();
        }
      } else {
        if (conditionTypeCase_ == 2) {
          conditionTypeCase_ = 0;
          conditionType_ = null;
        }
        updateTimeBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if ((conditionTypeCase_ == 2) && (updateTimeBuilder_ != null)) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        if (conditionTypeCase_ == 2) {
          return (com.google.protobuf.Timestamp) conditionType_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * When set, the target document must exist and have been last updated at
     * that time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        if (!(conditionTypeCase_ == 2)) {
          conditionType_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) conditionType_, getParentForChildren(), isClean());
        conditionType_ = null;
      }
      conditionTypeCase_ = 2;
      onChanged();
      ;
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.Precondition)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.Precondition)
  private static final com.google.firestore.v1.Precondition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.Precondition();
  }

  public static com.google.firestore.v1.Precondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Precondition> PARSER =
      new com.google.protobuf.AbstractParser<Precondition>() {
        @java.lang.Override
        public Precondition parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Precondition(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Precondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Precondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.Precondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
