/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.jobdb.tables.records;


import com.moseeker.db.jobdb.tables.JobPositionExt;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 职位信息扩展表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionExtRecord extends UpdatableRecordImpl<JobPositionExtRecord> implements Record6<Integer, Integer, Timestamp, Timestamp, Integer, String> {

    private static final long serialVersionUID = 1270675766;

    /**
     * Setter for <code>jobdb.job_position_ext.pid</code>. job_position.id
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_position_ext.pid</code>. job_position.id
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_position_ext.job_custom_id</code>. job_custom.id
     */
    public void setJobCustomId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_position_ext.job_custom_id</code>. job_custom.id
     */
    public Integer getJobCustomId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jobdb.job_position_ext.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobdb.job_position_ext.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>jobdb.job_position_ext.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobdb.job_position_ext.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jobdb.job_position_ext.job_occupation_id</code>. jobdb.job_occupation.id
     */
    public void setJobOccupationId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>jobdb.job_position_ext.job_occupation_id</code>. jobdb.job_occupation.id
     */
    public Integer getJobOccupationId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>jobdb.job_position_ext.extra</code>. SuccessFactors对接
     */
    public void setExtra(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jobdb.job_position_ext.extra</code>. SuccessFactors对接
     */
    public String getExtra() {
        return (String) get(5);
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
    public Row6<Integer, Integer, Timestamp, Timestamp, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Timestamp, Timestamp, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobPositionExt.JOB_POSITION_EXT.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JobPositionExt.JOB_POSITION_EXT.JOB_CUSTOM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return JobPositionExt.JOB_POSITION_EXT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return JobPositionExt.JOB_POSITION_EXT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return JobPositionExt.JOB_POSITION_EXT.JOB_OCCUPATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JobPositionExt.JOB_POSITION_EXT.EXTRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getJobCustomId();
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
    public Integer value5() {
        return getJobOccupationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getExtra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord value2(Integer value) {
        setJobCustomId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord value5(Integer value) {
        setJobOccupationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord value6(String value) {
        setExtra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExtRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, Integer value5, String value6) {
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
     * Create a detached JobPositionExtRecord
     */
    public JobPositionExtRecord() {
        super(JobPositionExt.JOB_POSITION_EXT);
    }

    /**
     * Create a detached, initialised JobPositionExtRecord
     */
    public JobPositionExtRecord(Integer pid, Integer jobCustomId, Timestamp createTime, Timestamp updateTime, Integer jobOccupationId, String extra) {
        super(JobPositionExt.JOB_POSITION_EXT);

        set(0, pid);
        set(1, jobCustomId);
        set(2, createTime);
        set(3, updateTime);
        set(4, jobOccupationId);
        set(5, extra);
    }
}
