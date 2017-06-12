/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.jobdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-04")
public class JobPositionExtDO implements org.apache.thrift.TBase<JobPositionExtDO, JobPositionExtDO._Fields>, java.io.Serializable, Cloneable, Comparable<JobPositionExtDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobPositionExtDO");

  private static final org.apache.thrift.protocol.TField PID_FIELD_DESC = new org.apache.thrift.protocol.TField("pid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_CUSTOM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobCustomId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField JOB_OCCUPATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobOccupationId", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField EXTRA_FIELD_DESC = new org.apache.thrift.protocol.TField("extra", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JobPositionExtDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JobPositionExtDOTupleSchemeFactory();

  public int pid; // optional
  public int jobCustomId; // optional
  public String createTime; // optional
  public String updateTime; // optional
  public int jobOccupationId; // optional
  public String extra; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PID((short)1, "pid"),
    JOB_CUSTOM_ID((short)2, "jobCustomId"),
    CREATE_TIME((short)3, "createTime"),
    UPDATE_TIME((short)4, "updateTime"),
    JOB_OCCUPATION_ID((short)5, "jobOccupationId"),
    EXTRA((short)6, "extra");

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
        case 2: // JOB_CUSTOM_ID
          return JOB_CUSTOM_ID;
        case 3: // CREATE_TIME
          return CREATE_TIME;
        case 4: // UPDATE_TIME
          return UPDATE_TIME;
        case 5: // JOB_OCCUPATION_ID
          return JOB_OCCUPATION_ID;
        case 6: // EXTRA
          return EXTRA;
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
  private static final int __JOBCUSTOMID_ISSET_ID = 1;
  private static final int __JOBOCCUPATIONID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PID,_Fields.JOB_CUSTOM_ID,_Fields.CREATE_TIME,_Fields.UPDATE_TIME,_Fields.JOB_OCCUPATION_ID,_Fields.EXTRA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PID, new org.apache.thrift.meta_data.FieldMetaData("pid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOB_CUSTOM_ID, new org.apache.thrift.meta_data.FieldMetaData("jobCustomId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_OCCUPATION_ID, new org.apache.thrift.meta_data.FieldMetaData("jobOccupationId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXTRA, new org.apache.thrift.meta_data.FieldMetaData("extra", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobPositionExtDO.class, metaDataMap);
  }

  public JobPositionExtDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobPositionExtDO(JobPositionExtDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pid = other.pid;
    this.jobCustomId = other.jobCustomId;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
    if (other.isSetUpdateTime()) {
      this.updateTime = other.updateTime;
    }
    this.jobOccupationId = other.jobOccupationId;
    if (other.isSetExtra()) {
      this.extra = other.extra;
    }
  }

  public JobPositionExtDO deepCopy() {
    return new JobPositionExtDO(this);
  }

  @Override
  public void clear() {
    setPidIsSet(false);
    this.pid = 0;
    setJobCustomIdIsSet(false);
    this.jobCustomId = 0;
    this.createTime = null;
    this.updateTime = null;
    setJobOccupationIdIsSet(false);
    this.jobOccupationId = 0;
    this.extra = null;
  }

  public int getPid() {
    return this.pid;
  }

  public JobPositionExtDO setPid(int pid) {
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

  public int getJobCustomId() {
    return this.jobCustomId;
  }

  public JobPositionExtDO setJobCustomId(int jobCustomId) {
    this.jobCustomId = jobCustomId;
    setJobCustomIdIsSet(true);
    return this;
  }

  public void unsetJobCustomId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOBCUSTOMID_ISSET_ID);
  }

  /** Returns true if field jobCustomId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobCustomId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOBCUSTOMID_ISSET_ID);
  }

  public void setJobCustomIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOBCUSTOMID_ISSET_ID, value);
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public JobPositionExtDO setCreateTime(String createTime) {
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

  public JobPositionExtDO setUpdateTime(String updateTime) {
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

  public int getJobOccupationId() {
    return this.jobOccupationId;
  }

  public JobPositionExtDO setJobOccupationId(int jobOccupationId) {
    this.jobOccupationId = jobOccupationId;
    setJobOccupationIdIsSet(true);
    return this;
  }

  public void unsetJobOccupationId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOBOCCUPATIONID_ISSET_ID);
  }

  /** Returns true if field jobOccupationId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobOccupationId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOBOCCUPATIONID_ISSET_ID);
  }

  public void setJobOccupationIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOBOCCUPATIONID_ISSET_ID, value);
  }

  public String getExtra() {
    return this.extra;
  }

  public JobPositionExtDO setExtra(String extra) {
    this.extra = extra;
    return this;
  }

  public void unsetExtra() {
    this.extra = null;
  }

  /** Returns true if field extra is set (has been assigned a value) and false otherwise */
  public boolean isSetExtra() {
    return this.extra != null;
  }

  public void setExtraIsSet(boolean value) {
    if (!value) {
      this.extra = null;
    }
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

    case JOB_CUSTOM_ID:
      if (value == null) {
        unsetJobCustomId();
      } else {
        setJobCustomId((Integer)value);
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

    case JOB_OCCUPATION_ID:
      if (value == null) {
        unsetJobOccupationId();
      } else {
        setJobOccupationId((Integer)value);
      }
      break;

    case EXTRA:
      if (value == null) {
        unsetExtra();
      } else {
        setExtra((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PID:
      return getPid();

    case JOB_CUSTOM_ID:
      return getJobCustomId();

    case CREATE_TIME:
      return getCreateTime();

    case UPDATE_TIME:
      return getUpdateTime();

    case JOB_OCCUPATION_ID:
      return getJobOccupationId();

    case EXTRA:
      return getExtra();

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
    case JOB_CUSTOM_ID:
      return isSetJobCustomId();
    case CREATE_TIME:
      return isSetCreateTime();
    case UPDATE_TIME:
      return isSetUpdateTime();
    case JOB_OCCUPATION_ID:
      return isSetJobOccupationId();
    case EXTRA:
      return isSetExtra();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobPositionExtDO)
      return this.equals((JobPositionExtDO)that);
    return false;
  }

  public boolean equals(JobPositionExtDO that) {
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

    boolean this_present_jobCustomId = true && this.isSetJobCustomId();
    boolean that_present_jobCustomId = true && that.isSetJobCustomId();
    if (this_present_jobCustomId || that_present_jobCustomId) {
      if (!(this_present_jobCustomId && that_present_jobCustomId))
        return false;
      if (this.jobCustomId != that.jobCustomId)
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

    boolean this_present_jobOccupationId = true && this.isSetJobOccupationId();
    boolean that_present_jobOccupationId = true && that.isSetJobOccupationId();
    if (this_present_jobOccupationId || that_present_jobOccupationId) {
      if (!(this_present_jobOccupationId && that_present_jobOccupationId))
        return false;
      if (this.jobOccupationId != that.jobOccupationId)
        return false;
    }

    boolean this_present_extra = true && this.isSetExtra();
    boolean that_present_extra = true && that.isSetExtra();
    if (this_present_extra || that_present_extra) {
      if (!(this_present_extra && that_present_extra))
        return false;
      if (!this.extra.equals(that.extra))
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

    hashCode = hashCode * 8191 + ((isSetJobCustomId()) ? 131071 : 524287);
    if (isSetJobCustomId())
      hashCode = hashCode * 8191 + jobCustomId;

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
    if (isSetUpdateTime())
      hashCode = hashCode * 8191 + updateTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetJobOccupationId()) ? 131071 : 524287);
    if (isSetJobOccupationId())
      hashCode = hashCode * 8191 + jobOccupationId;

    hashCode = hashCode * 8191 + ((isSetExtra()) ? 131071 : 524287);
    if (isSetExtra())
      hashCode = hashCode * 8191 + extra.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JobPositionExtDO other) {
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
    lastComparison = Boolean.valueOf(isSetJobCustomId()).compareTo(other.isSetJobCustomId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobCustomId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobCustomId, other.jobCustomId);
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
    lastComparison = Boolean.valueOf(isSetJobOccupationId()).compareTo(other.isSetJobOccupationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobOccupationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobOccupationId, other.jobOccupationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtra()).compareTo(other.isSetExtra());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtra()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extra, other.extra);
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
    StringBuilder sb = new StringBuilder("JobPositionExtDO(");
    boolean first = true;

    if (isSetPid()) {
      sb.append("pid:");
      sb.append(this.pid);
      first = false;
    }
    if (isSetJobCustomId()) {
      if (!first) sb.append(", ");
      sb.append("jobCustomId:");
      sb.append(this.jobCustomId);
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
    if (isSetJobOccupationId()) {
      if (!first) sb.append(", ");
      sb.append("jobOccupationId:");
      sb.append(this.jobOccupationId);
      first = false;
    }
    if (isSetExtra()) {
      if (!first) sb.append(", ");
      sb.append("extra:");
      if (this.extra == null) {
        sb.append("null");
      } else {
        sb.append(this.extra);
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

  private static class JobPositionExtDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobPositionExtDOStandardScheme getScheme() {
      return new JobPositionExtDOStandardScheme();
    }
  }

  private static class JobPositionExtDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<JobPositionExtDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobPositionExtDO struct) throws org.apache.thrift.TException {
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
          case 2: // JOB_CUSTOM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobCustomId = iprot.readI32();
              struct.setJobCustomIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createTime = iprot.readString();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateTime = iprot.readString();
              struct.setUpdateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JOB_OCCUPATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobOccupationId = iprot.readI32();
              struct.setJobOccupationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXTRA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.extra = iprot.readString();
              struct.setExtraIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobPositionExtDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPid()) {
        oprot.writeFieldBegin(PID_FIELD_DESC);
        oprot.writeI32(struct.pid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetJobCustomId()) {
        oprot.writeFieldBegin(JOB_CUSTOM_ID_FIELD_DESC);
        oprot.writeI32(struct.jobCustomId);
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
      if (struct.isSetJobOccupationId()) {
        oprot.writeFieldBegin(JOB_OCCUPATION_ID_FIELD_DESC);
        oprot.writeI32(struct.jobOccupationId);
        oprot.writeFieldEnd();
      }
      if (struct.extra != null) {
        if (struct.isSetExtra()) {
          oprot.writeFieldBegin(EXTRA_FIELD_DESC);
          oprot.writeString(struct.extra);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobPositionExtDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobPositionExtDOTupleScheme getScheme() {
      return new JobPositionExtDOTupleScheme();
    }
  }

  private static class JobPositionExtDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<JobPositionExtDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobPositionExtDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPid()) {
        optionals.set(0);
      }
      if (struct.isSetJobCustomId()) {
        optionals.set(1);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(2);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(3);
      }
      if (struct.isSetJobOccupationId()) {
        optionals.set(4);
      }
      if (struct.isSetExtra()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPid()) {
        oprot.writeI32(struct.pid);
      }
      if (struct.isSetJobCustomId()) {
        oprot.writeI32(struct.jobCustomId);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeString(struct.updateTime);
      }
      if (struct.isSetJobOccupationId()) {
        oprot.writeI32(struct.jobOccupationId);
      }
      if (struct.isSetExtra()) {
        oprot.writeString(struct.extra);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobPositionExtDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.pid = iprot.readI32();
        struct.setPidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobCustomId = iprot.readI32();
        struct.setJobCustomIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.updateTime = iprot.readString();
        struct.setUpdateTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.jobOccupationId = iprot.readI32();
        struct.setJobOccupationIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.extra = iprot.readString();
        struct.setExtraIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

