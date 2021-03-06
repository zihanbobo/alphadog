/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.talentpool.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-09-07")
public class ProfileMoveForm implements org.apache.thrift.TBase<ProfileMoveForm, ProfileMoveForm._Fields>, java.io.Serializable, Cloneable, Comparable<ProfileMoveForm> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProfileMoveForm");

  private static final org.apache.thrift.protocol.TField HR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("hr_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPANY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("company_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CRAWL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("crawl_type", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField START_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("start_date", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField END_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("end_date", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField COMPANY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("company_name", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProfileMoveFormStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProfileMoveFormTupleSchemeFactory();

  public int hr_id; // optional
  public int company_id; // optional
  public int channel; // optional
  public int crawl_type; // optional
  public String start_date; // optional
  public String end_date; // optional
  public String company_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HR_ID((short)1, "hr_id"),
    COMPANY_ID((short)2, "company_id"),
    CHANNEL((short)3, "channel"),
    CRAWL_TYPE((short)4, "crawl_type"),
    START_DATE((short)5, "start_date"),
    END_DATE((short)6, "end_date"),
    COMPANY_NAME((short)7, "company_name");

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
        case 1: // HR_ID
          return HR_ID;
        case 2: // COMPANY_ID
          return COMPANY_ID;
        case 3: // CHANNEL
          return CHANNEL;
        case 4: // CRAWL_TYPE
          return CRAWL_TYPE;
        case 5: // START_DATE
          return START_DATE;
        case 6: // END_DATE
          return END_DATE;
        case 7: // COMPANY_NAME
          return COMPANY_NAME;
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
  private static final int __HR_ID_ISSET_ID = 0;
  private static final int __COMPANY_ID_ISSET_ID = 1;
  private static final int __CHANNEL_ISSET_ID = 2;
  private static final int __CRAWL_TYPE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.HR_ID,_Fields.COMPANY_ID,_Fields.CHANNEL,_Fields.CRAWL_TYPE,_Fields.START_DATE,_Fields.END_DATE,_Fields.COMPANY_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HR_ID, new org.apache.thrift.meta_data.FieldMetaData("hr_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPANY_ID, new org.apache.thrift.meta_data.FieldMetaData("company_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CRAWL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("crawl_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_DATE, new org.apache.thrift.meta_data.FieldMetaData("start_date", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_DATE, new org.apache.thrift.meta_data.FieldMetaData("end_date", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPANY_NAME, new org.apache.thrift.meta_data.FieldMetaData("company_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProfileMoveForm.class, metaDataMap);
  }

  public ProfileMoveForm() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProfileMoveForm(ProfileMoveForm other) {
    __isset_bitfield = other.__isset_bitfield;
    this.hr_id = other.hr_id;
    this.company_id = other.company_id;
    this.channel = other.channel;
    this.crawl_type = other.crawl_type;
    if (other.isSetStart_date()) {
      this.start_date = other.start_date;
    }
    if (other.isSetEnd_date()) {
      this.end_date = other.end_date;
    }
    if (other.isSetCompany_name()) {
      this.company_name = other.company_name;
    }
  }

  public ProfileMoveForm deepCopy() {
    return new ProfileMoveForm(this);
  }

  @Override
  public void clear() {
    setHr_idIsSet(false);
    this.hr_id = 0;
    setCompany_idIsSet(false);
    this.company_id = 0;
    setChannelIsSet(false);
    this.channel = 0;
    setCrawl_typeIsSet(false);
    this.crawl_type = 0;
    this.start_date = null;
    this.end_date = null;
    this.company_name = null;
  }

  public int getHr_id() {
    return this.hr_id;
  }

  public ProfileMoveForm setHr_id(int hr_id) {
    this.hr_id = hr_id;
    setHr_idIsSet(true);
    return this;
  }

  public void unsetHr_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HR_ID_ISSET_ID);
  }

  /** Returns true if field hr_id is set (has been assigned a value) and false otherwise */
  public boolean isSetHr_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HR_ID_ISSET_ID);
  }

  public void setHr_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HR_ID_ISSET_ID, value);
  }

  public int getCompany_id() {
    return this.company_id;
  }

  public ProfileMoveForm setCompany_id(int company_id) {
    this.company_id = company_id;
    setCompany_idIsSet(true);
    return this;
  }

  public void unsetCompany_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  /** Returns true if field company_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCompany_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPANY_ID_ISSET_ID);
  }

  public void setCompany_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPANY_ID_ISSET_ID, value);
  }

  public int getChannel() {
    return this.channel;
  }

  public ProfileMoveForm setChannel(int channel) {
    this.channel = channel;
    setChannelIsSet(true);
    return this;
  }

  public void unsetChannel() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHANNEL_ISSET_ID);
  }

  /** Returns true if field channel is set (has been assigned a value) and false otherwise */
  public boolean isSetChannel() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHANNEL_ISSET_ID);
  }

  public void setChannelIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHANNEL_ISSET_ID, value);
  }

  public int getCrawl_type() {
    return this.crawl_type;
  }

  public ProfileMoveForm setCrawl_type(int crawl_type) {
    this.crawl_type = crawl_type;
    setCrawl_typeIsSet(true);
    return this;
  }

  public void unsetCrawl_type() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CRAWL_TYPE_ISSET_ID);
  }

  /** Returns true if field crawl_type is set (has been assigned a value) and false otherwise */
  public boolean isSetCrawl_type() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CRAWL_TYPE_ISSET_ID);
  }

  public void setCrawl_typeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CRAWL_TYPE_ISSET_ID, value);
  }

  public String getStart_date() {
    return this.start_date;
  }

  public ProfileMoveForm setStart_date(String start_date) {
    this.start_date = start_date;
    return this;
  }

  public void unsetStart_date() {
    this.start_date = null;
  }

  /** Returns true if field start_date is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_date() {
    return this.start_date != null;
  }

  public void setStart_dateIsSet(boolean value) {
    if (!value) {
      this.start_date = null;
    }
  }

  public String getEnd_date() {
    return this.end_date;
  }

  public ProfileMoveForm setEnd_date(String end_date) {
    this.end_date = end_date;
    return this;
  }

  public void unsetEnd_date() {
    this.end_date = null;
  }

  /** Returns true if field end_date is set (has been assigned a value) and false otherwise */
  public boolean isSetEnd_date() {
    return this.end_date != null;
  }

  public void setEnd_dateIsSet(boolean value) {
    if (!value) {
      this.end_date = null;
    }
  }

  public String getCompany_name() {
    return this.company_name;
  }

  public ProfileMoveForm setCompany_name(String company_name) {
    this.company_name = company_name;
    return this;
  }

  public void unsetCompany_name() {
    this.company_name = null;
  }

  /** Returns true if field company_name is set (has been assigned a value) and false otherwise */
  public boolean isSetCompany_name() {
    return this.company_name != null;
  }

  public void setCompany_nameIsSet(boolean value) {
    if (!value) {
      this.company_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HR_ID:
      if (value == null) {
        unsetHr_id();
      } else {
        setHr_id((Integer)value);
      }
      break;

    case COMPANY_ID:
      if (value == null) {
        unsetCompany_id();
      } else {
        setCompany_id((Integer)value);
      }
      break;

    case CHANNEL:
      if (value == null) {
        unsetChannel();
      } else {
        setChannel((Integer)value);
      }
      break;

    case CRAWL_TYPE:
      if (value == null) {
        unsetCrawl_type();
      } else {
        setCrawl_type((Integer)value);
      }
      break;

    case START_DATE:
      if (value == null) {
        unsetStart_date();
      } else {
        setStart_date((String)value);
      }
      break;

    case END_DATE:
      if (value == null) {
        unsetEnd_date();
      } else {
        setEnd_date((String)value);
      }
      break;

    case COMPANY_NAME:
      if (value == null) {
        unsetCompany_name();
      } else {
        setCompany_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HR_ID:
      return getHr_id();

    case COMPANY_ID:
      return getCompany_id();

    case CHANNEL:
      return getChannel();

    case CRAWL_TYPE:
      return getCrawl_type();

    case START_DATE:
      return getStart_date();

    case END_DATE:
      return getEnd_date();

    case COMPANY_NAME:
      return getCompany_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HR_ID:
      return isSetHr_id();
    case COMPANY_ID:
      return isSetCompany_id();
    case CHANNEL:
      return isSetChannel();
    case CRAWL_TYPE:
      return isSetCrawl_type();
    case START_DATE:
      return isSetStart_date();
    case END_DATE:
      return isSetEnd_date();
    case COMPANY_NAME:
      return isSetCompany_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProfileMoveForm)
      return this.equals((ProfileMoveForm)that);
    return false;
  }

  public boolean equals(ProfileMoveForm that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hr_id = true && this.isSetHr_id();
    boolean that_present_hr_id = true && that.isSetHr_id();
    if (this_present_hr_id || that_present_hr_id) {
      if (!(this_present_hr_id && that_present_hr_id))
        return false;
      if (this.hr_id != that.hr_id)
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

    boolean this_present_channel = true && this.isSetChannel();
    boolean that_present_channel = true && that.isSetChannel();
    if (this_present_channel || that_present_channel) {
      if (!(this_present_channel && that_present_channel))
        return false;
      if (this.channel != that.channel)
        return false;
    }

    boolean this_present_crawl_type = true && this.isSetCrawl_type();
    boolean that_present_crawl_type = true && that.isSetCrawl_type();
    if (this_present_crawl_type || that_present_crawl_type) {
      if (!(this_present_crawl_type && that_present_crawl_type))
        return false;
      if (this.crawl_type != that.crawl_type)
        return false;
    }

    boolean this_present_start_date = true && this.isSetStart_date();
    boolean that_present_start_date = true && that.isSetStart_date();
    if (this_present_start_date || that_present_start_date) {
      if (!(this_present_start_date && that_present_start_date))
        return false;
      if (!this.start_date.equals(that.start_date))
        return false;
    }

    boolean this_present_end_date = true && this.isSetEnd_date();
    boolean that_present_end_date = true && that.isSetEnd_date();
    if (this_present_end_date || that_present_end_date) {
      if (!(this_present_end_date && that_present_end_date))
        return false;
      if (!this.end_date.equals(that.end_date))
        return false;
    }

    boolean this_present_company_name = true && this.isSetCompany_name();
    boolean that_present_company_name = true && that.isSetCompany_name();
    if (this_present_company_name || that_present_company_name) {
      if (!(this_present_company_name && that_present_company_name))
        return false;
      if (!this.company_name.equals(that.company_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHr_id()) ? 131071 : 524287);
    if (isSetHr_id())
      hashCode = hashCode * 8191 + hr_id;

    hashCode = hashCode * 8191 + ((isSetCompany_id()) ? 131071 : 524287);
    if (isSetCompany_id())
      hashCode = hashCode * 8191 + company_id;

    hashCode = hashCode * 8191 + ((isSetChannel()) ? 131071 : 524287);
    if (isSetChannel())
      hashCode = hashCode * 8191 + channel;

    hashCode = hashCode * 8191 + ((isSetCrawl_type()) ? 131071 : 524287);
    if (isSetCrawl_type())
      hashCode = hashCode * 8191 + crawl_type;

    hashCode = hashCode * 8191 + ((isSetStart_date()) ? 131071 : 524287);
    if (isSetStart_date())
      hashCode = hashCode * 8191 + start_date.hashCode();

    hashCode = hashCode * 8191 + ((isSetEnd_date()) ? 131071 : 524287);
    if (isSetEnd_date())
      hashCode = hashCode * 8191 + end_date.hashCode();

    hashCode = hashCode * 8191 + ((isSetCompany_name()) ? 131071 : 524287);
    if (isSetCompany_name())
      hashCode = hashCode * 8191 + company_name.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProfileMoveForm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHr_id()).compareTo(other.isSetHr_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHr_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hr_id, other.hr_id);
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
    lastComparison = Boolean.valueOf(isSetCrawl_type()).compareTo(other.isSetCrawl_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrawl_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crawl_type, other.crawl_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart_date()).compareTo(other.isSetStart_date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_date, other.start_date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_date()).compareTo(other.isSetEnd_date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_date, other.end_date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompany_name()).compareTo(other.isSetCompany_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompany_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.company_name, other.company_name);
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
    StringBuilder sb = new StringBuilder("ProfileMoveForm(");
    boolean first = true;

    if (isSetHr_id()) {
      sb.append("hr_id:");
      sb.append(this.hr_id);
      first = false;
    }
    if (isSetCompany_id()) {
      if (!first) sb.append(", ");
      sb.append("company_id:");
      sb.append(this.company_id);
      first = false;
    }
    if (isSetChannel()) {
      if (!first) sb.append(", ");
      sb.append("channel:");
      sb.append(this.channel);
      first = false;
    }
    if (isSetCrawl_type()) {
      if (!first) sb.append(", ");
      sb.append("crawl_type:");
      sb.append(this.crawl_type);
      first = false;
    }
    if (isSetStart_date()) {
      if (!first) sb.append(", ");
      sb.append("start_date:");
      if (this.start_date == null) {
        sb.append("null");
      } else {
        sb.append(this.start_date);
      }
      first = false;
    }
    if (isSetEnd_date()) {
      if (!first) sb.append(", ");
      sb.append("end_date:");
      if (this.end_date == null) {
        sb.append("null");
      } else {
        sb.append(this.end_date);
      }
      first = false;
    }
    if (isSetCompany_name()) {
      if (!first) sb.append(", ");
      sb.append("company_name:");
      if (this.company_name == null) {
        sb.append("null");
      } else {
        sb.append(this.company_name);
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

  private static class ProfileMoveFormStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileMoveFormStandardScheme getScheme() {
      return new ProfileMoveFormStandardScheme();
    }
  }

  private static class ProfileMoveFormStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProfileMoveForm> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProfileMoveForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hr_id = iprot.readI32();
              struct.setHr_idIsSet(true);
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
          case 3: // CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.channel = iprot.readI32();
              struct.setChannelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CRAWL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.crawl_type = iprot.readI32();
              struct.setCrawl_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // START_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.start_date = iprot.readString();
              struct.setStart_dateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // END_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.end_date = iprot.readString();
              struct.setEnd_dateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // COMPANY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.company_name = iprot.readString();
              struct.setCompany_nameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProfileMoveForm struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetHr_id()) {
        oprot.writeFieldBegin(HR_ID_FIELD_DESC);
        oprot.writeI32(struct.hr_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompany_id()) {
        oprot.writeFieldBegin(COMPANY_ID_FIELD_DESC);
        oprot.writeI32(struct.company_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetChannel()) {
        oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
        oprot.writeI32(struct.channel);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCrawl_type()) {
        oprot.writeFieldBegin(CRAWL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.crawl_type);
        oprot.writeFieldEnd();
      }
      if (struct.start_date != null) {
        if (struct.isSetStart_date()) {
          oprot.writeFieldBegin(START_DATE_FIELD_DESC);
          oprot.writeString(struct.start_date);
          oprot.writeFieldEnd();
        }
      }
      if (struct.end_date != null) {
        if (struct.isSetEnd_date()) {
          oprot.writeFieldBegin(END_DATE_FIELD_DESC);
          oprot.writeString(struct.end_date);
          oprot.writeFieldEnd();
        }
      }
      if (struct.company_name != null) {
        if (struct.isSetCompany_name()) {
          oprot.writeFieldBegin(COMPANY_NAME_FIELD_DESC);
          oprot.writeString(struct.company_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileMoveFormTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileMoveFormTupleScheme getScheme() {
      return new ProfileMoveFormTupleScheme();
    }
  }

  private static class ProfileMoveFormTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProfileMoveForm> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProfileMoveForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHr_id()) {
        optionals.set(0);
      }
      if (struct.isSetCompany_id()) {
        optionals.set(1);
      }
      if (struct.isSetChannel()) {
        optionals.set(2);
      }
      if (struct.isSetCrawl_type()) {
        optionals.set(3);
      }
      if (struct.isSetStart_date()) {
        optionals.set(4);
      }
      if (struct.isSetEnd_date()) {
        optionals.set(5);
      }
      if (struct.isSetCompany_name()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetHr_id()) {
        oprot.writeI32(struct.hr_id);
      }
      if (struct.isSetCompany_id()) {
        oprot.writeI32(struct.company_id);
      }
      if (struct.isSetChannel()) {
        oprot.writeI32(struct.channel);
      }
      if (struct.isSetCrawl_type()) {
        oprot.writeI32(struct.crawl_type);
      }
      if (struct.isSetStart_date()) {
        oprot.writeString(struct.start_date);
      }
      if (struct.isSetEnd_date()) {
        oprot.writeString(struct.end_date);
      }
      if (struct.isSetCompany_name()) {
        oprot.writeString(struct.company_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProfileMoveForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.hr_id = iprot.readI32();
        struct.setHr_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.company_id = iprot.readI32();
        struct.setCompany_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.channel = iprot.readI32();
        struct.setChannelIsSet(true);
      }
      if (incoming.get(3)) {
        struct.crawl_type = iprot.readI32();
        struct.setCrawl_typeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.start_date = iprot.readString();
        struct.setStart_dateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.end_date = iprot.readString();
        struct.setEnd_dateIsSet(true);
      }
      if (incoming.get(6)) {
        struct.company_name = iprot.readString();
        struct.setCompany_nameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

