/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dict.struct;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-28")
public class College implements org.apache.thrift.TBase<College, College._Fields>, java.io.Serializable, Cloneable, Comparable<College> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("College");

  private static final org.apache.thrift.protocol.TField COLLEGE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("college_code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COLLGE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("collge_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROVINCE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("province_code", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PROVINCE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("province_name", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CollegeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CollegeTupleSchemeFactory());
  }

  public int college_code; // required
  public String collge_name; // required
  public int province_code; // required
  public String province_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLLEGE_CODE((short)1, "college_code"),
    COLLGE_NAME((short)2, "collge_name"),
    PROVINCE_CODE((short)3, "province_code"),
    PROVINCE_NAME((short)4, "province_name");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COLLEGE_CODE
          return COLLEGE_CODE;
        case 2: // COLLGE_NAME
          return COLLGE_NAME;
        case 3: // PROVINCE_CODE
          return PROVINCE_CODE;
        case 4: // PROVINCE_NAME
          return PROVINCE_NAME;
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
  private static final int __COLLEGE_CODE_ISSET_ID = 0;
  private static final int __PROVINCE_CODE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLLEGE_CODE, new org.apache.thrift.meta_data.FieldMetaData("college_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COLLGE_NAME, new org.apache.thrift.meta_data.FieldMetaData("collge_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROVINCE_CODE, new org.apache.thrift.meta_data.FieldMetaData("province_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROVINCE_NAME, new org.apache.thrift.meta_data.FieldMetaData("province_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(College.class, metaDataMap);
  }

  public College() {
  }

  public College(
    int college_code,
    String collge_name,
    int province_code,
    String province_name)
  {
    this();
    this.college_code = college_code;
    setCollege_codeIsSet(true);
    this.collge_name = collge_name;
    this.province_code = province_code;
    setProvince_codeIsSet(true);
    this.province_name = province_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public College(College other) {
    __isset_bitfield = other.__isset_bitfield;
    this.college_code = other.college_code;
    if (other.isSetCollge_name()) {
      this.collge_name = other.collge_name;
    }
    this.province_code = other.province_code;
    if (other.isSetProvince_name()) {
      this.province_name = other.province_name;
    }
  }

  public College deepCopy() {
    return new College(this);
  }

  @Override
  public void clear() {
    setCollege_codeIsSet(false);
    this.college_code = 0;
    this.collge_name = null;
    setProvince_codeIsSet(false);
    this.province_code = 0;
    this.province_name = null;
  }

  public int getCollege_code() {
    return this.college_code;
  }

  public College setCollege_code(int college_code) {
    this.college_code = college_code;
    setCollege_codeIsSet(true);
    return this;
  }

  public void unsetCollege_code() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COLLEGE_CODE_ISSET_ID);
  }

  /** Returns true if field college_code is set (has been assigned a value) and false otherwise */
  public boolean isSetCollege_code() {
    return EncodingUtils.testBit(__isset_bitfield, __COLLEGE_CODE_ISSET_ID);
  }

  public void setCollege_codeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COLLEGE_CODE_ISSET_ID, value);
  }

  public String getCollge_name() {
    return this.collge_name;
  }

  public College setCollge_name(String collge_name) {
    this.collge_name = collge_name;
    return this;
  }

  public void unsetCollge_name() {
    this.collge_name = null;
  }

  /** Returns true if field collge_name is set (has been assigned a value) and false otherwise */
  public boolean isSetCollge_name() {
    return this.collge_name != null;
  }

  public void setCollge_nameIsSet(boolean value) {
    if (!value) {
      this.collge_name = null;
    }
  }

  public int getProvince_code() {
    return this.province_code;
  }

  public College setProvince_code(int province_code) {
    this.province_code = province_code;
    setProvince_codeIsSet(true);
    return this;
  }

  public void unsetProvince_code() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROVINCE_CODE_ISSET_ID);
  }

  /** Returns true if field province_code is set (has been assigned a value) and false otherwise */
  public boolean isSetProvince_code() {
    return EncodingUtils.testBit(__isset_bitfield, __PROVINCE_CODE_ISSET_ID);
  }

  public void setProvince_codeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROVINCE_CODE_ISSET_ID, value);
  }

  public String getProvince_name() {
    return this.province_name;
  }

  public College setProvince_name(String province_name) {
    this.province_name = province_name;
    return this;
  }

  public void unsetProvince_name() {
    this.province_name = null;
  }

  /** Returns true if field province_name is set (has been assigned a value) and false otherwise */
  public boolean isSetProvince_name() {
    return this.province_name != null;
  }

  public void setProvince_nameIsSet(boolean value) {
    if (!value) {
      this.province_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLLEGE_CODE:
      if (value == null) {
        unsetCollege_code();
      } else {
        setCollege_code((Integer)value);
      }
      break;

    case COLLGE_NAME:
      if (value == null) {
        unsetCollge_name();
      } else {
        setCollge_name((String)value);
      }
      break;

    case PROVINCE_CODE:
      if (value == null) {
        unsetProvince_code();
      } else {
        setProvince_code((Integer)value);
      }
      break;

    case PROVINCE_NAME:
      if (value == null) {
        unsetProvince_name();
      } else {
        setProvince_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLLEGE_CODE:
      return Integer.valueOf(getCollege_code());

    case COLLGE_NAME:
      return getCollge_name();

    case PROVINCE_CODE:
      return Integer.valueOf(getProvince_code());

    case PROVINCE_NAME:
      return getProvince_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COLLEGE_CODE:
      return isSetCollege_code();
    case COLLGE_NAME:
      return isSetCollge_name();
    case PROVINCE_CODE:
      return isSetProvince_code();
    case PROVINCE_NAME:
      return isSetProvince_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof College)
      return this.equals((College)that);
    return false;
  }

  public boolean equals(College that) {
    if (that == null)
      return false;

    boolean this_present_college_code = true;
    boolean that_present_college_code = true;
    if (this_present_college_code || that_present_college_code) {
      if (!(this_present_college_code && that_present_college_code))
        return false;
      if (this.college_code != that.college_code)
        return false;
    }

    boolean this_present_collge_name = true && this.isSetCollge_name();
    boolean that_present_collge_name = true && that.isSetCollge_name();
    if (this_present_collge_name || that_present_collge_name) {
      if (!(this_present_collge_name && that_present_collge_name))
        return false;
      if (!this.collge_name.equals(that.collge_name))
        return false;
    }

    boolean this_present_province_code = true;
    boolean that_present_province_code = true;
    if (this_present_province_code || that_present_province_code) {
      if (!(this_present_province_code && that_present_province_code))
        return false;
      if (this.province_code != that.province_code)
        return false;
    }

    boolean this_present_province_name = true && this.isSetProvince_name();
    boolean that_present_province_name = true && that.isSetProvince_name();
    if (this_present_province_name || that_present_province_name) {
      if (!(this_present_province_name && that_present_province_name))
        return false;
      if (!this.province_name.equals(that.province_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_college_code = true;
    list.add(present_college_code);
    if (present_college_code)
      list.add(college_code);

    boolean present_collge_name = true && (isSetCollge_name());
    list.add(present_collge_name);
    if (present_collge_name)
      list.add(collge_name);

    boolean present_province_code = true;
    list.add(present_province_code);
    if (present_province_code)
      list.add(province_code);

    boolean present_province_name = true && (isSetProvince_name());
    list.add(present_province_name);
    if (present_province_name)
      list.add(province_name);

    return list.hashCode();
  }

  @Override
  public int compareTo(College other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCollege_code()).compareTo(other.isSetCollege_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCollege_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.college_code, other.college_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCollge_name()).compareTo(other.isSetCollge_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCollge_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.collge_name, other.collge_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProvince_code()).compareTo(other.isSetProvince_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvince_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.province_code, other.province_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProvince_name()).compareTo(other.isSetProvince_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvince_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.province_name, other.province_name);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("College(");
    boolean first = true;

    sb.append("college_code:");
    sb.append(this.college_code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("collge_name:");
    if (this.collge_name == null) {
      sb.append("null");
    } else {
      sb.append(this.collge_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("province_code:");
    sb.append(this.province_code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("province_name:");
    if (this.province_name == null) {
      sb.append("null");
    } else {
      sb.append(this.province_name);
    }
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

  private static class CollegeStandardSchemeFactory implements SchemeFactory {
    public CollegeStandardScheme getScheme() {
      return new CollegeStandardScheme();
    }
  }

  private static class CollegeStandardScheme extends StandardScheme<College> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, College struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLLEGE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.college_code = iprot.readI32();
              struct.setCollege_codeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLLGE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.collge_name = iprot.readString();
              struct.setCollge_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROVINCE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.province_code = iprot.readI32();
              struct.setProvince_codeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROVINCE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.province_name = iprot.readString();
              struct.setProvince_nameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, College struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COLLEGE_CODE_FIELD_DESC);
      oprot.writeI32(struct.college_code);
      oprot.writeFieldEnd();
      if (struct.collge_name != null) {
        oprot.writeFieldBegin(COLLGE_NAME_FIELD_DESC);
        oprot.writeString(struct.collge_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PROVINCE_CODE_FIELD_DESC);
      oprot.writeI32(struct.province_code);
      oprot.writeFieldEnd();
      if (struct.province_name != null) {
        oprot.writeFieldBegin(PROVINCE_NAME_FIELD_DESC);
        oprot.writeString(struct.province_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CollegeTupleSchemeFactory implements SchemeFactory {
    public CollegeTupleScheme getScheme() {
      return new CollegeTupleScheme();
    }
  }

  private static class CollegeTupleScheme extends TupleScheme<College> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, College struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCollege_code()) {
        optionals.set(0);
      }
      if (struct.isSetCollge_name()) {
        optionals.set(1);
      }
      if (struct.isSetProvince_code()) {
        optionals.set(2);
      }
      if (struct.isSetProvince_name()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCollege_code()) {
        oprot.writeI32(struct.college_code);
      }
      if (struct.isSetCollge_name()) {
        oprot.writeString(struct.collge_name);
      }
      if (struct.isSetProvince_code()) {
        oprot.writeI32(struct.province_code);
      }
      if (struct.isSetProvince_name()) {
        oprot.writeString(struct.province_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, College struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.college_code = iprot.readI32();
        struct.setCollege_codeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.collge_name = iprot.readString();
        struct.setCollge_nameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.province_code = iprot.readI32();
        struct.setProvince_codeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.province_name = iprot.readString();
        struct.setProvince_nameIsSet(true);
      }
    }
  }

}

