/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-06")
public class UserEmployeeVOPageVO implements org.apache.thrift.TBase<UserEmployeeVOPageVO, UserEmployeeVOPageVO._Fields>, java.io.Serializable, Cloneable, Comparable<UserEmployeeVOPageVO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserEmployeeVOPageVO");

  private static final org.apache.thrift.protocol.TField PAGE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("pageSize", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("totalRow", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserEmployeeVOPageVOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserEmployeeVOPageVOTupleSchemeFactory();

  public int pageNumber; // optional
  public int pageSize; // optional
  public int totalRow; // optional
  public java.util.List<UserEmployeeVO> data; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAGE_NUMBER((short)1, "pageNumber"),
    PAGE_SIZE((short)2, "pageSize"),
    TOTAL_ROW((short)3, "totalRow"),
    DATA((short)4, "data");

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
        case 1: // PAGE_NUMBER
          return PAGE_NUMBER;
        case 2: // PAGE_SIZE
          return PAGE_SIZE;
        case 3: // TOTAL_ROW
          return TOTAL_ROW;
        case 4: // DATA
          return DATA;
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
  private static final int __PAGENUMBER_ISSET_ID = 0;
  private static final int __PAGESIZE_ISSET_ID = 1;
  private static final int __TOTALROW_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PAGE_NUMBER,_Fields.PAGE_SIZE,_Fields.TOTAL_ROW,_Fields.DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAGE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("pageNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("pageSize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_ROW, new org.apache.thrift.meta_data.FieldMetaData("totalRow", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserEmployeeVO.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserEmployeeVOPageVO.class, metaDataMap);
  }

  public UserEmployeeVOPageVO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserEmployeeVOPageVO(UserEmployeeVOPageVO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pageNumber = other.pageNumber;
    this.pageSize = other.pageSize;
    this.totalRow = other.totalRow;
    if (other.isSetData()) {
      java.util.List<UserEmployeeVO> __this__data = new java.util.ArrayList<UserEmployeeVO>(other.data.size());
      for (UserEmployeeVO other_element : other.data) {
        __this__data.add(new UserEmployeeVO(other_element));
      }
      this.data = __this__data;
    }
  }

  public UserEmployeeVOPageVO deepCopy() {
    return new UserEmployeeVOPageVO(this);
  }

  @Override
  public void clear() {
    setPageNumberIsSet(false);
    this.pageNumber = 0;
    setPageSizeIsSet(false);
    this.pageSize = 0;
    setTotalRowIsSet(false);
    this.totalRow = 0;
    this.data = null;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public UserEmployeeVOPageVO setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
    setPageNumberIsSet(true);
    return this;
  }

  public void unsetPageNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGENUMBER_ISSET_ID);
  }

  /** Returns true if field pageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetPageNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGENUMBER_ISSET_ID);
  }

  public void setPageNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGENUMBER_ISSET_ID, value);
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public UserEmployeeVOPageVO setPageSize(int pageSize) {
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    return this;
  }

  public void unsetPageSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  /** Returns true if field pageSize is set (has been assigned a value) and false otherwise */
  public boolean isSetPageSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  public void setPageSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGESIZE_ISSET_ID, value);
  }

  public int getTotalRow() {
    return this.totalRow;
  }

  public UserEmployeeVOPageVO setTotalRow(int totalRow) {
    this.totalRow = totalRow;
    setTotalRowIsSet(true);
    return this;
  }

  public void unsetTotalRow() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALROW_ISSET_ID);
  }

  /** Returns true if field totalRow is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalRow() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALROW_ISSET_ID);
  }

  public void setTotalRowIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALROW_ISSET_ID, value);
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<UserEmployeeVO> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(UserEmployeeVO elem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<UserEmployeeVO>();
    }
    this.data.add(elem);
  }

  public java.util.List<UserEmployeeVO> getData() {
    return this.data;
  }

  public UserEmployeeVOPageVO setData(java.util.List<UserEmployeeVO> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PAGE_NUMBER:
      if (value == null) {
        unsetPageNumber();
      } else {
        setPageNumber((java.lang.Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPageSize();
      } else {
        setPageSize((java.lang.Integer)value);
      }
      break;

    case TOTAL_ROW:
      if (value == null) {
        unsetTotalRow();
      } else {
        setTotalRow((java.lang.Integer)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((java.util.List<UserEmployeeVO>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE_NUMBER:
      return getPageNumber();

    case PAGE_SIZE:
      return getPageSize();

    case TOTAL_ROW:
      return getTotalRow();

    case DATA:
      return getData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PAGE_NUMBER:
      return isSetPageNumber();
    case PAGE_SIZE:
      return isSetPageSize();
    case TOTAL_ROW:
      return isSetTotalRow();
    case DATA:
      return isSetData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserEmployeeVOPageVO)
      return this.equals((UserEmployeeVOPageVO)that);
    return false;
  }

  public boolean equals(UserEmployeeVOPageVO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pageNumber = true && this.isSetPageNumber();
    boolean that_present_pageNumber = true && that.isSetPageNumber();
    if (this_present_pageNumber || that_present_pageNumber) {
      if (!(this_present_pageNumber && that_present_pageNumber))
        return false;
      if (this.pageNumber != that.pageNumber)
        return false;
    }

    boolean this_present_pageSize = true && this.isSetPageSize();
    boolean that_present_pageSize = true && that.isSetPageSize();
    if (this_present_pageSize || that_present_pageSize) {
      if (!(this_present_pageSize && that_present_pageSize))
        return false;
      if (this.pageSize != that.pageSize)
        return false;
    }

    boolean this_present_totalRow = true && this.isSetTotalRow();
    boolean that_present_totalRow = true && that.isSetTotalRow();
    if (this_present_totalRow || that_present_totalRow) {
      if (!(this_present_totalRow && that_present_totalRow))
        return false;
      if (this.totalRow != that.totalRow)
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPageNumber()) ? 131071 : 524287);
    if (isSetPageNumber())
      hashCode = hashCode * 8191 + pageNumber;

    hashCode = hashCode * 8191 + ((isSetPageSize()) ? 131071 : 524287);
    if (isSetPageSize())
      hashCode = hashCode * 8191 + pageSize;

    hashCode = hashCode * 8191 + ((isSetTotalRow()) ? 131071 : 524287);
    if (isSetTotalRow())
      hashCode = hashCode * 8191 + totalRow;

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserEmployeeVOPageVO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPageNumber()).compareTo(other.isSetPageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNumber, other.pageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPageSize()).compareTo(other.isSetPageSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageSize, other.pageSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotalRow()).compareTo(other.isSetTotalRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalRow, other.totalRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEmployeeVOPageVO(");
    boolean first = true;

    if (isSetPageNumber()) {
      sb.append("pageNumber:");
      sb.append(this.pageNumber);
      first = false;
    }
    if (isSetPageSize()) {
      if (!first) sb.append(", ");
      sb.append("pageSize:");
      sb.append(this.pageSize);
      first = false;
    }
    if (isSetTotalRow()) {
      if (!first) sb.append(", ");
      sb.append("totalRow:");
      sb.append(this.totalRow);
      first = false;
    }
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
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

  private static class UserEmployeeVOPageVOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserEmployeeVOPageVOStandardScheme getScheme() {
      return new UserEmployeeVOPageVOStandardScheme();
    }
  }

  private static class UserEmployeeVOPageVOStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserEmployeeVOPageVO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserEmployeeVOPageVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAGE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageNumber = iprot.readI32();
              struct.setPageNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageSize = iprot.readI32();
              struct.setPageSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalRow = iprot.readI32();
              struct.setTotalRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
                struct.data = new java.util.ArrayList<UserEmployeeVO>(_list58.size);
                UserEmployeeVO _elem59;
                for (int _i60 = 0; _i60 < _list58.size; ++_i60)
                {
                  _elem59 = new UserEmployeeVO();
                  _elem59.read(iprot);
                  struct.data.add(_elem59);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserEmployeeVOPageVO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPageNumber()) {
        oprot.writeFieldBegin(PAGE_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.pageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPageSize()) {
        oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
        oprot.writeI32(struct.pageSize);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalRow()) {
        oprot.writeFieldBegin(TOTAL_ROW_FIELD_DESC);
        oprot.writeI32(struct.totalRow);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.data.size()));
            for (UserEmployeeVO _iter61 : struct.data)
            {
              _iter61.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserEmployeeVOPageVOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserEmployeeVOPageVOTupleScheme getScheme() {
      return new UserEmployeeVOPageVOTupleScheme();
    }
  }

  private static class UserEmployeeVOPageVOTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserEmployeeVOPageVO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserEmployeeVOPageVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPageNumber()) {
        optionals.set(0);
      }
      if (struct.isSetPageSize()) {
        optionals.set(1);
      }
      if (struct.isSetTotalRow()) {
        optionals.set(2);
      }
      if (struct.isSetData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPageNumber()) {
        oprot.writeI32(struct.pageNumber);
      }
      if (struct.isSetPageSize()) {
        oprot.writeI32(struct.pageSize);
      }
      if (struct.isSetTotalRow()) {
        oprot.writeI32(struct.totalRow);
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (UserEmployeeVO _iter62 : struct.data)
          {
            _iter62.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserEmployeeVOPageVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.pageNumber = iprot.readI32();
        struct.setPageNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pageSize = iprot.readI32();
        struct.setPageSizeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalRow = iprot.readI32();
        struct.setTotalRowIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list63 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.data = new java.util.ArrayList<UserEmployeeVO>(_list63.size);
          UserEmployeeVO _elem64;
          for (int _i65 = 0; _i65 < _list63.size; ++_i65)
          {
            _elem64 = new UserEmployeeVO();
            _elem64.read(iprot);
            struct.data.add(_elem64);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

