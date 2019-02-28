/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.referral.struct;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-12-25")
public class ContactPushInfo implements org.apache.thrift.TBase<ContactPushInfo, ContactPushInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ContactPushInfo> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ContactPushInfo");

    private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
    private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)2);
    private static final org.apache.thrift.protocol.TField POSITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("positionId", org.apache.thrift.protocol.TType.I32, (short)3);
    private static final org.apache.thrift.protocol.TField POSITION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("positionName", org.apache.thrift.protocol.TType.STRING, (short)4);
    private static final org.apache.thrift.protocol.TField APPLICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationId", org.apache.thrift.protocol.TType.I32, (short)5);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ContactPushInfoStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ContactPushInfoTupleSchemeFactory();

    public int userId; // optional
    public java.lang.String username; // optional
    public int positionId; // optional
    public java.lang.String positionName; // optional
    public int applicationId; // optional

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        USER_ID((short)1, "userId"),
        USERNAME((short)2, "username"),
        POSITION_ID((short)3, "positionId"),
        POSITION_NAME((short)4, "positionName"),
        APPLICATION_ID((short)5, "applicationId");

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
                case 1: // USER_ID
                    return USER_ID;
                case 2: // USERNAME
                    return USERNAME;
                case 3: // POSITION_ID
                    return POSITION_ID;
                case 4: // POSITION_NAME
                    return POSITION_NAME;
                case 5: // APPLICATION_ID
                    return APPLICATION_ID;
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
    private static final int __USERID_ISSET_ID = 0;
    private static final int __POSITIONID_ISSET_ID = 1;
    private static final int __APPLICATIONID_ISSET_ID = 2;
    private byte __isset_bitfield = 0;
    private static final _Fields optionals[] = {_Fields.USER_ID,_Fields.USERNAME,_Fields.POSITION_ID,_Fields.POSITION_NAME,_Fields.APPLICATION_ID};
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.POSITION_ID, new org.apache.thrift.meta_data.FieldMetaData("positionId", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.POSITION_NAME, new org.apache.thrift.meta_data.FieldMetaData("positionName", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.APPLICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("applicationId", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ContactPushInfo.class, metaDataMap);
    }

    public ContactPushInfo() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ContactPushInfo(ContactPushInfo other) {
        __isset_bitfield = other.__isset_bitfield;
        this.userId = other.userId;
        if (other.isSetUsername()) {
            this.username = other.username;
        }
        this.positionId = other.positionId;
        if (other.isSetPositionName()) {
            this.positionName = other.positionName;
        }
        this.applicationId = other.applicationId;
    }

    public ContactPushInfo deepCopy() {
        return new ContactPushInfo(this);
    }

    @Override
    public void clear() {
        setUserIdIsSet(false);
        this.userId = 0;
        this.username = null;
        setPositionIdIsSet(false);
        this.positionId = 0;
        this.positionName = null;
        setApplicationIdIsSet(false);
        this.applicationId = 0;
    }

    public int getUserId() {
        return this.userId;
    }

    public ContactPushInfo setUserId(int userId) {
        this.userId = userId;
        setUserIdIsSet(true);
        return this;
    }

    public void unsetUserId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    /** Returns true if field userId is set (has been assigned a value) and false otherwise */
    public boolean isSetUserId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    public void setUserIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public ContactPushInfo setUsername(java.lang.String username) {
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

    public int getPositionId() {
        return this.positionId;
    }

    public ContactPushInfo setPositionId(int positionId) {
        this.positionId = positionId;
        setPositionIdIsSet(true);
        return this;
    }

    public void unsetPositionId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POSITIONID_ISSET_ID);
    }

    /** Returns true if field positionId is set (has been assigned a value) and false otherwise */
    public boolean isSetPositionId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POSITIONID_ISSET_ID);
    }

    public void setPositionIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POSITIONID_ISSET_ID, value);
    }

    public java.lang.String getPositionName() {
        return this.positionName;
    }

    public ContactPushInfo setPositionName(java.lang.String positionName) {
        this.positionName = positionName;
        return this;
    }

    public void unsetPositionName() {
        this.positionName = null;
    }

    /** Returns true if field positionName is set (has been assigned a value) and false otherwise */
    public boolean isSetPositionName() {
        return this.positionName != null;
    }

    public void setPositionNameIsSet(boolean value) {
        if (!value) {
            this.positionName = null;
        }
    }

    public int getApplicationId() {
        return this.applicationId;
    }

    public ContactPushInfo setApplicationId(int applicationId) {
        this.applicationId = applicationId;
        setApplicationIdIsSet(true);
        return this;
    }

    public void unsetApplicationId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPLICATIONID_ISSET_ID);
    }

    /** Returns true if field applicationId is set (has been assigned a value) and false otherwise */
    public boolean isSetApplicationId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPLICATIONID_ISSET_ID);
    }

    public void setApplicationIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPLICATIONID_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case USER_ID:
                if (value == null) {
                    unsetUserId();
                } else {
                    setUserId((java.lang.Integer)value);
                }
                break;

            case USERNAME:
                if (value == null) {
                    unsetUsername();
                } else {
                    setUsername((java.lang.String)value);
                }
                break;

            case POSITION_ID:
                if (value == null) {
                    unsetPositionId();
                } else {
                    setPositionId((java.lang.Integer)value);
                }
                break;

            case POSITION_NAME:
                if (value == null) {
                    unsetPositionName();
                } else {
                    setPositionName((java.lang.String)value);
                }
                break;

            case APPLICATION_ID:
                if (value == null) {
                    unsetApplicationId();
                } else {
                    setApplicationId((java.lang.Integer)value);
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case USER_ID:
                return getUserId();

            case USERNAME:
                return getUsername();

            case POSITION_ID:
                return getPositionId();

            case POSITION_NAME:
                return getPositionName();

            case APPLICATION_ID:
                return getApplicationId();

        }
        throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case USER_ID:
                return isSetUserId();
            case USERNAME:
                return isSetUsername();
            case POSITION_ID:
                return isSetPositionId();
            case POSITION_NAME:
                return isSetPositionName();
            case APPLICATION_ID:
                return isSetApplicationId();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof ContactPushInfo)
            return this.equals((ContactPushInfo)that);
        return false;
    }

    public boolean equals(ContactPushInfo that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_userId = true && this.isSetUserId();
        boolean that_present_userId = true && that.isSetUserId();
        if (this_present_userId || that_present_userId) {
            if (!(this_present_userId && that_present_userId))
                return false;
            if (this.userId != that.userId)
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

        boolean this_present_positionId = true && this.isSetPositionId();
        boolean that_present_positionId = true && that.isSetPositionId();
        if (this_present_positionId || that_present_positionId) {
            if (!(this_present_positionId && that_present_positionId))
                return false;
            if (this.positionId != that.positionId)
                return false;
        }

        boolean this_present_positionName = true && this.isSetPositionName();
        boolean that_present_positionName = true && that.isSetPositionName();
        if (this_present_positionName || that_present_positionName) {
            if (!(this_present_positionName && that_present_positionName))
                return false;
            if (!this.positionName.equals(that.positionName))
                return false;
        }

        boolean this_present_applicationId = true && this.isSetApplicationId();
        boolean that_present_applicationId = true && that.isSetApplicationId();
        if (this_present_applicationId || that_present_applicationId) {
            if (!(this_present_applicationId && that_present_applicationId))
                return false;
            if (this.applicationId != that.applicationId)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
        if (isSetUserId())
            hashCode = hashCode * 8191 + userId;

        hashCode = hashCode * 8191 + ((isSetUsername()) ? 131071 : 524287);
        if (isSetUsername())
            hashCode = hashCode * 8191 + username.hashCode();

        hashCode = hashCode * 8191 + ((isSetPositionId()) ? 131071 : 524287);
        if (isSetPositionId())
            hashCode = hashCode * 8191 + positionId;

        hashCode = hashCode * 8191 + ((isSetPositionName()) ? 131071 : 524287);
        if (isSetPositionName())
            hashCode = hashCode * 8191 + positionName.hashCode();

        hashCode = hashCode * 8191 + ((isSetApplicationId()) ? 131071 : 524287);
        if (isSetApplicationId())
            hashCode = hashCode * 8191 + applicationId;

        return hashCode;
    }

    @Override
    public int compareTo(ContactPushInfo other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUserId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUsername()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetPositionId()).compareTo(other.isSetPositionId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPositionId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionId, other.positionId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetPositionName()).compareTo(other.isSetPositionName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPositionName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positionName, other.positionName);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetApplicationId()).compareTo(other.isSetApplicationId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetApplicationId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationId, other.applicationId);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactPushInfo(");
        boolean first = true;

        if (isSetUserId()) {
            sb.append("userId:");
            sb.append(this.userId);
            first = false;
        }
        if (isSetUsername()) {
            if (!first) sb.append(", ");
            sb.append("username:");
            if (this.username == null) {
                sb.append("null");
            } else {
                sb.append(this.username);
            }
            first = false;
        }
        if (isSetPositionId()) {
            if (!first) sb.append(", ");
            sb.append("positionId:");
            sb.append(this.positionId);
            first = false;
        }
        if (isSetPositionName()) {
            if (!first) sb.append(", ");
            sb.append("positionName:");
            if (this.positionName == null) {
                sb.append("null");
            } else {
                sb.append(this.positionName);
            }
            first = false;
        }
        if (isSetApplicationId()) {
            if (!first) sb.append(", ");
            sb.append("applicationId:");
            sb.append(this.applicationId);
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

    private static class ContactPushInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ContactPushInfoStandardScheme getScheme() {
            return new ContactPushInfoStandardScheme();
        }
    }

    private static class ContactPushInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ContactPushInfo> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ContactPushInfo struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // USER_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.userId = iprot.readI32();
                            struct.setUserIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // USERNAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.username = iprot.readString();
                            struct.setUsernameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // POSITION_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.positionId = iprot.readI32();
                            struct.setPositionIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // POSITION_NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.positionName = iprot.readString();
                            struct.setPositionNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // APPLICATION_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.applicationId = iprot.readI32();
                            struct.setApplicationIdIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, ContactPushInfo struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.isSetUserId()) {
                oprot.writeFieldBegin(USER_ID_FIELD_DESC);
                oprot.writeI32(struct.userId);
                oprot.writeFieldEnd();
            }
            if (struct.username != null) {
                if (struct.isSetUsername()) {
                    oprot.writeFieldBegin(USERNAME_FIELD_DESC);
                    oprot.writeString(struct.username);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.isSetPositionId()) {
                oprot.writeFieldBegin(POSITION_ID_FIELD_DESC);
                oprot.writeI32(struct.positionId);
                oprot.writeFieldEnd();
            }
            if (struct.positionName != null) {
                if (struct.isSetPositionName()) {
                    oprot.writeFieldBegin(POSITION_NAME_FIELD_DESC);
                    oprot.writeString(struct.positionName);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.isSetApplicationId()) {
                oprot.writeFieldBegin(APPLICATION_ID_FIELD_DESC);
                oprot.writeI32(struct.applicationId);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ContactPushInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ContactPushInfoTupleScheme getScheme() {
            return new ContactPushInfoTupleScheme();
        }
    }

    private static class ContactPushInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ContactPushInfo> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ContactPushInfo struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetUserId()) {
                optionals.set(0);
            }
            if (struct.isSetUsername()) {
                optionals.set(1);
            }
            if (struct.isSetPositionId()) {
                optionals.set(2);
            }
            if (struct.isSetPositionName()) {
                optionals.set(3);
            }
            if (struct.isSetApplicationId()) {
                optionals.set(4);
            }
            oprot.writeBitSet(optionals, 5);
            if (struct.isSetUserId()) {
                oprot.writeI32(struct.userId);
            }
            if (struct.isSetUsername()) {
                oprot.writeString(struct.username);
            }
            if (struct.isSetPositionId()) {
                oprot.writeI32(struct.positionId);
            }
            if (struct.isSetPositionName()) {
                oprot.writeString(struct.positionName);
            }
            if (struct.isSetApplicationId()) {
                oprot.writeI32(struct.applicationId);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ContactPushInfo struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(5);
            if (incoming.get(0)) {
                struct.userId = iprot.readI32();
                struct.setUserIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.username = iprot.readString();
                struct.setUsernameIsSet(true);
            }
            if (incoming.get(2)) {
                struct.positionId = iprot.readI32();
                struct.setPositionIdIsSet(true);
            }
            if (incoming.get(3)) {
                struct.positionName = iprot.readString();
                struct.setPositionNameIsSet(true);
            }
            if (incoming.get(4)) {
                struct.applicationId = iprot.readI32();
                struct.setApplicationIdIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}
