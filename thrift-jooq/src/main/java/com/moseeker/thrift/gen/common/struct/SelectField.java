/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.common.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-07")
public class SelectField implements org.apache.thrift.TBase<SelectField, SelectField._Fields>, java.io.Serializable, Cloneable, Comparable<SelectField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SelectField");

  private static final org.apache.thrift.protocol.TField SELECT_OP_FIELD_DESC = new org.apache.thrift.protocol.TField("selectOp", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("field", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SelectFieldStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SelectFieldTupleSchemeFactory();

  /**
   * 
   * @see SelectOp
   */
  public SelectOp selectOp; // required
  public String field; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SelectOp
     */
    SELECT_OP((short)1, "selectOp"),
    FIELD((short)2, "field");

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
        case 1: // SELECT_OP
          return SELECT_OP;
        case 2: // FIELD
          return FIELD;
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
  private static final _Fields optionals[] = {_Fields.FIELD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SELECT_OP, new org.apache.thrift.meta_data.FieldMetaData("selectOp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SelectOp.class)));
    tmpMap.put(_Fields.FIELD, new org.apache.thrift.meta_data.FieldMetaData("field", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SelectField.class, metaDataMap);
  }

  public SelectField() {
    this.selectOp = SelectOp.FIELD;

  }

  public SelectField(
    SelectOp selectOp)
  {
    this();
    this.selectOp = selectOp;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SelectField(SelectField other) {
    if (other.isSetSelectOp()) {
      this.selectOp = other.selectOp;
    }
    if (other.isSetField()) {
      this.field = other.field;
    }
  }

  public SelectField deepCopy() {
    return new SelectField(this);
  }

  @Override
  public void clear() {
    this.selectOp = SelectOp.FIELD;

    this.field = null;
  }

  /**
   * 
   * @see SelectOp
   */
  public SelectOp getSelectOp() {
    return this.selectOp;
  }

  /**
   * 
   * @see SelectOp
   */
  public SelectField setSelectOp(SelectOp selectOp) {
    this.selectOp = selectOp;
    return this;
  }

  public void unsetSelectOp() {
    this.selectOp = null;
  }

  /** Returns true if field selectOp is set (has been assigned a value) and false otherwise */
  public boolean isSetSelectOp() {
    return this.selectOp != null;
  }

  public void setSelectOpIsSet(boolean value) {
    if (!value) {
      this.selectOp = null;
    }
  }

  public String getField() {
    return this.field;
  }

  public SelectField setField(String field) {
    this.field = field;
    return this;
  }

  public void unsetField() {
    this.field = null;
  }

  /** Returns true if field field is set (has been assigned a value) and false otherwise */
  public boolean isSetField() {
    return this.field != null;
  }

  public void setFieldIsSet(boolean value) {
    if (!value) {
      this.field = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SELECT_OP:
      if (value == null) {
        unsetSelectOp();
      } else {
        setSelectOp((SelectOp)value);
      }
      break;

    case FIELD:
      if (value == null) {
        unsetField();
      } else {
        setField((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SELECT_OP:
      return getSelectOp();

    case FIELD:
      return getField();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SELECT_OP:
      return isSetSelectOp();
    case FIELD:
      return isSetField();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SelectField)
      return this.equals((SelectField)that);
    return false;
  }

  public boolean equals(SelectField that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_selectOp = true && this.isSetSelectOp();
    boolean that_present_selectOp = true && that.isSetSelectOp();
    if (this_present_selectOp || that_present_selectOp) {
      if (!(this_present_selectOp && that_present_selectOp))
        return false;
      if (!this.selectOp.equals(that.selectOp))
        return false;
    }

    boolean this_present_field = true && this.isSetField();
    boolean that_present_field = true && that.isSetField();
    if (this_present_field || that_present_field) {
      if (!(this_present_field && that_present_field))
        return false;
      if (!this.field.equals(that.field))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSelectOp()) ? 131071 : 524287);
    if (isSetSelectOp())
      hashCode = hashCode * 8191 + selectOp.getValue();

    hashCode = hashCode * 8191 + ((isSetField()) ? 131071 : 524287);
    if (isSetField())
      hashCode = hashCode * 8191 + field.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SelectField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSelectOp()).compareTo(other.isSetSelectOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSelectOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.selectOp, other.selectOp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetField()).compareTo(other.isSetField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field, other.field);
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
    StringBuilder sb = new StringBuilder("SelectField(");
    boolean first = true;

    sb.append("selectOp:");
    if (this.selectOp == null) {
      sb.append("null");
    } else {
      sb.append(this.selectOp);
    }
    first = false;
    if (isSetField()) {
      if (!first) sb.append(", ");
      sb.append("field:");
      if (this.field == null) {
        sb.append("null");
      } else {
        sb.append(this.field);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SelectFieldStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SelectFieldStandardScheme getScheme() {
      return new SelectFieldStandardScheme();
    }
  }

  private static class SelectFieldStandardScheme extends org.apache.thrift.scheme.StandardScheme<SelectField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SelectField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SELECT_OP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.selectOp = SelectOp.findByValue(iprot.readI32());
              struct.setSelectOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.field = iprot.readString();
              struct.setFieldIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SelectField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.selectOp != null) {
        oprot.writeFieldBegin(SELECT_OP_FIELD_DESC);
        oprot.writeI32(struct.selectOp.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.field != null) {
        if (struct.isSetField()) {
          oprot.writeFieldBegin(FIELD_FIELD_DESC);
          oprot.writeString(struct.field);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SelectFieldTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SelectFieldTupleScheme getScheme() {
      return new SelectFieldTupleScheme();
    }
  }

  private static class SelectFieldTupleScheme extends org.apache.thrift.scheme.TupleScheme<SelectField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SelectField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSelectOp()) {
        optionals.set(0);
      }
      if (struct.isSetField()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSelectOp()) {
        oprot.writeI32(struct.selectOp.getValue());
      }
      if (struct.isSetField()) {
        oprot.writeString(struct.field);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SelectField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.selectOp = SelectOp.findByValue(iprot.readI32());
        struct.setSelectOpIsSet(true);
      }
      if (incoming.get(1)) {
        struct.field = iprot.readString();
        struct.setFieldIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

