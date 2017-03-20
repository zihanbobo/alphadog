/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-11-9")
public class BindAccountStruct implements org.apache.thrift.TBase<BindAccountStruct, BindAccountStruct._Fields>, java.io.Serializable, Cloneable, Comparable<BindAccountStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BindAccountStruct");

  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MEMBER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("member_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField APPID_FIELD_DESC = new org.apache.thrift.protocol.TField("appid", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("user_id", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField REMAIN_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("remainNum", org.apache.thrift.protocol.TType.I32, (short)8);
  private static final org.apache.thrift.protocol.TField BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("binding", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BindAccountStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BindAccountStructTupleSchemeFactory());
  }

  public String username; // required
  public String password; // required
  public String member_name; // optional
  public byte channel; // required
  public int appid; // required
  public int user_id; // required
  public int company_id; // required
  public int remainNum; // required
  public int binding; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERNAME((short)1, "username"),
    PASSWORD((short)2, "password"),
    MEMBER_NAME((short)3, "member_name"),
    CHANNEL((short)4, "channel"),
    APPID((short)5, "appid"),
    USER_ID((short)6, "user_id"),
    COMPANY_ID((short)7, "company_id"),
    REMAIN_NUM((short)8, "remainNum"),
    BINDING((short)9, "binding");

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
        case 1: // USERNAME
          return USERNAME;
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // MEMBER_NAME
          return MEMBER_NAME;
        case 4: // CHANNEL
          return CHANNEL;
        case 5: // APPID
          return APPID;
        case 6: // USER_ID
          return USER_ID;
        case 7: // COMPANY_ID
          return COMPANY_ID;
        case 8: // REMAIN_NUM
          return REMAIN_NUM;
        case 9: // BINDING
          return BINDING;
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
  private static final int __CHANNEL_ISSET_ID = 0;
  private static final int __APPID_ISSET_ID = 1;
  private static final int __USER_ID_ISSET_ID = 2;
  private static final int __COMPANY_ID_ISSET_ID = 3;
  private static final int __REMAINNUM_ISSET_ID = 4;
  private static final int __BINDING_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MEMBER_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBER_NAME, new org.apache.thrift.meta_data.FieldMetaData("member_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.APPID, new org.apache.thrift.meta_data.FieldMetaData("appid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("user_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REMAIN_NUM, new org.apache.thrift.meta_data.FieldMetaData("remainNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BINDING, new org.apache.thrift.meta_data.FieldMetaData("binding", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BindAccountStruct.class, metaDataMap);
  }

  public BindAccountStruct() {
  }

  public BindAccountStruct(
    String username,
    String password,
    byte channel,
    int appid,
    int user_id,
    int company_id,
    int remainNum,
    int binding)
  {
    this();
    this.username = username;
    this.password = password;
    this.channel = channel;
    setChannelIsSet(true);
    this.appid = appid;
    setAppidIsSet(true);
    this.user_id = user_id;
    setUser_idIsSet(true);
    this.company_id = company_id;
    setCompany_idIsSet(true);
    this.remainNum = remainNum;
    setRemainNumIsSet(true);
    this.binding = binding;
    setBindingIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BindAccountStruct(BindAccountStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetMember_name()) {
      this.member_name = other.member_name;
    }
    this.channel = other.channel;
    this.appid = other.appid;
    this.user_id = other.user_id;
    this.company_id = other.company_id;
    this.remainNum = other.remainNum;
    this.binding = other.binding;
  }

  public BindAccountStruct deepCopy() {
    return new BindAccountStruct(this);
  }

  @Override
  public void clear() {
    this.username = null;
    this.password = null;
    this.member_name = null;
    setChannelIsSet(false);
    this.channel = 0;
    setAppidIsSet(false);
    this.appid = 0;
    setUser_idIsSet(false);
    this.user_id = 0;
    setCompany_idIsSet(false);
    this.company_id = 0;
    setRemainNumIsSet(false);
    this.remainNum = 0;
    setBindingIsSet(false);
    this.binding = 0;
  }

  public String getUsername() {
    return this.username;
  }

  public BindAccountStruct setUsername(String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public BindAccountStruct setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public String getMember_name() {
    return this.member_name;
  }

  public BindAccountStruct setMember_name(String member_name) {
    this.member_name = member_name;
    return this;
  }

  public void unsetMember_name() {
    this.member_name = null;
  }

  /** Returns true if field member_name is set (has been assigned a value) and false otherwise */
  public boolean isSetMember_name() {
    return this.member_name != null;
  }

  public void setMember_nameIsSet(boolean value) {
    if (!value) {
      this.member_name = null;
    }
  }

  public byte getChannel() {
    return this.channel;
  }

  public BindAccountStruct setChannel(byte channel) {
    this.channel = channel;
    setChannelIsSet(true);
    return this;
  }

  public void unsetChannel() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHANNEL_ISSET_ID);
  }

  /** Returns true if field channel is set (has been assigned a value) and false otherwise */
  public boolean isSetChannel() {
    return EncodingUtils.testBit(__isset_bitfield, __CHANNEL_ISSET_ID);
  }

  public void setChannelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHANNEL_ISSET_ID, value);
  }

  public int getAppid() {
    return this.appid;
  }

  public BindAccountStruct setAppid(int appid) {
    this.appid = appid;
    setAppidIsSet(true);
    return this;
  }

  public void unsetAppid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  /** Returns true if field appid is set (has been assigned a value) and false otherwise */
  public boolean isSetAppid() {
    return EncodingUtils.testBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  public void setAppidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPID_ISSET_ID, value);
  }

  public int getUser_id() {
    return this.user_id;
  }

  public BindAccountStruct setUser_id(int user_id) {
    this.user_id = user_id;
    setUser_idIsSet(true);
    return this;
  }

  public void unsetUser_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USER_ID_ISSET_ID);
  }

  /** Returns true if field user_id is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_id() {
    return EncodingUtils.testBit(__isset_bitfield, __USER_ID_ISSET_ID);
  }

  public void setUser_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USER_ID_ISSET_ID, value);
  }

  public int getCompany_id() {
    return this.company_id;
  }

  public BindAccountStruct setCompany_id(int company_id) {
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

  public int getRemainNum() {
    return this.remainNum;
  }

  public BindAccountStruct setRemainNum(int remainNum) {
    this.remainNum = remainNum;
    setRemainNumIsSet(true);
    return this;
  }

  public void unsetRemainNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REMAINNUM_ISSET_ID);
  }

  /** Returns true if field remainNum is set (has been assigned a value) and false otherwise */
  public boolean isSetRemainNum() {
    return EncodingUtils.testBit(__isset_bitfield, __REMAINNUM_ISSET_ID);
  }

  public void setRemainNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REMAINNUM_ISSET_ID, value);
  }

  public int getBinding() {
    return this.binding;
  }

  public BindAccountStruct setBinding(int binding) {
    this.binding = binding;
    setBindingIsSet(true);
    return this;
  }

  public void unsetBinding() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BINDING_ISSET_ID);
  }

  /** Returns true if field binding is set (has been assigned a value) and false otherwise */
  public boolean isSetBinding() {
    return EncodingUtils.testBit(__isset_bitfield, __BINDING_ISSET_ID);
  }

  public void setBindingIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BINDING_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case MEMBER_NAME:
      if (value == null) {
        unsetMember_name();
      } else {
        setMember_name((String)value);
      }
      break;

    case CHANNEL:
      if (value == null) {
        unsetChannel();
      } else {
        setChannel((Byte)value);
      }
      break;

    case APPID:
      if (value == null) {
        unsetAppid();
      } else {
        setAppid((Integer)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((Integer)value);
      }
      break;

    case COMPANY_ID:
      if (value == null) {
        unsetCompany_id();
      } else {
        setCompany_id((Integer)value);
      }
      break;

    case REMAIN_NUM:
      if (value == null) {
        unsetRemainNum();
      } else {
        setRemainNum((Integer)value);
      }
      break;

    case BINDING:
      if (value == null) {
        unsetBinding();
      } else {
        setBinding((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    case MEMBER_NAME:
      return getMember_name();

    case CHANNEL:
      return Byte.valueOf(getChannel());

    case APPID:
      return Integer.valueOf(getAppid());

    case USER_ID:
      return Integer.valueOf(getUser_id());

    case COMPANY_ID:
      return Integer.valueOf(getCompany_id());

    case REMAIN_NUM:
      return Integer.valueOf(getRemainNum());

    case BINDING:
      return Integer.valueOf(getBinding());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    case MEMBER_NAME:
      return isSetMember_name();
    case CHANNEL:
      return isSetChannel();
    case APPID:
      return isSetAppid();
    case USER_ID:
      return isSetUser_id();
    case COMPANY_ID:
      return isSetCompany_id();
    case REMAIN_NUM:
      return isSetRemainNum();
    case BINDING:
      return isSetBinding();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BindAccountStruct)
      return this.equals((BindAccountStruct)that);
    return false;
  }

  public boolean equals(BindAccountStruct that) {
    if (that == null)
      return false;

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_member_name = true && this.isSetMember_name();
    boolean that_present_member_name = true && that.isSetMember_name();
    if (this_present_member_name || that_present_member_name) {
      if (!(this_present_member_name && that_present_member_name))
        return false;
      if (!this.member_name.equals(that.member_name))
        return false;
    }

    boolean this_present_channel = true;
    boolean that_present_channel = true;
    if (this_present_channel || that_present_channel) {
      if (!(this_present_channel && that_present_channel))
        return false;
      if (this.channel != that.channel)
        return false;
    }

    boolean this_present_appid = true;
    boolean that_present_appid = true;
    if (this_present_appid || that_present_appid) {
      if (!(this_present_appid && that_present_appid))
        return false;
      if (this.appid != that.appid)
        return false;
    }

    boolean this_present_user_id = true;
    boolean that_present_user_id = true;
    if (this_present_user_id || that_present_user_id) {
      if (!(this_present_user_id && that_present_user_id))
        return false;
      if (this.user_id != that.user_id)
        return false;
    }

    boolean this_present_company_id = true;
    boolean that_present_company_id = true;
    if (this_present_company_id || that_present_company_id) {
      if (!(this_present_company_id && that_present_company_id))
        return false;
      if (this.company_id != that.company_id)
        return false;
    }

    boolean this_present_remainNum = true;
    boolean that_present_remainNum = true;
    if (this_present_remainNum || that_present_remainNum) {
      if (!(this_present_remainNum && that_present_remainNum))
        return false;
      if (this.remainNum != that.remainNum)
        return false;
    }

    boolean this_present_binding = true;
    boolean that_present_binding = true;
    if (this_present_binding || that_present_binding) {
      if (!(this_present_binding && that_present_binding))
        return false;
      if (this.binding != that.binding)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_username = true && (isSetUsername());
    list.add(present_username);
    if (present_username)
      list.add(username);

    boolean present_password = true && (isSetPassword());
    list.add(present_password);
    if (present_password)
      list.add(password);

    boolean present_member_name = true && (isSetMember_name());
    list.add(present_member_name);
    if (present_member_name)
      list.add(member_name);

    boolean present_channel = true;
    list.add(present_channel);
    if (present_channel)
      list.add(channel);

    boolean present_appid = true;
    list.add(present_appid);
    if (present_appid)
      list.add(appid);

    boolean present_user_id = true;
    list.add(present_user_id);
    if (present_user_id)
      list.add(user_id);

    boolean present_company_id = true;
    list.add(present_company_id);
    if (present_company_id)
      list.add(company_id);

    boolean present_remainNum = true;
    list.add(present_remainNum);
    if (present_remainNum)
      list.add(remainNum);

    boolean present_binding = true;
    list.add(present_binding);
    if (present_binding)
      list.add(binding);

    return list.hashCode();
  }

  @Override
  public int compareTo(BindAccountStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMember_name()).compareTo(other.isSetMember_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMember_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.member_name, other.member_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChannel()).compareTo(other.isSetChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channel, other.channel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppid()).compareTo(other.isSetAppid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appid, other.appid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser_id()).compareTo(other.isSetUser_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_id, other.user_id);
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
    lastComparison = Boolean.valueOf(isSetRemainNum()).compareTo(other.isSetRemainNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemainNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remainNum, other.remainNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBinding()).compareTo(other.isSetBinding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binding, other.binding);
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
    StringBuilder sb = new StringBuilder("BindAccountStruct(");
    boolean first = true;

    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (isSetMember_name()) {
      if (!first) sb.append(", ");
      sb.append("member_name:");
      if (this.member_name == null) {
        sb.append("null");
      } else {
        sb.append(this.member_name);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("channel:");
    sb.append(this.channel);
    first = false;
    if (!first) sb.append(", ");
    sb.append("appid:");
    sb.append(this.appid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user_id:");
    sb.append(this.user_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("company_id:");
    sb.append(this.company_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("remainNum:");
    sb.append(this.remainNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("binding:");
    sb.append(this.binding);
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

  private static class BindAccountStructStandardSchemeFactory implements SchemeFactory {
    public BindAccountStructStandardScheme getScheme() {
      return new BindAccountStructStandardScheme();
    }
  }

  private static class BindAccountStructStandardScheme extends StandardScheme<BindAccountStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BindAccountStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MEMBER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.member_name = iprot.readString();
              struct.setMember_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.channel = iprot.readByte();
              struct.setChannelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APPID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appid = iprot.readI32();
              struct.setAppidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.user_id = iprot.readI32();
              struct.setUser_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.company_id = iprot.readI32();
              struct.setCompany_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // REMAIN_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.remainNum = iprot.readI32();
              struct.setRemainNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // BINDING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.binding = iprot.readI32();
              struct.setBindingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BindAccountStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      if (struct.member_name != null) {
        if (struct.isSetMember_name()) {
          oprot.writeFieldBegin(MEMBER_NAME_FIELD_DESC);
          oprot.writeString(struct.member_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
      oprot.writeByte(struct.channel);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPID_FIELD_DESC);
      oprot.writeI32(struct.appid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.user_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
      oprot.writeI32(struct.company_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REMAIN_NUM_FIELD_DESC);
      oprot.writeI32(struct.remainNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BINDING_FIELD_DESC);
      oprot.writeI32(struct.binding);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BindAccountStructTupleSchemeFactory implements SchemeFactory {
    public BindAccountStructTupleScheme getScheme() {
      return new BindAccountStructTupleScheme();
    }
  }

  private static class BindAccountStructTupleScheme extends TupleScheme<BindAccountStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BindAccountStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUsername()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      if (struct.isSetMember_name()) {
        optionals.set(2);
      }
      if (struct.isSetChannel()) {
        optionals.set(3);
      }
      if (struct.isSetAppid()) {
        optionals.set(4);
      }
      if (struct.isSetUser_id()) {
        optionals.set(5);
      }
      if (struct.isSetCompany_id()) {
        optionals.set(6);
      }
      if (struct.isSetRemainNum()) {
        optionals.set(7);
      }
      if (struct.isSetBinding()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetMember_name()) {
        oprot.writeString(struct.member_name);
      }
      if (struct.isSetChannel()) {
        oprot.writeByte(struct.channel);
      }
      if (struct.isSetAppid()) {
        oprot.writeI32(struct.appid);
      }
      if (struct.isSetUser_id()) {
        oprot.writeI32(struct.user_id);
      }
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
      if (struct.isSetRemainNum()) {
        oprot.writeI32(struct.remainNum);
      }
      if (struct.isSetBinding()) {
        oprot.writeI32(struct.binding);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BindAccountStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.member_name = iprot.readString();
        struct.setMember_nameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.channel = iprot.readByte();
        struct.setChannelIsSet(true);
      }
      if (incoming.get(4)) {
        struct.appid = iprot.readI32();
        struct.setAppidIsSet(true);
      }
      if (incoming.get(5)) {
        struct.user_id = iprot.readI32();
        struct.setUser_idIsSet(true);
      }
      if (incoming.get(6)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(7)) {
        struct.remainNum = iprot.readI32();
        struct.setRemainNumIsSet(true);
      }
      if (incoming.get(8)) {
        struct.binding = iprot.readI32();
        struct.setBindingIsSet(true);
      }
    }
  }

}
