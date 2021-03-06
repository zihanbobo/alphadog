/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.records;


import com.moseeker.baseorm.db.jobdb.tables.JobPositionLiepinMapping;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 职位发布到猎聘时，由于不同地区、职位名称在猎聘需用不同的id，而在仟寻只有一个id，所以此表用来生成向猎聘发布职位时需要的id
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionLiepinMappingRecord extends UpdatableRecordImpl<JobPositionLiepinMappingRecord> implements Record10<Integer, Integer, Integer, Integer, String, String, Byte, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1527921256;

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.id</code>. 仟寻向猎聘发请求用的主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.id</code>. 仟寻向猎聘发请求用的主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.position_id</code>. job_position.id
     */
    public void setPositionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.position_id</code>. job_position.id
     */
    public Integer getPositionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.liepin_job_id</code>. 猎聘返回的第三方职位id
     */
    public void setLiepinJobId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.liepin_job_id</code>. 猎聘返回的第三方职位id
     */
    public Integer getLiepinJobId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.city_code</code>. dict_city.code
     */
    public void setCityCode(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.city_code</code>. dict_city.code
     */
    public Integer getCityCode() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.job_title</code>. 职位名称，猎聘职位title长度为143
     */
    public void setJobTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.job_title</code>. 职位名称，猎聘职位title长度为143
     */
    public String getJobTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.err_msg</code>. 如果同步失败，记录失败信息
     */
    public void setErrMsg(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.err_msg</code>. 如果同步失败，记录失败信息
     */
    public String getErrMsg() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.state</code>. 猎聘职位状态 0 下架 1 正常 
     */
    public void setState(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.state</code>. 猎聘职位状态 0 下架 1 正常 
     */
    public Byte getState() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.liepin_user_id</code>. hr在猎聘的userid
     */
    public void setLiepinUserId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.liepin_user_id</code>. hr在猎聘的userid
     */
    public Integer getLiepinUserId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>jobdb.job_position_liepin_mapping.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>jobdb.job_position_liepin_mapping.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, String, String, Byte, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, String, String, Byte, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.LIEPIN_JOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.CITY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.JOB_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.ERR_MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.LIEPIN_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING.UPDATE_TIME;
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
        return getLiepinJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCityCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getJobTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getErrMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLiepinUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value2(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value3(Integer value) {
        setLiepinJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value4(Integer value) {
        setCityCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value5(String value) {
        setJobTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value6(String value) {
        setErrMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value7(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value8(Integer value) {
        setLiepinUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionLiepinMappingRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, Byte value7, Integer value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobPositionLiepinMappingRecord
     */
    public JobPositionLiepinMappingRecord() {
        super(JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING);
    }

    /**
     * Create a detached, initialised JobPositionLiepinMappingRecord
     */
    public JobPositionLiepinMappingRecord(Integer id, Integer positionId, Integer liepinJobId, Integer cityCode, String jobTitle, String errMsg, Byte state, Integer liepinUserId, Timestamp createTime, Timestamp updateTime) {
        super(JobPositionLiepinMapping.JOB_POSITION_LIEPIN_MAPPING);

        set(0, id);
        set(1, positionId);
        set(2, liepinJobId);
        set(3, cityCode);
        set(4, jobTitle);
        set(5, errMsg);
        set(6, state);
        set(7, liepinUserId);
        set(8, createTime);
        set(9, updateTime);
    }
}
