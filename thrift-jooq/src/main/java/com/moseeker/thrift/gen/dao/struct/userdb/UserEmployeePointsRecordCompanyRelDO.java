/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.userdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-28")
public class UserEmployeePointsRecordCompanyRelDO implements org.apache.thrift.TBase<UserEmployeePointsRecordCompanyRelDO, UserEmployeePointsRecordCompanyRelDO._Fields>, java.io.Serializable, Cloneable, Comparable<UserEmployeePointsRecordCompanyRelDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserEmployeePointsRecordCompanyRelDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("companyId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EMPLOYEE_POINTS_RECORD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("employeePointsRecordId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserEmployeePointsRecordCompanyRelDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserEmployeePointsRecordCompanyRelDOTupleSchemeFactory();

  public int id; // optional
  public int companyId; // optional
  public int employeePointsRecordId; // optional
  public String createTime; // optional
  public String updateTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COMPANY_ID((short)2, "companyId"),
    EMPLOYEE_POINTS_RECORD_ID((short)3, "employeePointsRecordId"),
    CREATE_TIME((short)4, "createTime"),
    UPDATE_TIME((short)5, "updateTime");

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
        case 2: // COMPANY_ID
          return COMPANY_ID;
        case 3: // EMPLOYEE_POINTS_RECORD_ID
          return EMPLOYEE_POINTS_RECORD_ID;
        case 4: // CREATE_TIME
          return CREATE_TIME;
        case 5: // UPDATE_TIME
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
  private static final int __COMPANYID_ISSET_ID = 1;
  private static final int __EMPLOYEEPOINTSRECORDID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.COMPANY_ID,_Fields.EMPLOYEE_POINTS_RECORD_ID,_Fields.CREATE_TIME,_Fields.UPDATE_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("companyId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMPLOYEE_POINTS_RECORD_ID, new org.apache.thrift.meta_data.FieldMetaData("employeePointsRecordId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserEmployeePointsRecordCompanyRelDO.class, metaDataMap);
  }

  public UserEmployeePointsRecordCompanyRelDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserEmployeePointsRecordCompanyRelDO(UserEmployeePointsRecordCompanyRelDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.companyId = other.companyId;
    this.employeePointsRecordId = other.employeePointsRecordId;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
    if (other.isSetUpdateTime()) {
      this.updateTime = other.updateTime;
    }
  }

  public UserEmployeePointsRecordCompanyRelDO deepCopy() {
    return new UserEmployeePointsRecordCompanyRelDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setCompanyIdIsSet(false);
    this.companyId = 0;
    setEmployeePointsRecordIdIsSet(false);
    this.employeePointsRecordId = 0;
    this.createTime = null;
    this.updateTime = null;
  }

  public int getId() {
    return this.id;
  }

  public UserEmployeePointsRecordCompanyRelDO setId(int id) {
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

  public int getCompanyId() {
    return this.companyId;
  }

  public UserEmployeePointsRecordCompanyRelDO setCompanyId(int companyId) {
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

  public int getEmployeePointsRecordId() {
    return this.employeePointsRecordId;
  }

  public UserEmployeePointsRecordCompanyRelDO setEmployeePointsRecordId(int employeePointsRecordId) {
    this.employeePointsRecordId = employeePointsRecordId;
    setEmployeePointsRecordIdIsSet(true);
    return this;
  }

  public void unsetEmployeePointsRecordId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EMPLOYEEPOINTSRECORDID_ISSET_ID);
  }

  /** Returns true if field employeePointsRecordId is set (has been assigned a value) and false otherwise */
  public boolean isSetEmployeePointsRecordId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EMPLOYEEPOINTSRECORDID_ISSET_ID);
  }

  public void setEmployeePointsRecordIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EMPLOYEEPOINTSRECORDID_ISSET_ID, value);
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public UserEmployeePointsRecordCompanyRelDO setCreateTime(String createTime) {
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

  public UserEmployeePointsRecordCompanyRelDO setUpdateTime(String updateTime) {
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

    case COMPANY_ID:
      if (value == null) {
        unsetCompanyId();
      } else {
        setCompanyId((Integer)value);
      }
      break;

    case EMPLOYEE_POINTS_RECORD_ID:
      if (value == null) {
        unsetEmployeePointsRecordId();
      } else {
        setEmployeePointsRecordId((Integer)value);
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

    case COMPANY_ID:
      return getCompanyId();

    case EMPLOYEE_POINTS_RECORD_ID:
      return getEmployeePointsRecordId();

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
    case COMPANY_ID:
      return isSetCompanyId();
    case EMPLOYEE_POINTS_RECORD_ID:
      return isSetEmployeePointsRecordId();
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
    if (that instanceof UserEmployeePointsRecordCompanyRelDO)
      return this.equals((UserEmployeePointsRecordCompanyRelDO)that);
    return false;
  }

  public boolean equals(UserEmployeePointsRecordCompanyRelDO that) {
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

    boolean this_present_companyId = true && this.isSetCompanyId();
    boolean that_present_companyId = true && that.isSetCompanyId();
    if (this_present_companyId || that_present_companyId) {
      if (!(this_present_companyId && that_present_companyId))
        return false;
      if (this.companyId != that.companyId)
        return false;
    }

    boolean this_present_employeePointsRecordId = true && this.isSetEmployeePointsRecordId();
    boolean that_present_employeePointsRecordId = true && that.isSetEmployeePointsRecordId();
    if (this_present_employeePointsRecordId || that_present_employeePointsRecordId) {
      if (!(this_present_employeePointsRecordId && that_present_employeePointsRecordId))
        return false;
      if (this.employeePointsRecordId != that.employeePointsRecordId)
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

    hashCode = hashCode * 8191 + ((isSetCompanyId()) ? 131071 : 524287);
    if (isSetCompanyId())
      hashCode = hashCode * 8191 + companyId;

    hashCode = hashCode * 8191 + ((isSetEmployeePointsRecordId()) ? 131071 : 524287);
    if (isSetEmployeePointsRecordId())
      hashCode = hashCode * 8191 + employeePointsRecordId;

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
    if (isSetUpdateTime())
      hashCode = hashCode * 8191 + updateTime.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserEmployeePointsRecordCompanyRelDO other) {
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
    lastComparison = Boolean.valueOf(isSetCompanyId()).compareTo(other.isSetCompanyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompanyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.companyId, other.companyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmployeePointsRecordId()).compareTo(other.isSetEmployeePointsRecordId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmployeePointsRecordId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.employeePointsRecordId, other.employeePointsRecordId);
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
    StringBuilder sb = new StringBuilder("UserEmployeePointsRecordCompanyRelDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetCompanyId()) {
      if (!first) sb.append(", ");
      sb.append("companyId:");
      sb.append(this.companyId);
      first = false;
    }
    if (isSetEmployeePointsRecordId()) {
      if (!first) sb.append(", ");
      sb.append("employeePointsRecordId:");
      sb.append(this.employeePointsRecordId);
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

  private static class UserEmployeePointsRecordCompanyRelDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserEmployeePointsRecordCompanyRelDOStandardScheme getScheme() {
      return new UserEmployeePointsRecordCompanyRelDOStandardScheme();
    }
  }

  private static class UserEmployeePointsRecordCompanyRelDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserEmployeePointsRecordCompanyRelDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserEmployeePointsRecordCompanyRelDO struct) throws org.apache.thrift.TException {
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
              struct.companyId = iprot.readI32();
              struct.setCompanyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EMPLOYEE_POINTS_RECORD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.employeePointsRecordId = iprot.readI32();
              struct.setEmployeePointsRecordIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserEmployeePointsRecordCompanyRelDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompanyId()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.companyId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEmployeePointsRecordId()) {
        oprot.writeFieldBegin(EMPLOYEE_POINTS_RECORD_ID_FIELD_DESC);
        oprot.writeI32(struct.employeePointsRecordId);
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

  private static class UserEmployeePointsRecordCompanyRelDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserEmployeePointsRecordCompanyRelDOTupleScheme getScheme() {
      return new UserEmployeePointsRecordCompanyRelDOTupleScheme();
    }
  }

  private static class UserEmployeePointsRecordCompanyRelDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserEmployeePointsRecordCompanyRelDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserEmployeePointsRecordCompanyRelDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCompanyId()) {
        optionals.set(1);
      }
      if (struct.isSetEmployeePointsRecordId()) {
        optionals.set(2);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(3);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCompanyId()) {
        oprot.writeI32(struct.companyId);
      }
      if (struct.isSetEmployeePointsRecordId()) {
        oprot.writeI32(struct.employeePointsRecordId);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeString(struct.updateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserEmployeePointsRecordCompanyRelDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.companyId = iprot.readI32();
        struct.setCompanyIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.employeePointsRecordId = iprot.readI32();
        struct.setEmployeePointsRecordIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.updateTime = iprot.readString();
        struct.setUpdateTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

