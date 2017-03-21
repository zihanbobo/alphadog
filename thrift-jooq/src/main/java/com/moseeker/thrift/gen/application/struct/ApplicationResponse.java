/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.application.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 重新封装更新职位申请
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-21")
public class ApplicationResponse implements org.apache.thrift.TBase<ApplicationResponse, ApplicationResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ApplicationResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ApplicationResponse");

  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("account_id", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ApplicationResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ApplicationResponseTupleSchemeFactory();

  public int company_id; // required
  public int account_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMPANY_ID((short)1, "company_id"),
    ACCOUNT_ID((short)2, "account_id");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

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
        case 1: // COMPANY_ID
          return COMPANY_ID;
        case 2: // ACCOUNT_ID
          return ACCOUNT_ID;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __COMPANY_ID_ISSET_ID = 0;
  private static final int __ACCOUNT_ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACCOUNT_ID, new org.apache.thrift.meta_data.FieldMetaData("account_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ApplicationResponse.class, metaDataMap);
  }

  public ApplicationResponse() {
  }

  public ApplicationResponse(
    int company_id,
    int account_id)
  {
    this();
    this.company_id = company_id;
    setCompany_idIsSet(true);
    this.account_id = account_id;
    setAccount_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ApplicationResponse(ApplicationResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.company_id = other.company_id;
    this.account_id = other.account_id;
  }

  public ApplicationResponse deepCopy() {
    return new ApplicationResponse(this);
  }

  @Override
  public void clear() {
    setCompany_idIsSet(false);
    this.company_id = 0;
    setAccount_idIsSet(false);
    this.account_id = 0;
  }

  public int getCompany_id() {
    return this.company_id;
  }

  public ApplicationResponse setCompany_id(int company_id) {
    this.company_id = company_id;
    setCompany_idIsSet(true);
    return this;
  }

  public void unsetCompany_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  /** Returns true if field company_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCompany_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  public void setCompany_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPANY_ID_ISSET_ID, value);
  }

  public int getAccount_id() {
    return this.account_id;
  }

  public ApplicationResponse setAccount_id(int account_id) {
    this.account_id = account_id;
    setAccount_idIsSet(true);
    return this;
  }

  public void unsetAccount_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ACCOUNT_ID_ISSET_ID);
  }

  /** Returns true if field account_id is set (has been assigned a value) and false otherwise */
  public boolean isSetAccount_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ACCOUNT_ID_ISSET_ID);
  }

  public void setAccount_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ACCOUNT_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMPANY_ID:
      if (value == null) {
        unsetCompany_id();
      } else {
        setCompany_id((Integer)value);
      }
      break;

    case ACCOUNT_ID:
      if (value == null) {
        unsetAccount_id();
      } else {
        setAccount_id((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPANY_ID:
      return getCompany_id();

    case ACCOUNT_ID:
      return getAccount_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMPANY_ID:
      return isSetCompany_id();
    case ACCOUNT_ID:
      return isSetAccount_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ApplicationResponse)
      return this.equals((ApplicationResponse)that);
    return false;
  }

  public boolean equals(ApplicationResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_company_id = true;
    boolean that_present_company_id = true;
    if (this_present_company_id || that_present_company_id) {
      if (!(this_present_company_id && that_present_company_id))
        return false;
      if (this.company_id != that.company_id)
        return false;
    }

    boolean this_present_account_id = true;
    boolean that_present_account_id = true;
    if (this_present_account_id || that_present_account_id) {
      if (!(this_present_account_id && that_present_account_id))
        return false;
      if (this.account_id != that.account_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + company_id;

    hashCode = hashCode * 8191 + account_id;

    return hashCode;
  }

  @Override
  public int compareTo(ApplicationResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCompany_id()).compareTo(other.isSetCompany_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompany_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.company_id, other.company_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccount_id()).compareTo(other.isSetAccount_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccount_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.account_id, other.account_id);
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
  public String toString() {
    StringBuilder sb = new StringBuilder("ApplicationResponse(");
    boolean first = true;

    sb.append("company_id:");
    sb.append(this.company_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("account_id:");
    sb.append(this.account_id);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ApplicationResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ApplicationResponseStandardScheme getScheme() {
      return new ApplicationResponseStandardScheme();
    }
  }

  private static class ApplicationResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<ApplicationResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ApplicationResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.company_id = iprot.readI32();
              struct.setCompany_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCOUNT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.account_id = iprot.readI32();
              struct.setAccount_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ApplicationResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
      oprot.writeI32(struct.company_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ACCOUNT_ID_FIELD_DESC);
      oprot.writeI32(struct.account_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ApplicationResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ApplicationResponseTupleScheme getScheme() {
      return new ApplicationResponseTupleScheme();
    }
  }

  private static class ApplicationResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<ApplicationResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ApplicationResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCompany_id()) {
        optionals.set(0);
      }
      if (struct.isSetAccount_id()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
      if (struct.isSetAccount_id()) {
        oprot.writeI32(struct.account_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ApplicationResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.account_id = iprot.readI32();
        struct.setAccount_idIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

