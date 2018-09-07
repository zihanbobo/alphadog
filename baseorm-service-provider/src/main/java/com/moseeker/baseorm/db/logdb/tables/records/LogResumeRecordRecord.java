/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogResumeRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogResumeRecordRecord extends UpdatableRecordImpl<LogResumeRecordRecord> implements Record9<Integer, Integer, String, String, String, String, Timestamp, String, String> {

    private static final long serialVersionUID = -1541544290;

    /**
     * Setter for <code>logdb.log_resume_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_resume_record.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_resume_record.file_name</code>.
     */
    public void setFileName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.file_name</code>.
     */
    public String getFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>logdb.log_resume_record.error_log</code>.
     */
    public void setErrorLog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.error_log</code>.
     */
    public String getErrorLog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>logdb.log_resume_record.field_value</code>.
     */
    public void setFieldValue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.field_value</code>.
     */
    public String getFieldValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logdb.log_resume_record.result_data</code>. resume解析后的原始数据
     */
    public void setResultData(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.result_data</code>. resume解析后的原始数据
     */
    public String getResultData() {
        return (String) get(5);
    }

    /**
     * Setter for <code>logdb.log_resume_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>logdb.log_resume_record.uuid</code>. profile的uuid标识,与主键一一对应
     */
    public void setUuid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.uuid</code>. profile的uuid标识,与主键一一对应
     */
    public String getUuid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>logdb.log_resume_record.text</code>. 解析前的文本数据
     */
    public void setText(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>logdb.log_resume_record.text</code>. 解析前的文本数据
     */
    public String getText() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, String, Timestamp, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, String, Timestamp, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogResumeRecord.LOG_RESUME_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogResumeRecord.LOG_RESUME_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LogResumeRecord.LOG_RESUME_RECORD.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LogResumeRecord.LOG_RESUME_RECORD.ERROR_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogResumeRecord.LOG_RESUME_RECORD.FIELD_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LogResumeRecord.LOG_RESUME_RECORD.RESULT_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return LogResumeRecord.LOG_RESUME_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return LogResumeRecord.LOG_RESUME_RECORD.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return LogResumeRecord.LOG_RESUME_RECORD.TEXT;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getErrorLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFieldValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getResultData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value3(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value4(String value) {
        setErrorLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value5(String value) {
        setFieldValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value6(String value) {
        setResultData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value8(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord value9(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogResumeRecordRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Timestamp value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogResumeRecordRecord
     */
    public LogResumeRecordRecord() {
        super(LogResumeRecord.LOG_RESUME_RECORD);
    }

    /**
     * Create a detached, initialised LogResumeRecordRecord
     */
    public LogResumeRecordRecord(Integer id, Integer userId, String fileName, String errorLog, String fieldValue, String resultData, Timestamp createTime, String uuid, String text) {
        super(LogResumeRecord.LOG_RESUME_RECORD);

        set(0, id);
        set(1, userId);
        set(2, fileName);
        set(3, errorLog);
        set(4, fieldValue);
        set(5, resultData);
        set(6, createTime);
        set(7, uuid);
        set(8, text);
    }
}
