/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.thirdpart.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-10-23")
public class ThirdPartyAccountInfoCity implements org.apache.thrift.TBase<ThirdPartyAccountInfoCity, ThirdPartyAccountInfoCity._Fields>, java.io.Serializable, Cloneable, Comparable<ThirdPartyAccountInfoCity> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThirdPartyAccountInfoCity");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField JOB_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobType", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField REMAIN_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("remainNum", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThirdPartyAccountInfoCityStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThirdPartyAccountInfoCityTupleSchemeFactory();

  public int id; // optional
  public int code; // optional
  public String name; // optional
  public byte jobType; // optional
  public int remainNum; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CODE((short)2, "code"),
    NAME((short)3, "name"),
    JOB_TYPE((short)4, "jobType"),
    REMAIN_NUM((short)5, "remainNum");

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
        case 1: // ID
          return ID;
        case 2: // CODE
          return CODE;
        case 3: // NAME
          return NAME;
        case 4: // JOB_TYPE
          return JOB_TYPE;
        case 5: // REMAIN_NUM
          return REMAIN_NUM;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __CODE_ISSET_ID = 1;
  private static final int __JOBTYPE_ISSET_ID = 2;
  private static final int __REMAINNUM_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.CODE,_Fields.NAME,_Fields.JOB_TYPE,_Fields.REMAIN_NUM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_TYPE, new org.apache.thrift.meta_data.FieldMetaData("jobType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.REMAIN_NUM, new org.apache.thrift.meta_data.FieldMetaData("remainNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThirdPartyAccountInfoCity.class, metaDataMap);
  }

  public ThirdPartyAccountInfoCity() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThirdPartyAccountInfoCity(ThirdPartyAccountInfoCity other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.code = other.code;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.jobType = other.jobType;
    this.remainNum = other.remainNum;
  }

  public ThirdPartyAccountInfoCity deepCopy() {
    return new ThirdPartyAccountInfoCity(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setCodeIsSet(false);
    this.code = 0;
    this.name = null;
    setJobTypeIsSet(false);
    this.jobType = 0;
    setRemainNumIsSet(false);
    this.remainNum = 0;
  }

  public int getId() {
    return this.id;
  }

  public ThirdPartyAccountInfoCity setId(int id) {
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

  public int getCode() {
    return this.code;
  }

  public ThirdPartyAccountInfoCity setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public ThirdPartyAccountInfoCity setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public byte getJobType() {
    return this.jobType;
  }

  public ThirdPartyAccountInfoCity setJobType(byte jobType) {
    this.jobType = jobType;
    setJobTypeIsSet(true);
    return this;
  }

  public void unsetJobType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOBTYPE_ISSET_ID);
  }

  /** Returns true if field jobType is set (has been assigned a value) and false otherwise */
  public boolean isSetJobType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOBTYPE_ISSET_ID);
  }

  public void setJobTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOBTYPE_ISSET_ID, value);
  }

  public int getRemainNum() {
    return this.remainNum;
  }

  public ThirdPartyAccountInfoCity setRemainNum(int remainNum) {
    this.remainNum = remainNum;
    setRemainNumIsSet(true);
    return this;
  }

  public void unsetRemainNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REMAINNUM_ISSET_ID);
  }

  /** Returns true if field remainNum is set (has been assigned a value) and false otherwise */
  public boolean isSetRemainNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REMAINNUM_ISSET_ID);
  }

  public void setRemainNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REMAINNUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case JOB_TYPE:
      if (value == null) {
        unsetJobType();
      } else {
        setJobType((Byte)value);
      }
      break;

    case REMAIN_NUM:
      if (value == null) {
        unsetRemainNum();
      } else {
        setRemainNum((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CODE:
      return getCode();

    case NAME:
      return getName();

    case JOB_TYPE:
      return getJobType();

    case REMAIN_NUM:
      return getRemainNum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CODE:
      return isSetCode();
    case NAME:
      return isSetName();
    case JOB_TYPE:
      return isSetJobType();
    case REMAIN_NUM:
      return isSetRemainNum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThirdPartyAccountInfoCity)
      return this.equals((ThirdPartyAccountInfoCity)that);
    return false;
  }

  public boolean equals(ThirdPartyAccountInfoCity that) {
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

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_jobType = true && this.isSetJobType();
    boolean that_present_jobType = true && that.isSetJobType();
    if (this_present_jobType || that_present_jobType) {
      if (!(this_present_jobType && that_present_jobType))
        return false;
      if (this.jobType != that.jobType)
        return false;
    }

    boolean this_present_remainNum = true && this.isSetRemainNum();
    boolean that_present_remainNum = true && that.isSetRemainNum();
    if (this_present_remainNum || that_present_remainNum) {
      if (!(this_present_remainNum && that_present_remainNum))
        return false;
      if (this.remainNum != that.remainNum)
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

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode())
      hashCode = hashCode * 8191 + code;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetJobType()) ? 131071 : 524287);
    if (isSetJobType())
      hashCode = hashCode * 8191 + (int) (jobType);

    hashCode = hashCode * 8191 + ((isSetRemainNum()) ? 131071 : 524287);
    if (isSetRemainNum())
      hashCode = hashCode * 8191 + remainNum;

    return hashCode;
  }

  @Override
  public int compareTo(ThirdPartyAccountInfoCity other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobType()).compareTo(other.isSetJobType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobType, other.jobType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemainNum()).compareTo(other.isSetRemainNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemainNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remainNum, other.remainNum);
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
    StringBuilder sb = new StringBuilder("ThirdPartyAccountInfoCity(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetCode()) {
      if (!first) sb.append(", ");
      sb.append("code:");
      sb.append(this.code);
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetJobType()) {
      if (!first) sb.append(", ");
      sb.append("jobType:");
      sb.append(this.jobType);
      first = false;
    }
    if (isSetRemainNum()) {
      if (!first) sb.append(", ");
      sb.append("remainNum:");
      sb.append(this.remainNum);
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

  private static class ThirdPartyAccountInfoCityStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThirdPartyAccountInfoCityStandardScheme getScheme() {
      return new ThirdPartyAccountInfoCityStandardScheme();
    }
  }

  private static class ThirdPartyAccountInfoCityStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThirdPartyAccountInfoCity> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThirdPartyAccountInfoCity struct) throws org.apache.thrift.TException {
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
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JOB_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.jobType = iprot.readByte();
              struct.setJobTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REMAIN_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.remainNum = iprot.readI32();
              struct.setRemainNumIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThirdPartyAccountInfoCity struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCode()) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeI32(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetJobType()) {
        oprot.writeFieldBegin(JOB_TYPE_FIELD_DESC);
        oprot.writeByte(struct.jobType);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRemainNum()) {
        oprot.writeFieldBegin(REMAIN_NUM_FIELD_DESC);
        oprot.writeI32(struct.remainNum);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThirdPartyAccountInfoCityTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThirdPartyAccountInfoCityTupleScheme getScheme() {
      return new ThirdPartyAccountInfoCityTupleScheme();
    }
  }

  private static class ThirdPartyAccountInfoCityTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThirdPartyAccountInfoCity> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThirdPartyAccountInfoCity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetJobType()) {
        optionals.set(3);
      }
      if (struct.isSetRemainNum()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetJobType()) {
        oprot.writeByte(struct.jobType);
      }
      if (struct.isSetRemainNum()) {
        oprot.writeI32(struct.remainNum);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThirdPartyAccountInfoCity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readI32();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.jobType = iprot.readByte();
        struct.setJobTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.remainNum = iprot.readI32();
        struct.setRemainNumIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

