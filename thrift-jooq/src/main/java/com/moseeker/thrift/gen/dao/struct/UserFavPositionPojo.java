/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-02-16")
public class UserFavPositionPojo implements org.apache.thrift.TBase<UserFavPositionPojo, UserFavPositionPojo._Fields>, java.io.Serializable, Cloneable, Comparable<UserFavPositionPojo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserFavPositionPojo");

  private static final org.apache.thrift.protocol.TField SYSUSER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sysuserId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField POSITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("positionId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FAVORITE_FIELD_DESC = new org.apache.thrift.protocol.TField("favorite", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("update_time", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField RECOM_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recomUserId", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserFavPositionPojoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserFavPositionPojoTupleSchemeFactory();

  public int sysuserId; // optional
  public int positionId; // optional
  public byte favorite; // optional
  public java.lang.String createTime; // optional
  public java.lang.String update_time; // optional
  public java.lang.String mobile; // optional
  public int id; // optional
  public int recomUserId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SYSUSER_ID((short)1, "sysuserId"),
    POSITION_ID((short)2, "positionId"),
    FAVORITE((short)3, "favorite"),
    CREATE_TIME((short)4, "createTime"),
    UPDATE_TIME((short)5, "update_time"),
    MOBILE((short)6, "mobile"),
    ID((short)7, "id"),
    RECOM_USER_ID((short)8, "recomUserId");

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
        case 1: // SYSUSER_ID
          return SYSUSER_ID;
        case 2: // POSITION_ID
          return POSITION_ID;
        case 3: // FAVORITE
          return FAVORITE;
        case 4: // CREATE_TIME
          return CREATE_TIME;
        case 5: // UPDATE_TIME
          return UPDATE_TIME;
        case 6: // MOBILE
          return MOBILE;
        case 7: // ID
          return ID;
        case 8: // RECOM_USER_ID
          return RECOM_USER_ID;
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
  private static final int __SYSUSERID_ISSET_ID = 0;
  private static final int __POSITIONID_ISSET_ID = 1;
  private static final int __FAVORITE_ISSET_ID = 2;
  private static final int __ID_ISSET_ID = 3;
  private static final int __RECOMUSERID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SYSUSER_ID,_Fields.POSITION_ID,_Fields.FAVORITE,_Fields.CREATE_TIME,_Fields.UPDATE_TIME,_Fields.MOBILE,_Fields.ID,_Fields.RECOM_USER_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SYSUSER_ID, new org.apache.thrift.meta_data.FieldMetaData("sysuserId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POSITION_ID, new org.apache.thrift.meta_data.FieldMetaData("positionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FAVORITE, new org.apache.thrift.meta_data.FieldMetaData("favorite", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("update_time", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECOM_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("recomUserId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserFavPositionPojo.class, metaDataMap);
  }

  public UserFavPositionPojo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserFavPositionPojo(UserFavPositionPojo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sysuserId = other.sysuserId;
    this.positionId = other.positionId;
    this.favorite = other.favorite;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
    if (other.isSetUpdate_time()) {
      this.update_time = other.update_time;
    }
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    this.id = other.id;
    this.recomUserId = other.recomUserId;
  }

  public UserFavPositionPojo deepCopy() {
    return new UserFavPositionPojo(this);
  }

  @Override
  public void clear() {
    setSysuserIdIsSet(false);
    this.sysuserId = 0;
    setPositionIdIsSet(false);
    this.positionId = 0;
    setFavoriteIsSet(false);
    this.favorite = 0;
    this.createTime = null;
    this.update_time = null;
    this.mobile = null;
    setIdIsSet(false);
    this.id = 0;
    setRecomUserIdIsSet(false);
    this.recomUserId = 0;
  }

  public int getSysuserId() {
    return this.sysuserId;
  }

  public UserFavPositionPojo setSysuserId(int sysuserId) {
    this.sysuserId = sysuserId;
    setSysuserIdIsSet(true);
    return this;
  }

  public void unsetSysuserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SYSUSERID_ISSET_ID);
  }

  /** Returns true if field sysuserId is set (has been assigned a value) and false otherwise */
  public boolean isSetSysuserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SYSUSERID_ISSET_ID);
  }

  public void setSysuserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SYSUSERID_ISSET_ID, value);
  }

  public int getPositionId() {
    return this.positionId;
  }

  public UserFavPositionPojo setPositionId(int positionId) {
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

  public byte getFavorite() {
    return this.favorite;
  }

  public UserFavPositionPojo setFavorite(byte favorite) {
    this.favorite = favorite;
    setFavoriteIsSet(true);
    return this;
  }

  public void unsetFavorite() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FAVORITE_ISSET_ID);
  }

  /** Returns true if field favorite is set (has been assigned a value) and false otherwise */
  public boolean isSetFavorite() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FAVORITE_ISSET_ID);
  }

  public void setFavoriteIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FAVORITE_ISSET_ID, value);
  }

  public java.lang.String getCreateTime() {
    return this.createTime;
  }

  public UserFavPositionPojo setCreateTime(java.lang.String createTime) {
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

  public java.lang.String getUpdate_time() {
    return this.update_time;
  }

  public UserFavPositionPojo setUpdate_time(java.lang.String update_time) {
    this.update_time = update_time;
    return this;
  }

  public void unsetUpdate_time() {
    this.update_time = null;
  }

  /** Returns true if field update_time is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdate_time() {
    return this.update_time != null;
  }

  public void setUpdate_timeIsSet(boolean value) {
    if (!value) {
      this.update_time = null;
    }
  }

  public java.lang.String getMobile() {
    return this.mobile;
  }

  public UserFavPositionPojo setMobile(java.lang.String mobile) {
    this.mobile = mobile;
    return this;
  }

  public void unsetMobile() {
    this.mobile = null;
  }

  /** Returns true if field mobile is set (has been assigned a value) and false otherwise */
  public boolean isSetMobile() {
    return this.mobile != null;
  }

  public void setMobileIsSet(boolean value) {
    if (!value) {
      this.mobile = null;
    }
  }

  public int getId() {
    return this.id;
  }

  public UserFavPositionPojo setId(int id) {
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

  public int getRecomUserId() {
    return this.recomUserId;
  }

  public UserFavPositionPojo setRecomUserId(int recomUserId) {
    this.recomUserId = recomUserId;
    setRecomUserIdIsSet(true);
    return this;
  }

  public void unsetRecomUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECOMUSERID_ISSET_ID);
  }

  /** Returns true if field recomUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetRecomUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECOMUSERID_ISSET_ID);
  }

  public void setRecomUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECOMUSERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SYSUSER_ID:
      if (value == null) {
        unsetSysuserId();
      } else {
        setSysuserId((java.lang.Integer)value);
      }
      break;

    case POSITION_ID:
      if (value == null) {
        unsetPositionId();
      } else {
        setPositionId((java.lang.Integer)value);
      }
      break;

    case FAVORITE:
      if (value == null) {
        unsetFavorite();
      } else {
        setFavorite((java.lang.Byte)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((java.lang.String)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdate_time();
      } else {
        setUpdate_time((java.lang.String)value);
      }
      break;

    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((java.lang.String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case RECOM_USER_ID:
      if (value == null) {
        unsetRecomUserId();
      } else {
        setRecomUserId((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SYSUSER_ID:
      return getSysuserId();

    case POSITION_ID:
      return getPositionId();

    case FAVORITE:
      return getFavorite();

    case CREATE_TIME:
      return getCreateTime();

    case UPDATE_TIME:
      return getUpdate_time();

    case MOBILE:
      return getMobile();

    case ID:
      return getId();

    case RECOM_USER_ID:
      return getRecomUserId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SYSUSER_ID:
      return isSetSysuserId();
    case POSITION_ID:
      return isSetPositionId();
    case FAVORITE:
      return isSetFavorite();
    case CREATE_TIME:
      return isSetCreateTime();
    case UPDATE_TIME:
      return isSetUpdate_time();
    case MOBILE:
      return isSetMobile();
    case ID:
      return isSetId();
    case RECOM_USER_ID:
      return isSetRecomUserId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserFavPositionPojo)
      return this.equals((UserFavPositionPojo)that);
    return false;
  }

  public boolean equals(UserFavPositionPojo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sysuserId = true && this.isSetSysuserId();
    boolean that_present_sysuserId = true && that.isSetSysuserId();
    if (this_present_sysuserId || that_present_sysuserId) {
      if (!(this_present_sysuserId && that_present_sysuserId))
        return false;
      if (this.sysuserId != that.sysuserId)
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

    boolean this_present_favorite = true && this.isSetFavorite();
    boolean that_present_favorite = true && that.isSetFavorite();
    if (this_present_favorite || that_present_favorite) {
      if (!(this_present_favorite && that_present_favorite))
        return false;
      if (this.favorite != that.favorite)
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

    boolean this_present_update_time = true && this.isSetUpdate_time();
    boolean that_present_update_time = true && that.isSetUpdate_time();
    if (this_present_update_time || that_present_update_time) {
      if (!(this_present_update_time && that_present_update_time))
        return false;
      if (!this.update_time.equals(that.update_time))
        return false;
    }

    boolean this_present_mobile = true && this.isSetMobile();
    boolean that_present_mobile = true && that.isSetMobile();
    if (this_present_mobile || that_present_mobile) {
      if (!(this_present_mobile && that_present_mobile))
        return false;
      if (!this.mobile.equals(that.mobile))
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

    boolean this_present_recomUserId = true && this.isSetRecomUserId();
    boolean that_present_recomUserId = true && that.isSetRecomUserId();
    if (this_present_recomUserId || that_present_recomUserId) {
      if (!(this_present_recomUserId && that_present_recomUserId))
        return false;
      if (this.recomUserId != that.recomUserId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSysuserId()) ? 131071 : 524287);
    if (isSetSysuserId())
      hashCode = hashCode * 8191 + sysuserId;

    hashCode = hashCode * 8191 + ((isSetPositionId()) ? 131071 : 524287);
    if (isSetPositionId())
      hashCode = hashCode * 8191 + positionId;

    hashCode = hashCode * 8191 + ((isSetFavorite()) ? 131071 : 524287);
    if (isSetFavorite())
      hashCode = hashCode * 8191 + (int) (favorite);

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdate_time()) ? 131071 : 524287);
    if (isSetUpdate_time())
      hashCode = hashCode * 8191 + update_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetMobile()) ? 131071 : 524287);
    if (isSetMobile())
      hashCode = hashCode * 8191 + mobile.hashCode();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetRecomUserId()) ? 131071 : 524287);
    if (isSetRecomUserId())
      hashCode = hashCode * 8191 + recomUserId;

    return hashCode;
  }

  @Override
  public int compareTo(UserFavPositionPojo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSysuserId()).compareTo(other.isSetSysuserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSysuserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sysuserId, other.sysuserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPositionId()).compareTo(other.isSetPositionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionId, other.positionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFavorite()).compareTo(other.isSetFavorite());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFavorite()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.favorite, other.favorite);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetUpdate_time()).compareTo(other.isSetUpdate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update_time, other.update_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
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
    lastComparison = java.lang.Boolean.valueOf(isSetRecomUserId()).compareTo(other.isSetRecomUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecomUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recomUserId, other.recomUserId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserFavPositionPojo(");
    boolean first = true;

    if (isSetSysuserId()) {
      sb.append("sysuserId:");
      sb.append(this.sysuserId);
      first = false;
    }
    if (isSetPositionId()) {
      if (!first) sb.append(", ");
      sb.append("positionId:");
      sb.append(this.positionId);
      first = false;
    }
    if (isSetFavorite()) {
      if (!first) sb.append(", ");
      sb.append("favorite:");
      sb.append(this.favorite);
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
    if (isSetUpdate_time()) {
      if (!first) sb.append(", ");
      sb.append("update_time:");
      if (this.update_time == null) {
        sb.append("null");
      } else {
        sb.append(this.update_time);
      }
      first = false;
    }
    if (isSetMobile()) {
      if (!first) sb.append(", ");
      sb.append("mobile:");
      if (this.mobile == null) {
        sb.append("null");
      } else {
        sb.append(this.mobile);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetRecomUserId()) {
      if (!first) sb.append(", ");
      sb.append("recomUserId:");
      sb.append(this.recomUserId);
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

  private static class UserFavPositionPojoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserFavPositionPojoStandardScheme getScheme() {
      return new UserFavPositionPojoStandardScheme();
    }
  }

  private static class UserFavPositionPojoStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserFavPositionPojo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserFavPositionPojo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SYSUSER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sysuserId = iprot.readI32();
              struct.setSysuserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POSITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.positionId = iprot.readI32();
              struct.setPositionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FAVORITE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.favorite = iprot.readByte();
              struct.setFavoriteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createTime = iprot.readString();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.update_time = iprot.readString();
              struct.setUpdate_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // RECOM_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recomUserId = iprot.readI32();
              struct.setRecomUserIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserFavPositionPojo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetSysuserId()) {
        oprot.writeFieldBegin(SYSUSER_ID_FIELD_DESC);
        oprot.writeI32(struct.sysuserId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPositionId()) {
        oprot.writeFieldBegin(POSITION_ID_FIELD_DESC);
        oprot.writeI32(struct.positionId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFavorite()) {
        oprot.writeFieldBegin(FAVORITE_FIELD_DESC);
        oprot.writeByte(struct.favorite);
        oprot.writeFieldEnd();
      }
      if (struct.createTime != null) {
        if (struct.isSetCreateTime()) {
          oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
          oprot.writeString(struct.createTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.update_time != null) {
        if (struct.isSetUpdate_time()) {
          oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
          oprot.writeString(struct.update_time);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobile != null) {
        if (struct.isSetMobile()) {
          oprot.writeFieldBegin(MOBILE_FIELD_DESC);
          oprot.writeString(struct.mobile);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecomUserId()) {
        oprot.writeFieldBegin(RECOM_USER_ID_FIELD_DESC);
        oprot.writeI32(struct.recomUserId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserFavPositionPojoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserFavPositionPojoTupleScheme getScheme() {
      return new UserFavPositionPojoTupleScheme();
    }
  }

  private static class UserFavPositionPojoTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserFavPositionPojo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserFavPositionPojo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSysuserId()) {
        optionals.set(0);
      }
      if (struct.isSetPositionId()) {
        optionals.set(1);
      }
      if (struct.isSetFavorite()) {
        optionals.set(2);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(3);
      }
      if (struct.isSetUpdate_time()) {
        optionals.set(4);
      }
      if (struct.isSetMobile()) {
        optionals.set(5);
      }
      if (struct.isSetId()) {
        optionals.set(6);
      }
      if (struct.isSetRecomUserId()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetSysuserId()) {
        oprot.writeI32(struct.sysuserId);
      }
      if (struct.isSetPositionId()) {
        oprot.writeI32(struct.positionId);
      }
      if (struct.isSetFavorite()) {
        oprot.writeByte(struct.favorite);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
      if (struct.isSetUpdate_time()) {
        oprot.writeString(struct.update_time);
      }
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetRecomUserId()) {
        oprot.writeI32(struct.recomUserId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserFavPositionPojo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.sysuserId = iprot.readI32();
        struct.setSysuserIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.positionId = iprot.readI32();
        struct.setPositionIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.favorite = iprot.readByte();
        struct.setFavoriteIsSet(true);
      }
      if (incoming.get(3)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.update_time = iprot.readString();
        struct.setUpdate_timeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(6)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(7)) {
        struct.recomUserId = iprot.readI32();
        struct.setRecomUserIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

