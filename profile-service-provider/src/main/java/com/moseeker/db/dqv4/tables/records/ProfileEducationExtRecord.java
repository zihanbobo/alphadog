/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.ProfileEducationExt;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 用户profile教育相关扩展表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileEducationExtRecord extends UpdatableRecordImpl<ProfileEducationExtRecord> implements Record7<UInteger, Date, Byte, Byte, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1886159139;

	/**
	 * Setter for <code>dqv4.profile_education_ext.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.profile_education_ext.graduation</code>. 预计毕业时间 yyyy-mm-dd
	 */
	public void setGraduation(Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.graduation</code>. 预计毕业时间 yyyy-mm-dd
	 */
	public Date getGraduation() {
		return (Date) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.profile_education_ext.majorrank</code>. 专业排名 0:未选择 1: 5%, 2: 5%—15%, 3: 15%-30%, 4: 30%-50%, 5: 50%以下
	 */
	public void setMajorrank(Byte value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.majorrank</code>. 专业排名 0:未选择 1: 5%, 2: 5%—15%, 3: 15%-30%, 4: 30%-50%, 5: 50%以下
	 */
	public Byte getMajorrank() {
		return (Byte) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.profile_education_ext.degree</code>. 最高学历 0:未选择 1: 大专以下, 2: 大专, 3: 本科, 4: 硕士, 5: 博士, 6:博士以上
	 */
	public void setDegree(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.degree</code>. 最高学历 0:未选择 1: 大专以下, 2: 大专, 3: 本科, 4: 硕士, 5: 博士, 6:博士以上
	 */
	public Byte getDegree() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.profile_education_ext.gpa</code>. GPA成绩
	 */
	public void setGpa(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.gpa</code>. GPA成绩
	 */
	public String getGpa() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.profile_education_ext.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.profile_education_ext.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.profile_education_ext.update_time</code>. 更新时间
	 */
	public Timestamp getUpdateTime() {
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
	public Row7<UInteger, Date, Byte, Byte, String, Timestamp, Timestamp> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<UInteger, Date, Byte, Byte, String, Timestamp, Timestamp> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field2() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.GRADUATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field3() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.MAJORRANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.DEGREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.GPA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return ProfileEducationExt.PROFILE_EDUCATION_EXT.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value1() {
		return getProfileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value2() {
		return getGraduation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value3() {
		return getMajorrank();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getDegree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getGpa();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value1(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value2(Date value) {
		setGraduation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value3(Byte value) {
		setMajorrank(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value4(Byte value) {
		setDegree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value5(String value) {
		setGpa(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value6(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord value7(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationExtRecord values(UInteger value1, Date value2, Byte value3, Byte value4, String value5, Timestamp value6, Timestamp value7) {
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
	 * Create a detached ProfileEducationExtRecord
	 */
	public ProfileEducationExtRecord() {
		super(ProfileEducationExt.PROFILE_EDUCATION_EXT);
	}

	/**
	 * Create a detached, initialised ProfileEducationExtRecord
	 */
	public ProfileEducationExtRecord(UInteger profileId, Date graduation, Byte majorrank, Byte degree, String gpa, Timestamp createTime, Timestamp updateTime) {
		super(ProfileEducationExt.PROFILE_EDUCATION_EXT);

		setValue(0, profileId);
		setValue(1, graduation);
		setValue(2, majorrank);
		setValue(3, degree);
		setValue(4, gpa);
		setValue(5, createTime);
		setValue(6, updateTime);
	}
}
