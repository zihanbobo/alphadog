/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccountConf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 公司账号数量配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyAccountConfRecord extends UpdatableRecordImpl<HrCompanyAccountConfRecord> implements Record6<Integer, Integer, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -625459580;

    /**
     * Setter for <code>hrdb.hr_company_account_conf.id</code>. 自增id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_conf.id</code>. 自增id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_company_account_conf.company_id</code>. 公司id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_conf.company_id</code>. 公司id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_company_account_conf.role_type</code>. 角色类型(1:超级管理员 2:管理员 3:HR 4:高级用人经理  5:用人经理 6:面试官')
     */
    public void setRoleType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_conf.role_type</code>. 角色类型(1:超级管理员 2:管理员 3:HR 4:高级用人经理  5:用人经理 6:面试官')
     */
    public String getRoleType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_company_account_conf.account_limit</code>. 账号总额(该公司总共可拥有的该类型账号的数量)
     */
    public void setAccountLimit(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_conf.account_limit</code>. 账号总额(该公司总共可拥有的该类型账号的数量)
     */
    public Integer getAccountLimit() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_company_account_conf.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_conf.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_company_account_conf.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_conf.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF.ROLE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF.ACCOUNT_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF.UPDATE_TIME;
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
    public Integer value2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRoleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAccountLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord value3(String value) {
        setRoleType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord value4(Integer value) {
        setAccountLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountConfRecord values(Integer value1, Integer value2, String value3, Integer value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrCompanyAccountConfRecord
     */
    public HrCompanyAccountConfRecord() {
        super(HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF);
    }

    /**
     * Create a detached, initialised HrCompanyAccountConfRecord
     */
    public HrCompanyAccountConfRecord(Integer id, Integer companyId, String roleType, Integer accountLimit, Timestamp createTime, Timestamp updateTime) {
        super(HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF);

        set(0, id);
        set(1, companyId);
        set(2, roleType);
        set(3, accountLimit);
        set(4, createTime);
        set(5, updateTime);
    }
}
