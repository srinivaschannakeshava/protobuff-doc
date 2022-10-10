// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package in.srini91.learn.protos;

/**
 * Protobuf type {@code AddressBook}
 */
public final class AddressBook extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddressBook)
    AddressBookOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressBook.newBuilder() to construct.
  private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressBook() {
    employee_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressBook();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressBook(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              employee_ = new java.util.ArrayList<in.srini91.learn.protos.Employee>();
              mutable_bitField0_ |= 0x00000001;
            }
            employee_.add(
                input.readMessage(in.srini91.learn.protos.Employee.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        employee_ = java.util.Collections.unmodifiableList(employee_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.srini91.learn.protos.EmployeeOuterClass.internal_static_AddressBook_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.srini91.learn.protos.EmployeeOuterClass.internal_static_AddressBook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.srini91.learn.protos.AddressBook.class, in.srini91.learn.protos.AddressBook.Builder.class);
  }

  public static final int EMPLOYEE_FIELD_NUMBER = 1;
  private java.util.List<in.srini91.learn.protos.Employee> employee_;
  /**
   * <code>repeated .Employee employee = 1;</code>
   */
  @java.lang.Override
  public java.util.List<in.srini91.learn.protos.Employee> getEmployeeList() {
    return employee_;
  }
  /**
   * <code>repeated .Employee employee = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends in.srini91.learn.protos.EmployeeOrBuilder> 
      getEmployeeOrBuilderList() {
    return employee_;
  }
  /**
   * <code>repeated .Employee employee = 1;</code>
   */
  @java.lang.Override
  public int getEmployeeCount() {
    return employee_.size();
  }
  /**
   * <code>repeated .Employee employee = 1;</code>
   */
  @java.lang.Override
  public in.srini91.learn.protos.Employee getEmployee(int index) {
    return employee_.get(index);
  }
  /**
   * <code>repeated .Employee employee = 1;</code>
   */
  @java.lang.Override
  public in.srini91.learn.protos.EmployeeOrBuilder getEmployeeOrBuilder(
      int index) {
    return employee_.get(index);
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
    for (int i = 0; i < employee_.size(); i++) {
      output.writeMessage(1, employee_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < employee_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, employee_.get(i));
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
    if (!(obj instanceof in.srini91.learn.protos.AddressBook)) {
      return super.equals(obj);
    }
    in.srini91.learn.protos.AddressBook other = (in.srini91.learn.protos.AddressBook) obj;

    if (!getEmployeeList()
        .equals(other.getEmployeeList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEmployeeCount() > 0) {
      hash = (37 * hash) + EMPLOYEE_FIELD_NUMBER;
      hash = (53 * hash) + getEmployeeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static in.srini91.learn.protos.AddressBook parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static in.srini91.learn.protos.AddressBook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static in.srini91.learn.protos.AddressBook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static in.srini91.learn.protos.AddressBook parseFrom(
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
  public static Builder newBuilder(in.srini91.learn.protos.AddressBook prototype) {
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
   * Protobuf type {@code AddressBook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddressBook)
      in.srini91.learn.protos.AddressBookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.srini91.learn.protos.EmployeeOuterClass.internal_static_AddressBook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.srini91.learn.protos.EmployeeOuterClass.internal_static_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.srini91.learn.protos.AddressBook.class, in.srini91.learn.protos.AddressBook.Builder.class);
    }

    // Construct using in.srini91.learn.protos.AddressBook.newBuilder()
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
        getEmployeeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (employeeBuilder_ == null) {
        employee_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        employeeBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.srini91.learn.protos.EmployeeOuterClass.internal_static_AddressBook_descriptor;
    }

    @java.lang.Override
    public in.srini91.learn.protos.AddressBook getDefaultInstanceForType() {
      return in.srini91.learn.protos.AddressBook.getDefaultInstance();
    }

    @java.lang.Override
    public in.srini91.learn.protos.AddressBook build() {
      in.srini91.learn.protos.AddressBook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public in.srini91.learn.protos.AddressBook buildPartial() {
      in.srini91.learn.protos.AddressBook result = new in.srini91.learn.protos.AddressBook(this);
      int from_bitField0_ = bitField0_;
      if (employeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          employee_ = java.util.Collections.unmodifiableList(employee_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.employee_ = employee_;
      } else {
        result.employee_ = employeeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.srini91.learn.protos.AddressBook) {
        return mergeFrom((in.srini91.learn.protos.AddressBook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.srini91.learn.protos.AddressBook other) {
      if (other == in.srini91.learn.protos.AddressBook.getDefaultInstance()) return this;
      if (employeeBuilder_ == null) {
        if (!other.employee_.isEmpty()) {
          if (employee_.isEmpty()) {
            employee_ = other.employee_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEmployeeIsMutable();
            employee_.addAll(other.employee_);
          }
          onChanged();
        }
      } else {
        if (!other.employee_.isEmpty()) {
          if (employeeBuilder_.isEmpty()) {
            employeeBuilder_.dispose();
            employeeBuilder_ = null;
            employee_ = other.employee_;
            bitField0_ = (bitField0_ & ~0x00000001);
            employeeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEmployeeFieldBuilder() : null;
          } else {
            employeeBuilder_.addAllMessages(other.employee_);
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
      in.srini91.learn.protos.AddressBook parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.srini91.learn.protos.AddressBook) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<in.srini91.learn.protos.Employee> employee_ =
      java.util.Collections.emptyList();
    private void ensureEmployeeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        employee_ = new java.util.ArrayList<in.srini91.learn.protos.Employee>(employee_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        in.srini91.learn.protos.Employee, in.srini91.learn.protos.Employee.Builder, in.srini91.learn.protos.EmployeeOrBuilder> employeeBuilder_;

    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public java.util.List<in.srini91.learn.protos.Employee> getEmployeeList() {
      if (employeeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(employee_);
      } else {
        return employeeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public int getEmployeeCount() {
      if (employeeBuilder_ == null) {
        return employee_.size();
      } else {
        return employeeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public in.srini91.learn.protos.Employee getEmployee(int index) {
      if (employeeBuilder_ == null) {
        return employee_.get(index);
      } else {
        return employeeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder setEmployee(
        int index, in.srini91.learn.protos.Employee value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmployeeIsMutable();
        employee_.set(index, value);
        onChanged();
      } else {
        employeeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder setEmployee(
        int index, in.srini91.learn.protos.Employee.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.set(index, builderForValue.build());
        onChanged();
      } else {
        employeeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder addEmployee(in.srini91.learn.protos.Employee value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmployeeIsMutable();
        employee_.add(value);
        onChanged();
      } else {
        employeeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder addEmployee(
        int index, in.srini91.learn.protos.Employee value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmployeeIsMutable();
        employee_.add(index, value);
        onChanged();
      } else {
        employeeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder addEmployee(
        in.srini91.learn.protos.Employee.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.add(builderForValue.build());
        onChanged();
      } else {
        employeeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder addEmployee(
        int index, in.srini91.learn.protos.Employee.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.add(index, builderForValue.build());
        onChanged();
      } else {
        employeeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder addAllEmployee(
        java.lang.Iterable<? extends in.srini91.learn.protos.Employee> values) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, employee_);
        onChanged();
      } else {
        employeeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder clearEmployee() {
      if (employeeBuilder_ == null) {
        employee_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        employeeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public Builder removeEmployee(int index) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.remove(index);
        onChanged();
      } else {
        employeeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public in.srini91.learn.protos.Employee.Builder getEmployeeBuilder(
        int index) {
      return getEmployeeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public in.srini91.learn.protos.EmployeeOrBuilder getEmployeeOrBuilder(
        int index) {
      if (employeeBuilder_ == null) {
        return employee_.get(index);  } else {
        return employeeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public java.util.List<? extends in.srini91.learn.protos.EmployeeOrBuilder> 
         getEmployeeOrBuilderList() {
      if (employeeBuilder_ != null) {
        return employeeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(employee_);
      }
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public in.srini91.learn.protos.Employee.Builder addEmployeeBuilder() {
      return getEmployeeFieldBuilder().addBuilder(
          in.srini91.learn.protos.Employee.getDefaultInstance());
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public in.srini91.learn.protos.Employee.Builder addEmployeeBuilder(
        int index) {
      return getEmployeeFieldBuilder().addBuilder(
          index, in.srini91.learn.protos.Employee.getDefaultInstance());
    }
    /**
     * <code>repeated .Employee employee = 1;</code>
     */
    public java.util.List<in.srini91.learn.protos.Employee.Builder> 
         getEmployeeBuilderList() {
      return getEmployeeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        in.srini91.learn.protos.Employee, in.srini91.learn.protos.Employee.Builder, in.srini91.learn.protos.EmployeeOrBuilder> 
        getEmployeeFieldBuilder() {
      if (employeeBuilder_ == null) {
        employeeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            in.srini91.learn.protos.Employee, in.srini91.learn.protos.Employee.Builder, in.srini91.learn.protos.EmployeeOrBuilder>(
                employee_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        employee_ = null;
      }
      return employeeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AddressBook)
  }

  // @@protoc_insertion_point(class_scope:AddressBook)
  private static final in.srini91.learn.protos.AddressBook DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.srini91.learn.protos.AddressBook();
  }

  public static in.srini91.learn.protos.AddressBook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressBook>
      PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
    @java.lang.Override
    public AddressBook parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressBook(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressBook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressBook> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public in.srini91.learn.protos.AddressBook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
