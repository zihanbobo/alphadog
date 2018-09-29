/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.employee.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-09-28")
public class BonusVOPageVO implements org.apache.thrift.TBase<BonusVOPageVO, BonusVOPageVO._Fields>, java.io.Serializable, Cloneable, Comparable<BonusVOPageVO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BonusVOPageVO");

  private static final org.apache.thrift.protocol.TField PAGE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("pageSize", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("totalRow", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TOTAL_BONUS_FIELD_DESC = new org.apache.thrift.protocol.TField("totalBonus", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BonusVOPageVOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BonusVOPageVOTupleSchemeFactory();

  public int pageNumber; // optional
  public int pageSize; // optional
  public int totalRow; // optional
  public int totalBonus; // optional
  public java.util.List<BonusVO> data; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAGE_NUMBER((short)1, "pageNumber"),
    PAGE_SIZE((short)2, "pageSize"),
    TOTAL_ROW((short)3, "totalRow"),
    TOTAL_BONUS((short)4, "totalBonus"),
    DATA((short)5, "data");

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
        case 1: // PAGE_NUMBER
          return PAGE_NUMBER;
        case 2: // PAGE_SIZE
          return PAGE_SIZE;
        case 3: // TOTAL_ROW
          return TOTAL_ROW;
        case 4: // TOTAL_BONUS
          return TOTAL_BONUS;
        case 5: // DATA
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
  private static final int __PAGENUMBER_ISSET_ID = 0;
  private static final int __PAGESIZE_ISSET_ID = 1;
  private static final int __TOTALROW_ISSET_ID = 2;
  private static final int __TOTALBONUS_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PAGE_NUMBER,_Fields.PAGE_SIZE,_Fields.TOTAL_ROW,_Fields.TOTAL_BONUS,_Fields.DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAGE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("pageNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("pageSize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_ROW, new org.apache.thrift.meta_data.FieldMetaData("totalRow", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_BONUS, new org.apache.thrift.meta_data.FieldMetaData("totalBonus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "BonusVO"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BonusVOPageVO.class, metaDataMap);
  }

  public BonusVOPageVO() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BonusVOPageVO(BonusVOPageVO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pageNumber = other.pageNumber;
    this.pageSize = other.pageSize;
    this.totalRow = other.totalRow;
    this.totalBonus = other.totalBonus;
    if (other.isSetData()) {
      java.util.List<BonusVO> __this__data = new java.util.ArrayList<BonusVO>(other.data.size());
      for (BonusVO other_element : other.data) {
        __this__data.add(other_element);
      }
      this.data = __this__data;
    }
  }

  public BonusVOPageVO deepCopy() {
    return new BonusVOPageVO(this);
  }

  @Override
  public void clear() {
    setPageNumberIsSet(false);
    this.pageNumber = 0;
    setPageSizeIsSet(false);
    this.pageSize = 0;
    setTotalRowIsSet(false);
    this.totalRow = 0;
    setTotalBonusIsSet(false);
    this.totalBonus = 0;
    this.data = null;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public BonusVOPageVO setPageNumber(int pageNumber) {
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

  public BonusVOPageVO setPageSize(int pageSize) {
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

  public BonusVOPageVO setTotalRow(int totalRow) {
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

  public int getTotalBonus() {
    return this.totalBonus;
  }

  public BonusVOPageVO setTotalBonus(int totalBonus) {
    this.totalBonus = totalBonus;
    setTotalBonusIsSet(true);
    return this;
  }

  public void unsetTotalBonus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALBONUS_ISSET_ID);
  }

  /** Returns true if field totalBonus is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalBonus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALBONUS_ISSET_ID);
  }

  public void setTotalBonusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALBONUS_ISSET_ID, value);
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<BonusVO> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(BonusVO elem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<BonusVO>();
    }
    this.data.add(elem);
  }

  public java.util.List<BonusVO> getData() {
    return this.data;
  }

  public BonusVOPageVO setData(java.util.List<BonusVO> data) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAGE_NUMBER:
      if (value == null) {
        unsetPageNumber();
      } else {
        setPageNumber((Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPageSize();
      } else {
        setPageSize((Integer)value);
      }
      break;

    case TOTAL_ROW:
      if (value == null) {
        unsetTotalRow();
      } else {
        setTotalRow((Integer)value);
      }
      break;

    case TOTAL_BONUS:
      if (value == null) {
        unsetTotalBonus();
      } else {
        setTotalBonus((Integer)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((java.util.List<BonusVO>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE_NUMBER:
      return getPageNumber();

    case PAGE_SIZE:
      return getPageSize();

    case TOTAL_ROW:
      return getTotalRow();

    case TOTAL_BONUS:
      return getTotalBonus();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAGE_NUMBER:
      return isSetPageNumber();
    case PAGE_SIZE:
      return isSetPageSize();
    case TOTAL_ROW:
      return isSetTotalRow();
    case TOTAL_BONUS:
      return isSetTotalBonus();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BonusVOPageVO)
      return this.equals((BonusVOPageVO)that);
    return false;
  }

  public boolean equals(BonusVOPageVO that) {
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

    boolean this_present_totalBonus = true && this.isSetTotalBonus();
    boolean that_present_totalBonus = true && that.isSetTotalBonus();
    if (this_present_totalBonus || that_present_totalBonus) {
      if (!(this_present_totalBonus && that_present_totalBonus))
        return false;
      if (this.totalBonus != that.totalBonus)
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

    hashCode = hashCode * 8191 + ((isSetTotalBonus()) ? 131071 : 524287);
    if (isSetTotalBonus())
      hashCode = hashCode * 8191 + totalBonus;

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BonusVOPageVO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPageNumber()).compareTo(other.isSetPageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNumber, other.pageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPageSize()).compareTo(other.isSetPageSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageSize, other.pageSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalRow()).compareTo(other.isSetTotalRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalRow, other.totalRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalBonus()).compareTo(other.isSetTotalBonus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalBonus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalBonus, other.totalBonus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
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
  public String toString() {
    StringBuilder sb = new StringBuilder("BonusVOPageVO(");
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
    if (isSetTotalBonus()) {
      if (!first) sb.append(", ");
      sb.append("totalBonus:");
      sb.append(this.totalBonus);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BonusVOPageVOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BonusVOPageVOStandardScheme getScheme() {
      return new BonusVOPageVOStandardScheme();
    }
  }

  private static class BonusVOPageVOStandardScheme extends org.apache.thrift.scheme.StandardScheme<BonusVOPageVO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BonusVOPageVO struct) throws org.apache.thrift.TException {
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
          case 4: // TOTAL_BONUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalBonus = iprot.readI32();
              struct.setTotalBonusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list74 = iprot.readListBegin();
                struct.data = new java.util.ArrayList<BonusVO>(_list74.size);
                BonusVO _elem75;
                for (int _i76 = 0; _i76 < _list74.size; ++_i76)
                {
                  _elem75 = new BonusVO();
                  _elem75.read(iprot);
                  struct.data.add(_elem75);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BonusVOPageVO struct) throws org.apache.thrift.TException {
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
      if (struct.isSetTotalBonus()) {
        oprot.writeFieldBegin(TOTAL_BONUS_FIELD_DESC);
        oprot.writeI32(struct.totalBonus);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.data.size()));
            for (BonusVO _iter77 : struct.data)
            {
              _iter77.write(oprot);
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

  private static class BonusVOPageVOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BonusVOPageVOTupleScheme getScheme() {
      return new BonusVOPageVOTupleScheme();
    }
  }

  private static class BonusVOPageVOTupleScheme extends org.apache.thrift.scheme.TupleScheme<BonusVOPageVO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BonusVOPageVO struct) throws org.apache.thrift.TException {
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
      if (struct.isSetTotalBonus()) {
        optionals.set(3);
      }
      if (struct.isSetData()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPageNumber()) {
        oprot.writeI32(struct.pageNumber);
      }
      if (struct.isSetPageSize()) {
        oprot.writeI32(struct.pageSize);
      }
      if (struct.isSetTotalRow()) {
        oprot.writeI32(struct.totalRow);
      }
      if (struct.isSetTotalBonus()) {
        oprot.writeI32(struct.totalBonus);
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (BonusVO _iter78 : struct.data)
          {
            _iter78.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BonusVOPageVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
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
        struct.totalBonus = iprot.readI32();
        struct.setTotalBonusIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list79 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.data = new java.util.ArrayList<BonusVO>(_list79.size);
          BonusVO _elem80;
          for (int _i81 = 0; _i81 < _list79.size; ++_i81)
          {
            _elem80 = new BonusVO();
            _elem80.read(iprot);
            struct.data.add(_elem80);
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
