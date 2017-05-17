/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.analytics;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-15")
public class StLoadResumeRawDO implements org.apache.thrift.TBase<StLoadResumeRawDO, StLoadResumeRawDO._Fields>, java.io.Serializable, Cloneable, Comparable<StLoadResumeRawDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StLoadResumeRawDO");

  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField WAY_FIELD_DESC = new org.apache.thrift.protocol.TField("way", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StLoadResumeRawDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StLoadResumeRawDOTupleSchemeFactory();

  public java.lang.String createTime; // optional
  public long status; // optional
  public java.lang.String url; // optional
  public long userId; // optional
  public java.lang.String way; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATE_TIME((short)1, "createTime"),
    STATUS((short)2, "status"),
    URL((short)3, "url"),
    USER_ID((short)4, "userId"),
    WAY((short)5, "way");

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
        case 1: // CREATE_TIME
          return CREATE_TIME;
        case 2: // STATUS
          return STATUS;
        case 3: // URL
          return URL;
        case 4: // USER_ID
          return USER_ID;
        case 5: // WAY
          return WAY;
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
  private static final int __STATUS_ISSET_ID = 0;
  private static final int __USERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CREATE_TIME,_Fields.STATUS,_Fields.URL,_Fields.USER_ID,_Fields.WAY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WAY, new org.apache.thrift.meta_data.FieldMetaData("way", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StLoadResumeRawDO.class, metaDataMap);
  }

  public StLoadResumeRawDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StLoadResumeRawDO(StLoadResumeRawDO other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
    this.status = other.status;
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    this.userId = other.userId;
    if (other.isSetWay()) {
      this.way = other.way;
    }
  }

  public StLoadResumeRawDO deepCopy() {
    return new StLoadResumeRawDO(this);
  }

  @Override
  public void clear() {
    this.createTime = null;
    setStatusIsSet(false);
    this.status = 0;
    this.url = null;
    setUserIdIsSet(false);
    this.userId = 0;
    this.way = null;
  }

  public java.lang.String getCreateTime() {
    return this.createTime;
  }

  public StLoadResumeRawDO setCreateTime(java.lang.String createTime) {
    this.createTime = createTime;
    return this;
  }

  public void unsetCreateTime() {
    this.createTime = null;
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return this.createTime != null;
  }

  public void setCreateTimeIsSet(boolean value) {
    if (!value) {
      this.createTime = null;
    }
  }

  public long getStatus() {
    return this.status;
  }

  public StLoadResumeRawDO setStatus(long status) {
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

  public java.lang.String getUrl() {
    return this.url;
  }

  public StLoadResumeRawDO setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public long getUserId() {
    return this.userId;
  }

  public StLoadResumeRawDO setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public java.lang.String getWay() {
    return this.way;
  }

  public StLoadResumeRawDO setWay(java.lang.String way) {
    this.way = way;
    return this;
  }

  public void unsetWay() {
    this.way = null;
  }

  /** Returns true if field way is set (has been assigned a value) and false otherwise */
  public boolean isSetWay() {
    return this.way != null;
  }

  public void setWayIsSet(boolean value) {
    if (!value) {
      this.way = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((java.lang.String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Long)value);
      }
      break;

    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((java.lang.String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.Long)value);
      }
      break;

    case WAY:
      if (value == null) {
        unsetWay();
      } else {
        setWay((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATE_TIME:
      return getCreateTime();

    case STATUS:
      return getStatus();

    case URL:
      return getUrl();

    case USER_ID:
      return getUserId();

    case WAY:
      return getWay();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CREATE_TIME:
      return isSetCreateTime();
    case STATUS:
      return isSetStatus();
    case URL:
      return isSetUrl();
    case USER_ID:
      return isSetUserId();
    case WAY:
      return isSetWay();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StLoadResumeRawDO)
      return this.equals((StLoadResumeRawDO)that);
    return false;
  }

  public boolean equals(StLoadResumeRawDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_createTime = true && this.isSetCreateTime();
    boolean that_present_createTime = true && that.isSetCreateTime();
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (!this.createTime.equals(that.createTime))
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

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_way = true && this.isSetWay();
    boolean that_present_way = true && that.isSetWay();
    if (this_present_way || that_present_way) {
      if (!(this_present_way && that_present_way))
        return false;
      if (!this.way.equals(that.way))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(status);

    hashCode = hashCode * 8191 + ((isSetUrl()) ? 131071 : 524287);
    if (isSetUrl())
      hashCode = hashCode * 8191 + url.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
    if (isSetUserId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(userId);

    hashCode = hashCode * 8191 + ((isSetWay()) ? 131071 : 524287);
    if (isSetWay())
      hashCode = hashCode * 8191 + way.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StLoadResumeRawDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
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
    lastComparison = java.lang.Boolean.valueOf(isSetUrl()).compareTo(other.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, other.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWay()).compareTo(other.isSetWay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.way, other.way);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StLoadResumeRawDO(");
    boolean first = true;

    if (isSetCreateTime()) {
      sb.append("createTime:");
      if (this.createTime == null) {
        sb.append("null");
      } else {
        sb.append(this.createTime);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
      first = false;
    }
    if (isSetUrl()) {
      if (!first) sb.append(", ");
      sb.append("url:");
      if (this.url == null) {
        sb.append("null");
      } else {
        sb.append(this.url);
      }
      first = false;
    }
    if (isSetUserId()) {
      if (!first) sb.append(", ");
      sb.append("userId:");
      sb.append(this.userId);
      first = false;
    }
    if (isSetWay()) {
      if (!first) sb.append(", ");
      sb.append("way:");
      if (this.way == null) {
        sb.append("null");
      } else {
        sb.append(this.way);
      }
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

  private static class StLoadResumeRawDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StLoadResumeRawDOStandardScheme getScheme() {
      return new StLoadResumeRawDOStandardScheme();
    }
  }

  private static class StLoadResumeRawDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<StLoadResumeRawDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StLoadResumeRawDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createTime = iprot.readString();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.status = iprot.readI64();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userId = iprot.readI64();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // WAY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.way = iprot.readString();
              struct.setWayIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StLoadResumeRawDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.createTime != null) {
        if (struct.isSetCreateTime()) {
          oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
          oprot.writeString(struct.createTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStatus()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI64(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.url != null) {
        if (struct.isSetUrl()) {
          oprot.writeFieldBegin(URL_FIELD_DESC);
          oprot.writeString(struct.url);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetUserId()) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeI64(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.way != null) {
        if (struct.isSetWay()) {
          oprot.writeFieldBegin(WAY_FIELD_DESC);
          oprot.writeString(struct.way);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StLoadResumeRawDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StLoadResumeRawDOTupleScheme getScheme() {
      return new StLoadResumeRawDOTupleScheme();
    }
  }

  private static class StLoadResumeRawDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<StLoadResumeRawDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StLoadResumeRawDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCreateTime()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetUrl()) {
        optionals.set(2);
      }
      if (struct.isSetUserId()) {
        optionals.set(3);
      }
      if (struct.isSetWay()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
      if (struct.isSetStatus()) {
        oprot.writeI64(struct.status);
      }
      if (struct.isSetUrl()) {
        oprot.writeString(struct.url);
      }
      if (struct.isSetUserId()) {
        oprot.writeI64(struct.userId);
      }
      if (struct.isSetWay()) {
        oprot.writeString(struct.way);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StLoadResumeRawDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = iprot.readI64();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.url = iprot.readString();
        struct.setUrlIsSet(true);
      }
      if (incoming.get(3)) {
        struct.userId = iprot.readI64();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.way = iprot.readString();
        struct.setWayIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

