/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.hrdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-20")
public class HrWxNoticeMessageDO implements org.apache.thrift.TBase<HrWxNoticeMessageDO, HrWxNoticeMessageDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrWxNoticeMessageDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrWxNoticeMessageDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField WECHAT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("wechatId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NOTICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("noticeId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField FIRST_FIELD_DESC = new org.apache.thrift.protocol.TField("first", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REMARK_FIELD_DESC = new org.apache.thrift.protocol.TField("remark", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.DOUBLE, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrWxNoticeMessageDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrWxNoticeMessageDOTupleSchemeFactory();

  public int id; // optional
  public int wechatId; // optional
  public int noticeId; // optional
  public java.lang.String first; // optional
  public java.lang.String remark; // optional
  public double status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    WECHAT_ID((short)2, "wechatId"),
    NOTICE_ID((short)3, "noticeId"),
    FIRST((short)4, "first"),
    REMARK((short)5, "remark"),
    STATUS((short)6, "status");

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
        case 2: // WECHAT_ID
          return WECHAT_ID;
        case 3: // NOTICE_ID
          return NOTICE_ID;
        case 4: // FIRST
          return FIRST;
        case 5: // REMARK
          return REMARK;
        case 6: // STATUS
          return STATUS;
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
  private static final int __WECHATID_ISSET_ID = 1;
  private static final int __NOTICEID_ISSET_ID = 2;
  private static final int __STATUS_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.WECHAT_ID,_Fields.NOTICE_ID,_Fields.FIRST,_Fields.REMARK,_Fields.STATUS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WECHAT_ID, new org.apache.thrift.meta_data.FieldMetaData("wechatId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOTICE_ID, new org.apache.thrift.meta_data.FieldMetaData("noticeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FIRST, new org.apache.thrift.meta_data.FieldMetaData("first", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REMARK, new org.apache.thrift.meta_data.FieldMetaData("remark", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrWxNoticeMessageDO.class, metaDataMap);
  }

  public HrWxNoticeMessageDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrWxNoticeMessageDO(HrWxNoticeMessageDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.wechatId = other.wechatId;
    this.noticeId = other.noticeId;
    if (other.isSetFirst()) {
      this.first = other.first;
    }
    if (other.isSetRemark()) {
      this.remark = other.remark;
    }
    this.status = other.status;
  }

  public HrWxNoticeMessageDO deepCopy() {
    return new HrWxNoticeMessageDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setWechatIdIsSet(false);
    this.wechatId = 0;
    setNoticeIdIsSet(false);
    this.noticeId = 0;
    this.first = null;
    this.remark = null;
    setStatusIsSet(false);
    this.status = 0.0;
  }

  public int getId() {
    return this.id;
  }

  public HrWxNoticeMessageDO setId(int id) {
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

  public int getWechatId() {
    return this.wechatId;
  }

  public HrWxNoticeMessageDO setWechatId(int wechatId) {
    this.wechatId = wechatId;
    setWechatIdIsSet(true);
    return this;
  }

  public void unsetWechatId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WECHATID_ISSET_ID);
  }

  /** Returns true if field wechatId is set (has been assigned a value) and false otherwise */
  public boolean isSetWechatId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WECHATID_ISSET_ID);
  }

  public void setWechatIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WECHATID_ISSET_ID, value);
  }

  public int getNoticeId() {
    return this.noticeId;
  }

  public HrWxNoticeMessageDO setNoticeId(int noticeId) {
    this.noticeId = noticeId;
    setNoticeIdIsSet(true);
    return this;
  }

  public void unsetNoticeId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOTICEID_ISSET_ID);
  }

  /** Returns true if field noticeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNoticeId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOTICEID_ISSET_ID);
  }

  public void setNoticeIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOTICEID_ISSET_ID, value);
  }

  public java.lang.String getFirst() {
    return this.first;
  }

  public HrWxNoticeMessageDO setFirst(java.lang.String first) {
    this.first = first;
    return this;
  }

  public void unsetFirst() {
    this.first = null;
  }

  /** Returns true if field first is set (has been assigned a value) and false otherwise */
  public boolean isSetFirst() {
    return this.first != null;
  }

  public void setFirstIsSet(boolean value) {
    if (!value) {
      this.first = null;
    }
  }

  public java.lang.String getRemark() {
    return this.remark;
  }

  public HrWxNoticeMessageDO setRemark(java.lang.String remark) {
    this.remark = remark;
    return this;
  }

  public void unsetRemark() {
    this.remark = null;
  }

  /** Returns true if field remark is set (has been assigned a value) and false otherwise */
  public boolean isSetRemark() {
    return this.remark != null;
  }

  public void setRemarkIsSet(boolean value) {
    if (!value) {
      this.remark = null;
    }
  }

  public double getStatus() {
    return this.status;
  }

  public HrWxNoticeMessageDO setStatus(double status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
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

    case WECHAT_ID:
      if (value == null) {
        unsetWechatId();
      } else {
        setWechatId((java.lang.Integer)value);
      }
      break;

    case NOTICE_ID:
      if (value == null) {
        unsetNoticeId();
      } else {
        setNoticeId((java.lang.Integer)value);
      }
      break;

    case FIRST:
      if (value == null) {
        unsetFirst();
      } else {
        setFirst((java.lang.String)value);
      }
      break;

    case REMARK:
      if (value == null) {
        unsetRemark();
      } else {
        setRemark((java.lang.String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case WECHAT_ID:
      return getWechatId();

    case NOTICE_ID:
      return getNoticeId();

    case FIRST:
      return getFirst();

    case REMARK:
      return getRemark();

    case STATUS:
      return getStatus();

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
    case WECHAT_ID:
      return isSetWechatId();
    case NOTICE_ID:
      return isSetNoticeId();
    case FIRST:
      return isSetFirst();
    case REMARK:
      return isSetRemark();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HrWxNoticeMessageDO)
      return this.equals((HrWxNoticeMessageDO)that);
    return false;
  }

  public boolean equals(HrWxNoticeMessageDO that) {
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

    boolean this_present_wechatId = true && this.isSetWechatId();
    boolean that_present_wechatId = true && that.isSetWechatId();
    if (this_present_wechatId || that_present_wechatId) {
      if (!(this_present_wechatId && that_present_wechatId))
        return false;
      if (this.wechatId != that.wechatId)
        return false;
    }

    boolean this_present_noticeId = true && this.isSetNoticeId();
    boolean that_present_noticeId = true && that.isSetNoticeId();
    if (this_present_noticeId || that_present_noticeId) {
      if (!(this_present_noticeId && that_present_noticeId))
        return false;
      if (this.noticeId != that.noticeId)
        return false;
    }

    boolean this_present_first = true && this.isSetFirst();
    boolean that_present_first = true && that.isSetFirst();
    if (this_present_first || that_present_first) {
      if (!(this_present_first && that_present_first))
        return false;
      if (!this.first.equals(that.first))
        return false;
    }

    boolean this_present_remark = true && this.isSetRemark();
    boolean that_present_remark = true && that.isSetRemark();
    if (this_present_remark || that_present_remark) {
      if (!(this_present_remark && that_present_remark))
        return false;
      if (!this.remark.equals(that.remark))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
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

    hashCode = hashCode * 8191 + ((isSetWechatId()) ? 131071 : 524287);
    if (isSetWechatId())
      hashCode = hashCode * 8191 + wechatId;

    hashCode = hashCode * 8191 + ((isSetNoticeId()) ? 131071 : 524287);
    if (isSetNoticeId())
      hashCode = hashCode * 8191 + noticeId;

    hashCode = hashCode * 8191 + ((isSetFirst()) ? 131071 : 524287);
    if (isSetFirst())
      hashCode = hashCode * 8191 + first.hashCode();

    hashCode = hashCode * 8191 + ((isSetRemark()) ? 131071 : 524287);
    if (isSetRemark())
      hashCode = hashCode * 8191 + remark.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(status);

    return hashCode;
  }

  @Override
  public int compareTo(HrWxNoticeMessageDO other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetWechatId()).compareTo(other.isSetWechatId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWechatId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wechatId, other.wechatId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNoticeId()).compareTo(other.isSetNoticeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoticeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noticeId, other.noticeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFirst()).compareTo(other.isSetFirst());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirst()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.first, other.first);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRemark()).compareTo(other.isSetRemark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remark, other.remark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HrWxNoticeMessageDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetWechatId()) {
      if (!first) sb.append(", ");
      sb.append("wechatId:");
      sb.append(this.wechatId);
      first = false;
    }
    if (isSetNoticeId()) {
      if (!first) sb.append(", ");
      sb.append("noticeId:");
      sb.append(this.noticeId);
      first = false;
    }
    if (isSetFirst()) {
      if (!first) sb.append(", ");
      sb.append("first:");
      if (this.first == null) {
        sb.append("null");
      } else {
        sb.append(this.first);
      }
      first = false;
    }
    if (isSetRemark()) {
      if (!first) sb.append(", ");
      sb.append("remark:");
      if (this.remark == null) {
        sb.append("null");
      } else {
        sb.append(this.remark);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
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

  private static class HrWxNoticeMessageDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrWxNoticeMessageDOStandardScheme getScheme() {
      return new HrWxNoticeMessageDOStandardScheme();
    }
  }

  private static class HrWxNoticeMessageDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrWxNoticeMessageDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrWxNoticeMessageDO struct) throws org.apache.thrift.TException {
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
          case 2: // WECHAT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wechatId = iprot.readI32();
              struct.setWechatIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOTICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.noticeId = iprot.readI32();
              struct.setNoticeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FIRST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.first = iprot.readString();
              struct.setFirstIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REMARK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.remark = iprot.readString();
              struct.setRemarkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.status = iprot.readDouble();
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrWxNoticeMessageDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWechatId()) {
        oprot.writeFieldBegin(WECHAT_ID_FIELD_DESC);
        oprot.writeI32(struct.wechatId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNoticeId()) {
        oprot.writeFieldBegin(NOTICE_ID_FIELD_DESC);
        oprot.writeI32(struct.noticeId);
        oprot.writeFieldEnd();
      }
      if (struct.first != null) {
        if (struct.isSetFirst()) {
          oprot.writeFieldBegin(FIRST_FIELD_DESC);
          oprot.writeString(struct.first);
          oprot.writeFieldEnd();
        }
      }
      if (struct.remark != null) {
        if (struct.isSetRemark()) {
          oprot.writeFieldBegin(REMARK_FIELD_DESC);
          oprot.writeString(struct.remark);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStatus()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeDouble(struct.status);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrWxNoticeMessageDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrWxNoticeMessageDOTupleScheme getScheme() {
      return new HrWxNoticeMessageDOTupleScheme();
    }
  }

  private static class HrWxNoticeMessageDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrWxNoticeMessageDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrWxNoticeMessageDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetWechatId()) {
        optionals.set(1);
      }
      if (struct.isSetNoticeId()) {
        optionals.set(2);
      }
      if (struct.isSetFirst()) {
        optionals.set(3);
      }
      if (struct.isSetRemark()) {
        optionals.set(4);
      }
      if (struct.isSetStatus()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetWechatId()) {
        oprot.writeI32(struct.wechatId);
      }
      if (struct.isSetNoticeId()) {
        oprot.writeI32(struct.noticeId);
      }
      if (struct.isSetFirst()) {
        oprot.writeString(struct.first);
      }
      if (struct.isSetRemark()) {
        oprot.writeString(struct.remark);
      }
      if (struct.isSetStatus()) {
        oprot.writeDouble(struct.status);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrWxNoticeMessageDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.wechatId = iprot.readI32();
        struct.setWechatIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.noticeId = iprot.readI32();
        struct.setNoticeIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.first = iprot.readString();
        struct.setFirstIsSet(true);
      }
      if (incoming.get(4)) {
        struct.remark = iprot.readString();
        struct.setRemarkIsSet(true);
      }
      if (incoming.get(5)) {
        struct.status = iprot.readDouble();
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

