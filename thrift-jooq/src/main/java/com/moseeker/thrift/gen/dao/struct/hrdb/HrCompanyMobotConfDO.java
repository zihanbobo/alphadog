/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.hrdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-07-31")
public class HrCompanyMobotConfDO implements org.apache.thrift.TBase<HrCompanyMobotConfDO, HrCompanyMobotConfDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrCompanyMobotConfDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrCompanyMobotConfDO");

  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("companyId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MOBOT_HEAD_IMG_FIELD_DESC = new org.apache.thrift.protocol.TField("mobotHeadImg", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MOBOT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("mobotName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MOBOT_WELCOME_FIELD_DESC = new org.apache.thrift.protocol.TField("mobotWelcome", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrCompanyMobotConfDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrCompanyMobotConfDOTupleSchemeFactory();

  public int companyId; // optional
  public String mobotHeadImg; // optional
  public String mobotName; // optional
  public String mobotWelcome; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMPANY_ID((short)1, "companyId"),
    MOBOT_HEAD_IMG((short)2, "mobotHeadImg"),
    MOBOT_NAME((short)3, "mobotName"),
    MOBOT_WELCOME((short)4, "mobotWelcome");

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
        case 1: // COMPANY_ID
          return COMPANY_ID;
        case 2: // MOBOT_HEAD_IMG
          return MOBOT_HEAD_IMG;
        case 3: // MOBOT_NAME
          return MOBOT_NAME;
        case 4: // MOBOT_WELCOME
          return MOBOT_WELCOME;
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
  private static final int __COMPANYID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COMPANY_ID,_Fields.MOBOT_HEAD_IMG,_Fields.MOBOT_NAME,_Fields.MOBOT_WELCOME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("companyId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MOBOT_HEAD_IMG, new org.apache.thrift.meta_data.FieldMetaData("mobotHeadImg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBOT_NAME, new org.apache.thrift.meta_data.FieldMetaData("mobotName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBOT_WELCOME, new org.apache.thrift.meta_data.FieldMetaData("mobotWelcome", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrCompanyMobotConfDO.class, metaDataMap);
  }

  public HrCompanyMobotConfDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrCompanyMobotConfDO(HrCompanyMobotConfDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.companyId = other.companyId;
    if (other.isSetMobotHeadImg()) {
      this.mobotHeadImg = other.mobotHeadImg;
    }
    if (other.isSetMobotName()) {
      this.mobotName = other.mobotName;
    }
    if (other.isSetMobotWelcome()) {
      this.mobotWelcome = other.mobotWelcome;
    }
  }

  public HrCompanyMobotConfDO deepCopy() {
    return new HrCompanyMobotConfDO(this);
  }

  @Override
  public void clear() {
    setCompanyIdIsSet(false);
    this.companyId = 0;
    this.mobotHeadImg = null;
    this.mobotName = null;
    this.mobotWelcome = null;
  }

  public int getCompanyId() {
    return this.companyId;
  }

  public HrCompanyMobotConfDO setCompanyId(int companyId) {
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

  public String getMobotHeadImg() {
    return this.mobotHeadImg;
  }

  public HrCompanyMobotConfDO setMobotHeadImg(String mobotHeadImg) {
    this.mobotHeadImg = mobotHeadImg;
    return this;
  }

  public void unsetMobotHeadImg() {
    this.mobotHeadImg = null;
  }

  /** Returns true if field mobotHeadImg is set (has been assigned a value) and false otherwise */
  public boolean isSetMobotHeadImg() {
    return this.mobotHeadImg != null;
  }

  public void setMobotHeadImgIsSet(boolean value) {
    if (!value) {
      this.mobotHeadImg = null;
    }
  }

  public String getMobotName() {
    return this.mobotName;
  }

  public HrCompanyMobotConfDO setMobotName(String mobotName) {
    this.mobotName = mobotName;
    return this;
  }

  public void unsetMobotName() {
    this.mobotName = null;
  }

  /** Returns true if field mobotName is set (has been assigned a value) and false otherwise */
  public boolean isSetMobotName() {
    return this.mobotName != null;
  }

  public void setMobotNameIsSet(boolean value) {
    if (!value) {
      this.mobotName = null;
    }
  }

  public String getMobotWelcome() {
    return this.mobotWelcome;
  }

  public HrCompanyMobotConfDO setMobotWelcome(String mobotWelcome) {
    this.mobotWelcome = mobotWelcome;
    return this;
  }

  public void unsetMobotWelcome() {
    this.mobotWelcome = null;
  }

  /** Returns true if field mobotWelcome is set (has been assigned a value) and false otherwise */
  public boolean isSetMobotWelcome() {
    return this.mobotWelcome != null;
  }

  public void setMobotWelcomeIsSet(boolean value) {
    if (!value) {
      this.mobotWelcome = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMPANY_ID:
      if (value == null) {
        unsetCompanyId();
      } else {
        setCompanyId((Integer)value);
      }
      break;

    case MOBOT_HEAD_IMG:
      if (value == null) {
        unsetMobotHeadImg();
      } else {
        setMobotHeadImg((String)value);
      }
      break;

    case MOBOT_NAME:
      if (value == null) {
        unsetMobotName();
      } else {
        setMobotName((String)value);
      }
      break;

    case MOBOT_WELCOME:
      if (value == null) {
        unsetMobotWelcome();
      } else {
        setMobotWelcome((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPANY_ID:
      return getCompanyId();

    case MOBOT_HEAD_IMG:
      return getMobotHeadImg();

    case MOBOT_NAME:
      return getMobotName();

    case MOBOT_WELCOME:
      return getMobotWelcome();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMPANY_ID:
      return isSetCompanyId();
    case MOBOT_HEAD_IMG:
      return isSetMobotHeadImg();
    case MOBOT_NAME:
      return isSetMobotName();
    case MOBOT_WELCOME:
      return isSetMobotWelcome();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HrCompanyMobotConfDO)
      return this.equals((HrCompanyMobotConfDO)that);
    return false;
  }

  public boolean equals(HrCompanyMobotConfDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_companyId = true && this.isSetCompanyId();
    boolean that_present_companyId = true && that.isSetCompanyId();
    if (this_present_companyId || that_present_companyId) {
      if (!(this_present_companyId && that_present_companyId))
        return false;
      if (this.companyId != that.companyId)
        return false;
    }

    boolean this_present_mobotHeadImg = true && this.isSetMobotHeadImg();
    boolean that_present_mobotHeadImg = true && that.isSetMobotHeadImg();
    if (this_present_mobotHeadImg || that_present_mobotHeadImg) {
      if (!(this_present_mobotHeadImg && that_present_mobotHeadImg))
        return false;
      if (!this.mobotHeadImg.equals(that.mobotHeadImg))
        return false;
    }

    boolean this_present_mobotName = true && this.isSetMobotName();
    boolean that_present_mobotName = true && that.isSetMobotName();
    if (this_present_mobotName || that_present_mobotName) {
      if (!(this_present_mobotName && that_present_mobotName))
        return false;
      if (!this.mobotName.equals(that.mobotName))
        return false;
    }

    boolean this_present_mobotWelcome = true && this.isSetMobotWelcome();
    boolean that_present_mobotWelcome = true && that.isSetMobotWelcome();
    if (this_present_mobotWelcome || that_present_mobotWelcome) {
      if (!(this_present_mobotWelcome && that_present_mobotWelcome))
        return false;
      if (!this.mobotWelcome.equals(that.mobotWelcome))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCompanyId()) ? 131071 : 524287);
    if (isSetCompanyId())
      hashCode = hashCode * 8191 + companyId;

    hashCode = hashCode * 8191 + ((isSetMobotHeadImg()) ? 131071 : 524287);
    if (isSetMobotHeadImg())
      hashCode = hashCode * 8191 + mobotHeadImg.hashCode();

    hashCode = hashCode * 8191 + ((isSetMobotName()) ? 131071 : 524287);
    if (isSetMobotName())
      hashCode = hashCode * 8191 + mobotName.hashCode();

    hashCode = hashCode * 8191 + ((isSetMobotWelcome()) ? 131071 : 524287);
    if (isSetMobotWelcome())
      hashCode = hashCode * 8191 + mobotWelcome.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HrCompanyMobotConfDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetMobotHeadImg()).compareTo(other.isSetMobotHeadImg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobotHeadImg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobotHeadImg, other.mobotHeadImg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobotName()).compareTo(other.isSetMobotName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobotName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobotName, other.mobotName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobotWelcome()).compareTo(other.isSetMobotWelcome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobotWelcome()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobotWelcome, other.mobotWelcome);
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
    StringBuilder sb = new StringBuilder("HrCompanyMobotConfDO(");
    boolean first = true;

    if (isSetCompanyId()) {
      sb.append("companyId:");
      sb.append(this.companyId);
      first = false;
    }
    if (isSetMobotHeadImg()) {
      if (!first) sb.append(", ");
      sb.append("mobotHeadImg:");
      if (this.mobotHeadImg == null) {
        sb.append("null");
      } else {
        sb.append(this.mobotHeadImg);
      }
      first = false;
    }
    if (isSetMobotName()) {
      if (!first) sb.append(", ");
      sb.append("mobotName:");
      if (this.mobotName == null) {
        sb.append("null");
      } else {
        sb.append(this.mobotName);
      }
      first = false;
    }
    if (isSetMobotWelcome()) {
      if (!first) sb.append(", ");
      sb.append("mobotWelcome:");
      if (this.mobotWelcome == null) {
        sb.append("null");
      } else {
        sb.append(this.mobotWelcome);
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

  private static class HrCompanyMobotConfDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrCompanyMobotConfDOStandardScheme getScheme() {
      return new HrCompanyMobotConfDOStandardScheme();
    }
  }

  private static class HrCompanyMobotConfDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrCompanyMobotConfDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrCompanyMobotConfDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.companyId = iprot.readI32();
              struct.setCompanyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MOBOT_HEAD_IMG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobotHeadImg = iprot.readString();
              struct.setMobotHeadImgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MOBOT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobotName = iprot.readString();
              struct.setMobotNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOBOT_WELCOME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobotWelcome = iprot.readString();
              struct.setMobotWelcomeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrCompanyMobotConfDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCompanyId()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.companyId);
        oprot.writeFieldEnd();
      }
      if (struct.mobotHeadImg != null) {
        if (struct.isSetMobotHeadImg()) {
          oprot.writeFieldBegin(MOBOT_HEAD_IMG_FIELD_DESC);
          oprot.writeString(struct.mobotHeadImg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobotName != null) {
        if (struct.isSetMobotName()) {
          oprot.writeFieldBegin(MOBOT_NAME_FIELD_DESC);
          oprot.writeString(struct.mobotName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobotWelcome != null) {
        if (struct.isSetMobotWelcome()) {
          oprot.writeFieldBegin(MOBOT_WELCOME_FIELD_DESC);
          oprot.writeString(struct.mobotWelcome);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrCompanyMobotConfDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrCompanyMobotConfDOTupleScheme getScheme() {
      return new HrCompanyMobotConfDOTupleScheme();
    }
  }

  private static class HrCompanyMobotConfDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrCompanyMobotConfDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrCompanyMobotConfDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCompanyId()) {
        optionals.set(0);
      }
      if (struct.isSetMobotHeadImg()) {
        optionals.set(1);
      }
      if (struct.isSetMobotName()) {
        optionals.set(2);
      }
      if (struct.isSetMobotWelcome()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCompanyId()) {
        oprot.writeI32(struct.companyId);
      }
      if (struct.isSetMobotHeadImg()) {
        oprot.writeString(struct.mobotHeadImg);
      }
      if (struct.isSetMobotName()) {
        oprot.writeString(struct.mobotName);
      }
      if (struct.isSetMobotWelcome()) {
        oprot.writeString(struct.mobotWelcome);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrCompanyMobotConfDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.companyId = iprot.readI32();
        struct.setCompanyIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mobotHeadImg = iprot.readString();
        struct.setMobotHeadImgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mobotName = iprot.readString();
        struct.setMobotNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mobotWelcome = iprot.readString();
        struct.setMobotWelcomeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

