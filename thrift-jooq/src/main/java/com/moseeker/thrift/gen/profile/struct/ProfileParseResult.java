/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.profile.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-17")
public class ProfileParseResult implements org.apache.thrift.TBase<ProfileParseResult, ProfileParseResult._Fields>, java.io.Serializable, Cloneable, Comparable<ProfileParseResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProfileParseResult");

  private static final org.apache.thrift.protocol.TField FILE_FIELD_DESC = new org.apache.thrift.protocol.TField("file", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MOBILEEDITABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobileeditable", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PINYIN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("pinyinName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PINYIN_SURNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("pinyinSurname", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProfileParseResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProfileParseResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String file; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String mobile; // optional
  public boolean mobileeditable; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String email; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String pinyinName; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String pinyinSurname; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILE((short)1, "file"),
    NAME((short)2, "name"),
    MOBILE((short)3, "mobile"),
    MOBILEEDITABLE((short)4, "mobileeditable"),
    EMAIL((short)5, "email"),
    PINYIN_NAME((short)6, "pinyinName"),
    PINYIN_SURNAME((short)7, "pinyinSurname");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILE
          return FILE;
        case 2: // NAME
          return NAME;
        case 3: // MOBILE
          return MOBILE;
        case 4: // MOBILEEDITABLE
          return MOBILEEDITABLE;
        case 5: // EMAIL
          return EMAIL;
        case 6: // PINYIN_NAME
          return PINYIN_NAME;
        case 7: // PINYIN_SURNAME
          return PINYIN_SURNAME;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __MOBILEEDITABLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FILE,_Fields.NAME,_Fields.MOBILE,_Fields.MOBILEEDITABLE,_Fields.EMAIL,_Fields.PINYIN_NAME,_Fields.PINYIN_SURNAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE, new org.apache.thrift.meta_data.FieldMetaData("file", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILEEDITABLE, new org.apache.thrift.meta_data.FieldMetaData("mobileeditable", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PINYIN_NAME, new org.apache.thrift.meta_data.FieldMetaData("pinyinName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PINYIN_SURNAME, new org.apache.thrift.meta_data.FieldMetaData("pinyinSurname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProfileParseResult.class, metaDataMap);
  }

  public ProfileParseResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProfileParseResult(ProfileParseResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFile()) {
      this.file = other.file;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    this.mobileeditable = other.mobileeditable;
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetPinyinName()) {
      this.pinyinName = other.pinyinName;
    }
    if (other.isSetPinyinSurname()) {
      this.pinyinSurname = other.pinyinSurname;
    }
  }

  public ProfileParseResult deepCopy() {
    return new ProfileParseResult(this);
  }

  @Override
  public void clear() {
    this.file = null;
    this.name = null;
    this.mobile = null;
    setMobileeditableIsSet(false);
    this.mobileeditable = false;
    this.email = null;
    this.pinyinName = null;
    this.pinyinSurname = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFile() {
    return this.file;
  }

  public ProfileParseResult setFile(@org.apache.thrift.annotation.Nullable java.lang.String file) {
    this.file = file;
    return this;
  }

  public void unsetFile() {
    this.file = null;
  }

  /** Returns true if field file is set (has been assigned a value) and false otherwise */
  public boolean isSetFile() {
    return this.file != null;
  }

  public void setFileIsSet(boolean value) {
    if (!value) {
      this.file = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public ProfileParseResult setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMobile() {
    return this.mobile;
  }

  public ProfileParseResult setMobile(@org.apache.thrift.annotation.Nullable java.lang.String mobile) {
    this.mobile = mobile;
    return this;
  }

  public void unsetMobile() {
    this.mobile = null;
  }

  /** Returns true if field mobile is set (has been assigned a value) and false otherwise */
  public boolean isSetMobile() {
    return this.mobile != null;
  }

  public void setMobileIsSet(boolean value) {
    if (!value) {
      this.mobile = null;
    }
  }

  public boolean isMobileeditable() {
    return this.mobileeditable;
  }

  public ProfileParseResult setMobileeditable(boolean mobileeditable) {
    this.mobileeditable = mobileeditable;
    setMobileeditableIsSet(true);
    return this;
  }

  public void unsetMobileeditable() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MOBILEEDITABLE_ISSET_ID);
  }

  /** Returns true if field mobileeditable is set (has been assigned a value) and false otherwise */
  public boolean isSetMobileeditable() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MOBILEEDITABLE_ISSET_ID);
  }

  public void setMobileeditableIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MOBILEEDITABLE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEmail() {
    return this.email;
  }

  public ProfileParseResult setEmail(@org.apache.thrift.annotation.Nullable java.lang.String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPinyinName() {
    return this.pinyinName;
  }

  public ProfileParseResult setPinyinName(@org.apache.thrift.annotation.Nullable java.lang.String pinyinName) {
    this.pinyinName = pinyinName;
    return this;
  }

  public void unsetPinyinName() {
    this.pinyinName = null;
  }

  /** Returns true if field pinyinName is set (has been assigned a value) and false otherwise */
  public boolean isSetPinyinName() {
    return this.pinyinName != null;
  }

  public void setPinyinNameIsSet(boolean value) {
    if (!value) {
      this.pinyinName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPinyinSurname() {
    return this.pinyinSurname;
  }

  public ProfileParseResult setPinyinSurname(@org.apache.thrift.annotation.Nullable java.lang.String pinyinSurname) {
    this.pinyinSurname = pinyinSurname;
    return this;
  }

  public void unsetPinyinSurname() {
    this.pinyinSurname = null;
  }

  /** Returns true if field pinyinSurname is set (has been assigned a value) and false otherwise */
  public boolean isSetPinyinSurname() {
    return this.pinyinSurname != null;
  }

  public void setPinyinSurnameIsSet(boolean value) {
    if (!value) {
      this.pinyinSurname = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FILE:
      if (value == null) {
        unsetFile();
      } else {
        setFile((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((java.lang.String)value);
      }
      break;

    case MOBILEEDITABLE:
      if (value == null) {
        unsetMobileeditable();
      } else {
        setMobileeditable((java.lang.Boolean)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((java.lang.String)value);
      }
      break;

    case PINYIN_NAME:
      if (value == null) {
        unsetPinyinName();
      } else {
        setPinyinName((java.lang.String)value);
      }
      break;

    case PINYIN_SURNAME:
      if (value == null) {
        unsetPinyinSurname();
      } else {
        setPinyinSurname((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE:
      return getFile();

    case NAME:
      return getName();

    case MOBILE:
      return getMobile();

    case MOBILEEDITABLE:
      return isMobileeditable();

    case EMAIL:
      return getEmail();

    case PINYIN_NAME:
      return getPinyinName();

    case PINYIN_SURNAME:
      return getPinyinSurname();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FILE:
      return isSetFile();
    case NAME:
      return isSetName();
    case MOBILE:
      return isSetMobile();
    case MOBILEEDITABLE:
      return isSetMobileeditable();
    case EMAIL:
      return isSetEmail();
    case PINYIN_NAME:
      return isSetPinyinName();
    case PINYIN_SURNAME:
      return isSetPinyinSurname();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProfileParseResult)
      return this.equals((ProfileParseResult)that);
    return false;
  }

  public boolean equals(ProfileParseResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_file = true && this.isSetFile();
    boolean that_present_file = true && that.isSetFile();
    if (this_present_file || that_present_file) {
      if (!(this_present_file && that_present_file))
        return false;
      if (!this.file.equals(that.file))
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

    boolean this_present_mobile = true && this.isSetMobile();
    boolean that_present_mobile = true && that.isSetMobile();
    if (this_present_mobile || that_present_mobile) {
      if (!(this_present_mobile && that_present_mobile))
        return false;
      if (!this.mobile.equals(that.mobile))
        return false;
    }

    boolean this_present_mobileeditable = true && this.isSetMobileeditable();
    boolean that_present_mobileeditable = true && that.isSetMobileeditable();
    if (this_present_mobileeditable || that_present_mobileeditable) {
      if (!(this_present_mobileeditable && that_present_mobileeditable))
        return false;
      if (this.mobileeditable != that.mobileeditable)
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_pinyinName = true && this.isSetPinyinName();
    boolean that_present_pinyinName = true && that.isSetPinyinName();
    if (this_present_pinyinName || that_present_pinyinName) {
      if (!(this_present_pinyinName && that_present_pinyinName))
        return false;
      if (!this.pinyinName.equals(that.pinyinName))
        return false;
    }

    boolean this_present_pinyinSurname = true && this.isSetPinyinSurname();
    boolean that_present_pinyinSurname = true && that.isSetPinyinSurname();
    if (this_present_pinyinSurname || that_present_pinyinSurname) {
      if (!(this_present_pinyinSurname && that_present_pinyinSurname))
        return false;
      if (!this.pinyinSurname.equals(that.pinyinSurname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFile()) ? 131071 : 524287);
    if (isSetFile())
      hashCode = hashCode * 8191 + file.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetMobile()) ? 131071 : 524287);
    if (isSetMobile())
      hashCode = hashCode * 8191 + mobile.hashCode();

    hashCode = hashCode * 8191 + ((isSetMobileeditable()) ? 131071 : 524287);
    if (isSetMobileeditable())
      hashCode = hashCode * 8191 + ((mobileeditable) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetEmail()) ? 131071 : 524287);
    if (isSetEmail())
      hashCode = hashCode * 8191 + email.hashCode();

    hashCode = hashCode * 8191 + ((isSetPinyinName()) ? 131071 : 524287);
    if (isSetPinyinName())
      hashCode = hashCode * 8191 + pinyinName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPinyinSurname()) ? 131071 : 524287);
    if (isSetPinyinSurname())
      hashCode = hashCode * 8191 + pinyinSurname.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProfileParseResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetFile()).compareTo(other.isSetFile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.file, other.file);
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
    lastComparison = java.lang.Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMobileeditable()).compareTo(other.isSetMobileeditable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobileeditable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobileeditable, other.mobileeditable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPinyinName()).compareTo(other.isSetPinyinName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPinyinName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pinyinName, other.pinyinName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPinyinSurname()).compareTo(other.isSetPinyinSurname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPinyinSurname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pinyinSurname, other.pinyinSurname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileParseResult(");
    boolean first = true;

    if (isSetFile()) {
      sb.append("file:");
      if (this.file == null) {
        sb.append("null");
      } else {
        sb.append(this.file);
      }
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
    if (isSetMobile()) {
      if (!first) sb.append(", ");
      sb.append("mobile:");
      if (this.mobile == null) {
        sb.append("null");
      } else {
        sb.append(this.mobile);
      }
      first = false;
    }
    if (isSetMobileeditable()) {
      if (!first) sb.append(", ");
      sb.append("mobileeditable:");
      sb.append(this.mobileeditable);
      first = false;
    }
    if (isSetEmail()) {
      if (!first) sb.append(", ");
      sb.append("email:");
      if (this.email == null) {
        sb.append("null");
      } else {
        sb.append(this.email);
      }
      first = false;
    }
    if (isSetPinyinName()) {
      if (!first) sb.append(", ");
      sb.append("pinyinName:");
      if (this.pinyinName == null) {
        sb.append("null");
      } else {
        sb.append(this.pinyinName);
      }
      first = false;
    }
    if (isSetPinyinSurname()) {
      if (!first) sb.append(", ");
      sb.append("pinyinSurname:");
      if (this.pinyinSurname == null) {
        sb.append("null");
      } else {
        sb.append(this.pinyinSurname);
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

  private static class ProfileParseResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileParseResultStandardScheme getScheme() {
      return new ProfileParseResultStandardScheme();
    }
  }

  private static class ProfileParseResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProfileParseResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProfileParseResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.file = iprot.readString();
              struct.setFileIsSet(true);
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
          case 3: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOBILEEDITABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.mobileeditable = iprot.readBool();
              struct.setMobileeditableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PINYIN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pinyinName = iprot.readString();
              struct.setPinyinNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PINYIN_SURNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pinyinSurname = iprot.readString();
              struct.setPinyinSurnameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProfileParseResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.file != null) {
        if (struct.isSetFile()) {
          oprot.writeFieldBegin(FILE_FIELD_DESC);
          oprot.writeString(struct.file);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobile != null) {
        if (struct.isSetMobile()) {
          oprot.writeFieldBegin(MOBILE_FIELD_DESC);
          oprot.writeString(struct.mobile);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMobileeditable()) {
        oprot.writeFieldBegin(MOBILEEDITABLE_FIELD_DESC);
        oprot.writeBool(struct.mobileeditable);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        if (struct.isSetEmail()) {
          oprot.writeFieldBegin(EMAIL_FIELD_DESC);
          oprot.writeString(struct.email);
          oprot.writeFieldEnd();
        }
      }
      if (struct.pinyinName != null) {
        if (struct.isSetPinyinName()) {
          oprot.writeFieldBegin(PINYIN_NAME_FIELD_DESC);
          oprot.writeString(struct.pinyinName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.pinyinSurname != null) {
        if (struct.isSetPinyinSurname()) {
          oprot.writeFieldBegin(PINYIN_SURNAME_FIELD_DESC);
          oprot.writeString(struct.pinyinSurname);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileParseResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileParseResultTupleScheme getScheme() {
      return new ProfileParseResultTupleScheme();
    }
  }

  private static class ProfileParseResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProfileParseResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProfileParseResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFile()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetMobile()) {
        optionals.set(2);
      }
      if (struct.isSetMobileeditable()) {
        optionals.set(3);
      }
      if (struct.isSetEmail()) {
        optionals.set(4);
      }
      if (struct.isSetPinyinName()) {
        optionals.set(5);
      }
      if (struct.isSetPinyinSurname()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetFile()) {
        oprot.writeString(struct.file);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetMobileeditable()) {
        oprot.writeBool(struct.mobileeditable);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetPinyinName()) {
        oprot.writeString(struct.pinyinName);
      }
      if (struct.isSetPinyinSurname()) {
        oprot.writeString(struct.pinyinSurname);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProfileParseResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.file = iprot.readString();
        struct.setFileIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mobileeditable = iprot.readBool();
        struct.setMobileeditableIsSet(true);
      }
      if (incoming.get(4)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(5)) {
        struct.pinyinName = iprot.readString();
        struct.setPinyinNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.pinyinSurname = iprot.readString();
        struct.setPinyinSurnameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

