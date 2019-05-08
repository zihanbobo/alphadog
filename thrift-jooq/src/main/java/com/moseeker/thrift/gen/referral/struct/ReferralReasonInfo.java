/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.referral.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-04-25")
public class ReferralReasonInfo implements org.apache.thrift.TBase<ReferralReasonInfo, ReferralReasonInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ReferralReasonInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReferralReasonInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REFERRAL_REASONS_FIELD_DESC = new org.apache.thrift.protocol.TField("referralReasons", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField RELATIONSHIP_FIELD_DESC = new org.apache.thrift.protocol.TField("relationship", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RECOM_REASON_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("recomReasonText", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReferralReasonInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReferralReasonInfoTupleSchemeFactory();

  public int id; // optional
  public java.util.List<java.lang.String> referralReasons; // optional
  public int relationship; // optional
  public java.lang.String recomReasonText; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    REFERRAL_REASONS((short)2, "referralReasons"),
    RELATIONSHIP((short)3, "relationship"),
    RECOM_REASON_TEXT((short)4, "recomReasonText");

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
        case 2: // REFERRAL_REASONS
          return REFERRAL_REASONS;
        case 3: // RELATIONSHIP
          return RELATIONSHIP;
        case 4: // RECOM_REASON_TEXT
          return RECOM_REASON_TEXT;
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
  private static final int __RELATIONSHIP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.REFERRAL_REASONS,_Fields.RELATIONSHIP,_Fields.RECOM_REASON_TEXT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REFERRAL_REASONS, new org.apache.thrift.meta_data.FieldMetaData("referralReasons", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RELATIONSHIP, new org.apache.thrift.meta_data.FieldMetaData("relationship", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECOM_REASON_TEXT, new org.apache.thrift.meta_data.FieldMetaData("recomReasonText", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReferralReasonInfo.class, metaDataMap);
  }

  public ReferralReasonInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReferralReasonInfo(ReferralReasonInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetReferralReasons()) {
      java.util.List<java.lang.String> __this__referralReasons = new java.util.ArrayList<java.lang.String>(other.referralReasons);
      this.referralReasons = __this__referralReasons;
    }
    this.relationship = other.relationship;
    if (other.isSetRecomReasonText()) {
      this.recomReasonText = other.recomReasonText;
    }
  }

  public ReferralReasonInfo deepCopy() {
    return new ReferralReasonInfo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.referralReasons = null;
    setRelationshipIsSet(false);
    this.relationship = 0;
    this.recomReasonText = null;
  }

  public int getId() {
    return this.id;
  }

  public ReferralReasonInfo setId(int id) {
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

  public int getReferralReasonsSize() {
    return (this.referralReasons == null) ? 0 : this.referralReasons.size();
  }

  public java.util.Iterator<java.lang.String> getReferralReasonsIterator() {
    return (this.referralReasons == null) ? null : this.referralReasons.iterator();
  }

  public void addToReferralReasons(java.lang.String elem) {
    if (this.referralReasons == null) {
      this.referralReasons = new java.util.ArrayList<java.lang.String>();
    }
    this.referralReasons.add(elem);
  }

  public java.util.List<java.lang.String> getReferralReasons() {
    return this.referralReasons;
  }

  public ReferralReasonInfo setReferralReasons(java.util.List<java.lang.String> referralReasons) {
    this.referralReasons = referralReasons;
    return this;
  }

  public void unsetReferralReasons() {
    this.referralReasons = null;
  }

  /** Returns true if field referralReasons is set (has been assigned a value) and false otherwise */
  public boolean isSetReferralReasons() {
    return this.referralReasons != null;
  }

  public void setReferralReasonsIsSet(boolean value) {
    if (!value) {
      this.referralReasons = null;
    }
  }

  public int getRelationship() {
    return this.relationship;
  }

  public ReferralReasonInfo setRelationship(int relationship) {
    this.relationship = relationship;
    setRelationshipIsSet(true);
    return this;
  }

  public void unsetRelationship() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RELATIONSHIP_ISSET_ID);
  }

  /** Returns true if field relationship is set (has been assigned a value) and false otherwise */
  public boolean isSetRelationship() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RELATIONSHIP_ISSET_ID);
  }

  public void setRelationshipIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RELATIONSHIP_ISSET_ID, value);
  }

  public java.lang.String getRecomReasonText() {
    return this.recomReasonText;
  }

  public ReferralReasonInfo setRecomReasonText(java.lang.String recomReasonText) {
    this.recomReasonText = recomReasonText;
    return this;
  }

  public void unsetRecomReasonText() {
    this.recomReasonText = null;
  }

  /** Returns true if field recomReasonText is set (has been assigned a value) and false otherwise */
  public boolean isSetRecomReasonText() {
    return this.recomReasonText != null;
  }

  public void setRecomReasonTextIsSet(boolean value) {
    if (!value) {
      this.recomReasonText = null;
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

    case REFERRAL_REASONS:
      if (value == null) {
        unsetReferralReasons();
      } else {
        setReferralReasons((java.util.List<java.lang.String>)value);
      }
      break;

    case RELATIONSHIP:
      if (value == null) {
        unsetRelationship();
      } else {
        setRelationship((java.lang.Integer)value);
      }
      break;

    case RECOM_REASON_TEXT:
      if (value == null) {
        unsetRecomReasonText();
      } else {
        setRecomReasonText((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case REFERRAL_REASONS:
      return getReferralReasons();

    case RELATIONSHIP:
      return getRelationship();

    case RECOM_REASON_TEXT:
      return getRecomReasonText();

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
    case REFERRAL_REASONS:
      return isSetReferralReasons();
    case RELATIONSHIP:
      return isSetRelationship();
    case RECOM_REASON_TEXT:
      return isSetRecomReasonText();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ReferralReasonInfo)
      return this.equals((ReferralReasonInfo)that);
    return false;
  }

  public boolean equals(ReferralReasonInfo that) {
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

    boolean this_present_referralReasons = true && this.isSetReferralReasons();
    boolean that_present_referralReasons = true && that.isSetReferralReasons();
    if (this_present_referralReasons || that_present_referralReasons) {
      if (!(this_present_referralReasons && that_present_referralReasons))
        return false;
      if (!this.referralReasons.equals(that.referralReasons))
        return false;
    }

    boolean this_present_relationship = true && this.isSetRelationship();
    boolean that_present_relationship = true && that.isSetRelationship();
    if (this_present_relationship || that_present_relationship) {
      if (!(this_present_relationship && that_present_relationship))
        return false;
      if (this.relationship != that.relationship)
        return false;
    }

    boolean this_present_recomReasonText = true && this.isSetRecomReasonText();
    boolean that_present_recomReasonText = true && that.isSetRecomReasonText();
    if (this_present_recomReasonText || that_present_recomReasonText) {
      if (!(this_present_recomReasonText && that_present_recomReasonText))
        return false;
      if (!this.recomReasonText.equals(that.recomReasonText))
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

    hashCode = hashCode * 8191 + ((isSetReferralReasons()) ? 131071 : 524287);
    if (isSetReferralReasons())
      hashCode = hashCode * 8191 + referralReasons.hashCode();

    hashCode = hashCode * 8191 + ((isSetRelationship()) ? 131071 : 524287);
    if (isSetRelationship())
      hashCode = hashCode * 8191 + relationship;

    hashCode = hashCode * 8191 + ((isSetRecomReasonText()) ? 131071 : 524287);
    if (isSetRecomReasonText())
      hashCode = hashCode * 8191 + recomReasonText.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ReferralReasonInfo other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetReferralReasons()).compareTo(other.isSetReferralReasons());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReferralReasons()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.referralReasons, other.referralReasons);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRelationship()).compareTo(other.isSetRelationship());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelationship()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relationship, other.relationship);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecomReasonText()).compareTo(other.isSetRecomReasonText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecomReasonText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recomReasonText, other.recomReasonText);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReferralReasonInfo(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetReferralReasons()) {
      if (!first) sb.append(", ");
      sb.append("referralReasons:");
      if (this.referralReasons == null) {
        sb.append("null");
      } else {
        sb.append(this.referralReasons);
      }
      first = false;
    }
    if (isSetRelationship()) {
      if (!first) sb.append(", ");
      sb.append("relationship:");
      sb.append(this.relationship);
      first = false;
    }
    if (isSetRecomReasonText()) {
      if (!first) sb.append(", ");
      sb.append("recomReasonText:");
      if (this.recomReasonText == null) {
        sb.append("null");
      } else {
        sb.append(this.recomReasonText);
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

  private static class ReferralReasonInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReferralReasonInfoStandardScheme getScheme() {
      return new ReferralReasonInfoStandardScheme();
    }
  }

  private static class ReferralReasonInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReferralReasonInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReferralReasonInfo struct) throws org.apache.thrift.TException {
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
          case 2: // REFERRAL_REASONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.referralReasons = new java.util.ArrayList<java.lang.String>(_list32.size);
                java.lang.String _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = iprot.readString();
                  struct.referralReasons.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setReferralReasonsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RELATIONSHIP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.relationship = iprot.readI32();
              struct.setRelationshipIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RECOM_REASON_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recomReasonText = iprot.readString();
              struct.setRecomReasonTextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReferralReasonInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.referralReasons != null) {
        if (struct.isSetReferralReasons()) {
          oprot.writeFieldBegin(REFERRAL_REASONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.referralReasons.size()));
            for (java.lang.String _iter35 : struct.referralReasons)
            {
              oprot.writeString(_iter35);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRelationship()) {
        oprot.writeFieldBegin(RELATIONSHIP_FIELD_DESC);
        oprot.writeI32(struct.relationship);
        oprot.writeFieldEnd();
      }
      if (struct.recomReasonText != null) {
        if (struct.isSetRecomReasonText()) {
          oprot.writeFieldBegin(RECOM_REASON_TEXT_FIELD_DESC);
          oprot.writeString(struct.recomReasonText);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReferralReasonInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReferralReasonInfoTupleScheme getScheme() {
      return new ReferralReasonInfoTupleScheme();
    }
  }

  private static class ReferralReasonInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReferralReasonInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReferralReasonInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetReferralReasons()) {
        optionals.set(1);
      }
      if (struct.isSetRelationship()) {
        optionals.set(2);
      }
      if (struct.isSetRecomReasonText()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetReferralReasons()) {
        {
          oprot.writeI32(struct.referralReasons.size());
          for (java.lang.String _iter36 : struct.referralReasons)
          {
            oprot.writeString(_iter36);
          }
        }
      }
      if (struct.isSetRelationship()) {
        oprot.writeI32(struct.relationship);
      }
      if (struct.isSetRecomReasonText()) {
        oprot.writeString(struct.recomReasonText);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReferralReasonInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.referralReasons = new java.util.ArrayList<java.lang.String>(_list37.size);
          java.lang.String _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = iprot.readString();
            struct.referralReasons.add(_elem38);
          }
        }
        struct.setReferralReasonsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.relationship = iprot.readI32();
        struct.setRelationshipIsSet(true);
      }
      if (incoming.get(3)) {
        struct.recomReasonText = iprot.readString();
        struct.setRecomReasonTextIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

