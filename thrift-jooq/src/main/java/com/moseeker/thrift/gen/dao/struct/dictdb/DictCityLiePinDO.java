/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.dictdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-06-04")
public class DictCityLiePinDO implements org.apache.thrift.TBase<DictCityLiePinDO, DictCityLiePinDO._Fields>, java.io.Serializable, Cloneable, Comparable<DictCityLiePinDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DictCityLiePinDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("cname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("ename", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("flag", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField PCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("pcode", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SEOURI_FIELD_DESC = new org.apache.thrift.protocol.TField("seouri", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField SHORTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("shortname", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField MAPPING_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mapping_code", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DictCityLiePinDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DictCityLiePinDOTupleSchemeFactory();

  public int id; // optional
  public String code; // optional
  public String cname; // optional
  public String ename; // optional
  public byte flag; // optional
  public String pcode; // optional
  public String seouri; // optional
  public String shortname; // optional
  public int mapping_code; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CODE((short)2, "code"),
    CNAME((short)3, "cname"),
    ENAME((short)4, "ename"),
    FLAG((short)5, "flag"),
    PCODE((short)6, "pcode"),
    SEOURI((short)7, "seouri"),
    SHORTNAME((short)8, "shortname"),
    MAPPING_CODE((short)9, "mapping_code");

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
        case 3: // CNAME
          return CNAME;
        case 4: // ENAME
          return ENAME;
        case 5: // FLAG
          return FLAG;
        case 6: // PCODE
          return PCODE;
        case 7: // SEOURI
          return SEOURI;
        case 8: // SHORTNAME
          return SHORTNAME;
        case 9: // MAPPING_CODE
          return MAPPING_CODE;
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
  private static final int __FLAG_ISSET_ID = 1;
  private static final int __MAPPING_CODE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.CODE,_Fields.CNAME,_Fields.ENAME,_Fields.FLAG,_Fields.PCODE,_Fields.SEOURI,_Fields.SHORTNAME,_Fields.MAPPING_CODE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CNAME, new org.apache.thrift.meta_data.FieldMetaData("cname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENAME, new org.apache.thrift.meta_data.FieldMetaData("ename", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FLAG, new org.apache.thrift.meta_data.FieldMetaData("flag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PCODE, new org.apache.thrift.meta_data.FieldMetaData("pcode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEOURI, new org.apache.thrift.meta_data.FieldMetaData("seouri", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHORTNAME, new org.apache.thrift.meta_data.FieldMetaData("shortname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAPPING_CODE, new org.apache.thrift.meta_data.FieldMetaData("mapping_code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DictCityLiePinDO.class, metaDataMap);
  }

  public DictCityLiePinDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DictCityLiePinDO(DictCityLiePinDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetCname()) {
      this.cname = other.cname;
    }
    if (other.isSetEname()) {
      this.ename = other.ename;
    }
    this.flag = other.flag;
    if (other.isSetPcode()) {
      this.pcode = other.pcode;
    }
    if (other.isSetSeouri()) {
      this.seouri = other.seouri;
    }
    if (other.isSetShortname()) {
      this.shortname = other.shortname;
    }
    this.mapping_code = other.mapping_code;
  }

  public DictCityLiePinDO deepCopy() {
    return new DictCityLiePinDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.code = null;
    this.cname = null;
    this.ename = null;
    setFlagIsSet(false);
    this.flag = 0;
    this.pcode = null;
    this.seouri = null;
    this.shortname = null;
    setMapping_codeIsSet(false);
    this.mapping_code = 0;
  }

  public int getId() {
    return this.id;
  }

  public DictCityLiePinDO setId(int id) {
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

  public String getCode() {
    return this.code;
  }

  public DictCityLiePinDO setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getCname() {
    return this.cname;
  }

  public DictCityLiePinDO setCname(String cname) {
    this.cname = cname;
    return this;
  }

  public void unsetCname() {
    this.cname = null;
  }

  /** Returns true if field cname is set (has been assigned a value) and false otherwise */
  public boolean isSetCname() {
    return this.cname != null;
  }

  public void setCnameIsSet(boolean value) {
    if (!value) {
      this.cname = null;
    }
  }

  public String getEname() {
    return this.ename;
  }

  public DictCityLiePinDO setEname(String ename) {
    this.ename = ename;
    return this;
  }

  public void unsetEname() {
    this.ename = null;
  }

  /** Returns true if field ename is set (has been assigned a value) and false otherwise */
  public boolean isSetEname() {
    return this.ename != null;
  }

  public void setEnameIsSet(boolean value) {
    if (!value) {
      this.ename = null;
    }
  }

  public byte getFlag() {
    return this.flag;
  }

  public DictCityLiePinDO setFlag(byte flag) {
    this.flag = flag;
    setFlagIsSet(true);
    return this;
  }

  public void unsetFlag() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  /** Returns true if field flag is set (has been assigned a value) and false otherwise */
  public boolean isSetFlag() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  public void setFlagIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FLAG_ISSET_ID, value);
  }

  public String getPcode() {
    return this.pcode;
  }

  public DictCityLiePinDO setPcode(String pcode) {
    this.pcode = pcode;
    return this;
  }

  public void unsetPcode() {
    this.pcode = null;
  }

  /** Returns true if field pcode is set (has been assigned a value) and false otherwise */
  public boolean isSetPcode() {
    return this.pcode != null;
  }

  public void setPcodeIsSet(boolean value) {
    if (!value) {
      this.pcode = null;
    }
  }

  public String getSeouri() {
    return this.seouri;
  }

  public DictCityLiePinDO setSeouri(String seouri) {
    this.seouri = seouri;
    return this;
  }

  public void unsetSeouri() {
    this.seouri = null;
  }

  /** Returns true if field seouri is set (has been assigned a value) and false otherwise */
  public boolean isSetSeouri() {
    return this.seouri != null;
  }

  public void setSeouriIsSet(boolean value) {
    if (!value) {
      this.seouri = null;
    }
  }

  public String getShortname() {
    return this.shortname;
  }

  public DictCityLiePinDO setShortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

  public void unsetShortname() {
    this.shortname = null;
  }

  /** Returns true if field shortname is set (has been assigned a value) and false otherwise */
  public boolean isSetShortname() {
    return this.shortname != null;
  }

  public void setShortnameIsSet(boolean value) {
    if (!value) {
      this.shortname = null;
    }
  }

  public int getMapping_code() {
    return this.mapping_code;
  }

  public DictCityLiePinDO setMapping_code(int mapping_code) {
    this.mapping_code = mapping_code;
    setMapping_codeIsSet(true);
    return this;
  }

  public void unsetMapping_code() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAPPING_CODE_ISSET_ID);
  }

  /** Returns true if field mapping_code is set (has been assigned a value) and false otherwise */
  public boolean isSetMapping_code() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAPPING_CODE_ISSET_ID);
  }

  public void setMapping_codeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAPPING_CODE_ISSET_ID, value);
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
        setCode((String)value);
      }
      break;

    case CNAME:
      if (value == null) {
        unsetCname();
      } else {
        setCname((String)value);
      }
      break;

    case ENAME:
      if (value == null) {
        unsetEname();
      } else {
        setEname((String)value);
      }
      break;

    case FLAG:
      if (value == null) {
        unsetFlag();
      } else {
        setFlag((Byte)value);
      }
      break;

    case PCODE:
      if (value == null) {
        unsetPcode();
      } else {
        setPcode((String)value);
      }
      break;

    case SEOURI:
      if (value == null) {
        unsetSeouri();
      } else {
        setSeouri((String)value);
      }
      break;

    case SHORTNAME:
      if (value == null) {
        unsetShortname();
      } else {
        setShortname((String)value);
      }
      break;

    case MAPPING_CODE:
      if (value == null) {
        unsetMapping_code();
      } else {
        setMapping_code((Integer)value);
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

    case CNAME:
      return getCname();

    case ENAME:
      return getEname();

    case FLAG:
      return getFlag();

    case PCODE:
      return getPcode();

    case SEOURI:
      return getSeouri();

    case SHORTNAME:
      return getShortname();

    case MAPPING_CODE:
      return getMapping_code();

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
    case CNAME:
      return isSetCname();
    case ENAME:
      return isSetEname();
    case FLAG:
      return isSetFlag();
    case PCODE:
      return isSetPcode();
    case SEOURI:
      return isSetSeouri();
    case SHORTNAME:
      return isSetShortname();
    case MAPPING_CODE:
      return isSetMapping_code();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DictCityLiePinDO)
      return this.equals((DictCityLiePinDO)that);
    return false;
  }

  public boolean equals(DictCityLiePinDO that) {
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
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_cname = true && this.isSetCname();
    boolean that_present_cname = true && that.isSetCname();
    if (this_present_cname || that_present_cname) {
      if (!(this_present_cname && that_present_cname))
        return false;
      if (!this.cname.equals(that.cname))
        return false;
    }

    boolean this_present_ename = true && this.isSetEname();
    boolean that_present_ename = true && that.isSetEname();
    if (this_present_ename || that_present_ename) {
      if (!(this_present_ename && that_present_ename))
        return false;
      if (!this.ename.equals(that.ename))
        return false;
    }

    boolean this_present_flag = true && this.isSetFlag();
    boolean that_present_flag = true && that.isSetFlag();
    if (this_present_flag || that_present_flag) {
      if (!(this_present_flag && that_present_flag))
        return false;
      if (this.flag != that.flag)
        return false;
    }

    boolean this_present_pcode = true && this.isSetPcode();
    boolean that_present_pcode = true && that.isSetPcode();
    if (this_present_pcode || that_present_pcode) {
      if (!(this_present_pcode && that_present_pcode))
        return false;
      if (!this.pcode.equals(that.pcode))
        return false;
    }

    boolean this_present_seouri = true && this.isSetSeouri();
    boolean that_present_seouri = true && that.isSetSeouri();
    if (this_present_seouri || that_present_seouri) {
      if (!(this_present_seouri && that_present_seouri))
        return false;
      if (!this.seouri.equals(that.seouri))
        return false;
    }

    boolean this_present_shortname = true && this.isSetShortname();
    boolean that_present_shortname = true && that.isSetShortname();
    if (this_present_shortname || that_present_shortname) {
      if (!(this_present_shortname && that_present_shortname))
        return false;
      if (!this.shortname.equals(that.shortname))
        return false;
    }

    boolean this_present_mapping_code = true && this.isSetMapping_code();
    boolean that_present_mapping_code = true && that.isSetMapping_code();
    if (this_present_mapping_code || that_present_mapping_code) {
      if (!(this_present_mapping_code && that_present_mapping_code))
        return false;
      if (this.mapping_code != that.mapping_code)
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
      hashCode = hashCode * 8191 + code.hashCode();

    hashCode = hashCode * 8191 + ((isSetCname()) ? 131071 : 524287);
    if (isSetCname())
      hashCode = hashCode * 8191 + cname.hashCode();

    hashCode = hashCode * 8191 + ((isSetEname()) ? 131071 : 524287);
    if (isSetEname())
      hashCode = hashCode * 8191 + ename.hashCode();

    hashCode = hashCode * 8191 + ((isSetFlag()) ? 131071 : 524287);
    if (isSetFlag())
      hashCode = hashCode * 8191 + (int) (flag);

    hashCode = hashCode * 8191 + ((isSetPcode()) ? 131071 : 524287);
    if (isSetPcode())
      hashCode = hashCode * 8191 + pcode.hashCode();

    hashCode = hashCode * 8191 + ((isSetSeouri()) ? 131071 : 524287);
    if (isSetSeouri())
      hashCode = hashCode * 8191 + seouri.hashCode();

    hashCode = hashCode * 8191 + ((isSetShortname()) ? 131071 : 524287);
    if (isSetShortname())
      hashCode = hashCode * 8191 + shortname.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapping_code()) ? 131071 : 524287);
    if (isSetMapping_code())
      hashCode = hashCode * 8191 + mapping_code;

    return hashCode;
  }

  @Override
  public int compareTo(DictCityLiePinDO other) {
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
    lastComparison = Boolean.valueOf(isSetCname()).compareTo(other.isSetCname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cname, other.cname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEname()).compareTo(other.isSetEname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ename, other.ename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFlag()).compareTo(other.isSetFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flag, other.flag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPcode()).compareTo(other.isSetPcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pcode, other.pcode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeouri()).compareTo(other.isSetSeouri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeouri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seouri, other.seouri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShortname()).compareTo(other.isSetShortname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShortname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shortname, other.shortname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMapping_code()).compareTo(other.isSetMapping_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapping_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapping_code, other.mapping_code);
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
    StringBuilder sb = new StringBuilder("DictCityLiePinDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetCode()) {
      if (!first) sb.append(", ");
      sb.append("code:");
      if (this.code == null) {
        sb.append("null");
      } else {
        sb.append(this.code);
      }
      first = false;
    }
    if (isSetCname()) {
      if (!first) sb.append(", ");
      sb.append("cname:");
      if (this.cname == null) {
        sb.append("null");
      } else {
        sb.append(this.cname);
      }
      first = false;
    }
    if (isSetEname()) {
      if (!first) sb.append(", ");
      sb.append("ename:");
      if (this.ename == null) {
        sb.append("null");
      } else {
        sb.append(this.ename);
      }
      first = false;
    }
    if (isSetFlag()) {
      if (!first) sb.append(", ");
      sb.append("flag:");
      sb.append(this.flag);
      first = false;
    }
    if (isSetPcode()) {
      if (!first) sb.append(", ");
      sb.append("pcode:");
      if (this.pcode == null) {
        sb.append("null");
      } else {
        sb.append(this.pcode);
      }
      first = false;
    }
    if (isSetSeouri()) {
      if (!first) sb.append(", ");
      sb.append("seouri:");
      if (this.seouri == null) {
        sb.append("null");
      } else {
        sb.append(this.seouri);
      }
      first = false;
    }
    if (isSetShortname()) {
      if (!first) sb.append(", ");
      sb.append("shortname:");
      if (this.shortname == null) {
        sb.append("null");
      } else {
        sb.append(this.shortname);
      }
      first = false;
    }
    if (isSetMapping_code()) {
      if (!first) sb.append(", ");
      sb.append("mapping_code:");
      sb.append(this.mapping_code);
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

  private static class DictCityLiePinDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DictCityLiePinDOStandardScheme getScheme() {
      return new DictCityLiePinDOStandardScheme();
    }
  }

  private static class DictCityLiePinDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<DictCityLiePinDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DictCityLiePinDO struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cname = iprot.readString();
              struct.setCnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ename = iprot.readString();
              struct.setEnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.flag = iprot.readByte();
              struct.setFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pcode = iprot.readString();
              struct.setPcodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SEOURI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.seouri = iprot.readString();
              struct.setSeouriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SHORTNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shortname = iprot.readString();
              struct.setShortnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // MAPPING_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mapping_code = iprot.readI32();
              struct.setMapping_codeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DictCityLiePinDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        if (struct.isSetCode()) {
          oprot.writeFieldBegin(CODE_FIELD_DESC);
          oprot.writeString(struct.code);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cname != null) {
        if (struct.isSetCname()) {
          oprot.writeFieldBegin(CNAME_FIELD_DESC);
          oprot.writeString(struct.cname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ename != null) {
        if (struct.isSetEname()) {
          oprot.writeFieldBegin(ENAME_FIELD_DESC);
          oprot.writeString(struct.ename);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetFlag()) {
        oprot.writeFieldBegin(FLAG_FIELD_DESC);
        oprot.writeByte(struct.flag);
        oprot.writeFieldEnd();
      }
      if (struct.pcode != null) {
        if (struct.isSetPcode()) {
          oprot.writeFieldBegin(PCODE_FIELD_DESC);
          oprot.writeString(struct.pcode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.seouri != null) {
        if (struct.isSetSeouri()) {
          oprot.writeFieldBegin(SEOURI_FIELD_DESC);
          oprot.writeString(struct.seouri);
          oprot.writeFieldEnd();
        }
      }
      if (struct.shortname != null) {
        if (struct.isSetShortname()) {
          oprot.writeFieldBegin(SHORTNAME_FIELD_DESC);
          oprot.writeString(struct.shortname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMapping_code()) {
        oprot.writeFieldBegin(MAPPING_CODE_FIELD_DESC);
        oprot.writeI32(struct.mapping_code);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DictCityLiePinDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DictCityLiePinDOTupleScheme getScheme() {
      return new DictCityLiePinDOTupleScheme();
    }
  }

  private static class DictCityLiePinDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<DictCityLiePinDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DictCityLiePinDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetCname()) {
        optionals.set(2);
      }
      if (struct.isSetEname()) {
        optionals.set(3);
      }
      if (struct.isSetFlag()) {
        optionals.set(4);
      }
      if (struct.isSetPcode()) {
        optionals.set(5);
      }
      if (struct.isSetSeouri()) {
        optionals.set(6);
      }
      if (struct.isSetShortname()) {
        optionals.set(7);
      }
      if (struct.isSetMapping_code()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetCname()) {
        oprot.writeString(struct.cname);
      }
      if (struct.isSetEname()) {
        oprot.writeString(struct.ename);
      }
      if (struct.isSetFlag()) {
        oprot.writeByte(struct.flag);
      }
      if (struct.isSetPcode()) {
        oprot.writeString(struct.pcode);
      }
      if (struct.isSetSeouri()) {
        oprot.writeString(struct.seouri);
      }
      if (struct.isSetShortname()) {
        oprot.writeString(struct.shortname);
      }
      if (struct.isSetMapping_code()) {
        oprot.writeI32(struct.mapping_code);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DictCityLiePinDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cname = iprot.readString();
        struct.setCnameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ename = iprot.readString();
        struct.setEnameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.flag = iprot.readByte();
        struct.setFlagIsSet(true);
      }
      if (incoming.get(5)) {
        struct.pcode = iprot.readString();
        struct.setPcodeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.seouri = iprot.readString();
        struct.setSeouriIsSet(true);
      }
      if (incoming.get(7)) {
        struct.shortname = iprot.readString();
        struct.setShortnameIsSet(true);
      }
      if (incoming.get(8)) {
        struct.mapping_code = iprot.readI32();
        struct.setMapping_codeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

