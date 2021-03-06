/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-11-07")
public class ImportErrorUserEmployee implements org.apache.thrift.TBase<ImportErrorUserEmployee, ImportErrorUserEmployee._Fields>, java.io.Serializable, Cloneable, Comparable<ImportErrorUserEmployee> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ImportErrorUserEmployee");

  private static final org.apache.thrift.protocol.TField ROW_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("rowNum", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_EMPLOYEE_DO_FIELD_DESC = new org.apache.thrift.protocol.TField("userEmployeeDO", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ImportErrorUserEmployeeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ImportErrorUserEmployeeTupleSchemeFactory();

  public int rowNum; // optional
  public java.lang.String message; // optional
  public com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO userEmployeeDO; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW_NUM((short)1, "rowNum"),
    MESSAGE((short)2, "message"),
    USER_EMPLOYEE_DO((short)3, "userEmployeeDO");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW_NUM
          return ROW_NUM;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // USER_EMPLOYEE_DO
          return USER_EMPLOYEE_DO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ROWNUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ROW_NUM,_Fields.MESSAGE,_Fields.USER_EMPLOYEE_DO};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW_NUM, new org.apache.thrift.meta_data.FieldMetaData("rowNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_EMPLOYEE_DO, new org.apache.thrift.meta_data.FieldMetaData("userEmployeeDO", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ImportErrorUserEmployee.class, metaDataMap);
  }

  public ImportErrorUserEmployee() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ImportErrorUserEmployee(ImportErrorUserEmployee other) {
    __isset_bitfield = other.__isset_bitfield;
    this.rowNum = other.rowNum;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetUserEmployeeDO()) {
      this.userEmployeeDO = new com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO(other.userEmployeeDO);
    }
  }

  public ImportErrorUserEmployee deepCopy() {
    return new ImportErrorUserEmployee(this);
  }

  @Override
  public void clear() {
    setRowNumIsSet(false);
    this.rowNum = 0;
    this.message = null;
    this.userEmployeeDO = null;
  }

  public int getRowNum() {
    return this.rowNum;
  }

  public ImportErrorUserEmployee setRowNum(int rowNum) {
    this.rowNum = rowNum;
    setRowNumIsSet(true);
    return this;
  }

  public void unsetRowNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ROWNUM_ISSET_ID);
  }

  /** Returns true if field rowNum is set (has been assigned a value) and false otherwise */
  public boolean isSetRowNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ROWNUM_ISSET_ID);
  }

  public void setRowNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ROWNUM_ISSET_ID, value);
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public ImportErrorUserEmployee setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO getUserEmployeeDO() {
    return this.userEmployeeDO;
  }

  public ImportErrorUserEmployee setUserEmployeeDO(com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO userEmployeeDO) {
    this.userEmployeeDO = userEmployeeDO;
    return this;
  }

  public void unsetUserEmployeeDO() {
    this.userEmployeeDO = null;
  }

  /** Returns true if field userEmployeeDO is set (has been assigned a value) and false otherwise */
  public boolean isSetUserEmployeeDO() {
    return this.userEmployeeDO != null;
  }

  public void setUserEmployeeDOIsSet(boolean value) {
    if (!value) {
      this.userEmployeeDO = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ROW_NUM:
      if (value == null) {
        unsetRowNum();
      } else {
        setRowNum((java.lang.Integer)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    case USER_EMPLOYEE_DO:
      if (value == null) {
        unsetUserEmployeeDO();
      } else {
        setUserEmployeeDO((com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW_NUM:
      return getRowNum();

    case MESSAGE:
      return getMessage();

    case USER_EMPLOYEE_DO:
      return getUserEmployeeDO();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ROW_NUM:
      return isSetRowNum();
    case MESSAGE:
      return isSetMessage();
    case USER_EMPLOYEE_DO:
      return isSetUserEmployeeDO();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ImportErrorUserEmployee)
      return this.equals((ImportErrorUserEmployee)that);
    return false;
  }

  public boolean equals(ImportErrorUserEmployee that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_rowNum = true && this.isSetRowNum();
    boolean that_present_rowNum = true && that.isSetRowNum();
    if (this_present_rowNum || that_present_rowNum) {
      if (!(this_present_rowNum && that_present_rowNum))
        return false;
      if (this.rowNum != that.rowNum)
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_userEmployeeDO = true && this.isSetUserEmployeeDO();
    boolean that_present_userEmployeeDO = true && that.isSetUserEmployeeDO();
    if (this_present_userEmployeeDO || that_present_userEmployeeDO) {
      if (!(this_present_userEmployeeDO && that_present_userEmployeeDO))
        return false;
      if (!this.userEmployeeDO.equals(that.userEmployeeDO))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRowNum()) ? 131071 : 524287);
    if (isSetRowNum())
      hashCode = hashCode * 8191 + rowNum;

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserEmployeeDO()) ? 131071 : 524287);
    if (isSetUserEmployeeDO())
      hashCode = hashCode * 8191 + userEmployeeDO.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ImportErrorUserEmployee other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRowNum()).compareTo(other.isSetRowNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowNum, other.rowNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserEmployeeDO()).compareTo(other.isSetUserEmployeeDO());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserEmployeeDO()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userEmployeeDO, other.userEmployeeDO);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ImportErrorUserEmployee(");
    boolean first = true;

    if (isSetRowNum()) {
      sb.append("rowNum:");
      sb.append(this.rowNum);
      first = false;
    }
    if (isSetMessage()) {
      if (!first) sb.append(", ");
      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        sb.append(this.message);
      }
      first = false;
    }
    if (isSetUserEmployeeDO()) {
      if (!first) sb.append(", ");
      sb.append("userEmployeeDO:");
      if (this.userEmployeeDO == null) {
        sb.append("null");
      } else {
        sb.append(this.userEmployeeDO);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (userEmployeeDO != null) {
      userEmployeeDO.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ImportErrorUserEmployeeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ImportErrorUserEmployeeStandardScheme getScheme() {
      return new ImportErrorUserEmployeeStandardScheme();
    }
  }

  private static class ImportErrorUserEmployeeStandardScheme extends org.apache.thrift.scheme.StandardScheme<ImportErrorUserEmployee> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ImportErrorUserEmployee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rowNum = iprot.readI32();
              struct.setRowNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_EMPLOYEE_DO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.userEmployeeDO = new com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO();
              struct.userEmployeeDO.read(iprot);
              struct.setUserEmployeeDOIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ImportErrorUserEmployee struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetRowNum()) {
        oprot.writeFieldBegin(ROW_NUM_FIELD_DESC);
        oprot.writeI32(struct.rowNum);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        if (struct.isSetMessage()) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeString(struct.message);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userEmployeeDO != null) {
        if (struct.isSetUserEmployeeDO()) {
          oprot.writeFieldBegin(USER_EMPLOYEE_DO_FIELD_DESC);
          struct.userEmployeeDO.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ImportErrorUserEmployeeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ImportErrorUserEmployeeTupleScheme getScheme() {
      return new ImportErrorUserEmployeeTupleScheme();
    }
  }

  private static class ImportErrorUserEmployeeTupleScheme extends org.apache.thrift.scheme.TupleScheme<ImportErrorUserEmployee> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ImportErrorUserEmployee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRowNum()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetUserEmployeeDO()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRowNum()) {
        oprot.writeI32(struct.rowNum);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetUserEmployeeDO()) {
        struct.userEmployeeDO.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ImportErrorUserEmployee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.rowNum = iprot.readI32();
        struct.setRowNumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.userEmployeeDO = new com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO();
        struct.userEmployeeDO.read(iprot);
        struct.setUserEmployeeDOIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

