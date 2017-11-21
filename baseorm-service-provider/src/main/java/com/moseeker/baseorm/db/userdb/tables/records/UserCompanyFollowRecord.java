/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.UserCompanyFollow;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 公司关注表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCompanyFollowRecord extends UpdatableRecordImpl<UserCompanyFollowRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1348270499;

    /**
     * Setter for <code>userdb.user_company_follow.id</code>. id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.id</code>. id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userdb.user_company_follow.company_id</code>. hr_company.id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.company_id</code>. hr_company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>userdb.user_company_follow.user_id</code>. user_user.id
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.user_id</code>. user_user.id
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>userdb.user_company_follow.status</code>. 0: 关注 1：取消关注
     */
    public void setStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.status</code>. 0: 关注 1：取消关注
     */
    public Integer getStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>userdb.user_company_follow.source</code>. 关注来源 0: 未知 1：微信端 2：PC 端
     */
    public void setSource(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.source</code>. 关注来源 0: 未知 1：微信端 2：PC 端
     */
    public Integer getSource() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>userdb.user_company_follow.create_time</code>. 关注时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.create_time</code>. 关注时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>userdb.user_company_follow.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>userdb.user_company_follow.unfollow_time</code>. 取消关注时间
     */
    public void setUnfollowTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>userdb.user_company_follow.unfollow_time</code>. 取消关注时间
     */
    public Timestamp getUnfollowTime() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return UserCompanyFollow.USER_COMPANY_FOLLOW.UNFOLLOW_TIME;
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
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSource();
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
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUnfollowTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value4(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value5(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord value8(Timestamp value) {
        setUnfollowTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCompanyFollowRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Timestamp value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserCompanyFollowRecord
     */
    public UserCompanyFollowRecord() {
        super(UserCompanyFollow.USER_COMPANY_FOLLOW);
    }

    /**
     * Create a detached, initialised UserCompanyFollowRecord
     */
    public UserCompanyFollowRecord(Integer id, Integer companyId, Integer userId, Integer status, Integer source, Timestamp createTime, Timestamp updateTime, Timestamp unfollowTime) {
        super(UserCompanyFollow.USER_COMPANY_FOLLOW);

        set(0, id);
        set(1, companyId);
        set(2, userId);
        set(3, status);
        set(4, source);
        set(5, createTime);
        set(6, updateTime);
        set(7, unfollowTime);
    }
}
