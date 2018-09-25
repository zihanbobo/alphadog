/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.position.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-09-25")
public class ReferralPositionBonusStageDetailDO implements org.apache.thrift.TBase<ReferralPositionBonusStageDetailDO, ReferralPositionBonusStageDetailDO._Fields>, java.io.Serializable, Cloneable, Comparable<ReferralPositionBonusStageDetailDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReferralPositionBonusStageDetailDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REFERRAL_POSITION_BONUS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("referral_position_bonus_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("position_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STAGE_BONUS_FIELD_DESC = new org.apache.thrift.protocol.TField("stage_bonus", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STAGE_PROPORTION_FIELD_DESC = new org.apache.thrift.protocol.TField("stage_proportion", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField STAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("stage_type", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReferralPositionBonusStageDetailDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReferralPositionBonusStageDetailDOTupleSchemeFactory();

  public int id; // optional
  public int referral_position_bonus_id; // optional
  public int position_id; // optional
  public int stage_bonus; // optional
  public int stage_proportion; // optional
  public int stage_type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    REFERRAL_POSITION_BONUS_ID((short)2, "referral_position_bonus_id"),
    POSITION_ID((short)3, "position_id"),
    STAGE_BONUS((short)4, "stage_bonus"),
    STAGE_PROPORTION((short)5, "stage_proportion"),
    STAGE_TYPE((short)6, "stage_type");

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
        case 2: // REFERRAL_POSITION_BONUS_ID
          return REFERRAL_POSITION_BONUS_ID;
        case 3: // POSITION_ID
          return POSITION_ID;
        case 4: // STAGE_BONUS
          return STAGE_BONUS;
        case 5: // STAGE_PROPORTION
          return STAGE_PROPORTION;
        case 6: // STAGE_TYPE
          return STAGE_TYPE;
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
  private static final int __REFERRAL_POSITION_BONUS_ID_ISSET_ID = 1;
  private static final int __POSITION_ID_ISSET_ID = 2;
  private static final int __STAGE_BONUS_ISSET_ID = 3;
  private static final int __STAGE_PROPORTION_ISSET_ID = 4;
  private static final int __STAGE_TYPE_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.REFERRAL_POSITION_BONUS_ID,_Fields.POSITION_ID,_Fields.STAGE_BONUS,_Fields.STAGE_PROPORTION,_Fields.STAGE_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REFERRAL_POSITION_BONUS_ID, new org.apache.thrift.meta_data.FieldMetaData("referral_position_bonus_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POSITION_ID, new org.apache.thrift.meta_data.FieldMetaData("position_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAGE_BONUS, new org.apache.thrift.meta_data.FieldMetaData("stage_bonus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAGE_PROPORTION, new org.apache.thrift.meta_data.FieldMetaData("stage_proportion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("stage_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReferralPositionBonusStageDetailDO.class, metaDataMap);
  }

  public ReferralPositionBonusStageDetailDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReferralPositionBonusStageDetailDO(ReferralPositionBonusStageDetailDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.referral_position_bonus_id = other.referral_position_bonus_id;
    this.position_id = other.position_id;
    this.stage_bonus = other.stage_bonus;
    this.stage_proportion = other.stage_proportion;
    this.stage_type = other.stage_type;
  }

  public ReferralPositionBonusStageDetailDO deepCopy() {
    return new ReferralPositionBonusStageDetailDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setReferral_position_bonus_idIsSet(false);
    this.referral_position_bonus_id = 0;
    setPosition_idIsSet(false);
    this.position_id = 0;
    setStage_bonusIsSet(false);
    this.stage_bonus = 0;
    setStage_proportionIsSet(false);
    this.stage_proportion = 0;
    setStage_typeIsSet(false);
    this.stage_type = 0;
  }

  public int getId() {
    return this.id;
  }

  public ReferralPositionBonusStageDetailDO setId(int id) {
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

  public int getReferral_position_bonus_id() {
    return this.referral_position_bonus_id;
  }

  public ReferralPositionBonusStageDetailDO setReferral_position_bonus_id(int referral_position_bonus_id) {
    this.referral_position_bonus_id = referral_position_bonus_id;
    setReferral_position_bonus_idIsSet(true);
    return this;
  }

  public void unsetReferral_position_bonus_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REFERRAL_POSITION_BONUS_ID_ISSET_ID);
  }

  /** Returns true if field referral_position_bonus_id is set (has been assigned a value) and false otherwise */
  public boolean isSetReferral_position_bonus_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REFERRAL_POSITION_BONUS_ID_ISSET_ID);
  }

  public void setReferral_position_bonus_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REFERRAL_POSITION_BONUS_ID_ISSET_ID, value);
  }

  public int getPosition_id() {
    return this.position_id;
  }

  public ReferralPositionBonusStageDetailDO setPosition_id(int position_id) {
    this.position_id = position_id;
    setPosition_idIsSet(true);
    return this;
  }

  public void unsetPosition_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POSITION_ID_ISSET_ID);
  }

  /** Returns true if field position_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POSITION_ID_ISSET_ID);
  }

  public void setPosition_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POSITION_ID_ISSET_ID, value);
  }

  public int getStage_bonus() {
    return this.stage_bonus;
  }

  public ReferralPositionBonusStageDetailDO setStage_bonus(int stage_bonus) {
    this.stage_bonus = stage_bonus;
    setStage_bonusIsSet(true);
    return this;
  }

  public void unsetStage_bonus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STAGE_BONUS_ISSET_ID);
  }

  /** Returns true if field stage_bonus is set (has been assigned a value) and false otherwise */
  public boolean isSetStage_bonus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STAGE_BONUS_ISSET_ID);
  }

  public void setStage_bonusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STAGE_BONUS_ISSET_ID, value);
  }

  public int getStage_proportion() {
    return this.stage_proportion;
  }

  public ReferralPositionBonusStageDetailDO setStage_proportion(int stage_proportion) {
    this.stage_proportion = stage_proportion;
    setStage_proportionIsSet(true);
    return this;
  }

  public void unsetStage_proportion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STAGE_PROPORTION_ISSET_ID);
  }

  /** Returns true if field stage_proportion is set (has been assigned a value) and false otherwise */
  public boolean isSetStage_proportion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STAGE_PROPORTION_ISSET_ID);
  }

  public void setStage_proportionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STAGE_PROPORTION_ISSET_ID, value);
  }

  public int getStage_type() {
    return this.stage_type;
  }

  public ReferralPositionBonusStageDetailDO setStage_type(int stage_type) {
    this.stage_type = stage_type;
    setStage_typeIsSet(true);
    return this;
  }

  public void unsetStage_type() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STAGE_TYPE_ISSET_ID);
  }

  /** Returns true if field stage_type is set (has been assigned a value) and false otherwise */
  public boolean isSetStage_type() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STAGE_TYPE_ISSET_ID);
  }

  public void setStage_typeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STAGE_TYPE_ISSET_ID, value);
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

    case REFERRAL_POSITION_BONUS_ID:
      if (value == null) {
        unsetReferral_position_bonus_id();
      } else {
        setReferral_position_bonus_id((Integer)value);
      }
      break;

    case POSITION_ID:
      if (value == null) {
        unsetPosition_id();
      } else {
        setPosition_id((Integer)value);
      }
      break;

    case STAGE_BONUS:
      if (value == null) {
        unsetStage_bonus();
      } else {
        setStage_bonus((Integer)value);
      }
      break;

    case STAGE_PROPORTION:
      if (value == null) {
        unsetStage_proportion();
      } else {
        setStage_proportion((Integer)value);
      }
      break;

    case STAGE_TYPE:
      if (value == null) {
        unsetStage_type();
      } else {
        setStage_type((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case REFERRAL_POSITION_BONUS_ID:
      return getReferral_position_bonus_id();

    case POSITION_ID:
      return getPosition_id();

    case STAGE_BONUS:
      return getStage_bonus();

    case STAGE_PROPORTION:
      return getStage_proportion();

    case STAGE_TYPE:
      return getStage_type();

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
    case REFERRAL_POSITION_BONUS_ID:
      return isSetReferral_position_bonus_id();
    case POSITION_ID:
      return isSetPosition_id();
    case STAGE_BONUS:
      return isSetStage_bonus();
    case STAGE_PROPORTION:
      return isSetStage_proportion();
    case STAGE_TYPE:
      return isSetStage_type();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReferralPositionBonusStageDetailDO)
      return this.equals((ReferralPositionBonusStageDetailDO)that);
    return false;
  }

  public boolean equals(ReferralPositionBonusStageDetailDO that) {
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

    boolean this_present_referral_position_bonus_id = true && this.isSetReferral_position_bonus_id();
    boolean that_present_referral_position_bonus_id = true && that.isSetReferral_position_bonus_id();
    if (this_present_referral_position_bonus_id || that_present_referral_position_bonus_id) {
      if (!(this_present_referral_position_bonus_id && that_present_referral_position_bonus_id))
        return false;
      if (this.referral_position_bonus_id != that.referral_position_bonus_id)
        return false;
    }

    boolean this_present_position_id = true && this.isSetPosition_id();
    boolean that_present_position_id = true && that.isSetPosition_id();
    if (this_present_position_id || that_present_position_id) {
      if (!(this_present_position_id && that_present_position_id))
        return false;
      if (this.position_id != that.position_id)
        return false;
    }

    boolean this_present_stage_bonus = true && this.isSetStage_bonus();
    boolean that_present_stage_bonus = true && that.isSetStage_bonus();
    if (this_present_stage_bonus || that_present_stage_bonus) {
      if (!(this_present_stage_bonus && that_present_stage_bonus))
        return false;
      if (this.stage_bonus != that.stage_bonus)
        return false;
    }

    boolean this_present_stage_proportion = true && this.isSetStage_proportion();
    boolean that_present_stage_proportion = true && that.isSetStage_proportion();
    if (this_present_stage_proportion || that_present_stage_proportion) {
      if (!(this_present_stage_proportion && that_present_stage_proportion))
        return false;
      if (this.stage_proportion != that.stage_proportion)
        return false;
    }

    boolean this_present_stage_type = true && this.isSetStage_type();
    boolean that_present_stage_type = true && that.isSetStage_type();
    if (this_present_stage_type || that_present_stage_type) {
      if (!(this_present_stage_type && that_present_stage_type))
        return false;
      if (this.stage_type != that.stage_type)
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

    hashCode = hashCode * 8191 + ((isSetReferral_position_bonus_id()) ? 131071 : 524287);
    if (isSetReferral_position_bonus_id())
      hashCode = hashCode * 8191 + referral_position_bonus_id;

    hashCode = hashCode * 8191 + ((isSetPosition_id()) ? 131071 : 524287);
    if (isSetPosition_id())
      hashCode = hashCode * 8191 + position_id;

    hashCode = hashCode * 8191 + ((isSetStage_bonus()) ? 131071 : 524287);
    if (isSetStage_bonus())
      hashCode = hashCode * 8191 + stage_bonus;

    hashCode = hashCode * 8191 + ((isSetStage_proportion()) ? 131071 : 524287);
    if (isSetStage_proportion())
      hashCode = hashCode * 8191 + stage_proportion;

    hashCode = hashCode * 8191 + ((isSetStage_type()) ? 131071 : 524287);
    if (isSetStage_type())
      hashCode = hashCode * 8191 + stage_type;

    return hashCode;
  }

  @Override
  public int compareTo(ReferralPositionBonusStageDetailDO other) {
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
    lastComparison = Boolean.valueOf(isSetReferral_position_bonus_id()).compareTo(other.isSetReferral_position_bonus_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReferral_position_bonus_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.referral_position_bonus_id, other.referral_position_bonus_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPosition_id()).compareTo(other.isSetPosition_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position_id, other.position_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStage_bonus()).compareTo(other.isSetStage_bonus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStage_bonus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stage_bonus, other.stage_bonus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStage_proportion()).compareTo(other.isSetStage_proportion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStage_proportion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stage_proportion, other.stage_proportion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStage_type()).compareTo(other.isSetStage_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStage_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stage_type, other.stage_type);
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
    StringBuilder sb = new StringBuilder("ReferralPositionBonusStageDetailDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetReferral_position_bonus_id()) {
      if (!first) sb.append(", ");
      sb.append("referral_position_bonus_id:");
      sb.append(this.referral_position_bonus_id);
      first = false;
    }
    if (isSetPosition_id()) {
      if (!first) sb.append(", ");
      sb.append("position_id:");
      sb.append(this.position_id);
      first = false;
    }
    if (isSetStage_bonus()) {
      if (!first) sb.append(", ");
      sb.append("stage_bonus:");
      sb.append(this.stage_bonus);
      first = false;
    }
    if (isSetStage_proportion()) {
      if (!first) sb.append(", ");
      sb.append("stage_proportion:");
      sb.append(this.stage_proportion);
      first = false;
    }
    if (isSetStage_type()) {
      if (!first) sb.append(", ");
      sb.append("stage_type:");
      sb.append(this.stage_type);
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

  private static class ReferralPositionBonusStageDetailDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReferralPositionBonusStageDetailDOStandardScheme getScheme() {
      return new ReferralPositionBonusStageDetailDOStandardScheme();
    }
  }

  private static class ReferralPositionBonusStageDetailDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReferralPositionBonusStageDetailDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReferralPositionBonusStageDetailDO struct) throws org.apache.thrift.TException {
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
          case 2: // REFERRAL_POSITION_BONUS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.referral_position_bonus_id = iprot.readI32();
              struct.setReferral_position_bonus_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.position_id = iprot.readI32();
              struct.setPosition_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STAGE_BONUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stage_bonus = iprot.readI32();
              struct.setStage_bonusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STAGE_PROPORTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stage_proportion = iprot.readI32();
              struct.setStage_proportionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stage_type = iprot.readI32();
              struct.setStage_typeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReferralPositionBonusStageDetailDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReferral_position_bonus_id()) {
        oprot.writeFieldBegin(REFERRAL_POSITION_BONUS_ID_FIELD_DESC);
        oprot.writeI32(struct.referral_position_bonus_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPosition_id()) {
        oprot.writeFieldBegin(POSITION_ID_FIELD_DESC);
        oprot.writeI32(struct.position_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStage_bonus()) {
        oprot.writeFieldBegin(STAGE_BONUS_FIELD_DESC);
        oprot.writeI32(struct.stage_bonus);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStage_proportion()) {
        oprot.writeFieldBegin(STAGE_PROPORTION_FIELD_DESC);
        oprot.writeI32(struct.stage_proportion);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStage_type()) {
        oprot.writeFieldBegin(STAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.stage_type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReferralPositionBonusStageDetailDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReferralPositionBonusStageDetailDOTupleScheme getScheme() {
      return new ReferralPositionBonusStageDetailDOTupleScheme();
    }
  }

  private static class ReferralPositionBonusStageDetailDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReferralPositionBonusStageDetailDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReferralPositionBonusStageDetailDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetReferral_position_bonus_id()) {
        optionals.set(1);
      }
      if (struct.isSetPosition_id()) {
        optionals.set(2);
      }
      if (struct.isSetStage_bonus()) {
        optionals.set(3);
      }
      if (struct.isSetStage_proportion()) {
        optionals.set(4);
      }
      if (struct.isSetStage_type()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetReferral_position_bonus_id()) {
        oprot.writeI32(struct.referral_position_bonus_id);
      }
      if (struct.isSetPosition_id()) {
        oprot.writeI32(struct.position_id);
      }
      if (struct.isSetStage_bonus()) {
        oprot.writeI32(struct.stage_bonus);
      }
      if (struct.isSetStage_proportion()) {
        oprot.writeI32(struct.stage_proportion);
      }
      if (struct.isSetStage_type()) {
        oprot.writeI32(struct.stage_type);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReferralPositionBonusStageDetailDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.referral_position_bonus_id = iprot.readI32();
        struct.setReferral_position_bonus_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.position_id = iprot.readI32();
        struct.setPosition_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stage_bonus = iprot.readI32();
        struct.setStage_bonusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.stage_proportion = iprot.readI32();
        struct.setStage_proportionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.stage_type = iprot.readI32();
        struct.setStage_typeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

