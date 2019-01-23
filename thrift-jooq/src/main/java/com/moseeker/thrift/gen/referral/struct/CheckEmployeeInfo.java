/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.referral.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-22")
public class CheckEmployeeInfo implements org.apache.thrift.TBase<CheckEmployeeInfo, CheckEmployeeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<CheckEmployeeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CheckEmployeeInfo");

  private static final org.apache.thrift.protocol.TField PARENT_CHAIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentChainId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RECOM_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recomUserId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRESENTEE_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("presenteeUserId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PID_FIELD_DESC = new org.apache.thrift.protocol.TField("pid", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("companyId", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CheckEmployeeInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CheckEmployeeInfoTupleSchemeFactory();

  public int parentChainId; // optional
  public int recomUserId; // optional
  public int presenteeUserId; // optional
  public int pid; // optional
  public int companyId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARENT_CHAIN_ID((short)1, "parentChainId"),
    RECOM_USER_ID((short)2, "recomUserId"),
    PRESENTEE_USER_ID((short)3, "presenteeUserId"),
    PID((short)4, "pid"),
    COMPANY_ID((short)5, "companyId");

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
        case 1: // PARENT_CHAIN_ID
          return PARENT_CHAIN_ID;
        case 2: // RECOM_USER_ID
          return RECOM_USER_ID;
        case 3: // PRESENTEE_USER_ID
          return PRESENTEE_USER_ID;
        case 4: // PID
          return PID;
        case 5: // COMPANY_ID
          return COMPANY_ID;
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
  private static final int __PARENTCHAINID_ISSET_ID = 0;
  private static final int __RECOMUSERID_ISSET_ID = 1;
  private static final int __PRESENTEEUSERID_ISSET_ID = 2;
  private static final int __PID_ISSET_ID = 3;
  private static final int __COMPANYID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARENT_CHAIN_ID,_Fields.RECOM_USER_ID,_Fields.PRESENTEE_USER_ID,_Fields.PID,_Fields.COMPANY_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARENT_CHAIN_ID, new org.apache.thrift.meta_data.FieldMetaData("parentChainId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECOM_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("recomUserId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRESENTEE_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("presenteeUserId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PID, new org.apache.thrift.meta_data.FieldMetaData("pid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("companyId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CheckEmployeeInfo.class, metaDataMap);
  }

  public CheckEmployeeInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckEmployeeInfo(CheckEmployeeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.parentChainId = other.parentChainId;
    this.recomUserId = other.recomUserId;
    this.presenteeUserId = other.presenteeUserId;
    this.pid = other.pid;
    this.companyId = other.companyId;
  }

  public CheckEmployeeInfo deepCopy() {
    return new CheckEmployeeInfo(this);
  }

  @Override
  public void clear() {
    setParentChainIdIsSet(false);
    this.parentChainId = 0;
    setRecomUserIdIsSet(false);
    this.recomUserId = 0;
    setPresenteeUserIdIsSet(false);
    this.presenteeUserId = 0;
    setPidIsSet(false);
    this.pid = 0;
    setCompanyIdIsSet(false);
    this.companyId = 0;
  }

  public int getParentChainId() {
    return this.parentChainId;
  }

  public CheckEmployeeInfo setParentChainId(int parentChainId) {
    this.parentChainId = parentChainId;
    setParentChainIdIsSet(true);
    return this;
  }

  public void unsetParentChainId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARENTCHAINID_ISSET_ID);
  }

  /** Returns true if field parentChainId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentChainId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARENTCHAINID_ISSET_ID);
  }

  public void setParentChainIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARENTCHAINID_ISSET_ID, value);
  }

  public int getRecomUserId() {
    return this.recomUserId;
  }

  public CheckEmployeeInfo setRecomUserId(int recomUserId) {
    this.recomUserId = recomUserId;
    setRecomUserIdIsSet(true);
    return this;
  }

  public void unsetRecomUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECOMUSERID_ISSET_ID);
  }

  /** Returns true if field recomUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetRecomUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECOMUSERID_ISSET_ID);
  }

  public void setRecomUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECOMUSERID_ISSET_ID, value);
  }

  public int getPresenteeUserId() {
    return this.presenteeUserId;
  }

  public CheckEmployeeInfo setPresenteeUserId(int presenteeUserId) {
    this.presenteeUserId = presenteeUserId;
    setPresenteeUserIdIsSet(true);
    return this;
  }

  public void unsetPresenteeUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRESENTEEUSERID_ISSET_ID);
  }

  /** Returns true if field presenteeUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetPresenteeUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRESENTEEUSERID_ISSET_ID);
  }

  public void setPresenteeUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRESENTEEUSERID_ISSET_ID, value);
  }

  public int getPid() {
    return this.pid;
  }

  public CheckEmployeeInfo setPid(int pid) {
    this.pid = pid;
    setPidIsSet(true);
    return this;
  }

  public void unsetPid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PID_ISSET_ID);
  }

  /** Returns true if field pid is set (has been assigned a value) and false otherwise */
  public boolean isSetPid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PID_ISSET_ID);
  }

  public void setPidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PID_ISSET_ID, value);
  }

  public int getCompanyId() {
    return this.companyId;
  }

  public CheckEmployeeInfo setCompanyId(int companyId) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARENT_CHAIN_ID:
      if (value == null) {
        unsetParentChainId();
      } else {
        setParentChainId((Integer)value);
      }
      break;

    case RECOM_USER_ID:
      if (value == null) {
        unsetRecomUserId();
      } else {
        setRecomUserId((Integer)value);
      }
      break;

    case PRESENTEE_USER_ID:
      if (value == null) {
        unsetPresenteeUserId();
      } else {
        setPresenteeUserId((Integer)value);
      }
      break;

    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((Integer)value);
      }
      break;

    case COMPANY_ID:
      if (value == null) {
        unsetCompanyId();
      } else {
        setCompanyId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARENT_CHAIN_ID:
      return getParentChainId();

    case RECOM_USER_ID:
      return getRecomUserId();

    case PRESENTEE_USER_ID:
      return getPresenteeUserId();

    case PID:
      return getPid();

    case COMPANY_ID:
      return getCompanyId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARENT_CHAIN_ID:
      return isSetParentChainId();
    case RECOM_USER_ID:
      return isSetRecomUserId();
    case PRESENTEE_USER_ID:
      return isSetPresenteeUserId();
    case PID:
      return isSetPid();
    case COMPANY_ID:
      return isSetCompanyId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CheckEmployeeInfo)
      return this.equals((CheckEmployeeInfo)that);
    return false;
  }

  public boolean equals(CheckEmployeeInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_parentChainId = true && this.isSetParentChainId();
    boolean that_present_parentChainId = true && that.isSetParentChainId();
    if (this_present_parentChainId || that_present_parentChainId) {
      if (!(this_present_parentChainId && that_present_parentChainId))
        return false;
      if (this.parentChainId != that.parentChainId)
        return false;
    }

    boolean this_present_recomUserId = true && this.isSetRecomUserId();
    boolean that_present_recomUserId = true && that.isSetRecomUserId();
    if (this_present_recomUserId || that_present_recomUserId) {
      if (!(this_present_recomUserId && that_present_recomUserId))
        return false;
      if (this.recomUserId != that.recomUserId)
        return false;
    }

    boolean this_present_presenteeUserId = true && this.isSetPresenteeUserId();
    boolean that_present_presenteeUserId = true && that.isSetPresenteeUserId();
    if (this_present_presenteeUserId || that_present_presenteeUserId) {
      if (!(this_present_presenteeUserId && that_present_presenteeUserId))
        return false;
      if (this.presenteeUserId != that.presenteeUserId)
        return false;
    }

    boolean this_present_pid = true && this.isSetPid();
    boolean that_present_pid = true && that.isSetPid();
    if (this_present_pid || that_present_pid) {
      if (!(this_present_pid && that_present_pid))
        return false;
      if (this.pid != that.pid)
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetParentChainId()) ? 131071 : 524287);
    if (isSetParentChainId())
      hashCode = hashCode * 8191 + parentChainId;

    hashCode = hashCode * 8191 + ((isSetRecomUserId()) ? 131071 : 524287);
    if (isSetRecomUserId())
      hashCode = hashCode * 8191 + recomUserId;

    hashCode = hashCode * 8191 + ((isSetPresenteeUserId()) ? 131071 : 524287);
    if (isSetPresenteeUserId())
      hashCode = hashCode * 8191 + presenteeUserId;

    hashCode = hashCode * 8191 + ((isSetPid()) ? 131071 : 524287);
    if (isSetPid())
      hashCode = hashCode * 8191 + pid;

    hashCode = hashCode * 8191 + ((isSetCompanyId()) ? 131071 : 524287);
    if (isSetCompanyId())
      hashCode = hashCode * 8191 + companyId;

    return hashCode;
  }

  @Override
  public int compareTo(CheckEmployeeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetParentChainId()).compareTo(other.isSetParentChainId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentChainId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentChainId, other.parentChainId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecomUserId()).compareTo(other.isSetRecomUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecomUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recomUserId, other.recomUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPresenteeUserId()).compareTo(other.isSetPresenteeUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPresenteeUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.presenteeUserId, other.presenteeUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPid()).compareTo(other.isSetPid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pid, other.pid);
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
    StringBuilder sb = new StringBuilder("CheckEmployeeInfo(");
    boolean first = true;

    if (isSetParentChainId()) {
      sb.append("parentChainId:");
      sb.append(this.parentChainId);
      first = false;
    }
    if (isSetRecomUserId()) {
      if (!first) sb.append(", ");
      sb.append("recomUserId:");
      sb.append(this.recomUserId);
      first = false;
    }
    if (isSetPresenteeUserId()) {
      if (!first) sb.append(", ");
      sb.append("presenteeUserId:");
      sb.append(this.presenteeUserId);
      first = false;
    }
    if (isSetPid()) {
      if (!first) sb.append(", ");
      sb.append("pid:");
      sb.append(this.pid);
      first = false;
    }
    if (isSetCompanyId()) {
      if (!first) sb.append(", ");
      sb.append("companyId:");
      sb.append(this.companyId);
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

  private static class CheckEmployeeInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CheckEmployeeInfoStandardScheme getScheme() {
      return new CheckEmployeeInfoStandardScheme();
    }
  }

  private static class CheckEmployeeInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<CheckEmployeeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CheckEmployeeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARENT_CHAIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.parentChainId = iprot.readI32();
              struct.setParentChainIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECOM_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recomUserId = iprot.readI32();
              struct.setRecomUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRESENTEE_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.presenteeUserId = iprot.readI32();
              struct.setPresenteeUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pid = iprot.readI32();
              struct.setPidIsSet(true);
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CheckEmployeeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetParentChainId()) {
        oprot.writeFieldBegin(PARENT_CHAIN_ID_FIELD_DESC);
        oprot.writeI32(struct.parentChainId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecomUserId()) {
        oprot.writeFieldBegin(RECOM_USER_ID_FIELD_DESC);
        oprot.writeI32(struct.recomUserId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPresenteeUserId()) {
        oprot.writeFieldBegin(PRESENTEE_USER_ID_FIELD_DESC);
        oprot.writeI32(struct.presenteeUserId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPid()) {
        oprot.writeFieldBegin(PID_FIELD_DESC);
        oprot.writeI32(struct.pid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompanyId()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.companyId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckEmployeeInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CheckEmployeeInfoTupleScheme getScheme() {
      return new CheckEmployeeInfoTupleScheme();
    }
  }

  private static class CheckEmployeeInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<CheckEmployeeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CheckEmployeeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetParentChainId()) {
        optionals.set(0);
      }
      if (struct.isSetRecomUserId()) {
        optionals.set(1);
      }
      if (struct.isSetPresenteeUserId()) {
        optionals.set(2);
      }
      if (struct.isSetPid()) {
        optionals.set(3);
      }
      if (struct.isSetCompanyId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetParentChainId()) {
        oprot.writeI32(struct.parentChainId);
      }
      if (struct.isSetRecomUserId()) {
        oprot.writeI32(struct.recomUserId);
      }
      if (struct.isSetPresenteeUserId()) {
        oprot.writeI32(struct.presenteeUserId);
      }
      if (struct.isSetPid()) {
        oprot.writeI32(struct.pid);
      }
      if (struct.isSetCompanyId()) {
        oprot.writeI32(struct.companyId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CheckEmployeeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.parentChainId = iprot.readI32();
        struct.setParentChainIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.recomUserId = iprot.readI32();
        struct.setRecomUserIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.presenteeUserId = iprot.readI32();
        struct.setPresenteeUserIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pid = iprot.readI32();
        struct.setPidIsSet(true);
      }
      if (incoming.get(4)) {
        struct.companyId = iprot.readI32();
        struct.setCompanyIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

