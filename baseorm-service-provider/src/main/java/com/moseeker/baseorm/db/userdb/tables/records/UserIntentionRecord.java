/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.UserIntention;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * 用户求职意向
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserIntentionRecord extends TableRecordImpl<UserIntentionRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1820087861;

    /**
     * Setter for <code>userdb.user_intention.sysuser_id</code>. 用户ID
     */
    public void setSysuserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.user_intention.sysuser_id</code>. 用户ID
     */
    public Integer getSysuserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userdb.user_intention.intention</code>. 求职意向
     */
    public void setIntention(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.user_intention.intention</code>. 求职意向
     */
    public String getIntention() {
        return (String) get(1);
    }

    /**
     * Setter for <code>userdb.user_intention.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.user_intention.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>userdb.user_intention.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.user_intention.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserIntention.USER_INTENTION.SYSUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserIntention.USER_INTENTION.INTENTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UserIntention.USER_INTENTION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return UserIntention.USER_INTENTION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSysuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIntention();
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
    public UserIntentionRecord value1(Integer value) {
        setSysuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIntentionRecord value2(String value) {
        setIntention(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIntentionRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIntentionRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIntentionRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached UserIntentionRecord
     */
    public UserIntentionRecord() {
        super(UserIntention.USER_INTENTION);
    }

    /**
     * Create a detached, initialised UserIntentionRecord
     */
    public UserIntentionRecord(Integer sysuserId, String intention, Timestamp createTime, Timestamp updateTime) {
        super(UserIntention.USER_INTENTION);

        set(0, sysuserId);
        set(1, intention);
        set(2, createTime);
        set(3, updateTime);
    }
}
