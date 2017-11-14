/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.records;


import com.moseeker.baseorm.db.historydb.tables.HistoryCampaignPersonaRecom;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 推送职位历史表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryCampaignPersonaRecomRecord extends UpdatableRecordImpl<HistoryCampaignPersonaRecomRecord> implements Record7<Integer, Integer, Integer, Timestamp, Timestamp, Byte, Timestamp> {

    private static final long serialVersionUID = -540885558;

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.user_id</code>. 用户id user_user.id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.user_id</code>. 用户id user_user.id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.position_id</code>. 职位id job_position.id
     */
    public void setPositionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.position_id</code>. 职位id job_position.id
     */
    public Integer getPositionId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.send_time</code>. 推送时间
     */
    public void setSendTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.send_time</code>. 推送时间
     */
    public Timestamp getSendTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.is_send</code>. 是否发送，0是未发送，1是已发送
     */
    public void setIsSend(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.is_send</code>. 是否发送，0是未发送，1是已发送
     */
    public Byte getIsSend() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>historydb.history_campaign_persona_recom.update_time</code>. 更新时间

     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>historydb.history_campaign_persona_recom.update_time</code>. 更新时间

     */
    public Timestamp getUpdateTime() {
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
    public Row7<Integer, Integer, Integer, Timestamp, Timestamp, Byte, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Timestamp, Timestamp, Byte, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.IS_SEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM.UPDATE_TIME;
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
        return getPositionId();
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
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsSend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value3(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value5(Timestamp value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value6(Byte value) {
        setIsSend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryCampaignPersonaRecomRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, Byte value6, Timestamp value7) {
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
     * Create a detached HistoryCampaignPersonaRecomRecord
     */
    public HistoryCampaignPersonaRecomRecord() {
        super(HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM);
    }

    /**
     * Create a detached, initialised HistoryCampaignPersonaRecomRecord
     */
    public HistoryCampaignPersonaRecomRecord(Integer id, Integer userId, Integer positionId, Timestamp createTime, Timestamp sendTime, Byte isSend, Timestamp updateTime) {
        super(HistoryCampaignPersonaRecom.HISTORY_CAMPAIGN_PERSONA_RECOM);

        set(0, id);
        set(1, userId);
        set(2, positionId);
        set(3, createTime);
        set(4, sendTime);
        set(5, isSend);
        set(6, updateTime);
    }
}
