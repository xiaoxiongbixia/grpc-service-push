// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_push.proto

package com.neusoft.grpc.proto.demo1;

/**
 * <pre>
 *主题2
 * </pre>
 *
 * Protobuf type {@code TopicTwo}
 */
public  final class TopicTwo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TopicTwo)
    TopicTwoOrBuilder {
  // Use TopicTwo.newBuilder() to construct.
  private TopicTwo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicTwo() {
    topicId_ = "";
    topicName_ = "";
    yyy_ = 0;
    boolType_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TopicTwo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            topicId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            topicName_ = s;
            break;
          }
          case 24: {

            yyy_ = input.readInt32();
            break;
          }
          case 32: {

            boolType_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.neusoft.grpc.proto.demo1.ServicePushDemo.internal_static_TopicTwo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.neusoft.grpc.proto.demo1.ServicePushDemo.internal_static_TopicTwo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.neusoft.grpc.proto.demo1.TopicTwo.class, com.neusoft.grpc.proto.demo1.TopicTwo.Builder.class);
  }

  public static final int TOPICID_FIELD_NUMBER = 1;
  private volatile java.lang.Object topicId_;
  /**
   * <code>string topicId = 1;</code>
   */
  public java.lang.String getTopicId() {
    java.lang.Object ref = topicId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicId_ = s;
      return s;
    }
  }
  /**
   * <code>string topicId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTopicIdBytes() {
    java.lang.Object ref = topicId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPICNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object topicName_;
  /**
   * <code>string topicName = 2;</code>
   */
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <code>string topicName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int YYY_FIELD_NUMBER = 3;
  private int yyy_;
  /**
   * <code>int32 yyy = 3;</code>
   */
  public int getYyy() {
    return yyy_;
  }

  public static final int BOOLTYPE_FIELD_NUMBER = 4;
  private boolean boolType_;
  /**
   * <code>bool boolType = 4;</code>
   */
  public boolean getBoolType() {
    return boolType_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTopicIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicId_);
    }
    if (!getTopicNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topicName_);
    }
    if (yyy_ != 0) {
      output.writeInt32(3, yyy_);
    }
    if (boolType_ != false) {
      output.writeBool(4, boolType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTopicIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topicId_);
    }
    if (!getTopicNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topicName_);
    }
    if (yyy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, yyy_);
    }
    if (boolType_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, boolType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.neusoft.grpc.proto.demo1.TopicTwo)) {
      return super.equals(obj);
    }
    com.neusoft.grpc.proto.demo1.TopicTwo other = (com.neusoft.grpc.proto.demo1.TopicTwo) obj;

    boolean result = true;
    result = result && getTopicId()
        .equals(other.getTopicId());
    result = result && getTopicName()
        .equals(other.getTopicName());
    result = result && (getYyy()
        == other.getYyy());
    result = result && (getBoolType()
        == other.getBoolType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOPICID_FIELD_NUMBER;
    hash = (53 * hash) + getTopicId().hashCode();
    hash = (37 * hash) + TOPICNAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (37 * hash) + YYY_FIELD_NUMBER;
    hash = (53 * hash) + getYyy();
    hash = (37 * hash) + BOOLTYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBoolType());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neusoft.grpc.proto.demo1.TopicTwo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.neusoft.grpc.proto.demo1.TopicTwo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *主题2
   * </pre>
   *
   * Protobuf type {@code TopicTwo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TopicTwo)
      com.neusoft.grpc.proto.demo1.TopicTwoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.neusoft.grpc.proto.demo1.ServicePushDemo.internal_static_TopicTwo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.neusoft.grpc.proto.demo1.ServicePushDemo.internal_static_TopicTwo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.neusoft.grpc.proto.demo1.TopicTwo.class, com.neusoft.grpc.proto.demo1.TopicTwo.Builder.class);
    }

    // Construct using com.neusoft.grpc.proto.demo1.TopicTwo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      topicId_ = "";

      topicName_ = "";

      yyy_ = 0;

      boolType_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.neusoft.grpc.proto.demo1.ServicePushDemo.internal_static_TopicTwo_descriptor;
    }

    public com.neusoft.grpc.proto.demo1.TopicTwo getDefaultInstanceForType() {
      return com.neusoft.grpc.proto.demo1.TopicTwo.getDefaultInstance();
    }

    public com.neusoft.grpc.proto.demo1.TopicTwo build() {
      com.neusoft.grpc.proto.demo1.TopicTwo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.neusoft.grpc.proto.demo1.TopicTwo buildPartial() {
      com.neusoft.grpc.proto.demo1.TopicTwo result = new com.neusoft.grpc.proto.demo1.TopicTwo(this);
      result.topicId_ = topicId_;
      result.topicName_ = topicName_;
      result.yyy_ = yyy_;
      result.boolType_ = boolType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.neusoft.grpc.proto.demo1.TopicTwo) {
        return mergeFrom((com.neusoft.grpc.proto.demo1.TopicTwo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.neusoft.grpc.proto.demo1.TopicTwo other) {
      if (other == com.neusoft.grpc.proto.demo1.TopicTwo.getDefaultInstance()) return this;
      if (!other.getTopicId().isEmpty()) {
        topicId_ = other.topicId_;
        onChanged();
      }
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        onChanged();
      }
      if (other.getYyy() != 0) {
        setYyy(other.getYyy());
      }
      if (other.getBoolType() != false) {
        setBoolType(other.getBoolType());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.neusoft.grpc.proto.demo1.TopicTwo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.neusoft.grpc.proto.demo1.TopicTwo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object topicId_ = "";
    /**
     * <code>string topicId = 1;</code>
     */
    public java.lang.String getTopicId() {
      java.lang.Object ref = topicId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topicId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicIdBytes() {
      java.lang.Object ref = topicId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topicId = 1;</code>
     */
    public Builder setTopicId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topicId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topicId = 1;</code>
     */
    public Builder clearTopicId() {
      
      topicId_ = getDefaultInstance().getTopicId();
      onChanged();
      return this;
    }
    /**
     * <code>string topicId = 1;</code>
     */
    public Builder setTopicIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topicId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object topicName_ = "";
    /**
     * <code>string topicName = 2;</code>
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public Builder setTopicName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topicName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public Builder clearTopicName() {
      
      topicName_ = getDefaultInstance().getTopicName();
      onChanged();
      return this;
    }
    /**
     * <code>string topicName = 2;</code>
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topicName_ = value;
      onChanged();
      return this;
    }

    private int yyy_ ;
    /**
     * <code>int32 yyy = 3;</code>
     */
    public int getYyy() {
      return yyy_;
    }
    /**
     * <code>int32 yyy = 3;</code>
     */
    public Builder setYyy(int value) {
      
      yyy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 yyy = 3;</code>
     */
    public Builder clearYyy() {
      
      yyy_ = 0;
      onChanged();
      return this;
    }

    private boolean boolType_ ;
    /**
     * <code>bool boolType = 4;</code>
     */
    public boolean getBoolType() {
      return boolType_;
    }
    /**
     * <code>bool boolType = 4;</code>
     */
    public Builder setBoolType(boolean value) {
      
      boolType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool boolType = 4;</code>
     */
    public Builder clearBoolType() {
      
      boolType_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:TopicTwo)
  }

  // @@protoc_insertion_point(class_scope:TopicTwo)
  private static final com.neusoft.grpc.proto.demo1.TopicTwo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.neusoft.grpc.proto.demo1.TopicTwo();
  }

  public static com.neusoft.grpc.proto.demo1.TopicTwo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicTwo>
      PARSER = new com.google.protobuf.AbstractParser<TopicTwo>() {
    public TopicTwo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TopicTwo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TopicTwo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicTwo> getParserForType() {
    return PARSER;
  }

  public com.neusoft.grpc.proto.demo1.TopicTwo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

