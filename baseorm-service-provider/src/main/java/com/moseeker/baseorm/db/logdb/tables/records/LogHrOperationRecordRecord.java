/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogHrOperationRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * HR操作记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogHrOperationRecordRecord extends UpdatableRecordImpl<LogHrOperationRecordRecord> implements Record5<Integer, Integer, Integer, String, Timestamp> {

    private static final long serialVersionUID = -383719361;

    /**
     * Setter for <code>logdb.log_hr_operation_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_hr_operation_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_hr_operation_record.type</code>. 0:无效1：hr操作职位发布人
     */
    public void setType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_hr_operation_record.type</code>. 0:无效1：hr操作职位发布人
     */
    public Integer getType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_hr_operation_record.hraccount_id</code>. user_hr_account.id
     */
    public void setHraccountId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_hr_operation_record.hraccount_id</code>. user_hr_account.id
     */
    public Integer getHraccountId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>logdb.log_hr_operation_record.description</code>. 记录描述
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_hr_operation_record.description</code>. 记录描述
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>logdb.log_hr_operation_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_hr_operation_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
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
    public Row5<Integer, Integer, Integer, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogHrOperationRecord.LOG_HR_OPERATION_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogHrOperationRecord.LOG_HR_OPERATION_RECORD.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LogHrOperationRecord.LOG_HR_OPERATION_RECORD.HRACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LogHrOperationRecord.LOG_HR_OPERATION_RECORD.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return LogHrOperationRecord.LOG_HR_OPERATION_RECORD.CREATE_TIME;
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHraccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
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
    public LogHrOperationRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrOperationRecordRecord value2(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrOperationRecordRecord value3(Integer value) {
        setHraccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrOperationRecordRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrOperationRecordRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrOperationRecordRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5) {
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
     * Create a detached LogHrOperationRecordRecord
     */
    public LogHrOperationRecordRecord() {
        super(LogHrOperationRecord.LOG_HR_OPERATION_RECORD);
    }

    /**
     * Create a detached, initialised LogHrOperationRecordRecord
     */
    public LogHrOperationRecordRecord(Integer id, Integer type, Integer hraccountId, String description, Timestamp createTime) {
        super(LogHrOperationRecord.LOG_HR_OPERATION_RECORD);

        set(0, id);
        set(1, type);
        set(2, hraccountId);
        set(3, description);
        set(4, createTime);
    }
}
