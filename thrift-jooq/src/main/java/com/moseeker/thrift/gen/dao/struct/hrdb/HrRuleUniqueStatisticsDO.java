/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.hrdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-20")
public class HrRuleUniqueStatisticsDO implements org.apache.thrift.TBase<HrRuleUniqueStatisticsDO, HrRuleUniqueStatisticsDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrRuleUniqueStatisticsDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrRuleUniqueStatisticsDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField WXRULE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("wxruleId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MENU_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("menuName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("companyId", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField VIEW_NUM_UV_FIELD_DESC = new org.apache.thrift.protocol.TField("viewNumUv", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField CREATE_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("createDate", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField INFO_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("infoType", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrRuleUniqueStatisticsDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrRuleUniqueStatisticsDOTupleSchemeFactory();

  public int id; // optional
  public int wxruleId; // optional
  public java.lang.String menuName; // optional
  public int type; // optional
  public int companyId; // optional
  public int viewNumUv; // optional
  public java.lang.String createDate; // optional
  public int infoType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    WXRULE_ID((short)2, "wxruleId"),
    MENU_NAME((short)3, "menuName"),
    TYPE((short)4, "type"),
    COMPANY_ID((short)5, "companyId"),
    VIEW_NUM_UV((short)6, "viewNumUv"),
    CREATE_DATE((short)7, "createDate"),
    INFO_TYPE((short)8, "infoType");

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
        case 2: // WXRULE_ID
          return WXRULE_ID;
        case 3: // MENU_NAME
          return MENU_NAME;
        case 4: // TYPE
          return TYPE;
        case 5: // COMPANY_ID
          return COMPANY_ID;
        case 6: // VIEW_NUM_UV
          return VIEW_NUM_UV;
        case 7: // CREATE_DATE
          return CREATE_DATE;
        case 8: // INFO_TYPE
          return INFO_TYPE;
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
  private static final int __WXRULEID_ISSET_ID = 1;
  private static final int __TYPE_ISSET_ID = 2;
  private static final int __COMPANYID_ISSET_ID = 3;
  private static final int __VIEWNUMUV_ISSET_ID = 4;
  private static final int __INFOTYPE_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.WXRULE_ID,_Fields.MENU_NAME,_Fields.TYPE,_Fields.COMPANY_ID,_Fields.VIEW_NUM_UV,_Fields.CREATE_DATE,_Fields.INFO_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WXRULE_ID, new org.apache.thrift.meta_data.FieldMetaData("wxruleId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MENU_NAME, new org.apache.thrift.meta_data.FieldMetaData("menuName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("companyId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VIEW_NUM_UV, new org.apache.thrift.meta_data.FieldMetaData("viewNumUv", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_DATE, new org.apache.thrift.meta_data.FieldMetaData("createDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INFO_TYPE, new org.apache.thrift.meta_data.FieldMetaData("infoType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrRuleUniqueStatisticsDO.class, metaDataMap);
  }

  public HrRuleUniqueStatisticsDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrRuleUniqueStatisticsDO(HrRuleUniqueStatisticsDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.wxruleId = other.wxruleId;
    if (other.isSetMenuName()) {
      this.menuName = other.menuName;
    }
    this.type = other.type;
    this.companyId = other.companyId;
    this.viewNumUv = other.viewNumUv;
    if (other.isSetCreateDate()) {
      this.createDate = other.createDate;
    }
    this.infoType = other.infoType;
  }

  public HrRuleUniqueStatisticsDO deepCopy() {
    return new HrRuleUniqueStatisticsDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setWxruleIdIsSet(false);
    this.wxruleId = 0;
    this.menuName = null;
    setTypeIsSet(false);
    this.type = 0;
    setCompanyIdIsSet(false);
    this.companyId = 0;
    setViewNumUvIsSet(false);
    this.viewNumUv = 0;
    this.createDate = null;
    setInfoTypeIsSet(false);
    this.infoType = 0;
  }

  public int getId() {
    return this.id;
  }

  public HrRuleUniqueStatisticsDO setId(int id) {
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

  public int getWxruleId() {
    return this.wxruleId;
  }

  public HrRuleUniqueStatisticsDO setWxruleId(int wxruleId) {
    this.wxruleId = wxruleId;
    setWxruleIdIsSet(true);
    return this;
  }

  public void unsetWxruleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WXRULEID_ISSET_ID);
  }

  /** Returns true if field wxruleId is set (has been assigned a value) and false otherwise */
  public boolean isSetWxruleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WXRULEID_ISSET_ID);
  }

  public void setWxruleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WXRULEID_ISSET_ID, value);
  }

  public java.lang.String getMenuName() {
    return this.menuName;
  }

  public HrRuleUniqueStatisticsDO setMenuName(java.lang.String menuName) {
    this.menuName = menuName;
    return this;
  }

  public void unsetMenuName() {
    this.menuName = null;
  }

  /** Returns true if field menuName is set (has been assigned a value) and false otherwise */
  public boolean isSetMenuName() {
    return this.menuName != null;
  }

  public void setMenuNameIsSet(boolean value) {
    if (!value) {
      this.menuName = null;
    }
  }

  public int getType() {
    return this.type;
  }

  public HrRuleUniqueStatisticsDO setType(int type) {
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

  public int getCompanyId() {
    return this.companyId;
  }

  public HrRuleUniqueStatisticsDO setCompanyId(int companyId) {
    this.companyId = companyId;
    setCompanyIdIsSet(true);
    return this;
  }

  public void unsetCompanyId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPANYID_ISSET_ID);
  }

  /** Returns true if field companyId is set (has been assigned a value) and false otherwise */
  public boolean isSetCompanyId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPANYID_ISSET_ID);
  }

  public void setCompanyIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPANYID_ISSET_ID, value);
  }

  public int getViewNumUv() {
    return this.viewNumUv;
  }

  public HrRuleUniqueStatisticsDO setViewNumUv(int viewNumUv) {
    this.viewNumUv = viewNumUv;
    setViewNumUvIsSet(true);
    return this;
  }

  public void unsetViewNumUv() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VIEWNUMUV_ISSET_ID);
  }

  /** Returns true if field viewNumUv is set (has been assigned a value) and false otherwise */
  public boolean isSetViewNumUv() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VIEWNUMUV_ISSET_ID);
  }

  public void setViewNumUvIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VIEWNUMUV_ISSET_ID, value);
  }

  public java.lang.String getCreateDate() {
    return this.createDate;
  }

  public HrRuleUniqueStatisticsDO setCreateDate(java.lang.String createDate) {
    this.createDate = createDate;
    return this;
  }

  public void unsetCreateDate() {
    this.createDate = null;
  }

  /** Returns true if field createDate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateDate() {
    return this.createDate != null;
  }

  public void setCreateDateIsSet(boolean value) {
    if (!value) {
      this.createDate = null;
    }
  }

  public int getInfoType() {
    return this.infoType;
  }

  public HrRuleUniqueStatisticsDO setInfoType(int infoType) {
    this.infoType = infoType;
    setInfoTypeIsSet(true);
    return this;
  }

  public void unsetInfoType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INFOTYPE_ISSET_ID);
  }

  /** Returns true if field infoType is set (has been assigned a value) and false otherwise */
  public boolean isSetInfoType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INFOTYPE_ISSET_ID);
  }

  public void setInfoTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INFOTYPE_ISSET_ID, value);
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

    case WXRULE_ID:
      if (value == null) {
        unsetWxruleId();
      } else {
        setWxruleId((java.lang.Integer)value);
      }
      break;

    case MENU_NAME:
      if (value == null) {
        unsetMenuName();
      } else {
        setMenuName((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.Integer)value);
      }
      break;

    case COMPANY_ID:
      if (value == null) {
        unsetCompanyId();
      } else {
        setCompanyId((java.lang.Integer)value);
      }
      break;

    case VIEW_NUM_UV:
      if (value == null) {
        unsetViewNumUv();
      } else {
        setViewNumUv((java.lang.Integer)value);
      }
      break;

    case CREATE_DATE:
      if (value == null) {
        unsetCreateDate();
      } else {
        setCreateDate((java.lang.String)value);
      }
      break;

    case INFO_TYPE:
      if (value == null) {
        unsetInfoType();
      } else {
        setInfoType((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case WXRULE_ID:
      return getWxruleId();

    case MENU_NAME:
      return getMenuName();

    case TYPE:
      return getType();

    case COMPANY_ID:
      return getCompanyId();

    case VIEW_NUM_UV:
      return getViewNumUv();

    case CREATE_DATE:
      return getCreateDate();

    case INFO_TYPE:
      return getInfoType();

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
    case WXRULE_ID:
      return isSetWxruleId();
    case MENU_NAME:
      return isSetMenuName();
    case TYPE:
      return isSetType();
    case COMPANY_ID:
      return isSetCompanyId();
    case VIEW_NUM_UV:
      return isSetViewNumUv();
    case CREATE_DATE:
      return isSetCreateDate();
    case INFO_TYPE:
      return isSetInfoType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HrRuleUniqueStatisticsDO)
      return this.equals((HrRuleUniqueStatisticsDO)that);
    return false;
  }

  public boolean equals(HrRuleUniqueStatisticsDO that) {
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

    boolean this_present_wxruleId = true && this.isSetWxruleId();
    boolean that_present_wxruleId = true && that.isSetWxruleId();
    if (this_present_wxruleId || that_present_wxruleId) {
      if (!(this_present_wxruleId && that_present_wxruleId))
        return false;
      if (this.wxruleId != that.wxruleId)
        return false;
    }

    boolean this_present_menuName = true && this.isSetMenuName();
    boolean that_present_menuName = true && that.isSetMenuName();
    if (this_present_menuName || that_present_menuName) {
      if (!(this_present_menuName && that_present_menuName))
        return false;
      if (!this.menuName.equals(that.menuName))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_companyId = true && this.isSetCompanyId();
    boolean that_present_companyId = true && that.isSetCompanyId();
    if (this_present_companyId || that_present_companyId) {
      if (!(this_present_companyId && that_present_companyId))
        return false;
      if (this.companyId != that.companyId)
        return false;
    }

    boolean this_present_viewNumUv = true && this.isSetViewNumUv();
    boolean that_present_viewNumUv = true && that.isSetViewNumUv();
    if (this_present_viewNumUv || that_present_viewNumUv) {
      if (!(this_present_viewNumUv && that_present_viewNumUv))
        return false;
      if (this.viewNumUv != that.viewNumUv)
        return false;
    }

    boolean this_present_createDate = true && this.isSetCreateDate();
    boolean that_present_createDate = true && that.isSetCreateDate();
    if (this_present_createDate || that_present_createDate) {
      if (!(this_present_createDate && that_present_createDate))
        return false;
      if (!this.createDate.equals(that.createDate))
        return false;
    }

    boolean this_present_infoType = true && this.isSetInfoType();
    boolean that_present_infoType = true && that.isSetInfoType();
    if (this_present_infoType || that_present_infoType) {
      if (!(this_present_infoType && that_present_infoType))
        return false;
      if (this.infoType != that.infoType)
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

    hashCode = hashCode * 8191 + ((isSetWxruleId()) ? 131071 : 524287);
    if (isSetWxruleId())
      hashCode = hashCode * 8191 + wxruleId;

    hashCode = hashCode * 8191 + ((isSetMenuName()) ? 131071 : 524287);
    if (isSetMenuName())
      hashCode = hashCode * 8191 + menuName.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type;

    hashCode = hashCode * 8191 + ((isSetCompanyId()) ? 131071 : 524287);
    if (isSetCompanyId())
      hashCode = hashCode * 8191 + companyId;

    hashCode = hashCode * 8191 + ((isSetViewNumUv()) ? 131071 : 524287);
    if (isSetViewNumUv())
      hashCode = hashCode * 8191 + viewNumUv;

    hashCode = hashCode * 8191 + ((isSetCreateDate()) ? 131071 : 524287);
    if (isSetCreateDate())
      hashCode = hashCode * 8191 + createDate.hashCode();

    hashCode = hashCode * 8191 + ((isSetInfoType()) ? 131071 : 524287);
    if (isSetInfoType())
      hashCode = hashCode * 8191 + infoType;

    return hashCode;
  }

  @Override
  public int compareTo(HrRuleUniqueStatisticsDO other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetWxruleId()).compareTo(other.isSetWxruleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWxruleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wxruleId, other.wxruleId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMenuName()).compareTo(other.isSetMenuName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMenuName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.menuName, other.menuName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetCompanyId()).compareTo(other.isSetCompanyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompanyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.companyId, other.companyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetViewNumUv()).compareTo(other.isSetViewNumUv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewNumUv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.viewNumUv, other.viewNumUv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreateDate()).compareTo(other.isSetCreateDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createDate, other.createDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInfoType()).compareTo(other.isSetInfoType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfoType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.infoType, other.infoType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HrRuleUniqueStatisticsDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetWxruleId()) {
      if (!first) sb.append(", ");
      sb.append("wxruleId:");
      sb.append(this.wxruleId);
      first = false;
    }
    if (isSetMenuName()) {
      if (!first) sb.append(", ");
      sb.append("menuName:");
      if (this.menuName == null) {
        sb.append("null");
      } else {
        sb.append(this.menuName);
      }
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      sb.append(this.type);
      first = false;
    }
    if (isSetCompanyId()) {
      if (!first) sb.append(", ");
      sb.append("companyId:");
      sb.append(this.companyId);
      first = false;
    }
    if (isSetViewNumUv()) {
      if (!first) sb.append(", ");
      sb.append("viewNumUv:");
      sb.append(this.viewNumUv);
      first = false;
    }
    if (isSetCreateDate()) {
      if (!first) sb.append(", ");
      sb.append("createDate:");
      if (this.createDate == null) {
        sb.append("null");
      } else {
        sb.append(this.createDate);
      }
      first = false;
    }
    if (isSetInfoType()) {
      if (!first) sb.append(", ");
      sb.append("infoType:");
      sb.append(this.infoType);
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

  private static class HrRuleUniqueStatisticsDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrRuleUniqueStatisticsDOStandardScheme getScheme() {
      return new HrRuleUniqueStatisticsDOStandardScheme();
    }
  }

  private static class HrRuleUniqueStatisticsDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrRuleUniqueStatisticsDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrRuleUniqueStatisticsDO struct) throws org.apache.thrift.TException {
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
          case 2: // WXRULE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wxruleId = iprot.readI32();
              struct.setWxruleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MENU_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.menuName = iprot.readString();
              struct.setMenuNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.companyId = iprot.readI32();
              struct.setCompanyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VIEW_NUM_UV
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.viewNumUv = iprot.readI32();
              struct.setViewNumUvIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATE_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createDate = iprot.readString();
              struct.setCreateDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // INFO_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.infoType = iprot.readI32();
              struct.setInfoTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrRuleUniqueStatisticsDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWxruleId()) {
        oprot.writeFieldBegin(WXRULE_ID_FIELD_DESC);
        oprot.writeI32(struct.wxruleId);
        oprot.writeFieldEnd();
      }
      if (struct.menuName != null) {
        if (struct.isSetMenuName()) {
          oprot.writeFieldBegin(MENU_NAME_FIELD_DESC);
          oprot.writeString(struct.menuName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetType()) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompanyId()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.companyId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetViewNumUv()) {
        oprot.writeFieldBegin(VIEW_NUM_UV_FIELD_DESC);
        oprot.writeI32(struct.viewNumUv);
        oprot.writeFieldEnd();
      }
      if (struct.createDate != null) {
        if (struct.isSetCreateDate()) {
          oprot.writeFieldBegin(CREATE_DATE_FIELD_DESC);
          oprot.writeString(struct.createDate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetInfoType()) {
        oprot.writeFieldBegin(INFO_TYPE_FIELD_DESC);
        oprot.writeI32(struct.infoType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrRuleUniqueStatisticsDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrRuleUniqueStatisticsDOTupleScheme getScheme() {
      return new HrRuleUniqueStatisticsDOTupleScheme();
    }
  }

  private static class HrRuleUniqueStatisticsDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrRuleUniqueStatisticsDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrRuleUniqueStatisticsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetWxruleId()) {
        optionals.set(1);
      }
      if (struct.isSetMenuName()) {
        optionals.set(2);
      }
      if (struct.isSetType()) {
        optionals.set(3);
      }
      if (struct.isSetCompanyId()) {
        optionals.set(4);
      }
      if (struct.isSetViewNumUv()) {
        optionals.set(5);
      }
      if (struct.isSetCreateDate()) {
        optionals.set(6);
      }
      if (struct.isSetInfoType()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetWxruleId()) {
        oprot.writeI32(struct.wxruleId);
      }
      if (struct.isSetMenuName()) {
        oprot.writeString(struct.menuName);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
      if (struct.isSetCompanyId()) {
        oprot.writeI32(struct.companyId);
      }
      if (struct.isSetViewNumUv()) {
        oprot.writeI32(struct.viewNumUv);
      }
      if (struct.isSetCreateDate()) {
        oprot.writeString(struct.createDate);
      }
      if (struct.isSetInfoType()) {
        oprot.writeI32(struct.infoType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrRuleUniqueStatisticsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.wxruleId = iprot.readI32();
        struct.setWxruleIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.menuName = iprot.readString();
        struct.setMenuNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.companyId = iprot.readI32();
        struct.setCompanyIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.viewNumUv = iprot.readI32();
        struct.setViewNumUvIsSet(true);
      }
      if (incoming.get(6)) {
        struct.createDate = iprot.readString();
        struct.setCreateDateIsSet(true);
      }
      if (incoming.get(7)) {
        struct.infoType = iprot.readI32();
        struct.setInfoTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

