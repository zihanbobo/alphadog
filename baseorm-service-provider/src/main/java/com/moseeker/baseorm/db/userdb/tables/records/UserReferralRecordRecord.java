/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.UserReferralRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 员工主动推荐记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserReferralRecordRecord extends UpdatableRecordImpl<UserReferralRecordRecord> implements Record7<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = 1946341886;

    /**
     * Setter for <code>userdb.user_referral_record.id</code>. 主key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.id</code>. 主key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userdb.user_referral_record.user_id</code>. 用户编号
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.user_id</code>. 用户编号
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>userdb.user_referral_record.reference_id</code>. 推荐人编号
     */
    public void setReferenceId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.reference_id</code>. 推荐人编号
     */
    public Integer getReferenceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>userdb.user_referral_record.company_id</code>. 公司编号
     */
    public void setCompanyId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.company_id</code>. 公司编号
     */
    public Integer getCompanyId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>userdb.user_referral_record.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>userdb.user_referral_record.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>userdb.user_referral_record.scene</code>. 内推的场景 1. 内推 2. ChatBot 上传 
     */
    public void setScene(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>userdb.user_referral_record.scene</code>. 内推的场景 1. 内推 2. ChatBot 上传 
     */
    public Byte getScene() {
        return (Byte) get(6);
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
    public Row7<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserReferralRecord.USER_REFERRAL_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserReferralRecord.USER_REFERRAL_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserReferralRecord.USER_REFERRAL_RECORD.REFERENCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserReferralRecord.USER_REFERRAL_RECORD.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserReferralRecord.USER_REFERRAL_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return UserReferralRecord.USER_REFERRAL_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return UserReferralRecord.USER_REFERRAL_RECORD.SCENE;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getReferenceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCompanyId();
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
    public Byte value7() {
        return getScene();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value3(Integer value) {
        setReferenceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value4(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord value7(Byte value) {
        setScene(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecordRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6, Byte value7) {
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
     * Create a detached UserReferralRecordRecord
     */
    public UserReferralRecordRecord() {
        super(UserReferralRecord.USER_REFERRAL_RECORD);
    }

    /**
     * Create a detached, initialised UserReferralRecordRecord
     */
    public UserReferralRecordRecord(Integer id, Integer userId, Integer referenceId, Integer companyId, Timestamp createTime, Timestamp updateTime, Byte scene) {
        super(UserReferralRecord.USER_REFERRAL_RECORD);

        set(0, id);
        set(1, userId);
        set(2, referenceId);
        set(3, companyId);
        set(4, createTime);
        set(5, updateTime);
        set(6, scene);
    }
}
