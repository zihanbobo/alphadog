/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-07-03")
public class UserEmployeeNumStatistic implements org.apache.thrift.TBase<UserEmployeeNumStatistic, UserEmployeeNumStatistic._Fields>, java.io.Serializable, Cloneable, Comparable<UserEmployeeNumStatistic> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserEmployeeNumStatistic");

  private static final org.apache.thrift.protocol.TField UNREGCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unregcount", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REGCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("regcount", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserEmployeeNumStatisticStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserEmployeeNumStatisticTupleSchemeFactory();

  public int unregcount; // optional
  public int regcount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UNREGCOUNT((short)1, "unregcount"),
    REGCOUNT((short)2, "regcount");

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
        case 1: // UNREGCOUNT
          return UNREGCOUNT;
        case 2: // REGCOUNT
          return REGCOUNT;
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
  private static final int __UNREGCOUNT_ISSET_ID = 0;
  private static final int __REGCOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.UNREGCOUNT,_Fields.REGCOUNT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UNREGCOUNT, new org.apache.thrift.meta_data.FieldMetaData("unregcount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REGCOUNT, new org.apache.thrift.meta_data.FieldMetaData("regcount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserEmployeeNumStatistic.class, metaDataMap);
  }

  public UserEmployeeNumStatistic() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserEmployeeNumStatistic(UserEmployeeNumStatistic other) {
    __isset_bitfield = other.__isset_bitfield;
    this.unregcount = other.unregcount;
    this.regcount = other.regcount;
  }

  public UserEmployeeNumStatistic deepCopy() {
    return new UserEmployeeNumStatistic(this);
  }

  @Override
  public void clear() {
    setUnregcountIsSet(false);
    this.unregcount = 0;
    setRegcountIsSet(false);
    this.regcount = 0;
  }

  public int getUnregcount() {
    return this.unregcount;
  }

  public UserEmployeeNumStatistic setUnregcount(int unregcount) {
    this.unregcount = unregcount;
    setUnregcountIsSet(true);
    return this;
  }

  public void unsetUnregcount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UNREGCOUNT_ISSET_ID);
  }

  /** Returns true if field unregcount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnregcount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UNREGCOUNT_ISSET_ID);
  }

  public void setUnregcountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UNREGCOUNT_ISSET_ID, value);
  }

  public int getRegcount() {
    return this.regcount;
  }

  public UserEmployeeNumStatistic setRegcount(int regcount) {
    this.regcount = regcount;
    setRegcountIsSet(true);
    return this;
  }

  public void unsetRegcount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REGCOUNT_ISSET_ID);
  }

  /** Returns true if field regcount is set (has been assigned a value) and false otherwise */
  public boolean isSetRegcount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REGCOUNT_ISSET_ID);
  }

  public void setRegcountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REGCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UNREGCOUNT:
      if (value == null) {
        unsetUnregcount();
      } else {
        setUnregcount((Integer)value);
      }
      break;

    case REGCOUNT:
      if (value == null) {
        unsetRegcount();
      } else {
        setRegcount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UNREGCOUNT:
      return getUnregcount();

    case REGCOUNT:
      return getRegcount();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UNREGCOUNT:
      return isSetUnregcount();
    case REGCOUNT:
      return isSetRegcount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserEmployeeNumStatistic)
      return this.equals((UserEmployeeNumStatistic)that);
    return false;
  }

  public boolean equals(UserEmployeeNumStatistic that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_unregcount = true && this.isSetUnregcount();
    boolean that_present_unregcount = true && that.isSetUnregcount();
    if (this_present_unregcount || that_present_unregcount) {
      if (!(this_present_unregcount && that_present_unregcount))
        return false;
      if (this.unregcount != that.unregcount)
        return false;
    }

    boolean this_present_regcount = true && this.isSetRegcount();
    boolean that_present_regcount = true && that.isSetRegcount();
    if (this_present_regcount || that_present_regcount) {
      if (!(this_present_regcount && that_present_regcount))
        return false;
      if (this.regcount != that.regcount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUnregcount()) ? 131071 : 524287);
    if (isSetUnregcount())
      hashCode = hashCode * 8191 + unregcount;

    hashCode = hashCode * 8191 + ((isSetRegcount()) ? 131071 : 524287);
    if (isSetRegcount())
      hashCode = hashCode * 8191 + regcount;

    return hashCode;
  }

  @Override
  public int compareTo(UserEmployeeNumStatistic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUnregcount()).compareTo(other.isSetUnregcount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnregcount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unregcount, other.unregcount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRegcount()).compareTo(other.isSetRegcount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegcount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.regcount, other.regcount);
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
    StringBuilder sb = new StringBuilder("UserEmployeeNumStatistic(");
    boolean first = true;

    if (isSetUnregcount()) {
      sb.append("unregcount:");
      sb.append(this.unregcount);
      first = false;
    }
    if (isSetRegcount()) {
      if (!first) sb.append(", ");
      sb.append("regcount:");
      sb.append(this.regcount);
      first = false;
    }
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

  private static class UserEmployeeNumStatisticStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserEmployeeNumStatisticStandardScheme getScheme() {
      return new UserEmployeeNumStatisticStandardScheme();
    }
  }

  private static class UserEmployeeNumStatisticStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserEmployeeNumStatistic> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserEmployeeNumStatistic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UNREGCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.unregcount = iprot.readI32();
              struct.setUnregcountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REGCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.regcount = iprot.readI32();
              struct.setRegcountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserEmployeeNumStatistic struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetUnregcount()) {
        oprot.writeFieldBegin(UNREGCOUNT_FIELD_DESC);
        oprot.writeI32(struct.unregcount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRegcount()) {
        oprot.writeFieldBegin(REGCOUNT_FIELD_DESC);
        oprot.writeI32(struct.regcount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserEmployeeNumStatisticTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserEmployeeNumStatisticTupleScheme getScheme() {
      return new UserEmployeeNumStatisticTupleScheme();
    }
  }

  private static class UserEmployeeNumStatisticTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserEmployeeNumStatistic> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserEmployeeNumStatistic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUnregcount()) {
        optionals.set(0);
      }
      if (struct.isSetRegcount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUnregcount()) {
        oprot.writeI32(struct.unregcount);
      }
      if (struct.isSetRegcount()) {
        oprot.writeI32(struct.regcount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserEmployeeNumStatistic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.unregcount = iprot.readI32();
        struct.setUnregcountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.regcount = iprot.readI32();
        struct.setRegcountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
