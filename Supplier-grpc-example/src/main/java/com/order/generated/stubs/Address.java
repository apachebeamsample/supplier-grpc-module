// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: supplier.proto

package com.order.generated.stubs;

/**
 * Protobuf type {@code Address}
 */
public  final class Address extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Address)
    AddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Address.newBuilder() to construct.
  private Address(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Address() {
    addressType_ = "";
    houseNumber_ = "";
    phone_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Address(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            addressType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            houseNumber_ = s;
            break;
          }
          case 24: {

            phone_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.order.generated.stubs.Supplier.internal_static_Address_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.order.generated.stubs.Supplier.internal_static_Address_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.order.generated.stubs.Address.class, com.order.generated.stubs.Address.Builder.class);
  }

  public static final int ADDRESSTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object addressType_;
  /**
   * <code>string addressType = 1;</code>
   */
  public java.lang.String getAddressType() {
    java.lang.Object ref = addressType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addressType_ = s;
      return s;
    }
  }
  /**
   * <code>string addressType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddressTypeBytes() {
    java.lang.Object ref = addressType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addressType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOUSENUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object houseNumber_;
  /**
   * <code>string houseNumber = 2;</code>
   */
  public java.lang.String getHouseNumber() {
    java.lang.Object ref = houseNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      houseNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string houseNumber = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHouseNumberBytes() {
    java.lang.Object ref = houseNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      houseNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_FIELD_NUMBER = 3;
  private long phone_;
  /**
   * <code>int64 phone = 3;</code>
   */
  public long getPhone() {
    return phone_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAddressTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addressType_);
    }
    if (!getHouseNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, houseNumber_);
    }
    if (phone_ != 0L) {
      output.writeInt64(3, phone_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddressTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addressType_);
    }
    if (!getHouseNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, houseNumber_);
    }
    if (phone_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, phone_);
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
    if (!(obj instanceof com.order.generated.stubs.Address)) {
      return super.equals(obj);
    }
    com.order.generated.stubs.Address other = (com.order.generated.stubs.Address) obj;

    boolean result = true;
    result = result && getAddressType()
        .equals(other.getAddressType());
    result = result && getHouseNumber()
        .equals(other.getHouseNumber());
    result = result && (getPhone()
        == other.getPhone());
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
    hash = (37 * hash) + ADDRESSTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAddressType().hashCode();
    hash = (37 * hash) + HOUSENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getHouseNumber().hashCode();
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPhone());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.order.generated.stubs.Address parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.Address parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.Address parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.Address parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.Address parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.Address parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.Address parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.Address parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.order.generated.stubs.Address parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.Address parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.order.generated.stubs.Address parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.Address parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.order.generated.stubs.Address prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Address}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Address)
      com.order.generated.stubs.AddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.order.generated.stubs.Supplier.internal_static_Address_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.order.generated.stubs.Supplier.internal_static_Address_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.order.generated.stubs.Address.class, com.order.generated.stubs.Address.Builder.class);
    }

    // Construct using com.order.generated.stubs.Address.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      addressType_ = "";

      houseNumber_ = "";

      phone_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.order.generated.stubs.Supplier.internal_static_Address_descriptor;
    }

    @java.lang.Override
    public com.order.generated.stubs.Address getDefaultInstanceForType() {
      return com.order.generated.stubs.Address.getDefaultInstance();
    }

    @java.lang.Override
    public com.order.generated.stubs.Address build() {
      com.order.generated.stubs.Address result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.order.generated.stubs.Address buildPartial() {
      com.order.generated.stubs.Address result = new com.order.generated.stubs.Address(this);
      result.addressType_ = addressType_;
      result.houseNumber_ = houseNumber_;
      result.phone_ = phone_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.order.generated.stubs.Address) {
        return mergeFrom((com.order.generated.stubs.Address)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.order.generated.stubs.Address other) {
      if (other == com.order.generated.stubs.Address.getDefaultInstance()) return this;
      if (!other.getAddressType().isEmpty()) {
        addressType_ = other.addressType_;
        onChanged();
      }
      if (!other.getHouseNumber().isEmpty()) {
        houseNumber_ = other.houseNumber_;
        onChanged();
      }
      if (other.getPhone() != 0L) {
        setPhone(other.getPhone());
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
      com.order.generated.stubs.Address parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.order.generated.stubs.Address) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object addressType_ = "";
    /**
     * <code>string addressType = 1;</code>
     */
    public java.lang.String getAddressType() {
      java.lang.Object ref = addressType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addressType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string addressType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddressTypeBytes() {
      java.lang.Object ref = addressType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addressType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string addressType = 1;</code>
     */
    public Builder setAddressType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addressType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string addressType = 1;</code>
     */
    public Builder clearAddressType() {
      
      addressType_ = getDefaultInstance().getAddressType();
      onChanged();
      return this;
    }
    /**
     * <code>string addressType = 1;</code>
     */
    public Builder setAddressTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addressType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object houseNumber_ = "";
    /**
     * <code>string houseNumber = 2;</code>
     */
    public java.lang.String getHouseNumber() {
      java.lang.Object ref = houseNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        houseNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string houseNumber = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHouseNumberBytes() {
      java.lang.Object ref = houseNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        houseNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string houseNumber = 2;</code>
     */
    public Builder setHouseNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      houseNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string houseNumber = 2;</code>
     */
    public Builder clearHouseNumber() {
      
      houseNumber_ = getDefaultInstance().getHouseNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string houseNumber = 2;</code>
     */
    public Builder setHouseNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      houseNumber_ = value;
      onChanged();
      return this;
    }

    private long phone_ ;
    /**
     * <code>int64 phone = 3;</code>
     */
    public long getPhone() {
      return phone_;
    }
    /**
     * <code>int64 phone = 3;</code>
     */
    public Builder setPhone(long value) {
      
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 phone = 3;</code>
     */
    public Builder clearPhone() {
      
      phone_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Address)
  }

  // @@protoc_insertion_point(class_scope:Address)
  private static final com.order.generated.stubs.Address DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.order.generated.stubs.Address();
  }

  public static com.order.generated.stubs.Address getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Address>
      PARSER = new com.google.protobuf.AbstractParser<Address>() {
    @java.lang.Override
    public Address parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Address(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Address> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Address> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.order.generated.stubs.Address getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

