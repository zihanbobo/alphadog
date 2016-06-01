/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics.tables.records;


import com.moseeker.db.analytics.tables.WebHrpCore;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WebHrpCoreRecord extends UpdatableRecordImpl<WebHrpCoreRecord> implements Record15<Integer, Timestamp, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

	private static final long serialVersionUID = -1945398464;

	/**
	 * Setter for <code>analytics.web_hrp_core.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.sum</code>. 企业总数
	 */
	public void setSum(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.sum</code>. 企业总数
	 */
	public Integer getSum() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.day_active</code>. 日活
	 */
	public void setDayActive(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.day_active</code>. 日活
	 */
	public Integer getDayActive() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.month_active</code>. 月活
	 */
	public void setMonthActive(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.month_active</code>. 月活
	 */
	public Integer getMonthActive() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.yesterday_position</code>. 昨日职位总量
	 */
	public void setYesterdayPosition(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.yesterday_position</code>. 昨日职位总量
	 */
	public Integer getYesterdayPosition() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.new_position</code>. 今日职位新增
	 */
	public void setNewPosition(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.new_position</code>. 今日职位新增
	 */
	public Integer getNewPosition() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.today_spv</code>. 今日职位转发pv
	 */
	public void setTodaySpv(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.today_spv</code>. 今日职位转发pv
	 */
	public Integer getTodaySpv() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.yesterday_application</code>. 昨日申请总量
	 */
	public void setYesterdayApplication(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.yesterday_application</code>. 昨日申请总量
	 */
	public Integer getYesterdayApplication() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.new_application</code>. 今日新增申请
	 */
	public void setNewApplication(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.new_application</code>. 今日新增申请
	 */
	public Integer getNewApplication() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.new_register</code>. 企业号今日新增求职者
	 */
	public void setNewRegister(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.new_register</code>. 企业号今日新增求职者
	 */
	public Integer getNewRegister() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.oauth_c</code>. 企业号一键登录oauth量
	 */
	public void setOauthC(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.oauth_c</code>. 企业号一键登录oauth量
	 */
	public Integer getOauthC() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.cared</code>. 我感兴趣按钮点击量
	 */
	public void setCared(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.cared</code>. 我感兴趣按钮点击量
	 */
	public Integer getCared() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.phones</code>. 留手机号数量
	 */
	public void setPhones(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.phones</code>. 留手机号数量
	 */
	public Integer getPhones() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>analytics.web_hrp_core.effective_position</code>.
	 */
	public void setEffectivePosition(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>analytics.web_hrp_core.effective_position</code>.
	 */
	public Integer getEffectivePosition() {
		return (Integer) getValue(14);
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
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row15<Integer, Timestamp, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row15<Integer, Timestamp, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
		return (Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return WebHrpCore.WEB_HRP_CORE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field2() {
		return WebHrpCore.WEB_HRP_CORE.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return WebHrpCore.WEB_HRP_CORE.SUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return WebHrpCore.WEB_HRP_CORE.DAY_ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return WebHrpCore.WEB_HRP_CORE.MONTH_ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return WebHrpCore.WEB_HRP_CORE.YESTERDAY_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return WebHrpCore.WEB_HRP_CORE.NEW_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return WebHrpCore.WEB_HRP_CORE.TODAY_SPV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return WebHrpCore.WEB_HRP_CORE.YESTERDAY_APPLICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return WebHrpCore.WEB_HRP_CORE.NEW_APPLICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return WebHrpCore.WEB_HRP_CORE.NEW_REGISTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return WebHrpCore.WEB_HRP_CORE.OAUTH_C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return WebHrpCore.WEB_HRP_CORE.CARED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return WebHrpCore.WEB_HRP_CORE.PHONES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field15() {
		return WebHrpCore.WEB_HRP_CORE.EFFECTIVE_POSITION;
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
		return getSum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDayActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getMonthActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getYesterdayPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getNewPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getTodaySpv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getYesterdayApplication();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getNewApplication();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getNewRegister();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getOauthC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getCared();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getPhones();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value15() {
		return getEffectivePosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value2(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value3(Integer value) {
		setSum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value4(Integer value) {
		setDayActive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value5(Integer value) {
		setMonthActive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value6(Integer value) {
		setYesterdayPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value7(Integer value) {
		setNewPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value8(Integer value) {
		setTodaySpv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value9(Integer value) {
		setYesterdayApplication(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value10(Integer value) {
		setNewApplication(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value11(Integer value) {
		setNewRegister(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value12(Integer value) {
		setOauthC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value13(Integer value) {
		setCared(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value14(Integer value) {
		setPhones(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord value15(Integer value) {
		setEffectivePosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebHrpCoreRecord values(Integer value1, Timestamp value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WebHrpCoreRecord
	 */
	public WebHrpCoreRecord() {
		super(WebHrpCore.WEB_HRP_CORE);
	}

	/**
	 * Create a detached, initialised WebHrpCoreRecord
	 */
	public WebHrpCoreRecord(Integer id, Timestamp createTime, Integer sum, Integer dayActive, Integer monthActive, Integer yesterdayPosition, Integer newPosition, Integer todaySpv, Integer yesterdayApplication, Integer newApplication, Integer newRegister, Integer oauthC, Integer cared, Integer phones, Integer effectivePosition) {
		super(WebHrpCore.WEB_HRP_CORE);

		setValue(0, id);
		setValue(1, createTime);
		setValue(2, sum);
		setValue(3, dayActive);
		setValue(4, monthActive);
		setValue(5, yesterdayPosition);
		setValue(6, newPosition);
		setValue(7, todaySpv);
		setValue(8, yesterdayApplication);
		setValue(9, newApplication);
		setValue(10, newRegister);
		setValue(11, oauthC);
		setValue(12, cared);
		setValue(13, phones);
		setValue(14, effectivePosition);
	}
}
