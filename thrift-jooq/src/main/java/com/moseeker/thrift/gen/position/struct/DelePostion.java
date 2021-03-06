/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.position.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-08")
public class DelePostion implements org.apache.thrift.TBase<DelePostion, DelePostion._Fields>, java.io.Serializable, Cloneable, Comparable<DelePostion> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DelePostion");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField JOBNUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("jobnumber", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("source_id", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DelePostionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DelePostionTupleSchemeFactory();

  public int id; // required
  public int company_id; // required
  public java.lang.String jobnumber; // required
  public int source_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COMPANY_ID((short)2, "company_id"),
    JOBNUMBER((short)3, "jobnumber"),
    SOURCE_ID((short)4, "source_id");

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
        case 3: // JOBNUMBER
          return JOBNUMBER;
        case 4: // SOURCE_ID
          return SOURCE_ID;
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
  private static final int __SOURCE_ID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOBNUMBER, new org.apache.thrift.meta_data.FieldMetaData("jobnumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("source_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DelePostion.class, metaDataMap);
  }

  public DelePostion() {
  }

  public DelePostion(
    int id,
    int company_id,
    java.lang.String jobnumber,
    int source_id)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.company_id = company_id;
    setCompany_idIsSet(true);
    this.jobnumber = jobnumber;
    this.source_id = source_id;
    setSource_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DelePostion(DelePostion other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.company_id = other.company_id;
    if (other.isSetJobnumber()) {
      this.jobnumber = other.jobnumber;
    }
    this.source_id = other.source_id;
  }

  public DelePostion deepCopy() {
    return new DelePostion(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setCompany_idIsSet(false);
    this.company_id = 0;
    this.jobnumber = null;
    setSource_idIsSet(false);
    this.source_id = 0;
  }

  public int getId() {
    return this.id;
  }

  public DelePostion setId(int id) {
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

  public DelePostion setCompany_id(int company_id) {
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

  public java.lang.String getJobnumber() {
    return this.jobnumber;
  }

  public DelePostion setJobnumber(java.lang.String jobnumber) {
    this.jobnumber = jobnumber;
    return this;
  }

  public void unsetJobnumber() {
    this.jobnumber = null;
  }

  /** Returns true if field jobnumber is set (has been assigned a value) and false otherwise */
  public boolean isSetJobnumber() {
    return this.jobnumber != null;
  }

  public void setJobnumberIsSet(boolean value) {
    if (!value) {
      this.jobnumber = null;
    }
  }

  public int getSource_id() {
    return this.source_id;
  }

  public DelePostion setSource_id(int source_id) {
    this.source_id = source_id;
    setSource_idIsSet(true);
    return this;
  }

  public void unsetSource_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SOURCE_ID_ISSET_ID);
  }

  /** Returns true if field source_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSource_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SOURCE_ID_ISSET_ID);
  }

  public void setSource_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SOURCE_ID_ISSET_ID, value);
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

    case JOBNUMBER:
      if (value == null) {
        unsetJobnumber();
      } else {
        setJobnumber((java.lang.String)value);
      }
      break;

    case SOURCE_ID:
      if (value == null) {
        unsetSource_id();
      } else {
        setSource_id((java.lang.Integer)value);
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

    case JOBNUMBER:
      return getJobnumber();

    case SOURCE_ID:
      return getSource_id();

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
    case JOBNUMBER:
      return isSetJobnumber();
    case SOURCE_ID:
      return isSetSource_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DelePostion)
      return this.equals((DelePostion)that);
    return false;
  }

  public boolean equals(DelePostion that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_company_id = true;
    boolean that_present_company_id = true;
    if (this_present_company_id || that_present_company_id) {
      if (!(this_present_company_id && that_present_company_id))
        return false;
      if (this.company_id != that.company_id)
        return false;
    }

    boolean this_present_jobnumber = true && this.isSetJobnumber();
    boolean that_present_jobnumber = true && that.isSetJobnumber();
    if (this_present_jobnumber || that_present_jobnumber) {
      if (!(this_present_jobnumber && that_present_jobnumber))
        return false;
      if (!this.jobnumber.equals(that.jobnumber))
        return false;
    }

    boolean this_present_source_id = true;
    boolean that_present_source_id = true;
    if (this_present_source_id || that_present_source_id) {
      if (!(this_present_source_id && that_present_source_id))
        return false;
      if (this.source_id != that.source_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + company_id;

    hashCode = hashCode * 8191 + ((isSetJobnumber()) ? 131071 : 524287);
    if (isSetJobnumber())
      hashCode = hashCode * 8191 + jobnumber.hashCode();

    hashCode = hashCode * 8191 + source_id;

    return hashCode;
  }

  @Override
  public int compareTo(DelePostion other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetJobnumber()).compareTo(other.isSetJobnumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobnumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobnumber, other.jobnumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSource_id()).compareTo(other.isSetSource_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source_id, other.source_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DelePostion(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("company_id:");
    sb.append(this.company_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobnumber:");
    if (this.jobnumber == null) {
      sb.append("null");
    } else {
      sb.append(this.jobnumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("source_id:");
    sb.append(this.source_id);
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

  private static class DelePostionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DelePostionStandardScheme getScheme() {
      return new DelePostionStandardScheme();
    }
  }

  private static class DelePostionStandardScheme extends org.apache.thrift.scheme.StandardScheme<DelePostion> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DelePostion struct) throws org.apache.thrift.TException {
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
          case 3: // JOBNUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobnumber = iprot.readString();
              struct.setJobnumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.source_id = iprot.readI32();
              struct.setSource_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DelePostion struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
      oprot.writeI32(struct.company_id);
      oprot.writeFieldEnd();
      if (struct.jobnumber != null) {
        oprot.writeFieldBegin(JOBNUMBER_FIELD_DESC);
        oprot.writeString(struct.jobnumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SOURCE_ID_FIELD_DESC);
      oprot.writeI32(struct.source_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DelePostionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DelePostionTupleScheme getScheme() {
      return new DelePostionTupleScheme();
    }
  }

  private static class DelePostionTupleScheme extends org.apache.thrift.scheme.TupleScheme<DelePostion> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DelePostion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCompany_id()) {
        optionals.set(1);
      }
      if (struct.isSetJobnumber()) {
        optionals.set(2);
      }
      if (struct.isSetSource_id()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
      if (struct.isSetJobnumber()) {
        oprot.writeString(struct.jobnumber);
      }
      if (struct.isSetSource_id()) {
        oprot.writeI32(struct.source_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DelePostion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.jobnumber = iprot.readString();
        struct.setJobnumberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.source_id = iprot.readI32();
        struct.setSource_idIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

