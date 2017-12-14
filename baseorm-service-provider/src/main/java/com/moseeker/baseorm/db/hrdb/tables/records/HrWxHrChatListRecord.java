/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatList;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * IM聊天人关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxHrChatListRecord extends UpdatableRecordImpl<HrWxHrChatListRecord> implements Record9<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 1326812420;

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.id</code>. ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.id</code>. ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.sysuser_id</code>. sysuser.id
     */
    public void setSysuserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.sysuser_id</code>. sysuser.id
     */
    public Integer getSysuserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.hraccount_id</code>. hr_account.id
     */
    public void setHraccountId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.hraccount_id</code>. hr_account.id
     */
    public Integer getHraccountId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.wx_chat_time</code>. sysuser最近一次聊天时间
     */
    public void setWxChatTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.wx_chat_time</code>. sysuser最近一次聊天时间
     */
    public Timestamp getWxChatTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.hr_chat_time</code>. HR最近一次聊天时间
     */
    public void setHrChatTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.hr_chat_time</code>. HR最近一次聊天时间
     */
    public Timestamp getHrChatTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.update_time</code>. 创建时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.update_time</code>. 创建时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.hr_unread_count</code>. hr未读消息数量
     */
    public void setHrUnreadCount(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.hr_unread_count</code>. hr未读消息数量
     */
    public Integer getHrUnreadCount() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_wx_hr_chat_list.user_unread_count</code>. C端用户未读消息数量
     */
    public void setUserUnreadCount(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_hr_chat_list.user_unread_count</code>. C端用户未读消息数量
     */
    public Integer getUserUnreadCount() {
        return (Integer) get(8);
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
    public Row9<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.SYSUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.HRACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.WX_CHAT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.HR_CHAT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.HR_UNREAD_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return HrWxHrChatList.HR_WX_HR_CHAT_LIST.USER_UNREAD_COUNT;
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
        return getSysuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHraccountId();
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
        return getWxChatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getHrChatTime();
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
    public Integer value8() {
        return getHrUnreadCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUserUnreadCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value2(Integer value) {
        setSysuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value3(Integer value) {
        setHraccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value5(Timestamp value) {
        setWxChatTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value6(Timestamp value) {
        setHrChatTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value8(Integer value) {
        setHrUnreadCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord value9(Integer value) {
        setUserUnreadCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChatListRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, Timestamp value6, Timestamp value7, Integer value8, Integer value9) {
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
     * Create a detached HrWxHrChatListRecord
     */
    public HrWxHrChatListRecord() {
        super(HrWxHrChatList.HR_WX_HR_CHAT_LIST);
    }

    /**
     * Create a detached, initialised HrWxHrChatListRecord
     */
    public HrWxHrChatListRecord(Integer id, Integer sysuserId, Integer hraccountId, Timestamp createTime, Timestamp wxChatTime, Timestamp hrChatTime, Timestamp updateTime, Integer hrUnreadCount, Integer userUnreadCount) {
        super(HrWxHrChatList.HR_WX_HR_CHAT_LIST);

        set(0, id);
        set(1, sysuserId);
        set(2, hraccountId);
        set(3, createTime);
        set(4, wxChatTime);
        set(5, hrChatTime);
        set(6, updateTime);
        set(7, hrUnreadCount);
        set(8, userUnreadCount);
    }
}
