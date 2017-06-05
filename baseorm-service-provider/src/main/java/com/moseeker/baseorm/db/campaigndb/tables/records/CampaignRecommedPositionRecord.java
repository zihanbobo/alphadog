/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.campaigndb.tables.records;


import com.moseeker.baseorm.db.campaigndb.tables.CampaignRecommedPosition;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 推荐职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignRecommedPositionRecord extends UpdatableRecordImpl<CampaignRecommedPositionRecord> implements Record7<Integer, Integer, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2057575971;

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.position_id</code>. job_position.id 职位id
     */
    public void setPositionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.position_id</code>. job_position.id 职位id
     */
    public Integer getPositionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.position_name</code>. 职位名称
     */
    public void setPositionName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.position_name</code>. 职位名称
     */
    public String getPositionName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.weight</code>. 权重值
     */
    public void setWeight(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.weight</code>. 权重值
     */
    public Integer getWeight() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.disable</code>. 是否禁用(0: 启用，1: 禁用)
     */
    public void setDisable(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.disable</code>. 是否禁用(0: 启用，1: 禁用)
     */
    public Byte getDisable() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>campaigndb.campaign_recommed_position.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_recommed_position.update_time</code>. 修改时间
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
    public Row7<Integer, Integer, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.POSITION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION.UPDATE_TIME;
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
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPositionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
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
    public CampaignRecommedPositionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord value2(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord value3(String value) {
        setPositionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord value4(Integer value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord value5(Byte value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommedPositionRecord values(Integer value1, Integer value2, String value3, Integer value4, Byte value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached CampaignRecommedPositionRecord
     */
    public CampaignRecommedPositionRecord() {
        super(CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION);
    }

    /**
     * Create a detached, initialised CampaignRecommedPositionRecord
     */
    public CampaignRecommedPositionRecord(Integer id, Integer positionId, String positionName, Integer weight, Byte disable, Timestamp createTime, Timestamp updateTime) {
        super(CampaignRecommedPosition.CAMPAIGN_RECOMMED_POSITION);

        set(0, id);
        set(1, positionId);
        set(2, positionName);
        set(3, weight);
        set(4, disable);
        set(5, createTime);
        set(6, updateTime);
    }
}