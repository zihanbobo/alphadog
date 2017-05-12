/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.configdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-08")
public class ConfigSysH5StyleTplDO implements org.apache.thrift.TBase<ConfigSysH5StyleTplDO, ConfigSysH5StyleTplDO._Fields>, java.io.Serializable, Cloneable, Comparable<ConfigSysH5StyleTplDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConfigSysH5StyleTplDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOGO_FIELD_DESC = new org.apache.thrift.protocol.TField("logo", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HR_TPL_FIELD_DESC = new org.apache.thrift.protocol.TField("hrTpl", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField WX_TPL_FIELD_DESC = new org.apache.thrift.protocol.TField("wxTpl", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField DISABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("disable", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ConfigSysH5StyleTplDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ConfigSysH5StyleTplDOTupleSchemeFactory();

  public int id; // optional
  public String name; // optional
  public String logo; // optional
  public String hrTpl; // optional
  public String wxTpl; // optional
  public double priority; // optional
  public double disable; // optional
  public String createTime; // optional
  public String updateTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    LOGO((short)3, "logo"),
    HR_TPL((short)4, "hrTpl"),
    WX_TPL((short)5, "wxTpl"),
    PRIORITY((short)6, "priority"),
    DISABLE((short)7, "disable"),
    CREATE_TIME((short)8, "createTime"),
    UPDATE_TIME((short)9, "updateTime");

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
        case 2: // NAME
          return NAME;
        case 3: // LOGO
          return LOGO;
        case 4: // HR_TPL
          return HR_TPL;
        case 5: // WX_TPL
          return WX_TPL;
        case 6: // PRIORITY
          return PRIORITY;
        case 7: // DISABLE
          return DISABLE;
        case 8: // CREATE_TIME
          return CREATE_TIME;
        case 9: // UPDATE_TIME
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
  private static final int __PRIORITY_ISSET_ID = 1;
  private static final int __DISABLE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.NAME,_Fields.LOGO,_Fields.HR_TPL,_Fields.WX_TPL,_Fields.PRIORITY,_Fields.DISABLE,_Fields.CREATE_TIME,_Fields.UPDATE_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOGO, new org.apache.thrift.meta_data.FieldMetaData("logo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HR_TPL, new org.apache.thrift.meta_data.FieldMetaData("hrTpl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WX_TPL, new org.apache.thrift.meta_data.FieldMetaData("wxTpl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DISABLE, new org.apache.thrift.meta_data.FieldMetaData("disable", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConfigSysH5StyleTplDO.class, metaDataMap);
  }

  public ConfigSysH5StyleTplDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConfigSysH5StyleTplDO(ConfigSysH5StyleTplDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetLogo()) {
      this.logo = other.logo;
    }
    if (other.isSetHrTpl()) {
      this.hrTpl = other.hrTpl;
    }
    if (other.isSetWxTpl()) {
      this.wxTpl = other.wxTpl;
    }
    this.priority = other.priority;
    this.disable = other.disable;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
    if (other.isSetUpdateTime()) {
      this.updateTime = other.updateTime;
    }
  }

  public ConfigSysH5StyleTplDO deepCopy() {
    return new ConfigSysH5StyleTplDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.logo = null;
    this.hrTpl = null;
    this.wxTpl = null;
    setPriorityIsSet(false);
    this.priority = 0.0;
    setDisableIsSet(false);
    this.disable = 0.0;
    this.createTime = null;
    this.updateTime = null;
  }

  public int getId() {
    return this.id;
  }

  public ConfigSysH5StyleTplDO setId(int id) {
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

  public String getName() {
    return this.name;
  }

  public ConfigSysH5StyleTplDO setName(String name) {
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

  public String getLogo() {
    return this.logo;
  }

  public ConfigSysH5StyleTplDO setLogo(String logo) {
    this.logo = logo;
    return this;
  }

  public void unsetLogo() {
    this.logo = null;
  }

  /** Returns true if field logo is set (has been assigned a value) and false otherwise */
  public boolean isSetLogo() {
    return this.logo != null;
  }

  public void setLogoIsSet(boolean value) {
    if (!value) {
      this.logo = null;
    }
  }

  public String getHrTpl() {
    return this.hrTpl;
  }

  public ConfigSysH5StyleTplDO setHrTpl(String hrTpl) {
    this.hrTpl = hrTpl;
    return this;
  }

  public void unsetHrTpl() {
    this.hrTpl = null;
  }

  /** Returns true if field hrTpl is set (has been assigned a value) and false otherwise */
  public boolean isSetHrTpl() {
    return this.hrTpl != null;
  }

  public void setHrTplIsSet(boolean value) {
    if (!value) {
      this.hrTpl = null;
    }
  }

  public String getWxTpl() {
    return this.wxTpl;
  }

  public ConfigSysH5StyleTplDO setWxTpl(String wxTpl) {
    this.wxTpl = wxTpl;
    return this;
  }

  public void unsetWxTpl() {
    this.wxTpl = null;
  }

  /** Returns true if field wxTpl is set (has been assigned a value) and false otherwise */
  public boolean isSetWxTpl() {
    return this.wxTpl != null;
  }

  public void setWxTplIsSet(boolean value) {
    if (!value) {
      this.wxTpl = null;
    }
  }

  public double getPriority() {
    return this.priority;
  }

  public ConfigSysH5StyleTplDO setPriority(double priority) {
    this.priority = priority;
    setPriorityIsSet(true);
    return this;
  }

  public void unsetPriority() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  public void setPriorityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRIORITY_ISSET_ID, value);
  }

  public double getDisable() {
    return this.disable;
  }

  public ConfigSysH5StyleTplDO setDisable(double disable) {
    this.disable = disable;
    setDisableIsSet(true);
    return this;
  }

  public void unsetDisable() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISABLE_ISSET_ID);
  }

  /** Returns true if field disable is set (has been assigned a value) and false otherwise */
  public boolean isSetDisable() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISABLE_ISSET_ID);
  }

  public void setDisableIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISABLE_ISSET_ID, value);
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public ConfigSysH5StyleTplDO setCreateTime(String createTime) {
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

  public ConfigSysH5StyleTplDO setUpdateTime(String updateTime) {
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

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case LOGO:
      if (value == null) {
        unsetLogo();
      } else {
        setLogo((String)value);
      }
      break;

    case HR_TPL:
      if (value == null) {
        unsetHrTpl();
      } else {
        setHrTpl((String)value);
      }
      break;

    case WX_TPL:
      if (value == null) {
        unsetWxTpl();
      } else {
        setWxTpl((String)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((Double)value);
      }
      break;

    case DISABLE:
      if (value == null) {
        unsetDisable();
      } else {
        setDisable((Double)value);
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

    case NAME:
      return getName();

    case LOGO:
      return getLogo();

    case HR_TPL:
      return getHrTpl();

    case WX_TPL:
      return getWxTpl();

    case PRIORITY:
      return getPriority();

    case DISABLE:
      return getDisable();

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
    case NAME:
      return isSetName();
    case LOGO:
      return isSetLogo();
    case HR_TPL:
      return isSetHrTpl();
    case WX_TPL:
      return isSetWxTpl();
    case PRIORITY:
      return isSetPriority();
    case DISABLE:
      return isSetDisable();
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
    if (that instanceof ConfigSysH5StyleTplDO)
      return this.equals((ConfigSysH5StyleTplDO)that);
    return false;
  }

  public boolean equals(ConfigSysH5StyleTplDO that) {
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

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_logo = true && this.isSetLogo();
    boolean that_present_logo = true && that.isSetLogo();
    if (this_present_logo || that_present_logo) {
      if (!(this_present_logo && that_present_logo))
        return false;
      if (!this.logo.equals(that.logo))
        return false;
    }

    boolean this_present_hrTpl = true && this.isSetHrTpl();
    boolean that_present_hrTpl = true && that.isSetHrTpl();
    if (this_present_hrTpl || that_present_hrTpl) {
      if (!(this_present_hrTpl && that_present_hrTpl))
        return false;
      if (!this.hrTpl.equals(that.hrTpl))
        return false;
    }

    boolean this_present_wxTpl = true && this.isSetWxTpl();
    boolean that_present_wxTpl = true && that.isSetWxTpl();
    if (this_present_wxTpl || that_present_wxTpl) {
      if (!(this_present_wxTpl && that_present_wxTpl))
        return false;
      if (!this.wxTpl.equals(that.wxTpl))
        return false;
    }

    boolean this_present_priority = true && this.isSetPriority();
    boolean that_present_priority = true && that.isSetPriority();
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    boolean this_present_disable = true && this.isSetDisable();
    boolean that_present_disable = true && that.isSetDisable();
    if (this_present_disable || that_present_disable) {
      if (!(this_present_disable && that_present_disable))
        return false;
      if (this.disable != that.disable)
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

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetLogo()) ? 131071 : 524287);
    if (isSetLogo())
      hashCode = hashCode * 8191 + logo.hashCode();

    hashCode = hashCode * 8191 + ((isSetHrTpl()) ? 131071 : 524287);
    if (isSetHrTpl())
      hashCode = hashCode * 8191 + hrTpl.hashCode();

    hashCode = hashCode * 8191 + ((isSetWxTpl()) ? 131071 : 524287);
    if (isSetWxTpl())
      hashCode = hashCode * 8191 + wxTpl.hashCode();

    hashCode = hashCode * 8191 + ((isSetPriority()) ? 131071 : 524287);
    if (isSetPriority())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(priority);

    hashCode = hashCode * 8191 + ((isSetDisable()) ? 131071 : 524287);
    if (isSetDisable())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(disable);

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
    if (isSetUpdateTime())
      hashCode = hashCode * 8191 + updateTime.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ConfigSysH5StyleTplDO other) {
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
    lastComparison = Boolean.valueOf(isSetLogo()).compareTo(other.isSetLogo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logo, other.logo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHrTpl()).compareTo(other.isSetHrTpl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHrTpl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hrTpl, other.hrTpl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWxTpl()).compareTo(other.isSetWxTpl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWxTpl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wxTpl, other.wxTpl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(other.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priority, other.priority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisable()).compareTo(other.isSetDisable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disable, other.disable);
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
    StringBuilder sb = new StringBuilder("ConfigSysH5StyleTplDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
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
    if (isSetLogo()) {
      if (!first) sb.append(", ");
      sb.append("logo:");
      if (this.logo == null) {
        sb.append("null");
      } else {
        sb.append(this.logo);
      }
      first = false;
    }
    if (isSetHrTpl()) {
      if (!first) sb.append(", ");
      sb.append("hrTpl:");
      if (this.hrTpl == null) {
        sb.append("null");
      } else {
        sb.append(this.hrTpl);
      }
      first = false;
    }
    if (isSetWxTpl()) {
      if (!first) sb.append(", ");
      sb.append("wxTpl:");
      if (this.wxTpl == null) {
        sb.append("null");
      } else {
        sb.append(this.wxTpl);
      }
      first = false;
    }
    if (isSetPriority()) {
      if (!first) sb.append(", ");
      sb.append("priority:");
      sb.append(this.priority);
      first = false;
    }
    if (isSetDisable()) {
      if (!first) sb.append(", ");
      sb.append("disable:");
      sb.append(this.disable);
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

  private static class ConfigSysH5StyleTplDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ConfigSysH5StyleTplDOStandardScheme getScheme() {
      return new ConfigSysH5StyleTplDOStandardScheme();
    }
  }

  private static class ConfigSysH5StyleTplDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<ConfigSysH5StyleTplDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConfigSysH5StyleTplDO struct) throws org.apache.thrift.TException {
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
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOGO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.logo = iprot.readString();
              struct.setLogoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HR_TPL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hrTpl = iprot.readString();
              struct.setHrTplIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // WX_TPL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.wxTpl = iprot.readString();
              struct.setWxTplIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRIORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.priority = iprot.readDouble();
              struct.setPriorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DISABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.disable = iprot.readDouble();
              struct.setDisableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createTime = iprot.readString();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // UPDATE_TIME
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConfigSysH5StyleTplDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.logo != null) {
        if (struct.isSetLogo()) {
          oprot.writeFieldBegin(LOGO_FIELD_DESC);
          oprot.writeString(struct.logo);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hrTpl != null) {
        if (struct.isSetHrTpl()) {
          oprot.writeFieldBegin(HR_TPL_FIELD_DESC);
          oprot.writeString(struct.hrTpl);
          oprot.writeFieldEnd();
        }
      }
      if (struct.wxTpl != null) {
        if (struct.isSetWxTpl()) {
          oprot.writeFieldBegin(WX_TPL_FIELD_DESC);
          oprot.writeString(struct.wxTpl);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPriority()) {
        oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
        oprot.writeDouble(struct.priority);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDisable()) {
        oprot.writeFieldBegin(DISABLE_FIELD_DESC);
        oprot.writeDouble(struct.disable);
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

  private static class ConfigSysH5StyleTplDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ConfigSysH5StyleTplDOTupleScheme getScheme() {
      return new ConfigSysH5StyleTplDOTupleScheme();
    }
  }

  private static class ConfigSysH5StyleTplDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<ConfigSysH5StyleTplDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConfigSysH5StyleTplDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetLogo()) {
        optionals.set(2);
      }
      if (struct.isSetHrTpl()) {
        optionals.set(3);
      }
      if (struct.isSetWxTpl()) {
        optionals.set(4);
      }
      if (struct.isSetPriority()) {
        optionals.set(5);
      }
      if (struct.isSetDisable()) {
        optionals.set(6);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(7);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetLogo()) {
        oprot.writeString(struct.logo);
      }
      if (struct.isSetHrTpl()) {
        oprot.writeString(struct.hrTpl);
      }
      if (struct.isSetWxTpl()) {
        oprot.writeString(struct.wxTpl);
      }
      if (struct.isSetPriority()) {
        oprot.writeDouble(struct.priority);
      }
      if (struct.isSetDisable()) {
        oprot.writeDouble(struct.disable);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeString(struct.updateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConfigSysH5StyleTplDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.logo = iprot.readString();
        struct.setLogoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.hrTpl = iprot.readString();
        struct.setHrTplIsSet(true);
      }
      if (incoming.get(4)) {
        struct.wxTpl = iprot.readString();
        struct.setWxTplIsSet(true);
      }
      if (incoming.get(5)) {
        struct.priority = iprot.readDouble();
        struct.setPriorityIsSet(true);
      }
      if (incoming.get(6)) {
        struct.disable = iprot.readDouble();
        struct.setDisableIsSet(true);
      }
      if (incoming.get(7)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(8)) {
        struct.updateTime = iprot.readString();
        struct.setUpdateTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

