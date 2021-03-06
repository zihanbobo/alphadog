/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.profile.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-05-05")
public class RequiredFieldInfo implements org.apache.thrift.TBase<RequiredFieldInfo, RequiredFieldInfo._Fields>, java.io.Serializable, Cloneable, Comparable<RequiredFieldInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RequiredFieldInfo");

  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField DEGREE_FIELD_DESC = new org.apache.thrift.protocol.TField("degree", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField COMPANY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("companyName", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RequiredFieldInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RequiredFieldInfoTupleSchemeFactory();

  public boolean gender; // optional
  public boolean email; // optional
  public boolean degree; // optional
  public boolean companyName; // optional
  public boolean position; // optional
  public boolean city; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GENDER((short)1, "gender"),
    EMAIL((short)2, "email"),
    DEGREE((short)3, "degree"),
    COMPANY_NAME((short)4, "companyName"),
    POSITION((short)5, "position"),
    CITY((short)6, "city");

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
        case 1: // GENDER
          return GENDER;
        case 2: // EMAIL
          return EMAIL;
        case 3: // DEGREE
          return DEGREE;
        case 4: // COMPANY_NAME
          return COMPANY_NAME;
        case 5: // POSITION
          return POSITION;
        case 6: // CITY
          return CITY;
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
  private static final int __GENDER_ISSET_ID = 0;
  private static final int __EMAIL_ISSET_ID = 1;
  private static final int __DEGREE_ISSET_ID = 2;
  private static final int __COMPANYNAME_ISSET_ID = 3;
  private static final int __POSITION_ISSET_ID = 4;
  private static final int __CITY_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GENDER,_Fields.EMAIL,_Fields.DEGREE,_Fields.COMPANY_NAME,_Fields.POSITION,_Fields.CITY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DEGREE, new org.apache.thrift.meta_data.FieldMetaData("degree", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COMPANY_NAME, new org.apache.thrift.meta_data.FieldMetaData("companyName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("position", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CITY, new org.apache.thrift.meta_data.FieldMetaData("city", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RequiredFieldInfo.class, metaDataMap);
  }

  public RequiredFieldInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RequiredFieldInfo(RequiredFieldInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.gender = other.gender;
    this.email = other.email;
    this.degree = other.degree;
    this.companyName = other.companyName;
    this.position = other.position;
    this.city = other.city;
  }

  public RequiredFieldInfo deepCopy() {
    return new RequiredFieldInfo(this);
  }

  @Override
  public void clear() {
    setGenderIsSet(false);
    this.gender = false;
    setEmailIsSet(false);
    this.email = false;
    setDegreeIsSet(false);
    this.degree = false;
    setCompanyNameIsSet(false);
    this.companyName = false;
    setPositionIsSet(false);
    this.position = false;
    setCityIsSet(false);
    this.city = false;
  }

  public boolean isGender() {
    return this.gender;
  }

  public RequiredFieldInfo setGender(boolean gender) {
    this.gender = gender;
    setGenderIsSet(true);
    return this;
  }

  public void unsetGender() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GENDER_ISSET_ID);
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GENDER_ISSET_ID);
  }

  public void setGenderIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GENDER_ISSET_ID, value);
  }

  public boolean isEmail() {
    return this.email;
  }

  public RequiredFieldInfo setEmail(boolean email) {
    this.email = email;
    setEmailIsSet(true);
    return this;
  }

  public void unsetEmail() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EMAIL_ISSET_ID);
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EMAIL_ISSET_ID);
  }

  public void setEmailIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EMAIL_ISSET_ID, value);
  }

  public boolean isDegree() {
    return this.degree;
  }

  public RequiredFieldInfo setDegree(boolean degree) {
    this.degree = degree;
    setDegreeIsSet(true);
    return this;
  }

  public void unsetDegree() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DEGREE_ISSET_ID);
  }

  /** Returns true if field degree is set (has been assigned a value) and false otherwise */
  public boolean isSetDegree() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DEGREE_ISSET_ID);
  }

  public void setDegreeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DEGREE_ISSET_ID, value);
  }

  public boolean isCompanyName() {
    return this.companyName;
  }

  public RequiredFieldInfo setCompanyName(boolean companyName) {
    this.companyName = companyName;
    setCompanyNameIsSet(true);
    return this;
  }

  public void unsetCompanyName() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPANYNAME_ISSET_ID);
  }

  /** Returns true if field companyName is set (has been assigned a value) and false otherwise */
  public boolean isSetCompanyName() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPANYNAME_ISSET_ID);
  }

  public void setCompanyNameIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPANYNAME_ISSET_ID, value);
  }

  public boolean isPosition() {
    return this.position;
  }

  public RequiredFieldInfo setPosition(boolean position) {
    this.position = position;
    setPositionIsSet(true);
    return this;
  }

  public void unsetPosition() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POSITION_ISSET_ID);
  }

  /** Returns true if field position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POSITION_ISSET_ID);
  }

  public void setPositionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POSITION_ISSET_ID, value);
  }

  public boolean isCity() {
    return this.city;
  }

  public RequiredFieldInfo setCity(boolean city) {
    this.city = city;
    setCityIsSet(true);
    return this;
  }

  public void unsetCity() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CITY_ISSET_ID);
  }

  /** Returns true if field city is set (has been assigned a value) and false otherwise */
  public boolean isSetCity() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CITY_ISSET_ID);
  }

  public void setCityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((java.lang.Boolean)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((java.lang.Boolean)value);
      }
      break;

    case DEGREE:
      if (value == null) {
        unsetDegree();
      } else {
        setDegree((java.lang.Boolean)value);
      }
      break;

    case COMPANY_NAME:
      if (value == null) {
        unsetCompanyName();
      } else {
        setCompanyName((java.lang.Boolean)value);
      }
      break;

    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((java.lang.Boolean)value);
      }
      break;

    case CITY:
      if (value == null) {
        unsetCity();
      } else {
        setCity((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GENDER:
      return isGender();

    case EMAIL:
      return isEmail();

    case DEGREE:
      return isDegree();

    case COMPANY_NAME:
      return isCompanyName();

    case POSITION:
      return isPosition();

    case CITY:
      return isCity();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case GENDER:
      return isSetGender();
    case EMAIL:
      return isSetEmail();
    case DEGREE:
      return isSetDegree();
    case COMPANY_NAME:
      return isSetCompanyName();
    case POSITION:
      return isSetPosition();
    case CITY:
      return isSetCity();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RequiredFieldInfo)
      return this.equals((RequiredFieldInfo)that);
    return false;
  }

  public boolean equals(RequiredFieldInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (this.gender != that.gender)
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (this.email != that.email)
        return false;
    }

    boolean this_present_degree = true && this.isSetDegree();
    boolean that_present_degree = true && that.isSetDegree();
    if (this_present_degree || that_present_degree) {
      if (!(this_present_degree && that_present_degree))
        return false;
      if (this.degree != that.degree)
        return false;
    }

    boolean this_present_companyName = true && this.isSetCompanyName();
    boolean that_present_companyName = true && that.isSetCompanyName();
    if (this_present_companyName || that_present_companyName) {
      if (!(this_present_companyName && that_present_companyName))
        return false;
      if (this.companyName != that.companyName)
        return false;
    }

    boolean this_present_position = true && this.isSetPosition();
    boolean that_present_position = true && that.isSetPosition();
    if (this_present_position || that_present_position) {
      if (!(this_present_position && that_present_position))
        return false;
      if (this.position != that.position)
        return false;
    }

    boolean this_present_city = true && this.isSetCity();
    boolean that_present_city = true && that.isSetCity();
    if (this_present_city || that_present_city) {
      if (!(this_present_city && that_present_city))
        return false;
      if (this.city != that.city)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetGender()) ? 131071 : 524287);
    if (isSetGender())
      hashCode = hashCode * 8191 + ((gender) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetEmail()) ? 131071 : 524287);
    if (isSetEmail())
      hashCode = hashCode * 8191 + ((email) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetDegree()) ? 131071 : 524287);
    if (isSetDegree())
      hashCode = hashCode * 8191 + ((degree) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCompanyName()) ? 131071 : 524287);
    if (isSetCompanyName())
      hashCode = hashCode * 8191 + ((companyName) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetPosition()) ? 131071 : 524287);
    if (isSetPosition())
      hashCode = hashCode * 8191 + ((position) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCity()) ? 131071 : 524287);
    if (isSetCity())
      hashCode = hashCode * 8191 + ((city) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(RequiredFieldInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetGender()).compareTo(other.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, other.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDegree()).compareTo(other.isSetDegree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDegree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.degree, other.degree);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCompanyName()).compareTo(other.isSetCompanyName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompanyName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.companyName, other.companyName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPosition()).compareTo(other.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position, other.position);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RequiredFieldInfo(");
    boolean first = true;

    if (isSetGender()) {
      sb.append("gender:");
      sb.append(this.gender);
      first = false;
    }
    if (isSetEmail()) {
      if (!first) sb.append(", ");
      sb.append("email:");
      sb.append(this.email);
      first = false;
    }
    if (isSetDegree()) {
      if (!first) sb.append(", ");
      sb.append("degree:");
      sb.append(this.degree);
      first = false;
    }
    if (isSetCompanyName()) {
      if (!first) sb.append(", ");
      sb.append("companyName:");
      sb.append(this.companyName);
      first = false;
    }
    if (isSetPosition()) {
      if (!first) sb.append(", ");
      sb.append("position:");
      sb.append(this.position);
      first = false;
    }
    if (isSetCity()) {
      if (!first) sb.append(", ");
      sb.append("city:");
      sb.append(this.city);
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

  private static class RequiredFieldInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RequiredFieldInfoStandardScheme getScheme() {
      return new RequiredFieldInfoStandardScheme();
    }
  }

  private static class RequiredFieldInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<RequiredFieldInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RequiredFieldInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.gender = iprot.readBool();
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.email = iprot.readBool();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEGREE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.degree = iprot.readBool();
              struct.setDegreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMPANY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.companyName = iprot.readBool();
              struct.setCompanyNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.position = iprot.readBool();
              struct.setPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.city = iprot.readBool();
              struct.setCityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RequiredFieldInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetGender()) {
        oprot.writeFieldBegin(GENDER_FIELD_DESC);
        oprot.writeBool(struct.gender);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEmail()) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeBool(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDegree()) {
        oprot.writeFieldBegin(DEGREE_FIELD_DESC);
        oprot.writeBool(struct.degree);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompanyName()) {
        oprot.writeFieldBegin(COMPANY_NAME_FIELD_DESC);
        oprot.writeBool(struct.companyName);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPosition()) {
        oprot.writeFieldBegin(POSITION_FIELD_DESC);
        oprot.writeBool(struct.position);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCity()) {
        oprot.writeFieldBegin(CITY_FIELD_DESC);
        oprot.writeBool(struct.city);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequiredFieldInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RequiredFieldInfoTupleScheme getScheme() {
      return new RequiredFieldInfoTupleScheme();
    }
  }

  private static class RequiredFieldInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<RequiredFieldInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RequiredFieldInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetGender()) {
        optionals.set(0);
      }
      if (struct.isSetEmail()) {
        optionals.set(1);
      }
      if (struct.isSetDegree()) {
        optionals.set(2);
      }
      if (struct.isSetCompanyName()) {
        optionals.set(3);
      }
      if (struct.isSetPosition()) {
        optionals.set(4);
      }
      if (struct.isSetCity()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetGender()) {
        oprot.writeBool(struct.gender);
      }
      if (struct.isSetEmail()) {
        oprot.writeBool(struct.email);
      }
      if (struct.isSetDegree()) {
        oprot.writeBool(struct.degree);
      }
      if (struct.isSetCompanyName()) {
        oprot.writeBool(struct.companyName);
      }
      if (struct.isSetPosition()) {
        oprot.writeBool(struct.position);
      }
      if (struct.isSetCity()) {
        oprot.writeBool(struct.city);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RequiredFieldInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.gender = iprot.readBool();
        struct.setGenderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.email = iprot.readBool();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(2)) {
        struct.degree = iprot.readBool();
        struct.setDegreeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.companyName = iprot.readBool();
        struct.setCompanyNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.position = iprot.readBool();
        struct.setPositionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.city = iprot.readBool();
        struct.setCityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

