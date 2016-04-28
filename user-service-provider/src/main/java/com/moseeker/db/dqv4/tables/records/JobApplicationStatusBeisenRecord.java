/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.JobApplicationStatusBeisen;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 申请状态记录（ats北森）
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationStatusBeisenRecord extends UpdatableRecordImpl<JobApplicationStatusBeisenRecord> implements Record12<Integer, UInteger, Long, String, String, String, Integer, String, Integer, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1491917868;

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.company_id</code>. company.id, 部门ID
	 */
	public void setCompanyId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.company_id</code>. company.id, 部门ID
	 */
	public UInteger getCompanyId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.applier_mobile</code>. 关注吉利微信公众账号的申请人的手机号
	 */
	public void setApplierMobile(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.applier_mobile</code>. 关注吉利微信公众账号的申请人的手机号
	 */
	public Long getApplierMobile() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.applier_name</code>. 申请人真实姓名
	 */
	public void setApplierName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.applier_name</code>. 申请人真实姓名
	 */
	public String getApplierName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.jobnumber</code>. 对应beisen投递状态中JobName中的code, 并非对应hr_position中jobnumber
	 */
	public void setJobnumber(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.jobnumber</code>. 对应beisen投递状态中JobName中的code, 并非对应hr_position中jobnumber
	 */
	public String getJobnumber() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.jobtitle</code>. 对应beisen投递状态中Jobname中的value，对应hr_position中title
	 */
	public void setJobtitle(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.jobtitle</code>. 对应beisen投递状态中Jobname中的value，对应hr_position中title
	 */
	public String getJobtitle() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.phasecode</code>. 对应beisen投递状态中PhaseCode中的code
	 */
	public void setPhasecode(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.phasecode</code>. 对应beisen投递状态中PhaseCode中的code
	 */
	public Integer getPhasecode() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.phasename</code>. 对应beisen投递状态中PhaseName中的value
	 */
	public void setPhasename(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.phasename</code>. 对应beisen投递状态中PhaseName中的value
	 */
	public String getPhasename() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.statuscode</code>. 对应beisen投递状态中StatusCode中的code
	 */
	public void setStatuscode(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.statuscode</code>. 对应beisen投递状态中StatusCode中的code
	 */
	public Integer getStatuscode() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.statusname</code>. 对应beisen投递状态中StatusName中的value
	 */
	public void setStatusname(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.statusname</code>. 对应beisen投递状态中StatusName中的value
	 */
	public String getStatusname() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>dqv4.job_application_status_beisen.update_time</code>.
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dqv4.job_application_status_beisen.update_time</code>.
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, UInteger, Long, String, String, String, Integer, String, Integer, String, Timestamp, Timestamp> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, UInteger, Long, String, String, String, Integer, String, Integer, String, Timestamp, Timestamp> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.COMPANY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.APPLIER_MOBILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.APPLIER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.JOBNUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.JOBTITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.PHASECODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.PHASENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.STATUSCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.STATUSNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field12() {
		return JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN.UPDATE_TIME;
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
	public Long value3() {
		return getApplierMobile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getApplierName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getJobnumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getJobtitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getPhasecode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getPhasename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getStatuscode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getStatusname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value12() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value2(UInteger value) {
		setCompanyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value3(Long value) {
		setApplierMobile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value4(String value) {
		setApplierName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value5(String value) {
		setJobnumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value6(String value) {
		setJobtitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value7(Integer value) {
		setPhasecode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value8(String value) {
		setPhasename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value9(Integer value) {
		setStatuscode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value10(String value) {
		setStatusname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value11(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord value12(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisenRecord values(Integer value1, UInteger value2, Long value3, String value4, String value5, String value6, Integer value7, String value8, Integer value9, String value10, Timestamp value11, Timestamp value12) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobApplicationStatusBeisenRecord
	 */
	public JobApplicationStatusBeisenRecord() {
		super(JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN);
	}

	/**
	 * Create a detached, initialised JobApplicationStatusBeisenRecord
	 */
	public JobApplicationStatusBeisenRecord(Integer id, UInteger companyId, Long applierMobile, String applierName, String jobnumber, String jobtitle, Integer phasecode, String phasename, Integer statuscode, String statusname, Timestamp createTime, Timestamp updateTime) {
		super(JobApplicationStatusBeisen.JOB_APPLICATION_STATUS_BEISEN);

		setValue(0, id);
		setValue(1, companyId);
		setValue(2, applierMobile);
		setValue(3, applierName);
		setValue(4, jobnumber);
		setValue(5, jobtitle);
		setValue(6, phasecode);
		setValue(7, phasename);
		setValue(8, statuscode);
		setValue(9, statusname);
		setValue(10, createTime);
		setValue(11, updateTime);
	}
}
