/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.records;


import com.moseeker.baseorm.db.referraldb.tables.ReferralRecomHbPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 推荐类红包与被推荐职位关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralRecomHbPositionRecord extends UpdatableRecordImpl<ReferralRecomHbPositionRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1285095723;

    /**
     * Setter for <code>referraldb.referral_recom_hb_position.id</code>. 序列ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referraldb.referral_recom_hb_position.id</code>. 序列ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referraldb.referral_recom_hb_position.recom_record_id</code>. 推荐记录ID
     */
    public void setRecomRecordId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referraldb.referral_recom_hb_position.recom_record_id</code>. 推荐记录ID
     */
    public Integer getRecomRecordId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>referraldb.referral_recom_hb_position.hb_item_id</code>. 红包ID
     */
    public void setHbItemId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>referraldb.referral_recom_hb_position.hb_item_id</code>. 红包ID
     */
    public Integer getHbItemId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>referraldb.referral_recom_hb_position.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>referraldb.referral_recom_hb_position.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>referraldb.referral_recom_hb_position.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>referraldb.referral_recom_hb_position.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.RECOM_RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.HB_ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.UPDATE_TIME;
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
        return getRecomRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHbItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPositionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPositionRecord value2(Integer value) {
        setRecomRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPositionRecord value3(Integer value) {
        setHbItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPositionRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPositionRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPositionRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferralRecomHbPositionRecord
     */
    public ReferralRecomHbPositionRecord() {
        super(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION);
    }

    /**
     * Create a detached, initialised ReferralRecomHbPositionRecord
     */
    public ReferralRecomHbPositionRecord(Integer id, Integer recomRecordId, Integer hbItemId, Timestamp createTime, Timestamp updateTime) {
        super(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION);

        set(0, id);
        set(1, recomRecordId);
        set(2, hbItemId);
        set(3, createTime);
        set(4, updateTime);
    }
}
