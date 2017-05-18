/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrWxNoticeMessage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 微信消息通知, first和remark文案暂不使用
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxNoticeMessageRecord extends UpdatableRecordImpl<HrWxNoticeMessageRecord> implements Record6<Integer, Integer, Integer, String, String, Byte> {

	private static final long serialVersionUID = 1864443764;

	/**
	 * Setter for <code>hrdb.hr_wx_notice_message.id</code>. 主key
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_notice_message.id</code>. 主key
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_notice_message.wechat_id</code>. 所属公众号
	 */
	public void setWechatId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_notice_message.wechat_id</code>. 所属公众号
	 */
	public Integer getWechatId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_notice_message.notice_id</code>. sys_notice_message.id
	 */
	public void setNoticeId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_notice_message.notice_id</code>. sys_notice_message.id
	 */
	public Integer getNoticeId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_notice_message.first</code>. 消息模板first文案
	 */
	public void setFirst(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_notice_message.first</code>. 消息模板first文案
	 */
	public String getFirst() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_notice_message.remark</code>. 消息模板remark文案
	 */
	public void setRemark(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_notice_message.remark</code>. 消息模板remark文案
	 */
	public String getRemark() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_notice_message.status</code>. 是否开启, 1:开启, 0:关闭
	 */
	public void setStatus(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_notice_message.status</code>. 是否开启, 1:开启, 0:关闭
	 */
	public Byte getStatus() {
		return (Byte) getValue(5);
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
	public Row6<Integer, Integer, Integer, String, String, Byte> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, String, String, Byte> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE.WECHAT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE.NOTICE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE.FIRST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE.REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE.STATUS;
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
		return getWechatId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getNoticeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getRemark();
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
	public HrWxNoticeMessageRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNoticeMessageRecord value2(Integer value) {
		setWechatId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNoticeMessageRecord value3(Integer value) {
		setNoticeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNoticeMessageRecord value4(String value) {
		setFirst(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNoticeMessageRecord value5(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNoticeMessageRecord value6(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNoticeMessageRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Byte value6) {
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
	 * Create a detached HrWxNoticeMessageRecord
	 */
	public HrWxNoticeMessageRecord() {
		super(HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE);
	}

	/**
	 * Create a detached, initialised HrWxNoticeMessageRecord
	 */
	public HrWxNoticeMessageRecord(Integer id, Integer wechatId, Integer noticeId, String first, String remark, Byte status) {
		super(HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE);

		setValue(0, id);
		setValue(1, wechatId);
		setValue(2, noticeId);
		setValue(3, first);
		setValue(4, remark);
		setValue(5, status);
	}
}
