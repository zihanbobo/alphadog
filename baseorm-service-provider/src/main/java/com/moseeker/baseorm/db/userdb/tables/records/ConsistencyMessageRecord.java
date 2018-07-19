/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.ConsistencyMessage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConsistencyMessageRecord extends UpdatableRecordImpl<ConsistencyMessageRecord> implements Record9<String, String, Timestamp, Timestamp, Integer, Byte, Timestamp, String, Byte> {

    private static final long serialVersionUID = 536237537;

    /**
     * Setter for <code>userdb.consistency_message.message_id</code>. 消息编号
     */
    public void setMessageId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.message_id</code>. 消息编号
     */
    public String getMessageId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>userdb.consistency_message.name</code>. 业务名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.name</code>. 业务名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>userdb.consistency_message.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>userdb.consistency_message.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>userdb.consistency_message.version</code>. 版本
     */
    public void setVersion(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.version</code>. 版本
     */
    public Integer getVersion() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>userdb.consistency_message.retried</code>. 已经重试的次数
     */
    public void setRetried(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.retried</code>. 已经重试的次数
     */
    public Byte getRetried() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>userdb.consistency_message.last_retry_time</code>. 最后重试的时间
     */
    public void setLastRetryTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.last_retry_time</code>. 最后重试的时间
     */
    public Timestamp getLastRetryTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>userdb.consistency_message.param</code>. 参数
     */
    public void setParam(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.param</code>. 参数
     */
    public String getParam() {
        return (String) get(7);
    }

    /**
     * Setter for <code>userdb.consistency_message.finish</code>. 是否完成, 0 未完成， 1 完成
     */
    public void setFinish(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>userdb.consistency_message.finish</code>. 是否完成, 0 未完成， 1 完成
     */
    public Byte getFinish() {
        return (Byte) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Timestamp, Timestamp, Integer, Byte, Timestamp, String, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Timestamp, Timestamp, Integer, Byte, Timestamp, String, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.RETRIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.LAST_RETRY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.PARAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return ConsistencyMessage.CONSISTENCY_MESSAGE.FINISH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getRetried();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastRetryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getFinish();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value1(String value) {
        setMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value5(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value6(Byte value) {
        setRetried(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value7(Timestamp value) {
        setLastRetryTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value8(String value) {
        setParam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord value9(Byte value) {
        setFinish(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyMessageRecord values(String value1, String value2, Timestamp value3, Timestamp value4, Integer value5, Byte value6, Timestamp value7, String value8, Byte value9) {
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
     * Create a detached ConsistencyMessageRecord
     */
    public ConsistencyMessageRecord() {
        super(ConsistencyMessage.CONSISTENCY_MESSAGE);
    }

    /**
     * Create a detached, initialised ConsistencyMessageRecord
     */
    public ConsistencyMessageRecord(String messageId, String name, Timestamp createTime, Timestamp updateTime, Integer version, Byte retried, Timestamp lastRetryTime, String param, Byte finish) {
        super(ConsistencyMessage.CONSISTENCY_MESSAGE);

        set(0, messageId);
        set(1, name);
        set(2, createTime);
        set(3, updateTime);
        set(4, version);
        set(5, retried);
        set(6, lastRetryTime);
        set(7, param);
        set(8, finish);
    }
}
