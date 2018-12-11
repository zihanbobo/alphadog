/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.records;


import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationMembers;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 管理员通知联系人
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigAdminnotificationMembersRecord extends UpdatableRecordImpl<ConfigAdminnotificationMembersRecord> implements Record7<Integer, String, String, String, String, Byte, Timestamp> {

    private static final long serialVersionUID = 587256954;

    /**
     * Setter for <code>configdb.config_adminnotification_members.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>configdb.config_adminnotification_members.name</code>. 姓名
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>configdb.config_adminnotification_members.mobilephone</code>. 接收通知的手机
     */
    public void setMobilephone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.mobilephone</code>. 接收通知的手机
     */
    public String getMobilephone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>configdb.config_adminnotification_members.wechatopenid</code>. 接收通知的微信openid
     */
    public void setWechatopenid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.wechatopenid</code>. 接收通知的微信openid
     */
    public String getWechatopenid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>configdb.config_adminnotification_members.email</code>. 接收通知的email
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.email</code>. 接收通知的email
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>configdb.config_adminnotification_members.status</code>. 1 有效 0 无效
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.status</code>. 1 有效 0 无效
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>configdb.config_adminnotification_members.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>configdb.config_adminnotification_members.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, Byte, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, Byte, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.MOBILEPHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.WECHATOPENID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMobilephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getWechatopenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value3(String value) {
        setMobilephone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value4(String value) {
        setWechatopenid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationMembersRecord values(Integer value1, String value2, String value3, String value4, String value5, Byte value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigAdminnotificationMembersRecord
     */
    public ConfigAdminnotificationMembersRecord() {
        super(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS);
    }

    /**
     * Create a detached, initialised ConfigAdminnotificationMembersRecord
     */
    public ConfigAdminnotificationMembersRecord(Integer id, String name, String mobilephone, String wechatopenid, String email, Byte status, Timestamp createTime) {
        super(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS);

        set(0, id);
        set(1, name);
        set(2, mobilephone);
        set(3, wechatopenid);
        set(4, email);
        set(5, status);
        set(6, createTime);
    }
}
