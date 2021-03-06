/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogHrloginRecord;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * hr每日登陆/使用统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogHrloginRecordRecord extends UpdatableRecordImpl<LogHrloginRecordRecord> implements Record5<Integer, Integer, Date, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1322018081;

    /**
     * Setter for <code>logdb.log_hrlogin_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_hrlogin_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_hrlogin_record.hr_id</code>.
     */
    public void setHrId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_hrlogin_record.hr_id</code>.
     */
    public Integer getHrId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_hrlogin_record.login_date</code>. 使用日期
     */
    public void setLoginDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_hrlogin_record.login_date</code>. 使用日期
     */
    public Date getLoginDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>logdb.log_hrlogin_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_hrlogin_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>logdb.log_hrlogin_record.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_hrlogin_record.update_time</code>.
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
    public Row5<Integer, Integer, Date, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Date, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogHrloginRecord.LOG_HRLOGIN_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogHrloginRecord.LOG_HRLOGIN_RECORD.HR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return LogHrloginRecord.LOG_HRLOGIN_RECORD.LOGIN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return LogHrloginRecord.LOG_HRLOGIN_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return LogHrloginRecord.LOG_HRLOGIN_RECORD.UPDATE_TIME;
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
        return getHrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getLoginDate();
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
    public LogHrloginRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrloginRecordRecord value2(Integer value) {
        setHrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrloginRecordRecord value3(Date value) {
        setLoginDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrloginRecordRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrloginRecordRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogHrloginRecordRecord values(Integer value1, Integer value2, Date value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached LogHrloginRecordRecord
     */
    public LogHrloginRecordRecord() {
        super(LogHrloginRecord.LOG_HRLOGIN_RECORD);
    }

    /**
     * Create a detached, initialised LogHrloginRecordRecord
     */
    public LogHrloginRecordRecord(Integer id, Integer hrId, Date loginDate, Timestamp createTime, Timestamp updateTime) {
        super(LogHrloginRecord.LOG_HRLOGIN_RECORD);

        set(0, id);
        set(1, hrId);
        set(2, loginDate);
        set(3, createTime);
        set(4, updateTime);
    }
}
