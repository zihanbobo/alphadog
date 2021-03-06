/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.position.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-03-20")
public class JobPositionHrCompanyFeatureDO implements org.apache.thrift.TBase<JobPositionHrCompanyFeatureDO, JobPositionHrCompanyFeatureDO._Fields>, java.io.Serializable, Cloneable, Comparable<JobPositionHrCompanyFeatureDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobPositionHrCompanyFeatureDO");

  private static final org.apache.thrift.protocol.TField PID_FIELD_DESC = new org.apache.thrift.protocol.TField("pid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FID_FIELD_DESC = new org.apache.thrift.protocol.TField("fid", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JobPositionHrCompanyFeatureDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JobPositionHrCompanyFeatureDOTupleSchemeFactory();

  public int pid; // optional
  public int fid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PID((short)1, "pid"),
    FID((short)2, "fid");

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
        case 1: // PID
          return PID;
        case 2: // FID
          return FID;
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
  private static final int __PID_ISSET_ID = 0;
  private static final int __FID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PID,_Fields.FID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PID, new org.apache.thrift.meta_data.FieldMetaData("pid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FID, new org.apache.thrift.meta_data.FieldMetaData("fid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobPositionHrCompanyFeatureDO.class, metaDataMap);
  }

  public JobPositionHrCompanyFeatureDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobPositionHrCompanyFeatureDO(JobPositionHrCompanyFeatureDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pid = other.pid;
    this.fid = other.fid;
  }

  public JobPositionHrCompanyFeatureDO deepCopy() {
    return new JobPositionHrCompanyFeatureDO(this);
  }

  @Override
  public void clear() {
    setPidIsSet(false);
    this.pid = 0;
    setFidIsSet(false);
    this.fid = 0;
  }

  public int getPid() {
    return this.pid;
  }

  public JobPositionHrCompanyFeatureDO setPid(int pid) {
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

  public int getFid() {
    return this.fid;
  }

  public JobPositionHrCompanyFeatureDO setFid(int fid) {
    this.fid = fid;
    setFidIsSet(true);
    return this;
  }

  public void unsetFid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FID_ISSET_ID);
  }

  /** Returns true if field fid is set (has been assigned a value) and false otherwise */
  public boolean isSetFid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FID_ISSET_ID);
  }

  public void setFidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((Integer)value);
      }
      break;

    case FID:
      if (value == null) {
        unsetFid();
      } else {
        setFid((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PID:
      return getPid();

    case FID:
      return getFid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PID:
      return isSetPid();
    case FID:
      return isSetFid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobPositionHrCompanyFeatureDO)
      return this.equals((JobPositionHrCompanyFeatureDO)that);
    return false;
  }

  public boolean equals(JobPositionHrCompanyFeatureDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pid = true && this.isSetPid();
    boolean that_present_pid = true && that.isSetPid();
    if (this_present_pid || that_present_pid) {
      if (!(this_present_pid && that_present_pid))
        return false;
      if (this.pid != that.pid)
        return false;
    }

    boolean this_present_fid = true && this.isSetFid();
    boolean that_present_fid = true && that.isSetFid();
    if (this_present_fid || that_present_fid) {
      if (!(this_present_fid && that_present_fid))
        return false;
      if (this.fid != that.fid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPid()) ? 131071 : 524287);
    if (isSetPid())
      hashCode = hashCode * 8191 + pid;

    hashCode = hashCode * 8191 + ((isSetFid()) ? 131071 : 524287);
    if (isSetFid())
      hashCode = hashCode * 8191 + fid;

    return hashCode;
  }

  @Override
  public int compareTo(JobPositionHrCompanyFeatureDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetFid()).compareTo(other.isSetFid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fid, other.fid);
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
    StringBuilder sb = new StringBuilder("JobPositionHrCompanyFeatureDO(");
    boolean first = true;

    if (isSetPid()) {
      sb.append("pid:");
      sb.append(this.pid);
      first = false;
    }
    if (isSetFid()) {
      if (!first) sb.append(", ");
      sb.append("fid:");
      sb.append(this.fid);
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

  private static class JobPositionHrCompanyFeatureDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobPositionHrCompanyFeatureDOStandardScheme getScheme() {
      return new JobPositionHrCompanyFeatureDOStandardScheme();
    }
  }

  private static class JobPositionHrCompanyFeatureDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<JobPositionHrCompanyFeatureDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobPositionHrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pid = iprot.readI32();
              struct.setPidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fid = iprot.readI32();
              struct.setFidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobPositionHrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPid()) {
        oprot.writeFieldBegin(PID_FIELD_DESC);
        oprot.writeI32(struct.pid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFid()) {
        oprot.writeFieldBegin(FID_FIELD_DESC);
        oprot.writeI32(struct.fid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobPositionHrCompanyFeatureDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobPositionHrCompanyFeatureDOTupleScheme getScheme() {
      return new JobPositionHrCompanyFeatureDOTupleScheme();
    }
  }

  private static class JobPositionHrCompanyFeatureDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<JobPositionHrCompanyFeatureDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobPositionHrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPid()) {
        optionals.set(0);
      }
      if (struct.isSetFid()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPid()) {
        oprot.writeI32(struct.pid);
      }
      if (struct.isSetFid()) {
        oprot.writeI32(struct.fid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobPositionHrCompanyFeatureDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.pid = iprot.readI32();
        struct.setPidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fid = iprot.readI32();
        struct.setFidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

