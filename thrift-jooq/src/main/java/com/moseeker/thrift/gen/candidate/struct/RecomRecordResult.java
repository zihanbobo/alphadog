/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.candidate.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-04-11")
public class RecomRecordResult implements org.apache.thrift.TBase<RecomRecordResult, RecomRecordResult._Fields>, java.io.Serializable, Cloneable, Comparable<RecomRecordResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RecomRecordResult");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRESENTEE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("presenteeName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLICK_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("clickTime", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RECOM_FIELD_DESC = new org.apache.thrift.protocol.TField("recom", org.apache.thrift.protocol.TType.BYTE, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RecomRecordResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RecomRecordResultTupleSchemeFactory();

  public int id; // optional
  public java.lang.String title; // optional
  public java.lang.String presenteeName; // optional
  public java.lang.String clickTime; // optional
  public byte recom; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TITLE((short)2, "title"),
    PRESENTEE_NAME((short)3, "presenteeName"),
    CLICK_TIME((short)4, "clickTime"),
    RECOM((short)5, "recom");

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
        case 2: // TITLE
          return TITLE;
        case 3: // PRESENTEE_NAME
          return PRESENTEE_NAME;
        case 4: // CLICK_TIME
          return CLICK_TIME;
        case 5: // RECOM
          return RECOM;
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
  private static final int __RECOM_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.TITLE,_Fields.PRESENTEE_NAME,_Fields.CLICK_TIME,_Fields.RECOM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRESENTEE_NAME, new org.apache.thrift.meta_data.FieldMetaData("presenteeName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLICK_TIME, new org.apache.thrift.meta_data.FieldMetaData("clickTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECOM, new org.apache.thrift.meta_data.FieldMetaData("recom", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RecomRecordResult.class, metaDataMap);
  }

  public RecomRecordResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecomRecordResult(RecomRecordResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetPresenteeName()) {
      this.presenteeName = other.presenteeName;
    }
    if (other.isSetClickTime()) {
      this.clickTime = other.clickTime;
    }
    this.recom = other.recom;
  }

  public RecomRecordResult deepCopy() {
    return new RecomRecordResult(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.title = null;
    this.presenteeName = null;
    this.clickTime = null;
    setRecomIsSet(false);
    this.recom = 0;
  }

  public int getId() {
    return this.id;
  }

  public RecomRecordResult setId(int id) {
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

  public java.lang.String getTitle() {
    return this.title;
  }

  public RecomRecordResult setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public java.lang.String getPresenteeName() {
    return this.presenteeName;
  }

  public RecomRecordResult setPresenteeName(java.lang.String presenteeName) {
    this.presenteeName = presenteeName;
    return this;
  }

  public void unsetPresenteeName() {
    this.presenteeName = null;
  }

  /** Returns true if field presenteeName is set (has been assigned a value) and false otherwise */
  public boolean isSetPresenteeName() {
    return this.presenteeName != null;
  }

  public void setPresenteeNameIsSet(boolean value) {
    if (!value) {
      this.presenteeName = null;
    }
  }

  public java.lang.String getClickTime() {
    return this.clickTime;
  }

  public RecomRecordResult setClickTime(java.lang.String clickTime) {
    this.clickTime = clickTime;
    return this;
  }

  public void unsetClickTime() {
    this.clickTime = null;
  }

  /** Returns true if field clickTime is set (has been assigned a value) and false otherwise */
  public boolean isSetClickTime() {
    return this.clickTime != null;
  }

  public void setClickTimeIsSet(boolean value) {
    if (!value) {
      this.clickTime = null;
    }
  }

  public byte getRecom() {
    return this.recom;
  }

  public RecomRecordResult setRecom(byte recom) {
    this.recom = recom;
    setRecomIsSet(true);
    return this;
  }

  public void unsetRecom() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECOM_ISSET_ID);
  }

  /** Returns true if field recom is set (has been assigned a value) and false otherwise */
  public boolean isSetRecom() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECOM_ISSET_ID);
  }

  public void setRecomIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECOM_ISSET_ID, value);
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

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((java.lang.String)value);
      }
      break;

    case PRESENTEE_NAME:
      if (value == null) {
        unsetPresenteeName();
      } else {
        setPresenteeName((java.lang.String)value);
      }
      break;

    case CLICK_TIME:
      if (value == null) {
        unsetClickTime();
      } else {
        setClickTime((java.lang.String)value);
      }
      break;

    case RECOM:
      if (value == null) {
        unsetRecom();
      } else {
        setRecom((java.lang.Byte)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TITLE:
      return getTitle();

    case PRESENTEE_NAME:
      return getPresenteeName();

    case CLICK_TIME:
      return getClickTime();

    case RECOM:
      return getRecom();

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
    case TITLE:
      return isSetTitle();
    case PRESENTEE_NAME:
      return isSetPresenteeName();
    case CLICK_TIME:
      return isSetClickTime();
    case RECOM:
      return isSetRecom();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RecomRecordResult)
      return this.equals((RecomRecordResult)that);
    return false;
  }

  public boolean equals(RecomRecordResult that) {
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

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_presenteeName = true && this.isSetPresenteeName();
    boolean that_present_presenteeName = true && that.isSetPresenteeName();
    if (this_present_presenteeName || that_present_presenteeName) {
      if (!(this_present_presenteeName && that_present_presenteeName))
        return false;
      if (!this.presenteeName.equals(that.presenteeName))
        return false;
    }

    boolean this_present_clickTime = true && this.isSetClickTime();
    boolean that_present_clickTime = true && that.isSetClickTime();
    if (this_present_clickTime || that_present_clickTime) {
      if (!(this_present_clickTime && that_present_clickTime))
        return false;
      if (!this.clickTime.equals(that.clickTime))
        return false;
    }

    boolean this_present_recom = true && this.isSetRecom();
    boolean that_present_recom = true && that.isSetRecom();
    if (this_present_recom || that_present_recom) {
      if (!(this_present_recom && that_present_recom))
        return false;
      if (this.recom != that.recom)
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

    hashCode = hashCode * 8191 + ((isSetTitle()) ? 131071 : 524287);
    if (isSetTitle())
      hashCode = hashCode * 8191 + title.hashCode();

    hashCode = hashCode * 8191 + ((isSetPresenteeName()) ? 131071 : 524287);
    if (isSetPresenteeName())
      hashCode = hashCode * 8191 + presenteeName.hashCode();

    hashCode = hashCode * 8191 + ((isSetClickTime()) ? 131071 : 524287);
    if (isSetClickTime())
      hashCode = hashCode * 8191 + clickTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetRecom()) ? 131071 : 524287);
    if (isSetRecom())
      hashCode = hashCode * 8191 + (int) (recom);

    return hashCode;
  }

  @Override
  public int compareTo(RecomRecordResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPresenteeName()).compareTo(other.isSetPresenteeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPresenteeName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.presenteeName, other.presenteeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetClickTime()).compareTo(other.isSetClickTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClickTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clickTime, other.clickTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecom()).compareTo(other.isSetRecom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recom, other.recom);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RecomRecordResult(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetPresenteeName()) {
      if (!first) sb.append(", ");
      sb.append("presenteeName:");
      if (this.presenteeName == null) {
        sb.append("null");
      } else {
        sb.append(this.presenteeName);
      }
      first = false;
    }
    if (isSetClickTime()) {
      if (!first) sb.append(", ");
      sb.append("clickTime:");
      if (this.clickTime == null) {
        sb.append("null");
      } else {
        sb.append(this.clickTime);
      }
      first = false;
    }
    if (isSetRecom()) {
      if (!first) sb.append(", ");
      sb.append("recom:");
      sb.append(this.recom);
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

  private static class RecomRecordResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RecomRecordResultStandardScheme getScheme() {
      return new RecomRecordResultStandardScheme();
    }
  }

  private static class RecomRecordResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<RecomRecordResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RecomRecordResult struct) throws org.apache.thrift.TException {
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
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRESENTEE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.presenteeName = iprot.readString();
              struct.setPresenteeNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLICK_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clickTime = iprot.readString();
              struct.setClickTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RECOM
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.recom = iprot.readByte();
              struct.setRecomIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RecomRecordResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.presenteeName != null) {
        if (struct.isSetPresenteeName()) {
          oprot.writeFieldBegin(PRESENTEE_NAME_FIELD_DESC);
          oprot.writeString(struct.presenteeName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.clickTime != null) {
        if (struct.isSetClickTime()) {
          oprot.writeFieldBegin(CLICK_TIME_FIELD_DESC);
          oprot.writeString(struct.clickTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRecom()) {
        oprot.writeFieldBegin(RECOM_FIELD_DESC);
        oprot.writeByte(struct.recom);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RecomRecordResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RecomRecordResultTupleScheme getScheme() {
      return new RecomRecordResultTupleScheme();
    }
  }

  private static class RecomRecordResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<RecomRecordResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RecomRecordResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetPresenteeName()) {
        optionals.set(2);
      }
      if (struct.isSetClickTime()) {
        optionals.set(3);
      }
      if (struct.isSetRecom()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetPresenteeName()) {
        oprot.writeString(struct.presenteeName);
      }
      if (struct.isSetClickTime()) {
        oprot.writeString(struct.clickTime);
      }
      if (struct.isSetRecom()) {
        oprot.writeByte(struct.recom);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RecomRecordResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.presenteeName = iprot.readString();
        struct.setPresenteeNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.clickTime = iprot.readString();
        struct.setClickTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.recom = iprot.readByte();
        struct.setRecomIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
