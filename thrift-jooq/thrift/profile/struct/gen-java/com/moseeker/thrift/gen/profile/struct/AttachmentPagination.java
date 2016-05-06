/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.profile.struct;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-5")
public class AttachmentPagination implements org.apache.thrift.TBase<AttachmentPagination, AttachmentPagination._Fields>, java.io.Serializable, Cloneable, Comparable<AttachmentPagination> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AttachmentPagination");

  private static final org.apache.thrift.protocol.TField TOTAL_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("total_row", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("total_page", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PAGE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("page_number", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("page_size", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ATTACMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("attacments", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AttachmentPaginationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AttachmentPaginationTupleSchemeFactory());
  }

  public int total_row; // required
  public int total_page; // required
  public int page_number; // required
  public int page_size; // required
  public List<Attachment> attacments; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_ROW((short)1, "total_row"),
    TOTAL_PAGE((short)2, "total_page"),
    PAGE_NUMBER((short)3, "page_number"),
    PAGE_SIZE((short)4, "page_size"),
    ATTACMENTS((short)5, "attacments");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOTAL_ROW
          return TOTAL_ROW;
        case 2: // TOTAL_PAGE
          return TOTAL_PAGE;
        case 3: // PAGE_NUMBER
          return PAGE_NUMBER;
        case 4: // PAGE_SIZE
          return PAGE_SIZE;
        case 5: // ATTACMENTS
          return ATTACMENTS;
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
  private static final int __TOTAL_ROW_ISSET_ID = 0;
  private static final int __TOTAL_PAGE_ISSET_ID = 1;
  private static final int __PAGE_NUMBER_ISSET_ID = 2;
  private static final int __PAGE_SIZE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_ROW, new org.apache.thrift.meta_data.FieldMetaData("total_row", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_PAGE, new org.apache.thrift.meta_data.FieldMetaData("total_page", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("page_number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("page_size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ATTACMENTS, new org.apache.thrift.meta_data.FieldMetaData("attacments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Attachment.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AttachmentPagination.class, metaDataMap);
  }

  public AttachmentPagination() {
  }

  public AttachmentPagination(
    int total_row,
    int total_page,
    int page_number,
    int page_size,
    List<Attachment> attacments)
  {
    this();
    this.total_row = total_row;
    setTotal_rowIsSet(true);
    this.total_page = total_page;
    setTotal_pageIsSet(true);
    this.page_number = page_number;
    setPage_numberIsSet(true);
    this.page_size = page_size;
    setPage_sizeIsSet(true);
    this.attacments = attacments;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AttachmentPagination(AttachmentPagination other) {
    __isset_bitfield = other.__isset_bitfield;
    this.total_row = other.total_row;
    this.total_page = other.total_page;
    this.page_number = other.page_number;
    this.page_size = other.page_size;
    if (other.isSetAttacments()) {
      List<Attachment> __this__attacments = new ArrayList<Attachment>(other.attacments.size());
      for (Attachment other_element : other.attacments) {
        __this__attacments.add(new Attachment(other_element));
      }
      this.attacments = __this__attacments;
    }
  }

  public AttachmentPagination deepCopy() {
    return new AttachmentPagination(this);
  }

  @Override
  public void clear() {
    setTotal_rowIsSet(false);
    this.total_row = 0;
    setTotal_pageIsSet(false);
    this.total_page = 0;
    setPage_numberIsSet(false);
    this.page_number = 0;
    setPage_sizeIsSet(false);
    this.page_size = 0;
    this.attacments = null;
  }

  public int getTotal_row() {
    return this.total_row;
  }

  public AttachmentPagination setTotal_row(int total_row) {
    this.total_row = total_row;
    setTotal_rowIsSet(true);
    return this;
  }

  public void unsetTotal_row() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ROW_ISSET_ID);
  }

  /** Returns true if field total_row is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal_row() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_ROW_ISSET_ID);
  }

  public void setTotal_rowIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_ROW_ISSET_ID, value);
  }

  public int getTotal_page() {
    return this.total_page;
  }

  public AttachmentPagination setTotal_page(int total_page) {
    this.total_page = total_page;
    setTotal_pageIsSet(true);
    return this;
  }

  public void unsetTotal_page() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_PAGE_ISSET_ID);
  }

  /** Returns true if field total_page is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal_page() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_PAGE_ISSET_ID);
  }

  public void setTotal_pageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_PAGE_ISSET_ID, value);
  }

  public int getPage_number() {
    return this.page_number;
  }

  public AttachmentPagination setPage_number(int page_number) {
    this.page_number = page_number;
    setPage_numberIsSet(true);
    return this;
  }

  public void unsetPage_number() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGE_NUMBER_ISSET_ID);
  }

  /** Returns true if field page_number is set (has been assigned a value) and false otherwise */
  public boolean isSetPage_number() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGE_NUMBER_ISSET_ID);
  }

  public void setPage_numberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGE_NUMBER_ISSET_ID, value);
  }

  public int getPage_size() {
    return this.page_size;
  }

  public AttachmentPagination setPage_size(int page_size) {
    this.page_size = page_size;
    setPage_sizeIsSet(true);
    return this;
  }

  public void unsetPage_size() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGE_SIZE_ISSET_ID);
  }

  /** Returns true if field page_size is set (has been assigned a value) and false otherwise */
  public boolean isSetPage_size() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGE_SIZE_ISSET_ID);
  }

  public void setPage_sizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGE_SIZE_ISSET_ID, value);
  }

  public int getAttacmentsSize() {
    return (this.attacments == null) ? 0 : this.attacments.size();
  }

  public java.util.Iterator<Attachment> getAttacmentsIterator() {
    return (this.attacments == null) ? null : this.attacments.iterator();
  }

  public void addToAttacments(Attachment elem) {
    if (this.attacments == null) {
      this.attacments = new ArrayList<Attachment>();
    }
    this.attacments.add(elem);
  }

  public List<Attachment> getAttacments() {
    return this.attacments;
  }

  public AttachmentPagination setAttacments(List<Attachment> attacments) {
    this.attacments = attacments;
    return this;
  }

  public void unsetAttacments() {
    this.attacments = null;
  }

  /** Returns true if field attacments is set (has been assigned a value) and false otherwise */
  public boolean isSetAttacments() {
    return this.attacments != null;
  }

  public void setAttacmentsIsSet(boolean value) {
    if (!value) {
      this.attacments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL_ROW:
      if (value == null) {
        unsetTotal_row();
      } else {
        setTotal_row((Integer)value);
      }
      break;

    case TOTAL_PAGE:
      if (value == null) {
        unsetTotal_page();
      } else {
        setTotal_page((Integer)value);
      }
      break;

    case PAGE_NUMBER:
      if (value == null) {
        unsetPage_number();
      } else {
        setPage_number((Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPage_size();
      } else {
        setPage_size((Integer)value);
      }
      break;

    case ATTACMENTS:
      if (value == null) {
        unsetAttacments();
      } else {
        setAttacments((List<Attachment>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_ROW:
      return Integer.valueOf(getTotal_row());

    case TOTAL_PAGE:
      return Integer.valueOf(getTotal_page());

    case PAGE_NUMBER:
      return Integer.valueOf(getPage_number());

    case PAGE_SIZE:
      return Integer.valueOf(getPage_size());

    case ATTACMENTS:
      return getAttacments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_ROW:
      return isSetTotal_row();
    case TOTAL_PAGE:
      return isSetTotal_page();
    case PAGE_NUMBER:
      return isSetPage_number();
    case PAGE_SIZE:
      return isSetPage_size();
    case ATTACMENTS:
      return isSetAttacments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AttachmentPagination)
      return this.equals((AttachmentPagination)that);
    return false;
  }

  public boolean equals(AttachmentPagination that) {
    if (that == null)
      return false;

    boolean this_present_total_row = true;
    boolean that_present_total_row = true;
    if (this_present_total_row || that_present_total_row) {
      if (!(this_present_total_row && that_present_total_row))
        return false;
      if (this.total_row != that.total_row)
        return false;
    }

    boolean this_present_total_page = true;
    boolean that_present_total_page = true;
    if (this_present_total_page || that_present_total_page) {
      if (!(this_present_total_page && that_present_total_page))
        return false;
      if (this.total_page != that.total_page)
        return false;
    }

    boolean this_present_page_number = true;
    boolean that_present_page_number = true;
    if (this_present_page_number || that_present_page_number) {
      if (!(this_present_page_number && that_present_page_number))
        return false;
      if (this.page_number != that.page_number)
        return false;
    }

    boolean this_present_page_size = true;
    boolean that_present_page_size = true;
    if (this_present_page_size || that_present_page_size) {
      if (!(this_present_page_size && that_present_page_size))
        return false;
      if (this.page_size != that.page_size)
        return false;
    }

    boolean this_present_attacments = true && this.isSetAttacments();
    boolean that_present_attacments = true && that.isSetAttacments();
    if (this_present_attacments || that_present_attacments) {
      if (!(this_present_attacments && that_present_attacments))
        return false;
      if (!this.attacments.equals(that.attacments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_total_row = true;
    list.add(present_total_row);
    if (present_total_row)
      list.add(total_row);

    boolean present_total_page = true;
    list.add(present_total_page);
    if (present_total_page)
      list.add(total_page);

    boolean present_page_number = true;
    list.add(present_page_number);
    if (present_page_number)
      list.add(page_number);

    boolean present_page_size = true;
    list.add(present_page_size);
    if (present_page_size)
      list.add(page_size);

    boolean present_attacments = true && (isSetAttacments());
    list.add(present_attacments);
    if (present_attacments)
      list.add(attacments);

    return list.hashCode();
  }

  @Override
  public int compareTo(AttachmentPagination other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTotal_row()).compareTo(other.isSetTotal_row());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal_row()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_row, other.total_row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal_page()).compareTo(other.isSetTotal_page());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal_page()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_page, other.total_page);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPage_number()).compareTo(other.isSetPage_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPage_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page_number, other.page_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPage_size()).compareTo(other.isSetPage_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPage_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page_size, other.page_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttacments()).compareTo(other.isSetAttacments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttacments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attacments, other.attacments);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AttachmentPagination(");
    boolean first = true;

    sb.append("total_row:");
    sb.append(this.total_row);
    first = false;
    if (!first) sb.append(", ");
    sb.append("total_page:");
    sb.append(this.total_page);
    first = false;
    if (!first) sb.append(", ");
    sb.append("page_number:");
    sb.append(this.page_number);
    first = false;
    if (!first) sb.append(", ");
    sb.append("page_size:");
    sb.append(this.page_size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("attacments:");
    if (this.attacments == null) {
      sb.append("null");
    } else {
      sb.append(this.attacments);
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AttachmentPaginationStandardSchemeFactory implements SchemeFactory {
    public AttachmentPaginationStandardScheme getScheme() {
      return new AttachmentPaginationStandardScheme();
    }
  }

  private static class AttachmentPaginationStandardScheme extends StandardScheme<AttachmentPagination> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AttachmentPagination struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_row = iprot.readI32();
              struct.setTotal_rowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_PAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_page = iprot.readI32();
              struct.setTotal_pageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAGE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_number = iprot.readI32();
              struct.setPage_numberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_size = iprot.readI32();
              struct.setPage_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ATTACMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.attacments = new ArrayList<Attachment>(_list18.size);
                Attachment _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = new Attachment();
                  _elem19.read(iprot);
                  struct.attacments.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setAttacmentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AttachmentPagination struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_ROW_FIELD_DESC);
      oprot.writeI32(struct.total_row);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_PAGE_FIELD_DESC);
      oprot.writeI32(struct.total_page);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.page_number);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.page_size);
      oprot.writeFieldEnd();
      if (struct.attacments != null) {
        oprot.writeFieldBegin(ATTACMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.attacments.size()));
          for (Attachment _iter21 : struct.attacments)
          {
            _iter21.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AttachmentPaginationTupleSchemeFactory implements SchemeFactory {
    public AttachmentPaginationTupleScheme getScheme() {
      return new AttachmentPaginationTupleScheme();
    }
  }

  private static class AttachmentPaginationTupleScheme extends TupleScheme<AttachmentPagination> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AttachmentPagination struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTotal_row()) {
        optionals.set(0);
      }
      if (struct.isSetTotal_page()) {
        optionals.set(1);
      }
      if (struct.isSetPage_number()) {
        optionals.set(2);
      }
      if (struct.isSetPage_size()) {
        optionals.set(3);
      }
      if (struct.isSetAttacments()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTotal_row()) {
        oprot.writeI32(struct.total_row);
      }
      if (struct.isSetTotal_page()) {
        oprot.writeI32(struct.total_page);
      }
      if (struct.isSetPage_number()) {
        oprot.writeI32(struct.page_number);
      }
      if (struct.isSetPage_size()) {
        oprot.writeI32(struct.page_size);
      }
      if (struct.isSetAttacments()) {
        {
          oprot.writeI32(struct.attacments.size());
          for (Attachment _iter22 : struct.attacments)
          {
            _iter22.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AttachmentPagination struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.total_row = iprot.readI32();
        struct.setTotal_rowIsSet(true);
      }
      if (incoming.get(1)) {
        struct.total_page = iprot.readI32();
        struct.setTotal_pageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.page_number = iprot.readI32();
        struct.setPage_numberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.page_size = iprot.readI32();
        struct.setPage_sizeIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.attacments = new ArrayList<Attachment>(_list23.size);
          Attachment _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = new Attachment();
            _elem24.read(iprot);
            struct.attacments.add(_elem24);
          }
        }
        struct.setAttacmentsIsSet(true);
      }
    }
  }

}

