/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.records;


import com.moseeker.baseorm.db.jobdb.tables.JobPositionJob58Mapping;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 58同城职位映射表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionJob58MappingRecord extends UpdatableRecordImpl<JobPositionJob58MappingRecord> implements Record7<Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1608791654;

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.info_id</code>. 58职位id
     */
    public void setInfoId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.info_id</code>. 58职位id
     */
    public Integer getInfoId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.position_id</code>. 仟寻职位id
     */
    public void setPositionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.position_id</code>. 仟寻职位id
     */
    public Integer getPositionId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.url</code>. 58返回的url
     */
    public void setUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.url</code>. 58返回的url
     */
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.state</code>. 职位状态 0 下架 1 正常
     */
    public void setState(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.state</code>. 职位状态 0 下架 1 正常
     */
    public Byte getState() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>jobdb.job_position_job58_mapping.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>jobdb.job_position_job58_mapping.update_time</code>.
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
    public Row7<Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.UPDATE_TIME;
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
        return getInfoId();
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
    public String value4() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getState();
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
    public JobPositionJob58MappingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord value2(Integer value) {
        setInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord value3(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord value4(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord value5(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionJob58MappingRecord values(Integer value1, Integer value2, Integer value3, String value4, Byte value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached JobPositionJob58MappingRecord
     */
    public JobPositionJob58MappingRecord() {
        super(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING);
    }

    /**
     * Create a detached, initialised JobPositionJob58MappingRecord
     */
    public JobPositionJob58MappingRecord(Integer id, Integer infoId, Integer positionId, String url, Byte state, Timestamp createTime, Timestamp updateTime) {
        super(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING);

        set(0, id);
        set(1, infoId);
        set(2, positionId);
        set(3, url);
        set(4, state);
        set(5, createTime);
        set(6, updateTime);
    }
}
