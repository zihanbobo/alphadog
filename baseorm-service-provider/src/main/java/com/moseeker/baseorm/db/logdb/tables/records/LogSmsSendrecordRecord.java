/**
 * This class is generated by jOOQ
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
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogSmsSendrecordRecord extends UpdatableRecordImpl<LogSmsSendrecordRecord> implements Record7<Integer, Byte, Long, String, String, Timestamp, String> {

    private static final long serialVersionUID = 623210618;

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
     * Setter for <code>logdb.log_sms_sendrecord.sys</code>. 来自系统，0:未知 1:platform 2:qx 3:hr 4:官网 9:script
     */
    public void setSys(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.sys</code>. 来自系统，0:未知 1:platform 2:qx 3:hr 4:官网 9:script
     */
    public Byte getSys() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.mobile</code>.
     */
    public void setMobile(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.mobile</code>.
     */
    public Long getMobile() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.msg</code>. 发送内容
     */
    public void setMsg(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.msg</code>. 发送内容
     */
    public String getMsg() {
        return (String) get(3);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.ip</code>. IP
     */
    public void setIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.ip</code>. IP
     */
    public String getIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>logdb.log_sms_sendrecord.country_code</code>.
     */
    public void setCountryCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>logdb.log_sms_sendrecord.country_code</code>.
     */
    public String getCountryCode() {
        return (String) get(6);
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
    public Row7<Integer, Byte, Long, String, String, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Byte, Long, String, String, Timestamp, String> valuesRow() {
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
    public Field<Byte> field2() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LogSmsSendrecord.LOG_SMS_SENDRECORD.COUNTRY_CODE;
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
    public Byte value2() {
        return getSys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIp();
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
    public String value7() {
        return getCountryCode();
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
    public LogSmsSendrecordRecord value2(Byte value) {
        setSys(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value3(Long value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value4(String value) {
        setMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value5(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord value7(String value) {
        setCountryCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogSmsSendrecordRecord values(Integer value1, Byte value2, Long value3, String value4, String value5, Timestamp value6, String value7) {
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
    public LogSmsSendrecordRecord(Integer id, Byte sys, Long mobile, String msg, String ip, Timestamp createTime, String countryCode) {
        super(LogSmsSendrecord.LOG_SMS_SENDRECORD);

        set(0, id);
        set(1, sys);
        set(2, mobile);
        set(3, msg);
        set(4, ip);
        set(5, createTime);
        set(6, countryCode);
    }
}
