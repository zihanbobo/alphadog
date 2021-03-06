/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.dictdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-17")
public class DictCityPostcodeDO implements org.apache.thrift.TBase<DictCityPostcodeDO, DictCityPostcodeDO._Fields>, java.io.Serializable, Cloneable, Comparable<DictCityPostcodeDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DictCityPostcodeDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField POSTCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("postcode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROVINCE_FIELD_DESC = new org.apache.thrift.protocol.TField("province", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DISTRICT_FIELD_DESC = new org.apache.thrift.protocol.TField("district", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DictCityPostcodeDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DictCityPostcodeDOTupleSchemeFactory();

  public int id; // optional
  public java.lang.String postcode; // optional
  public java.lang.String province; // optional
  public java.lang.String city; // optional
  public java.lang.String district; // optional
  public java.lang.String code; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    POSTCODE((short)2, "postcode"),
    PROVINCE((short)3, "province"),
    CITY((short)4, "city"),
    DISTRICT((short)5, "district"),
    CODE((short)6, "code");

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
        case 2: // POSTCODE
          return POSTCODE;
        case 3: // PROVINCE
          return PROVINCE;
        case 4: // CITY
          return CITY;
        case 5: // DISTRICT
          return DISTRICT;
        case 6: // CODE
          return CODE;
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
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.POSTCODE,_Fields.PROVINCE,_Fields.CITY,_Fields.DISTRICT,_Fields.CODE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POSTCODE, new org.apache.thrift.meta_data.FieldMetaData("postcode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROVINCE, new org.apache.thrift.meta_data.FieldMetaData("province", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CITY, new org.apache.thrift.meta_data.FieldMetaData("city", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISTRICT, new org.apache.thrift.meta_data.FieldMetaData("district", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DictCityPostcodeDO.class, metaDataMap);
  }

  public DictCityPostcodeDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DictCityPostcodeDO(DictCityPostcodeDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetPostcode()) {
      this.postcode = other.postcode;
    }
    if (other.isSetProvince()) {
      this.province = other.province;
    }
    if (other.isSetCity()) {
      this.city = other.city;
    }
    if (other.isSetDistrict()) {
      this.district = other.district;
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
  }

  public DictCityPostcodeDO deepCopy() {
    return new DictCityPostcodeDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.postcode = null;
    this.province = null;
    this.city = null;
    this.district = null;
    this.code = null;
  }

  public int getId() {
    return this.id;
  }

  public DictCityPostcodeDO setId(int id) {
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

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public DictCityPostcodeDO setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
    return this;
  }

  public void unsetPostcode() {
    this.postcode = null;
  }

  /** Returns true if field postcode is set (has been assigned a value) and false otherwise */
  public boolean isSetPostcode() {
    return this.postcode != null;
  }

  public void setPostcodeIsSet(boolean value) {
    if (!value) {
      this.postcode = null;
    }
  }

  public java.lang.String getProvince() {
    return this.province;
  }

  public DictCityPostcodeDO setProvince(java.lang.String province) {
    this.province = province;
    return this;
  }

  public void unsetProvince() {
    this.province = null;
  }

  /** Returns true if field province is set (has been assigned a value) and false otherwise */
  public boolean isSetProvince() {
    return this.province != null;
  }

  public void setProvinceIsSet(boolean value) {
    if (!value) {
      this.province = null;
    }
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public DictCityPostcodeDO setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  public void unsetCity() {
    this.city = null;
  }

  /** Returns true if field city is set (has been assigned a value) and false otherwise */
  public boolean isSetCity() {
    return this.city != null;
  }

  public void setCityIsSet(boolean value) {
    if (!value) {
      this.city = null;
    }
  }

  public java.lang.String getDistrict() {
    return this.district;
  }

  public DictCityPostcodeDO setDistrict(java.lang.String district) {
    this.district = district;
    return this;
  }

  public void unsetDistrict() {
    this.district = null;
  }

  /** Returns true if field district is set (has been assigned a value) and false otherwise */
  public boolean isSetDistrict() {
    return this.district != null;
  }

  public void setDistrictIsSet(boolean value) {
    if (!value) {
      this.district = null;
    }
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public DictCityPostcodeDO setCode(java.lang.String code) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case POSTCODE:
      if (value == null) {
        unsetPostcode();
      } else {
        setPostcode((java.lang.String)value);
      }
      break;

    case PROVINCE:
      if (value == null) {
        unsetProvince();
      } else {
        setProvince((java.lang.String)value);
      }
      break;

    case CITY:
      if (value == null) {
        unsetCity();
      } else {
        setCity((java.lang.String)value);
      }
      break;

    case DISTRICT:
      if (value == null) {
        unsetDistrict();
      } else {
        setDistrict((java.lang.String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case POSTCODE:
      return getPostcode();

    case PROVINCE:
      return getProvince();

    case CITY:
      return getCity();

    case DISTRICT:
      return getDistrict();

    case CODE:
      return getCode();

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
    case POSTCODE:
      return isSetPostcode();
    case PROVINCE:
      return isSetProvince();
    case CITY:
      return isSetCity();
    case DISTRICT:
      return isSetDistrict();
    case CODE:
      return isSetCode();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DictCityPostcodeDO)
      return this.equals((DictCityPostcodeDO)that);
    return false;
  }

  public boolean equals(DictCityPostcodeDO that) {
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

    boolean this_present_postcode = true && this.isSetPostcode();
    boolean that_present_postcode = true && that.isSetPostcode();
    if (this_present_postcode || that_present_postcode) {
      if (!(this_present_postcode && that_present_postcode))
        return false;
      if (!this.postcode.equals(that.postcode))
        return false;
    }

    boolean this_present_province = true && this.isSetProvince();
    boolean that_present_province = true && that.isSetProvince();
    if (this_present_province || that_present_province) {
      if (!(this_present_province && that_present_province))
        return false;
      if (!this.province.equals(that.province))
        return false;
    }

    boolean this_present_city = true && this.isSetCity();
    boolean that_present_city = true && that.isSetCity();
    if (this_present_city || that_present_city) {
      if (!(this_present_city && that_present_city))
        return false;
      if (!this.city.equals(that.city))
        return false;
    }

    boolean this_present_district = true && this.isSetDistrict();
    boolean that_present_district = true && that.isSetDistrict();
    if (this_present_district || that_present_district) {
      if (!(this_present_district && that_present_district))
        return false;
      if (!this.district.equals(that.district))
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetPostcode()) ? 131071 : 524287);
    if (isSetPostcode())
      hashCode = hashCode * 8191 + postcode.hashCode();

    hashCode = hashCode * 8191 + ((isSetProvince()) ? 131071 : 524287);
    if (isSetProvince())
      hashCode = hashCode * 8191 + province.hashCode();

    hashCode = hashCode * 8191 + ((isSetCity()) ? 131071 : 524287);
    if (isSetCity())
      hashCode = hashCode * 8191 + city.hashCode();

    hashCode = hashCode * 8191 + ((isSetDistrict()) ? 131071 : 524287);
    if (isSetDistrict())
      hashCode = hashCode * 8191 + district.hashCode();

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode())
      hashCode = hashCode * 8191 + code.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DictCityPostcodeDO other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetPostcode()).compareTo(other.isSetPostcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPostcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.postcode, other.postcode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProvince()).compareTo(other.isSetProvince());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvince()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.province, other.province);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCity()).compareTo(other.isSetCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.city, other.city);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDistrict()).compareTo(other.isSetDistrict());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDistrict()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.district, other.district);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DictCityPostcodeDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetPostcode()) {
      if (!first) sb.append(", ");
      sb.append("postcode:");
      if (this.postcode == null) {
        sb.append("null");
      } else {
        sb.append(this.postcode);
      }
      first = false;
    }
    if (isSetProvince()) {
      if (!first) sb.append(", ");
      sb.append("province:");
      if (this.province == null) {
        sb.append("null");
      } else {
        sb.append(this.province);
      }
      first = false;
    }
    if (isSetCity()) {
      if (!first) sb.append(", ");
      sb.append("city:");
      if (this.city == null) {
        sb.append("null");
      } else {
        sb.append(this.city);
      }
      first = false;
    }
    if (isSetDistrict()) {
      if (!first) sb.append(", ");
      sb.append("district:");
      if (this.district == null) {
        sb.append("null");
      } else {
        sb.append(this.district);
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

  private static class DictCityPostcodeDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DictCityPostcodeDOStandardScheme getScheme() {
      return new DictCityPostcodeDOStandardScheme();
    }
  }

  private static class DictCityPostcodeDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<DictCityPostcodeDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DictCityPostcodeDO struct) throws org.apache.thrift.TException {
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
          case 2: // POSTCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.postcode = iprot.readString();
              struct.setPostcodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROVINCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.province = iprot.readString();
              struct.setProvinceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.city = iprot.readString();
              struct.setCityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DISTRICT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.district = iprot.readString();
              struct.setDistrictIsSet(true);
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DictCityPostcodeDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.postcode != null) {
        if (struct.isSetPostcode()) {
          oprot.writeFieldBegin(POSTCODE_FIELD_DESC);
          oprot.writeString(struct.postcode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.province != null) {
        if (struct.isSetProvince()) {
          oprot.writeFieldBegin(PROVINCE_FIELD_DESC);
          oprot.writeString(struct.province);
          oprot.writeFieldEnd();
        }
      }
      if (struct.city != null) {
        if (struct.isSetCity()) {
          oprot.writeFieldBegin(CITY_FIELD_DESC);
          oprot.writeString(struct.city);
          oprot.writeFieldEnd();
        }
      }
      if (struct.district != null) {
        if (struct.isSetDistrict()) {
          oprot.writeFieldBegin(DISTRICT_FIELD_DESC);
          oprot.writeString(struct.district);
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DictCityPostcodeDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DictCityPostcodeDOTupleScheme getScheme() {
      return new DictCityPostcodeDOTupleScheme();
    }
  }

  private static class DictCityPostcodeDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<DictCityPostcodeDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DictCityPostcodeDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetPostcode()) {
        optionals.set(1);
      }
      if (struct.isSetProvince()) {
        optionals.set(2);
      }
      if (struct.isSetCity()) {
        optionals.set(3);
      }
      if (struct.isSetDistrict()) {
        optionals.set(4);
      }
      if (struct.isSetCode()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetPostcode()) {
        oprot.writeString(struct.postcode);
      }
      if (struct.isSetProvince()) {
        oprot.writeString(struct.province);
      }
      if (struct.isSetCity()) {
        oprot.writeString(struct.city);
      }
      if (struct.isSetDistrict()) {
        oprot.writeString(struct.district);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DictCityPostcodeDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.postcode = iprot.readString();
        struct.setPostcodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.province = iprot.readString();
        struct.setProvinceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.city = iprot.readString();
        struct.setCityIsSet(true);
      }
      if (incoming.get(4)) {
        struct.district = iprot.readString();
        struct.setDistrictIsSet(true);
      }
      if (incoming.get(5)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

