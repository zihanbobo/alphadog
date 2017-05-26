/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StDquserLogin;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用于统计C端用户登录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StDquserLoginRecord extends UpdatableRecordImpl<StDquserLoginRecord> implements Record4<Integer, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 409569347;

    /**
     * Setter for <code>analytics.st_dquser_login.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.st_dquser_login.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.st_dquser_login.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.st_dquser_login.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>analytics.st_dquser_login.sysuser_id</code>. 对应sys_user表的id
     */
    public void setSysuserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.st_dquser_login.sysuser_id</code>. 对应sys_user表的id
     */
    public Integer getSysuserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>analytics.st_dquser_login.wechat_id</code>. wechat_id可以用来判断微信公众号
     */
    public void setWechatId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.st_dquser_login.wechat_id</code>. wechat_id可以用来判断微信公众号
     */
    public Integer getWechatId() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StDquserLogin.ST_DQUSER_LOGIN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return StDquserLogin.ST_DQUSER_LOGIN.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StDquserLogin.ST_DQUSER_LOGIN.SYSUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return StDquserLogin.ST_DQUSER_LOGIN.WECHAT_ID;
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
    public Timestamp value2() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSysuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getWechatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDquserLoginRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDquserLoginRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDquserLoginRecord value3(Integer value) {
        setSysuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDquserLoginRecord value4(Integer value) {
        setWechatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDquserLoginRecord values(Integer value1, Timestamp value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StDquserLoginRecord
     */
    public StDquserLoginRecord() {
        super(StDquserLogin.ST_DQUSER_LOGIN);
    }

    /**
     * Create a detached, initialised StDquserLoginRecord
     */
    public StDquserLoginRecord(Integer id, Timestamp createTime, Integer sysuserId, Integer wechatId) {
        super(StDquserLogin.ST_DQUSER_LOGIN);

        set(0, id);
        set(1, createTime);
        set(2, sysuserId);
        set(3, wechatId);
    }
}
