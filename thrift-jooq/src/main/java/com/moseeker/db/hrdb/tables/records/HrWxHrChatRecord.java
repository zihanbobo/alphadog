/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables.records;


import com.moseeker.db.hrdb.tables.HrWxHrChat;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * IM聊天
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxHrChatRecord extends UpdatableRecordImpl<HrWxHrChatRecord> implements Record7<UInteger, Integer, String, Integer, Byte, Byte, Timestamp> {

	private static final long serialVersionUID = -1211490335;

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.id</code>. ID
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.id</code>. ID
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.chatlist_id</code>. wx_hr_chat_list.id
	 */
	public void setChatlistId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.chatlist_id</code>. wx_hr_chat_list.id
	 */
	public Integer getChatlistId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.content</code>. 聊天内容
	 */
	public void setContent(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.content</code>. 聊天内容
	 */
	public String getContent() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.pid</code>. hr_position.id
	 */
	public void setPid(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.pid</code>. hr_position.id
	 */
	public Integer getPid() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.speaker</code>. 状态，0：求职者，1：HR
	 */
	public void setSpeaker(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.speaker</code>. 状态，0：求职者，1：HR
	 */
	public Byte getSpeaker() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.status</code>. 状态，0：有效，1：无效
	 */
	public void setStatus(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.status</code>. 状态，0：有效，1：无效
	 */
	public Byte getStatus() {
		return (Byte) getValue(5);
	}

	/**
	 * Setter for <code>hrDB.hr_wx_hr_chat.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrDB.hr_wx_hr_chat.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
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
	public Row7<UInteger, Integer, String, Integer, Byte, Byte, Timestamp> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<UInteger, Integer, String, Integer, Byte, Byte, Timestamp> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return HrWxHrChat.HR_WX_HR_CHAT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return HrWxHrChat.HR_WX_HR_CHAT.CHATLIST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return HrWxHrChat.HR_WX_HR_CHAT.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return HrWxHrChat.HR_WX_HR_CHAT.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return HrWxHrChat.HR_WX_HR_CHAT.SPEAKER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return HrWxHrChat.HR_WX_HR_CHAT.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return HrWxHrChat.HR_WX_HR_CHAT.CREATE_TIME;
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
		return getChatlistId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getSpeaker();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value2(Integer value) {
		setChatlistId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value3(String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value4(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value5(Byte value) {
		setSpeaker(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value6(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord value7(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxHrChatRecord values(UInteger value1, Integer value2, String value3, Integer value4, Byte value5, Byte value6, Timestamp value7) {
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
	 * Create a detached HrWxHrChatRecord
	 */
	public HrWxHrChatRecord() {
		super(HrWxHrChat.HR_WX_HR_CHAT);
	}

	/**
	 * Create a detached, initialised HrWxHrChatRecord
	 */
	public HrWxHrChatRecord(UInteger id, Integer chatlistId, String content, Integer pid, Byte speaker, Byte status, Timestamp createTime) {
		super(HrWxHrChat.HR_WX_HR_CHAT);

		setValue(0, id);
		setValue(1, chatlistId);
		setValue(2, content);
		setValue(3, pid);
		setValue(4, speaker);
		setValue(5, status);
		setValue(6, createTime);
	}
}
