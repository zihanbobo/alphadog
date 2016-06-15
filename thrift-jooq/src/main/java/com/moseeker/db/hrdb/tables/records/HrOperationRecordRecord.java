/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables.records;


import com.moseeker.db.hrdb.tables.HrOperationRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * hr申请状态操作记录
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrOperationRecordRecord extends UpdatableRecordImpl<HrOperationRecordRecord> implements Record7<Integer, Long, Long, Long, Long, Timestamp, Integer> {

	private static final long serialVersionUID = -858174485;

	/**
	 * Setter for <code>hrdb.hr_operation_record.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_operation_record.admin_id</code>. hr_account.id
	 */
	public void setAdminId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.admin_id</code>. hr_account.id
	 */
	public Long getAdminId() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_operation_record.company_id</code>. company.id
	 */
	public void setCompanyId(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.company_id</code>. company.id
	 */
	public Long getCompanyId() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_operation_record.app_id</code>. job_application.id
	 */
	public void setAppId(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.app_id</code>. job_application.id
	 */
	public Long getAppId() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_operation_record.status_id</code>. hr_award_config.id
	 */
	public void setStatusId(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.status_id</code>. hr_award_config.id
	 */
	public Long getStatusId() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_operation_record.opt_time</code>. 操作时间
	 */
	public void setOptTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.opt_time</code>. 操作时间
	 */
	public Timestamp getOptTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_operation_record.operate_tpl_id</code>. hr_award_config_template.id
	 */
	public void setOperateTplId(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_operation_record.operate_tpl_id</code>. hr_award_config_template.id
	 */
	public Integer getOperateTplId() {
		return (Integer) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Long, Long, Long, Long, Timestamp, Integer> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Long, Long, Long, Long, Timestamp, Integer> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return HrOperationRecord.HR_OPERATION_RECORD.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return HrOperationRecord.HR_OPERATION_RECORD.ADMIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return HrOperationRecord.HR_OPERATION_RECORD.COMPANY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return HrOperationRecord.HR_OPERATION_RECORD.APP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return HrOperationRecord.HR_OPERATION_RECORD.STATUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return HrOperationRecord.HR_OPERATION_RECORD.OPT_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return HrOperationRecord.HR_OPERATION_RECORD.OPERATE_TPL_ID;
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
	public Long value2() {
		return getAdminId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getCompanyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getAppId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getStatusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getOptTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getOperateTplId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value2(Long value) {
		setAdminId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value3(Long value) {
		setCompanyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value4(Long value) {
		setAppId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value5(Long value) {
		setStatusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value6(Timestamp value) {
		setOptTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord value7(Integer value) {
		setOperateTplId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrOperationRecordRecord values(Integer value1, Long value2, Long value3, Long value4, Long value5, Timestamp value6, Integer value7) {
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
	 * Create a detached HrOperationRecordRecord
	 */
	public HrOperationRecordRecord() {
		super(HrOperationRecord.HR_OPERATION_RECORD);
	}

	/**
	 * Create a detached, initialised HrOperationRecordRecord
	 */
	public HrOperationRecordRecord(Integer id, Long adminId, Long companyId, Long appId, Long statusId, Timestamp optTime, Integer operateTplId) {
		super(HrOperationRecord.HR_OPERATION_RECORD);

		setValue(0, id);
		setValue(1, adminId);
		setValue(2, companyId);
		setValue(3, appId);
		setValue(4, statusId);
		setValue(5, optTime);
		setValue(6, operateTplId);
	}
}
