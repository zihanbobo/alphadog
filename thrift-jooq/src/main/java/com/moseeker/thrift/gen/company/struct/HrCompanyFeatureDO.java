/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.company.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-03-14")
public class HrCompanyFeatureDO implements org.apache.thrift.TBase<HrCompanyFeatureDO, HrCompanyFeatureDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrCompanyFeatureDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrCompanyFeatureDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FEATURE_FIELD_DESC = new org.apache.thrift.protocol.TField("feature", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("create_time", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("update_time", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DISABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("disable", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrCompanyFeatureDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrCompanyFeatureDOTupleSchemeFactory();

  public int id; // optional
  public int company_id; // optional
  public java.lang.String feature; // optional
  public java.lang.String create_time; // optional
  public java.lang.String update_time; // optional
  public int disable; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COMPANY_ID((short)2, "company_id"),
    FEATURE((short)3, "feature"),
    CREATE_TIME((short)4, "create_time"),
    UPDATE_TIME((short)5, "update_time"),
    DISABLE((short)6, "disable");

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
        case 2: // COMPANY_ID
          return COMPANY_ID;
        case 3: // FEATURE
          return FEATURE;
        case 4: // CREATE_TIME
          return CREATE_TIME;
        case 5: // UPDATE_TIME
          return UPDATE_TIME;
        case 6: // DISABLE
          return DISABLE;
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
  private static final int __COMPANY_ID_ISSET_ID = 1;
  private static final int __DISABLE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.COMPANY_ID,_Fields.FEATURE,_Fields.CREATE_TIME,_Fields.UPDATE_TIME,_Fields.DISABLE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FEATURE, new org.apache.thrift.meta_data.FieldMetaData("feature", org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("create_time", org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("update_time", org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISABLE, new org.apache.thrift.meta_data.FieldMetaData("disable", org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrCompanyFeatureDO.class, metaDataMap);
  }

  public HrCompanyFeatureDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrCompanyFeatureDO(HrCompanyFeatureDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.company_id = other.company_id;
    if (other.isSetFeature()) {
      this.feature = other.feature;
    }
    if (other.isSetCreate_time()) {
      this.create_time = other.create_time;
    }
    if (other.isSetUpdate_time()) {
      this.update_time = other.update_time;
    }
    this.disable = other.disable;
  }

  public HrCompanyFeatureDO deepCopy() {
    return new HrCompanyFeatureDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setCompany_idIsSet(false);
    this.company_id = 0;
    this.feature = null;
    this.create_time = null;
    this.update_time = null;
    setDisableIsSet(false);
    this.disable = 0;
  }

  public int getId() {
    return this.id;
  }

  public HrCompanyFeatureDO setId(int id) {
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

  public int getCompany_id() {
    return this.company_id;
  }

  public HrCompanyFeatureDO setCompany_id(int company_id) {
    this.company_id = company_id;
    setCompany_idIsSet(true);
    return this;
  }

  public void unsetCompany_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  /** Returns true if field company_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCompany_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  public void setCompany_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPANY_ID_ISSET_ID, value);
  }

  public java.lang.String getFeature() {
    return this.feature;
  }

  public HrCompanyFeatureDO setFeature(java.lang.String feature) {
    this.feature = feature;
    return this;
  }

  public void unsetFeature() {
    this.feature = null;
  }

  /** Returns true if field feature is set (has been assigned a value) and false otherwise */
  public boolean isSetFeature() {
    return this.feature != null;
  }

  public void setFeatureIsSet(boolean value) {
    if (!value) {
      this.feature = null;
    }
  }

  public java.lang.String getCreate_time() {
    return this.create_time;
  }

  public HrCompanyFeatureDO setCreate_time(java.lang.String create_time) {
    this.create_time = create_time;
    return this;
  }

  public void unsetCreate_time() {
    this.create_time = null;
  }

  /** Returns true if field create_time is set (has been assigned a value) and false otherwise */
  public boolean isSetCreate_time() {
    return this.create_time != null;
  }

  public void setCreate_timeIsSet(boolean value) {
    if (!value) {
      this.create_time = null;
    }
  }

  public java.lang.String getUpdate_time() {
    return this.update_time;
  }

  public HrCompanyFeatureDO setUpdate_time(java.lang.String update_time) {
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

  public int getDisable() {
    return this.disable;
  }

  public HrCompanyFeatureDO setDisable(int disable) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
      case ID:
        if (value == null) {
          unsetId();
        } else {
          setId((java.lang.Integer)value);
        }
        break;

      case COMPANY_ID:
        if (value == null) {
          unsetCompany_id();
        } else {
          setCompany_id((java.lang.Integer)value);
        }
        break;

      case FEATURE:
        if (value == null) {
          unsetFeature();
        } else {
          setFeature((java.lang.String)value);
        }
        break;

      case CREATE_TIME:
        if (value == null) {
          unsetCreate_time();
        } else {
          setCreate_time((java.lang.String)value);
        }
        break;

      case UPDATE_TIME:
        if (value == null) {
          unsetUpdate_time();
        } else {
          setUpdate_time((java.lang.String)value);
        }
        break;

      case DISABLE:
        if (value == null) {
          unsetDisable();
        } else {
          setDisable((java.lang.Integer)value);
        }
        break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
      case ID:
        return getId();

      case COMPANY_ID:
        return getCompany_id();

      case FEATURE:
        return getFeature();

      case CREATE_TIME:
        return getCreate_time();

      case UPDATE_TIME:
        return getUpdate_time();

      case DISABLE:
        return getDisable();

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
      case COMPANY_ID:
        return isSetCompany_id();
      case FEATURE:
        return isSetFeature();
      case CREATE_TIME:
        return isSetCreate_time();
      case UPDATE_TIME:
        return isSetUpdate_time();
      case DISABLE:
        return isSetDisable();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HrCompanyFeatureDO)
      return this.equals((HrCompanyFeatureDO)that);
    return false;
  }

  public boolean equals(HrCompanyFeatureDO that) {
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

    boolean this_present_company_id = true && this.isSetCompany_id();
    boolean that_present_company_id = true && that.isSetCompany_id();
    if (this_present_company_id || that_present_company_id) {
      if (!(this_present_company_id && that_present_company_id))
        return false;
      if (this.company_id != that.company_id)
        return false;
    }

    boolean this_present_feature = true && this.isSetFeature();
    boolean that_present_feature = true && that.isSetFeature();
    if (this_present_feature || that_present_feature) {
      if (!(this_present_feature && that_present_feature))
        return false;
      if (!this.feature.equals(that.feature))
        return false;
    }

    boolean this_present_create_time = true && this.isSetCreate_time();
    boolean that_present_create_time = true && that.isSetCreate_time();
    if (this_present_create_time || that_present_create_time) {
      if (!(this_present_create_time && that_present_create_time))
        return false;
      if (!this.create_time.equals(that.create_time))
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

    boolean this_present_disable = true && this.isSetDisable();
    boolean that_present_disable = true && that.isSetDisable();
    if (this_present_disable || that_present_disable) {
      if (!(this_present_disable && that_present_disable))
        return false;
      if (this.disable != that.disable)
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

    hashCode = hashCode * 8191 + ((isSetCompany_id()) ? 131071 : 524287);
    if (isSetCompany_id())
      hashCode = hashCode * 8191 + company_id;

    hashCode = hashCode * 8191 + ((isSetFeature()) ? 131071 : 524287);
    if (isSetFeature())
      hashCode = hashCode * 8191 + feature.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreate_time()) ? 131071 : 524287);
    if (isSetCreate_time())
      hashCode = hashCode * 8191 + create_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdate_time()) ? 131071 : 524287);
    if (isSetUpdate_time())
      hashCode = hashCode * 8191 + update_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisable()) ? 131071 : 524287);
    if (isSetDisable())
      hashCode = hashCode * 8191 + disable;

    return hashCode;
  }

  @Override
  public int compareTo(HrCompanyFeatureDO other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetCompany_id()).compareTo(other.isSetCompany_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompany_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.company_id, other.company_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFeature()).compareTo(other.isSetFeature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFeature()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.feature, other.feature);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreate_time()).compareTo(other.isSetCreate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.create_time, other.create_time);
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
    lastComparison = java.lang.Boolean.valueOf(isSetDisable()).compareTo(other.isSetDisable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disable, other.disable);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HrCompanyFeatureDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetCompany_id()) {
      if (!first) sb.append(", ");
      sb.append("company_id:");
      sb.append(this.company_id);
      first = false;
    }
    if (isSetFeature()) {
      if (!first) sb.append(", ");
      sb.append("feature:");
      if (this.feature == null) {
        sb.append("null");
      } else {
        sb.append(this.feature);
      }
      first = false;
    }
    if (isSetCreate_time()) {
      if (!first) sb.append(", ");
      sb.append("create_time:");
      if (this.create_time == null) {
        sb.append("null");
      } else {
        sb.append(this.create_time);
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
    if (isSetDisable()) {
      if (!first) sb.append(", ");
      sb.append("disable:");
      sb.append(this.disable);
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

  private static class HrCompanyFeatureDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrCompanyFeatureDOStandardScheme getScheme() {
      return new HrCompanyFeatureDOStandardScheme();
    }
  }

  private static class HrCompanyFeatureDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrCompanyFeatureDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrCompanyFeatureDO struct) throws org.apache.thrift.TException {
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
          case 2: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.company_id = iprot.readI32();
              struct.setCompany_idIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FEATURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.feature = iprot.readString();
              struct.setFeatureIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.create_time = iprot.readString();
              struct.setCreate_timeIsSet(true);
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
          case 6: // DISABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.disable = iprot.readI32();
              struct.setDisableIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompany_id()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.company_id);
        oprot.writeFieldEnd();
      }
      if (struct.feature != null) {
        if (struct.isSetFeature()) {
          oprot.writeFieldBegin(FEATURE_FIELD_DESC);
          oprot.writeString(struct.feature);
          oprot.writeFieldEnd();
        }
      }
      if (struct.create_time != null) {
        if (struct.isSetCreate_time()) {
          oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
          oprot.writeString(struct.create_time);
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
      if (struct.isSetDisable()) {
        oprot.writeFieldBegin(DISABLE_FIELD_DESC);
        oprot.writeI32(struct.disable);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrCompanyFeatureDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrCompanyFeatureDOTupleScheme getScheme() {
      return new HrCompanyFeatureDOTupleScheme();
    }
  }

  private static class HrCompanyFeatureDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrCompanyFeatureDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCompany_id()) {
        optionals.set(1);
      }
      if (struct.isSetFeature()) {
        optionals.set(2);
      }
      if (struct.isSetCreate_time()) {
        optionals.set(3);
      }
      if (struct.isSetUpdate_time()) {
        optionals.set(4);
      }
      if (struct.isSetDisable()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
      if (struct.isSetFeature()) {
        oprot.writeString(struct.feature);
      }
      if (struct.isSetCreate_time()) {
        oprot.writeString(struct.create_time);
      }
      if (struct.isSetUpdate_time()) {
        oprot.writeString(struct.update_time);
      }
      if (struct.isSetDisable()) {
        oprot.writeI32(struct.disable);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.feature = iprot.readString();
        struct.setFeatureIsSet(true);
      }
      if (incoming.get(3)) {
        struct.create_time = iprot.readString();
        struct.setCreate_timeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.update_time = iprot.readString();
        struct.setUpdate_timeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.disable = iprot.readI32();
        struct.setDisableIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
