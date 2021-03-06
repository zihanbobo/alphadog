/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.records;


import com.moseeker.baseorm.db.configdb.tables.ConfigSysAdministrator;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 大岂运维平台管理员表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSysAdministratorRecord extends UpdatableRecordImpl<ConfigSysAdministratorRecord> implements Record10<Integer, String, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -411253019;

    /**
     * Setter for <code>configdb.config_sys_administrator.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.mobile</code>.
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.mobile</code>.
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.password</code>.
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.password</code>.
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.is_disable</code>. 是否禁用，0：可用；1：禁用
     */
    public void setIsDisable(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.is_disable</code>. 是否禁用，0：可用；1：禁用
     */
    public Integer getIsDisable() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.login_count</code>. 登录次数
     */
    public void setLoginCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.login_count</code>. 登录次数
     */
    public Integer getLoginCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.last_login_time</code>. 最近登录时间
     */
    public void setLastLoginTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.last_login_time</code>. 最近登录时间
     */
    public Timestamp getLastLoginTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>configdb.config_sys_administrator.auth_group_id</code>.
     */
    public void setAuthGroupId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>configdb.config_sys_administrator.auth_group_id</code>.
     */
    public Integer getAuthGroupId() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.IS_DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.LOGIN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.LAST_LOGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR.AUTH_GROUP_ID;
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
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIsDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLoginCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getAuthGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value5(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value6(Integer value) {
        setIsDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value7(Integer value) {
        setLoginCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value8(Timestamp value) {
        setLastLoginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord value10(Integer value) {
        setAuthGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysAdministratorRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, Integer value7, Timestamp value8, Timestamp value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigSysAdministratorRecord
     */
    public ConfigSysAdministratorRecord() {
        super(ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR);
    }

    /**
     * Create a detached, initialised ConfigSysAdministratorRecord
     */
    public ConfigSysAdministratorRecord(Integer id, String name, String email, String mobile, String password, Integer isDisable, Integer loginCount, Timestamp lastLoginTime, Timestamp createTime, Integer authGroupId) {
        super(ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR);

        set(0, id);
        set(1, name);
        set(2, email);
        set(3, mobile);
        set(4, password);
        set(5, isDisable);
        set(6, loginCount);
        set(7, lastLoginTime);
        set(8, createTime);
        set(9, authGroupId);
    }
}
