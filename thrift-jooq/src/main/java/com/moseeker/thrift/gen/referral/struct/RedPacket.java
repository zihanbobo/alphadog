/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.referral.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-09-27")
public class RedPacket implements org.apache.thrift.TBase<RedPacket, RedPacket._Fields>, java.io.Serializable, Cloneable, Comparable<RedPacket> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RedPacket");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OPEN_FIELD_DESC = new org.apache.thrift.protocol.TField("open", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField POSITION_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("positionTitle", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CANDIDATE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("candidateName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField OPEN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("openTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField CARDNO_FIELD_DESC = new org.apache.thrift.protocol.TField("cardno", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RedPacketStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RedPacketTupleSchemeFactory();

  public int type; // optional
  public java.lang.String name; // optional
  public boolean open; // optional
  public double value; // optional
  public java.lang.String positionTitle; // optional
  public java.lang.String candidateName; // optional
  public long openTime; // optional
  public java.lang.String cardno; // optional
  public int id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    NAME((short)2, "name"),
    OPEN((short)3, "open"),
    VALUE((short)4, "value"),
    POSITION_TITLE((short)5, "positionTitle"),
    CANDIDATE_NAME((short)6, "candidateName"),
    OPEN_TIME((short)7, "openTime"),
    CARDNO((short)8, "cardno"),
    ID((short)9, "id");

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
        case 1: // TYPE
          return TYPE;
        case 2: // NAME
          return NAME;
        case 3: // OPEN
          return OPEN;
        case 4: // VALUE
          return VALUE;
        case 5: // POSITION_TITLE
          return POSITION_TITLE;
        case 6: // CANDIDATE_NAME
          return CANDIDATE_NAME;
        case 7: // OPEN_TIME
          return OPEN_TIME;
        case 8: // CARDNO
          return CARDNO;
        case 9: // ID
          return ID;
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
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __OPEN_ISSET_ID = 1;
  private static final int __VALUE_ISSET_ID = 2;
  private static final int __OPENTIME_ISSET_ID = 3;
  private static final int __ID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.NAME,_Fields.OPEN,_Fields.VALUE,_Fields.POSITION_TITLE,_Fields.CANDIDATE_NAME,_Fields.OPEN_TIME,_Fields.CARDNO,_Fields.ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPEN, new org.apache.thrift.meta_data.FieldMetaData("open", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.POSITION_TITLE, new org.apache.thrift.meta_data.FieldMetaData("positionTitle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CANDIDATE_NAME, new org.apache.thrift.meta_data.FieldMetaData("candidateName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPEN_TIME, new org.apache.thrift.meta_data.FieldMetaData("openTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CARDNO, new org.apache.thrift.meta_data.FieldMetaData("cardno", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RedPacket.class, metaDataMap);
  }

  public RedPacket() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RedPacket(RedPacket other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.open = other.open;
    this.value = other.value;
    if (other.isSetPositionTitle()) {
      this.positionTitle = other.positionTitle;
    }
    if (other.isSetCandidateName()) {
      this.candidateName = other.candidateName;
    }
    this.openTime = other.openTime;
    if (other.isSetCardno()) {
      this.cardno = other.cardno;
    }
    this.id = other.id;
  }

  public RedPacket deepCopy() {
    return new RedPacket(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    this.name = null;
    setOpenIsSet(false);
    this.open = false;
    setValueIsSet(false);
    this.value = 0.0;
    this.positionTitle = null;
    this.candidateName = null;
    setOpenTimeIsSet(false);
    this.openTime = 0;
    this.cardno = null;
    setIdIsSet(false);
    this.id = 0;
  }

  public int getType() {
    return this.type;
  }

  public RedPacket setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public RedPacket setName(java.lang.String name) {
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

  public boolean isOpen() {
    return this.open;
  }

  public RedPacket setOpen(boolean open) {
    this.open = open;
    setOpenIsSet(true);
    return this;
  }

  public void unsetOpen() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPEN_ISSET_ID);
  }

  /** Returns true if field open is set (has been assigned a value) and false otherwise */
  public boolean isSetOpen() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPEN_ISSET_ID);
  }

  public void setOpenIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPEN_ISSET_ID, value);
  }

  public double getValue() {
    return this.value;
  }

  public RedPacket setValue(double value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  public java.lang.String getPositionTitle() {
    return this.positionTitle;
  }

  public RedPacket setPositionTitle(java.lang.String positionTitle) {
    this.positionTitle = positionTitle;
    return this;
  }

  public void unsetPositionTitle() {
    this.positionTitle = null;
  }

  /** Returns true if field positionTitle is set (has been assigned a value) and false otherwise */
  public boolean isSetPositionTitle() {
    return this.positionTitle != null;
  }

  public void setPositionTitleIsSet(boolean value) {
    if (!value) {
      this.positionTitle = null;
    }
  }

  public java.lang.String getCandidateName() {
    return this.candidateName;
  }

  public RedPacket setCandidateName(java.lang.String candidateName) {
    this.candidateName = candidateName;
    return this;
  }

  public void unsetCandidateName() {
    this.candidateName = null;
  }

  /** Returns true if field candidateName is set (has been assigned a value) and false otherwise */
  public boolean isSetCandidateName() {
    return this.candidateName != null;
  }

  public void setCandidateNameIsSet(boolean value) {
    if (!value) {
      this.candidateName = null;
    }
  }

  public long getOpenTime() {
    return this.openTime;
  }

  public RedPacket setOpenTime(long openTime) {
    this.openTime = openTime;
    setOpenTimeIsSet(true);
    return this;
  }

  public void unsetOpenTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPENTIME_ISSET_ID);
  }

  /** Returns true if field openTime is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPENTIME_ISSET_ID);
  }

  public void setOpenTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPENTIME_ISSET_ID, value);
  }

  public java.lang.String getCardno() {
    return this.cardno;
  }

  public RedPacket setCardno(java.lang.String cardno) {
    this.cardno = cardno;
    return this;
  }

  public void unsetCardno() {
    this.cardno = null;
  }

  /** Returns true if field cardno is set (has been assigned a value) and false otherwise */
  public boolean isSetCardno() {
    return this.cardno != null;
  }

  public void setCardnoIsSet(boolean value) {
    if (!value) {
      this.cardno = null;
    }
  }

  public int getId() {
    return this.id;
  }

  public RedPacket setId(int id) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case OPEN:
      if (value == null) {
        unsetOpen();
      } else {
        setOpen((java.lang.Boolean)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.Double)value);
      }
      break;

    case POSITION_TITLE:
      if (value == null) {
        unsetPositionTitle();
      } else {
        setPositionTitle((java.lang.String)value);
      }
      break;

    case CANDIDATE_NAME:
      if (value == null) {
        unsetCandidateName();
      } else {
        setCandidateName((java.lang.String)value);
      }
      break;

    case OPEN_TIME:
      if (value == null) {
        unsetOpenTime();
      } else {
        setOpenTime((java.lang.Long)value);
      }
      break;

    case CARDNO:
      if (value == null) {
        unsetCardno();
      } else {
        setCardno((java.lang.String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case NAME:
      return getName();

    case OPEN:
      return isOpen();

    case VALUE:
      return getValue();

    case POSITION_TITLE:
      return getPositionTitle();

    case CANDIDATE_NAME:
      return getCandidateName();

    case OPEN_TIME:
      return getOpenTime();

    case CARDNO:
      return getCardno();

    case ID:
      return getId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case NAME:
      return isSetName();
    case OPEN:
      return isSetOpen();
    case VALUE:
      return isSetValue();
    case POSITION_TITLE:
      return isSetPositionTitle();
    case CANDIDATE_NAME:
      return isSetCandidateName();
    case OPEN_TIME:
      return isSetOpenTime();
    case CARDNO:
      return isSetCardno();
    case ID:
      return isSetId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RedPacket)
      return this.equals((RedPacket)that);
    return false;
  }

  public boolean equals(RedPacket that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
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

    boolean this_present_open = true && this.isSetOpen();
    boolean that_present_open = true && that.isSetOpen();
    if (this_present_open || that_present_open) {
      if (!(this_present_open && that_present_open))
        return false;
      if (this.open != that.open)
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_positionTitle = true && this.isSetPositionTitle();
    boolean that_present_positionTitle = true && that.isSetPositionTitle();
    if (this_present_positionTitle || that_present_positionTitle) {
      if (!(this_present_positionTitle && that_present_positionTitle))
        return false;
      if (!this.positionTitle.equals(that.positionTitle))
        return false;
    }

    boolean this_present_candidateName = true && this.isSetCandidateName();
    boolean that_present_candidateName = true && that.isSetCandidateName();
    if (this_present_candidateName || that_present_candidateName) {
      if (!(this_present_candidateName && that_present_candidateName))
        return false;
      if (!this.candidateName.equals(that.candidateName))
        return false;
    }

    boolean this_present_openTime = true && this.isSetOpenTime();
    boolean that_present_openTime = true && that.isSetOpenTime();
    if (this_present_openTime || that_present_openTime) {
      if (!(this_present_openTime && that_present_openTime))
        return false;
      if (this.openTime != that.openTime)
        return false;
    }

    boolean this_present_cardno = true && this.isSetCardno();
    boolean that_present_cardno = true && that.isSetCardno();
    if (this_present_cardno || that_present_cardno) {
      if (!(this_present_cardno && that_present_cardno))
        return false;
      if (!this.cardno.equals(that.cardno))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpen()) ? 131071 : 524287);
    if (isSetOpen())
      hashCode = hashCode * 8191 + ((open) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(value);

    hashCode = hashCode * 8191 + ((isSetPositionTitle()) ? 131071 : 524287);
    if (isSetPositionTitle())
      hashCode = hashCode * 8191 + positionTitle.hashCode();

    hashCode = hashCode * 8191 + ((isSetCandidateName()) ? 131071 : 524287);
    if (isSetCandidateName())
      hashCode = hashCode * 8191 + candidateName.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpenTime()) ? 131071 : 524287);
    if (isSetOpenTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(openTime);

    hashCode = hashCode * 8191 + ((isSetCardno()) ? 131071 : 524287);
    if (isSetCardno())
      hashCode = hashCode * 8191 + cardno.hashCode();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    return hashCode;
  }

  @Override
  public int compareTo(RedPacket other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOpen()).compareTo(other.isSetOpen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.open, other.open);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPositionTitle()).compareTo(other.isSetPositionTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositionTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionTitle, other.positionTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCandidateName()).compareTo(other.isSetCandidateName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCandidateName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.candidateName, other.candidateName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOpenTime()).compareTo(other.isSetOpenTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openTime, other.openTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCardno()).compareTo(other.isSetCardno());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCardno()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cardno, other.cardno);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RedPacket(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      sb.append(this.type);
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
    if (isSetOpen()) {
      if (!first) sb.append(", ");
      sb.append("open:");
      sb.append(this.open);
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      sb.append(this.value);
      first = false;
    }
    if (isSetPositionTitle()) {
      if (!first) sb.append(", ");
      sb.append("positionTitle:");
      if (this.positionTitle == null) {
        sb.append("null");
      } else {
        sb.append(this.positionTitle);
      }
      first = false;
    }
    if (isSetCandidateName()) {
      if (!first) sb.append(", ");
      sb.append("candidateName:");
      if (this.candidateName == null) {
        sb.append("null");
      } else {
        sb.append(this.candidateName);
      }
      first = false;
    }
    if (isSetOpenTime()) {
      if (!first) sb.append(", ");
      sb.append("openTime:");
      sb.append(this.openTime);
      first = false;
    }
    if (isSetCardno()) {
      if (!first) sb.append(", ");
      sb.append("cardno:");
      if (this.cardno == null) {
        sb.append("null");
      } else {
        sb.append(this.cardno);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      sb.append(this.id);
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

  private static class RedPacketStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RedPacketStandardScheme getScheme() {
      return new RedPacketStandardScheme();
    }
  }

  private static class RedPacketStandardScheme extends org.apache.thrift.scheme.StandardScheme<RedPacket> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RedPacket struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPEN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.open = iprot.readBool();
              struct.setOpenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.value = iprot.readDouble();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // POSITION_TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.positionTitle = iprot.readString();
              struct.setPositionTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CANDIDATE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.candidateName = iprot.readString();
              struct.setCandidateNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // OPEN_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.openTime = iprot.readI64();
              struct.setOpenTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CARDNO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cardno = iprot.readString();
              struct.setCardnoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RedPacket struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetType()) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOpen()) {
        oprot.writeFieldBegin(OPEN_FIELD_DESC);
        oprot.writeBool(struct.open);
        oprot.writeFieldEnd();
      }
      if (struct.isSetValue()) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeDouble(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.positionTitle != null) {
        if (struct.isSetPositionTitle()) {
          oprot.writeFieldBegin(POSITION_TITLE_FIELD_DESC);
          oprot.writeString(struct.positionTitle);
          oprot.writeFieldEnd();
        }
      }
      if (struct.candidateName != null) {
        if (struct.isSetCandidateName()) {
          oprot.writeFieldBegin(CANDIDATE_NAME_FIELD_DESC);
          oprot.writeString(struct.candidateName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOpenTime()) {
        oprot.writeFieldBegin(OPEN_TIME_FIELD_DESC);
        oprot.writeI64(struct.openTime);
        oprot.writeFieldEnd();
      }
      if (struct.cardno != null) {
        if (struct.isSetCardno()) {
          oprot.writeFieldBegin(CARDNO_FIELD_DESC);
          oprot.writeString(struct.cardno);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RedPacketTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RedPacketTupleScheme getScheme() {
      return new RedPacketTupleScheme();
    }
  }

  private static class RedPacketTupleScheme extends org.apache.thrift.scheme.TupleScheme<RedPacket> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RedPacket struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetOpen()) {
        optionals.set(2);
      }
      if (struct.isSetValue()) {
        optionals.set(3);
      }
      if (struct.isSetPositionTitle()) {
        optionals.set(4);
      }
      if (struct.isSetCandidateName()) {
        optionals.set(5);
      }
      if (struct.isSetOpenTime()) {
        optionals.set(6);
      }
      if (struct.isSetCardno()) {
        optionals.set(7);
      }
      if (struct.isSetId()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetOpen()) {
        oprot.writeBool(struct.open);
      }
      if (struct.isSetValue()) {
        oprot.writeDouble(struct.value);
      }
      if (struct.isSetPositionTitle()) {
        oprot.writeString(struct.positionTitle);
      }
      if (struct.isSetCandidateName()) {
        oprot.writeString(struct.candidateName);
      }
      if (struct.isSetOpenTime()) {
        oprot.writeI64(struct.openTime);
      }
      if (struct.isSetCardno()) {
        oprot.writeString(struct.cardno);
      }
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RedPacket struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.open = iprot.readBool();
        struct.setOpenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.value = iprot.readDouble();
        struct.setValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.positionTitle = iprot.readString();
        struct.setPositionTitleIsSet(true);
      }
      if (incoming.get(5)) {
        struct.candidateName = iprot.readString();
        struct.setCandidateNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.openTime = iprot.readI64();
        struct.setOpenTimeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.cardno = iprot.readString();
        struct.setCardnoIsSet(true);
      }
      if (incoming.get(8)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

