/*
 * This file is generated by jOOQ.
 */
package com.moseeker.baseorm.db.jobdb.tables.records;


import com.moseeker.baseorm.db.jobdb.tables.JobApplicationAtsProcess;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 招聘进度和具体申请对应表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationAtsProcessRecord extends UpdatableRecordImpl<JobApplicationAtsProcessRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1385585818;

    /**
     * Setter for <code>jobdb.job_application_ats_process.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_application_ats_process.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_application_ats_process.process_id</code>. 招聘流程中具体招聘的进度
     */
    public void setProcessId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_application_ats_process.process_id</code>. 招聘流程中具体招聘的进度
     */
    public Integer getProcessId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jobdb.job_application_ats_process.app_id</code>. 申请id  job_application.id
     */
    public void setAppId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobdb.job_application_ats_process.app_id</code>. 申请id  job_application.id
     */
    public Integer getAppId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jobdb.job_application_ats_process.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobdb.job_application_ats_process.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jobdb.job_application_ats_process.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jobdb.job_application_ats_process.update_time</code>. 更新时间
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
        return JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS.PROCESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS.UPDATE_TIME;
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
        return getProcessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAppId();
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
    public JobApplicationAtsProcessRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobApplicationAtsProcessRecord value2(Integer value) {
        setProcessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobApplicationAtsProcessRecord value3(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobApplicationAtsProcessRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobApplicationAtsProcessRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobApplicationAtsProcessRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached JobApplicationAtsProcessRecord
     */
    public JobApplicationAtsProcessRecord() {
        super(JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS);
    }

    /**
     * Create a detached, initialised JobApplicationAtsProcessRecord
     */
    public JobApplicationAtsProcessRecord(Integer id, Integer processId, Integer appId, Timestamp createTime, Timestamp updateTime) {
        super(JobApplicationAtsProcess.JOB_APPLICATION_ATS_PROCESS);

        set(0, id);
        set(1, processId);
        set(2, appId);
        set(3, createTime);
        set(4, updateTime);
    }
}
