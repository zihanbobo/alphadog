/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.ProfileInternship;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Profile的实习经历
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileInternshipRecord extends UpdatableRecordImpl<ProfileInternshipRecord> implements Record12<UInteger, UInteger, Date, Date, Byte, String, String, Byte, Byte, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1040109447;

	/**
	 * Setter for <code>dqv4.profile_internship.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public void setStart(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public Date getStart() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public void setEnd(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public Date getEnd() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public void setEndUntilNow(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public Byte getEndUntilNow() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.company</code>. 公司名称
	 */
	public void setCompany(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.company</code>. 公司名称
	 */
	public String getCompany() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.department</code>. 部门名称
	 */
	public void setDepartment(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.department</code>. 部门名称
	 */
	public String getDepartment() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.position_code</code>. 职位字典编码
	 */
	public void setPositionCode(Byte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.position_code</code>. 职位字典编码
	 */
	public Byte getPositionCode() {
		return (Byte) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.position_name</code>. 职位名称
	 */
	public void setPositionName(Byte value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.position_name</code>. 职位名称
	 */
	public Byte getPositionName() {
		return (Byte) getValue(8);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.description</code>. 工作描述
	 */
	public void setDescription(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.description</code>. 工作描述
	 */
	public String getDescription() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>dqv4.profile_internship.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dqv4.profile_internship.update_time</code>. 更新时间
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
	public Record1<UInteger> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<UInteger, UInteger, Date, Date, Byte, String, String, Byte, Byte, String, Timestamp, Timestamp> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<UInteger, UInteger, Date, Date, Byte, String, String, Byte, Byte, String, Timestamp, Timestamp> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileInternship.PROFILE_INTERNSHIP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileInternship.PROFILE_INTERNSHIP.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return ProfileInternship.PROFILE_INTERNSHIP.START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return ProfileInternship.PROFILE_INTERNSHIP.END;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return ProfileInternship.PROFILE_INTERNSHIP.END_UNTIL_NOW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ProfileInternship.PROFILE_INTERNSHIP.COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ProfileInternship.PROFILE_INTERNSHIP.DEPARTMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field8() {
		return ProfileInternship.PROFILE_INTERNSHIP.POSITION_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field9() {
		return ProfileInternship.PROFILE_INTERNSHIP.POSITION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return ProfileInternship.PROFILE_INTERNSHIP.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return ProfileInternship.PROFILE_INTERNSHIP.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field12() {
		return ProfileInternship.PROFILE_INTERNSHIP.UPDATE_TIME;
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
	public Date value3() {
		return getStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getEnd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getEndUntilNow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCompany();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getDepartment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value8() {
		return getPositionCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value9() {
		return getPositionName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getDescription();
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
	public ProfileInternshipRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value2(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value3(Date value) {
		setStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value4(Date value) {
		setEnd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value5(Byte value) {
		setEndUntilNow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value6(String value) {
		setCompany(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value7(String value) {
		setDepartment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value8(Byte value) {
		setPositionCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value9(Byte value) {
		setPositionName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value10(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value11(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord value12(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileInternshipRecord values(UInteger value1, UInteger value2, Date value3, Date value4, Byte value5, String value6, String value7, Byte value8, Byte value9, String value10, Timestamp value11, Timestamp value12) {
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
	 * Create a detached ProfileInternshipRecord
	 */
	public ProfileInternshipRecord() {
		super(ProfileInternship.PROFILE_INTERNSHIP);
	}

	/**
	 * Create a detached, initialised ProfileInternshipRecord
	 */
	public ProfileInternshipRecord(UInteger id, UInteger profileId, Date start, Date end, Byte endUntilNow, String company, String department, Byte positionCode, Byte positionName, String description, Timestamp createTime, Timestamp updateTime) {
		super(ProfileInternship.PROFILE_INTERNSHIP);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, start);
		setValue(3, end);
		setValue(4, endUntilNow);
		setValue(5, company);
		setValue(6, department);
		setValue(7, positionCode);
		setValue(8, positionName);
		setValue(9, description);
		setValue(10, createTime);
		setValue(11, updateTime);
	}
}
