/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-11-03")
public class ThirdPartParamer implements org.apache.thrift.TBase<ThirdPartParamer, ThirdPartParamer._Fields>, java.io.Serializable, Cloneable, Comparable<ThirdPartParamer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThirdPartParamer");

  private static final org.apache.thrift.protocol.TField APPID_FIELD_DESC = new org.apache.thrift.protocol.TField("appid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("user_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MEMBER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("member_name", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThirdPartParamerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThirdPartParamerTupleSchemeFactory());
  }

  public int appid; // required
  public int user_id; // required
  public int company_id; // required
  public String username; // required
  public String password; // required
  public String member_name; // required
  public int channel; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APPID((short)1, "appid"),
    USER_ID((short)2, "user_id"),
    COMPANY_ID((short)3, "company_id"),
    USERNAME((short)4, "username"),
    PASSWORD((short)5, "password"),
    MEMBER_NAME((short)6, "member_name"),
    CHANNEL((short)7, "channel");

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
        case 1: // APPID
          return APPID;
        case 2: // USER_ID
          return USER_ID;
        case 3: // COMPANY_ID
          return COMPANY_ID;
        case 4: // USERNAME
          return USERNAME;
        case 5: // PASSWORD
          return PASSWORD;
        case 6: // MEMBER_NAME
          return MEMBER_NAME;
        case 7: // CHANNEL
          return CHANNEL;
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
  private static final int __APPID_ISSET_ID = 0;
  private static final int __USER_ID_ISSET_ID = 1;
  private static final int __COMPANY_ID_ISSET_ID = 2;
  private static final int __CHANNEL_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APPID, new org.apache.thrift.meta_data.FieldMetaData("appid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("user_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBER_NAME, new org.apache.thrift.meta_data.FieldMetaData("member_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThirdPartParamer.class, metaDataMap);
  }

  public ThirdPartParamer() {
  }

  public ThirdPartParamer(
    int appid,
    int user_id,
    int company_id,
    String username,
    String password,
    String member_name,
    int channel)
  {
    this();
    this.appid = appid;
    setAppidIsSet(true);
    this.user_id = user_id;
    setUser_idIsSet(true);
    this.company_id = company_id;
    setCompany_idIsSet(true);
    this.username = username;
    this.password = password;
    this.member_name = member_name;
    this.channel = channel;
    setChannelIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThirdPartParamer(ThirdPartParamer other) {
    __isset_bitfield = other.__isset_bitfield;
    this.appid = other.appid;
    this.user_id = other.user_id;
    this.company_id = other.company_id;
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
  }

  public ThirdPartParamer deepCopy() {
    return new ThirdPartParamer(this);
  }

  @Override
  public void clear() {
    setAppidIsSet(false);
    this.appid = 0;
    setUser_idIsSet(false);
    this.user_id = 0;
    setCompany_idIsSet(false);
    this.company_id = 0;
    this.username = null;
    this.password = null;
    this.member_name = null;
    setChannelIsSet(false);
    this.channel = 0;
  }

  public int getAppid() {
    return this.appid;
  }

  public ThirdPartParamer setAppid(int appid) {
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

  public ThirdPartParamer setUser_id(int user_id) {
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

  public ThirdPartParamer setCompany_id(int company_id) {
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

  public String getUsername() {
    return this.username;
  }

  public ThirdPartParamer setUsername(String username) {
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

  public ThirdPartParamer setPassword(String password) {
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

  public ThirdPartParamer setMember_name(String member_name) {
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

  public int getChannel() {
    return this.channel;
  }

  public ThirdPartParamer setChannel(int channel) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
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
        setChannel((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APPID:
      return getAppid();

    case USER_ID:
      return getUser_id();

    case COMPANY_ID:
      return getCompany_id();

    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    case MEMBER_NAME:
      return getMember_name();

    case CHANNEL:
      return getChannel();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APPID:
      return isSetAppid();
    case USER_ID:
      return isSetUser_id();
    case COMPANY_ID:
      return isSetCompany_id();
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    case MEMBER_NAME:
      return isSetMember_name();
    case CHANNEL:
      return isSetChannel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThirdPartParamer)
      return this.equals((ThirdPartParamer)that);
    return false;
  }

  public boolean equals(ThirdPartParamer that) {
    if (that == null)
      return false;

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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

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

    return list.hashCode();
  }

  @Override
  public int compareTo(ThirdPartParamer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    StringBuilder sb = new StringBuilder("ThirdPartParamer(");
    boolean first = true;

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
    if (!first) sb.append(", ");
    sb.append("member_name:");
    if (this.member_name == null) {
      sb.append("null");
    } else {
      sb.append(this.member_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channel:");
    sb.append(this.channel);
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

  private static class ThirdPartParamerStandardSchemeFactory implements SchemeFactory {
    public ThirdPartParamerStandardScheme getScheme() {
      return new ThirdPartParamerStandardScheme();
    }
  }

  private static class ThirdPartParamerStandardScheme extends StandardScheme<ThirdPartParamer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThirdPartParamer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APPID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appid = iprot.readI32();
              struct.setAppidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.user_id = iprot.readI32();
              struct.setUser_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPANY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.company_id = iprot.readI32();
              struct.setCompany_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MEMBER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.member_name = iprot.readString();
              struct.setMember_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.channel = iprot.readI32();
              struct.setChannelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThirdPartParamer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(APPID_FIELD_DESC);
      oprot.writeI32(struct.appid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.user_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
      oprot.writeI32(struct.company_id);
      oprot.writeFieldEnd();
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
        oprot.writeFieldBegin(MEMBER_NAME_FIELD_DESC);
        oprot.writeString(struct.member_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
      oprot.writeI32(struct.channel);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThirdPartParamerTupleSchemeFactory implements SchemeFactory {
    public ThirdPartParamerTupleScheme getScheme() {
      return new ThirdPartParamerTupleScheme();
    }
  }

  private static class ThirdPartParamerTupleScheme extends TupleScheme<ThirdPartParamer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThirdPartParamer struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAppid()) {
        optionals.set(0);
      }
      if (struct.isSetUser_id()) {
        optionals.set(1);
      }
      if (struct.isSetCompany_id()) {
        optionals.set(2);
      }
      if (struct.isSetUsername()) {
        optionals.set(3);
      }
      if (struct.isSetPassword()) {
        optionals.set(4);
      }
      if (struct.isSetMember_name()) {
        optionals.set(5);
      }
      if (struct.isSetChannel()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetAppid()) {
        oprot.writeI32(struct.appid);
      }
      if (struct.isSetUser_id()) {
        oprot.writeI32(struct.user_id);
      }
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
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
        oprot.writeI32(struct.channel);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThirdPartParamer struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.appid = iprot.readI32();
        struct.setAppidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user_id = iprot.readI32();
        struct.setUser_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(5)) {
        struct.member_name = iprot.readString();
        struct.setMember_nameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.channel = iprot.readI32();
        struct.setChannelIsSet(true);
      }
    }
  }

}

