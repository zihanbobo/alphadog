/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.referral.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-12-23")
public class ConnectRadarInfo implements org.apache.thrift.TBase<ConnectRadarInfo, ConnectRadarInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ConnectRadarInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConnectRadarInfo");

  private static final org.apache.thrift.protocol.TField CHAIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chainId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RECOM_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recomUserId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NEXT_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nextUserId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentId", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ConnectRadarInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ConnectRadarInfoTupleSchemeFactory();

  public int chainId; // optional
  public int recomUserId; // optional
  public int nextUserId; // optional
  public int parentId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHAIN_ID((short)1, "chainId"),
    RECOM_USER_ID((short)2, "recomUserId"),
    NEXT_USER_ID((short)3, "nextUserId"),
    PARENT_ID((short)4, "parentId");

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
        case 1: // CHAIN_ID
          return CHAIN_ID;
        case 2: // RECOM_USER_ID
          return RECOM_USER_ID;
        case 3: // NEXT_USER_ID
          return NEXT_USER_ID;
        case 4: // PARENT_ID
          return PARENT_ID;
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
  private static final int __CHAINID_ISSET_ID = 0;
  private static final int __RECOMUSERID_ISSET_ID = 1;
  private static final int __NEXTUSERID_ISSET_ID = 2;
  private static final int __PARENTID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CHAIN_ID,_Fields.RECOM_USER_ID,_Fields.NEXT_USER_ID,_Fields.PARENT_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHAIN_ID, new org.apache.thrift.meta_data.FieldMetaData("chainId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECOM_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("recomUserId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NEXT_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("nextUserId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("parentId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConnectRadarInfo.class, metaDataMap);
  }

  public ConnectRadarInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConnectRadarInfo(ConnectRadarInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.chainId = other.chainId;
    this.recomUserId = other.recomUserId;
    this.nextUserId = other.nextUserId;
    this.parentId = other.parentId;
  }

  public ConnectRadarInfo deepCopy() {
    return new ConnectRadarInfo(this);
  }

  @Override
  public void clear() {
    setChainIdIsSet(false);
    this.chainId = 0;
    setRecomUserIdIsSet(false);
    this.recomUserId = 0;
    setNextUserIdIsSet(false);
    this.nextUserId = 0;
    setParentIdIsSet(false);
    this.parentId = 0;
  }

  public int getChainId() {
    return this.chainId;
  }

  public ConnectRadarInfo setChainId(int chainId) {
    this.chainId = chainId;
    setChainIdIsSet(true);
    return this;
  }

  public void unsetChainId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHAINID_ISSET_ID);
  }

  /** Returns true if field chainId is set (has been assigned a value) and false otherwise */
  public boolean isSetChainId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHAINID_ISSET_ID);
  }

  public void setChainIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHAINID_ISSET_ID, value);
  }

  public int getRecomUserId() {
    return this.recomUserId;
  }

  public ConnectRadarInfo setRecomUserId(int recomUserId) {
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

  public int getNextUserId() {
    return this.nextUserId;
  }

  public ConnectRadarInfo setNextUserId(int nextUserId) {
    this.nextUserId = nextUserId;
    setNextUserIdIsSet(true);
    return this;
  }

  public void unsetNextUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NEXTUSERID_ISSET_ID);
  }

  /** Returns true if field nextUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetNextUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NEXTUSERID_ISSET_ID);
  }

  public void setNextUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NEXTUSERID_ISSET_ID, value);
  }

  public int getParentId() {
    return this.parentId;
  }

  public ConnectRadarInfo setParentId(int parentId) {
    this.parentId = parentId;
    setParentIdIsSet(true);
    return this;
  }

  public void unsetParentId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARENTID_ISSET_ID);
  }

  /** Returns true if field parentId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARENTID_ISSET_ID);
  }

  public void setParentIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARENTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHAIN_ID:
      if (value == null) {
        unsetChainId();
      } else {
        setChainId((Integer)value);
      }
      break;

    case RECOM_USER_ID:
      if (value == null) {
        unsetRecomUserId();
      } else {
        setRecomUserId((Integer)value);
      }
      break;

    case NEXT_USER_ID:
      if (value == null) {
        unsetNextUserId();
      } else {
        setNextUserId((Integer)value);
      }
      break;

    case PARENT_ID:
      if (value == null) {
        unsetParentId();
      } else {
        setParentId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHAIN_ID:
      return getChainId();

    case RECOM_USER_ID:
      return getRecomUserId();

    case NEXT_USER_ID:
      return getNextUserId();

    case PARENT_ID:
      return getParentId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHAIN_ID:
      return isSetChainId();
    case RECOM_USER_ID:
      return isSetRecomUserId();
    case NEXT_USER_ID:
      return isSetNextUserId();
    case PARENT_ID:
      return isSetParentId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConnectRadarInfo)
      return this.equals((ConnectRadarInfo)that);
    return false;
  }

  public boolean equals(ConnectRadarInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_chainId = true && this.isSetChainId();
    boolean that_present_chainId = true && that.isSetChainId();
    if (this_present_chainId || that_present_chainId) {
      if (!(this_present_chainId && that_present_chainId))
        return false;
      if (this.chainId != that.chainId)
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

    boolean this_present_nextUserId = true && this.isSetNextUserId();
    boolean that_present_nextUserId = true && that.isSetNextUserId();
    if (this_present_nextUserId || that_present_nextUserId) {
      if (!(this_present_nextUserId && that_present_nextUserId))
        return false;
      if (this.nextUserId != that.nextUserId)
        return false;
    }

    boolean this_present_parentId = true && this.isSetParentId();
    boolean that_present_parentId = true && that.isSetParentId();
    if (this_present_parentId || that_present_parentId) {
      if (!(this_present_parentId && that_present_parentId))
        return false;
      if (this.parentId != that.parentId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetChainId()) ? 131071 : 524287);
    if (isSetChainId())
      hashCode = hashCode * 8191 + chainId;

    hashCode = hashCode * 8191 + ((isSetRecomUserId()) ? 131071 : 524287);
    if (isSetRecomUserId())
      hashCode = hashCode * 8191 + recomUserId;

    hashCode = hashCode * 8191 + ((isSetNextUserId()) ? 131071 : 524287);
    if (isSetNextUserId())
      hashCode = hashCode * 8191 + nextUserId;

    hashCode = hashCode * 8191 + ((isSetParentId()) ? 131071 : 524287);
    if (isSetParentId())
      hashCode = hashCode * 8191 + parentId;

    return hashCode;
  }

  @Override
  public int compareTo(ConnectRadarInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChainId()).compareTo(other.isSetChainId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChainId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chainId, other.chainId);
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
    lastComparison = Boolean.valueOf(isSetNextUserId()).compareTo(other.isSetNextUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nextUserId, other.nextUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParentId()).compareTo(other.isSetParentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentId, other.parentId);
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
    StringBuilder sb = new StringBuilder("ConnectRadarInfo(");
    boolean first = true;

    if (isSetChainId()) {
      sb.append("chainId:");
      sb.append(this.chainId);
      first = false;
    }
    if (isSetRecomUserId()) {
      if (!first) sb.append(", ");
      sb.append("recomUserId:");
      sb.append(this.recomUserId);
      first = false;
    }
    if (isSetNextUserId()) {
      if (!first) sb.append(", ");
      sb.append("nextUserId:");
      sb.append(this.nextUserId);
      first = false;
    }
    if (isSetParentId()) {
      if (!first) sb.append(", ");
      sb.append("parentId:");
      sb.append(this.parentId);
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

  private static class ConnectRadarInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ConnectRadarInfoStandardScheme getScheme() {
      return new ConnectRadarInfoStandardScheme();
    }
  }

  private static class ConnectRadarInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ConnectRadarInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConnectRadarInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHAIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.chainId = iprot.readI32();
              struct.setChainIdIsSet(true);
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
          case 3: // NEXT_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nextUserId = iprot.readI32();
              struct.setNextUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.parentId = iprot.readI32();
              struct.setParentIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConnectRadarInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetChainId()) {
        oprot.writeFieldBegin(CHAIN_ID_FIELD_DESC);
        oprot.writeI32(struct.chainId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecomUserId()) {
        oprot.writeFieldBegin(RECOM_USER_ID_FIELD_DESC);
        oprot.writeI32(struct.recomUserId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNextUserId()) {
        oprot.writeFieldBegin(NEXT_USER_ID_FIELD_DESC);
        oprot.writeI32(struct.nextUserId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetParentId()) {
        oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
        oprot.writeI32(struct.parentId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConnectRadarInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ConnectRadarInfoTupleScheme getScheme() {
      return new ConnectRadarInfoTupleScheme();
    }
  }

  private static class ConnectRadarInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ConnectRadarInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConnectRadarInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChainId()) {
        optionals.set(0);
      }
      if (struct.isSetRecomUserId()) {
        optionals.set(1);
      }
      if (struct.isSetNextUserId()) {
        optionals.set(2);
      }
      if (struct.isSetParentId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetChainId()) {
        oprot.writeI32(struct.chainId);
      }
      if (struct.isSetRecomUserId()) {
        oprot.writeI32(struct.recomUserId);
      }
      if (struct.isSetNextUserId()) {
        oprot.writeI32(struct.nextUserId);
      }
      if (struct.isSetParentId()) {
        oprot.writeI32(struct.parentId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConnectRadarInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.chainId = iprot.readI32();
        struct.setChainIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.recomUserId = iprot.readI32();
        struct.setRecomUserIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nextUserId = iprot.readI32();
        struct.setNextUserIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.parentId = iprot.readI32();
        struct.setParentIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

