/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.profiledb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-16")
public class ProfileIntentionPositionDO implements org.apache.thrift.TBase<ProfileIntentionPositionDO, ProfileIntentionPositionDO._Fields>, java.io.Serializable, Cloneable, Comparable<ProfileIntentionPositionDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProfileIntentionPositionDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PROFILE_INTENTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("profileIntentionId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("positionCode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField POSITION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("positionName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProfileIntentionPositionDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProfileIntentionPositionDOTupleSchemeFactory();

  public int id; // optional
  public int profileIntentionId; // optional
  public int positionCode; // optional
  public String positionName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    PROFILE_INTENTION_ID((short)2, "profileIntentionId"),
    POSITION_CODE((short)3, "positionCode"),
    POSITION_NAME((short)4, "positionName");

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
        case 2: // PROFILE_INTENTION_ID
          return PROFILE_INTENTION_ID;
        case 3: // POSITION_CODE
          return POSITION_CODE;
        case 4: // POSITION_NAME
          return POSITION_NAME;
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
  private static final int __PROFILEINTENTIONID_ISSET_ID = 1;
  private static final int __POSITIONCODE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.PROFILE_INTENTION_ID,_Fields.POSITION_CODE,_Fields.POSITION_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROFILE_INTENTION_ID, new org.apache.thrift.meta_data.FieldMetaData("profileIntentionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POSITION_CODE, new org.apache.thrift.meta_data.FieldMetaData("positionCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POSITION_NAME, new org.apache.thrift.meta_data.FieldMetaData("positionName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProfileIntentionPositionDO.class, metaDataMap);
  }

  public ProfileIntentionPositionDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProfileIntentionPositionDO(ProfileIntentionPositionDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.profileIntentionId = other.profileIntentionId;
    this.positionCode = other.positionCode;
    if (other.isSetPositionName()) {
      this.positionName = other.positionName;
    }
  }

  public ProfileIntentionPositionDO deepCopy() {
    return new ProfileIntentionPositionDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setProfileIntentionIdIsSet(false);
    this.profileIntentionId = 0;
    setPositionCodeIsSet(false);
    this.positionCode = 0;
    this.positionName = null;
  }

  public int getId() {
    return this.id;
  }

  public ProfileIntentionPositionDO setId(int id) {
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

  public int getProfileIntentionId() {
    return this.profileIntentionId;
  }

  public ProfileIntentionPositionDO setProfileIntentionId(int profileIntentionId) {
    this.profileIntentionId = profileIntentionId;
    setProfileIntentionIdIsSet(true);
    return this;
  }

  public void unsetProfileIntentionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PROFILEINTENTIONID_ISSET_ID);
  }

  /** Returns true if field profileIntentionId is set (has been assigned a value) and false otherwise */
  public boolean isSetProfileIntentionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PROFILEINTENTIONID_ISSET_ID);
  }

  public void setProfileIntentionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PROFILEINTENTIONID_ISSET_ID, value);
  }

  public int getPositionCode() {
    return this.positionCode;
  }

  public ProfileIntentionPositionDO setPositionCode(int positionCode) {
    this.positionCode = positionCode;
    setPositionCodeIsSet(true);
    return this;
  }

  public void unsetPositionCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POSITIONCODE_ISSET_ID);
  }

  /** Returns true if field positionCode is set (has been assigned a value) and false otherwise */
  public boolean isSetPositionCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POSITIONCODE_ISSET_ID);
  }

  public void setPositionCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POSITIONCODE_ISSET_ID, value);
  }

  public String getPositionName() {
    return this.positionName;
  }

  public ProfileIntentionPositionDO setPositionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  public void unsetPositionName() {
    this.positionName = null;
  }

  /** Returns true if field positionName is set (has been assigned a value) and false otherwise */
  public boolean isSetPositionName() {
    return this.positionName != null;
  }

  public void setPositionNameIsSet(boolean value) {
    if (!value) {
      this.positionName = null;
    }
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

    case PROFILE_INTENTION_ID:
      if (value == null) {
        unsetProfileIntentionId();
      } else {
        setProfileIntentionId((Integer)value);
      }
      break;

    case POSITION_CODE:
      if (value == null) {
        unsetPositionCode();
      } else {
        setPositionCode((Integer)value);
      }
      break;

    case POSITION_NAME:
      if (value == null) {
        unsetPositionName();
      } else {
        setPositionName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case PROFILE_INTENTION_ID:
      return getProfileIntentionId();

    case POSITION_CODE:
      return getPositionCode();

    case POSITION_NAME:
      return getPositionName();

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
    case PROFILE_INTENTION_ID:
      return isSetProfileIntentionId();
    case POSITION_CODE:
      return isSetPositionCode();
    case POSITION_NAME:
      return isSetPositionName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProfileIntentionPositionDO)
      return this.equals((ProfileIntentionPositionDO)that);
    return false;
  }

  public boolean equals(ProfileIntentionPositionDO that) {
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

    boolean this_present_profileIntentionId = true && this.isSetProfileIntentionId();
    boolean that_present_profileIntentionId = true && that.isSetProfileIntentionId();
    if (this_present_profileIntentionId || that_present_profileIntentionId) {
      if (!(this_present_profileIntentionId && that_present_profileIntentionId))
        return false;
      if (this.profileIntentionId != that.profileIntentionId)
        return false;
    }

    boolean this_present_positionCode = true && this.isSetPositionCode();
    boolean that_present_positionCode = true && that.isSetPositionCode();
    if (this_present_positionCode || that_present_positionCode) {
      if (!(this_present_positionCode && that_present_positionCode))
        return false;
      if (this.positionCode != that.positionCode)
        return false;
    }

    boolean this_present_positionName = true && this.isSetPositionName();
    boolean that_present_positionName = true && that.isSetPositionName();
    if (this_present_positionName || that_present_positionName) {
      if (!(this_present_positionName && that_present_positionName))
        return false;
      if (!this.positionName.equals(that.positionName))
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

    hashCode = hashCode * 8191 + ((isSetProfileIntentionId()) ? 131071 : 524287);
    if (isSetProfileIntentionId())
      hashCode = hashCode * 8191 + profileIntentionId;

    hashCode = hashCode * 8191 + ((isSetPositionCode()) ? 131071 : 524287);
    if (isSetPositionCode())
      hashCode = hashCode * 8191 + positionCode;

    hashCode = hashCode * 8191 + ((isSetPositionName()) ? 131071 : 524287);
    if (isSetPositionName())
      hashCode = hashCode * 8191 + positionName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProfileIntentionPositionDO other) {
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
    lastComparison = Boolean.valueOf(isSetProfileIntentionId()).compareTo(other.isSetProfileIntentionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfileIntentionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profileIntentionId, other.profileIntentionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPositionCode()).compareTo(other.isSetPositionCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositionCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionCode, other.positionCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPositionName()).compareTo(other.isSetPositionName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositionName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionName, other.positionName);
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
    StringBuilder sb = new StringBuilder("ProfileIntentionPositionDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetProfileIntentionId()) {
      if (!first) sb.append(", ");
      sb.append("profileIntentionId:");
      sb.append(this.profileIntentionId);
      first = false;
    }
    if (isSetPositionCode()) {
      if (!first) sb.append(", ");
      sb.append("positionCode:");
      sb.append(this.positionCode);
      first = false;
    }
    if (isSetPositionName()) {
      if (!first) sb.append(", ");
      sb.append("positionName:");
      if (this.positionName == null) {
        sb.append("null");
      } else {
        sb.append(this.positionName);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProfileIntentionPositionDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileIntentionPositionDOStandardScheme getScheme() {
      return new ProfileIntentionPositionDOStandardScheme();
    }
  }

  private static class ProfileIntentionPositionDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProfileIntentionPositionDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProfileIntentionPositionDO struct) throws org.apache.thrift.TException {
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
          case 2: // PROFILE_INTENTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.profileIntentionId = iprot.readI32();
              struct.setProfileIntentionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.positionCode = iprot.readI32();
              struct.setPositionCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // POSITION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.positionName = iprot.readString();
              struct.setPositionNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProfileIntentionPositionDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetProfileIntentionId()) {
        oprot.writeFieldBegin(PROFILE_INTENTION_ID_FIELD_DESC);
        oprot.writeI32(struct.profileIntentionId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPositionCode()) {
        oprot.writeFieldBegin(POSITION_CODE_FIELD_DESC);
        oprot.writeI32(struct.positionCode);
        oprot.writeFieldEnd();
      }
      if (struct.positionName != null) {
        if (struct.isSetPositionName()) {
          oprot.writeFieldBegin(POSITION_NAME_FIELD_DESC);
          oprot.writeString(struct.positionName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileIntentionPositionDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileIntentionPositionDOTupleScheme getScheme() {
      return new ProfileIntentionPositionDOTupleScheme();
    }
  }

  private static class ProfileIntentionPositionDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProfileIntentionPositionDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProfileIntentionPositionDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetProfileIntentionId()) {
        optionals.set(1);
      }
      if (struct.isSetPositionCode()) {
        optionals.set(2);
      }
      if (struct.isSetPositionName()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetProfileIntentionId()) {
        oprot.writeI32(struct.profileIntentionId);
      }
      if (struct.isSetPositionCode()) {
        oprot.writeI32(struct.positionCode);
      }
      if (struct.isSetPositionName()) {
        oprot.writeString(struct.positionName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProfileIntentionPositionDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.profileIntentionId = iprot.readI32();
        struct.setProfileIntentionIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.positionCode = iprot.readI32();
        struct.setPositionCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.positionName = iprot.readString();
        struct.setPositionNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

