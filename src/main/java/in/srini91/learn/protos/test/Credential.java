// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credential.proto

package in.srini91.learn.protos.test;

public final class Credential {
  private Credential() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmailCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmailCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PhoneCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PhoneCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Credentials_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Credentials_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020credential.proto\"-\n\017EmailCredential\022\r\n" +
      "\005email\030\001 \001(\t\022\013\n\003pwd\030\002 \001(\t\"/\n\017PhoneCreden" +
      "tial\022\017\n\007phoneNo\030\001 \001(\005\022\013\n\003otp\030\002 \001(\005\"c\n\013Cr" +
      "edentials\022%\n\temailMode\030\001 \001(\0132\020.EmailCred" +
      "entialH\000\022%\n\tphoneMode\030\002 \001(\0132\020.PhoneCrede" +
      "ntialH\000B\006\n\004modeB \n\034in.srini91.learn.prot" +
      "os.testP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EmailCredential_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EmailCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmailCredential_descriptor,
        new java.lang.String[] { "Email", "Pwd", });
    internal_static_PhoneCredential_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PhoneCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PhoneCredential_descriptor,
        new java.lang.String[] { "PhoneNo", "Otp", });
    internal_static_Credentials_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Credentials_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Credentials_descriptor,
        new java.lang.String[] { "EmailMode", "PhoneMode", "Mode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}