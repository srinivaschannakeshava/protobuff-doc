// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dealer.proto

package in.srini91.learn.protos.test;

public final class DealerOuterClass {
  private DealerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dealer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dealer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dealer_ModelEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dealer_ModelEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014dealer.proto\032\024common/address.proto\032\020co" +
      "mmon/car.proto\"\210\001\n\006Dealer\022!\n\005model\030\001 \003(\013" +
      "2\022.Dealer.ModelEntry\022 \n\007address\030\002 \001(\0132\017." +
      "common.Address\0329\n\nModelEntry\022\013\n\003key\030\001 \001(" +
      "\005\022\032\n\005value\030\002 \001(\0132\013.common.Car:\0028\001B \n\034in." +
      "srini91.learn.protos.testP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          in.srini91.learn.protos.test.common.AddressOuterClass.getDescriptor(),
          in.srini91.learn.protos.test.common.CarOuterClass.getDescriptor(),
        });
    internal_static_Dealer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Dealer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dealer_descriptor,
        new java.lang.String[] { "Model", "Address", });
    internal_static_Dealer_ModelEntry_descriptor =
      internal_static_Dealer_descriptor.getNestedTypes().get(0);
    internal_static_Dealer_ModelEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dealer_ModelEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    in.srini91.learn.protos.test.common.AddressOuterClass.getDescriptor();
    in.srini91.learn.protos.test.common.CarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
