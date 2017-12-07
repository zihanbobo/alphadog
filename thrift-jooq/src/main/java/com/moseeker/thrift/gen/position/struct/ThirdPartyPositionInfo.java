/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.position.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-12-05")
public class ThirdPartyPositionInfo implements org.apache.thrift.TBase<ThirdPartyPositionInfo, ThirdPartyPositionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ThirdPartyPositionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThirdPartyPositionInfo");

  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField THIRD_ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("thirdAccount", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField THIRD_POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("thirdPosition", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField HR_FIELD_DESC = new org.apache.thrift.protocol.TField("hr", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField COMPANY_FIELD_DESC = new org.apache.thrift.protocol.TField("company", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField EXT_THIRD_POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("extThirdPosition", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThirdPartyPositionInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThirdPartyPositionInfoTupleSchemeFactory();

  public com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO position; // optional
  public com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO thirdAccount; // optional
  public com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO thirdPosition; // optional
  public com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO hr; // optional
  public com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO company; // optional
  public java.util.Map<String,String> extThirdPosition; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POSITION((short)1, "position"),
    THIRD_ACCOUNT((short)2, "thirdAccount"),
    THIRD_POSITION((short)3, "thirdPosition"),
    HR((short)4, "hr"),
    COMPANY((short)5, "company"),
    EXT_THIRD_POSITION((short)6, "extThirdPosition");

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
        case 1: // POSITION
          return POSITION;
        case 2: // THIRD_ACCOUNT
          return THIRD_ACCOUNT;
        case 3: // THIRD_POSITION
          return THIRD_POSITION;
        case 4: // HR
          return HR;
        case 5: // COMPANY
          return COMPANY;
        case 6: // EXT_THIRD_POSITION
          return EXT_THIRD_POSITION;
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
  private static final _Fields optionals[] = {_Fields.POSITION,_Fields.THIRD_ACCOUNT,_Fields.THIRD_POSITION,_Fields.HR,_Fields.COMPANY,_Fields.EXT_THIRD_POSITION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("position", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO.class)));
    tmpMap.put(_Fields.THIRD_ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("thirdAccount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO.class)));
    tmpMap.put(_Fields.THIRD_POSITION, new org.apache.thrift.meta_data.FieldMetaData("thirdPosition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO.class)));
    tmpMap.put(_Fields.HR, new org.apache.thrift.meta_data.FieldMetaData("hr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO.class)));
    tmpMap.put(_Fields.COMPANY, new org.apache.thrift.meta_data.FieldMetaData("company", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO.class)));
    tmpMap.put(_Fields.EXT_THIRD_POSITION, new org.apache.thrift.meta_data.FieldMetaData("extThirdPosition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThirdPartyPositionInfo.class, metaDataMap);
  }

  public ThirdPartyPositionInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThirdPartyPositionInfo(ThirdPartyPositionInfo other) {
    if (other.isSetPosition()) {
      this.position = new com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO(other.position);
    }
    if (other.isSetThirdAccount()) {
      this.thirdAccount = new com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO(other.thirdAccount);
    }
    if (other.isSetThirdPosition()) {
      this.thirdPosition = new com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO(other.thirdPosition);
    }
    if (other.isSetHr()) {
      this.hr = new com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO(other.hr);
    }
    if (other.isSetCompany()) {
      this.company = new com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO(other.company);
    }
    if (other.isSetExtThirdPosition()) {
      java.util.Map<String,String> __this__extThirdPosition = new java.util.HashMap<String,String>(other.extThirdPosition);
      this.extThirdPosition = __this__extThirdPosition;
    }
  }

  public ThirdPartyPositionInfo deepCopy() {
    return new ThirdPartyPositionInfo(this);
  }

  @Override
  public void clear() {
    this.position = null;
    this.thirdAccount = null;
    this.thirdPosition = null;
    this.hr = null;
    this.company = null;
    this.extThirdPosition = null;
  }

  public com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO getPosition() {
    return this.position;
  }

  public ThirdPartyPositionInfo setPosition(com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO position) {
    this.position = position;
    return this;
  }

  public void unsetPosition() {
    this.position = null;
  }

  /** Returns true if field position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return this.position != null;
  }

  public void setPositionIsSet(boolean value) {
    if (!value) {
      this.position = null;
    }
  }

  public com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO getThirdAccount() {
    return this.thirdAccount;
  }

  public ThirdPartyPositionInfo setThirdAccount(com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO thirdAccount) {
    this.thirdAccount = thirdAccount;
    return this;
  }

  public void unsetThirdAccount() {
    this.thirdAccount = null;
  }

  /** Returns true if field thirdAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetThirdAccount() {
    return this.thirdAccount != null;
  }

  public void setThirdAccountIsSet(boolean value) {
    if (!value) {
      this.thirdAccount = null;
    }
  }

  public com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO getThirdPosition() {
    return this.thirdPosition;
  }

  public ThirdPartyPositionInfo setThirdPosition(com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO thirdPosition) {
    this.thirdPosition = thirdPosition;
    return this;
  }

  public void unsetThirdPosition() {
    this.thirdPosition = null;
  }

  /** Returns true if field thirdPosition is set (has been assigned a value) and false otherwise */
  public boolean isSetThirdPosition() {
    return this.thirdPosition != null;
  }

  public void setThirdPositionIsSet(boolean value) {
    if (!value) {
      this.thirdPosition = null;
    }
  }

  public com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO getHr() {
    return this.hr;
  }

  public ThirdPartyPositionInfo setHr(com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO hr) {
    this.hr = hr;
    return this;
  }

  public void unsetHr() {
    this.hr = null;
  }

  /** Returns true if field hr is set (has been assigned a value) and false otherwise */
  public boolean isSetHr() {
    return this.hr != null;
  }

  public void setHrIsSet(boolean value) {
    if (!value) {
      this.hr = null;
    }
  }

  public com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO getCompany() {
    return this.company;
  }

  public ThirdPartyPositionInfo setCompany(com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO company) {
    this.company = company;
    return this;
  }

  public void unsetCompany() {
    this.company = null;
  }

  /** Returns true if field company is set (has been assigned a value) and false otherwise */
  public boolean isSetCompany() {
    return this.company != null;
  }

  public void setCompanyIsSet(boolean value) {
    if (!value) {
      this.company = null;
    }
  }

  public int getExtThirdPositionSize() {
    return (this.extThirdPosition == null) ? 0 : this.extThirdPosition.size();
  }

  public void putToExtThirdPosition(String key, String val) {
    if (this.extThirdPosition == null) {
      this.extThirdPosition = new java.util.HashMap<String,String>();
    }
    this.extThirdPosition.put(key, val);
  }

  public java.util.Map<String,String> getExtThirdPosition() {
    return this.extThirdPosition;
  }

  public ThirdPartyPositionInfo setExtThirdPosition(java.util.Map<String,String> extThirdPosition) {
    this.extThirdPosition = extThirdPosition;
    return this;
  }

  public void unsetExtThirdPosition() {
    this.extThirdPosition = null;
  }

  /** Returns true if field extThirdPosition is set (has been assigned a value) and false otherwise */
  public boolean isSetExtThirdPosition() {
    return this.extThirdPosition != null;
  }

  public void setExtThirdPositionIsSet(boolean value) {
    if (!value) {
      this.extThirdPosition = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO)value);
      }
      break;

    case THIRD_ACCOUNT:
      if (value == null) {
        unsetThirdAccount();
      } else {
        setThirdAccount((com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO)value);
      }
      break;

    case THIRD_POSITION:
      if (value == null) {
        unsetThirdPosition();
      } else {
        setThirdPosition((com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO)value);
      }
      break;

    case HR:
      if (value == null) {
        unsetHr();
      } else {
        setHr((com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO)value);
      }
      break;

    case COMPANY:
      if (value == null) {
        unsetCompany();
      } else {
        setCompany((com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO)value);
      }
      break;

    case EXT_THIRD_POSITION:
      if (value == null) {
        unsetExtThirdPosition();
      } else {
        setExtThirdPosition((java.util.Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POSITION:
      return getPosition();

    case THIRD_ACCOUNT:
      return getThirdAccount();

    case THIRD_POSITION:
      return getThirdPosition();

    case HR:
      return getHr();

    case COMPANY:
      return getCompany();

    case EXT_THIRD_POSITION:
      return getExtThirdPosition();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POSITION:
      return isSetPosition();
    case THIRD_ACCOUNT:
      return isSetThirdAccount();
    case THIRD_POSITION:
      return isSetThirdPosition();
    case HR:
      return isSetHr();
    case COMPANY:
      return isSetCompany();
    case EXT_THIRD_POSITION:
      return isSetExtThirdPosition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThirdPartyPositionInfo)
      return this.equals((ThirdPartyPositionInfo)that);
    return false;
  }

  public boolean equals(ThirdPartyPositionInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_position = true && this.isSetPosition();
    boolean that_present_position = true && that.isSetPosition();
    if (this_present_position || that_present_position) {
      if (!(this_present_position && that_present_position))
        return false;
      if (!this.position.equals(that.position))
        return false;
    }

    boolean this_present_thirdAccount = true && this.isSetThirdAccount();
    boolean that_present_thirdAccount = true && that.isSetThirdAccount();
    if (this_present_thirdAccount || that_present_thirdAccount) {
      if (!(this_present_thirdAccount && that_present_thirdAccount))
        return false;
      if (!this.thirdAccount.equals(that.thirdAccount))
        return false;
    }

    boolean this_present_thirdPosition = true && this.isSetThirdPosition();
    boolean that_present_thirdPosition = true && that.isSetThirdPosition();
    if (this_present_thirdPosition || that_present_thirdPosition) {
      if (!(this_present_thirdPosition && that_present_thirdPosition))
        return false;
      if (!this.thirdPosition.equals(that.thirdPosition))
        return false;
    }

    boolean this_present_hr = true && this.isSetHr();
    boolean that_present_hr = true && that.isSetHr();
    if (this_present_hr || that_present_hr) {
      if (!(this_present_hr && that_present_hr))
        return false;
      if (!this.hr.equals(that.hr))
        return false;
    }

    boolean this_present_company = true && this.isSetCompany();
    boolean that_present_company = true && that.isSetCompany();
    if (this_present_company || that_present_company) {
      if (!(this_present_company && that_present_company))
        return false;
      if (!this.company.equals(that.company))
        return false;
    }

    boolean this_present_extThirdPosition = true && this.isSetExtThirdPosition();
    boolean that_present_extThirdPosition = true && that.isSetExtThirdPosition();
    if (this_present_extThirdPosition || that_present_extThirdPosition) {
      if (!(this_present_extThirdPosition && that_present_extThirdPosition))
        return false;
      if (!this.extThirdPosition.equals(that.extThirdPosition))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPosition()) ? 131071 : 524287);
    if (isSetPosition())
      hashCode = hashCode * 8191 + position.hashCode();

    hashCode = hashCode * 8191 + ((isSetThirdAccount()) ? 131071 : 524287);
    if (isSetThirdAccount())
      hashCode = hashCode * 8191 + thirdAccount.hashCode();

    hashCode = hashCode * 8191 + ((isSetThirdPosition()) ? 131071 : 524287);
    if (isSetThirdPosition())
      hashCode = hashCode * 8191 + thirdPosition.hashCode();

    hashCode = hashCode * 8191 + ((isSetHr()) ? 131071 : 524287);
    if (isSetHr())
      hashCode = hashCode * 8191 + hr.hashCode();

    hashCode = hashCode * 8191 + ((isSetCompany()) ? 131071 : 524287);
    if (isSetCompany())
      hashCode = hashCode * 8191 + company.hashCode();

    hashCode = hashCode * 8191 + ((isSetExtThirdPosition()) ? 131071 : 524287);
    if (isSetExtThirdPosition())
      hashCode = hashCode * 8191 + extThirdPosition.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ThirdPartyPositionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPosition()).compareTo(other.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position, other.position);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThirdAccount()).compareTo(other.isSetThirdAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThirdAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.thirdAccount, other.thirdAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThirdPosition()).compareTo(other.isSetThirdPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThirdPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.thirdPosition, other.thirdPosition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHr()).compareTo(other.isSetHr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hr, other.hr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompany()).compareTo(other.isSetCompany());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompany()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.company, other.company);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtThirdPosition()).compareTo(other.isSetExtThirdPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtThirdPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extThirdPosition, other.extThirdPosition);
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
    StringBuilder sb = new StringBuilder("ThirdPartyPositionInfo(");
    boolean first = true;

    if (isSetPosition()) {
      sb.append("position:");
      if (this.position == null) {
        sb.append("null");
      } else {
        sb.append(this.position);
      }
      first = false;
    }
    if (isSetThirdAccount()) {
      if (!first) sb.append(", ");
      sb.append("thirdAccount:");
      if (this.thirdAccount == null) {
        sb.append("null");
      } else {
        sb.append(this.thirdAccount);
      }
      first = false;
    }
    if (isSetThirdPosition()) {
      if (!first) sb.append(", ");
      sb.append("thirdPosition:");
      if (this.thirdPosition == null) {
        sb.append("null");
      } else {
        sb.append(this.thirdPosition);
      }
      first = false;
    }
    if (isSetHr()) {
      if (!first) sb.append(", ");
      sb.append("hr:");
      if (this.hr == null) {
        sb.append("null");
      } else {
        sb.append(this.hr);
      }
      first = false;
    }
    if (isSetCompany()) {
      if (!first) sb.append(", ");
      sb.append("company:");
      if (this.company == null) {
        sb.append("null");
      } else {
        sb.append(this.company);
      }
      first = false;
    }
    if (isSetExtThirdPosition()) {
      if (!first) sb.append(", ");
      sb.append("extThirdPosition:");
      if (this.extThirdPosition == null) {
        sb.append("null");
      } else {
        sb.append(this.extThirdPosition);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (position != null) {
      position.validate();
    }
    if (thirdAccount != null) {
      thirdAccount.validate();
    }
    if (thirdPosition != null) {
      thirdPosition.validate();
    }
    if (hr != null) {
      hr.validate();
    }
    if (company != null) {
      company.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThirdPartyPositionInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThirdPartyPositionInfoStandardScheme getScheme() {
      return new ThirdPartyPositionInfoStandardScheme();
    }
  }

  private static class ThirdPartyPositionInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThirdPartyPositionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThirdPartyPositionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.position = new com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO();
              struct.position.read(iprot);
              struct.setPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THIRD_ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.thirdAccount = new com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO();
              struct.thirdAccount.read(iprot);
              struct.setThirdAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THIRD_POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.thirdPosition = new com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO();
              struct.thirdPosition.read(iprot);
              struct.setThirdPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hr = new com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO();
              struct.hr.read(iprot);
              struct.setHrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMPANY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.company = new com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO();
              struct.company.read(iprot);
              struct.setCompanyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXT_THIRD_POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.extThirdPosition = new java.util.HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.extThirdPosition.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setExtThirdPositionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThirdPartyPositionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.position != null) {
        if (struct.isSetPosition()) {
          oprot.writeFieldBegin(POSITION_FIELD_DESC);
          struct.position.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.thirdAccount != null) {
        if (struct.isSetThirdAccount()) {
          oprot.writeFieldBegin(THIRD_ACCOUNT_FIELD_DESC);
          struct.thirdAccount.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.thirdPosition != null) {
        if (struct.isSetThirdPosition()) {
          oprot.writeFieldBegin(THIRD_POSITION_FIELD_DESC);
          struct.thirdPosition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hr != null) {
        if (struct.isSetHr()) {
          oprot.writeFieldBegin(HR_FIELD_DESC);
          struct.hr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.company != null) {
        if (struct.isSetCompany()) {
          oprot.writeFieldBegin(COMPANY_FIELD_DESC);
          struct.company.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extThirdPosition != null) {
        if (struct.isSetExtThirdPosition()) {
          oprot.writeFieldBegin(EXT_THIRD_POSITION_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extThirdPosition.size()));
            for (java.util.Map.Entry<String, String> _iter4 : struct.extThirdPosition.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThirdPartyPositionInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThirdPartyPositionInfoTupleScheme getScheme() {
      return new ThirdPartyPositionInfoTupleScheme();
    }
  }

  private static class ThirdPartyPositionInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThirdPartyPositionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThirdPartyPositionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPosition()) {
        optionals.set(0);
      }
      if (struct.isSetThirdAccount()) {
        optionals.set(1);
      }
      if (struct.isSetThirdPosition()) {
        optionals.set(2);
      }
      if (struct.isSetHr()) {
        optionals.set(3);
      }
      if (struct.isSetCompany()) {
        optionals.set(4);
      }
      if (struct.isSetExtThirdPosition()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPosition()) {
        struct.position.write(oprot);
      }
      if (struct.isSetThirdAccount()) {
        struct.thirdAccount.write(oprot);
      }
      if (struct.isSetThirdPosition()) {
        struct.thirdPosition.write(oprot);
      }
      if (struct.isSetHr()) {
        struct.hr.write(oprot);
      }
      if (struct.isSetCompany()) {
        struct.company.write(oprot);
      }
      if (struct.isSetExtThirdPosition()) {
        {
          oprot.writeI32(struct.extThirdPosition.size());
          for (java.util.Map.Entry<String, String> _iter5 : struct.extThirdPosition.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThirdPartyPositionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.position = new com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO();
        struct.position.read(iprot);
        struct.setPositionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.thirdAccount = new com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO();
        struct.thirdAccount.read(iprot);
        struct.setThirdAccountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.thirdPosition = new com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO();
        struct.thirdPosition.read(iprot);
        struct.setThirdPositionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.hr = new com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO();
        struct.hr.read(iprot);
        struct.setHrIsSet(true);
      }
      if (incoming.get(4)) {
        struct.company = new com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO();
        struct.company.read(iprot);
        struct.setCompanyIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extThirdPosition = new java.util.HashMap<String,String>(2*_map6.size);
          String _key7;
          String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.extThirdPosition.put(_key7, _val8);
          }
        }
        struct.setExtThirdPositionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

