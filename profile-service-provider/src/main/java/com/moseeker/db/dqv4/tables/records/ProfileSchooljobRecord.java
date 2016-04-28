/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.ProfileSchooljob;

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
 * Profile的校内职务
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileSchooljobRecord extends UpdatableRecordImpl<ProfileSchooljobRecord> implements Record9<UInteger, UInteger, Date, Date, Byte, String, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = 2094122834;

	/**
	 * Setter for <code>dqv4.profile_schooljob.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public void setStart(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public Date getStart() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public void setEnd(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public Date getEnd() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public void setEndUntilNow(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public Byte getEndUntilNow() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.position</code>. 职位, eg：大队长
	 */
	public void setPosition(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.position</code>. 职位, eg：大队长
	 */
	public String getPosition() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.description</code>. 工作描述
	 */
	public void setDescription(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.description</code>. 工作描述
	 */
	public String getDescription() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.profile_schooljob.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.profile_schooljob.update_time</code>. 更新时间
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
	public Row9<UInteger, UInteger, Date, Date, Byte, String, String, Timestamp, Timestamp> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<UInteger, UInteger, Date, Date, Byte, String, String, Timestamp, Timestamp> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.END;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.END_UNTIL_NOW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return ProfileSchooljob.PROFILE_SCHOOLJOB.UPDATE_TIME;
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
		return getPosition();
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
	public ProfileSchooljobRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value2(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value3(Date value) {
		setStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value4(Date value) {
		setEnd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value5(Byte value) {
		setEndUntilNow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value6(String value) {
		setPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value7(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value8(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord value9(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileSchooljobRecord values(UInteger value1, UInteger value2, Date value3, Date value4, Byte value5, String value6, String value7, Timestamp value8, Timestamp value9) {
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
	 * Create a detached ProfileSchooljobRecord
	 */
	public ProfileSchooljobRecord() {
		super(ProfileSchooljob.PROFILE_SCHOOLJOB);
	}

	/**
	 * Create a detached, initialised ProfileSchooljobRecord
	 */
	public ProfileSchooljobRecord(UInteger id, UInteger profileId, Date start, Date end, Byte endUntilNow, String position, String description, Timestamp createTime, Timestamp updateTime) {
		super(ProfileSchooljob.PROFILE_SCHOOLJOB);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, start);
		setValue(3, end);
		setValue(4, endUntilNow);
		setValue(5, position);
		setValue(6, description);
		setValue(7, createTime);
		setValue(8, updateTime);
	}
}
