/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.HrWxRule;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 微信回复规则表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxRuleRecord extends UpdatableRecordImpl<HrWxRuleRecord> implements Record9<UInteger, UInteger, UInteger, String, String, UInteger, Byte, UInteger, String> {

	private static final long serialVersionUID = 8464366;

	/**
	 * Setter for <code>dqv4.hr_wx_rule.id</code>.
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.id</code>.
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.wechat_id</code>.
	 */
	public void setWechatId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.wechat_id</code>.
	 */
	public UInteger getWechatId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.cid</code>.
	 */
	public void setCid(UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.cid</code>.
	 */
	public UInteger getCid() {
		return (UInteger) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.name</code>.
	 */
	public void setName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.name</code>.
	 */
	public String getName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.module</code>. 模块名称
	 */
	public void setModule(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.module</code>. 模块名称
	 */
	public String getModule() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.displayorder</code>. 排序
	 */
	public void setDisplayorder(UInteger value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.displayorder</code>. 排序
	 */
	public UInteger getDisplayorder() {
		return (UInteger) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.status</code>. 规则状态，0禁用，1启用，2置顶
	 */
	public void setStatus(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.status</code>. 规则状态，0禁用，1启用，2置顶
	 */
	public Byte getStatus() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.access_level</code>. 规则获取权限，0：所有，1：员工
	 */
	public void setAccessLevel(UInteger value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.access_level</code>. 规则获取权限，0：所有，1：员工
	 */
	public UInteger getAccessLevel() {
		return (UInteger) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.hr_wx_rule.keywords</code>. 关键字
	 */
	public void setKeywords(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.hr_wx_rule.keywords</code>. 关键字
	 */
	public String getKeywords() {
		return (String) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<UInteger, UInteger, UInteger, String, String, UInteger, Byte, UInteger, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<UInteger, UInteger, UInteger, String, String, UInteger, Byte, UInteger, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return HrWxRule.HR_WX_RULE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return HrWxRule.HR_WX_RULE.WECHAT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field3() {
		return HrWxRule.HR_WX_RULE.CID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return HrWxRule.HR_WX_RULE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return HrWxRule.HR_WX_RULE.MODULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field6() {
		return HrWxRule.HR_WX_RULE.DISPLAYORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field7() {
		return HrWxRule.HR_WX_RULE.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field8() {
		return HrWxRule.HR_WX_RULE.ACCESS_LEVEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return HrWxRule.HR_WX_RULE.KEYWORDS;
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
	public UInteger value2() {
		return getWechatId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value3() {
		return getCid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getModule();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value6() {
		return getDisplayorder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value7() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value8() {
		return getAccessLevel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getKeywords();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value2(UInteger value) {
		setWechatId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value3(UInteger value) {
		setCid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value5(String value) {
		setModule(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value6(UInteger value) {
		setDisplayorder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value7(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value8(UInteger value) {
		setAccessLevel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord value9(String value) {
		setKeywords(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRuleRecord values(UInteger value1, UInteger value2, UInteger value3, String value4, String value5, UInteger value6, Byte value7, UInteger value8, String value9) {
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
	 * Create a detached HrWxRuleRecord
	 */
	public HrWxRuleRecord() {
		super(HrWxRule.HR_WX_RULE);
	}

	/**
	 * Create a detached, initialised HrWxRuleRecord
	 */
	public HrWxRuleRecord(UInteger id, UInteger wechatId, UInteger cid, String name, String module, UInteger displayorder, Byte status, UInteger accessLevel, String keywords) {
		super(HrWxRule.HR_WX_RULE);

		setValue(0, id);
		setValue(1, wechatId);
		setValue(2, cid);
		setValue(3, name);
		setValue(4, module);
		setValue(5, displayorder);
		setValue(6, status);
		setValue(7, accessLevel);
		setValue(8, keywords);
	}
}
