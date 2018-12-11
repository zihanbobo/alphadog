/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.records;


import com.moseeker.baseorm.db.referraldb.tables.ReferralSeekRecommend;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 候选人联系内推记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralSeekRecommendRecord extends UpdatableRecordImpl<ReferralSeekRecommendRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2094942400;

    /**
     * Setter for <code>referraldb.referral_seek_recommend.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referraldb.referral_seek_recommend.post_user_id</code>. user_user.id 员工的C端账号
     */
    public void setPostUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.post_user_id</code>. user_user.id 员工的C端账号
     */
    public Integer getPostUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>referraldb.referral_seek_recommend.presentee_user_id</code>. user_user.id 求推荐候选人C端账号
     */
    public void setPresenteeUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.presentee_user_id</code>. user_user.id 求推荐候选人C端账号
     */
    public Integer getPresenteeUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>referraldb.referral_seek_recommend.position_id</code>. 求推荐职位编号
     */
    public void setPositionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.position_id</code>. 求推荐职位编号
     */
    public Integer getPositionId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>referraldb.referral_seek_recommend.app_id</code>. 申请编号
     */
    public void setAppId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.app_id</code>. 申请编号
     */
    public Integer getAppId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>referraldb.referral_seek_recommend.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>referraldb.referral_seek_recommend.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>referraldb.referral_seek_recommend.update_time</code>. 更新时间
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
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.POST_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.PRESENTEE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.UPDATE_TIME;
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
        return getPostUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPresenteeUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAppId();
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
    public ReferralSeekRecommendRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord value2(Integer value) {
        setPostUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord value3(Integer value) {
        setPresenteeUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord value4(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord value5(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralSeekRecommendRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached ReferralSeekRecommendRecord
     */
    public ReferralSeekRecommendRecord() {
        super(ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND);
    }

    /**
     * Create a detached, initialised ReferralSeekRecommendRecord
     */
    public ReferralSeekRecommendRecord(Integer id, Integer postUserId, Integer presenteeUserId, Integer positionId, Integer appId, Timestamp createTime, Timestamp updateTime) {
        super(ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND);

        set(0, id);
        set(1, postUserId);
        set(2, presenteeUserId);
        set(3, positionId);
        set(4, appId);
        set(5, createTime);
        set(6, updateTime);
    }
}
