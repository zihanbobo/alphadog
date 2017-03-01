/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-01")
public class RecommendationScoreVO implements org.apache.thrift.TBase<RecommendationScoreVO, RecommendationScoreVO._Fields>, java.io.Serializable, Cloneable, Comparable<RecommendationScoreVO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RecommendationScoreVO");

  private static final org.apache.thrift.protocol.TField LINK_VIEWED_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("link_viewed_count", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INTERESTED_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("interested_count", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField APPLIED_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("applied_count", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RecommendationScoreVOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RecommendationScoreVOTupleSchemeFactory();

  public int link_viewed_count; // required
  public int interested_count; // required
  public int applied_count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LINK_VIEWED_COUNT((short)1, "link_viewed_count"),
    INTERESTED_COUNT((short)2, "interested_count"),
    APPLIED_COUNT((short)3, "applied_count");

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
        case 1: // LINK_VIEWED_COUNT
          return LINK_VIEWED_COUNT;
        case 2: // INTERESTED_COUNT
          return INTERESTED_COUNT;
        case 3: // APPLIED_COUNT
          return APPLIED_COUNT;
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
  private static final int __LINK_VIEWED_COUNT_ISSET_ID = 0;
  private static final int __INTERESTED_COUNT_ISSET_ID = 1;
  private static final int __APPLIED_COUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LINK_VIEWED_COUNT, new org.apache.thrift.meta_data.FieldMetaData("link_viewed_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INTERESTED_COUNT, new org.apache.thrift.meta_data.FieldMetaData("interested_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APPLIED_COUNT, new org.apache.thrift.meta_data.FieldMetaData("applied_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RecommendationScoreVO.class, metaDataMap);
  }

  public RecommendationScoreVO() {
  }

  public RecommendationScoreVO(
    int link_viewed_count,
    int interested_count,
    int applied_count)
  {
    this();
    this.link_viewed_count = link_viewed_count;
    setLink_viewed_countIsSet(true);
    this.interested_count = interested_count;
    setInterested_countIsSet(true);
    this.applied_count = applied_count;
    setApplied_countIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecommendationScoreVO(RecommendationScoreVO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.link_viewed_count = other.link_viewed_count;
    this.interested_count = other.interested_count;
    this.applied_count = other.applied_count;
  }

  public RecommendationScoreVO deepCopy() {
    return new RecommendationScoreVO(this);
  }

  @Override
  public void clear() {
    setLink_viewed_countIsSet(false);
    this.link_viewed_count = 0;
    setInterested_countIsSet(false);
    this.interested_count = 0;
    setApplied_countIsSet(false);
    this.applied_count = 0;
  }

  public int getLink_viewed_count() {
    return this.link_viewed_count;
  }

  public RecommendationScoreVO setLink_viewed_count(int link_viewed_count) {
    this.link_viewed_count = link_viewed_count;
    setLink_viewed_countIsSet(true);
    return this;
  }

  public void unsetLink_viewed_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LINK_VIEWED_COUNT_ISSET_ID);
  }

  /** Returns true if field link_viewed_count is set (has been assigned a value) and false otherwise */
  public boolean isSetLink_viewed_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LINK_VIEWED_COUNT_ISSET_ID);
  }

  public void setLink_viewed_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LINK_VIEWED_COUNT_ISSET_ID, value);
  }

  public int getInterested_count() {
    return this.interested_count;
  }

  public RecommendationScoreVO setInterested_count(int interested_count) {
    this.interested_count = interested_count;
    setInterested_countIsSet(true);
    return this;
  }

  public void unsetInterested_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTERESTED_COUNT_ISSET_ID);
  }

  /** Returns true if field interested_count is set (has been assigned a value) and false otherwise */
  public boolean isSetInterested_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTERESTED_COUNT_ISSET_ID);
  }

  public void setInterested_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTERESTED_COUNT_ISSET_ID, value);
  }

  public int getApplied_count() {
    return this.applied_count;
  }

  public RecommendationScoreVO setApplied_count(int applied_count) {
    this.applied_count = applied_count;
    setApplied_countIsSet(true);
    return this;
  }

  public void unsetApplied_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPLIED_COUNT_ISSET_ID);
  }

  /** Returns true if field applied_count is set (has been assigned a value) and false otherwise */
  public boolean isSetApplied_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPLIED_COUNT_ISSET_ID);
  }

  public void setApplied_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPLIED_COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LINK_VIEWED_COUNT:
      if (value == null) {
        unsetLink_viewed_count();
      } else {
        setLink_viewed_count((java.lang.Integer)value);
      }
      break;

    case INTERESTED_COUNT:
      if (value == null) {
        unsetInterested_count();
      } else {
        setInterested_count((java.lang.Integer)value);
      }
      break;

    case APPLIED_COUNT:
      if (value == null) {
        unsetApplied_count();
      } else {
        setApplied_count((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LINK_VIEWED_COUNT:
      return getLink_viewed_count();

    case INTERESTED_COUNT:
      return getInterested_count();

    case APPLIED_COUNT:
      return getApplied_count();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LINK_VIEWED_COUNT:
      return isSetLink_viewed_count();
    case INTERESTED_COUNT:
      return isSetInterested_count();
    case APPLIED_COUNT:
      return isSetApplied_count();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RecommendationScoreVO)
      return this.equals((RecommendationScoreVO)that);
    return false;
  }

  public boolean equals(RecommendationScoreVO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_link_viewed_count = true;
    boolean that_present_link_viewed_count = true;
    if (this_present_link_viewed_count || that_present_link_viewed_count) {
      if (!(this_present_link_viewed_count && that_present_link_viewed_count))
        return false;
      if (this.link_viewed_count != that.link_viewed_count)
        return false;
    }

    boolean this_present_interested_count = true;
    boolean that_present_interested_count = true;
    if (this_present_interested_count || that_present_interested_count) {
      if (!(this_present_interested_count && that_present_interested_count))
        return false;
      if (this.interested_count != that.interested_count)
        return false;
    }

    boolean this_present_applied_count = true;
    boolean that_present_applied_count = true;
    if (this_present_applied_count || that_present_applied_count) {
      if (!(this_present_applied_count && that_present_applied_count))
        return false;
      if (this.applied_count != that.applied_count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + link_viewed_count;

    hashCode = hashCode * 8191 + interested_count;

    hashCode = hashCode * 8191 + applied_count;

    return hashCode;
  }

  @Override
  public int compareTo(RecommendationScoreVO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLink_viewed_count()).compareTo(other.isSetLink_viewed_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLink_viewed_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.link_viewed_count, other.link_viewed_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInterested_count()).compareTo(other.isSetInterested_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterested_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interested_count, other.interested_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApplied_count()).compareTo(other.isSetApplied_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplied_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applied_count, other.applied_count);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendationScoreVO(");
    boolean first = true;

    sb.append("link_viewed_count:");
    sb.append(this.link_viewed_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("interested_count:");
    sb.append(this.interested_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("applied_count:");
    sb.append(this.applied_count);
    first = false;
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

  private static class RecommendationScoreVOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RecommendationScoreVOStandardScheme getScheme() {
      return new RecommendationScoreVOStandardScheme();
    }
  }

  private static class RecommendationScoreVOStandardScheme extends org.apache.thrift.scheme.StandardScheme<RecommendationScoreVO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RecommendationScoreVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LINK_VIEWED_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.link_viewed_count = iprot.readI32();
              struct.setLink_viewed_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INTERESTED_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.interested_count = iprot.readI32();
              struct.setInterested_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLIED_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.applied_count = iprot.readI32();
              struct.setApplied_countIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RecommendationScoreVO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LINK_VIEWED_COUNT_FIELD_DESC);
      oprot.writeI32(struct.link_viewed_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INTERESTED_COUNT_FIELD_DESC);
      oprot.writeI32(struct.interested_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPLIED_COUNT_FIELD_DESC);
      oprot.writeI32(struct.applied_count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RecommendationScoreVOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RecommendationScoreVOTupleScheme getScheme() {
      return new RecommendationScoreVOTupleScheme();
    }
  }

  private static class RecommendationScoreVOTupleScheme extends org.apache.thrift.scheme.TupleScheme<RecommendationScoreVO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RecommendationScoreVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLink_viewed_count()) {
        optionals.set(0);
      }
      if (struct.isSetInterested_count()) {
        optionals.set(1);
      }
      if (struct.isSetApplied_count()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLink_viewed_count()) {
        oprot.writeI32(struct.link_viewed_count);
      }
      if (struct.isSetInterested_count()) {
        oprot.writeI32(struct.interested_count);
      }
      if (struct.isSetApplied_count()) {
        oprot.writeI32(struct.applied_count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RecommendationScoreVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.link_viewed_count = iprot.readI32();
        struct.setLink_viewed_countIsSet(true);
      }
      if (incoming.get(1)) {
        struct.interested_count = iprot.readI32();
        struct.setInterested_countIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applied_count = iprot.readI32();
        struct.setApplied_countIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

