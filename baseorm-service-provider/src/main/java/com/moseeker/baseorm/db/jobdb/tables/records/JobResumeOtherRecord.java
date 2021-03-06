/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.records;


import com.moseeker.baseorm.db.jobdb.tables.JobResumeOther;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 自定义简历副本记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobResumeOtherRecord extends UpdatableRecordImpl<JobResumeOtherRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1531615198;

    /**
     * Setter for <code>jobdb.job_resume_other.app_id</code>. job_application.id
     */
    public void setAppId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_resume_other.app_id</code>. job_application.id
     */
    public Integer getAppId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_resume_other.other</code>. 自定义字段
     */
    public void setOther(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_resume_other.other</code>. 自定义字段
     */
    public String getOther() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jobdb.job_resume_other.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobdb.job_resume_other.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>jobdb.job_resume_other.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobdb.job_resume_other.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
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
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobResumeOther.JOB_RESUME_OTHER.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JobResumeOther.JOB_RESUME_OTHER.OTHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return JobResumeOther.JOB_RESUME_OTHER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return JobResumeOther.JOB_RESUME_OTHER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOther();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResumeOtherRecord value1(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResumeOtherRecord value2(String value) {
        setOther(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResumeOtherRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResumeOtherRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResumeOtherRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached JobResumeOtherRecord
     */
    public JobResumeOtherRecord() {
        super(JobResumeOther.JOB_RESUME_OTHER);
    }

    /**
     * Create a detached, initialised JobResumeOtherRecord
     */
    public JobResumeOtherRecord(Integer appId, String other, Timestamp createTime, Timestamp updateTime) {
        super(JobResumeOther.JOB_RESUME_OTHER);

        set(0, appId);
        set(1, other);
        set(2, createTime);
        set(3, updateTime);
    }
}
