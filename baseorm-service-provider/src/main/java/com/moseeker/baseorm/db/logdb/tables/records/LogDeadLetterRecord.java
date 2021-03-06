/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogDeadLetter;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 死信队列日志记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogDeadLetterRecord extends UpdatableRecordImpl<LogDeadLetterRecord> implements Record9<Integer, Integer, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1248189960;

    /**
     * Setter for <code>logdb.log_dead_letter.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.appid</code>. appid
     */
    public void setAppid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.appid</code>. appid
     */
    public Integer getAppid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.queue_name</code>. 队列名称
     */
    public void setQueueName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.queue_name</code>. 队列名称
     */
    public String getQueueName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.exchange_name</code>. 交换机名称
     */
    public void setExchangeName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.exchange_name</code>. 交换机名称
     */
    public String getExchangeName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.routing_key</code>. 路由键
     */
    public void setRoutingKey(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.routing_key</code>. 路由键
     */
    public String getRoutingKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.msg</code>. 消息体
     */
    public void setMsg(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.msg</code>. 消息体
     */
    public String getMsg() {
        return (String) get(5);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.error_log</code>. 失败日志
     */
    public void setErrorLog(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.error_log</code>. 失败日志
     */
    public String getErrorLog() {
        return (String) get(6);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>logdb.log_dead_letter.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>logdb.log_dead_letter.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
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
    public Row9<Integer, Integer, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogDeadLetter.LOG_DEAD_LETTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogDeadLetter.LOG_DEAD_LETTER.APPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LogDeadLetter.LOG_DEAD_LETTER.QUEUE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LogDeadLetter.LOG_DEAD_LETTER.EXCHANGE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogDeadLetter.LOG_DEAD_LETTER.ROUTING_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LogDeadLetter.LOG_DEAD_LETTER.MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LogDeadLetter.LOG_DEAD_LETTER.ERROR_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return LogDeadLetter.LOG_DEAD_LETTER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return LogDeadLetter.LOG_DEAD_LETTER.UPDATE_TIME;
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
        return getAppid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getQueueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExchangeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRoutingKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getErrorLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value2(Integer value) {
        setAppid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value3(String value) {
        setQueueName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value4(String value) {
        setExchangeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value5(String value) {
        setRoutingKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value6(String value) {
        setMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value7(String value) {
        setErrorLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogDeadLetterRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached LogDeadLetterRecord
     */
    public LogDeadLetterRecord() {
        super(LogDeadLetter.LOG_DEAD_LETTER);
    }

    /**
     * Create a detached, initialised LogDeadLetterRecord
     */
    public LogDeadLetterRecord(Integer id, Integer appid, String queueName, String exchangeName, String routingKey, String msg, String errorLog, Timestamp createTime, Timestamp updateTime) {
        super(LogDeadLetter.LOG_DEAD_LETTER);

        set(0, id);
        set(1, appid);
        set(2, queueName);
        set(3, exchangeName);
        set(4, routingKey);
        set(5, msg);
        set(6, errorLog);
        set(7, createTime);
        set(8, updateTime);
    }
}
