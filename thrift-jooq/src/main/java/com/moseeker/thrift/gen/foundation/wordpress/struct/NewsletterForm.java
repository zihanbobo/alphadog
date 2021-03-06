/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.foundation.wordpress.struct;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-11-10")
public class NewsletterForm implements org.apache.thrift.TBase<NewsletterForm, NewsletterForm._Fields>, java.io.Serializable, Cloneable, Comparable<NewsletterForm> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NewsletterForm");

  private static final org.apache.thrift.protocol.TField APPID_FIELD_DESC = new org.apache.thrift.protocol.TField("appid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("account_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PLATEFORM_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("plateform_type", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField RETURN_LAST_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("return_last_version", org.apache.thrift.protocol.TType.BYTE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NewsletterFormStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NewsletterFormTupleSchemeFactory());
  }

  public int appid; // required
  public int account_id; // required
  public byte plateform_type; // required
  public byte return_last_version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APPID((short)1, "appid"),
    ACCOUNT_ID((short)2, "account_id"),
    PLATEFORM_TYPE((short)3, "plateform_type"),
    RETURN_LAST_VERSION((short)4, "return_last_version");

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
        case 1: // APPID
          return APPID;
        case 2: // ACCOUNT_ID
          return ACCOUNT_ID;
        case 3: // PLATEFORM_TYPE
          return PLATEFORM_TYPE;
        case 4: // RETURN_LAST_VERSION
          return RETURN_LAST_VERSION;
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
  private static final int __APPID_ISSET_ID = 0;
  private static final int __ACCOUNT_ID_ISSET_ID = 1;
  private static final int __PLATEFORM_TYPE_ISSET_ID = 2;
  private static final int __RETURN_LAST_VERSION_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APPID, new org.apache.thrift.meta_data.FieldMetaData("appid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACCOUNT_ID, new org.apache.thrift.meta_data.FieldMetaData("account_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PLATEFORM_TYPE, new org.apache.thrift.meta_data.FieldMetaData("plateform_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.RETURN_LAST_VERSION, new org.apache.thrift.meta_data.FieldMetaData("return_last_version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NewsletterForm.class, metaDataMap);
  }

  public NewsletterForm() {
  }

  public NewsletterForm(
    int appid,
    int account_id,
    byte plateform_type,
    byte return_last_version)
  {
    this();
    this.appid = appid;
    setAppidIsSet(true);
    this.account_id = account_id;
    setAccount_idIsSet(true);
    this.plateform_type = plateform_type;
    setPlateform_typeIsSet(true);
    this.return_last_version = return_last_version;
    setReturn_last_versionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NewsletterForm(NewsletterForm other) {
    __isset_bitfield = other.__isset_bitfield;
    this.appid = other.appid;
    this.account_id = other.account_id;
    this.plateform_type = other.plateform_type;
    this.return_last_version = other.return_last_version;
  }

  public NewsletterForm deepCopy() {
    return new NewsletterForm(this);
  }

  @Override
  public void clear() {
    setAppidIsSet(false);
    this.appid = 0;
    setAccount_idIsSet(false);
    this.account_id = 0;
    setPlateform_typeIsSet(false);
    this.plateform_type = 0;
    setReturn_last_versionIsSet(false);
    this.return_last_version = 0;
  }

  public int getAppid() {
    return this.appid;
  }

  public NewsletterForm setAppid(int appid) {
    this.appid = appid;
    setAppidIsSet(true);
    return this;
  }

  public void unsetAppid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  /** Returns true if field appid is set (has been assigned a value) and false otherwise */
  public boolean isSetAppid() {
    return EncodingUtils.testBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  public void setAppidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPID_ISSET_ID, value);
  }

  public int getAccount_id() {
    return this.account_id;
  }

  public NewsletterForm setAccount_id(int account_id) {
    this.account_id = account_id;
    setAccount_idIsSet(true);
    return this;
  }

  public void unsetAccount_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACCOUNT_ID_ISSET_ID);
  }

  /** Returns true if field account_id is set (has been assigned a value) and false otherwise */
  public boolean isSetAccount_id() {
    return EncodingUtils.testBit(__isset_bitfield, __ACCOUNT_ID_ISSET_ID);
  }

  public void setAccount_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACCOUNT_ID_ISSET_ID, value);
  }

  public byte getPlateform_type() {
    return this.plateform_type;
  }

  public NewsletterForm setPlateform_type(byte plateform_type) {
    this.plateform_type = plateform_type;
    setPlateform_typeIsSet(true);
    return this;
  }

  public void unsetPlateform_type() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PLATEFORM_TYPE_ISSET_ID);
  }

  /** Returns true if field plateform_type is set (has been assigned a value) and false otherwise */
  public boolean isSetPlateform_type() {
    return EncodingUtils.testBit(__isset_bitfield, __PLATEFORM_TYPE_ISSET_ID);
  }

  public void setPlateform_typeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PLATEFORM_TYPE_ISSET_ID, value);
  }

  public byte getReturn_last_version() {
    return this.return_last_version;
  }

  public NewsletterForm setReturn_last_version(byte return_last_version) {
    this.return_last_version = return_last_version;
    setReturn_last_versionIsSet(true);
    return this;
  }

  public void unsetReturn_last_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RETURN_LAST_VERSION_ISSET_ID);
  }

  /** Returns true if field return_last_version is set (has been assigned a value) and false otherwise */
  public boolean isSetReturn_last_version() {
    return EncodingUtils.testBit(__isset_bitfield, __RETURN_LAST_VERSION_ISSET_ID);
  }

  public void setReturn_last_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RETURN_LAST_VERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case APPID:
      if (value == null) {
        unsetAppid();
      } else {
        setAppid((Integer)value);
      }
      break;

    case ACCOUNT_ID:
      if (value == null) {
        unsetAccount_id();
      } else {
        setAccount_id((Integer)value);
      }
      break;

    case PLATEFORM_TYPE:
      if (value == null) {
        unsetPlateform_type();
      } else {
        setPlateform_type((Byte)value);
      }
      break;

    case RETURN_LAST_VERSION:
      if (value == null) {
        unsetReturn_last_version();
      } else {
        setReturn_last_version((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APPID:
      return Integer.valueOf(getAppid());

    case ACCOUNT_ID:
      return Integer.valueOf(getAccount_id());

    case PLATEFORM_TYPE:
      return Byte.valueOf(getPlateform_type());

    case RETURN_LAST_VERSION:
      return Byte.valueOf(getReturn_last_version());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APPID:
      return isSetAppid();
    case ACCOUNT_ID:
      return isSetAccount_id();
    case PLATEFORM_TYPE:
      return isSetPlateform_type();
    case RETURN_LAST_VERSION:
      return isSetReturn_last_version();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NewsletterForm)
      return this.equals((NewsletterForm)that);
    return false;
  }

  public boolean equals(NewsletterForm that) {
    if (that == null)
      return false;

    boolean this_present_appid = true;
    boolean that_present_appid = true;
    if (this_present_appid || that_present_appid) {
      if (!(this_present_appid && that_present_appid))
        return false;
      if (this.appid != that.appid)
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

    boolean this_present_plateform_type = true;
    boolean that_present_plateform_type = true;
    if (this_present_plateform_type || that_present_plateform_type) {
      if (!(this_present_plateform_type && that_present_plateform_type))
        return false;
      if (this.plateform_type != that.plateform_type)
        return false;
    }

    boolean this_present_return_last_version = true;
    boolean that_present_return_last_version = true;
    if (this_present_return_last_version || that_present_return_last_version) {
      if (!(this_present_return_last_version && that_present_return_last_version))
        return false;
      if (this.return_last_version != that.return_last_version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_appid = true;
    list.add(present_appid);
    if (present_appid)
      list.add(appid);

    boolean present_account_id = true;
    list.add(present_account_id);
    if (present_account_id)
      list.add(account_id);

    boolean present_plateform_type = true;
    list.add(present_plateform_type);
    if (present_plateform_type)
      list.add(plateform_type);

    boolean present_return_last_version = true;
    list.add(present_return_last_version);
    if (present_return_last_version)
      list.add(return_last_version);

    return list.hashCode();
  }

  @Override
  public int compareTo(NewsletterForm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAppid()).compareTo(other.isSetAppid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appid, other.appid);
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
    lastComparison = Boolean.valueOf(isSetPlateform_type()).compareTo(other.isSetPlateform_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlateform_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plateform_type, other.plateform_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReturn_last_version()).compareTo(other.isSetReturn_last_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturn_last_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.return_last_version, other.return_last_version);
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
    StringBuilder sb = new StringBuilder("NewsletterForm(");
    boolean first = true;

    sb.append("appid:");
    sb.append(this.appid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("account_id:");
    sb.append(this.account_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("plateform_type:");
    sb.append(this.plateform_type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("return_last_version:");
    sb.append(this.return_last_version);
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

  private static class NewsletterFormStandardSchemeFactory implements SchemeFactory {
    public NewsletterFormStandardScheme getScheme() {
      return new NewsletterFormStandardScheme();
    }
  }

  private static class NewsletterFormStandardScheme extends StandardScheme<NewsletterForm> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NewsletterForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APPID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appid = iprot.readI32();
              struct.setAppidIsSet(true);
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
          case 3: // PLATEFORM_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.plateform_type = iprot.readByte();
              struct.setPlateform_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RETURN_LAST_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.return_last_version = iprot.readByte();
              struct.setReturn_last_versionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NewsletterForm struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(APPID_FIELD_DESC);
      oprot.writeI32(struct.appid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ACCOUNT_ID_FIELD_DESC);
      oprot.writeI32(struct.account_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PLATEFORM_TYPE_FIELD_DESC);
      oprot.writeByte(struct.plateform_type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RETURN_LAST_VERSION_FIELD_DESC);
      oprot.writeByte(struct.return_last_version);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NewsletterFormTupleSchemeFactory implements SchemeFactory {
    public NewsletterFormTupleScheme getScheme() {
      return new NewsletterFormTupleScheme();
    }
  }

  private static class NewsletterFormTupleScheme extends TupleScheme<NewsletterForm> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NewsletterForm struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAppid()) {
        optionals.set(0);
      }
      if (struct.isSetAccount_id()) {
        optionals.set(1);
      }
      if (struct.isSetPlateform_type()) {
        optionals.set(2);
      }
      if (struct.isSetReturn_last_version()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAppid()) {
        oprot.writeI32(struct.appid);
      }
      if (struct.isSetAccount_id()) {
        oprot.writeI32(struct.account_id);
      }
      if (struct.isSetPlateform_type()) {
        oprot.writeByte(struct.plateform_type);
      }
      if (struct.isSetReturn_last_version()) {
        oprot.writeByte(struct.return_last_version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NewsletterForm struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.appid = iprot.readI32();
        struct.setAppidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.account_id = iprot.readI32();
        struct.setAccount_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.plateform_type = iprot.readByte();
        struct.setPlateform_typeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.return_last_version = iprot.readByte();
        struct.setReturn_last_versionIsSet(true);
      }
    }
  }

}

