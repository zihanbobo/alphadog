/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatList;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * IM聊天人关系
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxHrChatListRecord extends UpdatableRecordImpl<HrWxHrChatListRecord> implements Record7<UInteger, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1409044852;

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.id</code>. ID
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.id</code>. ID
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.sysuser_id</code>. sysuser.id
	 */
	public void setSysuserId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.sysuser_id</code>. sysuser.id
	 */
	public Integer getSysuserId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.hraccount_id</code>. hr_account.id
	 */
	public void setHraccountId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.hraccount_id</code>. hr_account.id
	 */
	public Integer getHraccountId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.status</code>. 状态，0：有效，1：无效
	 */
	public void setStatus(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.status</code>. 状态，0：有效，1：无效
	 */
	public Byte getStatus() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.wx_chat_time</code>. sysuser最近一次聊天时间
	 */
	public void setWxChatTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.wx_chat_time</code>. sysuser最近一次聊天时间
	 */
	public Timestamp getWxChatTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_hr_chat_list.hr_chat_time</code>. HR最近一次聊天时间
	 */
	public void setHrChatTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_hr_chat_list.hr_chat_time</code>. HR最近一次聊天时间
	 */
	public Timestamp getHrChatTime() {
		return (Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UInteger> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<UInteger, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<UInteger, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
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
	public Field<Byte> field4() {
		return HrWxHrChatList.HR_WX_HR_CHAT_LIST.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return HrWxHrChatList.HR_WX_HR_CHAT_LIST.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return HrWxHrChatList.HR_WX_HR_CHAT_LIST.WX_CHAT_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return HrWxHrChatList.HR_WX_HR_CHAT_LIST.HR_CHAT_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value1() {
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
	public Byte value4() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getWxChatTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getHrChatTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatListRecord value1(UInteger value) {
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
	public HrWxHrChatListRecord value4(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatListRecord value5(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatListRecord value6(Timestamp value) {
		setWxChatTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatListRecord value7(Timestamp value) {
		setHrChatTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatListRecord values(UInteger value1, Integer value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6, Timestamp value7) {
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
	 * Create a detached HrWxHrChatListRecord
	 */
	public HrWxHrChatListRecord() {
		super(HrWxHrChatList.HR_WX_HR_CHAT_LIST);
	}

	/**
	 * Create a detached, initialised HrWxHrChatListRecord
	 */
	public HrWxHrChatListRecord(UInteger id, Integer sysuserId, Integer hraccountId, Byte status, Timestamp createTime, Timestamp wxChatTime, Timestamp hrChatTime) {
		super(HrWxHrChatList.HR_WX_HR_CHAT_LIST);

		setValue(0, id);
		setValue(1, sysuserId);
		setValue(2, hraccountId);
		setValue(3, status);
		setValue(4, createTime);
		setValue(5, wxChatTime);
		setValue(6, hrChatTime);
	}
}
