/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-02")
public class HrNpsRecommendDO implements org.apache.thrift.TBase<HrNpsRecommendDO, HrNpsRecommendDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrNpsRecommendDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrNpsRecommendDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HR_NPS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("hr_nps_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField COMPANY_FIELD_DESC = new org.apache.thrift.protocol.TField("company", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("create_time", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrNpsRecommendDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrNpsRecommendDOTupleSchemeFactory();

  public int id; // optional
  public int hr_nps_id; // optional
  public String username; // optional
  public String mobile; // optional
  public String company; // optional
  public String create_time; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    HR_NPS_ID((short)2, "hr_nps_id"),
    USERNAME((short)3, "username"),
    MOBILE((short)4, "mobile"),
    COMPANY((short)5, "company"),
    CREATE_TIME((short)6, "create_time");

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
        case 2: // HR_NPS_ID
          return HR_NPS_ID;
        case 3: // USERNAME
          return USERNAME;
        case 4: // MOBILE
          return MOBILE;
        case 5: // COMPANY
          return COMPANY;
        case 6: // CREATE_TIME
          return CREATE_TIME;
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
  private static final int __HR_NPS_ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.HR_NPS_ID,_Fields.USERNAME,_Fields.MOBILE,_Fields.COMPANY,_Fields.CREATE_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HR_NPS_ID, new org.apache.thrift.meta_data.FieldMetaData("hr_nps_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPANY, new org.apache.thrift.meta_data.FieldMetaData("company", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("create_time", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrNpsRecommendDO.class, metaDataMap);
  }

  public HrNpsRecommendDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrNpsRecommendDO(HrNpsRecommendDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.hr_nps_id = other.hr_nps_id;
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    if (other.isSetCompany()) {
      this.company = other.company;
    }
    if (other.isSetCreate_time()) {
      this.create_time = other.create_time;
    }
  }

  public HrNpsRecommendDO deepCopy() {
    return new HrNpsRecommendDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setHr_nps_idIsSet(false);
    this.hr_nps_id = 0;
    this.username = null;
    this.mobile = null;
    this.company = null;
    this.create_time = null;
  }

  public int getId() {
    return this.id;
  }

  public HrNpsRecommendDO setId(int id) {
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

  public int getHr_nps_id() {
    return this.hr_nps_id;
  }

  public HrNpsRecommendDO setHr_nps_id(int hr_nps_id) {
    this.hr_nps_id = hr_nps_id;
    setHr_nps_idIsSet(true);
    return this;
  }

  public void unsetHr_nps_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HR_NPS_ID_ISSET_ID);
  }

  /** Returns true if field hr_nps_id is set (has been assigned a value) and false otherwise */
  public boolean isSetHr_nps_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HR_NPS_ID_ISSET_ID);
  }

  public void setHr_nps_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HR_NPS_ID_ISSET_ID, value);
  }

  public String getUsername() {
    return this.username;
  }

  public HrNpsRecommendDO setUsername(String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getMobile() {
    return this.mobile;
  }

  public HrNpsRecommendDO setMobile(String mobile) {
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

  public String getCompany() {
    return this.company;
  }

  public HrNpsRecommendDO setCompany(String company) {
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

  public String getCreate_time() {
    return this.create_time;
  }

  public HrNpsRecommendDO setCreate_time(String create_time) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case HR_NPS_ID:
      if (value == null) {
        unsetHr_nps_id();
      } else {
        setHr_nps_id((Integer)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((String)value);
      }
      break;

    case COMPANY:
      if (value == null) {
        unsetCompany();
      } else {
        setCompany((String)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreate_time();
      } else {
        setCreate_time((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case HR_NPS_ID:
      return getHr_nps_id();

    case USERNAME:
      return getUsername();

    case MOBILE:
      return getMobile();

    case COMPANY:
      return getCompany();

    case CREATE_TIME:
      return getCreate_time();

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
    case HR_NPS_ID:
      return isSetHr_nps_id();
    case USERNAME:
      return isSetUsername();
    case MOBILE:
      return isSetMobile();
    case COMPANY:
      return isSetCompany();
    case CREATE_TIME:
      return isSetCreate_time();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HrNpsRecommendDO)
      return this.equals((HrNpsRecommendDO)that);
    return false;
  }

  public boolean equals(HrNpsRecommendDO that) {
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

    boolean this_present_hr_nps_id = true && this.isSetHr_nps_id();
    boolean that_present_hr_nps_id = true && that.isSetHr_nps_id();
    if (this_present_hr_nps_id || that_present_hr_nps_id) {
      if (!(this_present_hr_nps_id && that_present_hr_nps_id))
        return false;
      if (this.hr_nps_id != that.hr_nps_id)
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
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

    boolean this_present_company = true && this.isSetCompany();
    boolean that_present_company = true && that.isSetCompany();
    if (this_present_company || that_present_company) {
      if (!(this_present_company && that_present_company))
        return false;
      if (!this.company.equals(that.company))
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetHr_nps_id()) ? 131071 : 524287);
    if (isSetHr_nps_id())
      hashCode = hashCode * 8191 + hr_nps_id;

    hashCode = hashCode * 8191 + ((isSetUsername()) ? 131071 : 524287);
    if (isSetUsername())
      hashCode = hashCode * 8191 + username.hashCode();

    hashCode = hashCode * 8191 + ((isSetMobile()) ? 131071 : 524287);
    if (isSetMobile())
      hashCode = hashCode * 8191 + mobile.hashCode();

    hashCode = hashCode * 8191 + ((isSetCompany()) ? 131071 : 524287);
    if (isSetCompany())
      hashCode = hashCode * 8191 + company.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreate_time()) ? 131071 : 524287);
    if (isSetCreate_time())
      hashCode = hashCode * 8191 + create_time.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HrNpsRecommendDO other) {
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
    lastComparison = Boolean.valueOf(isSetHr_nps_id()).compareTo(other.isSetHr_nps_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHr_nps_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hr_nps_id, other.hr_nps_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
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
    lastComparison = Boolean.valueOf(isSetCreate_time()).compareTo(other.isSetCreate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.create_time, other.create_time);
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
    StringBuilder sb = new StringBuilder("HrNpsRecommendDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetHr_nps_id()) {
      if (!first) sb.append(", ");
      sb.append("hr_nps_id:");
      sb.append(this.hr_nps_id);
      first = false;
    }
    if (isSetUsername()) {
      if (!first) sb.append(", ");
      sb.append("username:");
      if (this.username == null) {
        sb.append("null");
      } else {
        sb.append(this.username);
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

  private static class HrNpsRecommendDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrNpsRecommendDOStandardScheme getScheme() {
      return new HrNpsRecommendDOStandardScheme();
    }
  }

  private static class HrNpsRecommendDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrNpsRecommendDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrNpsRecommendDO struct) throws org.apache.thrift.TException {
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
          case 2: // HR_NPS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hr_nps_id = iprot.readI32();
              struct.setHr_nps_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMPANY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.company = iprot.readString();
              struct.setCompanyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.create_time = iprot.readString();
              struct.setCreate_timeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrNpsRecommendDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHr_nps_id()) {
        oprot.writeFieldBegin(HR_NPS_ID_FIELD_DESC);
        oprot.writeI32(struct.hr_nps_id);
        oprot.writeFieldEnd();
      }
      if (struct.username != null) {
        if (struct.isSetUsername()) {
          oprot.writeFieldBegin(USERNAME_FIELD_DESC);
          oprot.writeString(struct.username);
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
      if (struct.company != null) {
        if (struct.isSetCompany()) {
          oprot.writeFieldBegin(COMPANY_FIELD_DESC);
          oprot.writeString(struct.company);
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrNpsRecommendDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrNpsRecommendDOTupleScheme getScheme() {
      return new HrNpsRecommendDOTupleScheme();
    }
  }

  private static class HrNpsRecommendDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrNpsRecommendDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrNpsRecommendDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetHr_nps_id()) {
        optionals.set(1);
      }
      if (struct.isSetUsername()) {
        optionals.set(2);
      }
      if (struct.isSetMobile()) {
        optionals.set(3);
      }
      if (struct.isSetCompany()) {
        optionals.set(4);
      }
      if (struct.isSetCreate_time()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetHr_nps_id()) {
        oprot.writeI32(struct.hr_nps_id);
      }
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetCompany()) {
        oprot.writeString(struct.company);
      }
      if (struct.isSetCreate_time()) {
        oprot.writeString(struct.create_time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrNpsRecommendDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hr_nps_id = iprot.readI32();
        struct.setHr_nps_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(4)) {
        struct.company = iprot.readString();
        struct.setCompanyIsSet(true);
      }
      if (incoming.get(5)) {
        struct.create_time = iprot.readString();
        struct.setCreate_timeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
