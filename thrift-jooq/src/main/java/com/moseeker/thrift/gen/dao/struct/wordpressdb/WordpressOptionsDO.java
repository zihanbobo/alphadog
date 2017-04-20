/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.dao.struct.wordpressdb;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-21")
public class WordpressOptionsDO implements org.apache.thrift.TBase<WordpressOptionsDO, WordpressOptionsDO._Fields>, java.io.Serializable, Cloneable, Comparable<WordpressOptionsDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WordpressOptionsDO");

  private static final org.apache.thrift.protocol.TField OPTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("optionId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OPTION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("optionName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OPTION_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("optionValue", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AUTOLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("autoload", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WordpressOptionsDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WordpressOptionsDOTupleSchemeFactory();

  public int optionId; // optional
  public java.lang.String optionName; // optional
  public java.lang.String optionValue; // optional
  public java.lang.String autoload; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPTION_ID((short)1, "optionId"),
    OPTION_NAME((short)2, "optionName"),
    OPTION_VALUE((short)3, "optionValue"),
    AUTOLOAD((short)4, "autoload");

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
        case 1: // OPTION_ID
          return OPTION_ID;
        case 2: // OPTION_NAME
          return OPTION_NAME;
        case 3: // OPTION_VALUE
          return OPTION_VALUE;
        case 4: // AUTOLOAD
          return AUTOLOAD;
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
  private static final int __OPTIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPTION_ID,_Fields.OPTION_NAME,_Fields.OPTION_VALUE,_Fields.AUTOLOAD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPTION_ID, new org.apache.thrift.meta_data.FieldMetaData("optionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPTION_NAME, new org.apache.thrift.meta_data.FieldMetaData("optionName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPTION_VALUE, new org.apache.thrift.meta_data.FieldMetaData("optionValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTOLOAD, new org.apache.thrift.meta_data.FieldMetaData("autoload", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WordpressOptionsDO.class, metaDataMap);
  }

  public WordpressOptionsDO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WordpressOptionsDO(WordpressOptionsDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.optionId = other.optionId;
    if (other.isSetOptionName()) {
      this.optionName = other.optionName;
    }
    if (other.isSetOptionValue()) {
      this.optionValue = other.optionValue;
    }
    if (other.isSetAutoload()) {
      this.autoload = other.autoload;
    }
  }

  public WordpressOptionsDO deepCopy() {
    return new WordpressOptionsDO(this);
  }

  @Override
  public void clear() {
    setOptionIdIsSet(false);
    this.optionId = 0;
    this.optionName = null;
    this.optionValue = null;
    this.autoload = null;
  }

  public int getOptionId() {
    return this.optionId;
  }

  public WordpressOptionsDO setOptionId(int optionId) {
    this.optionId = optionId;
    setOptionIdIsSet(true);
    return this;
  }

  public void unsetOptionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPTIONID_ISSET_ID);
  }

  /** Returns true if field optionId is set (has been assigned a value) and false otherwise */
  public boolean isSetOptionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPTIONID_ISSET_ID);
  }

  public void setOptionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPTIONID_ISSET_ID, value);
  }

  public java.lang.String getOptionName() {
    return this.optionName;
  }

  public WordpressOptionsDO setOptionName(java.lang.String optionName) {
    this.optionName = optionName;
    return this;
  }

  public void unsetOptionName() {
    this.optionName = null;
  }

  /** Returns true if field optionName is set (has been assigned a value) and false otherwise */
  public boolean isSetOptionName() {
    return this.optionName != null;
  }

  public void setOptionNameIsSet(boolean value) {
    if (!value) {
      this.optionName = null;
    }
  }

  public java.lang.String getOptionValue() {
    return this.optionValue;
  }

  public WordpressOptionsDO setOptionValue(java.lang.String optionValue) {
    this.optionValue = optionValue;
    return this;
  }

  public void unsetOptionValue() {
    this.optionValue = null;
  }

  /** Returns true if field optionValue is set (has been assigned a value) and false otherwise */
  public boolean isSetOptionValue() {
    return this.optionValue != null;
  }

  public void setOptionValueIsSet(boolean value) {
    if (!value) {
      this.optionValue = null;
    }
  }

  public java.lang.String getAutoload() {
    return this.autoload;
  }

  public WordpressOptionsDO setAutoload(java.lang.String autoload) {
    this.autoload = autoload;
    return this;
  }

  public void unsetAutoload() {
    this.autoload = null;
  }

  /** Returns true if field autoload is set (has been assigned a value) and false otherwise */
  public boolean isSetAutoload() {
    return this.autoload != null;
  }

  public void setAutoloadIsSet(boolean value) {
    if (!value) {
      this.autoload = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OPTION_ID:
      if (value == null) {
        unsetOptionId();
      } else {
        setOptionId((java.lang.Integer)value);
      }
      break;

    case OPTION_NAME:
      if (value == null) {
        unsetOptionName();
      } else {
        setOptionName((java.lang.String)value);
      }
      break;

    case OPTION_VALUE:
      if (value == null) {
        unsetOptionValue();
      } else {
        setOptionValue((java.lang.String)value);
      }
      break;

    case AUTOLOAD:
      if (value == null) {
        unsetAutoload();
      } else {
        setAutoload((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OPTION_ID:
      return getOptionId();

    case OPTION_NAME:
      return getOptionName();

    case OPTION_VALUE:
      return getOptionValue();

    case AUTOLOAD:
      return getAutoload();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OPTION_ID:
      return isSetOptionId();
    case OPTION_NAME:
      return isSetOptionName();
    case OPTION_VALUE:
      return isSetOptionValue();
    case AUTOLOAD:
      return isSetAutoload();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WordpressOptionsDO)
      return this.equals((WordpressOptionsDO)that);
    return false;
  }

  public boolean equals(WordpressOptionsDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_optionId = true && this.isSetOptionId();
    boolean that_present_optionId = true && that.isSetOptionId();
    if (this_present_optionId || that_present_optionId) {
      if (!(this_present_optionId && that_present_optionId))
        return false;
      if (this.optionId != that.optionId)
        return false;
    }

    boolean this_present_optionName = true && this.isSetOptionName();
    boolean that_present_optionName = true && that.isSetOptionName();
    if (this_present_optionName || that_present_optionName) {
      if (!(this_present_optionName && that_present_optionName))
        return false;
      if (!this.optionName.equals(that.optionName))
        return false;
    }

    boolean this_present_optionValue = true && this.isSetOptionValue();
    boolean that_present_optionValue = true && that.isSetOptionValue();
    if (this_present_optionValue || that_present_optionValue) {
      if (!(this_present_optionValue && that_present_optionValue))
        return false;
      if (!this.optionValue.equals(that.optionValue))
        return false;
    }

    boolean this_present_autoload = true && this.isSetAutoload();
    boolean that_present_autoload = true && that.isSetAutoload();
    if (this_present_autoload || that_present_autoload) {
      if (!(this_present_autoload && that_present_autoload))
        return false;
      if (!this.autoload.equals(that.autoload))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOptionId()) ? 131071 : 524287);
    if (isSetOptionId())
      hashCode = hashCode * 8191 + optionId;

    hashCode = hashCode * 8191 + ((isSetOptionName()) ? 131071 : 524287);
    if (isSetOptionName())
      hashCode = hashCode * 8191 + optionName.hashCode();

    hashCode = hashCode * 8191 + ((isSetOptionValue()) ? 131071 : 524287);
    if (isSetOptionValue())
      hashCode = hashCode * 8191 + optionValue.hashCode();

    hashCode = hashCode * 8191 + ((isSetAutoload()) ? 131071 : 524287);
    if (isSetAutoload())
      hashCode = hashCode * 8191 + autoload.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WordpressOptionsDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOptionId()).compareTo(other.isSetOptionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.optionId, other.optionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOptionName()).compareTo(other.isSetOptionName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptionName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.optionName, other.optionName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOptionValue()).compareTo(other.isSetOptionValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptionValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.optionValue, other.optionValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAutoload()).compareTo(other.isSetAutoload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAutoload()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.autoload, other.autoload);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WordpressOptionsDO(");
    boolean first = true;

    if (isSetOptionId()) {
      sb.append("optionId:");
      sb.append(this.optionId);
      first = false;
    }
    if (isSetOptionName()) {
      if (!first) sb.append(", ");
      sb.append("optionName:");
      if (this.optionName == null) {
        sb.append("null");
      } else {
        sb.append(this.optionName);
      }
      first = false;
    }
    if (isSetOptionValue()) {
      if (!first) sb.append(", ");
      sb.append("optionValue:");
      if (this.optionValue == null) {
        sb.append("null");
      } else {
        sb.append(this.optionValue);
      }
      first = false;
    }
    if (isSetAutoload()) {
      if (!first) sb.append(", ");
      sb.append("autoload:");
      if (this.autoload == null) {
        sb.append("null");
      } else {
        sb.append(this.autoload);
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

  private static class WordpressOptionsDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WordpressOptionsDOStandardScheme getScheme() {
      return new WordpressOptionsDOStandardScheme();
    }
  }

  private static class WordpressOptionsDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<WordpressOptionsDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WordpressOptionsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.optionId = iprot.readI32();
              struct.setOptionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPTION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.optionName = iprot.readString();
              struct.setOptionNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPTION_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.optionValue = iprot.readString();
              struct.setOptionValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AUTOLOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.autoload = iprot.readString();
              struct.setAutoloadIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WordpressOptionsDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetOptionId()) {
        oprot.writeFieldBegin(OPTION_ID_FIELD_DESC);
        oprot.writeI32(struct.optionId);
        oprot.writeFieldEnd();
      }
      if (struct.optionName != null) {
        if (struct.isSetOptionName()) {
          oprot.writeFieldBegin(OPTION_NAME_FIELD_DESC);
          oprot.writeString(struct.optionName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.optionValue != null) {
        if (struct.isSetOptionValue()) {
          oprot.writeFieldBegin(OPTION_VALUE_FIELD_DESC);
          oprot.writeString(struct.optionValue);
          oprot.writeFieldEnd();
        }
      }
      if (struct.autoload != null) {
        if (struct.isSetAutoload()) {
          oprot.writeFieldBegin(AUTOLOAD_FIELD_DESC);
          oprot.writeString(struct.autoload);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WordpressOptionsDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WordpressOptionsDOTupleScheme getScheme() {
      return new WordpressOptionsDOTupleScheme();
    }
  }

  private static class WordpressOptionsDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<WordpressOptionsDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WordpressOptionsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOptionId()) {
        optionals.set(0);
      }
      if (struct.isSetOptionName()) {
        optionals.set(1);
      }
      if (struct.isSetOptionValue()) {
        optionals.set(2);
      }
      if (struct.isSetAutoload()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOptionId()) {
        oprot.writeI32(struct.optionId);
      }
      if (struct.isSetOptionName()) {
        oprot.writeString(struct.optionName);
      }
      if (struct.isSetOptionValue()) {
        oprot.writeString(struct.optionValue);
      }
      if (struct.isSetAutoload()) {
        oprot.writeString(struct.autoload);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WordpressOptionsDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.optionId = iprot.readI32();
        struct.setOptionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.optionName = iprot.readString();
        struct.setOptionNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.optionValue = iprot.readString();
        struct.setOptionValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.autoload = iprot.readString();
        struct.setAutoloadIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
