/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.hrdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-04")
public class HrHbPositionBindingDO implements org.apache.thrift.TBase<HrHbPositionBindingDO, HrHbPositionBindingDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrHbPositionBindingDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrHbPositionBindingDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HB_CONFIG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("hbConfigId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("positionId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TRIGGER_WAY_FIELD_DESC = new org.apache.thrift.protocol.TField("triggerWay", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField TOTAL_AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalAmount", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField TOTAL_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("totalNum", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrHbPositionBindingDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrHbPositionBindingDOTupleSchemeFactory();

  public int id; // optional
  public int hbConfigId; // optional
  public int positionId; // optional
  public byte triggerWay; // optional
  public double totalAmount; // optional
  public int totalNum; // optional
  public String createTime; // optional
  public String updateTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    HB_CONFIG_ID((short)2, "hbConfigId"),
    POSITION_ID((short)3, "positionId"),
    TRIGGER_WAY((short)4, "triggerWay"),
    TOTAL_AMOUNT((short)5, "totalAmount"),
    TOTAL_NUM((short)6, "totalNum"),
    CREATE_TIME((short)7, "createTime"),
    UPDATE_TIME((short)8, "updateTime");

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
        case 2: // HB_CONFIG_ID
          return HB_CONFIG_ID;
        case 3: // POSITION_ID
          return POSITION_ID;
        case 4: // TRIGGER_WAY
          return TRIGGER_WAY;
        case 5: // TOTAL_AMOUNT
          return TOTAL_AMOUNT;
        case 6: // TOTAL_NUM
          return TOTAL_NUM;
        case 7: // CREATE_TIME
          return CREATE_TIME;
        case 8: // UPDATE_TIME
          return UPDATE_TIME;
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
  private static final int __HBCONFIGID_ISSET_ID = 1;
  private static final int __POSITIONID_ISSET_ID = 2;
  private static final int __TRIGGERWAY_ISSET_ID = 3;
  private static final int __TOTALAMOUNT_ISSET_ID = 4;
  private static final int __TOTALNUM_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.HB_CONFIG_ID,_Fields.POSITION_ID,_Fields.TRIGGER_WAY,_Fields.TOTAL_AMOUNT,_Fields.TOTAL_NUM,_Fields.CREATE_TIME,_Fields.UPDATE_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HB_CONFIG_ID, new org.apache.thrift.meta_data.FieldMetaData("hbConfigId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POSITION_ID, new org.apache.thrift.meta_data.FieldMetaData("positionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TRIGGER_WAY, new org.apache.thrift.meta_data.FieldMetaData("triggerWay", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.TOTAL_AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("totalAmount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TOTAL_NUM, new org.apache.thrift.meta_data.FieldMetaData("totalNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrHbPositionBindingDO.class, metaDataMap);
  }

  public HrHbPositionBindingDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrHbPositionBindingDO(HrHbPositionBindingDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.hbConfigId = other.hbConfigId;
    this.positionId = other.positionId;
    this.triggerWay = other.triggerWay;
    this.totalAmount = other.totalAmount;
    this.totalNum = other.totalNum;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
    if (other.isSetUpdateTime()) {
      this.updateTime = other.updateTime;
    }
  }

  public HrHbPositionBindingDO deepCopy() {
    return new HrHbPositionBindingDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setHbConfigIdIsSet(false);
    this.hbConfigId = 0;
    setPositionIdIsSet(false);
    this.positionId = 0;
    setTriggerWayIsSet(false);
    this.triggerWay = 0;
    setTotalAmountIsSet(false);
    this.totalAmount = 0.0;
    setTotalNumIsSet(false);
    this.totalNum = 0;
    this.createTime = null;
    this.updateTime = null;
  }

  public int getId() {
    return this.id;
  }

  public HrHbPositionBindingDO setId(int id) {
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

  public int getHbConfigId() {
    return this.hbConfigId;
  }

  public HrHbPositionBindingDO setHbConfigId(int hbConfigId) {
    this.hbConfigId = hbConfigId;
    setHbConfigIdIsSet(true);
    return this;
  }

  public void unsetHbConfigId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HBCONFIGID_ISSET_ID);
  }

  /** Returns true if field hbConfigId is set (has been assigned a value) and false otherwise */
  public boolean isSetHbConfigId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HBCONFIGID_ISSET_ID);
  }

  public void setHbConfigIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HBCONFIGID_ISSET_ID, value);
  }

  public int getPositionId() {
    return this.positionId;
  }

  public HrHbPositionBindingDO setPositionId(int positionId) {
    this.positionId = positionId;
    setPositionIdIsSet(true);
    return this;
  }

  public void unsetPositionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POSITIONID_ISSET_ID);
  }

  /** Returns true if field positionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPositionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POSITIONID_ISSET_ID);
  }

  public void setPositionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POSITIONID_ISSET_ID, value);
  }

  public byte getTriggerWay() {
    return this.triggerWay;
  }

  public HrHbPositionBindingDO setTriggerWay(byte triggerWay) {
    this.triggerWay = triggerWay;
    setTriggerWayIsSet(true);
    return this;
  }

  public void unsetTriggerWay() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRIGGERWAY_ISSET_ID);
  }

  /** Returns true if field triggerWay is set (has been assigned a value) and false otherwise */
  public boolean isSetTriggerWay() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRIGGERWAY_ISSET_ID);
  }

  public void setTriggerWayIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRIGGERWAY_ISSET_ID, value);
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public HrHbPositionBindingDO setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
    setTotalAmountIsSet(true);
    return this;
  }

  public void unsetTotalAmount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALAMOUNT_ISSET_ID);
  }

  /** Returns true if field totalAmount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalAmount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALAMOUNT_ISSET_ID);
  }

  public void setTotalAmountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALAMOUNT_ISSET_ID, value);
  }

  public int getTotalNum() {
    return this.totalNum;
  }

  public HrHbPositionBindingDO setTotalNum(int totalNum) {
    this.totalNum = totalNum;
    setTotalNumIsSet(true);
    return this;
  }

  public void unsetTotalNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALNUM_ISSET_ID);
  }

  /** Returns true if field totalNum is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALNUM_ISSET_ID);
  }

  public void setTotalNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALNUM_ISSET_ID, value);
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public HrHbPositionBindingDO setCreateTime(String createTime) {
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

  public String getUpdateTime() {
    return this.updateTime;
  }

  public HrHbPositionBindingDO setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public void unsetUpdateTime() {
    this.updateTime = null;
  }

  /** Returns true if field updateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateTime() {
    return this.updateTime != null;
  }

  public void setUpdateTimeIsSet(boolean value) {
    if (!value) {
      this.updateTime = null;
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

    case HB_CONFIG_ID:
      if (value == null) {
        unsetHbConfigId();
      } else {
        setHbConfigId((Integer)value);
      }
      break;

    case POSITION_ID:
      if (value == null) {
        unsetPositionId();
      } else {
        setPositionId((Integer)value);
      }
      break;

    case TRIGGER_WAY:
      if (value == null) {
        unsetTriggerWay();
      } else {
        setTriggerWay((Byte)value);
      }
      break;

    case TOTAL_AMOUNT:
      if (value == null) {
        unsetTotalAmount();
      } else {
        setTotalAmount((Double)value);
      }
      break;

    case TOTAL_NUM:
      if (value == null) {
        unsetTotalNum();
      } else {
        setTotalNum((Integer)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((String)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdateTime();
      } else {
        setUpdateTime((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case HB_CONFIG_ID:
      return getHbConfigId();

    case POSITION_ID:
      return getPositionId();

    case TRIGGER_WAY:
      return getTriggerWay();

    case TOTAL_AMOUNT:
      return getTotalAmount();

    case TOTAL_NUM:
      return getTotalNum();

    case CREATE_TIME:
      return getCreateTime();

    case UPDATE_TIME:
      return getUpdateTime();

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
    case HB_CONFIG_ID:
      return isSetHbConfigId();
    case POSITION_ID:
      return isSetPositionId();
    case TRIGGER_WAY:
      return isSetTriggerWay();
    case TOTAL_AMOUNT:
      return isSetTotalAmount();
    case TOTAL_NUM:
      return isSetTotalNum();
    case CREATE_TIME:
      return isSetCreateTime();
    case UPDATE_TIME:
      return isSetUpdateTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HrHbPositionBindingDO)
      return this.equals((HrHbPositionBindingDO)that);
    return false;
  }

  public boolean equals(HrHbPositionBindingDO that) {
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

    boolean this_present_hbConfigId = true && this.isSetHbConfigId();
    boolean that_present_hbConfigId = true && that.isSetHbConfigId();
    if (this_present_hbConfigId || that_present_hbConfigId) {
      if (!(this_present_hbConfigId && that_present_hbConfigId))
        return false;
      if (this.hbConfigId != that.hbConfigId)
        return false;
    }

    boolean this_present_positionId = true && this.isSetPositionId();
    boolean that_present_positionId = true && that.isSetPositionId();
    if (this_present_positionId || that_present_positionId) {
      if (!(this_present_positionId && that_present_positionId))
        return false;
      if (this.positionId != that.positionId)
        return false;
    }

    boolean this_present_triggerWay = true && this.isSetTriggerWay();
    boolean that_present_triggerWay = true && that.isSetTriggerWay();
    if (this_present_triggerWay || that_present_triggerWay) {
      if (!(this_present_triggerWay && that_present_triggerWay))
        return false;
      if (this.triggerWay != that.triggerWay)
        return false;
    }

    boolean this_present_totalAmount = true && this.isSetTotalAmount();
    boolean that_present_totalAmount = true && that.isSetTotalAmount();
    if (this_present_totalAmount || that_present_totalAmount) {
      if (!(this_present_totalAmount && that_present_totalAmount))
        return false;
      if (this.totalAmount != that.totalAmount)
        return false;
    }

    boolean this_present_totalNum = true && this.isSetTotalNum();
    boolean that_present_totalNum = true && that.isSetTotalNum();
    if (this_present_totalNum || that_present_totalNum) {
      if (!(this_present_totalNum && that_present_totalNum))
        return false;
      if (this.totalNum != that.totalNum)
        return false;
    }

    boolean this_present_createTime = true && this.isSetCreateTime();
    boolean that_present_createTime = true && that.isSetCreateTime();
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (!this.createTime.equals(that.createTime))
        return false;
    }

    boolean this_present_updateTime = true && this.isSetUpdateTime();
    boolean that_present_updateTime = true && that.isSetUpdateTime();
    if (this_present_updateTime || that_present_updateTime) {
      if (!(this_present_updateTime && that_present_updateTime))
        return false;
      if (!this.updateTime.equals(that.updateTime))
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

    hashCode = hashCode * 8191 + ((isSetHbConfigId()) ? 131071 : 524287);
    if (isSetHbConfigId())
      hashCode = hashCode * 8191 + hbConfigId;

    hashCode = hashCode * 8191 + ((isSetPositionId()) ? 131071 : 524287);
    if (isSetPositionId())
      hashCode = hashCode * 8191 + positionId;

    hashCode = hashCode * 8191 + ((isSetTriggerWay()) ? 131071 : 524287);
    if (isSetTriggerWay())
      hashCode = hashCode * 8191 + (int) (triggerWay);

    hashCode = hashCode * 8191 + ((isSetTotalAmount()) ? 131071 : 524287);
    if (isSetTotalAmount())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(totalAmount);

    hashCode = hashCode * 8191 + ((isSetTotalNum()) ? 131071 : 524287);
    if (isSetTotalNum())
      hashCode = hashCode * 8191 + totalNum;

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
    if (isSetUpdateTime())
      hashCode = hashCode * 8191 + updateTime.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HrHbPositionBindingDO other) {
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
    lastComparison = Boolean.valueOf(isSetHbConfigId()).compareTo(other.isSetHbConfigId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHbConfigId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hbConfigId, other.hbConfigId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPositionId()).compareTo(other.isSetPositionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionId, other.positionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTriggerWay()).compareTo(other.isSetTriggerWay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTriggerWay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.triggerWay, other.triggerWay);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalAmount()).compareTo(other.isSetTotalAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalAmount, other.totalAmount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalNum()).compareTo(other.isSetTotalNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalNum, other.totalNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateTime()).compareTo(other.isSetUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, other.updateTime);
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
    StringBuilder sb = new StringBuilder("HrHbPositionBindingDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetHbConfigId()) {
      if (!first) sb.append(", ");
      sb.append("hbConfigId:");
      sb.append(this.hbConfigId);
      first = false;
    }
    if (isSetPositionId()) {
      if (!first) sb.append(", ");
      sb.append("positionId:");
      sb.append(this.positionId);
      first = false;
    }
    if (isSetTriggerWay()) {
      if (!first) sb.append(", ");
      sb.append("triggerWay:");
      sb.append(this.triggerWay);
      first = false;
    }
    if (isSetTotalAmount()) {
      if (!first) sb.append(", ");
      sb.append("totalAmount:");
      sb.append(this.totalAmount);
      first = false;
    }
    if (isSetTotalNum()) {
      if (!first) sb.append(", ");
      sb.append("totalNum:");
      sb.append(this.totalNum);
      first = false;
    }
    if (isSetCreateTime()) {
      if (!first) sb.append(", ");
      sb.append("createTime:");
      if (this.createTime == null) {
        sb.append("null");
      } else {
        sb.append(this.createTime);
      }
      first = false;
    }
    if (isSetUpdateTime()) {
      if (!first) sb.append(", ");
      sb.append("updateTime:");
      if (this.updateTime == null) {
        sb.append("null");
      } else {
        sb.append(this.updateTime);
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

  private static class HrHbPositionBindingDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrHbPositionBindingDOStandardScheme getScheme() {
      return new HrHbPositionBindingDOStandardScheme();
    }
  }

  private static class HrHbPositionBindingDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrHbPositionBindingDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrHbPositionBindingDO struct) throws org.apache.thrift.TException {
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
          case 2: // HB_CONFIG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hbConfigId = iprot.readI32();
              struct.setHbConfigIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.positionId = iprot.readI32();
              struct.setPositionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRIGGER_WAY
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.triggerWay = iprot.readByte();
              struct.setTriggerWayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TOTAL_AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.totalAmount = iprot.readDouble();
              struct.setTotalAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TOTAL_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalNum = iprot.readI32();
              struct.setTotalNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createTime = iprot.readString();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateTime = iprot.readString();
              struct.setUpdateTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrHbPositionBindingDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHbConfigId()) {
        oprot.writeFieldBegin(HB_CONFIG_ID_FIELD_DESC);
        oprot.writeI32(struct.hbConfigId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPositionId()) {
        oprot.writeFieldBegin(POSITION_ID_FIELD_DESC);
        oprot.writeI32(struct.positionId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTriggerWay()) {
        oprot.writeFieldBegin(TRIGGER_WAY_FIELD_DESC);
        oprot.writeByte(struct.triggerWay);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalAmount()) {
        oprot.writeFieldBegin(TOTAL_AMOUNT_FIELD_DESC);
        oprot.writeDouble(struct.totalAmount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalNum()) {
        oprot.writeFieldBegin(TOTAL_NUM_FIELD_DESC);
        oprot.writeI32(struct.totalNum);
        oprot.writeFieldEnd();
      }
      if (struct.createTime != null) {
        if (struct.isSetCreateTime()) {
          oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
          oprot.writeString(struct.createTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.updateTime != null) {
        if (struct.isSetUpdateTime()) {
          oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
          oprot.writeString(struct.updateTime);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrHbPositionBindingDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrHbPositionBindingDOTupleScheme getScheme() {
      return new HrHbPositionBindingDOTupleScheme();
    }
  }

  private static class HrHbPositionBindingDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrHbPositionBindingDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrHbPositionBindingDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetHbConfigId()) {
        optionals.set(1);
      }
      if (struct.isSetPositionId()) {
        optionals.set(2);
      }
      if (struct.isSetTriggerWay()) {
        optionals.set(3);
      }
      if (struct.isSetTotalAmount()) {
        optionals.set(4);
      }
      if (struct.isSetTotalNum()) {
        optionals.set(5);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(6);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetHbConfigId()) {
        oprot.writeI32(struct.hbConfigId);
      }
      if (struct.isSetPositionId()) {
        oprot.writeI32(struct.positionId);
      }
      if (struct.isSetTriggerWay()) {
        oprot.writeByte(struct.triggerWay);
      }
      if (struct.isSetTotalAmount()) {
        oprot.writeDouble(struct.totalAmount);
      }
      if (struct.isSetTotalNum()) {
        oprot.writeI32(struct.totalNum);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeString(struct.updateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrHbPositionBindingDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hbConfigId = iprot.readI32();
        struct.setHbConfigIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.positionId = iprot.readI32();
        struct.setPositionIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.triggerWay = iprot.readByte();
        struct.setTriggerWayIsSet(true);
      }
      if (incoming.get(4)) {
        struct.totalAmount = iprot.readDouble();
        struct.setTotalAmountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.totalNum = iprot.readI32();
        struct.setTotalNumIsSet(true);
      }
      if (incoming.get(6)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.updateTime = iprot.readString();
        struct.setUpdateTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

