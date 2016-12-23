/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.application.struct;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-23")
public class ProcessValidationStruct implements org.apache.thrift.TBase<ProcessValidationStruct, ProcessValidationStruct._Fields>, java.io.Serializable, Cloneable, Comparable<ProcessValidationStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessValidationStruct");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RECOMMENDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recommender_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RECRUIT_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("recruit_order", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TEMPLATE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("template_id", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField REWARD_FIELD_DESC = new org.apache.thrift.protocol.TField("reward", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProcessValidationStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProcessValidationStructTupleSchemeFactory());
  }

  public int id; // optional
  public int company_id; // optional
  public int recommender_id; // optional
  public int recruit_order; // optional
  public int template_id; // optional
  public long reward; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COMPANY_ID((short)2, "company_id"),
    RECOMMENDER_ID((short)3, "recommender_id"),
    RECRUIT_ORDER((short)4, "recruit_order"),
    TEMPLATE_ID((short)5, "template_id"),
    REWARD((short)6, "reward");

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
        case 1: // ID
          return ID;
        case 2: // COMPANY_ID
          return COMPANY_ID;
        case 3: // RECOMMENDER_ID
          return RECOMMENDER_ID;
        case 4: // RECRUIT_ORDER
          return RECRUIT_ORDER;
        case 5: // TEMPLATE_ID
          return TEMPLATE_ID;
        case 6: // REWARD
          return REWARD;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __COMPANY_ID_ISSET_ID = 1;
  private static final int __RECOMMENDER_ID_ISSET_ID = 2;
  private static final int __RECRUIT_ORDER_ISSET_ID = 3;
  private static final int __TEMPLATE_ID_ISSET_ID = 4;
  private static final int __REWARD_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.COMPANY_ID,_Fields.RECOMMENDER_ID,_Fields.RECRUIT_ORDER,_Fields.TEMPLATE_ID,_Fields.REWARD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECOMMENDER_ID, new org.apache.thrift.meta_data.FieldMetaData("recommender_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECRUIT_ORDER, new org.apache.thrift.meta_data.FieldMetaData("recruit_order", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TEMPLATE_ID, new org.apache.thrift.meta_data.FieldMetaData("template_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REWARD, new org.apache.thrift.meta_data.FieldMetaData("reward", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessValidationStruct.class, metaDataMap);
  }

  public ProcessValidationStruct() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessValidationStruct(ProcessValidationStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.company_id = other.company_id;
    this.recommender_id = other.recommender_id;
    this.recruit_order = other.recruit_order;
    this.template_id = other.template_id;
    this.reward = other.reward;
  }

  public ProcessValidationStruct deepCopy() {
    return new ProcessValidationStruct(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setCompany_idIsSet(false);
    this.company_id = 0;
    setRecommender_idIsSet(false);
    this.recommender_id = 0;
    setRecruit_orderIsSet(false);
    this.recruit_order = 0;
    setTemplate_idIsSet(false);
    this.template_id = 0;
    setRewardIsSet(false);
    this.reward = 0;
  }

  public int getId() {
    return this.id;
  }

  public ProcessValidationStruct setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getCompany_id() {
    return this.company_id;
  }

  public ProcessValidationStruct setCompany_id(int company_id) {
    this.company_id = company_id;
    setCompany_idIsSet(true);
    return this;
  }

  public void unsetCompany_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  /** Returns true if field company_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCompany_id() {
    return EncodingUtils.testBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  public void setCompany_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMPANY_ID_ISSET_ID, value);
  }

  public int getRecommender_id() {
    return this.recommender_id;
  }

  public ProcessValidationStruct setRecommender_id(int recommender_id) {
    this.recommender_id = recommender_id;
    setRecommender_idIsSet(true);
    return this;
  }

  public void unsetRecommender_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECOMMENDER_ID_ISSET_ID);
  }

  /** Returns true if field recommender_id is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommender_id() {
    return EncodingUtils.testBit(__isset_bitfield, __RECOMMENDER_ID_ISSET_ID);
  }

  public void setRecommender_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECOMMENDER_ID_ISSET_ID, value);
  }

  public int getRecruit_order() {
    return this.recruit_order;
  }

  public ProcessValidationStruct setRecruit_order(int recruit_order) {
    this.recruit_order = recruit_order;
    setRecruit_orderIsSet(true);
    return this;
  }

  public void unsetRecruit_order() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECRUIT_ORDER_ISSET_ID);
  }

  /** Returns true if field recruit_order is set (has been assigned a value) and false otherwise */
  public boolean isSetRecruit_order() {
    return EncodingUtils.testBit(__isset_bitfield, __RECRUIT_ORDER_ISSET_ID);
  }

  public void setRecruit_orderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECRUIT_ORDER_ISSET_ID, value);
  }

  public int getTemplate_id() {
    return this.template_id;
  }

  public ProcessValidationStruct setTemplate_id(int template_id) {
    this.template_id = template_id;
    setTemplate_idIsSet(true);
    return this;
  }

  public void unsetTemplate_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TEMPLATE_ID_ISSET_ID);
  }

  /** Returns true if field template_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplate_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TEMPLATE_ID_ISSET_ID);
  }

  public void setTemplate_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TEMPLATE_ID_ISSET_ID, value);
  }

  public long getReward() {
    return this.reward;
  }

  public ProcessValidationStruct setReward(long reward) {
    this.reward = reward;
    setRewardIsSet(true);
    return this;
  }

  public void unsetReward() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REWARD_ISSET_ID);
  }

  /** Returns true if field reward is set (has been assigned a value) and false otherwise */
  public boolean isSetReward() {
    return EncodingUtils.testBit(__isset_bitfield, __REWARD_ISSET_ID);
  }

  public void setRewardIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REWARD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case COMPANY_ID:
      if (value == null) {
        unsetCompany_id();
      } else {
        setCompany_id((Integer)value);
      }
      break;

    case RECOMMENDER_ID:
      if (value == null) {
        unsetRecommender_id();
      } else {
        setRecommender_id((Integer)value);
      }
      break;

    case RECRUIT_ORDER:
      if (value == null) {
        unsetRecruit_order();
      } else {
        setRecruit_order((Integer)value);
      }
      break;

    case TEMPLATE_ID:
      if (value == null) {
        unsetTemplate_id();
      } else {
        setTemplate_id((Integer)value);
      }
      break;

    case REWARD:
      if (value == null) {
        unsetReward();
      } else {
        setReward((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case COMPANY_ID:
      return getCompany_id();

    case RECOMMENDER_ID:
      return getRecommender_id();

    case RECRUIT_ORDER:
      return getRecruit_order();

    case TEMPLATE_ID:
      return getTemplate_id();

    case REWARD:
      return getReward();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case COMPANY_ID:
      return isSetCompany_id();
    case RECOMMENDER_ID:
      return isSetRecommender_id();
    case RECRUIT_ORDER:
      return isSetRecruit_order();
    case TEMPLATE_ID:
      return isSetTemplate_id();
    case REWARD:
      return isSetReward();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProcessValidationStruct)
      return this.equals((ProcessValidationStruct)that);
    return false;
  }

  public boolean equals(ProcessValidationStruct that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_company_id = true && this.isSetCompany_id();
    boolean that_present_company_id = true && that.isSetCompany_id();
    if (this_present_company_id || that_present_company_id) {
      if (!(this_present_company_id && that_present_company_id))
        return false;
      if (this.company_id != that.company_id)
        return false;
    }

    boolean this_present_recommender_id = true && this.isSetRecommender_id();
    boolean that_present_recommender_id = true && that.isSetRecommender_id();
    if (this_present_recommender_id || that_present_recommender_id) {
      if (!(this_present_recommender_id && that_present_recommender_id))
        return false;
      if (this.recommender_id != that.recommender_id)
        return false;
    }

    boolean this_present_recruit_order = true && this.isSetRecruit_order();
    boolean that_present_recruit_order = true && that.isSetRecruit_order();
    if (this_present_recruit_order || that_present_recruit_order) {
      if (!(this_present_recruit_order && that_present_recruit_order))
        return false;
      if (this.recruit_order != that.recruit_order)
        return false;
    }

    boolean this_present_template_id = true && this.isSetTemplate_id();
    boolean that_present_template_id = true && that.isSetTemplate_id();
    if (this_present_template_id || that_present_template_id) {
      if (!(this_present_template_id && that_present_template_id))
        return false;
      if (this.template_id != that.template_id)
        return false;
    }

    boolean this_present_reward = true && this.isSetReward();
    boolean that_present_reward = true && that.isSetReward();
    if (this_present_reward || that_present_reward) {
      if (!(this_present_reward && that_present_reward))
        return false;
      if (this.reward != that.reward)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_company_id = true && (isSetCompany_id());
    list.add(present_company_id);
    if (present_company_id)
      list.add(company_id);

    boolean present_recommender_id = true && (isSetRecommender_id());
    list.add(present_recommender_id);
    if (present_recommender_id)
      list.add(recommender_id);

    boolean present_recruit_order = true && (isSetRecruit_order());
    list.add(present_recruit_order);
    if (present_recruit_order)
      list.add(recruit_order);

    boolean present_template_id = true && (isSetTemplate_id());
    list.add(present_template_id);
    if (present_template_id)
      list.add(template_id);

    boolean present_reward = true && (isSetReward());
    list.add(present_reward);
    if (present_reward)
      list.add(reward);

    return list.hashCode();
  }

  @Override
  public int compareTo(ProcessValidationStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompany_id()).compareTo(other.isSetCompany_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompany_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.company_id, other.company_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecommender_id()).compareTo(other.isSetRecommender_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommender_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommender_id, other.recommender_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecruit_order()).compareTo(other.isSetRecruit_order());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecruit_order()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recruit_order, other.recruit_order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTemplate_id()).compareTo(other.isSetTemplate_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplate_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.template_id, other.template_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReward()).compareTo(other.isSetReward());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReward()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reward, other.reward);
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
    StringBuilder sb = new StringBuilder("ProcessValidationStruct(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetCompany_id()) {
      if (!first) sb.append(", ");
      sb.append("company_id:");
      sb.append(this.company_id);
      first = false;
    }
    if (isSetRecommender_id()) {
      if (!first) sb.append(", ");
      sb.append("recommender_id:");
      sb.append(this.recommender_id);
      first = false;
    }
    if (isSetRecruit_order()) {
      if (!first) sb.append(", ");
      sb.append("recruit_order:");
      sb.append(this.recruit_order);
      first = false;
    }
    if (isSetTemplate_id()) {
      if (!first) sb.append(", ");
      sb.append("template_id:");
      sb.append(this.template_id);
      first = false;
    }
    if (isSetReward()) {
      if (!first) sb.append(", ");
      sb.append("reward:");
      sb.append(this.reward);
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

  private static class ProcessValidationStructStandardSchemeFactory implements SchemeFactory {
    public ProcessValidationStructStandardScheme getScheme() {
      return new ProcessValidationStructStandardScheme();
    }
  }

  private static class ProcessValidationStructStandardScheme extends StandardScheme<ProcessValidationStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessValidationStruct struct) throws org.apache.thrift.TException {
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
          case 2: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.company_id = iprot.readI32();
              struct.setCompany_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECOMMENDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recommender_id = iprot.readI32();
              struct.setRecommender_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RECRUIT_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recruit_order = iprot.readI32();
              struct.setRecruit_orderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TEMPLATE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.template_id = iprot.readI32();
              struct.setTemplate_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // REWARD
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.reward = iprot.readI64();
              struct.setRewardIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessValidationStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompany_id()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.company_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecommender_id()) {
        oprot.writeFieldBegin(RECOMMENDER_ID_FIELD_DESC);
        oprot.writeI32(struct.recommender_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecruit_order()) {
        oprot.writeFieldBegin(RECRUIT_ORDER_FIELD_DESC);
        oprot.writeI32(struct.recruit_order);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTemplate_id()) {
        oprot.writeFieldBegin(TEMPLATE_ID_FIELD_DESC);
        oprot.writeI32(struct.template_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReward()) {
        oprot.writeFieldBegin(REWARD_FIELD_DESC);
        oprot.writeI64(struct.reward);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessValidationStructTupleSchemeFactory implements SchemeFactory {
    public ProcessValidationStructTupleScheme getScheme() {
      return new ProcessValidationStructTupleScheme();
    }
  }

  private static class ProcessValidationStructTupleScheme extends TupleScheme<ProcessValidationStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessValidationStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCompany_id()) {
        optionals.set(1);
      }
      if (struct.isSetRecommender_id()) {
        optionals.set(2);
      }
      if (struct.isSetRecruit_order()) {
        optionals.set(3);
      }
      if (struct.isSetTemplate_id()) {
        optionals.set(4);
      }
      if (struct.isSetReward()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
      if (struct.isSetRecommender_id()) {
        oprot.writeI32(struct.recommender_id);
      }
      if (struct.isSetRecruit_order()) {
        oprot.writeI32(struct.recruit_order);
      }
      if (struct.isSetTemplate_id()) {
        oprot.writeI32(struct.template_id);
      }
      if (struct.isSetReward()) {
        oprot.writeI64(struct.reward);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessValidationStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.recommender_id = iprot.readI32();
        struct.setRecommender_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.recruit_order = iprot.readI32();
        struct.setRecruit_orderIsSet(true);
      }
      if (incoming.get(4)) {
        struct.template_id = iprot.readI32();
        struct.setTemplate_idIsSet(true);
      }
      if (incoming.get(5)) {
        struct.reward = iprot.readI64();
        struct.setRewardIsSet(true);
      }
    }
  }

}

