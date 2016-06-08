/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.jobdb.tables.records;


import com.moseeker.db.jobdb.tables.JobApplicationConf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 部门申请配置表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationConfRecord extends UpdatableRecordImpl<JobApplicationConfRecord> implements Record18<Integer, UInteger, Integer, Integer, String, Integer, String, Integer, String, String, Integer, Integer, Integer, Integer, Integer, Byte, Timestamp, Timestamp> {

	private static final long serialVersionUID = -421731153;

	/**
	 * Setter for <code>jobdb.job_application_conf.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.company_id</code>. company.id, 部门ID
	 */
	public void setCompanyId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.company_id</code>. company.id, 部门ID
	 */
	public UInteger getCompanyId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.appnotice</code>. 简历投递反馈通知
	 */
	public void setAppnotice(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.appnotice</code>. 简历投递反馈通知
	 */
	public Integer getAppnotice() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.appnotice_tpl</code>. 简历投递通知使用模板
	 */
	public void setAppnoticeTpl(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.appnotice_tpl</code>. 简历投递通知使用模板
	 */
	public Integer getAppnoticeTpl() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.app_reply</code>. 申请提交成功回复信息
	 */
	public void setAppReply(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.app_reply</code>. 申请提交成功回复信息
	 */
	public String getAppReply() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.email_appnotice</code>. 0：需要，1：不需要
	 */
	public void setEmailAppnotice(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.email_appnotice</code>. 0：需要，1：不需要
	 */
	public Integer getEmailAppnotice() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.email_appreply</code>. 申请邮箱回复内容html格式
	 */
	public void setEmailAppreply(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.email_appreply</code>. 申请邮箱回复内容html格式
	 */
	public String getEmailAppreply() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.sms_appnotice_id</code>. 短信通知ID
	 */
	public void setSmsAppnoticeId(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.sms_appnotice_id</code>. 短信通知ID
	 */
	public Integer getSmsAppnoticeId() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.sms_appnotice_prefix</code>. 短信通知职位前缀
	 */
	public void setSmsAppnoticePrefix(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.sms_appnotice_prefix</code>. 短信通知职位前缀
	 */
	public String getSmsAppnoticePrefix() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.sms_appnotice_signature</code>. 短信通知签名
	 */
	public void setSmsAppnoticeSignature(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.sms_appnotice_signature</code>. 短信通知签名
	 */
	public String getSmsAppnoticeSignature() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.sms_delay</code>. 短信通知延迟 单位： min
	 */
	public void setSmsDelay(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.sms_delay</code>. 短信通知延迟 单位： min
	 */
	public Integer getSmsDelay() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.forward_click_reward</code>. 转发点击奖励通知0:需要1:不需要
	 */
	public void setForwardClickReward(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.forward_click_reward</code>. 转发点击奖励通知0:需要1:不需要
	 */
	public Integer getForwardClickReward() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.forward_click_reward_tpl</code>. 转发点击奖励通知模板
	 */
	public void setForwardClickRewardTpl(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.forward_click_reward_tpl</code>. 转发点击奖励通知模板
	 */
	public Integer getForwardClickRewardTpl() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.forward_app_reward</code>. 转发申请奖励通知0:需要1:不需要
	 */
	public void setForwardAppReward(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.forward_app_reward</code>. 转发申请奖励通知0:需要1:不需要
	 */
	public Integer getForwardAppReward() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.forward_app_reward_tpl</code>. 转发申请奖励通知模板
	 */
	public void setForwardAppRewardTpl(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.forward_app_reward_tpl</code>. 转发申请奖励通知模板
	 */
	public Integer getForwardAppRewardTpl() {
		return (Integer) getValue(14);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
	 */
	public void setEmailResumeConf(Byte value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
	 */
	public Byte getEmailResumeConf() {
		return (Byte) getValue(15);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>jobdb.job_application_conf.update_time</code>.
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>jobdb.job_application_conf.update_time</code>.
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(17);
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
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<Integer, UInteger, Integer, Integer, String, Integer, String, Integer, String, String, Integer, Integer, Integer, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
		return (Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<Integer, UInteger, Integer, Integer, String, Integer, String, Integer, String, String, Integer, Integer, Integer, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
		return (Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JobApplicationConf.JOB_APPLICATION_CONF.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return JobApplicationConf.JOB_APPLICATION_CONF.COMPANY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return JobApplicationConf.JOB_APPLICATION_CONF.APPNOTICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return JobApplicationConf.JOB_APPLICATION_CONF.APPNOTICE_TPL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return JobApplicationConf.JOB_APPLICATION_CONF.APP_REPLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return JobApplicationConf.JOB_APPLICATION_CONF.EMAIL_APPNOTICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return JobApplicationConf.JOB_APPLICATION_CONF.EMAIL_APPREPLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return JobApplicationConf.JOB_APPLICATION_CONF.SMS_APPNOTICE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return JobApplicationConf.JOB_APPLICATION_CONF.SMS_APPNOTICE_PREFIX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return JobApplicationConf.JOB_APPLICATION_CONF.SMS_APPNOTICE_SIGNATURE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return JobApplicationConf.JOB_APPLICATION_CONF.SMS_DELAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return JobApplicationConf.JOB_APPLICATION_CONF.FORWARD_CLICK_REWARD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return JobApplicationConf.JOB_APPLICATION_CONF.FORWARD_CLICK_REWARD_TPL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return JobApplicationConf.JOB_APPLICATION_CONF.FORWARD_APP_REWARD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field15() {
		return JobApplicationConf.JOB_APPLICATION_CONF.FORWARD_APP_REWARD_TPL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field16() {
		return JobApplicationConf.JOB_APPLICATION_CONF.EMAIL_RESUME_CONF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field17() {
		return JobApplicationConf.JOB_APPLICATION_CONF.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field18() {
		return JobApplicationConf.JOB_APPLICATION_CONF.UPDATE_TIME;
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
	public UInteger value2() {
		return getCompanyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getAppnotice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getAppnoticeTpl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getAppReply();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getEmailAppnotice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getEmailAppreply();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getSmsAppnoticeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getSmsAppnoticePrefix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getSmsAppnoticeSignature();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getSmsDelay();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getForwardClickReward();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getForwardClickRewardTpl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getForwardAppReward();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value15() {
		return getForwardAppRewardTpl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value16() {
		return getEmailResumeConf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value17() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value18() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value2(UInteger value) {
		setCompanyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value3(Integer value) {
		setAppnotice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value4(Integer value) {
		setAppnoticeTpl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value5(String value) {
		setAppReply(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value6(Integer value) {
		setEmailAppnotice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value7(String value) {
		setEmailAppreply(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value8(Integer value) {
		setSmsAppnoticeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value9(String value) {
		setSmsAppnoticePrefix(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value10(String value) {
		setSmsAppnoticeSignature(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value11(Integer value) {
		setSmsDelay(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value12(Integer value) {
		setForwardClickReward(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value13(Integer value) {
		setForwardClickRewardTpl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value14(Integer value) {
		setForwardAppReward(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value15(Integer value) {
		setForwardAppRewardTpl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value16(Byte value) {
		setEmailResumeConf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value17(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord value18(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConfRecord values(Integer value1, UInteger value2, Integer value3, Integer value4, String value5, Integer value6, String value7, Integer value8, String value9, String value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, Byte value16, Timestamp value17, Timestamp value18) {
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
		value16(value16);
		value17(value17);
		value18(value18);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobApplicationConfRecord
	 */
	public JobApplicationConfRecord() {
		super(JobApplicationConf.JOB_APPLICATION_CONF);
	}

	/**
	 * Create a detached, initialised JobApplicationConfRecord
	 */
	public JobApplicationConfRecord(Integer id, UInteger companyId, Integer appnotice, Integer appnoticeTpl, String appReply, Integer emailAppnotice, String emailAppreply, Integer smsAppnoticeId, String smsAppnoticePrefix, String smsAppnoticeSignature, Integer smsDelay, Integer forwardClickReward, Integer forwardClickRewardTpl, Integer forwardAppReward, Integer forwardAppRewardTpl, Byte emailResumeConf, Timestamp createTime, Timestamp updateTime) {
		super(JobApplicationConf.JOB_APPLICATION_CONF);

		setValue(0, id);
		setValue(1, companyId);
		setValue(2, appnotice);
		setValue(3, appnoticeTpl);
		setValue(4, appReply);
		setValue(5, emailAppnotice);
		setValue(6, emailAppreply);
		setValue(7, smsAppnoticeId);
		setValue(8, smsAppnoticePrefix);
		setValue(9, smsAppnoticeSignature);
		setValue(10, smsDelay);
		setValue(11, forwardClickReward);
		setValue(12, forwardClickRewardTpl);
		setValue(13, forwardAppReward);
		setValue(14, forwardAppRewardTpl);
		setValue(15, emailResumeConf);
		setValue(16, createTime);
		setValue(17, updateTime);
	}
}