/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.campaigndb.tables.records;


import com.moseeker.baseorm.db.campaigndb.tables.CampaignBaiduUsers;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 百度用户关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignBaiduUsersRecord extends UpdatableRecordImpl<CampaignBaiduUsersRecord> implements Record4<Integer, Integer, Long, Timestamp> {

    private static final long serialVersionUID = -273632369;

    /**
     * Setter for <code>campaigndb.campaign_baidu_users.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_baidu_users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>campaigndb.campaign_baidu_users.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_baidu_users.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>campaigndb.campaign_baidu_users.uid</code>. baidu的uid
     */
    public void setUid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_baidu_users.uid</code>. baidu的uid
     */
    public Long getUid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>campaigndb.campaign_baidu_users.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>campaigndb.campaign_baidu_users.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Long, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Long, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CampaignBaiduUsers.CAMPAIGN_BAIDU_USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CampaignBaiduUsers.CAMPAIGN_BAIDU_USERS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return CampaignBaiduUsers.CAMPAIGN_BAIDU_USERS.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CampaignBaiduUsers.CAMPAIGN_BAIDU_USERS.CREATE_TIME;
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
    public Long value3() {
        return getUid();
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
    public CampaignBaiduUsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignBaiduUsersRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignBaiduUsersRecord value3(Long value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignBaiduUsersRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignBaiduUsersRecord values(Integer value1, Integer value2, Long value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CampaignBaiduUsersRecord
     */
    public CampaignBaiduUsersRecord() {
        super(CampaignBaiduUsers.CAMPAIGN_BAIDU_USERS);
    }

    /**
     * Create a detached, initialised CampaignBaiduUsersRecord
     */
    public CampaignBaiduUsersRecord(Integer id, Integer userId, Long uid, Timestamp createTime) {
        super(CampaignBaiduUsers.CAMPAIGN_BAIDU_USERS);

        set(0, id);
        set(1, userId);
        set(2, uid);
        set(3, createTime);
    }
}