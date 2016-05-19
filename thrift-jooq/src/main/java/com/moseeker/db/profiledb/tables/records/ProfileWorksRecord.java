/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.profiledb.tables.records;


import com.moseeker.db.profiledb.tables.ProfileWorks;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Profile的个人作品
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileWorksRecord extends UpdatableRecordImpl<ProfileWorksRecord> implements Record8<UInteger, UInteger, String, String, String, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1584091802;

	/**
	 * Setter for <code>profileDB.profile_works.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>profileDB.profile_works.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>profileDB.profile_works.name</code>. 作品名称
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.name</code>. 作品名称
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>profileDB.profile_works.url</code>. 作品网址
	 */
	public void setUrl(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.url</code>. 作品网址
	 */
	public String getUrl() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>profileDB.profile_works.cover</code>. 作品封面
	 */
	public void setCover(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.cover</code>. 作品封面
	 */
	public String getCover() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>profileDB.profile_works.description</code>. 作品描述
	 */
	public void setDescription(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.description</code>. 作品描述
	 */
	public String getDescription() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>profileDB.profile_works.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>profileDB.profile_works.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>profileDB.profile_works.update_time</code>. 更新时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<UInteger, UInteger, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<UInteger, UInteger, String, String, String, String, Timestamp, Timestamp> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileWorks.PROFILE_WORKS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileWorks.PROFILE_WORKS.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ProfileWorks.PROFILE_WORKS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ProfileWorks.PROFILE_WORKS.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ProfileWorks.PROFILE_WORKS.COVER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ProfileWorks.PROFILE_WORKS.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return ProfileWorks.PROFILE_WORKS.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return ProfileWorks.PROFILE_WORKS.UPDATE_TIME;
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
	public String value4() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCover();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value2(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value4(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value5(String value) {
		setCover(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value6(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value7(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord value8(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorksRecord values(UInteger value1, UInteger value2, String value3, String value4, String value5, String value6, Timestamp value7, Timestamp value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProfileWorksRecord
	 */
	public ProfileWorksRecord() {
		super(ProfileWorks.PROFILE_WORKS);
	}

	/**
	 * Create a detached, initialised ProfileWorksRecord
	 */
	public ProfileWorksRecord(UInteger id, UInteger profileId, String name, String url, String cover, String description, Timestamp createTime, Timestamp updateTime) {
		super(ProfileWorks.PROFILE_WORKS);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, name);
		setValue(3, url);
		setValue(4, cover);
		setValue(5, description);
		setValue(6, createTime);
		setValue(7, updateTime);
	}
}
