/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogSmsSendrecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 短信发送记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogSmsSendrecordRecord extends UpdatableRecordImpl<LogSmsSendrecordRecord> implements Record7<Integer, String, Byte, Long, String, String, Timestamp> {

    private static final long serialVersionUID = -2141962497;

    /**
     * Setter for <code>logdb.log_sms_sendrecord.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.country_code</code>. 国家代码
     */
    public void setCountryCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.country_code</code>. 国家代码
     */
    public String getCountryCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.sys</code>. 来自系统，0:未知 1:platform 2:qx 3:hr 4:官网 9:script
     */
    public void setSys(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.sys</code>. 来自系统，0:未知 1:platform 2:qx 3:hr 4:官网 9:script
     */
    public Byte getSys() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.mobile</code>.
     */
    public void setMobile(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.mobile</code>.
     */
    public Long getMobile() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.msg</code>. 发送内容
     */
    public void setMsg(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.msg</code>. 发送内容
     */
    public String getMsg() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.ip</code>. IP
     */
    public void setIp(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.ip</code>. IP
     */
    public String getIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.create_time</code>.
     */
    public Timestamp getCreateTime() {
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
    public Row7<Integer, String, Byte, Long, String, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Byte, Long, String, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.COUNTRY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.CREATE_TIME;
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
    public String value2() {
        return getCountryCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getSys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIp();
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
    public LogSmsSendrecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value2(String value) {
        setCountryCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value3(Byte value) {
        setSys(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value4(Long value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value5(String value) {
        setMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value6(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord values(Integer value1, String value2, Byte value3, Long value4, String value5, String value6, Timestamp value7) {
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
     * Create a detached LogSmsSendrecordRecord
     */
    public LogSmsSendrecordRecord() {
        super(LogSmsSendrecord.LOG_SMS_SENDRECORD);
    }

    /**
     * Create a detached, initialised LogSmsSendrecordRecord
     */
    public LogSmsSendrecordRecord(Integer id, String countryCode, Byte sys, Long mobile, String msg, String ip, Timestamp createTime) {
        super(LogSmsSendrecord.LOG_SMS_SENDRECORD);

        set(0, id);
        set(1, countryCode);
        set(2, sys);
        set(3, mobile);
        set(4, msg);
        set(5, ip);
        set(6, createTime);
    }
}
