/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.employee.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-08-20")
public class RewardsResponse implements org.apache.thrift.TBase<RewardsResponse, RewardsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RewardsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RewardsResponse");

  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REWARDS_FIELD_DESC = new org.apache.thrift.protocol.TField("rewards", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField REWARD_CONFIGS_FIELD_DESC = new org.apache.thrift.protocol.TField("rewardConfigs", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RewardsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RewardsResponseTupleSchemeFactory();

  public int total; // optional
  public java.util.List<RewardVO> rewards; // optional
  public java.util.List<RewardConfig> rewardConfigs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL((short)1, "total"),
    REWARDS((short)2, "rewards"),
    REWARD_CONFIGS((short)3, "rewardConfigs");

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
        case 1: // TOTAL
          return TOTAL;
        case 2: // REWARDS
          return REWARDS;
        case 3: // REWARD_CONFIGS
          return REWARD_CONFIGS;
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
  private static final int __TOTAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOTAL,_Fields.REWARDS,_Fields.REWARD_CONFIGS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REWARDS, new org.apache.thrift.meta_data.FieldMetaData("rewards", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "RewardVO"))));
    tmpMap.put(_Fields.REWARD_CONFIGS, new org.apache.thrift.meta_data.FieldMetaData("rewardConfigs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RewardConfig.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RewardsResponse.class, metaDataMap);
  }

  public RewardsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RewardsResponse(RewardsResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.total = other.total;
    if (other.isSetRewards()) {
      java.util.List<RewardVO> __this__rewards = new java.util.ArrayList<RewardVO>(other.rewards.size());
      for (RewardVO other_element : other.rewards) {
        __this__rewards.add(other_element);
      }
      this.rewards = __this__rewards;
    }
    if (other.isSetRewardConfigs()) {
      java.util.List<RewardConfig> __this__rewardConfigs = new java.util.ArrayList<RewardConfig>(other.rewardConfigs.size());
      for (RewardConfig other_element : other.rewardConfigs) {
        __this__rewardConfigs.add(new RewardConfig(other_element));
      }
      this.rewardConfigs = __this__rewardConfigs;
    }
  }

  public RewardsResponse deepCopy() {
    return new RewardsResponse(this);
  }

  @Override
  public void clear() {
    setTotalIsSet(false);
    this.total = 0;
    this.rewards = null;
    this.rewardConfigs = null;
  }

  public int getTotal() {
    return this.total;
  }

  public RewardsResponse setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTAL_ISSET_ID, value);
  }

  public int getRewardsSize() {
    return (this.rewards == null) ? 0 : this.rewards.size();
  }

  public java.util.Iterator<RewardVO> getRewardsIterator() {
    return (this.rewards == null) ? null : this.rewards.iterator();
  }

  public void addToRewards(RewardVO elem) {
    if (this.rewards == null) {
      this.rewards = new java.util.ArrayList<RewardVO>();
    }
    this.rewards.add(elem);
  }

  public java.util.List<RewardVO> getRewards() {
    return this.rewards;
  }

  public RewardsResponse setRewards(java.util.List<RewardVO> rewards) {
    this.rewards = rewards;
    return this;
  }

  public void unsetRewards() {
    this.rewards = null;
  }

  /** Returns true if field rewards is set (has been assigned a value) and false otherwise */
  public boolean isSetRewards() {
    return this.rewards != null;
  }

  public void setRewardsIsSet(boolean value) {
    if (!value) {
      this.rewards = null;
    }
  }

  public int getRewardConfigsSize() {
    return (this.rewardConfigs == null) ? 0 : this.rewardConfigs.size();
  }

  public java.util.Iterator<RewardConfig> getRewardConfigsIterator() {
    return (this.rewardConfigs == null) ? null : this.rewardConfigs.iterator();
  }

  public void addToRewardConfigs(RewardConfig elem) {
    if (this.rewardConfigs == null) {
      this.rewardConfigs = new java.util.ArrayList<RewardConfig>();
    }
    this.rewardConfigs.add(elem);
  }

  public java.util.List<RewardConfig> getRewardConfigs() {
    return this.rewardConfigs;
  }

  public RewardsResponse setRewardConfigs(java.util.List<RewardConfig> rewardConfigs) {
    this.rewardConfigs = rewardConfigs;
    return this;
  }

  public void unsetRewardConfigs() {
    this.rewardConfigs = null;
  }

  /** Returns true if field rewardConfigs is set (has been assigned a value) and false otherwise */
  public boolean isSetRewardConfigs() {
    return this.rewardConfigs != null;
  }

  public void setRewardConfigsIsSet(boolean value) {
    if (!value) {
      this.rewardConfigs = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((java.lang.Integer)value);
      }
      break;

    case REWARDS:
      if (value == null) {
        unsetRewards();
      } else {
        setRewards((java.util.List<RewardVO>)value);
      }
      break;

    case REWARD_CONFIGS:
      if (value == null) {
        unsetRewardConfigs();
      } else {
        setRewardConfigs((java.util.List<RewardConfig>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL:
      return getTotal();

    case REWARDS:
      return getRewards();

    case REWARD_CONFIGS:
      return getRewardConfigs();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOTAL:
      return isSetTotal();
    case REWARDS:
      return isSetRewards();
    case REWARD_CONFIGS:
      return isSetRewardConfigs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RewardsResponse)
      return this.equals((RewardsResponse)that);
    return false;
  }

  public boolean equals(RewardsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_total = true && this.isSetTotal();
    boolean that_present_total = true && that.isSetTotal();
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_rewards = true && this.isSetRewards();
    boolean that_present_rewards = true && that.isSetRewards();
    if (this_present_rewards || that_present_rewards) {
      if (!(this_present_rewards && that_present_rewards))
        return false;
      if (!this.rewards.equals(that.rewards))
        return false;
    }

    boolean this_present_rewardConfigs = true && this.isSetRewardConfigs();
    boolean that_present_rewardConfigs = true && that.isSetRewardConfigs();
    if (this_present_rewardConfigs || that_present_rewardConfigs) {
      if (!(this_present_rewardConfigs && that_present_rewardConfigs))
        return false;
      if (!this.rewardConfigs.equals(that.rewardConfigs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTotal()) ? 131071 : 524287);
    if (isSetTotal())
      hashCode = hashCode * 8191 + total;

    hashCode = hashCode * 8191 + ((isSetRewards()) ? 131071 : 524287);
    if (isSetRewards())
      hashCode = hashCode * 8191 + rewards.hashCode();

    hashCode = hashCode * 8191 + ((isSetRewardConfigs()) ? 131071 : 524287);
    if (isSetRewardConfigs())
      hashCode = hashCode * 8191 + rewardConfigs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RewardsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTotal()).compareTo(other.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, other.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRewards()).compareTo(other.isSetRewards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewards()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rewards, other.rewards);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRewardConfigs()).compareTo(other.isSetRewardConfigs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewardConfigs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rewardConfigs, other.rewardConfigs);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsResponse(");
    boolean first = true;

    if (isSetTotal()) {
      sb.append("total:");
      sb.append(this.total);
      first = false;
    }
    if (isSetRewards()) {
      if (!first) sb.append(", ");
      sb.append("rewards:");
      if (this.rewards == null) {
        sb.append("null");
      } else {
        sb.append(this.rewards);
      }
      first = false;
    }
    if (isSetRewardConfigs()) {
      if (!first) sb.append(", ");
      sb.append("rewardConfigs:");
      if (this.rewardConfigs == null) {
        sb.append("null");
      } else {
        sb.append(this.rewardConfigs);
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

  private static class RewardsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RewardsResponseStandardScheme getScheme() {
      return new RewardsResponseStandardScheme();
    }
  }

  private static class RewardsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<RewardsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RewardsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = iprot.readI32();
              struct.setTotalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REWARDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.rewards = new java.util.ArrayList<RewardVO>(_list34.size);
                RewardVO _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new RewardVO();
                  _elem35.read(iprot);
                  struct.rewards.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setRewardsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REWARD_CONFIGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list37 = iprot.readListBegin();
                struct.rewardConfigs = new java.util.ArrayList<RewardConfig>(_list37.size);
                RewardConfig _elem38;
                for (int _i39 = 0; _i39 < _list37.size; ++_i39)
                {
                  _elem38 = new RewardConfig();
                  _elem38.read(iprot);
                  struct.rewardConfigs.add(_elem38);
                }
                iprot.readListEnd();
              }
              struct.setRewardConfigsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RewardsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTotal()) {
        oprot.writeFieldBegin(TOTAL_FIELD_DESC);
        oprot.writeI32(struct.total);
        oprot.writeFieldEnd();
      }
      if (struct.rewards != null) {
        if (struct.isSetRewards()) {
          oprot.writeFieldBegin(REWARDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rewards.size()));
            for (RewardVO _iter40 : struct.rewards)
            {
              _iter40.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.rewardConfigs != null) {
        if (struct.isSetRewardConfigs()) {
          oprot.writeFieldBegin(REWARD_CONFIGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rewardConfigs.size()));
            for (RewardConfig _iter41 : struct.rewardConfigs)
            {
              _iter41.write(oprot);
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

  private static class RewardsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RewardsResponseTupleScheme getScheme() {
      return new RewardsResponseTupleScheme();
    }
  }

  private static class RewardsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<RewardsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RewardsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTotal()) {
        optionals.set(0);
      }
      if (struct.isSetRewards()) {
        optionals.set(1);
      }
      if (struct.isSetRewardConfigs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTotal()) {
        oprot.writeI32(struct.total);
      }
      if (struct.isSetRewards()) {
        {
          oprot.writeI32(struct.rewards.size());
          for (RewardVO _iter42 : struct.rewards)
          {
            _iter42.write(oprot);
          }
        }
      }
      if (struct.isSetRewardConfigs()) {
        {
          oprot.writeI32(struct.rewardConfigs.size());
          for (RewardConfig _iter43 : struct.rewardConfigs)
          {
            _iter43.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RewardsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.total = iprot.readI32();
        struct.setTotalIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list44 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.rewards = new java.util.ArrayList<RewardVO>(_list44.size);
          RewardVO _elem45;
          for (int _i46 = 0; _i46 < _list44.size; ++_i46)
          {
            _elem45 = new RewardVO();
            _elem45.read(iprot);
            struct.rewards.add(_elem45);
          }
        }
        struct.setRewardsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.rewardConfigs = new java.util.ArrayList<RewardConfig>(_list47.size);
          RewardConfig _elem48;
          for (int _i49 = 0; _i49 < _list47.size; ++_i49)
          {
            _elem48 = new RewardConfig();
            _elem48.read(iprot);
            struct.rewardConfigs.add(_elem48);
          }
        }
        struct.setRewardConfigsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

