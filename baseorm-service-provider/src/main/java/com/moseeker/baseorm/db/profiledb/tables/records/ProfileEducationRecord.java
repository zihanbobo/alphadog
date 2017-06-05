/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.profiledb.tables.records;


import com.moseeker.baseorm.db.profiledb.tables.ProfileEducation;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Profile的教育经历
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileEducationRecord extends UpdatableRecordImpl<ProfileEducationRecord> implements Record18<Integer, Integer, Date, Date, Byte, Integer, String, String, String, String, Byte, String, Byte, Byte, Byte, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = -1725983887;

	/**
	 * Setter for <code>profiledb.profile_education.id</code>. 主key
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.id</code>. 主key
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>profiledb.profile_education.profile_id</code>. profile.id
	 */
	public void setProfileId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.profile_id</code>. profile.id
	 */
	public Integer getProfileId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>profiledb.profile_education.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public void setStart(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public Date getStart() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>profiledb.profile_education.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public void setEnd(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public Date getEnd() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>profiledb.profile_education.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public void setEndUntilNow(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public Byte getEndUntilNow() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>profiledb.profile_education.college_code</code>. 院校字典编码
	 */
	public void setCollegeCode(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.college_code</code>. 院校字典编码
	 */
	public Integer getCollegeCode() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>profiledb.profile_education.college_name</code>. 院校名称
	 */
	public void setCollegeName(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.college_name</code>. 院校名称
	 */
	public String getCollegeName() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>profiledb.profile_education.college_logo</code>. 院校LOGO, 用户上传
	 */
	public void setCollegeLogo(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.college_logo</code>. 院校LOGO, 用户上传
	 */
	public String getCollegeLogo() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>profiledb.profile_education.major_code</code>. 专业字典编码
	 */
	public void setMajorCode(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.major_code</code>. 专业字典编码
	 */
	public String getMajorCode() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>profiledb.profile_education.major_name</code>. 专业名称
	 */
	public void setMajorName(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.major_name</code>. 专业名称
	 */
	public String getMajorName() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>profiledb.profile_education.degree</code>. 学历 0:未选择 1: 初中及以下, 2:中专, 3:高中, 4: 大专, 5: 本科, 6: 硕士, 7: 博士, 8:博士以上, 9:其他
	 */
	public void setDegree(Byte value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.degree</code>. 学历 0:未选择 1: 初中及以下, 2:中专, 3:高中, 4: 大专, 5: 本科, 6: 硕士, 7: 博士, 8:博士以上, 9:其他
	 */
	public Byte getDegree() {
		return (Byte) getValue(10);
	}

	/**
	 * Setter for <code>profiledb.profile_education.description</code>. 教育描述
	 */
	public void setDescription(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.description</code>. 教育描述
	 */
	public String getDescription() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>profiledb.profile_education.is_full</code>. 是否全日制 0:没填写, 1:是, 2:否
	 */
	public void setIsFull(Byte value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.is_full</code>. 是否全日制 0:没填写, 1:是, 2:否
	 */
	public Byte getIsFull() {
		return (Byte) getValue(12);
	}

	/**
	 * Setter for <code>profiledb.profile_education.is_unified</code>. 是否统招 0:没填写, 1:是, 2:否
	 */
	public void setIsUnified(Byte value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.is_unified</code>. 是否统招 0:没填写, 1:是, 2:否
	 */
	public Byte getIsUnified() {
		return (Byte) getValue(13);
	}

	/**
	 * Setter for <code>profiledb.profile_education.is_study_abroad</code>. 是否海外学习经历 0:没填写, 1:是, 2:否
	 */
	public void setIsStudyAbroad(Byte value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.is_study_abroad</code>. 是否海外学习经历 0:没填写, 1:是, 2:否
	 */
	public Byte getIsStudyAbroad() {
		return (Byte) getValue(14);
	}

	/**
	 * Setter for <code>profiledb.profile_education.study_abroad_country</code>. 海外留学国家
	 */
	public void setStudyAbroadCountry(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.study_abroad_country</code>. 海外留学国家
	 */
	public String getStudyAbroadCountry() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>profiledb.profile_education.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>profiledb.profile_education.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>profiledb.profile_education.update_time</code>. 更新时间
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
	public Row18<Integer, Integer, Date, Date, Byte, Integer, String, String, String, String, Byte, String, Byte, Byte, Byte, String, Timestamp, Timestamp> fieldsRow() {
		return (Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<Integer, Integer, Date, Date, Byte, Integer, String, String, String, String, Byte, String, Byte, Byte, Byte, String, Timestamp, Timestamp> valuesRow() {
		return (Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ProfileEducation.PROFILE_EDUCATION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ProfileEducation.PROFILE_EDUCATION.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return ProfileEducation.PROFILE_EDUCATION.START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return ProfileEducation.PROFILE_EDUCATION.END;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return ProfileEducation.PROFILE_EDUCATION.END_UNTIL_NOW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return ProfileEducation.PROFILE_EDUCATION.COLLEGE_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ProfileEducation.PROFILE_EDUCATION.COLLEGE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return ProfileEducation.PROFILE_EDUCATION.COLLEGE_LOGO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return ProfileEducation.PROFILE_EDUCATION.MAJOR_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return ProfileEducation.PROFILE_EDUCATION.MAJOR_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field11() {
		return ProfileEducation.PROFILE_EDUCATION.DEGREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return ProfileEducation.PROFILE_EDUCATION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field13() {
		return ProfileEducation.PROFILE_EDUCATION.IS_FULL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field14() {
		return ProfileEducation.PROFILE_EDUCATION.IS_UNIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field15() {
		return ProfileEducation.PROFILE_EDUCATION.IS_STUDY_ABROAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return ProfileEducation.PROFILE_EDUCATION.STUDY_ABROAD_COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field17() {
		return ProfileEducation.PROFILE_EDUCATION.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field18() {
		return ProfileEducation.PROFILE_EDUCATION.UPDATE_TIME;
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
	public Integer value6() {
		return getCollegeCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCollegeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCollegeLogo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getMajorCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getMajorName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value11() {
		return getDegree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value13() {
		return getIsFull();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value14() {
		return getIsUnified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value15() {
		return getIsStudyAbroad();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getStudyAbroadCountry();
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
	public ProfileEducationRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value2(Integer value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value3(Date value) {
		setStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value4(Date value) {
		setEnd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value5(Byte value) {
		setEndUntilNow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value6(Integer value) {
		setCollegeCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value7(String value) {
		setCollegeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value8(String value) {
		setCollegeLogo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value9(String value) {
		setMajorCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value10(String value) {
		setMajorName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value11(Byte value) {
		setDegree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value12(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value13(Byte value) {
		setIsFull(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value14(Byte value) {
		setIsUnified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value15(Byte value) {
		setIsStudyAbroad(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value16(String value) {
		setStudyAbroadCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value17(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord value18(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileEducationRecord values(Integer value1, Integer value2, Date value3, Date value4, Byte value5, Integer value6, String value7, String value8, String value9, String value10, Byte value11, String value12, Byte value13, Byte value14, Byte value15, String value16, Timestamp value17, Timestamp value18) {
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
	 * Create a detached ProfileEducationRecord
	 */
	public ProfileEducationRecord() {
		super(ProfileEducation.PROFILE_EDUCATION);
	}

	/**
	 * Create a detached, initialised ProfileEducationRecord
	 */
	public ProfileEducationRecord(Integer id, Integer profileId, Date start, Date end, Byte endUntilNow, Integer collegeCode, String collegeName, String collegeLogo, String majorCode, String majorName, Byte degree, String description, Byte isFull, Byte isUnified, Byte isStudyAbroad, String studyAbroadCountry, Timestamp createTime, Timestamp updateTime) {
		super(ProfileEducation.PROFILE_EDUCATION);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, start);
		setValue(3, end);
		setValue(4, endUntilNow);
		setValue(5, collegeCode);
		setValue(6, collegeName);
		setValue(7, collegeLogo);
		setValue(8, majorCode);
		setValue(9, majorName);
		setValue(10, degree);
		setValue(11, description);
		setValue(12, isFull);
		setValue(13, isUnified);
		setValue(14, isStudyAbroad);
		setValue(15, studyAbroadCountry);
		setValue(16, createTime);
		setValue(17, updateTime);
	}
}
