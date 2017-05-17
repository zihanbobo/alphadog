/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.analytics;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-15")
public class StJdProfileLabelDO implements org.apache.thrift.TBase<StJdProfileLabelDO, StJdProfileLabelDO._Fields>, java.io.Serializable, Cloneable, Comparable<StJdProfileLabelDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StJdProfileLabelDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jdId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PROFILE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("profileId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField IS_MATCHED_FIELD_DESC = new org.apache.thrift.protocol.TField("isMatched", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField IS_GOOD_PROFILE_FIELD_DESC = new org.apache.thrift.protocol.TField("isGoodProfile", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField IS_GOOD_JD_FIELD_DESC = new org.apache.thrift.protocol.TField("isGoodJd", org.apache.thrift.protocol.TType.BYTE, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StJdProfileLabelDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StJdProfileLabelDOTupleSchemeFactory();

  public int id; // optional
  public int jdId; // optional
  public int profileId; // optional
  public byte isMatched; // optional
  public byte isGoodProfile; // optional
  public byte isGoodJd; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    JD_ID((short)2, "jdId"),
    PROFILE_ID((short)3, "profileId"),
    IS_MATCHED((short)4, "isMatched"),
    IS_GOOD_PROFILE((short)5, "isGoodProfile"),
    IS_GOOD_JD((short)6, "isGoodJd");

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
        case 2: // JD_ID
          return JD_ID;
        case 3: // PROFILE_ID
          return PROFILE_ID;
        case 4: // IS_MATCHED
          return IS_MATCHED;
        case 5: // IS_GOOD_PROFILE
          return IS_GOOD_PROFILE;
        case 6: // IS_GOOD_JD
          return IS_GOOD_JD;
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
  private static final int __JDID_ISSET_ID = 1;
  private static final int __PROFILEID_ISSET_ID = 2;
  private static final int __ISMATCHED_ISSET_ID = 3;
  private static final int __ISGOODPROFILE_ISSET_ID = 4;
  private static final int __ISGOODJD_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.JD_ID,_Fields.PROFILE_ID,_Fields.IS_MATCHED,_Fields.IS_GOOD_PROFILE,_Fields.IS_GOOD_JD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JD_ID, new org.apache.thrift.meta_data.FieldMetaData("jdId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROFILE_ID, new org.apache.thrift.meta_data.FieldMetaData("profileId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_MATCHED, new org.apache.thrift.meta_data.FieldMetaData("isMatched", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.IS_GOOD_PROFILE, new org.apache.thrift.meta_data.FieldMetaData("isGoodProfile", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.IS_GOOD_JD, new org.apache.thrift.meta_data.FieldMetaData("isGoodJd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StJdProfileLabelDO.class, metaDataMap);
  }

  public StJdProfileLabelDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StJdProfileLabelDO(StJdProfileLabelDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.jdId = other.jdId;
    this.profileId = other.profileId;
    this.isMatched = other.isMatched;
    this.isGoodProfile = other.isGoodProfile;
    this.isGoodJd = other.isGoodJd;
  }

  public StJdProfileLabelDO deepCopy() {
    return new StJdProfileLabelDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setJdIdIsSet(false);
    this.jdId = 0;
    setProfileIdIsSet(false);
    this.profileId = 0;
    setIsMatchedIsSet(false);
    this.isMatched = 0;
    setIsGoodProfileIsSet(false);
    this.isGoodProfile = 0;
    setIsGoodJdIsSet(false);
    this.isGoodJd = 0;
  }

  public int getId() {
    return this.id;
  }

  public StJdProfileLabelDO setId(int id) {
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

  public int getJdId() {
    return this.jdId;
  }

  public StJdProfileLabelDO setJdId(int jdId) {
    this.jdId = jdId;
    setJdIdIsSet(true);
    return this;
  }

  public void unsetJdId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JDID_ISSET_ID);
  }

  /** Returns true if field jdId is set (has been assigned a value) and false otherwise */
  public boolean isSetJdId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JDID_ISSET_ID);
  }

  public void setJdIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JDID_ISSET_ID, value);
  }

  public int getProfileId() {
    return this.profileId;
  }

  public StJdProfileLabelDO setProfileId(int profileId) {
    this.profileId = profileId;
    setProfileIdIsSet(true);
    return this;
  }

  public void unsetProfileId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PROFILEID_ISSET_ID);
  }

  /** Returns true if field profileId is set (has been assigned a value) and false otherwise */
  public boolean isSetProfileId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PROFILEID_ISSET_ID);
  }

  public void setProfileIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PROFILEID_ISSET_ID, value);
  }

  public byte getIsMatched() {
    return this.isMatched;
  }

  public StJdProfileLabelDO setIsMatched(byte isMatched) {
    this.isMatched = isMatched;
    setIsMatchedIsSet(true);
    return this;
  }

  public void unsetIsMatched() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISMATCHED_ISSET_ID);
  }

  /** Returns true if field isMatched is set (has been assigned a value) and false otherwise */
  public boolean isSetIsMatched() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISMATCHED_ISSET_ID);
  }

  public void setIsMatchedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISMATCHED_ISSET_ID, value);
  }

  public byte getIsGoodProfile() {
    return this.isGoodProfile;
  }

  public StJdProfileLabelDO setIsGoodProfile(byte isGoodProfile) {
    this.isGoodProfile = isGoodProfile;
    setIsGoodProfileIsSet(true);
    return this;
  }

  public void unsetIsGoodProfile() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISGOODPROFILE_ISSET_ID);
  }

  /** Returns true if field isGoodProfile is set (has been assigned a value) and false otherwise */
  public boolean isSetIsGoodProfile() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISGOODPROFILE_ISSET_ID);
  }

  public void setIsGoodProfileIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISGOODPROFILE_ISSET_ID, value);
  }

  public byte getIsGoodJd() {
    return this.isGoodJd;
  }

  public StJdProfileLabelDO setIsGoodJd(byte isGoodJd) {
    this.isGoodJd = isGoodJd;
    setIsGoodJdIsSet(true);
    return this;
  }

  public void unsetIsGoodJd() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISGOODJD_ISSET_ID);
  }

  /** Returns true if field isGoodJd is set (has been assigned a value) and false otherwise */
  public boolean isSetIsGoodJd() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISGOODJD_ISSET_ID);
  }

  public void setIsGoodJdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISGOODJD_ISSET_ID, value);
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

    case JD_ID:
      if (value == null) {
        unsetJdId();
      } else {
        setJdId((java.lang.Integer)value);
      }
      break;

    case PROFILE_ID:
      if (value == null) {
        unsetProfileId();
      } else {
        setProfileId((java.lang.Integer)value);
      }
      break;

    case IS_MATCHED:
      if (value == null) {
        unsetIsMatched();
      } else {
        setIsMatched((java.lang.Byte)value);
      }
      break;

    case IS_GOOD_PROFILE:
      if (value == null) {
        unsetIsGoodProfile();
      } else {
        setIsGoodProfile((java.lang.Byte)value);
      }
      break;

    case IS_GOOD_JD:
      if (value == null) {
        unsetIsGoodJd();
      } else {
        setIsGoodJd((java.lang.Byte)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case JD_ID:
      return getJdId();

    case PROFILE_ID:
      return getProfileId();

    case IS_MATCHED:
      return getIsMatched();

    case IS_GOOD_PROFILE:
      return getIsGoodProfile();

    case IS_GOOD_JD:
      return getIsGoodJd();

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
    case JD_ID:
      return isSetJdId();
    case PROFILE_ID:
      return isSetProfileId();
    case IS_MATCHED:
      return isSetIsMatched();
    case IS_GOOD_PROFILE:
      return isSetIsGoodProfile();
    case IS_GOOD_JD:
      return isSetIsGoodJd();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StJdProfileLabelDO)
      return this.equals((StJdProfileLabelDO)that);
    return false;
  }

  public boolean equals(StJdProfileLabelDO that) {
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

    boolean this_present_jdId = true && this.isSetJdId();
    boolean that_present_jdId = true && that.isSetJdId();
    if (this_present_jdId || that_present_jdId) {
      if (!(this_present_jdId && that_present_jdId))
        return false;
      if (this.jdId != that.jdId)
        return false;
    }

    boolean this_present_profileId = true && this.isSetProfileId();
    boolean that_present_profileId = true && that.isSetProfileId();
    if (this_present_profileId || that_present_profileId) {
      if (!(this_present_profileId && that_present_profileId))
        return false;
      if (this.profileId != that.profileId)
        return false;
    }

    boolean this_present_isMatched = true && this.isSetIsMatched();
    boolean that_present_isMatched = true && that.isSetIsMatched();
    if (this_present_isMatched || that_present_isMatched) {
      if (!(this_present_isMatched && that_present_isMatched))
        return false;
      if (this.isMatched != that.isMatched)
        return false;
    }

    boolean this_present_isGoodProfile = true && this.isSetIsGoodProfile();
    boolean that_present_isGoodProfile = true && that.isSetIsGoodProfile();
    if (this_present_isGoodProfile || that_present_isGoodProfile) {
      if (!(this_present_isGoodProfile && that_present_isGoodProfile))
        return false;
      if (this.isGoodProfile != that.isGoodProfile)
        return false;
    }

    boolean this_present_isGoodJd = true && this.isSetIsGoodJd();
    boolean that_present_isGoodJd = true && that.isSetIsGoodJd();
    if (this_present_isGoodJd || that_present_isGoodJd) {
      if (!(this_present_isGoodJd && that_present_isGoodJd))
        return false;
      if (this.isGoodJd != that.isGoodJd)
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

    hashCode = hashCode * 8191 + ((isSetJdId()) ? 131071 : 524287);
    if (isSetJdId())
      hashCode = hashCode * 8191 + jdId;

    hashCode = hashCode * 8191 + ((isSetProfileId()) ? 131071 : 524287);
    if (isSetProfileId())
      hashCode = hashCode * 8191 + profileId;

    hashCode = hashCode * 8191 + ((isSetIsMatched()) ? 131071 : 524287);
    if (isSetIsMatched())
      hashCode = hashCode * 8191 + (int) (isMatched);

    hashCode = hashCode * 8191 + ((isSetIsGoodProfile()) ? 131071 : 524287);
    if (isSetIsGoodProfile())
      hashCode = hashCode * 8191 + (int) (isGoodProfile);

    hashCode = hashCode * 8191 + ((isSetIsGoodJd()) ? 131071 : 524287);
    if (isSetIsGoodJd())
      hashCode = hashCode * 8191 + (int) (isGoodJd);

    return hashCode;
  }

  @Override
  public int compareTo(StJdProfileLabelDO other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetJdId()).compareTo(other.isSetJdId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJdId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jdId, other.jdId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProfileId()).compareTo(other.isSetProfileId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfileId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profileId, other.profileId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsMatched()).compareTo(other.isSetIsMatched());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsMatched()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isMatched, other.isMatched);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsGoodProfile()).compareTo(other.isSetIsGoodProfile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsGoodProfile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isGoodProfile, other.isGoodProfile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsGoodJd()).compareTo(other.isSetIsGoodJd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsGoodJd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isGoodJd, other.isGoodJd);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StJdProfileLabelDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetJdId()) {
      if (!first) sb.append(", ");
      sb.append("jdId:");
      sb.append(this.jdId);
      first = false;
    }
    if (isSetProfileId()) {
      if (!first) sb.append(", ");
      sb.append("profileId:");
      sb.append(this.profileId);
      first = false;
    }
    if (isSetIsMatched()) {
      if (!first) sb.append(", ");
      sb.append("isMatched:");
      sb.append(this.isMatched);
      first = false;
    }
    if (isSetIsGoodProfile()) {
      if (!first) sb.append(", ");
      sb.append("isGoodProfile:");
      sb.append(this.isGoodProfile);
      first = false;
    }
    if (isSetIsGoodJd()) {
      if (!first) sb.append(", ");
      sb.append("isGoodJd:");
      sb.append(this.isGoodJd);
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

  private static class StJdProfileLabelDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StJdProfileLabelDOStandardScheme getScheme() {
      return new StJdProfileLabelDOStandardScheme();
    }
  }

  private static class StJdProfileLabelDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<StJdProfileLabelDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StJdProfileLabelDO struct) throws org.apache.thrift.TException {
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
          case 2: // JD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jdId = iprot.readI32();
              struct.setJdIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROFILE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.profileId = iprot.readI32();
              struct.setProfileIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_MATCHED
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.isMatched = iprot.readByte();
              struct.setIsMatchedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_GOOD_PROFILE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.isGoodProfile = iprot.readByte();
              struct.setIsGoodProfileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_GOOD_JD
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.isGoodJd = iprot.readByte();
              struct.setIsGoodJdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StJdProfileLabelDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetJdId()) {
        oprot.writeFieldBegin(JD_ID_FIELD_DESC);
        oprot.writeI32(struct.jdId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetProfileId()) {
        oprot.writeFieldBegin(PROFILE_ID_FIELD_DESC);
        oprot.writeI32(struct.profileId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsMatched()) {
        oprot.writeFieldBegin(IS_MATCHED_FIELD_DESC);
        oprot.writeByte(struct.isMatched);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsGoodProfile()) {
        oprot.writeFieldBegin(IS_GOOD_PROFILE_FIELD_DESC);
        oprot.writeByte(struct.isGoodProfile);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsGoodJd()) {
        oprot.writeFieldBegin(IS_GOOD_JD_FIELD_DESC);
        oprot.writeByte(struct.isGoodJd);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StJdProfileLabelDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StJdProfileLabelDOTupleScheme getScheme() {
      return new StJdProfileLabelDOTupleScheme();
    }
  }

  private static class StJdProfileLabelDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<StJdProfileLabelDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StJdProfileLabelDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetJdId()) {
        optionals.set(1);
      }
      if (struct.isSetProfileId()) {
        optionals.set(2);
      }
      if (struct.isSetIsMatched()) {
        optionals.set(3);
      }
      if (struct.isSetIsGoodProfile()) {
        optionals.set(4);
      }
      if (struct.isSetIsGoodJd()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetJdId()) {
        oprot.writeI32(struct.jdId);
      }
      if (struct.isSetProfileId()) {
        oprot.writeI32(struct.profileId);
      }
      if (struct.isSetIsMatched()) {
        oprot.writeByte(struct.isMatched);
      }
      if (struct.isSetIsGoodProfile()) {
        oprot.writeByte(struct.isGoodProfile);
      }
      if (struct.isSetIsGoodJd()) {
        oprot.writeByte(struct.isGoodJd);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StJdProfileLabelDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jdId = iprot.readI32();
        struct.setJdIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.profileId = iprot.readI32();
        struct.setProfileIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isMatched = iprot.readByte();
        struct.setIsMatchedIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isGoodProfile = iprot.readByte();
        struct.setIsGoodProfileIsSet(true);
      }
      if (incoming.get(5)) {
        struct.isGoodJd = iprot.readByte();
        struct.setIsGoodJdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

