// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package in.srini91.learn.protos.test;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\032\024common/address.proto\032\020co" +
      "mmon/car.proto\"_\n\006Person\022\014\n\004name\030\001 \001(\t\022\013" +
      "\n\003age\030\002 \001(\005\022 \n\007address\030\003 \001(\0132\017.common.Ad" +
      "dress\022\030\n\003car\030\004 \003(\0132\013.common.CarB \n\034in.sr" +
      "ini91.learn.protos.testP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          in.srini91.learn.protos.test.common.AddressOuterClass.getDescriptor(),
          in.srini91.learn.protos.test.common.CarOuterClass.getDescriptor(),
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Address", "Car", });
    in.srini91.learn.protos.test.common.AddressOuterClass.getDescriptor();
    in.srini91.learn.protos.test.common.CarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
