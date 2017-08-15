/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.UserAliUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 阿里用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserAliUserRecord extends UpdatableRecordImpl<UserAliUserRecord> implements Record5<Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2122044681;

    /**
     * Setter for <code>userdb.user_ali_user.id</code>. 编号
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.user_ali_user.id</code>. 编号
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userdb.user_ali_user.user_id</code>. userdb.user_user.id, C端用户ID
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.user_ali_user.user_id</code>. userdb.user_user.id, C端用户ID
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>userdb.user_ali_user.uid</code>. 阿里账号id
     */
    public void setUid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.user_ali_user.uid</code>. 阿里账号id
     */
    public String getUid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>userdb.user_ali_user.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.user_ali_user.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>userdb.user_ali_user.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>userdb.user_ali_user.update_time</code>. 修改时间
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
    public Row5<Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserAliUser.USER_ALI_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserAliUser.USER_ALI_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserAliUser.USER_ALI_USER.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return UserAliUser.USER_ALI_USER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserAliUser.USER_ALI_USER.UPDATE_TIME;
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
        return getUid();
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
    public UserAliUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAliUserRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAliUserRecord value3(String value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAliUserRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAliUserRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAliUserRecord values(Integer value1, Integer value2, String value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached UserAliUserRecord
     */
    public UserAliUserRecord() {
        super(UserAliUser.USER_ALI_USER);
    }

    /**
     * Create a detached, initialised UserAliUserRecord
     */
    public UserAliUserRecord(Integer id, Integer userId, String uid, Timestamp createTime, Timestamp updateTime) {
        super(UserAliUser.USER_ALI_USER);

        set(0, id);
        set(1, userId);
        set(2, uid);
        set(3, createTime);
        set(4, updateTime);
    }
}
