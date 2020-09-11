// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: supplier.proto

package com.order.generated.stubs;

public final class Supplier {
  private Supplier() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupplierHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupplierHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupplierHistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupplierHistoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupplierHistory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupplierHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupplierDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupplierDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Address_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016supplier.proto\",\n\026SupplierHistoryReque" +
      "st\022\022\n\nsupplierId\030\001 \001(\t\"=\n\027SupplierHistor" +
      "yResponse\022\"\n\010suppHist\030\001 \003(\0132\020.SupplierHi" +
      "story\"5\n\017SupplierHistory\022\"\n\010supplier\030\001 \001" +
      "(\0132\020.SupplierDetails\"V\n\017SupplierDetails\022" +
      "\022\n\nsupplierId\030\001 \001(\t\022\024\n\014supplierName\030\002 \001(" +
      "\t\022\031\n\007address\030\003 \003(\0132\010.Address\"B\n\007Address\022" +
      "\023\n\013addressType\030\001 \001(\t\022\023\n\013houseNumber\030\002 \001(" +
      "\t\022\r\n\005phone\030\003 \001(\0032Y\n\017SupplierService\022F\n\017S" +
      "upplierHistory\022\027.SupplierHistoryRequest\032" +
      "\030.SupplierHistoryResponse\"\000B\035\n\031com.order" +
      ".generated.stubsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SupplierHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SupplierHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupplierHistoryRequest_descriptor,
        new java.lang.String[] { "SupplierId", });
    internal_static_SupplierHistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SupplierHistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupplierHistoryResponse_descriptor,
        new java.lang.String[] { "SuppHist", });
    internal_static_SupplierHistory_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SupplierHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupplierHistory_descriptor,
        new java.lang.String[] { "Supplier", });
    internal_static_SupplierDetails_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SupplierDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupplierDetails_descriptor,
        new java.lang.String[] { "SupplierId", "SupplierName", "Address", });
    internal_static_Address_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Address_descriptor,
        new java.lang.String[] { "AddressType", "HouseNumber", "Phone", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}