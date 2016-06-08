/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.profiledb.tables.records;


import com.moseeker.db.profiledb.tables.ProfileAttachment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Profile的简历附件
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileAttachmentRecord extends UpdatableRecordImpl<ProfileAttachmentRecord> implements Record7<UInteger, UInteger, String, String, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = -1816381052;

	/**
	 * Setter for <code>profiledb.profile_attachment.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>profiledb.profile_attachment.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>profiledb.profile_attachment.name</code>. 附件名称
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.name</code>. 附件名称
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>profiledb.profile_attachment.path</code>. 附件存储路径
	 */
	public void setPath(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.path</code>. 附件存储路径
	 */
	public String getPath() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>profiledb.profile_attachment.description</code>. 附件描述
	 */
	public void setDescription(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.description</code>. 附件描述
	 */
	public String getDescription() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>profiledb.profile_attachment.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>profiledb.profile_attachment.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>profiledb.profile_attachment.update_time</code>. 更新时间
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
	public Row7<UInteger, UInteger, String, String, String, Timestamp, Timestamp> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<UInteger, UInteger, String, String, String, Timestamp, Timestamp> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileAttachment.PROFILE_ATTACHMENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileAttachment.PROFILE_ATTACHMENT.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ProfileAttachment.PROFILE_ATTACHMENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ProfileAttachment.PROFILE_ATTACHMENT.PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ProfileAttachment.PROFILE_ATTACHMENT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return ProfileAttachment.PROFILE_ATTACHMENT.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return ProfileAttachment.PROFILE_ATTACHMENT.UPDATE_TIME;
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
		return getPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDescription();
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
	public ProfileAttachmentRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord value2(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord value4(String value) {
		setPath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord value5(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord value6(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord value7(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAttachmentRecord values(UInteger value1, UInteger value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7) {
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
	 * Create a detached ProfileAttachmentRecord
	 */
	public ProfileAttachmentRecord() {
		super(ProfileAttachment.PROFILE_ATTACHMENT);
	}

	/**
	 * Create a detached, initialised ProfileAttachmentRecord
	 */
	public ProfileAttachmentRecord(UInteger id, UInteger profileId, String name, String path, String description, Timestamp createTime, Timestamp updateTime) {
		super(ProfileAttachment.PROFILE_ATTACHMENT);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, name);
		setValue(3, path);
		setValue(4, description);
		setValue(5, createTime);
		setValue(6, updateTime);
	}
}