/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.records;


import com.moseeker.baseorm.db.referraldb.tables.ReferralApplicationStatusCount;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 红包活动职位申请状态统计
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralApplicationStatusCountRecord extends UpdatableRecordImpl<ReferralApplicationStatusCountRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1034161854;

    /**
     * Setter for <code>referraldb.referral_application_status_count.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referraldb.referral_application_status_count.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referraldb.referral_application_status_count.application_id</code>. job_application.id
     */
    public void setApplicationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referraldb.referral_application_status_count.application_id</code>. job_application.id
     */
    public Integer getApplicationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>referraldb.referral_application_status_count.appication_tpl_status</code>. config_sys_points_conf_tpl.id
     */
    public void setAppicationTplStatus(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>referraldb.referral_application_status_count.appication_tpl_status</code>. config_sys_points_conf_tpl.id
     */
    public Integer getAppicationTplStatus() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>referraldb.referral_application_status_count.count</code>. 红包活动之后第几次到达当前申请状态
     */
    public void setCount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>referraldb.referral_application_status_count.count</code>. 红包活动之后第几次到达当前申请状态
     */
    public Integer getCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>referraldb.referral_application_status_count.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>referraldb.referral_application_status_count.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>referraldb.referral_application_status_count.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>referraldb.referral_application_status_count.update_time</code>. 更新时间
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
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPICATION_TPL_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.UPDATE_TIME;
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
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAppicationTplStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCount();
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
    public ReferralApplicationStatusCountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralApplicationStatusCountRecord value2(Integer value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralApplicationStatusCountRecord value3(Integer value) {
        setAppicationTplStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralApplicationStatusCountRecord value4(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralApplicationStatusCountRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralApplicationStatusCountRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralApplicationStatusCountRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached ReferralApplicationStatusCountRecord
     */
    public ReferralApplicationStatusCountRecord() {
        super(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT);
    }

    /**
     * Create a detached, initialised ReferralApplicationStatusCountRecord
     */
    public ReferralApplicationStatusCountRecord(Integer id, Integer applicationId, Integer appicationTplStatus, Integer count, Timestamp createTime, Timestamp updateTime) {
        super(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT);

        set(0, id);
        set(1, applicationId);
        set(2, appicationTplStatus);
        set(3, count);
        set(4, createTime);
        set(5, updateTime);
    }
}
