/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.wordpressdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-21")
public class WordpressTermsDO implements org.apache.thrift.TBase<WordpressTermsDO, WordpressTermsDO._Fields>, java.io.Serializable, Cloneable, Comparable<WordpressTermsDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WordpressTermsDO");

  private static final org.apache.thrift.protocol.TField TERM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("termId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SLUG_FIELD_DESC = new org.apache.thrift.protocol.TField("slug", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TERM_GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("termGroup", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WordpressTermsDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WordpressTermsDOTupleSchemeFactory();

  public int termId; // optional
  public java.lang.String name; // optional
  public java.lang.String slug; // optional
  public int termGroup; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TERM_ID((short)1, "termId"),
    NAME((short)2, "name"),
    SLUG((short)3, "slug"),
    TERM_GROUP((short)4, "termGroup");

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
        case 1: // TERM_ID
          return TERM_ID;
        case 2: // NAME
          return NAME;
        case 3: // SLUG
          return SLUG;
        case 4: // TERM_GROUP
          return TERM_GROUP;
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
  private static final int __TERMID_ISSET_ID = 0;
  private static final int __TERMGROUP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TERM_ID,_Fields.NAME,_Fields.SLUG,_Fields.TERM_GROUP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TERM_ID, new org.apache.thrift.meta_data.FieldMetaData("termId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SLUG, new org.apache.thrift.meta_data.FieldMetaData("slug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TERM_GROUP, new org.apache.thrift.meta_data.FieldMetaData("termGroup", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WordpressTermsDO.class, metaDataMap);
  }

  public WordpressTermsDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WordpressTermsDO(WordpressTermsDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.termId = other.termId;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetSlug()) {
      this.slug = other.slug;
    }
    this.termGroup = other.termGroup;
  }

  public WordpressTermsDO deepCopy() {
    return new WordpressTermsDO(this);
  }

  @Override
  public void clear() {
    setTermIdIsSet(false);
    this.termId = 0;
    this.name = null;
    this.slug = null;
    setTermGroupIsSet(false);
    this.termGroup = 0;
  }

  public int getTermId() {
    return this.termId;
  }

  public WordpressTermsDO setTermId(int termId) {
    this.termId = termId;
    setTermIdIsSet(true);
    return this;
  }

  public void unsetTermId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TERMID_ISSET_ID);
  }

  /** Returns true if field termId is set (has been assigned a value) and false otherwise */
  public boolean isSetTermId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TERMID_ISSET_ID);
  }

  public void setTermIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TERMID_ISSET_ID, value);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public WordpressTermsDO setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getSlug() {
    return this.slug;
  }

  public WordpressTermsDO setSlug(java.lang.String slug) {
    this.slug = slug;
    return this;
  }

  public void unsetSlug() {
    this.slug = null;
  }

  /** Returns true if field slug is set (has been assigned a value) and false otherwise */
  public boolean isSetSlug() {
    return this.slug != null;
  }

  public void setSlugIsSet(boolean value) {
    if (!value) {
      this.slug = null;
    }
  }

  public int getTermGroup() {
    return this.termGroup;
  }

  public WordpressTermsDO setTermGroup(int termGroup) {
    this.termGroup = termGroup;
    setTermGroupIsSet(true);
    return this;
  }

  public void unsetTermGroup() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TERMGROUP_ISSET_ID);
  }

  /** Returns true if field termGroup is set (has been assigned a value) and false otherwise */
  public boolean isSetTermGroup() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TERMGROUP_ISSET_ID);
  }

  public void setTermGroupIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TERMGROUP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TERM_ID:
      if (value == null) {
        unsetTermId();
      } else {
        setTermId((java.lang.Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case SLUG:
      if (value == null) {
        unsetSlug();
      } else {
        setSlug((java.lang.String)value);
      }
      break;

    case TERM_GROUP:
      if (value == null) {
        unsetTermGroup();
      } else {
        setTermGroup((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TERM_ID:
      return getTermId();

    case NAME:
      return getName();

    case SLUG:
      return getSlug();

    case TERM_GROUP:
      return getTermGroup();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TERM_ID:
      return isSetTermId();
    case NAME:
      return isSetName();
    case SLUG:
      return isSetSlug();
    case TERM_GROUP:
      return isSetTermGroup();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WordpressTermsDO)
      return this.equals((WordpressTermsDO)that);
    return false;
  }

  public boolean equals(WordpressTermsDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_termId = true && this.isSetTermId();
    boolean that_present_termId = true && that.isSetTermId();
    if (this_present_termId || that_present_termId) {
      if (!(this_present_termId && that_present_termId))
        return false;
      if (this.termId != that.termId)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_slug = true && this.isSetSlug();
    boolean that_present_slug = true && that.isSetSlug();
    if (this_present_slug || that_present_slug) {
      if (!(this_present_slug && that_present_slug))
        return false;
      if (!this.slug.equals(that.slug))
        return false;
    }

    boolean this_present_termGroup = true && this.isSetTermGroup();
    boolean that_present_termGroup = true && that.isSetTermGroup();
    if (this_present_termGroup || that_present_termGroup) {
      if (!(this_present_termGroup && that_present_termGroup))
        return false;
      if (this.termGroup != that.termGroup)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTermId()) ? 131071 : 524287);
    if (isSetTermId())
      hashCode = hashCode * 8191 + termId;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetSlug()) ? 131071 : 524287);
    if (isSetSlug())
      hashCode = hashCode * 8191 + slug.hashCode();

    hashCode = hashCode * 8191 + ((isSetTermGroup()) ? 131071 : 524287);
    if (isSetTermGroup())
      hashCode = hashCode * 8191 + termGroup;

    return hashCode;
  }

  @Override
  public int compareTo(WordpressTermsDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTermId()).compareTo(other.isSetTermId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTermId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.termId, other.termId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSlug()).compareTo(other.isSetSlug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slug, other.slug);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTermGroup()).compareTo(other.isSetTermGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTermGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.termGroup, other.termGroup);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WordpressTermsDO(");
    boolean first = true;

    if (isSetTermId()) {
      sb.append("termId:");
      sb.append(this.termId);
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetSlug()) {
      if (!first) sb.append(", ");
      sb.append("slug:");
      if (this.slug == null) {
        sb.append("null");
      } else {
        sb.append(this.slug);
      }
      first = false;
    }
    if (isSetTermGroup()) {
      if (!first) sb.append(", ");
      sb.append("termGroup:");
      sb.append(this.termGroup);
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

  private static class WordpressTermsDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WordpressTermsDOStandardScheme getScheme() {
      return new WordpressTermsDOStandardScheme();
    }
  }

  private static class WordpressTermsDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<WordpressTermsDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WordpressTermsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TERM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.termId = iprot.readI32();
              struct.setTermIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SLUG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.slug = iprot.readString();
              struct.setSlugIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TERM_GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.termGroup = iprot.readI32();
              struct.setTermGroupIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WordpressTermsDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTermId()) {
        oprot.writeFieldBegin(TERM_ID_FIELD_DESC);
        oprot.writeI32(struct.termId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.slug != null) {
        if (struct.isSetSlug()) {
          oprot.writeFieldBegin(SLUG_FIELD_DESC);
          oprot.writeString(struct.slug);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTermGroup()) {
        oprot.writeFieldBegin(TERM_GROUP_FIELD_DESC);
        oprot.writeI32(struct.termGroup);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WordpressTermsDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WordpressTermsDOTupleScheme getScheme() {
      return new WordpressTermsDOTupleScheme();
    }
  }

  private static class WordpressTermsDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<WordpressTermsDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WordpressTermsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTermId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetSlug()) {
        optionals.set(2);
      }
      if (struct.isSetTermGroup()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTermId()) {
        oprot.writeI32(struct.termId);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSlug()) {
        oprot.writeString(struct.slug);
      }
      if (struct.isSetTermGroup()) {
        oprot.writeI32(struct.termGroup);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WordpressTermsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.termId = iprot.readI32();
        struct.setTermIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.slug = iprot.readString();
        struct.setSlugIsSet(true);
      }
      if (incoming.get(3)) {
        struct.termGroup = iprot.readI32();
        struct.setTermGroupIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
