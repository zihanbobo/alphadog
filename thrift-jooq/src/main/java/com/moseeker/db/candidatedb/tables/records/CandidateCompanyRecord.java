/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.candidatedb.tables.records;


import com.moseeker.db.candidatedb.tables.CandidateCompany;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 候选人表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateCompanyRecord extends UpdatableRecordImpl<CandidateCompanyRecord> implements Record13<Integer, Integer, Timestamp, Integer, Integer, Byte, String, String, String, String, String, Integer, Integer> {

	private static final long serialVersionUID = 1270674625;

	/**
	 * Setter for <code>candidateDB.candidate_company.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.company_id</code>. hr_company.id
	 */
	public void setCompanyId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.company_id</code>. hr_company.id
	 */
	public Integer getCompanyId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.update_time</code>. 修改时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.update_time</code>. 修改时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.wxuser_id</code>. wx_group_user.id
	 */
	public void setWxuserId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.wxuser_id</code>. wx_group_user.id
	 */
	public Integer getWxuserId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.status</code>. 候选人状态，0：删除，1：正常状态
	 */
	public void setStatus(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.status</code>. 候选人状态，0：删除，1：正常状态
	 */
	public Integer getStatus() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.is_recommend</code>. 是否推荐 false:未推荐，true:推荐
	 */
	public void setIsRecommend(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.is_recommend</code>. 是否推荐 false:未推荐，true:推荐
	 */
	public Byte getIsRecommend() {
		return (Byte) getValue(5);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.name</code>. sys_user.name 姓名或微信昵称
	 */
	public void setName(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.name</code>. sys_user.name 姓名或微信昵称
	 */
	public String getName() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.email</code>. sys_user.email 邮箱
	 */
	public void setEmail(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.email</code>. sys_user.email 邮箱
	 */
	public String getEmail() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.mobile</code>. sys_user.mobile 电话
	 */
	public void setMobile(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.mobile</code>. sys_user.mobile 电话
	 */
	public String getMobile() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.nickname</code>. wx_group_user.nickname 用户昵称
	 */
	public void setNickname(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.nickname</code>. wx_group_user.nickname 用户昵称
	 */
	public String getNickname() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.headimgurl</code>. wx_group_user.headimgurl 用户头像
	 */
	public void setHeadimgurl(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.headimgurl</code>. wx_group_user.headimgurl 用户头像
	 */
	public String getHeadimgurl() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.sys_user_id</code>. sys_user.id
	 */
	public void setSysUserId(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.sys_user_id</code>. sys_user.id
	 */
	public Integer getSysUserId() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>candidateDB.candidate_company.click_from</code>. 来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage)
	 */
	public void setClickFrom(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>candidateDB.candidate_company.click_from</code>. 来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage)
	 */
	public Integer getClickFrom() {
		return (Integer) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<Integer, Integer, Timestamp, Integer, Integer, Byte, String, String, String, String, String, Integer, Integer> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<Integer, Integer, Timestamp, Integer, Integer, Byte, String, String, String, String, String, Integer, Integer> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return CandidateCompany.CANDIDATE_COMPANY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return CandidateCompany.CANDIDATE_COMPANY.COMPANY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return CandidateCompany.CANDIDATE_COMPANY.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return CandidateCompany.CANDIDATE_COMPANY.WXUSER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return CandidateCompany.CANDIDATE_COMPANY.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return CandidateCompany.CANDIDATE_COMPANY.IS_RECOMMEND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return CandidateCompany.CANDIDATE_COMPANY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return CandidateCompany.CANDIDATE_COMPANY.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return CandidateCompany.CANDIDATE_COMPANY.MOBILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return CandidateCompany.CANDIDATE_COMPANY.NICKNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return CandidateCompany.CANDIDATE_COMPANY.HEADIMGURL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return CandidateCompany.CANDIDATE_COMPANY.SYS_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return CandidateCompany.CANDIDATE_COMPANY.CLICK_FROM;
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
	public Timestamp value3() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getWxuserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getIsRecommend();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getMobile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getNickname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getHeadimgurl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getSysUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getClickFrom();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value2(Integer value) {
		setCompanyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value3(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value4(Integer value) {
		setWxuserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value5(Integer value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value6(Byte value) {
		setIsRecommend(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value7(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value8(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value9(String value) {
		setMobile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value10(String value) {
		setNickname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value11(String value) {
		setHeadimgurl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value12(Integer value) {
		setSysUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord value13(Integer value) {
		setClickFrom(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompanyRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4, Integer value5, Byte value6, String value7, String value8, String value9, String value10, String value11, Integer value12, Integer value13) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CandidateCompanyRecord
	 */
	public CandidateCompanyRecord() {
		super(CandidateCompany.CANDIDATE_COMPANY);
	}

	/**
	 * Create a detached, initialised CandidateCompanyRecord
	 */
	public CandidateCompanyRecord(Integer id, Integer companyId, Timestamp updateTime, Integer wxuserId, Integer status, Byte isRecommend, String name, String email, String mobile, String nickname, String headimgurl, Integer sysUserId, Integer clickFrom) {
		super(CandidateCompany.CANDIDATE_COMPANY);

		setValue(0, id);
		setValue(1, companyId);
		setValue(2, updateTime);
		setValue(3, wxuserId);
		setValue(4, status);
		setValue(5, isRecommend);
		setValue(6, name);
		setValue(7, email);
		setValue(8, mobile);
		setValue(9, nickname);
		setValue(10, headimgurl);
		setValue(11, sysUserId);
		setValue(12, clickFrom);
	}
}
