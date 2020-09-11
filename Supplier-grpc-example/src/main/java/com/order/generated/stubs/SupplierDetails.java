// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: supplier.proto

package com.order.generated.stubs;

/**
 * Protobuf type {@code SupplierDetails}
 */
public  final class SupplierDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SupplierDetails)
    SupplierDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SupplierDetails.newBuilder() to construct.
  private SupplierDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SupplierDetails() {
    supplierId_ = "";
    supplierName_ = "";
    address_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SupplierDetails(
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

            supplierId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            supplierName_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              address_ = new java.util.ArrayList<com.order.generated.stubs.Address>();
              mutable_bitField0_ |= 0x00000004;
            }
            address_.add(
                input.readMessage(com.order.generated.stubs.Address.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        address_ = java.util.Collections.unmodifiableList(address_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.order.generated.stubs.Supplier.internal_static_SupplierDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.order.generated.stubs.Supplier.internal_static_SupplierDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.order.generated.stubs.SupplierDetails.class, com.order.generated.stubs.SupplierDetails.Builder.class);
  }

  private int bitField0_;
  public static final int SUPPLIERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object supplierId_;
  /**
   * <code>string supplierId = 1;</code>
   */
  public java.lang.String getSupplierId() {
    java.lang.Object ref = supplierId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      supplierId_ = s;
      return s;
    }
  }
  /**
   * <code>string supplierId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSupplierIdBytes() {
    java.lang.Object ref = supplierId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      supplierId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUPPLIERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object supplierName_;
  /**
   * <code>string supplierName = 2;</code>
   */
  public java.lang.String getSupplierName() {
    java.lang.Object ref = supplierName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      supplierName_ = s;
      return s;
    }
  }
  /**
   * <code>string supplierName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSupplierNameBytes() {
    java.lang.Object ref = supplierName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      supplierName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private java.util.List<com.order.generated.stubs.Address> address_;
  /**
   * <code>repeated .Address address = 3;</code>
   */
  public java.util.List<com.order.generated.stubs.Address> getAddressList() {
    return address_;
  }
  /**
   * <code>repeated .Address address = 3;</code>
   */
  public java.util.List<? extends com.order.generated.stubs.AddressOrBuilder> 
      getAddressOrBuilderList() {
    return address_;
  }
  /**
   * <code>repeated .Address address = 3;</code>
   */
  public int getAddressCount() {
    return address_.size();
  }
  /**
   * <code>repeated .Address address = 3;</code>
   */
  public com.order.generated.stubs.Address getAddress(int index) {
    return address_.get(index);
  }
  /**
   * <code>repeated .Address address = 3;</code>
   */
  public com.order.generated.stubs.AddressOrBuilder getAddressOrBuilder(
      int index) {
    return address_.get(index);
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
    if (!getSupplierIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, supplierId_);
    }
    if (!getSupplierNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, supplierName_);
    }
    for (int i = 0; i < address_.size(); i++) {
      output.writeMessage(3, address_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSupplierIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, supplierId_);
    }
    if (!getSupplierNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, supplierName_);
    }
    for (int i = 0; i < address_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, address_.get(i));
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
    if (!(obj instanceof com.order.generated.stubs.SupplierDetails)) {
      return super.equals(obj);
    }
    com.order.generated.stubs.SupplierDetails other = (com.order.generated.stubs.SupplierDetails) obj;

    boolean result = true;
    result = result && getSupplierId()
        .equals(other.getSupplierId());
    result = result && getSupplierName()
        .equals(other.getSupplierName());
    result = result && getAddressList()
        .equals(other.getAddressList());
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
    hash = (37 * hash) + SUPPLIERID_FIELD_NUMBER;
    hash = (53 * hash) + getSupplierId().hashCode();
    hash = (37 * hash) + SUPPLIERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getSupplierName().hashCode();
    if (getAddressCount() > 0) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddressList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.order.generated.stubs.SupplierDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.order.generated.stubs.SupplierDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.SupplierDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.SupplierDetails parseFrom(
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
  public static Builder newBuilder(com.order.generated.stubs.SupplierDetails prototype) {
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
   * Protobuf type {@code SupplierDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SupplierDetails)
      com.order.generated.stubs.SupplierDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.order.generated.stubs.Supplier.internal_static_SupplierDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.order.generated.stubs.Supplier.internal_static_SupplierDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.order.generated.stubs.SupplierDetails.class, com.order.generated.stubs.SupplierDetails.Builder.class);
    }

    // Construct using com.order.generated.stubs.SupplierDetails.newBuilder()
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
        getAddressFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      supplierId_ = "";

      supplierName_ = "";

      if (addressBuilder_ == null) {
        address_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        addressBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.order.generated.stubs.Supplier.internal_static_SupplierDetails_descriptor;
    }

    @java.lang.Override
    public com.order.generated.stubs.SupplierDetails getDefaultInstanceForType() {
      return com.order.generated.stubs.SupplierDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.order.generated.stubs.SupplierDetails build() {
      com.order.generated.stubs.SupplierDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.order.generated.stubs.SupplierDetails buildPartial() {
      com.order.generated.stubs.SupplierDetails result = new com.order.generated.stubs.SupplierDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.supplierId_ = supplierId_;
      result.supplierName_ = supplierName_;
      if (addressBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          address_ = java.util.Collections.unmodifiableList(address_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.order.generated.stubs.SupplierDetails) {
        return mergeFrom((com.order.generated.stubs.SupplierDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.order.generated.stubs.SupplierDetails other) {
      if (other == com.order.generated.stubs.SupplierDetails.getDefaultInstance()) return this;
      if (!other.getSupplierId().isEmpty()) {
        supplierId_ = other.supplierId_;
        onChanged();
      }
      if (!other.getSupplierName().isEmpty()) {
        supplierName_ = other.supplierName_;
        onChanged();
      }
      if (addressBuilder_ == null) {
        if (!other.address_.isEmpty()) {
          if (address_.isEmpty()) {
            address_ = other.address_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAddressIsMutable();
            address_.addAll(other.address_);
          }
          onChanged();
        }
      } else {
        if (!other.address_.isEmpty()) {
          if (addressBuilder_.isEmpty()) {
            addressBuilder_.dispose();
            addressBuilder_ = null;
            address_ = other.address_;
            bitField0_ = (bitField0_ & ~0x00000004);
            addressBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAddressFieldBuilder() : null;
          } else {
            addressBuilder_.addAllMessages(other.address_);
          }
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
      com.order.generated.stubs.SupplierDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.order.generated.stubs.SupplierDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object supplierId_ = "";
    /**
     * <code>string supplierId = 1;</code>
     */
    public java.lang.String getSupplierId() {
      java.lang.Object ref = supplierId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        supplierId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string supplierId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSupplierIdBytes() {
      java.lang.Object ref = supplierId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        supplierId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string supplierId = 1;</code>
     */
    public Builder setSupplierId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      supplierId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string supplierId = 1;</code>
     */
    public Builder clearSupplierId() {
      
      supplierId_ = getDefaultInstance().getSupplierId();
      onChanged();
      return this;
    }
    /**
     * <code>string supplierId = 1;</code>
     */
    public Builder setSupplierIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      supplierId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object supplierName_ = "";
    /**
     * <code>string supplierName = 2;</code>
     */
    public java.lang.String getSupplierName() {
      java.lang.Object ref = supplierName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        supplierName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string supplierName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSupplierNameBytes() {
      java.lang.Object ref = supplierName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        supplierName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string supplierName = 2;</code>
     */
    public Builder setSupplierName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      supplierName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string supplierName = 2;</code>
     */
    public Builder clearSupplierName() {
      
      supplierName_ = getDefaultInstance().getSupplierName();
      onChanged();
      return this;
    }
    /**
     * <code>string supplierName = 2;</code>
     */
    public Builder setSupplierNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      supplierName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.order.generated.stubs.Address> address_ =
      java.util.Collections.emptyList();
    private void ensureAddressIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        address_ = new java.util.ArrayList<com.order.generated.stubs.Address>(address_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.order.generated.stubs.Address, com.order.generated.stubs.Address.Builder, com.order.generated.stubs.AddressOrBuilder> addressBuilder_;

    /**
     * <code>repeated .Address address = 3;</code>
     */
    public java.util.List<com.order.generated.stubs.Address> getAddressList() {
      if (addressBuilder_ == null) {
        return java.util.Collections.unmodifiableList(address_);
      } else {
        return addressBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public int getAddressCount() {
      if (addressBuilder_ == null) {
        return address_.size();
      } else {
        return addressBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public com.order.generated.stubs.Address getAddress(int index) {
      if (addressBuilder_ == null) {
        return address_.get(index);
      } else {
        return addressBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder setAddress(
        int index, com.order.generated.stubs.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIsMutable();
        address_.set(index, value);
        onChanged();
      } else {
        addressBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder setAddress(
        int index, com.order.generated.stubs.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.set(index, builderForValue.build());
        onChanged();
      } else {
        addressBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder addAddress(com.order.generated.stubs.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIsMutable();
        address_.add(value);
        onChanged();
      } else {
        addressBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder addAddress(
        int index, com.order.generated.stubs.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIsMutable();
        address_.add(index, value);
        onChanged();
      } else {
        addressBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder addAddress(
        com.order.generated.stubs.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.add(builderForValue.build());
        onChanged();
      } else {
        addressBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder addAddress(
        int index, com.order.generated.stubs.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.add(index, builderForValue.build());
        onChanged();
      } else {
        addressBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder addAllAddress(
        java.lang.Iterable<? extends com.order.generated.stubs.Address> values) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, address_);
        onChanged();
      } else {
        addressBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        addressBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public Builder removeAddress(int index) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.remove(index);
        onChanged();
      } else {
        addressBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public com.order.generated.stubs.Address.Builder getAddressBuilder(
        int index) {
      return getAddressFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public com.order.generated.stubs.AddressOrBuilder getAddressOrBuilder(
        int index) {
      if (addressBuilder_ == null) {
        return address_.get(index);  } else {
        return addressBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public java.util.List<? extends com.order.generated.stubs.AddressOrBuilder> 
         getAddressOrBuilderList() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(address_);
      }
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public com.order.generated.stubs.Address.Builder addAddressBuilder() {
      return getAddressFieldBuilder().addBuilder(
          com.order.generated.stubs.Address.getDefaultInstance());
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public com.order.generated.stubs.Address.Builder addAddressBuilder(
        int index) {
      return getAddressFieldBuilder().addBuilder(
          index, com.order.generated.stubs.Address.getDefaultInstance());
    }
    /**
     * <code>repeated .Address address = 3;</code>
     */
    public java.util.List<com.order.generated.stubs.Address.Builder> 
         getAddressBuilderList() {
      return getAddressFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.order.generated.stubs.Address, com.order.generated.stubs.Address.Builder, com.order.generated.stubs.AddressOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.order.generated.stubs.Address, com.order.generated.stubs.Address.Builder, com.order.generated.stubs.AddressOrBuilder>(
                address_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SupplierDetails)
  }

  // @@protoc_insertion_point(class_scope:SupplierDetails)
  private static final com.order.generated.stubs.SupplierDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.order.generated.stubs.SupplierDetails();
  }

  public static com.order.generated.stubs.SupplierDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupplierDetails>
      PARSER = new com.google.protobuf.AbstractParser<SupplierDetails>() {
    @java.lang.Override
    public SupplierDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SupplierDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SupplierDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupplierDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.order.generated.stubs.SupplierDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
