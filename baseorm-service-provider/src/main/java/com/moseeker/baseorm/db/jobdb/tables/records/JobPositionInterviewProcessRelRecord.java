/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.records;


import com.moseeker.baseorm.db.jobdb.tables.JobPositionInterviewProcessRel;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 职位和面试流程中间关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionInterviewProcessRelRecord extends UpdatableRecordImpl<JobPositionInterviewProcessRelRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1132307292;

    /**
     * Setter for <code>jobdb.job_position_interview_process_rel.id</code>. 序列ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_position_interview_process_rel.id</code>. 序列ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_position_interview_process_rel.position_id</code>. 职位ID
     */
    public void setPositionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_position_interview_process_rel.position_id</code>. 职位ID
     */
    public Integer getPositionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jobdb.job_position_interview_process_rel.interview_process_id</code>. 面试流程ID
     */
    public void setInterviewProcessId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobdb.job_position_interview_process_rel.interview_process_id</code>. 面试流程ID
     */
    public Integer getInterviewProcessId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jobdb.job_position_interview_process_rel.disabled</code>. 状态 0 有效  1 无效
     */
    public void setDisabled(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobdb.job_position_interview_process_rel.disabled</code>. 状态 0 有效  1 无效
     */
    public Integer getDisabled() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jobdb.job_position_interview_process_rel.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jobdb.job_position_interview_process_rel.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jobdb.job_position_interview_process_rel.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jobdb.job_position_interview_process_rel.update_time</code>. 更新时间
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
        return JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL.INTERVIEW_PROCESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL.DISABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL.UPDATE_TIME;
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
    public Integer value3() {
        return getInterviewProcessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDisabled();
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
    public JobPositionInterviewProcessRelRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionInterviewProcessRelRecord value2(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionInterviewProcessRelRecord value3(Integer value) {
        setInterviewProcessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionInterviewProcessRelRecord value4(Integer value) {
        setDisabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionInterviewProcessRelRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionInterviewProcessRelRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionInterviewProcessRelRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached JobPositionInterviewProcessRelRecord
     */
    public JobPositionInterviewProcessRelRecord() {
        super(JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL);
    }

    /**
     * Create a detached, initialised JobPositionInterviewProcessRelRecord
     */
    public JobPositionInterviewProcessRelRecord(Integer id, Integer positionId, Integer interviewProcessId, Integer disabled, Timestamp createTime, Timestamp updateTime) {
        super(JobPositionInterviewProcessRel.JOB_POSITION_INTERVIEW_PROCESS_REL);

        set(0, id);
        set(1, positionId);
        set(2, interviewProcessId);
        set(3, disabled);
        set(4, createTime);
        set(5, updateTime);
    }
}
