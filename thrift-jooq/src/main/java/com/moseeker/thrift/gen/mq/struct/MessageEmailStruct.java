/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.mq.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-10-31")
public class MessageEmailStruct implements org.apache.thrift.TBase<MessageEmailStruct, MessageEmailStruct._Fields>, java.io.Serializable, Cloneable, Comparable<MessageEmailStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MessageEmailStruct");

  private static final org.apache.thrift.protocol.TField POSITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("position_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField APPLIER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("applier_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RECOMMENDER_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recommender_user_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ORIGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("origin", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField APPLY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("apply_type", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField EMAIL_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("email_status", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField APPLICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("application_id", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MessageEmailStructStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MessageEmailStructTupleSchemeFactory();

  public int position_id; // required
  public int applier_id; // required
  public int recommender_user_id; // required
  public int origin; // required
  public int apply_type; // required
  public int email_status; // required
  public int application_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POSITION_ID((short)1, "position_id"),
    APPLIER_ID((short)2, "applier_id"),
    RECOMMENDER_USER_ID((short)3, "recommender_user_id"),
    ORIGIN((short)4, "origin"),
    APPLY_TYPE((short)5, "apply_type"),
    EMAIL_STATUS((short)6, "email_status"),
    APPLICATION_ID((short)7, "application_id");

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
        case 1: // POSITION_ID
          return POSITION_ID;
        case 2: // APPLIER_ID
          return APPLIER_ID;
        case 3: // RECOMMENDER_USER_ID
          return RECOMMENDER_USER_ID;
        case 4: // ORIGIN
          return ORIGIN;
        case 5: // APPLY_TYPE
          return APPLY_TYPE;
        case 6: // EMAIL_STATUS
          return EMAIL_STATUS;
        case 7: // APPLICATION_ID
          return APPLICATION_ID;
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
  private static final int __POSITION_ID_ISSET_ID = 0;
  private static final int __APPLIER_ID_ISSET_ID = 1;
  private static final int __RECOMMENDER_USER_ID_ISSET_ID = 2;
  private static final int __ORIGIN_ISSET_ID = 3;
  private static final int __APPLY_TYPE_ISSET_ID = 4;
  private static final int __EMAIL_STATUS_ISSET_ID = 5;
  private static final int __APPLICATION_ID_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POSITION_ID, new org.apache.thrift.meta_data.FieldMetaData("position_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APPLIER_ID, new org.apache.thrift.meta_data.FieldMetaData("applier_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECOMMENDER_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("recommender_user_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ORIGIN, new org.apache.thrift.meta_data.FieldMetaData("origin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APPLY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("apply_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMAIL_STATUS, new org.apache.thrift.meta_data.FieldMetaData("email_status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APPLICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("application_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MessageEmailStruct.class, metaDataMap);
  }

  public MessageEmailStruct() {
  }

  public MessageEmailStruct(
    int position_id,
    int applier_id,
    int recommender_user_id,
    int origin,
    int apply_type,
    int email_status,
    int application_id)
  {
    this();
    this.position_id = position_id;
    setPosition_idIsSet(true);
    this.applier_id = applier_id;
    setApplier_idIsSet(true);
    this.recommender_user_id = recommender_user_id;
    setRecommender_user_idIsSet(true);
    this.origin = origin;
    setOriginIsSet(true);
    this.apply_type = apply_type;
    setApply_typeIsSet(true);
    this.email_status = email_status;
    setEmail_statusIsSet(true);
    this.application_id = application_id;
    setApplication_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageEmailStruct(MessageEmailStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.position_id = other.position_id;
    this.applier_id = other.applier_id;
    this.recommender_user_id = other.recommender_user_id;
    this.origin = other.origin;
    this.apply_type = other.apply_type;
    this.email_status = other.email_status;
    this.application_id = other.application_id;
  }

  public MessageEmailStruct deepCopy() {
    return new MessageEmailStruct(this);
  }

  @Override
  public void clear() {
    setPosition_idIsSet(false);
    this.position_id = 0;
    setApplier_idIsSet(false);
    this.applier_id = 0;
    setRecommender_user_idIsSet(false);
    this.recommender_user_id = 0;
    setOriginIsSet(false);
    this.origin = 0;
    setApply_typeIsSet(false);
    this.apply_type = 0;
    setEmail_statusIsSet(false);
    this.email_status = 0;
    setApplication_idIsSet(false);
    this.application_id = 0;
  }

  public int getPosition_id() {
    return this.position_id;
  }

  public MessageEmailStruct setPosition_id(int position_id) {
    this.position_id = position_id;
    setPosition_idIsSet(true);
    return this;
  }

  public void unsetPosition_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POSITION_ID_ISSET_ID);
  }

  /** Returns true if field position_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POSITION_ID_ISSET_ID);
  }

  public void setPosition_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POSITION_ID_ISSET_ID, value);
  }

  public int getApplier_id() {
    return this.applier_id;
  }

  public MessageEmailStruct setApplier_id(int applier_id) {
    this.applier_id = applier_id;
    setApplier_idIsSet(true);
    return this;
  }

  public void unsetApplier_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPLIER_ID_ISSET_ID);
  }

  /** Returns true if field applier_id is set (has been assigned a value) and false otherwise */
  public boolean isSetApplier_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPLIER_ID_ISSET_ID);
  }

  public void setApplier_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPLIER_ID_ISSET_ID, value);
  }

  public int getRecommender_user_id() {
    return this.recommender_user_id;
  }

  public MessageEmailStruct setRecommender_user_id(int recommender_user_id) {
    this.recommender_user_id = recommender_user_id;
    setRecommender_user_idIsSet(true);
    return this;
  }

  public void unsetRecommender_user_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECOMMENDER_USER_ID_ISSET_ID);
  }

  /** Returns true if field recommender_user_id is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommender_user_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECOMMENDER_USER_ID_ISSET_ID);
  }

  public void setRecommender_user_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECOMMENDER_USER_ID_ISSET_ID, value);
  }

  public int getOrigin() {
    return this.origin;
  }

  public MessageEmailStruct setOrigin(int origin) {
    this.origin = origin;
    setOriginIsSet(true);
    return this;
  }

  public void unsetOrigin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ORIGIN_ISSET_ID);
  }

  /** Returns true if field origin is set (has been assigned a value) and false otherwise */
  public boolean isSetOrigin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ORIGIN_ISSET_ID);
  }

  public void setOriginIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ORIGIN_ISSET_ID, value);
  }

  public int getApply_type() {
    return this.apply_type;
  }

  public MessageEmailStruct setApply_type(int apply_type) {
    this.apply_type = apply_type;
    setApply_typeIsSet(true);
    return this;
  }

  public void unsetApply_type() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPLY_TYPE_ISSET_ID);
  }

  /** Returns true if field apply_type is set (has been assigned a value) and false otherwise */
  public boolean isSetApply_type() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPLY_TYPE_ISSET_ID);
  }

  public void setApply_typeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPLY_TYPE_ISSET_ID, value);
  }

  public int getEmail_status() {
    return this.email_status;
  }

  public MessageEmailStruct setEmail_status(int email_status) {
    this.email_status = email_status;
    setEmail_statusIsSet(true);
    return this;
  }

  public void unsetEmail_status() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EMAIL_STATUS_ISSET_ID);
  }

  /** Returns true if field email_status is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail_status() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EMAIL_STATUS_ISSET_ID);
  }

  public void setEmail_statusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EMAIL_STATUS_ISSET_ID, value);
  }

  public int getApplication_id() {
    return this.application_id;
  }

  public MessageEmailStruct setApplication_id(int application_id) {
    this.application_id = application_id;
    setApplication_idIsSet(true);
    return this;
  }

  public void unsetApplication_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPLICATION_ID_ISSET_ID);
  }

  /** Returns true if field application_id is set (has been assigned a value) and false otherwise */
  public boolean isSetApplication_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPLICATION_ID_ISSET_ID);
  }

  public void setApplication_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPLICATION_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case POSITION_ID:
      if (value == null) {
        unsetPosition_id();
      } else {
        setPosition_id((java.lang.Integer)value);
      }
      break;

    case APPLIER_ID:
      if (value == null) {
        unsetApplier_id();
      } else {
        setApplier_id((java.lang.Integer)value);
      }
      break;

    case RECOMMENDER_USER_ID:
      if (value == null) {
        unsetRecommender_user_id();
      } else {
        setRecommender_user_id((java.lang.Integer)value);
      }
      break;

    case ORIGIN:
      if (value == null) {
        unsetOrigin();
      } else {
        setOrigin((java.lang.Integer)value);
      }
      break;

    case APPLY_TYPE:
      if (value == null) {
        unsetApply_type();
      } else {
        setApply_type((java.lang.Integer)value);
      }
      break;

    case EMAIL_STATUS:
      if (value == null) {
        unsetEmail_status();
      } else {
        setEmail_status((java.lang.Integer)value);
      }
      break;

    case APPLICATION_ID:
      if (value == null) {
        unsetApplication_id();
      } else {
        setApplication_id((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case POSITION_ID:
      return getPosition_id();

    case APPLIER_ID:
      return getApplier_id();

    case RECOMMENDER_USER_ID:
      return getRecommender_user_id();

    case ORIGIN:
      return getOrigin();

    case APPLY_TYPE:
      return getApply_type();

    case EMAIL_STATUS:
      return getEmail_status();

    case APPLICATION_ID:
      return getApplication_id();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case POSITION_ID:
      return isSetPosition_id();
    case APPLIER_ID:
      return isSetApplier_id();
    case RECOMMENDER_USER_ID:
      return isSetRecommender_user_id();
    case ORIGIN:
      return isSetOrigin();
    case APPLY_TYPE:
      return isSetApply_type();
    case EMAIL_STATUS:
      return isSetEmail_status();
    case APPLICATION_ID:
      return isSetApplication_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageEmailStruct)
      return this.equals((MessageEmailStruct)that);
    return false;
  }

  public boolean equals(MessageEmailStruct that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_position_id = true;
    boolean that_present_position_id = true;
    if (this_present_position_id || that_present_position_id) {
      if (!(this_present_position_id && that_present_position_id))
        return false;
      if (this.position_id != that.position_id)
        return false;
    }

    boolean this_present_applier_id = true;
    boolean that_present_applier_id = true;
    if (this_present_applier_id || that_present_applier_id) {
      if (!(this_present_applier_id && that_present_applier_id))
        return false;
      if (this.applier_id != that.applier_id)
        return false;
    }

    boolean this_present_recommender_user_id = true;
    boolean that_present_recommender_user_id = true;
    if (this_present_recommender_user_id || that_present_recommender_user_id) {
      if (!(this_present_recommender_user_id && that_present_recommender_user_id))
        return false;
      if (this.recommender_user_id != that.recommender_user_id)
        return false;
    }

    boolean this_present_origin = true;
    boolean that_present_origin = true;
    if (this_present_origin || that_present_origin) {
      if (!(this_present_origin && that_present_origin))
        return false;
      if (this.origin != that.origin)
        return false;
    }

    boolean this_present_apply_type = true;
    boolean that_present_apply_type = true;
    if (this_present_apply_type || that_present_apply_type) {
      if (!(this_present_apply_type && that_present_apply_type))
        return false;
      if (this.apply_type != that.apply_type)
        return false;
    }

    boolean this_present_email_status = true;
    boolean that_present_email_status = true;
    if (this_present_email_status || that_present_email_status) {
      if (!(this_present_email_status && that_present_email_status))
        return false;
      if (this.email_status != that.email_status)
        return false;
    }

    boolean this_present_application_id = true;
    boolean that_present_application_id = true;
    if (this_present_application_id || that_present_application_id) {
      if (!(this_present_application_id && that_present_application_id))
        return false;
      if (this.application_id != that.application_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + position_id;

    hashCode = hashCode * 8191 + applier_id;

    hashCode = hashCode * 8191 + recommender_user_id;

    hashCode = hashCode * 8191 + origin;

    hashCode = hashCode * 8191 + apply_type;

    hashCode = hashCode * 8191 + email_status;

    hashCode = hashCode * 8191 + application_id;

    return hashCode;
  }

  @Override
  public int compareTo(MessageEmailStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPosition_id()).compareTo(other.isSetPosition_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position_id, other.position_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApplier_id()).compareTo(other.isSetApplier_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplier_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applier_id, other.applier_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecommender_user_id()).compareTo(other.isSetRecommender_user_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommender_user_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommender_user_id, other.recommender_user_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOrigin()).compareTo(other.isSetOrigin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrigin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.origin, other.origin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApply_type()).compareTo(other.isSetApply_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApply_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apply_type, other.apply_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail_status()).compareTo(other.isSetEmail_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email_status, other.email_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApplication_id()).compareTo(other.isSetApplication_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplication_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.application_id, other.application_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageEmailStruct(");
    boolean first = true;

    sb.append("position_id:");
    sb.append(this.position_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("applier_id:");
    sb.append(this.applier_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("recommender_user_id:");
    sb.append(this.recommender_user_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("origin:");
    sb.append(this.origin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("apply_type:");
    sb.append(this.apply_type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("email_status:");
    sb.append(this.email_status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("application_id:");
    sb.append(this.application_id);
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

  private static class MessageEmailStructStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageEmailStructStandardScheme getScheme() {
      return new MessageEmailStructStandardScheme();
    }
  }

  private static class MessageEmailStructStandardScheme extends org.apache.thrift.scheme.StandardScheme<MessageEmailStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MessageEmailStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POSITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.position_id = iprot.readI32();
              struct.setPosition_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APPLIER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.applier_id = iprot.readI32();
              struct.setApplier_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECOMMENDER_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recommender_user_id = iprot.readI32();
              struct.setRecommender_user_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ORIGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.origin = iprot.readI32();
              struct.setOriginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APPLY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.apply_type = iprot.readI32();
              struct.setApply_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EMAIL_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.email_status = iprot.readI32();
              struct.setEmail_statusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // APPLICATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.application_id = iprot.readI32();
              struct.setApplication_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MessageEmailStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(POSITION_ID_FIELD_DESC);
      oprot.writeI32(struct.position_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPLIER_ID_FIELD_DESC);
      oprot.writeI32(struct.applier_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECOMMENDER_USER_ID_FIELD_DESC);
      oprot.writeI32(struct.recommender_user_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ORIGIN_FIELD_DESC);
      oprot.writeI32(struct.origin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPLY_TYPE_FIELD_DESC);
      oprot.writeI32(struct.apply_type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EMAIL_STATUS_FIELD_DESC);
      oprot.writeI32(struct.email_status);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPLICATION_ID_FIELD_DESC);
      oprot.writeI32(struct.application_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageEmailStructTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageEmailStructTupleScheme getScheme() {
      return new MessageEmailStructTupleScheme();
    }
  }

  private static class MessageEmailStructTupleScheme extends org.apache.thrift.scheme.TupleScheme<MessageEmailStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MessageEmailStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPosition_id()) {
        optionals.set(0);
      }
      if (struct.isSetApplier_id()) {
        optionals.set(1);
      }
      if (struct.isSetRecommender_user_id()) {
        optionals.set(2);
      }
      if (struct.isSetOrigin()) {
        optionals.set(3);
      }
      if (struct.isSetApply_type()) {
        optionals.set(4);
      }
      if (struct.isSetEmail_status()) {
        optionals.set(5);
      }
      if (struct.isSetApplication_id()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetPosition_id()) {
        oprot.writeI32(struct.position_id);
      }
      if (struct.isSetApplier_id()) {
        oprot.writeI32(struct.applier_id);
      }
      if (struct.isSetRecommender_user_id()) {
        oprot.writeI32(struct.recommender_user_id);
      }
      if (struct.isSetOrigin()) {
        oprot.writeI32(struct.origin);
      }
      if (struct.isSetApply_type()) {
        oprot.writeI32(struct.apply_type);
      }
      if (struct.isSetEmail_status()) {
        oprot.writeI32(struct.email_status);
      }
      if (struct.isSetApplication_id()) {
        oprot.writeI32(struct.application_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MessageEmailStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.position_id = iprot.readI32();
        struct.setPosition_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.applier_id = iprot.readI32();
        struct.setApplier_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.recommender_user_id = iprot.readI32();
        struct.setRecommender_user_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.origin = iprot.readI32();
        struct.setOriginIsSet(true);
      }
      if (incoming.get(4)) {
        struct.apply_type = iprot.readI32();
        struct.setApply_typeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.email_status = iprot.readI32();
        struct.setEmail_statusIsSet(true);
      }
      if (incoming.get(6)) {
        struct.application_id = iprot.readI32();
        struct.setApplication_idIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

