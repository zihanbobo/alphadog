/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.ProfileTraining;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Profile的培训经历
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileTrainingRecord extends UpdatableRecordImpl<ProfileTrainingRecord> implements Record9<UInteger, UInteger, String, Date, Date, String, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1718284243;

	/**
	 * Setter for <code>dqv4.profile_training.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.profile_training.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.profile_training.name</code>. 培训名称
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.name</code>. 培训名称
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.profile_training.start_date</code>. 培训时间-起
	 */
	public void setStartDate(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.start_date</code>. 培训时间-起
	 */
	public Date getStartDate() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.profile_training.end_date</code>. 培训时间-止
	 */
	public void setEndDate(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.end_date</code>. 培训时间-止
	 */
	public Date getEndDate() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.profile_training.orgnization</code>. 培训机构
	 */
	public void setOrgnization(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.orgnization</code>. 培训机构
	 */
	public String getOrgnization() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.profile_training.description</code>. 培训描述
	 */
	public void setDescription(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.description</code>. 培训描述
	 */
	public String getDescription() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.profile_training.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.profile_training.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.profile_training.update_time</code>. 更新时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(8);
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
	public Row9<UInteger, UInteger, String, Date, Date, String, String, Timestamp, Timestamp> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<UInteger, UInteger, String, Date, Date, String, String, Timestamp, Timestamp> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileTraining.PROFILE_TRAINING.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileTraining.PROFILE_TRAINING.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ProfileTraining.PROFILE_TRAINING.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return ProfileTraining.PROFILE_TRAINING.START_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return ProfileTraining.PROFILE_TRAINING.END_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ProfileTraining.PROFILE_TRAINING.ORGNIZATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ProfileTraining.PROFILE_TRAINING.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return ProfileTraining.PROFILE_TRAINING.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return ProfileTraining.PROFILE_TRAINING.UPDATE_TIME;
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
		return getProfileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getStartDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getEndDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getOrgnization();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value2(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value4(Date value) {
		setStartDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value5(Date value) {
		setEndDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value6(String value) {
		setOrgnization(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value7(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value8(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord value9(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileTrainingRecord values(UInteger value1, UInteger value2, String value3, Date value4, Date value5, String value6, String value7, Timestamp value8, Timestamp value9) {
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
	 * Create a detached ProfileTrainingRecord
	 */
	public ProfileTrainingRecord() {
		super(ProfileTraining.PROFILE_TRAINING);
	}

	/**
	 * Create a detached, initialised ProfileTrainingRecord
	 */
	public ProfileTrainingRecord(UInteger id, UInteger profileId, String name, Date startDate, Date endDate, String orgnization, String description, Timestamp createTime, Timestamp updateTime) {
		super(ProfileTraining.PROFILE_TRAINING);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, name);
		setValue(3, startDate);
		setValue(4, endDate);
		setValue(5, orgnization);
		setValue(6, description);
		setValue(7, createTime);
		setValue(8, updateTime);
	}
}
