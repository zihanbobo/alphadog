/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.records;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyJobsdbPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * JobsDB的第三方职位子表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyJobsdbPositionRecord extends UpdatableRecordImpl<ThirdpartyJobsdbPositionRecord> implements Record12<Integer, Integer, String, String, String, String, String, String, String, Timestamp, Timestamp, Short> {

    private static final long serialVersionUID = -1943831925;

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.id</code>. 主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.pid</code>. 第三方职位表ID，hrdb.hr_thid_party_position的id
     */
    public void setPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.pid</code>. 第三方职位表ID，hrdb.hr_thid_party_position的id
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.summary1</code>. 总结1
     */
    public void setSummary1(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.summary1</code>. 总结1
     */
    public String getSummary1() {
        return (String) get(2);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.summary2</code>. 总结2
     */
    public void setSummary2(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.summary2</code>. 总结2
     */
    public String getSummary2() {
        return (String) get(3);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.summary3</code>. 总结3
     */
    public void setSummary3(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.summary3</code>. 总结3
     */
    public String getSummary3() {
        return (String) get(4);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.occupation_ext1</code>. 额外职能1
     */
    public void setOccupationExt1(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.occupation_ext1</code>. 额外职能1
     */
    public String getOccupationExt1() {
        return (String) get(5);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.occupation_ext2</code>. 额外职能2
     */
    public void setOccupationExt2(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.occupation_ext2</code>. 额外职能2
     */
    public String getOccupationExt2() {
        return (String) get(6);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.child_address_id</code>. 子地址code
     */
    public void setChildAddressId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.child_address_id</code>. 子地址code
     */
    public String getChildAddressId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.child_address_name</code>. 子地址名称
     */
    public void setChildAddressName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.child_address_name</code>. 子地址名称
     */
    public String getChildAddressName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_jobsdb_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public void setStatus(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_jobsdb_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public Short getStatus() {
        return (Short) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, String, String, String, Timestamp, Timestamp, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, String, String, String, Timestamp, Timestamp, Short> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.SUMMARY1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.SUMMARY2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.SUMMARY3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.OCCUPATION_EXT1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.OCCUPATION_EXT2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.CHILD_ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.CHILD_ADDRESS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION.STATUS;
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
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSummary1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSummary2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSummary3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOccupationExt1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOccupationExt2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getChildAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getChildAddressName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value2(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value3(String value) {
        setSummary1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value4(String value) {
        setSummary2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value5(String value) {
        setSummary3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value6(String value) {
        setOccupationExt1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value7(String value) {
        setOccupationExt2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value8(String value) {
        setChildAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value9(String value) {
        setChildAddressName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord value12(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPositionRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Timestamp value10, Timestamp value11, Short value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThirdpartyJobsdbPositionRecord
     */
    public ThirdpartyJobsdbPositionRecord() {
        super(ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION);
    }

    /**
     * Create a detached, initialised ThirdpartyJobsdbPositionRecord
     */
    public ThirdpartyJobsdbPositionRecord(Integer id, Integer pid, String summary1, String summary2, String summary3, String occupationExt1, String occupationExt2, String childAddressId, String childAddressName, Timestamp createTime, Timestamp updateTime, Short status) {
        super(ThirdpartyJobsdbPosition.THIRDPARTY_JOBSDB_POSITION);

        set(0, id);
        set(1, pid);
        set(2, summary1);
        set(3, summary2);
        set(4, summary3);
        set(5, occupationExt1);
        set(6, occupationExt2);
        set(7, childAddressId);
        set(8, childAddressName);
        set(9, createTime);
        set(10, updateTime);
        set(11, status);
    }
}
