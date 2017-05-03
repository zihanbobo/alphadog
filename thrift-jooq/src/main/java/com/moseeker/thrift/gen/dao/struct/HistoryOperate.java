/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-04-26")
public class HistoryOperate implements org.apache.thrift.TBase<HistoryOperate, HistoryOperate._Fields>, java.io.Serializable, Cloneable, Comparable<HistoryOperate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HistoryOperate");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("app_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField OPERATE_TPL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operate_tpl_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RECRUIT_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("recruit_order", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HistoryOperateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HistoryOperateTupleSchemeFactory();

  public int id; // optional
  public long app_id; // optional
  public int operate_tpl_id; // optional
  public int recruit_order; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    APP_ID((short)2, "app_id"),
    OPERATE_TPL_ID((short)3, "operate_tpl_id"),
    RECRUIT_ORDER((short)4, "recruit_order");

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
        case 1: // ID
          return ID;
        case 2: // APP_ID
          return APP_ID;
        case 3: // OPERATE_TPL_ID
          return OPERATE_TPL_ID;
        case 4: // RECRUIT_ORDER
          return RECRUIT_ORDER;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __APP_ID_ISSET_ID = 1;
  private static final int __OPERATE_TPL_ID_ISSET_ID = 2;
  private static final int __RECRUIT_ORDER_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.APP_ID,_Fields.OPERATE_TPL_ID,_Fields.RECRUIT_ORDER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("app_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OPERATE_TPL_ID, new org.apache.thrift.meta_data.FieldMetaData("operate_tpl_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECRUIT_ORDER, new org.apache.thrift.meta_data.FieldMetaData("recruit_order", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HistoryOperate.class, metaDataMap);
  }

  public HistoryOperate() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HistoryOperate(HistoryOperate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.app_id = other.app_id;
    this.operate_tpl_id = other.operate_tpl_id;
    this.recruit_order = other.recruit_order;
  }

  public HistoryOperate deepCopy() {
    return new HistoryOperate(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setApp_idIsSet(false);
    this.app_id = 0;
    setOperate_tpl_idIsSet(false);
    this.operate_tpl_id = 0;
    setRecruit_orderIsSet(false);
    this.recruit_order = 0;
  }

  public int getId() {
    return this.id;
  }

  public HistoryOperate setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public long getApp_id() {
    return this.app_id;
  }

  public HistoryOperate setApp_id(long app_id) {
    this.app_id = app_id;
    setApp_idIsSet(true);
    return this;
  }

  public void unsetApp_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APP_ID_ISSET_ID);
  }

  /** Returns true if field app_id is set (has been assigned a value) and false otherwise */
  public boolean isSetApp_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APP_ID_ISSET_ID);
  }

  public void setApp_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APP_ID_ISSET_ID, value);
  }

  public int getOperate_tpl_id() {
    return this.operate_tpl_id;
  }

  public HistoryOperate setOperate_tpl_id(int operate_tpl_id) {
    this.operate_tpl_id = operate_tpl_id;
    setOperate_tpl_idIsSet(true);
    return this;
  }

  public void unsetOperate_tpl_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPERATE_TPL_ID_ISSET_ID);
  }

  /** Returns true if field operate_tpl_id is set (has been assigned a value) and false otherwise */
  public boolean isSetOperate_tpl_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPERATE_TPL_ID_ISSET_ID);
  }

  public void setOperate_tpl_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPERATE_TPL_ID_ISSET_ID, value);
  }

  public int getRecruit_order() {
    return this.recruit_order;
  }

  public HistoryOperate setRecruit_order(int recruit_order) {
    this.recruit_order = recruit_order;
    setRecruit_orderIsSet(true);
    return this;
  }

  public void unsetRecruit_order() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECRUIT_ORDER_ISSET_ID);
  }

  /** Returns true if field recruit_order is set (has been assigned a value) and false otherwise */
  public boolean isSetRecruit_order() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECRUIT_ORDER_ISSET_ID);
  }

  public void setRecruit_orderIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECRUIT_ORDER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetApp_id();
      } else {
        setApp_id((java.lang.Long)value);
      }
      break;

    case OPERATE_TPL_ID:
      if (value == null) {
        unsetOperate_tpl_id();
      } else {
        setOperate_tpl_id((java.lang.Integer)value);
      }
      break;

    case RECRUIT_ORDER:
      if (value == null) {
        unsetRecruit_order();
      } else {
        setRecruit_order((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case APP_ID:
      return getApp_id();

    case OPERATE_TPL_ID:
      return getOperate_tpl_id();

    case RECRUIT_ORDER:
      return getRecruit_order();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case APP_ID:
      return isSetApp_id();
    case OPERATE_TPL_ID:
      return isSetOperate_tpl_id();
    case RECRUIT_ORDER:
      return isSetRecruit_order();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HistoryOperate)
      return this.equals((HistoryOperate)that);
    return false;
  }

  public boolean equals(HistoryOperate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_app_id = true && this.isSetApp_id();
    boolean that_present_app_id = true && that.isSetApp_id();
    if (this_present_app_id || that_present_app_id) {
      if (!(this_present_app_id && that_present_app_id))
        return false;
      if (this.app_id != that.app_id)
        return false;
    }

    boolean this_present_operate_tpl_id = true && this.isSetOperate_tpl_id();
    boolean that_present_operate_tpl_id = true && that.isSetOperate_tpl_id();
    if (this_present_operate_tpl_id || that_present_operate_tpl_id) {
      if (!(this_present_operate_tpl_id && that_present_operate_tpl_id))
        return false;
      if (this.operate_tpl_id != that.operate_tpl_id)
        return false;
    }

    boolean this_present_recruit_order = true && this.isSetRecruit_order();
    boolean that_present_recruit_order = true && that.isSetRecruit_order();
    if (this_present_recruit_order || that_present_recruit_order) {
      if (!(this_present_recruit_order && that_present_recruit_order))
        return false;
      if (this.recruit_order != that.recruit_order)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetApp_id()) ? 131071 : 524287);
    if (isSetApp_id())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(app_id);

    hashCode = hashCode * 8191 + ((isSetOperate_tpl_id()) ? 131071 : 524287);
    if (isSetOperate_tpl_id())
      hashCode = hashCode * 8191 + operate_tpl_id;

    hashCode = hashCode * 8191 + ((isSetRecruit_order()) ? 131071 : 524287);
    if (isSetRecruit_order())
      hashCode = hashCode * 8191 + recruit_order;

    return hashCode;
  }

  @Override
  public int compareTo(HistoryOperate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApp_id()).compareTo(other.isSetApp_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.app_id, other.app_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOperate_tpl_id()).compareTo(other.isSetOperate_tpl_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperate_tpl_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operate_tpl_id, other.operate_tpl_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecruit_order()).compareTo(other.isSetRecruit_order());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecruit_order()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recruit_order, other.recruit_order);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HistoryOperate(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetApp_id()) {
      if (!first) sb.append(", ");
      sb.append("app_id:");
      sb.append(this.app_id);
      first = false;
    }
    if (isSetOperate_tpl_id()) {
      if (!first) sb.append(", ");
      sb.append("operate_tpl_id:");
      sb.append(this.operate_tpl_id);
      first = false;
    }
    if (isSetRecruit_order()) {
      if (!first) sb.append(", ");
      sb.append("recruit_order:");
      sb.append(this.recruit_order);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HistoryOperateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HistoryOperateStandardScheme getScheme() {
      return new HistoryOperateStandardScheme();
    }
  }

  private static class HistoryOperateStandardScheme extends org.apache.thrift.scheme.StandardScheme<HistoryOperate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HistoryOperate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.app_id = iprot.readI64();
              struct.setApp_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPERATE_TPL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operate_tpl_id = iprot.readI32();
              struct.setOperate_tpl_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RECRUIT_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recruit_order = iprot.readI32();
              struct.setRecruit_orderIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HistoryOperate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetApp_id()) {
        oprot.writeFieldBegin(APP_ID_FIELD_DESC);
        oprot.writeI64(struct.app_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOperate_tpl_id()) {
        oprot.writeFieldBegin(OPERATE_TPL_ID_FIELD_DESC);
        oprot.writeI32(struct.operate_tpl_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecruit_order()) {
        oprot.writeFieldBegin(RECRUIT_ORDER_FIELD_DESC);
        oprot.writeI32(struct.recruit_order);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HistoryOperateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HistoryOperateTupleScheme getScheme() {
      return new HistoryOperateTupleScheme();
    }
  }

  private static class HistoryOperateTupleScheme extends org.apache.thrift.scheme.TupleScheme<HistoryOperate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HistoryOperate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetApp_id()) {
        optionals.set(1);
      }
      if (struct.isSetOperate_tpl_id()) {
        optionals.set(2);
      }
      if (struct.isSetRecruit_order()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetApp_id()) {
        oprot.writeI64(struct.app_id);
      }
      if (struct.isSetOperate_tpl_id()) {
        oprot.writeI32(struct.operate_tpl_id);
      }
      if (struct.isSetRecruit_order()) {
        oprot.writeI32(struct.recruit_order);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HistoryOperate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.app_id = iprot.readI64();
        struct.setApp_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.operate_tpl_id = iprot.readI32();
        struct.setOperate_tpl_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.recruit_order = iprot.readI32();
        struct.setRecruit_orderIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

