// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package in.srini91.learn.protos;

public final class EmployeeOuterClass {
  private EmployeeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Employee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Employee_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Employee_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016employee.proto\"\220\002\n\010Employee\022\021\n\004name\030\001 " +
      "\001(\tH\000\210\001\001\022\017\n\002id\030\002 \001(\005H\001\210\001\001\022\022\n\005email\030\003 \001(\t" +
      "H\002\210\001\001\022%\n\006phones\030\004 \003(\0132\025.Employee.PhoneNu" +
      "mber\032^\n\013PhoneNumber\022\023\n\006number\030\001 \001(\tH\000\210\001\001" +
      "\022&\n\004type\030\002 \001(\0162\023.Employee.PhoneTypeH\001\210\001\001" +
      "B\t\n\007_numberB\007\n\005_type\"+\n\tPhoneType\022\n\n\006MOB" +
      "ILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002B\007\n\005_nameB\005\n\003_i" +
      "dB\010\n\006_email\"*\n\013AddressBook\022\033\n\010employee\030\001" +
      " \003(\0132\t.EmployeeB\033\n\027in.srini91.learn.prot" +
      "osP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Employee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Employee_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "Name", "Id", "Email", });
    internal_static_Employee_PhoneNumber_descriptor =
      internal_static_Employee_descriptor.getNestedTypes().get(0);
    internal_static_Employee_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Employee_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", "Number", "Type", });
    internal_static_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddressBook_descriptor,
        new java.lang.String[] { "Employee", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
