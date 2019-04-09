/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.records;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyCommonInfo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 数据杂项表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyCommonInfoRecord extends UpdatableRecordImpl<ThirdpartyCommonInfoRecord> implements Record9<Integer, Integer, Integer, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 881013839;

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.id</code>. 主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.company_id</code>. 公司ID
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.company_id</code>. 公司ID
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.user_id</code>. 公司ID
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.user_id</code>. 公司ID
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.content</code>. 邮箱
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.content</code>. 邮箱
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.type</code>. 标记
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.type</code>. 标记
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.user_type</code>. 标记user_id
     */
    public void setUserType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.user_type</code>. 标记user_id
     */
    public String getUserType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.status</code>. 状态
     */
    public void setStatus(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.status</code>. 状态
     */
    public Integer getStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_common_info.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_common_info.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.USER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO.UPDATE_TIME;
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
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value4(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value6(String value) {
        setUserType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value7(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyCommonInfoRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, Integer value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThirdpartyCommonInfoRecord
     */
    public ThirdpartyCommonInfoRecord() {
        super(ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO);
    }

    /**
     * Create a detached, initialised ThirdpartyCommonInfoRecord
     */
    public ThirdpartyCommonInfoRecord(Integer id, Integer companyId, Integer userId, String content, String type, String userType, Integer status, Timestamp createTime, Timestamp updateTime) {
        super(ThirdpartyCommonInfo.THIRDPARTY_COMMON_INFO);

        set(0, id);
        set(1, companyId);
        set(2, userId);
        set(3, content);
        set(4, type);
        set(5, userType);
        set(6, status);
        set(7, createTime);
        set(8, updateTime);
    }
}