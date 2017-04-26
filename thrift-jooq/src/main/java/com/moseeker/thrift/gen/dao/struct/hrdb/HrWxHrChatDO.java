/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.hrdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-04-26")
public class HrWxHrChatDO implements org.apache.thrift.TBase<HrWxHrChatDO, HrWxHrChatDO._Fields>, java.io.Serializable, Cloneable, Comparable<HrWxHrChatDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HrWxHrChatDO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHATLIST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chatlistId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PID_FIELD_DESC = new org.apache.thrift.protocol.TField("pid", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SPEAKER_FIELD_DESC = new org.apache.thrift.protocol.TField("speaker", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.BYTE, (short)6);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HrWxHrChatDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HrWxHrChatDOTupleSchemeFactory();

  public int id; // optional
  public int chatlistId; // optional
  public java.lang.String content; // optional
  public int pid; // optional
  public byte speaker; // optional
  public byte status; // optional
  public java.lang.String createTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CHATLIST_ID((short)2, "chatlistId"),
    CONTENT((short)3, "content"),
    PID((short)4, "pid"),
    SPEAKER((short)5, "speaker"),
    STATUS((short)6, "status"),
    CREATE_TIME((short)7, "createTime");

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
        case 2: // CHATLIST_ID
          return CHATLIST_ID;
        case 3: // CONTENT
          return CONTENT;
        case 4: // PID
          return PID;
        case 5: // SPEAKER
          return SPEAKER;
        case 6: // STATUS
          return STATUS;
        case 7: // CREATE_TIME
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
  private static final int __CHATLISTID_ISSET_ID = 1;
  private static final int __PID_ISSET_ID = 2;
  private static final int __SPEAKER_ISSET_ID = 3;
  private static final int __STATUS_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.CHATLIST_ID,_Fields.CONTENT,_Fields.PID,_Fields.SPEAKER,_Fields.STATUS,_Fields.CREATE_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHATLIST_ID, new org.apache.thrift.meta_data.FieldMetaData("chatlistId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PID, new org.apache.thrift.meta_data.FieldMetaData("pid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SPEAKER, new org.apache.thrift.meta_data.FieldMetaData("speaker", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HrWxHrChatDO.class, metaDataMap);
  }

  public HrWxHrChatDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HrWxHrChatDO(HrWxHrChatDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.chatlistId = other.chatlistId;
    if (other.isSetContent()) {
      this.content = other.content;
    }
    this.pid = other.pid;
    this.speaker = other.speaker;
    this.status = other.status;
    if (other.isSetCreateTime()) {
      this.createTime = other.createTime;
    }
  }

  public HrWxHrChatDO deepCopy() {
    return new HrWxHrChatDO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setChatlistIdIsSet(false);
    this.chatlistId = 0;
    this.content = null;
    setPidIsSet(false);
    this.pid = 0;
    setSpeakerIsSet(false);
    this.speaker = 0;
    setStatusIsSet(false);
    this.status = 0;
    this.createTime = null;
  }

  public int getId() {
    return this.id;
  }

  public HrWxHrChatDO setId(int id) {
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

  public int getChatlistId() {
    return this.chatlistId;
  }

  public HrWxHrChatDO setChatlistId(int chatlistId) {
    this.chatlistId = chatlistId;
    setChatlistIdIsSet(true);
    return this;
  }

  public void unsetChatlistId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHATLISTID_ISSET_ID);
  }

  /** Returns true if field chatlistId is set (has been assigned a value) and false otherwise */
  public boolean isSetChatlistId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHATLISTID_ISSET_ID);
  }

  public void setChatlistIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHATLISTID_ISSET_ID, value);
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public HrWxHrChatDO setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public int getPid() {
    return this.pid;
  }

  public HrWxHrChatDO setPid(int pid) {
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

  public byte getSpeaker() {
    return this.speaker;
  }

  public HrWxHrChatDO setSpeaker(byte speaker) {
    this.speaker = speaker;
    setSpeakerIsSet(true);
    return this;
  }

  public void unsetSpeaker() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SPEAKER_ISSET_ID);
  }

  /** Returns true if field speaker is set (has been assigned a value) and false otherwise */
  public boolean isSetSpeaker() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SPEAKER_ISSET_ID);
  }

  public void setSpeakerIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SPEAKER_ISSET_ID, value);
  }

  public byte getStatus() {
    return this.status;
  }

  public HrWxHrChatDO setStatus(byte status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public java.lang.String getCreateTime() {
    return this.createTime;
  }

  public HrWxHrChatDO setCreateTime(java.lang.String createTime) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case CHATLIST_ID:
      if (value == null) {
        unsetChatlistId();
      } else {
        setChatlistId((java.lang.Integer)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((java.lang.Integer)value);
      }
      break;

    case SPEAKER:
      if (value == null) {
        unsetSpeaker();
      } else {
        setSpeaker((java.lang.Byte)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Byte)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CHATLIST_ID:
      return getChatlistId();

    case CONTENT:
      return getContent();

    case PID:
      return getPid();

    case SPEAKER:
      return getSpeaker();

    case STATUS:
      return getStatus();

    case CREATE_TIME:
      return getCreateTime();

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
    case CHATLIST_ID:
      return isSetChatlistId();
    case CONTENT:
      return isSetContent();
    case PID:
      return isSetPid();
    case SPEAKER:
      return isSetSpeaker();
    case STATUS:
      return isSetStatus();
    case CREATE_TIME:
      return isSetCreateTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HrWxHrChatDO)
      return this.equals((HrWxHrChatDO)that);
    return false;
  }

  public boolean equals(HrWxHrChatDO that) {
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

    boolean this_present_chatlistId = true && this.isSetChatlistId();
    boolean that_present_chatlistId = true && that.isSetChatlistId();
    if (this_present_chatlistId || that_present_chatlistId) {
      if (!(this_present_chatlistId && that_present_chatlistId))
        return false;
      if (this.chatlistId != that.chatlistId)
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
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

    boolean this_present_speaker = true && this.isSetSpeaker();
    boolean that_present_speaker = true && that.isSetSpeaker();
    if (this_present_speaker || that_present_speaker) {
      if (!(this_present_speaker && that_present_speaker))
        return false;
      if (this.speaker != that.speaker)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetChatlistId()) ? 131071 : 524287);
    if (isSetChatlistId())
      hashCode = hashCode * 8191 + chatlistId;

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    hashCode = hashCode * 8191 + ((isSetPid()) ? 131071 : 524287);
    if (isSetPid())
      hashCode = hashCode * 8191 + pid;

    hashCode = hashCode * 8191 + ((isSetSpeaker()) ? 131071 : 524287);
    if (isSetSpeaker())
      hashCode = hashCode * 8191 + (int) (speaker);

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + (int) (status);

    hashCode = hashCode * 8191 + ((isSetCreateTime()) ? 131071 : 524287);
    if (isSetCreateTime())
      hashCode = hashCode * 8191 + createTime.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HrWxHrChatDO other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetChatlistId()).compareTo(other.isSetChatlistId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChatlistId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chatlistId, other.chatlistId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPid()).compareTo(other.isSetPid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pid, other.pid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSpeaker()).compareTo(other.isSetSpeaker());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpeaker()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.speaker, other.speaker);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HrWxHrChatDO(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetChatlistId()) {
      if (!first) sb.append(", ");
      sb.append("chatlistId:");
      sb.append(this.chatlistId);
      first = false;
    }
    if (isSetContent()) {
      if (!first) sb.append(", ");
      sb.append("content:");
      if (this.content == null) {
        sb.append("null");
      } else {
        sb.append(this.content);
      }
      first = false;
    }
    if (isSetPid()) {
      if (!first) sb.append(", ");
      sb.append("pid:");
      sb.append(this.pid);
      first = false;
    }
    if (isSetSpeaker()) {
      if (!first) sb.append(", ");
      sb.append("speaker:");
      sb.append(this.speaker);
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
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

  private static class HrWxHrChatDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrWxHrChatDOStandardScheme getScheme() {
      return new HrWxHrChatDOStandardScheme();
    }
  }

  private static class HrWxHrChatDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<HrWxHrChatDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HrWxHrChatDO struct) throws org.apache.thrift.TException {
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
          case 2: // CHATLIST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.chatlistId = iprot.readI32();
              struct.setChatlistIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
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
          case 5: // SPEAKER
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.speaker = iprot.readByte();
              struct.setSpeakerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.status = iprot.readByte();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createTime = iprot.readString();
              struct.setCreateTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HrWxHrChatDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetChatlistId()) {
        oprot.writeFieldBegin(CHATLIST_ID_FIELD_DESC);
        oprot.writeI32(struct.chatlistId);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        if (struct.isSetContent()) {
          oprot.writeFieldBegin(CONTENT_FIELD_DESC);
          oprot.writeString(struct.content);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPid()) {
        oprot.writeFieldBegin(PID_FIELD_DESC);
        oprot.writeI32(struct.pid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSpeaker()) {
        oprot.writeFieldBegin(SPEAKER_FIELD_DESC);
        oprot.writeByte(struct.speaker);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStatus()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeByte(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.createTime != null) {
        if (struct.isSetCreateTime()) {
          oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
          oprot.writeString(struct.createTime);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HrWxHrChatDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HrWxHrChatDOTupleScheme getScheme() {
      return new HrWxHrChatDOTupleScheme();
    }
  }

  private static class HrWxHrChatDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<HrWxHrChatDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HrWxHrChatDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetChatlistId()) {
        optionals.set(1);
      }
      if (struct.isSetContent()) {
        optionals.set(2);
      }
      if (struct.isSetPid()) {
        optionals.set(3);
      }
      if (struct.isSetSpeaker()) {
        optionals.set(4);
      }
      if (struct.isSetStatus()) {
        optionals.set(5);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetChatlistId()) {
        oprot.writeI32(struct.chatlistId);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetPid()) {
        oprot.writeI32(struct.pid);
      }
      if (struct.isSetSpeaker()) {
        oprot.writeByte(struct.speaker);
      }
      if (struct.isSetStatus()) {
        oprot.writeByte(struct.status);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeString(struct.createTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HrWxHrChatDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.chatlistId = iprot.readI32();
        struct.setChatlistIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pid = iprot.readI32();
        struct.setPidIsSet(true);
      }
      if (incoming.get(4)) {
        struct.speaker = iprot.readByte();
        struct.setSpeakerIsSet(true);
      }
      if (incoming.get(5)) {
        struct.status = iprot.readByte();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(6)) {
        struct.createTime = iprot.readString();
        struct.setCreateTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

