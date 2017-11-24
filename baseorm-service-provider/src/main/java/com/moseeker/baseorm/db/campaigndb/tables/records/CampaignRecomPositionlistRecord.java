/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb.tables.records;


import com.moseeker.baseorm.db.campaigndb.tables.CampaignRecomPositionlist;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 职位推送记录，暂时用于个人画像，员工推送转发，也可用于其他有相同需求的地方
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignRecomPositionlistRecord extends UpdatableRecordImpl<CampaignRecomPositionlistRecord> implements Record6<Integer, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -552268872;

    /**
     * Setter for <code>campaigndb.campaign_recom_positionlist.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recom_positionlist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>campaigndb.campaign_recom_positionlist.company_id</code>. 公司id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recom_positionlist.company_id</code>. 公司id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>campaigndb.campaign_recom_positionlist.position_ids</code>. 职位id,之间用逗号隔开
     */
    public void setPositionIds(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recom_positionlist.position_ids</code>. 职位id,之间用逗号隔开
     */
    public String getPositionIds() {
        return (String) get(2);
    }

    /**
     * Setter for <code>campaigndb.campaign_recom_positionlist.type</code>. 推送职位类型 0;粉丝，暂时不用 1:员工职位推送
     */
    public void setType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recom_positionlist.type</code>. 推送职位类型 0;粉丝，暂时不用 1:员工职位推送
     */
    public Byte getType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>campaigndb.campaign_recom_positionlist.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recom_positionlist.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>campaigndb.campaign_recom_positionlist.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recom_positionlist.update_time</code>.
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
    public Row6<Integer, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST.POSITION_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST.UPDATE_TIME;
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
        return getPositionIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getType();
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
    public CampaignRecomPositionlistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecomPositionlistRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecomPositionlistRecord value3(String value) {
        setPositionIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecomPositionlistRecord value4(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecomPositionlistRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecomPositionlistRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecomPositionlistRecord values(Integer value1, Integer value2, String value3, Byte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached CampaignRecomPositionlistRecord
     */
    public CampaignRecomPositionlistRecord() {
        super(CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST);
    }

    /**
     * Create a detached, initialised CampaignRecomPositionlistRecord
     */
    public CampaignRecomPositionlistRecord(Integer id, Integer companyId, String positionIds, Byte type, Timestamp createTime, Timestamp updateTime) {
        super(CampaignRecomPositionlist.CAMPAIGN_RECOM_POSITIONLIST);

        set(0, id);
        set(1, companyId);
        set(2, positionIds);
        set(3, type);
        set(4, createTime);
        set(5, updateTime);
    }
}
