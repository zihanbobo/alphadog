/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dict.struct;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-08-01")
public class DictCountry implements org.apache.thrift.TBase<DictCountry, DictCountry._Fields>, java.io.Serializable, Cloneable, Comparable<DictCountry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DictCountry");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("ename", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ISO_CODE_2_FIELD_DESC = new org.apache.thrift.protocol.TField("iso_code_2", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ISO_CODE_3_FIELD_DESC = new org.apache.thrift.protocol.TField("iso_code_3", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ICON_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("icon_class", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField HOT_COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("hot_country", org.apache.thrift.protocol.TType.BYTE, (short)8);
  private static final org.apache.thrift.protocol.TField CONTINENT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("continent_code", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DictCountryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DictCountryTupleSchemeFactory());
  }

  public int id; // optional
  public String name; // optional
  public String ename; // optional
  public String iso_code_2; // optional
  public String iso_code_3; // optional
  public String code; // optional
  public String icon_class; // optional
  public byte hot_country; // optional
  public int continent_code; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    ENAME((short)3, "ename"),
    ISO_CODE_2((short)4, "iso_code_2"),
    ISO_CODE_3((short)5, "iso_code_3"),
    CODE((short)6, "code"),
    ICON_CLASS((short)7, "icon_class"),
    HOT_COUNTRY((short)8, "hot_country"),
    CONTINENT_CODE((short)9, "continent_code");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
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
        case 3: // ENAME
          return ENAME;
        case 4: // ISO_CODE_2
          return ISO_CODE_2;
        case 5: // ISO_CODE_3
          return ISO_CODE_3;
        case 6: // CODE
          return CODE;
        case 7: // ICON_CLASS
          return ICON_CLASS;
        case 8: // HOT_COUNTRY
          return HOT_COUNTRY;
        case 9: // CONTINENT_CODE
          return CONTINENT_CODE;
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
  private static final int __HOT_COUNTRY_ISSET_ID = 1;
  private static final int __CONTINENT_CODE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.NAME,_Fields.ENAME,_Fields.ISO_CODE_2,_Fields.ISO_CODE_3,_Fields.CODE,_Fields.ICON_CLASS,_Fields.HOT_COUNTRY,_Fields.CONTINENT_CODE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENAME, new org.apache.thrift.meta_data.FieldMetaData("ename", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ISO_CODE_2, new org.apache.thrift.meta_data.FieldMetaData("iso_code_2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ISO_CODE_3, new org.apache.thrift.meta_data.FieldMetaData("iso_code_3", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ICON_CLASS, new org.apache.thrift.meta_data.FieldMetaData("icon_class", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOT_COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("hot_country", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CONTINENT_CODE, new org.apache.thrift.meta_data.FieldMetaData("continent_code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DictCountry.class, metaDataMap);
  }

  public DictCountry() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DictCountry(DictCountry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetEname()) {
      this.ename = other.ename;
    }
    if (other.isSetIso_code_2()) {
      this.iso_code_2 = other.iso_code_2;
    }
    if (other.isSetIso_code_3()) {
      this.iso_code_3 = other.iso_code_3;
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetIcon_class()) {
      this.icon_class = other.icon_class;
    }
    this.hot_country = other.hot_country;
    this.continent_code = other.continent_code;
  }

  public DictCountry deepCopy() {
    return new DictCountry(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.ename = null;
    this.iso_code_2 = null;
    this.iso_code_3 = null;
    this.code = null;
    this.icon_class = null;
    setHot_countryIsSet(false);
    this.hot_country = 0;
    setContinent_codeIsSet(false);
    this.continent_code = 0;
  }

  public int getId() {
    return this.id;
  }

  public DictCountry setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public DictCountry setName(String name) {
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

  public String getEname() {
    return this.ename;
  }

  public DictCountry setEname(String ename) {
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

  public String getIso_code_2() {
    return this.iso_code_2;
  }

  public DictCountry setIso_code_2(String iso_code_2) {
    this.iso_code_2 = iso_code_2;
    return this;
  }

  public void unsetIso_code_2() {
    this.iso_code_2 = null;
  }

  /** Returns true if field iso_code_2 is set (has been assigned a value) and false otherwise */
  public boolean isSetIso_code_2() {
    return this.iso_code_2 != null;
  }

  public void setIso_code_2IsSet(boolean value) {
    if (!value) {
      this.iso_code_2 = null;
    }
  }

  public String getIso_code_3() {
    return this.iso_code_3;
  }

  public DictCountry setIso_code_3(String iso_code_3) {
    this.iso_code_3 = iso_code_3;
    return this;
  }

  public void unsetIso_code_3() {
    this.iso_code_3 = null;
  }

  /** Returns true if field iso_code_3 is set (has been assigned a value) and false otherwise */
  public boolean isSetIso_code_3() {
    return this.iso_code_3 != null;
  }

  public void setIso_code_3IsSet(boolean value) {
    if (!value) {
      this.iso_code_3 = null;
    }
  }

  public String getCode() {
    return this.code;
  }

  public DictCountry setCode(String code) {
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

  public String getIcon_class() {
    return this.icon_class;
  }

  public DictCountry setIcon_class(String icon_class) {
    this.icon_class = icon_class;
    return this;
  }

  public void unsetIcon_class() {
    this.icon_class = null;
  }

  /** Returns true if field icon_class is set (has been assigned a value) and false otherwise */
  public boolean isSetIcon_class() {
    return this.icon_class != null;
  }

  public void setIcon_classIsSet(boolean value) {
    if (!value) {
      this.icon_class = null;
    }
  }

  public byte getHot_country() {
    return this.hot_country;
  }

  public DictCountry setHot_country(byte hot_country) {
    this.hot_country = hot_country;
    setHot_countryIsSet(true);
    return this;
  }

  public void unsetHot_country() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HOT_COUNTRY_ISSET_ID);
  }

  /** Returns true if field hot_country is set (has been assigned a value) and false otherwise */
  public boolean isSetHot_country() {
    return EncodingUtils.testBit(__isset_bitfield, __HOT_COUNTRY_ISSET_ID);
  }

  public void setHot_countryIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HOT_COUNTRY_ISSET_ID, value);
  }

  public int getContinent_code() {
    return this.continent_code;
  }

  public DictCountry setContinent_code(int continent_code) {
    this.continent_code = continent_code;
    setContinent_codeIsSet(true);
    return this;
  }

  public void unsetContinent_code() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONTINENT_CODE_ISSET_ID);
  }

  /** Returns true if field continent_code is set (has been assigned a value) and false otherwise */
  public boolean isSetContinent_code() {
    return EncodingUtils.testBit(__isset_bitfield, __CONTINENT_CODE_ISSET_ID);
  }

  public void setContinent_codeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONTINENT_CODE_ISSET_ID, value);
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

    case ENAME:
      if (value == null) {
        unsetEname();
      } else {
        setEname((String)value);
      }
      break;

    case ISO_CODE_2:
      if (value == null) {
        unsetIso_code_2();
      } else {
        setIso_code_2((String)value);
      }
      break;

    case ISO_CODE_3:
      if (value == null) {
        unsetIso_code_3();
      } else {
        setIso_code_3((String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case ICON_CLASS:
      if (value == null) {
        unsetIcon_class();
      } else {
        setIcon_class((String)value);
      }
      break;

    case HOT_COUNTRY:
      if (value == null) {
        unsetHot_country();
      } else {
        setHot_country((Byte)value);
      }
      break;

    case CONTINENT_CODE:
      if (value == null) {
        unsetContinent_code();
      } else {
        setContinent_code((Integer)value);
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

    case ENAME:
      return getEname();

    case ISO_CODE_2:
      return getIso_code_2();

    case ISO_CODE_3:
      return getIso_code_3();

    case CODE:
      return getCode();

    case ICON_CLASS:
      return getIcon_class();

    case HOT_COUNTRY:
      return getHot_country();

    case CONTINENT_CODE:
      return getContinent_code();

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
    case ENAME:
      return isSetEname();
    case ISO_CODE_2:
      return isSetIso_code_2();
    case ISO_CODE_3:
      return isSetIso_code_3();
    case CODE:
      return isSetCode();
    case ICON_CLASS:
      return isSetIcon_class();
    case HOT_COUNTRY:
      return isSetHot_country();
    case CONTINENT_CODE:
      return isSetContinent_code();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DictCountry)
      return this.equals((DictCountry)that);
    return false;
  }

  public boolean equals(DictCountry that) {
    if (that == null)
      return false;

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

    boolean this_present_ename = true && this.isSetEname();
    boolean that_present_ename = true && that.isSetEname();
    if (this_present_ename || that_present_ename) {
      if (!(this_present_ename && that_present_ename))
        return false;
      if (!this.ename.equals(that.ename))
        return false;
    }

    boolean this_present_iso_code_2 = true && this.isSetIso_code_2();
    boolean that_present_iso_code_2 = true && that.isSetIso_code_2();
    if (this_present_iso_code_2 || that_present_iso_code_2) {
      if (!(this_present_iso_code_2 && that_present_iso_code_2))
        return false;
      if (!this.iso_code_2.equals(that.iso_code_2))
        return false;
    }

    boolean this_present_iso_code_3 = true && this.isSetIso_code_3();
    boolean that_present_iso_code_3 = true && that.isSetIso_code_3();
    if (this_present_iso_code_3 || that_present_iso_code_3) {
      if (!(this_present_iso_code_3 && that_present_iso_code_3))
        return false;
      if (!this.iso_code_3.equals(that.iso_code_3))
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

    boolean this_present_icon_class = true && this.isSetIcon_class();
    boolean that_present_icon_class = true && that.isSetIcon_class();
    if (this_present_icon_class || that_present_icon_class) {
      if (!(this_present_icon_class && that_present_icon_class))
        return false;
      if (!this.icon_class.equals(that.icon_class))
        return false;
    }

    boolean this_present_hot_country = true && this.isSetHot_country();
    boolean that_present_hot_country = true && that.isSetHot_country();
    if (this_present_hot_country || that_present_hot_country) {
      if (!(this_present_hot_country && that_present_hot_country))
        return false;
      if (this.hot_country != that.hot_country)
        return false;
    }

    boolean this_present_continent_code = true && this.isSetContinent_code();
    boolean that_present_continent_code = true && that.isSetContinent_code();
    if (this_present_continent_code || that_present_continent_code) {
      if (!(this_present_continent_code && that_present_continent_code))
        return false;
      if (this.continent_code != that.continent_code)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_ename = true && (isSetEname());
    list.add(present_ename);
    if (present_ename)
      list.add(ename);

    boolean present_iso_code_2 = true && (isSetIso_code_2());
    list.add(present_iso_code_2);
    if (present_iso_code_2)
      list.add(iso_code_2);

    boolean present_iso_code_3 = true && (isSetIso_code_3());
    list.add(present_iso_code_3);
    if (present_iso_code_3)
      list.add(iso_code_3);

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_icon_class = true && (isSetIcon_class());
    list.add(present_icon_class);
    if (present_icon_class)
      list.add(icon_class);

    boolean present_hot_country = true && (isSetHot_country());
    list.add(present_hot_country);
    if (present_hot_country)
      list.add(hot_country);

    boolean present_continent_code = true && (isSetContinent_code());
    list.add(present_continent_code);
    if (present_continent_code)
      list.add(continent_code);

    return list.hashCode();
  }

  @Override
  public int compareTo(DictCountry other) {
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
    lastComparison = Boolean.valueOf(isSetIso_code_2()).compareTo(other.isSetIso_code_2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIso_code_2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iso_code_2, other.iso_code_2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIso_code_3()).compareTo(other.isSetIso_code_3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIso_code_3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iso_code_3, other.iso_code_3);
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
    lastComparison = Boolean.valueOf(isSetIcon_class()).compareTo(other.isSetIcon_class());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcon_class()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.icon_class, other.icon_class);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHot_country()).compareTo(other.isSetHot_country());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHot_country()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hot_country, other.hot_country);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContinent_code()).compareTo(other.isSetContinent_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinent_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continent_code, other.continent_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DictCountry(");
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
    if (isSetIso_code_2()) {
      if (!first) sb.append(", ");
      sb.append("iso_code_2:");
      if (this.iso_code_2 == null) {
        sb.append("null");
      } else {
        sb.append(this.iso_code_2);
      }
      first = false;
    }
    if (isSetIso_code_3()) {
      if (!first) sb.append(", ");
      sb.append("iso_code_3:");
      if (this.iso_code_3 == null) {
        sb.append("null");
      } else {
        sb.append(this.iso_code_3);
      }
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
    if (isSetIcon_class()) {
      if (!first) sb.append(", ");
      sb.append("icon_class:");
      if (this.icon_class == null) {
        sb.append("null");
      } else {
        sb.append(this.icon_class);
      }
      first = false;
    }
    if (isSetHot_country()) {
      if (!first) sb.append(", ");
      sb.append("hot_country:");
      sb.append(this.hot_country);
      first = false;
    }
    if (isSetContinent_code()) {
      if (!first) sb.append(", ");
      sb.append("continent_code:");
      sb.append(this.continent_code);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DictCountryStandardSchemeFactory implements SchemeFactory {
    public DictCountryStandardScheme getScheme() {
      return new DictCountryStandardScheme();
    }
  }

  private static class DictCountryStandardScheme extends StandardScheme<DictCountry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DictCountry struct) throws TException {
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
          case 3: // ENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ename = iprot.readString();
              struct.setEnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ISO_CODE_2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.iso_code_2 = iprot.readString();
              struct.setIso_code_2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ISO_CODE_3
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.iso_code_3 = iprot.readString();
              struct.setIso_code_3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ICON_CLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.icon_class = iprot.readString();
              struct.setIcon_classIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // HOT_COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.hot_country = iprot.readByte();
              struct.setHot_countryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // CONTINENT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.continent_code = iprot.readI32();
              struct.setContinent_codeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DictCountry struct) throws TException {
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
      if (struct.ename != null) {
        if (struct.isSetEname()) {
          oprot.writeFieldBegin(ENAME_FIELD_DESC);
          oprot.writeString(struct.ename);
          oprot.writeFieldEnd();
        }
      }
      if (struct.iso_code_2 != null) {
        if (struct.isSetIso_code_2()) {
          oprot.writeFieldBegin(ISO_CODE_2_FIELD_DESC);
          oprot.writeString(struct.iso_code_2);
          oprot.writeFieldEnd();
        }
      }
      if (struct.iso_code_3 != null) {
        if (struct.isSetIso_code_3()) {
          oprot.writeFieldBegin(ISO_CODE_3_FIELD_DESC);
          oprot.writeString(struct.iso_code_3);
          oprot.writeFieldEnd();
        }
      }
      if (struct.code != null) {
        if (struct.isSetCode()) {
          oprot.writeFieldBegin(CODE_FIELD_DESC);
          oprot.writeString(struct.code);
          oprot.writeFieldEnd();
        }
      }
      if (struct.icon_class != null) {
        if (struct.isSetIcon_class()) {
          oprot.writeFieldBegin(ICON_CLASS_FIELD_DESC);
          oprot.writeString(struct.icon_class);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetHot_country()) {
        oprot.writeFieldBegin(HOT_COUNTRY_FIELD_DESC);
        oprot.writeByte(struct.hot_country);
        oprot.writeFieldEnd();
      }
      if (struct.isSetContinent_code()) {
        oprot.writeFieldBegin(CONTINENT_CODE_FIELD_DESC);
        oprot.writeI32(struct.continent_code);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DictCountryTupleSchemeFactory implements SchemeFactory {
    public DictCountryTupleScheme getScheme() {
      return new DictCountryTupleScheme();
    }
  }

  private static class DictCountryTupleScheme extends TupleScheme<DictCountry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DictCountry struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetEname()) {
        optionals.set(2);
      }
      if (struct.isSetIso_code_2()) {
        optionals.set(3);
      }
      if (struct.isSetIso_code_3()) {
        optionals.set(4);
      }
      if (struct.isSetCode()) {
        optionals.set(5);
      }
      if (struct.isSetIcon_class()) {
        optionals.set(6);
      }
      if (struct.isSetHot_country()) {
        optionals.set(7);
      }
      if (struct.isSetContinent_code()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetEname()) {
        oprot.writeString(struct.ename);
      }
      if (struct.isSetIso_code_2()) {
        oprot.writeString(struct.iso_code_2);
      }
      if (struct.isSetIso_code_3()) {
        oprot.writeString(struct.iso_code_3);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetIcon_class()) {
        oprot.writeString(struct.icon_class);
      }
      if (struct.isSetHot_country()) {
        oprot.writeByte(struct.hot_country);
      }
      if (struct.isSetContinent_code()) {
        oprot.writeI32(struct.continent_code);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DictCountry struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ename = iprot.readString();
        struct.setEnameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.iso_code_2 = iprot.readString();
        struct.setIso_code_2IsSet(true);
      }
      if (incoming.get(4)) {
        struct.iso_code_3 = iprot.readString();
        struct.setIso_code_3IsSet(true);
      }
      if (incoming.get(5)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.icon_class = iprot.readString();
        struct.setIcon_classIsSet(true);
      }
      if (incoming.get(7)) {
        struct.hot_country = iprot.readByte();
        struct.setHot_countryIsSet(true);
      }
      if (incoming.get(8)) {
        struct.continent_code = iprot.readI32();
        struct.setContinent_codeIsSet(true);
      }
    }
  }

}

