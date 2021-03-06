/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogEmailSendrecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class LogEmailSendrecordRecord extends UpdatableRecordImpl<LogEmailSendrecordRecord> implements Record6<Integer, Integer, Byte, String, String, Timestamp> {

    private static final long serialVersionUID = -1666946879;

    /**
     * Setter for <code>logdb.log_email_sendrecord.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_email_sendrecord.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_email_sendrecord.tpl_id</code>. 邮件模板ID
     */
    public void setTplId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_email_sendrecord.tpl_id</code>. 邮件模板ID
     */
    public Integer getTplId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_email_sendrecord.sys</code>. 来自系统，0:未知 1:platform 2:qx 3:hr 4:官网 9:script
     */
    public void setSys(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_email_sendrecord.sys</code>. 来自系统，0:未知 1:platform 2:qx 3:hr 4:官网 9:script
     */
    public Byte getSys() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>logdb.log_email_sendrecord.email</code>. 邮箱地址
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_email_sendrecord.email</code>. 邮箱地址
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>logdb.log_email_sendrecord.content</code>. 邮件变量部分内容以json方式
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_email_sendrecord.content</code>. 邮件变量部分内容以json方式
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logdb.log_email_sendrecord.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>logdb.log_email_sendrecord.create_time</code>.
     */
    public Timestamp getCreateTime() {
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
    public Row6<Integer, Integer, Byte, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Byte, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogEmailSendrecord.LOG_EMAIL_SENDRECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogEmailSendrecord.LOG_EMAIL_SENDRECORD.TPL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return LogEmailSendrecord.LOG_EMAIL_SENDRECORD.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LogEmailSendrecord.LOG_EMAIL_SENDRECORD.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogEmailSendrecord.LOG_EMAIL_SENDRECORD.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return LogEmailSendrecord.LOG_EMAIL_SENDRECORD.CREATE_TIME;
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
        return getTplId();
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
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
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
    public LogEmailSendrecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogEmailSendrecordRecord value2(Integer value) {
        setTplId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogEmailSendrecordRecord value3(Byte value) {
        setSys(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogEmailSendrecordRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogEmailSendrecordRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogEmailSendrecordRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogEmailSendrecordRecord values(Integer value1, Integer value2, Byte value3, String value4, String value5, Timestamp value6) {
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
     * Create a detached LogEmailSendrecordRecord
     */
    public LogEmailSendrecordRecord() {
        super(LogEmailSendrecord.LOG_EMAIL_SENDRECORD);
    }

    /**
     * Create a detached, initialised LogEmailSendrecordRecord
     */
    public LogEmailSendrecordRecord(Integer id, Integer tplId, Byte sys, String email, String content, Timestamp createTime) {
        super(LogEmailSendrecord.LOG_EMAIL_SENDRECORD);

        set(0, id);
        set(1, tplId);
        set(2, sys);
        set(3, email);
        set(4, content);
        set(5, createTime);
    }
}
